package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ej6 {
    public final yj41 a;
    public final yj41 b;
    public final yj41 c;

    public ej6(yj41 yj41Var, yj41 yj41Var2, yj41 yj41Var3) {
        this.a = yj41Var;
        this.b = yj41Var2;
        this.c = yj41Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ej6)) {
            return false;
        }
        ej6 ej6Var = (ej6) obj;
        return u890.j(this.a, ej6Var.a) && u890.j(this.b, ej6Var.b) && u890.j(this.c, ej6Var.c);
    }

    public final int hashCode() {
        yj41 yj41Var = this.a;
        int iHashCode = (yj41Var == null ? 0 : yj41Var.hashCode()) * 31;
        yj41 yj41Var2 = this.b;
        int iHashCode2 = (iHashCode + (yj41Var2 == null ? 0 : yj41Var2.hashCode())) * 31;
        yj41 yj41Var3 = this.c;
        return iHashCode2 + (yj41Var3 != null ? yj41Var3.hashCode() : 0);
    }
}
