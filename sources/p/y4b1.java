package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y4b1 implements z4b1 {
    public final a6b1 a;

    public y4b1(a6b1 a6b1Var) {
        this.a = a6b1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y4b1) && this.a == ((y4b1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
