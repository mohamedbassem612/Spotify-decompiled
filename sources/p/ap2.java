package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ap2 {
    public final String a;
    public final hr2 b;
    public final String c;

    public ap2(String str, hr2 hr2Var, String str2) {
        this.a = str;
        this.b = hr2Var;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ap2)) {
            return false;
        }
        ap2 ap2Var = (ap2) obj;
        return u890.j(this.a, ap2Var.a) && u890.j(this.b, ap2Var.b) && u890.j(this.c, ap2Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        hr2 hr2Var = this.b;
        int iHashCode2 = (iHashCode + (hr2Var == null ? 0 : hr2Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
