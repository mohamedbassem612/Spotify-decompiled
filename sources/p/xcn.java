package p;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import com.spotify.concertcampaignview.v1.CtaType;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xcn {
    public final gw70 a;
    public final oql b;
    public final lko c;
    public final agc0 d;

    public xcn(gw70 gw70Var, oql oqlVar, lko lkoVar, agc0 agc0Var) {
        this.a = gw70Var;
        this.b = oqlVar;
        this.c = lkoVar;
        this.d = agc0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v15, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v6 */
    /* JADX WARN: Type inference failed for: r15v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v8 */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v27 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v19 */
    public final void a(adn adnVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        qim0 qim0Var2;
        Object obj;
        String str;
        Object objB;
        boolean z;
        qim0 qim0VarB;
        int i2;
        ?? r7;
        byte b;
        int i3;
        b0k b0kVar2;
        ?? r15;
        boolean z2;
        Object obj2;
        Object obj3;
        m4c m4cVar = fkj0.X;
        String str2 = adnVar.b;
        yy30 yy30Var = adnVar.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(395523788);
        j06 j06Var = ((x340) b0kVar3).a;
        int i4 = i | (b0kVar3.g(adnVar) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | 384 | (b0kVar3.i(this) ? 2048 : 1024);
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(iu30Var, b0kVar3);
            ven0 ven0VarS2 = v8r.s(yy30Var, b0kVar3);
            wat watVar = (wat) b0kVar3.k(t4k.h);
            b0kVar3.i0(2141248391);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            float fX0 = watVar.X0(12.0f);
            b0kVar3.r(false);
            long j = cbx.a(b0kVar3).a.c;
            tob1 tob1VarA = w191.a(z4p1.e(adnVar.X), irn1.o0(CtaType.CTA_SHARE_FIELD_NUMBER, 0, null, 6), "bgColor", b0kVar3, 384, 8);
            boolean zI = b0kVar3.i(ven0VarS);
            Object objT = b0kVar3.T();
            if (zI || objT == m4cVar) {
                obj = objT;
                hnf hnfVar = new hnf(ven0VarS, (byte) 16);
                b0kVar3.s0(hnfVar);
                obj = hnfVar;
            }
            q3p1.b(0, 1, (Function0) obj, b0kVar3, false);
            Object objT2 = b0kVar3.T();
            Object objH = objT2;
            if (objT2 == m4cVar) {
                objH = kaa0.h(0L, b0kVar3);
            }
            ven0 ven0Var = (ven0) objH;
            zhd zhdVar = adnVar.g;
            if (zhdVar == null || (str = zhdVar.b) == null) {
                str = adnVar.Y;
            }
            Object objT3 = b0kVar3.T();
            Object obj4 = objT3;
            if (objT3 == m4cVar) {
                bpb1 bpb1VarB = gio1.b(w7x.a);
                b0kVar3.s0(bpb1VarB);
                obj4 = bpb1VarB;
            }
            mr20 mr20Var = (wen0) obj4;
            boolean zG = b0kVar3.g(str2);
            lko lkoVar = this.c;
            boolean zG2 = b0kVar3.g(this.d) | zG | b0kVar3.g(lkoVar);
            Object objT4 = b0kVar3.T();
            if (zG2 || objT4 == m4cVar) {
                objB = lkoVar.b("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ", mr20Var, new vdm(str2, (lnm) null, (byte) 2));
                b0kVar3.s0(objB);
            } else {
                objB = objT4;
            }
            mko mkoVar = (mko) objB;
            Object objT5 = b0kVar3.T();
            Object obj5 = objT5;
            if (objT5 == m4cVar) {
                xho xhoVar = new xho(mkoVar.b());
                b0kVar3.s0(xhoVar);
                obj5 = xhoVar;
            }
            xho xhoVar2 = (xho) obj5;
            boolean zI2 = b0kVar3.i(mkoVar);
            Object objT6 = b0kVar3.T();
            Object obj6 = objT6;
            if (zI2 || objT6 == m4cVar) {
                vcn vcnVar = new vcn(mkoVar, (byte) 0);
                b0kVar3.s0(vcnVar);
                obj6 = vcnVar;
            }
            qxd0.i(mkoVar, (iu30) obj6, b0kVar3);
            boolean zI3 = b0kVar3.i(mr20Var) | b0kVar3.g(str);
            Object objT7 = b0kVar3.T();
            Object obj7 = objT7;
            if (zI3 || objT7 == m4cVar) {
                kjk kjkVar = new kjk(mr20Var, str, (byte) 23);
                b0kVar3.s0(kjkVar);
                obj7 = kjkVar;
            }
            qxd0.h(str, mkoVar, (iu30) obj7, b0kVar3);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            boolean zF = b0kVar3.f(j) | b0kVar3.i(tob1VarA);
            Object objT8 = b0kVar3.T();
            Object obj8 = objT8;
            if (zF || objT8 == m4cVar) {
                kuj kujVar = new kuj(j, tob1VarA, (byte) 1);
                b0kVar3.s0(kujVar);
                obj8 = kujVar;
            }
            qim0 qim0VarQ = exd0.q(qim0VarD, (iu30) obj8);
            yy30 yy30Var2 = (yy30) ven0VarS2.getValue();
            yy30 yy30Var3 = yy30.b;
            rih1 rih1Var = rih1.a;
            if (yy30Var2 == yy30Var3) {
                b0kVar3.i0(1956048885);
                boolean zI4 = b0kVar3.i(ven0Var) | b0kVar3.d(fX0) | b0kVar3.i(ven0VarS);
                Object objT9 = b0kVar3.T();
                if (zI4 || objT9 == m4cVar) {
                    oxl oxlVar = new oxl(ven0Var, fX0, ven0VarS, (byte) 1);
                    b0kVar3.s0(oxlVar);
                    obj3 = oxlVar;
                } else {
                    obj3 = objT9;
                }
                qim0VarB = f8d1.b(qim0Var3, rih1Var, (PointerInputEventHandler) obj3);
                z = false;
                b0kVar3.r(false);
            } else {
                z = false;
                b0kVar3.i0(1957164048);
                b0kVar3.r(false);
                qim0VarB = qim0Var3;
            }
            qim0 qim0VarThen = qim0VarQ.then(qim0VarB);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, z);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarThen);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z3 = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar3);
            nko1.F(b0kVar3);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar4);
            int i5 = i4 & 112;
            boolean z4 = i5 == 32 ? true : z;
            Object objT10 = b0kVar3.T();
            Object obj9 = objT10;
            if (z4 || objT10 == m4cVar) {
                v0j v0jVar = new v0j(iu30Var, (byte) 18);
                b0kVar3.s0(v0jVar);
                obj9 = v0jVar;
            }
            int i6 = i4 & 14;
            String str3 = str;
            bin.j(adnVar, this.a, iu30Var, (vu30) obj9, null, b0kVar3, ((i4 << 3) & 896) | i6);
            iu30 iu30Var2 = iu30Var;
            int iOrdinal = yy30Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                    i3 = 32;
                    z2 = false;
                    b0kVar3.i0(1106251706);
                    b0kVar3.r(false);
                } else {
                    if (iOrdinal != 5) {
                        throw p3d1.k(b0kVar3, 1282586798, false);
                    }
                    b0kVar3.i0(1105729418);
                    boolean zI5 = b0kVar3.i(this) | (i6 == 4);
                    Object objT11 = b0kVar3.T();
                    Object obj10 = objT11;
                    if (zI5 || objT11 == m4cVar) {
                        eum eumVar = new eum(this, adnVar, (lnm) null, (byte) 3);
                        b0kVar3.s0(eumVar);
                        obj10 = eumVar;
                    }
                    qxd0.t(rih1Var, b0kVar3, (vu30) obj10);
                    int i7 = adnVar.h;
                    int i8 = adnVar.d;
                    boolean z5 = adnVar.i > 0 && adnVar.t > 0;
                    i3 = 32;
                    boolean zI6 = b0kVar3.i(this) | (i5 == 32);
                    Object objT12 = b0kVar3.T();
                    if (zI6 || objT12 == m4cVar) {
                        z2 = false;
                        wcn wcnVar = new wcn(this, iu30Var2, (byte) 0);
                        b0kVar3.s0(wcnVar);
                        obj2 = wcnVar;
                    } else {
                        z2 = false;
                        obj2 = objT12;
                    }
                    vbe.k(i7, i8, z5, (Function0) obj2, b0kVar3, 0);
                    b0kVar3.r(z2);
                }
                iu30Var2 = iu30Var;
                i2 = i5;
                b = 1;
                b0kVar2 = b0kVar3;
                r7 = z2;
            } else {
                b0kVar3.i0(1282588200);
                qim0 qim0VarD2 = u291.d(qim0Var3, 1.0f);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar3).T);
                xos0 xos0VarM2 = b0kVar3.m();
                qim0 qim0VarE2 = zr7.E(b0kVar3, qim0VarD2);
                b0kVar3.m0();
                if (((x340) b0kVar3).S) {
                    b0kVar3.l(n4kVar);
                } else {
                    b0kVar3.v0();
                }
                nko1.H(gfh0VarC2, b0kVar3, lljVar);
                nko1.H(xos0VarM2, b0kVar3, lljVar2);
                x0d.q(iHashCode2, b0kVar3, lljVar3, b0kVar3);
                nko1.H(qim0VarE2, b0kVar3, lljVar4);
                i2 = i5;
                r7 = 0;
                b = 1;
                i3 = 32;
                xto1.e(null, 5, 0L, 0L, b0kVar3, 48, 13);
                b0kVar2 = b0kVar3;
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            gra graVar2 = een.f;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar2);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarA, lhc.g(b0kVar2).f);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarY, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            int i9 = (i2 == i3 ? b : r7) | (b0kVar2.i(this) ? 1 : 0);
            Object objT13 = b0kVar2.T();
            Object obj11 = objT13;
            if (i9 != 0 || objT13 == m4cVar) {
                wcn wcnVar2 = new wcn(this, iu30Var2, b);
                b0kVar2.s0(wcnVar2);
                obj11 = wcnVar2;
            }
            kno1.c(r7, (Function0) obj11, b0kVar2, qim0VarB2);
            if (str3 == null) {
                b0kVar2.i0(1106715589);
                b0kVar2.r((boolean) r7);
                b0kVar3 = b0kVar2;
                r15 = b;
            } else {
                b0kVar2.i0(1106715590);
                uho uhoVar = new uho(str3, (String) null, qho.a, (nho) null, (String) null, (Function0) null, 250);
                qim0 qim0VarY2 = too1.y(h2cVar.a(qim0Var3, graVar), lhc.g(b0kVar2).f);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                ?? r13 = r7;
                b0kVar3 = b0kVar2;
                r15 = b;
                otw.c(xhoVar2, uhoVar, uyn1.B(qim0VarY2, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, b0kVar3, 8, 8);
                b0kVar3.r((boolean) r13);
            }
            b0kVar3.r((boolean) r15);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar3.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new n7m(i, this, adnVar, iu30Var, qim0Var2, (byte) 8);
        }
    }
}
