package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vl91 {
    public final ip91 a;
    public final jo91 b;
    public final co91 c;
    public final jp91 d;
    public final tp91 e;
    public final u3q f;

    public vl91(ip91 ip91Var, jo91 jo91Var, co91 co91Var, jp91 jp91Var, tp91 tp91Var, u3q u3qVar) {
        this.a = ip91Var;
        this.b = jo91Var;
        this.c = co91Var;
        this.d = jp91Var;
        this.e = tp91Var;
        this.f = u3qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vl91)) {
            return false;
        }
        vl91 vl91Var = (vl91) obj;
        return u890.j(this.a, vl91Var.a) && u890.j(this.b, vl91Var.b) && u890.j(this.c, vl91Var.c) && u890.j(this.d, vl91Var.d) && u890.j(this.e, vl91Var.e) && u890.j(this.f, vl91Var.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }
}
