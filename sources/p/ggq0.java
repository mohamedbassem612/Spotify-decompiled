package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ggq0 {
    public final int a;
    public final String b;
    public final egq0 c;
    public final boolean d;

    public ggq0(int i, String str, egq0 egq0Var, boolean z) {
        this.a = i;
        this.b = str;
        this.c = egq0Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ggq0)) {
            return false;
        }
        ggq0 ggq0Var = (ggq0) obj;
        return this.a == ggq0Var.a && u890.j(this.b, ggq0Var.b) && this.c.equals(ggq0Var.c) && this.d == ggq0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + cy30.d(l1d.C(this.a) * 31, 31, this.b)) * 31);
    }
}
