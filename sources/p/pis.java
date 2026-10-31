package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pis implements Producer {
    public final /* synthetic */ qis a;

    public pis(qis qisVar) {
        this.a = qisVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.f);
    }
}
