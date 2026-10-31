package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jt11 implements wpw {
    public static final Set t = f46.S0(new aq21[]{new zp21(jo70.class), new zp21(xkk1.class), new yp21(zoy0.class)});
    public final lzn0 a;
    public final yfx b;
    public final Context c;
    public final o241 d;
    public final f54 e;
    public final epb1 f;
    public final ia00 g = n3o1.q(this).a(ok11.R0, ok11.S0);
    public final poy0 h = c2p1.o(new it11(this, (byte) 0), new nsm0(2, this, jt11.class, "stateMapper", "stateMapper(Lcom/spotify/creator/releasespage/element/releaserow/ReleaseRowElement$Props;Lcom/spotify/creator/releasespage/element/releaserow/ReleaseRowElement$ExternalState;)Lcom/spotify/creator/releasespage/element/releaserow/ReleaseRowElement$State;", 0, (byte) 18), new it11(this, (byte) 1), 4);
    public final kjv i = lnn1.h(ss11.S0, ss11.T0, new it11(this, (byte) 2));

    public jt11(lzn0 lzn0Var, yfx yfxVar, Context context, o241 o241Var, f54 f54Var, epb1 epb1Var) {
        this.a = lzn0Var;
        this.b = yfxVar;
        this.c = context;
        this.d = o241Var;
        this.e = f54Var;
        this.f = epb1Var;
    }

    public final rqw a() {
        return this.g;
    }

    public final rsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
