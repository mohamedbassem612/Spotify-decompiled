package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
@o661
public final class tpt {
    public static final spt Companion = new spt();
    public final long a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final euq0 f;
    public final g6c g;
    public final g6c h;
    public final g6c i;
    public final int j;

    public /* synthetic */ tpt(int i, long j, String str, String str2, String str3, String str4, euq0 euq0Var, g6c g6cVar, g6c g6cVar2, g6c g6cVar3) {
        if (13 != (i & 13)) {
            o6p1.t(i, 13, rpt.a.getDescriptor());
            throw null;
        }
        this.a = j;
        if ((i & 2) == 0) {
            this.b = null;
            str = null;
        } else {
            this.b = str;
        }
        this.c = str2;
        this.d = str3;
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = euq0Var;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = g6cVar;
        }
        if ((i & 128) == 0) {
            this.h = null;
        } else {
            this.h = g6cVar2;
        }
        if ((i & 256) == 0) {
            this.i = null;
        } else {
            this.i = g6cVar3;
        }
        this.j = bwp0.e(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tpt)) {
            return false;
        }
        tpt tptVar = (tpt) obj;
        return this.a == tptVar.a && u890.j(this.b, tptVar.b) && u890.j(this.c, tptVar.c) && u890.j(this.d, tptVar.d) && u890.j(this.e, tptVar.e) && u890.j(this.f, tptVar.f) && u890.j(this.g, tptVar.g) && u890.j(this.h, tptVar.h) && u890.j(this.i, tptVar.i);
    }

    public final int hashCode() {
        int iHashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int iD = cy30.d(cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c), 31, this.d);
        String str2 = this.e;
        int iHashCode2 = (iD + (str2 == null ? 0 : str2.hashCode())) * 31;
        euq0 euq0Var = this.f;
        int iHashCode3 = (iHashCode2 + (euq0Var == null ? 0 : euq0Var.hashCode())) * 31;
        g6c g6cVar = this.g;
        int iHashCode4 = (iHashCode3 + (g6cVar == null ? 0 : g6cVar.a.hashCode())) * 31;
        g6c g6cVar2 = this.h;
        int iHashCode5 = (iHashCode4 + (g6cVar2 == null ? 0 : g6cVar2.a.hashCode())) * 31;
        g6c g6cVar3 = this.i;
        return iHashCode5 + (g6cVar3 != null ? g6cVar3.a.hashCode() : 0);
    }

    public tpt(long j, String str, String str2, String str3, euq0 euq0Var, g6c g6cVar, g6c g6cVar2) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = null;
        this.f = euq0Var;
        this.g = g6cVar;
        this.h = g6cVar2;
        this.i = null;
        this.j = bwp0.e(str);
    }
}
