package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gd71 extends h1p1 {
    public final String c;
    public final String d;

    public gd71(String str, String str2) {
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gd71)) {
            return false;
        }
        gd71 gd71Var = (gd71) obj;
        return u890.j(this.c, gd71Var.c) && u890.j(this.d, gd71Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
