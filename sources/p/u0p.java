package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class u0p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ u0p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final ctu0 a(String str) {
        byte b = this.a;
        fwo fwoVar = this.b;
        switch (b) {
            case 0:
                x0p x0pVar = (x0p) fwoVar.c;
                xrc0 xrc0VarC = x0pVar.b.c();
                c8o.l(xrc0VarC);
                z6k0 z6k0Var = (z6k0) x0pVar.b.k.get();
                c8o.l(z6k0Var);
                mnk0 mnk0Var = (mnk0) x0pVar.b.y.get();
                c8o.l(mnk0Var);
                return new ctu0(xrc0VarC, z6k0Var, mnk0Var, str);
            case 1:
                yxo yxoVar = (yxo) fwoVar.c;
                xrc0 xrc0VarC2 = ((ae7) yxoVar.d).c();
                c8o.l(xrc0VarC2);
                z6k0 z6k0Var2 = (z6k0) ((ae7) yxoVar.d).k.get();
                c8o.l(z6k0Var2);
                mnk0 mnk0Var2 = (mnk0) ((ae7) yxoVar.d).t.get();
                c8o.l(mnk0Var2);
                return new ctu0(xrc0VarC2, z6k0Var2, mnk0Var2, str);
            default:
                voa voaVar = (voa) fwoVar.c;
                xrc0 xrc0VarC3 = ((oe7) voaVar.b).c();
                c8o.l(xrc0VarC3);
                z6k0 z6k0Var3 = (z6k0) ((oe7) voaVar.b).k.get();
                c8o.l(z6k0Var3);
                mnk0 mnk0Var3 = (mnk0) ((oe7) voaVar.b).t.get();
                c8o.l(mnk0Var3);
                return new ctu0(xrc0VarC3, z6k0Var3, mnk0Var3, str);
        }
    }
}
