package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xxi1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wxi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xxi1(wxi1 wxi1Var, byte b) {
        super(3);
        this.a = b;
        this.b = wxi1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        wxi1 wxi1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                String str = wxi1Var.b;
                x340 x340Var = (b0k) obj2;
                if (str != null) {
                    x340Var.i0(158492163);
                    uwr uwrVar = cbx.a;
                    uwo1.e(str, anm1.N("VenueInfoRowSubtitleTestTag", nim0.a), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
                    x340Var.r(false);
                } else {
                    x340Var.i0(158492162);
                    x340Var.r(false);
                }
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = wxi1Var.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar).k, cbx.a(b0kVar).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
