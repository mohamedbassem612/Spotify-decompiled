package p;

import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class b7m0 implements MobiusLoop.Logger {
    public final /* synthetic */ MobiusLoop.Logger a;

    public b7m0(MobiusLoop.Logger logger) {
        this.a = logger;
    }

    public final void a(Object obj, Object obj2, Next next) {
        w9m1 w9m1Var = (oam1) obj2;
        if (w9m1Var instanceof w9m1) {
            this.a.a(obj, w9m1Var.a, next);
        }
    }

    public final void b(Object obj, Object obj2, Exception exc) {
        w9m1 w9m1Var = (oam1) obj2;
        if (w9m1Var instanceof w9m1) {
            this.a.b(obj, w9m1Var.a, exc);
        }
    }

    public final void d(Object obj, Object obj2) {
        w9m1 w9m1Var = (oam1) obj2;
        if (w9m1Var instanceof w9m1) {
            this.a.d(obj, w9m1Var.a);
        }
    }

    public final void e(Object obj) {
    }

    public final void c(Object obj, First first) {
    }

    public final void f(Object obj, Exception exc) {
    }
}
