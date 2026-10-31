package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.coroutines.a;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gjo {
    public final a a;
    public final bpb1 b;
    public final bpb1 c;
    public final Object d;
    public MobiusLoop e;
    public Disposable f;
    public Set g;

    public gjo(a aVar, String str) {
        this.a = aVar;
        bpb1 bpb1VarB = gio1.b(hjo.a);
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.d = new Object();
        this.g = w7x.a;
    }

    public final void a() {
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

    public final void b(Set set) {
        synchronized (this.d) {
            this.g = set;
            MobiusLoop mobiusLoop = this.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(new y450(set));
            }
        }
    }

    public final void c() {
        synchronized (this.d) {
            if (this.e != null) {
                return;
            }
            MobiusLoop mobiusLoopG = Mobius.d(rve0.c, this.a).f(new AndroidLogger()).g(this.b.getValue());
            this.e = mobiusLoopG;
            this.f = mobiusLoopG.b(new y11(this, (byte) 6));
            if (!this.g.isEmpty()) {
                mobiusLoopG.a(new y450(this.g));
            }
        }
    }

    public final void d(Set set) {
        synchronized (this.d) {
            this.g = dm61.y0(this.g, set);
            MobiusLoop mobiusLoop = this.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(new z450(set));
            }
        }
    }
}
