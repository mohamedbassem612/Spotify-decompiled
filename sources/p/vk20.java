package p;

import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vk20 {
    public static final bma1 e = bma1.b.u("AlignedCuration.userHasCreatedPlaylist");
    public final Scheduler a;
    public final mwm1 b;
    public final Scheduler c;
    public final Single d;

    public vk20(Scheduler scheduler, mwm1 mwm1Var, Scheduler scheduler2, Single single) {
        this.a = scheduler;
        this.b = mwm1Var;
        this.c = scheduler2;
        this.d = single;
    }

    public final Single a() {
        return this.d.map(eh10.c).flatMap(new jl00(this, (byte) 5)).onErrorReturnItem(Boolean.FALSE);
    }
}
