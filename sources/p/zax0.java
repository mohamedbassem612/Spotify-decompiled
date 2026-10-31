package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class zax0 implements Update {
    public static final zax0 a = new zax0();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [p.v9x0] */
    /* JADX WARN: Type inference failed for: r3v20, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v21, types: [p.obx0] */
    /* JADX WARN: Type inference failed for: r3v34, types: [p.v9x0] */
    /* JADX WARN: Type inference failed for: r3v35, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v36, types: [p.obx0] */
    /* JADX WARN: Type inference failed for: r3v41, types: [p.v9x0] */
    /* JADX WARN: Type inference failed for: r3v42, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v43, types: [p.obx0] */
    /* JADX WARN: Type inference failed for: r3v55, types: [p.v9x0] */
    /* JADX WARN: Type inference failed for: r3v56, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v57, types: [p.obx0] */
    /* JADX WARN: Type inference failed for: r3v64, types: [p.v9x0] */
    /* JADX WARN: Type inference failed for: r3v65, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v66, types: [p.obx0] */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    /* JADX WARN: Type inference failed for: r4v77 */
    public final Next a(Object obj, Object obj2) {
        Object next;
        String str;
        Object next2;
        int i;
        qbx0 qbx0Var = (qbx0) obj;
        yax0 yax0Var = (yax0) obj2;
        int i2 = qbx0Var.i;
        int i3 = qbx0Var.b;
        String str2 = qbx0Var.c;
        j8x0 j8x0Var = qbx0Var.e;
        if (yax0Var instanceof kax0) {
            return j8x0Var.a == 3 ? Next.i(qbx0.a(qbx0Var, j8x0.a(j8x0Var, 0, null, null, true, false, 0, 0, 119), false, 0, null, false, false, 4079), Effects.a(new w8x0[]{new w8x0(j8x0Var)})) : Next.a(Effects.a(new o8x0[]{o8x0.c}));
        }
        if (yax0Var instanceof y9x0) {
            return Next.h(qbx0.a(qbx0Var, ((y9x0) yax0Var).a, false, 0, null, false, false, 3823));
        }
        if (yax0Var instanceof nax0) {
            nax0 nax0Var = (nax0) yax0Var;
            obx0 obx0Var = nax0Var.a;
            return Next.a(Effects.a(new r8x0[]{new r8x0(obx0Var.b, nax0Var.b, obx0Var.a)}));
        }
        if (yax0Var instanceof rax0) {
            Set set = s4b1.f;
            rax0 rax0Var = (rax0) yax0Var;
            String strS = uic.x(rax0Var.a.b).s();
            return strS == null ? Next.j() : Next.a(Effects.a(new q8x0[]{new q8x0(strS, rax0Var.b)}));
        }
        boolean z = yax0Var instanceof qax0;
        fbx0 fbx0Var = fbx0.a;
        if (z) {
            qax0 qax0Var = (qax0) yax0Var;
            obx0 obx0Var2 = qax0Var.a;
            tv80 tv80Var = qax0Var.b;
            nbx0 nbx0Var = obx0Var2.a;
            if (u890.j(nbx0Var, jbx0.a)) {
                return Next.a(Effects.a(new t8x0[]{new t8x0(qbx0Var, obx0Var2, tv80Var)}));
            }
            if (u890.j(nbx0Var, fbx0Var) || u890.j(nbx0Var, hbx0.a) || (nbx0Var instanceof kbx0)) {
                return Next.a(Effects.a(new u8x0[]{new u8x0(obx0Var2, qbx0Var.l, tv80Var)}));
            }
            if (u890.j(nbx0Var, ibx0.a)) {
                return Next.a(Effects.a(new v8x0[]{new v8x0(qbx0Var, obx0Var2, tv80Var)}));
            }
            return (u890.j(nbx0Var, dbx0.a) || u890.j(nbx0Var, lbx0.a)) ? Next.a(Effects.a(new s8x0[]{new s8x0(qbx0Var, obx0Var2, tv80Var)})) : Next.j();
        }
        if (yax0Var instanceof pax0) {
            obx0 obx0Var3 = ((pax0) yax0Var).a;
            return Next.a(Effects.a(new k9x0[]{new k9x0(obx0Var3.b, !obx0Var3.f.a)}));
        }
        if (yax0Var instanceof max0) {
            return Next.a(Effects.a(new y8x0[]{new y8x0(((max0) yax0Var).a, str2)}));
        }
        if (yax0Var instanceof sax0) {
            return Next.a(Effects.a(new j9x0[]{new j9x0(((sax0) yax0Var).a.b)}));
        }
        boolean z2 = yax0Var instanceof aax0;
        int i4 = 0;
        z8x0 z8x0Var = z8x0.c;
        String str3 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        Object obj6 = null;
        str3 = null;
        str3 = null;
        if (z2) {
            aax0 aax0Var = (aax0) yax0Var;
            if (!aax0Var.a) {
                return Next.a(Effects.a(new z8x0[]{z8x0Var}));
            }
            Set set2 = s4b1.f;
            String strZ = uic.C(aax0Var.b, (String) null).z();
            strZ.getClass();
            List list = j8x0Var.b;
            ArrayList arrayList = new ArrayList();
            for (Object obj7 : list) {
                if (obj7 instanceof obx0) {
                    arrayList.add(obj7);
                }
            }
            for (Object obj8 : arrayList) {
                if (u890.j(((obx0) obj8).b, strZ)) {
                    obj3 = obj8;
                    break;
                }
            }
            obx0 obx0Var4 = (obx0) obj3;
            return obx0Var4 == null ? Next.j() : Next.i(qbx0.a(qbx0Var, j8x0.a(j8x0Var, 0, o7h.J0(j8x0Var.b, obx0Var4), null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Effects.a(new w361[]{new b9x0(obx0Var4.c)}));
        }
        if (yax0Var instanceof bax0) {
            Set set3 = s4b1.f;
            String strZ2 = uic.C(((bax0) yax0Var).a, (String) null).z();
            List list2 = j8x0Var.b;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj9 : list2) {
                if (obj9 instanceof obx0) {
                    arrayList2.add(obj9);
                }
            }
            for (Object obj10 : arrayList2) {
                if (u890.j(((obx0) obj10).b, strZ2)) {
                    obj4 = obj10;
                    break;
                }
            }
            obx0 obx0Var5 = (obx0) obj4;
            return obx0Var5 == null ? Next.j() : Next.h(qbx0.a(qbx0Var, j8x0.a(j8x0Var, 0, o7h.J0(j8x0Var.b, obx0Var5), null, false, false, 0, 0, 125), false, 0, null, false, false, 4079));
        }
        if (yax0Var instanceof cax0) {
            String str4 = ((cax0) yax0Var).a;
            Set set4 = s4b1.f;
            String strZ3 = uic.C(str4, (String) null).z();
            List list3 = j8x0Var.b;
            ArrayList arrayList3 = new ArrayList();
            for (Object obj11 : list3) {
                if (obj11 instanceof obx0) {
                    arrayList3.add(obj11);
                }
            }
            for (Object obj12 : arrayList3) {
                if (u890.j(((obx0) obj12).b, strZ3)) {
                    obj5 = obj12;
                    break;
                }
            }
            obx0 obx0Var6 = (obx0) obj5;
            return obx0Var6 == null ? Next.j() : Next.h(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, op71.G(o7h.J0(j8x0Var.b, obx0Var6)), null, false, false, 0, 0, 125), false, 0, null, false, false, 4079));
        }
        if (yax0Var instanceof jax0) {
            return Next.a(Effects.a(new w8x0[]{new w8x0(j8x0Var)}));
        }
        if (yax0Var instanceof xax0) {
            xax0 xax0Var = (xax0) yax0Var;
            if (!xax0Var.a) {
                return Next.a(Effects.a(new z8x0[]{z8x0Var}));
            }
            String str5 = xax0Var.b;
            List list4 = j8x0Var.b;
            ArrayList arrayList4 = new ArrayList();
            for (Object obj13 : list4) {
                if (obj13 instanceof obx0) {
                    arrayList4.add(obj13);
                }
            }
            for (Object obj14 : arrayList4) {
                if (u890.j(((obx0) obj14).b, str5)) {
                    obj6 = obj14;
                    break;
                }
            }
            obx0 obx0Var7 = (obx0) obj6;
            return obx0Var7 == null ? Next.j() : Next.i(qbx0.a(qbx0Var, j8x0.a(j8x0Var, 0, o7h.J0(j8x0Var.b, obx0Var7), null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Effects.a(new w361[]{new i9x0(obx0Var7.c)}));
        }
        if (yax0Var instanceof z9x0) {
            a530 a530Var = ((z9x0) yax0Var).a;
            return a530Var instanceof a530 ? Next.a(Effects.a(new a9x0[]{new a9x0(a530Var)})) : Next.a(Effects.a(new z8x0[]{z8x0Var}));
        }
        if (yax0Var instanceof vax0) {
            return (j8x0Var.d || j8x0Var.e || !(j8x0Var.c != null || (i3 == 6 && ((i = j8x0Var.g) == 2 || i == 3 || i == 4))) == true || i2 >= 3) ? Next.j() : Next.i(qbx0.a(qbx0Var, j8x0.a(j8x0Var, 0, null, null, true, false, 0, 0, 119), false, 0, null, false, false, 4079), Effects.a(new p8x0[]{new p8x0(j8x0Var)}));
        }
        if (yax0Var instanceof uax0) {
            return Next.h(qbx0.a(qbx0Var, j8x0.a(((uax0) yax0Var).a, 0, null, null, false, false, 0, 0, 119), false, 0, null, false, false, 3823));
        }
        if (yax0Var instanceof tax0) {
            int i5 = i2 + 1;
            return Next.i(qbx0.a(qbx0Var, j8x0.a(((tax0) yax0Var).a, 0, null, null, false, false, 0, 0, 119), false, i5, null, false, false, 3823), Effects.a(new h9x0[]{new h9x0(i3, i5 < 3)}));
        }
        if (yax0Var instanceof wax0) {
            return Next.h(qbx0.a(qbx0Var, null, false, 0, ((wax0) yax0Var).a, false, false, 3583));
        }
        if (yax0Var instanceof x9x0) {
            return Next.h(qbx0.a(qbx0Var, null, false, 0, null, false, ((x9x0) yax0Var).a, 2047));
        }
        if (yax0Var instanceof w9x0) {
            w9x0 w9x0Var = (w9x0) yax0Var;
            return Next.a(Effects.a(new x8x0[]{new x8x0(w9x0Var.b, w9x0Var.a)}));
        }
        if (yax0Var instanceof iax0) {
            Set set5 = s4b1.f;
            String strZ4 = uic.C(((iax0) yax0Var).a, (String) null).z();
            List<??> list5 = j8x0Var.b;
            ArrayList arrayList5 = new ArrayList(q7h.U(list5, 10));
            for (?? A : list5) {
                if (A instanceof obx0) {
                    obx0 obx0Var8 = (obx0) A;
                    if ((obx0Var8.a instanceof kbx0) && u890.j(obx0Var8.b, strZ4)) {
                        A = obx0.a(obx0Var8, null, null, null, null, null, null, 5, 2047);
                    }
                }
                arrayList5.add(A);
            }
            return Next.h(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList5, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079));
        }
        if (yax0Var instanceof hax0) {
            Set set6 = s4b1.f;
            String strZ5 = uic.C(((hax0) yax0Var).a, (String) null).z();
            List list6 = j8x0Var.b;
            ArrayList arrayList6 = new ArrayList();
            for (Object obj15 : list6) {
                if (obj15 instanceof obx0) {
                    arrayList6.add(obj15);
                }
            }
            if (!arrayList6.isEmpty()) {
                Iterator it = arrayList6.iterator();
                while (it.hasNext()) {
                    if (u890.j(((obx0) it.next()).b, strZ5)) {
                        return Next.a(Effects.a(new g9x0[]{g9x0.c}));
                    }
                }
            }
            return Next.j();
        }
        boolean z3 = yax0Var instanceof lax0;
        gbx0 gbx0Var = gbx0.a;
        if (z3) {
            obx0 obx0Var9 = ((lax0) yax0Var).a;
            nbx0 nbx0Var2 = obx0Var9.a;
            String str6 = obx0Var9.b;
            if (!u890.j(nbx0Var2, gbx0Var)) {
                return Next.j();
            }
            Set set7 = s4b1.f;
            String strS2 = uic.x(str6).s();
            if (strS2 == null) {
                return Next.j();
            }
            List<??> list7 = j8x0Var.b;
            ArrayList arrayList7 = new ArrayList(q7h.U(list7, 10));
            for (?? A2 : list7) {
                if (A2 instanceof obx0) {
                    obx0 obx0Var10 = (obx0) A2;
                    if (u890.j(obx0Var10.b, str6)) {
                        A2 = obx0.a(obx0Var10, null, null, null, null, null, null, 2, 2047);
                    }
                }
                arrayList7.add(A2);
            }
            return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList7, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Collections.singleton(new m8x0(str2, strS2)));
        }
        if (yax0Var instanceof eax0) {
            Set set8 = s4b1.f;
            String strZ6 = uic.C(((eax0) yax0Var).a, (String) null).z();
            List list8 = j8x0Var.b;
            ArrayList arrayList8 = new ArrayList();
            for (Object obj16 : list8) {
                if (obj16 instanceof obx0) {
                    arrayList8.add(obj16);
                }
            }
            Iterator it2 = arrayList8.iterator();
            do {
                if (!it2.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it2.next();
            } while (!u890.j(((obx0) next2).b, strZ6));
            obx0 obx0Var11 = (obx0) next2;
            if (obx0Var11 == null) {
                return Next.j();
            }
            obx0 obx0VarA = obx0.a(obx0Var11, fbx0Var, null, null, null, null, null, 0, 4094);
            List list9 = j8x0Var.b;
            ArrayList arrayList9 = new ArrayList();
            for (Object obj17 : list9) {
                if (((v9x0) obj17) != obx0Var11) {
                    arrayList9.add(obj17);
                }
            }
            Iterator it3 = arrayList9.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    i4 = -1;
                    break;
                }
                if (((v9x0) it3.next()) instanceof zbx0) {
                    break;
                }
                i4++;
            }
            Integer numValueOf = Integer.valueOf(i4);
            if (i4 < 0) {
                numValueOf = null;
            }
            int iIntValue = numValueOf != null ? numValueOf.intValue() : arrayList9.size();
            ArrayList arrayList10 = new ArrayList(arrayList9);
            arrayList10.add(iIntValue, obx0VarA);
            String str7 = obx0Var11.c;
            String str8 = str7.length() > 0 ? str7 : null;
            xj61 xj61Var = new xj61();
            if (str8 != null) {
                xj61Var.add(new d9x0(str8));
            }
            return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList10, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), cwl1.j(xj61Var));
        }
        if (yax0Var instanceof dax0) {
            Set set9 = s4b1.f;
            String strZ7 = uic.C(((dax0) yax0Var).a, (String) null).z();
            List list10 = j8x0Var.b;
            ArrayList arrayList11 = new ArrayList();
            for (Object obj18 : list10) {
                if (obj18 instanceof obx0) {
                    arrayList11.add(obj18);
                }
            }
            if (!arrayList11.isEmpty()) {
                Iterator it4 = arrayList11.iterator();
                while (it4.hasNext()) {
                    if (u890.j(((obx0) it4.next()).b, strZ7)) {
                        List<??> list11 = j8x0Var.b;
                        ArrayList arrayList12 = new ArrayList(q7h.U(list11, 10));
                        for (?? A3 : list11) {
                            if (A3 instanceof obx0) {
                                obx0 obx0Var12 = (obx0) A3;
                                if (u890.j(obx0Var12.b, strZ7)) {
                                    A3 = obx0.a(obx0Var12, null, null, null, null, null, null, 1, 2047);
                                }
                            }
                            arrayList12.add(A3);
                        }
                        return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList12, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Collections.singleton(c9x0.c));
                    }
                }
            }
            return Next.j();
        }
        if (yax0Var instanceof oax0) {
            obx0 obx0Var13 = ((oax0) yax0Var).a;
            nbx0 nbx0Var3 = obx0Var13.a;
            String str9 = obx0Var13.b;
            if (!u890.j(nbx0Var3, gbx0Var)) {
                return Next.j();
            }
            Set set10 = s4b1.f;
            String strS3 = uic.x(str9).s();
            if (strS3 == null) {
                return Next.j();
            }
            List<??> list12 = j8x0Var.b;
            ArrayList arrayList13 = new ArrayList(q7h.U(list12, 10));
            for (?? A4 : list12) {
                if (A4 instanceof obx0) {
                    obx0 obx0Var14 = (obx0) A4;
                    if (u890.j(obx0Var14.b, str9)) {
                        A4 = obx0.a(obx0Var14, null, null, null, null, null, null, 6, 2047);
                    }
                }
                arrayList13.add(A4);
            }
            return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList13, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Collections.singleton(new n8x0(str2, strS3)));
        }
        if (!(yax0Var instanceof gax0)) {
            if (!(yax0Var instanceof fax0)) {
                eg.o();
                return null;
            }
            Set set11 = s4b1.f;
            String strZ8 = uic.C(((fax0) yax0Var).a, (String) null).z();
            List list13 = j8x0Var.b;
            ArrayList arrayList14 = new ArrayList();
            for (Object obj19 : list13) {
                if (obj19 instanceof obx0) {
                    arrayList14.add(obj19);
                }
            }
            if (!arrayList14.isEmpty()) {
                Iterator it5 = arrayList14.iterator();
                while (it5.hasNext()) {
                    if (u890.j(((obx0) it5.next()).b, strZ8)) {
                        List<??> list14 = j8x0Var.b;
                        ArrayList arrayList15 = new ArrayList(q7h.U(list14, 10));
                        for (?? A5 : list14) {
                            if (A5 instanceof obx0) {
                                obx0 obx0Var15 = (obx0) A5;
                                if (u890.j(obx0Var15.b, strZ8)) {
                                    A5 = obx0.a(obx0Var15, null, null, null, null, null, null, 1, 2047);
                                }
                            }
                            arrayList15.add(A5);
                        }
                        return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayList15, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), Collections.singleton(e9x0.c));
                    }
                }
            }
            return Next.j();
        }
        Set set12 = s4b1.f;
        String strZ9 = uic.C(((gax0) yax0Var).a, (String) null).z();
        List list15 = j8x0Var.b;
        ArrayList arrayList16 = new ArrayList();
        for (Object obj20 : list15) {
            if (obj20 instanceof obx0) {
                arrayList16.add(obj20);
            }
        }
        Iterator it6 = arrayList16.iterator();
        do {
            if (!it6.hasNext()) {
                next = null;
                break;
            }
            next = it6.next();
        } while (!u890.j(((obx0) next).b, strZ9));
        obx0 obx0Var16 = (obx0) next;
        List list16 = j8x0Var.b;
        ArrayList arrayList17 = new ArrayList();
        for (Object obj21 : list16) {
            if (((v9x0) obj21) != obx0Var16) {
                arrayList17.add(obj21);
            }
        }
        ArrayList arrayListG = op71.G(arrayList17);
        if (obx0Var16 != null && (str = obx0Var16.c) != null && str.length() > 0) {
            str3 = str;
        }
        xj61 xj61Var2 = new xj61();
        if (str3 != null) {
            xj61Var2.add(new f9x0(str3));
        }
        return Next.i(qbx0.a(qbx0Var, j8x0.a(qbx0Var.e, 0, arrayListG, null, false, false, 0, 0, 125), false, 0, null, false, false, 4079), cwl1.j(xj61Var2));
    }
}
