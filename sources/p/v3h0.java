package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v3h0 implements e4h0 {
    public final c380 a;

    public v3h0(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v3h0) && u890.j(this.a, ((v3h0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
