package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class w460 implements xpw {
    public final mjm a;
    public final a1r0 b;
    public final Function0 c;
    public final rey0 d;
    public final ia00 e;
    public final psw f;

    public w460(mjm mjmVar, boolean z, boolean z2, boolean z3, a1r0 a1r0Var, Function0 function0) {
        this.a = mjmVar;
        this.b = a1r0Var;
        this.c = function0;
        this.d = k1o1.o(new gn50(this, (byte) 9));
        this.e = z2 ? n3o1.q(this).a(vn50.O0, vn50.P0) : n3o1.q(this).a(vn50.Q0, vn50.R0);
        j2i j2iVarJ = apo.j(978959087, new v460(this, z, z3), true);
        ien0 ien0Var = qsw.a;
        this.f = new psw(j2iVarJ, (byte) 0);
    }

    public final rqw a() {
        return this.e;
    }

    public final jsw c() {
        return this.f;
    }

    public final mqw getBehavior() {
        return this.d;
    }

    public /* synthetic */ w460(boolean z, kl9 kl9Var, yc11 yc11Var, int i) {
        this((mjm) null, z, (i & 4) == 0, false, (a1r0) ((i & 16) != 0 ? null : kl9Var), (Function0) ((i & 32) != 0 ? null : yc11Var));
    }

    public w460(lzn0 lzn0Var, boolean z, boolean z2, boolean z3, a1r0 a1r0Var, int i) {
        this((mjm) k1o1.v(lzn0Var), z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? null : a1r0Var, (Function0) null);
    }
}
