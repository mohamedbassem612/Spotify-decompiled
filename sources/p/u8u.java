package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class u8u extends d9u {
    public final wt91 a;

    public u8u(wt91 wt91Var) {
        this.a = wt91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u8u) && u890.j(this.a, ((u8u) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
