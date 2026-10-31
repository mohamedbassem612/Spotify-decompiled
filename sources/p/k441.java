package p;

import com.spotify.mobius.Connection;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class k441 implements Connection, iu30 {
    public final iu30 a;
    public final AtomicBoolean b = new AtomicBoolean(true);

    public k441(iu30 iu30Var) {
        this.a = iu30Var;
    }

    public final void accept(Object obj) {
        if (this.b.get()) {
            this.a.invoke(obj);
        }
    }

    public final void dispose() {
        this.b.set(false);
    }

    public final Object invoke(Object obj) {
        if (this.b.get()) {
            this.a.invoke(obj);
        }
        return rih1.a;
    }
}
