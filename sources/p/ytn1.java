package p;

import android.os.Looper;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ytn1 {
    public static final pue0 g = new pue0("SessionTransController", null);
    public final p3e a;
    public final Set b = Collections.synchronizedSet(new HashSet());
    public final jim0 c = new jim0(Looper.getMainLooper(), (byte) 5);
    public final seg1 d = new seg1(this, (byte) 18);
    public boolean e;
    public wf61 f;

    public ytn1(p3e p3eVar) {
        this.a = p3eVar;
    }

    public final void a() {
        this.c.removeCallbacks(this.d);
    }
}
