package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jgc0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jgc0(bs0 bs0Var, byte b) {
        super(1);
        this.a = b;
        this.b = bs0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bs0 bs0Var = this.b;
        switch (b) {
            case 0:
                fgc0 fgc0Var = ((igc0) obj).a;
                ir61 ir61Var = fgc0Var.a;
                return new iqm1(zro1.y(ir61Var), zro1.x(ir61Var, (Context) bs0Var.d), fgc0Var.b);
            default:
                return ((u0i) bs0Var.b).a((l0i) null);
        }
    }
}
