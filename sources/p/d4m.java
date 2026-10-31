package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d4m implements Producer {
    public final /* synthetic */ f4m a;

    public d4m(f4m f4mVar) {
        this.a = f4mVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.e);
    }
}
