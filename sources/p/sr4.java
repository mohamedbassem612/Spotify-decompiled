package p;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sr4 implements MediaPlayer.OnPreparedListener {
    public final /* synthetic */ MediaPlayer a;

    public sr4(MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        this.a.start();
    }
}
