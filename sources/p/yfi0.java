package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yfi0 extends agi0 {
    public final String a;
    public final op80 b;
    public final hgi0 c;

    public yfi0(String str, op80 op80Var, hgi0 hgi0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = hgi0Var;
    }

    public final hgi0 a() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yfi0)) {
            return false;
        }
        yfi0 yfi0Var = (yfi0) obj;
        return this.a.equals(yfi0Var.a) && this.b.equals(yfi0Var.b) && this.c.equals(yfi0Var.c);
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
