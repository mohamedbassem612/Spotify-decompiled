package p;

import com.spotify.androidx.workmanager.SpotifyCoroutineWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class s3b1 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ SpotifyCoroutineWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3b1(SpotifyCoroutineWorker spotifyCoroutineWorker, onm onmVar) {
        super(onmVar);
        this.b = spotifyCoroutineWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.f(this);
    }
}
