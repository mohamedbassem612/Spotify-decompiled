package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class fdo implements gdo {
    public final String a;
    public final String b;
    public final ki0 c;
    public final i6h1 d;

    public fdo(String str, String str2, ki0 ki0Var, i6h1 i6h1Var) {
        this.a = str;
        this.b = str2;
        this.c = ki0Var;
        this.d = i6h1Var;
    }

    @Override // p.gdo
    public final i6h1 a() {
        return this.d;
    }

    @Override // p.gdo
    public final ki0 b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fdo)) {
            return false;
        }
        fdo fdoVar = (fdo) obj;
        return this.a.equals(fdoVar.a) && u890.j(this.b, fdoVar.b) && u890.j(this.c, fdoVar.c) && this.d.equals(fdoVar.d);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        ki0 ki0Var = this.c;
        return this.d.hashCode() + ((iHashCode2 + (ki0Var != null ? ki0Var.hashCode() : 0)) * 31);
    }
}
