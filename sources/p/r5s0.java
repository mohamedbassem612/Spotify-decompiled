package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class r5s0 extends a8d1 implements xu30 {
    public /* synthetic */ boolean a;

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        r5s0 r5s0Var = new r5s0(3, (lnm) obj3);
        r5s0Var.a = zBooleanValue;
        return r5s0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        hm5.M(obj);
        return new h901(z ? 1 : 3);
    }
}
