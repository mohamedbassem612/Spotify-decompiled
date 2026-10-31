package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class n1a {
    public final String a;
    public final String b;
    public final String c;

    public n1a(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1a)) {
            return false;
        }
        n1a n1aVar = (n1a) obj;
        return this.a.equals(n1aVar.a) && this.b.equals(n1aVar.b) && this.c.equals(n1aVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
