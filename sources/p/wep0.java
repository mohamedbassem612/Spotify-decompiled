package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wep0 extends a8d1 implements vu30 {
    public int a;
    public boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ int d;
    public final /* synthetic */ tr80 e;
    public final /* synthetic */ int f;
    public final /* synthetic */ iu30 g;
    public final /* synthetic */ o95 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ ven0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wep0(float f, int i, tr80 tr80Var, int i2, iu30 iu30Var, o95 o95Var, iu30 iu30Var2, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = f;
        this.d = i;
        this.e = tr80Var;
        this.f = i2;
        this.g = iu30Var;
        this.h = o95Var;
        this.i = iu30Var2;
        this.t = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new wep0(this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        wep0 wep0Var;
        boolean z = this.b;
        if (!z) {
            hm5.M(obj);
            int iP = yoi1.p(jch0.U(this.c), 0, this.d);
            i = ((rr80) this.e).a + (this.f * iP);
            this.g.invoke(new Integer(i));
            Float f = new Float(iP);
            n8b1 n8b1VarL0 = irn1.l0(1.0f, 0.0f, (Object) null, 6);
            this.a = i;
            this.b = true;
            wep0Var = this;
            Object objB = o95.b(this.h, f, n8b1VarL0, (Float) null, (iu30) null, wep0Var, 12);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            hm5.M(obj);
            wep0Var = this;
        }
        wep0Var.i.invoke(new Integer(i));
        wep0Var.t.setValue(Boolean.FALSE);
        return rih1.a;
    }
}
