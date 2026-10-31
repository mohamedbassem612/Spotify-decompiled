package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xn implements Producer {
    public final /* synthetic */ zn a;

    public xn(zn znVar) {
        this.a = znVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
