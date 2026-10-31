package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class grs implements Producer {
    public final /* synthetic */ irs a;

    public grs(irs irsVar) {
        this.a = irsVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
