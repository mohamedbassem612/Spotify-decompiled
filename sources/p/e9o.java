package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9o {
    public final int a;

    public e9o(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9o) && this.a == ((e9o) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
