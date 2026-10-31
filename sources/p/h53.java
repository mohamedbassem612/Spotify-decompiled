package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class h53 {
    public final String a;
    public final String b;
    public final String c;
    public final den d;

    public h53(String str, String str2, String str3, den denVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = denVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h53)) {
            return false;
        }
        h53 h53Var = (h53) obj;
        return this.a.equals(h53Var.a) && this.b.equals(h53Var.b) && this.c.equals(h53Var.c) && this.d.equals(h53Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
