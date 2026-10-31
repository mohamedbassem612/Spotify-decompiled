package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vgx0 {
    public final String a;
    public final float b;

    public vgx0(String str, float f) {
        this.a = str;
        this.b = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vgx0)) {
            return false;
        }
        vgx0 vgx0Var = (vgx0) obj;
        return u890.j(this.a, vgx0Var.a) && p3v.c(this.b, vgx0Var.b);
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
