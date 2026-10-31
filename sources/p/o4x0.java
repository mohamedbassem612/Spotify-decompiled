package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class o4x0 extends i541 {
    public final String d;
    public final tv80 e;

    public o4x0(String str, tv80 tv80Var) {
        this.d = str;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o4x0)) {
            return false;
        }
        o4x0 o4x0Var = (o4x0) obj;
        return u890.j(this.d, o4x0Var.d) && u890.j(this.e, o4x0Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + (this.d.hashCode() * 31);
    }
}
