package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class aa30 {
    public static final float[] a = {8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
    public static volatile ina1 b = new ina1(0);
    public static final Object[] c;

    static {
        Object[] objArr = new Object[0];
        c = objArr;
        synchronized (objArr) {
            b.e(115, new ba30(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            b.e(130, new ba30(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            b.e(150, new ba30(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            b.e(180, new ba30(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            b.e(200, new ba30(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
        }
        if ((b.d(0) / 100.0f) - 0.01f > 1.03f) {
            return;
        }
        sf80.b("You should only apply non-linear scaling to font scales > 1");
    }

    public static z930 a(float f) {
        z930 ba30Var;
        float[] fArr = a;
        if (f < 1.03f) {
            return null;
        }
        ina1 ina1Var = b;
        int i = (int) (f * 100.0f);
        ina1Var.getClass();
        z930 z930Var = (z930) dio1.r(ina1Var, i);
        if (z930Var != null) {
            return z930Var;
        }
        ina1 ina1Var2 = b;
        if (ina1Var2.a) {
            dio1.l(ina1Var2);
        }
        int iJ = mp10.j(ina1Var2.d, i, ina1Var2.b);
        if (iJ >= 0) {
            return (z930) b.h(iJ);
        }
        int i2 = -(iJ + 1);
        int i3 = i2 - 1;
        float fD = 1.0f;
        if (i2 >= b.g()) {
            ba30 ba30Var2 = new ba30(new float[]{1.0f}, new float[]{f});
            b(f, ba30Var2);
            return ba30Var2;
        }
        if (i3 < 0) {
            ba30Var = new ba30(fArr, fArr);
        } else {
            fD = b.d(i3) / 100.0f;
            ba30Var = (z930) b.h(i3);
        }
        float fN = qgo1.n(fD, b.d(i2) / 100.0f, f);
        z930 z930Var2 = (z930) b.h(i2);
        float[] fArr2 = new float[9];
        for (int i4 = 0; i4 < 9; i4++) {
            float f2 = fArr[i4];
            fArr2[i4] = qgo1.u(ba30Var.b(f2), z930Var2.b(f2), fN);
        }
        ba30 ba30Var3 = new ba30(fArr, fArr2);
        b(f, ba30Var3);
        return ba30Var3;
    }

    public static void b(float f, ba30 ba30Var) {
        synchronized (c) {
            ina1 ina1VarClone = b.clone();
            ina1VarClone.e((int) (f * 100.0f), ba30Var);
            b = ina1VarClone;
        }
    }
}
