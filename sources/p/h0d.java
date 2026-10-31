package p;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h0d extends d0d {
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h0d(Method method, byte b) {
        super(method, false, 6);
        this.g = b;
    }

    @Override // p.d0d, p.rzc
    public final Object call(Object[] objArr) {
        switch (this.g) {
            case 0:
                d(objArr);
                return f(objArr.length <= 1 ? new Object[0] : f46.a0(1, objArr.length, objArr), objArr[0]);
            case 1:
                d(objArr);
                e(f46.k0(objArr));
                return f(objArr.length <= 1 ? new Object[0] : f46.a0(1, objArr.length, objArr), null);
            default:
                d(objArr);
                return f(objArr, null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0d(Method method) {
        super(method, true, 4);
        this.g = (byte) 1;
    }
}
