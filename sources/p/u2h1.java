package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u2h1 extends d3h1 {
    public final long b;

    public u2h1(long j) {
        super("dtms");
        this.b = j;
    }

    public final String a() {
        return String.valueOf(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u2h1) && this.b == ((u2h1) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }
}
