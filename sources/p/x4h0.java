package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x4h0 implements h5h0 {
    public final c380 a;

    public x4h0(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x4h0) && u890.j(this.a, ((x4h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
