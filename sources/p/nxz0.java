package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nxz0 implements xpw {
    public final String a;
    public final Function0 b;
    public final uqv0 c;
    public final t001 d;
    public final wgz0 e;
    public final b0i0 f;
    public final rey0 g = k1o1.p();
    public final psw h;
    public final ia00 i;

    public nxz0(String str, boolean z, Function0 function0, ytp0 ytp0Var, uqv0 uqv0Var, t001 t001Var) {
        this.a = str;
        this.b = function0;
        this.c = uqv0Var;
        this.d = t001Var;
        this.e = new wgz0((byte) 1, z);
        this.f = ytp0Var.k(dyz0.a);
        j2i j2iVar = new j2i(-1104549557, new zyy0(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.h = new psw(j2iVar, (byte) 0);
        this.i = n3o1.q(this).a(kxz0.b, kxz0.c);
    }

    public final rqw a() {
        return this.i;
    }

    public final jsw c() {
        return this.h;
    }

    public final mqw getBehavior() {
        return this.g;
    }
}
