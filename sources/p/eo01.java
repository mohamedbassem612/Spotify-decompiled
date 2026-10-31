package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class eo01 {
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final cqs0 e;

    public eo01(String str, String str2, String str3, int i, cqs0 cqs0Var) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = i;
        this.e = cqs0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo01)) {
            return false;
        }
        eo01 eo01Var = (eo01) obj;
        return u890.j(this.a, eo01Var.a) && u890.j(this.b, eo01Var.b) && this.c.equals(eo01Var.c) && this.d == eo01Var.d && this.e.equals(eo01Var.e);
    }

    public final int hashCode() {
        return (this.e.hashCode() + kaa0.f(this.d, cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31)) * 31;
    }
}
