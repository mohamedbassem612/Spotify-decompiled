package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class isg implements ksg {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.ksg
    public final boolean b(Comparable comparable, Comparable comparable2) {
        return ((Number) comparable).doubleValue() <= ((Number) comparable2).doubleValue();
    }

    public final boolean equals(Object obj) {
        return obj instanceof isg;
    }

    public final int hashCode() {
        return Double.hashCode(170.0d) + (Double.hashCode(120.0d) * 31);
    }

    public final boolean isEmpty() {
        return false;
    }

    public final Comparable m() {
        return Double.valueOf(120.0d);
    }

    public final Comparable n() {
        return Double.valueOf(170.0d);
    }

    public final String toString() {
        return "120.0..170.0";
    }
}
