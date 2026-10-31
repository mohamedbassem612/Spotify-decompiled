package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hnf1 implements jnf1 {
    public final aof1 a;

    public hnf1(aof1 aof1Var) {
        this.a = aof1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnf1) && this.a == ((hnf1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
