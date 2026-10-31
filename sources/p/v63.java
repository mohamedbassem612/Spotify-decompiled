package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v63 extends a8d1 implements bv30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ tqw b;
    public final /* synthetic */ iu30 c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v63(iu30 iu30Var, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(5, lnmVar);
        this.a = b;
        this.c = iu30Var;
        this.g = obj;
        this.h = obj2;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                iu30 iu30Var = this.c;
                v63 v63Var = new v63(iu30Var, (u63) obj7, (zwg) obj6, (lnm) obj5, (byte) 0);
                v63Var.d = (s63) obj;
                v63Var.e = (t63) obj2;
                v63Var.f = (r63) obj3;
                v63Var.b = (tqw) obj4;
                v63Var.invokeSuspend(rih1Var);
                break;
            case 1:
                iu30 iu30Var2 = this.c;
                v63 v63Var2 = new v63(iu30Var2, (iu30) obj7, (ne) obj6, (lnm) obj5, (byte) 1);
                v63Var2.d = (dm20) obj;
                v63Var2.e = obj2;
                v63Var2.f = (wl20) obj3;
                v63Var2.b = (tqw) obj4;
                v63Var2.invokeSuspend(rih1Var);
                break;
            case 2:
                iu30 iu30Var3 = this.c;
                v63 v63Var3 = new v63(iu30Var3, (yvp0) obj7, (p410) obj6, (lnm) obj5, (byte) 2);
                v63Var3.d = (wvp0) obj;
                v63Var3.e = (xvp0) obj2;
                v63Var3.f = (vvp0) obj3;
                v63Var3.b = (tqw) obj4;
                v63Var3.invokeSuspend(rih1Var);
                break;
            default:
                iu30 iu30Var4 = this.c;
                v63 v63Var4 = new v63(iu30Var4, (yvp0) obj7, (lgy) obj6, (lnm) obj5, (byte) 3);
                v63Var4.d = (fhu0) obj;
                v63Var4.e = (ghu0) obj2;
                v63Var4.f = (ehu0) obj3;
                v63Var4.b = (tqw) obj4;
                v63Var4.invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        em20 em20VarB;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.h;
        iu30 iu30Var = this.c;
        switch (b) {
            case 0:
                zwg zwgVar = (zwg) obj2;
                s63 s63Var = (s63) this.d;
                t63 t63Var = (t63) this.e;
                r63 r63Var = (r63) this.f;
                tqw tqwVar = this.b;
                hm5.M(obj);
                if (r63Var instanceof q63) {
                    iu30Var.invoke(new v051(new z951(s63Var.a, 3, t63Var.l, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, s63Var.d, (String) null, false, 0, false, false, false, 259568), cvl1.d(tqwVar), ((q63) r63Var).a));
                    return rih1Var;
                }
                if (u890.j(r63Var, o63.a)) {
                    iu30Var.invoke(new cz41(Collections.singletonList(s63Var.a), s63Var.a, t63Var.j, tqwVar != null ? n3o1.y(tqwVar) : null));
                    return rih1Var;
                }
                if (u890.j(r63Var, p63.a)) {
                    ((yhm) zwgVar.c).a(new z73(s63Var.a, new lik1(((e8r0) zwgVar.d).a().e), (String) null, new mb3(true, false, false, (ugo0) null, (String) null, false, 0, false, false, (ok51) null, false, (p860) null, 262141)), cvl1.d(tqwVar));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 1:
                iu30 iu30Var2 = (iu30) this.g;
                dm20 dm20Var = (dm20) this.d;
                Object obj3 = this.e;
                wl20 wl20Var = (wl20) this.f;
                tqw tqwVar2 = this.b;
                hm5.M(obj);
                tm20 tm20Var = (tm20) iu30Var.invoke(obj3);
                if (wl20Var instanceof ul20) {
                    am20 am20Var = tm20Var.c().o.a;
                    xl20 xl20Var = am20Var instanceof xl20 ? (xl20) am20Var : null;
                    if (xl20Var != null && xl20Var.a) {
                        iu30Var2.invoke(new uz41(tm20Var.c().o.b));
                        return rih1Var;
                    }
                    String str = dm20Var.a;
                    String str2 = tm20Var.c().e;
                    int i = tm20Var.c().i.equals(gql.b) ? 3 : tm20Var.c().f;
                    boolean z = tm20Var.c().k;
                    boolean z2 = tm20Var.c().j;
                    iu30Var2.invoke(new v051(new z951(str, i, z, (p7w) null, false, tm20Var.c().q != null, tm20Var.c().q, tm20Var.c().n.c, u951.a, (String) null, str2, tm20Var.c().n.b, tm20Var.c().n.a, tm20Var.c().n.d, false, false, z2, 99376), tqwVar2 != null ? n3o1.y(tqwVar2) : null, ((ul20) wl20Var).a));
                    return rih1Var;
                }
                if (u890.j(wl20Var, sl20.a)) {
                    iu30Var2.invoke(new m151(dm20Var.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null));
                    return rih1Var;
                }
                if (u890.j(wl20Var, vl20.a) || u890.j(wl20Var, tl20.a)) {
                    iu30Var2.invoke(new mz41(dm20Var.a, tqwVar2 != null ? n3o1.y(tqwVar2) : null, tm20Var.c().q != null, false));
                    return rih1Var;
                }
                if (!u890.j(wl20Var, ql20.a) && !u890.j(wl20Var, rl20.a)) {
                    eg.o();
                    return null;
                }
                ne neVar = (ne) obj2;
                String str3 = dm20Var.a;
                fm20 fm20Var = tm20Var instanceof fm20 ? (fm20) tm20Var : null;
                neVar.e(str3, tqwVar2 != null ? n3o1.y(tqwVar2) : null, (fm20Var == null || (em20VarB = fm20Var.b()) == null || !em20VarB.b) ? false : true);
                return rih1Var;
            case 2:
                p410 p410Var = (p410) obj2;
                c4n0 c4n0Var = (c4n0) p410Var.f;
                vgm vgmVar = (vgm) p410Var.e;
                wvp0 wvp0Var = (wvp0) this.d;
                xvp0 xvp0Var = (xvp0) this.e;
                vvp0 vvp0Var = (vvp0) this.f;
                tqw tqwVar3 = this.b;
                hm5.M(obj);
                if (vvp0Var instanceof uvp0) {
                    iu30Var.invoke(new v051(new y951(wvp0Var.a, wvp0Var.f, wvp0Var.g), cvl1.d(tqwVar3), ((uvp0) vvp0Var).a));
                    return rih1Var;
                }
                if (u890.j(vvp0Var, tvp0.b)) {
                    vgm.b(vgmVar, wvp0Var.a, c4n0Var.getViewUri().a, cvl1.d(tqwVar3), (tgm) null, 8);
                    return rih1Var;
                }
                if (u890.j(vvp0Var, tvp0.a)) {
                    vgm.b(vgmVar, wvp0Var.a, c4n0Var.getViewUri().a, cvl1.d(tqwVar3), (tgm) null, 8);
                    return rih1Var;
                }
                if (u890.j(vvp0Var, svp0.a)) {
                    iu30Var.invoke(new m151(wvp0Var.a, cvl1.d(tqwVar3)));
                    return rih1Var;
                }
                if (u890.j(vvp0Var, rvp0.a)) {
                    ((ne) p410Var.g).e(wvp0Var.a, cvl1.d(tqwVar3), xvp0Var.n);
                    return rih1Var;
                }
                eg.o();
                return null;
            default:
                lgy lgyVar = (lgy) obj2;
                fhu0 fhu0Var = (fhu0) this.d;
                ghu0 ghu0Var = (ghu0) this.e;
                ehu0 ehu0Var = (ehu0) this.f;
                tqw tqwVar4 = this.b;
                hm5.M(obj);
                if (ehu0Var instanceof dhu0) {
                    if (!z4p1.z(fhu0Var)) {
                        iu30Var.invoke(new v051(new z951(fhu0Var.a, 3, false, (p7w) null, false, false, (Integer) null, false, u951.a, (String) null, fhu0Var.d, (String) null, false, 0, false, false, false, 259568), tqwVar4 != null ? n3o1.y(tqwVar4) : null, ((dhu0) ehu0Var).a));
                        return rih1Var;
                    }
                    o940 o940Var = fhu0Var.l;
                    iu30Var.invoke(new uz41(o940Var != null ? o940Var.c : null));
                    return rih1Var;
                }
                if (u890.j(ehu0Var, chu0.a)) {
                    iu30Var.invoke(new cz41(Collections.singletonList(fhu0Var.a), fhu0Var.a, ghu0Var.g, tqwVar4 != null ? n3o1.y(tqwVar4) : null));
                    return rih1Var;
                }
                if (!u890.j(ehu0Var, chu0.b)) {
                    eg.o();
                    return null;
                }
                lik1 lik1Var = new lik1(((e8r0) lgyVar.h).a().e);
                tv80 tv80VarD = cvl1.d(tqwVar4);
                eoc0 eoc0Var = new eoc0(fhu0Var.a, lik1Var, mno1.e0);
                if (lgyVar.a) {
                    ((yhm) lgyVar.g).a(eoc0Var, tv80VarD);
                    return rih1Var;
                }
                mfm mfmVarA = ((i4q) lgyVar.f).a(lik1Var);
                Observable observableA = ((ywc0) lgyVar.e).a(eoc0Var);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.b(mfmVarA, observableA, yon1.a1(), (bjm) null, tv80VarD, 20);
                return rih1Var;
        }
    }
}
