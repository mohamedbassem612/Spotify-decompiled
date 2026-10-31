package p;

import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zu7 {
    public final int a;
    public final AudioManager.OnAudioFocusChangeListener b;
    public final Handler c;
    public final po7 d;
    public final boolean e;
    public final Object f;

    public zu7(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, po7 po7Var, boolean z, boolean z2) {
        this.a = i;
        this.c = handler;
        this.d = po7Var;
        this.e = z;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            this.b = new yu7(onAudioFocusChangeListener, handler);
        } else {
            this.b = onAudioFocusChangeListener;
        }
        if (i2 >= 26) {
            this.f = wu7.f(i).setAudioAttributes(po7Var.c()).setWillPauseWhenDucked(z).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).setAcceptsDelayedFocusGain(z2).build();
        } else {
            this.f = null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zu7)) {
            return false;
        }
        zu7 zu7Var = (zu7) obj;
        return this.a == zu7Var.a && this.e == zu7Var.e && Objects.equals(this.b, zu7Var.b) && this.c.equals(zu7Var.c) && Objects.equals(this.d, zu7Var.d);
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.a), this.b, this.c, this.d, Boolean.valueOf(this.e));
    }
}
