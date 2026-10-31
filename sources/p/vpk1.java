package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vpk1 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hqk1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpk1(hqk1 hqk1Var, byte b) {
        super(3);
        this.a = b;
        this.b = hqk1Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hqk1 hqk1Var = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                String str = hqk1Var.c;
                uwr uwrVar = cbx.a;
                uwo1.e(str, (qim0) null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2034);
                break;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                String str2 = hqk1Var.b;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str2, (qim0) null, cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
                break;
        }
        return rih1Var;
    }
}
