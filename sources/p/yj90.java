package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yj90 extends ak90 {
    public final int a;
    public final zuc0 b;
    public final rj90 c;
    public final tv80 d;

    public /* synthetic */ yj90(int i, zuc0 zuc0Var, rj90 rj90Var, tv80 tv80Var, int i2) {
        this(i, zuc0Var, (i2 & 4) != 0 ? new rj90(7, false) : rj90Var, (i2 & 8) != 0 ? null : tv80Var);
    }

    @Override // p.ak90
    public final zuc0 a() {
        return this.b;
    }

    @Override // p.ak90
    public final int b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yj90)) {
            return false;
        }
        yj90 yj90Var = (yj90) obj;
        return this.a == yj90Var.a && u890.j(this.b, yj90Var.b) && u890.j(this.c, yj90Var.c) && u890.j(this.d, yj90Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31;
        tv80 tv80Var = this.d;
        return iHashCode + (tv80Var == null ? 0 : tv80Var.hashCode());
    }

    public yj90(int i, zuc0 zuc0Var, rj90 rj90Var, tv80 tv80Var) {
        this.a = i;
        this.b = zuc0Var;
        this.c = rj90Var;
        this.d = tv80Var;
    }
}
