package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class e3h0 implements e4h0 {
    public final c380 a;

    public e3h0(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3h0) && u890.j(this.a, ((e3h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
