package p;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class lge0 {
    public static final xky0 a;

    static {
        xky0 m231Var;
        try {
            ClassLoader classLoader = qe41.class.getClassLoader();
            classLoader.getClass();
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalSavedStateRegistryOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof xky0) {
                        m231Var = (xky0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i] instanceof adt)) {
                    i++;
                }
                m231Var = null;
                break;
            }
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        xky0 xky0VarT = m231Var instanceof m231 ? null : m231Var;
        if (xky0VarT == null) {
            xky0VarT = mod.t(new n4k((byte) 16));
        }
        a = xky0VarT;
    }
}
