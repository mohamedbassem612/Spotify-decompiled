package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e1v0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ boolean b;
    public /* synthetic */ boolean c;
    public final /* synthetic */ s1v0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1v0(s1v0 s1v0Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.d = s1v0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s1v0 s1v0Var = this.d;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                e1v0 e1v0Var = new e1v0(s1v0Var, lnmVar, (byte) 0);
                e1v0Var.b = zBooleanValue;
                e1v0Var.c = zBooleanValue2;
                return e1v0Var.invokeSuspend(rih1Var);
            default:
                e1v0 e1v0Var2 = new e1v0(s1v0Var, lnmVar, (byte) 1);
                e1v0Var2.b = zBooleanValue;
                e1v0Var2.c = zBooleanValue2;
                return e1v0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        s1v0 s1v0Var = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                boolean z2 = this.c;
                hm5.M(obj);
                return new p0v0(z, z2, s1v0Var.a);
            default:
                boolean z3 = this.b;
                boolean z4 = this.c;
                hm5.M(obj);
                return new p0v0(z3, z4, s1v0Var.a);
        }
    }
}
