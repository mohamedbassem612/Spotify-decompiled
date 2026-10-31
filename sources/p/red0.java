package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class red0 implements ted0 {
    public final int a;

    public red0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof red0) && this.a == ((red0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
