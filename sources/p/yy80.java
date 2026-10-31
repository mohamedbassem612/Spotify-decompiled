package p;

import android.os.Bundle;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.spotify.leavebehindads.events.proto.LeavebehindAdEvent;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yy80 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yy80(Object obj, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) throws Throwable {
        Object obj4;
        Object f530Var;
        c9n c9nVar;
        Throwable th;
        boolean z;
        Object obj5;
        Object obj6;
        ou80 ou80Var;
        Object obj7;
        Object obj8;
        pd51 pd51Var;
        List list;
        Object next;
        String str;
        int i = 3;
        boolean z2 = false;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                x340 x340Var = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarA = ((nw31) obj).a(1.0f, nim0.a, true);
                orm0 orm0Var = (orm0) this.b;
                gfh0 gfh0VarC = t1c.c(een.d, false);
                x340 x340Var2 = x340Var;
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
                hzj.A.getClass();
                n4k n4kVar = hmb0.t1;
                x340 x340Var3 = x340Var;
                if (x340Var3.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var3.m0();
                if (x340Var3.S) {
                    x340Var3.l(n4kVar);
                } else {
                    x340Var3.v0();
                }
                nko1.H(gfh0VarC, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                rih1 rih1Var = rih1.a;
                otw.c(orm0Var, rih1Var, (qim0) null, (ipb1) null, x340Var, 48, 12);
                x340Var3.r(true);
                return rih1Var;
            case 1:
                oc91 oc91Var = (oc91) obj;
                x340 x340Var4 = (b0k) obj2;
                ((Number) obj3).intValue();
                rih1 rih1Var2 = rih1.a;
                m4c m4cVar = fkj0.X;
                b890 b890Var = (b890) this.b;
                x72 x72Var = b890Var.n;
                lnm lnmVar = null;
                if (oc91Var == null) {
                    x340 x340Var5 = x340Var4;
                    x340Var5.i0(130084340);
                    boolean zI = x340Var5.i(b890Var);
                    Object objT = x340Var5.T();
                    if (zI || objT == m4cVar) {
                        obj5 = objT;
                        v790 v790Var = new v790(b890Var, lnmVar, z2 ? (byte) 1 : (byte) 0);
                        x340Var5.s0(v790Var);
                        obj5 = v790Var;
                    }
                    qxd0.t(rih1Var2, x340Var5, (vu30) obj5);
                    x340Var5.r(false);
                } else {
                    x340 x340Var6 = x340Var4;
                    x340Var6.i0(130186206);
                    j06 j06Var = x340Var6.a;
                    x340Var6.r(false);
                    ji0 ji0Var = (ji0) o7h.q0(oc91Var.b);
                    String str2 = oc91Var.a;
                    boolean zI2 = x340Var6.i(b890Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == m4cVar) {
                        obj4 = objT2;
                        v790 v790Var2 = new v790(b890Var, lnmVar, z3 ? 1 : 0);
                        x340Var6.s0(v790Var2);
                        obj4 = v790Var2;
                    }
                    qxd0.t(rih1Var2, x340Var6, (vu30) obj4);
                    Object objT3 = x340Var6.T();
                    Object obj9 = objT3;
                    if (objT3 == m4cVar) {
                        hrr0 hrr0VarQ = v8r.q(Boolean.FALSE);
                        x340Var6.s0(hrr0VarQ);
                        obj9 = hrr0VarQ;
                    }
                    ven0 ven0Var = (ven0) obj9;
                    Object objT4 = x340Var6.T();
                    Object obj10 = objT4;
                    if (objT4 == m4cVar) {
                        uoa uoaVarA = woa.a(b890Var.l, "interrupting-video-ad", (o2u0) null, (w2k1) null, (kma) null, Collections.singletonList(b890Var.e), false, (bas) null, (sn10) null, 1006);
                        x340Var6.s0(uoaVarA);
                        obj10 = uoaVarA;
                    }
                    uoa uoaVar = (uoa) obj10;
                    Object objT5 = x340Var6.T();
                    Object obj11 = objT5;
                    if (objT5 == m4cVar) {
                        c9n c9nVarM = qxd0.M(o6x.a, x340Var6);
                        x340Var6.s0(c9nVarM);
                        obj11 = c9nVarM;
                    }
                    c9n c9nVar2 = (c9n) obj11;
                    boolean zI3 = x340Var6.i(b890Var) | x340Var6.i(ven0Var) | x340Var6.g(str2);
                    Object objT6 = x340Var6.T();
                    if (zI3 || objT6 == m4cVar) {
                        c9nVar = c9nVar2;
                        th = null;
                        f530Var = new f530(b890Var, str2, ven0Var, (lnm) null, (byte) 25);
                        x340Var6.s0(f530Var);
                    } else {
                        c9nVar = c9nVar2;
                        f530Var = objT6;
                        th = null;
                    }
                    qxd0.t(rih1Var2, x340Var6, (vu30) f530Var);
                    Object objT7 = x340Var6.T();
                    Object obj12 = objT7;
                    if (objT7 == m4cVar) {
                        iz0 iz0VarA = b890Var.f.a(new ry0(new py0(ji0Var, x72Var, b890Var.o)));
                        x340Var6.s0(iz0VarA);
                        obj12 = iz0VarA;
                    }
                    xpw xpwVar = (xpw) obj12;
                    Object objT8 = x340Var6.T();
                    Object obj13 = objT8;
                    if (objT8 == m4cVar) {
                        ldo ldoVarA = b890Var.g.a(new ado(new yco(ji0Var, x72Var), b890Var.f1p));
                        x340Var6.s0(ldoVarA);
                        obj13 = ldoVarA;
                    }
                    xpw xpwVar2 = (xpw) obj13;
                    Object objT9 = x340Var6.T();
                    Object obj14 = objT9;
                    if (objT9 == m4cVar) {
                        o2u0 o2u0VarB = b890Var.d.b(ji0Var, ji0Var.g.b);
                        x340Var6.s0(o2u0VarB);
                        obj14 = o2u0VarB;
                    }
                    o2u0 o2u0Var = (o2u0) obj14;
                    nim0 nim0Var = nim0.a;
                    gfh0 gfh0VarC2 = t1c.c(een.d, false);
                    Throwable th2 = th;
                    int iHashCode2 = Long.hashCode(x340Var6.T);
                    xos0 xos0VarM2 = x340Var6.m();
                    qim0 qim0VarE2 = zr7.E(x340Var6, nim0Var);
                    hzj.A.getClass();
                    n4k n4kVar2 = hmb0.t1;
                    if (j06Var == null) {
                        tgp1.p();
                        throw th2;
                    }
                    x340Var6.m0();
                    if (x340Var6.S) {
                        x340Var6.l(n4kVar2);
                    } else {
                        x340Var6.v0();
                    }
                    llj lljVar = y580.O0;
                    nko1.H(gfh0VarC2, x340Var6, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM2, x340Var6, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var6, lljVar3);
                    nko1.F(x340Var6);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE2, x340Var6, lljVar4);
                    op0 op0Var = b890Var.h;
                    Object objT10 = x340Var6.T();
                    Object obj15 = objT10;
                    if (objT10 == m4cVar) {
                        lx70 lx70Var = lx70.Z;
                        x340Var6.s0(lx70Var);
                        obj15 = lx70Var;
                    }
                    Function0 function0 = (Function0) obj15;
                    boolean zI4 = x340Var6.i(c9nVar) | x340Var6.i(b890Var) | x340Var6.i(ji0Var);
                    Object objT11 = x340Var6.T();
                    Object obj16 = objT11;
                    if (zI4 || objT11 == m4cVar) {
                        xvy xvyVar = new xvy(c9nVar, b890Var, ji0Var, (byte) 27);
                        x340Var6.s0(xvyVar);
                        obj16 = xvyVar;
                    }
                    e9k.h(uoaVar, o2u0Var, ji0Var, op0Var, xpwVar, xpwVar2, function0, (Function0) obj16, null, x340Var6, 1572864);
                    if (((Boolean) ven0Var.getValue()).booleanValue()) {
                        x340Var6.i0(-2068737059);
                        qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                        uwr uwrVar = cbx.a;
                        qim0 qim0VarF = dug.f(qim0VarD, u7h.b(cbx.a(x340Var6).a.c, 0.7f, 0.0f, 0.0f, 0.0f, 14), d4o1.a);
                        gfh0 gfh0VarC3 = t1c.c(een.h, false);
                        int iHashCode3 = Long.hashCode(x340Var6.T);
                        xos0 xos0VarM3 = x340Var6.m();
                        qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarF);
                        x340Var6.m0();
                        if (x340Var6.S) {
                            x340Var6.l(n4kVar2);
                        } else {
                            x340Var6.v0();
                        }
                        nko1.H(gfh0VarC3, x340Var6, lljVar);
                        nko1.H(xos0VarM3, x340Var6, lljVar2);
                        x0d.q(iHashCode3, x340Var6, lljVar3, x340Var6);
                        nko1.H(qim0VarE3, x340Var6, lljVar4);
                        xto1.e((qim0) null, 0, 0L, 0L, x340Var6, 0, 15);
                        z = true;
                        x340Var6.r(true);
                        x340Var6.r(false);
                    } else {
                        z = true;
                        x340Var6.i0(-2068453564);
                        x340Var6.r(false);
                    }
                    x340Var6.r(z);
                }
                return rih1Var2;
            case 2:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                x340 x340Var7 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var7.h(zBooleanValue) ? 4 : 2;
                }
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    ((ia90) this.b).d.b(70, apo.r(381255641, new k750((byte) 1, zBooleanValue), x340Var8), x340Var8);
                } else {
                    x340Var8.b0();
                }
                return rih1.a;
            case 3:
                zd90 zd90Var = (zd90) obj;
                ((Number) obj3).intValue();
                ae90 ae90Var = (ae90) this.b;
                x340 x340Var9 = (b0k) obj2;
                boolean zI5 = x340Var9.i(ae90Var) | x340Var9.i(zd90Var);
                Object objT12 = x340Var9.T();
                if (zI5 || objT12 == fkj0.X) {
                    obj6 = objT12;
                    vq80 vq80Var = new vq80(ae90Var, zd90Var, (byte) 6);
                    x340Var9.s0(vq80Var);
                    obj6 = vq80Var;
                }
                obj6 = objT12;
                d1u.u(0, x340Var9, (iu30) obj6, (qim0) null);
                return rih1.a;
            case 4:
                ((rk90) this.b).c.invoke((yyq) obj, (b0k) obj2, Integer.valueOf(((Number) obj3).intValue() & 14));
                return rih1.a;
            case 5:
                ((Function0) ((bs0) this.b).e).invoke();
                return rih1.a;
            case 6:
                qj0 qj0Var = (qj0) this.b;
                svh0 svh0Var = (svh0) qj0Var.e;
                int iOrdinal = ((wp90) obj2).ordinal();
                if (iOrdinal == 0) {
                    svh0Var.i();
                } else if (iOrdinal == 1) {
                    ((up90) qj0Var.d).a(hr90.O0, true);
                    svh0Var.i();
                } else if (iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                return rih1.a;
            case 7:
                x340 x340Var10 = (b0k) obj2;
                ((Number) obj3).intValue();
                if (((tu8) this.b) instanceof su8) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(207720628);
                    qxd0.b(x340Var11, 0);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(207721835);
                    qxd0.e(x340Var12, 0);
                    x340Var12.r(false);
                }
                return rih1.a;
            case 8:
                tqw tqwVar = (tqw) obj3;
                if (((mu90) obj2).equals(mu90.a)) {
                    ((ser) ((ng20) this.b).b).a((tqwVar == null || (ou80Var = n3o1.y(tqwVar).a) == null) ? null : ou80Var.a, nik1.F5.a, null);
                    return rih1.a;
                }
                eg.o();
                return null;
            case 9:
                x340 x340Var13 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                rx90 rx90Var = (rx90) this.b;
                int iIntValue3 = ((Number) rx90Var.k.getValue()).intValue();
                String str3 = rx90Var.e.a;
                y5a0 y5a0Var = rx90Var.g;
                ven0 ven0VarL = ggo1.L((BottomSheetBehavior) obj, iIntValue3, x340Var13, iIntValue2 & 14);
                i6o0 i6o0VarQ = k1o1.q(x340Var13);
                rx90Var.d(x340Var13, 0);
                rx90Var.c(x340Var13, 0);
                if (((no4) rx90Var.h.a.get()).v()) {
                    x340 x340Var14 = x340Var13;
                    x340Var14.i0(1285751492);
                    boolean zG = x340Var14.g(i6o0VarQ);
                    Object objT13 = x340Var14.T();
                    if (zG || objT13 == m4cVar2) {
                        obj8 = objT13;
                        rw90 rw90Var = new rw90(rx90Var.c, ven0VarL, i6o0VarQ, y5a0Var);
                        x340Var14.s0(rw90Var);
                        obj8 = rw90Var;
                    }
                    otw.c((rw90) obj8, new hw90(str3), (qim0) null, (ipb1) null, x340Var14, 0, 12);
                    x340Var14.r(false);
                } else {
                    x340 x340Var15 = x340Var13;
                    x340Var15.i0(1286148819);
                    boolean zG2 = x340Var15.g(i6o0VarQ);
                    Object objT14 = x340Var15.T();
                    if (zG2 || objT14 == m4cVar2) {
                        obj7 = objT14;
                        nx90 nx90Var = new nx90(rx90Var.b, ven0VarL, i6o0VarQ, y5a0Var);
                        x340Var15.s0(nx90Var);
                        obj7 = nx90Var;
                    }
                    otw.c((nx90) obj7, new ex90(str3), (qim0) null, (ipb1) null, x340Var15, 0, 12);
                    x340Var15.r(false);
                }
                return rih1.a;
            case 10:
                tqw tqwVar2 = (tqw) obj3;
                String str4 = ((py90) obj).b.g;
                if (!((oy90) obj2).equals(oy90.a)) {
                    eg.o();
                    return null;
                }
                tv80 tv80VarY = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                lzn0 lzn0Var = (lzn0) ((ldo) this.b).c;
                if (tv80VarY != null) {
                    lzn0Var.a(str4, tv80VarY, (Bundle) null);
                } else {
                    lzn0Var.h(str4);
                }
                return rih1.a;
            case 11:
                fae1.c((ym90) obj, ((bfa0) this.b).a, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1.a;
            case 12:
                tqw tqwVar3 = (tqw) obj3;
                if (!((ana0) obj2).equals(ana0.a)) {
                    eg.o();
                    return null;
                }
                if (tqwVar3 != null) {
                    tv80 tv80VarY2 = n3o1.y(tqwVar3);
                    ((na9) this.b).b.a("spotify:internal:kallax:track-select?reason=playlist_entry_point&flowId=" + UUID.randomUUID(), tv80VarY2, (Bundle) null);
                }
                return rih1.a;
            case 13:
                tqw tqwVar4 = (tqw) obj3;
                ((wta0) this.b).b.invoke(((vta0) obj).a, tqwVar4 != null ? n3o1.y(tqwVar4) : null);
                return rih1.a;
            case 14:
                String str5 = (String) obj;
                x340 x340Var16 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if ((iIntValue4 & 6) == 0) {
                    iIntValue4 |= x340Var16.g(str5) ? 4 : 2;
                }
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue4 & 1, (iIntValue4 & 19) != 18)) {
                    ((qxa0) this.b).a.w(str5, uzy.b, Boolean.FALSE, (tv80) null);
                } else {
                    x340Var17.b0();
                }
                return rih1.a;
            case 15:
                km61 km61Var = (km61) obj;
                if (!((Boolean) obj2).booleanValue()) {
                    oza0 oza0Var = (oza0) this.b;
                    if (oza0Var.a.b() && oza0Var.e) {
                        dma1 dma1VarA = ((oza0) this.b).d.a(km61Var.a.a);
                        bma1 bma1Var = oza0.g;
                        if (!dma1VarA.h(bma1Var, false)) {
                            hma1 hma1VarEdit = dma1VarA.edit();
                            hma1VarEdit.a(bma1Var, true);
                            hma1VarEdit.g();
                            km61.a(km61Var, "managedAccountsPrompt", (Bundle) null, false, 6);
                        }
                    }
                }
                return Boolean.TRUE;
            case 16:
                dm20 dm20Var = (dm20) obj;
                q4r q4rVar = (q4r) obj2;
                xb51 xb51Var = (xb51) obj3;
                x751 x751Var = (x751) ((y751) ((o860) this.b).e).b.a.getValue();
                if (u890.j(x751Var != null ? new xb51(x751Var.b) : null, xb51Var) && x751Var != null && (x751Var.c || x751Var.d != null)) {
                    jw41 jw41Var = x751Var.a;
                    jw41 jw41Var2 = jw41Var instanceof jw41 ? jw41Var : null;
                    if (jw41Var2 == null || (list = jw41Var2.a) == null) {
                        pd51Var = null;
                    } else {
                        o860 o860Var = (o860) this.b;
                        Iterator it = list.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                next = it.next();
                                pd51 pd51Var2 = (pd51) next;
                                if (!(pd51Var2 instanceof jl20) || !o860Var.m((jl20) pd51Var2).equals(dm20Var)) {
                                }
                            } else {
                                next = null;
                            }
                        }
                        pd51Var = (pd51) next;
                    }
                    if (pd51Var != null) {
                        y751 y751Var = (y751) ((o860) this.b).e;
                        List listM = q4rVar != null ? p7h.M(new ez00[]{q4rVar.a, q4rVar.b, q4rVar.c, q4rVar.d, q4rVar.e, q4rVar.f, q4rVar.g, q4rVar.m}) : null;
                        synchronized (y751Var) {
                            try {
                                if (y751Var.c(pd51Var)) {
                                    bpb1 bpb1Var = y751Var.c;
                                    bpb1Var.m((Object) null, listM == null ? sqg0.K(pd51Var, (Map) bpb1Var.getValue()) : sqg0.P((Map) bpb1Var.getValue(), new mmr0(pd51Var, listM)));
                                }
                            } catch (Throwable th3) {
                                throw th3;
                            }
                        }
                    }
                    break;
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarN = anm1.N("labeled.switch.title", nim0.a);
                String str6 = ((dab0) this.b).a;
                uwr uwrVar2 = cbx.a;
                uwo1.e(str6, qim0VarN, cbx.d(b0kVar).g, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, b0kVar, 0, 0, 1720);
                return rih1.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                lab0 lab0Var = (lab0) obj;
                tqw tqwVar5 = (tqw) obj3;
                if (((kab0) obj2).equals(kab0.a)) {
                    ((zh1) this.b).b.d("spotify:page-match:landing:".concat(lab0Var.a), tqwVar5 != null ? n3o1.y(tqwVar5) : null, (Bundle) null);
                    return rih1.a;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                x340 x340Var18 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    fq7.g(((nbb0) this.b).c, (qim0) null, xay.e(3, (ni20) null), xay.f(3, (ni20) null), (String) null, uui.a, x340Var19, 200064, 18);
                } else {
                    x340Var19.b0();
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                Boolean bool = (Boolean) obj2;
                boolean zBooleanValue2 = bool.booleanValue();
                ffb0 ffb0Var = (ffb0) ((x390) this.b).b;
                hma1 hma1VarEdit2 = ffb0Var.a.edit();
                hma1VarEdit2.a(gfb0.b(), zBooleanValue2);
                hma1VarEdit2.h();
                ffb0Var.c.l((Object) null);
                return new it61(bool);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                jo70 jo70Var = ((xib0) this.b).b;
                String str7 = jo70Var != null ? jo70Var.a : null;
                if (str7 == null) {
                    str7 = "";
                }
                uwo1.e(str7, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, b0kVar2, 0, 0, 1726);
                return rih1.a;
            case 22:
                ((Number) obj2).intValue();
                sw9 sw9Var = ((tvb0) this.b).b;
                return new bg50(blo1.c(((dpy) sw9Var.c).a((mhy) obj3).a != nyy.CARD ? sw9Var.b : 1));
            case 23:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                dwb0 dwb0Var = (dwb0) this.b;
                String str8 = dwb0Var.c;
                if (str8 == null || ihc1.y0(str8)) {
                    x340 x340Var21 = x340Var20;
                    x340Var21.i0(181241996);
                    x340Var21.r(false);
                } else {
                    x340 x340Var22 = x340Var20;
                    x340Var22.i0(181211244);
                    too1.g(dwb0Var, (qim0) null, x340Var22, 0);
                    x340Var22.r(false);
                }
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                bwd1 bwd1Var = (bwd1) obj;
                int iIntValue6 = ((Number) obj3).intValue();
                twb0 twb0Var = ((uwb0) this.b).b;
                x340 x340Var23 = (b0k) obj2;
                boolean zI6 = x340Var23.i(twb0Var);
                Object objT15 = x340Var23.T();
                if (zI6 || objT15 == fkj0.X) {
                    ft30 ft30Var = new ft30(1, twb0Var, twb0.class, "navigateToSupportSite", "navigateToSupportSite(Ljava/lang/String;)V", 0, (byte) 27);
                    x340Var23.s0(ft30Var);
                    objT15 = ft30Var;
                }
                yoo1.i(bwd1Var, (iu30) objT15, (qim0) null, x340Var23, iIntValue6 & 14);
                return rih1.a;
            case 25:
                cxb0 cxb0Var = (cxb0) obj;
                hxb0 hxb0Var = (hxb0) obj2;
                ji0 ji0Var2 = cxb0Var.a;
                if (ji0Var2.b()) {
                    if (hxb0Var.equals(dxb0.a)) {
                        str = "card_clicked";
                    } else {
                        if (!hxb0Var.equals(gxb0.a)) {
                            eg.o();
                            return null;
                        }
                        str = "button_clicked";
                    }
                    kxb0 kxb0Var = (kxb0) this.b;
                    byp bypVar = kxb0Var.g;
                    int i2 = cxb0Var.b;
                    int iC = l1d.C(kxb0Var.b);
                    if (iC == 0) {
                        i = 1;
                    } else if (iC == 1) {
                        i = 2;
                    } else if (iC != 2) {
                        eg.o();
                        return null;
                    }
                    String str9 = cxb0Var.d;
                    ryb0 ryb0VarN = LeavebehindAdEvent.n();
                    String str10 = ji0Var2.h;
                    ryb0VarN.r(str10);
                    ryb0VarN.s(ji0Var2.t);
                    ryb0VarN.n("event_clicked");
                    ryb0VarN.q(str);
                    ryb0VarN.t(kaa0.e(i));
                    ryb0VarN.u(i2 + 1);
                    ryb0VarN.v(str9);
                    ((t2j0) bypVar.b).a(ryb0VarN.build());
                    ko0 ko0Var = (ko0) bypVar.c;
                    boolean zY = bpo1.y(ji0Var2, (jjh1) bypVar.a);
                    String str11 = ji0Var2.e;
                    if (zY) {
                        List list2 = (List) ji0Var2.Q0.get("clicked");
                        if (list2 != null) {
                            Iterator it2 = list2.iterator();
                            while (it2.hasNext()) {
                                ko0Var.a((String) it2.next(), str10);
                            }
                        }
                        Set set = s4b1.f;
                        if (uic.u(str11)) {
                            ((lzn0) bypVar.d).h(str11);
                        } else {
                            ko0Var.b((dg30) bypVar.e, ji0Var2);
                        }
                    } else {
                        pxc.a((pxc) bypVar.f, ji0Var2, (Long) null, (String) null, (String) null, 30);
                    }
                }
                return rih1.a;
            case 26:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwo1.e(cwl1.o0(b0kVar3, ((ap0) this.b).a), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar3, 0, 0, 2046);
                return rih1.a;
            case 27:
                cir0 cir0Var = (cir0) obj2;
                d751 d751Var = (d751) obj3;
                kop kopVar = (kop) ((o1c0) this.b).b.a.c;
                enp enpVar = (enp) kopVar.f1.get();
                ypa ypaVar = new ypa((byte) 24, false);
                jly0 jly0Var = kopVar.g1;
                q7r0 q7r0Var = kopVar.c;
                cop copVar = (cop) jly0Var.get();
                w651 w651Var = (w651) kopVar.i1.get();
                y651 y651Var = kopVar.b;
                String str12 = y651Var.c;
                if (str12 == null) {
                    str12 = "";
                }
                gyh gyhVar = y651Var.f;
                dop dopVar = (dop) kopVar.j1.get();
                eop eopVar = (eop) kopVar.k1.get();
                fop fopVar = (fop) kopVar.m1.get();
                tl7 tl7VarB = cwl1.B(q7r0Var);
                c8o.m(tl7VarB);
                di4 di4VarD = kopVar.d();
                i8h1 i8h1VarZ = u1n0.z(q7r0Var);
                l6h1 l6h1Var = (l6h1) q7r0Var.b(l6h1.class);
                c8o.m(l6h1Var);
                return new khr0(enpVar, ypaVar, copVar, w651Var, str12, gyhVar, dopVar, eopVar, fopVar, tl7VarB, di4VarD, i8h1VarZ, l6h1Var, cwl1.G(q7r0Var), cir0Var, d751Var);
            case 28:
                tqw tqwVar6 = (tqw) obj3;
                if (bdc0.a[((adc0) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar6 != null) {
                    tv80 tv80VarY3 = n3o1.y(tqwVar6);
                    o9x o9xVar = (o9x) this.b;
                    o9xVar.d.a(o9xVar.b, tv80VarY3);
                }
                return rih1.a;
            default:
                h2d0 h2d0Var = (h2d0) obj;
                tqw tqwVar7 = (tqw) obj3;
                if (tqwVar7 != null) {
                    ((na9) this.b).b.a(h2d0Var.c, n3o1.y(tqwVar7), (Bundle) null);
                }
                return rih1.a;
        }
    }
}
