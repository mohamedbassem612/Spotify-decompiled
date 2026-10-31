package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cms implements dms {
    public final ak3 a;

    public cms(ak3 ak3Var) {
        this.a = ak3Var;
    }

    public final ak3 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cms) && this.a == ((cms) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
