package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r93 {
    public final String a;
    public final String b;
    public final String c;

    public r93(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r93)) {
            return false;
        }
        r93 r93Var = (r93) obj;
        return this.a.equals(r93Var.a) && u890.j(this.b, r93Var.b) && this.c.equals(r93Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
