package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class pg2 implements sg2 {
    public final int a;

    public pg2(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof pg2) && this.a == ((pg2) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
