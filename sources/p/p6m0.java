package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class p6m0 implements t9h1 {
    public final /* synthetic */ byte a;
    public final y6h1 b;
    public final List c;

    public p6m0(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-plan";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                this.b = x6h1VarI.a();
                this.c = Collections.singletonList("your-plan");
                break;
            default:
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-your-listening-summary";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                this.b = x6h1VarI2.a();
                this.c = Collections.singletonList("listeningstats/summary");
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        y6h1 y6h1Var = this.b;
        switch (b) {
            case 0:
                r6h1 r6h1Var = r6h1.c;
                break;
            default:
                r6h1 r6h1Var2 = r6h1.c;
                break;
        }
        return new r6h1(kk0.l(y6h1Var), (u8h1) null);
    }
}
