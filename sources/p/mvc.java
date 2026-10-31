package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mvc extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mvc(byte b, long j) {
        super(0);
        this.a = b;
        this.b = j;
    }

    public final Object invoke() {
        byte b = this.a;
        long j = this.b;
        switch (b) {
            case 0:
                up20 up20Var = new up20((byte) 5);
                return new wf01(new upb(j, up20Var), up20Var);
            case 1:
                return Integer.valueOf(jch0.S(jfv.s(j, ngv.h)));
            default:
                return new s3v(j);
        }
    }
}
