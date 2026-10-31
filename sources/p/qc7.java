package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qc7 extends uc7 {
    public final hi90 a;

    public qc7(hi90 hi90Var) {
        this.a = hi90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qc7) && this.a.equals(((qc7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
