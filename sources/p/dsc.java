package p;

import com.spotify.storage.localstorage.CacheMovingWorkerImpl;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dsc extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ CacheMovingWorkerImpl b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dsc(CacheMovingWorkerImpl cacheMovingWorkerImpl, onm onmVar) {
        super(onmVar);
        this.b = cacheMovingWorkerImpl;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.i(this);
    }
}
