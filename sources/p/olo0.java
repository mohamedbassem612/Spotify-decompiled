package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class olo0 {
    public final String a;
    public final String b;
    public final String c;
    public final mlo0 d;
    public final llo0 e;
    public final boolean f;

    public olo0(String str, String str2, String str3, mlo0 mlo0Var, llo0 llo0Var, boolean z, int i) {
        mlo0Var = (i & 8) != 0 ? null : mlo0Var;
        llo0Var = (i & 16) != 0 ? null : llo0Var;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = mlo0Var;
        this.e = llo0Var;
        this.f = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olo0)) {
            return false;
        }
        olo0 olo0Var = (olo0) obj;
        return this.a.equals(olo0Var.a) && this.b.equals(olo0Var.b) && this.c.equals(olo0Var.c) && u890.j(this.d, olo0Var.d) && u890.j(this.e, olo0Var.e) && this.f == olo0Var.f;
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        mlo0 mlo0Var = this.d;
        int iHashCode = (iD + (mlo0Var == null ? 0 : mlo0Var.hashCode())) * 31;
        llo0 llo0Var = this.e;
        return Boolean.hashCode(this.f) + ((iHashCode + (llo0Var != null ? llo0Var.hashCode() : 0)) * 961);
    }
}
