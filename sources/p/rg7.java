package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rg7 {
    public final zle1 a;
    public t45 b;

    public rg7(zle1 zle1Var) {
        this.a = zle1Var;
    }

    public static void b(String str, t45 t45Var) {
        di40 di40Var;
        if (((t45Var == null || (di40Var = (di40) t45Var.h().get(str)) == null) ? null : (Long) di40Var.c) != null || t45Var == null) {
            return;
        }
        t45Var.g(str);
    }

    public static String c(String str, String str2) {
        return cy30.o("[^a-zA-Z0-9]+", xcg1.i(str, "_", str2), "_");
    }

    public final void a(long j, long j2, String str, String str2) {
        t45 t45Var;
        di40 di40Var;
        String strC = c(str, str2);
        t45 t45Var2 = this.b;
        if (((t45Var2 == null || (di40Var = (di40) t45Var2.h().get(strC)) == null) ? null : (Long) di40Var.c) != null || (t45Var = this.b) == null) {
            return;
        }
        t45.c(t45Var, strC, j, j2, 16);
    }
}
