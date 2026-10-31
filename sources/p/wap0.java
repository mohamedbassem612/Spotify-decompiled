package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nx9 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wap0(nx9 nx9Var, byte b) {
        super(0);
        this.a = b;
        this.b = nx9Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.p();
            case 1:
                return this.b.b();
            default:
                return this.b.h();
        }
    }
}
