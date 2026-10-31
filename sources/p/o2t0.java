package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o2t0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ a3t0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o2t0(int i, lnm lnmVar, byte b) {
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
                o2t0 o2t0Var = new o2t0(i, (lnm) obj3, (byte) 0);
                o2t0Var.b = zBooleanValue;
                o2t0Var.c = (a3t0) obj2;
                return o2t0Var.invokeSuspend(rih1Var);
            default:
                boolean zBooleanValue2 = bool.booleanValue();
                o2t0 o2t0Var2 = new o2t0(i, (lnm) obj3, (byte) 1);
                o2t0Var2.b = zBooleanValue2;
                o2t0Var2.c = (a3t0) obj2;
                return o2t0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                boolean z = this.b;
                a3t0 a3t0Var = this.c;
                hm5.M(obj);
                return new oq3(a3t0Var, z);
            default:
                boolean z2 = this.b;
                a3t0 a3t0Var2 = this.c;
                hm5.M(obj);
                return new q2t0(a3t0Var2, z2);
        }
    }
}
