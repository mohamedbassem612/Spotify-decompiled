package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class as01 extends vxo1 {
    public final String c;
    public final tv80 d;

    public as01(String str, tv80 tv80Var) {
        this.c = str;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof as01)) {
            return false;
        }
        as01 as01Var = (as01) obj;
        return u890.j(this.c, as01Var.c) && this.d.equals(as01Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }
}
