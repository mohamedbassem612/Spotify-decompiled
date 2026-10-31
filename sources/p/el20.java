package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class el20 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pbq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ el20(pbq pbqVar, byte b) {
        super(3);
        this.a = b;
        this.b = pbqVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pbq pbqVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                otw.c((lzr) ((idd1) pbqVar.c).getValue(), new rk20(((il20) pbqVar.h).a), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
            case 1:
                ((Number) obj3).intValue();
                otw.c((ams) pbqVar.i, new ils(((il20) pbqVar.h).a), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
            default:
                ((Number) obj3).intValue();
                rqr rqrVar = (rqr) ((idd1) pbqVar.d).getValue();
                il20 il20Var = (il20) pbqVar.h;
                otw.c(rqrVar, new hqn(il20Var.a, il20Var.d), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                break;
        }
        return rih1Var;
    }
}
