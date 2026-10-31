package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fnf extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fnf(boolean z, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = z;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = this.d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                fnf fnfVar = new fnf(z, lnmVar, (byte) 0);
                fnfVar.b = zBooleanValue;
                fnfVar.c = zBooleanValue2;
                return fnfVar.invokeSuspend(rih1Var);
            default:
                fnf fnfVar2 = new fnf(z, lnmVar, (byte) 1);
                fnfVar2.b = zBooleanValue;
                fnfVar2.c = zBooleanValue2;
                return fnfVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        boolean z = this.d;
        switch (b) {
            case 0:
                boolean z2 = this.b;
                boolean z3 = this.c;
                hm5.M(obj);
                return new enf(z2, z, z3);
            default:
                boolean z4 = this.b;
                boolean z5 = this.c;
                hm5.M(obj);
                return Boolean.valueOf(z4 && !z5 && z);
        }
    }
}
