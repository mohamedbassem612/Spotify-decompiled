package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fp3 extends hr3 {
    public final String a;
    public final tv80 b;
    public final String c;
    public final aey d;

    public fp3(String str, tv80 tv80Var, String str2, aey aeyVar) {
        this.a = str;
        this.b = tv80Var;
        this.c = str2;
        this.d = aeyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fp3)) {
            return false;
        }
        fp3 fp3Var = (fp3) obj;
        return u890.j(this.a, fp3Var.a) && this.b.equals(fp3Var.b) && u890.j(this.c, fp3Var.c) && this.d == fp3Var.d;
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return this.d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }
}
