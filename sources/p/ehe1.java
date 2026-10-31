package p;

import java.lang.reflect.Member;
import java.lang.reflect.Type;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ehe1 implements rzc {
    public static final ehe1 a = new ehe1();

    @Override // p.rzc
    public final List a() {
        return z6x.a;
    }

    @Override // p.rzc
    public final Member b() {
        return null;
    }

    @Override // p.rzc
    public final boolean c() {
        return false;
    }

    @Override // p.rzc
    public final Object call(Object[] objArr) {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }

    @Override // p.rzc
    public final Type getReturnType() {
        throw new UnsupportedOperationException("call/callBy are not supported for this declaration.");
    }
}
