package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class t0n1 extends ern1 {
    public final tv80 c;
    public final boolean d;
    public final String e;

    public t0n1(String str, tv80 tv80Var, boolean z) {
        this.c = tv80Var;
        this.d = z;
        this.e = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0n1)) {
            return false;
        }
        t0n1 t0n1Var = (t0n1) obj;
        return this.c.equals(t0n1Var.c) && this.d == t0n1Var.d && u890.j(this.e, t0n1Var.e);
    }

    public final int hashCode() {
        int iG = xcg1.g(this.c.hashCode() * 31, 31, this.d);
        String str = this.e;
        return iG + (str == null ? 0 : str.hashCode());
    }
}
