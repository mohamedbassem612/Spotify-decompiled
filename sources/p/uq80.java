package p;

import com.spotify.home.evopage.mobius.Event;
import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.First;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.Next;
import com.spotify.mobius.android.AndroidLogger;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class uq80 implements MobiusLoop.Logger {
    public final tp60 a;
    public final AndroidLogger b;

    public uq80(tp60 tp60Var, AndroidLogger androidLogger, iac0 iac0Var) {
        this.a = tp60Var;
        this.b = androidLogger;
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void a(Object obj, Object obj2, Next next) {
        kq60 kq60Var;
        Event event = (Event) obj2;
        this.b.a((State) obj, event, next);
        if (event instanceof dzz) {
            kq60Var = kq60.P0;
        } else {
            kq60Var = event instanceof Event.ConsumptionStateChanged ? kq60.Q0 : null;
        }
        if (kq60Var != null) {
            this.a.p(kq60Var);
        }
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void b(Object obj, Object obj2, Exception exc) {
        this.b.b((State) obj, (Event) obj2, exc);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void c(Object obj, First first) {
        this.b.c((State) obj, first);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void d(Object obj, Object obj2) {
        kq60 kq60Var;
        Event event = (Event) obj2;
        if (event instanceof dzz) {
            kq60Var = kq60.P0;
        } else {
            kq60Var = event instanceof Event.ConsumptionStateChanged ? kq60.Q0 : null;
        }
        if (kq60Var != null) {
            this.a.g(kq60Var);
        }
        Objects.toString(event);
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void e(Object obj) {
    }

    @Override // com.spotify.mobius.MobiusLoop.Logger
    public final void f(Object obj, Exception exc) {
        Objects.toString((State) obj);
    }
}
