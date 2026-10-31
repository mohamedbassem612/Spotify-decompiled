package p;

import android.content.Context;
import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e6j extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6j(oll ollVar, iu30 iu30Var) {
        super(3);
        this.a = (byte) 10;
        this.c = ollVar;
        this.b = iu30Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        maa maaVar;
        vzq0 vzq0Var = (vzq0) obj;
        ((Number) obj3).intValue();
        lzn0 lzn0Var = (lzn0) this.b;
        Object obj4 = fkj0.X;
        Object[] objArr = new Object[0];
        kat katVar = (kat) this.c;
        x340 x340Var = (b0k) obj2;
        boolean zG = x340Var.g(katVar);
        j06 j06Var = x340Var.a;
        Object objT = x340Var.T();
        if (zG || objT == obj4) {
            objT = new ots(katVar, (byte) 17);
            x340Var.s0(objT);
        }
        err0 err0Var = (hdn0) k5p1.s(objArr, (Function0) objT, x340Var, 0);
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        Object objT2 = x340Var.T();
        if (objT2 == obj4) {
            objT2 = new hfc(context, lzn0Var);
            x340Var.s0(objT2);
        }
        hfc hfcVar = (hfc) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == obj4) {
            objT3 = new qhg(context, lzn0Var);
            x340Var.s0(objT3);
        }
        qhg qhgVar = (qhg) objT3;
        Object objT4 = x340Var.T();
        if (objT4 == obj4) {
            objT4 = new hft();
            x340Var.s0(objT4);
        }
        maa maaVar2 = (hft) objT4;
        Object objT5 = x340Var.T();
        if (objT5 == obj4) {
            objT5 = new pat(new tu9(err0Var, (byte) 7));
            x340Var.s0(objT5);
        }
        pat patVar = (pat) objT5;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarW = uyn1.w(u291.d(nim0Var, 1.0f), vzq0Var);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarW);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
        }
        x340Var.m0();
        boolean z = x340Var.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(gfh0VarC, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        d36 d36Var = new d36(8.0f, true, new um5(false));
        era eraVar = een.Q0;
        qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.d(nim0Var, 1.0f));
        mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
        int iHashCode2 = Long.hashCode(x340Var.T);
        xos0 xos0VarM2 = x340Var.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(n4kVar);
        } else {
            x340Var.v0();
        }
        nko1.H(mbhVarA, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        String str = katVar.a;
        List list = katVar.d;
        List list2 = katVar.c;
        uwr uwrVar = cbx.a;
        uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var).h, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        uwo1.e(katVar.b, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, 0.0f, 16.0f, 7), cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        x340Var.i0(-924562622);
        int i = 0;
        for (Object obj5 : list2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            jat jatVar = (jat) obj5;
            otw.c(patVar, new jat(jatVar.d, i, jatVar.a, jatVar.b, jatVar.c, jatVar.e, i == err0Var.s()), (qim0) null, (ipb1) null, x340Var, 0, 12);
            i = i2;
        }
        x340Var.r(false);
        x340Var.i0(-924553499);
        int i3 = 0;
        for (Object obj6 : list) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                p7h.T();
                throw null;
            }
            sat satVar = (sat) obj6;
            op71.g(x340Var, uyn1.x(nim0Var, 16.0f));
            if (satVar instanceof qat) {
                x340Var.i0(438123537);
                otw.c(qhgVar, satVar, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
                maaVar = maaVar2;
            } else {
                if (!(satVar instanceof rat)) {
                    throw p3d1.k(x340Var, -262963890, false);
                }
                x340Var.i0(438283311);
                maaVar = maaVar2;
                otw.c(maaVar, satVar, (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            }
            maaVar2 = maaVar;
            i3 = i4;
        }
        x340Var.r(false);
        x340Var.r(true);
        otw.c(hfcVar, new kat(katVar.a, katVar.b, list2, list, katVar.e, katVar.f, katVar.g, err0Var.s()), u291.f(h2c.a.a(nim0Var, een.X), 1.0f), (ipb1) null, x340Var, 0, 8);
        x340Var.r(true);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            ilt iltVar = (ilt) ((ArrayList) this.c).get(iIntValue);
            x340Var2.i0(-1713028239);
            otw.c((hlt) this.b, new elt(iltVar.a, iltVar.b), (qim0) null, (ipb1) null, x340Var2, 8, 12);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        rdv rdvVar = (rdv) this.c;
        otw.c((tao0) this.b, new sao0(rdvVar.i.size() + rdvVar.h.size() + 1), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(vzq0Var) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            ((vpv) this.c).b((jwq) this.b, vzq0Var, x340Var2, (iIntValue << 3) & 112);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj3).intValue();
        ((qvv) this.c).g((xtb0) this.b, (vzq0) obj, (b0k) obj2, (iIntValue << 3) & 112);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, qim0VarF);
        WeakHashMap weakHashMap = osl1.x;
        qim0 qim0VarB = uyn1.B(too1.y(qim0VarZ, lhc.g(x340Var).e), 0.0f, 0.0f, 0.0f, cbx.b(x340Var).e.b, 7);
        era eraVar = een.P0;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(16.0f, true, new um5(false));
        zah1 zah1Var = (zah1) this.c;
        scx scxVar = (scx) this.b;
        mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        cnx cnxVar = cnx.c;
        zov0 zov0Var = cbx.b(x340Var).g;
        w0h1.a(cnxVar, isl.a, u291.r(nim0Var, 24.0f), cbx.a(x340Var).b.d, 0L, true, x340Var, cnx.d | 196656, 16);
        uwo1.e(zah1Var.a, (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
        String strO0 = cwl1.o0(x340Var, 2131955387);
        boolean zI = x340Var3.i(scxVar);
        Object objT = x340Var3.T();
        if (zI || objT == fkj0.X) {
            objT = new rqc(scxVar, (byte) 2);
            x340Var3.s0(objT);
        }
        foo1.c(new gbx(new y50(strO0), (Function0) objT), kdx.c, (qim0) null, (max) null, yla.s(x340Var), (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(-64676570, new qeu(strO0, (byte) 12), x340Var), x340Var, 0, 48, 2012);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        fra fraVar = een.N0;
        String str = (String) this.c;
        j2i j2iVar = (j2i) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var, nim0Var);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        wsx wsxVar = wsx.c;
        uwr uwrVar = cbx.a;
        long j = cbx.a(x340Var).c.a;
        zov0 zov0Var = cbx.b(x340Var).g;
        w0h1.a(wsxVar, isl.a, u291.r(nim0Var, 24.0f), j, 0L, false, x340Var, wsx.d | 48, 48);
        cvx cvxVar = cbx.b(x340Var).b;
        op71.g(x340Var, u291.r(nim0Var, 8.0f));
        cjc0 cjc0Var = new cjc0(1);
        uwo1.e(str, new wnb0(1.0f, false), cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1712);
        j2iVar.invoke(x340Var, 0);
        x340Var3.r(true);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        hax haxVar;
        long j;
        Object wnnVar;
        t24 t24Var;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.c;
        Object obj5 = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj5;
                kxr0 kxr0Var = (kxr0) obj4;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    boolean z = !kxr0Var.d;
                    if (kxr0Var.e) {
                        x340Var2.i0(-1476044527);
                        haxVar = new hax(cwl1.o0(x340Var2, 2131959637));
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1476040492);
                        x340Var2.r(false);
                        haxVar = jax.a;
                    }
                    hax haxVar2 = haxVar;
                    qim0 qim0VarN = anm1.N("switch_test_tag_" + kxr0Var.a, nim0Var);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new k4j(iu30Var, (byte) 3);
                        x340Var2.s0(objT);
                    }
                    anm1.c(z, (iu30) objT, qim0VarN, haxVar2, (idn0) null, x340Var2, 0, 16);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    mmo1.r((uyr0) obj4, (iu30) obj5, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                x340 x340Var5 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    yim yimVar = (yim) obj5;
                    dro.c((rzn1) obj4, yimVar != null ? yimVar.b : null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                aqb0 aqb0Var = (aqb0) obj;
                x340 x340Var7 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                txj txjVar = (txj) obj4;
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var7.g(aqb0Var) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    boolean zI = x340Var8.i(txjVar);
                    Object objT2 = x340Var8.T();
                    if (zI || objT2 == fkj0.X) {
                        objT2 = new zwj(txjVar, (byte) 1);
                        x340Var8.s0(objT2);
                    }
                    dgo1.c(aqb0Var, (iu30) objT2, apo.r(-1418358379, new k7f((byte) 8, (vu30) obj5, false), x340Var8), x340Var8, (iIntValue4 & 14) | 384);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var9 = (b0k) obj2;
                ((Number) obj3).intValue();
                ffk ffkVar = (ffk) obj4;
                if (((aod0) obj5) != null) {
                    x340 x340Var10 = x340Var9;
                    x340Var10.i0(881859149);
                    String str = ffkVar.a;
                    otw.c((aod0) obj5, new uho(str, str, (tho) null, lho.a, (String) null, (Function0) null, 244), (qim0) null, (ipb1) null, x340Var10, 8, 12);
                    x340Var10.r(false);
                } else {
                    x340 x340Var11 = x340Var9;
                    x340Var11.i0(882136878);
                    x340Var11.r(false);
                }
                return rih1Var;
            case 5:
                x340 x340Var12 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var12).k;
                zma1 zma1Var = gf5.a;
                ef5 ef5Var = new ef5(lee1Var, (byte) 0);
                ye5 ye5Var = new ye5((af5) obj4);
                ye5Var.i(ef5Var);
                af5 af5VarP = ye5Var.p();
                cjc0 cjc0Var = new cjc0(1);
                lee1 lee1Var2 = cbx.d(x340Var12).j;
                u7h u7hVar = ((pqk) obj5).c;
                if (u7hVar == null) {
                    x340 x340Var13 = x340Var12;
                    x340Var13.i0(2061661245);
                    j = cbx.a(x340Var13).b.a;
                    x340Var13.r(false);
                } else {
                    x340 x340Var14 = x340Var12;
                    x340Var14.i0(2061659881);
                    x340Var14.r(false);
                    j = u7hVar.a;
                }
                uwo1.d(af5VarP, j, (qim0) null, lee1Var2, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, (cqs0) null, x340Var12, 0, 0, 3764);
                return rih1Var;
            case 6:
                x340 x340Var15 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                pk1 pk1Var = new pk1(((pqk) obj4).h ? qk1.b : qk1.a, false, null, null, null, 30);
                qim0 qim0VarN2 = anm1.N("save_button", nim0Var);
                x340 x340Var16 = x340Var15;
                Object objT3 = x340Var16.T();
                m4c m4cVar = fkj0.X;
                if (objT3 == m4cVar) {
                    objT3 = rgk.Y0;
                    x340Var16.s0(objT3);
                }
                qim0 qim0VarA = s161.a(qim0VarN2, (iu30) objT3);
                boolean zG2 = x340Var16.g(iu30Var2);
                Object objT4 = x340Var16.T();
                if (zG2 || objT4 == m4cVar) {
                    objT4 = new lck(iu30Var2, (byte) 16);
                    x340Var16.s0(objT4);
                }
                h7p1.a(pk1Var, new gbx(z50.c, (Function0) objT4), qim0VarA, (max) null, (gdx) null, x340Var16, 0, 24);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                Uri uri = (Uri) obj4;
                ven0 ven0Var = (ven0) obj5;
                x340 x340Var17 = (b0k) obj2;
                boolean zI2 = x340Var17.i(ven0Var);
                Object objT5 = x340Var17.T();
                if (zI2 || objT5 == fkj0.X) {
                    objT5 = new f4g(ven0Var, (byte) 20);
                    x340Var17.s0(objT5);
                }
                ni7 ni7VarA = oi7.a(uri, (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) objT5, (iu30) null, 0L, x340Var17, 0, 0, 122878);
                uwr uwrVar2 = cbx.a;
                cua cuaVar = cbx.b(x340Var17).f;
                cua cuaVar2 = cbx.b(x340Var17).f;
                eso1.h(ni7VarA, isl.a, (qim0) null, (p3v) null, new zvx(), (ecx) null, mif1.Q0, (tl3) null, (ColorFilter) null, x340Var17, 199728, 388);
                return rih1Var;
            case 8:
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                pfl pflVarR = ob51.r((uel) obj4);
                iu30 iu30Var3 = (iu30) obj5;
                x340 x340Var18 = (b0k) obj2;
                boolean zG3 = x340Var18.g(iu30Var3);
                Object objT6 = x340Var18.T();
                if (zG3 || objT6 == m4cVar2) {
                    objT6 = new usj(iu30Var3, (byte) 19);
                    x340Var18.s0(objT6);
                }
                iu30 iu30Var4 = (iu30) objT6;
                boolean zG4 = x340Var18.g(iu30Var3);
                Object objT7 = x340Var18.T();
                if (zG4 || objT7 == m4cVar2) {
                    objT7 = new usj(iu30Var3, (byte) 20);
                    x340Var18.s0(objT7);
                }
                iu30 iu30Var5 = (iu30) objT7;
                boolean zG5 = x340Var18.g(iu30Var3);
                Object objT8 = x340Var18.T();
                if (zG5 || objT8 == m4cVar2) {
                    objT8 = new v0j(iu30Var3, (byte) 17);
                    x340Var18.s0(objT8);
                }
                i541.b(pflVarR, iu30Var4, iu30Var5, (vu30) objT8, (qim0) null, x340Var18, 0);
                return rih1Var;
            case 9:
                x340 x340Var19 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var6 = (iu30) obj5;
                int i = 0;
                for (Object obj6 : (c380) obj4) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    b10 b10Var = (b10) obj6;
                    String str2 = b10Var.a;
                    x340 x340Var20 = x340Var19;
                    boolean zG6 = x340Var20.g(iu30Var6) | x340Var20.e(i) | x340Var20.g(b10Var);
                    Object objT9 = x340Var20.T();
                    if (zG6 || objT9 == fkj0.X) {
                        objT9 = new gkl(iu30Var6, i, b10Var, (byte) 0);
                        x340Var20.s0(objT9);
                    }
                    Function0 function0 = (Function0) objT9;
                    if (ihc1.y0(str2)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar = new gbx(new y50(str2), function0);
                    int iC = l1d.C(b10Var.c);
                    jdx idxVar = iC != 1 ? (iC == 2 || iC != 3) ? jdx.c : ldx.c : new idx();
                    foo1.c(gbxVar, idxVar, (qim0) null, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, apo.r(724121455, new hkl(b10Var, (byte) 0), x340Var20), x340Var20, 0, 48, 2044);
                    i = i2;
                }
                return rih1Var;
            case 10:
                w6d1.b((oll) obj4, (iu30) obj5, (vzq0) obj, (b0k) obj2, (((Number) obj3).intValue() << 9) & 7168);
                return rih1Var;
            case 11:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                iu30 iu30Var7 = (iu30) obj5;
                sxl sxlVar = (uxl) obj;
                x340 x340Var21 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                qwl qwlVar = (qwl) obj4;
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= (iIntValue5 & 8) == 0 ? x340Var21.g(sxlVar) : x340Var21.i(sxlVar) ? 4 : 2;
                }
                x340 x340Var22 = x340Var21;
                boolean zY = x340Var22.Y(iIntValue5 & 1, (iIntValue5 & 19) != 18);
                j06 j06Var = x340Var22.a;
                if (zY) {
                    boolean z2 = sxlVar instanceof txl;
                    qim0 qim0VarB = nim0.a;
                    if (z2) {
                        x340Var22.i0(1294258928);
                        String str3 = qwlVar.a;
                        jno jnoVar = qwlVar.b;
                        qpe1 qpe1Var = qwlVar.e;
                        txl txlVar = (txl) sxlVar;
                        int i3 = txlVar.a;
                        long j2 = txlVar.b;
                        if (i3 == 2) {
                            qim0VarB = uyn1.z(0.0f, 20.0f, 1, qim0VarB);
                        }
                        pxl.h(str3, jnoVar, qpe1Var, i3, j2, qim0VarB, iu30Var7, x340Var22, 0);
                        x340Var22.r(false);
                    } else if (sxlVar instanceof sxl) {
                        x340Var22.i0(-2036443065);
                        sxl sxlVar2 = sxlVar;
                        yvh yvhVar = sxlVar2.b;
                        qim0 qim0VarD = ((yvhVar instanceof wvh) || (yvhVar instanceof xvh)) ? u291.d(qim0VarB, 1.0f) : qim0VarB;
                        mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var22, 6);
                        int iHashCode = Long.hashCode(x340Var22.T);
                        xos0 xos0VarM = x340Var22.m();
                        qim0 qim0VarE = zr7.E(x340Var22, qim0VarD);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var22.m0();
                        if (x340Var22.S) {
                            x340Var22.l(n4kVar);
                        } else {
                            x340Var22.v0();
                        }
                        nko1.H(mbhVarA, x340Var22, lljVar4);
                        nko1.H(xos0VarM, x340Var22, lljVar3);
                        x0d.q(iHashCode, x340Var22, lljVar2, x340Var22);
                        nko1.H(qim0VarE, x340Var22, lljVar);
                        pxl.g(qwlVar.a, yvhVar, iu30Var7, yvhVar instanceof vvh ? qim0VarB : new wnb0(1.0f, true), x340Var22, 0, 0);
                        String str4 = qwlVar.a;
                        jno jnoVar2 = qwlVar.b;
                        qpe1 qpe1Var2 = qwlVar.e;
                        int i4 = sxlVar2.a;
                        long j3 = u7h.k;
                        int iC2 = l1d.C(i4);
                        if (iC2 != 0) {
                            if (iC2 == 1) {
                                qim0VarB = uyn1.B(qim0VarB, 0.0f, 36.0f, 0.0f, 20.0f, 5);
                            } else {
                                if (iC2 != 2) {
                                    eg.o();
                                    return null;
                                }
                                qim0VarB = uyn1.B(qim0VarB, 0.0f, 16.0f, 0.0f, 0.0f, 13);
                            }
                        }
                        pxl.h(str4, jnoVar2, qpe1Var2, i4, j3, u291.f(qim0VarB, 1.0f), iu30Var7, x340Var22, 24576);
                        x340Var22.r(true);
                        x340Var22.r(false);
                    } else {
                        if (!(sxlVar instanceof rxl)) {
                            throw p3d1.k(x340Var22, -2036460639, false);
                        }
                        x340Var22.i0(-2036418671);
                        qim0 qim0VarD2 = u291.d(qim0VarB, 1.0f);
                        gfh0 gfh0VarC = t1c.c(een.h, false);
                        int iHashCode2 = Long.hashCode(x340Var22.T);
                        xos0 xos0VarM2 = x340Var22.m();
                        qim0 qim0VarE2 = zr7.E(x340Var22, qim0VarD2);
                        hzj.A.getClass();
                        if (j06Var == null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var22.m0();
                        if (x340Var22.S) {
                            x340Var22.l(n4kVar);
                        } else {
                            x340Var22.v0();
                        }
                        nko1.H(gfh0VarC, x340Var22, lljVar4);
                        nko1.H(xos0VarM2, x340Var22, lljVar3);
                        x0d.q(iHashCode2, x340Var22, lljVar2, x340Var22);
                        nko1.H(qim0VarE2, x340Var22, lljVar);
                        pxl.g(qwlVar.a, ((rxl) sxlVar).a, iu30Var7, (qim0) null, x340Var22, 0, 8);
                        x340Var22.r(true);
                        x340Var22.r(false);
                    }
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 12:
                xcm xcmVar = (xcm) obj;
                tqw tqwVar = (tqw) obj3;
                tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                usj usjVar = (usj) obj5;
                Parcelable.Creator creator = lik1.CREATOR;
                mfm mfmVarA = ((i4q) ((i3b) obj4).b).a(new lik1(xcmVar.d));
                String str5 = xcmVar.c;
                String str6 = xcmVar.e;
                igm igmVar = new igm(str5, (str6 == null || ihc1.y0(str6)) ? null : new wfm(Uri.parse(str6)), (String) null, 4);
                Collection<vcm> collection = xcmVar.f;
                ArrayList arrayList = new ArrayList(q7h.U(collection, 10));
                for (vcm vcmVar : collection) {
                    if (ej90.a[vcmVar.ordinal()] != 1) {
                        eg.o();
                        return null;
                    }
                    arrayList.add(new jhm("ads_display_not_interested", itx.c, (fhm) null, 2131951983, (String) null, false, (tm81) null, new ihm(new ygm(3), new ghm(afm.N0, new v7l(xcmVar, (byte) 17)), new kjk(usjVar, vcmVar, (byte) 18)), 244));
                }
                kjm kjmVar = new kjm(igmVar, arrayList, 4);
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                mfm.c(mfmVarA, kjmVar, yon1.d1(), (bjm) null, tv80VarY, 20);
                return rih1Var;
            case 13:
                x340 x340Var23 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                boolean zY2 = x340Var24.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16);
                j06 j06Var2 = x340Var24.a;
                if (zY2) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar = cbx.b(x340Var24).b;
                    d36 d36Var = new d36(8.0f, true, new um5(false));
                    List list = (List) obj4;
                    vwm vwmVar = (vwm) obj5;
                    era eraVar = een.P0;
                    mbh mbhVarA2 = jbh.a(d36Var, eraVar, x340Var24, 0);
                    int iHashCode3 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM3 = x340Var24.m();
                    qim0 qim0VarE3 = zr7.E(x340Var24, nim0Var);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA2, x340Var24, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM3, x340Var24, lljVar6);
                    Integer numValueOf = Integer.valueOf(iHashCode3);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf, x340Var24, lljVar7);
                    nko1.F(x340Var24);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE3, x340Var24, lljVar8);
                    fra fraVar = een.N0;
                    cvx cvxVar2 = cbx.b(x340Var24).b;
                    jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), fraVar, x340Var24, 48);
                    int iHashCode4 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM4 = x340Var24.m();
                    qim0 qim0VarE4 = zr7.E(x340Var24, nim0Var);
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(jw31VarA, x340Var24, lljVar5);
                    nko1.H(xos0VarM4, x340Var24, lljVar6);
                    x0d.q(iHashCode4, x340Var24, lljVar7, x340Var24);
                    nko1.H(qim0VarE4, x340Var24, lljVar8);
                    fxm.d(vwmVar, x340Var24, 0);
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    cvx cvxVar3 = cbx.b(x340Var24).b;
                    mbh mbhVarA3 = jbh.a(new d36(2.0f, true, new um5(false)), eraVar, x340Var24, 0);
                    int iHashCode5 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM5 = x340Var24.m();
                    qim0 qim0VarE5 = zr7.E(x340Var24, wnb0Var);
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(mbhVarA3, x340Var24, lljVar5);
                    nko1.H(xos0VarM5, x340Var24, lljVar6);
                    x0d.q(iHashCode5, x340Var24, lljVar7, x340Var24);
                    nko1.H(qim0VarE5, x340Var24, lljVar8);
                    int i5 = vwmVar.e;
                    uwo1.e(cwl1.U(2131820638, i5, new Object[]{Integer.valueOf(i5)}, x340Var24), (qim0) null, cbx.d(x340Var24).h, cbx.a(x340Var24).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var24, 1572864, 0, 1714);
                    uwo1.e(cwl1.n0(2131954576, new Object[]{vwmVar.d}, x340Var24), (qim0) null, cbx.d(x340Var24).j, cbx.a(x340Var24).b.b, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var24, 1572864, 0, 1714);
                    x340Var24.r(true);
                    x340Var24.r(true);
                    fxm.f(list, x340Var24, 0);
                    x340Var24.r(true);
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                zkn zknVar = (zkn) obj5;
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    v361 v361Var = (v361) obj4;
                    f7q0 f7q0Var = zknVar.c;
                    f7q0 f7q0Var2 = f7q0Var instanceof f7q0 ? f7q0Var : null;
                    String str7 = f7q0Var2 != null ? f7q0Var2.a : null;
                    String strO0 = cwl1.o0(x340Var26, 2131961616);
                    String strO1 = cwl1.o0(x340Var26, 2131961613);
                    String strN0 = cwl1.n0(2131953659, new Object[]{zknVar.i.b}, x340Var26);
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    otw.c(v361Var, new r361(str7, strO0, strO1, 9, new s361("spotify:chat-invite:", strN0, yon1.C0().a, zknVar.a, "android-libs-inappmessaging", Collections.singletonMap("feature", "campfire_invite")), zknVar.g.isEmpty()), (qim0) null, (ipb1) null, x340Var26, 0, 12);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 15:
                inn innVar = (inn) obj5;
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                jnn jnnVar = (jnn) obj4;
                x340 x340Var27 = (b0k) obj2;
                x340Var27.i0(1721300124);
                x340Var27.i0(607011661);
                float fX0 = ((wat) x340Var27.k(t4k.h)).X0(dsa0.m(x340Var27, 2131165579));
                x340Var27.r(false);
                e9r e9rVarA = wxa1.a(x340Var27);
                Object objT10 = x340Var27.T();
                m4c m4cVar3 = fkj0.X;
                if (objT10 == m4cVar3) {
                    objT10 = wm5.e(tnn.b, wm5.f(new jc5((byte) 16, fX0)), eln.f, new xnn((byte) 0, fX0), irn1.l0(0.0f, 0.0f, (Object) null, 7), e9rVarA);
                    x340Var27.s0(objT10);
                }
                t24 t24Var2 = (t24) objT10;
                Object value = t24Var2.h.getValue();
                boolean zI3 = x340Var27.i(t24Var2) | x340Var27.g(jnnVar);
                Object objT11 = x340Var27.T();
                if (zI3 || objT11 == m4cVar3) {
                    objT11 = new eum(t24Var2, jnnVar, (lnm) null, (byte) 4);
                    x340Var27.s0(objT11);
                }
                qxd0.t(value, x340Var27, (vu30) objT11);
                float fG = t24Var2.g();
                float fFloatValue = ((Number) yoi1.u(Float.valueOf(1.0f - (Math.abs(fG) / fX0)), new jsg(0.0f, 1.0f))).floatValue();
                Object value2 = t24Var2.h.getValue();
                Float fValueOf = Float.valueOf(fFloatValue);
                Float fValueOf2 = Float.valueOf(Math.signum(fG));
                boolean zG7 = x340Var27.g(innVar) | x340Var27.d(fFloatValue) | x340Var27.i(t24Var2) | x340Var27.d(fG);
                Object objT12 = x340Var27.T();
                if (zG7 || objT12 == m4cVar3) {
                    t24Var = t24Var2;
                    wnnVar = new wnn(innVar, fFloatValue, fG, t24Var, null);
                    x340Var27.s0(wnnVar);
                } else {
                    wnnVar = objT12;
                    t24Var = t24Var2;
                }
                qxd0.r(value2, fValueOf, fValueOf2, (vu30) wnnVar, x340Var27);
                Object objT13 = x340Var27.T();
                if (objT13 == m4cVar3) {
                    objT13 = new vnn(t24Var);
                    x340Var27.s0(objT13);
                }
                qim0 qim0VarS = wm5.s(bmq0.L(qim0Var, (d6o0) objT13, (g6o0) null), t24Var, qqq0.a, false, 60);
                boolean zD = x340Var27.d(fG);
                Object objT14 = x340Var27.T();
                if (zD || objT14 == m4cVar3) {
                    objT14 = new jc5((byte) 15, fG);
                    x340Var27.s0(objT14);
                }
                qim0 qim0VarK = d9y0.k(eqr0.k(qim0VarS, (iu30) objT14), fFloatValue);
                x340Var27.r(false);
                return qim0VarK;
            case 16:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    pzn pznVar = (pzn) obj4;
                    ohm0 ohm0Var = (ohm0) obj5;
                    jw31 jw31VarA2 = ew31.a(h36.a, een.N0, x340Var29, 54);
                    int iHashCode6 = Long.hashCode(x340Var29.T);
                    xos0 xos0VarM6 = x340Var29.m();
                    nim0 nim0Var2 = nim0.a;
                    qim0 qim0VarE6 = zr7.E(x340Var29, nim0Var2);
                    hzj.A.getClass();
                    if (x340Var29.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var29.m0();
                    if (x340Var29.S) {
                        x340Var29.l(n4kVar);
                    } else {
                        x340Var29.v0();
                    }
                    nko1.H(jw31VarA2, x340Var29, y580.O0);
                    nko1.H(xos0VarM6, x340Var29, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var29, y580.R0);
                    nko1.F(x340Var29);
                    nko1.H(qim0VarE6, x340Var29, y580.Y);
                    bro1.e(ohm0Var, pznVar.a, uyn1.B(nim0Var2, 0.0f, 0.0f, 8.0f, 0.0f, 11), x340Var29, 384);
                    bro1.b(ohm0Var, (qim0) null, x340Var29, 0);
                    x340Var29.r(true);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
            case 17:
                x340 x340Var30 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar4 = cbx.a;
                cvx cvxVar4 = cbx.b(x340Var30).b;
                cvx cvxVar5 = cbx.b(x340Var30).b;
                cvx cvxVar6 = cbx.b(x340Var30).b;
                qim0 qim0VarB2 = uyn1.B(nim0.a, 16.0f, 8.0f, 16.0f, 0.0f, 8);
                x340 x340Var31 = x340Var30;
                Object objT15 = x340Var31.T();
                if (objT15 == fkj0.X) {
                    objT15 = h4o.Q0;
                    x340Var31.s0(objT15);
                }
                otw.c((w460) obj5, new s460(4, 802, cwl1.o0(x340Var31, 2131963338), (String) null, cwl1.o0(x340Var31, 2131963337), ((String) obj4).concat(":credits"), false), s161.b(qim0VarB2, false, (iu30) objT15), (ipb1) null, x340Var31, 8, 8);
                return rih1Var;
            case 18:
                ((Number) obj3).intValue();
                otw.c(((err) obj4).c, ((oyn) obj5).a, (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 19:
                aqb0 aqb0Var2 = (aqb0) obj;
                ((Number) obj3).intValue();
                boolean zIsEmpty = true ^ ((List) obj4).isEmpty();
                ven0 ven0Var2 = (ven0) obj5;
                x340 x340Var32 = (b0k) obj2;
                boolean zI4 = x340Var32.i(ven0Var2);
                Object objT16 = x340Var32.T();
                if (zI4 || objT16 == fkj0.X) {
                    objT16 = new hnf(ven0Var2, (byte) 25);
                    x340Var32.s0(objT16);
                }
                itu.c(0, (Function0) objT16, x340Var32, aqb0.b(aqb0Var2, nim0Var, (pxg1) null, (ni20) null, 7), zIsEmpty);
                return rih1Var;
            case 20:
                v820 v820Var = (v820) obj;
                x340 x340Var33 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                Object obj7 = fkj0.X;
                List list2 = (List) obj4;
                pix pixVar = v820Var.a;
                if ((iIntValue9 & 6) == 0) {
                    iIntValue9 |= x340Var33.g(v820Var) ? 4 : 2;
                }
                x340 x340Var34 = x340Var33;
                if (x340Var34.Y(1 & iIntValue9, (iIntValue9 & 19) != 18)) {
                    boolean zG8 = x340Var34.g(pixVar.b()) | x340Var34.g(list2);
                    Object objT17 = x340Var34.T();
                    if (zG8 || objT17 == obj7) {
                        objT17 = Integer.valueOf(list2.indexOf(pixVar.b()));
                        x340Var34.s0(objT17);
                    }
                    int iIntValue10 = ((Number) objT17).intValue();
                    boolean zE = x340Var34.e(iIntValue10);
                    Object objT18 = x340Var34.T();
                    if (zE || objT18 == obj7) {
                        objT18 = new uv4(iIntValue10, (byte) 17);
                        x340Var34.s0(objT18);
                    }
                    dgo1.c("your_library_list_composer", (iu30) objT18, apo.r(41758083, new bkh((y0t) obj5, v820Var, iIntValue10, (byte) 16), x340Var34), x340Var34, 390);
                } else {
                    x340Var34.b0();
                }
                return rih1Var;
            case 21:
                return a(obj, obj2, obj3);
            case 22:
                return d(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((Number) obj3).intValue();
                otw.c(((hdv) obj4).f, new l9x((jdv) obj5), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 24:
                return e(obj, obj2, obj3);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return f(obj, obj2, obj3);
            case 26:
                return g(obj, obj2, obj3);
            case 27:
                return h(obj, obj2, obj3);
            case 28:
                return i(obj, obj2, obj3);
            default:
                x340 x340Var35 = (b0k) obj2;
                int iIntValue11 = ((Number) obj3).intValue();
                x340 x340Var36 = x340Var35;
                if (x340Var36.Y(iIntValue11 & 1, (iIntValue11 & 17) != 16)) {
                    b3o1.f(((gdx) obj4).f, (j2i) obj5, x340Var36, 0);
                } else {
                    x340Var36.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6j(Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e6j(kat katVar, lzn0 lzn0Var) {
        super(3);
        this.a = (byte) 21;
        this.c = katVar;
        this.b = lzn0Var;
    }
}
