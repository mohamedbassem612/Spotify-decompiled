package p;

import android.os.Build;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pc11 extends kuw0 {
    public pc11() {
        super((byte) 18);
    }

    public final Object h(Class cls, Object obj, Method method, Object[] objArr) {
        if (Build.VERSION.SDK_INT >= 26) {
            return no80.y(cls, obj, method, objArr);
        }
        hhg1.h("Calling default methods on API 24 and 25 is not supported");
        return null;
    }

    public final boolean i(Method method) {
        return method.isDefault();
    }
}
