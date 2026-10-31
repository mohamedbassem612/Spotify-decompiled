package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tz30 extends dug {
    public final int c;

    public tz30(int i) {
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tz30) && this.c == ((tz30) obj).c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c);
    }
}
