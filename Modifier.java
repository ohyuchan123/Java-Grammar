package Grammar;
public class Modifier {

	public static void main(String[] args) {
		/*���� ������(modifier)*/
		/*�����ڶ� Ŭ������ Ŭ���� ����� ���� �� ����Ͽ� �ΰ����� �ǹ̸� �ο��ϴ� Ű���带 �ǹ��մϴ�
		 *�ڹٿ��� �����ڴ� ���� �����ڿ� ��Ÿ �����ڷ� ���� �� �� �ֽ��ϴ�*/
		
		/*���� ������(access modifier)*/
		/*��ü ���⿡�� ���� ����(data hiding)�̶� ����ڰ� ���� �� �ʿ䰡 ���� ������ ����ڷκ��� ���ܾ� �Ѵٴ� �����Դϴ�
		 *�׷��� �����ν� ����ڴ� ������ �ּ����� ���������� ���α׷��� �ս��� ����� �� �ְ� �˴ϴ�
		 *
		 *�ڹٿ����� ������ ���� �װ����� ���� �����ڸ� �����մϴ�
		 *1. private
		 *2. public
		 *3. default
		 *4. protected*/
		
		/*private ������*/
		/*private ���� �����ڸ� ����Ͽ� ����� Ŭ���� ����� �ܺο� �������� ������, �ܺο����� ���� ������ �� �����ϴ�.
		 *��, �ڹ� ���α׷��� private ����� ���� ������ �� ������, �ش� ��ü�� public �޼ҵ带 ���ؼ��� ������ �� �ֽ��ϴ�.
		 *���� private ����� public �������̽��� ���� �������� �ʰ�, Ŭ���� ������ �������� ������ �����ϴ� �� ���˴ϴ�.*/
		
		/*���� ����ó�� private ����� �ش� ����� ������ Ŭ���������� ������ �� �ֽ��ϴ�.*/
		public static class SameClass{
		    private String var = "���� Ŭ������ ���"; // private �ʵ�
		    private String getVar() {                  // private �޼ҵ�
		        return this.var;
		    }
		}
		/*public ������*/
		/*public ���� �����ڸ� ����Ͽ� ����� Ŭ���� ����� �ܺη� �����Ǹ�, �ش� ��ü�� ����ϴ� ���α׷� ��𿡼��� ���� ������ �� �ֽ��ϴ�.
		 *�ڹ� ���α׷��� public �޼ҵ带 ���ؼ��� �ش� ��ü�� private ����� ������ �� �ֽ��ϴ�.
		 *���� public �޼ҵ�� private ����� ���α׷� ������ �������̽�(interface) ������ �����Ѵٰ� �� �� �ֽ��ϴ�.*/
		
		/*�ڹٿ��� public ����� ���α׷� ��𿡼� ������ ������ �� �ֽ��ϴ�.*/
		public class Everywhere {
		    public String var = "�������� ���"; // public �ʵ�
		    public String getVar() {             // public �޼ҵ�
		        return this.var;
		    }
		}
		
		/*default ������*/
		/*�ڹٿ����� Ŭ���� �� Ŭ���� ����� ���� ������ �⺻������ default ���� ��� ������ ����ϰ� �ֽ��ϴ�.
		 *�̷��� default�� ���� ���� �����ڴ� ���� �������� ������, ���� �����ڰ� �������� ������ �ڵ������� default ���� ��� ������ �˴ϴ�.
		 *default ���� ��� ������ ����� ���� Ŭ������ ����� ���� ��Ű���� ���ϴ� ��������� ������ �� �ֽ��ϴ�.*/
		
		/*���� ���� ó�� default ����� ���� ��Ű���� ���ϴ� Ŭ���������� ������ �� �ֽ��ϴ�*/
		package test;
		public class SamePackage {
		    String sameVar = "���� ��Ű���� ���"; // default �ʵ�
		}
		/*���� Ŭ������ ���� ����*/
		package test;
		public class SameClass {
		    String var = "�ٸ� ��Ű���� ���� �Ұ�"; // default �ʵ�
		    public static void main(String[] args) {
		        SamePackage sp = new SamePackage();
		        System.out.println(sp.sameVar);     // ���� ��Ű���� ���
		    }
		}
	}

}
