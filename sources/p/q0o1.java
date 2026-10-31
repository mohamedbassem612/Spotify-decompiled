package p;

import android.content.Context;
import com.facebook.FacebookException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.esperanto.esperantoimpl.DispatchingCoroutineTransport;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.rx3.RxConnectables;
import com.spotify.mobius.rx3.RxEventSources;
import com.spotify.mobius.rx3.RxMobius;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;
import j$.net.URLDecoder;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q0o1 {
    public static final lp90 a = new lp90("unknown", "Jam Session", 1, 4, false, new jp90(false, false, (kp90) null));
    public static b180 b;

    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v4 */
    public static final void a(qim0 qim0Var, ut9 ut9Var, j2i j2iVar, xu30 xu30Var, b0k b0kVar, int i) {
        int i2;
        j2i j2iVar2;
        vu30 vu30Var;
        int i3;
        vu30 vu30Var2;
        Function0 function0;
        vu30 vu30Var3;
        nl3 nl3Var;
        g36 g36Var;
        qim0 qim0Var2;
        int i4;
        llj lljVar;
        ?? r11;
        xu30 xu30Var2 = xu30Var;
        gra graVar = een.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(828393700);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(ut9Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nl3 nl3Var2 = een.P0;
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, nl3Var2, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(mbhVarA, x340Var, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, x340Var, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar2);
            nko1.F(x340Var);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, x340Var, vu30Var6);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = u291.z(u291.f(qim0Var3, 1.0f), (fra) null, 3);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, vu30Var4);
            nko1.H(xos0VarM2, x340Var, vu30Var5);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var6);
            boolean z2 = ut9Var instanceof tt9;
            h2c h2cVar = h2c.a;
            if (z2) {
                x340Var.i0(413842485);
                qim0 qim0VarA = h2cVar.a(qim0Var3, een.g);
                boolean z3 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z3 || objT == fkj0.X) {
                    objT = new j3m((tt9) ut9Var, (byte) 5);
                    x340Var.s0(objT);
                }
                i3 = i2;
                nl3Var = nl3Var2;
                vu30Var3 = vu30Var5;
                g36Var = g36Var2;
                qim0Var2 = qim0Var3;
                vu30Var = vu30Var4;
                wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, qim0VarA, null, yla.s(x340Var), null, false, null, null, xfi.a, x340Var, 48, 6, 984);
                x340Var = x340Var;
                qim0 qim0VarZ2 = uyn1.z(56.0f, 0.0f, 2, u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3));
                i4 = 0;
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarZ2);
                x340Var.m0();
                if (x340Var.S) {
                    function0 = function1;
                    x340Var.l(function0);
                } else {
                    function0 = function1;
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, vu30Var);
                nko1.H(xos0VarM3, x340Var, vu30Var3);
                lljVar = lljVar2;
                x0d.q(iHashCode3, x340Var, lljVar, x340Var);
                vu30Var2 = vu30Var6;
                nko1.H(qim0VarE3, x340Var, vu30Var2);
                j2iVar2 = j2iVar;
                r11 = 1;
                ywx0.l(6 | ((i3 >> 3) & 112), j2iVar2, h2cVar, x340Var, true);
                x340Var.r(false);
            } else {
                vu30Var = vu30Var4;
                i3 = i2;
                vu30Var2 = vu30Var6;
                function0 = function1;
                vu30Var3 = vu30Var5;
                nl3Var = nl3Var2;
                g36Var = g36Var2;
                qim0Var2 = qim0Var3;
                i4 = 0;
                j2iVar2 = j2iVar;
                lljVar = lljVar2;
                r11 = 1;
                x340Var.i0(414420604);
                qim0 qim0VarZ3 = u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3);
                gfh0 gfh0VarC3 = t1c.c(graVar, false);
                int iHashCode4 = Long.hashCode(x340Var.T);
                xos0 xos0VarM4 = x340Var.m();
                qim0 qim0VarE4 = zr7.E(x340Var, qim0VarZ3);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC3, x340Var, vu30Var);
                nko1.H(xos0VarM4, x340Var, vu30Var3);
                x0d.q(iHashCode4, x340Var, lljVar, x340Var);
                nko1.H(qim0VarE4, x340Var, vu30Var2);
                ywx0.l(6 | ((i3 >> 3) & 112), j2iVar2, h2cVar, x340Var, true);
                x340Var.r(false);
            }
            x340Var.r((boolean) r11);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            rqo1.g(i4, i4, x340Var, uyn1.z(0.0f, 8.0f, r11, qim0Var2));
            qim0 qim0VarZ4 = u291.z(u291.f(qim0Var2, 1.0f), (fra) null, 3);
            mbh mbhVarA2 = jbh.a(g36Var, nl3Var, x340Var, i4);
            int iHashCode5 = Long.hashCode(x340Var.T);
            xos0 xos0VarM5 = x340Var.m();
            qim0 qim0VarE5 = zr7.E(x340Var, qim0VarZ4);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, vu30Var);
            nko1.H(xos0VarM5, x340Var, vu30Var3);
            x0d.q(iHashCode5, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE5, x340Var, vu30Var2);
            xu30Var2 = xu30Var;
            xu30Var2.invoke(pbh.a, x340Var, Integer.valueOf(6 | ((i3 >> 6) & 112)));
            x340Var.r((boolean) r11);
            x340Var.r((boolean) r11);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c2i(qim0Var, ut9Var, j2iVar2, xu30Var2, i);
        }
    }

    public static final void b(hcl1 hcl1Var, c380 c380Var, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1471965547);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(hcl1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(c380Var) : x340Var.i(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarB = f8d1.b(l6o1.t(qim0Var2, es41VarC, 14), rih1.a, new ae4(hcl1Var, (byte) 18));
            boolean zD = ((i3 & 112) == 32 || ((i3 & 64) != 0 && x340Var.i(c380Var))) | x340Var.d(16.0f) | x340Var.d(16.0f);
            Object objT = x340Var.T();
            if (zD || objT == m4cVar) {
                objT = new hu6(c380Var, (byte) 1);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            qim0Var = qim0Var2;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, -667514441, c380Var);
            while (itN.hasNext()) {
                ku50 ku50Var = (ku50) itN.next();
                boolean zI = ((i3 & 896) == 256) | x340Var.i(ku50Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new nu50(iu30Var, ku50Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                j2iVar.J(ku50Var, objT2, x340Var, Integer.valueOf(((i3 >> 3) & 896) | 8));
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var3 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kyq(hcl1Var, c380Var, iu30Var, j2iVar, qim0Var3, i, (byte) 17);
        }
    }

    public static final void c(int i, int i2, int i3, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(354480354);
        int i4 = (x340Var.e(i) ? 4 : 2) | i3 | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            gfx.b(13, apo.r(983510359, new hl9(i, i2, function0), x340Var), x340Var, 54);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(i, i2, i3, function0, qim0Var2);
        }
    }

    public static final zw21 d(PlayerState playerState, boolean z) {
        String str = "";
        if (z) {
            Set set = s4b1.f;
            if (uic.x(playerState.contextUri()).c == blc0.u1) {
                ContextTrack contextTrack = (ContextTrack) playerState.track().h();
                String strL = contextTrack != null ? l4o1.l(contextTrack) : null;
                return new ugc1(strL != null ? strL : "");
            }
        }
        Set set2 = s4b1.f;
        if (uic.u(poo1.J(playerState))) {
            String strJ = poo1.J(playerState);
            try {
                String strDecode = URLDecoder.decode(nhc1.W(strJ, "spotify:search:", ""), nne.a.toString());
                strDecode.getClass();
                str = strDecode;
            } catch (UnsupportedEncodingException unused) {
                Set set3 = s4b1.f;
                String strJ2 = uic.x(strJ).j();
                if (strJ2 != null) {
                    str = strJ2;
                }
            }
        }
        return (str.length() == 0 || u890.j(poo1.J(playerState), "spotify:search")) ? new bx21(2131959892) : new qe30(2131959893, new Object[]{str});
    }

    public static final String e(xkk1 xkk1Var) {
        up70 up70Var;
        List list = xkk1Var.a.a;
        if (list.isEmpty()) {
            list = null;
        }
        if (list == null || (up70Var = (up70) list.get(0)) == null) {
            return null;
        }
        return up70Var.a.a;
    }

    public static final qug0 f(eyn0 eyn0Var) {
        crp crpVar = new crp(eyn0Var);
        Scheduler scheduler = (Scheduler) eyn0Var.c;
        c8o.l(scheduler);
        Scheduler scheduler2 = (Scheduler) eyn0Var.b;
        c8o.l(scheduler2);
        q8n q8nVar = (q8n) eyn0Var.d;
        c8o.l(q8nVar);
        luk lukVar = (luk) eyn0Var.g;
        c8o.l(lukVar);
        boolean zC = new tm4(lukVar).c();
        be91 be91Var = (be91) eyn0Var.e;
        c8o.l(be91Var);
        np61 np61Var = (np61) eyn0Var.f;
        c8o.l(np61Var);
        Context context = (Context) eyn0Var.l;
        c8o.l(context);
        xug0 xug0Var = (xug0) eyn0Var.m;
        c8o.l(xug0Var);
        ObservableSource observableSourceFlatMapIterable = xug0Var.b.flatMapIterable(wdu0.W0);
        drd drdVar = (crd) eyn0Var.j;
        c8o.l(drdVar);
        ObservableSource map = drdVar.c.map(bj20.N0);
        emc emcVar = (emc) eyn0Var.k;
        c8o.l(emcVar);
        ObservableSource map2 = emcVar.a().map(xj20.N0);
        jly0 jly0Var = crpVar.b;
        ObservableSource observableSource = ((sug0) jly0Var.get()).b;
        ObservableSource publishSubject = new PublishSubject();
        zwz0 zwz0Var = (zwz0) eyn0Var.h;
        c8o.l(zwz0Var);
        jo0 jo0Var = (jo0) eyn0Var.i;
        c8o.l(jo0Var);
        t2j0 t2j0Var = (t2j0) eyn0Var.n;
        c8o.l(t2j0Var);
        sug0 sug0Var = (sug0) jly0Var.get();
        c8o.l(lukVar);
        m980 m980Var = new m980((byte) 18, new tm4(lukVar).b());
        krh krhVar = (krh) eyn0Var.o;
        c8o.l(krhVar);
        ov20 ov20Var = (ov20) eyn0Var.p;
        c8o.l(ov20Var);
        Context applicationContext = context.getApplicationContext();
        RxMobius.SubtypeEffectHandlerBuilder subtypeEffectHandlerBuilderC = RxMobius.c();
        subtypeEffectHandlerBuilderC.g(dxg0.class, new g2x0(zwz0Var, be91Var, (byte) 5));
        subtypeEffectHandlerBuilderC.g(cxg0.class, new k4e0(applicationContext, scheduler2, scheduler, m980Var, (byte) 1));
        subtypeEffectHandlerBuilderC.d(vwg0.class, new dy40(sug0Var, (byte) 5), scheduler2);
        subtypeEffectHandlerBuilderC.d(uwg0.class, new mba(sug0Var, (byte) 14), scheduler2);
        subtypeEffectHandlerBuilderC.c(xwg0.class, new vrk1((byte) 18));
        subtypeEffectHandlerBuilderC.c(axg0.class, new rwa0(jo0Var, (byte) 11));
        subtypeEffectHandlerBuilderC.c(ywg0.class, new dy40(t2j0Var, (byte) 6));
        subtypeEffectHandlerBuilderC.c(zwg0.class, new pse0(t2j0Var, (byte) 0));
        subtypeEffectHandlerBuilderC.c(wwg0.class, new wx91((byte) 13));
        subtypeEffectHandlerBuilderC.g(bxg0.class, new yon(t2j0Var, krhVar, ov20Var));
        return new qug0(scheduler, scheduler2, q8nVar, zC, be91Var, np61Var, gvg.d("MarqueeTriggeringMobius", Mobius.d(sxg0.a, RxConnectables.a(subtypeEffectHandlerBuilderC.h())).b(new txg0(scheduler)).d(new uxg0(scheduler)).e(vxg0.a).h(RxEventSources.a(new ObservableSource[]{observableSourceFlatMapIterable, map, map2, observableSource, publishSubject}))));
    }

    public static final oe30 g(DispatchingCoroutineTransport dispatchingCoroutineTransport) {
        return new oe30(dispatchingCoroutineTransport);
    }

    public static int h(float f, int i) {
        return z4p1.G(z4p1.t(u7h.b(u7h.b, f, 0.0f, 0.0f, 0.0f, 14), z4p1.e(i)));
    }

    public static void i(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xku xkuVar = (v3h1) it.next();
            xku xkuVar2 = xkuVar instanceof xku ? xkuVar : null;
            if (xkuVar2 != null) {
                xkuVar2.dispose();
            }
        }
    }

    public static ru91 j(jkr0 jkr0Var, bkr0 bkr0Var, pxg1 pxg1Var, b0k b0kVar, int i, int i2) {
        if ((i2 & 2) != 0) {
            bkr0Var = new bkr0();
        }
        e9r e9rVarA = wxa1.a(b0kVar);
        boolean z = true;
        if ((i2 & 8) != 0) {
            n511 n511Var = ckk1.a;
            pxg1Var = irn1.l0(0.0f, 400.0f, Float.valueOf(1.0f), 1);
        }
        float f = (i2 & 16) != 0 ? 0.5f : 0.1f;
        if (0.0f > f || f > 1.0f) {
            tf80.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f);
        }
        x340 x340Var = (x340) b0kVar;
        wat watVar = (wat) x340Var.k(t4k.h);
        flb0 flb0Var = (flb0) x340Var.k(t4k.n);
        boolean zG = ((((i & 14) ^ 6) > 4 && x340Var.g(jkr0Var)) || (i & 6) == 4) | x340Var.g(e9rVarA) | x340Var.g(pxg1Var);
        if ((((i & 112) ^ 48) <= 32 || !x340Var.g(bkr0Var)) && (i & 48) != 32) {
            z = false;
        }
        boolean zG2 = zG | z | x340Var.g(watVar) | x340Var.e(flb0Var.ordinal());
        Object objT = x340Var.T();
        if (zG2 || objT == fkj0.X) {
            objT = new ru91(new dkr0(jkr0Var, new kjr0(jkr0Var, flb0Var, f), bkr0Var), e9rVarA, pxg1Var);
            x340Var.s0(objT);
        }
        return (ru91) objT;
    }

    public static final String k(asc1 asc1Var, Context context) {
        String string = context.getString(2131952685);
        String str = asc1Var.a;
        String str2 = asc1Var.c ? "[CC]" : null;
        if (asc1Var.d != 2) {
            string = null;
        }
        return o7h.y0(f46.i0(new String[]{str, str2, string}), " ", (String) null, (String) null, (iu30) null, 62);
    }

    public static ies l(jkr0 jkr0Var, qqq0 qqq0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        flb0 flb0Var = (flb0) x340Var.k(t4k.n);
        boolean zE = ((((i & 14) ^ 6) > 4 && x340Var.g(jkr0Var)) || (i & 6) == 4) | x340Var.e(flb0Var.ordinal());
        Object objT = x340Var.T();
        if (zE || objT == fkj0.X) {
            objT = new ies(jkr0Var, qqq0Var, flb0Var);
            x340Var.s0(objT);
        }
        return (ies) objT;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:29:0x0074  */
    /* JADX WARN: Code duplicated, block: B:30:0x0077  */
    /* JADX WARN: Code duplicated, block: B:31:0x007a  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0080  */
    /* JADX WARN: Code duplicated, block: B:34:0x0082  */
    /* JADX WARN: Code duplicated, block: B:35:0x0085  */
    /* JADX WARN: Code duplicated, block: B:36:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:0x008d  */
    /* JADX WARN: Code duplicated, block: B:39:0x008f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0091  */
    /* JADX WARN: Code duplicated, block: B:41:0x0093  */
    /* JADX WARN: Code duplicated, block: B:42:0x0095  */
    /* JADX WARN: Code duplicated, block: B:43:0x0097  */
    /* JADX WARN: Code duplicated, block: B:44:0x0098 A[PHI: r10
      0x0098: PHI (r10v1 int) = 
      (r10v0 int)
      (r10v2 int)
      (r10v3 int)
      (r10v4 int)
      (r10v5 int)
      (r10v6 int)
      (r10v7 int)
      (r10v8 int)
      (r10v9 int)
      (r10v10 int)
      (r10v11 int)
      (r10v12 int)
      (r10v13 int)
      (r10v14 int)
      (r10v15 int)
      (r10v16 int)
      (r10v17 int)
      (r10v0 int)
     binds: [B:46:0x00a2, B:43:0x0097, B:42:0x0095, B:41:0x0093, B:40:0x0091, B:39:0x008f, B:38:0x008d, B:37:0x008b, B:36:0x0088, B:35:0x0085, B:34:0x0082, B:33:0x0080, B:32:0x007d, B:31:0x007a, B:30:0x0077, B:29:0x0074, B:28:0x0071, B:25:0x006a] A[DONT_GENERATE, DONT_INLINE]] */
    public static final lp90 m(l0l l0lVar) {
        int i;
        kx7 kx7Var;
        kx7 kx7Var2;
        String strD = l0lVar.d();
        String strV = hqq0.V(l0lVar);
        if (strV == null || strV.length() == 0) {
            strV = "Jam Session";
        }
        int iS = hqq0.S(l0lVar);
        int i2 = iS == 0 ? -1 : nyt0.a[l1d.C(iS)];
        int i3 = 4;
        luq0 luq0Var = luq0.e;
        int i4 = 12;
        if (i2 == 1) {
            nnr nnrVar = l0lVar instanceof nnr ? (nnr) l0lVar : null;
            if (((nnrVar == null || (kx7Var2 = nnrVar.B.a) == null) ? null : kx7Var2.d) == luq0Var) {
                i = 6;
            } else {
                switch (hqq0.T(l0lVar).ordinal()) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        i4 = 1;
                        i = i4;
                        break;
                    case 1:
                        i4 = 2;
                        i = i4;
                        break;
                    case 2:
                        i4 = 3;
                        i = i4;
                        break;
                    case 3:
                        i4 = 4;
                        i = i4;
                        break;
                    case 4:
                        i4 = 5;
                        i = i4;
                        break;
                    case 5:
                        i4 = 7;
                        i = i4;
                        break;
                    case 6:
                        i4 = 8;
                        i = i4;
                        break;
                    case 7:
                        i4 = 9;
                        i = i4;
                        break;
                    case 8:
                        i4 = 10;
                        i = i4;
                        break;
                    case 9:
                        i4 = 11;
                        i = i4;
                        break;
                    case 10:
                        i = i4;
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        i4 = 13;
                        i = i4;
                        break;
                    case grn1.d /* 12 */:
                        i4 = 14;
                        i = i4;
                        break;
                    case 13:
                    case 17:
                        i4 = 15;
                        i = i4;
                        break;
                    case 14:
                        i4 = 16;
                        i = i4;
                        break;
                    case 15:
                        i4 = 17;
                        i = i4;
                        break;
                    case 16:
                        i4 = 18;
                        i = i4;
                        break;
                    default:
                        eg.o();
                        return null;
                }
            }
        } else {
            switch (hqq0.T(l0lVar).ordinal()) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    i4 = 1;
                    i = i4;
                    break;
                case 1:
                    i4 = 2;
                    i = i4;
                    break;
                case 2:
                    i4 = 3;
                    i = i4;
                    break;
                case 3:
                    i4 = 4;
                    i = i4;
                    break;
                case 4:
                    i4 = 5;
                    i = i4;
                    break;
                case 5:
                    i4 = 7;
                    i = i4;
                    break;
                case 6:
                    i4 = 8;
                    i = i4;
                    break;
                case 7:
                    i4 = 9;
                    i = i4;
                    break;
                case 8:
                    i4 = 10;
                    i = i4;
                    break;
                case 9:
                    i4 = 11;
                    i = i4;
                    break;
                case 10:
                    i = i4;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    i4 = 13;
                    i = i4;
                    break;
                case grn1.d /* 12 */:
                    i4 = 14;
                    i = i4;
                    break;
                case 13:
                case 17:
                    i4 = 15;
                    i = i4;
                    break;
                case 14:
                    i4 = 16;
                    i = i4;
                    break;
                case 15:
                    i4 = 17;
                    i = i4;
                    break;
                case 16:
                    i4 = 18;
                    i = i4;
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        boolean z = l0lVar instanceof nnr;
        nnr nnrVar2 = z ? (nnr) l0lVar : null;
        kx7 kx7Var3 = nnrVar2 != null ? nnrVar2.B.a : null;
        if ((kx7Var3 != null ? kx7Var3.d : null) == luq0Var) {
            i3 = 1;
        } else {
            int iC = l1d.C(l0lVar.p());
            if (iC != 0) {
                if (iC != 1) {
                    eg.o();
                    return null;
                }
                i3 = 3;
            }
        }
        boolean z2 = l0lVar.z();
        String str = strV;
        int i5 = i;
        int i6 = i3;
        boolean zV = l0lVar.v();
        nnr nnrVar3 = z ? (nnr) l0lVar : null;
        return new lp90(strD, str, i5, i6, z2, new jp90(zV, (nnrVar3 == null || (kx7Var = nnrVar3.B.a) == null) ? l0lVar.l() : kx7Var.b(), new kp90(l0lVar.j())));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:110:0x0146  */
    /* JADX WARN: Code duplicated, block: B:38:0x006e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:67:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00db  */
    /* JADX WARN: Code duplicated, block: B:73:0x00de  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r7v18 java.lang.Object, still in use, count: 2, list:
          (r7v18 java.lang.Object) from 0x00ba: PHI (r7 I:??) = (r7v12 java.lang.Object), (r7v18 java.lang.Object) binds: [B:58:0x00b8, B:125:0x00ba] A[DONT_GENERATE, DONT_INLINE]
          (r7v18 java.lang.Object) from 0x00ab: CHECK_CAST (p.f0u) (r7v18 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    public static final p.lp90 n(p.td61 r20, java.lang.String r21) {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.q0o1.n(p.td61, java.lang.String):p.lp90");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static void o(String str) throws FacebookException {
        boolean zContains;
        if (str.length() == 0 || str.length() > 40) {
            throw new FacebookException(String.format(Locale.ROOT, "Identifier '%s' must be less than %d characters", Arrays.copyOf(new Object[]{str, 40}, 2)));
        }
        HashSet hashSet = bm5.f;
        synchronized (hashSet) {
            zContains = hashSet.contains(str);
        }
        if (zContains) {
            return;
        }
        if (!Pattern.compile("^[0-9a-zA-Z_]+[0-9a-zA-Z _-]*$").matcher(str).matches()) {
            throw new FacebookException(String.format("Skipping event named '%s' due to illegal name - must be under 40 chars and alphanumeric, _, - or space, and not start with a space or hyphen.", Arrays.copyOf(new Object[]{str}, 1)));
        }
        synchronized (hashSet) {
            hashSet.add(str);
        }
    }

    public static v3h1 p(z2k z2kVar, qyl qylVar, ArrayList arrayList) {
        smc0 smc0VarN = k4p1.n();
        qylVar.foldIn(rih1.a, new wcf1(smc0VarN, (byte) 20));
        smc0 smc0VarK = k4p1.k(smc0VarN);
        ArrayList<List> arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
        while (true) {
            rmc0 rmc0Var = rmc0VarListIterator;
            if (!rmc0Var.hasNext()) {
                break;
            }
            arrayList3.add((pyl) rmc0Var.next());
        }
        if (!arrayList3.isEmpty()) {
            arrayList2.add(arrayList3);
        }
        if (arrayList2.isEmpty()) {
            return z2kVar;
        }
        ArrayList arrayList4 = new ArrayList();
        for (List list : arrayList2) {
            if (list.size() == 1) {
            }
            if (!list.isEmpty()) {
                z2kVar = new mim0(z2kVar, list);
            }
            arrayList4.add(z2kVar);
        }
        arrayList.addAll(o7h.T0(arrayList4));
        return z2kVar;
    }

    public static String q(ahp1 ahp1Var) {
        StringBuilder sb = new StringBuilder(ahp1Var.d());
        for (int i = 0; i < ahp1Var.d(); i++) {
            byte b2 = ahp1Var.b(i);
            if (b2 == 34) {
                sb.append("\\\"");
            } else if (b2 == 39) {
                sb.append("\\'");
            } else if (b2 != 92) {
                switch (b2) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        sb.append("\\v");
                        break;
                    case grn1.d /* 12 */:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (b2 < 32 || b2 > 126) {
                            sb.append('\\');
                            sb.append((char) (((b2 >>> 6) & 3) + 48));
                            sb.append((char) (((b2 >>> 3) & 7) + 48));
                            sb.append((char) ((b2 & 7) + 48));
                        } else {
                            sb.append((char) b2);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
