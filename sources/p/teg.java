package p;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class teg {
    public static final teg c = new teg();
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();

    public static void c(HashMap map, seg segVar, k8c0 k8c0Var, Class cls) {
        k8c0 k8c0Var2 = (k8c0) map.get(segVar);
        if (k8c0Var2 == null || k8c0Var == k8c0Var2) {
            if (k8c0Var2 == null) {
                map.put(segVar, k8c0Var);
            }
        } else {
            String name = segVar.b.getName();
            String name2 = cls.getName();
            hhg1.n(l1d.q(gvg.n("Method ", name, " in ", name2, " already declared with different @OnLifecycleEvent value: previous value "), String.valueOf(k8c0Var2), ", new value ", String.valueOf(k8c0Var)));
        }
    }

    public final reg a(Class cls, Method[] methodArr) {
        int i;
        Class superclass = cls.getSuperclass();
        HashMap map = new HashMap();
        HashMap map2 = this.a;
        if (superclass != null) {
            reg regVarA = (reg) map2.get(superclass);
            if (regVarA == null) {
                regVarA = a(superclass, null);
            }
            map.putAll(regVarA.b);
        }
        for (Class<?> cls2 : cls.getInterfaces()) {
            reg regVarA2 = (reg) map2.get(cls2);
            if (regVarA2 == null) {
                regVarA2 = a(cls2, null);
            }
            for (Map.Entry entry : regVarA2.b.entrySet()) {
                c(map, (seg) entry.getKey(), (k8c0) entry.getValue(), cls);
            }
        }
        if (methodArr == null) {
            try {
                methodArr = cls.getDeclaredMethods();
            } catch (NoClassDefFoundError e) {
                throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
            }
        }
        boolean z = false;
        for (Method method : methodArr) {
            n5q0 n5q0Var = (n5q0) method.getAnnotation(n5q0.class);
            if (n5q0Var != null) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (parameterTypes.length <= 0) {
                    i = 0;
                } else {
                    if (!iac0.class.isAssignableFrom(parameterTypes[0])) {
                        hhg1.n("invalid parameter type. Must be one and instanceof LifecycleOwner");
                        return null;
                    }
                    i = 1;
                }
                k8c0 k8c0VarValue = n5q0Var.value();
                if (parameterTypes.length > 1) {
                    if (!k8c0.class.isAssignableFrom(parameterTypes[1])) {
                        hhg1.n("invalid parameter type. second arg must be an event");
                        return null;
                    }
                    if (k8c0VarValue != k8c0.ON_ANY) {
                        hhg1.n("Second arg is supported only for ON_ANY value");
                        return null;
                    }
                    i = 2;
                }
                if (parameterTypes.length > 2) {
                    hhg1.n("cannot have more than 2 params");
                    return null;
                }
                c(map, new seg(method, i), k8c0VarValue, cls);
                z = true;
            }
        }
        reg regVar = new reg(map);
        map2.put(cls, regVar);
        this.b.put(cls, Boolean.valueOf(z));
        return regVar;
    }

    public final boolean b(Class cls) {
        HashMap map = this.b;
        Boolean bool = (Boolean) map.get(cls);
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            Method[] declaredMethods = cls.getDeclaredMethods();
            for (Method method : declaredMethods) {
                if (((n5q0) method.getAnnotation(n5q0.class)) != null) {
                    a(cls, declaredMethods);
                    return true;
                }
            }
            map.put(cls, Boolean.FALSE);
            return false;
        } catch (NoClassDefFoundError e) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", e);
        }
    }
}
