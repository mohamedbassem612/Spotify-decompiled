package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b1g {
    public final zzy a;
    public final String b;
    public final String c;

    public b1g(zzy zzyVar, String str, String str2) {
        this.a = zzyVar;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1g)) {
            return false;
        }
        b1g b1gVar = (b1g) obj;
        return u890.j(this.a, b1gVar.a) && u890.j(this.b, b1gVar.b) && u890.j(this.c, b1gVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
