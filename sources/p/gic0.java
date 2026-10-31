package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gic0 implements ql7 {
    public float a;
    public float b;
    public jen0 c;
    public jen0 d;

    public final void a(int i, Float f, Float f2) {
        jen0 jen0Var = this.c;
        float f3 = jen0Var.f;
        float f4 = 0.3f * f3;
        float f5 = (i * 2.0f) + this.a;
        this.a = f5;
        if (i > 0 && f5 - this.b > f4) {
            this.b = f5 - f4;
        } else if (i < 0 && this.b - f5 > f4) {
            this.b = f5 + f4;
        }
        float f6 = this.b;
        float f7 = jen0Var.d - (0.35f * f3);
        if (f6 <= f7) {
            f7 = (0.15f * f3) + jen0Var.b;
            if (f6 < f7) {
                this.b = f7;
                this.a = f4 + f7;
            }
            jen0 jen0Var2 = this.d;
            float f8 = jen0Var2.b;
            float f9 = f6 - f8;
            this.d = new jen0(jen0Var2.a + 0.0f, f8 + f9, jen0Var2.c + 0.0f, jen0Var2.d + f9);
        }
        this.b = f7;
        this.a = f7 - f4;
        f6 = f7;
        jen0 jen0Var3 = this.d;
        float f10 = jen0Var3.b;
        float f11 = f6 - f10;
        this.d = new jen0(jen0Var3.a + 0.0f, f10 + f11, jen0Var3.c + 0.0f, jen0Var3.d + f11);
    }

    public final void c(jen0 jen0Var) {
        if (this.c.equals(jen0Var)) {
            return;
        }
        this.c = jen0Var;
        float f = 0.15f * jen0Var.f;
        this.d = new jen0(0.0f, f, jen0Var.e, 1.0f + f);
    }

    public final jen0 i() {
        return this.d;
    }
}
