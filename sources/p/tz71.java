package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tz71 extends jnw0 {
    public static final tz71 c = new tz71(vz71.a);

    public final int d(Object obj) {
        return ((short[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        sz71 sz71Var = (sz71) obj;
        short sB0 = x1kVar.b0(((jnw0) this).b, i);
        sz71Var.b(sz71Var.d() + 1);
        short[] sArr = sz71Var.a;
        int i2 = sz71Var.b;
        sz71Var.b = i2 + 1;
        sArr[i2] = sB0;
    }

    public final Object g(Object obj) {
        short[] sArr = (short[]) obj;
        sz71 sz71Var = new sz71();
        sz71Var.a = sArr;
        sz71Var.b = sArr.length;
        sz71Var.b(10);
        return sz71Var;
    }

    public final Object j() {
        return new short[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        short[] sArr = (short[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.y(((jnw0) this).b, i2, sArr[i2]);
        }
    }
}
