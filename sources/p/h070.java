package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h070 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ res b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h070(res resVar, byte b) {
        super(1);
        this.a = b;
        this.b = resVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        res resVar = this.b;
        switch (b) {
            case 0:
                r070 r070Var = (r070) obj;
                if (r070Var.c) {
                    ao0.a((ao0) resVar.d, co0.f1, r070Var.a.a.a, (Long) null, (String) null, (String) null, 124);
                }
                break;
            default:
                cas casVar = (a7m0) obj;
                casVar.a = g070.c;
                casVar.h = new h070(resVar, (byte) 0);
                break;
        }
        return rih1Var;
    }
}
