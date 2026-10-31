package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h2r extends l3p1 {
    public final String c;
    public final String d;
    public final String e;

    public h2r(String str, String str2, String str3) {
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2r)) {
            return false;
        }
        h2r h2rVar = (h2r) obj;
        return u890.j(this.c, h2rVar.c) && u890.j(this.d, h2rVar.d) && u890.j(this.e, h2rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d(this.c.hashCode() * 31, 31, this.d);
    }
}
