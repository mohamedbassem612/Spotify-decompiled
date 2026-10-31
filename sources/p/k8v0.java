package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class k8v0 extends l8v0 {
    public final int a;

    public k8v0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k8v0) && this.a == ((k8v0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
