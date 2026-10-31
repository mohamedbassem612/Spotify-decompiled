package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ask1 implements qsk1 {
    public final b32 a;

    public ask1(b32 b32Var) {
        this.a = b32Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ask1) && this.a.equals(((ask1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
