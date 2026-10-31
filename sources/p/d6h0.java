package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d6h0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f6h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6h0(f6h0 f6h0Var, byte b) {
        super(0);
        this.a = b;
        this.b = f6h0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        f6h0 f6h0Var = this.b;
        switch (b) {
            case 0:
                f6h0Var.f.J();
                f6h0Var.k.a(ixb.c);
                return rih1Var;
            case 1:
                f6h0Var.o.setValue(Boolean.FALSE);
                ((ipk1) ((kly0) f6h0Var.f.p.c).get()).getClass();
                return rih1Var;
            case 2:
                f6h0Var.p.setValue(Boolean.FALSE);
                return rih1Var;
            default:
                return (l680) f6h0Var.g.C.a.getValue();
        }
    }
}
