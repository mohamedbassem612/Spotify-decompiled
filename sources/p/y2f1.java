package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.widget.FrameLayout;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.Restrictions;
import io.reactivex.rxjava3.core.Flowable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class y2f1 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2f1(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        okg1 okg1Var = (okg1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        skg1 skg1Var = (skg1) this.b;
        boolean z = okg1Var.c;
        lhg1 lhg1Var = okg1Var.a;
        rih1 rih1Var = rih1.a;
        if (lhg1Var == null) {
            return rih1Var;
        }
        if (!z || skg1Var.d == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1283135333);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1282970041);
            boolean zI = x340Var3.i(skg1Var);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new rkg1(skg1Var, (byte) 3);
                x340Var3.s0(objT);
            }
            qxd0.i(rih1Var, (iu30) objT, x340Var3);
            x340Var3.r(false);
        }
        x340 x340Var4 = x340Var;
        boolean zI2 = x340Var4.i(skg1Var);
        Object objT2 = x340Var4.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new rkg1(skg1Var, (byte) 4);
            x340Var4.s0(objT2);
        }
        qxd0.i(rih1Var, (iu30) objT2, x340Var4);
        boolean z2 = true;
        boolean z3 = (((iIntValue & 896) ^ 384) > 256 && x340Var4.g(iu30Var)) || (iIntValue & 384) == 256;
        if ((((iIntValue & 112) ^ 48) <= 32 || !x340Var4.i(okg1Var)) && (iIntValue & 48) != 32) {
            z2 = false;
        }
        boolean z4 = z3 | z2;
        Object objT3 = x340Var4.T();
        if (z4 || objT3 == m4cVar) {
            objT3 = new x0e1(iu30Var, okg1Var, (byte) 26);
            x340Var4.s0(objT3);
        }
        n1p1.f(0, (Function0) objT3, x340Var4, (qim0) null, z);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cxc0 cxc0Var = (cxc0) obj2;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        ven0 ven0VarH = rwq.h(((vf40) ((rb3) this.b).c).a, x340Var, 0);
        rih1 rih1Var = rih1.a;
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i((rb3) this.b);
        rb3 rb3Var = (rb3) this.b;
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new vbc1(rb3Var, (lnm) null, (byte) 11);
            x340Var2.s0(objT);
        }
        qxd0.t(rih1Var, x340Var2, (vu30) objT);
        boolean zI2 = x340Var2.i((rb3) this.b);
        rb3 rb3Var2 = (rb3) this.b;
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new ymg1(rb3Var2, (byte) 2);
            x340Var2.s0(objT2);
        }
        qxd0.i(rih1Var, (iu30) objT2, x340Var2);
        boolean zBooleanValue = ((Boolean) ven0VarH.getValue()).booleanValue();
        String str = vf40.c;
        boolean zI3 = x340Var2.i((rb3) this.b);
        rb3 rb3Var3 = (rb3) this.b;
        Object objT3 = x340Var2.T();
        if (zI3 || objT3 == m4cVar) {
            objT3 = new opg(rb3Var3, (byte) 19);
            x340Var2.s0(objT3);
        }
        oon1.j(cxc0Var, zBooleanValue, str, (Function0) objT3, x340Var2, (iIntValue >> 3) & 14);
        return rih1Var;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        rih1 rih1Var;
        qim0 qim0Var;
        b0k b0kVar;
        cxc0 cxc0Var = (cxc0) obj2;
        ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        apz0 apz0Var = (apz0) this.b;
        b0k b0kVar2 = (x340) ((b0k) obj4);
        boolean zI = b0kVar2.i(apz0Var);
        Object objT = b0kVar2.T();
        String strN0 = null;
        if (zI || objT == m4cVar) {
            objT = new vbc1(apz0Var, (lnm) null, (byte) 12);
            b0kVar2.s0(objT);
        }
        rih1 rih1Var2 = rih1.a;
        qxd0.t(rih1Var2, b0kVar2, (vu30) objT);
        fra fraVar = een.N0;
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarN = anm1.N("TrendingNearYouHeaderMetadata", qim0Var2);
        jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
        int iHashCode = Long.hashCode(((x340) b0kVar2).T);
        xos0 xos0VarM = b0kVar2.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
        hzj.A.getClass();
        if (((x340) b0kVar2).a == null) {
            tgp1.p();
            throw null;
        }
        b0kVar2.m0();
        if (((x340) b0kVar2).S) {
            b0kVar2.l(hmb0.t1);
        } else {
            b0kVar2.v0();
        }
        nko1.H(jw31VarA, b0kVar2, y580.O0);
        nko1.H(xos0VarM, b0kVar2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
        nko1.F(b0kVar2);
        nko1.H(qim0VarE, b0kVar2, y580.Y);
        long j = cxc0Var.a / 60;
        long j2 = j / 60;
        long j3 = j % 60;
        if (j2 > 0) {
            b0kVar2.i0(-692371897);
            strN0 = cwl1.n0(2131963249, new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, b0kVar2);
            b0kVar2.r(false);
        } else if (j3 > 0) {
            b0kVar2.i0(-692368486);
            strN0 = cwl1.n0(2131963250, new Object[]{Long.valueOf(j3)}, b0kVar2);
            b0kVar2.r(false);
        } else {
            b0kVar2.i0(11490884);
            b0kVar2.r(false);
        }
        if (strN0 == null) {
            b0kVar2.i0(-498632245);
            b0kVar2.r(false);
            rih1Var = rih1Var2;
            qim0Var = qim0Var2;
            b0kVar = b0kVar2;
        } else {
            b0kVar2.i0(-498632244);
            uwr uwrVar = cbx.a;
            rih1Var = rih1Var2;
            qim0Var = qim0Var2;
            uwo1.e(strN0, (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2034);
            uwo1.e(" • ", (qim0) null, cbx.d(b0kVar2).j, cbx.a(b0kVar2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 6, 0, 2034);
            b0kVar = b0kVar2;
            b0kVar.r(false);
        }
        uwr uwrVar2 = cbx.a;
        lee1 lee1Var = cbx.d(b0kVar).k;
        String strO0 = cwl1.o0(b0kVar, 2131963248);
        long j4 = cbx.a(b0kVar).b.a;
        qim0 qim0VarN2 = anm1.N("TrendingNearYou.ChangeLocationButton", qim0Var);
        boolean zI2 = b0kVar.i(cxc0Var) | b0kVar.i(apz0Var);
        Object objT2 = b0kVar.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new x0e1(cxc0Var, apz0Var, (byte) 27);
            b0kVar.s0(objT2);
        }
        b0k b0kVar3 = b0kVar;
        uwo1.e(strO0, bin.x(qim0VarN2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15), lee1Var, j4, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2032);
        b0kVar3.r(true);
        return rih1Var;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        qqg1 qqg1Var = (qqg1) obj2;
        ((Number) obj5).intValue();
        x340 x340Var = (b0k) obj4;
        boolean z = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation == 1;
        if (qqg1Var.a && z) {
            x340Var.i0(207390185);
            nyx.a(2, (wux) null, apo.r(-959527319, new xaf1((r060) this.b, qqg1Var, (byte) 12), x340Var), x340Var, 3078, 6);
            x340Var.r(false);
        } else {
            x340Var.i0(207607371);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        rwj rwjVar = (rwj) this.b;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new fgf1(iu30Var, (byte) 16);
            x340Var2.s0(objT);
        }
        rwjVar.j((Function0) objT, x340Var2, 0);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        ContextTrack contextTrack;
        String strA0;
        hcz0 hcz0Var = (hcz0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        if (hcz0Var.F) {
            contextTrack = hcz0Var.a;
        } else {
            contextTrack = (ContextTrack) o7h.s0(hcz0Var.c);
            if (contextTrack == null) {
                contextTrack = (ContextTrack) o7h.s0(hcz0Var.d);
            }
        }
        ContextTrack contextTrack2 = contextTrack;
        if (contextTrack2 != null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1816725566);
            String strUri = contextTrack2.uri();
            kw21 kw21Var = (kw21) hcz0Var.A.get(strUri);
            boolean zContains = v1p1.r(hcz0Var).contains(l4o1.c0(contextTrack2));
            boolean zJ = u890.j(hcz0Var.D.get(strUri), Boolean.TRUE);
            Restrictions restrictions = Restrictions.EMPTY;
            boolean zJ2 = hcz0Var.k.j();
            ktw0 ktw0Var = hcz0Var.k;
            if (kw21Var == null || (strA0 = kw21Var.a) == null) {
                strA0 = l4o1.a0(contextTrack2, "image_url");
            }
            boolean z = true;
            hjf1 hjf1VarS = d4o1.s(contextTrack2, restrictions, z6x.a, zJ2, ktw0Var, strA0, kw21Var != null ? kw21Var.c : null, false, zContains, hcz0Var.C && zJ && !zContains, (String) hcz0Var.E.get(strUri), (aak0) null, 100800);
            String str = hjf1VarS.b;
            gzf1 gzf1VarA = gzf1.a(d9y0.x(hjf1VarS, 2), (String) null, (String) null, (s27) null, false, 524263);
            int i = (iIntValue & 896) ^ 384;
            boolean zI = ((i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var2.i(contextTrack2);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new rzf1(iu30Var, contextTrack2, (byte) 16);
                x340Var2.s0(objT);
            }
            nzf1 nzf1Var = new nzf1(str, 0, gzf1VarA, (iu30) objT);
            String strO0 = cwl1.o0(x340Var2, 2131963491);
            String strO1 = cwl1.o0(x340Var2, 2131963490);
            if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT2 = x340Var2.T();
            if (z || objT2 == m4cVar) {
                objT2 = new fgf1(iu30Var, (byte) 18);
                x340Var2.s0(objT2);
            }
            g0p1.o(strO0, (qim0) null, strO1, (Function0) objT2, apo.r(-1322021246, new xw91((psy) this.b, nzf1Var, (byte) 29), x340Var2), x340Var2, 196608);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1818936827);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xmh1 xmh1Var = (xmh1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        wmh1 wmh1Var = (wmh1) this.b;
        m4c m4cVar = fkj0.X;
        xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
        ru91 ru91VarN = pno1.n(xtb0VarA, x340Var);
        x340 x340Var2 = x340Var;
        boolean zI = x340Var2.i(xtb0VarA) | ((((iIntValue & 896) ^ 384) > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new mqv(xtb0VarA, iu30Var, (lnm) null, (byte) 5);
            x340Var2.s0(objT);
        }
        qxd0.t(xtb0VarA, x340Var2, (vu30) objT);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        d36 d36Var = new d36(16.0f, true, new um5(false));
        boolean zI2 = x340Var2.i(wmh1Var) | ((((iIntValue & 112) ^ 48) > 32 && x340Var2.g(xmh1Var)) || (iIntValue & 48) == 32);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new rzf1(xmh1Var, wmh1Var, (byte) 17);
            x340Var2.s0(objT2);
        }
        ujo1.e((qim0) null, xtb0VarA, zzq0VarH, d36Var, (pl3) null, ru91VarN, false, (hxq0) null, (iu30) objT2, x340Var2, 0, 425);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        kiv kivVar = oi7.a;
        el9 el9Var = (el9) this.b;
        mod.b(kivVar.a((gw70) el9Var.h), apo.r(445815736, new wpg1((mnh1) obj2, el9Var, (iu30) obj3, (byte) 10), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        luh1 luh1Var = (luh1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        suh1 suh1Var = (suh1) this.b;
        boolean z = luh1Var.b;
        boolean z2 = luh1Var.f;
        int i = (iIntValue & 896) ^ 384;
        boolean z3 = true;
        boolean z4 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z4 || objT == m4cVar) {
            objT = new fgf1(iu30Var, (byte) 21);
            x340Var2.s0(objT);
        }
        suh1Var.e(z, z2, (Function0) objT, x340Var2, 0);
        if (luh1Var.e && (luh1Var.c || luh1Var.d)) {
            x340Var2.i0(-1653723963);
            xq81 xq81Var = (xq81) suh1Var.d;
            boolean z5 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT2 = x340Var2.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new fgf1(iu30Var, (byte) 22);
                x340Var2.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                z3 = false;
            }
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new fgf1(iu30Var, (byte) 23);
                x340Var2.s0(objT3);
            }
            xq81Var.a(cqh1.a, function0, (Function0) objT3, x340Var2, 0);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-1653487557);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wwh1 wwh1Var = (wwh1) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        yxb0 yxb0Var = (yxb0) this.b;
        bro1 bro1Var = wwh1Var.a;
        x340 x340Var = (b0k) obj4;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = qxd0.M(o6x.a, x340Var);
            x340Var.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        boolean z = true;
        e1r0 e1r0Var = new e1r0((byte) 1);
        int i = (iIntValue & 896) ^ 384;
        boolean zI = x340Var.i(c9nVar) | x340Var.i(yxb0Var) | x340Var.i(context) | ((i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            e971 e971Var = new e971(c9nVar, yxb0Var, iu30Var, context, (byte) 28);
            x340Var.s0(e971Var);
            objT2 = e971Var;
        }
        ihg0 ihg0VarE = p1p1.E(e1r0Var, (iu30) objT2, x340Var);
        if (bro1Var instanceof yk7) {
            x340Var.i0(2114196477);
            boolean zI2 = ((i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(ihg0VarE);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new mah1(iu30Var, ihg0VarE, (byte) 5);
                x340Var.s0(objT3);
            }
            zko1.j(0, (Function0) objT3, x340Var, (qim0) null);
            x340Var.r(false);
        } else {
            x340Var.i0(2114042841);
            boolean z2 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT4 = x340Var.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new fgf1(iu30Var, (byte) 24);
                x340Var.s0(objT4);
            }
            tyo1.c(bro1Var, (Function0) objT4, (qim0) null, x340Var, 0);
            x340Var.r(false);
        }
        if (wwh1Var.b) {
            x340Var.i0(2114552946);
            boolean z3 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT5 = x340Var.T();
            if (z3 || objT5 == m4cVar) {
                objT5 = new fgf1(iu30Var, (byte) 25);
                x340Var.s0(objT5);
            }
            Function0 function0 = (Function0) objT5;
            boolean z4 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT6 = x340Var.T();
            if (z4 || objT6 == m4cVar) {
                objT6 = new fgf1(iu30Var, (byte) 26);
                x340Var.s0(objT6);
            }
            xap1.b(function0, (Function0) objT6, x340Var, 0);
            x340Var.r(false);
        } else {
            x340Var.i0(2114727848);
            x340Var.r(false);
        }
        String str = wwh1Var.c;
        if (str == null) {
            x340Var.i0(2114774099);
            x340Var.r(false);
        } else {
            x340Var.i0(2114774100);
            if ((i <= 256 || !x340Var.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT7 = x340Var.T();
            if (z || objT7 == m4cVar) {
                objT7 = new fgf1(iu30Var, (byte) 27);
                x340Var.s0(objT7);
            }
            ero1.a(0, str, (Function0) objT7, x340Var);
            x340Var.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws Throwable {
        j2i j2iVarR;
        boolean z;
        q2f1 q2f1Var;
        tob1 tob1Var;
        boolean z2;
        Throwable th;
        int i;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        boolean z3 = true;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                q2f1 q2f1Var2 = (q2f1) obj2;
                iu30 iu30Var = (iu30) obj3;
                int iIntValue = ((Number) obj5).intValue();
                z2f1 z2f1Var = (z2f1) obj6;
                Object obj7 = fkj0.X;
                x340 x340Var = (b0k) obj4;
                wat watVar = (wat) x340Var.k(t4k.h);
                y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, x340Var);
                flb0 flb0Var = (flb0) x340Var.k(t4k.n);
                Boolean boolValueOf = Boolean.valueOf(y7e1VarD.d().d.length() > 0);
                boolean zI = x340Var.i(y7e1VarD) | x340Var.i(z2f1Var);
                Object objT = x340Var.T();
                if (zI || objT == obj7) {
                    objT = new pec1(y7e1VarD, z2f1Var, (lnm) null, (byte) 16);
                    x340Var.s0(objT);
                }
                qxd0.t(boolValueOf, x340Var, (vu30) objT);
                boolean zE = x340Var.e(q2f1Var2.c) | x340Var.h(q2f1Var2.e);
                Object objT2 = x340Var.T();
                if (zE || objT2 == obj7) {
                    objT2 = yv91.a(new o8e1(z2f1Var, q2f1Var2, watVar, (byte) 4));
                    x340Var.s0(objT2);
                }
                tob1 tob1Var2 = (tob1) objT2;
                boolean zG = x340Var.g(tob1Var2);
                Object objT3 = x340Var.T();
                if (zG || objT3 == obj7) {
                    objT3 = yv91.a(new bu2(tob1Var2, (byte) 24));
                    x340Var.s0(objT3);
                }
                tob1 tob1Var3 = (tob1) objT3;
                ven0 ven0VarH = rwq.h(z2f1Var.t.a, x340Var, 0);
                boolean zG2 = x340Var.g(ven0VarH) | x340Var.g(tob1Var3);
                Object objT4 = x340Var.T();
                if (zG2 || objT4 == obj7) {
                    objT4 = new v260(ven0VarH, tob1Var3);
                    x340Var.s0(objT4);
                }
                v260 v260Var = (v260) objT4;
                boolean zG3 = x340Var.g(tob1Var2);
                Object objT5 = x340Var.T();
                if (zG3 || objT5 == obj7) {
                    objT5 = new ygr0(tob1Var2, 6);
                    x340Var.s0(objT5);
                }
                ygr0 ygr0Var = (ygr0) objT5;
                boolean zG4 = x340Var.g(ven0VarH);
                Object objT6 = x340Var.T();
                if (zG4 || objT6 == obj7) {
                    objT6 = yv91.a(new bu2(ven0VarH, (byte) 25));
                    x340Var.s0(objT6);
                }
                tob1 tob1Var4 = (tob1) objT6;
                boolean zA = z2f1Var.b.a();
                mgr0 mgr0Var = (zA && q2f1Var2.g) ? mgr0.a : lgr0.a;
                uu0 uu0Var = z2f1Var.h;
                if (!q2f1Var2.f) {
                    uu0Var = null;
                }
                if (uu0Var == null) {
                    x340Var.i0(1890316544);
                    z = false;
                    x340Var.r(false);
                    j2iVarR = null;
                } else {
                    x340Var.i0(1890316545);
                    j2iVarR = apo.r(286355712, new zp51(zA, uu0Var, v260Var, tob1Var4), x340Var);
                    z = false;
                    x340Var.r(false);
                }
                boolean zI2 = (((((iIntValue & 112) ^ 48) <= 32 || !x340Var.g(q2f1Var2)) && (iIntValue & 48) != 32) ? z : true) | x340Var.i(tob1Var2) | x340Var.h(zA) | x340Var.i(watVar) | x340Var.i(tob1Var3) | x340Var.e(flb0Var.ordinal());
                Object objT7 = x340Var.T();
                if (zI2 || objT7 == obj7) {
                    q2f1Var = q2f1Var2;
                    tob1Var = tob1Var3;
                    objT7 = new gdv(q2f1Var, tob1Var2, zA, watVar, tob1Var, flb0Var);
                    x340Var.s0(objT7);
                } else {
                    q2f1Var = q2f1Var2;
                    tob1Var = tob1Var3;
                }
                qim0 qim0VarQ = exd0.q(nim0Var, (iu30) objT7);
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                pgr0 pgr0Var = new pgr0(u7h.b(((yex) zscVar.d).a, 0.4f, 0.0f, 0.0f, 0.0f, 14), u7h.b(((yex) zscVar.d).b, 0.7f, 0.0f, 0.0f, 0.0f, 14));
                j2i j2iVarR2 = apo.r(1306901382, new bvd1(q2f1Var, y7e1VarD, iu30Var, tob1Var, (byte) 5), x340Var);
                boolean zI3 = x340Var.i(y7e1VarD);
                if ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) {
                    z = true;
                }
                boolean z4 = z | zI3;
                Object objT8 = x340Var.T();
                if (z4 || objT8 == obj7) {
                    objT8 = new efb(y7e1VarD, iu30Var, (byte) 12);
                    x340Var.s0(objT8);
                }
                bzn1.e(qim0VarQ, j2iVarR2, false, j2iVarR, pgr0Var, mgr0Var, ygr0Var, (Function0) objT8, x340Var, 2097200, 4);
                return rih1Var;
            case 1:
                p8f1 p8f1Var = (p8f1) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                ((Number) obj5).intValue();
                z72 z72Var = (z72) obj6;
                x340 x340Var2 = (b0k) obj4;
                Object objT9 = x340Var2.T();
                if (objT9 == fkj0.X) {
                    objT9 = v8r.q((Object) null);
                    x340Var2.s0(objT9);
                }
                mod.b(oi7.a.a((gw70) z72Var.e), apo.r(-1437694302, new u8f1(p8f1Var, iu30Var2, (ven0) objT9, z72Var, (byte) 1), x340Var2), x340Var2, 56);
                return rih1Var;
            case 2:
                boolean z5 = true;
                z8f1 z8f1Var = (z8f1) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                List list = z8f1Var.a;
                gw70 gw70Var = ((b9f1) obj6).b;
                boolean z6 = (((iIntValue2 & 112) ^ 48) > 32 && x340Var3.g(z8f1Var)) || (iIntValue2 & 48) == 32;
                if ((((iIntValue2 & 896) ^ 384) <= 256 || !x340Var3.g(iu30Var3)) && (iIntValue2 & 384) != 256) {
                    z5 = false;
                }
                boolean z7 = z5 | z6;
                x340 x340Var4 = x340Var3;
                Object objT10 = x340Var4.T();
                if (z7 || objT10 == fkj0.X) {
                    objT10 = new cmd1(z8f1Var, iu30Var3, (byte) 20);
                    x340Var4.s0(objT10);
                }
                pqo.f(list, gw70Var, (iu30) objT10, (qim0) null, x340Var4, 0);
                return rih1Var;
            case 3:
                odf1.g((qdf1) obj2, (nef1) ((xdf1) obj6).Y.getValue(), null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 4:
                kef1 kef1Var = (kef1) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nef1 nef1Var = (nef1) obj6;
                cvt0 cvt0Var = kef1Var.c;
                String str = cvt0Var != null ? cvt0Var.e : null;
                Flowable flowable = nef1Var.e;
                vbm[] vbmVarArr = q601.a;
                mod.b(oi7.a.a(nef1Var.a), apo.r(-555635843, new bvd1(kef1Var, iu30Var4, nef1Var, rwq.g(new apw(new kge(flowable), str, (byte) 2), Boolean.FALSE, (o8n) null, b0kVar, 48, 2), (byte) 12), b0kVar), b0kVar, 56);
                return rih1Var;
            case 5:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                uef1 uef1Var = (uef1) obj6;
                mod.b(oi7.a.a(uef1Var.a), apo.r(393927678, new bvd1((qef1) obj2, (iu30) obj3, rwq.g(uef1Var.e, (Object) null, (o8n) null, b0kVar2, 48, 2), uef1Var, (byte) 14), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 6:
                yff1 yff1Var = (yff1) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                ((Number) obj5).intValue();
                pt ptVar = (pt) obj6;
                x340 x340Var5 = (b0k) obj4;
                Object objT11 = x340Var5.T();
                if (objT11 == fkj0.X) {
                    objT11 = v8r.q((Object) null);
                    x340Var5.s0(objT11);
                }
                mod.b(oi7.a.a((gw70) ptVar.d), apo.r(-555375678, new bgf1(yff1Var, iu30Var5, (ven0) objT11, ptVar, (byte) 1), x340Var5), x340Var5, 56);
                return rih1Var;
            case 7:
                egf1 egf1Var = (egf1) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var6 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                int i2 = (iIntValue3 & 48) == 0 ? iIntValue3 | (x340Var6.g(egf1Var) ? 32 : 16) : iIntValue3;
                if ((iIntValue3 & 384) == 0) {
                    i2 |= x340Var6.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    fqg0 fqg0VarU = q1o1.u((jpg0) ((kls0) obj6).b, u291.f(nim0Var, 1.0f), (FrameLayout.LayoutParams) null, 6);
                    boolean z8 = (i2 & 896) == 256;
                    Object objT12 = x340Var7.T();
                    if (z8 || objT12 == fkj0.X) {
                        objT12 = new fgf1(iu30Var6, (byte) 0);
                        x340Var7.s0(objT12);
                    }
                    c680.r(egf1Var, fqg0VarU, qim0VarF, (Function0) objT12, x340Var7, ((i2 >> 3) & 14) | 384);
                } else {
                    x340Var7.b0();
                }
                return rih1Var;
            case 8:
                elf1 elf1Var = (elf1) obj2;
                x340 x340Var8 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (elf1Var instanceof dlf1) {
                    x340 x340Var9 = x340Var8;
                    x340Var9.i0(1256427561);
                    ArrayList<flf1> arrayList = ((dlf1) elf1Var).a;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((flf1) it.next()).b);
                    }
                    boolean z9 = o7h.j0(arrayList2).size() == 1;
                    qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                    glf1 glf1Var = (glf1) obj6;
                    mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var9, 0);
                    int iHashCode = Long.hashCode(x340Var9.T);
                    xos0 xos0VarM = x340Var9.m();
                    qim0 qim0VarE = zr7.E(x340Var9, qim0VarF2);
                    hzj.A.getClass();
                    if (x340Var9.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var9.m0();
                    if (x340Var9.S) {
                        x340Var9.l(hmb0.t1);
                    } else {
                        x340Var9.v0();
                    }
                    nko1.H(mbhVarA, x340Var9, y580.O0);
                    nko1.H(xos0VarM, x340Var9, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var9, y580.R0);
                    nko1.F(x340Var9);
                    nko1.H(qim0VarE, x340Var9, y580.Y);
                    xpw xpwVar = glf1Var.e;
                    boolean z10 = !z9;
                    String strO0 = cwl1.o0(x340Var9, 2131952472);
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    for (flf1 flf1Var : arrayList) {
                        arrayList3.add(new xkf1(flf1Var.a, flf1Var.b));
                    }
                    otw.c(xpwVar, new wkf1(strO0, mqo1.A(arrayList3), z10), (qim0) null, (ipb1) null, x340Var9, 0, 12);
                    x340Var9.r(true);
                    x340Var9.r(false);
                } else {
                    x340 x340Var10 = x340Var8;
                    x340Var10.i0(-236541102);
                    x340Var10.r(false);
                }
                return rih1Var;
            case 9:
                tof1 tof1Var = (tof1) obj2;
                x340 x340Var11 = (b0k) obj4;
                ((Number) obj5).intValue();
                ujo ujoVar = (ujo) obj6;
                if (tof1Var instanceof rof1) {
                    x340 x340Var12 = x340Var11;
                    x340Var12.i0(1895617585);
                    ujoVar.g(((rof1) tof1Var).a, x340Var12, 0);
                    x340Var12.r(false);
                } else if (tof1Var.equals(sof1.a)) {
                    x340 x340Var13 = x340Var11;
                    x340Var13.i0(1895619659);
                    ujoVar.f(x340Var13, 0);
                    x340Var13.r(false);
                } else {
                    if (!tof1Var.equals(qof1.a)) {
                        throw p3d1.k(x340Var11, 1895615927, false);
                    }
                    x340 x340Var14 = x340Var11;
                    x340Var14.i0(1895621501);
                    x340Var14.r(false);
                }
                return rih1Var;
            case 10:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((grf1) obj6).a), apo.r(-1744577138, new frf1((erf1) obj2, (iu30) obj3, (byte) 1), b0kVar3), b0kVar3, 56);
                return rih1Var;
            case 11:
                tva1 tva1Var = (tva1) obj6;
                trf1 trf1Var = (trf1) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                String str2 = (String) o7h.X0(trf1Var.b);
                if (str2 == null || trf1Var.k) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(-742207039);
                    x340Var16.r(false);
                    boolean z11 = trf1Var.k;
                    String str3 = trf1Var.m;
                    int i3 = (iIntValue4 & 896) ^ 384;
                    boolean zI4 = ((i3 > 256 && x340Var16.g(iu30Var7)) || (iIntValue4 & 384) == 256) | x340Var16.i(trf1Var);
                    Object objT13 = x340Var16.T();
                    if (zI4 || objT13 == m4cVar) {
                        objT13 = new wrf1(iu30Var7, trf1Var, (byte) 0);
                        x340Var16.s0(objT13);
                    }
                    Function0 function0 = (Function0) objT13;
                    boolean zI5 = ((i3 > 256 && x340Var16.g(iu30Var7)) || (iIntValue4 & 384) == 256) | x340Var16.i(trf1Var);
                    Object objT14 = x340Var16.T();
                    if (zI5 || objT14 == m4cVar) {
                        objT14 = new wrf1(iu30Var7, trf1Var, (byte) 1);
                        x340Var16.s0(objT14);
                    }
                    Function0 function1 = (Function0) objT14;
                    boolean zI6 = ((i3 > 256 && x340Var16.g(iu30Var7)) || (iIntValue4 & 384) == 256) | x340Var16.i(trf1Var);
                    Object objT15 = x340Var16.T();
                    if (zI6 || objT15 == m4cVar) {
                        objT15 = new xaf1(iu30Var7, trf1Var, (byte) 8);
                        x340Var16.s0(objT15);
                    }
                    vu30 vu30Var = (vu30) objT15;
                    boolean zI7 = ((i3 > 256 && x340Var16.g(iu30Var7)) || (iIntValue4 & 384) == 256) | x340Var16.i(trf1Var);
                    Object objT16 = x340Var16.T();
                    if (zI7 || objT16 == m4cVar) {
                        objT16 = new wrf1(iu30Var7, trf1Var, (byte) 2);
                        x340Var16.s0(objT16);
                    }
                    Function0 function2 = (Function0) objT16;
                    boolean z12 = (i3 > 256 && x340Var16.g(iu30Var7)) || (iIntValue4 & 384) == 256;
                    Object objT17 = x340Var16.T();
                    if (z12 || objT17 == m4cVar) {
                        objT17 = new b1c1(iu30Var7, (byte) 25);
                        x340Var16.s0(objT17);
                    }
                    tva1Var.h(z11, str3, trf1Var, function0, function1, vu30Var, function2, (iu30) objT17, x340Var16, (iIntValue4 << 3) & 896);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(-742525130);
                    if (trf1Var.l) {
                        z2 = false;
                        x340Var17.i0(-742421435);
                        tva1Var.i(str2, trf1Var.f, trf1Var.g, x340Var17, 0);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(-742485109);
                        z2 = false;
                        tva1Var.f(x340Var17, 0);
                        x340Var17.r(false);
                    }
                    x340Var17.r(z2);
                }
                return rih1Var;
            case 12:
                guf1 guf1Var = (guf1) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                i091 i091Var = guf1Var.f;
                boolean z13 = guf1Var.d;
                x340 x340Var18 = (b0k) obj4;
                boolean zG5 = x340Var18.g(guf1Var.a);
                Object objT18 = x340Var18.T();
                if (zG5 || objT18 == m4cVar2) {
                    objT18 = v8r.q(Boolean.TRUE);
                    x340Var18.s0(objT18);
                }
                ven0 ven0Var = (ven0) objT18;
                o091 o091Var = i091Var.h;
                Boolean boolValueOf2 = Boolean.valueOf(z13);
                int i4 = (iIntValue5 & 896) ^ 384;
                boolean zI8 = ((i4 > 256 && x340Var18.g(iu30Var8)) || (iIntValue5 & 384) == 256) | x340Var18.i(ven0Var) | x340Var18.i(guf1Var);
                Object objT19 = x340Var18.T();
                if (zI8 || objT19 == m4cVar2) {
                    objT19 = new ku91(ven0Var, guf1Var, iu30Var8, (lnm) null, (byte) 16);
                    th = null;
                    x340Var18.s0(objT19);
                } else {
                    th = null;
                }
                qxd0.s(o091Var, boolValueOf2, (vu30) objT19, x340Var18);
                qim0 qim0VarR = u291.r(nim0Var, 120.0f);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var18).f;
                qim0 qim0VarQ2 = i1p1.q(qim0VarR, er31.b(4.0f));
                Throwable th2 = th;
                long jA = cbx.a(x340Var18).a.b.a();
                u5j1 u5j1Var = d4o1.a;
                qim0 qim0VarF3 = dug.f(qim0VarQ2, jA, u5j1Var);
                yup0 yup0Var = (yup0) obj6;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var18.T);
                xos0 xos0VarM2 = x340Var18.m();
                qim0 qim0VarE2 = zr7.E(x340Var18, qim0VarF3);
                hzj.A.getClass();
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw th2;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(hmb0.t1);
                } else {
                    x340Var18.v0();
                }
                nko1.H(gfh0VarC, x340Var18, y580.O0);
                nko1.H(xos0VarM2, x340Var18, y580.N0);
                nko1.H(Integer.valueOf(iHashCode2), x340Var18, y580.R0);
                nko1.F(x340Var18);
                nko1.H(qim0VarE2, x340Var18, y580.Y);
                String str4 = guf1Var.c;
                h2c h2cVar = h2c.a;
                if (str4 == null) {
                    x340Var18.i0(-273837014);
                    i = 0;
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-273837013);
                    Uri uri = Uri.parse(str4);
                    qim0 qim0VarB = h2cVar.b(nim0Var);
                    ltx ltxVar = ltx.c;
                    eso1.e(uri, isl.a, qim0VarB, (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, new nux(ltxVar, ltxVar), false, false, x340Var18, 1073741872, 0, 3576);
                    i = 0;
                    x340Var18.r(false);
                }
                t1c.a(dug.f(h2cVar.b(nim0Var), u7h.b(u7h.b, 0.2f, 0.0f, 0.0f, 0.0f, 14), u5j1Var), x340Var18, i);
                boolean z14 = guf1Var.e;
                boolean zI9 = ((i4 > 256 && x340Var18.g(iu30Var8)) || (iIntValue5 & 384) == 256) | x340Var18.i(ven0Var) | x340Var18.i(guf1Var) | x340Var18.i(yup0Var);
                Object objT20 = x340Var18.T();
                if (zI9 || objT20 == m4cVar2) {
                    objT20 = new odp0(ven0Var, iu30Var8, guf1Var, yup0Var, (byte) 21);
                    x340Var18.s0(objT20);
                }
                gra graVar = een.h;
                k1p1.e(0, (Function0) objT20, x340Var18, h2cVar.a(nim0Var, graVar), z14);
                if (z13) {
                    x340Var18.i0(-272995549);
                    hr80.e(i091Var, (yqg) yup0Var.c, h2cVar.a(nim0Var, graVar), x340Var18, 0);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-272831218);
                    x340Var18.r(false);
                }
                x340Var18.r(true);
                return rih1Var;
            case 13:
                int iIntValue6 = ((Number) obj5).intValue();
                nl9 nl9Var = (nl9) obj6;
                hqq0.B((quf1) obj2, (abu0) nl9Var.g, (iac0) nl9Var.h, (yqg) nl9Var.t, (iu30) obj3, (b0k) obj4, ((iIntValue6 >> 3) & 14) | ((iIntValue6 << 6) & 57344));
                return rih1Var;
            case 14:
                myf1 myf1Var = (myf1) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var19 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                int i5 = (iIntValue7 & 48) == 0 ? iIntValue7 | ((iIntValue7 & 64) == 0 ? x340Var19.g(myf1Var) : x340Var19.i(myf1Var) ? 32 : 16) : iIntValue7;
                if ((iIntValue7 & 384) == 0) {
                    i5 |= x340Var19.i(iu30Var9) ? 256 : 128;
                }
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    nyx.a(2, (wux) null, apo.r(376441935, new juc1(myf1Var, (tva1) obj6, iu30Var9, (byte) 25), x340Var20), x340Var20, 3078, 6);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case 15:
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                nl9 nl9Var2 = (nl9) obj6;
                mod.b(oi7.a.a((gw70) nl9Var2.b), apo.r(-982247462, new juc1((e2g1) obj2, nl9Var2, (iu30) obj3, (byte) 27), b0kVar4), b0kVar4, 56);
                return rih1Var;
            case 16:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                adg1 adg1Var = (adg1) obj6;
                mod.b(oi7.a.a(adg1Var.O0), apo.r(-1610323028, new xaf1((wcg1) obj2, adg1Var, (byte) 10), b0kVar5), b0kVar5, 56);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                aeg1 aeg1Var = (aeg1) obj6;
                mod.b(oi7.a.a(aeg1Var.X), apo.r(-945105930, new juc1((xdg1) obj2, (iu30) obj3, aeg1Var, (byte) 28), b0kVar6), b0kVar6, 56);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return a(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return e(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                ven0 ven0VarH2 = rwq.h(((yg01) obj6).d, x340Var21, 0);
                gox goxVar = gox.c;
                String strO1 = cwl1.o0(x340Var21, 2131963242);
                t2g t2gVar = new t2g(((Boolean) ven0VarH2.getValue()).booleanValue(), false, (qex) null, 6);
                if ((((iIntValue8 & 896) ^ 384) <= 256 || !x340Var21.g(iu30Var10)) && (iIntValue8 & 384) != 256) {
                    z3 = false;
                }
                x340 x340Var22 = x340Var21;
                boolean zI10 = x340Var22.i(ven0VarH2) | z3;
                Object objT21 = x340Var22.T();
                if (zI10 || objT21 == fkj0.X) {
                    objT21 = new rc21(iu30Var10, ven0VarH2, (byte) 13);
                    x340Var22.s0(objT21);
                }
                kyo1.c(strO1, goxVar, (Function0) objT21, (qim0) null, false, (String) null, t2gVar, (vu30) null, x340Var22, gox.d << 3, 184);
                return rih1Var;
            case 22:
                return f(obj, obj2, obj3, obj4, obj5);
            case 23:
                return g(obj, obj2, obj3, obj4, obj5);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return h(obj, obj2, obj3, obj4, obj5);
            case 25:
                return i(obj, obj2, obj3, obj4, obj5);
            case 26:
                return j(obj, obj2, obj3, obj4, obj5);
            case 27:
                return k(obj, obj2, obj3, obj4, obj5);
            case 28:
                return m(obj, obj2, obj3, obj4, obj5);
            default:
                tyh1 tyh1Var = (tyh1) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                suh1 suh1Var = (suh1) obj6;
                m4c m4cVar3 = fkj0.X;
                dzh1 dzh1Var = tyh1Var.a;
                if (tyh1Var.b) {
                    x340 x340Var24 = x340Var23;
                    x340Var24.i0(1678714693);
                    qim0 qim0VarH = l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var24), false, 14);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var24).g, 32, qim0VarH);
                    String str5 = dzh1Var.a;
                    String str6 = dzh1Var.b;
                    String str7 = dzh1Var.e;
                    String str8 = dzh1Var.h;
                    boolean z15 = (((iIntValue9 & 896) ^ 384) > 256 && x340Var24.g(iu30Var11)) || (iIntValue9 & 384) == 256;
                    Object objT22 = x340Var24.T();
                    if (z15 || objT22 == m4cVar3) {
                        objT22 = new fgf1(iu30Var11, (byte) 28);
                        x340Var24.s0(objT22);
                    }
                    oap1.c(str5, str6, str7, str8, (Function0) objT22, qim0VarP, x340Var24, 0);
                    x340Var24.r(false);
                } else {
                    x340 x340Var25 = x340Var23;
                    x340Var25.i0(1679133224);
                    ven0 ven0VarK = f4p1.k(((jtl1) suh1Var.e).b, (iac0) null, x340Var25, 7);
                    qim0 qim0VarH2 = l6o1.H(nim0Var, l6o1.C(0, 0, 1, x340Var25), false, 14);
                    WeakHashMap weakHashMap2 = osl1.x;
                    qim0 qim0VarP2 = x0d.p(lhc.g(x340Var25).g, 32, qim0VarH2);
                    htl1 htl1Var = (htl1) ven0VarK.getValue();
                    oyh1 oyh1Var = new oyh1(dzh1Var.e, dzh1Var.a, dzh1Var.b, dzh1Var.c, dzh1Var.f, dzh1Var.d, dzh1Var.h);
                    int i6 = (iIntValue9 & 896) ^ 384;
                    boolean z16 = (i6 > 256 && x340Var25.g(iu30Var11)) || (iIntValue9 & 384) == 256;
                    Object objT23 = x340Var25.T();
                    if (z16 || objT23 == m4cVar3) {
                        objT23 = new fgf1(iu30Var11, (byte) 29);
                        x340Var25.s0(objT23);
                    }
                    Function0 function3 = (Function0) objT23;
                    boolean z17 = (i6 > 256 && x340Var25.g(iu30Var11)) || (iIntValue9 & 384) == 256;
                    Object objT24 = x340Var25.T();
                    if (z17 || objT24 == m4cVar3) {
                        objT24 = new uyh1(iu30Var11, (byte) 0);
                        x340Var25.s0(objT24);
                    }
                    ilo1.q(oyh1Var, htl1Var, function3, (Function0) objT24, qim0VarP2, x340Var25, 0);
                    x340Var25.r(false);
                }
                los losVar = (los) suh1Var.f;
                x340 x340Var26 = x340Var23;
                boolean zI11 = x340Var26.i(suh1Var);
                if ((((iIntValue9 & 896) ^ 384) <= 256 || !x340Var26.g(iu30Var11)) && (iIntValue9 & 384) != 256) {
                    z3 = false;
                }
                boolean z18 = z3 | zI11;
                Object objT25 = x340Var26.T();
                if (z18 || objT25 == m4cVar3) {
                    objT25 = new rzf1(suh1Var, iu30Var11, (byte) 18);
                    x340Var26.s0(objT25);
                }
                qxd0.h(losVar, iu30Var11, (iu30) objT25, x340Var26);
                return rih1Var;
        }
    }
}
