package p;

import android.content.Context;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class v1o0 {
    public static final bma1 g;
    public static final bma1 h;
    public final Flowable a;
    public final Scheduler b;
    public final Scheduler c;
    public final ut71 d;
    public final yqg e;
    public final Context f;

    static {
        nbc nbcVar = bma1.b;
        g = nbcVar.u("bluetooth_permission_flow_last_prompt_timestamp");
        h = nbcVar.u("bluetooth_permission_flow_prompt_count_v2");
    }

    public v1o0(Flowable flowable, Scheduler scheduler, Scheduler scheduler2, ut71 ut71Var, yqg yqgVar, Context context) {
        this.a = flowable;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = ut71Var;
        this.e = yqgVar;
        this.f = context;
    }

    public final Single a() {
        return this.a.x(ud20.Q0).J(rh20.Q0).J(new e5l0(this, (byte) 5)).z().subscribeOn(this.b).observeOn(this.c);
    }
}
