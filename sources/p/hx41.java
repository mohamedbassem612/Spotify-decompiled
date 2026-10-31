package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hx41 extends xyn1 {
    public final String b;
    public final boolean c;
    public final val d;

    public hx41(String str, boolean z, val valVar) {
        this.b = str;
        this.c = z;
        this.d = valVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx41)) {
            return false;
        }
        hx41 hx41Var = (hx41) obj;
        return u890.j(this.b, hx41Var.b) && this.c == hx41Var.c && u890.j(this.d, hx41Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + xcg1.g(this.b.hashCode() * 31, 31, this.c);
    }

    public /* synthetic */ hx41(String str, val valVar) {
        this(str, false, valVar);
    }
}
