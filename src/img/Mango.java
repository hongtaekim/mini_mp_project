package img;

public class Mango {

	public static void printSpace() {
		for (int i = 0; i < 60; i++) {
			System.out.println("");
		}
	}

	public void mangoImg() {
		printSpace();
		String mango = "\r\n" + "                                        ▓▓▓▓██      \r\n"
				+ "                      ██████▓▓████    ██░░░░██      \r\n"
				+ "                  ████░░░░░░░░░░░░████░░████        \r\n"
				+ "                ▓▓░░░░░░░░░░░░░░░░▒▒▒▒▓▓░░▒▒        \r\n"
				+ "              ▓▓░░░░░░░░░░░░░░░░░░░░░░░░██          \r\n"
				+ "              ██░░░░░░░░░░░░░░░░░░░░░░░░░░██        \r\n"
				+ "            ██▒▒░░    ░░░░░░░░░░░░░░░░░░░░██        \r\n"
				+ "            ██░░░░    ░░░░░░░░░░░░░░░░░░░░▒▒██      \r\n"
				+ "            ██░░░░  ░░░░░░░░░░░░░░░░░░░░░░░░██      \r\n"
				+ "            ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      \r\n"
				+ "          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      \r\n"
				+ "          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      \r\n"
				+ "          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██      \r\n"
				+ "          ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░      \r\n"
				+ "        ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██        \r\n"
				+ "        ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██          \r\n"
				+ "      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██          \r\n"
				+ "      ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██            \r\n"
				+ "    ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░░░██              \r\n"
				+ "  ▓▓▒▒░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓░░              \r\n"
				+ "  ██░░░░░░░░░░░░░░░░░░░░░░░░░░░░▓▓                  \r\n"
				+ "    ██░░░░░░░░░░░░░░░░░░░░░░████                    \r\n"
				+ "      ████░░░░░░░░░░░░██████                        \r\n"
				+ "          ████████████    ░░                          \n";

		for (int i = 0; i < mango.length(); i++) {
			System.out.print(mango.charAt(i));

			try {
				Thread.sleep(2);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}