package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class oew0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ gfw0 d;
    public final /* synthetic */ sbw0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oew0(gfw0 gfw0Var, sbw0 sbw0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = gfw0Var;
        this.e = sbw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        sbw0 sbw0Var = this.e;
        gfw0 gfw0Var = this.d;
        switch (b) {
            case 0:
                oew0 oew0Var = new oew0(gfw0Var, sbw0Var, lnmVar, (byte) 0);
                oew0Var.c = obj;
                return oew0Var;
            default:
                oew0 oew0Var2 = new oew0(gfw0Var, sbw0Var, lnmVar, (byte) 1);
                oew0Var2.c = obj;
                return oew0Var2;
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

    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    public final Object invokeSuspend(Object obj) {
        long jLongValue;
        Object objI;
        zau0 zau0Var;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        gfw0 gfw0Var = this.d;
        rih1 rih1Var = rih1.a;
        sbw0 sbw0Var = this.e;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    if (gfw0Var.s == null) {
                        Logger.k(cy30.p("PlayerGroup not available for section=", sbw0Var.a, ", uri=", gfw0.p(sbw0Var), "; preview won't work!"), new Object[0]);
                    }
                    mr20 mr20VarA = gfw0Var.i.a();
                    zau0 zau0Var2 = gfw0Var.s;
                    Object objCollect = rqt0.u(new s1g(new fu20(o4p1.l(new x010(mr20VarA, zau0Var2 != null ? zau0Var2.b : new huz(Boolean.FALSE, (byte) 10), new vm0(3, (lnm) null, (byte) 26), (byte) 1)), new cqu0(gfw0Var, (lnm) null, (byte) 9), (byte) 1), (byte) 9)).collect(new eu20(kfo0.a, new ffw0(gfw0Var, sbw0Var, c9nVar, null), (byte) 1), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                c9n c9nVar2 = (c9n) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = c9nVar2;
                    this.b = true;
                    gfw0Var.getClass();
                    Long l = sbw0Var.k;
                    if (l == null) {
                        jLongValue = sbw0Var.e;
                    } else {
                        if (!gfw0Var.h.a()) {
                            l = null;
                        }
                        if (l != null) {
                            jLongValue = l.longValue();
                        } else {
                            jLongValue = sbw0Var.e;
                        }
                    }
                    if (jLongValue <= 0 || (objI = hap1.i(jLongValue, this)) != d9nVar) {
                        objI = rih1Var;
                    }
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                if (smo1.u(c9nVar2) && gfw0Var.K == 1 && gfw0Var.D && gfw0Var.E && (zau0Var = gfw0Var.s) != null && ((Boolean) zau0Var.b.getValue()).booleanValue() && gfw0Var.u.getValue() == sbw0Var && !fqo1.C(gfw0Var.z) && (!sbw0Var.g || !gfw0Var.h.a())) {
                    gfw0Var.q.m((Object) null, Boolean.TRUE);
                }
                return rih1Var;
        }
    }
}
