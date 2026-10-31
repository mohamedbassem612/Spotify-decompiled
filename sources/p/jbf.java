package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
@o661
public final class jbf {
    public static final hbf Companion = new hbf();
    public final String a;
    public final ykf b;
    public final String c;
    public final String d;
    public final wlh1 e;

    public /* synthetic */ jbf(int i, String str, ykf ykfVar, String str2, String str3, wlh1 wlh1Var) {
        if (7 != (i & 7)) {
            o6p1.t(i, 7, fbf.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = ykfVar;
        this.c = str2;
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = wlh1Var;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jbf)) {
            return false;
        }
        jbf jbfVar = (jbf) obj;
        return u890.j(this.a, jbfVar.a) && u890.j(this.b, jbfVar.b) && u890.j(this.c, jbfVar.c) && u890.j(this.d, jbfVar.d) && u890.j(this.e, jbfVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
        String str = this.d;
        int iHashCode = (iD + (str == null ? 0 : str.hashCode())) * 31;
        wlh1 wlh1Var = this.e;
        return iHashCode + (wlh1Var != null ? wlh1Var.a.hashCode() : 0);
    }

    public jbf(String str, ykf ykfVar, String str2, String str3, wlh1 wlh1Var) {
        this.a = str;
        this.b = ykfVar;
        this.c = str2;
        this.d = str3;
        this.e = wlh1Var;
    }
}
