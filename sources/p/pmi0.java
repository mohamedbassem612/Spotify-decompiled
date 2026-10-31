package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pmi0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rmi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pmi0(rmi0 rmi0Var, byte b) {
        super(1);
        this.a = b;
        this.b = rmi0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rmi0 rmi0Var = this.b;
        switch (b) {
            case 0:
                z2p z2pVar = (z2p) rmi0Var.a.a.b;
                i8h1 i8h1Var = (i8h1) ((smi0) z2pVar.b).c.get();
                c8o.l(i8h1Var);
                j2e0 j2e0Var = new j2e0(i8h1Var, new ksk0((byte) 13), (byte) 24);
                smi0 smi0Var = (smi0) z2pVar.b;
                lzn0 lzn0Var = (lzn0) smi0Var.d.get();
                c8o.l(lzn0Var);
                kt91 kt91Var = (kt91) smi0Var.e.get();
                c8o.l(kt91Var);
                rjn0 rjn0Var = (rjn0) smi0Var.f.get();
                c8o.l(rjn0Var);
                return new tpk(j2e0Var, lzn0Var, kt91Var, rjn0Var, (byte) 1);
            default:
                return new omi0(rmi0Var.c.a, ffk1.a);
        }
    }
}
