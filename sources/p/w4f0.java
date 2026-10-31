package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class w4f0 extends jnw0 {
    public static final w4f0 c = new w4f0(o5f0.a);

    public final int d(Object obj) {
        return ((long[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        q4f0 q4f0Var = (q4f0) obj;
        long jI0 = x1kVar.i0(((jnw0) this).b, i);
        q4f0Var.b(q4f0Var.d() + 1);
        long[] jArr = q4f0Var.a;
        int i2 = q4f0Var.b;
        q4f0Var.b = i2 + 1;
        jArr[i2] = jI0;
    }

    public final Object g(Object obj) {
        long[] jArr = (long[]) obj;
        q4f0 q4f0Var = new q4f0();
        q4f0Var.a = jArr;
        q4f0Var.b = jArr.length;
        q4f0Var.b(10);
        return q4f0Var;
    }

    public final Object j() {
        return new long[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        long[] jArr = (long[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.l(((jnw0) this).b, i2, jArr[i2]);
        }
    }
}
