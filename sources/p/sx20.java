package p;

import android.os.Handler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sx20 implements lw7 {
    public final jnh0 a;
    public final ux20 b;

    public sx20(jnh0 jnh0Var, ux20 ux20Var) {
        this.a = jnh0Var;
        this.b = ux20Var;
    }

    public final void onAudioFocusChange(int i) {
        Handler handler = this.a.b;
        if (handler != null) {
            handler.post(new ukd(this, i, (byte) 2));
        }
    }
}
