package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jrv0 implements Producer {
    public final /* synthetic */ lrv0 a;

    public jrv0(lrv0 lrv0Var) {
        this.a = lrv0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
