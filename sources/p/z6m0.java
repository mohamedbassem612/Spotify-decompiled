package p;

import com.spotify.mobius.Effects;
import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z6m0 implements o5s, qy7 {
    public final yqg a;
    public final yo00 b;
    public final zjx0 c;
    public final g23 d;
    public uz7 e;
    public zhq0 f;
    public MobiusLoop g;

    public z6m0(yqg yqgVar, yo00 yo00Var, zjx0 zjx0Var, g23 g23Var, x8c0 x8c0Var) {
        this.a = yqgVar;
        this.b = yo00Var;
        this.c = zjx0Var;
        this.d = g23Var;
        x8c0Var.a(this);
    }

    @Override // p.o5s
    public final void onDestroy(iac0 iac0Var) {
        this.b.y1();
    }

    @Override // p.o5s
    public final void onStart(iac0 iac0Var) {
        this.f = new zhq0(igu.a.M(1));
        xxb0 xxb0Var = xxb0.x;
        y6m0 y6m0Var = new y6m0(this, (byte) 0);
        y6m0 y6m0Var2 = new y6m0(this, (byte) 1);
        yo00 yo00Var = this.b;
        MobiusLoop.Builder builderD = Mobius.d(xxb0Var, fz7.a(yo00Var, this.c, y6m0Var, y6m0Var2));
        zhq0 zhq0Var = this.f;
        if (zhq0Var == null) {
            u890.C("playCommandHandler");
            throw null;
        }
        MobiusLoop.Builder builderD2 = l1d.g(builderD.h(rz7.a(yo00Var, this.a, zhq0Var.p(), this.d.c()))).b(sa20.P0).d(ta20.P0);
        uz7 uz7Var = this.e;
        if (uz7Var == null) {
            uz7Var = new uz7();
        }
        this.g = builderD2.a(uz7Var, Effects.a(new tto1[0]));
    }

    @Override // p.o5s
    public final void onStop(iac0 iac0Var) {
        MobiusLoop mobiusLoop = this.g;
        if (mobiusLoop == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        this.e = (uz7) mobiusLoop.i;
        zhq0 zhq0Var = this.f;
        if (zhq0Var == null) {
            u890.C("playCommandHandler");
            throw null;
        }
        zhq0Var.f();
        MobiusLoop mobiusLoop2 = this.g;
        if (mobiusLoop2 == null) {
            u890.C("mobiusLoop");
            throw null;
        }
        mobiusLoop2.dispose();
        this.b.M(false);
    }
}
