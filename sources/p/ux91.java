package p;

import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.rx3.SchedulerWorkRunner;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ux91 implements Producer {
    public final /* synthetic */ xx91 a;

    public ux91(xx91 xx91Var) {
        this.a = xx91Var;
    }

    @Override // com.spotify.mobius.functions.Producer
    public final Object get() {
        return new SchedulerWorkRunner(this.a.h);
    }
}
