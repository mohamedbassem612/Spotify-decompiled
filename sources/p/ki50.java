package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ki50 {
    public final int a;

    public ki50(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ki50) && this.a == ((ki50) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
