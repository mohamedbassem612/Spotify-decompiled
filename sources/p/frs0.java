package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class frs0 extends h7 {
    public final Object[] c;
    public final hug1 d;

    public frs0(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2);
        this.c = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.d = new hug1(objArr, i > i4 ? i4 : i, i4, i3);
    }

    public final Object next() {
        if (!hasNext()) {
            hhg1.k();
            return null;
        }
        hug1 hug1Var = this.d;
        if (hug1Var.hasNext()) {
            ((h7) this).a++;
            return hug1Var.next();
        }
        int i = ((h7) this).a;
        ((h7) this).a = i + 1;
        return this.c[i - ((h7) hug1Var).b];
    }

    public final Object previous() {
        if (!hasPrevious()) {
            hhg1.k();
            return null;
        }
        int i = ((h7) this).a;
        hug1 hug1Var = this.d;
        int i2 = ((h7) hug1Var).b;
        if (i <= i2) {
            ((h7) this).a = i - 1;
            return hug1Var.previous();
        }
        int i3 = i - 1;
        ((h7) this).a = i3;
        return this.c[i3 - i2];
    }
}
