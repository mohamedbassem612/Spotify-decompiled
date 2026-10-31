package p;

import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class dl61 extends onm {
    public /* synthetic */ Object a;
    public final /* synthetic */ SetPlaylistPictureWorker b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dl61(SetPlaylistPictureWorker setPlaylistPictureWorker, onm onmVar) {
        super(onmVar);
        this.b = setPlaylistPictureWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= os00.INVALID_ID;
        return this.b.l(null, null, this);
    }
}
