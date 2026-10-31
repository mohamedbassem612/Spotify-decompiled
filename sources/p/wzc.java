package p;

import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class wzc extends zzc implements q0c {
    public final Object e;

    public wzc(Field field, Object obj) {
        super(field, false);
        this.e = obj;
    }

    @Override // p.zzc, p.rzc
    public final Object call(Object[] objArr) {
        d(objArr);
        return ((Field) this.a).get(this.e);
    }
}
