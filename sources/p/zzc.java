package p;

import java.lang.reflect.Field;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class zzc extends i0d {
    public zzc(Field field, boolean z) {
        super(field, field.getGenericType(), z ? field.getDeclaringClass() : null, new Type[0]);
    }

    @Override // p.rzc
    public Object call(Object[] objArr) {
        d(objArr);
        return ((Field) this.a).get(this.c != null ? f46.j0(objArr) : null);
    }
}
