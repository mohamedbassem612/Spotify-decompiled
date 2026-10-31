package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y7k0 implements z7k0 {
    public final uuj0 a;

    public y7k0(uuj0 uuj0Var) {
        this.a = uuj0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y7k0) && this.a.equals(((y7k0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
