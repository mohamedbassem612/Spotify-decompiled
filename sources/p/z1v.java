package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class z1v implements hs80, wxu {
    public final j2v a;
    public MobiusLoop b;
    public Disposable c;
    public final idd1 d = new idd1(new d4e(this, (byte) 22));

    public z1v(j2v j2vVar) {
        this.a = j2vVar;
    }

    public final void a(String str, String str2) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new fwu(str, str2));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    public final void b(String str, String str2) {
        MobiusLoop mobiusLoop = this.b;
        if (mobiusLoop != null) {
            mobiusLoop.a(new dwu(str, str2));
        } else {
            u890.C("loop");
            throw null;
        }
    }

    @Override // p.hs80
    public final r4u d(chm0 chm0Var) {
        return r4u.d(new xap(chm0Var, (byte) 22), r4u.a(new h9n(this, (byte) 26)));
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

    public final zob1 getStatus() {
        return (zob1) this.d.getValue();
    }

    @Override // p.hs80
    public final void start() {
        this.b = l1d.g(Mobius.d(rve0.e, this.a)).g(new k2v());
    }
}
