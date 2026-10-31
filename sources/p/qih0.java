package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qih0 implements oih0 {
    public final oih0 a;
    public final g510 b;
    public final r8l c;

    public qih0(oih0 oih0Var, g510 g510Var, r8l r8lVar) {
        this.a = oih0Var;
        this.b = g510Var;
        this.c = r8lVar;
    }

    public final Object a(nih0 nih0Var, onm onmVar) {
        String str = nih0Var.a;
        String str2 = nih0Var.b;
        String str3 = nih0Var.c;
        if (str3 != null && str3.length() != 0) {
            if (str == null) {
                str = str2;
            }
            m210 m210VarA = this.c.a(str);
            g510 g510Var = this.b;
            g510Var.r(m210VarA, g510Var.h.u(), (w7h1) null);
        }
        return this.a.a(nih0Var, onmVar);
    }
}
