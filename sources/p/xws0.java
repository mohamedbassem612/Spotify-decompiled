package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xws0 implements xpw {
    public final Function0 a;
    public final Function0 b;
    public final iu30 c;
    public final vu30 d;
    public final Function0 e;
    public final Function0 f;
    public final rey0 g = new rey0(new wws0(this, (byte) 0));
    public final u7h1 h = new u7h1(new nso0(this, (byte) 27), new wws0(this, (byte) 1));
    public final psw i;

    public xws0(Function0 function0, Function0 function1, iu30 iu30Var, vu30 vu30Var, Function0 function2, Function0 function3) {
        this.a = function0;
        this.b = function1;
        this.c = iu30Var;
        this.d = vu30Var;
        this.e = function2;
        this.f = function3;
        j2i j2iVar = k7j.a;
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
