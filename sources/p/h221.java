package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class h221 implements Producer {
    public final /* synthetic */ j221 a;

    public h221(j221 j221Var) {
        this.a = j221Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
