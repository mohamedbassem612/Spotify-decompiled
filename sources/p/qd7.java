package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qd7 implements Producer {
    public final /* synthetic */ rd7 a;

    public qd7(rd7 rd7Var) {
        this.a = rd7Var;
    }

    public final Object get() {
        return new SchedulerWorkRunner(this.a.c);
    }
}
