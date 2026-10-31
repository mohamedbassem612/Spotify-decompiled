package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bk01 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vy71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bk01(vy71 vy71Var, byte b) {
        super(0);
        this.a = b;
        this.b = vy71Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return (xy71) ((mdt) this.b.e.X).getValue();
            default:
                return this.b.d();
        }
    }
}
