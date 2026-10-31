package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p251 implements xpw {
    public final lz20 a;
    public final rey0 b;
    public final ia00 c;
    public final psw d;

    public p251(iu30 iu30Var, iu30 iu30Var2, Function0 function0, boolean z, g5l0 g5l0Var) {
        psw pswVar;
        lz20 lz20Var = new lz20();
        this.a = lz20Var;
        this.b = new rey0(new nu31(iu30Var, iu30Var2, function0, (byte) 1));
        this.c = z ? n3o1.q(this).a(new p8x(g5l0Var, (byte) 2), vs31.c1) : n3o1.q(this).a(vs31.a1, vs31.b1);
        if (z) {
            j2i j2iVar = new j2i(2007600393, new r251(lz20Var, (byte) 1), true);
            ien0 ien0Var = qsw.a;
            pswVar = new psw(j2iVar, (byte) 0);
        } else {
            j2i j2iVar2 = new j2i(1419568769, new r251(lz20Var, (byte) 0), true);
            ien0 ien0Var2 = qsw.a;
            pswVar = new psw(j2iVar2, (byte) 0);
        }
        this.d = pswVar;
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
