package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import com.spotify.allboarding.allboardingimpl.AllboardingActivity;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ve3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ve3(a7a1 a7a1Var, rm6 rm6Var) {
        super(1);
        this.a = (byte) 27;
        this.b = a7a1Var;
    }

    /* JADX WARN: Code duplicated, block: B:106:0x0490  */
    /* JADX WARN: Code duplicated, block: B:186:0x0632  */
    /* JADX WARN: Code duplicated, block: B:188:0x0636  */
    /* JADX WARN: Code duplicated, block: B:190:0x063a  */
    /* JADX WARN: Code duplicated, block: B:191:0x063d  */
    /* JADX WARN: Code duplicated, block: B:194:0x064c  */
    /* JADX WARN: Code duplicated, block: B:197:0x0658  */
    /* JADX WARN: Code duplicated, block: B:200:0x0669  */
    /* JADX WARN: Code duplicated, block: B:201:0x066b  */
    /* JADX WARN: Code duplicated, block: B:204:0x0672 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:208:0x067d  */
    /* JADX WARN: Code duplicated, block: B:211:0x0687  */
    /* JADX WARN: Code duplicated, block: B:212:0x068a  */
    /* JADX WARN: Code duplicated, block: B:215:0x0694  */
    /* JADX WARN: Code duplicated, block: B:216:0x0697  */
    /* JADX WARN: Code duplicated, block: B:219:0x069d  */
    /* JADX WARN: Code duplicated, block: B:221:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:224:0x06bf  */
    /* JADX WARN: Code duplicated, block: B:237:0x0746  */
    public final Object invoke(Object obj) {
        ArrayList arrayList;
        o1v o1vVar;
        o1v o1vVar2;
        k4m k4mVar;
        hll hllVarA;
        boolean zContains;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        qez0 qez0Var;
        List list;
        ezc huzVar;
        bxt bxtVar;
        grn1 llg0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = null;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                mf20 mf20Var = new mf20(z561.T(ye3.b, new fp20(new i46(((ufr0) o7h.q0(((vfr0) ((tcr0) obj3).a(qcr0.a)).c)).c, (byte) 1), we3.c, new cix0((byte) 16))));
                while (mf20Var.hasNext()) {
                    Object next = mf20Var.next();
                    if (u890.j(((eer0) next).a, str)) {
                        obj2 = next;
                        eer0 eer0Var = (eer0) obj2;
                        return Boolean.valueOf(eer0Var != null ? eer0Var.c : false);
                    }
                }
                eer0 eer0Var2 = (eer0) obj2;
                return Boolean.valueOf(eer0Var2 != null ? eer0Var2.c : false);
            case 1:
                hwq hwqVar = (hwq) obj;
                bg3 bg3Var = (bg3) obj3;
                j7e0 j7e0Var = hwqVar.g;
                if (!(j7e0Var instanceof j7e0)) {
                    return new eg3(null, null, null, null, false, false, false, false, false, null, 0, null, null, false, 65535);
                }
                zuc0 zuc0Var = j7e0Var.a;
                fjf1 fjf1Var = zuc0Var.p;
                fjf1 fjf1Var2 = fjf1Var instanceof fjf1 ? fjf1Var : null;
                String str2 = zuc0Var.i;
                String str3 = (String) zuc0Var.g.get("discNumber");
                if (str3 == null) {
                    str3 = "";
                }
                String str4 = str3.length() > 0 ? String.format(((Context) bg3Var.e).getString(2131952175), Arrays.copyOf(new Object[]{str3}, 1)) : "";
                if (fjf1Var2 != null) {
                    List list2 = fjf1Var2.b;
                    ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((yif1) it.next()).a);
                    }
                    arrayList = new ArrayList();
                    for (Object obj4 : arrayList2) {
                        if (((String) obj4).length() > 0) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = z6x.a;
                }
                ArrayList arrayList3 = arrayList;
                fbp1 fbp1Var = zuc0Var.n;
                if (!(fbp1Var instanceof mwp0)) {
                    boolean z5 = fbp1Var instanceof uwp0;
                    o1v o1vVar3 = o1v.a;
                    if (!z5 && !(fbp1Var instanceof qwp0) && !(fbp1Var instanceof owp0)) {
                        if (fbp1Var instanceof wwp0) {
                            o1vVar = o1v.b;
                        } else {
                            if (!(fbp1Var instanceof kwp0)) {
                                if (!(fbp1Var instanceof swp0)) {
                                    if (!(fbp1Var instanceof iwp0)) {
                                        eg.o();
                                        return null;
                                    }
                                    o1vVar = o1v.d;
                                }
                                if (zuc0Var.c()) {
                                    k4mVar = k4m.a;
                                } else if (zuc0Var.k) {
                                    k4mVar = k4m.b;
                                } else {
                                    k4mVar = k4m.d;
                                }
                                k4m k4mVar2 = k4mVar;
                                hllVarA = zuc0Var.q.a(hll.class);
                                if (hllVarA != null || (list = hllVarA.d) == null) {
                                    zContains = false;
                                } else {
                                    zContains = list.contains(fll.c);
                                }
                                boolean z6 = hwqVar.b;
                                Set set = s4b1.f;
                                if (uic.x(zuc0Var.c).c == blc0.ti) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                if (zuc0Var.f() || (z && zuc0Var.e())) {
                                    z2 = false;
                                } else {
                                    z2 = true;
                                }
                                if (zuc0Var.b() != ltt0.b) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (zuc0Var.b() == ltt0.c) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (zuc0Var.j) {
                                    qez0Var = new qez0(new pk1(qk1.b, false, (String) null, (String) null, (j7p1) null, 30));
                                } else {
                                    qez0Var = tez0.a;
                                }
                                return new eg3(str2, arrayList3, o1vVar2, k4mVar2, zContains, z6, z2, z3, z4, qez0Var, hwqVar.a, zuc0Var, str4, fjf1Var2 != null ? fjf1Var2.h : false, 40960);
                            }
                            o1vVar = o1v.c;
                        }
                    }
                    o1vVar2 = o1vVar3;
                    if (zuc0Var.c()) {
                        k4mVar = k4m.a;
                    } else if (zuc0Var.k) {
                        k4mVar = k4m.b;
                    } else {
                        k4mVar = k4m.d;
                    }
                    k4m k4mVar3 = k4mVar;
                    hllVarA = zuc0Var.q.a(hll.class);
                    if (hllVarA != null) {
                        zContains = false;
                    } else {
                        zContains = false;
                    }
                    boolean z7 = hwqVar.b;
                    Set set2 = s4b1.f;
                    if (uic.x(zuc0Var.c).c == blc0.ti) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (zuc0Var.f()) {
                        z2 = false;
                    } else {
                        z2 = false;
                    }
                    if (zuc0Var.b() != ltt0.b) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (zuc0Var.b() == ltt0.c) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (zuc0Var.j) {
                        qez0Var = new qez0(new pk1(qk1.b, false, (String) null, (String) null, (j7p1) null, 30));
                    } else {
                        qez0Var = tez0.a;
                    }
                    return new eg3(str2, arrayList3, o1vVar2, k4mVar3, zContains, z7, z2, z3, z4, qez0Var, hwqVar.a, zuc0Var, str4, fjf1Var2 != null ? fjf1Var2.h : false, 40960);
                }
                o1vVar = o1v.e;
                o1vVar2 = o1vVar;
                if (zuc0Var.c()) {
                    k4mVar = k4m.a;
                } else if (zuc0Var.k) {
                    k4mVar = k4m.b;
                } else {
                    k4mVar = k4m.d;
                }
                k4m k4mVar4 = k4mVar;
                hllVarA = zuc0Var.q.a(hll.class);
                if (hllVarA != null) {
                    zContains = false;
                } else {
                    zContains = false;
                }
                boolean z8 = hwqVar.b;
                Set set3 = s4b1.f;
                if (uic.x(zuc0Var.c).c == blc0.ti) {
                    z = true;
                } else {
                    z = false;
                }
                if (zuc0Var.f()) {
                    z2 = false;
                } else {
                    z2 = false;
                }
                if (zuc0Var.b() != ltt0.b) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (zuc0Var.b() == ltt0.c) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (zuc0Var.j) {
                    qez0Var = new qez0(new pk1(qk1.b, false, (String) null, (String) null, (j7p1) null, 30));
                } else {
                    qez0Var = tez0.a;
                }
                return new eg3(str2, arrayList3, o1vVar2, k4mVar4, zContains, z8, z2, z3, z4, qez0Var, hwqVar.a, zuc0Var, str4, fjf1Var2 != null ? fjf1Var2.h : false, 40960);
            case 2:
                cxc0 cxc0Var = (cxc0) obj;
                String str5 = (String) cxc0Var.f.q.get("releaseDate");
                return new jg3(cxc0Var.b, cxc0Var.a, str5 == null ? "" : str5, ((m980) ((fb3) obj3).c).b);
            case 3:
                boolean zJ = u890.j((String) ((cxc0) obj).f.q.get("albumType"), "SINGLE");
                Context context = (Context) ((zg3) obj3).c;
                return new ng3(zJ ? context.getString(2131952190) : context.getString(2131952189));
            case 4:
                kp41 kp41Var = (kp41) obj;
                AllboardingActivity allboardingActivity = (AllboardingActivity) obj3;
                if (kp41Var instanceof ip41) {
                    int i = AllboardingActivity.l1;
                    allboardingActivity.l0().U(new sm3((ip41) kp41Var));
                    return rih1Var;
                }
                if (!(kp41Var instanceof jp41)) {
                    eg.o();
                    return null;
                }
                int i2 = AllboardingActivity.l1;
                allboardingActivity.l0().U(new xm3(((jp41) kp41Var).a));
                return rih1Var;
            case 5:
                String str6 = (String) obj;
                ft3 ft3Var = (ft3) obj3;
                ft3Var.e.invoke(new m051(str6));
                ft3Var.d.d.invoke(str6);
                return rih1Var;
            case 6:
                ((kd31) obj).b(((Number) ((my3) obj3).P0.e()).floatValue());
                return rih1Var;
            case 7:
                e34 e34Var = (e34) obj3;
                int i3 = e34Var.f;
                if (i3 == 0) {
                    huzVar = new huz(w7x.a, (byte) 10);
                } else {
                    r860 r860Var = e34Var.e;
                    huzVar = r860Var != null ? r860Var.a(i3) : null;
                    if (huzVar == null) {
                        huzVar = new huz(w7x.a, (byte) 10);
                    }
                }
                return new x010(e34Var.a, huzVar, new o30(3, (lnm) null, (byte) 1), (byte) 1);
            case 8:
                ((d520) obj3).i0();
                return rih1Var;
            case 9:
                ((vr4) obj3).b();
                return rih1Var;
            case 10:
                eqc eqcVar = (eqc) obj;
                ceo ceoVar = ka5.a;
                float fH = eqcVar.h() * 10.0f;
                float fIntBitsToFloat = Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) / 2.0f;
                if (fH > fIntBitsToFloat) {
                    fH = fIntBitsToFloat;
                }
                return eqcVar.b(new ja5((es41) obj3, fH, fdg1.l(), (byte) 0));
            case 11:
                ((kd31) obj).b(((Number) ((ub5) obj3).Q0.e()).floatValue());
                return rih1Var;
            case 12:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, ((qd5) obj3).f);
                b261.x(e261Var, 0);
                return rih1Var;
            case 13:
                bxt bxtVar2 = (bxt) obj;
                vw5 vw5Var = (vw5) obj3;
                guc1 guc1Var = (guc1) vw5Var.Y.getValue();
                if (u890.j((guc1Var == null || (bxtVar = guc1Var.a) == null) ? null : bxtVar.d(), bxtVar2.d())) {
                    vw5Var.Y.l((Object) null);
                }
                return rih1Var;
            case 14:
                if (((Boolean) obj).booleanValue()) {
                    ((sy5) obj3).invoke();
                }
                return rih1Var;
            case 15:
                pt ptVar = (pt) obj3;
                uu0 uu0Var = (uu0) ptVar.i;
                yfr yfrVar = (yfr) ptVar.d;
                if (!uu0Var.a) {
                    uu0Var.j();
                    k9r k9rVar = (k9r) uu0Var.e;
                    k9rVar.d = null;
                    ((eur) k9rVar.b).a("APPLE_TV_APP_NOT_INSTALLED");
                }
                yfrVar.d((String) null);
                return new rm(yfrVar, (byte) 7);
            case 16:
                return new rm((l96) obj3, (byte) 8);
            case 17:
                String str7 = (String) obj;
                yb6 yb6Var = (yb6) obj3;
                km3 km3Var = yb6Var.e;
                i8h1 i8h1Var = (i8h1) km3Var.b;
                x6h1 x6h1VarC = ((rrk0) km3Var.c).b.c();
                x6h1VarC.i.add(new a7h1("artist_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("name_label", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                yb6Var.f.a(str7, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str7)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (zob1) ((cd6) obj3).d;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                jd6 jd6Var = (jd6) obj3;
                return d3p1.F((d0r) jd6Var.b, jd6Var.c, (gd6) obj);
            case 20:
                kd31 kd31Var = (kd31) obj;
                xd6 xd6Var = (xd6) obj3;
                kd31Var.l(xd6Var.a.s());
                kd31Var.n(xd6Var.b.s());
                kd31Var.e(kd31Var.T0.h() * 9.0f);
                return rih1Var;
            case 21:
                m5d0 m5d0Var = (m5d0) obj;
                lf6 lf6Var = (lf6) obj3;
                xf6 xf6Var = (xf6) lf6Var.g;
                return xf6Var.b.p(xf6Var.b((String) lf6Var.h, m5d0Var.a, m5d0Var.b, m5d0Var.c, m5d0Var.d).e(), xf6.d);
            case 22:
                ((kd31) obj).b(((Number) ((ve6) obj3).b.getValue()).floatValue());
                return rih1Var;
            case 23:
                od31 od31Var = (od31) obj;
                ji6 ji6Var = (ji6) obj3;
                wh6 wh6Var = (wh6) ji6Var.b;
                xf6 xf6Var2 = (xf6) ji6Var.c;
                if (!od31Var.equals(md31.a)) {
                    if (!(od31Var instanceof nd31)) {
                        eg.o();
                        return null;
                    }
                    a4g1 a4g1Var = ((nd31) od31Var).a;
                    y3m0 y3m0VarC = xf6Var2.c(wh6Var.l, a4g1Var.a, a4g1Var.b, a4g1Var.c, a4g1Var.d);
                    if (y3m0VarC != null) {
                        return xf6Var2.b.p(y3m0VarC.e(), xf6.d);
                    }
                    return null;
                }
                opl0 opl0VarA = xf6Var2.a(wh6Var.l);
                x6h1 x6h1VarC3 = opl0VarA.c.c();
                x6h1VarC3.i.add(new a7h1("card_pack", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                y6h1 y6h1VarA = x6h1VarC3.a();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = opl0VarA.b;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return xf6Var2.b.p(k7h1Var.a(), xf6.d);
            case 24:
                eqc eqcVar2 = (eqc) obj;
                yk4 yk4Var = (yk4) obj3;
                if (Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) <= 0.0f || Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) <= 0.0f) {
                    return eqcVar2.b(ag6.Y);
                }
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32));
                Bitmap bitmap = yk4Var.a;
                Bitmap bitmap2 = yk4Var.a;
                float fMax = Math.max(fIntBitsToFloat2 / bitmap.getWidth(), Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) / bitmap2.getHeight());
                int iP = yoi1.p(jch0.U(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)) / fMax), 1, bitmap2.getWidth());
                int iP2 = yoi1.p(jch0.U(Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)) / fMax), 1, bitmap2.getHeight());
                return eqcVar2.b(new ui6((yk4) obj3, (((long) ((bitmap2.getWidth() - iP) / 2)) << 32) | (((long) ((bitmap2.getHeight() - iP2) / 2)) & 4294967295L), iP, iP2, (((long) jch0.U(Float.intBitsToFloat((int) (eqcVar2.a.j() >> 32)))) << 32) | (((long) jch0.U(Float.intBitsToFloat((int) (eqcVar2.a.j() & 4294967295L)))) & 4294967295L)));
            case 25:
                pyg pygVar = (pyg) obj;
                long j = ((el6) obj3).b;
                ayg aygVar = (ayg) pygVar.a;
                String str8 = aygVar.c;
                String str9 = aygVar.e;
                ulg0 ulg0Var = aygVar.d;
                if (ulg0Var instanceof qlg0) {
                    llg0Var = new jlg0(((qlg0) ulg0Var).a);
                } else if (ulg0Var instanceof rlg0) {
                    llg0Var = new klg0(((rlg0) ulg0Var).a);
                } else if (ulg0Var instanceof slg0) {
                    llg0Var = new mlg0(((slg0) ulg0Var).a);
                } else {
                    if (!(ulg0Var instanceof tlg0)) {
                        eg.o();
                        return null;
                    }
                    llg0Var = new llg0(((tlg0) ulg0Var).a);
                }
                return new ilg0(str8, str9, j, llg0Var, pygVar.b, pygVar.c, pygVar.e, pygVar.d);
            case 26:
                hw2 hw2Var = (hw2) obj3;
                return d3p1.H(hw2Var.b, hw2Var.c, (dl6) obj);
            case 27:
                im6 im6Var = (im6) obj;
                if (((a7a1) obj3).e) {
                    return new rxc0(rm6.f(im6Var));
                }
                return null;
            case 28:
                z6a1 z6a1Var = ((ey81) obj3).a;
                int i4 = (int) z6a1Var.a;
                int i5 = (int) z6a1Var.b;
                List list3 = (List) obj;
                ArrayList arrayList4 = new ArrayList(q7h.U(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((jo70) it2.next()).a);
                }
                return new wm6(i4, i5, arrayList4);
            default:
                wzn wznVar = (wzn) ((zn6) obj3).c.a.c;
                em3 em3Var = new em3(wznVar.c, (Object) new bqk0((byte) 28), (byte) 14);
                do6 do6Var = (do6) wznVar.a;
                xfx xfxVar = (xfx) do6Var.d.get();
                c8o.l(xfxVar);
                Context context2 = (Context) do6Var.e.a;
                c8o.l(context2);
                qfl1 qfl1Var = new qfl1(context2);
                gw70 gw70Var = (gw70) do6Var.h.get();
                c8o.l(gw70Var);
                q7r0 q7r0Var = (q7r0) wznVar.b;
                bnr bnrVar = (bnr) do6Var.i.get();
                c8o.l(bnrVar);
                ggr ggrVar = (ggr) do6Var.j.get();
                c8o.l(ggrVar);
                return new go6(em3Var, xfxVar, qfl1Var, gw70Var, q7r0Var, bnrVar, ggrVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ve3(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }
}
