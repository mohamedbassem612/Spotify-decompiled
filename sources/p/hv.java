package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hv implements Producer {
    public final /* synthetic */ jv a;

    public hv(jv jvVar) {
        this.a = jvVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.e);
    }
}
