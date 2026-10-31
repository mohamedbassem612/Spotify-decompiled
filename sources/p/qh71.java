package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qh71 {
    public final String a;
    public final String b;
    public final String c;
    public final dz d;
    public final dz e;

    public qh71(String str, String str2, String str3, dz dzVar, dz dzVar2) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = dzVar;
        this.e = dzVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh71)) {
            return false;
        }
        qh71 qh71Var = (qh71) obj;
        return u890.j(this.a, qh71Var.a) && u890.j(this.b, qh71Var.b) && u890.j(this.c, qh71Var.c) && u890.j(this.d, qh71Var.d) && u890.j(this.e, qh71Var.e);
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        int i = 0;
        String str = this.c;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        this.d.getClass();
        int i2 = (iHashCode - 371711337) * 31;
        dz dzVar = this.e;
        if (dzVar != null) {
            dzVar.getClass();
            i = -371711337;
        }
        return i2 + i;
    }
}
