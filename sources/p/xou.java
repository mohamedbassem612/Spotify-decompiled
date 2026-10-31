package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class xou {
    public final String a;
    public final r3l b;
    public final n0u0 c;
    public final fa61 d;
    public final fa61 e;

    public xou(String str, r3l r3lVar, n0u0 n0u0Var, fa61 fa61Var, fa61 fa61Var2) {
        this.a = str;
        this.b = r3lVar;
        this.c = n0u0Var;
        this.d = fa61Var;
        this.e = fa61Var2;
    }

    public static xou a(xou xouVar, String str, r3l r3lVar, n0u0 n0u0Var, fa61 fa61Var, fa61 fa61Var2, int i) {
        if ((i & 1) != 0) {
            str = xouVar.a;
        }
        String str2 = str;
        if ((i & 2) != 0) {
            r3lVar = xouVar.b;
        }
        r3l r3lVar2 = r3lVar;
        if ((i & 4) != 0) {
            n0u0Var = xouVar.c;
        }
        n0u0 n0u0Var2 = n0u0Var;
        if ((i & 8) != 0) {
            fa61Var = xouVar.d;
        }
        fa61 fa61Var3 = fa61Var;
        if ((i & 16) != 0) {
            fa61Var2 = xouVar.e;
        }
        return new xou(str2, r3lVar2, n0u0Var2, fa61Var3, fa61Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xou)) {
            return false;
        }
        xou xouVar = (xou) obj;
        return u890.j(this.a, xouVar.a) && this.b.equals(xouVar.b) && this.c.equals(xouVar.c) && this.d.equals(xouVar.d) && this.e.equals(xouVar.e);
    }

    public final int hashCode() {
        String str = this.a;
        return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + xcg1.g((str == null ? 0 : str.hashCode()) * 31, 31, this.b.a)) * 31)) * 31);
    }
}
