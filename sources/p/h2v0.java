package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class h2v0 implements b2v0, hs80 {
    public final ku1 a;
    public final ku1 b;
    public MobiusLoop c;
    public Disposable d;
    public final idd1 e = new idd1(new kks0(this, (byte) 27));

    public h2v0(ku1 ku1Var, ku1 ku1Var2) {
        this.a = ku1Var;
        this.b = ku1Var2;
    }

    public final zob1 a() {
        return (zob1) this.e.getValue();
    }

    @Override // p.hs80
    public final void dispose() {
        Disposable disposable = this.d;
        if (disposable != null) {
            disposable.dispose();
        }
        MobiusLoop mobiusLoop = this.c;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public final void e() {
        MobiusLoop mobiusLoop = this.c;
        if (mobiusLoop != null) {
            mobiusLoop.a(d2v0.a);
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final void start() {
        this.c = l1d.g(Mobius.d(rve0.f, this.b).i(this.a)).g(new g2v0(false));
    }
}
