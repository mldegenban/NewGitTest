package www.ml.com;

public class Animal {
    int eye = 2;
    public Animal(){
        super();
        System.out.println("����");
    }
    
    public void run(){
        System.out.println("�����в�ͬ��·��ʽ");
    }
    
    public static void main(String[] args) {
        Bird b = new Bird();
        b.run();
    }
}

class Bird extends Animal{
    public Bird(){
        super();
        System.out.println("����");
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        super.run(); // ͨ��super�����ø��෽��������
        System.out.println("���Ƿɷɷɷɷɷ�");
        System.out.println("������"+super.eye+"ֻ�۾�");
    }
    
}