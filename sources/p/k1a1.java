package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k1a1 extends q1a1 {
    public final hr90 a;

    public k1a1(hr90 hr90Var) {
        this.a = hr90Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k1a1) && this.a == ((k1a1) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
