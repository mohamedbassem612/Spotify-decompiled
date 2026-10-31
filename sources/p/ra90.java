package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ra90 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public ra90(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ra90)) {
            return false;
        }
        ra90 ra90Var = (ra90) obj;
        return this.a.equals(ra90Var.a) && this.b.equals(ra90Var.b) && this.c.equals(ra90Var.c) && this.d.equals(ra90Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }
}
