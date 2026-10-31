package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zz3 implements nti0 {
    public final fra a;
    public final fra b;
    public final int c;

    public zz3(fra fraVar, fra fraVar2, int i) {
        this.a = fraVar;
        this.b = fraVar2;
        this.c = i;
    }

    @Override // p.nti0
    public final int a(ur80 ur80Var, long j, int i) {
        int iC = this.b.c(0, ur80Var.b());
        return ur80Var.b + iC + (-this.a.c(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zz3)) {
            return false;
        }
        zz3 zz3Var = (zz3) obj;
        return this.a.equals(zz3Var.a) && this.b.equals(zz3Var.b) && this.c == zz3Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Float.hashCode(this.a.a) * 31, 31, this.b.a);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return l1d.o(sb, this.c, ')');
    }
}
