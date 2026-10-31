package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v760 {
    public static final v760 d = new v760(false, true, Boolean.FALSE);
    public final boolean a;
    public final boolean b;
    public final Boolean c;

    public v760(boolean z, boolean z2, Boolean bool) {
        this.a = z;
        this.b = z2;
        this.c = bool;
    }

    public final boolean a() {
        return !this.a && this.b && u890.j(this.c, Boolean.FALSE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v760)) {
            return false;
        }
        v760 v760Var = (v760) obj;
        return this.a == v760Var.a && this.b == v760Var.b && u890.j(this.c, v760Var.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
        Boolean bool = this.c;
        return iG + (bool == null ? 0 : bool.hashCode());
    }
}
