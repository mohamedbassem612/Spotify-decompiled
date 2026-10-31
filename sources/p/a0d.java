package p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class a0d extends d0d implements q0c {
    public final Object g;

    public a0d(Field field, boolean z, Object obj) {
        super(field, z, false);
        this.g = obj;
    }

    @Override // p.d0d, p.rzc
    public final Object call(Object[] objArr) throws IllegalAccessException {
        d(objArr);
        ((Field) this.a).set(this.g, f46.j0(objArr));
        return rih1.a;
    }
}
