package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class b1u0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ Object c;
    public final /* synthetic */ g1u0 d;
    public final /* synthetic */ String e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b1u0(g1u0 g1u0Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = g1u0Var;
        this.e = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.e;
        g1u0 g1u0Var = this.d;
        switch (b) {
            case 0:
                b1u0 b1u0Var = new b1u0(g1u0Var, str, lnmVar, (byte) 0);
                b1u0Var.c = obj;
                return b1u0Var;
            case 1:
                b1u0 b1u0Var2 = new b1u0(g1u0Var, str, lnmVar, (byte) 1);
                b1u0Var2.c = obj;
                return b1u0Var2;
            default:
                b1u0 b1u0Var3 = new b1u0(g1u0Var, str, lnmVar, (byte) 2);
                b1u0Var3.c = obj;
                return b1u0Var3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.e;
        g1u0 g1u0Var = this.d;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b2 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.c = vr20Var;
                this.b = (byte) 1;
                if (vr20Var.emit((Object) null, this) == d9nVar) {
                    return d9nVar;
                }
                ezc ezcVarG = yoi1.g(oon1.x(g1u0Var.l, "playback_notification", str));
                this.c = null;
                this.b = (byte) 2;
                u4p1.S(vr20Var);
                Object objCollect = ezcVarG.collect(new r4t0(vr20Var, (byte) 15), this);
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect != d9nVar) {
                    objCollect = rih1Var;
                }
                if (objCollect == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            case 1:
                vr20 vr20Var2 = (vr20) this.c;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b3 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.c = vr20Var2;
                this.b = (byte) 1;
                if (vr20Var2.emit((Object) null, this) == d9nVar) {
                    return d9nVar;
                }
                mr20 mr20VarI = hno1.i(g1u0Var.l, "playback_notification", str);
                this.c = null;
                this.b = (byte) 2;
                if (l4p1.s(vr20Var2, mr20VarI, this) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                vr20 vr20Var3 = (vr20) this.c;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1) {
                        hm5.M(obj);
                    } else {
                        if (b4 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                }
                hm5.M(obj);
                this.c = vr20Var3;
                this.b = (byte) 1;
                if (vr20Var3.emit((Object) null, this) == d9nVar) {
                    return d9nVar;
                }
                q0i0 q0i0Var = g1u0Var.m;
                q0i0Var.getClass();
                jge jgeVarE = hu20.e(q0i0Var.a, new c6e0((lnm) null, new n0i0(str, q0i0Var, (byte) 0), (Object) null, (byte) 2));
                this.c = null;
                this.b = (byte) 2;
                u4p1.S(vr20Var3);
                Object objCollect2 = jgeVarE.collect(new fmh0(new r4t0(vr20Var3, (byte) 16), (byte) 9), this);
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 != d9nVar) {
                    objCollect2 = rih1Var;
                }
                if (objCollect2 == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
        }
    }
}
