package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class f7v0 implements ez00 {
    public final h290 a;

    public f7v0(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f7v0) && this.a.equals(((f7v0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
