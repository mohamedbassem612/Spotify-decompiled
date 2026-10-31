package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.functions.Function;
import com.spotify.mobius.rx3.RxConnectables;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n21 implements Function {
    public final /* synthetic */ o21 a;

    public n21(o21 o21Var) {
        this.a = o21Var;
    }

    @Override // com.spotify.mobius.functions.Function
    public final Object apply(Object obj) {
        o21 o21Var = this.a;
        j21 j21Var = (j21) o21Var.c.get();
        return Mobius.d(new l21(), RxConnectables.a(dzo1.i(j21Var, o21Var.b, xzo1.i(j21Var.a, new af4(o21Var.d), o21Var.e, new feo0(new m21(j21Var.g), j21Var.h))).c()));
    }
}
