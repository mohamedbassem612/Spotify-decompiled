package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ue9 {
    public final double a;
    public final te9 b;
    public final int c;

    public ue9(double d, te9 te9Var, int i) {
        this.a = d;
        this.b = te9Var;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ue9)) {
            return false;
        }
        ue9 ue9Var = (ue9) obj;
        return Double.compare(this.a, ue9Var.a) == 0 && this.b == ue9Var.b && this.c == ue9Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Double.hashCode(this.a) * 31)) * 31);
    }
}
