package p;

import android.content.Context;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lop0 implements xpw {
    public static final Set t = c13.i(xkk1.class);
    public final xrc0 a;
    public final gw70 b;
    public final lzn0 c;
    public final Context d;
    public final zwz0 e;
    public final zob1 f;
    public final js20 g = x3p1.n(new iop0(this, (byte) 0), mmp0.e, new nso0(this, (byte) 4), (o8n) null, new iop0(this, (byte) 1), 8);
    public final ia00 h = n3o1.q(this).a(rmp0.d, rmp0.e);
    public final psw i;

    public lop0(xrc0 xrc0Var, gw70 gw70Var, lzn0 lzn0Var, Context context, zwz0 zwz0Var, zob1 zob1Var) {
        this.a = xrc0Var;
        this.b = gw70Var;
        this.c = lzn0Var;
        this.d = context;
        this.e = zwz0Var;
        this.f = zob1Var;
        j2i j2iVar = new j2i(-56087445, new aso0(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.h;
    }

    public final jsw c() {
        return this.i;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
