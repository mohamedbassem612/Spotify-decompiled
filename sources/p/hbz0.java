package p;

import android.os.Looper;
import android.widget.FrameLayout;
import com.spotify.mobius.MobiusLoop;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableEmitter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hbz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hbz0(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x013a  */
    public final Object invoke(Object obj) {
        ezc ezcVarM;
        wu61 wu61VarC;
        byte b = this.a;
        int i = 0;
        w7x w7xVar = w7x.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                MobiusLoop mobiusLoopI = ibz0.i((ibz0) obj2);
                if (mobiusLoopI != null) {
                    mobiusLoopI.dispose();
                    return rih1Var;
                }
                u890.C("mobiusLoop");
                throw null;
            case 1:
                return ((jpz0) obj2).b;
            case 2:
                return (bx21) obj2;
            case 3:
                return ((u801) obj2).f.a((cir0) obj);
            case 4:
                oq01 oq01Var = (oq01) obj;
                rq01 rq01Var = (rq01) obj2;
                jge jgeVarE = hu20.e(u4p1.b0(ew01.b, new egv0((byte) 13)), new af01((lnm) null, new zkz0(rq01Var, oq01Var, (byte) 11), (byte) 2));
                r860 r860Var = rq01Var.f;
                return h5p1.t(jgeVarE, r860Var != null ? r860Var.a(1) : h4p1.m(w7xVar), new t83(rq01Var, oq01Var, (lnm) null, (byte) 10));
            case 5:
                ((vr01) obj2).f("Synchronizing with Core failed. Loading only cached items for Recents. Error: " + ((jy21) obj));
                return Boolean.FALSE;
            case 6:
                return ywo1.u((aw70) obj, rt01.f((rt01) obj2));
            case 7:
                gd11 gd11Var = (gd11) obj2;
                return d3p1.H(gd11Var.e, gd11Var.g, (cd11) obj);
            case 8:
                je31 je31Var = (je31) obj2;
                return Double.valueOf(je31Var.n.c(yoi1.n(((Number) obj).doubleValue(), je31Var.e, je31Var.f)));
            case 9:
                cf31 cf31Var = (cf31) obj;
                String strG = cf31Var.g();
                String strF = cf31Var.f();
                String strC = cf31Var.c();
                String strA = cf31Var.a();
                ye31 ye31Var = (ye31) obj2;
                if (strA.length() == 0) {
                    strA = ye31Var.e.getString(2131961346);
                }
                return new mdq0(strG, strF, strC, strA, !cf31Var.i());
            case 10:
                ts31 ts31Var = (ts31) obj2;
                for (mmr0 mmr0Var : (List) obj) {
                    jh5 jh5Var = (jh5) mmr0Var.a;
                    k3r k3rVar = (k3r) mmr0Var.b;
                    ts31Var.q.remove(jh5Var);
                    ts31Var.k.put(jh5Var, k3rVar);
                }
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    ts31Var.e();
                } else if (ts31Var.l.compareAndSet(false, true)) {
                    ts31Var.j.post(ts31Var.m);
                }
                return rih1Var;
            case 11:
                return lmt0.o((j331) obj2, new zw11((v231) obj, (byte) 22));
            case 12:
                Object tag = ((FrameLayout) obj2).getTag(2131428154);
                ezcVarM = w0h1.y(1, tag) ? (iu30) tag : null;
                if (ezcVarM != null) {
                    ezcVarM.invoke(obj);
                }
                return rih1Var;
            case 13:
                return bs51.k((Observable) obj2);
            case 14:
                ilo1.E(new jn41(obj), (ssw0) obj2);
                return rih1Var;
            case 15:
                ((ObservableEmitter) obj2).onNext(new jn41(obj));
                return rih1Var;
            case 16:
                return q0o1.d((PlayerState) obj, ((hv4) obj2).c());
            case 17:
                scr scrVar = (scr) obj;
                c380 c380Var = (c380) obj2;
                for (Object obj3 : c380Var) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    av61 av61Var = (av61) obj3;
                    if (i > 0) {
                        scr.b(scrVar, av61Var.a().b(), av61Var.c() == null ? null : new p3v(0.0f));
                    }
                    if (av61Var.c() == null) {
                        scrVar.a();
                    } else {
                        Object objC = av61Var.c().c();
                        av61 av61Var2 = (av61) o7h.t0(i - 1, c380Var);
                        if (!u890.j(objC, (av61Var2 == null || (wu61VarC = av61Var2.c()) == null) ? null : wu61VarC.c())) {
                            cto1.t(scrVar, av61Var.c());
                        }
                    }
                    cto1.s(scrVar, av61Var.a());
                    Iterator it = av61Var.b().iterator();
                    while (it.hasNext()) {
                        cto1.s(scrVar, (wu61) it.next());
                    }
                    i = i2;
                }
                return rih1Var;
            case 18:
                eqc eqcVar = (eqc) obj;
                iz71 iz71Var = (iz71) obj2;
                return eqcVar.b(new c861(iz71Var, iz71Var.R0.a(eqcVar.a.j(), eqcVar.a.getLayoutDirection(), eqcVar), (byte) 20));
            case 19:
                i181 i181Var = (i181) obj2;
                int i3 = i181Var.g;
                if (i3 == 0) {
                    ezcVarM = h4p1.m(w7xVar);
                } else {
                    r860 r860Var2 = i181Var.f;
                    ezcVarM = r860Var2 != null ? r860Var2.a(i3) : null;
                    if (ezcVarM == null) {
                        ezcVarM = h4p1.m(w7xVar);
                    }
                }
                return h5p1.s(i181Var.a, i181Var.b, ezcVarM, new vd2((byte) 29));
            case 20:
                g0i g0iVar = (g0i) obj;
                kt91 kt91Var = (kt91) obj2;
                ft91 ft91Var = kt91Var.g;
                if (ft91Var != null) {
                    kt91Var.g = null;
                    kt91Var.l(ft91Var.b(), g0iVar, new dr91(kt91Var, g0iVar), ft91Var.a());
                }
                return rih1Var;
            case 21:
                zla1 zla1Var = (zla1) obj;
                return (mr20) ((tc11) obj2).invoke(zla1Var.a, zla1Var.b);
            case 22:
                return ((n8d1) obj2).a();
            case 23:
                return ((uhd1) obj2).b();
            case 24:
                pdf1 pdf1Var = (pdf1) obj;
                xdf1 xdf1Var = (xdf1) obj2;
                List listA = pdf1Var.a();
                ArrayList arrayList = new ArrayList();
                Iterator it2 = listA.iterator();
                while (it2.hasNext()) {
                    String strA2 = ((sdf1) it2.next()).a();
                    if (strA2 != null) {
                        arrayList.add(strA2);
                    }
                }
                return arrayList.isEmpty() ? h4p1.m(z6x.a) : new mpy0(d3p1.G(xdf1Var.i, xdf1Var.Z, pdf1Var), pdf1Var, xdf1Var, (byte) 22);
            case 25:
                return new vrh1(((yrh1) obj2).b.a(), csh1.a);
            case 26:
                ((x8j1) obj2).d.o();
                return rih1Var;
            case 27:
                return (mr20) ((o6k1) obj2).f.invoke(((m6k1) obj).e);
            case 28:
                g0y0 g0y0Var = (g0y0) obj2;
                wcl1 wcl1Var = ((ral1) obj).c;
                String strB = wcl1Var.b();
                List<ucl1> listC = wcl1Var.c();
                ArrayList arrayList2 = new ArrayList(q7h.U(listC, 10));
                for (ucl1 ucl1Var : listC) {
                    arrayList2.add(new e6l1(ucl1Var.c(), ucl1Var.e(), ucl1Var.d(), ucl1Var.a(), ucl1Var.b()));
                }
                return new f6l1(strB, arrayList2, wcl1Var.a(), g0y0.d(g0y0Var), "watch-feed-entrypoint-card-home-client-native", wcl1Var.d(), g0y0.b(g0y0Var).b, 64);
            default:
                brl.l((ven0) obj2, ((Boolean) obj).booleanValue());
                return rih1Var;
        }
    }
}
