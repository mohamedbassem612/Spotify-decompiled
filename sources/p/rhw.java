package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class rhw implements fiw {
    public final String a;
    public final String b;
    public final String c;

    public rhw(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String b() {
        return this.c;
    }

    public final String c() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rhw)) {
            return false;
        }
        rhw rhwVar = (rhw) obj;
        return u890.j(this.a, rhwVar.a) && this.b.equals(rhwVar.b) && u890.j(this.c, rhwVar.c);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iD + (str == null ? 0 : str.hashCode());
    }

    public final String q() {
        return this.a;
    }
}
