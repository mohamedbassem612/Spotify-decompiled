package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xj90 extends ak90 {
    public final int a;
    public final zuc0 b;
    public final wj90 c;

    public /* synthetic */ xj90(int i, zuc0 zuc0Var) {
        this(i, zuc0Var, new uj90(oj90.a));
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
        if (!(obj instanceof xj90)) {
            return false;
        }
        xj90 xj90Var = (xj90) obj;
        return this.a == xj90Var.a && u890.j(this.b, xj90Var.b) && u890.j(this.c, xj90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public xj90(int i, zuc0 zuc0Var, wj90 wj90Var) {
        this.a = i;
        this.b = zuc0Var;
        this.c = wj90Var;
    }
}
