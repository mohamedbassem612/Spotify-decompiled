package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class mhz implements MobiusLoop.Logger {
    public final void b(Object obj, Object obj2, Exception exc) {
        n57.g("Exception during update, " + obj2 + ", " + obj, exc);
    }

    public final void f(Object obj, Exception exc) {
        n57.g("Exception during init, " + obj, exc);
    }

    public final void e(Object obj) {
    }

    public void c(Object obj, First first) {
    }

    public final void d(Object obj, Object obj2) {
    }

    public void a(Object obj, Object obj2, Next next) {
    }
}
