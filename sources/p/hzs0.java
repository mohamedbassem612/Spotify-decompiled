package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hzs0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jzs0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hzs0(jzs0 jzs0Var, byte b) {
        super(0);
        this.a = b;
        this.b = jzs0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jzs0 jzs0Var = this.b;
        switch (b) {
            case 0:
                return new gzs0(jzs0Var, (byte) 0);
            default:
                return new gzs0(jzs0Var, (byte) 1);
        }
    }
}
