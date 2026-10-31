package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mlo implements mko {
    public final nsm0 a;
    public final q8n b;
    public final mr20 c;
    public final iu30 d;
    public MobiusLoop g;
    public Disposable h;
    public final Object e = new Object();
    public final bpb1 f = gio1.b(rlo.a);
    public final glo i = new glo(this, (byte) 0);

    public mlo(nsm0 nsm0Var, q8n q8nVar, mr20 mr20Var, iu30 iu30Var) {
        this.a = nsm0Var;
        this.b = q8nVar;
        this.c = mr20Var;
        this.d = iu30Var;
    }

    public final void a(Set set) {
        c(new y450(set));
    }

    public final kko b() {
        return this.i;
    }

    public final void c(l700 l700Var) {
        synchronized (this.e) {
            MobiusLoop mobiusLoop = this.g;
            if (mobiusLoop != null) {
                mobiusLoop.a(l700Var);
            }
        }
    }

    public final void start() {
        synchronized (this.e) {
            MobiusLoop.Builder builderF = Mobius.d(rve0.c, (Connectable) this.a.invoke((Object) null, this.d)).f(new AndroidLogger());
            FlowEventSources.Companion companion = FlowEventSources.a;
            q8n q8nVar = this.b;
            mr20[] mr20VarArr = {new dkm(this.c, (byte) 9)};
            companion.getClass();
            MobiusLoop mobiusLoopG = builderF.h(new b(q8nVar, mr20VarArr)).g(rlo.a);
            this.g = mobiusLoopG;
            this.h = mobiusLoopG.b(new y11(this, (byte) 8));
        }
    }

    public final void stop() {
        MobiusLoop mobiusLoop;
        Disposable disposable;
        synchronized (this.e) {
            mobiusLoop = this.g;
            disposable = this.h;
            this.g = null;
            this.h = null;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
    }
}
