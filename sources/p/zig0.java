package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zig0 extends ern1 {
    public final boolean c;

    public zig0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zig0) && this.c == ((zig0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
