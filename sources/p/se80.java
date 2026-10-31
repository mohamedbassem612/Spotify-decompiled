package p;

import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class se80 implements xpw {
    public final Context a;
    public final pd80 b;
    public final iac0 c;
    public final q8n d;
    public final q8n e;
    public volatile m6p1 f;
    public final AtomicBoolean g;
    public final e7m0 h;
    public final eih1 i;
    public final psw t;

    public se80(Context context, pd80 pd80Var, iac0 iac0Var, q8n q8nVar, q8n q8nVar2) {
        this.a = context;
        this.b = pd80Var;
        this.c = iac0Var;
        this.d = q8nVar;
        this.e = q8nVar2;
        de80 de80Var = de80.c;
        this.f = de80Var;
        this.g = new AtomicBoolean(false);
        this.h = cxm.v(new oe80(de80Var, fe80.c, null, null, null), new dq7(this, (byte) 12), new ku1(this, (byte) 15), new fc3(this, (byte) 11), new re80(this));
        this.i = fho1.x();
        j2i j2iVar = vsi.a;
        ien0 ien0Var = qsw.a;
        this.t = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.t;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
