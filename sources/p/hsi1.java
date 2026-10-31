package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hsi1 {
    public final String a;
    public final Object b;
    public final Object c;
    public final fe5 d;
    public final tzg1 e;

    public hsi1(String str, Object obj, Object obj2, fe5 fe5Var, tzg1 tzg1Var) {
        this.a = str;
        this.b = obj;
        this.c = obj2;
        this.d = fe5Var;
        this.e = tzg1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof hsi1) {
            hsi1 hsi1Var = (hsi1) obj;
            return u890.j(this.a, hsi1Var.a) && this.b.equals(hsi1Var.b) && this.c.equals(hsi1Var.c) && u890.j(this.d, hsi1Var.d) && this.e == hsi1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
