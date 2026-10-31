package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rp10 implements sp10 {
    public final String a;
    public final eo10 b;

    public rp10(String str, eo10 eo10Var) {
        this.a = str;
        this.b = eo10Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rp10)) {
            return false;
        }
        rp10 rp10Var = (rp10) obj;
        return this.a.equals(rp10Var.a) && this.b.equals(rp10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
