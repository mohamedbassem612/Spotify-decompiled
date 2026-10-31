package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ali0 extends eli0 {
    public final fli0 a;

    public ali0(fli0 fli0Var) {
        this.a = fli0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ali0) && this.a.equals(((ali0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
