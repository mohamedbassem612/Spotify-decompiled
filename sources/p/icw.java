package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class icw implements oiw {
    public final String a;
    public final String b;
    public final String c;

    public icw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof icw)) {
            return false;
        }
        icw icwVar = (icw) obj;
        return u890.j(this.a, icwVar.a) && u890.j(this.b, icwVar.b) && this.c.equals(icwVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
