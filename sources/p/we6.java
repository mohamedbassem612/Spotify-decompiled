package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class we6 {
    public final List a;
    public final yj41 b;
    public final yj41 c;
    public final yj41 d;
    public final yj41 e;

    public we6(List list, yj41 yj41Var, yj41 yj41Var2, yj41 yj41Var3, yj41 yj41Var4) {
        this.a = list;
        this.b = yj41Var;
        this.c = yj41Var2;
        this.d = yj41Var3;
        this.e = yj41Var4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we6)) {
            return false;
        }
        we6 we6Var = (we6) obj;
        return u890.j(this.a, we6Var.a) && u890.j(this.b, we6Var.b) && u890.j(this.c, we6Var.c) && u890.j(this.d, we6Var.d) && u890.j(this.e, we6Var.e);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        yj41 yj41Var = this.e;
        return iHashCode + (yj41Var == null ? 0 : yj41Var.hashCode());
    }
}
