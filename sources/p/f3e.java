package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class f3e extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ s24 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3e(s24 s24Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = s24Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        s24 s24Var = this.c;
        switch (b) {
            case 0:
                return new f3e(s24Var, lnmVar, (byte) 0);
            default:
                return new f3e(s24Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        s24 s24Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                y7l y7lVar = (y7l) s24Var.d;
                ezc ezcVarG = yoi1.g(y7lVar.b.a());
                e3e e3eVar = new e3e(s24Var, (byte) 0);
                this.b = true;
                Object objCollect = ezcVarG.collect(new t0l(e3eVar, y7lVar, (byte) 5), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                return objCollect == d9nVar ? d9nVar : rih1Var;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                lpr lprVar = (lpr) s24Var.e;
                String str = ((odc1) s24Var.b).b;
                jks jksVar = lprVar.a;
                evz evzVarC = jksVar.c();
                jd11 jd11Var = rc11.a;
                mr20 mr20VarU = rqt0.u(new ipr(hu20.d(new mr20[]{new pya(new evz(evzVarC, jd11Var.b(vyc.class), (byte) 12), (byte) 2), new i0h(new qer(new evz(jksVar.c(), jd11Var.b(uyc.class), (byte) 12), lprVar, (byte) 8), (byte) 15)}), lprVar, str, (byte) 0));
                e3e e3eVar2 = new e3e(s24Var, (byte) 1);
                this.b = true;
                return mr20VarU.collect(e3eVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
