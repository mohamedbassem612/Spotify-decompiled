package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lzf1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kox0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lzf1(kox0 kox0Var, byte b) {
        super(1);
        this.a = b;
        this.b = kox0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kox0 kox0Var = this.b;
        switch (b) {
            case 0:
                kzf1 kzf1Var = (kzf1) obj;
                d0r d0rVar = kox0Var.b;
                String str = kzf1Var.a;
                if (!kzf1Var.e) {
                    return new m441(new rv8(d3p1.F(d0rVar, mcz0.a, str), null, (byte) 2));
                }
                o3r o3rVar = mcz0.a;
                return new huz(j1r.a, (byte) 10);
            default:
                wfx wfxVar = ((xfx) kox0Var.d).c;
                return new fws(wfxVar.b, wfxVar.a);
        }
    }
}
