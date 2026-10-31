package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zj90 extends ak90 {
    public final int a;
    public final zuc0 b;
    public final rj90 c;

    public /* synthetic */ zj90(int i, zuc0 zuc0Var) {
        this(i, zuc0Var, new rj90(7, false));
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
        if (!(obj instanceof zj90)) {
            return false;
        }
        zj90 zj90Var = (zj90) obj;
        return this.a == zj90Var.a && u890.j(this.b, zj90Var.b) && u890.j(this.c, zj90Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public zj90(int i, zuc0 zuc0Var, rj90 rj90Var) {
        this.a = i;
        this.b = zuc0Var;
        this.c = rj90Var;
    }
}
