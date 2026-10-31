package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wkg0 extends g0y implements Iterator, ola0 {
    @Override // java.util.Iterator
    public final Object next() {
        a();
        if (b() >= d().f) {
            hhg1.k();
            return null;
        }
        int iB = b();
        f(iB + 1);
        g(iB);
        Object obj = d().a[c()];
        e();
        return obj;
    }
}
