package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lyz implements q600 {
    public final pp90 a;

    public lyz(pp90 pp90Var) {
        this.a = pp90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lyz) && this.a.equals(((lyz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
