package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nzg implements d6o0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nzg(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final long M(int i, long j) {
        float fS;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i2 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i2) >= 0.0f) {
                    return 0L;
                }
                ozg ozgVar = (ozg) obj;
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                drr0 drr0Var = ozgVar.b;
                float fO = yoi1.o(drr0Var.s() + fIntBitsToFloat, -ozgVar.a.s(), 0.0f);
                float fS2 = fO - drr0Var.s();
                drr0Var.t(fO);
                return (((long) Float.floatToRawIntBits(fS2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            default:
                lww0 lww0Var = (lww0) obj;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
                if (fIntBitsToFloat2 < 0.0f) {
                    drr0 drr0Var2 = lww0Var.c;
                    float fS3 = drr0Var2.s();
                    drr0Var2.t(yoi1.o(drr0Var2.s() + fIntBitsToFloat2, -lww0Var.a(), 0.0f));
                    fS = drr0Var2.s() - fS3;
                } else {
                    fS = 0.0f;
                }
                return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fS)) & 4294967295L);
        }
    }

    public final long h0(int i, long j, long j2) {
        float fS;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                int i2 = (int) (j2 & 4294967295L);
                if (Float.intBitsToFloat(i2) <= 0.0f) {
                    return 0L;
                }
                ozg ozgVar = (ozg) obj;
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                drr0 drr0Var = ozgVar.b;
                float fO = yoi1.o(drr0Var.s() + fIntBitsToFloat, -ozgVar.a.s(), 0.0f);
                float fS2 = fO - drr0Var.s();
                drr0Var.t(fO);
                return (((long) Float.floatToRawIntBits(fS2)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
            default:
                lww0 lww0Var = (lww0) obj;
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                if (fIntBitsToFloat2 > 0.0f) {
                    drr0 drr0Var2 = lww0Var.c;
                    float fS3 = drr0Var2.s();
                    drr0Var2.t(yoi1.o(drr0Var2.s() + fIntBitsToFloat2, -lww0Var.a(), 0.0f));
                    fS = drr0Var2.s() - fS3;
                } else {
                    fS = 0.0f;
                }
                return (((long) Float.floatToRawIntBits(fS)) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32);
        }
    }
}
