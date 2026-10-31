package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class l9d implements o9d {
    public final String a;
    public final String b;
    public final String c;

    public l9d(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final String a() {
        return this.c;
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l9d)) {
            return false;
        }
        l9d l9dVar = (l9d) obj;
        return u890.j(this.a, l9dVar.a) && u890.j(this.b, l9dVar.b) && u890.j(this.c, l9dVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
