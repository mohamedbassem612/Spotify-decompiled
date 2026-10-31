package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rkl {
    public final int a;
    public final int b;
    public final int c;
    public final String d;
    public final tv80 e;

    public rkl(int i, int i2, int i3, String str, tv80 tv80Var) {
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
        if (!(obj instanceof rkl)) {
            return false;
        }
        rkl rklVar = (rkl) obj;
        return this.a == rklVar.a && this.b == rklVar.b && this.c == rklVar.c && u890.j(this.d, rklVar.d) && u890.j(this.e, rklVar.e);
    }

    public final int hashCode() {
        int iD = cy30.d(kaa0.f(this.c, kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31, this.d);
        tv80 tv80Var = this.e;
        return iD + (tv80Var == null ? 0 : tv80Var.hashCode());
    }
}
