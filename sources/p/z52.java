package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class z52 implements n4p0 {
    public final /* synthetic */ byte a;
    public final kly0 b;

    public /* synthetic */ z52(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final Function0 a() {
        switch (this.a) {
            case 0:
                return new y52(0, this.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 0);
            case 1:
                return new q01(0, this.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 11);
            case 2:
                return new y0u(0, this.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 9);
            default:
                return new p350(0, this.b, kly0.class, "get", "get()Ljava/lang/Object;", 0, (byte) 4);
        }
    }

    public final String name() {
        switch (this.a) {
            case 0:
                return "ads_mode";
            case 1:
                return "agnostic_mode";
            case 2:
                return "endless_feed_mode";
            default:
                return "greenroom_mode";
        }
    }
}
