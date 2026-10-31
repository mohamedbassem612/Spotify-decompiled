package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class j6t {
    public final String a;
    public final boolean b;
    public final String c;

    public j6t(String str, String str2, boolean z) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j6t)) {
            return false;
        }
        j6t j6tVar = (j6t) obj;
        return this.a.equals(j6tVar.a) && this.b == j6tVar.b && u890.j(this.c, j6tVar.c);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
