package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bbx0 implements Producer {
    public final /* synthetic */ cbx0 a;

    public bbx0(cbx0 cbx0Var) {
        this.a = cbx0Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
