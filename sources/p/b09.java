package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b09 extends kin {
    public final String a;
    public final int b;
    public final int c;
    public final boolean d;

    public b09(String str, int i, int i2, boolean z) {
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kin) {
            b09 b09Var = (b09) ((kin) obj);
            if (this.a.equals(b09Var.a) && this.b == b09Var.b && this.c == b09Var.c && this.d == b09Var.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.d ? 1231 : 1237) ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ProcessDetails{processName=");
        sb.append(this.a);
        sb.append(", pid=");
        sb.append(this.b);
        sb.append(", importance=");
        sb.append(this.c);
        sb.append(", defaultProcess=");
        return l1d.r(sb, this.d, "}");
    }
}
