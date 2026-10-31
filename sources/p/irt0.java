package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class irt0 implements trt0 {
    public final hrt0 a;

    public irt0(hrt0 hrt0Var) {
        this.a = hrt0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof irt0) && u890.j(this.a, ((irt0) obj).a);
    }

    public final int hashCode() {
        hrt0 hrt0Var = this.a;
        if (hrt0Var == null) {
            return 0;
        }
        return hrt0Var.hashCode();
    }
}
