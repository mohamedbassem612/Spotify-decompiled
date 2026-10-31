package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bo0 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g = "adEventReportingFailed";

    public bo0(String str, String str2, String str3, String str4) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bo0)) {
            return false;
        }
        bo0 bo0Var = (bo0) obj;
        return u890.j(this.c, bo0Var.c) && u890.j(this.d, bo0Var.d) && u890.j(this.e, bo0Var.e) && u890.j(this.f, bo0Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String k() {
        return this.c;
    }

    public final String l() {
        return this.d;
    }

    public final String m() {
        return this.g;
    }

    public final String n() {
        return this.e;
    }

    public final String o() {
        return this.f;
    }
}
