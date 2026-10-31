package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fl91 implements Producer {
    public final /* synthetic */ il91 a;

    public fl91(il91 il91Var) {
        this.a = il91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.a.e);
    }
}
