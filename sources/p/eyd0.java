package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class eyd0 implements azd0 {
    public final boolean a;
    public final String b;
    public final boolean c;
    public final tv80 d;

    public eyd0(String str, tv80 tv80Var, boolean z, boolean z2) {
        this.a = z;
        this.b = str;
        this.c = z2;
        this.d = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eyd0)) {
            return false;
        }
        eyd0 eyd0Var = (eyd0) obj;
        return this.a == eyd0Var.a && u890.j(this.b, eyd0Var.b) && this.c == eyd0Var.c && u890.j(this.d, eyd0Var.d);
    }

    public final int hashCode() {
        int iG = xcg1.g(cy30.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        tv80 tv80Var = this.d;
        return iG + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public /* synthetic */ eyd0(boolean z, String str, boolean z2, int i) {
        this(str, (tv80) null, z, (i & 4) != 0 ? false : z2);
    }
}
