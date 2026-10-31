package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nf5 implements InvocationHandler {
    public final Class a;
    public final Map b;
    public final idd1 c;
    public final idd1 d;
    public final List e;

    public nf5(Class cls, Map map, idd1 idd1Var, idd1 idd1Var2, List list) {
        this.a = cls;
        this.b = map;
        this.c = idd1Var;
        this.d = idd1Var2;
        this.e = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) throws IllegalAccessException, InvocationTargetException {
        boolean zEquals;
        String name = method.getName();
        Class cls = this.a;
        if (name != null) {
            int iHashCode = name.hashCode();
            if (iHashCode != -1776922004) {
                if (iHashCode != 147696667) {
                    if (iHashCode == 1444986633 && name.equals("annotationType")) {
                        return cls;
                    }
                } else if (name.equals("hashCode")) {
                    return Integer.valueOf(((Number) this.d.getValue()).intValue());
                }
            } else if (name.equals("toString")) {
                return (String) this.c.getValue();
            }
        }
        boolean zJ = u890.j(name, "equals");
        Map map = this.b;
        boolean z = false;
        if (!zJ || objArr == null || objArr.length != 1) {
            if (map.containsKey(name)) {
                return map.get(name);
            }
            StringBuilder sb = new StringBuilder("Method is not supported: ");
            sb.append(method);
            sb.append(" (args: ");
            if (objArr == null) {
                objArr = new Object[0];
            }
            sb.append(f46.Q0(objArr));
            sb.append(')');
            throw new i9n(sb.toString());
        }
        Object objB0 = f46.B0(objArr);
        Annotation annotation = objB0 instanceof Annotation ? (Annotation) objB0 : null;
        if (u890.j(annotation != null ? j2h1.s(annotation).n() : null, cls)) {
            List<Method> list = this.e;
            if ((list instanceof Collection) && list.isEmpty()) {
                z = true;
            } else {
                for (Method method2 : list) {
                    Object obj2 = map.get(method2.getName());
                    Object objInvoke = method2.invoke(objB0, null);
                    if (obj2 instanceof boolean[]) {
                        zEquals = Arrays.equals((boolean[]) obj2, (boolean[]) objInvoke);
                    } else if (obj2 instanceof char[]) {
                        zEquals = Arrays.equals((char[]) obj2, (char[]) objInvoke);
                    } else if (obj2 instanceof byte[]) {
                        zEquals = Arrays.equals((byte[]) obj2, (byte[]) objInvoke);
                    } else if (obj2 instanceof short[]) {
                        zEquals = Arrays.equals((short[]) obj2, (short[]) objInvoke);
                    } else if (obj2 instanceof int[]) {
                        zEquals = Arrays.equals((int[]) obj2, (int[]) objInvoke);
                    } else if (obj2 instanceof float[]) {
                        zEquals = Arrays.equals((float[]) obj2, (float[]) objInvoke);
                    } else if (obj2 instanceof long[]) {
                        zEquals = Arrays.equals((long[]) obj2, (long[]) objInvoke);
                    } else if (obj2 instanceof double[]) {
                        zEquals = Arrays.equals((double[]) obj2, (double[]) objInvoke);
                    } else {
                        zEquals = obj2 instanceof Object[] ? Arrays.equals((Object[]) obj2, (Object[]) objInvoke) : u890.j(obj2, objInvoke);
                    }
                    if (!zEquals) {
                    }
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}
