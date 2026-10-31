package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9k1 extends d7p1 {
    public final boolean c;

    public e9k1(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e9k1) && this.c == ((e9k1) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
