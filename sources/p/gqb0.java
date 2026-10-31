package p;

import android.content.res.Resources;
import android.os.Parcelable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.disposables.Disposable;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gqb0 implements iu30 {
    public final /* synthetic */ byte a;
    public Object b;

    public static ArrayList a(String str, List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            mig0 mig0Var = (mig0) obj;
            boolean zH0 = true;
            if (str.length() != 0) {
                fpt fptVar = mig0Var.a;
                zH0 = ihc1.h0(fptVar.b + " " + fptVar.c, str, true);
            }
            if (zH0) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public tkg0 d(hkg0 hkg0Var) {
        String string;
        List list = hkg0Var.h;
        aer0 aer0Var = hkg0Var.g;
        if (aer0Var instanceof aer0) {
            ArrayList arrayListA = a(aer0Var.c, list);
            ArrayList arrayList = new ArrayList(q7h.U(arrayListA, 10));
            Iterator it = arrayListA.iterator();
            while (it.hasNext()) {
                fpt fptVar = ((mig0) it.next()).a;
                arrayList.add(new cpa1(fptVar.a, fptVar.b, fptVar.c));
            }
            return new skg0(arrayList);
        }
        if (!(aer0Var instanceof idr0)) {
            if (aer0Var instanceof ndr0) {
                return new pkg0();
            }
            if (aer0Var instanceof qdr0) {
                gkz gkzVar = new gkz(qjg0.a);
                kjg0 kjg0Var = kjg0.a;
                return new qkg0(new hkz(2131960682, kjg0Var, gkzVar, new gkz(kjg0Var)));
            }
            if (aer0Var.equals(jdr0.c)) {
                return new rkg0();
            }
            eg.o();
            return null;
        }
        String str = hkg0Var.e;
        str.getClass();
        boolean z = hkg0Var.f;
        String str2 = ((idr0) aer0Var).c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (ihc1.h0(((mig0) obj).a.c, str, true)) {
                arrayList2.add(obj);
            }
        }
        ArrayList<mig0> arrayListA2 = a(str2, arrayList2);
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayListA2, 10));
        for (mig0 mig0Var : arrayListA2) {
            Resources resources = ((nlm) this.b).a;
            fpt fptVar2 = mig0Var.a;
            String str3 = fptVar2.a;
            List list2 = fptVar2.e;
            String string2 = fptVar2.c;
            String str4 = fptVar2.f;
            if (str4 != null && str4.length() != 0) {
                string2 = resources.getString(2131960658, Arrays.copyOf(new Object[]{string2, str4}, 2));
            }
            List list3 = list2;
            if (list3 == null || list3.isEmpty()) {
                string = fptVar2.b;
            } else {
                list2.getClass();
                string = resources.getString(2131960657, Arrays.copyOf(new Object[]{o7h.y0(list2, (CharSequence) null, (String) null, (String) null, (iu30) null, 63)}, 1));
            }
            arrayList3.add(new jz3(str3, string2, string));
        }
        return new okg0(str, arrayList3, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(String str, onm onmVar) {
        lu21 lu21Var;
        if (onmVar instanceof lu21) {
            lu21Var = (lu21) onmVar;
            int i = lu21Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                lu21Var.d = i - Integer.MIN_VALUE;
            } else {
                lu21Var = new lu21(this, onmVar);
            }
        } else {
            lu21Var = new lu21(this, onmVar);
        }
        Object objL = lu21Var.b;
        int i2 = lu21Var.d;
        if (i2 == 0) {
            hm5.M(objL);
            xq81 xq81Var = (xq81) this.b;
            lu21Var.a = str;
            lu21Var.d = 1;
            objL = xq81Var.l(str, lu21Var);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = lu21Var.a;
            hm5.M(objL);
        }
        ku21 ku21Var = (ku21) objL;
        if (ku21Var instanceof iu21) {
            iu21 iu21Var = (iu21) ku21Var;
            return new g0o0(new cv21(str, iu21Var.b, iu21Var.a));
        }
        if (u890.j(ku21Var, ju21.a)) {
            return new h0o0(str);
        }
        if (u890.j(ku21Var, hu21.a)) {
            return new f0o0(str);
        }
        eg.o();
        return null;
    }

    public void f(pav0 pav0Var) {
        this.b = pav0Var;
    }

    /* JADX WARN: Code duplicated, block: B:79:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:84:0x01ca  */
    public final Object invoke(Object obj) {
        Object next;
        boolean zEquals;
        e1h1 e1h1VarC;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        byte b2 = 1;
        switch (b) {
            case 0:
                hqb0 hqb0Var = (hqb0) this.b;
                return new lqb0(hqb0Var.t, hqb0Var, hqb0Var.h, hqb0Var.i != null, hqb0Var.Q0);
            case 1:
                return ((zpi0) obj).a((ajn0) this.b, 15);
            case 2:
                o0g1 o0g1Var = (o0g1) this.b;
                ac11 ac11Var = (ac11) obj;
                LinkedHashMap linkedHashMap = (LinkedHashMap) o0g1Var.e;
                n9r n9rVar = (n9r) o0g1Var.d;
                Integer num = (Integer) linkedHashMap.get(ac11Var);
                if (num == null) {
                    return null;
                }
                int iIntValue = num.intValue();
                o860 o860Var = (o860) o0g1Var.c;
                return new drb0(ryn1.p(new o860((uw0) o860Var.b, o0g1Var, (znb0) o860Var.d), n9rVar.getAnnotations()), ac11Var, o0g1Var.b + iIntValue, n9rVar);
            case 3:
                lbv lbvVar = (lbv) obj;
                goq goqVar = (goq) this.b;
                lia1 lia1Var = lbvVar.a;
                String str = lbvVar.b;
                String str2 = lbvVar.c;
                goqVar.getClass();
                return new lt20(new mnc0(o4p1.r(new m441(new el0(goqVar, lia1Var, str, str2, (lnm) null, (byte) 27)), (q8n) goqVar.f), (byte) 22), new ob00(3, (lnm) null, (byte) 7), (byte) 0);
            case 4:
                return d((hkg0) obj);
            case 5:
                ajm0 ajm0Var = (ajm0) this.b;
                mzq0 mzq0Var = ajm0Var.g;
                voe0 voe0Var = ajm0Var.d;
                mzq0Var.getClass();
                return new dub0(ajm0Var, (kf30) obj, voe0Var);
            case 6:
                rok0 rok0Var = (rok0) this.b;
                kf30 kf30Var = (kf30) obj;
                kf30Var.getClass();
                Map map = (Map) rok0Var.b;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : map.entrySet()) {
                    kf30 kf30Var2 = (kf30) entry.getKey();
                    if (!kf30Var.equals(kf30Var2)) {
                        if (u890.j(kf30Var.a.c() ? null : kf30Var.b(), kf30Var2)) {
                        }
                    }
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
                if (linkedHashMap2.isEmpty()) {
                    linkedHashMap2 = null;
                }
                if (linkedHashMap2 == null) {
                    return null;
                }
                Iterator it = linkedHashMap2.entrySet().iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        int length = oap1.H((kf30) ((Map.Entry) next).getKey(), kf30Var).a.a.length();
                        do {
                            Object next2 = it.next();
                            int length2 = oap1.H((kf30) ((Map.Entry) next2).getKey(), kf30Var).a.a.length();
                            if (length > length2) {
                                next = next2;
                                length = length2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                Map.Entry entry2 = (Map.Entry) next;
                if (entry2 != null) {
                    return entry2.getValue();
                }
                return null;
            case 7:
                k560 k560Var = (m560) obj;
                if (!(k560Var instanceof k560)) {
                    if (k560Var instanceof l560) {
                        return Observable.just(Boolean.FALSE);
                    }
                    eg.o();
                    return null;
                }
                ima1 ima1Var = (dma1) ((o2b1) this.b).b;
                bma1 bma1Var = amh1.a;
                Set setB = ima1Var.b(bma1Var, w7x.a);
                setB.getClass();
                return yoi1.i(ima1Var.s(bma1Var), o6x.a).startWithItem(new cma1(1, setB)).map(new y281(k560Var, (byte) 28)).distinctUntilChanged();
            case 8:
                return new php0(((yo2) this.b).Z, (byte) 1);
            case 9:
                bi91 bi91Var = (bi91) this.b;
                obj.getClass();
                bi91Var.add(obj);
                return rih1Var;
            case 10:
                ((ohd) this.b).resumeWith(rih1Var);
                return rih1Var;
            case 11:
                mb11 mb11Var = (mb11) this.b;
                Method method = (Method) obj;
                if (!method.isSynthetic()) {
                    if (mb11Var.a.isEnum()) {
                        String name = method.getName();
                        if (u890.j(name, "values")) {
                            if (method.getParameterTypes().length == 0) {
                                zEquals = true;
                            } else {
                                zEquals = false;
                            }
                        } else if (u890.j(name, "valueOf")) {
                            zEquals = Arrays.equals(method.getParameterTypes(), new Class[]{String.class});
                        } else {
                            zEquals = false;
                        }
                        if (!zEquals) {
                            z = true;
                        }
                    } else {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 12:
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                pav0 pav0Var = (pav0) this.b;
                if (pav0Var != null) {
                    pav0Var.c = zBooleanValue;
                }
                return rih1Var;
            case 13:
                return h4p1.g(new i3y0((wzn0) obj, this, (lnm) null, (byte) 16));
            case 14:
                String str3 = (String) obj;
                return ((x3v0) this.b).a(Collections.singletonList(str3), new t3v0(Collections.singletonMap("mediaTypeEnum", Boolean.TRUE), (Map) null, (Map) null, (List) null, (List) null, 247)).map(new vdn1(str3, (byte) 13)).onErrorReturnItem(d1z.d);
            case 15:
                ((Disposable) this.b).dispose();
                return rih1Var;
            case 16:
                tr3 tr3Var = (tr3) obj;
                List listA = ((ng51) this.b).a(tr3Var);
                Parcelable parcelable = tr3Var.b.c;
                if ((parcelable instanceof b8e0) && (((b8e0) parcelable).getCount() > 0 || !listA.isEmpty())) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 17:
                return ((tsi1) ((jyc) obj).F().get(((tsi1) this.b).g)).getType();
            case 18:
                Throwable th = (Throwable) obj;
                i8d1 i8d1Var = (i8d1) this.b;
                ohd ohdVar = i8d1Var.c;
                if (ohdVar != null) {
                    ohdVar.q(th);
                }
                i8d1Var.c = null;
                return rih1Var;
            case 19:
                float[] fArr = ((kch0) obj).a;
                elb0 elb0Var = (elb0) this.b;
                if (elb0Var.a()) {
                    nho1.v(elb0Var).R(elb0Var, fArr);
                }
                return rih1Var;
            case 20:
                vnd1 vnd1Var = (vnd1) this.b;
                d1h1 d1h1Var = (d1h1) obj;
                y0h1 y0h1Var = d1h1Var.a;
                o8a0 o8a0Var = d1h1Var.b;
                Set set = o8a0Var.e;
                if (set != null && set.contains(y0h1Var.w1())) {
                    return vnd1Var.i(o8a0Var);
                }
                qx81 qx81VarM = y0h1Var.m();
                LinkedHashSet<y0h1> linkedHashSet = new LinkedHashSet();
                rzn1.o(qx81VarM, qx81VarM, linkedHashSet, set);
                int iS = zno1.s(q7h.U(linkedHashSet, 10));
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(iS >= 16 ? iS : 16);
                for (y0h1 y0h1Var2 : linkedHashSet) {
                    if (set == null || !set.contains(y0h1Var2)) {
                        Set set2 = o8a0Var.e;
                        e1h1VarC = eoc.c(y0h1Var2, o8a0Var, vnd1Var.j(y0h1Var2, o8a0.a(o8a0Var, 0, false, set2 != null ? dm61.x0(y0h1Var, set2) : Collections.singleton(y0h1Var), null, 47)));
                    } else {
                        e1h1VarC = o1h1.k(y0h1Var2, o8a0Var);
                    }
                    linkedHashMap3.put(y0h1Var2.g(), e1h1VarC);
                }
                xj61 xj61VarY = vnd1Var.y(new l1h1(new qhb1(linkedHashMap3, b2)), y0h1Var.getUpperBounds(), o8a0Var);
                if (xj61VarY.a.isEmpty()) {
                    return vnd1Var.i(o8a0Var);
                }
                if (xj61VarY.a.i == 1) {
                    return (a8b0) o7h.U0(xj61VarY);
                }
                hhg1.n("Should only be one computed upper bound if no need to intersect all bounds");
                return null;
            default:
                return (a8b0) this.b;
        }
    }

    public /* synthetic */ gqb0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
