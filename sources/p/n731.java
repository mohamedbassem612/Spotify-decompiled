package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.android.AndroidLogger;
import com.spotify.mobius.disposables.Disposable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class n731 {
    public final Connectable a;
    public final bpb1 b;
    public final bpb1 c;
    public final Object d;
    public MobiusLoop e;
    public Disposable f;
    public Set g;

    public n731(b731 b731Var, String str) {
        this.a = b731Var;
        bpb1 bpb1VarB = gio1.b(new o731());
        this.b = bpb1VarB;
        this.c = bpb1VarB;
        this.d = new Object();
        this.g = w7x.a;
    }

    public final void a(m731 m731Var) {
        synchronized (this.d) {
            MobiusLoop mobiusLoop = this.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(m731Var);
            }
        }
    }

    public final void b() {
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

    public final bpb1 c() {
        return this.c;
    }

    public final void d(Set set) {
        synchronized (this.d) {
            this.g = set;
            MobiusLoop mobiusLoop = this.e;
            if (mobiusLoop != null) {
                mobiusLoop.a(new h731(set));
            }
        }
    }

    public final void e() {
        synchronized (this.d) {
            if (this.e != null) {
                return;
            }
            MobiusLoop mobiusLoopG = Mobius.d(rve0.j, this.a).f(new AndroidLogger()).g(new o731());
            this.e = mobiusLoopG;
            this.f = mobiusLoopG.b(new y11(this, (byte) 22));
            if (!this.g.isEmpty()) {
                mobiusLoopG.a(new h731(this.g));
            }
        }
    }
}
