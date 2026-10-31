package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dw10 {
    public final uv10 a;
    public final String b;
    public final String c;

    public dw10(uv10 uv10Var, String str, String str2) {
        this.a = uv10Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw10)) {
            return false;
        }
        dw10 dw10Var = (dw10) obj;
        return this.a.equals(dw10Var.a) && u890.j(this.b, dw10Var.b) && u890.j(this.c, dw10Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
