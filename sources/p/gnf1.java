package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gnf1 implements jnf1 {
    public final aof1 a;

    public gnf1(aof1 aof1Var) {
        this.a = aof1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gnf1) && this.a == ((gnf1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
