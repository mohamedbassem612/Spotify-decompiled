package p;

import android.content.Context;
import android.content.res.Resources;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pba0 extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pba0(Object obj, byte b) {
        super(5);
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:88:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:91:0x0126 A[SYNTHETIC] */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        gec0 gec0Var;
        hec0 hec0Var;
        hec0 hec0Var2;
        ndc0 ndc0Var = (ndc0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        Map map = ndc0Var.a;
        zdc0 zdc0Var = (zdc0) this.b;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(zdc0Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new no70(zdc0Var, (lnm) null, (byte) 24);
            x340Var.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qxd0.t(rih1Var, x340Var, (vu30) objT);
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new jwa0(iu30Var, (byte) 12);
            x340Var.s0(objT2);
        }
        iu30 iu30Var2 = (iu30) objT2;
        if (!ndc0Var.c && map.isEmpty()) {
            x340Var.i0(1371764216);
            x340Var.r(false);
            return rih1Var;
        }
        x340Var.i0(1371314468);
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            ldc0 ldc0Var = (ldc0) entry.getValue();
            if (ldc0Var instanceof kdc0) {
                kdc0 kdc0Var = (kdc0) ldc0Var;
                hec0Var2 = new hec0(kdc0Var.c, str, kdc0Var.a);
            } else {
                if (!(ldc0Var instanceof jdc0)) {
                    eg.o();
                    return null;
                }
                hec0Var2 = null;
            }
            if (hec0Var2 != null) {
                arrayList.add(hec0Var2);
            }
        }
        c9 c9VarF = mqo1.F(arrayList);
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry entry2 : map.entrySet()) {
            String str2 = (String) entry2.getKey();
            ldc0 ldc0Var2 = (ldc0) entry2.getValue();
            if (ldc0Var2 instanceof kdc0) {
                kdc0 kdc0Var2 = (kdc0) ldc0Var2;
                hec0Var = kdc0Var2.d ? new hec0(kdc0Var2.c, str2, kdc0Var2.a) : null;
                if (hec0Var != null) {
                    arrayList2.add(hec0Var);
                }
            } else if (!(ldc0Var2 instanceof jdc0)) {
                eg.o();
                return null;
            }
            if (hec0Var != null) {
                arrayList2.add(hec0Var);
            }
        }
        hec0 hec0Var3 = (hec0) o7h.s0(arrayList2);
        kec0 jec0Var = hec0Var3 != null ? new jec0(hec0Var3) : iec0.a;
        ArrayList arrayList3 = new ArrayList();
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ldc0 ldc0Var3 = (ldc0) ((Map.Entry) it.next()).getValue();
            if (ldc0Var3 instanceof jdc0) {
                gec0Var = gec0.b;
            } else {
                if (!(ldc0Var3 instanceof kdc0)) {
                    eg.o();
                    return null;
                }
                gec0Var = null;
            }
            if (gec0Var != null) {
                arrayList3.add(gec0Var);
            }
        }
        lec0 lec0Var = new lec0(c9VarF, jec0Var, (gec0) o7h.s0(arrayList3));
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        oec0.c(lec0Var, iu30Var2, null, uyn1.j(16.0f, 0.0f, 16.0f, 8.0f, 2), x340Var, 0);
        x340Var.r(true);
        x340Var.r(false);
        return rih1Var;
    }

    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        boolean z;
        x340 x340Var;
        cxc0 cxc0Var = (cxc0) obj2;
        x340 x340Var2 = (b0k) obj4;
        ((Number) obj5).intValue();
        fra fraVar = een.N0;
        el9 el9Var = (el9) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(jw31VarA, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        Resources resources = ((Context) el9Var.h).getResources();
        int i = cxc0Var.b;
        String quantityString = resources.getQuantityString(2131820721, i, Integer.valueOf(i));
        if (quantityString == null) {
            x340Var4.i0(-1978211096);
            x340Var4.r(false);
            z = false;
            x340Var = x340Var4;
        } else {
            x340Var4.i0(-1978211095);
            uwr uwrVar = cbx.a;
            z = false;
            x340Var = x340Var4;
            uwo1.e(quantityString, anm1.N("LikedSongsHeaderMetadata", nim0Var), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2032);
            x340Var.r(false);
            el9Var = el9Var;
        }
        if (((pp4) el9Var.i).a()) {
            x340Var.i0(-1977933056);
            otw.c((vl90) ((idd1) el9Var.X).getValue(), new pl90((String) el9Var.g), (qim0) null, (ipb1) null, x340Var2, 8, 12);
            x340Var.r(z);
        } else {
            x340Var.i0(-1977790828);
            x340Var.r(z);
        }
        x340Var.r(true);
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        z5d0 z5d0Var = (z5d0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean zIsEmpty = z5d0Var.b.isEmpty();
        Boolean boolValueOf = Boolean.valueOf(zIsEmpty);
        x340 x340Var = (b0k) obj4;
        boolean zH = x340Var.h(zIsEmpty);
        qj0 qj0Var = (qj0) this.b;
        boolean zI = zH | x340Var.i(qj0Var);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new no70(zIsEmpty, qj0Var, (lnm) null);
            x340Var.s0(objT);
        }
        qxd0.t(boolValueOf, x340Var, (vu30) objT);
        svh0 svh0Var = (svh0) qj0Var.e;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new jwa0(iu30Var, (byte) 14);
            x340Var.s0(objT2);
        }
        vzn1.c(svh0Var, (iu30) objT2, apo.r(666092465, new zs((byte) 29, z5d0Var, iu30Var, zIsEmpty), x340Var), x340Var, 392);
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r6d0 r6d0Var = (r6d0) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        svh0 svh0Var = (svh0) ((ng20) this.b).b;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new jwa0(iu30Var, (byte) 15);
            x340Var2.s0(objT);
        }
        vzn1.c(svh0Var, (iu30) objT, apo.r(-1357513014, new vx90(r6d0Var, iu30Var, (byte) 21), x340Var2), x340Var2, 392);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        String strN0;
        cxc0 cxc0Var = (cxc0) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        uwr uwrVar = cbx.a;
        lee1 lee1Var = cbx.d(x340Var).j;
        ka3 ka3Var = (ka3) this.b;
        x340 x340Var2 = x340Var;
        x340Var2.i0(-801036920);
        x340Var2.i0(-801049660);
        smc0 smc0VarN = k4p1.n();
        int i = ((rp4) ka3Var.d).b() ? 2131820726 : 2131820725;
        int i2 = cxc0Var.b;
        smc0VarN.add(cwl1.U(i, i2, new Object[]{Integer.valueOf(i2)}, x340Var2));
        long j = cxc0Var.a / 60;
        long j2 = j / 60;
        long j3 = j % 60;
        if (j2 > 0) {
            x340Var2.i0(-1060698928);
            strN0 = cwl1.n0(2131957371, new Object[]{Long.valueOf(j2), Long.valueOf(j3)}, x340Var2);
            x340Var2.r(false);
        } else if (j3 > 0) {
            x340Var2.i0(-1060695453);
            strN0 = cwl1.n0(2131957372, new Object[]{Long.valueOf(j3)}, x340Var2);
            x340Var2.r(false);
        } else {
            x340Var2.i0(1478258717);
            x340Var2.r(false);
            strN0 = null;
        }
        if (strN0 != null) {
            smc0VarN.add(strN0);
        }
        smc0 smc0VarK = k4p1.k(smc0VarN);
        x340Var2.r(false);
        if (x340Var2.k(t4k.n) == flb0.b) {
            smc0VarK = new wd31(smc0VarK);
        }
        x340Var2.r(false);
        uwo1.e(o7h.y0((Iterable) smc0VarK, " • ", (String) null, (String) null, (iu30) null, 62), anm1.N("ListenLaterHeaderMetadata", nim0.a), lee1Var, ((yex) zex.a.d).g, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String strU;
        y9d0 y9d0Var = (y9d0) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        uqo uqoVar = y9d0Var.a;
        res resVar = (res) this.b;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(resVar);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new nzb0(resVar, (byte) 25);
            x340Var.s0(objT);
        }
        resVar.l((Function0) objT, x340Var, 0);
        aad0 aad0Var = y9d0Var.b;
        if (aad0Var.equals(cj20.t)) {
            strU = x0d.k(x340Var, -1022284416, 2131957377, x340Var, false);
        } else if (aad0Var.equals(aj20.t)) {
            strU = x0d.k(x340Var, -1022280387, 2131957379, x340Var, false);
        } else if (aad0Var.equals(bj20.t)) {
            strU = x0d.k(x340Var, -1022277002, 2131957380, x340Var, false);
        } else {
            if (!(aad0Var instanceof z9d0)) {
                throw p3d1.k(x340Var, -1022286716, false);
            }
            x340Var.i0(-1022273332);
            int i = ((z9d0) aad0Var).a;
            strU = cwl1.U(2131820727, i, new Object[]{Integer.valueOf(i)}, x340Var);
            x340Var.r(false);
        }
        String strB = tro1.B(uqoVar, x340Var, 0);
        if5 if5Var = new if5((Integer) null, strU, (b2i) null, (hf5) null, 13);
        String strB2 = tro1.B(uqoVar, x340Var, 0);
        int i2 = (iIntValue & 896) ^ 384;
        boolean z = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT2 = x340Var.T();
        if (z || objT2 == m4cVar) {
            objT2 = new sya0(iu30Var, (byte) 23);
            x340Var.s0(objT2);
        }
        Function0 function0 = (Function0) objT2;
        if (ihc1.y0(strB2)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strB2), function0);
        boolean z2 = (i2 > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT3 = x340Var.T();
        if (z2 || objT3 == m4cVar) {
            objT3 = new jwa0(iu30Var, (byte) 16);
            x340Var.s0(objT3);
        }
        uyn1.e(strB, if5Var, false, gbxVar, (iu30) objT3, (qim0) null, (if5) null, y9d0Var.c, x340Var, 448, 96);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        String string;
        fbp1 fbp1Var;
        fg91 fg91VarA;
        byte b = 23;
        byte b2 = 4;
        byte b3 = 12;
        int i = 2;
        byte b4 = 7;
        byte b5 = 5;
        byte b6 = 6;
        List list = null;
        switch (this.a) {
            case 0:
                kba0 kba0Var = (kba0) obj2;
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                z72 z72Var = (z72) this.b;
                svh0 svh0Var = (svh0) z72Var.X;
                boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
                x340 x340Var2 = x340Var;
                Object objT = x340Var2.T();
                if (z || objT == fkj0.X) {
                    objT = new bv70(iu30Var, (byte) 19);
                    x340Var2.s0(objT);
                }
                vzn1.c(svh0Var, (iu30) objT, apo.r(2065920997, new mb90(z72Var, kba0Var, iu30Var, (byte) 12), x340Var2), x340Var2, 392);
                return rih1.a;
            case 1:
                xca0 xca0Var = (xca0) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                pzw pzwVar = (pzw) this.b;
                svh0 svh0Var2 = (svh0) pzwVar.Y;
                boolean z2 = (((iIntValue2 & 896) ^ 384) > 256 && x340Var3.g(iu30Var2)) || (iIntValue2 & 384) == 256;
                x340 x340Var4 = x340Var3;
                Object objT2 = x340Var4.T();
                if (z2 || objT2 == fkj0.X) {
                    objT2 = new bv70(iu30Var2, (byte) 22);
                    x340Var4.s0(objT2);
                }
                vzn1.c(svh0Var2, (iu30) objT2, apo.r(-1945698788, new mb90(pzwVar, xca0Var, iu30Var2, (byte) 13), x340Var4), x340Var4, 392);
                return rih1.a;
            case 2:
                wda0 wda0Var = (wda0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                dea0 dea0Var = (dea0) this.b;
                svh0 svh0Var3 = (svh0) dea0Var.Y;
                boolean z3 = (((iIntValue3 & 896) ^ 384) > 256 && x340Var5.g(iu30Var3)) || (iIntValue3 & 384) == 256;
                x340 x340Var6 = x340Var5;
                Object objT3 = x340Var6.T();
                if (z3 || objT3 == fkj0.X) {
                    objT3 = new bv70(iu30Var3, b);
                    x340Var6.s0(objT3);
                }
                vzn1.c(svh0Var3, (iu30) objT3, apo.r(2131778046, new mb90(dea0Var, wda0Var, iu30Var3, (byte) 14), x340Var6), x340Var6, 392);
                return rih1.a;
            case 3:
                boolean z4 = true;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var7 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                pt ptVar = (pt) this.b;
                if (((Boolean) ((hrr0) ptVar.i).getValue()).booleanValue()) {
                    x340 x340Var8 = x340Var7;
                    x340Var8.i0(-949967355);
                    x340Var8.r(false);
                } else {
                    x340 x340Var9 = x340Var7;
                    x340Var9.i0(-950103817);
                    if ((((iIntValue4 & 896) ^ 384) <= 256 || !x340Var9.g(iu30Var4)) && (iIntValue4 & 384) != 256) {
                        z4 = false;
                    }
                    Object objT4 = x340Var9.T();
                    if (z4 || objT4 == fkj0.X) {
                        objT4 = new ux90(iu30Var4, b);
                        x340Var9.s0(objT4);
                    }
                    cgj1.i(0, (Function0) objT4, x340Var9, ((Boolean) ((hrr0) ptVar.h).getValue()).booleanValue());
                    x340Var9.r(false);
                }
                return rih1.a;
            case 4:
                cxc0 cxc0Var = (cxc0) obj2;
                x340 x340Var10 = (b0k) obj4;
                ((Number) obj5).intValue();
                Context context = (Context) ((ujo) this.b).e;
                int i2 = cxc0Var.b;
                long j = cxc0Var.a / 60;
                long j2 = j / 60;
                long j3 = j % 60;
                if (j2 > 0) {
                    string = context.getResources().getString(2131956990, Long.valueOf(j2), Long.valueOf(j3));
                    string.getClass();
                } else {
                    string = context.getResources().getString(2131956991, Long.valueOf(j3));
                    string.getClass();
                }
                String quantityString = context.getResources().getQuantityString(2131820720, i2, Integer.valueOf(i2), string);
                x340 x340Var11 = x340Var10;
                if (quantityString == null) {
                    x340Var11.i0(1180111530);
                    x340Var11.r(false);
                } else {
                    x340Var11.i0(1180111531);
                    uwr uwrVar = cbx.a;
                    uwo1.e(quantityString, anm1.N("KallaxHeaderMetadata", nim0.a), cbx.d(x340Var11).j, cbx.a(x340Var11).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var11, 0, 0, 2032);
                    x340Var11.r(false);
                }
                return rih1.a;
            case 5:
                x340 x340Var12 = (b0k) obj4;
                ((Number) obj5).intValue();
                l7e0 l7e0Var = ((hwq) obj2).g;
                j7e0 j7e0Var = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                zuc0 zuc0Var = j7e0Var != null ? j7e0Var.a : null;
                fra fraVar = een.N0;
                l1b l1bVar = (l1b) this.b;
                nim0 nim0Var = nim0.a;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var12, 0);
                x340 x340Var13 = x340Var12;
                int iHashCode = Long.hashCode(x340Var13.T);
                xos0 xos0VarM = x340Var13.m();
                qim0 qim0VarE = zr7.E(x340Var12, nim0Var);
                hzj.A.getClass();
                n4k n4kVar = hmb0.t1;
                x340 x340Var14 = x340Var12;
                if (x340Var14.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var14.m0();
                if (x340Var14.S) {
                    x340Var14.l(n4kVar);
                } else {
                    x340Var14.v0();
                }
                nko1.H(jw31VarA, x340Var12, y580.O0);
                nko1.H(xos0VarM, x340Var12, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var12, y580.R0);
                nko1.F(x340Var12);
                nko1.H(qim0VarE, x340Var12, y580.Y);
                uq8 uq8Var = l1bVar.b;
                if (zuc0Var == null || (fbp1Var = zuc0Var.n) == null) {
                    fbp1Var = swp0.c;
                }
                fbp1 fbp1Var2 = fbp1Var;
                if (zuc0Var == null) {
                    fg91VarA = fg91.b;
                } else if (zuc0Var.c()) {
                    fg91VarA = mqo1.s(new ell[]{ell.d});
                } else if (zuc0Var.k) {
                    fg91VarA = mqo1.s(new ell[]{ell.b});
                } else {
                    hll hllVarA = zuc0Var.q.a(hll.class);
                    list = hllVarA != null ? hllVarA.b : null;
                    if (list == null) {
                        list = z6x.a;
                    }
                    fg91VarA = mqo1.A(list);
                }
                uq8Var.D(false, 1, fbp1Var2, fg91VarA, (vu30) null, x340Var12, 24630);
                oox ooxVar = oox.c;
                isl islVar = isl.a;
                uwr uwrVar2 = cbx.a;
                long j4 = cbx.a(x340Var12).b.b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11);
                zov0 zov0Var = cbx.b(x340Var12).g;
                w0h1.a(ooxVar, islVar, anm1.N("kallax_badge", u291.r(qim0VarB, 12.0f)), j4, 0L, false, x340Var12, oox.d | 48, 48);
                x340Var14.r(true);
                return rih1.a;
            case 6:
                vra0 vra0Var = (vra0) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                if (vra0Var.b) {
                    x340 x340Var16 = x340Var15;
                    x340Var16.i0(663802333);
                    ven0 ven0VarH = rwq.h(((mta0) this.b).b.s, x340Var16, 0);
                    if (((mta0) this.b).d.y() || q1o1.k(((mta0) this.b).d)) {
                        x340Var16.i0(663980335);
                        mta0 mta0Var = (mta0) this.b;
                        yo2 yo2Var = mta0Var.b;
                        boolean zI = x340Var16.i(mta0Var) | ((((iIntValue5 & 896) ^ 384) > 256 && x340Var16.g(iu30Var5)) || (iIntValue5 & 384) == 256);
                        mta0 mta0Var2 = (mta0) this.b;
                        Object objT5 = x340Var16.T();
                        if (zI || objT5 == fkj0.X) {
                            objT5 = new ss90(mta0Var2, iu30Var5, list, b2);
                            x340Var16.s0(objT5);
                        }
                        qxd0.t(yo2Var, x340Var16, (vu30) objT5);
                        x340Var16.r(false);
                    } else {
                        x340Var16.i0(664133134);
                        x340Var16.r(false);
                    }
                    boolean z5 = ((jre) ven0VarH.getValue()) instanceof ire;
                    mta0 mta0Var3 = (mta0) this.b;
                    pe peVar = mta0Var3.t;
                    boolean zY = mta0Var3.d.y();
                    boolean zK = q1o1.k(((mta0) this.b).d);
                    ((mta0) this.b).b.n();
                    boolean zX = ((mta0) this.b).d.x();
                    Long l = ((mta0) this.b).b.N;
                    long jB = ((mta0) this.b).Z.b();
                    mta0 mta0Var4 = (mta0) this.b;
                    lrn1.j(vra0Var, peVar, iu30Var5, mta0Var4.e, mta0Var4.f, mta0Var4.g, mta0Var4.h, mta0Var4.Y, jB, z5, zY, zK, mta0Var4.X, zX, l, x340Var16, ((iIntValue5 >> 3) & 14) | (iIntValue5 & 896));
                    x340Var16.r(false);
                } else {
                    x340 x340Var17 = x340Var15;
                    x340Var17.i0(665264014);
                    x340Var17.r(false);
                }
                return rih1.a;
            case 7:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((v4b0) this.b).a), apo.r(-1282881329, new vx90((h7e) obj2, (iu30) obj3, b4), b0kVar), b0kVar, 56);
                return rih1.a;
            case 8:
                b0k b0kVar2 = (b0k) obj4;
                ((Number) obj5).intValue();
                kiv kivVar = oi7.a;
                nm1 nm1Var = (nm1) this.b;
                mod.b(kivVar.a((gw70) nm1Var.f), apo.r(927783591, new vx90((k9e) obj2, nm1Var, (byte) 8), b0kVar2), b0kVar2, 56);
                return rih1.a;
            case 9:
                b0k b0kVar3 = (b0k) obj4;
                ((Number) obj5).intValue();
                v1p1.b(48, 1, apo.r(8430686, new vx90((bab0) obj2, (cab0) this.b, (byte) 9), b0kVar3), b0kVar3, (qim0) null);
                return rih1.a;
            case 10:
                qab0 qab0Var = (qab0) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var18 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                boolean z6 = (((iIntValue6 & 896) ^ 384) > 256 && x340Var18.g(iu30Var6)) || (iIntValue6 & 384) == 256;
                x340 x340Var19 = x340Var18;
                Object objT6 = x340Var19.T();
                if (z6 || objT6 == fkj0.X) {
                    objT6 = new sya0(iu30Var6, (byte) 1);
                    x340Var19.s0(objT6);
                }
                x74.f((Function0) objT6, (scx) null, (mfx) null, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(-1790406941, new h6a0(qab0Var, (psy) this.b, b2), x340Var19), x340Var19, 0, 48, 2046);
                return rih1.a;
            case 11:
                bfb0 bfb0Var = (bfb0) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var20 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                ng20 ng20Var = (ng20) this.b;
                qim0 qim0VarN = anm1.N("larger_npb_setting_element_setting_row", nim0.a);
                String strO0 = cwl1.o0(x340Var20, 2131957176);
                boolean z7 = (((iIntValue7 & 896) ^ 384) > 256 && x340Var20.g(iu30Var7)) || (iIntValue7 & 384) == 256;
                x340 x340Var21 = x340Var20;
                Object objT7 = x340Var21.T();
                if (z7 || objT7 == fkj0.X) {
                    objT7 = new sya0(iu30Var7, (byte) 3);
                    x340Var21.s0(objT7);
                }
                Function0 function0 = (Function0) objT7;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                jto1.b(qim0VarN, (uvx) null, (max) null, false, (idn0) null, (ga80) null, new gbx(new y50(strO0), function0), (gbx) null, apo.r(1437538404, new dfb0(ng20Var, (byte) 0), x340Var21), (xu30) null, (xu30) null, apo.r(-670882270, new dfb0(ng20Var, (byte) 1), x340Var21), apo.r(-77393599, new h6a0(bfb0Var, iu30Var7, b5), x340Var21), (xu30) null, (xu30) null, apo.r(1703072414, new dfb0(ng20Var, (byte) 2), x340Var21), x340Var21, 100663296, 197040, 26302);
                return rih1.a;
            case 12:
                pib0 pib0Var = (pib0) obj2;
                b0k b0kVar4 = (b0k) obj4;
                ((Number) obj5).intValue();
                l3p1.n(cwl1.o0(b0kVar4, 2131957179), pib0Var.b, pib0Var.c, nim0.a, apo.r(286725634, new h6a0((qlb) this.b, pib0Var, b6), b0kVar4), b0kVar4, 27648);
                return rih1.a;
            case 13:
                xib0 xib0Var = (xib0) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var22 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                rib0 rib0Var = xib0Var.a.a;
                int i3 = (iIntValue8 & 896) ^ 384;
                boolean z8 = (i3 > 256 && x340Var22.g(iu30Var8)) || (iIntValue8 & 384) == 256;
                x340 x340Var23 = x340Var22;
                boolean zI2 = z8 | x340Var23.i(xib0Var);
                Object objT8 = x340Var23.T();
                if (zI2 || objT8 == m4cVar) {
                    objT8 = new ajb0(iu30Var8, xib0Var, (byte) 0);
                    x340Var23.s0(objT8);
                }
                Function0 function1 = (Function0) objT8;
                boolean zI3 = ((i3 > 256 && x340Var23.g(iu30Var8)) || (iIntValue8 & 384) == 256) | x340Var23.i(xib0Var);
                Object objT9 = x340Var23.T();
                if (zI3 || objT9 == m4cVar) {
                    objT9 = new ajb0(iu30Var8, xib0Var, (byte) 1);
                    x340Var23.s0(objT9);
                }
                mgo1.c(xib0Var, function1, (Function0) objT9, apo.r(1005320248, new vx90((bjb0) this.b, rib0Var, b3), x340Var23), x340Var23, ((iIntValue8 >> 3) & 14) | 3072);
                return rih1.a;
            case 14:
                g271 g271Var = (g271) obj2;
                x340 x340Var24 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                ldo ldoVar = (ldo) this.b;
                if ((iIntValue9 & 48) == 0) {
                    iIntValue9 |= (iIntValue9 & 64) == 0 ? x340Var24.g(g271Var) : x340Var24.i(g271Var) ? 32 : 16;
                }
                x340 x340Var25 = x340Var24;
                if (x340Var25.Y(iIntValue9 & 1, (iIntValue9 & 1041) != 1040)) {
                    mod.b(q271.a.a((d0r) ldoVar.d), apo.r(-1358473866, new xvb0(g271Var, ldoVar), x340Var25), x340Var25, 56);
                } else {
                    x340Var25.b0();
                }
                return rih1.a;
            case 15:
                b0k b0kVar5 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a((gw70) ((yxb0) this.b).e), apo.r(1581456034, new hwb0((fwb0) obj2, (iu30) obj3, (byte) 1), b0kVar5), b0kVar5, 56);
                return rih1.a;
            case 16:
                ksw kswVar = (ksw) obj;
                cxb0 cxb0Var = (cxb0) obj2;
                iu30 iu30Var9 = (iu30) obj3;
                x340 x340Var26 = (b0k) obj4;
                int iIntValue10 = ((Number) obj5).intValue();
                m4c m4cVar2 = fkj0.X;
                ji0 ji0Var = cxb0Var.a;
                kxb0 kxb0Var = (kxb0) this.b;
                if (bpo1.C(ji0Var, kxb0Var.f, kxb0Var.e)) {
                    x340 x340Var27 = x340Var26;
                    x340Var27.i0(-2110409900);
                    gq0 gq0Var = new gq0(ji0Var.a);
                    boolean zI4 = x340Var27.i(kxb0Var) | x340Var27.i(cxb0Var);
                    Object objT10 = x340Var27.T();
                    if (zI4 || objT10 == m4cVar2) {
                        objT10 = new jxb0(kxb0Var, cxb0Var, (byte) 1);
                        x340Var27.s0(objT10);
                    }
                    qxd0.C(gq0Var, (Function0) objT10, x340Var27);
                    boolean zI5 = x340Var27.i(kxb0Var);
                    Object objT11 = x340Var27.T();
                    if (zI5 || objT11 == m4cVar2) {
                        objT11 = new pdb0(kxb0Var, b5);
                        x340Var27.s0(objT11);
                    }
                    n9p1.e(kswVar, (iu30) objT11, x340Var27, iIntValue10 & 14);
                    x340Var27.r(false);
                } else {
                    x340 x340Var28 = x340Var26;
                    x340Var28.i0(-2109969762);
                    x340Var28.r(false);
                }
                mod.b(oi7.a.a(kxb0Var.c), apo.r(-995323708, new mb90(kxb0Var, cxb0Var, iu30Var9, (byte) 20), x340Var26), x340Var26, 56);
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                qxb0 qxb0Var = (qxb0) obj2;
                b0k b0kVar6 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (qxb0Var instanceof pxb0) {
                    pxb0 pxb0Var = (pxb0) qxb0Var;
                    otw.c((xpw) ((idd1) ((rwj) this.b).g).getValue(), new vxb0(pxb0Var.b, pxb0Var.a), (qim0) null, (ipb1) null, b0kVar6, 0, 12);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                ksw kswVar2 = (ksw) obj;
                eyb0 eyb0Var = (eyb0) obj2;
                iu30 iu30Var10 = (iu30) obj3;
                x340 x340Var29 = (b0k) obj4;
                int iIntValue11 = ((Number) obj5).intValue();
                m4c m4cVar3 = fkj0.X;
                yxb0 yxb0Var = (yxb0) this.b;
                if (((uxb0) yxb0Var.c).b == 1) {
                    x340 x340Var30 = x340Var29;
                    x340Var30.i0(-322900956);
                    boolean zI6 = x340Var30.i(eyb0Var) | ((((iIntValue11 & 896) ^ 384) > 256 && x340Var30.g(iu30Var10)) || (iIntValue11 & 384) == 256);
                    Object objT12 = x340Var30.T();
                    if (zI6 || objT12 == m4cVar3) {
                        objT12 = new x680(eyb0Var, iu30Var10, (byte) 24);
                        x340Var30.s0(objT12);
                    }
                    aym.f(kswVar2, 30, (Function0) objT12, x340Var30, (iIntValue11 & 14) | 48, 0);
                    x340Var30.r(false);
                } else {
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(-322606890);
                    x340Var31.r(false);
                }
                int iC = l1d.C(eyb0Var.h.a);
                if (iC == 0) {
                    i = 1;
                } else if (iC != 1) {
                    if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    i = 3;
                }
                x340 x340Var32 = x340Var29;
                boolean zI7 = x340Var32.i(yxb0Var) | x340Var32.e(l1d.C(i));
                Object objT13 = x340Var32.T();
                if (zI7 || objT13 == m4cVar3) {
                    objT13 = new gf6(yxb0Var, i, (byte) 5);
                    x340Var32.s0(objT13);
                }
                mod.b(oi7.a.a((gw70) yxb0Var.e), apo.r(1571997004, new cb60(yxb0Var, eyb0Var, (Function0) objT13, iu30Var10, (byte) 17), x340Var32), x340Var32, 56);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                e7c0 e7c0Var = (e7c0) obj2;
                iu30 iu30Var11 = (iu30) obj3;
                x340 x340Var33 = (b0k) obj4;
                int iIntValue12 = ((Number) obj5).intValue();
                b7c0 b7c0Var = e7c0Var.a;
                lax laxVar = e7c0Var.b;
                boolean zK2 = ((z0t) ((umf0) this.b).e).a.k();
                boolean z9 = (((iIntValue12 & 896) ^ 384) > 256 && x340Var33.g(iu30Var11)) || (iIntValue12 & 384) == 256;
                x340 x340Var34 = x340Var33;
                Object objT14 = x340Var34.T();
                if (z9 || objT14 == fkj0.X) {
                    objT14 = new jwa0(iu30Var11, (byte) 11);
                    x340Var34.s0(objT14);
                }
                qro1.h(b7c0Var, laxVar, zK2, (iu30) objT14, x340Var34, 0);
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                b0k b0kVar7 = (b0k) obj4;
                ((Number) obj5).intValue();
                mod.b(oi7.a.a(((zcc0) this.b).a), apo.r(688101732, new vx90((ucc0) obj2, (iu30) obj3, (byte) 18), b0kVar7), b0kVar7, 56);
                return rih1.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                nim0 nim0Var2 = nim0.a;
                iu30 iu30Var12 = (iu30) obj3;
                x340 x340Var35 = (b0k) obj4;
                int iIntValue13 = ((Number) obj5).intValue();
                if (((o9x) this.b).c.a.a()) {
                    x340 x340Var36 = x340Var35;
                    x340Var36.i0(2061170931);
                    String strO1 = cwl1.o0(x340Var36, 2131957328);
                    String strO2 = cwl1.o0(x340Var36, 2131957327);
                    String strO3 = cwl1.o0(x340Var36, 2131957326);
                    boolean z10 = (((iIntValue13 & 896) ^ 384) > 256 && x340Var36.g(iu30Var12)) || (iIntValue13 & 384) == 256;
                    Object objT15 = x340Var36.T();
                    if (z10 || objT15 == fkj0.X) {
                        objT15 = new sya0(iu30Var12, (byte) 17);
                        x340Var36.s0(objT15);
                    }
                    jap1.l(u291.d(uyn1.y(anm1.N("LikedSongsEmptyViewElement", nim0Var2), 32.0f, 16.0f), 1.0f), anm1.N("LikedSongsEmptyViewButton", nim0Var2), strO1, strO2, strO3, new gbx(z50.c, (Function0) objT15), new idx(), (vu30) null, x340Var36, 0, 384);
                    x340Var36.r(false);
                } else {
                    x340 x340Var37 = x340Var35;
                    x340Var37.i0(2061846328);
                    jap1.l(uyn1.y(u291.d(nim0Var2, 1.0f), 24.0f, 16.0f), (qim0) null, cwl1.o0(x340Var37, 2131957330), (String) null, (String) null, (gbx) null, (yf) null, (vu30) null, x340Var37, 0, 506);
                    x340Var37.r(false);
                }
                return rih1.a;
            case 22:
                return a(obj, obj2, obj3, obj4, obj5);
            case 23:
                ((et90) this.b).e((bfc0) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return d(obj, obj2, obj3, obj4, obj5);
            case 25:
                return e(obj, obj2, obj3, obj4, obj5);
            case 26:
                return f(obj, obj2, obj3, obj4, obj5);
            case 27:
                return g(obj, obj2, obj3, obj4, obj5);
            case 28:
                return h(obj, obj2, obj3, obj4, obj5);
            default:
                ccd0 ccd0Var = (ccd0) obj2;
                iu30 iu30Var13 = (iu30) obj3;
                x340 x340Var38 = (b0k) obj4;
                int iIntValue14 = ((Number) obj5).intValue();
                rih1 rih1Var = rih1.a;
                m4c m4cVar4 = fkj0.X;
                gcd0 gcd0Var = (gcd0) this.b;
                ven0 ven0VarG = rwq.g(gcd0Var.i, Boolean.FALSE, (o8n) null, x340Var38, 48, 2);
                acd0 acd0Var = ccd0Var.b;
                if (acd0Var instanceof xbd0) {
                    x340 x340Var39 = x340Var38;
                    x340Var39.i0(1224595564);
                    boolean zI8 = x340Var39.i(gcd0Var) | x340Var39.i(ccd0Var);
                    Object objT16 = x340Var39.T();
                    if (zI8 || objT16 == m4cVar4) {
                        objT16 = new e9c0(gcd0Var, ccd0Var, list, b6);
                        x340Var39.s0(objT16);
                    }
                    qxd0.t(rih1Var, x340Var39, (vu30) objT16);
                    x340Var39.r(false);
                } else if (acd0Var instanceof wbd0) {
                    x340 x340Var40 = x340Var38;
                    x340Var40.i0(1224599341);
                    boolean zI9 = x340Var40.i(gcd0Var);
                    Object objT17 = x340Var40.T();
                    if (zI9 || objT17 == m4cVar4) {
                        objT17 = new iyb0(gcd0Var, (lnm) null, (byte) 3);
                        x340Var40.s0(objT17);
                    }
                    qxd0.t(rih1Var, x340Var40, (vu30) objT17);
                    x340Var40.r(false);
                } else {
                    if (!(acd0Var instanceof ybd0) && !(acd0Var instanceof zbd0)) {
                        throw p3d1.k(x340Var38, 1224593797, false);
                    }
                    x340 x340Var41 = x340Var38;
                    x340Var41.i0(1224602967);
                    x340Var41.r(false);
                }
                x340 x340Var42 = x340Var38;
                boolean zI10 = x340Var42.i(gcd0Var);
                Object objT18 = x340Var42.T();
                if (zI10 || objT18 == m4cVar4) {
                    objT18 = new l6d0(gcd0Var, b4);
                    x340Var42.s0(objT18);
                }
                qxd0.i(rih1Var, (iu30) objT18, x340Var42);
                ud1 ud1Var = gcd0Var.b;
                ng20 ng20Var2 = gcd0Var.c;
                zo10 zo10Var = gcd0Var.d;
                zo10 zo10Var2 = gcd0Var.e;
                zo10 zo10Var3 = gcd0Var.f;
                boolean zBooleanValue = ((Boolean) ven0VarG.getValue()).booleanValue();
                boolean zI11 = x340Var42.i(gcd0Var) | ((((iIntValue14 & 896) ^ 384) > 256 && x340Var42.g(iu30Var13)) || (iIntValue14 & 384) == 256);
                Object objT19 = x340Var42.T();
                if (zI11 || objT19 == m4cVar4) {
                    objT19 = new bsc0(gcd0Var, iu30Var13, b6);
                    x340Var42.s0(objT19);
                }
                zzo1.e(ccd0Var, ud1Var, ng20Var2, zo10Var, zo10Var2, zo10Var3, zBooleanValue, (Function0) objT19, (qim0) null, x340Var42, (iIntValue14 >> 3) & 14);
                return rih1Var;
        }
    }
}
