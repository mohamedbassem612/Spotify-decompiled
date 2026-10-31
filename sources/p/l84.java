package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class l84 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new u74(this, (byte) 5));

    public l84(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        l84 l84Var = (l84) this.c.getValue();
        return l84Var != null ? l84Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("log_audio_amplitude", "android-cal-audio-recording", a()));
    }
}
