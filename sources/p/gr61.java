package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gr61 implements ir61 {
    public final int a;

    public gr61(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gr61) && this.a == ((gr61) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
