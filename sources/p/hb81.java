package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hb81 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hb81(s24 s24Var, byte b) {
        super(0);
        this.a = b;
        this.b = s24Var;
    }

    public final Object invoke() {
        byte b = this.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                ycc1 ycc1Var = (ycc1) s24Var.h;
                return new ly1((aas) ycc1Var.b, (q8n) ycc1Var.c);
            case 1:
                return new af60((gw70) s24Var.c, (lzn0) s24Var.b, (tsq) s24Var.d, new j2i(-2041510550, new jb81(s24Var, (byte) 1), true));
            case 2:
                return new hho((d0r) s24Var.e);
            case 3:
                return t1p.b((t1p) s24Var.f, (d0r) s24Var.e, (q8n) null, 4);
            default:
                wmy wmyVar = (wmy) s24Var.g;
                return new utj0(new buj0((jjk0) wmyVar.a, ((p5q) s24Var.i).a((d0r) s24Var.e), (bjk0) wmyVar.b, ((b9q) s24Var.t).a(r6h1.c), (zwz0) wmyVar.c, (lzn0) wmyVar.d, (q8n) wmyVar.f), (q8n) wmyVar.e);
        }
    }
}
