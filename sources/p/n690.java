package p;

import java.lang.reflect.Method;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n690 extends p690 implements q0c {
    public final Object d;

    public n690(Method method, Object obj) {
        super(method, z6x.a);
        this.d = obj;
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        d(objArr);
        return this.a.invoke(this.d, Arrays.copyOf(objArr, objArr.length));
    }
}
