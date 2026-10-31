package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8r extends d5p1 {
    public final String c;
    public final int d;
    public final String e;

    public j8r(String str, int i, String str2) {
        this.c = str;
        this.d = i;
        this.e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j8r)) {
            return false;
        }
        j8r j8rVar = (j8r) obj;
        return this.c.equals(j8rVar.c) && this.d == j8rVar.d && this.e.equals(j8rVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, this.c.hashCode() * 31, 31);
    }

    public final int v() {
        return this.d;
    }

    public final String w() {
        return this.e;
    }

    public final String x() {
        return this.c;
    }
}
