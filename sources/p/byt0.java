package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class byt0 implements fyt0 {
    public final x3s0 a;

    public byt0(x3s0 x3s0Var) {
        this.a = x3s0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byt0) && this.a.equals(((byt0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
