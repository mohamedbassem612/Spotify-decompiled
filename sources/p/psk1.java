package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class psk1 implements qsk1 {
    public final double a;

    public psk1(double d) {
        this.a = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof psk1) && Double.compare(this.a, ((psk1) obj).a) == 0;
    }

    public final int hashCode() {
        return (Double.hashCode(this.a) * 31) - 1701542837;
    }
}
