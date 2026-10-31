package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cr00 implements er00 {
    public final k4m a;
    public final boolean b;
    public final ar00 c;
    public final String d;
    public final r4p1 e;

    public cr00(k4m k4mVar, boolean z, ar00 ar00Var, String str, r4p1 r4p1Var) {
        this.a = k4mVar;
        this.b = z;
        this.c = ar00Var;
        this.d = str;
        this.e = r4p1Var;
    }

    public final boolean a() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cr00)) {
            return false;
        }
        cr00 cr00Var = (cr00) obj;
        return this.a == cr00Var.a && this.b == cr00Var.b && u890.j(this.c, cr00Var.c) && u890.j(this.d, cr00Var.d) && u890.j(this.e, cr00Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + cy30.d((this.c.hashCode() + xcg1.g(p3d1.g(this.a, Boolean.hashCode(false) * 31, 31), 31, this.b)) * 31, 31, this.d);
    }

    public /* synthetic */ cr00(boolean z, ar00 ar00Var, String str, r4p1 r4p1Var) {
        this(k4m.d, z, ar00Var, str, r4p1Var);
    }
}
