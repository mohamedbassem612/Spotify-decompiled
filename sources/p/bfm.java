package p;

import android.content.Context;
import android.icu.text.DateFormat;
import android.icu.util.TimeZone;
import android.net.Uri;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bfm extends hab0 implements bv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ maa b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bfm(maa maaVar, byte b) {
        super(5);
        this.a = b;
        this.b = maaVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ksw kswVar = (ksw) obj;
        ann annVar = (ann) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        ldo ldoVar = this.b;
        snn snnVar = annVar.h;
        int i = (iIntValue & 896) ^ 384;
        boolean z = true;
        boolean z2 = (i > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z2 || objT == m4cVar) {
            objT = new dnn(iu30Var, (byte) 0);
            x340Var2.s0(objT);
        }
        aym.f(kswVar, 100, (Function0) objT, x340Var2, (iIntValue & 14) | 48, 0);
        Object objT2 = x340Var2.T();
        if (objT2 == m4cVar) {
            objT2 = new q811();
            x340Var2.s0(objT2);
        }
        q811 q811Var = (q811) objT2;
        String strO0 = cwl1.o0(x340Var2, 2131954629);
        boolean zI = x340Var2.i(ldoVar) | x340Var2.i(q811Var);
        if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
            z = false;
        }
        boolean z3 = zI | z;
        Object objT3 = x340Var2.T();
        if (z3 || objT3 == m4cVar) {
            objT3 = new ssm(ldoVar, q811Var, iu30Var, (byte) 4);
            x340Var2.s0(objT3);
        }
        Function0 function0 = (Function0) objT3;
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        if (snnVar instanceof rnn) {
            x340Var2.i0(-1838171630);
            ldoVar.r(annVar, gbxVar, x340Var2, (iIntValue >> 3) & 14);
            x340Var2.r(false);
        } else {
            if (!(snnVar instanceof qnn)) {
                throw p3d1.k(x340Var2, -1838173212, false);
            }
            x340Var2.i0(-1838168630);
            ldoVar.o(annVar, (qnn) snnVar, gbxVar, x340Var2, (iIntValue >> 3) & 14);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object d(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        s4o s4oVar;
        String strU;
        s4o s4oVar2;
        iu30 iu30Var;
        String strN0;
        String strN1;
        h0o h0oVar = (h0o) obj2;
        iu30 iu30Var2 = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        int i = h0oVar.c;
        n0o n0oVar = this.b;
        t4o t4oVar = (t4o) n0oVar.i;
        x340 x340Var = (b0k) obj4;
        x340Var.i0(-838354652);
        f0o f0oVar = h0oVar.d;
        if (f0oVar instanceof f0o) {
            x340Var.i0(1795035352);
            bxn bxnVar = f0oVar.a;
            String str = bxnVar.c;
            boolean zJ = u890.j(t4oVar.b, bxnVar.b);
            if (zJ) {
                strN0 = x0d.k(x340Var, -940524507, 2131960009, x340Var, false);
            } else {
                x340Var.i0(-940430980);
                strN0 = cwl1.n0(2131960008, new Object[]{str}, x340Var);
                x340Var.r(false);
            }
            if (zJ) {
                x340Var.i0(-940281529);
                x340Var.r(false);
                strN1 = strN0;
            } else {
                x340Var.i0(-940251273);
                strN1 = cwl1.n0(2131960008, new Object[]{"%1$s"}, x340Var);
                x340Var.r(false);
            }
            s4o s4oVar3 = new s4o(t4o.d(strN0, strN1, Integer.valueOf(str.length()), x340Var, 0), strN0);
            x340Var.r(false);
            s4oVar = s4oVar3;
        } else if (f0oVar instanceof e0o) {
            x340Var.i0(1795038971);
            c380 c380VarA = mqo1.A(((e0o) f0oVar).a);
            x340Var.i0(1457764973);
            ArrayList arrayList = new ArrayList(q7h.U(c380VarA, 10));
            Iterator it = c380VarA.iterator();
            while (it.hasNext()) {
                arrayList.add(((bxn) it.next()).c);
            }
            c380 c380VarA2 = mqo1.A(arrayList);
            if (c380VarA2.isEmpty()) {
                s4o s4oVar4 = new s4o(new af5(""), "");
                x340Var.r(false);
                s4oVar2 = s4oVar4;
            } else {
                String str2 = (String) o7h.q0(c380VarA2);
                String strC = t4o.c(str2, c380VarA2.size(), i, x340Var, 0);
                String strC2 = t4o.c("%1$s", c380VarA2.size(), i, x340Var, 6);
                if (i != 1) {
                    x340Var.i0(752821553);
                    x340Var.r(false);
                    strU = strC;
                } else if (c380VarA2.size() == 1) {
                    x340Var.i0(752823025);
                    strU = cwl1.n0(2131960007, new Object[]{str2}, x340Var);
                    x340Var.r(false);
                } else {
                    x340Var.i0(752828195);
                    strU = cwl1.U(2131820800, c380VarA2.size() - 1, new Object[]{str2, Integer.valueOf(c380VarA2.size() - 1)}, x340Var);
                    x340Var.r(false);
                }
                s4o s4oVar5 = new s4o(t4o.d(strC, strC2, (Integer) null, x340Var, 4), strU);
                x340Var.r(false);
                s4oVar2 = s4oVar5;
            }
            x340Var.r(false);
            s4oVar = s4oVar2;
        } else {
            if (!(f0oVar instanceof d0o)) {
                throw p3d1.k(x340Var, 1795033104, false);
            }
            x340Var.i0(1795045932);
            d0o d0oVar = (d0o) f0oVar;
            bxn bxnVar2 = d0oVar.a;
            String strB = t4o.b(d0oVar.b.c, i, x340Var);
            s4o s4oVar6 = new s4o(new af5(strB), xcg1.i(strB, " • ", bxnVar2.c));
            x340Var.r(false);
            s4oVar = s4oVar6;
        }
        x340Var.r(false);
        ubc ubcVar = (ubc) n0oVar.g;
        String str3 = h0oVar.a;
        List<bxn> listA = f0oVar.a();
        ArrayList arrayList2 = new ArrayList(q7h.U(listA, 10));
        for (bxn bxnVar3 : listA) {
            arrayList2.add(new phx(8, 0L, bxnVar3.d, bxnVar3.b, bxnVar3.c));
        }
        c380 c380VarA3 = mqo1.A(arrayList2);
        boolean z = h0oVar.f;
        boolean z2 = f0oVar instanceof d0o;
        bxn bxnVar4 = z2 ? ((d0o) f0oVar).a : null;
        if (z2) {
            x340Var.i0(1271104340);
            boolean z3 = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var2)) || (iIntValue & 384) == 256;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new m0o(iu30Var2, (byte) 0);
                x340Var.s0(objT);
            }
            x340Var.r(false);
            iu30Var = (iu30) objT;
        } else {
            x340Var.i0(1271259618);
            x340Var.r(false);
            iu30Var = null;
        }
        boolean zI = x340Var.i(n0oVar) | ((((iIntValue & 112) ^ 48) > 32 && x340Var.i(h0oVar)) || (iIntValue & 48) == 32) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var2)) || (iIntValue & 384) == 256);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new sqm(n0oVar, h0oVar, iu30Var2);
            x340Var.s0(objT2);
        }
        cso1.c(str3, (Function0) objT2, z, s4oVar, c380VarA3, apo.r(-1367004293, new jjk(n0oVar, h0oVar, (byte) 29), x340Var), bxnVar4, iu30Var, ubcVar, x340Var, 229376);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        d4o d4oVar;
        c4o c4oVar = (c4o) obj2;
        x340 x340Var = (b0k) obj4;
        ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        m4o m4oVar = this.b;
        String str = c4oVar.a;
        z3o z3oVar = c4oVar.b;
        if (z3oVar instanceof z3o) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1634530606);
            z3o z3oVar2 = z3oVar;
            String str2 = z3oVar2.a;
            boolean zG = x340Var2.g(str) | x340Var2.g(str2);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new na9((lzn0) m4oVar.a.a.d.i.get(), (byte) 13);
                x340Var2.s0(objT);
            }
            d4oVar = new d4o(new kxi0(str, str2, z3oVar2.b, z3oVar2.c), (xpw) objT);
            x340Var2.r(false);
        } else if (z3oVar instanceof y3o) {
            x340 x340Var3 = x340Var;
            x340Var3.i0(1635045609);
            boolean zG2 = x340Var3.g(str);
            Object objT2 = x340Var3.T();
            if (zG2 || objT2 == m4cVar) {
                r7q r7qVar = m4oVar.b.a;
                teq teqVar = r7qVar.d;
                iyc0 iyc0Var = (iyc0) teqVar.g1.get();
                op31 op31Var = (op31) teqVar.h1.get();
                daq daqVar = r7qVar.b;
                objT2 = new pt(iyc0Var, op31Var, (kt91) daqVar.f8.get(), (Context) daqVar.x1.a);
                x340Var3.s0(objT2);
            }
            d4oVar = new d4o(new gea0(str, ((y3o) z3oVar).a), (xpw) objT2);
            x340Var3.r(false);
        } else {
            if (z3oVar != null) {
                throw p3d1.k(x340Var, -1748390761, false);
            }
            x340 x340Var4 = x340Var;
            x340Var4.i0(1635282665);
            x340Var4.r(false);
            d4oVar = null;
        }
        if (d4oVar != null) {
            x340 x340Var5 = x340Var;
            x340Var5.i0(1635332514);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var5, 0);
            int iHashCode = Long.hashCode(x340Var5.T);
            xos0 xos0VarM = x340Var5.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var5, nim0Var);
            hzj.A.getClass();
            if (x340Var5.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var5.m0();
            if (x340Var5.S) {
                x340Var5.l(hmb0.t1);
            } else {
                x340Var5.v0();
            }
            nko1.H(jw31VarA, x340Var5, y580.O0);
            nko1.H(xos0VarM, x340Var5, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
            nko1.F(x340Var5);
            nko1.H(qim0VarE, x340Var5, y580.Y);
            op71.g(x340Var5, u291.r(nim0Var, 8.0f));
            d4oVar.a(x340Var5, 0);
            x340Var5.r(true);
            x340Var5.r(false);
        } else {
            x340 x340Var6 = x340Var;
            x340Var6.i0(1635436302);
            x340Var6.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j5o j5oVar = (j5o) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        x4o x4oVar = this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            eyh0 eyh0Var = x4oVar.d;
            ly2 ly2Var = new ly2((jo80) eyh0Var.b, (jo80) eyh0Var.c, new lan1(x4oVar.e, (byte) 10), (i8h1) eyh0Var.d);
            x340Var.s0(ly2Var);
            objT = ly2Var;
        }
        ly2 ly2Var2 = (ly2) objT;
        pbo1 pbo1Var = pbo1.S0;
        af10 af10Var = x4oVar.a;
        d5o d5oVar = x4oVar.c;
        boolean zI = x340Var.i(d5oVar);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new ptj(1, d5oVar, quc0.class, "formatList", "formatList(Ljava/util/List;)Ljava/lang/String;", 0, (byte) 17);
            x340Var.s0(objT2);
        }
        pbo1Var.d(j5oVar, af10Var, (iu30) objT2, ly2Var2, iu30Var, x340Var, ((iIntValue << 6) & 57344) | ((iIntValue >> 3) & 14) | 196608);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        r6o r6oVar = (r6o) obj2;
        ((Number) obj5).intValue();
        el9 el9Var = this.b;
        pto1.e(new w460((lzn0) el9Var.g, true, true, false, (a1r0) el9Var.h, 40), (dvp) el9Var.i, (kko) el9Var.X, r6oVar.a, mqo1.A(r6oVar.b), null, ((bw2) el9Var.t).a, (b0k) obj4, 8);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        v6o v6oVar = (v6o) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(v6oVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            this.b.f(v6oVar, (qim0) null, iu30Var, x340Var2, ((i >> 3) & 14) | (i & 896));
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        String str = ((rao) obj2).a;
        if (str == null) {
            str = "";
        }
        String str2 = str;
        boolean z = (((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256;
        x340 x340Var2 = x340Var;
        Object objT = x340Var2.T();
        if (z || objT == fkj0.X) {
            objT = new qzn(iu30Var, (byte) 1);
            x340Var2.s0(objT);
        }
        guo1.d(0, str2, (Function0) objT, x340Var2, null, ((di4) this.b.e).i());
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i;
        wbo wboVar = (wbo) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        zbo zboVar = this.b;
        bpb1 bpb1Var = zboVar.g;
        if ((iIntValue & 48) == 0) {
            i = (x340Var.g(wboVar) ? 32 : 16) | iIntValue;
        } else {
            i = iIntValue;
        }
        if ((iIntValue & 384) == 0) {
            i |= x340Var.i(iu30Var) ? 256 : 128;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(i & 1, (i & 1169) != 1168)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = lmm.X0;
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT, x340Var2, 48);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                String str = (String) ven0Var.getValue();
                if (str != null) {
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, str);
                }
                ven0Var2.setValue(Boolean.TRUE);
            }
            ven0 ven0VarH = rwq.h(bpb1Var, x340Var2, 0);
            String str2 = (String) ven0VarH.getValue();
            boolean zG = x340Var2.g(ven0Var) | x340Var2.g(ven0VarH);
            Object objT3 = x340Var2.T();
            if (zG || objT3 == m4cVar) {
                objT3 = new zqe(ven0VarH, ven0Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            qxd0.C(str2, (Function0) objT3, x340Var2);
            eth.a(wboVar, (qim0) null, (ni20) null, "crossword_overview", apo.r(583125864, new nzd(zboVar, iu30Var, ven0VarH, (byte) 12), x340Var2), x340Var2, ((i >> 3) & 14) | 27648, 6);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    private final Object k(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        ldo ldoVar = this.b;
        edo edoVar = (gdo) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        boolean z = true;
        if (edoVar instanceof edo) {
            x340 x340Var2 = x340Var;
            x340Var2.i0(1575023658);
            edo edoVar2 = edoVar;
            ki0 ki0Var = edoVar2.e;
            String strG = ki0Var != null ? ki0Var.g() : null;
            if (strG == null || ihc1.y0(strG)) {
                x340Var2.r(false);
            } else {
                int i = (iIntValue & 896) ^ 384;
                boolean z2 = (i > 256 && x340Var2.g(iu30Var)) || (iIntValue & 384) == 256;
                Object objT = x340Var2.T();
                if (z2 || objT == m4cVar) {
                    objT = new qzn(iu30Var, (byte) 3);
                    x340Var2.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if ((i <= 256 || !x340Var2.g(iu30Var)) && (iIntValue & 384) != 256) {
                    z = false;
                }
                Object objT2 = x340Var2.T();
                if (z || objT2 == m4cVar) {
                    objT2 = new qzn(iu30Var, (byte) 4);
                    x340Var2.s0(objT2);
                }
                ldoVar.i(edoVar2, function0, (Function0) objT2, x340Var2, (iIntValue >> 3) & 14);
                x340Var2.r(false);
            }
        } else {
            if (!(edoVar instanceof fdo)) {
                throw p3d1.k(x340Var, 1436279661, false);
            }
            x340 x340Var3 = x340Var;
            x340Var3.i0(1436291714);
            fdo fdoVar = (fdo) edoVar;
            int i2 = (iIntValue & 896) ^ 384;
            boolean z3 = (i2 > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
            Object objT3 = x340Var3.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new qzn(iu30Var, (byte) 5);
                x340Var3.s0(objT3);
            }
            Function0 function1 = (Function0) objT3;
            if ((i2 <= 256 || !x340Var3.g(iu30Var)) && (iIntValue & 384) != 256) {
                z = false;
            }
            Object objT4 = x340Var3.T();
            if (z || objT4 == m4cVar) {
                objT4 = new qzn(iu30Var, (byte) 6);
                x340Var3.s0(objT4);
            }
            ldoVar.s(fdoVar, function1, (Function0) objT4, x340Var3, (iIntValue >> 3) & 14);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        b0k b0kVar = (b0k) obj4;
        ((Number) obj5).intValue();
        mod.b(oi7.a.a(this.b.c), apo.r(-530715123, new g1o(obj2, obj3, (byte) 4), b0kVar), b0kVar, 56);
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        xwa xwaVar;
        xwa xwaVar2;
        dgo dgoVar = (dgo) obj2;
        iu30 iu30Var = (iu30) obj3;
        int iIntValue = ((Number) obj5).intValue();
        m4c m4cVar = fkj0.X;
        res resVar = this.b;
        x340 x340Var = (b0k) obj4;
        boolean zI = x340Var.i(resVar);
        Object objT = x340Var.T();
        if (zI || objT == m4cVar) {
            objT = new fnn(resVar, (byte) 20);
            x340Var.s0(objT);
        }
        rih1 rih1Var = rih1.a;
        qxd0.i(rih1Var, (iu30) objT, x340Var);
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new xwa();
            x340Var.s0(objT2);
        }
        xwa xwaVar3 = (xwa) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = new xwa();
            x340Var.s0(objT3);
        }
        xwa xwaVar4 = (xwa) objT3;
        Object objT4 = x340Var.T();
        if (objT4 == m4cVar) {
            objT4 = new xwa();
            x340Var.s0(objT4);
        }
        xwa xwaVar5 = (xwa) objT4;
        boolean zI2 = x340Var.i(resVar) | ((((iIntValue & 896) ^ 384) > 256 && x340Var.g(iu30Var)) || (iIntValue & 384) == 256) | x340Var.i(xwaVar3) | x340Var.i(xwaVar4) | x340Var.i(xwaVar5);
        Object objT5 = x340Var.T();
        if (zI2 || objT5 == m4cVar) {
            xwaVar = xwaVar3;
            xwaVar2 = xwaVar5;
            el0 el0Var = new el0((byte) 18, resVar, iu30Var, xwaVar, xwaVar4, xwaVar2, (lnm) null);
            x340Var.s0(el0Var);
            objT5 = el0Var;
        } else {
            xwaVar = xwaVar3;
            xwaVar2 = xwaVar5;
        }
        qxd0.t(rih1Var, x340Var, (vu30) objT5);
        ((n4b) resVar.d).f(dgoVar, xwaVar, xwaVar2, xwaVar4, u291.d(nim0.a, 1.0f), x340Var, (iIntValue >> 3) & 14);
        return rih1Var;
    }

    private final Object o(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bvo bvoVar = (bvo) obj2;
        iu30 iu30Var = (iu30) obj3;
        x340 x340Var = (b0k) obj4;
        int iIntValue = ((Number) obj5).intValue();
        qj0 qj0Var = this.b;
        mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
        boolean z = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, x340Var, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, x340Var, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, x340Var, lljVar3);
        nko1.F(x340Var);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, x340Var, lljVar4);
        uvx uvxVar = (uvx) x340Var3.k(vvx.a);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarF);
        boolean z2 = (((iIntValue & 896) ^ 384) > 256 && x340Var3.g(iu30Var)) || (iIntValue & 384) == 256;
        Object objT = x340Var3.T();
        if (z2 || objT == fkj0.X) {
            objT = new qzn(iu30Var, (byte) 11);
            x340Var3.s0(objT);
        }
        jto1.b(qim0VarZ, uvxVar, null, false, null, null, new gbx(z50.c, (Function0) objT), null, apo.r(-1752002625, new cvo(bvoVar, (byte) 0), x340Var), null, null, null, null, null, null, apo.r(-1986384519, new cvo(bvoVar, (byte) 1), x340Var), x340Var, 100663360, 196608, 32444);
        cvx cvxVar2 = cbx.b(x340Var).b;
        cvx cvxVar3 = cbx.b(x340Var).b;
        qim0 qim0VarY = uyn1.y(nim0Var, 16.0f, 8.0f);
        gfh0 gfh0VarC = t1c.c(een.d, false);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(x340Var, qim0VarY);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, x340Var, lljVar);
        nko1.H(xos0VarM2, x340Var, lljVar2);
        i3a.l(iHashCode2, x340Var, lljVar3, x340Var);
        nko1.H(qim0VarE2, x340Var, lljVar4);
        otw.c((w4f) qj0Var.e, new s4f(bvoVar.a, bvoVar.d, bvoVar.b, bvoVar.e, bvoVar.c), (qim0) null, (ipb1) null, x340Var, 0, 12);
        x340Var3.r(true);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        vwq vwqVar = (vwq) obj2;
        ((Number) obj5).intValue();
        vnb1 vnb1Var = vwqVar.b;
        uho uhoVar = vwqVar.a;
        jd6 jd6Var = this.b;
        x340 x340Var = (b0k) obj4;
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = gio1.b(jd6.j(uhoVar.a, vnb1Var));
            x340Var.s0(objT);
        }
        wen0 wen0Var = (wen0) objT;
        Object objT2 = x340Var.T();
        if (objT2 == m4cVar) {
            objT2 = new xwq(wen0Var, jd6Var);
            x340Var.s0(objT2);
        }
        xwq xwqVar = (xwq) objT2;
        Object objT3 = x340Var.T();
        if (objT3 == m4cVar) {
            objT3 = new xho(xwqVar);
            x340Var.s0(objT3);
        }
        otw.c((xho) objT3, uhoVar, (qim0) null, (ipb1) null, x340Var, 8, 12);
        boolean zI = x340Var.i(wen0Var) | x340Var.i(jd6Var) | x340Var.i(vwqVar);
        Object objT4 = x340Var.T();
        if (zI || objT4 == m4cVar) {
            objT4 = new gke(wen0Var, jd6Var, vwqVar, (lnm) null, (byte) 21);
            x340Var.s0(objT4);
        }
        qxd0.s(uhoVar, vnb1Var, (vu30) objT4, x340Var);
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) throws NoWhenBranchMatchedException {
        boolean z;
        String strK;
        String strN0;
        dzo1 dzo1Var;
        int i;
        List listSingletonList;
        String strN1;
        bln blnVar;
        byte b = this.a;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        rih1 rih1Var = rih1.a;
        ldo ldoVar = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                cfm cfmVar = (cfm) ldoVar;
                tem temVar = (tem) obj2;
                x340 x340Var = (b0k) obj4;
                int iIntValue = ((Number) obj5).intValue();
                if ((iIntValue & 48) == 0) {
                    iIntValue |= (iIntValue & 64) == 0 ? x340Var.g(temVar) : x340Var.i(temVar) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 1041) != 1040)) {
                    String strO0 = cwl1.o0(x340Var2, 2131954463);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG = x340Var2.g(strO0);
                    Object objT = x340Var2.T();
                    if (zG || objT == fkj0.X) {
                        objT = new xfa(strO0, (byte) 2);
                        x340Var2.s0(objT);
                    }
                    cfmVar.g(temVar, bmq0.L(s161.b(qim0VarF, false, (iu30) objT), k1o1.q(x340Var2), (g6o0) null), apo.r(-1843592642, new zem(cfmVar, (byte) 1), x340Var2), x340Var2, ((iIntValue >> 3) & 14) | 384);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                iu30 iu30Var = (iu30) obj3;
                x340 x340Var3 = (b0k) obj4;
                int iIntValue2 = ((Number) obj5).intValue();
                if ((iIntValue2 & 384) == 0) {
                    iIntValue2 |= x340Var3.i(iu30Var) ? 256 : 128;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 1153) != 1152)) {
                    zv31 zv31Var = ((udm) ((tm) ldoVar).d).a.a;
                    boolean z2 = (iIntValue2 & 896) == 256;
                    Object objT2 = x340Var4.T();
                    if (z2 || objT2 == fkj0.X) {
                        objT2 = new jzk(iu30Var, (byte) 16);
                        x340Var4.s0(objT2);
                    }
                    jzn1.b(zv31Var, (Function0) objT2, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                ((qlb) ldoVar).f((rem) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 3:
                ((lfm) ldoVar).e((kem) obj2, (iu30) obj3, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 126);
                return rih1Var;
            case 4:
                ksw kswVar = (ksw) obj;
                ohm ohmVar = (ohm) obj2;
                iu30 iu30Var2 = (iu30) obj3;
                x340 x340Var5 = (b0k) obj4;
                int iIntValue3 = ((Number) obj5).intValue();
                jhm jhmVar = ohmVar.a;
                String str = jhmVar.e;
                if (str == null) {
                    x340 x340Var6 = x340Var5;
                    x340Var6.i0(1056664180);
                    Integer num = jhmVar.d;
                    if (num == null) {
                        x340Var6.i0(1056664179);
                        z = false;
                        x340Var6.r(false);
                        strK = null;
                    } else {
                        z = false;
                        strK = kk0.k(x340Var6, 1056664180, num, x340Var6, false);
                    }
                    x340Var6.r(z);
                    str = strK;
                } else {
                    z = false;
                    x340 x340Var7 = x340Var5;
                    x340Var7.i0(865369035);
                    x340Var7.r(false);
                }
                if (str == null) {
                    str = "";
                }
                vrv0 vrv0Var = ohmVar.c;
                if (vrv0Var == null) {
                    x340 x340Var8 = x340Var5;
                    x340Var8.i0(1056727357);
                    x340Var8.r(z);
                } else {
                    x340 x340Var9 = x340Var5;
                    x340Var9.i0(1056727358);
                    boolean zI = x340Var9.i(vrv0Var);
                    Object objT3 = x340Var9.T();
                    if (zI || objT3 == fkj0.X) {
                        objT3 = new j3m(vrv0Var, (byte) 4);
                        x340Var9.s0(objT3);
                    }
                    aym.f(kswVar, 0, (Function0) objT3, x340Var9, iIntValue3 & 14, 1);
                    x340Var9.r(false);
                }
                vvx.a(zrj.X0, apo.r(1859610595, new sxj(jhmVar, ohmVar, iu30Var2, str, (qhm) ldoVar), x340Var5), x340Var5, 48);
                return rih1Var;
            case 5:
                x340 x340Var10 = (b0k) obj4;
                ((Number) obj5).intValue();
                String str2 = ((tmm) obj2).a;
                if (str2.length() > 0) {
                    x340 x340Var11 = x340Var10;
                    x340Var11.i0(565066804);
                    ((hz5) ldoVar).e(str2, x340Var11, 0);
                    x340Var11.r(false);
                } else {
                    x340 x340Var12 = x340Var10;
                    x340Var12.i0(565104283);
                    x340Var12.r(false);
                }
                return rih1Var;
            case 6:
                boh0 boh0Var = (boh0) obj2;
                iu30 iu30Var3 = (iu30) obj3;
                x340 x340Var13 = (b0k) obj4;
                int iIntValue4 = ((Number) obj5).intValue();
                boolean z3 = (((iIntValue4 & 896) ^ 384) > 256 && x340Var13.g(iu30Var3)) || (iIntValue4 & 384) == 256;
                x340 x340Var14 = x340Var13;
                Object objT4 = x340Var14.T();
                if (z3 || objT4 == fkj0.X) {
                    objT4 = new jzk(iu30Var3, (byte) 19);
                    x340Var14.s0(objT4);
                }
                q3p1.b(0, 1, (Function0) objT4, x340Var14, false);
                sv71.a(48, 1, apo.r(605907336, new drm(boh0Var, iu30Var3, (pt) ldoVar), x340Var14), x340Var14, (qim0) null);
                return rih1Var;
            case 7:
                lrm lrmVar = (nrm) obj2;
                iu30 iu30Var4 = (iu30) obj3;
                x340 x340Var15 = (b0k) obj4;
                int iIntValue5 = ((Number) obj5).intValue();
                m4c m4cVar = fkj0.X;
                res resVar = (res) ldoVar;
                ven0 ven0VarG = rwq.g((mr20) resVar.f, new th61((String) null, false, (yg8) null, (String) null, false, false, (zcs0) null, (String) null, (km) null, 4095), null, x340Var15, 0, 2);
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var15).b;
                qim0 qim0VarZ = uyn1.z(0.0f, 4.0f, 1, qim0VarF2);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var15, 0);
                x340 x340Var16 = x340Var15;
                int iHashCode = Long.hashCode(x340Var16.T);
                xos0 xos0VarM = x340Var16.m();
                qim0 qim0VarE = zr7.E(x340Var15, qim0VarZ);
                hzj.A.getClass();
                x340 x340Var17 = x340Var15;
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
                nko1.H(jw31VarA, x340Var15, y580.O0);
                nko1.H(xos0VarM, x340Var15, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var15, y580.R0);
                nko1.F(x340Var15);
                nko1.H(qim0VarE, x340Var15, y580.Y);
                int i2 = (iIntValue5 & 896) ^ 384;
                boolean z4 = (i2 > 256 && x340Var17.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                Object objT5 = x340Var17.T();
                if (z4 || objT5 == m4cVar) {
                    objT5 = new jzk(iu30Var4, (byte) 20);
                    x340Var17.s0(objT5);
                }
                dzo1 dzo1Var2 = z50.c;
                gbx gbxVar = new gbx(dzo1Var2, (Function0) objT5);
                ldx ldxVar = ldx.c;
                wro1.h(gbxVar, ldxVar, null, null, null, null, false, null, null, bgi.a, x340Var15, 0, 6, 1020);
                if (u890.j(lrmVar.getSender(), w4i1.f)) {
                    x340Var17.i0(425036843);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    op71.g(x340Var15, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(425113506);
                    String str3 = lrmVar.getSender().c;
                    if (str3 == null) {
                        str3 = "";
                    }
                    bmq0.a(Uri.parse(str3), (qim0) null, hcx.b, lrmVar.getSender().a, lrmVar.getSender().b, 0L, 0L, false, x340Var15, 384, 226);
                    if (u890.j(lrmVar.getSender().a, ((th61) ven0VarG.getValue()).a)) {
                        x340Var17.i0(425456521);
                        strN0 = cwl1.n0(2131958399, new Object[]{lrmVar.getSender().b}, x340Var15);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(425570694);
                        x340Var17.r(false);
                        strN0 = lrmVar.getSender().b;
                    }
                    String str4 = strN0;
                    lee1 lee1Var = cbx.d(x340Var15).h;
                    long j = cbx.a(x340Var15).b.a;
                    cjc0 cjc0Var = new cjc0(1);
                    if (1.0f <= 0.0d) {
                        of80.a("invalid weight; must be greater than zero");
                    }
                    wnb0 wnb0Var = new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
                    cvx cvxVar2 = cbx.b(x340Var15).b;
                    uwo1.e(str4, uyn1.z(8.0f, 0.0f, 2, wnb0Var), lee1Var, j, null, null, 2, false, cjc0Var, 0, null, x340Var15, 0, 0, 1712);
                    x340Var17.r(false);
                }
                boolean z5 = lrmVar instanceof mrm;
                if (z5) {
                    x340Var17.i0(426011824);
                    boolean z6 = (i2 > 256 && x340Var17.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    Object objT6 = x340Var17.T();
                    if (z6 || objT6 == m4cVar) {
                        objT6 = new jzk(iu30Var4, (byte) 21);
                        x340Var17.s0(objT6);
                    }
                    dzo1Var = dzo1Var2;
                    i = 0;
                    wro1.h(new gbx(dzo1Var, (Function0) objT6), ldxVar, null, null, null, null, false, null, null, bgi.b, x340Var15, 0, 6, 1020);
                    x340Var17.r(false);
                } else {
                    dzo1Var = dzo1Var2;
                    i = 0;
                    x340Var17.i0(426388536);
                    x340Var17.r(false);
                }
                if (lrmVar instanceof lrm) {
                    listSingletonList = lrmVar.e;
                } else {
                    if (!z5) {
                        eg.o();
                        return null;
                    }
                    listSingletonList = Collections.singletonList(((mrm) lrmVar).e);
                }
                List list = listSingletonList;
                ArrayList arrayList = new ArrayList();
                for (Object obj6 : list) {
                    if (((vy30) obj6).d == 1) {
                        arrayList.add(obj6);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj7 : list) {
                    if (((vy30) obj7).d == 2) {
                        arrayList2.add(obj7);
                    }
                }
                if (arrayList.isEmpty() && arrayList2.isEmpty()) {
                    x340Var17.i0(427278360);
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(426805548);
                    zru zruVar = (zru) resVar.e;
                    ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(new wru(((vy30) it.next()).a));
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList2, 10));
                    Iterator it2 = arrayList2.iterator();
                    while (it2.hasNext()) {
                        arrayList4.add(new yru(((vy30) it2.next()).a));
                    }
                    boolean z7 = (i2 > 256 && x340Var17.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    Object objT7 = x340Var17.T();
                    if (z7 || objT7 == m4cVar) {
                        objT7 = new jzk(iu30Var4, (byte) 22);
                        x340Var17.s0(objT7);
                    }
                    otw.c(zruVar, new xru(arrayList3, arrayList4, (Function0) objT7), (qim0) null, (ipb1) null, x340Var15, 0, 12);
                    x340Var17.r(false);
                }
                if (lrmVar.y() != null) {
                    x340Var17.i0(427331339);
                    boolean z8 = (i2 > 256 && x340Var17.g(iu30Var4)) || (iIntValue5 & 384) == 256;
                    Object objT8 = x340Var17.T();
                    if (z8 || objT8 == m4cVar) {
                        objT8 = new jzk(iu30Var4, (byte) 23);
                        x340Var17.s0(objT8);
                    }
                    wro1.h(new gbx(dzo1Var, (Function0) objT8), ldx.c, null, null, null, null, false, null, null, bgi.c, x340Var15, i, 6, 1020);
                    x340Var17.r(false);
                } else {
                    x340Var17.i0(427712856);
                    x340Var17.r(false);
                }
                x340Var17.r(true);
                return rih1Var;
            case 8:
                uum uumVar = (uum) obj2;
                x340 x340Var18 = (b0k) obj4;
                ((Number) obj5).intValue();
                umf0 umf0Var = (umf0) ldoVar;
                long jA = uumVar.a();
                Calendar calendarD = ((yqg) umf0Var.e).d();
                calendarD.setTimeInMillis(jA * 1000);
                TimeZone timeZone = TimeZone.getTimeZone(calendarD.getTimeZone().getID());
                long timeInMillis = calendarD.getTimeInMillis();
                Locale locale = (Locale) umf0Var.d;
                android.icu.util.Calendar calendar = android.icu.util.Calendar.getInstance(timeZone, locale);
                calendar.setTimeInMillis(timeInMillis);
                String str5 = DateFormat.getDateInstance(3, locale).format(calendar.getTime());
                uwr uwrVar2 = cbx.a;
                lee1 lee1Var2 = cbx.d(x340Var18).j;
                long j2 = cbx.a(x340Var18).b.d;
                if (uumVar instanceof sum) {
                    x340 x340Var19 = x340Var18;
                    x340Var19.i0(-1191635137);
                    strN1 = cwl1.n0(2131954571, new Object[]{str5}, x340Var19);
                    x340Var19.r(false);
                } else {
                    if (!(uumVar instanceof tum)) {
                        throw p3d1.k(x340Var18, -1191636421, false);
                    }
                    x340 x340Var20 = x340Var18;
                    x340Var20.i0(-1191631936);
                    strN1 = cwl1.n0(2131954573, new Object[]{str5}, x340Var20);
                    x340Var20.r(false);
                }
                uwo1.e(strN1, null, lee1Var2, j2, null, null, 0, false, null, 0, null, x340Var18, 0, 0, 2034);
                return rih1Var;
            case 9:
                ywm ywmVar = (ywm) obj2;
                iu30 iu30Var5 = (iu30) obj3;
                x340 x340Var21 = (b0k) obj4;
                int iIntValue6 = ((Number) obj5).intValue();
                int i3 = (iIntValue6 & 48) == 0 ? iIntValue6 | ((iIntValue6 & 64) == 0 ? x340Var21.g(ywmVar) : x340Var21.i(ywmVar) ? 32 : 16) : iIntValue6;
                if ((iIntValue6 & 384) == 0) {
                    i3 |= x340Var21.i(iu30Var5) ? 256 : 128;
                }
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(i3 & 1, (i3 & 1169) != 1168)) {
                    nm1 nm1Var = (nm1) ldoVar;
                    fxm.c(ywmVar, (d0r) nm1Var.b, (o3r) nm1Var.h, iu30Var5, x340Var22, ((i3 << 3) & 7168) | ((i3 >> 3) & 14));
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 10:
                mxm mxmVar = (mxm) obj2;
                iu30 iu30Var6 = (iu30) obj3;
                x340 x340Var23 = (b0k) obj4;
                int iIntValue7 = ((Number) obj5).intValue();
                int i4 = (iIntValue7 & 48) == 0 ? iIntValue7 | ((iIntValue7 & 64) == 0 ? x340Var23.g(mxmVar) : x340Var23.i(mxmVar) ? 32 : 16) : iIntValue7;
                if ((iIntValue7 & 384) == 0) {
                    i4 |= x340Var23.i(iu30Var6) ? 256 : 128;
                }
                x340 x340Var24 = x340Var23;
                if (x340Var24.Y(i4 & 1, (i4 & 1169) != 1168)) {
                    nho1.d(mxmVar, (qlb) ((nm1) ldoVar).g, iu30Var6, x340Var24, (i4 & 896) | ((i4 >> 3) & 14));
                } else {
                    x340Var24.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                jym jymVar = (jym) obj2;
                iu30 iu30Var7 = (iu30) obj3;
                x340 x340Var25 = (b0k) obj4;
                int iIntValue8 = ((Number) obj5).intValue();
                el9 el9Var = (el9) ldoVar;
                int i5 = (iIntValue8 & 48) == 0 ? iIntValue8 | ((iIntValue8 & 64) == 0 ? x340Var25.g(jymVar) : x340Var25.i(jymVar) ? 32 : 16) : iIntValue8;
                if ((iIntValue8 & 384) == 0) {
                    i5 |= x340Var25.i(iu30Var7) ? 256 : 128;
                }
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(i5 & 1, (i5 & 1169) != 1168)) {
                    Object objT9 = x340Var26.T();
                    m4c m4cVar2 = fkj0.X;
                    if (objT9 == m4cVar2) {
                        objT9 = qxd0.M(o6x.a, x340Var26);
                        x340Var26.s0(objT9);
                    }
                    c9n c9nVar = (c9n) objT9;
                    iac0 iac0Var = (iac0) x340Var26.k(jfe0.a);
                    Object objT10 = x340Var26.T();
                    if (objT10 == m4cVar2) {
                        objT10 = ((xyf1) el9Var.i).a(el9Var.b, iac0Var, new kkw0((ttm0) ((ynb0) el9Var.h).get(), c9nVar), (njm) el9Var.g, (r6h1) el9Var.t);
                        x340Var26.s0(objT10);
                    }
                    oho1.b(jymVar, (tyq) objT10, el9Var.b, iu30Var7, x340Var26, ((i5 << 3) & 7168) | ((i5 >> 3) & 14));
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                sio1.b((i2n) obj2, (res) ((qj0) ldoVar).e, null, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 13:
                llj lljVar = y580.Y;
                llj lljVar2 = y580.R0;
                llj lljVar3 = y580.N0;
                llj lljVar4 = y580.O0;
                bln blnVar2 = (bln) obj2;
                iu30 iu30Var8 = (iu30) obj3;
                x340 x340Var27 = (b0k) obj4;
                int iIntValue9 = ((Number) obj5).intValue();
                era eraVar = een.P0;
                m4c m4cVar3 = fkj0.X;
                gln glnVar = (gln) ldoVar;
                int i6 = (iIntValue9 & 48) == 0 ? iIntValue9 | (x340Var27.g(blnVar2) ? 32 : 16) : iIntValue9;
                if ((iIntValue9 & 384) == 0) {
                    i6 |= x340Var27.i(iu30Var8) ? 256 : 128;
                }
                x340 x340Var28 = x340Var27;
                boolean zY = x340Var28.Y(i6 & 1, (i6 & 1169) != 1168);
                j06 j06Var = x340Var28.a;
                rih1 rih1Var2 = rih1.a;
                if (!zY) {
                    x340Var28.b0();
                    return rih1Var2;
                }
                if (!(blnVar2 instanceof zkn)) {
                    return rih1Var2;
                }
                zkn zknVar = (zkn) blnVar2;
                int iC = l1d.C(zknVar.h);
                f36 f36Var = h36.c;
                if (iC == 0) {
                    x340Var28.i0(1952586761);
                    qim0 qim0VarC = u291.c(nim0Var, 1.0f);
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var28, 0);
                    int iHashCode2 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM2 = x340Var28.m();
                    qim0 qim0VarE2 = zr7.E(x340Var28, qim0VarC);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(mbhVarA, x340Var28, lljVar4);
                    nko1.H(xos0VarM2, x340Var28, lljVar3);
                    x0d.q(iHashCode2, x340Var28, lljVar2, x340Var28);
                    nko1.H(qim0VarE2, x340Var28, lljVar);
                    epo1.e(zknVar, iu30Var8, x340Var28, (i6 >> 3) & 126);
                    qim0 qim0VarN = anm1.N("loading_element", u291.d(nim0Var, 1.0f));
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode3 = Long.hashCode(x340Var28.T);
                    xos0 xos0VarM3 = x340Var28.m();
                    qim0 qim0VarE3 = zr7.E(x340Var28, qim0VarN);
                    x340Var28.m0();
                    if (x340Var28.S) {
                        x340Var28.l(n4kVar);
                    } else {
                        x340Var28.v0();
                    }
                    nko1.H(gfh0VarC, x340Var28, lljVar4);
                    nko1.H(xos0VarM3, x340Var28, lljVar3);
                    x0d.q(iHashCode3, x340Var28, lljVar2, x340Var28);
                    nko1.H(qim0VarE3, x340Var28, lljVar);
                    xto1.e(null, 5, 0L, 0L, x340Var28, 48, 13);
                    us71.m(x340Var28, true, true, false);
                    return rih1Var2;
                }
                if (iC == 1) {
                    x340Var28.i0(401620539);
                    Object objT11 = x340Var28.T();
                    if (objT11 == m4cVar3) {
                        blnVar = blnVar2;
                        objT11 = glnVar.g.a(glnVar.X, new fln(blnVar, glnVar, (byte) 1));
                        x340Var28.s0(objT11);
                    } else {
                        blnVar = blnVar2;
                    }
                    v361 v361Var = (v361) objT11;
                    Object objT12 = x340Var28.T();
                    if (objT12 == m4cVar3) {
                        m5p m5pVar = glnVar.Y;
                        AtomicReferenceArray atomicReferenceArray = p6r0.e;
                        objT12 = m5pVar.a(yon1.C0().a, zknVar.a, new fln(blnVar, glnVar, (byte) 0));
                        x340Var28.s0(objT12);
                    }
                    fm50 fm50Var = (fm50) objT12;
                    Object objT13 = x340Var28.T();
                    if (objT13 == m4cVar3) {
                        r6h1 r6h1Var = r6h1.c;
                        objT13 = new wuk0();
                        x340Var28.s0(objT13);
                    }
                    wuk0 wuk0Var = (wuk0) objT13;
                    Object objT14 = x340Var28.T();
                    if (objT14 == m4cVar3) {
                        objT14 = wuk0Var.b();
                        x340Var28.s0(objT14);
                    }
                    r6h1 r6h1Var2 = (r6h1) objT14;
                    boolean zI2 = x340Var28.i(r6h1Var2);
                    Object objT15 = x340Var28.T();
                    if (zI2 || objT15 == m4cVar3) {
                        objT15 = new cb1(r6h1Var2, (byte) 15);
                        x340Var28.s0(objT15);
                    }
                    dgo1.c("createGroupPage", (iu30) objT15, apo.r(-2010193071, new sxj(blnVar, glnVar, iu30Var8, v361Var, fm50Var, (byte) 14), x340Var28), x340Var28, 390);
                    x340Var28.r(false);
                    return rih1Var2;
                }
                if (iC != 2) {
                    throw p3d1.k(x340Var28, 1952587405, false);
                }
                x340Var28.i0(1952599076);
                qim0 qim0VarC2 = u291.c(nim0Var, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var28, 0);
                int iHashCode4 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM4 = x340Var28.m();
                qim0 qim0VarE4 = zr7.E(x340Var28, qim0VarC2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                nko1.H(mbhVarA2, x340Var28, lljVar4);
                nko1.H(xos0VarM4, x340Var28, lljVar3);
                x0d.q(iHashCode4, x340Var28, lljVar2, x340Var28);
                nko1.H(qim0VarE4, x340Var28, lljVar);
                epo1.e(zknVar, iu30Var8, x340Var28, (i6 >> 3) & 126);
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var28).b;
                qim0 qim0VarN2 = anm1.N("error_element", uyn1.x(qim0VarD, 8.0f));
                gfh0 gfh0VarC2 = t1c.c(een.X, false);
                int iHashCode5 = Long.hashCode(x340Var28.T);
                xos0 xos0VarM5 = x340Var28.m();
                qim0 qim0VarE5 = zr7.E(x340Var28, qim0VarN2);
                x340Var28.m0();
                if (x340Var28.S) {
                    x340Var28.l(n4kVar);
                } else {
                    x340Var28.v0();
                }
                nko1.H(gfh0VarC2, x340Var28, lljVar4);
                nko1.H(xos0VarM5, x340Var28, lljVar3);
                x0d.q(iHashCode5, x340Var28, lljVar2, x340Var28);
                nko1.H(qim0VarE5, x340Var28, lljVar);
                z6q z6qVar = glnVar.e;
                boolean z9 = (i6 & 896) == 256;
                Object objT16 = x340Var28.T();
                if (z9 || objT16 == m4cVar3) {
                    objT16 = new jzk(iu30Var8, (byte) 27);
                    x340Var28.s0(objT16);
                }
                otw.c(z6qVar.a((Function0) objT16), rih1Var2, (qim0) null, (ipb1) null, x340Var28, 48, 12);
                us71.m(x340Var28, true, true, false);
                return rih1Var2;
            case 14:
                emn emnVar = (emn) obj2;
                x340 x340Var29 = (b0k) obj4;
                ((Number) obj5).intValue();
                if (emnVar instanceof cmn) {
                    uwr uwrVar4 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var29).b;
                    qim0 qim0VarZ2 = uyn1.z(0.0f, 8.0f, 1, nim0Var);
                    gmn gmnVar = (gmn) ldoVar;
                    mbh mbhVarA3 = jbh.a(h36.c, een.P0, x340Var29, 0);
                    x340 x340Var30 = x340Var29;
                    int iHashCode6 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM6 = x340Var30.m();
                    qim0 qim0VarE6 = zr7.E(x340Var29, qim0VarZ2);
                    hzj.A.getClass();
                    x340 x340Var31 = x340Var29;
                    if (x340Var31.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var31.m0();
                    if (x340Var31.S) {
                        x340Var31.l(n4kVar);
                    } else {
                        x340Var31.v0();
                    }
                    nko1.H(mbhVarA3, x340Var29, y580.O0);
                    nko1.H(xos0VarM6, x340Var29, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode6), x340Var29, y580.R0);
                    nko1.F(x340Var29);
                    nko1.H(qim0VarE6, x340Var29, y580.Y);
                    x340Var31.i0(-809120098);
                    cmn cmnVar = (cmn) emnVar;
                    int i7 = 0;
                    for (Object obj8 : cmnVar.b) {
                        int i8 = i7 + 1;
                        if (i7 < 0) {
                            p7h.T();
                            throw null;
                        }
                        mmn mmnVar = (mmn) obj8;
                        ldo ldoVar2 = (ldo) gmnVar.e;
                        zm81 zm81Var = cmnVar.a;
                        tm81 tm81Var = mmnVar.f;
                        otw.c(ldoVar2, new xmn(mmnVar, i7, tm81Var != null ? new vrv0(zm81Var, tm81Var) : null, rnn.a), (qim0) null, (ipb1) null, x340Var29, 0, 12);
                        i7 = i8;
                    }
                    x340Var31.r(false);
                    x340Var31.r(true);
                }
                return rih1Var;
            case 15:
                return a(obj, obj2, obj3, obj4, obj5);
            case 16:
                ((dyn) ldoVar).e((cyn) obj2, (b0k) obj4, (((Number) obj5).intValue() >> 3) & 14);
                return rih1Var;
            case 17:
                return d(obj, obj2, obj3, obj4, obj5);
            case 18:
                return e(obj, obj2, obj3, obj4, obj5);
            case 19:
                return f(obj, obj2, obj3, obj4, obj5);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return g(obj, obj2, obj3, obj4, obj5);
            case 21:
                return h(obj, obj2, obj3, obj4, obj5);
            case 22:
                return i(obj, obj2, obj3, obj4, obj5);
            case 23:
                return j(obj, obj2, obj3, obj4, obj5);
            case 24:
                return k(obj, obj2, obj3, obj4, obj5);
            case 25:
                return m(obj, obj2, obj3, obj4, obj5);
            case 26:
                return n(obj, obj2, obj3, obj4, obj5);
            case 27:
                return o(obj, obj2, obj3, obj4, obj5);
            case 28:
                return p(obj, obj2, obj3, obj4, obj5);
            default:
                b0k b0kVar = (b0k) obj4;
                ((Number) obj5).intValue();
                nyx.a(2, (wux) null, apo.r(1433661764, new won((x5r) obj2, (iu30) obj3, ldoVar, (byte) 5), b0kVar), b0kVar, 3078, 6);
                return rih1Var;
        }
    }
}
