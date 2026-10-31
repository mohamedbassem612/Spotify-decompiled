package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class te6 {
    public final yj41 a;
    public final yj41 b;

    public te6(yj41 yj41Var, yj41 yj41Var2) {
        this.a = yj41Var;
        this.b = yj41Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof te6)) {
            return false;
        }
        te6 te6Var = (te6) obj;
        return u890.j(this.a, te6Var.a) && u890.j(this.b, te6Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
