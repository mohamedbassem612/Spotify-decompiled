package p;

import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z281 {
    public final h481 a;
    public final x3v0 b;
    public final re4 c;
    public final idd1 d = new idd1(da71.Y0);
    public final t3v0 e = new t3v0((Map) null, sqg0.H(new mmr0[]{new mmr0("link", Boolean.TRUE)}), (Map) null, (List) null, (List) null, 239);

    public z281(h481 h481Var, x3v0 x3v0Var, re4 re4Var) {
        this.a = h481Var;
        this.b = x3v0Var;
        this.c = re4Var;
    }

    public final Single a(String str) {
        Single singleFlatMap;
        boolean zA = this.c.a();
        b7x b7xVar = b7x.a;
        if (!zA) {
            return Single.just(b7xVar);
        }
        Set set = s4b1.f;
        int iOrdinal = uic.x(str).c.ordinal();
        if (iOrdinal == 844) {
            singleFlatMap = this.b.a(Collections.singletonList(str), this.e).flatMap(new dc31(str, this, (byte) 29));
        } else if (iOrdinal != 860) {
            singleFlatMap = Single.just(b7xVar);
        } else {
            singleFlatMap = this.a.a(uic.x(str).h(), (e481) this.d.getValue()).map(r5x0.Y);
        }
        return singleFlatMap.onErrorReturnItem(b7xVar);
    }
}
