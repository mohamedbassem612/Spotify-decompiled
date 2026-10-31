package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class odi0 {
    public final String a;
    public final x360 b;
    public final String c;
    public final String d;
    public final String e;
    public final rdi0 f;
    public final String g;
    public final idi0 h;
    public final wcm i;
    public final boolean j;

    public odi0(String str, x360 x360Var, String str2, String str3, String str4, rdi0 rdi0Var, String str5, idi0 idi0Var, wcm wcmVar, boolean z) {
        this.a = str;
        this.b = x360Var;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = rdi0Var;
        this.g = str5;
        this.h = idi0Var;
        this.i = wcmVar;
        this.j = z;
    }

    public final rdi0 a() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof odi0)) {
            return false;
        }
        odi0 odi0Var = (odi0) obj;
        return this.a.equals(odi0Var.a) && u890.j(this.b, odi0Var.b) && this.c.equals(odi0Var.c) && this.d.equals(odi0Var.d) && this.e.equals(odi0Var.e) && u890.j(this.f, odi0Var.f) && this.g.equals(odi0Var.g) && u890.j(this.h, odi0Var.h) && this.i.equals(odi0Var.i) && this.j == odi0Var.j;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        x360 x360Var = this.b;
        int iD = cy30.d(cy30.d(cy30.d((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.c), 31, this.d), 31, this.e);
        rdi0 rdi0Var = this.f;
        int iD2 = cy30.d((iD + (rdi0Var == null ? 0 : rdi0Var.hashCode())) * 31, 31, this.g);
        idi0 idi0Var = this.h;
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + ((iD2 + (idi0Var != null ? idi0Var.hashCode() : 0)) * 31)) * 31);
    }
}
