package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fp60 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ mp60 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ ice0 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp60(mp60 mp60Var, String str, boolean z, ice0 ice0Var, boolean z2, boolean z3, String str2, lnm lnmVar) {
        super(1, lnmVar);
        this.b = mp60Var;
        this.c = str;
        this.d = z;
        this.e = ice0Var;
        this.f = z2;
        this.g = z3;
        this.h = str2;
    }

    @Override // p.faa
    public final lnm create(lnm lnmVar) {
        return new fp60(this.b, this.c, this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return ((fp60) create((lnm) obj)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        mp60 mp60Var = this.b;
        if (!z) {
            hm5.M(obj);
            this.a = true;
            obj = mp60Var.d(this.c, this.d, this.e, this.f, this.g, this.h, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        mp60Var.d.a(false);
        return obj;
    }
}
