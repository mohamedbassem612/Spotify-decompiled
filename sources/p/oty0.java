package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class oty0 extends dgo1 {
    public final boolean c;

    public oty0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oty0) && this.c == ((oty0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
