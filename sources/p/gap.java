package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gap {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ gap(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final l430 a(d0r d0rVar) {
        byte b = this.a;
        d7p d7pVar = this.b;
        switch (b) {
            case 0:
                nap napVar = (nap) d7pVar.c;
                return new l430(d0rVar, napVar.b, napVar.c, napVar.d, napVar.e, new rjn(napVar.f, (byte) 28));
            case 1:
                tnm tnmVar = (tnm) ((lbp) d7pVar).c;
                z8o0 z8o0Var = (z8o0) ((uqy) tnmVar.b).a.get();
                c8o.l(z8o0Var);
                gu8 gu8Var = (gu8) ((uqy) tnmVar.b).z.get();
                c8o.l(gu8Var);
                kt91 kt91Var = (kt91) ((uqy) tnmVar.b).A.get();
                c8o.l(kt91Var);
                n6r0 n6r0Var = tnmVar.n().a;
                c8o.m(n6r0Var);
                eu8 eu8Var = (eu8) ((uqy) tnmVar.b).y.get();
                c8o.l(eu8Var);
                return new l430(d0rVar, z8o0Var, gu8Var, kt91Var, n6r0Var, new rjn(eu8Var, (byte) 28));
            default:
                f9p f9pVar = (f9p) ((lbp) d7pVar).c;
                z8o0 z8o0Var2 = (z8o0) ((e7z) f9pVar.X).a.get();
                c8o.l(z8o0Var2);
                gu8 gu8Var2 = (gu8) ((e7z) f9pVar.X).k0.get();
                c8o.l(gu8Var2);
                kt91 kt91Var2 = (kt91) ((e7z) f9pVar.X).d0.get();
                c8o.l(kt91Var2);
                n6r0 n6r0Var2 = f9pVar.o().a;
                c8o.m(n6r0Var2);
                eu8 eu8Var2 = (eu8) ((e7z) f9pVar.X).l0.get();
                c8o.l(eu8Var2);
                return new l430(d0rVar, z8o0Var2, gu8Var2, kt91Var2, n6r0Var2, new rjn(eu8Var2, (byte) 28));
        }
    }
}
