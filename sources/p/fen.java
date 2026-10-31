package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fen {
    public static final se11 c = new se11("[\n\t\r ]");
    public static final idd1 d = new idd1(lmm.i);
    public static final idd1 e = new idd1(lmm.h);
    public final double a;
    public final double b;

    public fen(double d2, double d3) {
        this.a = d2;
        this.b = d3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fen)) {
            return false;
        }
        fen fenVar = (fen) obj;
        return Double.compare(this.a, fenVar.a) == 0 && Double.compare(this.b, fenVar.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }
}
