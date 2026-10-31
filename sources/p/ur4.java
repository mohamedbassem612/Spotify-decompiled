package p;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ur4 implements MediaPlayer.OnCompletionListener {
    public final /* synthetic */ vr4 a;
    public final /* synthetic */ ohd b;

    public ur4(vr4 vr4Var, ohd ohdVar) {
        this.a = vr4Var;
        this.b = ohdVar;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        vr4 vr4Var = this.a;
        vr4Var.b = null;
        this.b.resumeWith(rih1.a);
        vr4Var.b();
    }
}
