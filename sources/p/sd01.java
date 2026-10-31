package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sd01 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nl9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sd01(nl9 nl9Var, byte b) {
        super(0);
        this.a = b;
        this.b = nl9Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nl9 nl9Var = this.b;
        switch (b) {
            case 0:
                vun vunVar = (vun) nl9Var.e;
                d0r d0rVar = (d0r) nl9Var.i;
                uw0 uw0Var = (uw0) ((knq) vunVar.b).a.c;
                lzn0 lzn0Var = (lzn0) ((wd01) uw0Var.d).b.get();
                c8o.l(lzn0Var);
                return new dc8(d0rVar, lzn0Var, (ygt0) ((jly0) uw0Var.c).get());
            default:
                return new lgu0((d0r) nl9Var.i);
        }
    }
}
