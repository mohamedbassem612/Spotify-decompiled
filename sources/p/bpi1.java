package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class bpi1 {
    public static final kf30 a = new kf30("kotlin.jvm.JvmStatic");
    public static final String b;

    static {
        StringBuilder sb = new StringBuilder();
        xv30 xv30Var = xv30.d;
        sb.append(((yv30) xv30Var).a.a.a);
        sb.append('.');
        sb.append(((yv30) xv30Var).b);
        b = sb.toString();
    }

    public static oma0 a(oma0 oma0Var) {
        return s(oma0Var);
    }

    public static final dc11 b(Object obj) {
        if (obj instanceof irb0) {
            return b(((irb0) obj).e());
        }
        if (obj instanceof dc11) {
            return (dc11) obj;
        }
        if (obj instanceof lyc) {
            qka0 qka0VarCompute = ((lyc) obj).compute();
            if (qka0VarCompute == obj) {
                qka0VarCompute = null;
            }
            if (qka0VarCompute != null) {
                return b(qka0VarCompute);
            }
        }
        return null;
    }

    public static final ic11 c(Object obj) {
        if (obj instanceof irb0) {
            return c(((irb0) obj).e());
        }
        if (obj instanceof ic11) {
            return (ic11) obj;
        }
        if (obj instanceof eey0) {
            qka0 qka0VarCompute = ((eey0) obj).compute();
            if (qka0VarCompute == obj) {
                qka0VarCompute = null;
            }
            if (qka0VarCompute != null) {
                return c(qka0VarCompute);
            }
        }
        return null;
    }

    public static final List d(ve5 ve5Var) {
        Annotation annotationO;
        fg5<pf5> annotations = ve5Var.getAnnotations();
        ArrayList arrayList = new ArrayList();
        for (pf5 pf5Var : annotations) {
            mka1 source = pf5Var.getSource();
            if (source instanceof ab11) {
                annotationO = ((ab11) source).a;
            } else if (source instanceof g141) {
                qb11 qb11Var = ((g141) source).a;
                cb11 cb11Var = qb11Var instanceof cb11 ? (cb11) qb11Var : null;
                annotationO = cb11Var != null ? cb11Var.a : null;
            } else {
                annotationO = o(pf5Var);
            }
            if (annotationO != null) {
                arrayList.add(annotationO);
            }
        }
        return t(arrayList);
    }

    public static final Object e(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                if (cls.equals(Boolean.TYPE)) {
                    return Boolean.FALSE;
                }
                if (cls.equals(Character.TYPE)) {
                    return (char) 0;
                }
                if (cls.equals(Byte.TYPE)) {
                    return (byte) 0;
                }
                if (cls.equals(Short.TYPE)) {
                    return (short) 0;
                }
                if (cls.equals(Integer.TYPE)) {
                    return 0;
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(0.0f);
                }
                if (cls.equals(Long.TYPE)) {
                    return 0L;
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(0.0d);
                }
                if (cls.equals(Void.TYPE)) {
                    eg.m("Parameter with void type is illegal");
                    return null;
                }
                t8e1.o(type, "Unknown primitive: ");
            }
        }
        return null;
    }

    public static final hyc f(Class cls, xht xhtVar, ef40 ef40Var, zjn0 zjn0Var, l141 l141Var, ava avaVar, vu30 vu30Var) {
        List list;
        e141 e141VarA = xim0.a(cls);
        if (ef40Var instanceof yfy0) {
            list = ((yfy0) ef40Var).i;
        } else {
            if (!(ef40Var instanceof ggy0)) {
                hhg1.o(ef40Var, "Unsupported message: ");
                return null;
            }
            list = ((ggy0) ef40Var).i;
        }
        List list2 = list;
        ks6 ks6Var = e141VarA.a;
        zim0 zim0Var = (zim0) ks6Var.b;
        y3j1 y3j1Var = y3j1.b;
        list2.getClass();
        return (hyc) vu30Var.invoke(new eki0(new byp(ks6Var, zjn0Var, zim0Var, l141Var, y3j1Var, avaVar, xhtVar, (mxa1) null, list2)), ef40Var);
    }

    public static final rob0 g(lft lftVar) {
        rob0 rob0Var = lftVar.b.a;
        if (rob0Var != null) {
            return rob0Var;
        }
        hyc hycVarT = lftVar.t();
        if (hycVarT instanceof pjl) {
            return ((qv30) ((pjl) hycVarT)).X;
        }
        if (hycVarT.I() != null) {
            return ((beg) hycVarT.k()).q0();
        }
        return null;
    }

    public static final boolean h(oma0 oma0Var) {
        bla0 bla0VarK = oma0Var.k();
        bla0 bla0Var = bla0VarK instanceof bla0 ? bla0VarK : null;
        return bla0Var != null && bla0Var.p();
    }

    public static final boolean i(tka0 tka0Var) {
        Method declaredMethod;
        Class<?> componentType;
        Annotation annotation;
        Object objInvoke;
        Class clsN = ((wdg) tka0Var).n();
        try {
            declaredMethod = clsN.getDeclaredMethod("value", (Class[]) Arrays.copyOf(new Class[0], 0));
        } catch (NoSuchMethodException unused) {
            declaredMethod = null;
        }
        if (declaredMethod != null && (componentType = declaredMethod.getReturnType().getComponentType()) != null && componentType.isAnnotation()) {
            Annotation[] annotations = componentType.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    annotation = null;
                    break;
                }
                annotation = annotations[i];
                if (j2h1.s(annotation).n().getName().equals(eia0.g.a.a)) {
                    break;
                }
                i++;
            }
            if (annotation != null && (objInvoke = j2h1.s(annotation).n().getMethod("value", null).invoke(annotation, null)) != null) {
                return clsN.equals(objInvoke);
            }
        }
        return false;
    }

    public static final boolean j(oma0 oma0Var) {
        if (oma0Var.i()) {
            return true;
        }
        b7 b7Var = (b7) oma0Var;
        b7 b7VarB = b7Var.B();
        if (b7VarB != null && j(b7VarB)) {
            return true;
        }
        if (b7Var.s()) {
            return false;
        }
        jla0 jla0VarK = oma0Var.k();
        if (!(jla0VarK instanceof qma0)) {
            return false;
        }
        List upperBounds = ((qma0) jla0VarK).getUpperBounds();
        if ((upperBounds instanceof Collection) && upperBounds.isEmpty()) {
            return false;
        }
        Iterator it = upperBounds.iterator();
        while (it.hasNext()) {
            if (j((oma0) it.next())) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Class k(ClassLoader classLoader, heg hegVar, int i) {
        lf30 lf30Var = hegVar.a().a;
        String str = lf30Var.a;
        Integer numC0 = nhc1.c0(ihc1.U0(str, b, str));
        if (numC0 != null) {
            int iIntValue = numC0.intValue();
            uv30 uv30Var = uv30.d;
            return k(classLoader, new heg(((yv30) uv30Var).a, uv30Var.a(iIntValue + 1)), i);
        }
        String str2 = j8a0.a;
        heg hegVarG = j8a0.g(lf30Var);
        if (hegVarG == null) {
            hegVarG = hegVar;
        }
        if (!hegVarG.equals(hegVar)) {
            classLoader = bb11.d(rih1.class);
        }
        String str3 = hegVarG.a.a.a;
        String str4 = hegVarG.b.a.a;
        if (u890.j(str3, "kotlin")) {
            switch (str4.hashCode()) {
                case -901856463:
                    if (str4.equals("BooleanArray")) {
                        return boolean[].class;
                    }
                    break;
                case -763279523:
                    if (str4.equals("ShortArray")) {
                        return short[].class;
                    }
                    break;
                case -755911549:
                    if (str4.equals("CharArray")) {
                        return char[].class;
                    }
                    break;
                case -74930671:
                    if (str4.equals("ByteArray")) {
                        return byte[].class;
                    }
                    break;
                case 22374632:
                    if (str4.equals("DoubleArray")) {
                        return double[].class;
                    }
                    break;
                case 63537721:
                    if (str4.equals("Array")) {
                        return Object[].class;
                    }
                    break;
                case 601811914:
                    if (str4.equals("IntArray")) {
                        return int[].class;
                    }
                    break;
                case 948852093:
                    if (str4.equals("FloatArray")) {
                        return float[].class;
                    }
                    break;
                case 2104330525:
                    if (str4.equals("LongArray")) {
                        return long[].class;
                    }
                    break;
            }
        }
        StringBuilder sb = new StringBuilder();
        if (i > 0) {
            for (int i2 = 0; i2 < i; i2++) {
                sb.append("[");
            }
            sb.append("L");
        }
        if (str3.length() > 0) {
            sb.append(str3.concat("."));
        }
        sb.append(str4.replace('.', '$'));
        if (i > 0) {
            sb.append(";");
        }
        return r1p1.l(classLoader, sb.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static final kp00 l(ClassLoader classLoader, String str, boolean z) throws i9n {
        Class clsM;
        dh30 dh30VarN = n(str);
        ArrayList<String> arrayList = (ArrayList) dh30VarN.b;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (String str2 : arrayList) {
            arrayList2.add(m(classLoader, str2, 0, str2.length()));
        }
        if (z) {
            String str3 = (String) dh30VarN.c;
            clsM = m(classLoader, str3, 0, str3.length());
        } else {
            clsM = null;
        }
        return new kp00(arrayList2, clsM, (byte) 25);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static final Class m(ClassLoader classLoader, String str, int i, int i2) throws i9n {
        char cCharAt = str.charAt(i);
        if (cCharAt == 'F') {
            return Float.TYPE;
        }
        if (cCharAt == 'L') {
            return classLoader.loadClass(str.substring(i + 1, i2 - 1).replace('/', '.'));
        }
        if (cCharAt == 'S') {
            return Short.TYPE;
        }
        if (cCharAt == 'V') {
            return Void.TYPE;
        }
        if (cCharAt == 'I') {
            return Integer.TYPE;
        }
        if (cCharAt == 'J') {
            return Long.TYPE;
        }
        if (cCharAt == 'Z') {
            return Boolean.TYPE;
        }
        if (cCharAt == '[') {
            return Array.newInstance((Class<?>) m(classLoader, str, i + 1, i2), 0).getClass();
        }
        switch (cCharAt) {
            case 'B':
                return Byte.TYPE;
            case 'C':
                return Character.TYPE;
            case 'D':
                return Double.TYPE;
            default:
                throw new i9n("Unknown type prefix in the method signature: ".concat(str));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public static final dh30 n(String str) throws i9n {
        int iV0;
        ArrayList arrayList = new ArrayList();
        int i = 1;
        while (str.charAt(i) != ')') {
            int i2 = i;
            while (str.charAt(i2) == '[') {
                i2++;
            }
            char cCharAt = str.charAt(i2);
            if (ihc1.i0("VZCBSIFJD", cCharAt)) {
                iV0 = i2 + 1;
            } else {
                if (cCharAt != 'L') {
                    throw new i9n("Unknown type prefix in the method signature: ".concat(str));
                }
                iV0 = ihc1.v0(str, ';', i, 4) + 1;
            }
            arrayList.add(str.substring(i, iV0));
            i = iV0;
        }
        return new dh30(arrayList, str.substring(i + 1), (byte) 3);
    }

    public static final Annotation o(pf5 pf5Var) {
        beg begVarD = kht.d(pf5Var);
        Class clsP = begVarD != null ? p(begVarD) : null;
        if (clsP == null) {
            clsP = null;
        }
        if (clsP == null) {
            return null;
        }
        Set<Map.Entry> setEntrySet = pf5Var.a().entrySet();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : setEntrySet) {
            ajn0 ajn0Var = (ajn0) entry.getKey();
            Object objR = r((sgl) entry.getValue(), clsP.getClassLoader());
            mmr0 mmr0Var = objR != null ? new mmr0(ajn0Var.b(), objR) : null;
            if (mmr0Var != null) {
                arrayList.add(mmr0Var);
            }
        }
        return (Annotation) bzn1.o(clsP, sqg0.T(arrayList));
    }

    public static final Class p(beg begVar) {
        Object source = begVar.getSource();
        if (source instanceof u6b0) {
            return ((u6b0) source).a.a;
        }
        if (source instanceof g141) {
            return ((mb11) ((g141) source).a).a;
        }
        heg hegVarF = kht.f(begVar);
        if (hegVarF == null) {
            return null;
        }
        return k(bb11.d(begVar.getClass()), hegVarF, 0);
    }

    public static final xma0 q(lht lhtVar) {
        if (lhtVar.equals(mht.e)) {
            return xma0.a;
        }
        if (lhtVar.equals(mht.c)) {
            return xma0.b;
        }
        if (lhtVar.equals(mht.d)) {
            return xma0.c;
        }
        if (lhtVar.equals(mht.a) || lhtVar.equals(mht.b)) {
            return xma0.d;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object r(sgl sglVar, ClassLoader classLoader) {
        Class clsK;
        if (sglVar instanceof dg5) {
            return o((pf5) ((dg5) sglVar).a);
        }
        int i = 0;
        if (sglVar instanceof e46) {
            e46 e46Var = (e46) sglVar;
            q1h1 q1h1Var = e46Var instanceof q1h1 ? (q1h1) e46Var : null;
            if (q1h1Var != null) {
                a8b0 a8b0Var = q1h1Var.c;
                Object obj = e46Var.a;
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(r((sgl) it.next(), classLoader));
                }
                ajn0 ajn0Var = g6b0.e;
                jfg jfgVarS = a8b0Var.t0().s();
                Enum enumS = jfgVarS == null ? null : g6b0.s(jfgVarS);
                switch (enumS == null ? -1 : api1.a[enumS.ordinal()]) {
                    case -1:
                        if (!g6b0.z(a8b0Var)) {
                            bhn0.g(a8b0Var, "Not an array type: ");
                            return null;
                        }
                        a8b0 a8b0VarB = ((e1h1) o7h.V0(a8b0Var.r0())).b();
                        jfg jfgVarS2 = a8b0VarB.t0().s();
                        beg begVar = jfgVarS2 instanceof beg ? (beg) jfgVarS2 : null;
                        if (begVar == null) {
                            hhg1.o(a8b0VarB, "Not a class type: ");
                            return null;
                        }
                        if (g6b0.I(a8b0VarB)) {
                            int size = ((List) obj).size();
                            String[] strArr = new String[size];
                            while (i < size) {
                                strArr[i] = arrayList.get(i);
                                i++;
                            }
                            return strArr;
                        }
                        if (g6b0.b(begVar, rfb1.Q)) {
                            int size2 = ((List) obj).size();
                            Class[] clsArr = new Class[size2];
                            while (i < size2) {
                                clsArr[i] = arrayList.get(i);
                                i++;
                            }
                            return clsArr;
                        }
                        heg hegVarF = kht.f(begVar);
                        if (hegVarF != null && (clsK = k(classLoader, hegVarF, 0)) != null) {
                            Object[] objArr = (Object[]) Array.newInstance((Class<?>) clsK, ((List) obj).size());
                            int size3 = arrayList.size();
                            while (i < size3) {
                                objArr[i] = arrayList.get(i);
                                i++;
                            }
                            return objArr;
                        }
                        break;
                    case 0:
                    default:
                        eg.o();
                        return null;
                    case 1:
                        int size4 = ((List) obj).size();
                        boolean[] zArr = new boolean[size4];
                        while (i < size4) {
                            zArr[i] = ((Boolean) arrayList.get(i)).booleanValue();
                            i++;
                        }
                        return zArr;
                    case 2:
                        int size5 = ((List) obj).size();
                        char[] cArr = new char[size5];
                        while (i < size5) {
                            cArr[i] = ((Character) arrayList.get(i)).charValue();
                            i++;
                        }
                        return cArr;
                    case 3:
                        int size6 = ((List) obj).size();
                        byte[] bArr = new byte[size6];
                        while (i < size6) {
                            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
                            i++;
                        }
                        return bArr;
                    case 4:
                        int size7 = ((List) obj).size();
                        short[] sArr = new short[size7];
                        while (i < size7) {
                            sArr[i] = ((Short) arrayList.get(i)).shortValue();
                            i++;
                        }
                        return sArr;
                    case 5:
                        int size8 = ((List) obj).size();
                        int[] iArr = new int[size8];
                        while (i < size8) {
                            iArr[i] = ((Integer) arrayList.get(i)).intValue();
                            i++;
                        }
                        return iArr;
                    case 6:
                        int size9 = ((List) obj).size();
                        float[] fArr = new float[size9];
                        while (i < size9) {
                            fArr[i] = ((Float) arrayList.get(i)).floatValue();
                            i++;
                        }
                        return fArr;
                    case 7:
                        int size10 = ((List) obj).size();
                        long[] jArr = new long[size10];
                        while (i < size10) {
                            jArr[i] = ((Long) arrayList.get(i)).longValue();
                            i++;
                        }
                        return jArr;
                    case 8:
                        int size11 = ((List) obj).size();
                        double[] dArr = new double[size11];
                        while (i < size11) {
                            dArr[i] = ((Double) arrayList.get(i)).doubleValue();
                            i++;
                        }
                        return dArr;
                }
            }
        } else if (sglVar instanceof b1z) {
            mmr0 mmr0Var = (mmr0) ((b1z) sglVar).a;
            heg hegVar = (heg) mmr0Var.a;
            ajn0 ajn0Var2 = (ajn0) mmr0Var.b;
            Class clsK2 = k(classLoader, hegVar, 0);
            if (clsK2 != null) {
                return Enum.valueOf(clsK2, ajn0Var2.b());
            }
        } else {
            if (!(sglVar instanceof fla0)) {
                if ((sglVar instanceof ckz) || (sglVar instanceof fep0)) {
                    return null;
                }
                return sglVar.b();
            }
            ela0 ela0Var = (ela0) ((fla0) sglVar).a;
            if (ela0Var instanceof dla0) {
                jeg jegVar = ((dla0) ela0Var).a;
                return k(classLoader, jegVar.a, jegVar.b);
            }
            if (!(ela0Var instanceof cla0)) {
                eg.o();
                return null;
            }
            jfg jfgVarS3 = ((cla0) ela0Var).a.t0().s();
            beg begVar2 = jfgVarS3 instanceof beg ? (beg) jfgVarS3 : null;
            if (begVar2 != null) {
                return p(begVar2);
            }
        }
        return null;
    }

    public static final oma0 s(oma0 oma0Var) {
        bla0 bla0VarK = oma0Var.k();
        bla0 bla0Var = bla0VarK instanceof bla0 ? bla0VarK : null;
        if (bla0Var != null) {
            return (oma0) ((yka0) bla0Var.c.getValue()).l.getValue();
        }
        return null;
    }

    public static final List t(List list) {
        List<Annotation> list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                if (j2h1.s((Annotation) it.next()).n().getSimpleName().equals("Container")) {
                    list = new ArrayList();
                    for (Annotation annotation : list2) {
                        wdg wdgVarS = j2h1.s(annotation);
                        Class clsN = wdgVarS.n();
                        r7h.W((!clsN.getSimpleName().equals("Container") || clsN.getAnnotation(cf21.class) == null) ? Collections.singletonList(annotation) : Arrays.asList((Annotation[]) wdgVarS.n().getDeclaredMethod("value", null).invoke(annotation, null)), list);
                    }
                    break;
                }
            }
        }
        return list;
    }
}
