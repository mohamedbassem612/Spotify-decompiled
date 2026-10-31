package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class c5h1 extends jnw0 {
    public static final c5h1 c = new c5h1(d5h1.a);

    public final int d(Object obj) {
        return ((a5h1) obj).a.length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        b5h1 b5h1Var = (b5h1) obj;
        long jU = x1kVar.t(((jnw0) this).b, i).u();
        b5h1Var.b(b5h1Var.d() + 1);
        long[] jArr = b5h1Var.a;
        int i2 = b5h1Var.b;
        b5h1Var.b = i2 + 1;
        jArr[i2] = jU;
    }

    public final Object g(Object obj) {
        long[] jArr = ((a5h1) obj).a;
        b5h1 b5h1Var = new b5h1();
        b5h1Var.a = jArr;
        b5h1Var.b = jArr.length;
        b5h1Var.b(10);
        return b5h1Var;
    }

    public final Object j() {
        return new a5h1(new long[0]);
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        long[] jArr = ((a5h1) obj).a;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.L(((jnw0) this).b, i2).z(jArr[i2]);
        }
    }
}
