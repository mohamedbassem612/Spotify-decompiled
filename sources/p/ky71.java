package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ky71 implements d6o0 {
    public final /* synthetic */ vy71 a;
    public final /* synthetic */ iu30 b;

    public ky71(vy71 vy71Var, iu30 iu30Var) {
        this.a = vy71Var;
        this.b = iu30Var;
    }

    public final long M(int i, long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f || i != 1) {
            return 0L;
        }
        s24 s24Var = this.a.e;
        float fQ = s24Var.Q(fIntBitsToFloat);
        drr0 drr0Var = (drr0) s24Var.Y;
        float fS = Float.isNaN(drr0Var.s()) ? 0.0f : drr0Var.s();
        drr0Var.t(fQ);
        return a(fQ - fS);
    }

    public final Object Q0(long j, long j2, lnm lnmVar) {
        this.b.invoke(new Float(qui1.e(j2)));
        return new qui1(j2);
    }

    public final long a(float f) {
        return (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
    }

    public final long h0(int i, long j, long j2) {
        if (i != 1) {
            return 0L;
        }
        s24 s24Var = this.a.e;
        float fQ = s24Var.Q(Float.intBitsToFloat((int) (4294967295L & j2)));
        drr0 drr0Var = (drr0) s24Var.Y;
        float fS = Float.isNaN(drr0Var.s()) ? 0.0f : drr0Var.s();
        drr0Var.t(fQ);
        return a(fQ - fS);
    }

    public final Object k0(long j, lnm lnmVar) {
        float fE = qui1.e(j);
        vy71 vy71Var = this.a;
        float fV = vy71Var.e.V();
        float fC = vy71Var.e.I().c();
        if (fE >= 0.0f || fV <= fC) {
            j = 0;
        } else {
            this.b.invoke(new Float(fE));
        }
        return new qui1(j);
    }
}
