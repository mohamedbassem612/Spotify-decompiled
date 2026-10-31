package p;

import com.spotify.remoteconfig.backgroundsync.RemoteConfigBackgroundSyncWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hz11 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ RemoteConfigBackgroundSyncWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hz11(RemoteConfigBackgroundSyncWorker remoteConfigBackgroundSyncWorker, onm onmVar) {
        super(onmVar);
        this.b = remoteConfigBackgroundSyncWorker;
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.j(null, this);
    }
}
