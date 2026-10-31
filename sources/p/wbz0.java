package p;

import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.nowplayingqueue.bottomsheet.view.QueueInteractionLayout;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wbz0 implements h8l {
    public final QueueInteractionLayout a;
    public final ccz0 b;
    public final Function0 c;
    public final Function0 d;
    public n1b0 e;

    public wbz0(QueueInteractionLayout queueInteractionLayout, ccz0 ccz0Var, Function0 function0, Function0 function1) {
        this.a = queueInteractionLayout;
        this.b = ccz0Var;
        this.c = function0;
        this.d = function1;
    }

    public final Connection L(Consumer consumer) {
        Connection connectionL = this.b.L(consumer);
        this.e = (n1b0) connectionL;
        return connectionL;
    }

    public final Object getView() {
        return this.a;
    }

    public final void start() {
        this.c.invoke();
    }

    public final void stop() {
        this.d.invoke();
        n1b0 n1b0Var = this.e;
        if (n1b0Var != null) {
            n1b0Var.dispose();
        }
        this.e = null;
    }
}
