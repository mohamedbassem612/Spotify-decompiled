package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v1m1 {
    public final t1m1 a;
    public final Boolean b;
    public final String c;

    public /* synthetic */ v1m1() {
        this(new t1m1((Integer) null, (gzl1) null, (Boolean) null, (Boolean) null, (Integer) null, 63), null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v1m1)) {
            return false;
        }
        v1m1 v1m1Var = (v1m1) obj;
        return u890.j(this.a, v1m1Var.a) && u890.j(this.b, v1m1Var.b) && u890.j(this.c, v1m1Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    public v1m1(t1m1 t1m1Var, Boolean bool, String str) {
        this.a = t1m1Var;
        this.b = bool;
        this.c = str;
    }
}
