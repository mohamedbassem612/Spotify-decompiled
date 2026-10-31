package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class u4g0 extends z1p1 {
    public final String c;
    public final String d;
    public final String e;

    public u4g0(String str, String str2) {
        this.c = str;
        this.d = str2;
        this.e = "url is malformed: ".concat(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u4g0)) {
            return false;
        }
        u4g0 u4g0Var = (u4g0) obj;
        return u890.j(this.c, u4g0Var.c) && u890.j(this.d, u4g0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    @Override // p.z1p1
    public final String l() {
        return this.e;
    }

    @Override // p.z1p1
    public final String m() {
        return "malformedTrackingUrl";
    }

    @Override // p.z1p1
    public final String n() {
        return this.c;
    }
}
