package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tyx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p811 b;
    public final /* synthetic */ mhx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyx(p811 p811Var, mhx mhxVar, byte b) {
        super(1);
        this.a = b;
        this.b = p811Var;
        this.c = mhxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mhx mhxVar = this.c;
        p811 p811Var = this.b;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                vpg1 vpg1Var = (vpg1) p811Var.a;
                if (vpg1Var.j != 0) {
                    vpg1 vpg1VarA = vpg1.a(vpg1Var, false, !zBooleanValue, 1535);
                    p811Var.a = vpg1VarA;
                    mhxVar.e.f(vpg1VarA);
                }
                break;
            default:
                vpg1 vpg1VarA2 = vpg1.a((vpg1) p811Var.a, ((Boolean) obj).booleanValue(), false, 2046);
                p811Var.a = vpg1VarA2;
                mhxVar.e.f(vpg1VarA2);
                break;
        }
        return rih1Var;
    }
}
