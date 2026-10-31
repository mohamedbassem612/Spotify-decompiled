package p;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import androidx.work.CoroutineWorker;
import com.ravelin.core.model.Connectivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import java.text.SimpleDateFormat;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mx extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mx(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new mx((ox) obj2, lnmVar, (byte) 0);
            case 1:
                return new mx((ycc1) obj2, lnmVar, (byte) 1);
            case 2:
                return new mx((w62) obj2, lnmVar, (byte) 2);
            case 3:
                return new mx((rj2) obj2, lnmVar, (byte) 3);
            case 4:
                return new mx((bj5) obj2, lnmVar, (byte) 4);
            case 5:
                return new mx((ot7) obj2, lnmVar, (byte) 5);
            case 6:
                return new mx((dlf) obj2, lnmVar, (byte) 6);
            case 7:
                return new mx((zug) obj2, lnmVar, (byte) 7);
            case 8:
                mx mxVar = new mx((wbh) obj2, lnmVar, (byte) 8);
                mxVar.b = ((Boolean) obj).booleanValue();
                return mxVar;
            case 9:
                return new mx((z2k) obj2, lnmVar, (byte) 9);
            case 10:
                return new mx((m8l) obj2, lnmVar, (byte) 10);
            case 11:
                return new mx((g1i) obj2, lnmVar, (byte) 11);
            case 12:
                return new mx((CoroutineWorker) obj2, lnmVar, (byte) 12);
            case 13:
                return new mx((njr) obj2, lnmVar, (byte) 13);
            case 14:
                return new mx((clr) obj2, lnmVar, (byte) 14);
            case 15:
                return new mx((cks) obj2, lnmVar, (byte) 15);
            case 16:
                return new mx((hks) obj2, lnmVar, (byte) 16);
            case 17:
                return new mx((txs) obj2, lnmVar, (byte) 17);
            case 18:
                return new mx((iu30) obj2, lnmVar, (byte) 18);
            case 19:
                return new mx((Context) obj2, lnmVar, (byte) 19);
            case 20:
                return new mx((el00) obj2, lnmVar, (byte) 20);
            case 21:
                return new mx((si20) obj2, lnmVar, (byte) 21);
            case 22:
                return new mx((mr20) obj2, lnmVar, (byte) 22);
            case 23:
                return new mx((my20) obj2, lnmVar, (byte) 23);
            case 24:
                return new mx((h950) obj2, lnmVar, (byte) 24);
            case 25:
                return new mx((v480) obj2, lnmVar, (byte) 25);
            case 26:
                return new mx((w590) obj2, lnmVar, (byte) 26);
            case 27:
                return new mx((ec90) obj2, lnmVar, (byte) 27);
            case 28:
                return new mx((k0d0) obj2, lnmVar, (byte) 28);
            default:
                return new mx((y2e0) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invoke(Object obj, Object obj2) throws KotlinNothingValueException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 2:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 3:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 4:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 5:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 6:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 7:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 8:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((mx) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 10:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 11:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 12:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 13:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 14:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 15:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 16:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 17:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 18:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 19:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 20:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 21:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 22:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 23:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 24:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 25:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 26:
                ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
                return d9n.a;
            case 27:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 28:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            default:
                return ((mx) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final Object invokeSuspend(Object obj) throws KotlinNothingValueException {
        Handler handler;
        Handler handler2;
        byte b = 10;
        byte b2 = 12;
        byte b3 = 0;
        byte b4 = 2;
        lnm lnmVar = null;
        switch (this.a) {
            case 0:
                d9n d9nVar = d9n.a;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ox oxVar = (ox) this.c;
                    this.b = true;
                    bma1 bma1Var = ox.h;
                    obj = c921.H(oxVar.g, new lx(oxVar, (lnm) null, (byte) 0), this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return yah0.m(!((Boolean) obj).booleanValue());
            case 1:
                d9n d9nVar2 = d9n.a;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    trd1 trd1VarC = ycc1.c((ycc1) this.c);
                    Map mapT = zno1.t(oqn1.n("focus", "false"));
                    this.b = true;
                    if (c921.H(trd1VarC.b, new pec1(trd1VarC, mapT, (lnm) null, (byte) 10), this) == d9nVar2) {
                        return d9nVar2;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 2:
                w62 w62Var = (w62) this.c;
                d9n d9nVar3 = d9n.a;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    any anyVarN = f5p1.n(qqn1.f(w62.c(w62Var)));
                    q4 q4Var = new q4(w62Var, (lnm) null, (byte) 24);
                    this.b = true;
                    if (l4p1.q(anyVarN, q4Var, this) == d9nVar3) {
                        return d9nVar3;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 3:
                d9n d9nVar4 = rih1.a;
                d9n d9nVar5 = d9n.a;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    ((rj2) this.c).e.getClass();
                    this.b = true;
                    if (d9nVar4 == d9nVar5) {
                        return d9nVar5;
                    }
                } else {
                    if (!z4) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return d9nVar4;
            case 4:
                rih1 rih1Var = rih1.a;
                bj5 bj5Var = (bj5) this.c;
                d9n d9nVar6 = d9n.a;
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    s2b1 s2b1Var = (s2b1) bj5Var.Z.get();
                    Application application = bj5Var.g;
                    this.b = true;
                    Object objH = c921.H(s2b1Var.d, new wp41(s2b1Var, application, (lnm) null, (byte) 27), this);
                    if (objH != d9nVar6) {
                        objH = rih1Var;
                    }
                    if (objH == d9nVar6) {
                        return d9nVar6;
                    }
                } else {
                    if (!z5) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 5:
                ot7 ot7Var = (ot7) this.c;
                d9n d9nVar7 = d9n.a;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    x8c0 lifecycle = ot7Var.a.getLifecycle();
                    w8c0 w8c0Var = w8c0.d;
                    vk6 vk6Var = new vk6(ot7Var, (lnm) null, (byte) 3);
                    this.b = true;
                    if (z8p1.t(lifecycle, w8c0Var, vk6Var, this) == d9nVar7) {
                        return d9nVar7;
                    }
                } else {
                    if (!z6) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 6:
                dlf dlfVar = (dlf) this.c;
                AtomicBoolean atomicBoolean = dlfVar.d;
                d9n d9nVar8 = d9n.a;
                boolean z7 = this.b;
                try {
                    if (!z7) {
                        hm5.M(obj);
                        Flowable flowable = dlfVar.a;
                        vbm[] vbmVarArr = q601.a;
                        lt20 lt20VarH = x4p1.h(f5p1.q(new h6a(rqt0.v(new kge(flowable), xj.S0), (byte) 1), new awe(dlfVar, (lnm) null, (byte) 2)), new jk((byte) 13));
                        this.b = true;
                        if (l4p1.p(lt20VarH, this) == d9nVar8) {
                            return d9nVar8;
                        }
                    } else {
                        if (!z7) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    atomicBoolean.set(false);
                    return rih1.a;
                } catch (Throwable th) {
                    atomicBoolean.set(false);
                    throw th;
                }
            case 7:
                d9n d9nVar9 = d9n.a;
                boolean z8 = this.b;
                if (!z8) {
                    hm5.M(obj);
                    t6n1 t6n1VarS = zug.s((zug) this.c);
                    this.b = true;
                    obj = t6n1VarS.c(this);
                    if (obj == d9nVar9) {
                        return d9nVar9;
                    }
                } else {
                    if (!z8) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return new Connectivity(obj instanceof String ? (String) obj : null, (String) null, 2, (DefaultConstructorMarker) null);
            case 8:
                boolean z9 = this.b;
                hm5.M(obj);
                wbh wbhVar = (wbh) this.c;
                if (z9) {
                    synchronized (wbhVar) {
                        if (wbhVar.e && (handler2 = wbhVar.c) != null) {
                            handler2.sendEmptyMessage(3);
                        }
                        break;
                    }
                } else {
                    synchronized (wbhVar) {
                        if (wbhVar.e && (handler = wbhVar.c) != null) {
                            handler.sendEmptyMessage(4);
                        }
                        break;
                    }
                }
                return rih1.a;
            case 9:
                rih1 rih1Var2 = rih1.a;
                d9n d9nVar10 = d9n.a;
                boolean z10 = this.b;
                if (!z10) {
                    hm5.M(obj);
                    z2k z2kVar = (z2k) this.c;
                    this.b = true;
                    Object objCollect = h5p1.s(z2kVar.s, z2kVar.t, hu20.e(z2kVar.u, new b7c((lnm) null, z2kVar, (byte) 12)), new v2k()).collect(new w2k(z2kVar, (byte) 0), this);
                    if (objCollect != d9nVar10) {
                        objCollect = rih1Var2;
                    }
                    if (objCollect == d9nVar10) {
                        return d9nVar10;
                    }
                } else {
                    if (!z10) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var2;
            case 10:
                rih1 rih1Var3 = rih1.a;
                d9n d9nVar11 = d9n.a;
                boolean z11 = this.b;
                if (z11) {
                    if (z11) {
                        hm5.M(obj);
                        return rih1Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m8l m8lVar = (m8l) this.c;
                this.b = true;
                m8lVar.c.d.collect(new cff(m8lVar, b4), this);
                return d9nVar11;
            case 11:
                g1i g1iVar = (g1i) this.c;
                d9n d9nVar12 = d9n.a;
                boolean z12 = this.b;
                if (!z12) {
                    hm5.M(obj);
                    x8c0 lifecycle2 = g1i.h(g1iVar).getLifecycle();
                    w8c0 w8c0Var2 = w8c0.d;
                    awe aweVar = new awe(g1iVar, (lnm) null, (byte) 24);
                    this.b = true;
                    if (z8p1.t(lifecycle2, w8c0Var2, aweVar, this) == d9nVar12) {
                        return d9nVar12;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 12:
                d9n d9nVar13 = d9n.a;
                boolean z13 = this.b;
                if (z13) {
                    if (z13) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                CoroutineWorker coroutineWorker = (CoroutineWorker) this.c;
                this.b = true;
                Object objF = coroutineWorker.f(this);
                return objF == d9nVar13 ? d9nVar13 : objF;
            case 13:
                rih1 rih1Var4 = rih1.a;
                d9n d9nVar14 = d9n.a;
                boolean z14 = this.b;
                if (!z14) {
                    hm5.M(obj);
                    njr njrVar = (njr) this.c;
                    this.b = true;
                    SimpleDateFormat simpleDateFormat = njr.j;
                    long jIntValue = ((Number) njrVar.e.m.b()).intValue();
                    zob1 zob1Var = (zob1) njrVar.a.a.h.getValue();
                    ytw0 ytw0Var = jfv.b;
                    Object objCollect2 = fbp1.r(zob1Var, fdg1.l0(jIntValue, ngv.d)).collect(new fdd(njrVar, (byte) 29), this);
                    if (objCollect2 != d9nVar14) {
                        objCollect2 = rih1Var4;
                    }
                    if (objCollect2 == d9nVar14) {
                        return d9nVar14;
                    }
                } else {
                    if (!z14) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var4;
            case 14:
                clr clrVar = (clr) this.c;
                d9n d9nVar15 = d9n.a;
                boolean z15 = this.b;
                if (!z15) {
                    hm5.M(obj);
                    ezc ezcVarG = yoi1.g(clrVar.f.c().distinctUntilChanged());
                    blr blrVar = new blr(clrVar, lnmVar, b3);
                    this.b = true;
                    if (l4p1.q(ezcVarG, blrVar, this) == d9nVar15) {
                        return d9nVar15;
                    }
                } else {
                    if (!z15) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 15:
                d9n d9nVar16 = d9n.a;
                boolean z16 = this.b;
                if (!z16) {
                    hm5.M(obj);
                    cks cksVar = (cks) this.c;
                    tac0 tac0Var = cksVar.b.a;
                    w8c0 w8c0Var3 = w8c0.c;
                    n1o n1oVar = new n1o(cksVar, (lnm) null, (byte) 19);
                    this.b = true;
                    if (z8p1.t(tac0Var, w8c0Var3, n1oVar, this) == d9nVar16) {
                        return d9nVar16;
                    }
                } else {
                    if (!z16) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 16:
                d9n d9nVar17 = d9n.a;
                boolean z17 = this.b;
                if (!z17) {
                    hm5.M(obj);
                    hks hksVar = (hks) this.c;
                    ezc ezcVar = hksVar.g;
                    if (ezcVar != null) {
                        cff cffVar = new cff(hksVar, (byte) 5);
                        this.b = true;
                        if (ezcVar.collect(cffVar, this) == d9nVar17) {
                            return d9nVar17;
                        }
                    }
                } else {
                    if (!z17) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 17:
                d9n d9nVar18 = d9n.a;
                boolean z18 = this.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1.a;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                txs txsVar = (txs) this.c;
                dt71 dt71Var = txsVar.d.f;
                vi viVar = new vi(txsVar.n, (byte) 4);
                this.b = true;
                dt71Var.collect(viVar, this);
                return d9nVar18;
            case 18:
                d9n d9nVar19 = d9n.a;
                boolean z19 = this.b;
                if (!z19) {
                    hm5.M(obj);
                    iu30 iu30Var = (iu30) this.c;
                    this.b = true;
                    if (iu30Var.invoke(this) == d9nVar19) {
                        return d9nVar19;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 19:
                d9n d9nVar20 = d9n.a;
                boolean z20 = this.b;
                if (!z20) {
                    hm5.M(obj);
                    uwg uwgVar = uwg.O0;
                    Context context = (Context) this.c;
                    this.b = true;
                    if (uwgVar.a(context, this) == d9nVar20) {
                        return d9nVar20;
                    }
                } else {
                    if (!z20) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 20:
                el00 el00Var = (el00) this.c;
                d9n d9nVar21 = d9n.a;
                boolean z21 = this.b;
                if (!z21) {
                    hm5.M(obj);
                    wt20 wt20VarF = z4p1.F(el00Var.c.X.b(), 1);
                    cff cffVar2 = new cff(el00Var, (byte) 6);
                    this.b = true;
                    if (wt20VarF.collect(cffVar2, this) == d9nVar21) {
                        return d9nVar21;
                    }
                } else {
                    if (!z21) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 21:
                d9n d9nVar22 = d9n.a;
                boolean z22 = this.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarJ = y7y0.J(((si20) this.c).b);
                this.b = true;
                Object objI = b5p1.i(ezcVarJ, this);
                return objI == d9nVar22 ? d9nVar22 : objI;
            case 22:
                d9n d9nVar23 = d9n.a;
                boolean z23 = this.b;
                if (!z23) {
                    hm5.M(obj);
                    mr20 mr20Var = (mr20) this.c;
                    this.b = true;
                    if (l4p1.p(mr20Var, this) == d9nVar23) {
                        return d9nVar23;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 23:
                my20 my20Var = (my20) this.c;
                d9n d9nVar24 = d9n.a;
                boolean z24 = this.b;
                if (!z24) {
                    hm5.M(obj);
                    any anyVar = new any(my20Var.O0.c(), (byte) 22);
                    cff cffVar3 = new cff(my20Var, b);
                    this.b = true;
                    if (anyVar.collect(cffVar3, this) == d9nVar24) {
                        return d9nVar24;
                    }
                } else {
                    if (!z24) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 24:
                h950 h950Var = (h950) this.c;
                d9n d9nVar25 = d9n.a;
                boolean z25 = this.b;
                if (!z25) {
                    hm5.M(obj);
                    ezc ezcVarG2 = yoi1.g(h950Var.b.k());
                    cff cffVar4 = new cff(h950Var, (byte) 11);
                    this.b = true;
                    if (ezcVarG2.collect(cffVar4, this) == d9nVar25) {
                        return d9nVar25;
                    }
                } else {
                    if (!z25) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 25:
                v480 v480Var = (v480) this.c;
                d9n d9nVar26 = d9n.a;
                boolean z26 = this.b;
                if (!z26) {
                    hm5.M(obj);
                    ezc ezcVarF = h4p1.f(new x060(v480Var, (lnm) null, (byte) 16));
                    xp10 xp10Var = new xp10(v480Var, (byte) 19);
                    this.b = true;
                    if (ezcVarF.collect(xp10Var, this) == d9nVar26) {
                        return d9nVar26;
                    }
                } else {
                    if (!z26) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 26:
                w590 w590Var = (w590) this.c;
                d9n d9nVar27 = d9n.a;
                boolean z27 = this.b;
                if (z27) {
                    if (z27) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bpb1 bpb1VarB = w590.e(w590Var).b();
                cff cffVar5 = new cff(w590Var, b2);
                this.b = true;
                bpb1VarB.collect(cffVar5, this);
                return d9nVar27;
            case 27:
                d9n d9nVar28 = d9n.a;
                boolean z28 = this.b;
                if (!z28) {
                    hm5.M(obj);
                    bvg1 bvg1Var = ((ec90) this.c).b;
                    this.b = true;
                    if (bvg1Var.f(this) == d9nVar28) {
                        return d9nVar28;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            case 28:
                k0d0 k0d0Var = (k0d0) this.c;
                d9n d9nVar29 = d9n.a;
                boolean z29 = this.b;
                if (!z29) {
                    hm5.M(obj);
                    evz evzVar = (evz) k0d0.m(k0d0Var).a;
                    p5b0 p5b0Var = new p5b0(k0d0Var, (byte) 2);
                    this.b = true;
                    if (evzVar.collect(p5b0Var, this) == d9nVar29) {
                        return d9nVar29;
                    }
                } else {
                    if (!z29) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                d9n d9nVar30 = d9n.a;
                boolean z30 = this.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Observable observableA = ((y2e0) this.c).h.a(true);
                this.b = true;
                Object objL = fc11.l(observableA, 1, (Object) null, this);
                return objL == d9nVar30 ? d9nVar30 : objL;
        }
    }
}
