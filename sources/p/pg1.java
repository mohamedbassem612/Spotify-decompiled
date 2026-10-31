package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pg1 implements qg1 {
    public final int a;

    public pg1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg1) && this.a == ((pg1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
