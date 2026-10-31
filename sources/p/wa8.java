package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class wa8 {
    public final boolean a;
    public final c821 b;
    public final String c;

    public /* synthetic */ wa8(c821 c821Var, int i) {
        this(true, (i & 2) != 0 ? b821.a : c821Var, null);
    }

    public static wa8 a(wa8 wa8Var, String str) {
        boolean z = wa8Var.a;
        c821 c821Var = wa8Var.b;
        wa8Var.getClass();
        return new wa8(z, c821Var, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wa8)) {
            return false;
        }
        wa8 wa8Var = (wa8) obj;
        return this.a == wa8Var.a && u890.j(this.b, wa8Var.b) && u890.j(this.c, wa8Var.c);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31;
        String str = this.c;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public wa8(boolean z, c821 c821Var, String str) {
        this.a = z;
        this.b = c821Var;
        this.c = str;
    }
}
