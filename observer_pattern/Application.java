package observer_pattern;

import observer_pattern.Button.OnClickListener;

public class Application {

	public static void main(String[] args) {
		Button button = new Button();

		button.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(Button button) {
				System.out.println(button + " is Clicked");
			}
		});

	}

}
