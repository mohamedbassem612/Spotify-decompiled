package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class grs0 extends i7 {
    public final Object[] c;
    public final iug1 d;

    public grs0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new iug1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        iug1 iug1Var = this.d;
        if (iug1Var.hasNext()) {
            this.a++;
            return iug1Var.next();
        }
        int i = this.a;
        this.a = i + 1;
        return this.c[i - iug1Var.b];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        int i = this.a;
        iug1 iug1Var = this.d;
        int i2 = iug1Var.b;
        if (i <= i2) {
            this.a = i - 1;
            return iug1Var.previous();
        }
        int i3 = i - 1;
        this.a = i3;
        return this.c[i3 - i2];
    }
}
