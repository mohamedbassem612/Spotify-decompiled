package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class tr91 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xr91 b;

    public /* synthetic */ tr91(xr91 xr91Var, byte b) {
        this.a = b;
        this.b = xr91Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xr91 xr91Var = this.b;
        switch (b) {
            case 0:
                ohd ohdVar = xr91Var.d;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith(au91.a);
                }
                return Boolean.TRUE;
            default:
                ohd ohdVar2 = xr91Var.d;
                if (ohdVar2.s() instanceof ago0) {
                    ohdVar2.resumeWith(au91.b);
                }
                return rih1.a;
        }
    }
}
