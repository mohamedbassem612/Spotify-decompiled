package p;

import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lz2 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nz2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lz2(nz2 nz2Var, byte b) {
        super(0);
        this.a = b;
        this.b = nz2Var;
    }

    public final Object invoke() {
        byte b = this.a;
        nz2 nz2Var = this.b;
        switch (b) {
            case 0:
                return ((x4p0) nz2Var.Z.get()).a(nz2Var);
            case 1:
                sqq0 sqq0Var = (sqq0) nz2Var.V0.get();
                return new tqq0(Flowable.I(yqq0.c), sqq0Var.a, sqq0Var.b);
            default:
                return Integer.valueOf(nz2Var.Y0.a.s());
        }
    }
}
