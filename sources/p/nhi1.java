package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nhi1 implements Producer {
    public final /* synthetic */ ohi1 a;

    public nhi1(ohi1 ohi1Var) {
        this.a = ohi1Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.a);
    }
}
