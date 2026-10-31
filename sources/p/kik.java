package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kik {
    public final String a;
    public final String b;
    public final String c;

    public kik(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kik)) {
            return false;
        }
        kik kikVar = (kik) obj;
        return u890.j(this.a, kikVar.a) && u890.j(this.b, kikVar.b) && u890.j(this.c, kikVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
