package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j280 extends h380 {
    public j280() {
        super(4);
    }

    public final j380 a() {
        throw null;
    }

    public final j380 c() {
        throw new UnsupportedOperationException("Not supported for bimaps");
    }

    public final h380 e(Object obj, Object obj2) {
        super.e(obj, obj2);
        return this;
    }

    public final h380 f(Iterable iterable) {
        super.f(iterable);
        return this;
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final ag11 d() {
        if (((h380) this).b == 0) {
            return ag11.i;
        }
        return new ag11(((h380) this).b, ((h380) this).a);
    }

    public final void h(Object obj, Object obj2) {
        super.e(obj, obj2);
    }

    public final void i(Set set) {
        super.f(set);
    }
}
