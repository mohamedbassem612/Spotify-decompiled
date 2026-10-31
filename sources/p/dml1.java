package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.SparseArray;
import androidx.car.app.model.Alert;
import java.lang.reflect.Field;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class dml1 {
    public static final Field a;
    public static final q5f0 b;
    public static final Object c;

    static {
        Field declaredField;
        try {
            declaredField = Typeface.class.getDeclaredField("native_instance");
            declaredField.setAccessible(true);
        } catch (Exception unused) {
            declaredField = null;
        }
        a = declaredField;
        b = new q5f0(3);
        c = new Object();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Typeface a(k9 k9Var, Context context, Typeface typeface, int i, boolean z) {
        Field field = a;
        if (field == null) {
            return null;
        }
        int i2 = (i << 1) | (z ? 1 : 0);
        synchronized (c) {
            try {
                try {
                    long jLongValue = ((Number) field.get(typeface)).longValue();
                    q5f0 q5f0Var = b;
                    SparseArray sparseArray = (SparseArray) q5f0Var.b(jLongValue);
                    if (sparseArray == null) {
                        sparseArray = new SparseArray(4);
                        q5f0Var.g(jLongValue, sparseArray);
                    } else {
                        Typeface typeface2 = (Typeface) sparseArray.get(i2 == true ? 1 : 0);
                        if (typeface2 != null) {
                            return typeface2;
                        }
                    }
                    Typeface typefaceB = b(k9Var, context, typeface, i, z);
                    if (typefaceB == null) {
                        int i3 = 1;
                        Object[] objArr = i >= 600;
                        if (objArr != true && !z) {
                            i3 = 0;
                        } else if (objArr != true) {
                            i3 = 2;
                        } else if (z) {
                            i3 = 3;
                        }
                        typefaceB = Typeface.create(typeface, i3);
                    }
                    sparseArray.put(i2 == true ? 1 : 0, typefaceB);
                    return typefaceB;
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static Typeface b(k9 k9Var, Context context, Typeface typeface, int i, boolean z) {
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) k9Var.b;
        long jB1 = k9.b1(typeface);
        w930 w930Var = jB1 == 0 ? null : (w930) concurrentHashMap.get(Long.valueOf(jB1));
        if (w930Var != null) {
            Resources resources = context.getResources();
            x930[] x930VarArr = w930Var.a;
            int i2 = Alert.DURATION_SHOW_INDEFINITELY;
            x930 x930Var = null;
            for (x930 x930Var2 : x930VarArr) {
                int iAbs = (Math.abs(x930Var2.b - i) * 2) + (x930Var2.c == z ? 0 : 1);
                if (x930Var == null || i2 > iAbs) {
                    x930Var = x930Var2;
                    i2 = iAbs;
                }
            }
            if (x930Var != null) {
                int i3 = x930Var.f;
                String str = x930Var.a;
                Typeface typefaceG0 = s1h1.a.G0(context, resources, i3, str, 0);
                if (typefaceG0 != null) {
                    s1h1.b.d(s1h1.b(resources, i3, str, 0, 0), typefaceG0);
                }
                long jB2 = k9.b1(typefaceG0);
                if (jB2 != 0) {
                    concurrentHashMap.put(Long.valueOf(jB2), w930Var);
                }
                return typefaceG0;
            }
        }
        return null;
    }
}
