package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jqy0 extends r4o1 {
    public final boolean c;

    public jqy0(boolean z) {
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jqy0) && this.c == ((jqy0) obj).c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c);
    }
}
