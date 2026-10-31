package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gr80 extends jnw0 {
    public static final gr80 c = new gr80(wr80.a);

    public final int d(Object obj) {
        return ((int[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        br80 br80Var = (br80) obj;
        int iO = x1kVar.o(((jnw0) this).b, i);
        br80Var.b(br80Var.d() + 1);
        int[] iArr = br80Var.a;
        int i2 = br80Var.b;
        br80Var.b = i2 + 1;
        iArr[i2] = iO;
    }

    public final Object g(Object obj) {
        int[] iArr = (int[]) obj;
        br80 br80Var = new br80();
        br80Var.a = iArr;
        br80Var.b = iArr.length;
        br80Var.b(10);
        return br80Var;
    }

    public final Object j() {
        return new int[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        int[] iArr = (int[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.e(i2, iArr[i2], ((jnw0) this).b);
        }
    }
}
