package p;

import com.spotify.collection.offlinesyncnotification.offlinesyncworker.OfflineSyncWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nxp0 extends onm {
    public l811 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ OfflineSyncWorker c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nxp0(OfflineSyncWorker offlineSyncWorker, onm onmVar) {
        super(onmVar);
        this.c = offlineSyncWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= os00.INVALID_ID;
        return this.c.D(this);
    }
}
