package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class h8f0 extends a8d1 implements zu30 {
    public /* synthetic */ int a;
    public /* synthetic */ int b;
    public /* synthetic */ int c;

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int iIntValue = ((Number) obj).intValue();
        int iIntValue2 = ((Number) obj2).intValue();
        int iIntValue3 = ((Number) obj3).intValue();
        h8f0 h8f0Var = new h8f0(4, (lnm) obj4);
        h8f0Var.a = iIntValue;
        h8f0Var.b = iIntValue2;
        h8f0Var.c = iIntValue3;
        return h8f0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        hm5.M(obj);
        return Boolean.valueOf(rwq.k(i) || rwq.k(i2) || rwq.k(i3));
    }
}
