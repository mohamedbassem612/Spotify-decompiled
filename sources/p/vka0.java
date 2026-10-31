package p;

import java.lang.annotation.Annotation;
import java.lang.annotation.Inherited;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class vka0 implements Function0 {
    public final /* synthetic */ byte a;
    public final bla0 b;

    public /* synthetic */ vka0(bla0 bla0Var, byte b) {
        this.a = b;
        this.b = bla0Var;
    }

    /* JADX WARN: Code duplicated, block: B:134:0x030a  */
    /* JADX WARN: Code duplicated, block: B:136:0x0337  */
    /* JADX WARN: Code duplicated, block: B:138:0x0341  */
    /* JADX WARN: Code duplicated, block: B:139:0x0343  */
    /* JADX WARN: Code duplicated, block: B:150:0x0364  */
    /* JADX WARN: Code duplicated, block: B:157:0x0379  */
    /* JADX WARN: Code duplicated, block: B:164:0x038e  */
    /* JADX WARN: Code duplicated, block: B:171:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:175:0x03ae  */
    /* JADX WARN: Code duplicated, block: B:179:0x03c6  */
    /* JADX WARN: Code duplicated, block: B:182:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0140  */
    /* JADX WARN: Code duplicated, block: B:48:0x0145  */
    /* JADX WARN: Code duplicated, block: B:50:0x014b  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.List] */
    public final Object invoke() {
        Field fieldX;
        Class<?> declaringClass;
        rka0 rka0Var;
        Iterator it;
        vma0 vma0Var;
        lft lftVarX;
        jfz jfzVarG;
        Object obj;
        lft lftVar;
        lft lftVarX2;
        nla0 nla0Var;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        Field fieldX2;
        Class<?> declaringClass2;
        ?? arrayList;
        tka0 tka0VarS;
        Class cls;
        byte b = this.a;
        boolean z5 = true;
        tka0 tka0Var = null;
        bla0 bla0Var = this.b;
        switch (b) {
            case 0:
                return bla0Var.Q(bla0Var.O().m().E(), 1);
            case 1:
                return bla0Var.Q(bla0Var.O().a0(), 1);
            case 2:
                return bla0Var.Q(bla0Var.O().m().E(), 2);
            case 3:
                return bla0Var.Q(bla0Var.O().a0(), 2);
            case 4:
                HashSet hashSet = bla0.d;
                heg hegVarM = bla0Var.M();
                Class cls2 = bla0Var.b;
                mc11 mc11Var = ((lla0) ((yka0) bla0Var.c.getValue())).a;
                mma0 mma0Var = lla0.b[0];
                e141 e141Var = (e141) mc11Var.invoke();
                ks6 ks6Var = e141Var.a;
                beg begVarA = (hegVarM.c && cls2.isAnnotationPresent(Metadata.class)) ? ks6Var.a(hegVarM) : x1p1.h((zim0) ks6Var.b, hegVarM);
                if (begVarA != null) {
                    return begVarA;
                }
                if (cls2.isSynthetic()) {
                    return bla0.L(hegVarM, e141Var);
                }
                jc11 jc11VarF = v1p1.f(cls2);
                h6b0 h6b0Var = jc11VarF != null ? (h6b0) jc11VarF.b.c : null;
                switch (h6b0Var != null ? zka0.a[h6b0Var.ordinal()] : -1) {
                    case -1:
                    case 6:
                        eqg.c("Unresolved class: ", cls2, " (kind = ", h6b0Var);
                        return null;
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        return bla0.L(hegVarM, e141Var);
                    case 5:
                        eqg.c("Unknown class: ", cls2, " (kind = ", h6b0Var);
                        return null;
                }
            case 5:
                yxh yxhVar = sh10.a;
                HashMap map = new HashMap();
                rob0 rob0VarQ0 = bla0Var.O().q0();
                boolean z6 = bla0Var.b.getAnnotation(Metadata.class) != null;
                HashMap map2 = new HashMap();
                xma0 xma0Var = xma0.d;
                lez lezVar = lez.b;
                if (z6) {
                    for (mma0 mma0Var2 : sh10.b(bla0Var)) {
                        if (mma0Var2.getVisibility() != xma0Var && (!sh10.d(mma0Var2) || bla0Var.N() != ieg.INTERFACE || ((mma0Var2 instanceof mma0) && (fieldX2 = m5n1.x(mma0Var2)) != null && (declaringClass2 = fieldX2.getDeclaringClass()) != null && declaringClass2.getAnnotation(Metadata.class) == null))) {
                            map2.put(sh10.g(mma0Var2, lezVar), mma0Var2);
                        }
                    }
                }
                Iterator it2 = bla0Var.d().iterator();
                boolean z7 = false;
                boolean z8 = false;
                while (true) {
                    boolean zHasNext = it2.hasNext();
                    kez kezVar = kez.b;
                    if (!zHasNext) {
                        boolean z9 = z6;
                        for (Iterator it3 = map2.entrySet().iterator(); it3.hasNext(); it3 = it3) {
                            Map.Entry entry = (Map.Entry) it3.next();
                            jfz jfzVar = (jfz) entry.getKey();
                            lft lftVar2 = (lft) entry.getValue();
                            z7 = z7 || sh10.d(lftVar2);
                            z8 = z8 || u890.j(lftVar2.t().getVisibility(), y7a0.a);
                            map.put(new jfz(jfzVar.a, jfzVar.b, jfzVar.c, jfzVar.d, jfzVar.e, jfzVar.f, jfzVar.g, jfzVar.h, kezVar), lftVar2);
                        }
                        if (!z9) {
                            for (mma0 mma0Var3 : sh10.b(bla0Var)) {
                                if (mma0Var3.getVisibility() != xma0Var && (!sh10.d(mma0Var3) || bla0Var.N() != ieg.INTERFACE || ((mma0Var3 instanceof mma0) && (fieldX = m5n1.x(mma0Var3)) != null && (declaringClass = fieldX.getDeclaringClass()) != null && declaringClass.getAnnotation(Metadata.class) == null))) {
                                    z7 = z7 || sh10.d(mma0Var3);
                                    z8 = z8 || u890.j(mma0Var3.t().getVisibility(), y7a0.a);
                                    map.put(sh10.g(mma0Var3, kezVar), mma0Var3);
                                }
                            }
                        }
                        return new qh10(map, z7, z8);
                    }
                    oma0 oma0Var = (oma0) it2.next();
                    tka0 tka0VarK = oma0Var.k();
                    tka0 tka0Var2 = tka0VarK instanceof tka0 ? tka0VarK : tka0Var;
                    if (tka0Var2 == null) {
                        tw20.u("Non-denotable supertypes are not possible. Supertype '", oma0Var, "' appears non-denotable in class '", bla0Var);
                        return null;
                    }
                    vma0 vma0Var2 = vma0.b;
                    vma0 vma0VarP = eqn1.p(oma0Var);
                    qh10 qh10VarC = sh10.c(tka0Var2);
                    z7 = (z7 || qh10VarC.b) ? z5 : false;
                    z8 = (z8 || qh10VarC.c) ? z5 : false;
                    Iterator it4 = qh10VarC.a.entrySet().iterator();
                    while (it4.hasNext()) {
                        lft lftVar3 = (lft) ((Map.Entry) it4.next()).getValue();
                        rka0 rka0Var2 = lftVar3.b;
                        rob0 rob0Var = sh10.d(lftVar3) ? null : rob0VarQ0;
                        vma0 vma0Var3 = lftVar3.b.b;
                        rob0VarQ0 = rob0VarQ0;
                        Map map3 = vma0Var3.a;
                        if (map3.isEmpty()) {
                            vma0Var = vma0VarP;
                        } else {
                            if (vma0VarP.a.isEmpty()) {
                                vma0Var = vma0Var3;
                            } else {
                                LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(map3.size()));
                                Iterator it5 = map3.entrySet().iterator();
                                while (it5.hasNext()) {
                                    Map.Entry entry2 = (Map.Entry) it5.next();
                                    boolean z10 = z6;
                                    Object key = entry2.getKey();
                                    Iterator it6 = it5;
                                    tma0 tma0VarA = (tma0) entry2.getValue();
                                    rka0 rka0Var3 = rka0Var2;
                                    oma0 oma0Var2 = tma0VarA.b;
                                    Iterator it7 = it2;
                                    int i = tma0VarA.a;
                                    if (oma0Var2 != null && i != 0) {
                                        tma0VarA = vma0VarP.a(i, oma0Var2);
                                    }
                                    linkedHashMap.put(key, tma0VarA);
                                    it5 = it6;
                                    rka0Var2 = rka0Var3;
                                    z6 = z10;
                                    it2 = it7;
                                }
                                z6 = z6;
                                rka0Var = rka0Var2;
                                it = it2;
                                vma0Var = new vma0(linkedHashMap);
                            }
                            lftVarX = lftVar3.x(rka0.a(rka0Var, rob0Var, vma0Var, 0, false, false, false, false, 244));
                            jfzVarG = sh10.g(lftVarX, lezVar);
                            if (!map2.containsKey(jfzVarG)) {
                                vma0 vma0Var4 = vma0VarP;
                                jfz jfzVar2 = new jfz(jfzVarG.a, jfzVarG.b, jfzVarG.c, jfzVarG.d, jfzVarG.e, jfzVarG.f, jfzVarG.g, jfzVarG.h, kezVar);
                                obj = map.get(jfzVar2);
                                if (obj != null) {
                                    lftVar = (lft) obj;
                                    if (k0d.c.compare(lftVar, lftVarX) <= 0) {
                                        lftVarX2 = lftVar;
                                    } else {
                                        lftVarX2 = lftVarX;
                                    }
                                    if ((lftVar instanceof nla0) && (lftVarX instanceof nla0)) {
                                        rka0 rka0Var4 = lftVarX2.b;
                                        nla0Var = (nla0) lftVar;
                                        if (!nla0Var.isOperator() || ((nla0) lftVarX).isOperator()) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        if (!nla0Var.isInfix() || ((nla0) lftVarX).isInfix()) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (!nla0Var.isInline() || ((nla0) lftVarX).isInline()) {
                                            z3 = true;
                                        } else {
                                            z3 = false;
                                        }
                                        if (!nla0Var.isExternal() || ((nla0) lftVarX).isExternal()) {
                                            z4 = true;
                                        } else {
                                            z4 = false;
                                        }
                                        if (sh10.a.compare(lftVar, lftVarX) > 0) {
                                            lftVar = lftVarX;
                                        }
                                        lftVarX2 = lftVarX2.x(rka0.a(rka0Var4, (rob0) null, (vma0) null, lftVar.w(), z4, z, z2, z3, 11));
                                    }
                                    if (lftVarX2 != null) {
                                        lftVarX = lftVarX2;
                                    }
                                }
                                map.put(jfzVar2, lftVarX);
                                vma0VarP = vma0Var4;
                            }
                            z6 = z6;
                            it2 = it;
                            z5 = true;
                            tka0Var = null;
                        }
                        rka0Var = rka0Var2;
                        it = it2;
                        lftVarX = lftVar3.x(rka0.a(rka0Var, rob0Var, vma0Var, 0, false, false, false, false, 244));
                        jfzVarG = sh10.g(lftVarX, lezVar);
                        if (!map2.containsKey(jfzVarG)) {
                            vma0 vma0Var5 = vma0VarP;
                            jfz jfzVar3 = new jfz(jfzVarG.a, jfzVarG.b, jfzVarG.c, jfzVarG.d, jfzVarG.e, jfzVarG.f, jfzVarG.g, jfzVarG.h, kezVar);
                            obj = map.get(jfzVar3);
                            if (obj != null) {
                                lftVar = (lft) obj;
                                if (k0d.c.compare(lftVar, lftVarX) <= 0) {
                                    lftVarX2 = lftVar;
                                } else {
                                    lftVarX2 = lftVarX;
                                }
                                if (lftVar instanceof nla0) {
                                    rka0 rka0Var5 = lftVarX2.b;
                                    nla0Var = (nla0) lftVar;
                                    if (nla0Var.isOperator()) {
                                        z = true;
                                    } else {
                                        z = true;
                                    }
                                    if (nla0Var.isInfix()) {
                                        z2 = true;
                                    } else {
                                        z2 = true;
                                    }
                                    if (nla0Var.isInline()) {
                                        z3 = true;
                                    } else {
                                        z3 = true;
                                    }
                                    if (nla0Var.isExternal()) {
                                        z4 = true;
                                    } else {
                                        z4 = true;
                                    }
                                    if (sh10.a.compare(lftVar, lftVarX) > 0) {
                                        lftVar = lftVarX;
                                    }
                                    lftVarX2 = lftVarX2.x(rka0.a(rka0Var5, (rob0) null, (vma0) null, lftVar.w(), z4, z, z2, z3, 11));
                                }
                                if (lftVarX2 != null) {
                                    lftVarX = lftVarX2;
                                }
                            }
                            map.put(jfzVar3, lftVarX);
                            vma0VarP = vma0Var5;
                        }
                        z6 = z6;
                        it2 = it;
                        z5 = true;
                        tka0Var = null;
                    }
                }
                break;
            case 6:
                Class cls3 = bla0Var.b;
                Annotation[] annotations = cls3.getAnnotations();
                if (annotations.length != cls3.getDeclaredAnnotations().length) {
                    ArrayList arrayList2 = new ArrayList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Class superclass = cls3;
                    do {
                        Annotation[] declaredAnnotations = superclass.getDeclaredAnnotations();
                        for (int length = declaredAnnotations.length - 1; -1 < length; length--) {
                            Annotation annotation = declaredAnnotations[length];
                            if (!bla0.d.contains(j2h1.s(annotation).n().getName())) {
                                if (superclass != cls3) {
                                    kf30 kf30Var = bpi1.a;
                                    if (j2h1.s(annotation).n().getAnnotation(Inherited.class) != null) {
                                        if (bpi1.i(j2h1.s(annotation))) {
                                            Class<?> componentType = j2h1.s(annotation).n().getDeclaredMethod("value", null).getReturnType().getComponentType();
                                            componentType.getClass();
                                            if (rc11.a.b(componentType).n().getAnnotation(Inherited.class) != null) {
                                                kf30 kf30Var2 = bpi1.a;
                                                tka0VarS = j2h1.s(annotation);
                                                if (bpi1.i(tka0VarS)) {
                                                    Class<?> componentType2 = ((wdg) tka0VarS).n().getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                    componentType2.getClass();
                                                    tka0VarS = rc11.a.b(componentType2);
                                                }
                                                cls = (Class) linkedHashMap2.get(tka0VarS);
                                                if (cls == null) {
                                                    linkedHashMap2.put(tka0VarS, superclass);
                                                }
                                                if (cls != null || cls.equals(superclass)) {
                                                    arrayList2.add(annotation);
                                                }
                                            }
                                        } else {
                                            kf30 kf30Var3 = bpi1.a;
                                            tka0VarS = j2h1.s(annotation);
                                            if (bpi1.i(tka0VarS)) {
                                                Class<?> componentType3 = ((wdg) tka0VarS).n().getDeclaredMethod("value", null).getReturnType().getComponentType();
                                                componentType3.getClass();
                                                tka0VarS = rc11.a.b(componentType3);
                                            }
                                            cls = (Class) linkedHashMap2.get(tka0VarS);
                                            if (cls == null) {
                                                linkedHashMap2.put(tka0VarS, superclass);
                                            }
                                            if (cls != null) {
                                                arrayList2.add(annotation);
                                            } else {
                                                arrayList2.add(annotation);
                                            }
                                        }
                                    }
                                } else {
                                    kf30 kf30Var4 = bpi1.a;
                                    tka0VarS = j2h1.s(annotation);
                                    if (bpi1.i(tka0VarS)) {
                                        Class<?> componentType4 = ((wdg) tka0VarS).n().getDeclaredMethod("value", null).getReturnType().getComponentType();
                                        componentType4.getClass();
                                        tka0VarS = rc11.a.b(componentType4);
                                    }
                                    cls = (Class) linkedHashMap2.get(tka0VarS);
                                    if (cls == null) {
                                        linkedHashMap2.put(tka0VarS, superclass);
                                    }
                                    if (cls != null) {
                                        arrayList2.add(annotation);
                                    } else {
                                        arrayList2.add(annotation);
                                    }
                                }
                            }
                        }
                        superclass = superclass.getSuperclass();
                    } while (superclass != null);
                    arrayList = o7h.T0(arrayList2);
                } else {
                    arrayList = new ArrayList();
                    for (Annotation annotation2 : annotations) {
                        if (!bla0.d.contains(j2h1.s(annotation2).n().getName())) {
                            arrayList.add(annotation2);
                        }
                    }
                }
                return bpi1.t(arrayList);
            case 7:
                Class cls4 = bla0Var.b;
                if (cls4.isAnonymousClass()) {
                    return null;
                }
                heg hegVarM2 = bla0Var.M();
                if (!hegVarM2.c) {
                    return hegVarM2.f().b();
                }
                String simpleName = cls4.getSimpleName();
                Method enclosingMethod = cls4.getEnclosingMethod();
                if (enclosingMethod != null) {
                    return ihc1.U0(simpleName, enclosingMethod.getName() + '$', simpleName);
                }
                Constructor<?> enclosingConstructor = cls4.getEnclosingConstructor();
                if (enclosingConstructor == null) {
                    return ihc1.T0(simpleName, '$', simpleName);
                }
                return ihc1.U0(simpleName, enclosingConstructor.getName() + '$', simpleName);
            default:
                if (bla0Var.b.isAnonymousClass()) {
                    return null;
                }
                heg hegVarM3 = bla0Var.M();
                if (hegVarM3.c) {
                    return null;
                }
                return hegVarM3.a().a.a;
        }
    }

    public /* synthetic */ vka0(bla0 bla0Var, yka0 yka0Var, byte b) {
        this.a = b;
        this.b = bla0Var;
    }
}
