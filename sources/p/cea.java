package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class cea {
    public static final bea Companion = new bea();
    public final String a;
    public final q9c1 b;
    public final q9c1 c;
    public final q9c1 d;
    public final String e;
    public final ydc f;
    public final String g;
    public final String h;
    public final dc71 i;

    public /* synthetic */ cea(int i, String str, q9c1 q9c1Var, q9c1 q9c1Var2, q9c1 q9c1Var3, String str2, ydc ydcVar, String str3, String str4, dc71 dc71Var) {
        if (130 != (i & 130)) {
            o6p1.t(i, 130, aea.a.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = q9c1Var;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = q9c1Var2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = q9c1Var3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str2;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = ydcVar;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
        this.h = str4;
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = dc71Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cea)) {
            return false;
        }
        cea ceaVar = (cea) obj;
        return u890.j(this.a, ceaVar.a) && u890.j(this.b, ceaVar.b) && u890.j(this.c, ceaVar.c) && u890.j(this.d, ceaVar.d) && u890.j(this.e, ceaVar.e) && u890.j(this.f, ceaVar.f) && u890.j(this.g, ceaVar.g) && u890.j(this.h, ceaVar.h) && u890.j(this.i, ceaVar.i);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
        q9c1 q9c1Var = this.c;
        int iHashCode2 = (iHashCode + (q9c1Var == null ? 0 : q9c1Var.hashCode())) * 31;
        q9c1 q9c1Var2 = this.d;
        int iHashCode3 = (iHashCode2 + (q9c1Var2 == null ? 0 : q9c1Var2.hashCode())) * 31;
        String str2 = this.e;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ydc ydcVar = this.f;
        int iHashCode5 = (iHashCode4 + (ydcVar == null ? 0 : ydcVar.hashCode())) * 31;
        String str3 = this.g;
        int iD = cy30.d((iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.h);
        dc71 dc71Var = this.i;
        return iD + (dc71Var != null ? dc71Var.hashCode() : 0);
    }
}
