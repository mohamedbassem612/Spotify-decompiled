package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class t8b {
    public final s8b a;
    public final String b;
    public final String c;
    public final boolean d;

    public t8b(s8b s8bVar, String str, String str2, boolean z) {
        this.a = s8bVar;
        this.b = str;
        this.c = str2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t8b)) {
            return false;
        }
        t8b t8bVar = (t8b) obj;
        return this.a.equals(t8bVar.a) && this.b.equals(t8bVar.b) && u890.j(this.c, t8bVar.c) && this.d == t8bVar.d;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return Boolean.hashCode(this.d) + ((iD + (str == null ? 0 : str.hashCode())) * 31);
    }
}
