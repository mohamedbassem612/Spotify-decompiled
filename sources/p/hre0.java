package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hre0 implements o5s {
    public final /* synthetic */ p811 a;
    public final /* synthetic */ Consumer b;

    public hre0(p811 p811Var, Consumer consumer) {
        this.a = p811Var;
        this.b = consumer;
    }

    public final void onStart(iac0 iac0Var) {
        p811 p811Var = this.a;
        qqe0 qqe0Var = (qqe0) p811Var.a;
        if (qqe0Var != null) {
            p811Var.a = null;
            this.b.accept(qqe0Var);
        }
    }
}
