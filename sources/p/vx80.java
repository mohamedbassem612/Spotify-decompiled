package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class vx80 implements iy80 {
    public final jy80 a;

    public vx80(jy80 jy80Var) {
        this.a = jy80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vx80) && this.a == ((vx80) obj).a;
    }

    public final int hashCode() {
        jy80 jy80Var = this.a;
        if (jy80Var == null) {
            return 0;
        }
        return jy80Var.hashCode();
    }
}
