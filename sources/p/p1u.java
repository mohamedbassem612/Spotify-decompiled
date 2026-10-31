package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class p1u extends onm {
    public List a;
    public Iterator b;
    public v0u c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ tjq f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p1u(tjq tjqVar, onm onmVar) {
        super(onmVar);
        this.f = tjqVar;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.n(null, this);
    }
}
