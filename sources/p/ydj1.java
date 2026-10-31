package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ydj1 {
    public final xdj1 a;
    public final String b;
    public final String c;

    public ydj1(xdj1 xdj1Var, String str, String str2) {
        this.a = xdj1Var;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ydj1)) {
            return false;
        }
        ydj1 ydj1Var = (ydj1) obj;
        return this.a.equals(ydj1Var.a) && this.b.equals(ydj1Var.b) && this.c.equals(ydj1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
