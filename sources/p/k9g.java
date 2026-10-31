package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k9g implements Producer {
    public final /* synthetic */ n9g a;

    public k9g(n9g n9gVar) {
        this.a = n9gVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
