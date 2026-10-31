package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class w70 extends a8d1 implements dv30 {
    public boolean a;
    public /* synthetic */ km61 b;
    public /* synthetic */ m70 c;
    public /* synthetic */ s70 d;
    public /* synthetic */ tqw e;
    public final /* synthetic */ ycc1 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w70(ycc1 ycc1Var, lnm lnmVar) {
        super(6, lnmVar);
        this.f = ycc1Var;
    }

    public final Object Y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        w70 w70Var = new w70(this.f, (lnm) obj6);
        w70Var.b = (km61) obj;
        w70Var.c = (m70) obj2;
        w70Var.d = (s70) obj4;
        w70Var.e = (tqw) obj5;
        return w70Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        km61 km61Var = this.b;
        m70 m70Var = this.c;
        s70 s70Var = this.d;
        tqw tqwVar = this.e;
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            if (s70Var instanceof q70) {
                xu30 xu30Var = m70Var.d;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                this.b = null;
                this.c = null;
                this.d = null;
                this.e = null;
                this.a = true;
                Object objInvoke = xu30Var.invoke(km61Var, tv80VarY, this);
                d9n d9nVar = d9n.a;
                if (objInvoke == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (!(s70Var instanceof r70)) {
                    eg.o();
                    return null;
                }
                ((i9i1) this.f.c).b(((r70) s70Var).a);
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
