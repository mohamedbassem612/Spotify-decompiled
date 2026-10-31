package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class arv implements irv {
    public final Integer a;
    public final o3w b;
    public final x7i1 c;

    public arv(Integer num, o3w o3wVar, x7i1 x7i1Var, int i) {
        num = (i & 1) != 0 ? null : num;
        o3wVar = (i & 2) != 0 ? null : o3wVar;
        x7i1Var = (i & 4) != 0 ? new x7i1(false, (exc0) null, (rc50) null, false, false, false, false, false, 8191) : x7i1Var;
        this.a = num;
        this.b = o3wVar;
        this.c = x7i1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof arv)) {
            return false;
        }
        arv arvVar = (arv) obj;
        return u890.j(this.a, arvVar.a) && u890.j(this.b, arvVar.b) && this.c.equals(arvVar.c);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        o3w o3wVar = this.b;
        return this.c.hashCode() + ((iHashCode + (o3wVar != null ? o3wVar.hashCode() : 0)) * 31);
    }
}
