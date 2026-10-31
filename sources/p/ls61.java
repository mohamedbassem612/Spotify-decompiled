package p;

import com.spotify.mobius.MobiusLoop;
import io.reactivex.rxjava3.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ls61 implements Consumer {
    public final /* synthetic */ ms61 a;

    public ls61(ms61 ms61Var) {
        this.a = ms61Var;
    }

    public final void accept(Object obj) {
        ms61 ms61Var = this.a;
        ms61Var.h = (MobiusLoop.Controller) obj;
        ms61Var.i();
    }
}
