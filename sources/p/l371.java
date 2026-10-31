package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l371 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public l371(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l371)) {
            return false;
        }
        l371 l371Var = (l371) obj;
        return this.a.equals(l371Var.a) && this.b.equals(l371Var.b) && this.c.equals(l371Var.c) && this.d.equals(l371Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
