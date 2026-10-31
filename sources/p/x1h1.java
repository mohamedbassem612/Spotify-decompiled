package p;

import android.content.Context;
import android.graphics.Typeface;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x1h1 extends w1h1 {
    @Override // p.w1h1
    public final Method B1(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, String.class, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    @Override // p.w1h1, p.t1h1, p.k9
    public final Typeface I0(Context context, Typeface typeface, int i, boolean z) {
        return Typeface.create(typeface, i, z);
    }

    @Override // p.w1h1
    public final Typeface y1(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.h, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.N0.invoke(null, objNewInstance, "sans-serif", -1, -1);
        } catch (IllegalAccessException | InvocationTargetException e) {
            eg.j(e);
            return null;
        }
    }
}
