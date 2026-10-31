package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class l5j0 extends m5j0 {
    public final fwi0 a;

    public l5j0(fwi0 fwi0Var) {
        this.a = fwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l5j0) && this.a.equals(((l5j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
