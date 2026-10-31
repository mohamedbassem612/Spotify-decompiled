package p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e0d extends d0d implements q0c {
    public final Object g;

    public e0d(Method method, Object obj) {
        super(method, false, 4);
        this.g = obj;
    }

    @Override // p.d0d, p.rzc
    public final Object call(Object[] objArr) {
        d(objArr);
        return f(objArr, this.g);
    }
}
