package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class gh8 {
    public final byo1 a;
    public final hh8 b;
    public final yi01 c;
    public final String d;

    public gh8(byo1 byo1Var, hh8 hh8Var, yi01 yi01Var, String str) {
        this.a = byo1Var;
        this.b = hh8Var;
        this.c = yi01Var;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gh8)) {
            return false;
        }
        gh8 gh8Var = (gh8) obj;
        return this.a.equals(gh8Var.a) && this.b.equals(gh8Var.b) && u890.j(this.c, gh8Var.c) && this.d.equals(gh8Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        yi01 yi01Var = this.c;
        return this.d.hashCode() + ((iHashCode + (yi01Var == null ? 0 : yi01Var.hashCode())) * 31);
    }
}
