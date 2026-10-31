package p;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.wrapped.v1.proto.Paragraph;
import io.reactivex.rxjava3.core.Observable;
import j$.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class k8 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(List list, nix nixVar, List list2, tix tixVar, j2i j2iVar) {
        super(3);
        this.a = (byte) 28;
        this.b = list;
        this.c = nixVar;
        this.d = list2;
        this.e = j2iVar;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        acr0 acr0Var;
        rse rseVar = (rse) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        ven0 ven0Var = (ven0) this.e;
        m4c m4cVar = fkj0.X;
        nse nseVar = (nse) this.c;
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(rseVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(rseVar.a));
        boolean zG = x340Var2.g((th61) ven0Var.getValue()) | x340Var2.g(intent);
        Object objT = x340Var2.T();
        if (zG || objT == m4cVar) {
            xid xidVar = nseVar.c;
            th61 th61Var = (th61) ven0Var.getValue();
            th61Var.getClass();
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(intent.getDataString());
            Iterator it = ((Set) xidVar.b).iterator();
            do {
                if (!it.hasNext()) {
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                acr0Var = (acr0) it.next();
            } while (!acr0Var.a().contains(s4b1VarX.c));
            ebr0 ebr0Var = (ebr0) ((mly0) xidVar.c).get(acr0Var.b());
            if (ebr0Var == null) {
                bhn0.B(acr0Var.b(), "No page provider found for page type: ");
                return null;
            }
            objT = new lzh(ebr0Var, acr0Var.c(intent, s4b1VarX, th61Var));
            x340Var2.s0(objT);
        }
        lzh lzhVar = (lzh) objT;
        qse qseVar = (qse) this.b;
        o7r0 o7r0Var = nseVar.f;
        dg0 dg0Var = nseVar.e;
        tbr0 tbr0Var = (tbr0) this.d;
        kly0 kly0Var = nseVar.k;
        dg30 dg30Var = (dg30) x340Var2.k(mce0.a);
        cir0 cir0Var = (cir0) x340Var2.k(k2r0.a);
        q7r0 q7r0VarG = cir0Var.g();
        boolean zG2 = x340Var2.g(qseVar) | x340Var2.g(o7r0Var) | x340Var2.g(dg0Var) | x340Var2.g(dg30Var) | x340Var2.g(cir0Var) | x340Var2.g(q7r0VarG) | x340Var2.g(tbr0Var) | x340Var2.g(kly0Var);
        Object objT2 = x340Var2.T();
        if (zG2 || objT2 == m4cVar) {
            pse pseVar = new pse(tbr0Var, (byte) 0);
            qe41 qe41VarD = cir0Var.d();
            mr30 mr30Var = new mr30(dg30Var, false);
            Observable observableA = dg0Var.a(dg30Var);
            pa2 pa2Var = new pa2((byte) 2);
            b6r0 b6r0Var = new b6r0(dg30Var, qe41VarD, o7r0Var, mr30Var, (wbr0) null, pseVar, new qa2(q7r0VarG, (byte) 7), s5o0.a, observableA, Observable.just(Boolean.TRUE), pa2Var, qseVar, new pd3(kly0Var, (byte) 1), 176);
            x340Var2.s0(b6r0Var);
            objT2 = b6r0Var;
        }
        b6r0 b6r0Var2 = (b6r0) objT2;
        ebr0 ebr0Var2 = lzhVar.a;
        Parcelable parcelable = lzhVar.b;
        ecr0 ecr0VarE = b6r0Var2.e((xnn0) x340Var2.k(aon0.a));
        phi0 phi0Var = b6r0Var2.l;
        ezc ezcVar = b6r0Var2.m;
        Function0 function0 = b6r0Var2.e;
        boolean zI = x340Var2.i(nseVar);
        Object objT3 = x340Var2.T();
        if (zI || objT3 == m4cVar) {
            objT3 = new lse(nseVar, (byte) 0);
            x340Var2.s0(objT3);
        }
        fc11.d(ebr0Var2, parcelable, ecr0VarE, phi0Var, ezcVar, function0, (qim0) null, (vu30) objT3, x340Var2, 1572864);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        y9f y9fVar = (y9f) this.d;
        r9f r9fVar = (r9f) this.b;
        int iC = l1d.C(r9fVar.a);
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        n4k n4kVar = hmb0.t1;
        if (iC == 0) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-565821256);
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarD);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar4);
            nko1.H(xos0VarM, x340Var2, lljVar3);
            x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
            nko1.H(qim0VarE, x340Var2, lljVar);
            xto1.e(u291.B(nim0Var, (gra) null, 3), 6, 0L, 0L, x340Var2, 48, 12);
            x340Var2.r(true);
            x340Var2.r(false);
            return rih1Var;
        }
        if (iC == 1) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-359697539);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarF, cbx.a(x340Var3).a.c, d4o1.a);
            xtb0 xtb0Var = (xtb0) this.c;
            cvx cvxVar = cbx.b(x340Var3).b;
            cvx cvxVar2 = cbx.b(x340Var3).b;
            cvx cvxVar3 = cbx.b(x340Var3).b;
            hdh hdhVarN = lnn1.n(uyn1.j(4.0f, 16.0f, 4.0f, 0.0f, 8), vzq0Var);
            boolean zI = x340Var3.i(r9fVar) | x340Var3.i(y9fVar);
            Object objT = x340Var3.T();
            if (zI || objT == m4cVar) {
                objT = new w9f(r9fVar, y9fVar, (byte) 0);
                x340Var3.s0(objT);
            }
            ujo1.d(qim0VarF2, xtb0Var, hdhVarN, false, null, null, null, false, null, (iu30) objT, x340Var3, 0, 504);
            x340Var3.r(false);
            return rih1Var;
        }
        if (iC != 2) {
            throw p3d1.k(x340Var, -565820921, false);
        }
        x340 x340Var4 = x340Var;
        x340Var4.i0(-565811354);
        qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
        uwr uwrVar2 = cbx.a;
        cvx cvxVar4 = cbx.b(x340Var4).b;
        qim0 qim0VarB = uyn1.B(uyn1.x(qim0VarD2, 8.0f), 0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
        gra graVar = een.X;
        iu30 iu30Var = (iu30) this.e;
        gfh0 gfh0VarC2 = t1c.c(graVar, false);
        int iHashCode2 = Long.hashCode(x340Var4.T);
        xos0 xos0VarM2 = x340Var4.m();
        qim0 qim0VarE2 = zr7.E(x340Var4, qim0VarB);
        hzj.A.getClass();
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(n4kVar);
        } else {
            x340Var4.v0();
        }
        nko1.H(gfh0VarC2, x340Var4, lljVar4);
        nko1.H(xos0VarM2, x340Var4, lljVar3);
        x0d.q(iHashCode2, x340Var4, lljVar2, x340Var4);
        nko1.H(qim0VarE2, x340Var4, lljVar);
        Object objT2 = x340Var4.T();
        if (objT2 == m4cVar) {
            objT2 = y9fVar.i.a(new gob(iu30Var, (byte) 24));
            x340Var4.s0(objT2);
        }
        otw.c((y0f) objT2, rih1Var, (qim0) null, (ipb1) null, x340Var4, 48, 12);
        x340Var4.r(true);
        x340Var4.r(false);
        return rih1Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            x2g x2gVar = (x2g) ((List) this.b).get(iIntValue);
            x340Var2.i0(-1178871092);
            yd91 yd91VarD = x2gVar.b.d();
            Map map = (Map) this.c;
            Integer numValueOf = Integer.valueOf(x2gVar.a);
            Object obj4 = map.get(numValueOf);
            if (obj4 == null) {
                obj4 = (maa) yd91VarD.c.invoke();
                map.put(numValueOf, obj4);
            }
            i1o1.d((maa) obj4, (cxc0) this.e, ((m3g) this.d).a.b, goa0.a, null, apo.r(-212639004, new qff(yd91VarD, (byte) 6), x340Var2), apo.r(-2095142499, new dwd(yd91VarD, (byte) 22), x340Var2), 0, null, x340Var2, 1769472, CtaType.CTA_JOIN_WAITLIST_FIELD_NUMBER);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        l7c1 l7c1Var = (l7c1) this.c;
        if (((iu30) this.b) == null || l7c1Var == null) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(-457383016);
            x340Var2.r(false);
        } else {
            x340 x340Var3 = x340Var;
            x340Var3.i0(-457563684);
            otw.c(((f8m) this.d).e, new rk51((String) this.e, l7c1Var), (qim0) null, (ipb1) null, x340Var3, 0, 12);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        List list = (List) this.b;
        LocalDate localDate = (LocalDate) this.c;
        LocalDate localDate2 = (LocalDate) this.d;
        zu30 zu30Var = (zu30) this.e;
        int i = 0;
        for (Object obj4 : list) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            h5r h5rVar = (h5r) obj4;
            boolean z = u890.j(localDate, h5rVar.c) && u890.j(localDate2, h5rVar.d);
            nex nexVar = new nex(4);
            pex pexVar = pex.b;
            lex lexVarZ = yoo1.z(x340Var);
            x340 x340Var2 = x340Var;
            boolean zH = x340Var2.h(z);
            Object objT = x340Var2.T();
            if (zH || objT == m4cVar) {
                objT = new gy((byte) 18, z);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(nim0.a, false, (iu30) objT);
            vu30 vu30Var = z ? qhi.b : null;
            boolean zG = x340Var2.g(zu30Var) | x340Var2.e(i) | x340Var2.i(h5rVar);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new gu2((Object) zu30Var, i, (Object) h5rVar, (byte) 14);
                x340Var2.s0(objT2);
            }
            poo1.g(z, (iu30) objT2, nexVar, lexVarZ, qim0VarB, 0, pexVar, null, null, null, vu30Var, null, null, false, null, apo.r(-551477372, new i4o(h5rVar, (byte) 7), x340Var2), x340Var2, 0, 196608, 31648);
            i = i2;
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        vu30 vu30Var;
        llj lljVar;
        Function0 function0;
        b0k b0kVar;
        int i;
        x340 x340Var;
        boolean z;
        int i2;
        b0k b0kVar2 = (b0k) obj2;
        ((Number) obj3).intValue();
        fra fraVar = een.N0;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarN = anm1.N("move_to_folder_full_tree_header_row", u291.f(nim0Var, 1.0f));
        zom0 zom0Var = (zom0) this.b;
        iu30 iu30Var = (iu30) this.c;
        qom0 qom0Var = (qom0) this.d;
        uwl uwlVar = (uwl) this.e;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, b0kVar2, 0);
        x340 x340Var2 = (x340) b0kVar2;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarN);
        hzj.A.getClass();
        x340 x340Var3 = (x340) b0kVar2;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z2 = x340Var3.S;
        Function0 function1 = hmb0.t1;
        if (z2) {
            x340Var3.l(function1);
        } else {
            x340Var3.v0();
        }
        llj lljVar2 = y580.O0;
        nko1.H(jw31VarA, b0kVar2, lljVar2);
        llj lljVar3 = y580.N0;
        nko1.H(xos0VarM, b0kVar2, lljVar3);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar4 = y580.R0;
        nko1.H(numValueOf, b0kVar2, lljVar4);
        nko1.F(b0kVar2);
        vu30 vu30Var2 = y580.Y;
        nko1.H(qim0VarE, b0kVar2, vu30Var2);
        if (zom0Var.a) {
            x340Var3.i0(2040946743);
            olx olxVar = olx.c;
            uwr uwrVar = cbx.a;
            long j = cbx.a(b0kVar2).b.a;
            zov0 zov0Var = cbx.b(b0kVar2).g;
            qim0 qim0VarN2 = anm1.N("move_to_folder_full_tree_back_button", u291.r(nim0Var, 16.0f));
            boolean zG = x340Var3.g(iu30Var);
            Object objT = x340Var3.T();
            if (zG || objT == fkj0.X) {
                objT = new qzn(iu30Var, (byte) 29);
                x340Var3.s0(objT);
            }
            lljVar = lljVar4;
            b0kVar = b0kVar2;
            function0 = function1;
            vu30Var = vu30Var2;
            x340Var = x340Var3;
            i = 0;
            w0h1.a(olxVar, isl.a, bin.x(qim0VarN2, false, null, null, null, (Function0) objT, 15), j, 0L, false, b0kVar, olx.d | 48, 48);
            x340Var.r(false);
        } else {
            vu30Var = vu30Var2;
            lljVar = lljVar4;
            function0 = function1;
            b0kVar = b0kVar2;
            i = 0;
            x340Var = x340Var3;
            x340Var.i0(2041331577);
            x340Var.r(false);
        }
        wnb0 wnb0Var = new wnb0(1.0f, true);
        mbh mbhVarA = jbh.a(h36.c, een.Q0, b0kVar, i);
        int iHashCode2 = Long.hashCode(x340Var.T);
        xos0 xos0VarM2 = x340Var.m();
        qim0 qim0VarE2 = zr7.E(b0kVar, wnb0Var);
        x340Var.m0();
        if (x340Var.S) {
            x340Var.l(function0);
        } else {
            x340Var.v0();
        }
        nko1.H(mbhVarA, b0kVar, lljVar2);
        nko1.H(xos0VarM2, b0kVar, lljVar3);
        i3a.l(iHashCode2, b0kVar, lljVar, b0kVar);
        nko1.H(qim0VarE2, b0kVar, vu30Var);
        cjc0 cjc0Var = new cjc0(1);
        uwr uwrVar2 = cbx.a;
        x340 x340Var4 = x340Var;
        b0k b0kVar3 = b0kVar;
        uwo1.e(cwl1.o0(b0kVar, 2131964092), null, cbx.d(b0kVar).h, 0L, new a0e1(3), null, 0, false, cjc0Var, 0, null, b0kVar3, 0, 0, 1770);
        if (qom0Var instanceof mom0) {
            x340Var4.i0(-926543997);
            x340Var4.r(false);
        } else {
            x340Var4.i0(-927172987);
            cjc0 cjc0Var2 = new cjc0(1);
            lee1 lee1Var = cbx.d(b0kVar3).j;
            long j2 = cbx.a(b0kVar3).b.b;
            String strO0 = zom0Var.b;
            if (strO0 == null) {
                x340Var4.i0(-999730664);
                boolean z3 = uwlVar.b;
                if (z3) {
                    i2 = 2131964105;
                } else {
                    if (z3) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131964106;
                }
                strO0 = cwl1.o0(b0kVar3, i2);
                z = false;
                x340Var4.r(false);
            } else {
                z = false;
                x340Var4.i0(-999731966);
                x340Var4.r(false);
            }
            uwo1.e(strO0, null, lee1Var, j2, new a0e1(3), null, 0, false, cjc0Var2, 0, null, b0kVar3, 0, 0, 1762);
            x340Var4.r(z);
        }
        x340Var4.r(true);
        x340Var4.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
        j06 j06Var = x340Var2.a;
        if (zY) {
            float f = zjy.p(0.0f, new p3v((i2cVar.d() - dsa0.m(x340Var2, 2131166901)) / 2.0f)).a;
            WeakHashMap weakHashMap = osl1.x;
            u85 u85Var = lhc.g(x340Var2).g;
            int i = rqt0.h;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, td6.o(u85Var, i, nim0Var));
            l6s l6sVar = (l6s) this.b;
            q160 q160Var = (q160) this.c;
            iu30 iu30Var = (iu30) this.d;
            vu30 vu30Var = (vu30) this.e;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
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
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            ((hur) l6sVar.a).b(q160Var.e, iu30Var, x340Var2, 0);
            if (vu30Var == null) {
                x340Var2.i0(1831792540);
            } else {
                c13.o(x340Var2, -910741243, 0, vu30Var, x340Var2);
            }
            x340Var2.r(false);
            x340Var2.r(true);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:23:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:25:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:30:0x0203  */
    private final Object j(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        byte b;
        float f;
        b0k b0kVar;
        int i;
        float f2;
        qim0 qim0Var;
        boolean zG;
        Object objT;
        vzq0 vzq0Var = (vzq0) obj;
        b0k b0kVar2 = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
        float fD = vzq0Var.d();
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(b0kVar2).b;
        cvx cvxVar2 = cbx.b(b0kVar2).b;
        qim0 qim0VarA = uyn1.A(qim0VarD, 16.0f, fD, 16.0f, vzq0Var.a());
        String str = (String) this.b;
        wpo1 wpo1Var = (wpo1) this.c;
        Function0 function0 = (Function0) this.d;
        String str2 = (String) this.e;
        mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
        x340 x340Var = (x340) b0kVar2;
        int iHashCode = Long.hashCode(x340Var.T);
        xos0 xos0VarM = x340Var.m();
        qim0 qim0VarE = zr7.E(b0kVar2, qim0VarA);
        hzj.A.getClass();
        x340 x340Var2 = (x340) b0kVar2;
        if (x340Var2.a == null) {
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
        nko1.H(mbhVarA, b0kVar2, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, b0kVar2, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, b0kVar2, lljVar3);
        nko1.F(b0kVar2);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, b0kVar2, lljVar4);
        lee1 lee1Var = cbx.d(b0kVar2).d;
        qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
        Object objT2 = x340Var2.T();
        m4c m4cVar = fkj0.X;
        if (objT2 == m4cVar) {
            objT2 = z6t.U0;
            x340Var2.s0(objT2);
        }
        uwo1.e(str, s161.b(qim0VarF, false, (iu30) objT2), lee1Var, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2040);
        if (!(wpo1Var instanceof gpc1)) {
            b = 0;
            f = 1.0f;
            if (wpo1Var instanceof epc1) {
                x340Var2.i0(-1889548362);
                cvx cvxVar3 = cbx.b(b0kVar2).b;
                op71.g(b0kVar2, u291.h(qim0Var2, 16.0f));
                epc1 epc1Var = (epc1) wpo1Var;
                String str3 = epc1Var.c;
                c9 c9VarS = mqo1.s(epc1Var.d);
                iu30 iu30Var = epc1Var.e;
                lee1 lee1Var2 = cbx.d(b0kVar2).g;
                long j = cbx.a(b0kVar2).b.a;
                i = 0;
                qim0Var = qim0Var2;
                i8p1.i(str3, c9VarS, iu30Var, null, lee1Var2, j, 0L, b0kVar2, 0, 72);
                b0kVar = b0kVar2;
                x340Var2.r(false);
            } else {
                b0kVar = b0kVar2;
                i = 0;
                f2 = 1.0f;
                qim0Var = qim0Var2;
                if (!u890.j(wpo1Var, fpc1.c)) {
                    throw p3d1.k(x340Var2, 1047415104, false);
                }
                x340Var2.i0(-1889159250);
                x340Var2.r(false);
            }
            op71.g(b0kVar, u291.h(qim0Var, cbx.b(b0kVar).b.d));
            qim0 qim0VarF2 = u291.f(qim0Var, f2);
            jw31 jw31VarA = ew31.a(h36.e, een.Z, b0kVar, b);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(jw31VarA, b0kVar, lljVar);
            nko1.H(xos0VarM2, b0kVar, lljVar2);
            i3a.l(iHashCode2, b0kVar, lljVar3, b0kVar);
            nko1.H(qim0VarE2, b0kVar, lljVar4);
            zG = x340Var2.g(function0);
            objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new z9t(function0, b);
                x340Var2.s0(objT);
            }
            foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, apo.r(809642485, new pji(str2, (byte) 27), b0kVar), b0kVar, i, 48, 2044);
            x340Var2.r(true);
            x340Var2.r(true);
            return rih1.a;
        }
        x340Var2.i0(-1889839855);
        cvx cvxVar4 = cbx.b(b0kVar2).b;
        op71.g(b0kVar2, u291.h(qim0Var2, 16.0f));
        f = 1.0f;
        uwo1.e(((gpc1) wpo1Var).c, u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).g, 0L, null, null, 0, false, null, 0, null, b0kVar2, 0, 0, 2040);
        b = 0;
        x340Var2.r(false);
        b0kVar = b0kVar2;
        i = 0;
        qim0Var = qim0Var2;
        f2 = f;
        op71.g(b0kVar, u291.h(qim0Var, cbx.b(b0kVar).b.d));
        qim0 qim0VarF3 = u291.f(qim0Var, f2);
        jw31 jw31VarA2 = ew31.a(h36.e, een.Z, b0kVar, b);
        int iHashCode3 = Long.hashCode(x340Var2.T);
        xos0 xos0VarM3 = x340Var2.m();
        qim0 qim0VarE3 = zr7.E(b0kVar, qim0VarF3);
        x340Var2.m0();
        if (x340Var2.S) {
            x340Var2.l(n4kVar);
        } else {
            x340Var2.v0();
        }
        nko1.H(jw31VarA2, b0kVar, lljVar);
        nko1.H(xos0VarM3, b0kVar, lljVar2);
        i3a.l(iHashCode3, b0kVar, lljVar3, b0kVar);
        nko1.H(qim0VarE3, b0kVar, lljVar4);
        zG = x340Var2.g(function0);
        objT = x340Var2.T();
        if (zG) {
            objT = new z9t(function0, b);
            x340Var2.s0(objT);
        } else {
            objT = new z9t(function0, b);
            x340Var2.s0(objT);
        }
        foo1.c(new gbx(z50.c, (Function0) objT), new idx(4), null, null, null, null, null, null, null, null, apo.r(809642485, new pji(str2, (byte) 27), b0kVar), b0kVar, i, 48, 2044);
        x340Var2.r(true);
        x340Var2.r(true);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        bou bouVar = (bou) this.b;
        c380 c380Var = bouVar.c;
        boolean z = bouVar.i;
        String str = bouVar.e;
        boolean z2 = false;
        if (bouVar.b && z) {
            z2 = true;
        }
        pxd0.o(c380Var, str, z2, bouVar.a && z, (iu30) this.c, (zeu) this.d, (ngs0) this.e, (qim0) null, b0kVar, 0);
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        ((bxv) this.b).f((xtb0) this.c, (vzq0) obj, (eyv) this.d, (iu30) this.e, (b0k) obj2, (((Number) obj3).intValue() << 3) & 112);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        vzq0 vzq0Var = (vzq0) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        qim0 qim0VarB = uyn1.B(l6o1.H(u291.d(nim0.a, 1.0f), (es41) this.b, false, 14), 0.0f, 0.0f, 0.0f, vzq0Var.a(), 7);
        s8w s8wVar = (s8w) this.c;
        c8w c8wVar = (c8w) this.d;
        iu30 iu30Var = (iu30) this.e;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
        int i = s8wVar.a;
        yxa0 yxa0Var = s8wVar.d;
        boolean zI = x340Var3.i(c8wVar) | x340Var3.i(s8wVar) | x340Var3.g(iu30Var);
        Object objT = x340Var3.T();
        if (zI || objT == m4cVar) {
            objT = new ssm(c8wVar, s8wVar, iu30Var, (byte) 26);
            x340Var3.s0(objT);
        }
        ozn1.d(vzq0Var, i, yxa0Var, (Function0) objT, null, x340Var, iIntValue & 14);
        String strO0 = cwl1.o0(x340Var, 2131957026);
        String strO1 = cwl1.o0(x340Var, 2131957022);
        uwr uwrVar = cbx.a;
        ezn1.c(strO0, strO1, "https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/ParentalControls.png", null, cbx.b(x340Var).b.a, 188.0f, apo.r(396655691, new o1t(c8wVar, iu30Var, (byte) 24), x340Var), x340Var, 1573248, 8);
        ezn1.c(cwl1.o0(x340Var, 2131957027), cwl1.o0(x340Var, 2131957023), "https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/SeparateAccounts.png", null, cbx.b(x340Var).b.a, 160.0f, null, x340Var, 384, 72);
        ezn1.c(cwl1.o0(x340Var, 2131957028), cwl1.o0(x340Var, 2131957024), "https://cdn-spotify-gen-alpha.spotifycdn.com/kids-education/WorldOfMusic.png", null, 0.0f, 256.0f, null, x340Var, 384, 88);
        boolean zI2 = x340Var3.i(c8wVar) | x340Var3.g(iu30Var);
        Object objT2 = x340Var3.T();
        if (zI2 || objT2 == m4cVar) {
            objT2 = new d8w(c8wVar, iu30Var, (byte) 1);
            x340Var3.s0(objT2);
        }
        jzn1.d(0, x340Var, (iu30) objT2, null);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj).intValue();
        x340 x340Var = (b0k) obj2;
        int iIntValue2 = ((Number) obj3).intValue();
        int i = 4;
        if ((iIntValue2 & 6) == 0) {
            iIntValue2 |= x340Var.e(iIntValue) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
            pix pixVar = (pix) ((List) this.b).get(iIntValue);
            x340Var2.i0(9938406);
            boolean z = u890.j(pixVar, (nix) this.c) || o7h.i0((List) this.d, pixVar);
            boolean z2 = z && (pixVar instanceof oix);
            if (pixVar instanceof nix) {
                i = 3;
            } else if (!(pixVar instanceof oix)) {
                eg.o();
                return null;
            }
            String strX = hrt.x(i);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = k8p1.q(anm1.N(strX, nim0Var), !z && u890.j((Object) null, pixVar.b()), d1u.F(nim0Var, 1.5f, new mic0(0, 0L, 9187343241974906880L, p7h.M(new u7h[]{new u7h(z4p1.g(4294925129L)), new u7h(z4p1.g(4284129526L)), new u7h(z4p1.g(4285462616L)), new u7h(z4p1.g(4287826899L)), new u7h(z4p1.g(4294925129L))}), (List) null), er31.a));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarQ);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            ((j2i) this.e).invoke(new v820(pixVar, z, pixVar.a(), z2), x340Var2, 0);
            x340Var2.r(true);
            x340Var2.r(false);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object obj4;
        jy2 jy2Var;
        boolean z;
        vnr0 vnr0Var;
        vnr0 vnr0Var2;
        Function0 function0;
        vnr0 vnr0VarA;
        kor0 kor0VarF;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.e;
        Object obj6 = this.d;
        Object obj7 = this.b;
        Object obj8 = this.c;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                i2c i2cVar = (i2c) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                n8 n8Var = (n8) obj8;
                ArrayList arrayList = (ArrayList) obj7;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    int i = hjl.i(i2cVar.b);
                    boolean zG = x340Var2.g(arrayList) | x340Var2.g(n8Var) | x340Var2.e(i);
                    yae1 yae1Var = (yae1) obj5;
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        Iterator it = arrayList.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                Object next = it.next();
                                if (((int) (yae1.a(yae1Var, (String) next, n8Var.c, 0, false, 1, 0L, (flb0) null, (xat) null, 996).c >> 32)) <= i) {
                                    obj4 = next;
                                }
                            } else {
                                obj4 = null;
                            }
                        }
                        String str = (String) obj4;
                        objT = str == null ? (String) o7h.A0(arrayList) : str;
                        x340Var2.s0(objT);
                    }
                    gto1.i(cwl1.o0(x340Var2, 2131961378), (String) objT, (n041) obj6, null, x340Var2, 0);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar).f;
                cua cuaVar2 = cbx.b(b0kVar).f;
                t890.a(apo.r(-1487394125, new nj((mj) obj8, (iu30) obj6, (gw70) obj5), b0kVar), (iyb) obj7, 0.0f, 0.0f, er31.d(16.0f, 16.0f, 0.0f, 0.0f, 12), 0L, 0L, 8.0f, (vu30) null, false, (xu30) null, u7h.j, 0L, q2i.a, b0kVar, 6, 1572864, 48600);
                return rih1Var;
            case 2:
                ((Number) obj3).intValue();
                l3p1.b((String) obj7, (String) obj8, (hti1) obj6, u291.B(nim0Var, (gra) null, 3), (String) obj5, (b0k) obj2, 0);
                return rih1Var;
            case 3:
                x340 x340Var3 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarB = uyn1.B(u291.f(nim0Var2, 1.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                Function0 function1 = (Function0) obj7;
                y7e1 y7e1Var = (y7e1) obj8;
                fu1 fu1Var = (fu1) obj6;
                String str2 = (String) obj5;
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var3, 48);
                x340 x340Var4 = x340Var3;
                int iHashCode = Long.hashCode(x340Var4.T);
                xos0 xos0VarM = x340Var4.m();
                qim0 qim0VarE = zr7.E(x340Var3, qim0VarB);
                hzj.A.getClass();
                x340 x340Var5 = x340Var3;
                if (x340Var5.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var5.m0();
                if (x340Var5.S) {
                    x340Var5.l(n4kVar);
                } else {
                    x340Var5.v0();
                }
                nko1.H(jw31VarA, x340Var3, y580.O0);
                nko1.H(xos0VarM, x340Var3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
                nko1.F(x340Var3);
                nko1.H(qim0VarE, x340Var3, y580.Y);
                v9p1.c(function1, anm1.N("cancel_search_button", nim0Var2), null, x340Var3, 48, 4);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar = cbx.b(x340Var3).b;
                qim0 qim0VarN = anm1.N("find_playlist", uyn1.B(nim0Var2, 0.0f, 0.0f, 16.0f, 0.0f, 11));
                boolean zI = x340Var5.i(fu1Var) | x340Var5.g(str2);
                Object objT2 = x340Var5.T();
                if (zI || objT2 == fkj0.X) {
                    objT2 = new d4((byte) 26, (Object) fu1Var, str2);
                    x340Var5.s0(objT2);
                }
                s9p1.k(y7e1Var, s161.b(qim0VarN, false, (iu30) objT2), x340Var3, 0);
                x340Var5.r(true);
                return rih1Var;
            case 4:
                qe2 qe2Var = (qe2) obj;
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                mwq0 mwq0Var = (mwq0) obj5;
                m4c m4cVar = fkj0.X;
                ven0 ven0Var = (ven0) obj7;
                na2 na2Var = (na2) obj6;
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(qe2Var.a));
                Bundle bundle = qe2Var.b;
                if (bundle != null) {
                    intent.putExtras(bundle);
                }
                x340 x340Var7 = x340Var6;
                boolean zG2 = x340Var7.g((th61) ven0Var.getValue()) | x340Var7.g(intent);
                Object objT3 = x340Var7.T();
                if (zG2 || objT3 == m4cVar) {
                    ycc1 ycc1Var = na2Var.c;
                    Object value = ven0Var.getValue();
                    value.getClass();
                    objT3 = ycc1Var.k(intent, (th61) value);
                    x340Var7.s0(objT3);
                }
                lzh lzhVar = (lzh) objT3;
                b6r0 b6r0VarR = pdp1.r((ra2) obj8, na2Var.f, na2Var.e, na2Var.i, x340Var7);
                boolean zI2 = x340Var7.i(mwq0Var);
                Object objT4 = x340Var7.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new ka2(mwq0Var, (byte) 0);
                    x340Var7.s0(objT4);
                }
                x74.f((Function0) objT4, (scx) null, (mfx) null, false, false, 0.0f, false, Boolean.TRUE, false, false, (vu30) null, apo.r(693115191, new n891(lzhVar, b6r0VarR, na2Var, (byte) 11), x340Var7), x340Var7, 12582912, 48, 1918);
                return rih1Var;
            case 5:
                x340 x340Var8 = (b0k) obj2;
                ((Number) obj3).intValue();
                iu30 iu30Var = (iu30) obj8;
                ven0 ven0Var2 = (ven0) obj6;
                tg2 tg2Var = (tg2) obj5;
                int i2 = 0;
                for (Object obj9 : (ArrayList) obj7) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    tg2 tg2Var2 = (tg2) obj9;
                    j2i j2iVarR = apo.r(1697296524, new n2(tg2Var2, tg2Var, (byte) 21), x340Var8);
                    x340 x340Var9 = x340Var8;
                    boolean zG3 = x340Var9.g(iu30Var) | x340Var9.g(tg2Var2) | x340Var9.i(ven0Var2);
                    Object objT5 = x340Var9.T();
                    if (zG3 || objT5 == fkj0.X) {
                        objT5 = new hh(iu30Var, tg2Var2, ven0Var2, (byte) 9);
                        x340Var9.s0(objT5);
                    }
                    gt4.b(j2iVarR, (Function0) objT5, (qim0) null, (vu30) null, false, (wsi0) null, (vzq0) null, x340Var9, 6, 508);
                    i2 = i3;
                }
                return rih1Var;
            case 6:
                vzq0 vzq0Var = (vzq0) obj;
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), (es41) obj7, apo.r(877191353, new x2((Object) vzq0Var, obj8, obj6, obj5, (byte) 21), b0kVar2), b0kVar2, 384, 0);
                return rih1Var;
            case 7:
                ((Number) obj3).intValue();
                jy2 jy2Var2 = (jy2) obj7;
                ly2 ly2Var = (ly2) obj8;
                ycc1 ycc1Var2 = ly2Var.c;
                yok0 yok0Var = ly2Var.b;
                qim0 qim0VarY = voo1.y(nim0Var, voo1.g);
                c9n c9nVar = (c9n) obj6;
                x340 x340Var10 = (b0k) obj2;
                vy71 vy71Var = (vy71) obj5;
                boolean zI3 = x340Var10.i(c9nVar) | x340Var10.i(vy71Var) | x340Var10.i(ly2Var) | x340Var10.i(jy2Var2);
                Object objT6 = x340Var10.T();
                if (zI3 || objT6 == fkj0.X) {
                    objT6 = new f80(c9nVar, ly2Var, jy2Var2, vy71Var, (byte) 3);
                    jy2Var = jy2Var2;
                    x340Var10.s0(objT6);
                } else {
                    jy2Var = jy2Var2;
                }
                mod.a(jy2Var, ycc1Var2, yok0Var, qim0VarY, (Function0) objT6, x340Var10, 0);
                return rih1Var;
            case 8:
                dd5 dd5Var = (cd5) obj;
                x340 x340Var11 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                bw91 bw91Var = (bw91) obj8;
                eb5 eb5Var = (eb5) obj6;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var11.g(dd5Var) : x340Var11.i(dd5Var) ? 4 : 2;
                }
                x340 x340Var12 = x340Var11;
                if (x340Var12.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    boolean zG4 = x340Var12.g(bw91Var) | x340Var12.i(obj7) | x340Var12.i(eb5Var);
                    Object objT7 = x340Var12.T();
                    if (zG4 || objT7 == m4cVar2) {
                        objT7 = new t6(bw91Var, obj7, eb5Var, (byte) 23);
                        x340Var12.s0(objT7);
                    }
                    qxd0.h(dd5Var, obj7, (iu30) objT7, x340Var12);
                    eb5Var.e.m(obj7, dd5Var.b);
                    Object objT8 = x340Var12.T();
                    if (objT8 == m4cVar2) {
                        objT8 = new wa5(dd5Var);
                        x340Var12.s0(objT8);
                    }
                    ((zu30) obj5).J((wa5) objT8, obj7, x340Var12, 0);
                } else {
                    x340Var12.b0();
                }
                return rih1Var;
            case 9:
                float f = ((p3v) obj).a;
                x340 x340Var13 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= x340Var13.d(f) ? 4 : 2;
                }
                x340 x340Var14 = x340Var13;
                if (x340Var14.Y(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    vu30 vu30Var = (vu30) obj7;
                    if (vu30Var == null) {
                        x340Var14.i0(227309362);
                        z = false;
                        x340Var14.r(false);
                        vnr0Var = null;
                    } else {
                        z = false;
                        x340Var14.i0(-1101046097);
                        vnr0Var = (vnr0) vu30Var.invoke(x340Var14, 0);
                        x340Var14.r(false);
                    }
                    vu30 vu30Var2 = (vu30) obj8;
                    if (vu30Var2 == null) {
                        x340Var14.i0(227359954);
                        x340Var14.r(z);
                        vnr0Var2 = null;
                    } else {
                        x340Var14.i0(-1101044465);
                        vnr0Var2 = (vnr0) vu30Var2.invoke(x340Var14, 0);
                        x340Var14.r(z);
                    }
                    boolean z2 = vnr0Var != null;
                    boolean zI4 = x340Var14.i(vnr0Var) | x340Var14.i(vnr0Var2);
                    ven0 ven0Var3 = (ven0) obj6;
                    Object objT9 = x340Var14.T();
                    if (zI4 || objT9 == fkj0.X) {
                        objT9 = new t6(vnr0Var, vnr0Var2, ven0Var3, (byte) 26);
                        x340Var14.s0(objT9);
                    }
                    tho1.b(z2, f, s161.a(nim0Var, (iu30) objT9), apo.r(229974785, new oj2((Object) vnr0Var, (Object) vnr0Var2, obj5, (byte) 22), x340Var14), x340Var14, ((iIntValue3 << 3) & 112) | 3072);
                } else {
                    x340Var14.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj3).intValue();
                q7r0 q7r0Var = (q7r0) obj7;
                x340 x340Var15 = (b0k) obj2;
                boolean zG5 = x340Var15.g(cwl1.C(q7r0Var));
                ggr ggrVar = (ggr) obj5;
                Object objT10 = x340Var15.T();
                if (zG5 || objT10 == fkj0.X) {
                    objT10 = ggr.a(ggrVar, cwl1.C(q7r0Var));
                    x340Var15.s0(objT10);
                }
                i1o1.e((qx6) objT10, new gx6(((vn6) obj8).d, ((qfl1) obj6).a.getString(2131952471), false), cwl1.C(q7r0Var), null, null, w6i.b, null, 0, null, x340Var15, 196616, 236);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                cia1 cia1Var = (cia1) obj;
                int iIntValue4 = ((Number) obj3).intValue();
                bsk0 bsk0Var = (bsk0) obj8;
                String str3 = cia1Var.a;
                Integer numValueOf = Integer.valueOf(iIntValue4);
                bsk0Var.getClass();
                x6h1 x6h1VarC = bsk0Var.a.c();
                x6h1VarC.i.add(new a7h1("sort_option", str3, numValueOf, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                b7x b7xVar = b7x.a;
                ((i8h1) obj7).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                tbr0 tbr0Var = (tbr0) obj5;
                y231 y231Var = new y231(new uw6(cia1Var.b, (rha1) obj2));
                if (((AtomicBoolean) obj6).compareAndSet(false, true)) {
                    tbr0Var.a(y231Var);
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var16 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var17 = x340Var16;
                if (x340Var17.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    dp8 dp8Var = ((ep8) obj7).a;
                    oq51 oq51Var = (oq51) obj8;
                    c380 c380Var = (c380) obj6;
                    ai4 ai4Var = (ai4) obj5;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM2 = x340Var17.m();
                    qim0 qim0VarE2 = zr7.E(x340Var17, nim0Var);
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
                    nko1.H(gfh0VarC, x340Var17, y580.O0);
                    nko1.H(xos0VarM2, x340Var17, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode2), x340Var17, y580.R0);
                    nko1.F(x340Var17);
                    nko1.H(qim0VarE2, x340Var17, y580.Y);
                    if (dp8Var.h.isEmpty()) {
                        x340Var17.i0(545489710);
                        uwo1.e(dp8Var.b, null, null, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var17, 1572864, 0, 1726);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(545666069);
                        oq51Var.getClass();
                        uwo1.f(oq51.b(c380Var, ai4Var, x340Var17), null, null, null, null, null, 2, false, new cjc0(1), 0, null, null, x340Var17, 1572864, 0, 3774);
                        x340Var17.r(false);
                    }
                    x340Var17.r(true);
                } else {
                    x340Var17.b0();
                }
                return rih1Var;
            case 13:
                int iIntValue6 = ((Number) obj).intValue();
                x340 x340Var18 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                iu30 iu30Var2 = (iu30) obj5;
                yb20 yb20Var = (yb20) obj6;
                ic9 ic9Var = (ic9) obj8;
                if ((iIntValue7 & 6) == 0) {
                    iIntValue7 |= x340Var18.e(iIntValue6) ? 4 : 2;
                }
                x340 x340Var19 = x340Var18;
                if (x340Var19.Y(iIntValue7 & 1, (iIntValue7 & 19) != 18)) {
                    ea61 ea61Var = (ea61) ((List) obj7).get(iIntValue6);
                    x340Var19.i0(1946386393);
                    String str4 = ea61Var.c;
                    boolean zI5 = x340Var19.i(ic9Var) | x340Var19.i(ea61Var) | x340Var19.i(yb20Var) | x340Var19.g(iu30Var2);
                    Object objT11 = x340Var19.T();
                    if (zI5 || objT11 == fkj0.X) {
                        f80 f80Var = new f80(ic9Var, ea61Var, yb20Var, iu30Var2, (byte) 14);
                        x340Var19.s0(f80Var);
                        objT11 = f80Var;
                    }
                    m3b.d(0, str4, (Function0) objT11, x340Var19, (qim0) null);
                    x340Var19.r(false);
                } else {
                    x340Var19.b0();
                }
                return rih1Var;
            case 14:
                x340 x340Var20 = (b0k) obj2;
                ((Number) obj3).intValue();
                era eraVar = een.Q0;
                d36 d36Var = new d36(8.0f, true, new um5(false));
                qim0 qim0VarX = u291.x(0.0f, 678.0f, 1, nim0Var);
                String str5 = (String) obj7;
                String str6 = (String) obj8;
                iu30 iu30Var3 = (iu30) obj6;
                String str7 = (String) obj5;
                mbh mbhVarA = jbh.a(d36Var, eraVar, x340Var20, 0);
                x340 x340Var21 = x340Var20;
                int iHashCode3 = Long.hashCode(x340Var21.T);
                xos0 xos0VarM3 = x340Var21.m();
                qim0 qim0VarE3 = zr7.E(x340Var20, qim0VarX);
                hzj.A.getClass();
                x340 x340Var22 = x340Var20;
                if (x340Var22.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var22.m0();
                if (x340Var22.S) {
                    x340Var22.l(n4kVar);
                } else {
                    x340Var22.v0();
                }
                nko1.H(mbhVarA, x340Var20, y580.O0);
                nko1.H(xos0VarM3, x340Var20, y580.N0);
                nko1.H(Integer.valueOf(iHashCode3), x340Var20, y580.R0);
                nko1.F(x340Var20);
                nko1.H(qim0VarE3, x340Var20, y580.Y);
                uwo1.e(str5, null, null, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var20, 0, 0, 2030);
                boolean zG6 = x340Var22.g(iu30Var3);
                Object objT12 = x340Var22.T();
                if (zG6 || objT12 == fkj0.X) {
                    objT12 = new nc8(iu30Var3, (byte) 20);
                    x340Var22.s0(objT12);
                }
                Function0 function2 = (Function0) objT12;
                if (ihc1.y0(str6)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return null;
                }
                foo1.c(new gbx(new y50(str6), function2), ldx.c, null, null, null, null, null, null, null, null, apo.r(-1043719010, new j3b(str7, (byte) 3), x340Var20), x340Var20, 0, 48, 2044);
                x340Var22.r(true);
                return rih1Var;
            case 15:
                x340 x340Var23 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var23).b;
                qim0 qim0VarX2 = uyn1.x(qim0VarD, 16.0f);
                ecx ecxVar = (ecx) obj7;
                ziu ziuVar = (ziu) obj8;
                afx afxVar = (afx) obj6;
                iu30 iu30Var4 = (iu30) obj5;
                mbh mbhVarA2 = jbh.a(h36.g, een.Q0, x340Var23, 0);
                x340 x340Var24 = x340Var23;
                int iHashCode4 = Long.hashCode(x340Var24.T);
                xos0 xos0VarM4 = x340Var24.m();
                qim0 qim0VarE4 = zr7.E(x340Var23, qim0VarX2);
                hzj.A.getClass();
                x340 x340Var25 = x340Var23;
                if (x340Var25.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA2, x340Var23, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM4, x340Var23, lljVar2);
                Integer numValueOf2 = Integer.valueOf(iHashCode4);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf2, x340Var23, lljVar3);
                nko1.F(x340Var23);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE4, x340Var23, lljVar4);
                gfh0 gfh0VarC2 = t1c.c(een.d, false);
                int iHashCode5 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM5 = x340Var25.m();
                qim0 qim0VarE5 = zr7.E(x340Var23, nim0Var);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(gfh0VarC2, x340Var23, lljVar);
                nko1.H(xos0VarM5, x340Var23, lljVar2);
                i3a.l(iHashCode5, x340Var23, lljVar3, x340Var23);
                nko1.H(qim0VarE5, x340Var23, lljVar4);
                fra fraVar2 = een.N0;
                jw31 jw31VarA2 = ew31.a(h36.a, fraVar2, x340Var23, 0);
                int iHashCode6 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM6 = x340Var25.m();
                qim0 qim0VarE6 = zr7.E(x340Var23, nim0Var);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(jw31VarA2, x340Var23, lljVar);
                nko1.H(xos0VarM6, x340Var23, lljVar2);
                i3a.l(iHashCode6, x340Var23, lljVar3, x340Var23);
                nko1.H(qim0VarE6, x340Var23, lljVar4);
                op71.g(x340Var23, hno1.f(u291.c(nim0Var, 0.6f), ecxVar));
                diu diuVar = ziuVar.f;
                biu biuVar = diuVar.c;
                aym.h(biuVar.b, x340Var23, 0);
                x340Var25.r(true);
                x340Var25.r(true);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                jw31 jw31VarA3 = ew31.a(new d36(16.0f, true, new um5(false)), fraVar2, x340Var23, 0);
                int iHashCode7 = Long.hashCode(x340Var25.T);
                xos0 xos0VarM7 = x340Var25.m();
                qim0 qim0VarE7 = zr7.E(x340Var23, qim0VarF);
                x340Var25.m0();
                if (x340Var25.S) {
                    x340Var25.l(n4kVar);
                } else {
                    x340Var25.v0();
                }
                nko1.H(jw31VarA3, x340Var23, lljVar);
                nko1.H(xos0VarM7, x340Var23, lljVar2);
                i3a.l(iHashCode7, x340Var23, lljVar3, x340Var23);
                nko1.H(qim0VarE7, x340Var23, lljVar4);
                ciu ciuVar = diuVar.d;
                aym.a(0, biuVar.a, x340Var23, new wnb0(1.0f, true));
                String str8 = ciuVar.a;
                String str9 = zyd1.f;
                hdx hdxVar = afxVar != null ? new hdx(0, (vu30) null, vq9.Z0, (vu30) null, (hw61) null, 27) : new idx(8);
                if (ciuVar.b.b()) {
                    x340Var25.i0(-1779937300);
                    boolean zG7 = x340Var25.g(iu30Var4);
                    Object objT13 = x340Var25.T();
                    if (zG7 || objT13 == fkj0.X) {
                        objT13 = new nc8(iu30Var4, (byte) 29);
                        x340Var25.s0(objT13);
                    }
                    x340Var25.r(false);
                    function0 = (Function0) objT13;
                } else {
                    x340Var25.i0(-1779862033);
                    x340Var25.r(false);
                    function0 = null;
                }
                cpn1.a(str8, str9, function0, null, hdxVar, null, x340Var23, 0, 40);
                x340Var25.r(true);
                x340Var25.r(true);
                return rih1Var;
            case 16:
                Function0 function3 = (Function0) obj;
                x340 x340Var26 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                x50 x50Var = (x50) obj6;
                long jA = x50Var.d;
                zd60 zd60Var = x50Var.h;
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var26.i(function3) ? 4 : 2;
                }
                x340 x340Var27 = x340Var26;
                if (!x340Var27.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    x340Var27.b0();
                } else if (((Paragraph) obj7) != null) {
                    x340Var27.i0(-1536244262);
                    vnr0 vnr0Var3 = (vnr0) obj5;
                    qim0 qim0VarX3 = uyn1.x(u291.d(nim0Var, 1.0f), 8.0f);
                    Object objT14 = x340Var27.T();
                    if (objT14 == fkj0.X) {
                        objT14 = td4.f;
                        x340Var27.s0(objT14);
                    }
                    gfh0 gfh0Var = (gfh0) objT14;
                    int iHashCode8 = Long.hashCode(x340Var27.T);
                    xos0 xos0VarM8 = x340Var27.m();
                    qim0 qim0VarE8 = zr7.E(x340Var27, qim0VarX3);
                    hzj.A.getClass();
                    if (x340Var27.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var27.m0();
                    if (x340Var27.S) {
                        x340Var27.l(n4kVar);
                    } else {
                        x340Var27.v0();
                    }
                    nko1.H(gfh0Var, x340Var27, y580.O0);
                    nko1.H(xos0VarM8, x340Var27, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode8), x340Var27, y580.R0);
                    nko1.F(x340Var27);
                    nko1.H(qim0VarE8, x340Var27, y580.Y);
                    float fFloatValue = ((Number) function3.invoke()).floatValue();
                    if (zd60Var != null) {
                        vnr0Var3.getClass();
                        long jA2 = z4p1.A(fFloatValue, jA, zd60Var.b);
                        kor0 kor0Var = vnr0Var3.c;
                        if (kor0Var instanceof ior0) {
                            ior0 ior0Var = (ior0) kor0Var;
                            List<mor0> list = ior0Var.a;
                            ArrayList arrayList2 = new ArrayList(q7h.U(list, 10));
                            for (mor0 mor0Var : list) {
                                long j = jA2;
                                arrayList2.add(new mor0(mor0Var.a, zma1.a(mor0Var.b, j, 0L, (FontWeight) null, (FontStyle) null, (FontFamily) null, 65534)));
                                jA2 = j;
                            }
                            kor0VarF = ior0.f(ior0Var, arrayList2, (cjc0) null, 14);
                        } else {
                            if (!(kor0Var instanceof jor0)) {
                                eg.o();
                                return null;
                            }
                            kor0VarF = kor0Var;
                            jA2 = jA2;
                        }
                        vnr0VarA = vnr0.a(vnr0Var3, null, null, kor0VarF, jA2, 19);
                    } else {
                        vnr0VarA = vnr0Var3;
                        vnr0VarA.getClass();
                    }
                    qgo1.f(vnr0VarA, null, null, 0, false, null, x340Var27, 8, 62);
                    x340Var27.r(true);
                    x340Var27.r(false);
                } else if (((hux) obj8) != null) {
                    x340Var27.i0(-1534774862);
                    if (zd60Var != null) {
                        jA = z4p1.A(((Number) function3.invoke()).floatValue(), jA, zd60Var.b);
                    }
                    w0h1.a((hux) obj8, isl.a, (qim0) null, jA, 0L, false, x340Var27, 56, 52);
                    x340Var27.r(false);
                } else {
                    x340Var27.i0(-1534409682);
                    x340Var27.r(false);
                }
                return rih1Var;
            case 17:
                return a(obj, obj2, obj3);
            case 18:
                return d(obj, obj2, obj3);
            case 19:
                return e(obj, obj2, obj3);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return f(obj, obj2, obj3);
            case 21:
                return g(obj, obj2, obj3);
            case 22:
                return h(obj, obj2, obj3);
            case 23:
                return i(obj, obj2, obj3);
            case 24:
                return j(obj, obj2, obj3);
            case 25:
                return k(obj, obj2, obj3);
            case 26:
                return m(obj, obj2, obj3);
            case 27:
                return n(obj, obj2, obj3);
            case 28:
                return o(obj, obj2, obj3);
            default:
                x340 x340Var28 = (b0k) obj2;
                int iIntValue9 = ((Number) obj3).intValue();
                x340 x340Var29 = x340Var28;
                if (x340Var29.Y(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    qim0 qim0VarH = l6o1.H(u291.c(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var29), false, 14);
                    Function0 function4 = (Function0) obj7;
                    v3y v3yVar = (v3y) obj8;
                    iu30 iu30Var5 = (iu30) obj6;
                    bs91 bs91Var = (bs91) obj5;
                    mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var29, 0);
                    int iHashCode9 = Long.hashCode(x340Var29.T);
                    xos0 xos0VarM9 = x340Var29.m();
                    qim0 qim0VarE9 = zr7.E(x340Var29, qim0VarH);
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
                    nko1.H(mbhVarA3, x340Var29, y580.O0);
                    nko1.H(xos0VarM9, x340Var29, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var29, y580.R0);
                    nko1.F(x340Var29);
                    nko1.H(qim0VarE9, x340Var29, y580.Y);
                    boolean zG8 = x340Var29.g(function4);
                    Object objT15 = x340Var29.T();
                    if (zG8 || objT15 == fkj0.X) {
                        objT15 = new ivw(function4, (byte) 4);
                        x340Var29.s0(objT15);
                    }
                    acq0.m(0, (Function0) objT15, x340Var29, (qim0) null);
                    acq0.g(v3yVar, iu30Var5, (qim0) null, x340Var29, 0);
                    acq0.l(v3yVar.d, bs91Var, function4, x340Var29, 48);
                    x340Var29.r(true);
                } else {
                    x340Var29.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k8(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(mj mjVar, iyb iybVar, iu30 iu30Var, gw70 gw70Var) {
        super(3);
        this.a = (byte) 1;
        this.b = iybVar;
        this.c = mjVar;
        this.d = iu30Var;
        this.e = gw70Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k8(jy2 jy2Var, ly2 ly2Var, c9n c9nVar, vy71 vy71Var) {
        super(3);
        this.a = (byte) 7;
        this.b = jy2Var;
        this.c = ly2Var;
        this.d = c9nVar;
        this.e = vy71Var;
    }
}
