package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d4k1 {
    public final jo70 a;
    public final xkk1 b;
    public final ddz c;

    public d4k1(jo70 jo70Var, xkk1 xkk1Var, ddz ddzVar) {
        this.a = jo70Var;
        this.b = xkk1Var;
        this.c = ddzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4k1)) {
            return false;
        }
        d4k1 d4k1Var = (d4k1) obj;
        return this.a.equals(d4k1Var.a) && this.b.equals(d4k1Var.b) && u890.j(this.c, d4k1Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ddz ddzVar = this.c;
        return iHashCode + (ddzVar == null ? 0 : ddzVar.hashCode());
    }
}
