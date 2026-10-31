package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ghw implements fiw {
    public final String a;
    public final String b;
    public final String c;

    public ghw(String str, String str2, String str3) {
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
        if (!(obj instanceof ghw)) {
            return false;
        }
        ghw ghwVar = (ghw) obj;
        return u890.j(this.a, ghwVar.a) && this.b.equals(ghwVar.b) && u890.j(this.c, ghwVar.c);
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
