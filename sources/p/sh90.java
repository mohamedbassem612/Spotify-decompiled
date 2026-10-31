package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class sh90 implements ni90 {
    public final r6w0 a;
    public final boolean b;

    public sh90(r6w0 r6w0Var, boolean z) {
        this.a = r6w0Var;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh90)) {
            return false;
        }
        sh90 sh90Var = (sh90) obj;
        return this.a.equals(sh90Var.a) && this.b == sh90Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
