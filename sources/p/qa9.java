package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qa9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ va9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qa9(va9 va9Var, byte b) {
        super(0);
        this.a = b;
        this.b = va9Var;
    }

    public final Object invoke() {
        byte b = this.a;
        va9 va9Var = this.b;
        switch (b) {
            case 0:
                int i = va9.h;
                return new hs6(va9Var.b.a("is-standalone-audiobooks", false), (byte) 6);
            case 1:
                int i2 = va9.h;
                bw20 bw20Var = va9Var.b;
                return new hs6(new x010(rqt0.u(new ld2(bw20Var.c("country_code", ""), "KR", (byte) 14)), rqt0.u(new hs6(bw20Var.c("on-demand-trial-in-progress", "0"), (byte) 7)), new ce2(3, (lnm) null, (byte) 3), (byte) 1), (byte) 6);
            case 2:
                return h4p1.g(new k96(va9Var, null, (byte) 20));
            default:
                return va9Var.f.b();
        }
    }
}
