package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x4h1 extends jnw0 {
    public static final x4h1 c = new x4h1(y4h1.a);

    public final int d(Object obj) {
        return ((v4h1) obj).a.length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        w4h1 w4h1Var = (w4h1) obj;
        int iN = x1kVar.t(((jnw0) this).b, i).n();
        w4h1Var.b(w4h1Var.d() + 1);
        int[] iArr = w4h1Var.a;
        int i2 = w4h1Var.b;
        w4h1Var.b = i2 + 1;
        iArr[i2] = iN;
    }

    public final Object g(Object obj) {
        int[] iArr = ((v4h1) obj).a;
        w4h1 w4h1Var = new w4h1();
        w4h1Var.a = iArr;
        w4h1Var.b = iArr.length;
        w4h1Var.b(10);
        return w4h1Var;
    }

    public final Object j() {
        return new v4h1(new int[0]);
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        int[] iArr = ((v4h1) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.L(((jnw0) this).b, i2).a0(iArr[i2]);
        }
    }
}
