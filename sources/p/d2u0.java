package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d2u0 {
    public final kj41 a;
    public final nif1 b;
    public final wma1 c;
    public final wma1 d;

    public d2u0(kj41 kj41Var, nif1 nif1Var, wma1 wma1Var, wma1 wma1Var2) {
        this.a = kj41Var;
        this.b = nif1Var;
        this.c = wma1Var;
        this.d = wma1Var2;
    }

    public final wma1 a() {
        return this.d;
    }

    public final wma1 b() {
        return this.c;
    }

    public final kj41 c() {
        return this.a;
    }

    public final nif1 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2u0)) {
            return false;
        }
        d2u0 d2u0Var = (d2u0) obj;
        return u890.j(this.a, d2u0Var.a) && u890.j(this.b, d2u0Var.b) && u890.j(this.c, d2u0Var.c) && u890.j(this.d, d2u0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }
}
