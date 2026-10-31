package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class is01 extends vs01 {
    public final String a;
    public final tv80 b;

    public is01(String str, tv80 tv80Var) {
        this.a = str;
        this.b = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof is01)) {
            return false;
        }
        is01 is01Var = (is01) obj;
        return u890.j(this.a, is01Var.a) && this.b.equals(is01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
