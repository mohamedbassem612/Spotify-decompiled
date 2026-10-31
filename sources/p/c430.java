package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c430 extends a8d1 implements xu30 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;
    public final /* synthetic */ k330 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c430(k330 k330Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = k330Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        c430 c430Var = new c430(this.c, (lnm) obj3);
        c430Var.a = zBooleanValue;
        c430Var.b = zBooleanValue2;
        return c430Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        hm5.M(obj);
        k330 k330Var = this.c;
        if (z2) {
            return new q330(k330Var.a(), (p3v) null, 0);
        }
        return z ? new s330(k330Var.b()) : new t330(k330Var.b());
    }
}
