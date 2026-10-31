package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lau implements Producer {
    public final /* synthetic */ nau a;

    public lau(nau nauVar) {
        this.a = nauVar;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
