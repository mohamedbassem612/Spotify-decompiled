package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class sz0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sz0(tz0 tz0Var, byte b) {
        super(0);
        this.a = b;
        this.b = tz0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tz0 tz0Var = this.b;
        switch (b) {
            case 0:
                krw0.i.f.a(tz0Var);
                break;
            default:
                krw0.i.f.d(tz0Var);
                break;
        }
        return rih1Var;
    }
}
