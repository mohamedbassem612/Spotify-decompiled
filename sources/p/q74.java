package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class q74 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c = new idd1(new m44(this, (byte) 28));

    public q74(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
    }

    public final int a() {
        q74 q74Var = (q74) this.c.getValue();
        return q74Var != null ? q74Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("player_pool_size", "android-betamax-playerpool", a(), 0, 1000000));
    }
}
