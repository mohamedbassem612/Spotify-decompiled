package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class asz0 extends vno1 {
    public final double c;

    public asz0(double d) {
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof asz0) && Double.compare(this.c, ((asz0) obj).c) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.c);
    }
}
