package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vr10 implements ybj1 {
    public final xx10 a;

    public vr10(xx10 xx10Var) {
        this.a = xx10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vr10) && this.a.equals(((vr10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
