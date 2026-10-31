package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ow50 extends ayq0 {
    public final String b;
    public final doc c;
    public final int d;
    public final ave0 e;
    public final String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow50(String str, doc docVar, int i, ave0 ave0Var, String str2, int i2) {
        super(3);
        i = (i2 & 4) != 0 ? 1 : i;
        str2 = (i2 & 16) != 0 ? null : str2;
        this.b = str;
        this.c = docVar;
        this.d = i;
        this.e = ave0Var;
        this.f = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow50)) {
            return false;
        }
        ow50 ow50Var = (ow50) obj;
        return u890.j(this.b, ow50Var.b) && this.c.equals(ow50Var.c) && this.d == ow50Var.d && this.e.equals(ow50Var.e) && u890.j(this.f, ow50Var.f);
    }

    public final int hashCode() {
        String str = this.b;
        int iHashCode = (this.e.hashCode() + ab80.k(this.d, (this.c.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31, 31)) * 31;
        String str2 = this.f;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }
}
