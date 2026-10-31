package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class mla0 implements wdg {
    public static final se11 a = new se11("<v#(\\d+)>");

    public static Method I(Class cls, String str, Class[] clsArr, Class cls2, boolean z) {
        Class clsL;
        Method methodI;
        if (z) {
            clsArr[0] = cls;
        }
        Method methodK = K(cls, str, clsArr, cls2);
        if (methodK != null) {
            return methodK;
        }
        Class superclass = cls.getSuperclass();
        if (superclass != null && (methodI = I(superclass, str, clsArr, cls2, z)) != null) {
            return methodI;
        }
        for (Class<?> cls3 : cls.getInterfaces()) {
            cls3.getClass();
            Method methodI2 = I(cls3, str, clsArr, cls2, z);
            if (methodI2 != null) {
                return methodI2;
            }
            if (z && (clsL = r1p1.l(bb11.d(cls3), cls3.getName().concat("$DefaultImpls"))) != null) {
                clsArr[0] = cls3;
                Method methodK2 = K(clsL, str, clsArr, cls2);
                if (methodK2 != null) {
                    return methodK2;
                }
            }
        }
        return null;
    }

    public static Constructor J(Class cls, List list) {
        try {
            Class[] clsArr = (Class[]) list.toArray(new Class[0]);
            return cls.getDeclaredConstructor((Class[]) Arrays.copyOf(clsArr, clsArr.length));
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static Method K(Class cls, String str, Class[] clsArr, Class cls2) {
        try {
            Method declaredMethod = cls.getDeclaredMethod(str, (Class[]) Arrays.copyOf(clsArr, clsArr.length));
            if (u890.j(declaredMethod.getReturnType(), cls2)) {
                return declaredMethod;
            }
            for (Method method : cls.getDeclaredMethods()) {
                if (u890.j(method.getName(), str) && u890.j(method.getReturnType(), cls2) && Arrays.equals(method.getParameterTypes(), clsArr)) {
                    return method;
                }
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static void w(ArrayList arrayList, List list, boolean z, boolean z2) {
        if (u890.j(o7h.C0(list), DefaultConstructorMarker.class)) {
            list = list.subList(0, list.size() - 1);
        }
        int size = z2 ? list.size() - 1 : list.size();
        arrayList.addAll(list);
        int i = (size + 31) / 32;
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(Integer.TYPE);
        }
        arrayList.add(z ? DefaultConstructorMarker.class : Object.class);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public final w3b0 A(String str, String str2) throws i9n {
        ArrayList arrayListM = ((ema0) this).M();
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListM) {
            w3b0 w3b0Var = (w3b0) obj;
            if (u890.j(w3b0Var.a(), str) && u890.j(ajo1.t(w3b0Var, this), str2)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            StringBuilder sbN = gvg.n("Property '", str, "' (JVM signature: ", str2, ") not resolved in ");
            sbN.append(this);
            throw new i9n(sbN.toString());
        }
        if (arrayList.size() <= 1) {
            return (w3b0) o7h.V0(arrayList);
        }
        StringBuilder sbN2 = gvg.n("Property '", str, "' (JVM signature: ", str2, ") resolved in several methods in ");
        sbN2.append(this);
        throw new i9n(sbN2.toString());
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Collection B() throws i9n {
        throw new i9n("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Collection C() throws i9n {
        throw new i9n("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Collection D(ajn0 ajn0Var) throws i9n {
        throw new i9n("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    public tdy0 E(int i) {
        return null;
    }

    public w3b0 F(int i) {
        return null;
    }

    public Class G() {
        Class cls = (Class) bb11.c.get(n());
        return cls == null ? n() : cls;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public Collection H(ajn0 ajn0Var) throws i9n {
        throw new i9n("Introspecting local functions, lambdas, anonymous functions, local variables and typealiases is not yet fully supported in Kotlin reflection");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: p.i9n */
    public final q7b0 x(int i, String str) throws i9n {
        w3b0 w3b0VarF = F(i);
        if (w3b0VarF == null) {
            return null;
        }
        if (w3b0VarF.b() == null) {
            return xm7.d(w3b0VarF) ? new a7b0(this, str, (Object) null, w3b0VarF) : new q7b0(this, str, (Object) null, w3b0VarF);
        }
        throw new i9n("Local property " + w3b0VarF.a() + " is an extension, which is not yet supported");
    }

    public final Method y(String str, boolean z, String str2, boolean z2) {
        if (str.equals("<init>")) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(n());
        }
        kp00 kp00VarL = bpi1.l(bb11.d(n()), str2, true);
        w(arrayList, kp00VarL.h(), false, z2);
        Class clsG = G();
        String strConcat = str.concat("$default");
        Class[] clsArr = (Class[]) arrayList.toArray(new Class[0]);
        Class clsI = kp00VarL.i();
        clsI.getClass();
        return I(clsG, strConcat, clsArr, clsI, z);
    }

    public final Method z(String str, String str2) {
        Method methodI;
        if (str.equals("<init>")) {
            return null;
        }
        kp00 kp00VarL = bpi1.l(bb11.d(n()), str2, true);
        Class[] clsArr = (Class[]) kp00VarL.h().toArray(new Class[0]);
        Class clsI = kp00VarL.i();
        clsI.getClass();
        Method methodI2 = I(G(), str, clsArr, clsI, false);
        if (methodI2 != null) {
            return methodI2;
        }
        if (!G().isInterface() || (methodI = I(Object.class, str, clsArr, clsI, false)) == null) {
            return null;
        }
        return methodI;
    }
}
