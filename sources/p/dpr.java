package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dpr extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Boolean c;
    public /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dpr(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                boolean zBooleanValue2 = ((Boolean) obj3).booleanValue();
                dpr dprVar = new dpr(i, (lnm) obj4, (byte) 0);
                dprVar.c = bool;
                dprVar.b = zBooleanValue;
                dprVar.d = zBooleanValue2;
                return dprVar.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue3 = bool.booleanValue();
                boolean zBooleanValue4 = ((Boolean) obj3).booleanValue();
                dpr dprVar2 = new dpr(i, (lnm) obj4, (byte) 1);
                dprVar2.b = zBooleanValue3;
                dprVar2.c = (Boolean) obj2;
                dprVar2.d = zBooleanValue4;
                return dprVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = false;
        switch (this.a) {
            case 0:
                Boolean bool = this.c;
                boolean z2 = this.b;
                boolean z3 = this.d;
                hm5.M(obj);
                if (bool.booleanValue() || (!z3 && !z2)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                boolean z4 = this.b;
                Boolean bool2 = this.c;
                boolean z5 = this.d;
                hm5.M(obj);
                if (z4 && bool2.booleanValue() && z5) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
