package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wqu extends jnw0 {
    public static final wqu c = new wqu(dru.a);

    public final int d(Object obj) {
        return ((double[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        rqu rquVar = (rqu) obj;
        double D = x1kVar.D(((jnw0) this).b, i);
        rquVar.b(rquVar.d() + 1);
        double[] dArr = rquVar.a;
        int i2 = rquVar.b;
        rquVar.b = i2 + 1;
        dArr[i2] = D;
    }

    public final Object g(Object obj) {
        double[] dArr = (double[]) obj;
        rqu rquVar = new rqu();
        rquVar.a = dArr;
        rquVar.b = dArr.length;
        rquVar.b(10);
        return rquVar;
    }

    public final Object j() {
        return new double[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        double[] dArr = (double[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.g(((jnw0) this).b, i2, dArr[i2]);
        }
    }
}
