package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ajg0 extends ern1 {
    public final boolean c;

    public ajg0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ajg0) && this.c == ((ajg0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
