package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jor0 implements kor0 {
    public final eor0 a;
    public final hor0 b;
    public final djc0 c;
    public final tnr0 d;
    public final bor0 e;
    public final float f;

    public /* synthetic */ jor0(eor0 eor0Var, djc0 djc0Var, tnr0 tnr0Var, bor0 bor0Var, float f, int i) {
        this((i & 1) != 0 ? new eor0() : eor0Var, for0.a, (i & 4) != 0 ? bjc0.a : djc0Var, (i & 8) != 0 ? new tnr0() : tnr0Var, (i & 16) != 0 ? null : bor0Var, (i & 32) != 0 ? 0.0f : f);
    }

    public static jor0 f(jor0 jor0Var, gor0 gor0Var, djc0 djc0Var, int i) {
        eor0 eor0Var = jor0Var.a;
        hor0 hor0Var = gor0Var;
        if ((i & 2) != 0) {
            hor0Var = jor0Var.b;
        }
        hor0 hor0Var2 = hor0Var;
        if ((i & 4) != 0) {
            djc0Var = jor0Var.c;
        }
        djc0 djc0Var2 = djc0Var;
        tnr0 tnr0Var = jor0Var.d;
        bor0 bor0Var = (i & 16) != 0 ? jor0Var.e : null;
        float f = jor0Var.f;
        jor0Var.getClass();
        return new jor0(eor0Var, hor0Var2, djc0Var2, tnr0Var, bor0Var, f);
    }

    public final hor0 a() {
        return this.b;
    }

    public final tnr0 b() {
        return this.d;
    }

    public final djc0 c() {
        return this.c;
    }

    public final eor0 d() {
        return this.a;
    }

    public final bor0 e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jor0)) {
            return false;
        }
        jor0 jor0Var = (jor0) obj;
        return u890.j(this.a, jor0Var.a) && u890.j(this.b, jor0Var.b) && u890.j(this.c, jor0Var.c) && u890.j(this.d, jor0Var.d) && u890.j(this.e, jor0Var.e) && Float.compare(this.f, jor0Var.f) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        bor0 bor0Var = this.e;
        return Float.hashCode(this.f) + ((iHashCode + (bor0Var == null ? 0 : bor0Var.hashCode())) * 31);
    }

    public jor0(eor0 eor0Var, hor0 hor0Var, djc0 djc0Var, tnr0 tnr0Var, bor0 bor0Var, float f) {
        this.a = eor0Var;
        this.b = hor0Var;
        this.c = djc0Var;
        this.d = tnr0Var;
        this.e = bor0Var;
        this.f = f;
    }
}
