package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class klk1 implements Producer {
    public final /* synthetic */ qlk1 a;

    public klk1(qlk1 qlk1Var) {
        this.a = qlk1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.b);
    }
}
