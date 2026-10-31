package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class y8f1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final rwm e;
    public final Integer f;

    public y8f1(String str, String str2, String str3, String str4, rwm rwmVar, Integer num) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = rwmVar;
        this.f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y8f1)) {
            return false;
        }
        y8f1 y8f1Var = (y8f1) obj;
        return u890.j(this.a, y8f1Var.a) && this.b.equals(y8f1Var.b) && this.c.equals(y8f1Var.c) && this.d.equals(y8f1Var.d) && this.e == y8f1Var.e && u890.j(this.f, y8f1Var.f);
    }

    public final int hashCode() {
        int iD = cy30.d(cy30.d(cy30.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
        rwm rwmVar = this.e;
        int iHashCode = (iD + (rwmVar == null ? 0 : rwmVar.hashCode())) * 31;
        Integer num = this.f;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }
}
