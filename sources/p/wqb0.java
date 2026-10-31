package p;

import java.lang.reflect.Field;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wqb0 implements iu30 {
    public final /* synthetic */ byte a;
    public final yqb0 b;

    public /* synthetic */ wqb0(yqb0 yqb0Var, byte b) {
        this.a = b;
        this.b = yqb0Var;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x015f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0182  */
    /* JADX WARN: Code duplicated, block: B:88:0x023d  */
    public final Object invoke(Object obj) {
        zb11 gb11Var;
        zb11 xb11Var;
        byte b = this.a;
        yqb0 yqb0Var = this.b;
        switch (b) {
            case 0:
                ajn0 ajn0Var = (ajn0) obj;
                yqb0 yqb0Var2 = yqb0Var.c;
                if (yqb0Var2 != null) {
                    return (Collection) yqb0Var2.f.invoke(ajn0Var);
                }
                ArrayList arrayList = new ArrayList();
                Iterator it = ((u9r) yqb0Var.e.invoke()).b(ajn0Var).iterator();
                while (it.hasNext()) {
                    c8a0 c8a0VarS = yqb0Var.s((vb11) it.next());
                    if (yqb0Var.q(c8a0VarS)) {
                        Object obj2 = yqb0Var.b.b;
                        arrayList.add(c8a0VarS);
                    }
                }
                yqb0Var.j(arrayList, ajn0Var);
                return arrayList;
            case 1:
                ajn0 ajn0Var2 = (ajn0) obj;
                yqb0 yqb0Var3 = yqb0Var.c;
                if (yqb0Var3 != null) {
                    return (tdy0) yqb0Var3.g.invoke(ajn0Var2);
                }
                sb11 sb11VarF = ((u9r) yqb0Var.e.invoke()).f(ajn0Var2);
                if (sb11VarF != null) {
                    Field field = sb11VarF.a;
                    if (!field.isEnumConstant()) {
                        p811 p811Var = new p811();
                        boolean z = !Modifier.isFinal(((Field) sb11VarF.b()).getModifiers());
                        o860 o860Var = yqb0Var.b;
                        f8a0 f8a0VarF1 = f8a0.F1(yqb0Var.p(), flo1.n(o860Var, sb11VarF), kuo1.k(sb11VarF.e()), z, sb11VarF.c(), wdx0.b(sb11VarF), Modifier.isFinal(((Field) sb11VarF.b()).getModifiers()) && Modifier.isStatic(((Field) sb11VarF.b()).getModifiers()));
                        p811Var.a = f8a0VarF1;
                        f8a0VarF1.B1(null, null, null, null);
                        st60 st60Var = (st60) o860Var.e;
                        Type genericType = field.getGenericType();
                        boolean z2 = genericType instanceof Class;
                        if (z2) {
                            Class cls = (Class) genericType;
                            if (cls.isPrimitive()) {
                                xb11Var = new xb11(cls);
                            } else {
                                if (!(genericType instanceof GenericArrayType) || (z2 && ((Class) genericType).isArray())) {
                                    gb11Var = new gb11(genericType);
                                } else {
                                    gb11Var = genericType instanceof WildcardType ? new cc11((WildcardType) genericType) : new ob11(genericType);
                                }
                                xb11Var = gb11Var;
                            }
                        } else {
                            if (genericType instanceof GenericArrayType) {
                                gb11Var = new gb11(genericType);
                            } else {
                                gb11Var = new gb11(genericType);
                            }
                            xb11Var = gb11Var;
                        }
                        a8b0 a8b0VarL = st60Var.L(xb11Var, bs51.u(2, false, (drb0) null, 7));
                        if ((g6b0.G(a8b0VarL) || g6b0.I(a8b0VarL)) && Modifier.isFinal(((Field) sb11VarF.b()).getModifiers())) {
                            Modifier.isStatic(((Field) sb11VarF.b()).getModifiers());
                        }
                        vdy0 vdy0Var = (vdy0) p811Var.a;
                        rob0 rob0VarO = yqb0Var.o();
                        z6x z6xVar = z6x.a;
                        vdy0Var.E1(a8b0VarL, z6xVar, rob0VarO, null, z6xVar);
                        n9r n9rVarP = yqb0Var.p();
                        if ((n9rVarP instanceof beg ? (beg) n9rVarP : null) != null) {
                            p811Var.a = (vdy0) p811Var.a;
                        }
                        Object obj3 = p811Var.a;
                        fti1 fti1Var = (fti1) obj3;
                        a8b0 type = ((vdy0) obj3).getType();
                        if (fti1Var == null) {
                            iht.a(65);
                            throw null;
                        }
                        if (type == null) {
                            iht.a(66);
                            throw null;
                        }
                        int i = iht.a;
                        if (!fti1Var.K() && !d4o1.i(type)) {
                            if (o1h1.b(type)) {
                                ((vdy0) p811Var.a).C1(null, new gfr(yqb0Var, sb11VarF, p811Var, (byte) 7));
                            } else {
                                g6b0 g6b0VarE = kht.e(fti1Var);
                                if (g6b0.G(type)) {
                                    ((vdy0) p811Var.a).C1(null, new gfr(yqb0Var, sb11VarF, p811Var, (byte) 7));
                                } else {
                                    cao0 cao0Var = c8b0.a;
                                    if (cao0Var.a(g6b0VarE.v(), type) || cao0Var.a(g6b0VarE.l("Number").m(), type) || cao0Var.a(g6b0VarE.f(), type) || qlh1.a(type)) {
                                        ((vdy0) p811Var.a).C1(null, new gfr(yqb0Var, sb11VarF, p811Var, (byte) 7));
                                    }
                                }
                            }
                        }
                        Object obj4 = p811Var.a;
                        if (((tdy0) obj4) != null) {
                            return (tdy0) obj4;
                        }
                        Object[] objArr = new Object[3];
                        switch (6) {
                            case 1:
                                objArr[0] = "member";
                                break;
                            case 2:
                            case 4:
                            case 6:
                            case 8:
                                objArr[0] = "descriptor";
                                break;
                            case 3:
                                objArr[0] = "element";
                                break;
                            case 5:
                                objArr[0] = "field";
                                break;
                            case 7:
                                objArr[0] = "javaClass";
                                break;
                            default:
                                objArr[0] = "fqName";
                                break;
                        }
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
                        switch (6) {
                            case 1:
                            case 2:
                                objArr[2] = "recordMethod";
                                break;
                            case 3:
                            case 4:
                                objArr[2] = "recordConstructor";
                                break;
                            case 5:
                            case 6:
                                objArr[2] = "recordField";
                                break;
                            case 7:
                            case 8:
                                objArr[2] = "recordClass";
                                break;
                            default:
                                objArr[2] = "getClassResolvedFromSource";
                                break;
                        }
                        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
                    }
                }
                return null;
            case 2:
                ajn0 ajn0Var3 = (ajn0) obj;
                LinkedHashSet linkedHashSet = new LinkedHashSet((Collection) yqb0Var.f.invoke(ajn0Var3));
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj5 : linkedHashSet) {
                    String strM = h0p1.m((xw81) obj5, 2);
                    Object objH = linkedHashMap.get(strM);
                    if (objH == null) {
                        objH = cfm0.h(strM, linkedHashMap);
                    }
                    ((List) objH).add(obj5);
                }
                for (List list : linkedHashMap.values()) {
                    if (list.size() != 1) {
                        List list2 = list;
                        Collection collectionE = j9k1.E(list2, aht.c1);
                        linkedHashSet.removeAll(list2);
                        linkedHashSet.addAll(collectionE);
                    }
                }
                yqb0Var.l(linkedHashSet, ajn0Var3);
                o860 o860Var2 = yqb0Var.b;
                return o7h.l1(((sua) ((uw0) o860Var2.b).Z).m(o860Var2, linkedHashSet));
            default:
                ajn0 ajn0Var4 = (ajn0) obj;
                ArrayList arrayList2 = new ArrayList();
                h4p1.d(arrayList2, yqb0Var.g.invoke(ajn0Var4));
                yqb0Var.m(arrayList2, ajn0Var4);
                if (iht.l(yqb0Var.p(), 5)) {
                    return o7h.l1(arrayList2);
                }
                o860 o860Var3 = yqb0Var.b;
                return o7h.l1(((sua) ((uw0) o860Var3.b).Z).m(o860Var3, arrayList2));
        }
    }
}
