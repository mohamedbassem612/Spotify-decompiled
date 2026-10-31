package p;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class uka0 implements Function0 {
    public final /* synthetic */ byte a;
    public final bla0 b;
    public final yka0 c;

    public /* synthetic */ uka0(yka0 yka0Var, bla0 bla0Var, byte b) {
        this.a = b;
        this.c = yka0Var;
        this.b = bla0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    /* JADX WARN: Code duplicated, block: B:15:0x0042  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invoke() throws i9n, NoSuchFieldException {
        String str;
        HashMap map;
        Field fieldX;
        Class<?> declaringClass;
        ArrayList arrayList;
        Field declaredField;
        tka0 tka0VarB;
        znb0 znb0Var;
        yka0 yka0Var;
        int i = 0;
        ArrayList arrayList2 = null;
        c1h1VarD = null;
        c1h1VarD = null;
        c1h1 c1h1VarD = null;
        switch (this.a) {
            case 0:
                bla0 bla0Var = this.b;
                yka0 yka0Var2 = this.c;
                b7x b7xVar = b7x.a;
                Class cls = bla0Var.b;
                if (cls.equals(Object.class)) {
                    return z6x.a;
                }
                if (oed1.a) {
                    Collection<a8b0> collectionD = yka0Var2.b().g().d();
                    ArrayList arrayList3 = new ArrayList(collectionD.size());
                    bla0 bla0Var2 = yka0Var2.v;
                    for (a8b0 a8b0Var : collectionD) {
                        a8b0Var.getClass();
                        arrayList3.add(new rgt(a8b0Var, new na(a8b0Var, bla0Var2, (byte) 26), false));
                    }
                    if (!g6b0.H(yka0Var2.b())) {
                        if (arrayList3.isEmpty()) {
                            arrayList3.add(pfb1.a);
                        } else {
                            Iterator it = arrayList3.iterator();
                            while (it.hasNext()) {
                                bla0 bla0VarK = ((oma0) it.next()).k();
                                bla0 bla0Var3 = bla0VarK instanceof bla0 ? bla0VarK : null;
                                if (bla0Var3 == null || (bla0Var3.N() != ieg.INTERFACE && bla0Var3.N() != ieg.ANNOTATION_CLASS)) {
                                }
                            }
                            arrayList3.add(pfb1.a);
                        }
                    }
                    return h4p1.h(arrayList3);
                }
                ArrayList arrayList4 = new ArrayList();
                l3b0 l3b0VarC = yka0Var2.c();
                ArrayList<y3b0> arrayList5 = l3b0VarC != null ? l3b0VarC.d : null;
                if (arrayList5 != null) {
                    for (y3b0 y3b0Var : arrayList5) {
                        z0o1 z0o1VarA = y3b0Var.a();
                        m3b0 m3b0Var = z0o1VarA instanceof m3b0 ? (m3b0) z0o1VarA : null;
                        if (m3b0Var == null || (str = m3b0Var.c) == null) {
                            StringBuilder sb = new StringBuilder("Supertype of ");
                            sb.append(bla0Var);
                            z0o1 z0o1VarA2 = y3b0Var.a();
                            sb.append(" not a class: ");
                            sb.append(z0o1VarA2);
                            throw new i9n(sb.toString());
                        }
                        heg hegVarA = ajo1.A(str);
                        Class clsK = bpi1.k(bb11.d(cls), hegVarA, 0);
                        if (clsK == null) {
                            ofr.i("Unsupported superclass of ", bla0Var, ": ", hegVarA);
                            return null;
                        }
                        arrayList4.add(ajo1.B(y3b0Var, bb11.d(cls), yka0Var2.d(), new xka0(bla0Var, clsK, hegVarA)));
                    }
                    if (cls.isArray()) {
                        arrayList4.add(pfb1.c);
                    }
                    if (Serializable.class.isAssignableFrom(cls)) {
                        oma0 oma0Var = pfb1.d;
                        if (!arrayList4.contains(oma0Var)) {
                            mc11 mc11Var = yka0Var2.g;
                            mma0 mma0Var = yka0.w[3];
                            String str2 = (String) mc11Var.invoke();
                            if (str2 != null && nhc1.Y(str2, "kotlin.", false)) {
                                arrayList4.add(oma0Var);
                            }
                        }
                    }
                } else {
                    Type genericSuperclass = cls.getGenericSuperclass();
                    if (genericSuperclass != null) {
                        if (genericSuperclass.equals(Object.class)) {
                            genericSuperclass = null;
                        }
                        if (genericSuperclass != null) {
                            arrayList4.add(xio1.v(genericSuperclass, b7xVar, 1, false, 4));
                        }
                    }
                    for (Type type : cls.getGenericInterfaces()) {
                        type.getClass();
                        arrayList4.add(xio1.v(type, b7xVar, 1, false, 4));
                    }
                }
                if (arrayList4.isEmpty()) {
                    arrayList4.add(pfb1.a);
                } else {
                    Iterator it2 = arrayList4.iterator();
                    while (it2.hasNext()) {
                        bla0 bla0VarK2 = ((oma0) it2.next()).k();
                        bla0 bla0Var4 = bla0VarK2 instanceof bla0 ? bla0VarK2 : null;
                        if (bla0Var4 == null || (bla0Var4.N() != ieg.INTERFACE && bla0Var4.N() != ieg.ANNOTATION_CLASS)) {
                        }
                    }
                    arrayList4.add(pfb1.a);
                }
                return h4p1.h(arrayList4);
            case 1:
                bla0 bla0Var5 = this.b;
                yka0 yka0Var3 = this.c;
                z6x z6xVar = z6x.a;
                Class cls2 = bla0Var5.b;
                ClassLoader classLoaderD = bb11.d(cls2);
                l3b0 l3b0VarC2 = yka0Var3.c();
                if (l3b0VarC2 != null) {
                    ArrayList arrayList6 = l3b0VarC2.l;
                    ArrayList arrayList7 = new ArrayList();
                    Iterator it3 = arrayList6.iterator();
                    while (it3.hasNext()) {
                        tka0 tka0VarV = ajo1.v(classLoaderD, (String) it3.next());
                        if (tka0VarV != null) {
                            arrayList7.add(tka0VarV);
                        }
                    }
                    return arrayList7;
                }
                Method method = (Method) i541.F().b;
                if (!u890.j(method == null ? null : (Boolean) method.invoke(cls2, null), Boolean.TRUE)) {
                    return z6xVar;
                }
                Method method2 = (Method) i541.F().c;
                Class[] clsArr = method2 == null ? null : (Class[]) method2.invoke(cls2, null);
                if (clsArr != null) {
                    arrayList2 = new ArrayList(clsArr.length);
                    int length = clsArr.length;
                    while (i < length) {
                        arrayList2.add(rc11.a.b(clsArr[i]));
                        i++;
                    }
                }
                return arrayList2 == null ? z6xVar : arrayList2;
            case 2:
                yka0 yka0Var4 = this.c;
                Class cls3 = this.b.b;
                l3b0 l3b0VarC3 = yka0Var4.c();
                if (l3b0VarC3 == null || !xm7.c(l3b0VarC3)) {
                    return null;
                }
                y3b0 y3b0Var2 = l3b0VarC3.n;
                if (y3b0Var2 != null) {
                    if (y3b0Var2 != null) {
                        return ajo1.B(y3b0Var2, cls3.getClassLoader(), yka0Var4.d(), (Function0) null);
                    }
                    return null;
                }
                Object obj = null;
                for (Object obj2 : l3b0VarC3.f) {
                    w3b0 w3b0Var = (w3b0) obj2;
                    if (u890.j(w3b0Var.b, l3b0VarC3.m) && w3b0Var.h.isEmpty() && w3b0Var.f == null) {
                        if (i != 0) {
                            hhg1.n("Collection contains more than one matching element.");
                            return null;
                        }
                        i = 1;
                        obj = obj2;
                    }
                }
                if (i != 0) {
                    return ajo1.B(((w3b0) obj).c(), cls3.getClassLoader(), yka0Var4.d(), (Function0) null);
                }
                bhn0.t("Collection contains no element matching the predicate.");
                return null;
            case 3:
                yka0 yka0Var5 = this.c;
                bla0 bla0Var6 = this.b;
                boolean zE = yka0Var5.e();
                if (zE) {
                    mc11 mc11Var2 = yka0Var5.q;
                    mma0[] mma0VarArr = yka0.w;
                    mma0 mma0Var2 = mma0VarArr[14];
                    Collection collection = (Collection) mc11Var2.invoke();
                    mc11 mc11Var3 = yka0Var5.r;
                    mma0 mma0Var3 = mma0VarArr[15];
                    return o7h.N0((Collection) mc11Var3.invoke(), collection);
                }
                if (zE) {
                    eg.o();
                    return null;
                }
                yxh yxhVar = sh10.a;
                kez kezVar = kez.b;
                mc11 mc11Var4 = ((yka0) bla0Var6.c.getValue()).u;
                mma0 mma0Var4 = yka0.w[18];
                qh10 qh10Var = (qh10) mc11Var4.invoke();
                HashMap map2 = qh10Var.a;
                Class cls4 = bla0Var6.b;
                Object[] objArr = cls4.getAnnotation(Metadata.class) != null;
                Object[] objArr2 = qh10Var.b && bla0Var6.N() != ieg.ENUM_CLASS && objArr == true;
                i = (qh10Var.c || objArr2 == true) ? 1 : 0;
                if (i == 1) {
                    map = h4p1.q(map2.size());
                    for (Map.Entry entry : map2.entrySet()) {
                        lft lftVar = (lft) entry.getValue();
                        if (objArr2 == false || !sh10.d(lftVar)) {
                            if (!u890.j(lftVar.t().getVisibility(), y7a0.a) || u890.j(lftVar.a().n().getPackage(), cls4.getPackage())) {
                                map.put(entry.getKey(), entry.getValue());
                            }
                        }
                    }
                } else {
                    if (i != 0) {
                        eg.o();
                        return null;
                    }
                    map = new HashMap(map2);
                }
                HashMap map3 = new HashMap();
                for (mma0 mma0Var5 : sh10.b(bla0Var6)) {
                    if (sh10.d(mma0Var5) && bla0Var6.N() == ieg.INTERFACE && (!(mma0Var5 instanceof mma0) || (fieldX = m5n1.x(mma0Var5)) == null || (declaringClass = fieldX.getDeclaringClass()) == null || declaringClass.getAnnotation(Metadata.class) != null)) {
                        if (objArr == true) {
                            throw new IllegalStateException(("Kotlin doesn't have statics. '" + mma0Var5.getName() + "' appears to be declared static member in '" + bla0Var6.r() + '\'').toString());
                        }
                        map.put(sh10.g(mma0Var5, kezVar), mma0Var5);
                    } else if (mma0Var5.getVisibility() == xma0.d) {
                        if (objArr == true) {
                            map3.put(sh10.g(mma0Var5, lez.b), mma0Var5);
                        } else {
                            map.put(sh10.g(mma0Var5, kezVar), mma0Var5);
                        }
                    }
                }
                return o7h.N0(map3.values(), map.values());
            case 4:
                bla0 bla0Var7 = this.b;
                yka0 yka0Var6 = this.c;
                if (bla0Var7.N() == ieg.INTERFACE || bla0Var7.N() == ieg.OBJECT || bla0Var7.N() == ieg.COMPANION_OBJECT || bla0Var7.N() == ieg.ENUM_ENTRY) {
                    return z6x.a;
                }
                if (oed1.a || yka0Var6.c() == null) {
                    Collection collectionB = bla0Var7.B();
                    ArrayList arrayList8 = new ArrayList(q7h.U(collectionB, 10));
                    Iterator it4 = collectionB.iterator();
                    while (it4.hasNext()) {
                        arrayList8.add(new nft(bla0Var7, (pjl) it4.next()));
                    }
                    return arrayList8;
                }
                Collection<p3b0> collectionC = bla0Var7.C();
                ArrayList arrayList9 = new ArrayList(q7h.U(collectionC, 10));
                for (p3b0 p3b0Var : collectionC) {
                    ija0 ija0Var = ((uia0) ulo1.q(p3b0Var.e, uia0.b)).a;
                    if (ija0Var == null) {
                        throw new i9n("No signature for constructor (" + p3b0Var.b.size() + " parameters, declared in " + bla0Var7 + ')');
                    }
                    arrayList9.add(new w6b0(bla0Var7, ija0Var.toString(), lyc.NO_RECEIVER, p3b0Var));
                }
                return arrayList9;
            case 5:
                yka0 yka0Var7 = this.c;
                Class cls5 = this.b.b;
                l3b0 l3b0VarC4 = yka0Var7.c();
                if (l3b0VarC4 != null) {
                    heg hegVarA2 = ajo1.A(l3b0VarC4.e());
                    ClassLoader classLoaderD2 = bb11.d(cls5);
                    ArrayList arrayList10 = l3b0VarC4.i;
                    arrayList = new ArrayList();
                    Iterator it5 = arrayList10.iterator();
                    while (it5.hasNext()) {
                        Class clsK2 = bpi1.k(classLoaderD2, hegVarA2.d(ajn0.e((String) it5.next())), 0);
                        tka0 tka0VarB2 = clsK2 != null ? rc11.a.b(clsK2) : null;
                        if (tka0VarB2 != null) {
                            arrayList.add(tka0VarB2);
                        }
                    }
                } else {
                    Class<?>[] declaredClasses = cls5.getDeclaredClasses();
                    arrayList = new ArrayList();
                    int length2 = declaredClasses.length;
                    while (i < length2) {
                        Class<?> cls6 = declaredClasses[i];
                        cls6.getClass();
                        arrayList.add(rc11.a.b(cls6));
                        i++;
                    }
                }
                return arrayList;
            case 6:
                yka0 yka0Var8 = this.c;
                Class cls7 = this.b.b;
                l3b0 l3b0VarC5 = yka0Var8.c();
                if (l3b0VarC5 == null) {
                    return null;
                }
                if (xm7.a(l3b0VarC5) != ieg.OBJECT && xm7.a(l3b0VarC5) != ieg.COMPANION_OBJECT) {
                    return null;
                }
                if (xm7.a(l3b0VarC5) != ieg.COMPANION_OBJECT || o7h.i0(hxh.a, ajo1.A(l3b0VarC5.e()).e())) {
                    declaredField = cls7.getDeclaredField("INSTANCE");
                } else {
                    Class<?> enclosingClass = cls7.getEnclosingClass();
                    String strE = l3b0VarC5.e();
                    if (nhc1.Y(strE, ".", false)) {
                        hhg1.f("Local class is not supported: ".concat(strE));
                        return null;
                    }
                    String strV0 = ihc1.V0(strE, '/', strE);
                    declaredField = enclosingClass.getDeclaredField(ihc1.V0(strV0, '.', strV0));
                }
                return declaredField.get(null);
            case 7:
                yka0 yka0Var9 = this.c;
                bla0 bla0Var8 = this.b;
                if (oed1.a) {
                    List<y0h1> listN = yka0Var9.b().n();
                    ArrayList arrayList11 = new ArrayList(q7h.U(listN, 10));
                    for (y0h1 y0h1Var : listN) {
                        y0h1Var.getClass();
                        arrayList11.add(new qma0(bla0Var8, y0h1Var));
                    }
                    return arrayList11;
                }
                if (yka0Var9.c() != null) {
                    return yka0Var9.d().a;
                }
                TypeVariable[] typeParameters = bla0Var8.b.getTypeParameters();
                int iS = zno1.s(typeParameters.length);
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (TypeVariable typeVariable : typeParameters) {
                    linkedHashMap.put(typeVariable, new qma0(null, xio1.n(typeVariable), typeVariable.getName(), 1));
                }
                for (Map.Entry entry2 : linkedHashMap.entrySet()) {
                    TypeVariable typeVariable2 = (TypeVariable) entry2.getKey();
                    qma0 qma0Var = (qma0) entry2.getValue();
                    Type[] bounds = typeVariable2.getBounds();
                    ArrayList arrayList12 = new ArrayList(bounds.length);
                    for (Type type2 : bounds) {
                        type2.getClass();
                        arrayList12.add(xio1.v(type2, linkedHashMap, 0, false, 6));
                    }
                    qma0Var.f = arrayList12;
                }
                return o7h.l1(linkedHashMap.values());
            default:
                yka0 yka0Var10 = this.c;
                bla0 bla0Var9 = this.b;
                Class cls8 = bla0Var9.b;
                if (yka0Var10.c() == null) {
                    return c1h1.d;
                }
                c1h1 c1h1Var = c1h1.d;
                l3b0 l3b0VarC6 = yka0Var10.c();
                l3b0VarC6.getClass();
                ArrayList arrayList13 = l3b0VarC6.c;
                Class<?> enclosingClass2 = cls8.getEnclosingClass();
                if (enclosingClass2 != null) {
                    l3b0 l3b0VarC7 = yka0Var10.c();
                    l3b0VarC7.getClass();
                    if (!xm7.b(l3b0VarC7)) {
                        enclosingClass2 = null;
                    }
                    if (enclosingClass2 != null) {
                        tka0VarB = rc11.a.b(enclosingClass2);
                    } else {
                        tka0VarB = null;
                    }
                } else {
                    tka0VarB = null;
                }
                bla0 bla0Var10 = tka0VarB instanceof bla0 ? (bla0) tka0VarB : null;
                if (bla0Var10 != null && (znb0Var = bla0Var10.c) != null && (yka0Var = (yka0) znb0Var.getValue()) != null) {
                    c1h1VarD = yka0Var.d();
                }
                return xyn1.n(arrayList13, c1h1VarD, bla0Var9, bb11.d(cls8));
        }
    }

    public /* synthetic */ uka0(bla0 bla0Var, yka0 yka0Var, byte b) {
        this.a = b;
        this.b = bla0Var;
        this.c = yka0Var;
    }
}
