package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lef1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nef1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lef1(nef1 nef1Var, byte b) {
        super(0);
        this.a = b;
        this.b = nef1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nef1 nef1Var = this.b;
        switch (b) {
            case 0:
                return ycm.a(nef1Var.g);
            default:
                return new evt0(nef1Var.c, nef1Var.b, nef1Var.h, nef1Var.i, nef1Var.t);
        }
    }
}
