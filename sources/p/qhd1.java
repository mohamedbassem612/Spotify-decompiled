package p;

import androidx.car.app.k;
import androidx.car.app.model.Action;
import androidx.car.app.model.CarColor;
import androidx.car.app.model.CarIcon;
import androidx.car.app.model.CarText;
import androidx.car.app.model.Header;
import androidx.car.app.model.OnClickDelegateImpl;
import androidx.car.app.model.SectionHeader;
import androidx.car.app.model.SectionedItemTemplate;
import androidx.car.app.model.Shape;
import androidx.car.app.model.Tab;
import androidx.car.app.model.TabStyle;
import androidx.car.app.model.TabTemplate;
import com.spotify.base.java.logging.Logger;
import com.spotify.cosmos.p000servicebasedrouter.AndroidServicebasedrouterProperties$TestHelper;
import com.spotify.mobius.MobiusLoop;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class qhd1 extends ap41 implements xo31, o5s {
    public final cce N0;
    public final fna O0;
    public final wuc P0;
    public final vhd Q0;
    public final t7y R0;
    public xab1 S0;
    public MobiusLoop T0;
    public xab1 U0;
    public MobiusLoop V0;
    public t45 W0;
    public final t64 X;
    public final bqk0 X0;
    public final zle1 Y;
    public bqk0 Y0;
    public final l0x0 Z;
    public String Z0;
    public final bqk0 a1;
    public final bqk0 b1;
    public final bqk0 c1;
    public final jhd1 g;
    public final md10 h;
    public final i8h1 i;
    public final qzn0 t;

    public qhd1(k kVar, jhd1 jhd1Var, md10 md10Var, i8h1 i8h1Var, qzn0 qzn0Var, t64 t64Var, zle1 zle1Var, l0x0 l0x0Var, cce cceVar, fna fnaVar, wuc wucVar, vhd vhdVar, t7y t7yVar) {
        super(kVar);
        this.g = jhd1Var;
        this.h = md10Var;
        this.i = i8h1Var;
        this.t = qzn0Var;
        this.X = t64Var;
        this.Y = zle1Var;
        this.Z = l0x0Var;
        this.N0 = cceVar;
        this.O0 = fnaVar;
        this.P0 = wucVar;
        this.Q0 = vhdVar;
        this.R0 = t7yVar;
        this.X0 = new bqk0((byte) 20);
        this.Y0 = new bqk0(ypn0.b, (String) null, (byte) 16);
        this.a1 = new bqk0((byte) 19);
        this.b1 = new bqk0((byte) 14);
        this.c1 = new bqk0((byte) 21);
        fn31.T(cto1.q(this), (o8n) null, 0, new nhd1(this, null, (byte) 0), 3);
    }

    public final String a() {
        String strA = h().a();
        if (!u890.j(strA, cqn0.b)) {
            return strA;
        }
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return yon1.G1("COLLECTION", "collection", 346, "collection").c;
    }

    /* JADX WARN: Code duplicated, block: B:132:0x02ec  */
    /* JADX WARN: Code duplicated, block: B:133:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:134:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:158:0x0386  */
    /* JADX WARN: Code duplicated, block: B:161:0x038b  */
    /* JADX WARN: Code duplicated, block: B:166:0x039e  */
    /* JADX WARN: Code duplicated, block: B:168:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:171:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:173:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:174:0x03d5  */
    /* JADX WARN: Code duplicated, block: B:176:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:177:0x03e7  */
    /* JADX WARN: Multi-variable type inference failed */
    public final sxd1 d() throws Throwable {
        khd1 khd1Var;
        nd10 nd10Var;
        boolean z;
        SectionedItemTemplate sectionedItemTemplate;
        TabStyle tabStyle;
        fvc fvcVar;
        r6h1 r6h1VarB;
        SectionedItemTemplate sectionedItemTemplateV;
        boolean z2;
        k7a1 k7a1Var;
        jpd jpdVarA;
        String title;
        ArrayList arrayList;
        SectionHeader sectionHeader;
        String str;
        String str2;
        m231 m231Var;
        Throwable thA;
        int i;
        wqn0 wqn0Var;
        l7m0 l7m0Var;
        t7y t7yVar;
        byte b;
        boolean z3;
        Throwable th;
        twa vhdVar;
        List listC;
        MobiusLoop mobiusLoop = this.T0;
        if (mobiusLoop == null || (khd1Var = (khd1) mobiusLoop.i) == null) {
            khd1Var = new khd1();
        }
        khd1 khd1Var2 = khd1Var;
        MobiusLoop mobiusLoop2 = this.V0;
        if (mobiusLoop2 == null || (nd10Var = (nd10) mobiusLoop2.i) == null) {
            nd10Var = new nd10();
        }
        int iC = l1d.C(khd1Var2.d);
        byte b2 = 1;
        Throwable th2 = null;
        if (iC != 0 && iC != 1) {
            if (iC == 2 || iC == 3) {
                return ryo1.B(true, (String) null, (SectionedItemTemplate) null, (ArrayList) null, (TabStyle) null, d6d1.d1);
            }
            eg.o();
            return null;
        }
        boolean z4 = ((k) this.O0.b).d() >= 9;
        ygd1 ygd1VarI = i();
        if (ygd1VarI != null) {
            List list = nd10Var.a;
            cce cceVar = this.N0;
            xgd1 xgd1Var = ygd1VarI.a;
            wqn0 wqn0Var2 = xgd1Var.e;
            if (wqn0Var2.equals(ypn0.a)) {
                r6h1VarB = this.Y0.b();
            } else if (wqn0Var2.equals(lqn0.a)) {
                r6h1VarB = this.a1.b();
            } else if (wqn0Var2.equals(upn0.a)) {
                r6h1VarB = this.b1.b();
            } else {
                if (!wqn0Var2.equals(cqn0.a)) {
                    eg.m("Not a tab; no parent location here");
                    return null;
                }
                r6h1VarB = this.c1.b();
            }
            ArrayList arrayListY = x1p1.y(list, ((k) this.O0.b).d(), new ccb1(this, r6h1VarB, (byte) 28));
            int iC2 = l1d.C(ygd1VarI.c);
            if (iC2 == 0) {
                z = z4;
                sectionedItemTemplateV = lgo1.v(arrayListY);
            } else if (iC2 == 1) {
                ArrayList arrayListF = cceVar.F(ygd1VarI.b.c, xgd1Var.e);
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayListF.iterator();
                int i2 = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        Throwable th3 = th2;
                        p7h.T();
                        throw th3;
                    }
                    rhd1 rhd1Var = (rhd1) next;
                    fpd fpdVar = rhd1Var.a;
                    byte b3 = b2;
                    boolean z5 = rhd1Var.b;
                    if (fpdVar instanceof epd) {
                        epd epdVar = (epd) fpdVar;
                        py9 py9Var = new py9(r6h1VarB, (byte) 22);
                        List list2 = epdVar.b;
                        ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
                        Iterator it2 = list2.iterator();
                        while (it2.hasNext()) {
                            apd apdVar = (apd) it2.next();
                            arrayList3.add(x760.D(apdVar.a, apdVar.b, apdVar.c, (Integer) null, (nwc) null, Boolean.valueOf(epdVar.a.d instanceof g80), (Action) null, !apdVar.d.equals(o80.a), false, (Float) null, new jlm(apdVar, py9Var, this, (byte) 3), 1720));
                            it2 = it2;
                            z4 = z4;
                        }
                        z2 = z4;
                        listC = Collections.singletonList(lgo1.t((String) null, arrayList3, (String) null, (Function0) null, (b8p1) null, (SectionHeader) null, 61));
                        r6h1VarB = r6h1VarB;
                        arrayList = arrayListF;
                        it = it;
                        th = null;
                    } else {
                        z2 = z4;
                        ouk0 ouk0Var = new ouk0(Integer.valueOf(i2), fpdVar.getId(), fpdVar.getUri(), r6h1VarB);
                        xw91 xw91Var = new xw91(this, fpdVar, (byte) 14);
                        vhd vhdVar2 = this.Q0;
                        String id = fpdVar.getId();
                        if (id == null) {
                            id = fpdVar.getUri();
                        }
                        String str3 = id;
                        List items = fpdVar.getItems();
                        ArrayList arrayList4 = new ArrayList(q7h.U(items, 10));
                        Iterator it3 = items.iterator();
                        while (it3.hasNext()) {
                            arrayList4.add(l0p1.l((apd) it3.next()));
                        }
                        int i4 = i2;
                        b8p1 b8p1VarD = vhdVar2.d(i4, str3, arrayList4, i2 == p7h.L(arrayListF) ? b3 : 0, new rsc1(this, ouk0Var, fpdVar, (byte) 3));
                        k7a1 k7a1Var2 = new k7a1(this, fpdVar, (byte) 21);
                        wqn0 wqn0Var3 = xgd1Var.e;
                        ccb1 ccb1Var = new ccb1(this, ouk0Var, (byte) 27);
                        yo31 yo31Var = yo31.e;
                        li51 li51VarC = fpdVar.c();
                        if (li51VarC == null) {
                            k7a1Var = k7a1Var2;
                        } else {
                            String str4 = li51VarC.b;
                            if (wqn0Var3 instanceof ypn0) {
                                k7a1Var = k7a1Var2;
                                if (((t7y) cceVar.b).o(2)) {
                                    if (!z5 ? !((jpdVarA = fpdVar.a()) == null || (title = jpdVarA.a) == null) : (title = fpdVar.getTitle()) != null) {
                                        str4 = title;
                                    }
                                    Objects.requireNonNull(str4);
                                    CarText carTextCreate = CarText.create(str4);
                                    m231 ug51Var = new ug51();
                                    ((ug51) ug51Var).e = b3;
                                    Objects.requireNonNull(carTextCreate);
                                    if (carTextCreate.isEmpty()) {
                                        hhg1.n("The title cannot be empty");
                                        return null;
                                    }
                                    trd trdVar = trd.e;
                                    trdVar.b(carTextCreate);
                                    ((ug51) ug51Var).a = carTextCreate;
                                    if (z5) {
                                        arrayList = arrayListF;
                                    } else {
                                        jpd jpdVarA2 = fpdVar.a();
                                        if (jpdVarA2 == null || (str = jpdVarA2.b) == null || ihc1.y0(str)) {
                                            str = null;
                                        }
                                        if (str != null) {
                                            CarText carTextCreate2 = CarText.create(str);
                                            ((ug51) ug51Var).b = carTextCreate2;
                                            trdVar.b(carTextCreate2);
                                        } else {
                                            jpd jpdVarA3 = fpdVar.a();
                                            if (jpdVarA3 != null && (str2 = jpdVarA3.c) != null) {
                                                if (ihc1.y0(str2)) {
                                                    str2 = null;
                                                }
                                                if (str2 != null) {
                                                    CarText carTextCreate3 = CarText.create(str2);
                                                    ((ug51) ug51Var).c = carTextCreate3;
                                                    trd.g.b(carTextCreate3);
                                                }
                                            }
                                        }
                                        hvc hvcVarD = fpdVar.d();
                                        if (hvcVarD != null) {
                                            try {
                                                CarIcon carIconR = lnn1.r(hvcVarD);
                                                arrayList = arrayListF;
                                                if (carIconR.getType() != 1) {
                                                    throw new IllegalArgumentException("Only custom icon types are supported");
                                                }
                                                try {
                                                    yo31Var.j(carIconR);
                                                    ((ug51) ug51Var).d = carIconR;
                                                    ((ug51) ug51Var).e = (byte) 2;
                                                    m231Var = ug51Var;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    m231Var = new m231(th);
                                                }
                                                thA = e331.a(m231Var);
                                                if (thA != null) {
                                                    Logger.l(thA, "[CAL] Could not build section header start icon", new Object[0]);
                                                }
                                                th = th4;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                arrayList = arrayListF;
                                            }
                                            m231Var = new m231(th);
                                            thA = e331.a(m231Var);
                                            if (thA != null) {
                                                Logger.l(thA, "[CAL] Could not build section header start icon", new Object[0]);
                                            }
                                        } else {
                                            arrayList = arrayListF;
                                        }
                                    }
                                    CarIcon carIconR2 = lnn1.r(new fvc(2131231591, (String) null, zuc.o.b(), 10));
                                    if (carIconR2.getType() != 1) {
                                        hhg1.n("Only custom icon types are supported");
                                        return null;
                                    }
                                    yo31Var.j(carIconR2);
                                    ((ug51) ug51Var).f = carIconR2;
                                    ((ug51) ug51Var).g = OnClickDelegateImpl.create(new d0k(ccb1Var, li51VarC));
                                    if (((ug51) ug51Var).b != null && ((ug51) ug51Var).c != null) {
                                        eg.m("Both headline and subtitle cannot be set on a SectionHeader");
                                        return null;
                                    }
                                    sectionHeader = new SectionHeader(ug51Var);
                                }
                                utj utjVar = new utj(i4, r6h1VarB, xw91Var, b8p1VarD, k7a1Var, sectionHeader);
                                i = xgd1Var.d;
                                wqn0Var = xgd1Var.e;
                                l7m0Var = (l7m0) cceVar.c;
                                t7yVar = (t7y) cceVar.b;
                                if (z5 || !(wqn0Var instanceof ypn0)) {
                                    b = 2;
                                } else {
                                    b = 2;
                                    if (t7yVar.o(2)) {
                                        vhdVar = new twa();
                                    }
                                    th = null;
                                    listC = vhdVar.c(fpdVar, utjVar);
                                }
                                z3 = wqn0Var instanceof ypn0;
                                if (!z3 && fpdVar.getKind() == b && t7yVar.o(1)) {
                                    vhdVar = new mhc(b);
                                } else {
                                    if (!(wqn0Var instanceof lqn0) && !((k84) l7m0Var.b).k()) {
                                        th = null;
                                        vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                    } else if (((k84) l7m0Var.b).l()) {
                                        vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                    } else if (i == 1) {
                                        th = null;
                                        vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                    } else {
                                        th = null;
                                        vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                    }
                                    listC = vhdVar.c(fpdVar, utjVar);
                                }
                                th = null;
                                listC = vhdVar.c(fpdVar, utjVar);
                            } else {
                                k7a1Var = k7a1Var2;
                            }
                        }
                        arrayList = arrayListF;
                        sectionHeader = null;
                        utj utjVar2 = new utj(i4, r6h1VarB, xw91Var, b8p1VarD, k7a1Var, sectionHeader);
                        i = xgd1Var.d;
                        wqn0Var = xgd1Var.e;
                        l7m0Var = (l7m0) cceVar.c;
                        t7yVar = (t7y) cceVar.b;
                        if (z5) {
                            b = 2;
                            z3 = wqn0Var instanceof ypn0;
                            if (!z3) {
                                if (!(wqn0Var instanceof lqn0)) {
                                    if (((k84) l7m0Var.b).l()) {
                                        vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                    } else if (i == 1) {
                                        th = null;
                                        vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                    } else {
                                        th = null;
                                        vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                    }
                                } else if (((k84) l7m0Var.b).l()) {
                                    vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                } else if (i == 1) {
                                    th = null;
                                    vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                } else {
                                    th = null;
                                    vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                }
                            } else if (!(wqn0Var instanceof lqn0)) {
                                if (((k84) l7m0Var.b).l()) {
                                    vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                } else if (i == 1) {
                                    th = null;
                                    vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                } else {
                                    th = null;
                                    vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                }
                            } else if (((k84) l7m0Var.b).l()) {
                                vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                            } else if (i == 1) {
                                th = null;
                                vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                            } else {
                                th = null;
                                vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                            }
                            listC = vhdVar.c(fpdVar, utjVar2);
                        } else {
                            b = 2;
                            z3 = wqn0Var instanceof ypn0;
                            if (!z3) {
                                if (!(wqn0Var instanceof lqn0)) {
                                    if (((k84) l7m0Var.b).l()) {
                                        vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                    } else if (i == 1) {
                                        th = null;
                                        vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                    } else {
                                        th = null;
                                        vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                    }
                                } else if (((k84) l7m0Var.b).l()) {
                                    vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                } else if (i == 1) {
                                    th = null;
                                    vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                } else {
                                    th = null;
                                    vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                }
                            } else if (!(wqn0Var instanceof lqn0)) {
                                if (((k84) l7m0Var.b).l()) {
                                    vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                                } else if (i == 1) {
                                    th = null;
                                    vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                                } else {
                                    th = null;
                                    vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                                }
                            } else if (((k84) l7m0Var.b).l()) {
                                vhdVar = new l6w0(cceVar.v(), cceVar.u(z3), t7yVar.o(5));
                            } else if (i == 1) {
                                th = null;
                                vhdVar = new iti1(cceVar.v(), (Object) null, cceVar.u(z3));
                            } else {
                                th = null;
                                vhdVar = new vhd((l7m0) null, t7yVar.o(5), 1);
                            }
                            listC = vhdVar.c(fpdVar, utjVar2);
                        }
                        th = null;
                        listC = vhdVar.c(fpdVar, utjVar2);
                    }
                    r7h.W(listC, arrayList2);
                    th2 = th;
                    r6h1VarB = r6h1VarB;
                    i2 = i3;
                    arrayListF = arrayList;
                    it = it;
                    z4 = z2;
                    b2 = 1;
                }
                z = z4;
                sectionedItemTemplateV = lgo1.w(false, th2, arrayListY, arrayList2, 18);
            } else {
                if (iC2 != 2 && iC2 != 3) {
                    eg.o();
                    return null;
                }
                sectionedItemTemplateV = lgo1.w(true, (Header) null, arrayListY, (List) null, 26);
                z = z4;
            }
            sectionedItemTemplate = sectionedItemTemplateV;
        } else {
            z = z4;
            sectionedItemTemplate = null;
        }
        String uri = h().getUri();
        if (((k) this.O0.b).d() >= 9) {
            this.P0.getClass();
        }
        List<ygd1> list3 = khd1Var2.a;
        ArrayList arrayList5 = new ArrayList(q7h.U(list3, 10));
        for (ygd1 ygd1Var : list3) {
            xgd1 xgd1Var2 = ygd1Var.a;
            kwc kwcVar = xgd1Var2.a;
            if (z) {
                boolean zEquals = xgd1Var2.e.equals(h());
                xgd1 xgd1Var3 = ygd1Var.a;
                Integer numValueOf = Integer.valueOf(zEquals ? xgd1Var3.c : xgd1Var3.b);
                sfm0 sfm0Var = zuc.h;
                fvcVar = new fvc(numValueOf, (String) null, new mmr0(Integer.valueOf(sfm0Var.b), Integer.valueOf(sfm0Var.a)), 10);
            } else {
                fvcVar = new fvc(Integer.valueOf(xgd1Var2.b), (String) null, (mmr0) null, 14);
            }
            String uri2 = ygd1Var.a.e.getUri();
            sed1 sed1Var = new sed1();
            CarIcon carIconR3 = lnn1.r(fvcVar);
            yo31.f.j(carIconR3);
            sed1Var.b = carIconR3;
            CharSequence charSequenceB = hon1.B(kwcVar);
            Objects.requireNonNull(charSequenceB);
            CarText carTextCreate4 = CarText.create(charSequenceB);
            if (carTextCreate4.isEmpty()) {
                hhg1.n("The title cannot be null or empty");
                return null;
            }
            trd.f.b(carTextCreate4);
            sed1Var.a = carTextCreate4;
            if (uri2.isEmpty()) {
                hhg1.n("The content ID cannot be null or empty");
                return null;
            }
            sed1Var.c = uri2;
            if (sed1Var.a == null) {
                eg.m("A title must be set for the tab");
                return null;
            }
            if (sed1Var.b == null) {
                eg.m("An icon must be set for the tab");
                return null;
            }
            arrayList5.add(new Tab(sed1Var));
        }
        if (z) {
            ujd1 ujd1Var = new ujd1();
            sfm0 sfm0Var2 = zuc.f;
            CarColor carColorCreateCustom = CarColor.createCustom(sfm0Var2.b, sfm0Var2.a);
            qpd qpdVar = qpd.b;
            qpdVar.a(carColorCreateCustom);
            ujd1Var.b = carColorCreateCustom;
            sfm0 sfm0Var3 = zuc.g;
            CarColor carColorCreateCustom2 = CarColor.createCustom(sfm0Var3.b, sfm0Var3.a);
            qpdVar.a(carColorCreateCustom2);
            ujd1Var.c = carColorCreateCustom2;
            ujd1Var.a = Shape.CORNER_FULL;
            tabStyle = new TabStyle(ujd1Var, 0);
        } else {
            tabStyle = null;
        }
        TabTemplate tabTemplateB = ryo1.B(false, uri, sectionedItemTemplate, arrayList5, tabStyle, new ccb1(khd1Var2, this, (byte) 26));
        ygd1 ygd1VarI2 = i();
        if (ygd1VarI2 != null && ygd1VarI2.c == 2) {
            Iterator it4 = o7h.d1(this.N0.F(ygd1VarI2.b.c, ygd1VarI2.a.e), 2).iterator();
            while (it4.hasNext()) {
                yod yodVarB = ((rhd1) it4.next()).a.b();
                if (yodVarB != null) {
                    this.Z.o(new z00(yodVarB.b, qyo1.G(yodVarB), true));
                }
            }
        }
        t45 t45Var = this.W0;
        if (t45Var != null) {
            t45Var.g("template_render");
            this.Y.b(t45Var.e());
        }
        this.W0 = null;
        return tabTemplateB;
    }

    public final wqn0 h() {
        xgd1 xgd1Var;
        ygd1 ygd1VarI = i();
        return (ygd1VarI == null || (xgd1Var = ygd1VarI.a) == null) ? ypn0.a : xgd1Var.e;
    }

    public final ygd1 i() {
        khd1 khd1Var;
        Object next;
        khd1 khd1Var2;
        MobiusLoop mobiusLoop = this.T0;
        if (mobiusLoop == null || (khd1Var = (khd1) mobiusLoop.i) == null) {
            khd1Var = new khd1();
        }
        Iterator it = khd1Var.a.iterator();
        while (it.hasNext()) {
            next = it.next();
            String uri = ((ygd1) next).a.e.getUri();
            MobiusLoop mobiusLoop2 = this.T0;
            if (mobiusLoop2 == null || (khd1Var2 = (khd1) mobiusLoop2.i) == null) {
                khd1Var2 = new khd1();
            }
            if (u890.j(uri, khd1Var2.b)) {
                return (ygd1) next;
            }
        }
        next = null;
        return (ygd1) next;
    }

    public final void onDestroy(iac0 iac0Var) {
        ((ap41) this).b.d(this);
    }

    public final void onResume(iac0 iac0Var) {
        ((LinkedHashMap) this.Q0.d).clear();
        t45 t45VarA = this.Y.a("screen_render_time");
        t45.m(t45VarA, "template_render", 4);
        t45VarA.h = "carapplibrary";
        t45VarA.a("screen_type", "tab");
        t45VarA.a("async_image_loading_enabled", AndroidServicebasedrouterProperties$TestHelper.TRUE);
        this.W0 = t45VarA;
    }
}
