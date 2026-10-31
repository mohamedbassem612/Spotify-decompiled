package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class n7v0 extends h7p1 {
    public final boolean c;

    public n7v0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n7v0) && this.c == ((n7v0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
