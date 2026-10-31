package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ruk {
    public final String a;
    public final tn31 b;
    public final vsr0 c;
    public final m210 d;
    public final Set e;

    public ruk(String str, tn31 tn31Var, vsr0 vsr0Var, m210 m210Var, Set set) {
        this.a = str;
        this.b = tn31Var;
        this.c = vsr0Var;
        this.d = m210Var;
        this.e = set;
    }

    public final m210 a() {
        return this.d;
    }

    public final String b() {
        return this.a;
    }

    public final vsr0 c() {
        return this.c;
    }

    public final tn31 d() {
        return this.b;
    }

    public final Set e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ruk)) {
            return false;
        }
        ruk rukVar = (ruk) obj;
        return this.a.equals(rukVar.a) && u890.j(this.b, rukVar.b) && u890.j(this.c, rukVar.c) && u890.j(this.d, rukVar.d) && u890.j(this.e, rukVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c.a)) * 31);
    }
}
