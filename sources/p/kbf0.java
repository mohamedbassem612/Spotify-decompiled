package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kbf0 implements tob1 {
    public final mdt N0;
    public final pfn0 O0;
    public final hrr0 X;
    public final hrr0 Y;
    public final mdt Z;
    public final hrr0 a;
    public final hrr0 b;
    public final hrr0 c;
    public final hrr0 d;
    public final hrr0 e;
    public final hrr0 f;
    public final hrr0 g;
    public final mdt h;
    public final hrr0 i;
    public final hrr0 t;

    public kbf0() {
        Boolean bool = Boolean.FALSE;
        this.a = v8r.q(bool);
        this.b = v8r.q(1);
        this.c = v8r.q(1);
        this.d = v8r.q(bool);
        this.e = v8r.q((Object) null);
        this.f = v8r.q(Float.valueOf(1.0f));
        this.g = v8r.q(bool);
        this.h = yv91.a(new uk1(this, (byte) 9));
        this.i = v8r.q((Object) null);
        Float fValueOf = Float.valueOf(0.0f);
        this.t = v8r.q(fValueOf);
        this.X = v8r.q(fValueOf);
        this.Y = v8r.q(Long.MIN_VALUE);
        this.Z = yv91.a(new uk1(this, (byte) 8));
        this.N0 = yv91.a(new uk1(this, (byte) 10));
        this.O0 = new pfn0();
    }

    public final bcf0 c() {
        return (bcf0) this.e.getValue();
    }

    public final fcf0 d() {
        return (fcf0) this.i.getValue();
    }

    public final int e() {
        return ((Number) this.b.getValue()).intValue();
    }

    public final float f() {
        return ((Number) this.X.getValue()).floatValue();
    }

    public final Object getValue() {
        return Float.valueOf(f());
    }

    public final float i() {
        return ((Number) this.f.getValue()).floatValue();
    }

    public final boolean j() {
        return ((Boolean) this.N0.getValue()).booleanValue();
    }

    public final boolean k(int i, long j) {
        fcf0 fcf0VarD = d();
        if (fcf0VarD == null) {
            return true;
        }
        hrr0 hrr0Var = this.Y;
        long jLongValue = ((Number) hrr0Var.getValue()).longValue() == Long.MIN_VALUE ? 0L : j - ((Number) hrr0Var.getValue()).longValue();
        hrr0Var.setValue(Long.valueOf(j));
        bcf0 bcf0VarC = c();
        float fB = bcf0VarC != null ? bcf0VarC.b(fcf0VarD) : 0.0f;
        bcf0 bcf0VarC2 = c();
        float fA = bcf0VarC2 != null ? bcf0VarC2.a(fcf0VarD) : 1.0f;
        float fB2 = (jLongValue / 1000000) / fcf0VarD.b();
        mdt mdtVar = this.h;
        float fFloatValue = ((Number) mdtVar.getValue()).floatValue() * fB2;
        float fFloatValue2 = ((Number) mdtVar.getValue()).floatValue();
        hrr0 hrr0Var2 = this.t;
        float fFloatValue3 = fFloatValue2 < 0.0f ? fB - (((Number) hrr0Var2.getValue()).floatValue() + fFloatValue) : (((Number) hrr0Var2.getValue()).floatValue() + fFloatValue) - fA;
        if (fFloatValue3 < 0.0f) {
            n(yoi1.o(((Number) hrr0Var2.getValue()).floatValue(), fB, fA) + fFloatValue);
            return true;
        }
        float f = fA - fB;
        int i2 = (int) (fFloatValue3 / f);
        int i3 = i2 + 1;
        if (e() + i3 > i) {
            n(((Number) this.Z.getValue()).floatValue());
            l(i);
            return false;
        }
        l(e() + i3);
        float f2 = fFloatValue3 - (i2 * f);
        n(((Number) mdtVar.getValue()).floatValue() < 0.0f ? fA - f2 : fB + f2);
        return true;
    }

    public final void l(int i) {
        this.b.setValue(Integer.valueOf(i));
    }

    public final void m(boolean z) {
        this.a.setValue(Boolean.valueOf(z));
    }

    public final void n(float f) {
        fcf0 fcf0VarD;
        this.t.setValue(Float.valueOf(f));
        if (((Boolean) this.g.getValue()).booleanValue() && (fcf0VarD = d()) != null) {
            f -= f % (1.0f / fcf0VarD.n);
        }
        this.X.setValue(Float.valueOf(f));
    }
}
