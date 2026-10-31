package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zew0 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ sgn0 b;
    public /* synthetic */ sbw0 c;
    public /* synthetic */ boolean d;
    public final /* synthetic */ l811 e;
    public final /* synthetic */ gfw0 f;
    public final /* synthetic */ c9n g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zew0(l811 l811Var, gfw0 gfw0Var, c9n c9nVar, lnm lnmVar) {
        super(4, lnmVar);
        this.e = l811Var;
        this.f = gfw0Var;
        this.g = c9nVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean zBooleanValue = ((Boolean) obj3).booleanValue();
        gfw0 gfw0Var = this.f;
        c9n c9nVar = this.g;
        zew0 zew0Var = new zew0(this.e, gfw0Var, c9nVar, (lnm) obj4);
        zew0Var.b = (sgn0) obj;
        zew0Var.c = (sbw0) obj2;
        zew0Var.d = zBooleanValue;
        return zew0Var.invokeSuspend(rih1.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0083  */
    /* JADX WARN: Code duplicated, block: B:44:0x0097 A[RETURN] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objT;
        d9n d9nVar;
        gfw0 gfw0Var = this.f;
        mlw0 mlw0Var = gfw0Var.k;
        sgn0 sgn0Var = this.b;
        sbw0 sbw0Var = this.c;
        boolean z = this.d;
        boolean z2 = this.a;
        rih1 rih1Var = rih1.a;
        if (z2) {
            if (z2) {
                hm5.M(obj);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        l811 l811Var = this.e;
        boolean z3 = z && !l811Var.a;
        l811Var.a = z;
        if (z && gfw0Var.K == 1) {
            if (sgn0Var.a) {
                r091 r091Var = (r091) mlw0Var.b;
                if (r091Var != null) {
                    r091Var.c();
                    return rih1Var;
                }
            } else if (!z3 || gfw0Var.F) {
                tv80 tv80Var = sgn0Var.b;
                this.b = null;
                this.c = null;
                this.d = z;
                this.a = true;
                objT = gfw0Var.t(sbw0Var, this.g, tv80Var, this);
                d9nVar = d9n.a;
                if (objT == d9nVar) {
                    return d9nVar;
                }
            } else {
                k9k k9kVar = gfw0Var.l;
                zkm zkmVar = (zkm) ((bpb1) k9kVar.f).getValue();
                if (zkmVar != null && zkmVar.d && zkmVar.c && !((ugn0) k9kVar.e).a()) {
                    bpb1 bpb1Var = gfw0Var.h.a;
                    sgn0 sgn0Var2 = new sgn0();
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, sgn0Var2);
                    r091 r091Var2 = (r091) mlw0Var.b;
                    if (r091Var2 != null) {
                        r091Var2.c();
                        return rih1Var;
                    }
                } else {
                    tv80 tv80Var2 = sgn0Var.b;
                    this.b = null;
                    this.c = null;
                    this.d = z;
                    this.a = true;
                    objT = gfw0Var.t(sbw0Var, this.g, tv80Var2, this);
                    d9nVar = d9n.a;
                    if (objT == d9nVar) {
                        return d9nVar;
                    }
                }
            }
        }
        return rih1Var;
    }
}
