package p;

import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bsc extends onm {
    public long a;
    public l420 b;
    public dko0 c;
    public fpm0 d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ CacheMovingWorkerImpl g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsc(CacheMovingWorkerImpl cacheMovingWorkerImpl, onm onmVar) {
        super(onmVar);
        this.g = cacheMovingWorkerImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.j(0L, null, this);
    }
}
