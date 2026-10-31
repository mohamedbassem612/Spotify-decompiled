package p;

import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class o690 extends p690 {
    public o690(Method method) {
        super(method, Collections.singletonList(method.getDeclaringClass()));
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        d(objArr);
        Object obj = objArr[0];
        Object[] objArrA0 = objArr.length <= 1 ? new Object[0] : f46.a0(1, objArr.length, objArr);
        return this.a.invoke(obj, Arrays.copyOf(objArrA0, objArrA0.length));
    }
}
