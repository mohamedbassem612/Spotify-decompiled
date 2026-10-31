package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r88 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o88 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r88(o88 o88Var, byte b) {
        super(3);
        this.a = b;
        this.b = o88Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nim0 nim0Var = nim0.a;
        o88 o88Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = o88Var.b.a;
                uwr uwrVar = cbx.a;
                uwo1.e(str, uyn1.B(anm1.N("BenefitsTitle", nim0Var), 24.0f, 0.0f, 24.0f, 16.0f, 2), cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2032);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = o88Var.c.a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, uyn1.B(anm1.N("ExplanationTitle", nim0Var), 24.0f, 0.0f, 24.0f, 8.0f, 2), cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2032);
                break;
        }
        return rih1Var;
    }
}
