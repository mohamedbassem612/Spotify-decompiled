package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class wl4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new gk4(this, (byte) 17));

    public wl4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        wl4 wl4Var = (wl4) this.c.getValue();
        return wl4Var != null ? wl4Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("enable_bluetooth_voice_input", "android-libs-audio-record-impl", a()));
    }
}
