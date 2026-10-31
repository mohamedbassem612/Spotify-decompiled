package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class yig0 extends ern1 {
    public final boolean c;

    public yig0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yig0) && this.c == ((yig0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
