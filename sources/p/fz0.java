package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fz0 extends a8d1 implements dv30 {
    public /* synthetic */ String a;
    public /* synthetic */ gvf1 b;
    public /* synthetic */ boolean c;
    public /* synthetic */ Long d;
    public /* synthetic */ i6h1 e;

    public fz0(lnm lnmVar) {
        super(6, lnmVar);
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        fz0 fz0Var = new fz0((lnm) obj6);
        fz0Var.a = (String) obj;
        fz0Var.b = (gvf1) obj2;
        fz0Var.c = zBooleanValue;
        fz0Var.d = (Long) obj4;
        fz0Var.e = (i6h1) obj5;
        return fz0Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str = this.a;
        gvf1 gvf1Var = this.b;
        boolean z = this.c;
        Long l = this.d;
        i6h1 i6h1Var = this.e;
        hm5.M(obj);
        return new ez0(str, gvf1Var.a, gvf1Var.b, l, z, i6h1Var);
    }
}
