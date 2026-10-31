package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pae1 {
    public final zma1 a;
    public final zma1 b;
    public final zma1 c;
    public final zma1 d;

    public pae1(zma1 zma1Var, zma1 zma1Var2, zma1 zma1Var3, zma1 zma1Var4) {
        this.a = zma1Var;
        this.b = zma1Var2;
        this.c = zma1Var3;
        this.d = zma1Var4;
    }

    public final zma1 a() {
        return this.b;
    }

    public final zma1 b() {
        return this.c;
    }

    public final zma1 c() {
        return this.d;
    }

    public final zma1 d() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof pae1)) {
            return false;
        }
        pae1 pae1Var = (pae1) obj;
        return u890.j(this.a, pae1Var.a) && u890.j(this.b, pae1Var.b) && u890.j(this.c, pae1Var.c) && u890.j(this.d, pae1Var.d);
    }

    public final int hashCode() {
        zma1 zma1Var = this.a;
        int iHashCode = (zma1Var != null ? zma1Var.hashCode() : 0) * 31;
        zma1 zma1Var2 = this.b;
        int iHashCode2 = (iHashCode + (zma1Var2 != null ? zma1Var2.hashCode() : 0)) * 31;
        zma1 zma1Var3 = this.c;
        int iHashCode3 = (iHashCode2 + (zma1Var3 != null ? zma1Var3.hashCode() : 0)) * 31;
        zma1 zma1Var4 = this.d;
        return iHashCode3 + (zma1Var4 != null ? zma1Var4.hashCode() : 0);
    }

    public /* synthetic */ pae1(zma1 zma1Var, zma1 zma1Var2, int i) {
        this(zma1Var, null, null, (i & 8) != 0 ? null : zma1Var2);
    }
}
