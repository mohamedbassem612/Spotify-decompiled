package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vfx0 {
    public static final vfx0 d = new vfx0(0.0f, yoi1.J(0.0f, 0.0f), 0);
    public final float a;
    public final ksg b;
    public final int c;

    public vfx0(float f, ksg ksgVar, int i) {
        this.a = f;
        this.b = ksgVar;
        this.c = i;
        if (Float.isNaN(f)) {
            hhg1.n("current must not be NaN");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfx0)) {
            return false;
        }
        vfx0 vfx0Var = (vfx0) obj;
        return this.a == vfx0Var.a && u890.j(this.b, vfx0Var.b) && this.c == vfx0Var.c;
    }

    public final int hashCode() {
        return ((this.b.hashCode() + (Float.hashCode(this.a) * 31)) * 31) + this.c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProgressBarRangeInfo(current=");
        sb.append(this.a);
        sb.append(", range=");
        sb.append(this.b);
        sb.append(", steps=");
        return gvg.j(sb, this.c, ")");
    }
}
