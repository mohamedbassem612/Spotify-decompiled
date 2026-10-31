package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xqd0 implements Connectable {
    public final vq4 X;
    public final p4s a;
    public final up90 b;
    public final Scheduler c;
    public final q8n d;
    public final c9c0 e;
    public final fy91 f;
    public final x350 g;
    public final t8u0 h;
    public final x8c0 i;
    public final t8r0 t;

    public xqd0(p4s p4sVar, up90 up90Var, Scheduler scheduler, q8n q8nVar, c9c0 c9c0Var, fy91 fy91Var, x350 x350Var, t8u0 t8u0Var, x8c0 x8c0Var, t8r0 t8r0Var, vq4 vq4Var) {
        this.a = p4sVar;
        this.b = up90Var;
        this.c = scheduler;
        this.d = q8nVar;
        this.e = c9c0Var;
        this.f = fy91Var;
        this.g = x350Var;
        this.h = t8u0Var;
        this.i = x8c0Var;
        this.t = t8r0Var;
        this.X = vq4Var;
    }

    @Override // com.spotify.mobius.Connectable
    public final Connection L(Consumer consumer) {
        return new w2h(this, consumer);
    }
}
