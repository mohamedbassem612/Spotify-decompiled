package p;

import com.spotify.yourlibrary.importsyncnotification.importsyncworker.ImportSyncWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class j480 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ ImportSyncWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j480(ImportSyncWorker importSyncWorker, onm onmVar) {
        super(onmVar);
        this.b = importSyncWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.D(this);
    }
}
