package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bit implements Function0 {
    public final /* synthetic */ byte a;
    public final Function0 b;

    public /* synthetic */ bit(Function0 function0, byte b) {
        this.a = b;
        this.b = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                return o7h.p1((Iterable) function0.invoke());
            default:
                zpi0 zpi0Var = (zpi0) function0.invoke();
                return zpi0Var instanceof iub0 ? ((iub0) zpi0Var).h() : zpi0Var;
        }
    }
}
