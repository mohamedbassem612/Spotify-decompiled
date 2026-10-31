package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ar20 extends jnw0 {
    public static final ar20 c = new ar20(er20.a);

    public final int d(Object obj) {
        return ((float[]) obj).length;
    }

    public final void f(x1k x1kVar, int i, Object obj) {
        vq20 vq20Var = (vq20) obj;
        float fQ = x1kVar.Q(((jnw0) this).b, i);
        vq20Var.b(vq20Var.d() + 1);
        float[] fArr = vq20Var.a;
        int i2 = vq20Var.b;
        vq20Var.b = i2 + 1;
        fArr[i2] = fQ;
    }

    public final Object g(Object obj) {
        float[] fArr = (float[]) obj;
        vq20 vq20Var = new vq20();
        vq20Var.a = fArr;
        vq20Var.b = fArr.length;
        vq20Var.b(10);
        return vq20Var;
    }

    public final Object j() {
        return new float[0];
    }

    public final void k(z1k z1kVar, Object obj, int i) {
        float[] fArr = (float[]) obj;
        for (int i2 = 0; i2 < i; i2++) {
            z1kVar.Z(((jnw0) this).b, i2, fArr[i2]);
        }
    }
}
