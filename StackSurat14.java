public class StackSurat14 {
    Surat14[] stack;
    int top;
    int kapasitas;

    StackSurat14(Surat14[] stack, int top, int kapasitas){
        this.stack = stack;
        this.top = top;
        this.kapasitas = kapasitas;
    }

    public StackSurat14(int kapasitas) {
        this.kapasitas = kapasitas;
        this.stack = new Surat14[kapasitas];
        this.top = -1;
    }

    public boolean isFull(){
        if (top == kapasitas - 1){
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty(){
        if (top == -1){
            return true;
        } else {
            return false;
        }
    }

    public void push(Surat14 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Stack penuh! Tidak bisa menambahkan surat baru.");
        }
    }

    public Surat14 pop() {
        if (!isEmpty()) {
            return stack[top--];
        } else {
            System.out.println("Stack kosong! Tidak ada surat untuk diproses.");
            return null;
        }
    }

    public Surat14 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong! Tidak ada surat terakhir.");
            return null;
        }
    }

    public Surat14 cariSurat(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return stack[i];
            }
        }
        return null;
    }
}
