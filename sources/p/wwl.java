package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwl extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ nno c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wwl(int i, lnm lnmVar, byte b) {
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
                wwl wwlVar = new wwl(i, (lnm) obj3, (byte) 0);
                wwlVar.b = zBooleanValue;
                wwlVar.c = (nno) obj2;
                return wwlVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                wwl wwlVar2 = new wwl(i, (lnm) obj3, (byte) 1);
                wwlVar2.b = zBooleanValue2;
                wwlVar2.c = (nno) obj2;
                return wwlVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                mno mnoVar = this.c;
                hm5.M(obj);
                if (!z || !(mnoVar instanceof mno)) {
                    mnoVar = null;
                }
                if (mnoVar instanceof mno) {
                    return mnoVar;
                }
                return null;
            default:
                boolean z2 = this.b;
                nno nnoVar = this.c;
                hm5.M(obj);
                return Boolean.valueOf(!(nnoVar instanceof lno) || z2);
        }
    }
}
