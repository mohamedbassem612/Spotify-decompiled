package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dno extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ efm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dno(efm efmVar, byte b) {
        super(1);
        this.a = b;
        this.b = efmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        efm efmVar = this.b;
        switch (b) {
            case 0:
                cno cnoVar = (cno) obj;
                d0r d0rVar = efmVar.b;
                String str = cnoVar.a;
                if (!cnoVar.d) {
                    return new m441(new rv8(d3p1.F(d0rVar, mcz0.a, str), (lnm) null, (byte) 2));
                }
                o3r o3rVar = mcz0.a;
                return new huz(j1r.a, (byte) 10);
            default:
                wfx wfxVar = ((xfx) efmVar.d).c;
                return new atr(wfxVar.b, wfxVar.a, (m980) efmVar.e);
        }
    }
}
