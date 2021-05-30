package templateMethod_pattern;

public abstract class AbstGameConnectHelper {

	// template method
	public String requestConnection(String str) {
		// 보안 작업 -> 암호화 된 문자열을 복호화
		String decodedInfo = doSecurity(str);

		// 반환된 것을 가지고 아이디, 암호를 할당
		String id = "aaa";
		String password = "bbb";

		if (!authentication(id, password)) {
			throw new Error("아이디 암호 불일치");
		}

		String userName = "username";
		int i = authorization(userName);

		switch (i) {
		case -1:
			throw new Error("셧다운");

		case 0:
			System.out.println("게임 매니저");
			break;
		case 1:
			System.out.println("유료 회원");
			break;
		case 2:
			System.out.println("무료 회원");
			break;
		case 3:
			System.out.println("권한 없음");
			break;
		default:
			break;
		}

		return connection(decodedInfo);
	}

	protected abstract String doSecurity(String string);

	protected abstract boolean authentication(String id, String password);

	protected abstract int authorization(String userName);

	protected abstract String connection(String info);
}
