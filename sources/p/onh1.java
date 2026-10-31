package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class onh1 implements wpw {
    public static final Set i = f46.S0(new zp21[]{new zp21(jo70.class), new zp21(xkk1.class), new zp21(zoy0.class), new zp21(iam.class)});
    public static final yp21 t = new yp21(zd3.class);
    public final lzn0 a;
    public final yfx b;
    public final Context c;
    public final abm d;
    public final epb1 e;
    public final ia00 f = n3o1.q(this).a(swg1.X0, swg1.Y0);
    public final poy0 g = c2p1.o(new nnh1(this, (byte) 0), new lda1(2, this, onh1.class, "stateMapper", "stateMapper(Lcom/spotify/creator/elements/upcomingrelease/UpcomingReleaseElement$Props;Lcom/spotify/listcontentruntime/metadataapi/MetadataValues;)Lcom/spotify/creator/elements/upcomingrelease/UpcomingReleaseElement$State;", 0, (byte) 7), new nnh1(this, (byte) 1), 4);
    public final kjv h = lnn1.h(new nnh1(this, (byte) 2), qmh1.R0, new nnh1(this, (byte) 3));

    public onh1(lzn0 lzn0Var, yfx yfxVar, Context context, abm abmVar, epb1 epb1Var) {
        this.a = lzn0Var;
        this.b = yfxVar;
        this.c = context;
        this.d = abmVar;
        this.e = epb1Var;
    }

    public static ez00 e(hoj0 hoj0Var) {
        if (hoj0Var == null) {
            hhg1.n("Required value was null.");
            return null;
        }
        goj0 goj0VarA = hoj0Var.a();
        goj0VarA.getClass();
        return (ez00) goj0VarA.a;
    }

    public final rqw a() {
        return this.f;
    }

    public final rsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
