package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iws0 implements xpw {
    public final gw70 a;
    public final Function0 b;
    public final vu30 c;
    public final iu30 d;
    public final Function0 e;
    public final vu30 f;
    public final rey0 g = new rey0(new gws0(this, (byte) 0));
    public final u7h1 h = eth.a0((vu30) null, new gws0(this, (byte) 1), 1);
    public final psw i;

    public iws0(gw70 gw70Var, Function0 function0, vu30 vu30Var, iu30 iu30Var, Function0 function1, vu30 vu30Var2) {
        this.a = gw70Var;
        this.b = function0;
        this.c = vu30Var;
        this.d = iu30Var;
        this.e = function1;
        this.f = vu30Var2;
        j2i j2iVar = new j2i(1390470536, new t9r0(this, (byte) 13), true);
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
