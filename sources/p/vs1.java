package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vs1 implements bt1 {
    public final String a;
    public final yc41 b;

    public vs1(String str, yc41 yc41Var) {
        this.a = str;
        this.b = yc41Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vs1)) {
            return false;
        }
        vs1 vs1Var = (vs1) obj;
        return u890.j(this.a, vs1Var.a) && this.b.equals(vs1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
