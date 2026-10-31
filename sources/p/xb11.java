package p;

import java.lang.reflect.Type;
import java.util.Collection;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xb11 extends zb11 {
    public final Class a;

    public xb11(Class cls) {
        this.a = cls;
    }

    @Override // p.zb11
    public final Type b() {
        return this.a;
    }

    @Override // p.m7a0
    public final Collection getAnnotations() {
        return z6x.a;
    }
}
