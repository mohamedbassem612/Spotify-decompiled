package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a5a1 implements Producer {
    public final /* synthetic */ b5a1 a;

    public a5a1(b5a1 b5a1Var) {
        this.a = b5a1Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.a.m);
    }
}
