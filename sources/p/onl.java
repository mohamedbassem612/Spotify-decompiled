package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class onl {
    public final vnb0 a;
    public final int b;
    public final ml3 c;
    public final ol3 d;

    public /* synthetic */ onl(vnb0 vnb0Var, int i, ml3 ml3Var, ol3 ol3Var, int i2) {
        this(vnb0Var, i, (i2 & 4) != 0 ? null : ml3Var, (i2 & 8) != 0 ? null : ol3Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof onl)) {
            return false;
        }
        onl onlVar = (onl) obj;
        return this.a == onlVar.a && this.b == onlVar.b && u890.j(this.c, onlVar.c) && u890.j(this.d, onlVar.d);
    }

    public final int hashCode() {
        int iF = kaa0.f(this.b, this.a.hashCode() * 31, 31);
        ml3 ml3Var = this.c;
        int iHashCode = (iF + (ml3Var == null ? 0 : Integer.hashCode(ml3Var.a))) * 31;
        ol3 ol3Var = this.d;
        return iHashCode + (ol3Var != null ? Integer.hashCode(ol3Var.a) : 0);
    }

    public final String toString() {
        return "ContainerSelector(type=" + this.a + ", numChildren=" + this.b + ", horizontalAlignment=" + this.c + ", verticalAlignment=" + this.d + ')';
    }

    public onl(vnb0 vnb0Var, int i, ml3 ml3Var, ol3 ol3Var) {
        this.a = vnb0Var;
        this.b = i;
        this.c = ml3Var;
        this.d = ol3Var;
    }
}
