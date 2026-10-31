package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gcf1 {
    public final yj41 a;
    public final dcf1 b;
    public final dcf1 c;
    public final dcf1 d;
    public final dcf1 e;

    public gcf1(yj41 yj41Var, dcf1 dcf1Var, dcf1 dcf1Var2, dcf1 dcf1Var3, dcf1 dcf1Var4) {
        this.a = yj41Var;
        this.b = dcf1Var;
        this.c = dcf1Var2;
        this.d = dcf1Var3;
        this.e = dcf1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof gcf1) {
            gcf1 gcf1Var = (gcf1) obj;
            return u890.j(this.a, gcf1Var.a) && this.b == gcf1Var.b && this.c == gcf1Var.c && this.d == gcf1Var.d && this.e == gcf1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
