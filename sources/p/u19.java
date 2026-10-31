package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class u19 {
    public static final u19 e;
    public final String a;
    public final spq0 b;
    public final spq0 c;
    public final spq0 d;

    static {
        j5 j5Var = j5.a;
        e = new u19("", j5Var, j5Var, j5Var);
    }

    public u19(String str, spq0 spq0Var, spq0 spq0Var2, spq0 spq0Var3) {
        this.a = str;
        this.b = spq0Var;
        this.c = spq0Var2;
        this.d = spq0Var3;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof u19) {
            u19 u19Var = (u19) obj;
            if (this.a.equals(u19Var.a) && this.b.equals(u19Var.b) && this.c.equals(u19Var.c) && this.d.equals(u19Var.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.b);
        return rjx.o(gvg.n("PreviewAction{previewId=", this.a, ", previewKey=", strValueOf, ", previewUrl="), String.valueOf(this.c), ", maxDuration=", String.valueOf(this.d), "}");
    }
}
