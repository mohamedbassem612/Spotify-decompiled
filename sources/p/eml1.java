package p;

import android.graphics.Typeface;
import android.util.SparseArray;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class eml1 {
    public static final Field a;
    public static final Method b;
    public static final Method c;
    public static final Constructor d;
    public static final q5f0 e;
    public static final Object f;

    static {
        Field declaredField;
        Constructor declaredConstructor;
        Method declaredMethod;
        Method declaredMethod2;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            Class cls = Long.TYPE;
            Class cls2 = Integer.TYPE;
            declaredMethod = Typeface.class.getDeclaredMethod("nativeCreateFromTypeface", cls, cls2);
            declaredMethod.setAccessible(true);
            declaredMethod2 = Typeface.class.getDeclaredMethod("nativeCreateWeightAlias", cls, cls2);
            declaredMethod2.setAccessible(true);
            declaredConstructor = Typeface.class.getDeclaredConstructor(cls);
            declaredConstructor.setAccessible(true);
        } catch (NoSuchFieldException | NoSuchMethodException unused) {
            declaredField = null;
            declaredConstructor = null;
            declaredMethod = null;
            declaredMethod2 = null;
        }
        a = declaredField;
        b = declaredMethod;
        c = declaredMethod2;
        d = declaredConstructor;
        e = new q5f0(3);
        f = new Object();
    }

    public static Typeface a(long j) {
        try {
            return (Typeface) d.newInstance(Long.valueOf(j));
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public static Typeface b(Typeface typeface, int i, boolean z) {
        Typeface typefaceA;
        Field field = a;
        if (field == null) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (f) {
            try {
                try {
                    long j = field.getLong(typeface);
                    q5f0 q5f0Var = e;
                    SparseArray sparseArray = (SparseArray) q5f0Var.b(j);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        q5f0Var.g(j, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i2 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    if (z == typeface.isItalic()) {
                        try {
                            typefaceA = a(((Long) c.invoke(null, Long.valueOf(j), Integer.valueOf(i))).longValue());
                        } catch (IllegalAccessException e2) {
                            throw new RuntimeException(e2);
                        } catch (InvocationTargetException e3) {
                            throw new RuntimeException(e3);
                        }
                    } else {
                        typefaceA = a(c(j, z, i));
                    }
                    sparseArray.put(i2 == true ? 1 : 0, typefaceA);
                    return typefaceA;
                } catch (IllegalAccessException e4) {
                    throw new RuntimeException(e4);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static long c(long j, boolean z, int i) {
        try {
            Long l = (Long) b.invoke(null, Long.valueOf(j), Integer.valueOf(z ? 2 : 0));
            l.longValue();
            return ((Long) c.invoke(null, l, Integer.valueOf(i))).longValue();
        } catch (IllegalAccessException e2) {
            eg.j(e2);
            return 0L;
        } catch (InvocationTargetException e3) {
            eg.j(e3);
            return 0L;
        }
    }
}
