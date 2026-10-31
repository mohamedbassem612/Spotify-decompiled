package p;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class fml1 {
    public static final Field a;
    public static final Method b;
    public static final Constructor c;
    public static final q5f0 d;
    public static final Object e;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypefaceWithExactStyle", cls, Integer.TYPE, Boolean.TYPE);
            declaredMethod.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
        }
        a = declaredField;
        b = declaredMethod;
        c = declaredConstructor;
        d = new q5f0(3);
        e = new Object();
    }

    public static Typeface a(Typeface typeface, int i, boolean z) {
        Field field = a;
        Typeface typeface2 = null;
        if (field == null) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (e) {
            try {
                try {
                    long j = field.getLong(typeface);
                    q5f0 q5f0Var = d;
                    SparseArray sparseArray = (SparseArray) q5f0Var.b(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        q5f0Var.g(j, sparseArray);
                    } else {
                        Typeface typeface3 = (Typeface) sparseArray.get(i2 == true ? 1 : 0);
                        if (typeface3 != null) {
                            return typeface3;
                        }
                    }
                    try {
                        try {
                            Long l = (Long) b.invoke(null, Long.valueOf(j), Integer.valueOf(i), Boolean.valueOf(z));
                            l.longValue();
                            try {
                                typeface2 = (Typeface) c.newInstance(l);
                            } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
                            }
                            sparseArray.put(i2 == true ? 1 : 0, typeface2);
                            return typeface2;
                        } catch (InvocationTargetException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (IllegalAccessException e3) {
                        throw new RuntimeException(e3);
                    }
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
