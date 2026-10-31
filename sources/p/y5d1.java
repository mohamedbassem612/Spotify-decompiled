package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class y5d1 implements a6d1 {
    public final k6d1 a;

    public y5d1(k6d1 k6d1Var) {
        this.a = k6d1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y5d1) && this.a == ((y5d1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
