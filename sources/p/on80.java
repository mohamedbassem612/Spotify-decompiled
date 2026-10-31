package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class on80 extends a8d1 implements iu30 {
    public boolean a;
    public final /* synthetic */ pn80 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public on80(pn80 pn80Var, boolean z, lnm lnmVar) {
        super(1, lnmVar);
        this.b = pn80Var;
        this.c = z;
    }

    @Override // p.faa
    public final lnm create(lnm lnmVar) {
        return new on80(this.b, this.c, lnmVar);
    }

    @Override // p.iu30
    public final Object invoke(Object obj) {
        return ((on80) create((lnm) obj)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        pn80 pn80Var = this.b;
        if (!z) {
            hm5.M(obj);
            l6s l6sVar = pn80Var.f;
            this.a = true;
            Object objU = l6sVar.u(this.c, this);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        bma1 bma1Var = pn80.j;
        pn80Var.c();
        return rih1.a;
    }
}
