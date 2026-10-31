package p;

import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wja1 extends onm {
    public rvt0 a;
    public ConcurrentHashMap b;
    public String c;
    public /* synthetic */ Object d;
    public final /* synthetic */ zja1 e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wja1(zja1 zja1Var, onm onmVar) {
        super(onmVar);
        this.e = zja1Var;
    }

    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.c(null, this);
    }
}
