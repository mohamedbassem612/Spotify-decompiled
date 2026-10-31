package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ft71 {
    public final hrr0 a;
    public final hrr0 b;
    public final p1f0 c;
    public final long d;
    public elb0 e;
    public long f;
    public float g;
    public float h;
    public long i;
    public long j;
    public float k;
    public sui1 l;

    public ft71() {
        Boolean bool = Boolean.FALSE;
        this.a = v8r.q(bool);
        this.b = v8r.q(bool);
        this.c = new p1f0();
        this.d = sjm0.a();
        this.f = u7h.j;
        this.g = 1.0f;
        this.h = 1.0f;
        this.i = ofg1.b;
        this.j = 0L;
        this.k = 1.0f;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final float a(float f) {
        float fS;
        if (n()) {
            p1f0 p1f0Var = this.c;
            if (((Boolean) ((hrr0) p1f0Var.a).getValue()).booleanValue()) {
                fS = ((drr0) p1f0Var.b).s();
            } else {
                fS = 1.0f;
            }
        } else {
            fS = 1.0f;
        }
        float f2 = f * fS;
        if (n()) {
            this.g = f2;
        }
        return f2;
    }

    public final float b(float f) {
        p1f0 p1f0Var = this.c;
        drr0 drr0Var = (drr0) p1f0Var.d;
        boolean z = n() && ((Boolean) ((hrr0) p1f0Var.c).getValue()).booleanValue();
        float fS = f * (z ? drr0Var.s() : 1.0f);
        if (n()) {
            this.h = fS;
            this.k = z ? drr0Var.s() : 1.0f;
            if (z) {
                sui1 sui1Var = this.l;
                if (sui1Var == null) {
                    sui1Var = new sui1(2, false);
                    this.l = sui1Var;
                }
                yky0 yky0Var = c3t.a;
                sui1Var.a(fS, jfv.h(voe1.a(this.d)));
            }
        }
        return fS;
    }

    public final long c(long j) {
        n();
        n();
        long jD = qr80.d(j, 0L);
        if (n()) {
            this.j = jD;
        }
        return jD;
    }

    public final long d(long j) {
        if (n()) {
            p1f0 p1f0Var = this.c;
            if (((Boolean) ((hrr0) p1f0Var.e).getValue()).booleanValue()) {
                j = ((ofg1) ((hrr0) p1f0Var.f).getValue()).a;
            }
        }
        if (n()) {
            this.i = j;
        }
        return j;
    }

    public final float e() {
        p1f0 p1f0Var = this.c;
        if (((Boolean) ((hrr0) p1f0Var.c).getValue()).booleanValue()) {
            return ((drr0) p1f0Var.d).s();
        }
        return 1.0f;
    }

    public final long f() {
        p1f0 p1f0Var = this.c;
        return ((Boolean) ((hrr0) p1f0Var.e).getValue()).booleanValue() ? ((ofg1) ((hrr0) p1f0Var.f).getValue()).a : ofg1.b;
    }

    public final float g() {
        return this.k;
    }

    public final long h() {
        return this.i;
    }

    public final elb0 i() {
        return this.e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    public final ke5 j() {
        float fFloatValue;
        if (!m()) {
            return null;
        }
        sui1 sui1Var = this.l;
        if (sui1Var != null) {
            float fB = sui1Var.b();
            Float fValueOf = Float.isNaN(fB) ? null : Float.valueOf(fB);
            if (fValueOf != null) {
                fFloatValue = fValueOf.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
        } else {
            fFloatValue = 0.0f;
        }
        return new ke5(fFloatValue);
    }

    public final qr80 k() {
        if (m()) {
            return new qr80(this.j);
        }
        return null;
    }

    public final le5 l() {
        if (!m()) {
            return null;
        }
        float fD = qui1.d(0L);
        Float fValueOf = Float.valueOf(fD);
        if (Float.isNaN(fD)) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : 0.0f;
        float fE = qui1.e(0L);
        Float fValueOf2 = Float.isNaN(fE) ? null : Float.valueOf(fE);
        return new le5(fFloatValue, fValueOf2 != null ? fValueOf2.floatValue() : 0.0f);
    }

    public final boolean m() {
        return ((Boolean) this.b.getValue()).booleanValue();
    }

    public final boolean n() {
        return ((Boolean) this.a.getValue()).booleanValue();
    }

    public final void o(boolean z) {
        hrr0 hrr0Var = this.a;
        boolean zBooleanValue = ((Boolean) hrr0Var.getValue()).booleanValue();
        hrr0 hrr0Var2 = this.b;
        if (zBooleanValue && !z) {
            hrr0Var2.setValue(Boolean.TRUE);
        } else if (z) {
            hrr0Var2.setValue(Boolean.FALSE);
        }
        hrr0Var.setValue(Boolean.valueOf(z));
    }

    public final void p(elb0 elb0Var) {
        this.e = elb0Var;
    }
}
