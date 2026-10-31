package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class map {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ map(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final kaz a(boolean z) {
        byte b = this.a;
        chp chpVar = this.b;
        switch (b) {
            case 0:
                nap napVar = (nap) ((d7p) chpVar).c;
                return new kaz(napVar.j, napVar.T, z);
            case 1:
                toj0 toj0Var = (toj0) chpVar.c;
                lzn0 lzn0Var = (lzn0) ((th20) toj0Var.b).z.get();
                c8o.l(lzn0Var);
                vgm vgmVar = (vgm) ((th20) toj0Var.b).D.get();
                c8o.l(vgmVar);
                return new kaz(lzn0Var, vgmVar, z);
            default:
                nb3 nb3Var = (nb3) chpVar.c;
                lzn0 lzn0VarB = ((w530) nb3Var.a).b();
                c8o.l(lzn0VarB);
                vgm vgmVar2 = (vgm) ((w530) nb3Var.a).G.get();
                c8o.l(vgmVar2);
                return new kaz(lzn0VarB, vgmVar2, z);
        }
    }
}
