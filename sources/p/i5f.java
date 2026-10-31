package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class i5f implements Update {
    public static final i5f a = new i5f();

    /* JADX WARN: Code duplicated, block: B:160:0x0404  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Next a(Object obj, Object obj2) {
        ArrayList arrayListO0;
        int i;
        Map map;
        goe goeVarA;
        tom tomVar;
        kye kyeVar;
        Object next;
        Object next2;
        Integer numValueOf;
        ncf ncfVar = (ncf) obj;
        i1f i1fVar = (q3f) obj2;
        boolean z = ncfVar.t;
        int i2 = ncfVar.Q0;
        goe goeVar = ncfVar.a;
        mcf mcfVar = ncfVar.g;
        if (i1fVar instanceof h1f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, ((h1f) i1fVar).a, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -4097, 7));
        }
        boolean z2 = i1fVar instanceof i1f;
        byte b = 0;
        lcf lcfVar = lcf.a;
        if (z2) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            goe goeVar2 = i1fVar.a;
            jlh1 jlh1Var = goeVar2.h;
            List list = goeVar2.f;
            if (jlh1Var.a > 0) {
                linkedHashSet.add(new txe(goeVar2.a));
            }
            w4i1 w4i1Var = ncfVar.b;
            Map map2 = ncfVar.Z0;
            String str = w4i1Var.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : list) {
                if (!u890.j(((tom) obj3).c.a, str)) {
                    arrayList.add(obj3);
                }
            }
            int i3 = 1;
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lpl lplVar = ((tom) it.next()).f;
                lpl lplVar2 = lplVar instanceof lpl ? lplVar : null;
                String str2 = lplVar2 != null ? lplVar2.a : null;
                if (str2 != null) {
                    arrayList2.add(str2);
                }
            }
            Set setP1 = o7h.p1(arrayList2);
            if (!setP1.isEmpty()) {
                linkedHashSet.add(new cye(setP1));
            }
            String str3 = ncfVar.X;
            if (str3 != null) {
                linkedHashSet.add(new swe(str3));
            }
            String str4 = ncfVar.O0;
            if (str4 != null) {
                linkedHashSet.add(new sxe(str4));
            }
            List list2 = goeVar.f;
            List list3 = list2;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj4 : list3) {
                tom tomVar2 = (tom) obj4;
                if (lro1.w(tomVar2) || lro1.t(tomVar2)) {
                    arrayList3.add(obj4);
                }
            }
            if (arrayList3.isEmpty()) {
                i = 1;
                map = map2;
                goeVarA = goeVar2;
            } else if (u890.j(mcfVar, lcfVar)) {
                map = map2;
                goeVarA = goe.a(goeVar2, null, null, null, null, o7h.N0(list, arrayList3), 0, 4063);
                i = 1;
            } else {
                map = map2;
                ba80 ba80VarU1 = o7h.u1(list3);
                int iS = zno1.s(q7h.U(ba80VarU1, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                ca80 it2 = ba80VarU1.iterator();
                while (true) {
                    ca80 ca80Var = it2;
                    if (!((Iterator) ca80Var.c).hasNext()) {
                        break;
                    }
                    aa80 aa80Var = (aa80) ca80Var.next();
                    int i4 = aa80Var.a;
                    String str5 = ((tom) aa80Var.b).a;
                    tom tomVar3 = (tom) o7h.t0(i4 + 1, list2);
                    linkedHashMap.put(str5, tomVar3 != null ? tomVar3.a : null);
                }
                ArrayList arrayList4 = new ArrayList(list);
                ud31 it3 = new wd31(arrayList3).iterator();
                while (true) {
                    ListIterator listIterator = (ListIterator) it3.b;
                    if (!listIterator.hasPrevious()) {
                        break;
                    }
                    tom tomVar4 = (tom) listIterator.previous();
                    int i5 = i3;
                    Iterator it4 = z561.S(z561.c0(new paf(linkedHashMap, b), tomVar4.a), i5).iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            numValueOf = null;
                            break;
                        }
                        String str6 = (String) it4.next();
                        Iterator it5 = arrayList4.iterator();
                        int i6 = b;
                        while (true) {
                            if (!it5.hasNext()) {
                                i6 = -1;
                                break;
                            }
                            if (u890.j(((tom) it5.next()).a, str6)) {
                                break;
                            }
                            i6++;
                        }
                        numValueOf = Integer.valueOf(i6);
                        if (i6 < 0) {
                            numValueOf = null;
                        }
                        if (numValueOf != null) {
                            break;
                        }
                        b = 0;
                    }
                    if (numValueOf != null) {
                        arrayList4.add(numValueOf.intValue(), tomVar4);
                    } else {
                        arrayList4.add(tomVar4);
                    }
                    i3 = i5;
                    b = 0;
                }
                i = i3;
                goeVarA = goe.a(goeVar2, null, null, null, null, arrayList4, 0, 4063);
            }
            List list4 = goeVarA.f;
            ArrayList arrayList5 = new ArrayList(q7h.U(list4, 10));
            Iterator it6 = list4.iterator();
            while (it6.hasNext()) {
                arrayList5.add(((tom) it6.next()).a);
            }
            Set setP2 = o7h.p1(arrayList5);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (setP2.contains((String) entry.getKey())) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            Iterator it7 = sqg0.L(map, linkedHashMap2.keySet()).entrySet().iterator();
            while (it7.hasNext()) {
                linkedHashSet.add(new zwe((List) ((Map.Entry) it7.next()).getValue()));
            }
            int i7 = i;
            ncf ncfVarA = ncf.a(ncfVar, goeVarA, (acf) null, (nlv) null, kcf.a, false, 0, false, false, (!ncfVar.c || i2 <= goeVar2.g) ? 0 : i, (String) null, 0, (t7q0) null, false, (Map) null, false, linkedHashMap2, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -33582146, 7);
            pfs0 pfs0Var = ncfVarA.d1;
            if (pfs0Var == null) {
                tomVar = null;
            } else if (pfs0Var instanceof nfs0) {
                Iterator it8 = list4.iterator();
                do {
                    if (!it8.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it8.next();
                } while (!u890.j(((tom) next2).a, ((nfs0) pfs0Var).a));
                tomVar = (tom) next2;
            } else {
                if (!(pfs0Var instanceof ofs0)) {
                    eg.o();
                    return null;
                }
                String strK = nzy.k(((ofs0) pfs0Var).a);
                Iterator it9 = list4.iterator();
                while (true) {
                    if (!it9.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it9.next();
                    lpl lplVar3 = ((tom) next).f;
                    if ((lplVar3 instanceof lpl) && lplVar3.e != null && nzy.k(lplVar3.a).equals(strK)) {
                        break;
                    }
                }
                tomVar = (tom) next;
            }
            if (tomVar != null) {
                linkedHashSet.add(new zxe(ncfVarA.a.a, tomVar.a, pfs0Var.getEntityUri(), sl01.a));
            }
            ncf ncfVarA2 = ncf.a(ncfVarA, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, tomVar != null ? null : pfs0Var, (uu2) null, false, (h5f) null, (List) null, -536870913, 7);
            goe goeVar3 = ncfVarA2.a;
            boolean z3 = mcfVar instanceof kcf;
            ArrayList arrayListG = ncfVarA2.g();
            jye jyeVar = (z3 && ncfVar.g().equals(arrayListG)) ? null : new jye(arrayListG);
            if (jyeVar != null) {
                linkedHashSet.add(jyeVar);
            }
            boolean z4 = mcfVar instanceof kcf;
            int i8 = (z4 && goeVar.c.a()) ? i7 : 0;
            boolean zA = goeVar3.c.a();
            if (ncfVarA2.T0) {
                ctf ctfVar = goeVar3.b;
                if (((ctfVar instanceof atf) || ((ctfVar instanceof btf) && ncfVarA2.U0)) && !(z4 && i8 == zA)) {
                    kyeVar = new kye(goeVar3.a, zA);
                } else {
                    kyeVar = null;
                }
            } else {
                kyeVar = null;
            }
            if (kyeVar != null) {
                linkedHashSet.add(kyeVar);
            }
            return Next.i(ncfVarA2, linkedHashSet);
        }
        boolean z5 = true;
        if (i1fVar instanceof f1f) {
            return (u890.j(mcfVar, lcfVar) || (mcfVar instanceof hcf)) ? Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, jcf.a, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -2113, 7)) : Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -2049, 7));
        }
        if (i1fVar instanceof o1f) {
            return Next.i(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, lcfVar, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -65, 7), Effects.a(new oxe[]{new oxe(goeVar.a)}));
        }
        if (i1fVar instanceof f2f) {
            return Next.a(Effects.a(new dxe[]{dxe.a}));
        }
        if (i1fVar instanceof g2f) {
            return Next.a(Effects.a(new qxe[]{new qxe(goeVar.a)}));
        }
        if (i1fVar instanceof s1f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, ((s1f) i1fVar).a, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -257, 7));
        }
        boolean z6 = i1fVar instanceof c1f;
        Object obj5 = twe.a;
        cxe cxeVar = cxe.a;
        if (z6) {
            if (z) {
                obj5 = cxeVar;
            }
            return Next.a(Collections.singleton(obj5));
        }
        boolean zEquals = i1fVar.equals(g1f.a);
        rxe rxeVar = rxe.a;
        if (zEquals) {
            return Next.a(Effects.a(new rxe[]{rxeVar}));
        }
        if (i1fVar instanceof e1f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -9, 7));
        }
        if (i1fVar instanceof m3f) {
            m3f m3fVar = (m3f) i1fVar;
            acf acfVar = ncfVar.e;
            boolean z7 = m3fVar.b;
            w4i1 w4i1Var2 = m3fVar.a;
            if (z7) {
                arrayListO0 = o7h.O0(w4i1Var2, acfVar.a);
            } else {
                List list5 = acfVar.a;
                ArrayList arrayList6 = new ArrayList();
                for (Object obj6 : list5) {
                    if (!u890.j(((w4i1) obj6).a, w4i1Var2.a)) {
                        arrayList6.add(obj6);
                    }
                }
                arrayListO0 = arrayList6;
            }
            ncf ncfVarA3 = ncf.a(ncfVar, (goe) null, acf.a(acfVar, arrayListO0, 6), (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -17, 7);
            boolean z8 = mcfVar instanceof kcf;
            ArrayList arrayListG2 = ncfVarA3.g();
            jye jyeVar2 = (z8 && ncfVar.g().equals(arrayListG2)) ? null : new jye(arrayListG2);
            return jyeVar2 != null ? Next.i(ncfVarA3, Effects.a(new jye[]{jyeVar2})) : Next.h(ncfVarA3);
        }
        if (i1fVar instanceof k1f) {
            k1f k1fVar = (k1f) i1fVar;
            if (!(mcfVar instanceof hcf)) {
                return Next.j();
            }
            List<tom> list6 = k1fVar.c;
            List listO = goeVar.f;
            for (tom tomVar5 : list6) {
                listO = lro1.o(listO, new w9f(k1fVar, tomVar5, (byte) 1), new qaf(tomVar5, (byte) 0));
            }
            return Next.i(ncf.a(ncfVar, goe.a(ncfVar.a, k1fVar.a, null, null, null, o7h.a1(listO, new p0d((byte) 5)), 0, 4062), (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -2, 7), Effects.a(new mye[]{new mye(new bif(k1fVar.a, i2))}));
        }
        if (i1fVar instanceof j1f) {
            j1f j1fVar = (j1f) i1fVar;
            AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            List<tom> list7 = ncfVar.a.f;
            ArrayList arrayList7 = new ArrayList(q7h.U(list7, 10));
            for (tom tomVarA : list7) {
                if (u890.j(tomVarA.a, j1fVar.a)) {
                    tomVarA = tom.a(tomVarA, null, null, new oom(atomicBoolean.getAndSet(false), false), null, null, null, false, 4031);
                }
                arrayList7.add(tomVarA);
            }
            hcf hcfVar = ncfVar.g;
            if (!(hcfVar instanceof hcf)) {
                return Next.j();
            }
            hcf hcfVar2 = hcfVar;
            return Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, null, null, null, null, arrayList7, 0, 4063), (acf) null, (nlv) null, new hcf(hcfVar2.a, true, hcfVar2.c), false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -66, 7));
        }
        if (i1fVar instanceof b3f) {
            b3f b3fVar = (b3f) i1fVar;
            long j = b3fVar.b;
            mcf mcfVar2 = ncfVar.g;
            goe goeVar4 = ncfVar.a;
            w4i1 w4i1Var3 = ncfVar.b;
            if (!(mcfVar2 instanceof icf)) {
                if (!u890.j(mcfVar2, kcf.a)) {
                    return Next.j();
                }
                tom tomVarO0 = lro1.o0(b3fVar, w4i1Var3, goeVar4.a);
                wxe wxeVar = new wxe(goeVar4.a, String.valueOf(j), tomVarO0, ncfVar.j1, ncfVar.e1);
                goe goeVarA2 = goe.a(ncfVar.a, null, null, null, null, o7h.N0(goeVar4.f, Collections.singletonList(tomVarO0)), 0, 4063);
                zks0 zks0Var = goeVar4.c;
                if (zks0Var.d == yks0.b || zks0Var.b != xks0.b) {
                    z5 = false;
                }
                return Next.i(ncf.a(ncfVar, goeVarA2, (acf) null, (nlv) null, (mcf) null, z5, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -295042, 7), Effects.a(new nye[]{wxeVar, rxeVar}));
            }
            tom tomVarO1 = lro1.o0(b3fVar, w4i1Var3, goeVar4.a);
            icf icfVar = (icf) mcfVar2;
            w4i1 w4i1Var4 = w4i1Var3;
            ncf ncfVarA4 = ncf.a(ncfVar, goe.a(ncfVar.a, null, null, null, null, Collections.singletonList(tomVarO1), 0, 4063), (acf) null, (nlv) null, new hcf(new bcf(tomVarO1.a, tomVarO1), false, icfVar.a), false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -32834, 7);
            List list8 = goeVar4.e;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj7 : list8) {
                w4i1 w4i1Var5 = w4i1Var4;
                if (!u890.j(((jwm) obj7).a.a, w4i1Var5.a)) {
                    arrayList8.add(obj7);
                }
                w4i1Var4 = w4i1Var5;
            }
            ArrayList arrayList9 = new ArrayList(q7h.U(arrayList8, 10));
            Iterator it10 = arrayList8.iterator();
            while (it10.hasNext()) {
                arrayList9.add(((jwm) it10.next()).a.a);
            }
            String strValueOf = String.valueOf(j);
            btf btfVar = goeVar4.b;
            btf btfVar2 = btfVar instanceof btf ? btfVar : null;
            return Next.i(ncfVarA4, Effects.a(new wwe[]{new wwe(btfVar2 != null ? btfVar2.a : null, arrayList9, strValueOf, icfVar.a, tomVarO1)}));
        }
        if (i1fVar instanceof a3f) {
            return lro1.Y(ncfVar, (a3f) i1fVar);
        }
        if (i1fVar instanceof g3f) {
            return lro1.a0(ncfVar, (g3f) i1fVar);
        }
        if (i1fVar instanceof y2f) {
            return lro1.W(ncfVar, (y2f) i1fVar);
        }
        if (i1fVar instanceof x2f) {
            return lro1.V(ncfVar, (x2f) i1fVar);
        }
        if (i1fVar instanceof p1f) {
            p1f p1fVar = (p1f) i1fVar;
            goe goeVar5 = ncfVar.a;
            List list9 = goeVar5.f;
            ArrayList arrayList10 = new ArrayList();
            for (Object obj8 : list9) {
                if (!u890.j(((tom) obj8).a, p1fVar.a)) {
                    arrayList10.add(obj8);
                }
            }
            return arrayList10.size() == goeVar5.f.size() ? Next.j() : Next.h(ncf.a(ncfVar, goe.a(ncfVar.a, null, null, null, null, arrayList10, 0, 4063), (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -2, 7));
        }
        if (i1fVar instanceof r2f) {
            return lro1.R(ncfVar, (r2f) i1fVar);
        }
        if (i1fVar instanceof d2f) {
            return lro1.K(ncfVar, (d2f) i1fVar);
        }
        if (i1fVar instanceof o2f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -262145, 7));
        }
        if (i1fVar instanceof i3f) {
            return lro1.c0(ncfVar, (i3f) i1fVar);
        }
        if (i1fVar instanceof l2f) {
            return lro1.L(ncfVar, (l2f) i1fVar);
        }
        if (i1fVar instanceof e3f) {
            return lro1.N(ncfVar, (e3f) i1fVar);
        }
        if (i1fVar instanceof d3f) {
            return lro1.M(ncfVar, (d3f) i1fVar);
        }
        if (i1fVar instanceof s2f) {
            return lro1.S(ncfVar, (s2f) i1fVar);
        }
        if (i1fVar instanceof p2f) {
            return lro1.Q(ncfVar, (p2f) i1fVar);
        }
        if (i1fVar instanceof n2f) {
            return lro1.P(ncfVar, (n2f) i1fVar);
        }
        if (i1fVar.equals(k3f.a)) {
            return lro1.e0(ncfVar);
        }
        if (i1fVar.equals(n1f.a)) {
            return lro1.z(ncfVar);
        }
        if (i1fVar instanceof j2f) {
            ou80 ou80Var = ((j2f) i1fVar).a;
            String strH = ncfVar.h();
            return ihc1.y0(strH) ? Next.j() : Next.a(Effects.a(new hxe[]{new hxe(strH, ou80Var)}));
        }
        if (i1fVar instanceof k2f) {
            k2f k2fVar = (k2f) i1fVar;
            ou80 ou80Var2 = k2fVar.a;
            int i9 = k2fVar.b;
            String strH2 = ncfVar.h();
            return ihc1.y0(strH2) ? Next.j() : Next.a(Effects.a(new ixe[]{new ixe(strH2, ou80Var2, i9)}));
        }
        if (i1fVar instanceof h3f) {
            return lro1.b0(ncfVar, (h3f) i1fVar);
        }
        if (i1fVar instanceof f3f) {
            return lro1.Z(ncfVar, (f3f) i1fVar);
        }
        if (i1fVar instanceof t2f) {
            return lro1.T(ncfVar, (t2f) i1fVar);
        }
        if (i1fVar instanceof q1f) {
            return lro1.A(ncfVar, (q1f) i1fVar);
        }
        if (i1fVar instanceof z2f) {
            return lro1.X(ncfVar, (z2f) i1fVar);
        }
        if (i1fVar instanceof b2f) {
            return lro1.J(ncfVar, (b2f) i1fVar);
        }
        if (i1fVar instanceof z1f) {
            return lro1.I(ncfVar, (z1f) i1fVar);
        }
        if (i1fVar instanceof l3f) {
            return lro1.f0(ncfVar, (l3f) i1fVar);
        }
        if (i1fVar instanceof c2f) {
            return Next.a(Effects.a(new eye[]{new eye(((c2f) i1fVar).a)}));
        }
        if (i1fVar instanceof l1f) {
            l1f l1fVar = (l1f) i1fVar;
            return Next.a(Effects.a(new exe[]{new exe(l1fVar.a, l1fVar.b)}));
        }
        if (i1fVar instanceof m2f) {
            return lro1.O(ncfVar, (m2f) i1fVar);
        }
        if (i1fVar.equals(d1f.a)) {
            return lro1.y(ncfVar);
        }
        if (u890.j(i1fVar, u1f.a)) {
            return lro1.D(ncfVar);
        }
        if (u890.j(i1fVar, t1f.a)) {
            return lro1.C(ncfVar);
        }
        if (i1fVar instanceof v2f) {
            return lro1.U((v2f) i1fVar);
        }
        if (u890.j(i1fVar, b1f.a)) {
            return Next.j();
        }
        if (i1fVar instanceof y1f) {
            return lro1.H(ncfVar, (y1f) i1fVar);
        }
        if (i1fVar instanceof e2f) {
            e2f e2fVar = (e2f) i1fVar;
            boolean z9 = e2fVar.a;
            ncf ncfVarA5 = ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, z9 ? false : ncfVar.V0, (Map) null, z9, (Map) null, (String) null, (pfs0) null, (uu2) null, false, (h5f) null, (List) null, -18874369, 7);
            if (!e2fVar.a && ncfVarA5.T0 && (ncfVarA5.g instanceof kcf)) {
                goe goeVar6 = ncfVarA5.a;
                ctf ctfVar2 = goeVar6.b;
                if ((ctfVar2 instanceof atf) || ((ctfVar2 instanceof btf) && ncfVarA5.U0)) {
                    return Next.i(ncfVarA5, Effects.a(new kye[]{new kye(goeVar6.a, goeVar6.c.a())}));
                }
            }
            return Next.h(ncfVarA5);
        }
        if (i1fVar instanceof z0f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, ((z0f) i1fVar).a, false, (h5f) null, (List) null, Integer.MAX_VALUE, 7));
        }
        if (i1fVar instanceof a1f) {
            return Next.h(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, (String) null, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, ((a1f) i1fVar).a, (h5f) null, (List) null, -1, 6));
        }
        if (u890.j(i1fVar, i2f.a)) {
            if (z) {
                obj5 = cxeVar;
            }
            return Next.a(Collections.singleton(obj5));
        }
        if (i1fVar instanceof c3f) {
            return Next.a(Effects.a(new xxe[]{new xxe(((c3f) i1fVar).a, ncfVar.b.a)}));
        }
        if (i1fVar instanceof r1f) {
            return lro1.B((r1f) i1fVar);
        }
        if (i1fVar instanceof o3f) {
            return lro1.g0((o3f) i1fVar);
        }
        if (i1fVar instanceof w1f) {
            return lro1.F(ncfVar, (w1f) i1fVar);
        }
        if (u890.j(i1fVar, v1f.a)) {
            return lro1.E(ncfVar);
        }
        if (i1fVar instanceof x1f) {
            return lro1.G(ncfVar, (x1f) i1fVar);
        }
        if (i1fVar instanceof j3f) {
            return lro1.d0(ncfVar, (j3f) i1fVar);
        }
        if (i1fVar instanceof w2f) {
            w2f w2fVar = (w2f) i1fVar;
            return Next.i(ncf.a(ncfVar, (goe) null, (acf) null, (nlv) null, (mcf) null, false, 0, false, false, false, w2fVar.a, 0, (t7q0) null, false, (Map) null, false, (Map) null, (String) null, (pfs0) null, (uu2) null, false, h5f.MESSAGES, (List) null, -16385, 5), cwl1.j0(new sxe(w2fVar.a)));
        }
        eg.o();
        return null;
    }
}
