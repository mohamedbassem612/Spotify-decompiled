package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k8z extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ mmr0 b;
    public /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8z(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        mmr0 mmr0Var = (mmr0) obj;
        Boolean bool = (Boolean) obj2;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                k8z k8zVar = new k8z(i, (lnm) obj3, (byte) 0);
                k8zVar.b = mmr0Var;
                k8zVar.c = zBooleanValue;
                return k8zVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                k8z k8zVar2 = new k8z(i, (lnm) obj3, (byte) 1);
                k8zVar2.b = mmr0Var;
                k8zVar2.c = zBooleanValue2;
                return k8zVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                mmr0 mmr0Var = this.b;
                boolean z = this.c;
                hm5.M(obj);
                long jLongValue = ((Number) mmr0Var.a).longValue();
                return new yvg1(new Long(jLongValue), (i091) mmr0Var.b, Boolean.valueOf(z));
            default:
                mmr0 mmr0Var2 = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                return new mmr0((Boolean) mmr0Var2.b, Boolean.valueOf(z2));
        }
    }
}
