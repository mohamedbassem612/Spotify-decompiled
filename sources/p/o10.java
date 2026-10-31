package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o10 {
    public final String a;
    public final String b;
    public final String c;

    public o10(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o10)) {
            return false;
        }
        o10 o10Var = (o10) obj;
        return this.a.equals(o10Var.a) && this.b.equals(o10Var.b) && this.c.equals(o10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
