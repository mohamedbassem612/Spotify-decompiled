package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class v5j0 extends vxo1 {
    public final hxo1 c;

    public v5j0(hxo1 hxo1Var) {
        this.c = hxo1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v5j0) && this.c.equals(((v5j0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final hxo1 p() {
        return this.c;
    }
}
