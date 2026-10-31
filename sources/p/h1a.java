package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h1a {
    public final String a;
    public final String b;
    public final String c;
    public final n1a d;

    public h1a(String str, String str2, String str3, n1a n1aVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = n1aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1a)) {
            return false;
        }
        h1a h1aVar = (h1a) obj;
        return this.a.equals(h1aVar.a) && this.b.equals(h1aVar.b) && this.c.equals(h1aVar.c) && this.d.equals(h1aVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
