package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ljc0 extends mjc0 {
    public final String a;
    public final pae1 b;
    public final rjc0 c;

    public /* synthetic */ ljc0(String str, pae1 pae1Var, rjc0 rjc0Var, int i) {
        this(str, (i & 2) != 0 ? null : pae1Var, (i & 4) != 0 ? null : rjc0Var);
    }

    @Override // p.mjc0
    public final rjc0 a() {
        return this.c;
    }

    @Override // p.mjc0
    public final pae1 b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ljc0)) {
            return false;
        }
        ljc0 ljc0Var = (ljc0) obj;
        return u890.j(this.a, ljc0Var.a) && u890.j(this.b, ljc0Var.b) && u890.j(this.c, ljc0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        pae1 pae1Var = this.b;
        int iHashCode2 = (iHashCode + (pae1Var != null ? pae1Var.hashCode() : 0)) * 31;
        rjc0 rjc0Var = this.c;
        return iHashCode2 + (rjc0Var != null ? rjc0Var.hashCode() : 0);
    }

    public final String toString() {
        return f4i1.f("LinkAnnotation.Url(url=", this.a, ")");
    }

    public ljc0(String str, pae1 pae1Var, rjc0 rjc0Var) {
        this.a = str;
        this.b = pae1Var;
        this.c = rjc0Var;
    }
}
