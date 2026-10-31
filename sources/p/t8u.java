package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class t8u extends d9u {
    public final vq71 a;

    public t8u(vq71 vq71Var) {
        this.a = vq71Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t8u) && u890.j(this.a, ((t8u) obj).a);
    }

    public final int hashCode() {
        vq71 vq71Var = this.a;
        if (vq71Var == null) {
            return 0;
        }
        return vq71Var.hashCode();
    }
}
