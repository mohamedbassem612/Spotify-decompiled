package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class p0w implements Producer {
    public final /* synthetic */ q0w a;

    public p0w(q0w q0wVar) {
        this.a = q0wVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
