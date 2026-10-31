package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class byd0 implements azd0 {
    public final rwd0 a;

    public byd0(rwd0 rwd0Var) {
        this.a = rwd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof byd0) && this.a.equals(((byd0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
