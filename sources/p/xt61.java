package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xt61 {
    public final hux a;
    public final Integer b;
    public final Integer c;
    public final cu61 d;
    public final c380 e;

    public xt61(hux huxVar, Integer num, Integer num2, cu61 cu61Var, c380 c380Var, int i) {
        num = (i & 4) != 0 ? null : num;
        num2 = (i & 16) != 0 ? null : num2;
        cu61Var = (i & 128) != 0 ? null : cu61Var;
        this.a = huxVar;
        this.b = num;
        this.c = num2;
        this.d = cu61Var;
        this.e = c380Var;
        ero1.r(new Object[]{num, null}, w661.W0);
        ero1.r(new Object[]{num2, null, null}, w661.X0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt61)) {
            return false;
        }
        xt61 xt61Var = (xt61) obj;
        return u890.j(this.a, xt61Var.a) && u890.j(this.b, xt61Var.b) && u890.j(this.c, xt61Var.c) && u890.j(this.d, xt61Var.d) && u890.j(this.e, xt61Var.e);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 961;
        Integer num2 = this.c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 29791;
        cu61 cu61Var = this.d;
        return this.e.hashCode() + ((iHashCode3 + (cu61Var != null ? cu61Var.hashCode() : 0)) * 31);
    }
}
