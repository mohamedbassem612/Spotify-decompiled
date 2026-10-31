package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q6t0 extends ln90 {
    public final String c;

    public q6t0(String str) {
        super(2);
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q6t0) && this.c.equals(((q6t0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }

    public final String toString() {
        return gvg.k(new StringBuilder("PlaceholderText(text="), this.c, ')');
    }
}
