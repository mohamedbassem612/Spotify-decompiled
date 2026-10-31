package p;

import android.os.Bundle;
import io.reactivex.rxjava3.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gw2 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ tqw c;
    public Object d;
    public /* synthetic */ Object e;
    public Object f;
    public /* synthetic */ Object g;
    public /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw2(ywv0 ywv0Var, xaj1 xaj1Var, tgt0 tgt0Var, bjx0 bjx0Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = ywv0Var;
        this.f = xaj1Var;
        this.g = tgt0Var;
        this.h = bjx0Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                gw2 gw2Var = new gw2((hw2) this.e, (lnm) obj5);
                gw2Var.g = (pw2) obj;
                gw2Var.h = (mw2) obj3;
                gw2Var.c = (tqw) obj4;
                return gw2Var.invokeSuspend(rih1Var);
            case 1:
                gw2 gw2Var2 = new gw2((wr00) this.f, (lzn0) this.g, (mts) this.h, (lnm) obj5);
                gw2Var2.d = (dmb) obj2;
                gw2Var2.e = (bmb) obj3;
                gw2Var2.c = (tqw) obj4;
                return gw2Var2.invokeSuspend(rih1Var);
            default:
                gw2 gw2Var3 = new gw2((ywv0) this.e, (xaj1) this.f, (tgt0) this.g, (bjx0) this.h, (lnm) obj5);
                gw2Var3.d = (ktj1) obj3;
                gw2Var3.c = (tqw) obj4;
                return gw2Var3.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0238  */
    /* JADX WARN: Code duplicated, block: B:102:0x023b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0233  */
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        hw2 hw2Var;
        tv80 tv80VarY;
        tv80 tv80Var;
        String str3;
        m4m m4mVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                pw2 pw2Var = (pw2) this.g;
                lw2 lw2Var = (mw2) this.h;
                tqw tqwVar = this.c;
                boolean z = this.b;
                if (z) {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str4 = (String) this.f;
                    hw2Var = (hw2) this.d;
                    hm5.M(obj);
                    str2 = str4;
                    if (tqwVar != null) {
                        tv80VarY = n3o1.y(tqwVar);
                    } else {
                        tv80VarY = null;
                    }
                    ((lzn0) hw2Var.f).f(new dwn0(str2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                    return rih1Var;
                }
                hm5.M(obj);
                if (lw2Var instanceof lw2) {
                    str = lw2Var.a;
                } else {
                    if (!(lw2Var instanceof kw2)) {
                        eg.o();
                        return null;
                    }
                    str = ((kw2) lw2Var).a;
                }
                if (str == null) {
                    return rih1Var;
                }
                if (str.length() <= 0) {
                    str = null;
                }
                if (str == null) {
                    return rih1Var;
                }
                hw2 hw2Var2 = (hw2) this.e;
                vu30 vu30Var = pw2Var.e;
                this.g = null;
                this.h = null;
                this.c = tqwVar;
                this.d = hw2Var2;
                this.f = str;
                this.b = true;
                if (vu30Var.invoke(lw2Var, this) == d9nVar) {
                    return d9nVar;
                }
                str2 = str;
                hw2Var = hw2Var2;
                if (tqwVar != null) {
                    tv80VarY = n3o1.y(tqwVar);
                } else {
                    tv80VarY = null;
                }
                ((lzn0) hw2Var.f).f(new dwn0(str2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null));
                return rih1Var;
            case 1:
                dmb dmbVar = (dmb) this.d;
                bmb bmbVar = (bmb) this.e;
                tqw tqwVar2 = this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    if (bmbVar != null) {
                        amb ambVar = dmbVar.a;
                        if (ambVar instanceof ylb) {
                            ((wr00) this.f).a("");
                            return rih1Var;
                        }
                        if (ambVar instanceof zlb) {
                            if (tqwVar2 == null || (tv80Var = (tv80) tqwVar2.a(rc11.a.b(tv80.class))) == null) {
                                return rih1Var;
                            }
                            lzn0 lzn0Var = (lzn0) this.g;
                            String str5 = dmbVar.a.a;
                            lzn0Var.a("spotify:gatedcontent:bottomsheet:".concat(ihc1.V0(str5, ':', str5)), tv80Var, (Bundle) null);
                            return rih1Var;
                        }
                        if (ambVar instanceof xlb) {
                            rqa rqaVar = new rqa((mts) this.h, bmbVar, (byte) 6);
                            this.d = null;
                            this.e = null;
                            this.c = null;
                            this.b = true;
                            dmb dmbVar2 = wlb.a;
                            ohd ohdVar = new ohd(1, aym.t(this));
                            ohdVar.t();
                            ohdVar.n(new vlb((Disposable) rqaVar.invoke(), (byte) 0));
                            Object objR = ohdVar.r();
                            if (objR != d9nVar) {
                                objR = rih1Var;
                            }
                            return objR == d9nVar ? d9nVar : rih1Var;
                        }
                        eg.o();
                    } else {
                        eg.o();
                    }
                } else {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                }
                return null;
            default:
                ywv0 ywv0Var = (ywv0) this.e;
                xaj1 xaj1Var = (xaj1) this.f;
                ktj1 ktj1Var = (ktj1) this.d;
                tqw tqwVar3 = this.c;
                boolean z3 = this.b;
                if (z3) {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    etj1 etj1Var = (etj1) ktj1Var;
                    xaj1Var.invoke(new etj1(etj1Var.a, etj1Var.b, etj1Var.c, etj1Var.d));
                    return rih1Var;
                }
                hm5.M(obj);
                if (ktj1Var instanceof etj1) {
                    ou80 ou80Var = tqwVar3 != null ? n3o1.y(tqwVar3).a : null;
                    ytp0 ytp0Var = (ytp0) ywv0Var.g;
                    etj1 etj1Var2 = (etj1) ktj1Var;
                    String str6 = etj1Var2.b;
                    int iC = l1d.C(etj1Var2.d);
                    if (iC != 0) {
                        m4mVar = iC != 1 ? m4m.c : m4m.b;
                    } else {
                        m4mVar = m4m.a;
                    }
                    ntj1 ntj1Var = new ntj1(ywv0Var, ktj1Var, (tgt0) this.g, ou80Var, (bjx0) this.h, null);
                    this.d = ktj1Var;
                    this.c = null;
                    this.b = true;
                    if (ytp0Var.m(str6, m4mVar, (tv80) null, ntj1Var, this) == d9nVar) {
                        return d9nVar;
                    }
                    etj1 etj1Var3 = (etj1) ktj1Var;
                    xaj1Var.invoke(new etj1(etj1Var3.a, etj1Var3.b, etj1Var3.c, etj1Var3.d));
                    return rih1Var;
                }
                if (ktj1Var instanceof ftj1) {
                    xaj1Var.invoke(new ftj1());
                    return rih1Var;
                }
                if (ktj1Var instanceof gtj1) {
                    gtj1 gtj1Var = (gtj1) ktj1Var;
                    xaj1Var.invoke(new gtj1(gtj1Var.a, gtj1Var.b));
                    return rih1Var;
                }
                if (ktj1Var instanceof jtj1) {
                    jtj1 jtj1Var = (jtj1) ktj1Var;
                    xaj1Var.invoke(new jtj1(jtj1Var.a, jtj1Var.b));
                    return rih1Var;
                }
                itj1 itj1Var = itj1.a;
                if (u890.j(ktj1Var, itj1Var)) {
                    xaj1Var.invoke(itj1Var);
                    return rih1Var;
                }
                if (!(ktj1Var instanceof htj1)) {
                    eg.o();
                    return null;
                }
                lzn0 lzn0Var2 = (lzn0) ywv0Var.e;
                htj1 htj1Var = (htj1) ktj1Var;
                String str7 = htj1Var.c;
                if (str7.length() > 0) {
                    bwn0 bwn0Var = tqwVar3 != null ? new bwn0(n3o1.y(tqwVar3)) : null;
                    str3 = str7;
                    lzn0Var2.f(new dwn0(str7, "", false, false, 0, 0, false, (a690) null, (Bundle) null, bwn0Var));
                } else {
                    str3 = str7;
                }
                xaj1Var.invoke(new htj1(htj1Var.a, htj1Var.b, str3));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw2(wr00 wr00Var, lzn0 lzn0Var, mts mtsVar, lnm lnmVar) {
        super(5, lnmVar);
        this.f = wr00Var;
        this.g = lzn0Var;
        this.h = mtsVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw2(hw2 hw2Var, lnm lnmVar) {
        super(5, lnmVar);
        this.e = hw2Var;
    }
}
