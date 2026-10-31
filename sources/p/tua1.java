package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tua1 implements Producer {
    public final /* synthetic */ vua1 a;

    public tua1(vua1 vua1Var) {
        this.a = vua1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.e);
    }
}
