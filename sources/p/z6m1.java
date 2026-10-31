package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z6m1 extends a8d1 implements dv30 {
    public /* synthetic */ cj31 a;
    public /* synthetic */ cj31 b;
    public /* synthetic */ cj31 c;
    public /* synthetic */ cj31 d;
    public /* synthetic */ cj31 e;
    public final /* synthetic */ m8a f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ gj31 h;
    public final /* synthetic */ hw2 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z6m1(m8a m8aVar, boolean z, gj31 gj31Var, hw2 hw2Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = m8aVar;
        this.g = z;
        this.h = gj31Var;
        this.i = hw2Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        gj31 gj31Var = this.h;
        hw2 hw2Var = this.i;
        z6m1 z6m1Var = new z6m1(this.f, this.g, gj31Var, hw2Var, (lnm) obj6);
        z6m1Var.a = (cj31) obj;
        z6m1Var.b = (cj31) obj2;
        z6m1Var.c = (cj31) obj3;
        z6m1Var.d = (cj31) obj4;
        z6m1Var.e = (cj31) obj5;
        return z6m1Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        gj31 gj31Var;
        cj31 cj31Var = this.a;
        cj31 cj31Var2 = this.b;
        cj31 cj31Var3 = this.c;
        cj31 cj31Var4 = this.d;
        cj31 cj31Var5 = this.e;
        hm5.M(obj);
        String str = null;
        if (this.g && (gj31Var = this.h) != null) {
            str = gj31Var.a;
        }
        return new ba10(this.f, cj31Var, cj31Var2, cj31Var3, cj31Var4, cj31Var5, str, ((pe) this.i.g).b(5));
    }
}
