package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y6b {
    public int a;
    public int b;
    public int c;
    public Object d;

    public y6b(s5... s5VarArr) {
        this.a = -1;
        this.b = -1;
        this.c = 0;
        this.d = s5VarArr;
    }

    public void a(int i) {
        int[] iArr = (int[]) this.d;
        int i2 = this.b;
        iArr[i2] = i;
        int i3 = this.c & (i2 + 1);
        this.b = i3;
        int i4 = this.a;
        if (i3 == i4) {
            int length = iArr.length;
            int i5 = length - i4;
            int i6 = length << 1;
            int[] iArr2 = new int[i6];
            System.arraycopy(iArr, i4, iArr2, 0, i5);
            System.arraycopy((int[]) this.d, 0, iArr2, i5, this.a);
            this.d = iArr2;
            this.a = 0;
            this.b = length;
            this.c = i6 - 1;
        }
    }

    public y6b() {
        this.c = 7;
        this.d = new int[8];
    }
}
