package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class or0 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f = "Ad fetched but not rendered: ad_expired_before_render";

    public or0(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or0)) {
            return false;
        }
        or0 or0Var = (or0) obj;
        return u890.j(this.c, or0Var.c) && u890.j(this.d, or0Var.d) && u890.j(this.e, or0Var.e);
    }

    public final int hashCode() {
        int iHashCode = ((this.c.hashCode() * 31) + 1638086560) * 31;
        String str = this.d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String k() {
        return this.e;
    }

    public final String l() {
        return this.f;
    }

    public final String m() {
        return "adNotRendered";
    }

    public final String o() {
        return this.d;
    }

    public final String q() {
        return this.c;
    }

    public final String s() {
        return "ad_expired_before_render";
    }
}
