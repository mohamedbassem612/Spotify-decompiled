package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class meg implements tka0, wdg, q6b0 {
    public static final Map b;
    public final Class a;

    static {
        List listM = p7h.M(new Class[]{Function0.class, iu30.class, vu30.class, xu30.class, zu30.class, bv30.class, dv30.class, ev30.class, fv30.class, gv30.class, hu30.class, ju30.class, ku30.class, lu30.class, mu30.class, nu30.class, ou30.class, pu30.class, qu30.class, ru30.class, tu30.class, uu30.class, bw30.class});
        ArrayList arrayList = new ArrayList(q7h.U(listM, 10));
        int i = 0;
        for (Object obj : listM) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList.add(new mmr0((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        b = sqg0.T(arrayList);
    }

    public meg(Class cls) {
        this.a = cls;
    }

    public static void e() {
        throw new x7b0();
    }

    public final List d() {
        e();
        throw null;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof meg) && j2h1.t(this).equals(j2h1.t((tka0) obj));
    }

    public final GenericDeclaration findJavaDeclaration() {
        return this.a;
    }

    public final List getAnnotations() {
        e();
        throw null;
    }

    public final List getTypeParameters() {
        e();
        throw null;
    }

    public final Collection h() {
        e();
        throw null;
    }

    public final int hashCode() {
        return j2h1.t(this).hashCode();
    }

    public final boolean j() {
        e();
        throw null;
    }

    public final boolean m(Object obj) {
        Map map = b;
        Class clsT = this.a;
        Integer num = (Integer) map.get(clsT);
        if (num != null) {
            return w0h1.y(num.intValue(), obj);
        }
        if (clsT.isPrimitive()) {
            clsT = j2h1.t(rc11.a.b(clsT));
        }
        return clsT.isInstance(obj);
    }

    public final Class n() {
        return this.a;
    }

    public final String o() {
        String strK;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass() || cls.isLocalClass()) {
            return null;
        }
        if (!cls.isArray()) {
            String strK2 = yzo1.k(cls.getName());
            return strK2 == null ? cls.getCanonicalName() : strK2;
        }
        Class<?> componentType = cls.getComponentType();
        if (componentType.isPrimitive() && (strK = yzo1.k(componentType.getName())) != null) {
            strConcat = strK.concat("Array");
        }
        return strConcat == null ? "kotlin.Array" : strConcat;
    }

    public final boolean p() {
        e();
        throw null;
    }

    public final String r() {
        String strQ;
        Class cls = this.a;
        String strConcat = null;
        if (cls.isAnonymousClass()) {
            return null;
        }
        if (!cls.isLocalClass()) {
            if (!cls.isArray()) {
                String strQ2 = yzo1.q(cls.getName());
                return strQ2 == null ? cls.getSimpleName() : strQ2;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (strQ = yzo1.q(componentType.getName())) != null) {
                strConcat = strQ.concat("Array");
            }
            return strConcat == null ? "Array" : strConcat;
        }
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            return ihc1.U0(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            return ihc1.T0(simpleName, '$', simpleName);
        }
        return ihc1.U0(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    public final String toString() {
        return this.a.toString() + " (Kotlin reflection is not available)";
    }
}
