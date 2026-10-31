package p;

import io.reactivex.rxjava3.core.Observable;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x5u implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ x5u(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v17, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r9v8 */
    public final Object invoke() {
        z6x arrayList;
        b1z b1zVar;
        Map mapSingletonMap;
        y7b0 y7b0Var;
        e46 e46VarA;
        ?? SingletonList;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        z6x z6xVar = z6x.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                hma1 hma1VarEdit = ((p8o) obj).a.edit();
                hma1VarEdit.a(nfo0.a, false);
                hma1VarEdit.g();
                return rih1Var;
            case 1:
                return (evw) obj;
            case 2:
                return (sck1) ((x5u) obj).invoke();
            case 3:
                qpy qpyVar = (qpy) obj;
                qpyVar.Z0 = qpyVar.S0.a(qpyVar.Q0);
                return rih1Var;
            case 4:
                w0z w0zVar = (w0z) obj;
                HashSet hashSet = new HashSet();
                for (ajn0 ajn0Var : (Set) w0zVar.e.i.invoke()) {
                    hashSet.addAll(w0zVar.c(ajn0Var, 16));
                    hashSet.addAll(w0zVar.a(ajn0Var, 16));
                }
                return hashSet;
            case 5:
                ed10 ed10Var = (ed10) obj;
                ed10Var.P0 = md10.a(ed10Var.Z);
                return rih1Var;
            case 6:
                return ((Observable) ((gfr) obj).invoke()).firstOrError();
            case 7:
                return ((vpy0) obj).a().map(yi20.d);
            case 8:
                hs40 hs40Var = (hs40) obj;
                List listH = hs40Var.h();
                List list = listH;
                ArrayList arrayList2 = new ArrayList(3);
                y5 y5Var = hs40Var.b;
                Collection collectionD = y5Var.g().d();
                ArrayList arrayList3 = new ArrayList();
                Iterator it = collectionD.iterator();
                while (it.hasNext()) {
                    r7h.W(c8o.o(((a8b0) it.next()).E(), (wgt) null, 3), arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj2 : arrayList3) {
                    if (obj2 instanceof jyc) {
                        arrayList4.add(obj2);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj3 : arrayList4) {
                    ajn0 name = ((jyc) obj3).getName();
                    Object arrayList5 = linkedHashMap.get(name);
                    if (arrayList5 == null) {
                        arrayList5 = new ArrayList();
                        linkedHashMap.put(name, arrayList5);
                    }
                    ((List) arrayList5).add(obj3);
                }
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    ajn0 ajn0Var2 = (ajn0) entry.getKey();
                    List list2 = (List) entry.getValue();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    for (Object obj4 : list2) {
                        Boolean boolValueOf = Boolean.valueOf(((jyc) obj4) instanceof ov30);
                        Object arrayList6 = linkedHashMap2.get(boolValueOf);
                        if (arrayList6 == null) {
                            arrayList6 = new ArrayList();
                            linkedHashMap2.put(boolValueOf, arrayList6);
                        }
                        ((List) arrayList6).add(obj4);
                    }
                    for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                        boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                        List list3 = (List) entry2.getValue();
                        exq0 exq0Var = exq0.c;
                        List list4 = list3;
                        if (zBooleanValue) {
                            arrayList = new ArrayList();
                            for (Object obj5 : listH) {
                                if (u890.j(((ov30) obj5).getName(), ajn0Var2)) {
                                    arrayList.add(obj5);
                                }
                            }
                        } else {
                            arrayList = z6xVar;
                        }
                        exq0Var.h(ajn0Var2, list4, (Collection) arrayList, y5Var, new gs40(arrayList2, hs40Var));
                    }
                }
                return o7h.N0(h4p1.h(arrayList2), list);
            case 9:
                return Boolean.valueOf(((pm4) ((kly0) obj).get()).b());
            case 10:
                return Boolean.valueOf(((ppy0) obj).b());
            case 11:
                return ((xum1) obj).a().map(ws10.g).distinctUntilChanged().onErrorReturnItem(Boolean.FALSE);
            case 12:
                return ((Observable) ((gjp0) obj).invoke()).map(new ubc(this, (byte) 13));
            case 13:
                xz90 xz90Var = (xz90) obj;
                xz90Var.O0 = xz90Var.X.a();
                return rih1Var;
            case 14:
                Map map = n7a0.a;
                rb11 rb11Var = ((k7a0) ((g8a0) obj)).d;
                rb11 rb11Var2 = rb11Var instanceof rb11 ? rb11Var : null;
                if (rb11Var2 == null || (y7b0Var = (y7b0) n7a0.b.get(ajn0.e(rb11Var2.b.name()).b())) == null) {
                    b1zVar = null;
                } else {
                    kf30 kf30Var = rfb1.v;
                    b1zVar = new b1z(new heg(kf30Var.b(), kf30Var.a.g()), ajn0.e(y7b0Var.name()));
                }
                mapSingletonMap = b1zVar != null ? Collections.singletonMap(l7a0.c, b1zVar) : null;
                return mapSingletonMap == null ? b7xVar : mapSingletonMap;
            case 15:
                fb11 fb11Var = ((k7a0) ((h8a0) obj)).d;
                if (fb11Var instanceof fb11) {
                    Map map2 = n7a0.a;
                    e46VarA = n7a0.a(fb11Var.a());
                } else if (fb11Var instanceof rb11) {
                    Map map3 = n7a0.a;
                    e46VarA = n7a0.a(Collections.singletonList(fb11Var));
                } else {
                    e46VarA = null;
                }
                mapSingletonMap = e46VarA != null ? Collections.singletonMap(l7a0.b, e46VarA) : null;
                return mapSingletonMap == null ? b7xVar : mapSingletonMap;
            case 16:
                lia0 lia0Var = (lia0) obj;
                jia0 jia0Var = lia0Var.f;
                if (jia0Var == null) {
                    eg.f("JvmBuiltins instance has not been initialized properly");
                    return null;
                }
                kia0 kia0Var = (kia0) jia0Var.invoke();
                lia0Var.f = null;
                return kia0Var;
            case 17:
                mja0 mja0Var = (mja0) obj;
                nqb0 nqb0Var = mja0Var.c;
                toe0 toe0Var = nqb0Var.t;
                mma0 mma0Var = nqb0.N0[0];
                Collection collectionValues = ((Map) toe0Var.invoke()).values();
                ArrayList arrayList7 = new ArrayList();
                Iterator it2 = collectionValues.iterator();
                while (it2.hasNext()) {
                    git gitVarA = ((zht) ((uw0) mja0Var.b.b).g).a(nqb0Var, (jc11) it2.next());
                    if (gitVarA != null) {
                        arrayList7.add(gitVarA);
                    }
                }
                return (zpi0[]) zpn1.t(arrayList7).toArray(new zpi0[0]);
            case 18:
                return xim0.a(((mla0) obj).n());
            case 19:
                dma0 dma0Var = (dma0) obj;
                mc11 mc11Var = dma0Var.d;
                mma0 mma0Var2 = dma0.g[0];
                jc11 jc11Var = (jc11) mc11Var.invoke();
                if (jc11Var == null) {
                    return ypi0.b;
                }
                mc11 mc11Var2 = ((lla0) dma0Var).a;
                mma0 mma0Var3 = lla0.b[0];
                rzo0 rzo0Var = ((e141) mc11Var2.invoke()).b;
                zht zhtVar = (zht) rzo0Var.b;
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) rzo0Var.d;
                Class cls = jc11Var.a;
                heg hegVarA = bb11.a(cls);
                Object obj6 = concurrentHashMap.get(hegVarA);
                if (obj6 == null) {
                    kf30 kf30Var2 = bb11.a(cls).a;
                    at7 at7Var = jc11Var.b;
                    h6b0 h6b0Var = (h6b0) at7Var.c;
                    h6b0 h6b0Var2 = h6b0.g;
                    if (h6b0Var == h6b0Var2) {
                        String[] strArr = (String[]) at7Var.e;
                        if (h6b0Var != h6b0Var2) {
                            strArr = null;
                        }
                        z6x z6xVarAsList = strArr != null ? Arrays.asList(strArr) : null;
                        if (z6xVarAsList != null) {
                            z6xVar = z6xVarAsList;
                        }
                        SingletonList = new ArrayList();
                        Iterator it3 = ((Iterable) z6xVar).iterator();
                        while (it3.hasNext()) {
                            kf30 kf30Var3 = new kf30(tia0.c((String) it3.next()).a.replace('/', '.'));
                            kf30 kf30VarB = kf30Var3.b();
                            ajn0 ajn0VarG = kf30Var3.a.g();
                            kf30 kf30Var4 = kf30.c;
                            lf30 lf30Var = lap1.s(ajn0VarG).a;
                            lf30Var.c();
                            uqv0 uqv0Var = (uqv0) rzo0Var.c;
                            ((u321) zhtVar.c().c).getClass();
                            joj0 joj0Var = joj0.g;
                            String strReplace = lf30Var.a.replace('.', '$');
                            if (!kf30VarB.a.c()) {
                                strReplace = kf30VarB + '.' + strReplace;
                            }
                            bm00 bm00VarE = uqv0Var.e(strReplace);
                            jc11 jc11Var2 = bm00VarE != null ? (jc11) bm00VarE.b : null;
                            if (jc11Var2 != null) {
                                SingletonList.add(jc11Var2);
                            }
                        }
                    } else {
                        SingletonList = Collections.singletonList(jc11Var);
                    }
                    h7x h7xVar = new h7x((zim0) zhtVar.c().b, kf30Var2, false);
                    ArrayList arrayList8 = new ArrayList();
                    Iterator it4 = ((Iterable) SingletonList).iterator();
                    while (it4.hasNext()) {
                        git gitVarA2 = zhtVar.a(h7xVar, (jc11) it4.next());
                        if (gitVarA2 != null) {
                            arrayList8.add(gitVarA2);
                        }
                    }
                    zpi0 zpi0VarR = iko1.r("package " + kf30Var2 + " (" + jc11Var + ')', o7h.l1(arrayList8));
                    Object objPutIfAbsent = concurrentHashMap.putIfAbsent(hegVarA, zpi0VarR);
                    obj6 = objPutIfAbsent == null ? zpi0VarR : objPutIfAbsent;
                }
                return (zpi0) obj6;
            case 20:
                g6b0 g6b0Var = (g6b0) obj;
                EnumMap enumMap = new EnumMap(tnw0.class);
                HashMap map4 = new HashMap();
                HashMap map5 = new HashMap();
                for (tnw0 tnw0Var : tnw0.values()) {
                    String strB = tnw0Var.a.b();
                    if (strB == null) {
                        g6b0.a(47);
                        throw null;
                    }
                    qx81 qx81VarM = g6b0Var.l(strB).m();
                    if (qx81VarM == null) {
                        g6b0.a(48);
                        throw null;
                    }
                    String strB2 = tnw0Var.b.b();
                    if (strB2 == null) {
                        g6b0.a(47);
                        throw null;
                    }
                    qx81 qx81VarM2 = g6b0Var.l(strB2).m();
                    if (qx81VarM2 == null) {
                        g6b0.a(48);
                        throw null;
                    }
                    enumMap.put(tnw0Var, qx81VarM2);
                    map4.put(qx81VarM, qx81VarM2);
                    map5.put(qx81VarM2, qx81VarM);
                }
                return new f6b0(enumMap, map4, map5);
            case 21:
                return new z6b0((a7b0) obj);
            case 22:
                return new b7b0((c7b0) obj);
            case 23:
                return new d7b0((e7b0) obj);
            case 24:
                g7b0 g7b0Var = (g7b0) obj;
                Type typeU = s1p1.u(g7b0Var);
                return typeU == null ? g7b0Var.getCaller().getReturnType() : typeU;
            case 25:
                h7b0 h7b0Var = (h7b0) obj;
                v6b0 v6b0Var = h7b0Var.a;
                if ((v6b0Var.a() instanceof ema0) || fc11.P(v6b0Var)) {
                    return (Type) v6b0Var.getCaller().a().get(h7b0Var.c);
                }
                bhn0.s(v6b0Var, "Only constructors and top-level callables are supported for now: ");
                return null;
            case 26:
                return n3o1.n((k7b0) obj, true);
            case 27:
                return new v7b0((w7b0) obj);
            case 28:
                return (qcb0) obj;
            default:
                return (sck1) ((x5u) obj).invoke();
        }
    }
}
