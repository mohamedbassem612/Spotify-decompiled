package p;

import android.media.AudioManager;
import java.util.function.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sw7 implements Function {
    public final /* synthetic */ uw7 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ AudioManager.OnAudioFocusChangeListener c;

    public sw7(uw7 uw7Var, int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        this.a = uw7Var;
        this.b = i;
        this.c = onAudioFocusChangeListener;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        return new rw7(this.a, this.b, this.c);
    }
}
