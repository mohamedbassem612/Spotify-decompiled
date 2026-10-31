package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class g8d {
    public final String a;
    public final String b;
    public final f8d c;
    public final boolean d;

    public g8d(String str, String str2, f8d f8dVar, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = f8dVar;
        this.d = z;
    }

    public static g8d a(g8d g8dVar, f8d f8dVar) {
        return new g8d(g8dVar.a, g8dVar.b, f8dVar, g8dVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g8d)) {
            return false;
        }
        g8d g8dVar = (g8d) obj;
        return u890.j(this.a, g8dVar.a) && u890.j(this.b, g8dVar.b) && u890.j(this.c, g8dVar.c) && this.d == g8dVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
