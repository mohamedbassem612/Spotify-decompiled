package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k091 implements o091 {
    public final h091 a;

    public k091(h091 h091Var) {
        this.a = h091Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k091) && this.a.equals(((k091) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
