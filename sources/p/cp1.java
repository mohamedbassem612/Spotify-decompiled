package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cp1 implements cq1 {
    public final boolean a;
    public final tv80 b;
    public final String c;

    public cp1(int i, String str, tv80 tv80Var) {
        boolean z = (i & 1) == 0;
        tv80Var = (i & 2) != 0 ? null : tv80Var;
        str = (i & 4) != 0 ? null : str;
        this.a = z;
        this.b = tv80Var;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cp1)) {
            return false;
        }
        cp1 cp1Var = (cp1) obj;
        return this.a == cp1Var.a && u890.j(this.b, cp1Var.b) && u890.j(this.c, cp1Var.c);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tv80 tv80Var = this.b;
        int iHashCode2 = (iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31;
        String str = this.c;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }
}
