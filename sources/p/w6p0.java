package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w6p0 {
    public final v6p0 a;

    public w6p0(v6p0 v6p0Var) {
        this.a = v6p0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w6p0) && this.a.equals(((w6p0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
