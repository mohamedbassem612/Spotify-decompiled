package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dxn0 {
    public final String a;
    public final int b;
    public final dzk c;

    public dxn0(String str, int i, dzk dzkVar) {
        this.a = str;
        this.b = i;
        this.c = dzkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dxn0)) {
            return false;
        }
        dxn0 dxn0Var = (dxn0) obj;
        return u890.j(this.a, dxn0Var.a) && this.b == dxn0Var.b && u890.j(this.c, dxn0Var.c);
    }

    public final int hashCode() {
        int iK = ab80.k(this.b, this.a.hashCode() * 31, 31);
        dzk dzkVar = this.c;
        return iK + (dzkVar == null ? 0 : dzkVar.a.hashCode());
    }

    public /* synthetic */ dxn0(String str, int i) {
        this(str, 1, null);
    }
}
