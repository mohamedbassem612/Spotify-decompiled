package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bli1 implements eli1 {
    public final nd90 a;

    public bli1(nd90 nd90Var) {
        this.a = nd90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bli1) && this.a == ((bli1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
