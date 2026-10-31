package p;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m39 {
    public final di4 a;

    public /* synthetic */ m39(di4 di4Var) {
        this.a = di4Var;
    }

    public static List a(f951 f951Var) {
        a951 a951Var = f951Var instanceof a951 ? (a951) f951Var : null;
        siq0 siq0Var = a951Var != null ? a951Var.a : null;
        qiq0 qiq0Var = siq0Var instanceof qiq0 ? (qiq0) siq0Var : null;
        List list = qiq0Var != null ? qiq0Var.c : null;
        return list == null ? z6x.a : list;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x014c  */
    /* JADX WARN: Code duplicated, block: B:49:0x014f A[SYNTHETIC] */
    public smc0 b(b951 b951Var, d8r0 d8r0Var) {
        Object s8zVar;
        d8r0 d8r0Var2;
        smc0 smc0VarN = k4p1.n();
        List list = b951Var.b;
        if (!list.isEmpty()) {
            smc0VarN.add(new v211(d8r0Var, mqo1.A(list)));
        }
        Set setP1 = o7h.p1(b951Var.a);
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (Object obj : setP1) {
            int i2 = i + 1;
            Object iqkVar = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            em01 em01Var = (em01) obj;
            String str = em01Var.a;
            String str2 = em01Var.a;
            switch (mqo1.q(str).ordinal()) {
                case 0:
                    String strM = l1d.m("recent-row-", str);
                    String str3 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new s8z(strM, d8r0Var2, str3, str3, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 1:
                    String strM2 = l1d.m("recent-row-", str);
                    String str4 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new kvf1(strM2, d8r0Var2, str4, str4, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 2:
                    String strM3 = l1d.m("recent-row-", str);
                    String str5 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new iu6(strM3, d8r0Var2, str5, str5, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 3:
                    String strM4 = l1d.m("recent-row-", str);
                    String str6 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new hdx0(strM4, d8r0Var2, str6, str6, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 4:
                    String strM5 = l1d.m("recent-row-", str);
                    String str7 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new yo8(strM5, d8r0Var2, str7, str7, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 5:
                    String strM6 = l1d.m("recent-row-", str);
                    String str8 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new xqu0(strM6, d8r0Var2, str8, str8, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 6:
                    String strM7 = l1d.m("recent-row-", str);
                    String str9 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new w5v0(strM7, d8r0Var2, str9, str9, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 7:
                case 8:
                    String strM8 = l1d.m("recent-row-", str);
                    String str10 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new ae3(strM8, d8r0Var2, str10, str10, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 9:
                    String strM9 = l1d.m("recent-row-", str);
                    d8r0Var2 = d8r0Var;
                    s8zVar = new yi40(strM9, d8r0Var2, str2, ihc1.h0(str2, ":genre:", false) ? nhc1.W(str2, ":genre:", ":page:") : str2, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 10:
                    String strM10 = l1d.m("recent-row-", str);
                    String str11 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new syi1(strM10, d8r0Var2, str11, str11, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 11:
                    if (this.a.I()) {
                        String strM11 = l1d.m("recent-row-", str);
                        String str12 = em01Var.a;
                        iqkVar = new iqk(strM11, d8r0Var, str12, str12, i, em01Var.b);
                    }
                    d8r0Var2 = d8r0Var;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 12:
                    String strM12 = l1d.m("recent-row-", str);
                    String str13 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new kvf1(strM12, d8r0Var2, str13, str13, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 13:
                    String strM13 = l1d.m("recent-row-", str);
                    String str14 = em01Var.a;
                    d8r0Var2 = d8r0Var;
                    s8zVar = new q2v0(strM13, d8r0Var2, str14, str14, i, em01Var.b);
                    iqkVar = s8zVar;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                case 14:
                    d8r0Var2 = d8r0Var;
                    if (iqkVar != null) {
                        arrayList.add(iqkVar);
                    }
                    d8r0Var = d8r0Var2;
                    i = i2;
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        d8r0 d8r0Var3 = d8r0Var;
        if (!arrayList.isEmpty()) {
            smc0VarN.add(new dm01(d8r0Var3));
            smc0VarN.addAll(arrayList);
            smc0VarN.add(new zl01(d8r0Var3));
        }
        return k4p1.k(smc0VarN);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX WARN: Code duplicated, block: B:24:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x000d A[SYNTHETIC] */
    public ArrayList c(boolean z, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        d7 d7Var = new d7(mo21.Q0, (byte) 0);
        while (d7Var.hasNext()) {
            Object next = d7Var.next();
            int iOrdinal = ((mo21) next).ordinal();
            boolean zE = true;
            di4 di4Var = this.a;
            switch (iOrdinal) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 8:
                case 10:
                case 14:
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 6:
                case 7:
                    zE = z;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 9:
                case 16:
                    zE = false;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 11:
                    zE = di4Var.e();
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 12:
                    zE = z3;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 13:
                    zE = z2;
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                case 15:
                    if (!di4Var.f() && !di4Var.I()) {
                        zE = false;
                    }
                    if (zE) {
                        arrayList.add(next);
                    }
                    break;
                default:
                    eg.o();
                    return null;
            }
        }
        return arrayList;
    }

    public m39(ulc ulcVar, pob pobVar, di4 di4Var) {
        this.a = di4Var;
    }
}
