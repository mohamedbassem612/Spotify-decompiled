package p;

import android.app.Activity;
import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class y7m0 implements Connectable {
    public final /* synthetic */ b8m0 a;
    public final /* synthetic */ cir0 b;

    public y7m0(b8m0 b8m0Var, cir0 cir0Var) {
        this.a = b8m0Var;
        this.b = cir0Var;
    }

    public final Connection L(Consumer consumer) {
        kp5 kp5Var = (kp5) this.a.d.a.c;
        xon xonVar = (xon) kp5Var.a;
        Activity activity = (Activity) xonVar.a.get();
        c8o.l(activity);
        lzn0 lzn0Var = (lzn0) xonVar.b.get();
        c8o.l(lzn0Var);
        a1r0 a1r0Var = (a1r0) xonVar.h.get();
        c8o.l(a1r0Var);
        dqn dqnVar = (dqn) kp5Var.b;
        q8n q8nVar = (q8n) xonVar.l.get();
        c8o.l(q8nVar);
        dpn dpnVar = new dpn(new zwg(activity, lzn0Var, a1r0Var, dqnVar, q8nVar), new mp8(kp5Var.s(), (byte) 29), (c9p) ((jly0) kp5Var.f).get(), this.b);
        consumer.getClass();
        return dpnVar.L(consumer);
    }
}
