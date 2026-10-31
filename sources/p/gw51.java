package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gw51 {
    public final int a;
    public final double b;

    public gw51(double d, int i) {
        this.a = i;
        this.b = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gw51)) {
            return false;
        }
        gw51 gw51Var = (gw51) obj;
        return this.a == gw51Var.a && Double.compare(this.b, gw51Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
