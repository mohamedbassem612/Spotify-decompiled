package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class agn0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ i091 b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ agn0(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        i091 i091Var = (i091) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                agn0 agn0Var = new agn0(i, (lnm) obj3, (byte) 0);
                agn0Var.b = i091Var;
                agn0Var.c = zBooleanValue;
                return agn0Var.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                agn0 agn0Var2 = new agn0(i, (lnm) obj3, (byte) 1);
                agn0Var2.b = i091Var;
                agn0Var2.c = zBooleanValue2;
                return agn0Var2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                agn0 agn0Var3 = new agn0(i, (lnm) obj3, (byte) 2);
                agn0Var3.b = i091Var;
                agn0Var3.c = zBooleanValue3;
                return agn0Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                i091 i091Var = this.b;
                boolean z = this.c;
                hm5.M(obj);
                return new wfn0(i091Var != null ? i091Var.g : true, (i091Var != null ? i091Var.h : null) instanceof k091, z);
            case 1:
                i091 i091Var2 = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                return i091.a(i091Var2, 0L, 0.0f, z2, 447);
            default:
                i091 i091Var3 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                return i091.a(i091Var3, 0L, 0.0f, z3, 447);
        }
    }
}
