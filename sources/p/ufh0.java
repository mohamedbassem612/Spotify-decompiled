package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ufh0 implements vda {
    public final djl a;
    public final LinkedHashMap b;
    public final LinkedHashMap c;
    public final LinkedHashMap d;
    public final ynb1 e;
    public final int[] f;
    public final int[] g;
    public float h;
    public final ArrayList i;

    public ufh0(wat watVar) {
        djl djlVar = new djl(0, 0);
        djlVar.u0 = new ArrayList();
        djlVar.v0 = new ix7(djlVar);
        vgr vgrVar = new vgr(djlVar);
        djlVar.w0 = vgrVar;
        djlVar.y0 = null;
        djlVar.z0 = false;
        djlVar.A0 = new yic0();
        djlVar.D0 = 0;
        djlVar.E0 = 0;
        djlVar.F0 = new tbe[4];
        djlVar.G0 = new tbe[4];
        djlVar.H0 = 257;
        djlVar.I0 = false;
        djlVar.J0 = false;
        djlVar.K0 = null;
        djlVar.L0 = null;
        djlVar.M0 = null;
        djlVar.N0 = null;
        djlVar.O0 = new HashSet();
        djlVar.P0 = new uda();
        djlVar.y0 = this;
        vgrVar.C(this);
        this.a = djlVar;
        this.b = new LinkedHashMap();
        this.c = new LinkedHashMap();
        this.d = new LinkedHashMap();
        this.e = new ynb1(watVar);
        this.f = new int[2];
        this.g = new int[2];
        this.h = Float.NaN;
        this.i = new ArrayList();
    }

    public static void f(bjl bjlVar, int i, int i2, int i3, boolean z, boolean z2, int i4, int[] iArr) {
        int iOrdinal = bjlVar.ordinal();
        if (iOrdinal == 0) {
            iArr[0] = i;
            iArr[1] = i;
            return;
        }
        if (iOrdinal == 1) {
            iArr[0] = 0;
            iArr[1] = i4;
            return;
        }
        if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                n9v.f(bjlVar, " is not supported");
                return;
            } else {
                iArr[0] = i4;
                iArr[1] = i4;
                return;
            }
        }
        boolean z3 = z2 || ((i3 == 1 || i3 == 2) && (i3 == 2 || i2 != 1 || z));
        iArr[0] = z3 ? i : 0;
        if (!z3) {
            i = i4;
        }
        iArr[1] = i;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:37:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:38:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
    /* JADX WARN: Code duplicated, block: B:50:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0129  */
    /* JADX WARN: Code duplicated, block: B:55:0x0138  */
    /* JADX WARN: Code duplicated, block: B:78:0x019d  */
    /* JADX WARN: Instruction removed from duplicated block: B:31:0x00b4, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    public final void b(cjl cjlVar, uda udaVar) {
        Object obj;
        Object obj2;
        int i;
        Integer numValueOf;
        int i2;
        Integer numValueOf2;
        Integer num;
        int iIntValue;
        int i3;
        Integer numValueOf3;
        Integer num2;
        char c;
        int iIntValue2;
        boolean z;
        int iU;
        char c2;
        Object obj3;
        String str = cjlVar.k;
        LinkedHashMap linkedHashMap = this.c;
        Integer[] numArr = (Integer[]) linkedHashMap.get(str);
        bjl bjlVar = udaVar.a;
        int i4 = udaVar.c;
        int i5 = cjlVar.s;
        int i6 = udaVar.j;
        boolean z2 = true;
        if ((numArr != null ? numArr[1].intValue() : 0) != cjlVar.m()) {
            z2 = false;
        }
        boolean zC = cjlVar.C();
        ynb1 ynb1Var = this.e;
        f(bjlVar, i4, i5, i6, z2, zC, hjl.i(ynb1Var.l), this.f);
        f(udaVar.b, udaVar.d, cjlVar.t, udaVar.j, (numArr != null ? numArr[0].intValue() : 0) == cjlVar.s(), cjlVar.D(), hjl.h(ynb1Var.l), this.g);
        int[] iArr = this.f;
        int i7 = iArr[0];
        int i8 = iArr[1];
        int[] iArr2 = this.g;
        long jA = jjl.a(i7, i8, iArr2[0], iArr2[1]);
        int i9 = udaVar.j;
        if (i9 == 1 || i9 == 2) {
            mmr0 mmr0VarE = e(cjlVar, jA);
            obj = mmr0VarE.b;
            obj2 = mmr0VarE.a;
            cjlVar.g = false;
            Comparable comparable = (Comparable) obj2;
            i = cjlVar.v;
            numValueOf = Integer.valueOf(i);
            if (i <= 0) {
                numValueOf = null;
            }
            i2 = cjlVar.w;
            numValueOf2 = Integer.valueOf(i2);
            if (i2 > 0) {
                num = numValueOf2;
            } else {
                num = null;
            }
            iIntValue = ((Number) yoi1.t(comparable, numValueOf, num)).intValue();
            Comparable comparable2 = (Comparable) obj;
            i3 = cjlVar.y;
            numValueOf3 = Integer.valueOf(i3);
            if (i3 > 0) {
                num2 = numValueOf3;
            } else {
                num2 = null;
            }
            c = 2;
            int i10 = cjlVar.z;
            iIntValue2 = ((Number) yoi1.t(comparable2, num2, i10 > 0 ? Integer.valueOf(i10) : null)).intValue();
            if (iIntValue != ((Number) obj2).intValue()) {
                jA = jjl.a(iIntValue, iIntValue, hjl.j(jA), hjl.h(jA));
                z = true;
            } else {
                z = false;
            }
            if (iIntValue2 != ((Number) obj).intValue()) {
                jA = jjl.a(hjl.k(jA), hjl.i(jA), iIntValue2, iIntValue2);
                z = true;
            }
            if (z) {
                e(cjlVar, jA);
                cjlVar.g = false;
            }
        } else {
            bjl bjlVar2 = udaVar.a;
            bjl bjlVar3 = bjl.c;
            if (bjlVar2 == bjlVar3 && cjlVar.s == 0 && udaVar.b == bjlVar3 && cjlVar.t == 0) {
                c = 2;
            } else {
                mmr0 mmr0VarE2 = e(cjlVar, jA);
                obj = mmr0VarE2.b;
                obj2 = mmr0VarE2.a;
                cjlVar.g = false;
                Comparable comparable3 = (Comparable) obj2;
                i = cjlVar.v;
                numValueOf = Integer.valueOf(i);
                if (i <= 0) {
                    numValueOf = null;
                }
                i2 = cjlVar.w;
                numValueOf2 = Integer.valueOf(i2);
                if (i2 > 0) {
                    num = numValueOf2;
                } else {
                    num = null;
                }
                iIntValue = ((Number) yoi1.t(comparable3, numValueOf, num)).intValue();
                Comparable comparable4 = (Comparable) obj;
                i3 = cjlVar.y;
                numValueOf3 = Integer.valueOf(i3);
                if (i3 > 0) {
                    num2 = numValueOf3;
                } else {
                    num2 = null;
                }
                c = 2;
                int i11 = cjlVar.z;
                iIntValue2 = ((Number) yoi1.t(comparable4, num2, i11 > 0 ? Integer.valueOf(i11) : null)).intValue();
                if (iIntValue != ((Number) obj2).intValue()) {
                    jA = jjl.a(iIntValue, iIntValue, hjl.j(jA), hjl.h(jA));
                    z = true;
                } else {
                    z = false;
                }
                if (iIntValue2 != ((Number) obj).intValue()) {
                    jA = jjl.a(hjl.k(jA), hjl.i(jA), iIntValue2, iIntValue2);
                    z = true;
                }
                if (z) {
                    e(cjlVar, jA);
                    cjlVar.g = false;
                }
            }
        }
        q5t0 q5t0Var = (q5t0) this.b.get(cjlVar.h0);
        udaVar.e = q5t0Var != null ? q5t0Var.a : cjlVar.s();
        udaVar.f = q5t0Var != null ? q5t0Var.b : cjlVar.m();
        if (q5t0Var != null) {
            ArrayList arrayList = ynb1Var.i;
            if (ynb1Var.j) {
                arrayList.clear();
                Iterator it = ynb1Var.h.iterator();
                while (it.hasNext()) {
                    cjl cjlVarB = ((u811) ynb1Var.c.get(it.next())).b();
                    if (cjlVarB != null) {
                        arrayList.add(cjlVarB);
                    }
                }
                ynb1Var.j = false;
            }
            if (arrayList.contains(cjlVar)) {
                iU = q5t0Var.U(xl3.a);
            } else {
                iU = Integer.MIN_VALUE;
            }
        } else {
            iU = Integer.MIN_VALUE;
        }
        udaVar.h = iU != Integer.MIN_VALUE;
        udaVar.g = iU;
        Object obj4 = linkedHashMap.get(str);
        if (obj4 == null) {
            Integer[] numArr2 = new Integer[3];
            c2 = 0;
            numArr2[0] = 0;
            numArr2[1] = 0;
            numArr2[c] = Integer.valueOf(os00.INVALID_ID);
            linkedHashMap.put(str, numArr2);
            obj3 = numArr2;
        } else {
            c2 = 0;
            obj3 = obj4;
        }
        Integer[] numArr3 = (Integer[]) obj3;
        numArr3[c2] = Integer.valueOf(udaVar.e);
        numArr3[1] = Integer.valueOf(udaVar.f);
        numArr3[c] = Integer.valueOf(udaVar.g);
        udaVar.i = (udaVar.e == udaVar.c && udaVar.f == udaVar.d) ? c2 : 1;
    }

    public final void c(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1750959258);
        Iterator it = this.i.iterator();
        if (it.hasNext()) {
            throw pze0.g(it);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV == null) {
            return;
        }
        h311VarV.d = new mbf0(this, i, (byte) 29);
    }

    public final void d(float f, int i, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2126574786);
        j0o1.b(0, x340Var, new ef6(this, f, (byte) 4), h2c.a.b(nim0.a));
        h311 h311VarV = x340Var.v();
        if (h311VarV == null) {
            return;
        }
        h311VarV.d = new rz2(this, f, i, (byte) 6);
    }

    public final mmr0 e(cjl cjlVar, long j) {
        int i;
        int i2 = 0;
        Object obj = cjlVar.h0;
        if (!(cjlVar instanceof ljk1)) {
            if (!(obj instanceof afh0)) {
                return new mmr0(0, 0);
            }
            q5t0 q5t0VarH = ((afh0) obj).H(j);
            this.b.put(obj, q5t0VarH);
            return new mmr0(Integer.valueOf(q5t0VarH.a), Integer.valueOf(q5t0VarH.b));
        }
        if (hjl.g(j)) {
            i = 1073741824;
        } else {
            i = hjl.e(j) ? Integer.MIN_VALUE : 0;
        }
        if (hjl.f(j)) {
            i2 = 1073741824;
        } else if (hjl.d(j)) {
            i2 = Integer.MIN_VALUE;
        }
        ljk1 ljk1Var = (ljk1) cjlVar;
        ljk1Var.Z(i, hjl.i(j), i2, hjl.h(j));
        return new mmr0(Integer.valueOf(ljk1Var.D0), Integer.valueOf(ljk1Var.E0));
    }

    public final void g(p5t0 p5t0Var, List list) {
        afh0 afh0Var;
        q5t0 q5t0Var;
        Object next;
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap.isEmpty()) {
            for (cjl cjlVar : this.a.u0) {
                Object obj = cjlVar.h0;
                if (obj instanceof afh0) {
                    xol1 xol1Var = cjlVar.j;
                    cjl cjlVar2 = xol1Var.a;
                    if (cjlVar2 != null) {
                        xol1Var.b = cjlVar2.t();
                        xol1Var.c = cjlVar2.u();
                        cjlVar2.t();
                        cjlVar2.u();
                        xol1Var.a(cjlVar2.j);
                    }
                    linkedHashMap.put(obj, new xol1(xol1Var));
                }
            }
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            afh0 afh0Var2 = (afh0) list.get(i);
            if (linkedHashMap.containsKey(afh0Var2)) {
                afh0Var = afh0Var2;
            } else {
                Iterator it = linkedHashMap.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    afh0 afh0Var3 = (afh0) next;
                    if (t3k1.s(afh0Var3) != null && u890.j(t3k1.s(afh0Var3), t3k1.s(afh0Var2))) {
                        break;
                    }
                }
                afh0Var = (afh0) next;
                if (afh0Var == null) {
                    continue;
                }
            }
            xol1 xol1Var2 = (xol1) linkedHashMap.get(afh0Var);
            if (xol1Var2 == null || (q5t0Var = (q5t0) this.b.get(afh0Var)) == null) {
                return;
            }
            if (linkedHashMap.containsKey(afh0Var2)) {
                y1a1.I(p5t0Var, q5t0Var, xol1Var2);
            } else {
                int i2 = q5t0Var.a;
                int i3 = q5t0Var.b;
                if (!((i3 >= 0) & (i2 >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                y1a1.I(p5t0Var, afh0Var2.H(jjl.h(i2, i2, i3, i3)), xol1Var2);
            }
        }
    }

    public final long h(long j, flb0 flb0Var, lil lilVar, List list) {
        a5u a5uVarL;
        a5u a5uVarL2;
        j660 j660Var;
        l660 l660VarZ;
        cjl cjlVarZ;
        if (hjl.g(j)) {
            a5uVarL = a5u.e(hjl.i(j));
        } else {
            a5uVarL = a5u.l();
            int iK = hjl.k(j);
            if (iK >= 0) {
                a5uVarL.b = iK;
            }
        }
        ynb1 ynb1Var = this.e;
        dil dilVar = ynb1Var.f;
        HashMap map = ynb1Var.d;
        HashMap map2 = ynb1Var.c;
        dil dilVar2 = ynb1Var.f;
        dilVar.d0 = a5uVarL;
        if (hjl.f(j)) {
            a5uVarL2 = a5u.e(hjl.h(j));
        } else {
            a5uVarL2 = a5u.l();
            int iJ = hjl.j(j);
            if (iJ >= 0) {
                a5uVarL2.b = iJ;
            }
        }
        dilVar2.e0 = a5uVarL2;
        a5u a5uVar = dilVar2.d0;
        cjl cjlVar = this.a;
        a5uVar.a(cjlVar, 0);
        dilVar2.e0.a(cjlVar, 1);
        ynb1Var.l = j;
        ynb1Var.b = flb0Var == flb0.a;
        this.b.clear();
        this.c.clear();
        this.d.clear();
        if (lilVar.a(list)) {
            Iterator it = map2.keySet().iterator();
            while (it.hasNext()) {
                ((u811) map2.get(it.next())).b().E();
            }
            map2.clear();
            map2.put(0, dilVar2);
            map.clear();
            ynb1Var.e.clear();
            ynb1Var.h.clear();
            ynb1Var.j = true;
            lilVar.c(ynb1Var, list);
            y1a1.r(ynb1Var, list);
            ((djl) cjlVar).u0.clear();
            dilVar2.d0.a(cjlVar, 0);
            dilVar2.e0.a(cjlVar, 1);
            for (Object obj : map.keySet()) {
                cjl cjlVarZ2 = ((j660) map.get(obj)).Z();
                if (cjlVarZ2 != null) {
                    u811 u811VarB = (u811) map2.get(obj);
                    if (u811VarB == null) {
                        u811VarB = ynb1Var.b(obj);
                    }
                    u811VarB.a(cjlVarZ2);
                }
            }
            for (Object obj2 : map2.keySet()) {
                u811 u811Var = (u811) map2.get(obj2);
                if (u811Var != dilVar2 && (u811Var.c() instanceof j660) && (cjlVarZ = ((j660) u811Var.c()).Z()) != null) {
                    u811 u811VarB2 = (u811) map2.get(obj2);
                    if (u811VarB2 == null) {
                        u811VarB2 = ynb1Var.b(obj2);
                    }
                    u811VarB2.a(cjlVarZ);
                }
            }
            Iterator it2 = map2.keySet().iterator();
            while (it2.hasNext()) {
                u811 u811Var2 = (u811) map2.get(it2.next());
                if (u811Var2 != dilVar2) {
                    cjl cjlVarB = u811Var2.b();
                    cjlVarB.k0 = u811Var2.getKey().toString();
                    cjlVarB.V = null;
                    if (u811Var2.c() instanceof vq50) {
                        u811Var2.apply();
                    }
                    cjlVar.W(cjlVarB);
                } else {
                    u811Var2.a(cjlVar);
                }
            }
            Iterator it3 = map.keySet().iterator();
            while (it3.hasNext()) {
                j660 j660Var2 = (j660) map.get(it3.next());
                if (j660Var2.Z() != null) {
                    Iterator it4 = j660Var2.m0.iterator();
                    while (it4.hasNext()) {
                        j660Var2.Z().W(((u811) map2.get(it4.next())).b());
                    }
                    j660Var2.apply();
                } else {
                    j660Var2.apply();
                }
            }
            Iterator it5 = map2.keySet().iterator();
            while (it5.hasNext()) {
                u811 u811Var3 = (u811) map2.get(it5.next());
                if (u811Var3 != dilVar2 && (u811Var3.c() instanceof j660) && (l660VarZ = (j660Var = (j660) u811Var3.c()).Z()) != null) {
                    for (Object obj3 : j660Var.m0) {
                        u811 u811Var4 = (u811) map2.get(obj3);
                        if (u811Var4 != null) {
                            l660VarZ.W(u811Var4.b());
                        } else if (obj3 instanceof u811) {
                            l660VarZ.W(((u811) obj3).b());
                        } else {
                            System.out.println("couldn't find reference for " + obj3);
                        }
                    }
                    u811Var3.apply();
                }
            }
            for (Object obj4 : map2.keySet()) {
                u811 u811Var5 = (u811) map2.get(obj4);
                u811Var5.apply();
                cjl cjlVarB2 = u811Var5.b();
                if (cjlVarB2 != null && obj4 != null) {
                    cjlVarB2.k = obj4.toString();
                }
            }
        } else {
            y1a1.r(ynb1Var, list);
        }
        cjlVar.T(hjl.i(j));
        cjlVar.O(hjl.h(j));
        this.h = Float.NaN;
        ((djl) cjlVar).v0.E(cjlVar);
        ((djl) cjlVar).H0 = 257;
        yic0.p = cjlVar.b0(512);
        int i = ((djl) cjlVar).H0;
        ((djl) cjlVar).B0 = 0;
        ((djl) cjlVar).C0 = 0;
        ((djl) cjlVar).v0.D(cjlVar, i, 0, 0, 0, 0);
        return o0c.c(cjlVar.s(), cjlVar.m());
    }

    public final void a() {
    }
}
