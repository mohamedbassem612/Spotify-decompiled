package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pph implements Producer {
    public final /* synthetic */ qph a;

    public pph(qph qphVar) {
        this.a = qphVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
