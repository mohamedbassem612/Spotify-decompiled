package p;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xja1 extends onm {
    public Iterator a;
    public ConcurrentHashMap b;
    public String c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ zja1 f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xja1(zja1 zja1Var, onm onmVar) {
        super(onmVar);
        this.f = zja1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= Integer.MIN_VALUE;
        return this.f.d(null, this);
    }
}
