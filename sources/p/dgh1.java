package p;

import android.os.Bundle;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dgh1 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ tqw c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ xpw f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dgh1(xpw xpwVar, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.f = xpwVar;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        nl9 nl9Var = this.f;
        switch (b) {
            case 0:
                dgh1 dgh1Var = new dgh1((hc30) nl9Var, (lnm) obj5, (byte) 0);
                dgh1Var.d = (a331) obj;
                dgh1Var.e = (agh1) obj3;
                dgh1Var.c = (tqw) obj4;
                return dgh1Var.invokeSuspend(rih1Var);
            case 1:
                dgh1 dgh1Var2 = new dgh1(nl9Var, (lnm) obj5, (byte) 1);
                dgh1Var2.d = (xpj1) obj2;
                dgh1Var2.e = (wpj1) obj3;
                dgh1Var2.c = (tqw) obj4;
                return dgh1Var2.invokeSuspend(rih1Var);
            default:
                dgh1 dgh1Var3 = new dgh1((tuk1) nl9Var, (lnm) obj5, (byte) 2);
                dgh1Var3.d = (dvk1) obj;
                dgh1Var3.e = (yuk1) obj3;
                dgh1Var3.c = (tqw) obj4;
                return dgh1Var3.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        ou80 ou80Var;
        Object value;
        gwk1 gwk1VarX;
        Object value2;
        gwk1 gwk1VarX2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        nl9 nl9Var = this.f;
        switch (b) {
            case 0:
                hc30 hc30Var = (hc30) nl9Var;
                lzn0 lzn0Var = hc30Var.b;
                a331 a331Var = (a331) this.d;
                agh1 agh1Var = (agh1) this.e;
                tqw tqwVar = this.c;
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    lzn0Var.e();
                    return rih1Var;
                }
                hm5.M(obj);
                int iOrdinal = agh1Var.ordinal();
                if (iOrdinal == 0) {
                    lzn0Var.a("spotify:home", cvl1.d(tqwVar), (Bundle) null);
                    return rih1Var;
                }
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                pp31 pp31Var = hc30Var.c;
                String str = a331Var.b;
                this.d = null;
                this.e = null;
                this.c = null;
                this.b = true;
                if (pp31Var.g(str, this) == d9nVar) {
                    return d9nVar;
                }
                lzn0Var.e();
                return rih1Var;
            case 1:
                nl9 nl9Var2 = nl9Var;
                xpj1 xpj1Var = (xpj1) this.d;
                wpj1 wpj1Var = (wpj1) this.e;
                tqw tqwVar2 = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (wpj1Var instanceof vpj1) {
                        for (l090 l090Var : xpj1Var.a) {
                            if (l090Var instanceof k090) {
                                zor.i((zor) ((g0l) ((ynb0) nl9Var2.e).get()).c.get(), (tqwVar2 == null || (ou80Var = n3o1.y(tqwVar2).a) == null) ? null : ou80Var.a, 6);
                            } else if (l090Var instanceof j090) {
                                ((yjj1) ((ynb0) nl9Var2.b).get()).i.onNext(rih1Var);
                            } else {
                                eg.o();
                            }
                        }
                        if (!xpj1Var.a.contains(j090.b)) {
                            return rih1Var;
                        }
                        int i = ((r3b1) ((ynb0) nl9Var2.h).get()).a().b ? 2131963765 : 2131963766;
                        kt91 kt91Var = (kt91) ((ynb0) nl9Var2.g).get();
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
                        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                        kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                        return rih1Var;
                    }
                    if (wpj1Var instanceof upj1) {
                        fns fnsVar = igu.a;
                        bs50 bs50Var = pyf0.a;
                        t6j1 t6j1Var = new t6j1(nl9Var2, tqwVar2, (lnm) null, (byte) 4);
                        this.d = null;
                        this.e = null;
                        this.c = null;
                        this.b = true;
                        return fn31.Y(bs50Var, t6j1Var, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    eg.o();
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                tuk1 tuk1Var = (tuk1) nl9Var;
                bpb1 bpb1Var = tuk1Var.h;
                dvk1 dvk1Var = (dvk1) this.d;
                yuk1 yuk1Var = (yuk1) this.e;
                tqw tqwVar3 = this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    if (yuk1Var instanceof xuk1) {
                        do {
                            value2 = bpb1Var.getValue();
                            gwk1VarX2 = (gwk1) value2;
                            if (gwk1VarX2 != null) {
                                String str2 = ((xuk1) yuk1Var).a;
                                if (gwk1VarX2.q) {
                                    gwk1VarX2 = lm5.x(gwk1VarX2.a(1, str2));
                                }
                            } else {
                                gwk1VarX2 = null;
                            }
                        } while (!bpb1Var.k(value2, gwk1VarX2));
                        return rih1Var;
                    }
                    if (yuk1Var instanceof wuk1) {
                        do {
                            value = bpb1Var.getValue();
                            gwk1VarX = (gwk1) value;
                            if (gwk1VarX != null) {
                                String str3 = ((wuk1) yuk1Var).a;
                                if (gwk1VarX.s) {
                                    Integer num = (Integer) gwk1VarX.m.get(str3);
                                    if ((num != null ? num.intValue() : 0) > 0) {
                                        gwk1VarX = lm5.x(gwk1VarX.a(-1, str3));
                                    }
                                }
                            } else {
                                gwk1VarX = null;
                            }
                        } while (!bpb1Var.k(value, gwk1VarX));
                        return rih1Var;
                    }
                    if (u890.j(yuk1Var, vuk1.a)) {
                        String str4 = dvk1Var.b;
                        boolean z4 = dvk1Var.c;
                        this.d = null;
                        this.e = null;
                        this.c = null;
                        this.b = true;
                        return tuk1Var.e(str4, z4, tqwVar3, this) == d9nVar ? d9nVar : rih1Var;
                    }
                    if (u890.j(yuk1Var, uuk1.a)) {
                        blp blpVar = tuk1Var.d;
                        if (tqwVar3 != null) {
                            ((lzn0) blpVar.get()).a("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties", n3o1.y(tqwVar3), (Bundle) null);
                            return rih1Var;
                        }
                        ((lzn0) blpVar.get()).h("spotify:upsell:premium_in_app_destination?displayReason=kpop_upsell:listening_parties");
                        return rih1Var;
                    }
                    eg.o();
                } else {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
        }
    }
}
