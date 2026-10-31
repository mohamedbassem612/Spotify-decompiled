package p;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class bb11 {
    public static final List a;
    public static final Map b;
    public static final Map c;
    public static final Map d;

    static {
        jd11 jd11Var = rc11.a;
        int i = 0;
        List listM = p7h.M(jd11Var.b(Boolean.TYPE), jd11Var.b(Byte.TYPE), jd11Var.b(Character.TYPE), jd11Var.b(Double.TYPE), jd11Var.b(Float.TYPE), jd11Var.b(Integer.TYPE), jd11Var.b(Long.TYPE), jd11Var.b(Short.TYPE));
        a = listM;
        List<tka0> list = listM;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (tka0 tka0Var : list) {
            arrayList.add(oqn1.n(j2h1.t(tka0Var), j2h1.u(tka0Var)));
        }
        b = sqg0.T(arrayList);
        List<tka0> list2 = a;
        ArrayList arrayList2 = new ArrayList(q7h.U(list2, 10));
        for (tka0 tka0Var2 : list2) {
            arrayList2.add(oqn1.n(j2h1.u(tka0Var2), j2h1.t(tka0Var2)));
        }
        c = sqg0.T(arrayList2);
        List listM2 = p7h.M(Function0.class, iu30.class, vu30.class, xu30.class, zu30.class, bv30.class, dv30.class, ev30.class, fv30.class, gv30.class, hu30.class, ju30.class, ku30.class, lu30.class, mu30.class, nu30.class, ou30.class, pu30.class, qu30.class, ru30.class, tu30.class, uu30.class, bw30.class);
        ArrayList arrayList3 = new ArrayList(q7h.U(listM2, 10));
        for (Object obj : listM2) {
            int i2 = i + 1;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            arrayList3.add(oqn1.n((Class) obj, Integer.valueOf(i)));
            i = i2;
        }
        d = sqg0.T(arrayList3);
    }

    public static final heg a(Class cls) {
        if (cls.isPrimitive()) {
            hhg1.n(cy30.j(cls, "Can't compute ClassId for primitive type: "));
            return null;
        }
        if (cls.isArray()) {
            hhg1.n(cy30.j(cls, "Can't compute ClassId for array type: "));
            return null;
        }
        if (cls.getEnclosingMethod() == null && cls.getEnclosingConstructor() == null && cls.getSimpleName().length() != 0) {
            Class<?> declaringClass = cls.getDeclaringClass();
            return declaringClass != null ? a(declaringClass).d(ajn0.e(cls.getSimpleName())) : mka.n(new kf30(cls.getName()));
        }
        kf30 kf30Var = new kf30(cls.getName());
        return new heg(kf30Var.b(), lap1.s(kf30Var.a.g()), true);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final String b(Class cls) {
        if (!cls.isPrimitive()) {
            if (cls.isArray()) {
                return cls.getName().replace('.', '/');
            }
            return "L" + cls.getName().replace('.', '/') + ';';
        }
        String name = cls.getName();
        switch (name.hashCode()) {
            case -1325958191:
                if (name.equals("double")) {
                    return "D";
                }
                break;
            case 104431:
                if (name.equals("int")) {
                    return "I";
                }
                break;
            case 3039496:
                if (name.equals("byte")) {
                    return "B";
                }
                break;
            case 3052374:
                if (name.equals("char")) {
                    return "C";
                }
                break;
            case 3327612:
                if (name.equals("long")) {
                    return "J";
                }
                break;
            case 3625364:
                if (name.equals("void")) {
                    return "V";
                }
                break;
            case 64711720:
                if (name.equals("boolean")) {
                    return "Z";
                }
                break;
            case 97526364:
                if (name.equals("float")) {
                    return "F";
                }
                break;
            case 109413500:
                if (name.equals("short")) {
                    return "S";
                }
                break;
        }
        hhg1.n(cy30.j(cls, "Unsupported primitive type: "));
        return null;
    }

    public static final List c(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return z6x.a;
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        if (parameterizedType.getOwnerType() == null) {
            return f46.Q0(parameterizedType.getActualTypeArguments());
        }
        return z561.k0(z561.X(zqb0.U0, z561.c0(zqb0.T0, type)));
    }

    public static final ClassLoader d(Class cls) {
        ClassLoader classLoader = cls.getClassLoader();
        return classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
