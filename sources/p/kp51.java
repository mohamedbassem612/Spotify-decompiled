package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kp51 {
    public final int a;
    public final String b;
    public final y5m1 c;

    public kp51(int i, String str, y5m1 y5m1Var) {
        this.a = i;
        this.b = str;
        this.c = y5m1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kp51)) {
            return false;
        }
        kp51 kp51Var = (kp51) obj;
        return this.a == kp51Var.a && this.b.equals(kp51Var.b) && this.c.equals(kp51Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(Integer.hashCode(this.a) * 31, 31, this.b);
    }
}
