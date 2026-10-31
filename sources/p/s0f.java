package p;

import android.app.Activity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s0f implements xpw {
    public final Activity a;
    public final gw70 b;
    public final bi0 c;
    public final z710 d;
    public final vjd0 e;
    public final i8h1 f;
    public final iu30 g;
    public final js20 h = x3p1.n(new q0f(this, (byte) 0), new q0f(this, (byte) 1), new cka(this, (byte) 29), (o8n) null, new q0f(this, (byte) 2), 8);
    public final psw i;
    public final ia00 t;

    public s0f(Activity activity, gw70 gw70Var, bi0 bi0Var, z710 z710Var, vjd0 vjd0Var, i8h1 i8h1Var, iu30 iu30Var) {
        this.a = activity;
        this.b = gw70Var;
        this.c = bi0Var;
        this.d = z710Var;
        this.e = vjd0Var;
        this.f = i8h1Var;
        this.g = iu30Var;
        j2i j2iVar = new j2i(992494428, new m04(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.i = new psw(j2iVar, (byte) 0);
        this.t = n3o1.q(this).a(r0f.b, new zee(this, (byte) 7));
    }

    public final rqw a() {
        return this.t;
    }

    public final jsw c() {
        return this.i;
    }

    public final tkf f(ugf ugfVar) {
        int iOrdinal = ugfVar.ordinal();
        Activity activity = this.a;
        if (iOrdinal == 0 || iOrdinal == 1) {
            return new tkf("chat-disclaimer", activity.getString(2131957482), new nkf(), (String) null, true, false, true);
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return new tkf("chat-disclaimer", activity.getString(2131957482), new okf(activity.getString(2131957483)), (String) null, true, false, true);
        }
        eg.o();
        return null;
    }

    public final mqw getBehavior() {
        return this.h;
    }
}
