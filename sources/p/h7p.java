package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h7p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ h7p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final jqm0 a(d0r d0rVar) {
        byte b = this.a;
        thq thqVar = this.b;
        switch (b) {
            case 0:
                x2p x2pVar = (x2p) ((ewo) thqVar).c;
                xfx xfxVar = (xfx) ((mak) x2pVar.c).j.get();
                c8o.l(xfxVar);
                lzn0 lzn0Var = (lzn0) ((mak) x2pVar.c).c.get();
                c8o.l(lzn0Var);
                return new jqm0(xfxVar, lzn0Var, new y1x0((byte) 29), d0rVar);
            default:
                teq teqVar = thqVar.c;
                return new jqm0((xfx) teqVar.q1.get(), (lzn0) teqVar.i.get(), new y1x0((byte) 29), d0rVar);
        }
    }
}
