package p;

import android.os.Build;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jxy0 {
    public static final Set b = Collections.singleton(hxy0.MESSAGING_NOTIFICATION_OPT_IN_NUDGE);
    public final kqi0 a;

    public jxy0(kqi0 kqi0Var) {
        this.a = kqi0Var;
    }

    public final int a(hxy0 hxy0Var) {
        kxy0 kxy0VarM = this.a.m();
        if (Build.VERSION.SDK_INT >= 33) {
            f46.S0(new kxy0[]{kxy0.NOT_ASKED, kxy0.DENIED_ONCE}).contains(kxy0VarM);
        }
        return b.contains(hxy0Var) ? 3 : 2;
    }
}
