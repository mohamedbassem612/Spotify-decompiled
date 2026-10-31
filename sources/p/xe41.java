package p;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class xe41 {
    public static final List a = p7h.M(new Class[]{Application.class, fe41.class});
    public static final List b = Collections.singletonList(fe41.class);

    public static final Constructor c(Class cls, List list) {
        for (Constructor<?> constructor : cls.getConstructors()) {
            List listQ0 = f46.Q0(constructor.getParameterTypes());
            if (list.equals(listQ0)) {
                return constructor;
            }
            if (list.size() == listQ0.size() && listQ0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final xbk1 d(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (xbk1) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            bhn0.o(cy30.j(cls, "Failed to access "), e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            bhn0.o(cy30.j(cls, "An exception happened in constructor of "), e3.getCause());
            return null;
        }
    }
}
