package p;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class jbc0 {
    public static final HashMap a = new HashMap();
    public static final HashMap b = new HashMap();

    public static void a(Constructor constructor, hac0 hac0Var) {
        try {
            Object objNewInstance = constructor.newInstance(hac0Var);
            objNewInstance.getClass();
            kaa0.k(objNewInstance);
            throw null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e2) {
            throw new RuntimeException(e2);
        } catch (InvocationTargetException e3) {
            throw new RuntimeException(e3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f8  */
    public static int b(Class cls) {
        Constructor<?> declaredConstructor;
        HashMap map = a;
        Integer num = (Integer) map.get(cls);
        if (num != null) {
            return num.intValue();
        }
        int i = 1;
        if (cls.getCanonicalName() != null) {
            ArrayList arrayList = null;
            try {
                Package r5 = cls.getPackage();
                String canonicalName = cls.getCanonicalName();
                String name = r5 != null ? r5.getName() : "";
                name.getClass();
                if (name.length() != 0) {
                    canonicalName.getClass();
                    canonicalName = canonicalName.substring(name.length() + 1);
                }
                canonicalName.getClass();
                String strConcat = nhc1.W(canonicalName, ".", "_").concat("_LifecycleAdapter");
                if (name.length() != 0) {
                    strConcat = name + "." + strConcat;
                }
                declaredConstructor = Class.forName(strConcat).getDeclaredConstructor(cls);
                if (!declaredConstructor.isAccessible()) {
                    declaredConstructor.setAccessible(true);
                }
            } catch (ClassNotFoundException unused) {
                declaredConstructor = null;
            } catch (NoSuchMethodException e) {
                eg.j(e);
                return 0;
            }
            HashMap map2 = b;
            if (declaredConstructor != null) {
                map2.put(cls, k4p1.x(declaredConstructor));
            } else if (!teg.c.b(cls)) {
                Class superclass = cls.getSuperclass();
                if (superclass == null || !hac0.class.isAssignableFrom(superclass)) {
                    for (Class<?> cls2 : cls.getInterfaces()) {
                        if (cls2 == null && hac0.class.isAssignableFrom(cls2)) {
                            cls2.getClass();
                            if (b(cls2) != 1) {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                Object obj = map2.get(cls2);
                                obj.getClass();
                                arrayList.addAll((Collection) obj);
                            }
                        }
                    }
                    if (arrayList != null) {
                        map2.put(cls, arrayList);
                    }
                } else {
                    superclass.getClass();
                    if (b(superclass) != 1) {
                        Object obj2 = map2.get(superclass);
                        obj2.getClass();
                        arrayList = new ArrayList((Collection) obj2);
                        while (i < r8) {
                            if (cls2 == null) {
                            }
                        }
                        if (arrayList != null) {
                            map2.put(cls, arrayList);
                        }
                    }
                }
            }
            i = 2;
        }
        map.put(cls, Integer.valueOf(i));
        return i;
    }
}
