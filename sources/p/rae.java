package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rae implements hs80 {
    public final pae a;
    public MobiusLoop b;
    public Disposable c;
    public final idd1 d = new idd1(new ptb(this, (byte) 21));

    public rae(pae paeVar) {
        this.a = paeVar;
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new dg8(chm0Var, (byte) 17), r4u.a(new lo9(this, (byte) 14)));
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
        this.b = l1d.g(Mobius.d(rve0.b, new ed2((byte) 8)).h(this.a)).g(new qae());
    }
}
