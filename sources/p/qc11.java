package p;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qc11 extends kuw0 {
    public final String f(Method method, int i) {
        Parameter parameter = method.getParameters()[i];
        if (!parameter.isNamePresent()) {
            return super.f(method, i);
        }
        return "parameter '" + parameter.getName() + '\'';
    }

    public final Object h(Class cls, Object obj, Method method, Object[] objArr) {
        return no80.y(cls, obj, method, objArr);
    }

    public final boolean i(Method method) {
        return method.isDefault();
    }
}
