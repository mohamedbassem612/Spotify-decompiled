package p;

import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.spotify.base.java.logging.Logger;
import com.spotify.scrollsita.v1.Section;
import com.spotify.share.audioparamstestpage.a;
import com.spotify.wrapped.v1.proto.SceneTemplate;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wc5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc5(jkr0 jkr0Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 5;
        this.c = jkr0Var;
        this.e = ven0Var;
        this.d = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                wc5 wc5Var = new wc5(obj2, this.e, lnmVar, (byte) 0);
                wc5Var.c = obj;
                return wc5Var;
            case 1:
                return new wc5((ws40) this.c, (Context) obj2, (kx5) this.e, lnmVar, (byte) 1);
            case 2:
                return new wc5((vu30) this.c, (ab6) obj2, (ja6) this.e, lnmVar, (byte) 2);
            case 3:
                return new wc5((js6) this.c, (String) obj2, (String) this.e, lnmVar, (byte) 3);
            case 4:
                return new wc5((js6) this.c, (lik1) obj2, (String) this.e, lnmVar, (byte) 4);
            case 5:
                return new wc5((jkr0) this.c, (ven0) this.e, (ven0) obj2, lnmVar);
            case 6:
                return new wc5((vu30) this.c, (xtb0) obj2, (ven0) this.e, lnmVar, (byte) 6);
            case 7:
                return new wc5((c380) this.c, (xtb0) obj2, (String) this.e, lnmVar, (byte) 7);
            case 8:
                wc5 wc5Var2 = new wc5(obj2, this.e, lnmVar, (byte) 8);
                wc5Var2.c = obj;
                return wc5Var2;
            case 9:
                return new wc5((iac0) this.c, (ttm0) obj2, (ec7) this.e, lnmVar, (byte) 9);
            case 10:
                return new wc5((r091) this.c, (lsm0) obj2, (i091) this.e, lnmVar, (byte) 10);
            case 11:
                wc5 wc5Var3 = new wc5(obj2, this.e, lnmVar, (byte) 11);
                wc5Var3.c = obj;
                return wc5Var3;
            case 12:
                return new wc5((wh41) this.c, (String) obj2, (gq7) this.e, lnmVar, (byte) 12);
            case 13:
                return new wc5((d0r) this.c, (gq7) obj2, (String) this.e, lnmVar, (byte) 13);
            case 14:
                return new wc5((rwj) this.c, (pv7) obj2, (iu30) this.e, lnmVar, (byte) 14);
            case 15:
                return new wc5((yxb0) this.c, (bw7) obj2, (iu30) this.e, lnmVar, (byte) 15);
            case 16:
                return new wc5((a) this.c, (iy7) obj2, (ven0) this.e, lnmVar, (byte) 16);
            case 17:
                wc5 wc5Var4 = new wc5(obj2, this.e, lnmVar, (byte) 17);
                wc5Var4.c = obj;
                return wc5Var4;
            case 18:
                return new wc5((x4p1) this.c, (yqg) obj2, (drr0) this.e, lnmVar, (byte) 18);
            case 19:
                return new wc5((m441) this.c, (ssw0) obj2, (ig01) this.e, lnmVar, (byte) 19);
            case 20:
                return new wc5((bo8) this.c, (lik1) obj2, (String) this.e, lnmVar, (byte) 20);
            case 21:
                return new wc5((vu30) this.c, (o8n) obj2, (wen0) this.e, lnmVar, (byte) 21);
            case 22:
                return new wc5((ca9) this.c, (ven0) obj2, lnmVar);
            case 23:
                return new wc5((c21) this.c, (String) obj2, (qev) this.e, lnmVar, (byte) 23);
            case 24:
                return new wc5((ek1) this.c, (String) obj2, (String) this.e, lnmVar, (byte) 24);
            case 25:
                return new wc5((y6a) this.c, (z7a) obj2, (d3j0) this.e, lnmVar, (byte) 25);
            case 26:
                wc5 wc5Var5 = new wc5(obj2, this.e, lnmVar, (byte) 26);
                wc5Var5.c = obj;
                return wc5Var5;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                wc5 wc5Var6 = new wc5(obj2, this.e, lnmVar, (byte) 27);
                wc5Var6.c = obj;
                return wc5Var6;
            case 28:
                wc5 wc5Var7 = new wc5(obj2, this.e, lnmVar, (byte) 28);
                wc5Var7.c = obj;
                return wc5Var7;
            default:
                return new wc5((g7m1) this.c, (SceneTemplate.BespokeListeningAgeContent.Card2) obj2, (qla) this.e, lnmVar, (byte) 29);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((nsw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 7:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 8:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 9:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 10:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 11:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 13:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 14:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 15:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 16:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 17:
                return create((ssw0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 19:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 21:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 22:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 23:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 24:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 25:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 26:
                return create((vr20) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 28:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, p.lnm, p.onm, p.wc5] */
    /* JADX WARN: Type inference failed for: r0v44, types: [p.wc5] */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v81 */
    /* JADX WARN: Type inference failed for: r0v82 */
    /* JADX WARN: Type inference failed for: r0v83 */
    /* JADX WARN: Type inference failed for: r1v60, types: [p.wh41] */
    /* JADX WARN: Type inference failed for: r1v81, types: [com.spotify.share.audioparamstestpage.a] */
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objInvoke;
        Object objO;
        dhe m231Var;
        Object objG;
        ven0 ven0Var;
        Object objY;
        Object objU;
        ?? r0 = this;
        byte b = r0.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = r0.d;
        rih1 rih1Var2 = d9n.a;
        switch (b) {
            case 0:
                bjg1 bjg1Var = (bjg1) obj2;
                boolean z = r0.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                nsw0 nsw0Var = (nsw0) r0.c;
                m441 m441VarQ = rwq.q(new f85(bjg1Var, (byte) 16));
                h50 h50Var = new h50(nsw0Var, bjg1Var, (ven0) r0.e, (byte) 6);
                r0.b = true;
                return m441VarQ.collect(h50Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 1:
                boolean z2 = r0.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                kx5 kx5Var = (kx5) r0.e;
                r0.b = true;
                ((ws40) r0.c).d((Context) obj2, kx5Var, (lnm) r0);
                return rih1Var2;
            case 2:
                ja6 ja6Var = (ja6) r0.e;
                boolean z3 = r0.b;
                try {
                    if (!z3) {
                        hm5.M(obj);
                        r0.b = true;
                        objInvoke = ((vu30) r0.c).invoke((ab6) obj2, (Object) r0);
                        if (objInvoke == rih1Var2) {
                            return rih1Var2;
                        }
                    } else {
                        if (!z3) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objInvoke = obj;
                    }
                    kfn0 kfn0Var = (lfn0) objInvoke;
                    if (!(kfn0Var instanceof kfn0)) {
                        if (!(kfn0Var instanceof jfn0)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        Logger.d("GOS->Artisanal Cast mutation rejected: ".concat(((jfn0) kfn0Var).a), new Object[0]);
                    } else if (a6o1.p(ja6Var.f)) {
                        ja6Var.X = new Long(kfn0Var.a);
                        ja6Var.n(ja6Var.f);
                    }
                } catch (Exception e) {
                    Logger.e(e, "GOS->Artisanal Cast mutation failed", new Object[0]);
                } finally {
                    ja6Var.t = false;
                }
                return rih1Var;
            case 3:
                boolean z4 = r0.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ms6 ms6Var = ((js6) r0.c).d;
                String str = (String) r0.e;
                r0.b = true;
                Object objA = ms6Var.a(str, (onm) r0);
                return objA == rih1Var2 ? rih1Var2 : objA;
            case 4:
                boolean z5 = r0.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG = yoi1.g(((js6) r0.c).g.b((String) r0.e, (lik1) obj2));
                r0.b = true;
                Object objI = b5p1.i(ezcVarG, (lnm) r0);
                return objI == rih1Var2 ? rih1Var2 : objI;
            case 5:
                boolean z6 = r0.b;
                if (z6) {
                    if (z6) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                m441 m441VarQ2 = rwq.q(new of((jkr0) r0.c, (byte) 3));
                g27 g27Var = new g27((ven0) r0.e, (ven0) obj2, (byte) 0);
                r0.b = true;
                return m441VarQ2.collect(g27Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 6:
                ven0 ven0Var2 = (ven0) r0.e;
                xtb0 xtb0Var = (xtb0) obj2;
                vu30 vu30Var = (vu30) r0.c;
                boolean z7 = r0.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                vu30Var.invoke(new Integer(b87.j(xtb0Var, ven0Var2)), Boolean.TRUE);
                mr20 mr20VarU = rqt0.u(rwq.q(new w77(xtb0Var, ven0Var2, (byte) 0)));
                hb0 hb0Var = new hb0(vu30Var, (byte) 15);
                r0.b = true;
                return mr20VarU.collect(hb0Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 7:
                xtb0 xtb0Var2 = (xtb0) obj2;
                c380 c380Var = (c380) r0.c;
                boolean z8 = r0.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str2 = (String) r0.e;
                Iterator it = c380Var.iterator();
                int i = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i = -1;
                    } else if (!u890.j(((yrd) it.next()).e, str2)) {
                        i++;
                    }
                }
                if (i < 0 || c380Var.isEmpty()) {
                    return rih1Var;
                }
                ptb0 ptb0VarH = xtb0Var2.h();
                List list = ptb0VarH.l;
                int i2 = ptb0VarH.n;
                int i3 = ptb0VarH.m;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    qtb0 qtb0Var = (qtb0) obj3;
                    int i4 = qtb0Var.p;
                    int i5 = qtb0Var.q + i4;
                    if (i4 >= i3 && i5 <= i2) {
                        arrayList.add(obj3);
                    }
                }
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new Integer(((qtb0) it2.next()).a));
                }
                if (arrayList2.contains(new Integer(i))) {
                    return rih1Var;
                }
                int i6 = i - 1;
                if (i6 < 0) {
                    i6 = 0;
                }
                r0.b = true;
                return xtb0Var2.f(i6, 0, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 8:
                y87 y87Var = (y87) obj2;
                ssw0 ssw0Var = (ssw0) r0.c;
                boolean z9 = r0.b;
                if (z9) {
                    if (z9) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                AtomicReference atomicReference = new AtomicReference(w7x.a);
                AtomicReference atomicReference2 = new AtomicReference(b7x.a);
                fn31.T(ssw0Var, (o8n) null, 0, new bh((c64) r0.e, atomicReference, ssw0Var, atomicReference2, (lnm) null, (byte) 21), 3);
                mr20 mr20VarC = y87Var.f.c();
                u60 u60Var = new u60(atomicReference, y87Var, ssw0Var, atomicReference2, (byte) 7);
                r0.c = null;
                r0.b = true;
                return mr20VarC.collect(u60Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 9:
                boolean z10 = r0.b;
                if (z10) {
                    if (z10) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                x8c0 lifecycle = ((iac0) r0.c).getLifecycle();
                wt wtVar = new wt((ttm0) obj2, (ec7) r0.e, (lnm) null, (byte) 12);
                r0.b = true;
                return z8p1.t(lifecycle, w8c0.d, wtVar, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 10:
                r091 r091Var = (r091) r0.c;
                boolean z11 = r0.b;
                if (!z11) {
                    l811 l811VarY = l1d.y(obj);
                    ht20 ht20Var = new ht20(new dc7(r091Var.g, (lsm0) obj2, (byte) 0), new ac7((i091) r0.e, (lnm) null, (byte) 0), (byte) 2);
                    hb1 hb1Var = new hb1(l811VarY, r091Var, (lnm) null, (byte) 19);
                    r0.b = true;
                    if (b5p1.j(ht20Var, hb1Var, (lnm) r0) == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z11) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                r091Var.c();
                return rih1Var;
            case 11:
                c9n c9nVar = (c9n) r0.c;
                boolean z12 = r0.b;
                if (!z12) {
                    hm5.M(obj);
                    wh7 wh7Var = new wh7((xh7) obj2, null, (byte) 1);
                    r0.c = c9nVar;
                    r0.b = true;
                    objO = rc2.O(10000L, wh7Var, (lnm) r0);
                    if (objO == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z12) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objO = obj;
                }
                if (((Boolean) objO) == null) {
                    return rih1Var;
                }
                try {
                    FirebaseCrashlytics.getInstance().recordException((IllegalStateException) r0.e);
                    return rih1Var;
                } catch (Throwable unused) {
                    return rih1Var;
                }
            case 12:
                boolean z13 = r0.b;
                try {
                    if (z13) {
                        if (z13) {
                            hm5.M(obj);
                            objG = obj;
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    ?? r1 = (wh41) r0.c;
                    String str3 = (String) obj2;
                    String str4 = ((gq7) r0.e).a.a;
                    r0.b = true;
                    objG = r1.g(str3, str4, r0);
                    if (objG == rih1Var2) {
                        return rih1Var2;
                    }
                    m231Var = (dhe) objG;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (!(m231Var instanceof m231)) {
                    return m231Var;
                }
                return null;
            case 13:
                boolean z14 = r0.b;
                if (z14) {
                    if (z14) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                d0r d0rVar = (d0r) r0.c;
                o3r o3rVar = sq7.h;
                vp7 vp7Var = ((gq7) obj2).a;
                vp7 vp7Var2 = new vp7((String) r0.e);
                r0.b = true;
                Object objF = fq7.F(d0rVar, o3rVar, vp7Var2, r0);
                return objF == rih1Var2 ? rih1Var2 : objF;
            case 14:
                rwj rwjVar = (rwj) r0.c;
                dw7 dw7Var = (dw7) rwjVar.f;
                boolean z15 = r0.b;
                if (z15) {
                    if (z15) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Flowable flowableJ = ((Flowable) rwjVar.d).j(mo9.Q0);
                vbm[] vbmVarArr = q601.a;
                evz evzVarR = h5p1.r(new kge(flowableJ), ((yge0) rwjVar.e).h(), yoi1.g(dw7Var.f.map(cxo1.i)), new x010(yoi1.g(dw7Var.d), new nf(yoi1.g(dw7Var.f), (byte) 15), new l2(3, (lnm) null, (byte) 10), (byte) 1), new gz0((pv7) obj2, (lnm) null, (byte) 3));
                qv7 qv7Var = new qv7((iu30) r0.e, (byte) 0);
                r0.b = true;
                return evzVarR.collect(qv7Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 15:
                boolean z16 = r0.b;
                if (z16) {
                    if (z16) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                haa0 haa0Var = (haa0) ((yxb0) r0.c).d;
                x010 x010Var = new x010((fbb0) haa0Var.c, (fbb0) haa0Var.d, new qr0((bw7) obj2, (lnm) null, (byte) 4), (byte) 1);
                py5 py5Var = new py5((iu30) r0.e, (lnm) null, (byte) 1);
                r0.b = true;
                return l4p1.q(x010Var, py5Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 16:
                boolean z17 = r0.b;
                try {
                    if (!z17) {
                        hm5.M(obj);
                        r0.b = true;
                        Object objB = ((a) r0.c).b((iy7) obj2, r0);
                        r0 = objB;
                        if (objB == rih1Var2) {
                            rih1Var = rih1Var2;
                            r0 = objB;
                        }
                    } else {
                        if (!z17) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        r0 = r0;
                    }
                    return rih1Var;
                } catch (Exception unused2) {
                    ((ven0) r0.e).setValue("Unable to open the share menu.");
                    return rih1Var;
                }
            case 17:
                yo00 yo00Var = (yo00) obj2;
                ssw0 ssw0Var2 = (ssw0) r0.c;
                boolean z18 = r0.b;
                if (z18) {
                    if (z18) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                oz7 oz7Var = new oz7(ssw0Var2, (yqg) r0.e, yo00Var);
                yo00Var.m.a(oz7Var);
                z77 z77Var = new z77(yo00Var, oz7Var, (byte) 11);
                r0.c = null;
                r0.b = true;
                return jch0.s(ssw0Var2, z77Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 18:
                drr0 drr0Var = (drr0) r0.e;
                x4p1 x4p1Var = (x4p1) r0.c;
                boolean z19 = r0.b;
                if (!z19) {
                    hm5.M(obj);
                    if (!(x4p1Var instanceof qfu0) || ((qfu0) x4p1Var).d == 0) {
                        drr0Var.t(0.0f);
                        return rih1Var;
                    }
                } else {
                    if (!z19) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                do {
                    qfu0 qfu0Var = (qfu0) x4p1Var;
                    drr0Var.t(((((yqg) obj2).b() - qfu0Var.e) + qfu0Var.c) / qfu0Var.d);
                    r0.b = true;
                } while (hap1.i(50L, (lnm) r0) != rih1Var2);
                return rih1Var2;
            case 19:
                boolean z20 = r0.b;
                try {
                    if (!z20) {
                        hm5.M(obj);
                        m441 m441Var = (m441) r0.c;
                        hb0 hb0Var2 = new hb0((ig01) r0.e, (byte) 17);
                        r0.b = true;
                        if (m441Var.collect(hb0Var2, (lnm) r0) == rih1Var2) {
                            rih1Var = rih1Var2;
                        }
                    } else {
                        if (!z20) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return rih1Var;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th2) {
                    ((ssw0) obj2).H(th2);
                    return rih1Var;
                }
            case 20:
                boolean z21 = r0.b;
                if (z21) {
                    if (z21) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str5 = (String) r0.e;
                r0.b = true;
                Object objL = ((bo8) r0.c).f.l((lik1) obj2, str5, e2t0.f, (onm) r0);
                return objL == rih1Var2 ? rih1Var2 : objL;
            case 21:
                boolean z22 = r0.b;
                if (z22) {
                    if (z22) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarR = o4p1.r(new m441((vu30) r0.c), (o8n) obj2);
                zx8 zx8Var = new zx8((wen0) r0.e, (byte) 0);
                r0.b = true;
                return mr20VarR.collect(zx8Var, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case 22:
                boolean z23 = r0.b;
                if (!z23) {
                    hm5.M(obj);
                    ven0Var = (ven0) obj2;
                    fns fnsVar = igu.a;
                    b3s b3sVar = b3s.c;
                    kk kkVar = new kk((ca9) r0.c, (lnm) null, (byte) 19);
                    r0.e = ven0Var;
                    r0.b = true;
                    objY = fn31.Y(b3sVar, kkVar, (lnm) r0);
                    if (objY == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z23) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0 ven0Var3 = (ven0) r0.e;
                    hm5.M(obj);
                    ven0Var = ven0Var3;
                    objY = obj;
                }
                Boolean bool = (Boolean) objY;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 23:
                boolean z24 = r0.b;
                if (!z24) {
                    hm5.M(obj);
                    qev qevVar = (qev) r0.e;
                    r0.b = true;
                    return ((c21) r0.c).v((String) obj2, qevVar, (onm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z24) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 24:
                boolean z25 = r0.b;
                if (z25) {
                    if (z25) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                String str6 = (String) r0.e;
                r0.b = true;
                Object objD = ((ijr) ((ek1) r0.c).b).d((String) obj2, str6, (onm) r0);
                return objD == rih1Var2 ? rih1Var2 : objD;
            case 25:
                boolean z26 = r0.b;
                if (!z26) {
                    hm5.M(obj);
                    d3j0 d3j0Var = (d3j0) r0.e;
                    r0.b = true;
                    return ((y6a) r0.c).a((z7a) obj2, d3j0Var, (onm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
                }
                if (z26) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 26:
                vr20 vr20Var = (vr20) r0.c;
                boolean z27 = r0.b;
                if (z27) {
                    if (z27) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarP = ((xrc0) obj2).p(new rxc0((String) r0.e));
                r0.c = null;
                r0.b = true;
                return l4p1.s(vr20Var, mr20VarP, (lnm) r0) == rih1Var2 ? rih1Var2 : rih1Var;
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                c9n c9nVar2 = (c9n) r0.c;
                boolean z28 = r0.b;
                if (!z28) {
                    hm5.M(obj);
                    List<mmr0> list2 = (List) obj2;
                    tca tcaVar = (tca) r0.e;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                    for (mmr0 mmr0Var : list2) {
                        arrayList3.add(fn31.q(c9nVar2, (o8n) null, 0, new zi3(tcaVar, (vjh0) mmr0Var.b, ((Number) mmr0Var.a).intValue(), (lnm) null, (byte) 2), 3));
                    }
                    r0.c = null;
                    r0.b = true;
                    objU = o1p1.u(arrayList3, (lnm) r0);
                    if (objU == rih1Var2) {
                        return rih1Var2;
                    }
                } else {
                    if (!z28) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return o7h.o0((Iterable) objU);
            case 28:
                c9n c9nVar3 = (c9n) r0.c;
                boolean z29 = r0.b;
                if (z29) {
                    if (z29) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list3 = (List) obj2;
                ic9 ic9Var = (ic9) r0.e;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList4.add(fn31.q(c9nVar3, (o8n) null, 0, new w7a(ic9Var, (String) it3.next(), (lnm) null, (byte) 5), 3));
                }
                r0.c = null;
                r0.b = true;
                Object objU2 = o1p1.u(arrayList4, (lnm) r0);
                return objU2 == rih1Var2 ? rih1Var2 : objU2;
            default:
                boolean z30 = r0.b;
                if (z30) {
                    if (z30) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                bju bjuVar = ((g7m1) r0.c).b;
                us0 us0Var = new us0((SceneTemplate.BespokeListeningAgeContent.Card2) obj2, (qla) r0.e, (lnm) null, (byte) 9);
                r0.b = true;
                Object objD2 = bjuVar.d("revealNumber", us0Var, (onm) r0);
                return objD2 == rih1Var2 ? rih1Var2 : objD2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc5(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wc5(ca9 ca9Var, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 22;
        this.c = ca9Var;
        this.d = ven0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wc5(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
    }
}
