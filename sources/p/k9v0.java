package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class k9v0 implements c9v0, hs80 {
    public final f9v0 a;
    public MobiusLoop b;
    public Disposable c;
    public final idd1 d = new idd1(new z6v0(this, (byte) 2));

    public k9v0(f9v0 f9v0Var) {
        this.a = f9v0Var;
    }

    public final zob1 a() {
        return (zob1) this.d.getValue();
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new vyq0(chm0Var, (byte) 9), r4u.a(new swm0(this, (byte) 27)));
    }

    @Override // p.hs80
    public final void dispose() {
        Disposable disposable = this.c;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final void start() {
        this.b = l1d.g(Mobius.d(rve0.g, this.a)).g(new j9v0());
    }
}
