package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rum1 implements vum1 {
    public final int a;

    public rum1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rum1) && this.a == ((rum1) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
