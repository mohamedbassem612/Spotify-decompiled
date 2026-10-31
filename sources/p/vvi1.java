package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vvi1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tvi1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vvi1(tvi1 tvi1Var, byte b) {
        super(3);
        this.a = b;
        this.b = tvi1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tvi1 tvi1Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                myo1.n(0, tvi1Var.d, (b0k) obj2, (qim0) null);
                break;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = tvi1Var.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(2), 0, (qx8) null, b0kVar, 0, 0, 1714);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = tvi1Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, nim0.a, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 48, 0, 1712);
                break;
        }
        return rih1Var;
    }
}
