package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ro10 {
    public final String a;
    public final fo10 b;
    public final long c;
    public final mo10 d;
    public final boolean e;

    public ro10(String str, fo10 fo10Var, long j, mo10 mo10Var, boolean z) {
        this.a = str;
        this.b = fo10Var;
        this.c = j;
        this.d = mo10Var;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ro10)) {
            return false;
        }
        ro10 ro10Var = (ro10) obj;
        return u890.j(this.a, ro10Var.a) && this.b.equals(ro10Var.b) && this.c == ro10Var.c && this.d.equals(ro10Var.d) && this.e == ro10Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ((this.d.hashCode() + cy30.f((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, this.c, 31)) * 31);
    }
}
