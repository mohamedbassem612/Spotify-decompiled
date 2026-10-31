package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u7f1 {
    public final s7f1 a;
    public final yj41 b;
    public final s7f1 c;
    public final s7f1 d;
    public final s7f1 e;

    public u7f1(s7f1 s7f1Var, yj41 yj41Var, s7f1 s7f1Var2, s7f1 s7f1Var3, s7f1 s7f1Var4) {
        this.a = s7f1Var;
        this.b = yj41Var;
        this.c = s7f1Var2;
        this.d = s7f1Var3;
        this.e = s7f1Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof u7f1) {
            u7f1 u7f1Var = (u7f1) obj;
            return this.a == u7f1Var.a && u890.j(this.b, u7f1Var.b) && this.c == u7f1Var.c && this.d == u7f1Var.d && this.e == u7f1Var.e;
        }
        return false;
    }

    public final int hashCode() {
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31);
    }
}
