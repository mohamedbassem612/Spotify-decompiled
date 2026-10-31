package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vp81 extends eq81 {
    public final f0r0 a;

    public vp81(f0r0 f0r0Var) {
        this.a = f0r0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp81) && u890.j(this.a, ((vp81) obj).a);
    }

    public final int hashCode() {
        f0r0 f0r0Var = this.a;
        if (f0r0Var == null) {
            return 0;
        }
        return f0r0Var.hashCode();
    }
}
