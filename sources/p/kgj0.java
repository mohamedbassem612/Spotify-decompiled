package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kgj0 extends pgj0 {
    public final int a;

    public kgj0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kgj0) && this.a == ((kgj0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
