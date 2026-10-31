package p;

import android.media.MediaPlayer;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vr4 implements ejh {
    public MediaPlayer a;
    public ohd b;

    public final Object a(String str, onm onmVar) throws IOException {
        ohd ohdVar = new ohd(1, aym.t(onmVar));
        ohdVar.t();
        this.b = ohdVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.a = mediaPlayer;
        ohdVar.n(new ve3(this, (byte) 9));
        mediaPlayer.setDataSource(str);
        mediaPlayer.setOnPreparedListener(new sr4(mediaPlayer));
        mediaPlayer.setOnErrorListener(new tr4(this, ohdVar));
        mediaPlayer.setOnCompletionListener(new ur4(this, ohdVar));
        mediaPlayer.prepareAsync();
        Object objR = ohdVar.r();
        return objR == d9n.a ? objR : rih1.a;
    }

    public final void b() {
        MediaPlayer mediaPlayer = this.a;
        if (mediaPlayer != null) {
            mediaPlayer.stop();
            mediaPlayer.reset();
            mediaPlayer.release();
        }
        this.a = null;
        ohd ohdVar = this.b;
        if (ohdVar != null) {
            ohdVar.q((Throwable) null);
        }
        this.b = null;
    }
}
