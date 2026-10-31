package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z6j1 {
    public final y6j1 a;
    public final mq70 b;
    public final ko7 c;
    public final l8g1 d;

    public z6j1(y6j1 y6j1Var, mq70 mq70Var, ko7 ko7Var, l8g1 l8g1Var) {
        this.a = y6j1Var;
        this.b = mq70Var;
        this.c = ko7Var;
        this.d = l8g1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z6j1)) {
            return false;
        }
        z6j1 z6j1Var = (z6j1) obj;
        return this.a.equals(z6j1Var.a) && this.b.equals(z6j1Var.b) && u890.j(this.c, z6j1Var.c) && u890.j(this.d, z6j1Var.d);
    }

    public final int hashCode() {
        int iHashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        ko7 ko7Var = this.c;
        int iHashCode2 = (iHashCode + (ko7Var == null ? 0 : ko7Var.hashCode())) * 31;
        l8g1 l8g1Var = this.d;
        return iHashCode2 + (l8g1Var != null ? l8g1Var.hashCode() : 0);
    }
}
