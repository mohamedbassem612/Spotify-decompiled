package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lme extends jnw0 {
    public static final lme c = new lme(ene.a);

    public final int d(Object obj) {
        return ((char[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        hme hmeVar = (hme) obj;
        char cE0 = x1kVar.e0(((jnw0) this).b, i);
        hmeVar.b(hmeVar.d() + 1);
        char[] cArr = hmeVar.a;
        int i2 = hmeVar.b;
        hmeVar.b = i2 + 1;
        cArr[i2] = cE0;
    }

    public final Object g(Object obj) {
        char[] cArr = (char[]) obj;
        hme hmeVar = new hme();
        hmeVar.a = cArr;
        hmeVar.b = cArr.length;
        hmeVar.b(10);
        return hmeVar;
    }

    public final Object j() {
        return new char[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        char[] cArr = (char[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.f0(((jnw0) this).b, i2, cArr[i2]);
        }
    }
}
