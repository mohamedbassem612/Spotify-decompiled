package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ip60 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ mp60 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ice0 d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ String g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ip60(mp60 mp60Var, String str, ice0 ice0Var, boolean z, boolean z2, String str2, lnm lnmVar) {
        super(1, lnmVar);
        this.b = mp60Var;
        this.c = str;
        this.d = ice0Var;
        this.e = z;
        this.f = z2;
        this.g = str2;
    }

    @Override // p.faa
    public final lnm create(lnm lnmVar) {
        return new ip60(this.b, this.c, this.d, this.e, this.f, this.g, lnmVar);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return ((ip60) create((lnm) obj)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (z) {
            if (z) {
                hm5.M(obj);
                return obj;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        mp60 mp60Var = this.b;
        tp60 tp60Var = mp60Var.e;
        hp60 hp60Var = new hp60(mp60Var, this.c, this.d, this.e, this.f, this.g, (lnm) null);
        this.a = true;
        Object objW = tro1.w(tp60Var, kq60.t, hp60Var, this);
        d9n d9nVar = d9n.a;
        return objW == d9nVar ? d9nVar : objW;
    }
}
