package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class u4k1 implements b5k1 {
    public final u771 a;

    public u4k1(u771 u771Var) {
        this.a = u771Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u4k1) && u890.j(this.a, ((u4k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
