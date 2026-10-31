package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class a450 implements z350 {
    public static final bma1 g = bma1.b.u("google_partner_id");
    public final g3s0 a;
    public final ut71 b;
    public final Observable c;
    public final Scheduler d;
    public final Scheduler e;
    public final Context f;

    public a450(g3s0 g3s0Var, ut71 ut71Var, Observable observable, Scheduler scheduler, Scheduler scheduler2, Context context) {
        this.a = g3s0Var;
        this.b = ut71Var;
        this.c = observable;
        this.d = scheduler;
        this.e = scheduler2;
        this.f = context;
    }

    public final Single a() {
        return this.c.map(new lmw(this, (byte) 20)).firstOrError().flatMap(new mev(this, (byte) 23));
    }
}
