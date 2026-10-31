package p;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vht extends z5 {
    public final /* synthetic */ byte c = 1;
    public final toe0 d;
    public final /* synthetic */ y5 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public vht(wht whtVar) {
        this.e = whtVar;
        byp bypVar = whtVar.Y;
        super((s1c1) ((ks6) bypVar.b).a);
        s1c1 s1c1Var = (s1c1) ((ks6) bypVar.b).a;
        qht qhtVar = new qht(whtVar, (byte) 5);
        voe0 voe0Var = (voe0) s1c1Var;
        voe0Var.getClass();
        this.d = new toe0(voe0Var, qhtVar);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x023d  */
    /* JADX WARN: Code duplicated, block: B:104:0x024f  */
    /* JADX WARN: Code duplicated, block: B:107:0x025c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0271 A[LOOP:1: B:108:0x026b->B:110:0x0271, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0290  */
    /* JADX WARN: Code duplicated, block: B:114:0x0296  */
    /* JADX WARN: Code duplicated, block: B:116:0x029e  */
    /* JADX WARN: Code duplicated, block: B:156:0x0085 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:58:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:87:0x0208  */
    /* JADX WARN: Code duplicated, block: B:90:0x0216  */
    /* JADX WARN: Code duplicated, block: B:93:0x021f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0224  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0085, please report this as an issue */
    @Override // p.ma
    public final Collection a() {
        String strB;
        kf30 kf30VarA;
        ArrayList<ob11> arrayList;
        String str;
        kf30 kf30Var;
        kf30 kf30Var2;
        ArrayList arrayList2;
        qx81 qx81VarH0;
        int i;
        beg begVar;
        a8b0 a8b0VarH;
        List listSingletonList;
        ArrayList arrayList3;
        Iterator it;
        a8b0 a8b0VarL;
        a8b0 a8b0VarK;
        h0h1 h0h1VarT0;
        h0h1 h0h1VarT1;
        byte b = this.c;
        y5 y5Var = this.e;
        switch (b) {
            case 0:
                wht whtVar = (wht) y5Var;
                hfy0 hfy0Var = whtVar.e;
                byp bypVar = whtVar.Y;
                List listG = p2o1.G(hfy0Var, (l141) bypVar.d);
                ArrayList arrayList4 = new ArrayList(q7h.U(listG, 10));
                Iterator it2 = listG.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((mxa1) bypVar.h).m((rgy0) it2.next()));
                }
                ArrayList arrayListN0 = o7h.N0(((yz1) ((ks6) bypVar.b).Z).c(whtVar), arrayList4);
                ArrayList<ego0> arrayList5 = new ArrayList();
                Iterator it3 = arrayListN0.iterator();
                while (it3.hasNext()) {
                    jfg jfgVarS = ((a8b0) it3.next()).t0().s();
                    ego0 ego0Var = jfgVarS instanceof ego0 ? (ego0) jfgVarS : null;
                    if (ego0Var != null) {
                        arrayList5.add(ego0Var);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    siz sizVar = (siz) ((ks6) bypVar.b).h;
                    ArrayList arrayList6 = new ArrayList(q7h.U(arrayList5, 10));
                    for (ego0 ego0Var2 : arrayList5) {
                        heg hegVarF = kht.f(ego0Var2);
                        if (hegVarF == null || (kf30VarA = hegVarF.a()) == null || (strB = kf30VarA.a.a) == null) {
                            strB = ego0Var2.getName().b();
                        }
                        arrayList6.add(strB);
                    }
                    sizVar.c(whtVar, arrayList6);
                }
                return o7h.l1(arrayListN0);
            default:
                hqb0 hqb0Var = (hqb0) y5Var;
                o860 o860Var = hqb0Var.t;
                Class cls = hqb0Var.h.a;
                boolean zEquals = cls.equals(Object.class);
                ArrayList arrayList7 = z6x.a;
                if (zEquals) {
                    arrayList = arrayList7;
                } else {
                    c8b1 c8b1Var = new c8b1(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    c8b1Var.a(genericSuperclass != null ? genericSuperclass : Object.class);
                    c8b1Var.b(cls.getGenericInterfaces());
                    ArrayList arrayList8 = c8b1Var.a;
                    List listM = p7h.M(arrayList8.toArray(new Type[arrayList8.size()]));
                    arrayList = new ArrayList(q7h.U(listM, 10));
                    Iterator it4 = listM.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(new ob11((Type) it4.next()));
                    }
                }
                ArrayList arrayList9 = new ArrayList(arrayList.size());
                ArrayList arrayList10 = new ArrayList(0);
                pf5 pf5VarF = hqb0Var.U0.F(eia0.p);
                int i2 = 1;
                if (pf5VarF != null) {
                    Object objW0 = o7h.W0(pf5VarF.a().values());
                    ghc1 ghc1Var = objW0 instanceof ghc1 ? (ghc1) objW0 : null;
                    if (ghc1Var != null && (str = (String) ghc1Var.a) != null) {
                        int length = str.length();
                        int i3 = 1;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                char cCharAt = str.charAt(i4);
                                int iC = l1d.C(i3);
                                if (iC == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        i3 = 2;
                                        i4++;
                                    }
                                } else if (iC != 1) {
                                    if (iC != 2) {
                                        eg.o();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        i3 = 2;
                                        i4++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        i3 = 3;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i4++;
                                }
                            } else {
                                kf30Var = i3 != 3 ? new kf30(str) : null;
                            }
                        }
                    }
                }
                if (kf30Var != null) {
                    lf30 lf30Var = kf30Var.a;
                    if (lf30Var.c() || !lf30Var.h(sfb1.k)) {
                        kf30Var = null;
                    }
                } else {
                    kf30Var = null;
                }
                if (kf30Var == null) {
                    LinkedHashMap linkedHashMap = uh10.a;
                    kf30Var2 = (kf30) uh10.b.get(kht.g(hqb0Var));
                    if (kf30Var2 == null) {
                        qx81VarH0 = null;
                    }
                    for (ob11 ob11Var : arrayList) {
                        int i5 = i2;
                        a8b0VarL = ((st60) o860Var.e).L(ob11Var, bs51.u(i2, false, (drb0) null, 7));
                        a8b0VarK = ((sua) ((uw0) o860Var.b).Z).k(new uqs((ve5) null, false, o860Var, wf5.TYPE_USE, true), a8b0VarL, arrayList7, null, false);
                        if (a8b0VarK != null) {
                            a8b0VarL = a8b0VarK;
                        }
                        if (a8b0VarL.t0().s() instanceof ego0) {
                            arrayList10.add(ob11Var);
                        }
                        h0h1VarT0 = a8b0VarL.t0();
                        if (qx81VarH0 != null) {
                            h0h1VarT1 = qx81VarH0.t0();
                        } else {
                            h0h1VarT1 = null;
                        }
                        if (!u890.j(h0h1VarT0, h0h1VarT1) && !g6b0.y(a8b0VarL)) {
                            arrayList9.add(a8b0VarL);
                        }
                        i2 = i5;
                    }
                    i = i2;
                    begVar = hqb0Var.i;
                    if (begVar != null) {
                        a8b0VarH = new l1h1(jzn1.q(begVar, hqb0Var)).h(i, begVar.m());
                    } else {
                        a8b0VarH = null;
                    }
                    h4p1.d(arrayList9, a8b0VarH);
                    h4p1.d(arrayList9, qx81VarH0);
                    if (!arrayList10.isEmpty()) {
                        if (arrayList9.isEmpty()) {
                            listSingletonList = Collections.singletonList(((ajm0) ((uw0) o860Var.b).X).e.f());
                        } else {
                            listSingletonList = o7h.l1(arrayList9);
                        }
                        return listSingletonList;
                    }
                    Object obj = o860Var.b;
                    arrayList3 = new ArrayList(q7h.U(arrayList10, 10));
                    it = arrayList10.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(((ob11) ((zb11) it.next())).a.toString());
                    }
                    bhn0.v("Incomplete hierarchy for class ", hqb0Var.getName(), ", unresolved classes ", arrayList3);
                    return null;
                }
                kf30Var2 = kf30Var;
                ajm0 ajm0Var = (ajm0) ((uw0) o860Var.b).X;
                int i6 = kht.a;
                lf30 lf30Var2 = kf30Var2.a;
                lf30Var2.c();
                jfg jfgVarG = ajm0Var.D(kf30Var2.b()).h.g(lf30Var2.g(), 19);
                beg begVar2 = jfgVarG instanceof beg ? (beg) jfgVarG : null;
                if (begVar2 != null) {
                    int size = begVar2.g().getParameters().size();
                    List parameters = hqb0Var.P0.getParameters();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        List list = parameters;
                        arrayList2 = new ArrayList(q7h.U(list, 10));
                        Iterator it5 = list.iterator();
                        while (it5.hasNext()) {
                            arrayList2.add(new f1h1(1, ((y0h1) it5.next()).m()));
                        }
                    } else if (size2 == 1 && size > 1 && kf30Var == null) {
                        f1h1 f1h1Var = new f1h1(1, ((y0h1) o7h.V0(parameters)).m());
                        tr80 tr80Var = new tr80(1, size, 1);
                        ArrayList arrayList11 = new ArrayList(q7h.U(tr80Var, 10));
                        lr80 it6 = tr80Var.iterator();
                        while (((sr80) it6).c) {
                            it6.nextInt();
                            arrayList11.add(f1h1Var);
                        }
                        arrayList2 = arrayList11;
                    } else {
                        qx81VarH0 = null;
                    }
                    e0h1.b.getClass();
                    qx81VarH0 = y3o1.h0(e0h1.c, begVar2, arrayList2);
                } else {
                    qx81VarH0 = null;
                }
                while (r15.hasNext()) {
                    int i7 = i2;
                    a8b0VarL = ((st60) o860Var.e).L(ob11Var, bs51.u(i2, false, (drb0) null, 7));
                    a8b0VarK = ((sua) ((uw0) o860Var.b).Z).k(new uqs((ve5) null, false, o860Var, wf5.TYPE_USE, true), a8b0VarL, arrayList7, null, false);
                    if (a8b0VarK != null) {
                        a8b0VarL = a8b0VarK;
                    }
                    if (a8b0VarL.t0().s() instanceof ego0) {
                        arrayList10.add(ob11Var);
                    }
                    h0h1VarT0 = a8b0VarL.t0();
                    if (qx81VarH0 != null) {
                        h0h1VarT1 = qx81VarH0.t0();
                    } else {
                        h0h1VarT1 = null;
                    }
                    if (!u890.j(h0h1VarT0, h0h1VarT1)) {
                        arrayList9.add(a8b0VarL);
                    }
                    i2 = i7;
                }
                i = i2;
                begVar = hqb0Var.i;
                if (begVar != null) {
                    a8b0VarH = new l1h1(jzn1.q(begVar, hqb0Var)).h(i, begVar.m());
                } else {
                    a8b0VarH = null;
                }
                h4p1.d(arrayList9, a8b0VarH);
                h4p1.d(arrayList9, qx81VarH0);
                if (!arrayList10.isEmpty()) {
                    if (arrayList9.isEmpty()) {
                        listSingletonList = o7h.l1(arrayList9);
                    } else {
                        listSingletonList = Collections.singletonList(((ajm0) ((uw0) o860Var.b).X).e.f());
                    }
                    return listSingletonList;
                }
                Object obj2 = o860Var.b;
                arrayList3 = new ArrayList(q7h.U(arrayList10, 10));
                it = arrayList10.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((ob11) ((zb11) it.next())).a.toString());
                }
                bhn0.v("Incomplete hierarchy for class ", hqb0Var.getName(), ", unresolved classes ", arrayList3);
                return null;
        }
    }

    @Override // p.ma
    public final djx0 c() {
        switch (this.c) {
            case 0:
                break;
            default:
                Object obj = ((hqb0) this.e).t.b;
                break;
        }
        return djx0.R0;
    }

    public final List getParameters() {
        switch (this.c) {
            case 0:
                break;
        }
        return (List) this.d.invoke();
    }

    @Override // p.z5
    /* JADX INFO: renamed from: j */
    public final beg s() {
        byte b = this.c;
        y5 y5Var = this.e;
        switch (b) {
            case 0:
                return (wht) y5Var;
            default:
                return (hqb0) y5Var;
        }
    }

    public final jfg s() {
        byte b = this.c;
        y5 y5Var = this.e;
        switch (b) {
            case 0:
                return (wht) y5Var;
            default:
                return (hqb0) y5Var;
        }
    }

    public final boolean t() {
        switch (this.c) {
        }
        return true;
    }

    public final String toString() {
        byte b = this.c;
        y5 y5Var = this.e;
        switch (b) {
            case 0:
                return ((wht) y5Var).getName().a;
            default:
                return ((hqb0) y5Var).getName().b();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public vht(hqb0 hqb0Var) {
        this.e = hqb0Var;
        o860 o860Var = hqb0Var.t;
        super((voe0) ((uw0) o860Var.b).d);
        this.d = new toe0((voe0) ((uw0) o860Var.b).d, new fqb0(hqb0Var, (byte) 2));
    }
}
