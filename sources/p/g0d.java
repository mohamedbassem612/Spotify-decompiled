package p;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g0d extends d0d implements q0c {
    public final boolean g;
    public final Object h;

    /* JADX WARN: Illegal instructions before constructor call */
    public g0d(Method method, boolean z, Object obj) {
        Type[] genericParameterTypes = method.getGenericParameterTypes();
        super(method, false, (Type[]) (genericParameterTypes.length <= 1 ? new Type[0] : f46.a0(1, genericParameterTypes.length, genericParameterTypes)));
        this.g = z;
        this.h = obj;
    }

    @Override // p.d0d, p.rzc
    public final Object call(Object[] objArr) {
        d(objArr);
        c8b1 c8b1Var = new c8b1(2);
        c8b1Var.a(this.h);
        c8b1Var.b(objArr);
        ArrayList arrayList = c8b1Var.a;
        return f(arrayList.toArray(new Object[arrayList.size()]), null);
    }
}
