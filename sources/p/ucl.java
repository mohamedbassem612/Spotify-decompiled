package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public class ucl {
    public final hah a;
    public final hah b;
    public final hah c;
    public final float[] d;

    static {
        new lqc((byte) 2);
    }

    public ucl(hah hahVar, hah hahVar2, int i) {
        this(hahVar2, jch0.x(hahVar.b, 12884901888L) ? h5p1.o(hahVar) : hahVar, jch0.x(hahVar2.b, 12884901888L) ? h5p1.o(hahVar2) : hahVar2, lqc.s(hahVar, hahVar2, i));
    }

    public long a(long j) {
        float fG = u7h.g(j);
        float f = u7h.f(j);
        float fD = u7h.d(j);
        float fC = u7h.c(j);
        hah hahVar = this.b;
        long jD = hahVar.d(fG, f, fD);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jD >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD & 4294967295L));
        float fE = hahVar.e(fG, f, fD);
        float[] fArr = this.d;
        if (fArr != null) {
            fIntBitsToFloat *= fArr[0];
            fIntBitsToFloat2 *= fArr[1];
            fE *= fArr[2];
        }
        float f2 = fIntBitsToFloat;
        float f3 = fIntBitsToFloat2;
        return this.c.f(f2, f3, fE, fC, this.a);
    }

    public ucl(hah hahVar, hah hahVar2, hah hahVar3, float[] fArr) {
        this.a = hahVar;
        this.b = hahVar2;
        this.c = hahVar3;
        this.d = fArr;
    }
}
