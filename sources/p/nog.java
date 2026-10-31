package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nog extends x1p1 {
    public final jog c;
    public final o571 d;
    public final c380 e;

    static {
        idd1 idd1Var = o571.c;
    }

    public nog(jog jogVar, o571 o571Var, c380 c380Var) {
        this.c = jogVar;
        this.d = o571Var;
        this.e = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nog)) {
            return false;
        }
        nog nogVar = (nog) obj;
        return this.c.equals(nogVar.c) && u890.j(this.d, nogVar.d) && u890.j(this.e, nogVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + (this.c.hashCode() * 31)) * 31);
    }
}
