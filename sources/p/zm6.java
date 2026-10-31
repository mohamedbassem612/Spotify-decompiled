package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public abstract class zm6 {
    public static final af5 a;

    static {
        StringBuilder sb = new StringBuilder(true & true ? 16 : 0);
        ArrayList arrayListM = xvj1.m();
        new ArrayList();
        sb.append(" • ");
        String string = sb.toString();
        ArrayList arrayList = new ArrayList(arrayListM.size());
        int size = arrayListM.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(((xe5) arrayListM.get(i)).a(sb.length()));
        }
        a = new af5(string, arrayList);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void a(xm6 xm6Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1482158058);
        int i2 = (x340Var.i(xm6Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Integer num = (Integer) x340Var.k(alg0.h);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarN = anm1.N("artist-description-root", qim0Var2);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (xm6Var == null) {
                x340Var.i0(-1110348212);
                x340Var.r(false);
            } else if (xm6Var.equals(vm6.a)) {
                x340Var.i0(-1836930620);
                c(x340Var, 0);
                x340Var.r(false);
            } else if (xm6Var instanceof wm6) {
                x340Var.i0(-1836928544);
                e((wm6) xm6Var, num, x340Var, i2 & 14);
                x340Var.r(false);
            } else {
                if (!(xm6Var instanceof um6)) {
                    throw p3d1.k(x340Var, -1836933590, false);
                }
                x340Var.i0(-1836925567);
                b((um6) xm6Var, num, x340Var, i2 & 14);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var = qim0Var2;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pp5(xm6Var, qim0Var, i, (byte) 9);
        }
    }

    public static final void b(um6 um6Var, Integer num, b0k b0kVar, int i) {
        Object obj;
        int i2 = um6Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(880520135);
        int i3 = (i & 6) == 0 ? (x340Var.i(um6Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var.g(num) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.i0(1713249335);
            smc0 smc0VarN = k4p1.n();
            List list = um6Var.e;
            if (i2 > 0) {
                x340Var.i0(-749241537);
                smc0VarN.add(cwl1.U(2131820910, i2, new Object[]{String.valueOf(i2)}, x340Var));
                x340Var.r(false);
            } else {
                x340Var.i0(-749032039);
                x340Var.r(false);
            }
            int i4 = um6Var.b;
            smc0VarN.add(cwl1.U(2131820907, i4, new Object[]{String.valueOf(i4)}, x340Var));
            if (list.isEmpty()) {
                x340Var.i0(-748476519);
                x340Var.r(false);
            } else {
                x340Var.i0(-748780195);
                smc0VarN.add(cwl1.U(2131820909, list.size(), new Object[]{um6Var.c, o7h.y0(o7h.d1(list, 2), " • ", (String) null, (String) null, (iu30) null, 62)}, x340Var));
                x340Var.r(false);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r(false);
            x340Var.i0(1713275766);
            ArrayList arrayList = new ArrayList(q7h.U(smc0VarK, 10));
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                } else {
                    arrayList.add(g((String) rmc0Var.next(), x340Var));
                }
            }
            x340Var.r(false);
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((af5) next).e(a).e((af5) it.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            af5 af5Var = (af5) obj;
            if (af5Var == null) {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayListM.size());
                for (int iG = 0; iG < arrayListM.size(); iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList2, iG, 1)) {
                }
                af5Var = new af5(string, arrayList2);
            }
            f(af5Var, num, x340Var, i3 & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(um6Var, num, i, (byte) 13);
        }
    }

    public static final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1597336830);
        if (x340Var.Y(i & 1, i != 0)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            d(u291.f(nim0Var, 1.0f), x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d(ab80.o(nim0Var, 4.0f, x340Var, nim0Var, 0.7f), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bom1((byte) 23, i, false);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-183922772);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarH = u291.h(qim0Var, 13.0f);
            uwr uwrVar = cbx.a;
            t1c.a(cwl1.l0(dug.f(qim0VarH, cbx.a(x340Var).a.b.a(), er31.b(8.0f)), 0L, er31.b(8.0f), 13), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 9);
        }
    }

    public static final void e(wm6 wm6Var, Integer num, b0k b0kVar, int i) {
        Object obj;
        int i2 = wm6Var.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2046069827);
        int i3 = (i & 6) == 0 ? (x340Var.i(wm6Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= x340Var.g(num) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            x340Var.i0(691425685);
            smc0 smc0VarN = k4p1.n();
            List list = wm6Var.c;
            if (i2 > 0) {
                x340Var.i0(-1450965355);
                smc0VarN.add(cwl1.U(2131820910, i2, new Object[]{String.valueOf(i2)}, x340Var));
                x340Var.r(false);
            } else {
                x340Var.i0(-1450755857);
                x340Var.r(false);
            }
            int i4 = wm6Var.b;
            smc0VarN.add(cwl1.U(2131820907, i4, new Object[]{String.valueOf(i4)}, x340Var));
            if (list.isEmpty()) {
                x340Var.i0(-1450275729);
                x340Var.r(false);
            } else {
                x340Var.i0(-1450518862);
                smc0VarN.add(cwl1.U(2131820908, list.size(), new Object[]{o7h.y0(o7h.d1(list, 2), " • ", (String) null, (String) null, (iu30) null, 62)}, x340Var));
                x340Var.r(false);
            }
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r(false);
            x340Var.i0(691449760);
            ArrayList arrayList = new ArrayList(q7h.U(smc0VarK, 10));
            rmc0 rmc0VarListIterator = smc0VarK.listIterator(0);
            while (true) {
                rmc0 rmc0Var = rmc0VarListIterator;
                if (!rmc0Var.hasNext()) {
                    break;
                } else {
                    arrayList.add(g((String) rmc0Var.next(), x340Var));
                }
            }
            x340Var.r(false);
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                Object next = it.next();
                while (it.hasNext()) {
                    next = ((af5) next).e(a).e((af5) it.next());
                }
                obj = next;
            } else {
                obj = null;
            }
            af5 af5Var = (af5) obj;
            if (af5Var == null) {
                StringBuilder sb = new StringBuilder(16);
                ArrayList arrayListM = xvj1.m();
                new ArrayList();
                String string = sb.toString();
                ArrayList arrayList2 = new ArrayList(arrayListM.size());
                for (int iG = 0; iG < arrayListM.size(); iG = c13.g(sb, (xe5) arrayListM.get(iG), arrayList2, iG, 1)) {
                }
                af5Var = new af5(string, arrayList2);
            }
            f(af5Var, num, x340Var, i3 & 112);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(wm6Var, num, i, (byte) 14);
        }
    }

    public static final void f(af5 af5Var, Integer num, b0k b0kVar, int i) {
        int i2;
        ym6 ym6Var;
        h311 h311VarV;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1156939330);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(af5Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(num) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Function0 function0 = (Function0) x340Var.k(alg0.g);
            if (num == null || function0 == null) {
                x340Var.i0(-732702497);
                uwr uwrVar = cbx.a;
                uwo1.f(af5Var, (qim0) null, lee1.a(cbx.d(x340Var).j, ((vex) zex.a.e).m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214), (x9h) null, (a0e1) null, (iu30) null, 2, false, num != null ? new cjc0(num.intValue()) : new cjc0(Integer.MAX_VALUE), 0, (qx8) null, (cqs0) null, x340Var, i2 & 14, 0, 3770);
                x340Var.r(false);
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    ym6Var = new ym6(af5Var, num, i, (byte) 0);
                }
            } else {
                x340Var.i0(-732394016);
                x340Var.r(false);
                w2g0.c(u291.f(nim0.a, 1.0f), (tl3) null, apo.r(-189193556, new n891(af5Var, function0, num, (byte) 18), x340Var), x340Var, 3072, 6);
            }
            h311VarV.d = ym6Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            ym6Var = new ym6(af5Var, num, i, (byte) 1);
            h311VarV.d = ym6Var;
        }
    }

    public static final af5 g(String str, b0k b0kVar) {
        uwr uwrVar = cbx.a;
        zma1 zma1Var = lee1.a(cbx.d(b0kVar).j, ((vex) zex.a.e).m, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a;
        zma1 zma1Var2 = lee1.a(cbx.d(b0kVar).j, cbx.a(b0kVar).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214).a;
        int i = af5.e;
        af5 af5VarJ = ob51.j(str, null, 6);
        String str2 = af5VarJ.b;
        List listB = af5VarJ.b();
        ArrayList<ze5> arrayList = new ArrayList();
        for (Object obj : listB) {
            if (u890.j(((zma1) ((ze5) obj).a).c, FontWeight.Z)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (ze5 ze5Var : arrayList) {
            arrayList2.add(new mmr0(Integer.valueOf(ze5Var.b), Integer.valueOf(ze5Var.c)));
        }
        List<mmr0> listA1 = o7h.a1(arrayList2, new cvt((byte) 14));
        int length = str2.length();
        ArrayList<mmr0> arrayList3 = new ArrayList();
        int i2 = 0;
        for (mmr0 mmr0Var : listA1) {
            int iIntValue = ((Number) mmr0Var.a).intValue();
            int iIntValue2 = ((Number) mmr0Var.b).intValue();
            if (i2 < iIntValue) {
                arrayList3.add(new mmr0(Integer.valueOf(i2), Integer.valueOf(iIntValue)));
            }
            i2 = iIntValue2;
        }
        if (i2 < length) {
            arrayList3.add(new mmr0(Integer.valueOf(i2), Integer.valueOf(length)));
        }
        List<mmr0> list = listA1;
        ArrayList arrayList4 = new ArrayList(q7h.U(list, 10));
        for (mmr0 mmr0Var2 : list) {
            arrayList4.add(new ze5(((Number) mmr0Var2.a).intValue(), ((Number) mmr0Var2.b).intValue(), zma1Var2));
        }
        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList3, 10));
        for (mmr0 mmr0Var3 : arrayList3) {
            arrayList5.add(new ze5(((Number) mmr0Var3.a).intValue(), ((Number) mmr0Var3.b).intValue(), zma1Var));
        }
        return new af5(str2, o7h.N0(arrayList5, arrayList4), 0);
    }
}
