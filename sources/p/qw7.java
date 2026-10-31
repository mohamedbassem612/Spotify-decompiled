package p;

import android.media.AudioManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qw7 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;

    public qw7(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.a = i;
        this.b = onAudioFocusChangeListener;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qw7)) {
            return false;
        }
        qw7 qw7Var = (qw7) obj;
        return this.a == qw7Var.a && u890.j(this.b, qw7Var.b);
    }

    public final int hashCode() {
        int iC = l1d.C(this.a) * 31;
        AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = this.b;
        return iC + (onAudioFocusChangeListener == null ? 0 : onAudioFocusChangeListener.hashCode());
    }
}
