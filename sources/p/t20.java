package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class t20 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t20(Object obj, Object obj2, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        kak0 kak0Var = (kak0) obj2;
        ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        wik0 wik0Var = (wik0) this.b;
        dik0 dik0Var = new dik0(kak0Var.S0, kak0Var.j1);
        x340 x340Var = (b0k) obj4;
        boolean zG = x340Var.g(dik0Var);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = d3p1.H(wik0Var.a, wik0Var.X0, dik0Var);
            x340Var.s0(objT);
        }
        ven0 ven0VarH = rwq.h((zob1) objT, x340Var, 0);
        cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
        g431 g431VarH = cir0Var.h();
        boolean zI = x340Var.i(wik0Var) | x340Var.i(kak0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new dvg0(wik0Var, kak0Var, (byte) 18);
            x340Var.s0(objT2);
        }
        qxd0.S((Function0) objT2, x340Var);
        boolean zI2 = x340Var.i(wik0Var) | x340Var.i(g431VarH);
        Object objT3 = x340Var.T();
        if (zI2 || objT3 == m4cVar) {
            objT3 = new hyg0(wik0Var, g431VarH, (lnm) null, (byte) 12);
            x340Var.s0(objT3);
        }
        qxd0.t(g431VarH, x340Var, (vu30) objT3);
        boolean zG2 = x340Var.g(cir0Var) | x340Var.i(wik0Var);
        Object objT4 = x340Var.T();
        if (zG2 || objT4 == m4cVar) {
            objT4 = new d7i0(cir0Var, wik0Var, (lnm) null, (byte) 19);
            x340Var.s0(objT4);
        }
        qxd0.t(cir0Var, x340Var, (vu30) objT4);
        xjl0 xjl0Var = (xjl0) this.c;
        boolean zI3 = x340Var.i(xjl0Var);
        Object objT5 = x340Var.T();
        if (zI3 || objT5 == m4cVar) {
            objT5 = new uik0(xjl0Var, (byte) 1);
            x340Var.s0(objT5);
        }
        dgo1.c("mixing_root_element", (iu30) objT5, apo.r(-1723255131, new rvg0(wik0Var, kak0Var, ven0VarH, (byte) 25), x340Var), x340Var, 390);
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        wwr0 wwr0Var = (wwr0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        xwr0 xwr0Var = wwr0Var.a;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        boolean z = wwr0Var.b;
        pm31 pm31Var = new pm31(2);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        j06 j06Var = x340Var2.a;
        if (z2 || objT == m4cVar) {
            objT = new wck0(iu30Var, (byte) 28);
            x340Var2.s0(objT);
        }
        qim0 qim0VarD = qmo1.D(qim0VarF, z, false, pm31Var, (iu30) objT, 10);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = wvr0.g;
            x340Var2.s0(objT2);
        }
        qim0 qim0VarN = anm1.N(xwr0Var.name().toLowerCase(Locale.ROOT).concat("_parental_control_toggle_row"), s161.b(qim0VarD, true, (iu30) objT2));
        ywr0 ywr0Var = (ywr0) this.b;
        yxa0 yxa0Var = (yxa0) this.c;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
        hzj.A.getClass();
        if (j06Var == null) {
            tgp1.p();
            throw null;
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
        jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, 0);
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
        ywr0Var.f(xwr0Var, kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true), x340Var2, 0);
        boolean z4 = wwr0Var.b;
        uwr uwrVar = cbx.a;
        ljo1.j(z4, (iu30) null, (qim0) null, false, hxo1.m(cbx.a(x340Var2).b.a, f0o1.q(yxa0Var, x340Var2), cbx.a(x340Var2).b.b, cbx.a(x340Var2).a.b.a(), cbx.a(x340Var2).b.b, x340Var2, 65420), (idn0) null, x340Var2, 48, 92);
        x340Var2.r(true);
        ywr0Var.e(xwr0Var, x340Var2, 0);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        mhw0 mhw0Var = (mhw0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = ((iIntValue & 64) == 0 ? x340Var.g(mhw0Var) : x340Var.i(mhw0Var) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            mod.b(oi7.a.a((gw70) this.b), apo.r(-1838730324, new tbs0((rt01) this.c, mhw0Var, iu30Var, (byte) 25), x340Var2), x340Var2, 56);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a((gw70) this.b), apo.r(262243600, new pk11((nk11) obj2, (iu30) obj3, (maa) this.c, (byte) 1), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a((gw70) this.b), apo.r(-1495832730, new hl11((an11) obj2, (iu30) obj3, (en11) this.c, (byte) 4), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        x340 x340Var;
        x821 x821Var = (x821) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var2 = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z2 = x821Var.f;
        rih1 rih1Var = rih1.a;
        if (z2) {
            x340 x340Var3 = x340Var2;
            x340Var3.i0(-1001099492);
            m821 m821Var = x821Var.h;
            if (m821Var == null) {
                x340Var3.i0(-969313179);
                x340Var3.r(false);
                x340Var = x340Var3;
                z = false;
            } else {
                x340Var3.i0(-969313178);
                b921 b921Var = (b921) this.b;
                i8h1 i8h1Var = (i8h1) this.c;
                boolean zI = x340Var3.i(b921Var) | x340Var3.i(i8h1Var);
                Object objT = x340Var3.T();
                if (zI || objT == m4cVar) {
                    objT = new p2z0(b921Var, i8h1Var, (lnm) null, (byte) 17);
                    x340Var3.s0(objT);
                }
                qxd0.t(rih1Var, x340Var3, (vu30) objT);
                int i = (iIntValue & 896) ^ 384;
                boolean z3 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT2 = x340Var3.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new dv11(iu30Var, (byte) 10);
                    x340Var3.s0(objT2);
                }
                Function0 function0 = (Function0) objT2;
                String str = m821Var.a;
                String str2 = m821Var.b;
                String str3 = m821Var.c;
                boolean z4 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT3 = x340Var3.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new dv11(iu30Var, (byte) 11);
                    x340Var3.s0(objT3);
                }
                z50 z50Var = z50.c;
                zgx zgxVar = new zgx(str3, new gbx(z50Var, (Function0) objT3));
                String str4 = m821Var.d;
                boolean z5 = (i > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT4 = x340Var3.T();
                if (z5 || objT4 == m4cVar) {
                    objT4 = new dv11(iu30Var, (byte) 12);
                    x340Var3.s0(objT4);
                }
                mqo1.d(function0, (i3u) null, (hux) null, str, str2, zgxVar, new zgx(str4, new gbx(z50Var, (Function0) objT4)), x340Var3, 2359296, 6);
                x340Var = x340Var3;
                z = false;
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            z = false;
            x340 x340Var4 = x340Var2;
            x340Var4.i0(-968579749);
            x340Var4.r(false);
        }
        if (x821Var.e) {
            x340 x340Var5 = x340Var2;
            x340Var5.i0(-968531451);
            sy4.b(een.h, 0L, (Function0) null, new nfv0(24, true, true, z), cdj.a, x340Var5, 27654, 6);
            x340Var5.r(z);
        } else {
            x340 x340Var6 = x340Var2;
            x340Var6.i0(-967833765);
            x340Var6.r(z);
        }
        jto1.b(u291.f(nim0.a, 1.0f), new uvx((pgx) null, 0, (tvx) null, (p3v) null, 30), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, cdj.c, (xu30) null, (xu30) null, apo.r(310185247, new a921(x821Var, (byte) 0), x340Var2), apo.r(486513504, new rt11(x821Var, iu30Var, (byte) 3), x340Var2), (xu30) null, (xu30) null, apo.r(1015498275, new a921(x821Var, (byte) 1), x340Var2), x340Var2, 100663366, 197040, 26364);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        int i;
        m251 m251Var = (m251) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        z72 z72Var = (z72) this.b;
        bpb1 bpb1Var = (bpb1) z72Var.Y;
        l651 l651Var = (l651) z72Var.i;
        ven0 ven0VarH = rwq.h(bpb1Var, x340Var, 0);
        String str = (String) this.c;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = new y7e1(str, 2);
            x340Var2.s0(objT);
        }
        y7e1 y7e1Var = (y7e1) objT;
        ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = new r9y0(z72Var, ven0VarS);
            x340Var2.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        boolean zI = x340Var2.i(z72Var) | x340Var2.i(y7e1Var);
        Object objT3 = x340Var2.T();
        u251 u251Var = null;
        if (zI || objT3 == m4cVar) {
            objT3 = new lc41(z72Var, y7e1Var, (lnm) null, (byte) 11);
            x340Var2.s0(objT3);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var2, (vu30) objT3);
        boolean z = m251Var.b;
        boolean zBooleanValue = ((Boolean) ven0VarH.getValue()).booleanValue();
        boolean zK0 = ((di4) z72Var.h).k0();
        int iOrdinal = l651Var.ordinal();
        if (iOrdinal == 0) {
            i = 2131961510;
        } else {
            if (iOrdinal != 1) {
                eg.o();
                return null;
            }
            i = 2131961511;
        }
        int i2 = i;
        int iOrdinal2 = l651Var.ordinal();
        if (iOrdinal2 == 0) {
            x340Var2.i0(-207342551);
            x340Var2.r(false);
        } else {
            if (iOrdinal2 != 1) {
                throw p3d1.k(x340Var2, 1517330712, false);
            }
            x340Var2.i0(1517334019);
            u251Var = new u251(cwl1.o0(x340Var2, 2131961503));
            x340Var2.r(false);
        }
        y251.b(y7e1Var, z, zBooleanValue, (qim0) null, zK0, i2, u251Var, iu30Var2, x340Var2, 12582912);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ar71 ar71Var;
        boolean z;
        ps71 ps71Var;
        xr71 xr71Var = (xr71) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        gs71 gs71Var = (gs71) this.b;
        ur71 ur71Var = xr71Var.a;
        if (ur71Var.equals(vr71.a)) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-514830898);
            x340Var2.r(false);
        } else {
            if (!(ur71Var instanceof ur71)) {
                throw p3d1.k(x340Var, -514832148, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1220189654);
            ur71 ur71Var2 = ur71Var;
            sr71 sr71Var = ur71Var2.a;
            ArrayList<qr71> arrayList = sr71Var.b;
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                rr71 rr71Var = ((qr71) it.next()).a;
                String str = rr71Var.a;
                String str2 = rr71Var.b;
                String str3 = rr71Var.c;
                if (str3 == null) {
                    str3 = "";
                }
                arrayList2.add(new phx(bro1.q(rr71Var.d), str3, str, str2));
            }
            er71 er71Var = new er71(arrayList2);
            gw70 gw70Var = gs71Var.b;
            boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT = x340Var3.T();
            if (z2 || objT == m4cVar) {
                objT = new et61(iu30Var, (byte) 7);
                x340Var3.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            qim0 qim0VarN = anm1.N("shared-by-chip-element", nim0.a);
            hr71 hr71Var = xr71Var.b;
            if (u890.j(hr71Var, fr71.a)) {
                ar71Var = ar71.a;
            } else {
                if (!u890.j(hr71Var, gr71.a)) {
                    eg.o();
                    return null;
                }
                ar71Var = br71.a;
            }
            l3p1.p(er71Var, gw70Var, iu30Var2, qim0VarN, ar71Var, x340Var3, 0);
            if (ur71Var2.b) {
                x340Var3.i0(1220592065);
                r3q r3qVar = (r3q) this.c;
                Object objT2 = x340Var3.T();
                if (objT2 == m4cVar) {
                    lzn0 lzn0Var = gs71Var.a;
                    m861 m861Var = new m861(iu30Var, (byte) 19);
                    switch (r3qVar.a) {
                        case 0:
                            ps71Var = new ps71((s3q) r3qVar.b.c.M9.get(), lzn0Var, m861Var);
                            break;
                        default:
                            ps71Var = new ps71((s3q) r3qVar.b.d.S6.get(), lzn0Var, m861Var);
                            break;
                    }
                    objT2 = ps71Var;
                    x340Var3.s0(objT2);
                }
                ps71 ps71Var2 = (ps71) objT2;
                String str4 = sr71Var.a;
                ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                for (qr71 qr71Var : arrayList) {
                    rr71 rr71Var2 = qr71Var.a;
                    arrayList3.add(new ns71(qr71Var.b, new w4i1(rr71Var2.a, rr71Var2.b, rr71Var2.d, rr71Var2.c)));
                }
                otw.c(ps71Var2, new os71(str4, mqo1.A(arrayList3)), (qim0) null, (ipb1) null, x340Var3, 0, 12);
                z = false;
                x340Var3.r(false);
            } else {
                z = false;
                x340Var3.i0(1221111966);
                x340Var3.r(false);
            }
            x340Var3.r(z);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: p.xu30 */
    /* JADX WARN: Code duplicated, block: B:53:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0151  */
    /* JADX WARN: Code duplicated, block: B:55:0x015a  */
    /* JADX WARN: Code duplicated, block: B:59:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0174  */
    /* JADX WARN: Code duplicated, block: B:63:0x0178  */
    /* JADX WARN: Code duplicated, block: B:64:0x0189  */
    /* JADX WARN: Code duplicated, block: B:66:0x018f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0196 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0192 A[SYNTHETIC] */
    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException, xu30 {
        xu30 xu30Var;
        xu30 xu30VarI;
        xu30 xu30Var2;
        boolean zG;
        Object objT;
        xu30 tk90Var;
        ArrayList arrayList;
        Iterator it;
        int i;
        Object next;
        int i2;
        String str;
        xu30 tk90Var2;
        xu30 xu30Var3;
        boolean z;
        xu30 xu30Var4;
        eob1 eob1Var = (eob1) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        mta mtaVar = ((dgb1) this.b).b;
        hwq hwqVar = eob1Var.a;
        j8e0 j8e0Var = eob1Var.b;
        if (j8e0Var instanceof iae0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1353239865);
            mtaVar.i(x340Var2, 0);
            x340Var2.r(false);
        } else {
            if (!(j8e0Var instanceof j8e0)) {
                throw p3d1.k(x340Var, 1353238673, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(-999155117);
            yk90 yk90Var = (yk90) this.c;
            xu30 xu30VarL = uyn1.l(yk90Var.f, hwqVar, x340Var3);
            float f = xu30VarL != null ? yk90Var.m : 0.0f;
            j8e0 j8e0Var2 = j8e0Var;
            uw9 uw9Var = eob1Var.f;
            boolean z2 = (!j8e0Var2.d || u890.j(eob1Var.c, Boolean.TRUE) || eob1Var.d) ? false : true;
            boolean z3 = (j8e0Var2.c || eob1Var.e) ? false : true;
            xu30 xu30VarL2 = uyn1.l(yk90Var.a, hwqVar, x340Var3);
            if (xu30VarL2 == null) {
                x340Var3.i0(1592747308);
                x340Var3.r(false);
                xu30Var = null;
                xu30VarI = null;
            } else {
                xu30Var = null;
                x340Var3.i0(-364263051);
                xu30VarI = uyn1.I(xu30VarL2, f, x340Var3);
                x340Var3.r(false);
            }
            xk90 xk90Var = yk90Var.b;
            ArrayList arrayList2 = yk90Var.l;
            x340Var3.i0(-734918394);
            if (xk90Var == null) {
                x340Var3.i0(1789574288);
                x340Var3.r(false);
                xu30Var2 = xu30Var;
            } else {
                x340Var3.i0(-1881934447);
                xu30 xu30VarB = xk90Var.b(hwqVar, true, x340Var3, 48);
                x340Var3.r(false);
                xu30Var2 = xu30VarB;
            }
            x340Var3.i0(-1881932004);
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (Iterator it2 = arrayList2.iterator(); it2.hasNext(); it2 = it2) {
                arrayList3.add(((xk90) it2.next()).b(hwqVar, true, x340Var3, 48));
                iu30Var = iu30Var;
                z2 = z2;
            }
            boolean z4 = z2;
            iu30 iu30Var2 = iu30Var;
            x340Var3.r(false);
            if (xu30Var2 != null) {
                zG = x340Var3.g(xu30Var2) | x340Var3.g(arrayList3) | x340Var3.g(hwqVar);
                objT = x340Var3.T();
                if (zG || objT == fkj0.X) {
                    if (xu30Var2 != null) {
                        xk90Var.getClass();
                        tk90Var = new tk90(xk90Var, xu30Var2, hwqVar);
                    } else {
                        tk90Var = xu30Var;
                    }
                    arrayList = new ArrayList();
                    i = 0;
                    for (it = arrayList3.iterator(); it.hasNext(); it = it) {
                        next = it.next();
                        i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw xu30Var;
                        }
                        str = (String) next;
                        if (str != null) {
                            xk90 xk90Var2 = (xk90) arrayList2.get(i);
                            xk90Var2.getClass();
                            tk90Var2 = new tk90(xk90Var2, str, hwqVar);
                        } else {
                            tk90Var2 = xu30Var;
                        }
                        if (tk90Var2 != null) {
                            arrayList.add(tk90Var2);
                        }
                        i = i2;
                    }
                    j2i j2iVar = new j2i(-66486141, new nu31(tk90Var, hwqVar, arrayList, (byte) 22), true);
                    x340Var3.s0(j2iVar);
                    objT = j2iVar;
                }
                xu30Var3 = (xu30) objT;
                z = false;
                x340Var3.r(false);
            } else {
                if (!arrayList3.isEmpty()) {
                    Iterator it3 = arrayList3.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (((String) it3.next()) != null) {
                                zG = x340Var3.g(xu30Var2) | x340Var3.g(arrayList3) | x340Var3.g(hwqVar);
                                objT = x340Var3.T();
                                if (zG) {
                                    if (xu30Var2 != null) {
                                        xk90Var.getClass();
                                        tk90Var = new tk90(xk90Var, xu30Var2, hwqVar);
                                    } else {
                                        tk90Var = xu30Var;
                                    }
                                    arrayList = new ArrayList();
                                    i = 0;
                                    while (it.hasNext()) {
                                        next = it.next();
                                        i2 = i + 1;
                                        if (i < 0) {
                                            p7h.T();
                                            throw xu30Var;
                                        }
                                        str = (String) next;
                                        if (str != null) {
                                            xk90 xk90Var3 = (xk90) arrayList2.get(i);
                                            xk90Var3.getClass();
                                            tk90Var2 = new tk90(xk90Var3, str, hwqVar);
                                        } else {
                                            tk90Var2 = xu30Var;
                                        }
                                        if (tk90Var2 != null) {
                                            arrayList.add(tk90Var2);
                                        }
                                        i = i2;
                                    }
                                    j2i j2iVar2 = new j2i(-66486141, new nu31(tk90Var, hwqVar, arrayList, (byte) 22), true);
                                    x340Var3.s0(j2iVar2);
                                    objT = j2iVar2;
                                } else {
                                    if (xu30Var2 != null) {
                                        xk90Var.getClass();
                                        tk90Var = new tk90(xk90Var, xu30Var2, hwqVar);
                                    } else {
                                        tk90Var = xu30Var;
                                    }
                                    arrayList = new ArrayList();
                                    i = 0;
                                    while (it.hasNext()) {
                                        next = it.next();
                                        i2 = i + 1;
                                        if (i < 0) {
                                            p7h.T();
                                            throw xu30Var;
                                        }
                                        str = (String) next;
                                        if (str != null) {
                                            xk90 xk90Var4 = (xk90) arrayList2.get(i);
                                            xk90Var4.getClass();
                                            tk90Var2 = new tk90(xk90Var4, str, hwqVar);
                                        } else {
                                            tk90Var2 = xu30Var;
                                        }
                                        if (tk90Var2 != null) {
                                            arrayList.add(tk90Var2);
                                        }
                                        i = i2;
                                    }
                                    j2i j2iVar3 = new j2i(-66486141, new nu31(tk90Var, hwqVar, arrayList, (byte) 22), true);
                                    x340Var3.s0(j2iVar3);
                                    objT = j2iVar3;
                                }
                                xu30Var3 = (xu30) objT;
                                z = false;
                                x340Var3.r(false);
                            }
                        }
                    }
                }
                z = false;
                x340Var3.r(false);
                xu30Var3 = xu30Var;
            }
            xu30 xu30VarL3 = uyn1.l(yk90Var.e, hwqVar, x340Var3);
            xu30 xu30VarL4 = uyn1.l(yk90Var.d, hwqVar, x340Var3);
            if (xu30VarL4 == null) {
                x340Var3.i0(1592963564);
                x340Var3.r(z);
                xu30Var4 = xu30Var;
            } else {
                x340Var3.i0(-364256075);
                xu30 xu30VarI2 = uyn1.I(xu30VarL4, f, x340Var3);
                x340Var3.r(z);
                xu30Var4 = xu30VarI2;
            }
            xu30 xu30VarL5 = uyn1.l(yk90Var.g, hwqVar, x340Var3);
            xu30 xu30VarL6 = uyn1.l(yk90Var.h, hwqVar, x340Var3);
            j2i j2iVarL = uyn1.l(yk90Var.c, hwqVar, x340Var3);
            if (j2iVarL == null) {
                j2iVarL = xkj.a;
            }
            mtaVar.a(j8e0Var2, z4, z3, iu30Var2, uw9Var, xu30VarI, j2iVarL, xu30Var3, xu30VarL3, xu30Var4, xu30VarL, xu30VarL5, xu30VarL6, uyn1.l(yk90Var.i, hwqVar, x340Var3), uyn1.l(yk90Var.k, hwqVar, x340Var3), uyn1.l(yk90Var.j, hwqVar, x340Var3), x340Var3, (iIntValue << 3) & 7168);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        List list = (List) obj2;
        int iIntValue = ((Number) obj3).intValue();
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        a4c1 a4c1Var = (a4c1) this.b;
        String str = ((j4c1) this.c).d;
        if (iIntValue != 1) {
            str = str != null ? "" : null;
        }
        otw.c(a4c1Var, new z3c1(list, str, new y3c1(iIntValue)), (qim0) null, (ipb1) null, b0kVar, 0, 12);
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:170:0x0519  */
    /* JADX WARN: Code duplicated, block: B:176:0x0534  */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        int i2;
        int i3;
        boolean z;
        x340 x340Var;
        int i4;
        int i5;
        boolean z2;
        rcz rczVar;
        boolean z3;
        hcz hczVar;
        Object obj6;
        byte b = this.a;
        boolean z4 = true;
        rih1 rih1Var = rih1.a;
        Object obj7 = this.c;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                q20 q20Var = (q20) obj2;
                x340 x340Var2 = (b0k) obj4;
                ((Number) obj5).intValue();
                kko kkoVar = (kko) obj8;
                String str = q20Var.a;
                if (q20Var.b == 4) {
                    x340 x340Var3 = x340Var2;
                    x340Var3.i0(-1821728945);
                    otw.c(new xho(kkoVar), new uho(str, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), (qim0) null, (ipb1) null, x340Var3, 8, 12);
                    x340Var3.r(false);
                } else {
                    x340 x340Var4 = x340Var2;
                    x340Var4.i0(-1821574875);
                    otw.c(((rzo) ((br0) obj7).c).a(kkoVar), new p330(str), (qim0) null, (ipb1) null, x340Var4, 64, 12);
                    x340Var4.r(false);
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) obj8), apo.r(9639728, new q1((zq0) obj2, (Function0) obj7, (iu30) obj3, (byte) 13), b0kVar), b0kVar, 56);
                return rih1Var;
            case 2:
                int i6 = 2;
                su1 su1Var = (su1) obj;
                int i7 = 256;
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue = bool.booleanValue();
                Function0 function0 = (Function0) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                iu30 iu30Var = (iu30) obj7;
                if ((iIntValue & 6) == 0) {
                    if ((iIntValue & 8) == 0 ? x340Var5.g(su1Var) : x340Var5.i(su1Var)) {
                        i6 = 4;
                    }
                    i = iIntValue | i6;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var5.h(zBooleanValue) ? 32 : 16;
                }
                if ((iIntValue & 384) == 0) {
                    if (!x340Var5.i(function0)) {
                        i7 = 128;
                    }
                    i |= i7;
                }
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(i & 1, (i & 1171) != 1170)) {
                    j2i j2iVar = ((qu1) obj8).a;
                    boolean zG = x340Var6.g(iu30Var);
                    Object objT = x340Var6.T();
                    if (zG || objT == fkj0.X) {
                        objT = new cr0(iu30Var, (byte) 23);
                        x340Var6.s0(objT);
                    }
                    j2iVar.Y(su1Var, bool, function0, objT, x340Var6, Integer.valueOf(i & 1022));
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 3:
                qn8 qn8Var = (qn8) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 48) == 0) {
                    i2 = iIntValue2 | (x340Var7.g(qn8Var) ? 32 : 16);
                } else {
                    i2 = iIntValue2;
                }
                if ((iIntValue2 & 384) == 0) {
                    i2 |= x340Var7.i(iu30Var2) ? 256 : 128;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(i2 & 1, (i2 & 1169) != 1168)) {
                    mod.b(oi7.a.a(((rn8) obj8).b), apo.r(-1046688635, new zt6(qn8Var, iu30Var2, (yqg) obj7, (byte) 10), x340Var8), x340Var8, 56);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 4:
                int iIntValue3 = ((Number) obj).intValue();
                ao9 ao9Var = (ao9) obj2;
                qim0 qim0Var = (qim0) obj3;
                x340 x340Var9 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                String strK = l1d.k(iIntValue3, ao9Var.a, "-");
                boolean z5 = (((iIntValue4 & 14) ^ 6) > 4 && x340Var9.e(iIntValue3)) || (iIntValue4 & 6) == 4;
                x340 x340Var10 = x340Var9;
                Object objT2 = x340Var10.T();
                if (z5 || objT2 == fkj0.X) {
                    objT2 = new uv4(iIntValue3, (byte) 4);
                    x340Var10.s0(objT2);
                }
                dgo1.c(strK, (iu30) objT2, apo.r(-1415206480, new wb6((hn9) obj8, ao9Var, (fn9) obj7, qim0Var, (byte) 21), x340Var10), x340Var10, 384);
                return rih1Var;
            case 5:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                ldo ldoVar = (ldo) obj8;
                mod.b(oi7.a.a((gw70) ldoVar.c), apo.r(-559271781, new hwd(ldoVar, (ffk) obj2, (iu30) obj3, (yqg) obj7, (byte) 23), b0kVar2), b0kVar2, 56);
                return rih1Var;
            case 6:
                aqb0 aqb0Var = (aqb0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                y4g0 y4g0Var = (y4g0) obj3;
                x340 x340Var11 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                if ((iIntValue6 & 6) == 0) {
                    i3 = (x340Var11.g(aqb0Var) ? 4 : 2) | iIntValue6;
                } else {
                    i3 = iIntValue6;
                }
                if ((iIntValue6 & 48) == 0) {
                    i3 |= x340Var11.e(iIntValue5) ? 32 : 16;
                }
                if ((iIntValue6 & 384) == 0) {
                    i3 |= x340Var11.g(y4g0Var) ? 256 : 128;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(i3 & 1, (i3 & 1171) != 1170)) {
                    fno1.a(y4g0Var, (lxr0) obj8, iIntValue5 < ((ArrayList) obj7).size() + (-1), aqb0.b(aqb0Var, nim0.a, (pxg1) null, (ni20) null, 7), x340Var12, (i3 >> 6) & 14);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 7:
                ksw kswVar = (ksw) obj;
                m7m m7mVar = (m7m) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                int iIntValue7 = ((Number) obj5).intValue();
                x340 x340Var13 = (b0k) obj4;
                Object objT3 = x340Var13.T();
                m4c m4cVar = fkj0.X;
                if (objT3 == m4cVar) {
                    objT3 = bb00.h(0, x340Var13);
                }
                hdn0 hdn0Var = (hdn0) objT3;
                boolean zI = x340Var13.i(hdn0Var);
                Object objT4 = x340Var13.T();
                if (zI || objT4 == m4cVar) {
                    objT4 = new tu9(hdn0Var, (byte) 6);
                    x340Var13.s0(objT4);
                }
                n9p1.e(kswVar, (iu30) objT4, x340Var13, iIntValue7 & 14);
                mod.b(oi7.a.a((gw70) obj8), apo.r(-1178536416, new n7m(obj7, (Object) m7mVar, (Object) iu30Var3, (Object) hdn0Var, (byte) 0), x340Var13), x340Var13, 56);
                return rih1Var;
            case 8:
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var14 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                ven0 ven0VarJ = f4p1.j(new xr0(((jtl1) ((br0) obj8).c).b, (byte) 9), Boolean.FALSE, (iac0) null, x340Var14, 48, 14);
                qc0 qc0Var = (qc0) ((spq0) obj2).h();
                if (qc0Var == null) {
                    x340Var = x340Var14;
                    x340Var.i0(1263725921);
                    z = false;
                } else {
                    z = false;
                    x340Var = x340Var14;
                    x340Var.i0(1263725922);
                    ((st60) obj7).h(qc0Var, ((Boolean) ven0VarJ.getValue()).booleanValue(), iu30Var4, x340Var, iIntValue8 & 896);
                }
                x340Var.r(z);
                return rih1Var;
            case 9:
                ((Number) obj5).intValue();
                otw.c((qao0) obj8, new pao0(((vdv) obj7).a), (qim0) null, (ipb1) null, (b0k) obj4, 0, 12);
                return rih1Var;
            case 10:
                le10 le10Var = (le10) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                if ((iIntValue9 & 48) == 0) {
                    i4 = iIntValue9 | (x340Var15.g(le10Var) ? 32 : 16);
                } else {
                    i4 = iIntValue9;
                }
                if ((iIntValue9 & 384) == 0) {
                    i4 |= x340Var15.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var16 = x340Var15;
                if (x340Var16.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    mod.b(oi7.a.a((gw70) obj8), apo.r(1474296002, new xx00(le10Var, iu30Var5, (re10) obj7, (byte) 2), x340Var16), x340Var16, 56);
                } else {
                    x340Var16.b0();
                }
                return rih1Var;
            case 11:
                ksw kswVar2 = (ksw) obj;
                iu30 iu30Var6 = (iu30) obj3;
                int iIntValue10 = ((Number) obj5).intValue();
                jqb0 jqb0Var = (jqb0) obj8;
                x340 x340Var17 = (b0k) obj4;
                qbo0 qbo0VarU = h7p1.u((View) x340Var17.k(AndroidCompositionLocals_androidKt.f));
                if (qbo0VarU == null) {
                    qbo0VarU = new qbo0();
                }
                jqb0Var.b = qbo0VarU;
                ((tyq) obj7).c().a(((iIntValue10 >> 3) & 126) | ((iIntValue10 << 6) & 896), obj2, x340Var17, kswVar2, iu30Var6);
                return rih1Var;
            case 12:
                rd60 rd60Var = (rd60) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                if ((iIntValue11 & 48) == 0) {
                    i5 = iIntValue11 | (x340Var18.g(rd60Var) ? 32 : 16);
                } else {
                    i5 = iIntValue11;
                }
                if ((iIntValue11 & 384) == 0) {
                    i5 |= x340Var18.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    mod.b(oi7.a.a((gw70) obj8), apo.r(-644562983, new sd60(rd60Var, iu30Var7, (yqg) obj7, (byte) 0), x340Var19), x340Var19, 56);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 13:
                lx90 lx90Var = (lx90) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                qim0 qim0VarC = u291.c(nim0.a, 1.0f);
                tob1 tob1Var = (tob1) obj8;
                nx90 nx90Var = (nx90) obj7;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var21 = x340Var20;
                int iHashCode = Long.hashCode(x340Var21.T);
                xos0 xos0VarM = x340Var21.m();
                qim0 qim0VarE = zr7.E(x340Var20, qim0VarC);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(hmb0.t1);
                } else {
                    x340Var22.v0();
                }
                nko1.H(gfh0VarC, x340Var20, y580.O0);
                nko1.H(xos0VarM, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE, x340Var20, y580.Y);
                hqq0.l(lx90Var, tob1Var, nx90Var.a, nx90Var.b, iu30Var8, x340Var20, ((iIntValue12 >> 3) & 14) | ((iIntValue12 << 6) & 57344));
                x340Var22.r(true);
                return rih1Var;
            case 14:
                tna0 tna0Var = (tna0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                ((Number) obj5).intValue();
                rwj rwjVar = (rwj) obj8;
                x340 x340Var23 = (b0k) obj4;
                Object objT5 = x340Var23.T();
                Object obj9 = fkj0.X;
                if (objT5 == obj9) {
                    objT5 = gio1.b(w7x.a);
                    x340Var23.s0(objT5);
                }
                wen0 wen0Var = (wen0) objT5;
                Object objT6 = x340Var23.T();
                if (objT6 == obj9) {
                    objT6 = lko.a((lko) rwjVar.d, wen0Var, (String) rwjVar.f);
                    x340Var23.s0(objT6);
                }
                mko mkoVar = (mko) objT6;
                boolean zI2 = x340Var23.i(mkoVar);
                Object objT7 = x340Var23.T();
                if (zI2 || objT7 == obj9) {
                    objT7 = new vcn(mkoVar, (byte) 1);
                    x340Var23.s0(objT7);
                }
                qxd0.i(rih1Var, (iu30) objT7, x340Var23);
                String str2 = tna0Var.a.a;
                boolean zI3 = x340Var23.i(tna0Var) | x340Var23.i(wen0Var) | x340Var23.i(mkoVar);
                Object objT8 = x340Var23.T();
                if (zI3 || objT8 == obj9) {
                    objT8 = new lb50((Object) tna0Var, (Object) wen0Var, (Object) mkoVar, (byte) 11);
                    x340Var23.s0(objT8);
                }
                qxd0.i(str2, (iu30) objT8, x340Var23);
                Object objT9 = x340Var23.T();
                if (objT9 == obj9) {
                    objT9 = new xho(mkoVar.b());
                    x340Var23.s0(objT9);
                }
                mod.b(oi7.a.a((gw70) rwjVar.e), apo.r(-1731863453, new c9o(tna0Var, iu30Var9, (yqg) obj7, (xho) objT9, (byte) 2), x340Var23), x340Var23, 56);
                return rih1Var;
            case 15:
                ksw kswVar3 = (ksw) obj;
                hob1 hob1Var = (hob1) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                aci0 aci0Var = (aci0) obj8;
                m4c m4cVar2 = fkj0.X;
                qq qqVar = (qq) obj7;
                p731 p731Var = (p731) qqVar.e;
                String str3 = hob1Var.a;
                if (hob1Var.u != null) {
                    x340 x340Var25 = x340Var24;
                    x340Var25.i0(-1268106395);
                    x340Var25.r(false);
                    z2 = true;
                } else {
                    x340 x340Var26 = x340Var24;
                    x340Var26.i0(-456547572);
                    boolean z6 = hob1Var.A && (xoi1.b((Context) x340Var26.k(AndroidCompositionLocals_androidKt.b)) || hob1Var.J);
                    x340Var26.r(false);
                    z2 = z6;
                }
                x340 x340Var27 = x340Var24;
                boolean zG2 = x340Var27.g(str3);
                Object objT10 = x340Var27.T();
                if (zG2 || objT10 == m4cVar2) {
                    oyo oyoVar = (oyo) qqVar.r;
                    jr30 jr30VarA = oyoVar != null ? oyoVar.a(p731Var) : null;
                    x340Var27.s0(jr30VarA);
                    objT10 = jr30VarA;
                }
                jr30 jr30Var = (jr30) objT10;
                boolean zG3 = x340Var27.g(str3);
                Object objT11 = x340Var27.T();
                if (zG3 || objT11 == m4cVar2) {
                    objT11 = ((tbw0) qqVar.n).a((abu0) ((Function0) qqVar.d).invoke(), p731Var, (tl7) ((Function0) qqVar.b).invoke(), jr30Var);
                    x340Var27.s0(objT11);
                }
                ubw0 ubw0Var = (ubw0) objT11;
                y2u0 y2u0Var = hob1Var.I;
                Boolean boolValueOf = y2u0Var != null ? Boolean.valueOf(y2u0Var.a(hob1Var.H)) : null;
                sbw0 sbw0Var = hob1Var.y;
                if (sbw0Var == null) {
                    x340Var27.i0(1286459376);
                    x340Var27.r(false);
                } else {
                    x340Var27.i0(1286459377);
                    ubw0Var.e(kswVar3, new sbw0(sbw0Var.a, sbw0Var.b, sbw0Var.c, sbw0Var.d, sbw0Var.e, sbw0Var.f, sbw0Var.g, (!sbw0Var.h || z2 || u890.j(boolValueOf, Boolean.TRUE)) ? false : true, sbw0Var.i, sbw0Var.j, sbw0Var.k), x340Var27, (iIntValue13 & 14) | 64);
                    x340Var27.r(false);
                }
                float fW = upo1.w(x340Var27, aci0Var.a);
                boolean zG4 = x340Var27.g(str3);
                Object objT12 = x340Var27.T();
                if (zG4 || objT12 == m4cVar2) {
                    objT12 = new idd1(new dci0(qqVar, (byte) 0));
                    x340Var27.s0(objT12);
                }
                znb0 znb0Var = (znb0) objT12;
                boolean zG5 = x340Var27.g(str3);
                Object objT13 = x340Var27.T();
                if (zG5 || objT13 == m4cVar2) {
                    objT13 = new idd1(new dci0(qqVar, (byte) 1));
                    x340Var27.s0(objT13);
                }
                znb0 znb0Var2 = (znb0) objT13;
                boolean zI4 = x340Var27.i(qqVar);
                Object objT14 = x340Var27.T();
                if (zI4 || objT14 == m4cVar2) {
                    objT14 = new z6h0(qqVar, (byte) 13);
                    x340Var27.s0(objT14);
                }
                znb0 znb0VarZ = ijo1.z(str3, ubw0Var, (iu30) objT14, x340Var27);
                boolean zI5 = x340Var27.i(qqVar);
                Object objT15 = x340Var27.T();
                if (zI5 || objT15 == m4cVar2) {
                    objT15 = new z8b0(qqVar, (byte) 20);
                    x340Var27.s0(objT15);
                }
                znb0 znb0VarZ2 = ijo1.z(str3, ubw0Var, (iu30) objT15, x340Var27);
                Object objT16 = x340Var27.T();
                if (objT16 == m4cVar2) {
                    objT16 = v8r.q(Boolean.FALSE);
                    x340Var27.s0(objT16);
                }
                tob1 tob1Var2 = (ven0) objT16;
                boolean zI6 = x340Var27.i(tob1Var2);
                Object objT17 = x340Var27.T();
                if (zI6 || objT17 == m4cVar2) {
                    objT17 = new abh0(tob1Var2, (byte) 2);
                    x340Var27.s0(objT17);
                }
                qxd0.i(rih1Var, (iu30) objT17, x340Var27);
                boolean zG6 = x340Var27.g(str3) | x340Var27.g(ubw0Var);
                Object objT18 = x340Var27.T();
                if (zG6 || objT18 == m4cVar2) {
                    objT18 = new idd1(new dt90(qqVar, ubw0Var, tob1Var2, (byte) 19));
                    x340Var27.s0(objT18);
                }
                znb0 znb0Var3 = (znb0) objT18;
                boolean zG7 = x340Var27.g(str3);
                Object objT19 = x340Var27.T();
                if (zG7 || objT19 == m4cVar2) {
                    objT19 = new idd1(new dci0(qqVar, (byte) 4));
                    x340Var27.s0(objT19);
                }
                znb0 znb0Var4 = (znb0) objT19;
                boolean zG8 = x340Var27.g(str3);
                Object objT20 = x340Var27.T();
                if (zG8 || objT20 == m4cVar2) {
                    objT20 = new idd1(new dci0(qqVar, (byte) 2));
                    x340Var27.s0(objT20);
                }
                znb0 znb0Var5 = (znb0) objT20;
                boolean zG9 = x340Var27.g(str3);
                Object objT21 = x340Var27.T();
                if (zG9 || objT21 == m4cVar2) {
                    ojv0 ojv0Var = (ojv0) qqVar.g;
                    objT21 = ojv0Var != null ? new idd1(new z8i0(ojv0Var, (byte) 3)) : null;
                    x340Var27.s0(objT21);
                } else {
                    tob1Var2 = tob1Var2;
                }
                znb0 znb0Var6 = (znb0) objT21;
                boolean zG10 = x340Var27.g(str3);
                Object objT22 = x340Var27.T();
                if (zG10 || objT22 == m4cVar2) {
                    objT22 = new idd1(new dci0(qqVar, (byte) 3));
                    x340Var27.s0(objT22);
                }
                znb0 znb0Var7 = (znb0) objT22;
                bpb1 bpb1VarJ = ubw0Var.j();
                Boolean bool2 = Boolean.FALSE;
                boolean zBooleanValue2 = ((Boolean) rwq.g(bpb1VarJ, bool2, (o8n) null, x340Var27, 48, 2).getValue()).booleanValue();
                boolean zG11 = x340Var27.g(str3) | x340Var27.g(jr30Var);
                Object objT23 = x340Var27.T();
                if (zG11 || objT23 == m4cVar2) {
                    zob1 zob1Var = (zob1) qqVar.q;
                    jcz jczVar = (zob1Var == null || jr30Var == null) ? null : new jcz(zob1Var, (kko) qqVar.f, jr30Var);
                    x340Var27.s0(jczVar);
                    objT23 = jczVar;
                } else {
                    bool2 = bool2;
                    znb0Var = znb0Var;
                }
                jcz jczVar2 = (jcz) objT23;
                c5v0 c5v0Var = hob1Var.Q;
                kcz kczVar = kcz.b;
                if (c5v0Var == null) {
                    rczVar = null;
                } else {
                    if (!aci0Var.c) {
                        c5v0Var = null;
                    }
                    if (c5v0Var != null) {
                        rczVar = new rcz(hob1Var.b, c5v0Var.a, c5v0Var.b, hob1Var.h instanceof dr00 ? kczVar : kcz.a, c5v0Var.c, hob1Var.f, u890.j(boolValueOf, Boolean.TRUE), ((Boolean) tob1Var2.getValue()).booleanValue(), f9z.V0);
                    } else {
                        rczVar = null;
                    }
                }
                mev mevVar = (mev) qqVar.f32p;
                x340Var27.i0(2110810502);
                if (rczVar != null) {
                    kcz kczVar2 = rczVar.d;
                    String str4 = rczVar.a;
                    if (jczVar2 == null || mevVar == null) {
                        z3 = false;
                        hczVar = new hcz((String) null, (j2i) null);
                    } else {
                        x340Var27.f0(1264338972, x340Var27.K(x340Var27.K(x340Var27.K(x340Var27.K(str3, str4), ubw0Var), jczVar2), mevVar));
                        Object objT24 = x340Var27.T();
                        if (objT24 == m4cVar2) {
                            objT24 = v8r.q(null);
                            x340Var27.s0(objT24);
                        }
                        ven0 ven0Var = (ven0) objT24;
                        Object objT25 = x340Var27.T();
                        if (objT25 == m4cVar2) {
                            objT25 = new d7v(ven0Var, (byte) 22);
                            x340Var27.s0(objT25);
                        }
                        iu30 iu30Var11 = (iu30) objT25;
                        boolean zI7 = x340Var27.i(mevVar) | x340Var27.i(jczVar2);
                        Object objT26 = x340Var27.T();
                        if (zI7 || objT26 == m4cVar2) {
                            objT26 = new f0z(mevVar, jczVar2, (byte) 6);
                            x340Var27.s0(objT26);
                        }
                        znb0 znb0VarZ3 = ijo1.z(str3, ubw0Var, (iu30) objT26, x340Var27);
                        boolean zG12 = x340Var27.g(znb0VarZ3);
                        Object objT27 = x340Var27.T();
                        if (zG12 || objT27 == m4cVar2) {
                            objT27 = new j2i(1032736913, new pea(new xnm0(new j2i(-1790083672, new icz(znb0VarZ3, (byte) 0), true)), (byte) 3), true);
                            x340Var27.s0(objT27);
                        }
                        hczVar = new hcz((rczVar.g || (kczVar2 == kczVar && rczVar.h)) ? null : (String) ven0Var.getValue(), apo.r(-1568105637, new ozw((xu30) objT27, new rcz(str4, rczVar.b, rczVar.c, kczVar2, rczVar.e, rczVar.f, rczVar.g, rczVar.h, iu30Var11), (byte) 28), x340Var27));
                        z3 = false;
                        x340Var27.r(false);
                    }
                } else {
                    z3 = false;
                    hczVar = new hcz((String) null, (j2i) null);
                }
                x340Var27.r(z3);
                mod.b(oi7.a.a((gw70) qqVar.a), apo.r(348909378, new cci0(qqVar, znb0Var3, hob1Var, znb0Var4, aci0Var, hczVar, fW, iu30Var10, znb0Var7, znb0Var2, znb0Var5, znb0Var, zBooleanValue2, ((Boolean) rwq.g(ubw0Var.c(), bool2, (o8n) null, x340Var27, 48, 2).getValue()).booleanValue(), znb0VarZ, z2, znb0VarZ2, znb0Var6, (i091) rwq.g(ubw0Var.i(), (Object) null, (o8n) null, x340Var27, 48, 2).getValue(), ubw0Var, tob1Var2, (byte) 1), x340Var27), x340Var27, 56);
                return rih1Var;
            case 16:
                return a(obj, obj2, obj3, obj4, obj5);
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                xkk1 xkk1Var = (xkk1) obj;
                qxc0 qxc0Var = (qxc0) obj3;
                return new omy(gxo1.q(xkk1Var), ((jo70) obj2).a, gxo1.m(((dn3) obj8).a, qxc0Var, (fuj0) obj4), gxo1.p(xkk1Var, (q37) obj5), gxo1.l(qxc0Var, (wa71) obj7));
            case 19:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((rn8) obj8).b), apo.r(232667047, new tbs0((v2v0) obj2, (iu30) obj3, (yqg) obj7, (byte) 19), b0kVar3), b0kVar3, 56);
                return rih1Var;
            case 20:
                zaw0 zaw0Var = (zaw0) obj2;
                iu30 iu30Var12 = (iu30) obj3;
                int iIntValue14 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                boolean z7 = ((hf2) obj8).b;
                yqg yqgVar = (yqg) obj7;
                x340 x340Var28 = (b0k) obj4;
                boolean zG13 = x340Var28.g(yqgVar);
                Object objT28 = x340Var28.T();
                if (zG13 || objT28 == m4cVar3) {
                    objT28 = new zai0(yqgVar, (byte) 1);
                    x340Var28.s0(objT28);
                }
                Function0 function1 = (Function0) objT28;
                if ((((iIntValue14 & 896) ^ 384) <= 256 || !x340Var28.g(iu30Var12)) && (iIntValue14 & 384) != 256) {
                    z4 = false;
                }
                Object objT29 = x340Var28.T();
                if (z4 || objT29 == m4cVar3) {
                    objT29 = new ppv0(iu30Var12, (byte) 6);
                    x340Var28.s0(objT29);
                }
                lvx.d(zaw0Var, function1, z7, null, (iu30) objT29, x340Var28, (iIntValue14 >> 3) & 14);
                return rih1Var;
            case 21:
                return e(obj, obj2, obj3, obj4, obj5);
            case 22:
                return f(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return g(obj, obj2, obj3, obj4, obj5);
            case 24:
                return h(obj, obj2, obj3, obj4, obj5);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return i(obj, obj2, obj3, obj4, obj5);
            case 26:
                return j(obj, obj2, obj3, obj4, obj5);
            case 27:
                return k(obj, obj2, obj3, obj4, obj5);
            case 28:
                return m(obj, obj2, obj3, obj4, obj5);
            default:
                csf1 csf1Var = (csf1) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (ihc1.y0(csf1Var.a)) {
                    x340 x340Var30 = x340Var29;
                    x340Var30.i0(-760338331);
                    x340Var30.r(false);
                } else {
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(-761244554);
                    ven0 ven0VarH = rwq.h((wen0) ((ecd1) obj8).c, x340Var31, 0);
                    Object objT30 = x340Var31.T();
                    m4c m4cVar4 = fkj0.X;
                    if (objT30 == m4cVar4) {
                        obj6 = objT30;
                        Boolean bool3 = (Boolean) ven0VarH.getValue();
                        bool3.booleanValue();
                        zen0 zen0Var = new zen0(bool3);
                        Boolean bool4 = (Boolean) ven0VarH.getValue();
                        bool4.getClass();
                        zen0Var.w1(bool4);
                        x340Var31.s0(zen0Var);
                        obj6 = zen0Var;
                    }
                    obj6 = objT30;
                    zen0 zen0Var2 = (zen0) obj6;
                    Boolean bool5 = (Boolean) ven0VarH.getValue();
                    bool5.booleanValue();
                    boolean zI8 = x340Var31.i(zen0Var2) | x340Var31.i(ven0VarH);
                    Object objT31 = x340Var31.T();
                    if (zI8 || objT31 == m4cVar4) {
                        objT31 = new kwb1(zen0Var2, ven0VarH, (lnm) null, (byte) 13);
                        x340Var31.s0(objT31);
                    }
                    qxd0.t(bool5, x340Var31, (vu30) objT31);
                    fq7.d(zen0Var2, (qim0) null, xay.e(3, (ni20) null).a(xay.d((ni20) null, (fra) null, 15)), xay.f(3, (ni20) null).a(xay.l(15, (ni20) null)), (String) null, apo.r(369933482, new p8e1(csf1Var, iu30Var13, (esf1) obj7, (byte) 2), x340Var31), x340Var31, 196608, 18);
                    x340Var31.r(false);
                }
                return rih1Var;
        }
    }
}
