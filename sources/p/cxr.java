package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cxr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pt b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cxr(pt ptVar, byte b) {
        super(1);
        this.a = b;
        this.b = ptVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        pt ptVar = this.b;
        switch (b) {
            case 0:
                lls0 lls0Var = (lls0) ptVar.h;
                return d3p1.F(cwl1.C((q7r0) lls0Var.c), ppy.a, new opy(((lpy) obj).a, lls0Var.b));
            default:
                ((qtr) obj).b(new lu((ft30) ptVar.d, null, (byte) 24));
                return rih1.a;
        }
    }
}
