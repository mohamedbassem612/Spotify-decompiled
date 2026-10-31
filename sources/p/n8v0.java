package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class n8v0 extends i8p1 {
    public final boolean c;

    public n8v0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n8v0) && this.c == ((n8v0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
