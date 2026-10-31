package p;

import android.net.Uri;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fl61 extends onm {
    public String a;
    public Uri b;
    public boolean c;
    public int d;
    public /* synthetic */ Object e;
    public final /* synthetic */ SetPlaylistPictureWorker f;
    public int g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fl61(SetPlaylistPictureWorker setPlaylistPictureWorker, onm onmVar) {
        super(onmVar);
        this.f = setPlaylistPictureWorker;
    }

    public final Object invokeSuspend(Object obj) {
        this.e = obj;
        this.g |= os00.INVALID_ID;
        return this.f.n(null, null, false, this);
    }
}
