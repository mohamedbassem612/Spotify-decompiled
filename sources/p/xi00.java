package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xi00 extends li00 {
    public final sh51 a;
    public final int b;
    public final ArrayList c;
    public final String d;
    public final ni00 e;

    public xi00(sh51 sh51Var, int i, ArrayList arrayList, String str, ni00 ni00Var) {
        this.a = sh51Var;
        this.b = i;
        this.c = arrayList;
        this.d = str;
        this.e = ni00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xi00)) {
            return false;
        }
        xi00 xi00Var = (xi00) obj;
        return u890.j(this.a, xi00Var.a) && this.b == xi00Var.b && this.c.equals(xi00Var.c) && u890.j(this.d, xi00Var.d) && u890.j(this.e, xi00Var.e);
    }

    public final int hashCode() {
        sh51 sh51Var = this.a;
        int iF = p3d1.f(this.c, ab80.k(this.b, (sh51Var == null ? 0 : sh51Var.hashCode()) * 31, 31), 31);
        String str = this.d;
        int iHashCode = (iF + (str == null ? 0 : str.hashCode())) * 31;
        ni00 ni00Var = this.e;
        return iHashCode + (ni00Var != null ? ni00Var.hashCode() : 0);
    }
}
