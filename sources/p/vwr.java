package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vwr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vwr(tm tmVar, byte b) {
        super(1);
        this.a = b;
        this.b = tmVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                lls0 lls0Var = (lls0) tmVar.d;
                return d3p1.F(cwl1.C((q7r0) lls0Var.c), ppy.a, new opy(((zdy) obj).a, lls0Var.b));
            default:
                ((qtr) obj).b(new k1((ft30) tmVar.c, tmVar, (lnm) null, (byte) 9));
                return rih1.a;
        }
    }
}
