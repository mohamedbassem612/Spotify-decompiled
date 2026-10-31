package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ryo0 {
    public final String a;
    public final ynb0 b;
    public final boolean c;

    public ryo0(String str, ynb0 ynb0Var, boolean z) {
        this.a = str;
        this.b = ynb0Var;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ryo0)) {
            return false;
        }
        ryo0 ryo0Var = (ryo0) obj;
        return u890.j(this.a, ryo0Var.a) && u890.j(this.b, ryo0Var.b) && this.c == ryo0Var.c;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        ynb0 ynb0Var = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (ynb0Var == null ? 0 : ynb0Var.hashCode())) * 31);
    }
}
