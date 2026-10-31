package p;

import java.util.Map;
import java.util.function.Predicate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wcs0 implements Predicate {
    public final /* synthetic */ xcs0 a;

    public wcs0(xcs0 xcs0Var) {
        this.a = xcs0Var;
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        return this.a.b.b() - ((p3i1) ((Map.Entry) obj).getValue()).a() > 86400000;
    }
}
