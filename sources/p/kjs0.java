package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kjs0 implements liu {
    public final int a;

    public kjs0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kjs0) && this.a == ((kjs0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
