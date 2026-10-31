package p;

import android.graphics.Bitmap;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import com.spotify.playlist.policy.proto.PlaylistRequestDecorationPolicy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class l041 {
    public static final long g;
    public static final vp70 h;
    public static final trc0 i;
    public final xrc0 a;
    public final uu00 b;
    public final xaz0 c;
    public final xpv0 d;
    public final yqg e;
    public final xoe1 f;

    static {
        ytw0 ytw0Var = jfv.b;
        g = fdg1.k0(5, ngv.e);
        h = vp70.d;
        hru0 hru0VarS = PlaylistRequestDecorationPolicy.s();
        sku0 sku0VarP = PlaylistDecorationPolicy.p();
        sku0VarP.R();
        sku0VarP.G();
        hru0VarS.x(sku0VarP);
        i = new trc0(hru0VarS.build(), (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
    }

    public l041(xrc0 xrc0Var, uu00 uu00Var, xaz0 xaz0Var, xpv0 xpv0Var, nju njuVar, ytw0 ytw0Var, yqg yqgVar) {
        o9x0 o9x0Var = o9x0.R0;
        this.a = xrc0Var;
        this.b = uu00Var;
        this.c = xaz0Var;
        this.d = xpv0Var;
        this.e = yqgVar;
        this.f = o9x0Var;
    }

    public final List a(wwx0 wwx0Var) {
        if (wwx0Var == null) {
            return z6x.a;
        }
        String str = wwx0Var.d;
        LinkedHashMap linkedHashMapD = str == null ? null : nju.d(str);
        if (linkedHashMapD == null) {
            linkedHashMapD = b7x.a;
        }
        List listQ0 = ihc1.Q0(wwx0Var.b, new String[]{","}, 0, 6);
        ArrayList arrayList = new ArrayList(q7h.U(listQ0, 10));
        Iterator it = listQ0.iterator();
        while (it.hasNext()) {
            arrayList.add(ihc1.e1((String) it.next()).toString());
        }
        ArrayList<String> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (String str2 : arrayList2) {
            String str3 = (String) linkedHashMapD.get(str2);
            if (str3 != null) {
                str2 = str3;
            }
            arrayList3.add(str2);
        }
        return arrayList3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, voe1 voe1Var, onm onmVar) {
        a041 a041Var;
        if (onmVar instanceof a041) {
            a041Var = (a041) onmVar;
            int i2 = a041Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                a041Var.c = i2 - Integer.MIN_VALUE;
            } else {
                a041Var = new a041(this, onmVar);
            }
        } else {
            a041Var = new a041(this, onmVar);
        }
        Object objF = a041Var.a;
        int i3 = a041Var.c;
        if (i3 == 0) {
            hm5.M(objF);
            iu30 l24Var = new l24(this, voe1Var, str, (lnm) null, (byte) 26);
            a041Var.c = 1;
            objF = f(l24Var, a041Var);
            Object obj = d9n.a;
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        Bitmap bitmap = (Bitmap) objF;
        if (bitmap != null) {
            return new yk4(bitmap);
        }
        return null;
    }

    public final List c(uv00 uv00Var, List list, int i2, LinkedHashSet linkedHashSet) {
        Object obj;
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        List listK0 = z561.k0(z561.T(new nqv(linkedHashSet2, (byte) 2), z561.f0(new zw11(this, uv00Var), new i46(list, (byte) 1))));
        if (linkedHashSet == null) {
            return o7h.d1(listK0, i2);
        }
        List list2 = listK0;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list2) {
            String str = ((xz31) obj2).c;
            if (str == null || !linkedHashSet.contains(str)) {
                arrayList.add(obj2);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            xz31 xz31Var = (xz31) obj3;
            String str2 = xz31Var.c;
            if (str2 != null) {
                obj = xz31Var;
                obj = str2;
            }
            obj = xz31Var;
            if (hashSet.add(obj)) {
                arrayList2.add(obj3);
            }
        }
        List listD1 = o7h.d1(arrayList2, i2);
        if (listD1.isEmpty()) {
            listD1 = o7h.d1(list2, 1);
        }
        List list3 = listD1;
        Iterator it = list3.iterator();
        while (it.hasNext()) {
            String str3 = ((xz31) it.next()).c;
            if (str3 != null) {
                linkedHashSet.add(str3);
            }
        }
        return list3;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(String str, int i2, dqz0 dqz0Var, onm onmVar) {
        c041 c041Var;
        List list;
        int i3;
        if (onmVar instanceof c041) {
            c041Var = (c041) onmVar;
            int i4 = c041Var.f;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                c041Var.f = i4 - Integer.MIN_VALUE;
            } else {
                c041Var = new c041(this, onmVar);
            }
        } else {
            c041Var = new c041(this, onmVar);
        }
        Object objE = c041Var.d;
        int i5 = c041Var.f;
        Object obj = d9n.a;
        if (i5 == 0) {
            hm5.M(objE);
            c041Var.a = dqz0Var;
            c041Var.c = i2;
            c041Var.f = 1;
            objE = e(str, c041Var);
            if (objE != obj) {
            }
            return obj;
        }
        if (i5 == 1) {
            i2 = c041Var.c;
            dqz0Var = c041Var.a;
            hm5.M(objE);
        } else {
            if (i5 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i3 = c041Var.c;
            list = c041Var.b;
            hm5.M(objE);
        }
        uv00 uv00Var = (uv00) objE;
        return uv00Var == null ? z6x.a : c(uv00Var, list, i3, null);
        Iterable iterable = (Iterable) objE;
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(((yz31) it.next()).a);
        }
        List listD1 = o7h.d1(p7h.R(arrayList, dqz0Var), i2 * 4);
        c041Var.a = null;
        c041Var.b = listD1;
        c041Var.c = i2;
        c041Var.f = 2;
        objE = listD1.isEmpty() ? null : f(new ob01(this, listD1, null, (byte) 15), c041Var);
        if (objE != obj) {
            int i6 = i2;
            list = listD1;
            i3 = i6;
            uv00 uv00Var2 = (uv00) objE;
            if (uv00Var2 == null) {
            }
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(String str, onm onmVar) {
        d041 d041Var;
        if (onmVar instanceof d041) {
            d041Var = (d041) onmVar;
            int i2 = d041Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d041Var.c = i2 - Integer.MIN_VALUE;
            } else {
                d041Var = new d041(this, onmVar);
            }
        } else {
            d041Var = new d041(this, onmVar);
        }
        Object objF = d041Var.a;
        int i3 = d041Var.c;
        lnm lnmVar = null;
        if (i3 == 0) {
            hm5.M(objF);
            iu30 e041Var = new e041(this, str, lnmVar, (byte) 0);
            d041Var.c = 1;
            objF = f(e041Var, d041Var);
            Object obj = d9n.a;
            if (objF == obj) {
                return obj;
            }
        } else {
            if (i3 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objF);
        }
        List list = (List) objF;
        return list == null ? z6x.a : list;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(iu30 iu30Var, onm onmVar) {
        f041 f041Var;
        if (onmVar instanceof f041) {
            f041Var = (f041) onmVar;
            int i2 = f041Var.c;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f041Var.c = i2 - Integer.MIN_VALUE;
            } else {
                f041Var = new f041(this, onmVar);
            }
        } else {
            f041Var = new f041(this, onmVar);
        }
        Object obj = f041Var.a;
        int i3 = f041Var.c;
        try {
            if (i3 != 0) {
                if (i3 == 1) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
            f041Var.c = 1;
            Object objInvoke = iu30Var.invoke(f041Var);
            d9n d9nVar = d9n.a;
            return objInvoke == d9nVar ? d9nVar : objInvoke;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r21v0, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.lang.Object[], java.util.List[]] */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Iterable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v6, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    public final Object g(List list, gzl1 gzl1Var, int i2, hkm1 hkm1Var, voe1 voe1Var, onm onmVar) throws Throwable {
        g041 g041Var;
        int i3;
        int i4;
        ArrayList<ez31> arrayList;
        ArrayList<List> arrayList2;
        ?? r1;
        voe1 voe1Var2;
        Throwable th;
        if (onmVar instanceof g041) {
            g041Var = (g041) onmVar;
            int i5 = g041Var.f;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                g041Var.f = i5 - Integer.MIN_VALUE;
            } else {
                g041Var = new g041(this, onmVar);
            }
        } else {
            g041Var = new g041(this, onmVar);
        }
        Object objP = g041Var.d;
        int i6 = g041Var.f;
        int i7 = 2;
        int i8 = 1;
        Throwable th2 = null;
        d9n d9nVar = d9n.a;
        if (i6 == 0) {
            hm5.M(objP);
            List list2 = list;
            ArrayList arrayList3 = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((yz31) it.next()).b);
            }
            ArrayList arrayList4 = new ArrayList();
            int i9 = 0;
            for (Object obj : arrayList3) {
                int i10 = i9 + 1;
                if (i9 < 0) {
                    Throwable th3 = th2;
                    p7h.T();
                    throw th3;
                }
                int i11 = i7;
                String str = (String) obj;
                if (i9 != 0) {
                    th = th2;
                    if (!u890.j(str, arrayList3.get(i9 - 1))) {
                    }
                    ((Collection) o7h.A0(arrayList4)).add(Integer.valueOf(i9));
                    i7 = i11;
                    th2 = th;
                    i9 = i10;
                } else {
                    th = th2;
                }
                arrayList4.add(new ArrayList());
                ((Collection) o7h.A0(arrayList4)).add(Integer.valueOf(i9));
                i7 = i11;
                th2 = th;
                i9 = i10;
            }
            i3 = i7;
            Throwable th4 = th2;
            if (gzl1Var == null || gzl1Var == gzl1.c || arrayList4.size() < 3) {
                int size = arrayList3.size();
                List listL1 = o7h.l1(yoi1.Q(0, size));
                if (size < i2 * 3) {
                    ArrayList arrayList5 = new ArrayList(3);
                    int i12 = 0;
                    while (i12 < 3) {
                        int i13 = (i12 * size) / 3;
                        i12++;
                        arrayList5.add(new ez31(listL1.subList(i13, (i12 * size) / 3), false));
                        i8 = i8;
                    }
                    i4 = i8;
                    arrayList = arrayList5;
                } else {
                    i4 = 1;
                    int i14 = (size / 2) - (i2 / 2);
                    List listD1 = o7h.d1(listL1, (int) i2);
                    List listSubList = listL1.subList(i14, i14 + i2);
                    List listE1 = o7h.e1((int) i2, listL1);
                    List[] listArr = new List[3];
                    listArr[0] = listD1;
                    listArr[1] = listSubList;
                    listArr[i3] = listE1;
                    List listM = p7h.M(listArr);
                    arrayList = new ArrayList(q7h.U(listM, 10));
                    Iterator it2 = listM.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new ez31((List) it2.next(), false));
                    }
                }
            } else {
                mmr0 mmr0Var = (gzl1Var != gzl1.d || arrayList4.size() < 5) ? new mmr0(0, Integer.valueOf(p7h.L(arrayList4))) : new mmr0(1, Integer.valueOf(p7h.L(arrayList4) - 1));
                int iIntValue = ((Number) mmr0Var.a).intValue();
                int iIntValue2 = ((Number) mmr0Var.b).intValue();
                ?? r8 = new List[3];
                r8[0] = arrayList4.get(iIntValue);
                r8[1] = q7h.V(arrayList4.subList(iIntValue + 1, iIntValue2));
                r8[i3] = arrayList4.get(iIntValue2);
                List listM2 = p7h.M((Object[]) r8);
                arrayList = new ArrayList(q7h.U(listM2, 10));
                Iterator it3 = listM2.iterator();
                while (it3.hasNext()) {
                    arrayList.add(new ez31((List) it3.next(), true));
                }
                i4 = 1;
            }
            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            for (ez31 ez31Var : arrayList) {
                List list3 = ez31Var.a;
                ?? arrayList6 = new ArrayList(q7h.U(list3, 10));
                Iterator it4 = list3.iterator();
                while (it4.hasNext()) {
                    arrayList6.add(((yz31) list.get(((Number) it4.next()).intValue())).a);
                }
                if (ez31Var.b) {
                    arrayList6 = p7h.R((Iterable) arrayList6, hkm1Var);
                }
                arrayList2.add(o7h.d1((Iterable) arrayList6, i2 * 4));
            }
            long jW = jfv.w(voe1.a(voe1Var.a));
            hl1 hl1Var = new hl1(this, arrayList2, (int) i2, th4);
            g041Var.a = voe1Var;
            g041Var.b = arrayList2;
            g041Var.c = i2;
            g041Var.f = i4;
            objP = rc2.P(jW, hl1Var, g041Var);
            if (objP != d9nVar) {
                r1 = i2;
                voe1Var2 = voe1Var;
            }
        }
        if (i6 != 1) {
            if (i6 == 2) {
                hm5.M(objP);
                return objP;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        byte b = g041Var.c;
        arrayList2 = g041Var.b;
        voe1Var2 = g041Var.a;
        hm5.M(objP);
        i3 = 2;
        r1 = b;
        List list4 = (List) objP;
        if (list4 == null) {
            ArrayList arrayList7 = new ArrayList(q7h.U(arrayList2, 10));
            for (List list5 : arrayList2) {
                arrayList7.add(fg91.b);
            }
            return mqo1.A(arrayList7);
        }
        i041 i041Var = new i041(list4, this, voe1Var2, null);
        g041Var.a = null;
        g041Var.b = null;
        g041Var.c = r1;
        g041Var.f = i3;
        Object objS = smo1.s(i041Var, g041Var);
        return objS == d9nVar ? d9nVar : objS;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object h(xz31 xz31Var, voe1 voe1Var, onm onmVar) {
        j041 j041Var;
        String str;
        String str2;
        if (onmVar instanceof j041) {
            j041Var = (j041) onmVar;
            int i2 = j041Var.e;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                j041Var.e = i2 - Integer.MIN_VALUE;
            } else {
                j041Var = new j041(this, onmVar);
            }
        } else {
            j041Var = new j041(this, onmVar);
        }
        Object obj = j041Var.c;
        int i3 = j041Var.e;
        yk4 yk4Var = null;
        if (i3 == 0) {
            hm5.M(obj);
            str = xz31Var.a;
            String str3 = xz31Var.b;
            if (str3 != null) {
                j041Var.a = xz31Var;
                j041Var.b = str;
                j041Var.e = 1;
                Object objB = b(str3, voe1Var, j041Var);
                Object obj2 = d9n.a;
                if (objB == obj2) {
                    return obj2;
                }
                obj = objB;
                str2 = str;
            }
            return new q041(str, yk4Var, xz31Var.c);
        }
        if (i3 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str2 = j041Var.b;
        xz31Var = j041Var.a;
        hm5.M(obj);
        yk4Var = (yk4) obj;
        str = str2;
        return new q041(str, yk4Var, xz31Var.c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    public final Object i(String str, int i2, hkm1 hkm1Var, voe1 voe1Var, onm onmVar) {
        k041 k041Var;
        l041 l041Var;
        voe1 voe1Var2;
        int i3;
        if (onmVar instanceof k041) {
            k041Var = (k041) onmVar;
            int i4 = k041Var.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                k041Var.e = i4 - Integer.MIN_VALUE;
                l041Var = this;
            } else {
                l041Var = this;
                k041Var = new k041(l041Var, onmVar);
            }
        } else {
            l041Var = this;
            k041Var = new k041(l041Var, onmVar);
        }
        Object objP = k041Var.c;
        int i5 = k041Var.e;
        d9n d9nVar = d9n.a;
        if (i5 == 0) {
            hm5.M(objP);
            long jW = jfv.w(voe1.a(voe1Var.a));
            fe6 fe6Var = new fe6(l041Var, str, i2, hkm1Var, (lnm) null, (byte) 12);
            k041Var.a = voe1Var;
            k041Var.b = i2;
            k041Var.e = 1;
            objP = rc2.P(jW, fe6Var, k041Var);
            if (objP != d9nVar) {
                voe1Var2 = voe1Var;
                i3 = i2;
            }
        }
        if (i5 != 1) {
            if (i5 == 2) {
                hm5.M(objP);
                return objP;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        i3 = k041Var.b;
        voe1 voe1Var3 = k041Var.a;
        hm5.M(objP);
        voe1Var2 = voe1Var3;
        List list = (List) objP;
        if (list == null) {
            return z6x.a;
        }
        elu0 elu0Var = new elu0(list, this, voe1Var2, (lnm) null, (byte) 28);
        k041Var.a = null;
        k041Var.b = i3;
        k041Var.e = 2;
        Object objS = smo1.s(elu0Var, k041Var);
        return objS == d9nVar ? d9nVar : objS;
    }
}
