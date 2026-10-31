package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hqj extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ d4j1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hqj(d4j1 d4j1Var, byte b) {
        super(3);
        this.a = b;
        this.b = d4j1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d4j1 d4j1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = d4j1Var.b;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2034);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(tro1.B(d4j1Var.a, b0kVar2, 0), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2046);
                break;
        }
        return rih1Var;
    }
}
