package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ykl implements zkl {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final tv80 e;

    public ykl(int i, int i2, int i3, String str, tv80 tv80Var) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
        this.e = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ykl)) {
            return false;
        }
        ykl yklVar = (ykl) obj;
        return this.a == yklVar.a && this.b == yklVar.b && this.c == yklVar.c && u890.j(this.d, yklVar.d) && u890.j(this.e, yklVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        tv80 tv80Var = this.e;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
