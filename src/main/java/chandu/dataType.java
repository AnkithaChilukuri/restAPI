package chandu;

public class dataType {
	public String str;
	public String type() {
		try {
		int i= Integer.parseInt(str);
		return "Integer";
		}
		catch (Exception e) {
			try {
				float f =Float.parseFloat(str);
				return "Float";
			}
			catch (Exception e1) {
				return "String";
			}
		}
	}

}
