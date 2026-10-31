package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pn51 {
    public static final pn51 c = new pn51(0, 0);
    public final long a;
    public final long b;

    public pn51(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && pn51.class == obj.getClass()) {
            pn51 pn51Var = (pn51) obj;
            if (this.a == pn51Var.a && this.b == pn51Var.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[timeUs=");
        sb.append(this.a);
        sb.append(", position=");
        return pze0.h(this.b, "]", sb);
    }
}
