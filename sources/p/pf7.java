package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pf7 implements xf7 {
    public final sd7 a;

    public pf7(sd7 sd7Var) {
        this.a = sd7Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pf7) && this.a.equals(((pf7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
