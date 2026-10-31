package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class g09 extends pin {
    public final oin a;
    public final String b;
    public final String c;
    public final long d;

    public g09(h09 h09Var, String str, String str2, long j) {
        this.a = h09Var;
        this.b = str;
        this.c = str2;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pin) {
            g09 g09Var = (g09) ((pin) obj);
            if (this.a.equals(g09Var.a) && this.b.equals(g09Var.b) && this.c.equals(g09Var.c) && this.d == g09Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = (((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003;
        long j = this.d;
        return ((int) ((j >>> 32) ^ j)) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RolloutAssignment{rolloutVariant=");
        sb.append(this.a);
        sb.append(", parameterKey=");
        sb.append(this.b);
        sb.append(", parameterValue=");
        sb.append(this.c);
        sb.append(", templateVersion=");
        return pze0.h(this.d, "}", sb);
    }
}
