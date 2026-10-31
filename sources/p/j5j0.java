package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j5j0 extends m5j0 {
    public final fwi0 a;

    public j5j0(fwi0 fwi0Var) {
        this.a = fwi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j5j0) && this.a.equals(((j5j0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
