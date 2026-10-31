package p;

import android.net.Uri;
import android.view.ViewGroup;
import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h1m extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1m(bxn bxnVar, cvx cvxVar) {
        super(2);
        this.a = (byte) 28;
        this.b = bxnVar;
    }

    private final Object a(Object obj, Object obj2) {
        String strN0;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        ftm ftmVar = (ftm) this.b;
        byte b = 2;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                v1k v1kVar = ftmVar.e;
                htm htmVar = ftmVar.b;
                objT = v1kVar.y(htmVar.b, htmVar.c, htmVar.d, true);
                x340Var2.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, mio0.a, (o8n) null, x340Var2, 0, 2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var2).b.c, 1, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131954545);
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = cbx.a(x340Var2).b.a;
            float f = cbx.b(x340Var2).b.c;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(strO0, uyn1.y(nim0Var, f, 16.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            nio0 nio0Var = (nio0) ven0VarG.getValue();
            if (nio0Var instanceof lio0) {
                x340Var2.i0(748699479);
                for (yho0 yho0Var : ((lio0) nio0Var).a) {
                    boolean z = yho0Var.c;
                    gho0 gho0Var = yho0Var.b;
                    String str = gho0Var.a;
                    if (z) {
                        strN0 = x0d.k(x340Var2, -2089117740, 2131954546, x340Var2, false);
                    } else {
                        x340Var2.i0(-2089010325);
                        strN0 = cwl1.n0(2131954547, new Object[]{str == null ? "" : str}, x340Var2);
                        x340Var2.r(false);
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str2 = gho0Var.b;
                    boolean zI = x340Var2.i(ftmVar) | x340Var2.i(yho0Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new sqm(ftmVar, yho0Var, b);
                        x340Var2.s0(objT2);
                    }
                    gho1.h(0, str, strN0, str2, (Function0) objT2, x340Var2, (qim0) null);
                }
                x340Var2.r(false);
            } else {
                x340Var2.i0(749417346);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.lnm */
    private final Object d(Object obj, Object obj2) throws lnm {
        lnm lnmVar;
        wm00 wm00Var;
        max haxVar;
        m4c m4cVar;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        mtm mtmVar = (mtm) this.b;
        ttm ttmVar = mtmVar.c;
        byte b = 0;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        Object objT = x340Var2.T();
        m4c m4cVar2 = fkj0.X;
        if (objT == m4cVar2) {
            objT = qxd0.M(o6x.a, x340Var2);
            x340Var2.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        d0r d0rVar = mtmVar.d;
        dma1 dma1Var = mtmVar.l.a;
        boolean z = ttmVar instanceof qtm;
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar2) {
            objT2 = c13.l(z && !dma1Var.h(kio0.b, false), x340Var2);
        }
        ven0 ven0Var = (ven0) objT2;
        boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
        nim0 nim0Var = nim0.a;
        byte b2 = 3;
        if (zBooleanValue) {
            x340Var2.i0(-543573221);
            boolean zI = x340Var2.i(mtmVar);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar2) {
                objT3 = new itm(mtmVar, b);
                x340Var2.s0(objT3);
            }
            qxd0.i(rih1Var, (iu30) objT3, x340Var2);
            boolean zI2 = x340Var2.i(mtmVar) | x340Var2.i(ven0Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar2) {
                objT4 = new sqm(mtmVar, ven0Var, b2);
                x340Var2.s0(objT4);
            }
            Function0 function0 = (Function0) objT4;
            boolean zI3 = x340Var2.i(c9nVar) | x340Var2.i(mtmVar);
            Object objT5 = x340Var2.T();
            if (zI3 || objT5 == m4cVar2) {
                objT5 = new ktm(c9nVar, mtmVar, (byte) 0);
                x340Var2.s0(objT5);
            }
            Function0 function1 = (Function0) objT5;
            boolean zI4 = x340Var2.i(c9nVar) | x340Var2.i(mtmVar);
            Object objT6 = x340Var2.T();
            if (zI4 || objT6 == m4cVar2) {
                objT6 = new ktm(c9nVar, mtmVar, (byte) 1);
                x340Var2.s0(objT6);
            }
            WeakHashMap weakHashMap = osl1.x;
            tho1.i(function0, function1, (Function0) objT6, td6.o(lhc.g(x340Var2).g, 32, nim0Var), x340Var2, 0);
            x340Var2.r(false);
            return rih1Var;
        }
        x340Var2.i0(-542774630);
        x340Var2.r(false);
        Object objT7 = x340Var2.T();
        if (objT7 == m4cVar2) {
            objT7 = mtmVar.f.a(d0rVar);
            x340Var2.s0(objT7);
        }
        xrm xrmVar = (xrm) objT7;
        d0r d0rVar2 = d0rVar;
        y7e1 y7e1VarD = c4p1.D(0, 3, (String) null, x340Var2);
        boolean z2 = ttmVar instanceof stm;
        if (!z2 || dma1Var.h(kio0.b, false)) {
            x340Var2.i0(-542401638);
            x340Var2.r(false);
        } else {
            x340Var2.i0(-542484284);
            boolean zI5 = x340Var2.i(mtmVar);
            Object objT8 = x340Var2.T();
            if (zI5 || objT8 == m4cVar2) {
                objT8 = new ltm(mtmVar, null, (byte) 0);
                x340Var2.s0(objT8);
            }
            qxd0.t(rih1Var, x340Var2, (vu30) objT8);
            x340Var2.r(false);
        }
        if (!z2) {
            d0rVar2 = null;
        }
        stm stmVar = z2 ? (stm) ttmVar : null;
        String str = stmVar != null ? stmVar.b : null;
        stm stmVar2 = z2 ? (stm) ttmVar : null;
        String str2 = stmVar2 != null ? stmVar2.c : null;
        stm stmVar3 = z2 ? (stm) ttmVar : null;
        String str3 = stmVar3 != null ? stmVar3.d : null;
        String strM = ttmVar.M();
        smc0 smc0VarA = mtmVar.g.a();
        o3r o3rVar = ptm.a;
        x340Var2.i0(1879736842);
        if (d0rVar2 == null || str == null || str2 == null) {
            ttmVar = ttmVar;
            rih1Var = rih1Var;
            lnmVar = null;
            x340Var2.r(false);
            wm00Var = null;
        } else {
            boolean zG = x340Var2.g(str) | x340Var2.g(str2) | x340Var2.g(str3) | x340Var2.g(smc0VarA);
            Object objT9 = x340Var2.T();
            if (zG || objT9 == m4cVar2) {
                lnmVar = null;
                objT9 = new mqm(new jvm(str, str2, str3), new lqm(Collections.singletonList(ovm.a), smc0VarA, (qle1) null, 4));
                x340Var2.s0(objT9);
            } else {
                lnmVar = null;
            }
            mqm mqmVar = (mqm) objT9;
            boolean zI6 = x340Var2.i(d0rVar2) | x340Var2.i(mqmVar) | x340Var2.g(strM);
            Object objT10 = x340Var2.T();
            if (zI6 || objT10 == m4cVar2) {
                objT10 = new x4c((Object) d0rVar2, (Object) mqmVar, strM, lnmVar, (byte) 28);
                x340Var2.s0(objT10);
            }
            wm00 wm00Var2 = (wm00) yto.p(lnmVar, mqmVar, (vu30) objT10, x340Var2, 6).getValue();
            x340Var2.r(false);
            wm00Var = wm00Var2;
        }
        if (z2 && wm00Var == null) {
            return rih1Var;
        }
        boolean zG2 = x340Var2.g(wm00Var) | x340Var2.i(y7e1VarD);
        Object objT11 = x340Var2.T();
        if (zG2 || objT11 == m4cVar2) {
            objT11 = new zti(wm00Var, y7e1VarD, lnmVar, (byte) 29);
            x340Var2.s0(objT11);
        }
        qxd0.t(wm00Var, x340Var2, (vu30) objT11);
        boolean zY0 = ihc1.y0(y7e1VarD.d().d);
        boolean zG3 = x340Var2.g(wm00Var);
        Object objT12 = x340Var2.T();
        if (zG3 || objT12 == m4cVar2) {
            lnm lnmVar2 = wm00Var != null ? wm00Var.b : lnmVar;
            if (lnmVar2 == null) {
                lnmVar2 = "spotify:contribution:";
            }
            objT12 = p6p1.t(ttmVar.c(), lnmVar2);
            x340Var2.s0(objT12);
        }
        k3l0 k3l0Var = (k3l0) objT12;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        WeakHashMap weakHashMap2 = osl1.x;
        qim0 qim0VarY = voo1.y(x0d.p(lhc.g(x340Var2).g, 32, qim0VarF), voo1.f);
        uwr uwrVar = cbx.a;
        qim0 qim0VarX = uyn1.x(qim0VarY, cbx.b(x340Var2).b.c);
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        lnm lnmVar3 = lnmVar;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw lnmVar3;
        }
        x340Var2.m0();
        boolean z3 = x340Var2.S;
        n4k n4kVar = hmb0.t1;
        if (z3) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar3);
        nko1.F(x340Var2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar4);
        qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
        fra fraVar = een.N0;
        cvx cvxVar = cbx.b(x340Var2).b;
        wm00 wm00Var3 = wm00Var;
        jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var2, 0);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(jw31VarA, x340Var2, lljVar);
        nko1.H(xos0VarM2, x340Var2, lljVar2);
        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
        nko1.H(qim0VarE2, x340Var2, lljVar4);
        zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
        ldx ldxVar = ldx.c;
        String strO0 = cwl1.o0(x340Var2, 2131954549);
        boolean zI7 = x340Var2.i(mtmVar) | x340Var2.i(k3l0Var) | x340Var2.i(c9nVar);
        Object objT13 = x340Var2.T();
        if (zI7 || objT13 == m4cVar2) {
            objT13 = new ssm(mtmVar, k3l0Var, c9nVar, (byte) 1);
            x340Var2.s0(objT13);
        }
        Function0 function2 = (Function0) objT13;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function2);
        j2i j2iVar = hgi.a;
        max maxVar = jax.a;
        foo1.c(gbxVar, ldxVar, (qim0) null, maxVar, (gdx) null, zzq0VarH, (idn0) null, (ga80) null, (vu30) null, (vu30) null, j2iVar, x340Var2, 0, 48, 1964);
        cjc0 cjc0Var = new cjc0(1);
        lee1 lee1Var = cbx.d(x340Var2).h;
        String strO1 = cwl1.o0(x340Var2, z2 ? 2131954551 : 2131954548);
        wnb0 wnb0Var = new wnb0(1.0f, true);
        cvx cvxVar2 = cbx.b(x340Var2).b;
        uwo1.e(strO1, uyn1.w(wnb0Var, uyn1.h(2, 4.0f, 0.0f)), lee1Var, 0L, new a0e1(3), (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1768);
        if (zY0) {
            x340Var2.i0(566525863);
            haxVar = new hax(cwl1.o0(x340Var2, 2131954557));
            x340Var2.r(false);
        } else {
            x340Var2.i0(566461662);
            x340Var2.r(false);
            haxVar = maxVar;
        }
        zzq0 zzq0VarH2 = uyn1.h(3, 0.0f, 0.0f);
        String strO2 = cwl1.o0(x340Var2, 2131954556);
        boolean zI8 = x340Var2.i(mtmVar) | x340Var2.i(k3l0Var) | x340Var2.i(c9nVar) | x340Var2.i(y7e1VarD) | x340Var2.g(wm00Var3);
        Object objT14 = x340Var2.T();
        if (zI8 || objT14 == m4cVar2) {
            m4cVar = m4cVar2;
            vt1 vt1Var = new vt1(mtmVar, k3l0Var, c9nVar, y7e1VarD, wm00Var3);
            x340Var2.s0(vt1Var);
            objT14 = vt1Var;
        } else {
            m4cVar = m4cVar2;
        }
        Function0 function3 = (Function0) objT14;
        if (ihc1.y0(strO2)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        foo1.c(new gbx(new y50(strO2), function3), ldxVar, (qim0) null, haxVar, (gdx) null, zzq0VarH2, (idn0) null, (ga80) null, (vu30) null, (vu30) null, hgi.b, x340Var2, 0, 48, 1964);
        x340Var2.r(true);
        yrm yrmVar = new yrm(mtmVar.c.c());
        cvx cvxVar3 = cbx.b(x340Var2).b;
        otw.c(xrmVar, yrmVar, uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), (ipb1) null, x340Var2, 0, 8);
        cvx cvxVar4 = cbx.b(x340Var2).b;
        qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 16.0f, 0.0f, 0.0f, 13);
        boolean zI9 = x340Var2.i(mtmVar);
        Object objT15 = x340Var2.T();
        if (zI9 || objT15 == m4cVar) {
            objT15 = new itm(mtmVar, (byte) 2);
            x340Var2.s0(objT15);
        }
        nho1.h(y7e1VarD, tho0.a, (iu30) objT15, qim0VarB, (iu30) null, x340Var2, 0, 16);
        x340Var2.r(true);
        return rih1Var;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        wtm wtmVar = (wtm) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objT = x340Var2.T();
            if (objT == m4cVar) {
                v1k v1kVar = wtmVar.e;
                ytm ytmVar = wtmVar.b;
                objT = v1kVar.y(ytmVar.b, ytmVar.c, ytmVar.d, false);
                x340Var2.s0(objT);
            }
            ven0 ven0VarG = rwq.g((mr20) objT, mio0.a, (o8n) null, x340Var2, 0, 2);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarF);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var2).b.c, 1, qim0VarP);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO0 = cwl1.o0(x340Var2, 2131954570);
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = cbx.a(x340Var2).b.a;
            float f = cbx.b(x340Var2).b.c;
            cvx cvxVar = cbx.b(x340Var2).b;
            uwo1.e(strO0, uyn1.y(nim0Var, f, 16.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            nio0 nio0Var = (nio0) ven0VarG.getValue();
            if (nio0Var instanceof lio0) {
                x340Var2.i0(-523307082);
                for (yho0 yho0Var : ((lio0) nio0Var).a) {
                    String str = yho0Var.b.a;
                    String str2 = str == null ? "" : str;
                    if (str == null) {
                        str = "";
                    }
                    String strN0 = cwl1.n0(2131954567, new Object[]{str}, x340Var2);
                    String str3 = yho0Var.b.b;
                    boolean zI = x340Var2.i(wtmVar) | x340Var2.i(yho0Var);
                    Object objT2 = x340Var2.T();
                    if (zI || objT2 == m4cVar) {
                        objT2 = new sqm((Object) wtmVar, (Object) yho0Var, (byte) 4);
                        x340Var2.s0(objT2);
                    }
                    gho1.h(0, str2, strN0, str3, (Function0) objT2, x340Var2, (qim0) null);
                }
                x340Var2.r(false);
            } else {
                x340Var2.i0(-522791025);
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = dug.f(u291.f(nim0Var, 1.0f), u7h.j, d4o1.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 12.0f);
            fra fraVar = een.N0;
            zzm zzmVar = (zzm) this.b;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            lee1 lee1Var = cbx.d(x340Var2).g;
            String str = zzmVar.b;
            cjc0 cjc0Var = new cjc0(1);
            wnb0 wnb0Var = new wnb0(1.0f, true);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            uwo1.e(str, uyn1.B(wnb0Var, 0.0f, 0.0f, 12.0f, 0.0f, 11), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1720);
            plx plxVar = plx.c;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(plxVar, isl.a, u291.r(nim0Var, 16.0f), cbx.a(x340Var2).b.b, 0L, false, x340Var2, plx.d | 48, 48);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object g(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        qim0 qim0VarY;
        gra graVar;
        qim0 qim0VarI;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        knn knnVar = (knn) this.b;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        boolean zI = x340Var2.i(knnVar);
        Object objT = x340Var2.T();
        if (zI || objT == m4cVar) {
            objT = new inn(knnVar, (byte) 0);
            x340Var2.s0(objT);
        }
        qxd0.i(rih1Var, (iu30) objT, x340Var2);
        boolean zI2 = x340Var2.i(knnVar);
        Object objT2 = x340Var2.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new inn(knnVar, (byte) 1);
            x340Var2.s0(objT2);
        }
        hhr0.a((iu30) objT2, x340Var2, 0);
        ven0 ven0VarH = rwq.h(knnVar.e.c, x340Var2, 0);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var2).b;
        Object objT3 = x340Var2.T();
        if (objT3 == m4cVar) {
            objT3 = kaa0.h(0L, x340Var2);
        }
        ven0 ven0Var = (ven0) objT3;
        boolean zI3 = x340Var2.i(knnVar);
        Object objT4 = x340Var2.T();
        if (zI3 || objT4 == m4cVar) {
            objT4 = new d4e(knnVar, (byte) 10);
            x340Var2.s0(objT4);
        }
        qim0 qim0Var = nim0.a;
        qim0 qim0VarX = bin.x(qim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT4, 15);
        zln zlnVar = (zln) ven0VarH.getValue();
        if (zlnVar instanceof yln) {
            x340Var2.i0(-253048563);
            qim0 qim0VarX2 = uyn1.x(qim0Var, 8.0f);
            WeakHashMap weakHashMap = osl1.x;
            qim0VarY = too1.y(qim0VarX2, lhc.g(x340Var2).g);
            x340Var2.r(false);
        } else {
            if (!(zlnVar instanceof xln)) {
                throw p3d1.k(x340Var2, -253052172, false);
            }
            x340Var2.i0(-253036471);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarA = uyn1.A(qim0Var, 8.0f, 8.0f, 8.0f, 16.0f);
            WeakHashMap weakHashMap2 = osl1.x;
            qim0VarY = too1.y(qim0VarA, new bgc0(lhc.g(x340Var2).g, 16));
            x340Var2.r(false);
        }
        qim0 qim0VarThen = qim0VarX.then(qim0VarY);
        boolean zI4 = x340Var2.i(ven0Var);
        Object objT5 = x340Var2.T();
        if (zI4 || objT5 == m4cVar) {
            objT5 = new bzm(ven0Var, (byte) 4);
            x340Var2.s0(objT5);
        }
        qim0 qim0VarD = u291.d(ern1.x(qim0VarThen, (iu30) objT5), 1.0f);
        zln zlnVar2 = (zln) ven0VarH.getValue();
        if (zlnVar2 instanceof yln) {
            graVar = een.h;
        } else {
            if (!(zlnVar2 instanceof xln)) {
                eg.o();
                return null;
            }
            graVar = een.t;
        }
        gfh0 gfh0VarC = t1c.c(graVar, false);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var2.m0();
        boolean z = x340Var2.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var2, lljVar3);
        nko1.F(x340Var2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var2, lljVar4);
        String strO0 = cwl1.o0(x340Var2, 2131954663);
        xln xlnVar = (zln) ven0VarH.getValue();
        long j = ((Offset) ven0Var.getValue()).a;
        String str = knnVar.c.a;
        if (xlnVar instanceof yln) {
            qim0VarI = qim0Var;
        } else {
            if (!(xlnVar instanceof xln)) {
                eg.o();
                return null;
            }
            qim0VarI = zr7.i(qim0Var, new gv6(xlnVar, j, (byte) 5));
        }
        qim0 qim0VarX3 = u291.x(0.0f, 400.0f, 1, qim0VarI);
        boolean zG = x340Var2.g(strO0) | x340Var2.i(knnVar);
        Object objT6 = x340Var2.T();
        if (zG || objT6 == m4cVar) {
            objT6 = new d(strO0, knnVar, (byte) 3);
            x340Var2.s0(objT6);
        }
        qim0 qim0VarThen2 = s161.b(qim0VarX3, false, (iu30) objT6).then(zr7.i(qim0Var, new e6j(new jnn(knnVar, (byte) 1), new inn(knnVar, (byte) 2), (byte) 15)));
        Object objT7 = x340Var2.T();
        if (objT7 == m4cVar) {
            objT7 = lmm.O0;
            x340Var2.s0(objT7);
        }
        qim0 qim0VarX4 = bin.x(qim0VarThen2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT7, 15);
        cua cuaVar = cbx.b(x340Var2).f;
        qim0 qim0VarF = dug.f(i1p1.q(qim0VarX4, er31.b(16.0f)), cbx.a(x340Var2).a.a.a(), d4o1.a);
        gfh0 gfh0VarC2 = t1c.c(een.d, false);
        int iHashCode2 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM2 = x340Var2.m();
        qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(gfh0VarC2, x340Var2, lljVar);
        nko1.H(xos0VarM2, x340Var2, lljVar2);
        x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
        nko1.H(qim0VarE2, x340Var2, lljVar4);
        es41 es41VarC = l6o1.C(0, 0, 1, x340Var2);
        qim0 qim0VarH = l6o1.H(i1p1.z(qim0Var, es41VarC, 64.0f), es41VarC, false, 14);
        if (knnVar.g) {
            x340Var2.i0(497479725);
            otw.c((maa) knnVar.h.get(), new hj51(str, knn.j), uyn1.z(0.0f, cbx.b(x340Var2).b.a, 1, qim0VarH), (ipb1) null, x340Var2, 8, 8);
            x340Var2.r(false);
        } else {
            x340Var2.i0(497870604);
            otw.c((maa) knnVar.d.get(), new bmn(str, knn.j), qim0VarH, (ipb1) null, x340Var2, 8, 8);
            x340Var2.r(false);
        }
        x340Var2.r(true);
        x340Var2.r(true);
        return rih1Var;
    }

    private final Object h(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        kpn kpnVar = (kpn) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0VarH = l6o1.H(bmq0.L(nim0.a, k1o1.q(x340Var2), (g6o0) null), l6o1.C(0, 0, 1, x340Var2), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var2).g, 32, qim0VarH);
            boolean z = kpnVar.b;
            mpn mpnVar = (mpn) kpnVar.f;
            String str = mpnVar.b;
            String str2 = mpnVar.a;
            if (z) {
                x340Var2.i0(-661107400);
                maa maaVar = (maa) ((ynb0) kpnVar.g).get();
                hj51 hj51Var = new hj51(str2, str);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var2).b;
                otw.c(maaVar, hj51Var, uyn1.z(0.0f, 16.0f, 1, qim0VarP), (ipb1) null, x340Var2, 8, 8);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-660744824);
                otw.c((maa) ((i8p) kpnVar.d).get(), new bmn(str2, str), qim0VarP, (ipb1) null, x340Var2, 8, 8);
                x340Var2.r(false);
            }
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2) {
        azn aznVar = (azn) this.b;
        return new jpg0(aznVar.a.a(new hyn(2, 1, 8, aznVar.d.c(), false), aznVar.c, new epb1((zob1) obj)), rwn.e);
    }

    private final Object j(Object obj, Object obj2) {
        f2o f2oVar = (f2o) ((x6e) this.b).b;
        epb1 epb1Var = new epb1((zob1) obj);
        x2p x2pVar = (x2p) ((v9p) ((h2o) f2oVar).b.b.get()).a.c;
        xfx xfxVar = (xfx) ((asn) x2pVar.c).a;
        c8o.l(xfxVar);
        hjc hjcVar = new hjc(xfxVar.b, (byte) 5);
        asn asnVar = (asn) x2pVar.c;
        xfx xfxVar2 = (xfx) asnVar.a;
        c8o.l(xfxVar2);
        pp ppVar = new pp(xfxVar2.c, (byte) 15);
        xfx xfxVar3 = (xfx) asnVar.a;
        c8o.l(xfxVar3);
        hjc hjcVar2 = new hjc(xfxVar3.b, (byte) 4);
        lzn0 lzn0Var = (lzn0) asnVar.b;
        c8o.l(lzn0Var);
        z710 z710Var = (z710) asnVar.c;
        c8o.l(z710Var);
        return new jpg0(new dfm(hjcVar, ppVar, hjcVar2, lzn0Var, z710Var, epb1Var), r1o.t);
    }

    private final Object k(Object obj, Object obj2) {
        gy5 gy5Var = (gy5) this.b;
        return new sma1(new jpg0(gy5Var.b.b(new epb1((zob1) obj), gy5Var.e, gy5Var.c, gy5Var.d, tbo0.b, (4032 & 512) == 0), r1o.Y), new rma1((Integer) null, 2131167033, (Integer) null, 13));
    }

    private final Object m(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        bxn bxnVar = (bxn) this.b;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            fc11.a(mqo1.s(new phx[]{new phx(8, 0L, bxnVar.d, bxnVar.b, bxnVar.c)}), (qim0) null, hcx.b, (hux) null, false, 0, (gbx) null, (String) null, (idn0) null, x340Var2, 24968, 490);
            op71.g(x340Var2, u291.r(nim0.a, 4.0f));
            String str = bxnVar.c;
            cjc0 cjc0Var = new cjc0(1);
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var2).k, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 0, 0, 1722);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v127, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v129 */
    /* JADX WARN: Type inference failed for: r0v169 */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        jqf0 jqf0Var;
        br0 br0Var;
        x340 x340Var;
        boolean z;
        rih1 rih1Var;
        xrm xrmVar;
        boolean z2;
        Function0 function0;
        ?? r0;
        qim0 qim0VarB;
        gbx gbxVar;
        byte b = this.a;
        o6x o6xVar = o6x.a;
        z50 z50Var = z50.c;
        n4k n4kVar = hmb0.t1;
        f36 f36Var = h36.c;
        qim0 qim0Var = nim0.a;
        rih1 rih1Var2 = rih1.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                x340 x340Var2 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var3 = x340Var2;
                boolean zY = x340Var3.Y(iIntValue & 1, (iIntValue & 3) != 2);
                rih1 rih1Var3 = rih1.a;
                if (zY) {
                    tbr0 tbr0VarC = ((cir0) x340Var3.k(k2r0.a)).c();
                    i1m i1mVar = (i1m) obj3;
                    Object objT = x340Var3.T();
                    if (objT == fkj0.X) {
                        k8p k8pVar = i1mVar.b;
                        xwb xwbVar = new xwb(tbr0VarC, (byte) 3);
                        a680 a680Var = (a680) k8pVar.a.c;
                        l8p l8pVar = (l8p) ((jly0) a680Var.c).get();
                        cx0 cx0Var = new cx0((byte) 26);
                        d0r d0rVar = (d0r) ((jly0) a680Var.d).get();
                        add addVar = (add) ((j1m) a680Var.a).e.get();
                        c8o.l(addVar);
                        objT = new d1m(xwbVar, l8pVar, cx0Var, d0rVar, addVar, (m8p) ((jly0) a680Var.e).get());
                        x340Var3.s0(objT);
                    }
                    otw.c((d1m) objT, rih1Var3, (qim0) null, (ipb1) null, x340Var3, 48, 12);
                } else {
                    x340Var3.b0();
                }
                return rih1Var3;
            case 1:
                x340 x340Var4 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                l1m l1mVar = (l1m) obj3;
                x340 x340Var5 = x340Var4;
                if (x340Var5.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    tbr0 tbr0VarC2 = ((cir0) x340Var5.k(k2r0.a)).c();
                    Object objT2 = x340Var5.T();
                    m4c m4cVar = fkj0.X;
                    if (objT2 == m4cVar) {
                        w6q w6qVar = l1mVar.c;
                        kjk kjkVar = new kjk(tbr0VarC2, l1mVar, (byte) 13);
                        switch (w6qVar.a) {
                            case 0:
                                r7q r7qVar = w6qVar.b;
                                s7q s7qVar = r7qVar.d;
                                qxb1 qxb1Var = (qxb1) s7qVar.Xa.get();
                                cx0 cx0Var2 = new cx0((byte) 26);
                                awb1 awb1Var = (awb1) s7qVar.Ya.get();
                                daq daqVar = r7qVar.b;
                                jqf0Var = new jqf0(kjkVar, qxb1Var, cx0Var2, awb1Var, (w9q) daqVar.Bs.get(), (u9q) daqVar.Zr.get());
                                break;
                            default:
                                thq thqVar = w6qVar.b;
                                daq daqVar2 = thqVar.b;
                                jqf0Var = new jqf0(kjkVar, (qxb1) daqVar2.a.X3.get(), new cx0((byte) 26), (awb1) thqVar.c.B1.get(), (w9q) daqVar2.Bs.get(), (u9q) daqVar2.Zr.get());
                                break;
                        }
                        objT2 = jqf0Var;
                        x340Var5.s0(objT2);
                    }
                    jqf0 jqf0Var2 = (jqf0) objT2;
                    Object objT3 = x340Var5.T();
                    if (objT3 == m4cVar) {
                        objT3 = new ypf0(l1mVar.a.a);
                        x340Var5.s0(objT3);
                    }
                    otw.c(jqf0Var2, (ypf0) objT3, u291.d(qim0Var, 1.0f), (ipb1) null, x340Var5, 0, 8);
                } else {
                    x340Var5.b0();
                }
                return rih1Var2;
            case 2:
                ((Number) obj2).intValue();
                ern1.d((p6m) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 3:
                r7m r7mVar = (r7m) obj3;
                jwp jwpVar = (jwp) r7mVar.b;
                lik1 lik1Var = (lik1) r7mVar.c;
                Single singleF = rqt0.F(o6xVar, new awe(r7mVar, null, (byte) 21));
                switch (jwpVar.a) {
                    case 0:
                        nwp nwpVar = (nwp) jwpVar.b.c;
                        gw70 gw70VarA0 = nwpVar.a.a0();
                        c8o.l(gw70VarA0);
                        kwp kwpVar = (kwp) nwpVar.r0.get();
                        em0 em0Var = nwpVar.a;
                        teq teqVar = (teq) em0Var.c;
                        dv00 dv00Var = (dv00) teqVar.H1.get();
                        c8o.l(dv00Var);
                        yko ykoVar = (yko) teqVar.w6.get();
                        c8o.l(ykoVar);
                        x390 x390Var = new x390(dv00Var, ykoVar, (byte) 15);
                        RetrofitMaker retrofitMakerM0 = em0Var.M0();
                        c8o.l(retrofitMakerM0);
                        mq40 mq40Var = (mq40) retrofitMakerM0.createWebgateService(mq40.class, "android-martini-martini-data-impl");
                        RetrofitMaker retrofitMakerM1 = em0Var.M0();
                        c8o.l(retrofitMakerM1);
                        st50 st50Var = (st50) retrofitMakerM1.createWebgateService(st50.class, "android-martini-martini-data-impl");
                        zle1 zle1Var = (zle1) ((daq) em0Var.b).a3.get();
                        c8o.l(zle1Var);
                        br0Var = new br0(gw70VarA0, kwpVar, x390Var, new v6m(new i6b((Object) new v1k(mq40Var, st50Var, zle1Var, (byte) 13), (byte) 19), new ij01(new aa3((byte) 5), (byte) 11)), lik1Var, singleF);
                        break;
                    default:
                        thq thqVar2 = jwpVar.b;
                        gw70 gw70Var = (gw70) thqVar2.b.d8.get();
                        v5q v5qVar = thqVar2.c;
                        kwp kwpVar2 = (kwp) v5qVar.f7.get();
                        x390 x390Var2 = new x390((dv00) v5qVar.S1.get(), (yko) v5qVar.p6.get(), (byte) 15);
                        daq daqVar3 = v5qVar.b;
                        br0Var = new br0(gw70Var, kwpVar2, x390Var2, new v6m(new i6b((Object) new v1k((mq40) ((RetrofitMaker) daqVar3.Y3.get()).createWebgateService(mq40.class, "android-martini-martini-data-impl"), (st50) ((RetrofitMaker) daqVar3.Y3.get()).createWebgateService(st50.class, "android-martini-martini-data-impl"), (zle1) daqVar3.a3.get(), (byte) 13), (byte) 19), new ij01(new aa3((byte) 5), (byte) 11)), lik1Var, singleF);
                        break;
                }
                return new jpg0(f6o1.A(br0Var, (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), z4m.P0);
            case 4:
                x340 x340Var6 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var7 = x340Var6;
                if (x340Var7.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    gpx gpxVar = gpx.c;
                    uwr uwrVar = cbx.a;
                    xa51 xa51Var = (xa51) obj3;
                    w0h1.a(gpxVar, new jsl(cwl1.n0(xa51Var.b, new Object[]{xa51Var.a}, x340Var7)), (qim0) null, cbx.a(x340Var7).b.b, 0L, false, x340Var7, gpx.d, 52);
                } else {
                    x340Var7.b0();
                }
                return rih1Var2;
            case 5:
                aem aemVar = (aem) obj2;
                return new sem((Integer) ((efm) obj3).d, aemVar.a, aemVar.b);
            case 6:
                x340 x340Var8 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                rfm rfmVar = (rfm) obj3;
                hrr0 hrr0Var = rfmVar.k2;
                x340 x340Var9 = x340Var8;
                if (x340Var9.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    Object objT4 = x340Var9.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT4 == m4cVar2) {
                        Observable observable = rfmVar.j2;
                        if (observable == null) {
                            u890.C("usernameObservable");
                            throw null;
                        }
                        objT4 = yoi1.g(observable);
                        x340Var9.s0(objT4);
                    }
                    ven0 ven0VarG = rwq.g((mr20) objT4, (Object) null, (o8n) null, x340Var9, 48, 2);
                    ofm ofmVarP1 = rfmVar.p1();
                    if (ofmVarP1 == null) {
                        x340Var9.i0(-352478177);
                        x340Var9.r(false);
                    } else {
                        bjm bjmVar = ofmVarP1.c;
                        x340Var9.i0(-352478176);
                        String str = (String) ven0VarG.getValue();
                        if (str == null) {
                            x340Var9.i0(-1211413328);
                            x340Var9.r(false);
                            x340Var = x340Var9;
                            z = false;
                        } else {
                            x340Var9.i0(-1211413327);
                            boolean zG = x340Var9.g((mr20) hrr0Var.getValue()) | x340Var9.g(bjmVar);
                            Object objT5 = x340Var9.T();
                            if (zG || objT5 == m4cVar2) {
                                tdm tdmVar = rfmVar.g2;
                                if (tdmVar == null) {
                                    u890.C("contentLoader");
                                    throw null;
                                }
                                objT5 = tdmVar.a((mr20) hrr0Var.getValue(), bjmVar, new l1k(0, rfmVar, rfm.class, "dismiss", "dismiss()V", 0, (byte) 12));
                                x340Var9.s0(objT5);
                            }
                            mr20 mr20Var = (mr20) objT5;
                            ynb0 ynb0Var = rfmVar.h2;
                            if (ynb0Var == null) {
                                u890.C("contextMenuElement");
                                throw null;
                            }
                            maa maaVar = (maa) ynb0Var.get();
                            Object objT6 = x340Var9.T();
                            if (objT6 == m4cVar2) {
                                objT6 = aok.e1;
                                x340Var9.s0(objT6);
                            }
                            Function0 function1 = (Function0) objT6;
                            boolean zI = x340Var9.i(rfmVar);
                            Object objT7 = x340Var9.T();
                            if (zI || objT7 == m4cVar2) {
                                l1k l1kVar = new l1k(0, rfmVar, rfm.class, "dismiss", "dismiss()V", 0, (byte) 11);
                                x340Var9.s0(l1kVar);
                                objT7 = l1kVar;
                            }
                            otw.c(maaVar, new jem(str, mr20Var, function1, (Function0) objT7), (qim0) null, (ipb1) null, x340Var9, 64, 12);
                            x340Var = x340Var9;
                            z = false;
                            x340Var.r(false);
                        }
                        x340Var.r(z);
                    }
                } else {
                    x340Var9.b0();
                }
                return rih1Var2;
            case 7:
                ((Number) obj2).intValue();
                j0o1.d((fhm) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 8:
                x340 x340Var10 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    String str2 = ((xe51) ((l4o1) obj3)).e;
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str2, (qim0) null, cbx.d(x340Var11).k, cbx.a(x340Var11).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 0, 0, 2018);
                } else {
                    x340Var11.b0();
                }
                return rih1Var2;
            case 9:
                x340 x340Var12 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                jim jimVar = (jim) obj3;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zI2 = x340Var13.i(jimVar);
                    Object objT8 = x340Var13.T();
                    if (zI2 || objT8 == m4cVar3) {
                        objT8 = new dim(jimVar, (lnm) null);
                        x340Var13.s0(objT8);
                    }
                    qxd0.t(rih1Var2, x340Var13, (vu30) objT8);
                    los losVar = jimVar.f;
                    a1r0 a1r0Var = jimVar.e;
                    boolean zI3 = x340Var13.i(jimVar);
                    Object objT9 = x340Var13.T();
                    if (zI3 || objT9 == m4cVar3) {
                        objT9 = new eim(jimVar, (byte) 1);
                        x340Var13.s0(objT9);
                    }
                    qxd0.h(losVar, a1r0Var, (iu30) objT9, x340Var13);
                    ldo ldoVar = jimVar.b;
                    nim nimVar = jimVar.c;
                    String str3 = nimVar.a;
                    String str4 = nimVar.d;
                    String str5 = nimVar.c;
                    ArrayList arrayList = new ArrayList();
                    List list = nimVar.e;
                    String str6 = nimVar.a;
                    String str7 = nimVar.c;
                    List list2 = list;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        t880 t880Var = (t880) it.next();
                        Iterator it2 = it;
                        String str8 = t880Var.b;
                        rih1 rih1Var4 = rih1Var2;
                        String str9 = t880Var.a;
                        ldo ldoVar2 = ldoVar;
                        arrayList2.add(new usi0(str8, str9.equals("CAST") || str9.equals("CAST_JS"), str7, t880Var.c));
                        it = it2;
                        ldoVar = ldoVar2;
                        rih1Var2 = rih1Var4;
                    }
                    rih1Var = rih1Var2;
                    ldo ldoVar3 = ldoVar;
                    arrayList.addAll(arrayList2);
                    List list3 = nimVar.f;
                    ArrayList arrayList3 = new ArrayList(q7h.U(list3, 10));
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        vld vldVar = (vld) it3.next();
                        Map map = vldVar.e;
                        o711 o711Var = vldVar.d;
                        map.getClass();
                        String strS = z0o1.s(upn1.m(), map);
                        if (strS == null) {
                            strS = vldVar.b;
                            strS.getClass();
                        }
                        String str10 = strS;
                        String str11 = vldVar.c;
                        o711Var.getClass();
                        j65 j65Var = o711Var.a;
                        w6b1 w6b1VarA = f7b1.a(blc0.g5);
                        if (w6b1VarA == null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        String str12 = (String) w6b1VarA.c.get(0);
                        j65Var.getClass();
                        Iterator it4 = it3;
                        Uri uriBuild = Uri.parse(j65Var.a).buildUpon().appendQueryParameter(j65Var.b, str12).appendQueryParameter(j65Var.c, str6).build();
                        String str13 = j65Var.d;
                        str13.getClass();
                        arrayList3.add(new vsi0(str10, str11, uriBuild, Uri.parse(str13), nimVar.c));
                        it3 = it4;
                    }
                    arrayList.addAll(arrayList3);
                    if (nimVar.g) {
                        arrayList.add(new tsi0(str6, str7));
                    }
                    otw.c(ldoVar3, new aqt(new ypt(str3, str4, str5, arrayList, nimVar.b, nimVar.h)), (qim0) null, (ipb1) null, x340Var13, 0, 12);
                } else {
                    rih1Var = rih1Var2;
                    x340Var13.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                z0o1.a((xim) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 11:
                boh0 boh0Var = (boh0) obj2;
                bqk0 bqk0Var = (bqk0) ((pt) obj3).f;
                List list4 = boh0Var.a;
                aoh0 aoh0Var = boh0Var.b;
                if (aoh0Var instanceof ynh0) {
                    Integer numValueOf = Integer.valueOf(list4.indexOf(((ynh0) aoh0Var).a));
                    x6h1 x6h1VarC = bqk0Var.b.c();
                    x6h1VarC.i.add(new a7h1("media_preview", (String) null, numValueOf, (String) null, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    k7h1Var.e = bqk0Var.c;
                    return k7h1Var.a();
                }
                if (!(aoh0Var instanceof znh0)) {
                    if (!(aoh0Var instanceof xnh0)) {
                        eg.o();
                    }
                    return null;
                }
                Integer numValueOf2 = Integer.valueOf(list4.indexOf(((znh0) aoh0Var).a));
                x6h1 x6h1VarC2 = bqk0Var.b.c();
                x6h1VarC2.i.add(new a7h1("media_preview", (String) null, numValueOf2, (String) null, (String) null));
                x6h1VarC2.j = true;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1VarA2;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                k7h1Var2.e = bqk0Var.c;
                return k7h1Var2.a();
            case 12:
                x340 x340Var14 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var15 = x340Var14;
                if (x340Var15.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    qim0 qim0VarF = u291.f(qim0Var, 1.0f);
                    WeakHashMap weakHashMap = osl1.x;
                    qim0 qim0VarP = x0d.p(lhc.g(x340Var15).g, 32, qim0VarF);
                    uwr uwrVar3 = cbx.a;
                    qim0 qim0VarZ = uyn1.z(0.0f, cbx.b(x340Var15).b.c, 1, qim0VarP);
                    csm csmVar = (csm) obj3;
                    mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var15, 0);
                    int iHashCode = Long.hashCode(x340Var15.T);
                    xos0 xos0VarM = x340Var15.m();
                    qim0 qim0VarE = zr7.E(x340Var15, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var15.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var15.m0();
                    if (x340Var15.S) {
                        x340Var15.l(n4kVar);
                    } else {
                        x340Var15.v0();
                    }
                    nko1.H(mbhVarA, x340Var15, y580.O0);
                    nko1.H(xos0VarM, x340Var15, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var15, y580.R0);
                    nko1.F(x340Var15);
                    nko1.H(qim0VarE, x340Var15, y580.Y);
                    String strN0 = cwl1.n0(2131954568, new Object[]{csmVar.b.c}, x340Var15);
                    lee1 lee1Var = cbx.d(x340Var15).e;
                    long j = cbx.a(x340Var15).b.a;
                    float f = cbx.b(x340Var15).b.c;
                    cvx cvxVar = cbx.b(x340Var15).b;
                    uwo1.e(strN0, uyn1.y(qim0Var, f, 16.0f), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var15, 0, 0, 2032);
                    qim0 qim0VarF2 = u291.f(qim0Var, 1.0f);
                    float f2 = cbx.b(x340Var15).b.c;
                    cvx cvxVar2 = cbx.b(x340Var15).b;
                    uvx uvxVar = new uvx(0, (pgx) null, 2, new zzq0(f2, 16.0f, f2, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
                    boolean zI4 = x340Var15.i(csmVar);
                    Object objT10 = x340Var15.T();
                    if (zI4 || objT10 == fkj0.X) {
                        objT10 = new j3m((Object) csmVar, (byte) 10);
                        x340Var15.s0(objT10);
                    }
                    jto1.b(qim0VarF2, uvxVar, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT10), (gbx) null, dgi.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, dgi.b, x340Var15, 100663360, 196608, 32444);
                    x340Var15.r(true);
                } else {
                    x340Var15.b0();
                }
                return rih1Var2;
            case 13:
                x340 x340Var16 = (b0k) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                m4c m4cVar4 = fkj0.X;
                vsm vsmVar = (vsm) obj3;
                xsm xsmVar = vsmVar.c;
                d0r d0rVar2 = vsmVar.d;
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    Object objT11 = x340Var17.T();
                    if (objT11 == m4cVar4) {
                        objT11 = vsmVar.e.a(d0rVar2);
                        x340Var17.s0(objT11);
                    }
                    xrm xrmVar2 = (xrm) objT11;
                    Object objT12 = x340Var17.T();
                    if (objT12 == m4cVar4) {
                        String str14 = xsmVar.d;
                        String str15 = xsmVar.e;
                        String str16 = xsmVar.c;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : cvm.e) {
                            xrm xrmVar3 = xrmVar2;
                            if (((cvm) obj4) != cvm.c) {
                                arrayList4.add(obj4);
                            }
                            xrmVar2 = xrmVar3;
                        }
                        xrmVar = xrmVar2;
                        objT12 = hu20.e(d3p1.F(d0rVar2, w3p1.o(new l4r(hvm.a, 1, crm.S0, new j4r(new tsm(new mqm(new jvm(str14, str15, str16), new lqm(Collections.singletonList(ovm.a), arrayList4, (qle1) null, 4)), (byte) 0)), crm.T0), crm.U0), rih1Var2), new b7c((lnm) null, (Object) vsmVar, (byte) 17));
                        x340Var17.s0(objT12);
                    } else {
                        xrmVar = xrmVar2;
                    }
                    ven0 ven0VarG2 = rwq.g((mr20) objT12, lho0.a, (o8n) null, x340Var17, 48, 2);
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar3 = cbx.b(x340Var17).b;
                    qim0 qim0VarZ2 = uyn1.z(16.0f, 0.0f, 2, qim0Var);
                    qim0 qim0VarF3 = u291.f(qim0Var, 1.0f);
                    WeakHashMap weakHashMap2 = osl1.x;
                    qim0 qim0VarP2 = x0d.p(lhc.g(x340Var17).g, 32, qim0VarF3);
                    cvx cvxVar4 = cbx.b(x340Var17).b;
                    qim0 qim0VarH = l6o1.H(uyn1.z(0.0f, 16.0f, 1, qim0VarP2), l6o1.C(0, 0, 1, x340Var17), false, 14);
                    mbh mbhVarA2 = jbh.a(f36Var, een.P0, x340Var17, 0);
                    int iHashCode2 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM2 = x340Var17.m();
                    qim0 qim0VarE2 = zr7.E(x340Var17, qim0VarH);
                    hzj.A.getClass();
                    if (x340Var17.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(mbhVarA2, x340Var17, y580.O0);
                    nko1.H(xos0VarM2, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE2, x340Var17, y580.Y);
                    otw.c(xrmVar, new yrm(xsmVar.e), qim0VarZ2, (ipb1) null, x340Var17, 0, 8);
                    cvx cvxVar5 = cbx.b(x340Var17).b;
                    rqo1.g(0, 0, x340Var17, uyn1.z(0.0f, 16.0f, 1, qim0Var));
                    mho0 mho0Var = (mho0) ven0VarG2.getValue();
                    if (mho0Var instanceof lho0) {
                        x340Var17.i0(-384663972);
                        x340Var17.r(false);
                    } else if (mho0Var instanceof jho0) {
                        x340Var17.i0(-384601724);
                        uwo1.e(vsmVar.a.getString(2131954541), qim0VarZ2, cbx.d(x340Var17).j, cbx.a(x340Var17).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var17, 0, 0, 2032);
                        x340Var17.r(false);
                    } else {
                        if (!(mho0Var instanceof kho0)) {
                            throw p3d1.k(x340Var17, 1373064732, false);
                        }
                        x340Var17.i0(-384255268);
                        kho0 kho0Var = (kho0) mho0Var;
                        som somVar = kho0Var.a;
                        String str17 = somVar.a;
                        boolean zI5 = x340Var17.i(mho0Var) | x340Var17.i(vsmVar);
                        Object objT13 = x340Var17.T();
                        if (zI5 || objT13 == m4cVar4) {
                            objT13 = new zti(kho0Var, vsmVar, (lnm) null, (byte) 28);
                            x340Var17.s0(objT13);
                        }
                        qxd0.t(str17, x340Var17, (vu30) objT13);
                        s2o s2oVar = kho0Var.b;
                        String str18 = kho0Var.c;
                        cvm cvmVar = somVar.g;
                        String str19 = somVar.d;
                        if (str19 == null) {
                            x340Var17.i0(-383625225);
                            x340Var17.r(false);
                            r0 = 0;
                            function0 = null;
                        } else {
                            x340Var17.i0(-383625224);
                            boolean zI6 = x340Var17.i(mho0Var) | x340Var17.i(vsmVar) | x340Var17.g(str19);
                            Object objT14 = x340Var17.T();
                            if (zI6 || objT14 == m4cVar4) {
                                z2 = false;
                                objT14 = new ssm(kho0Var, vsmVar, str19, (byte) 0);
                                x340Var17.s0(objT14);
                            } else {
                                z2 = false;
                            }
                            x340Var17.r(z2);
                            function0 = (Function0) objT14;
                            r0 = z2;
                        }
                        qgo1.b(s2oVar, str18, cvmVar, qim0VarZ2, function0, x340Var17, 0);
                        cvx cvxVar6 = cbx.b(x340Var17).b;
                        op71.g(x340Var17, u291.h(qim0Var, 8.0f));
                        qgo1.e(somVar, qim0VarZ2, x340Var17, (int) r0);
                        x340Var17.r((boolean) r0);
                    }
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var2;
            case 14:
                x340 x340Var18 = (b0k) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                btm btmVar = (btm) obj3;
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    Object objT15 = x340Var19.T();
                    m4c m4cVar5 = fkj0.X;
                    if (objT15 == m4cVar5) {
                        objT15 = qxd0.M(o6xVar, x340Var19);
                        x340Var19.s0(objT15);
                    }
                    c9n c9nVar = (c9n) objT15;
                    ven0 ven0VarG3 = rwq.g((mr20) btmVar.l.getValue(), Boolean.FALSE, (o8n) null, x340Var19, 48, 2);
                    uwr uwrVar5 = cbx.a;
                    float f3 = cbx.b(x340Var19).b.c;
                    cvx cvxVar7 = cbx.b(x340Var19).b;
                    uvx uvxVar2 = new uvx(0, (pgx) null, 2, new zzq0(f3, 16.0f, f3, 16.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 499);
                    qim0 qim0VarF4 = u291.f(qim0Var, 1.0f);
                    WeakHashMap weakHashMap3 = osl1.x;
                    qim0 qim0VarZ3 = uyn1.z(0.0f, cbx.b(x340Var19).b.c, 1, x0d.p(lhc.g(x340Var19).g, 32, qim0VarF4));
                    mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var19, 0);
                    int iHashCode3 = Long.hashCode(x340Var19.T);
                    xos0 xos0VarM3 = x340Var19.m();
                    qim0 qim0VarE3 = zr7.E(x340Var19, qim0VarZ3);
                    hzj.A.getClass();
                    if (x340Var19.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var19.m0();
                    if (x340Var19.S) {
                        x340Var19.l(n4kVar);
                    } else {
                        x340Var19.v0();
                    }
                    nko1.H(mbhVarA3, x340Var19, y580.O0);
                    nko1.H(xos0VarM3, x340Var19, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode3), x340Var19, y580.R0);
                    nko1.F(x340Var19);
                    nko1.H(qim0VarE3, x340Var19, y580.Y);
                    qim0 qim0VarH2 = pqo.h(u291.f(qim0Var, 1.0f), !((Boolean) ven0VarG3.getValue()).booleanValue());
                    if (((Boolean) ven0VarG3.getValue()).booleanValue()) {
                        x340Var19.i0(899970901);
                        x340Var19.r(false);
                        qim0VarB = qim0Var;
                    } else {
                        x340Var19.i0(899971653);
                        Object objT16 = x340Var19.T();
                        if (objT16 == m4cVar5) {
                            objT16 = crm.d1;
                            x340Var19.s0(objT16);
                        }
                        qim0VarB = s161.b(qim0Var, false, (iu30) objT16);
                        x340Var19.r(false);
                    }
                    qim0 qim0VarThen = qim0VarH2.then(qim0VarB);
                    if (((Boolean) ven0VarG3.getValue()).booleanValue()) {
                        x340Var19.i0(2129429224);
                        boolean zI7 = x340Var19.i(btmVar);
                        Object objT17 = x340Var19.T();
                        if (zI7 || objT17 == m4cVar5) {
                            objT17 = new zsm(btmVar, (byte) 1);
                            x340Var19.s0(objT17);
                        }
                        gbx gbxVar2 = new gbx(z50Var, (Function0) objT17);
                        x340Var19.r(false);
                        gbxVar = gbxVar2;
                    } else {
                        x340Var19.i0(2129848499);
                        x340Var19.r(false);
                        gbxVar = null;
                    }
                    jto1.b(qim0VarThen, uvxVar2, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, ggi.a, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, ggi.b, x340Var19, 100663360, 196608, 32444);
                    qim0 qim0VarF5 = u291.f(qim0Var, 1.0f);
                    boolean zI8 = x340Var19.i(btmVar) | x340Var19.i(c9nVar);
                    Object objT18 = x340Var19.T();
                    if (zI8 || objT18 == m4cVar5) {
                        objT18 = new sqm((Object) btmVar, (Object) c9nVar, (byte) 1);
                        x340Var19.s0(objT18);
                    }
                    jto1.b(qim0VarF5, uvxVar2, (max) null, false, (idn0) null, (ga80) null, new gbx(z50Var, (Function0) objT18), (gbx) null, ggi.c, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, (xu30) null, ggi.d, x340Var19, 100663360, 196608, 32444);
                    x340Var19.r(true);
                } else {
                    x340Var19.b0();
                }
                return rih1Var2;
            case 15:
                return a(obj, obj2);
            case 16:
                return d(obj, obj2);
            case 17:
                return e(obj, obj2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                x340 x340Var20 = (b0k) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                x340 x340Var21 = x340Var20;
                if (x340Var21.Y(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    kwm kwmVar = (kwm) obj3;
                    gho1.a(kwmVar.c, kwmVar.d, kwmVar.e, kwmVar.f, kwmVar.b, x340Var21, 0);
                } else {
                    x340Var21.b0();
                }
                return rih1Var2;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Number) obj2).intValue();
                fxm.d((vwm) obj3, (b0k) obj, czo1.p(1));
                return rih1Var2;
            case 20:
                return f(obj, obj2);
            case 21:
                x340 x340Var22 = (b0k) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                x340 x340Var23 = x340Var22;
                if (x340Var23.Y(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    b2u.g(((v5q0) obj3).a, x340Var23, 0);
                } else {
                    x340Var23.b0();
                }
                return rih1Var2;
            case 22:
                return g(obj, obj2);
            case 23:
                return h(obj, obj2);
            case 24:
                return i(obj, obj2);
            case 25:
                return j(obj, obj2);
            case 26:
                return k(obj, obj2);
            case 27:
                ((w2o) obj3).i.c(new z5o0((h0r0) obj, (c7r0) obj2));
                return rih1Var2;
            case 28:
                return m(obj, obj2);
            default:
                ((Number) obj2).intValue();
                ((d4o) obj3).a((b0k) obj, czo1.p(1));
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1m(Object obj, int i, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h1m(Object obj, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
    }
}
