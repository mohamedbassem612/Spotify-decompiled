package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class k9o extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k9o(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = bool.booleanValue();
                int iIntValue = ((Number) obj2).intValue();
                k9o k9oVar = new k9o(i, (lnm) obj3, (byte) 0);
                k9oVar.b = zBooleanValue;
                k9oVar.c = iIntValue;
                return k9oVar.invokeSuspend(rih1Var);
            case 1:
                boolean zBooleanValue2 = bool.booleanValue();
                int iIntValue2 = ((Number) obj2).intValue();
                k9o k9oVar2 = new k9o(i, (lnm) obj3, (byte) 1);
                k9oVar2.b = zBooleanValue2;
                k9oVar2.c = iIntValue2;
                return k9oVar2.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                int iIntValue3 = ((Number) obj2).intValue();
                k9o k9oVar3 = new k9o(i, (lnm) obj3, (byte) 2);
                k9oVar3.b = zBooleanValue3;
                k9oVar3.c = iIntValue3;
                return k9oVar3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        z = false;
        boolean z = false;
        switch (this.a) {
            case 0:
                boolean z2 = this.b;
                int i = this.c;
                hm5.M(obj);
                return new Integer(z2 ? i : 0);
            case 1:
                boolean z3 = this.b;
                int i2 = this.c;
                hm5.M(obj);
                if (i2 >= 2 && z3) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z4 = this.b;
                int i3 = this.c;
                hm5.M(obj);
                return new mmr0(Boolean.valueOf(z4), new Integer(i3));
        }
    }
}
