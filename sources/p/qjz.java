package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qjz implements xpw {
    public final Function0 a;
    public final rey0 b = new rey0(new o8x(this, (byte) 17));
    public final ia00 c;
    public final psw d;

    public qjz(Function0 function0, boolean z, g5l0 g5l0Var) {
        this.a = function0;
        this.c = z ? n3o1.q(this).a(new p8x(g5l0Var, (byte) 1), c0z.V0) : n3o1.q(this).a(c0z.T0, c0z.U0);
        j2i j2iVar = cni.a;
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
