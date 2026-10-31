package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.FlowEventSources;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.coroutines.b;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class b93 implements mko {
    public final a a;
    public final q8n b;
    public MobiusLoop e;
    public Disposable f;
    public final bpb1 c = gio1.b(c93.a);
    public final Object d = new Object();
    public final z83 g = new z83(this);

    public b93(a aVar, q8n q8nVar) {
        this.a = aVar;
        this.b = q8nVar;
    }

    public static final void d(b93 b93Var, l700 l700Var) {
        synchronized (b93Var.d) {
            MobiusLoop mobiusLoop = b93Var.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(l700Var);
            }
        }
    }

    public final void a(Set set) {
        y450 y450Var = new y450(set);
        synchronized (this.d) {
            MobiusLoop mobiusLoop = this.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(y450Var);
            }
        }
    }

    public final kko b() {
        return this.g;
    }

    public final void start() {
        synchronized (this.d) {
            MobiusLoop.Builder builderF = Mobius.d(rve0.c, this.a).f(new AndroidLogger());
            FlowEventSources.Companion companion = FlowEventSources.a;
            q8n q8nVar = this.b;
            mr20[] mr20VarArr = {new a93()};
            companion.getClass();
            MobiusLoop mobiusLoopG = builderF.h(new b(q8nVar, mr20VarArr)).g(c93.a);
            this.e = mobiusLoopG;
            this.f = mobiusLoopG.b(new y11(this, (byte) 2));
        }
    }

    public final void stop() {
        MobiusLoop mobiusLoop;
        Disposable disposable;
        synchronized (this.d) {
            mobiusLoop = this.e;
            disposable = this.f;
            this.e = null;
            this.f = null;
        }
        if (disposable != null) {
            disposable.dispose();
        }
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
    }
}
