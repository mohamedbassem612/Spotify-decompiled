package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oz5 implements qz5 {
    public final fz5 a;
    public final String b;
    public final Throwable c;

    public /* synthetic */ oz5(fz5 fz5Var, String str, int i) {
        this(fz5Var, (i & 2) != 0 ? null : str, (Exception) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oz5)) {
            return false;
        }
        oz5 oz5Var = (oz5) obj;
        return this.a == oz5Var.a && u890.j(this.b, oz5Var.b) && u890.j(this.c, oz5Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.c;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public oz5(fz5 fz5Var, String str, Exception exc) {
        this.a = fz5Var;
        this.b = str;
        this.c = exc;
    }
}
