package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.playlistartwork.setpictureimpl.SetPlaylistPictureWorker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t2q implements dl4 {
    public final daq a;

    public void w(Object obj) {
        SetPlaylistPictureWorker setPlaylistPictureWorker = (SetPlaylistPictureWorker) obj;
        daq daqVar = this.a;
        RetrofitMaker retrofitMaker = (RetrofitMaker) daqVar.Y3.get();
        k370 k370Var = new k370();
        k370Var.i("https");
        k370Var.e("image-upload.spotify.com");
        setPlaylistPictureWorker.l = (t080) retrofitMaker.createCustomHostService(t080.class, k370Var.b());
        setPlaylistPictureWorker.j = (iyc0) daqVar.g5.get();
        setPlaylistPictureWorker.m = (zmu0) ((RetrofitMaker) daqVar.Y3.get()).createWebgateService(zmu0.class, "android-playlist-artwork-set-picture-impl");
        setPlaylistPictureWorker.k = (kt91) daqVar.f8.get();
    }
}
