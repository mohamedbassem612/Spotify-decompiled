package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gr20 implements uq20 {
    public final float a;
    public final m8b1 b;

    public gr20(float f, float f2, float f3) {
        this.a = f3;
        m8b1 m8b1Var = new m8b1();
        m8b1Var.a = 1.0f;
        m8b1Var.b = Math.sqrt(50.0d);
        m8b1Var.c = 1.0f;
        if (f < 0.0f) {
            dmv0.a("Damping ratio must be non-negative");
        }
        m8b1Var.c = f;
        double d = m8b1Var.b;
        if (((float) (d * d)) <= 0.0f) {
            dmv0.a("Spring stiffness constant must be positive.");
        }
        m8b1Var.b = Math.sqrt(f2);
        this.b = m8b1Var;
    }

    @Override // p.uq20
    public final float b(float f, float f2, float f3, long j) {
        m8b1 m8b1Var = this.b;
        m8b1Var.a = f2;
        return Float.intBitsToFloat((int) (m8b1Var.a(f, f3, j / 1000000) & 4294967295L));
    }

    @Override // p.uq20
    public final float c(float f, float f2, float f3) {
        return 0.0f;
    }

    @Override // p.uq20
    public final long d(float f, float f2, float f3) {
        m8b1 m8b1Var = this.b;
        double d = m8b1Var.b;
        float f4 = m8b1Var.c;
        float f5 = this.a;
        return irn1.T((float) (d * d), f4, f3 / f5, (f - f2) / f5) * 1000000;
    }

    @Override // p.uq20
    public final float e(float f, float f2, float f3, long j) {
        m8b1 m8b1Var = this.b;
        m8b1Var.a = f2;
        return Float.intBitsToFloat((int) (m8b1Var.a(f, f3, j / 1000000) >> 32));
    }

    public /* synthetic */ gr20(float f, float f2) {
        this(f, f2, 0.01f);
    }
}
