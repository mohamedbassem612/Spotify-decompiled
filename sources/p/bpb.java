package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bpb extends jnw0 {
    public static final bpb c = new bpb(gpb.a);

    public final int d(Object obj) {
        return ((boolean[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        wob wobVar = (wob) obj;
        boolean zM = x1kVar.M(((jnw0) this).b, i);
        wobVar.b(wobVar.d() + 1);
        boolean[] zArr = wobVar.a;
        int i2 = wobVar.b;
        wobVar.b = i2 + 1;
        zArr[i2] = zM;
    }

    public final Object g(Object obj) {
        boolean[] zArr = (boolean[]) obj;
        wob wobVar = new wob();
        wobVar.a = zArr;
        wobVar.b = zArr.length;
        wobVar.b(10);
        return wobVar;
    }
}
