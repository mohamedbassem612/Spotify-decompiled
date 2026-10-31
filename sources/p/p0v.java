package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class p0v {
    public final String a;
    public final String b;
    public final int c;
    public final Long d;
    public final o0v e;

    public p0v(String str, String str2, int i, Long l, o0v o0vVar) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = l;
        this.e = o0vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof p0v)) {
            return false;
        }
        p0v p0vVar = (p0v) obj;
        return this.a.equals(p0vVar.a) && this.b.equals(p0vVar.b) && this.c == p0vVar.c && u890.j(this.d, p0vVar.d) && this.e.equals(p0vVar.e);
    }

    public final int hashCode() {
        int iK = ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        Long l = this.d;
        return this.e.hashCode() + ab80.k(1, (iK + (l == null ? 0 : l.hashCode())) * 31, 31);
    }
}
