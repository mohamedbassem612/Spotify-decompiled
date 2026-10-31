package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class arf0 implements drf0 {
    public final whc0 a;

    public arf0(whc0 whc0Var) {
        this.a = whc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof arf0) && this.a == ((arf0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
