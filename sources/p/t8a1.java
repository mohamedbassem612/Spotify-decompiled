package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class t8a1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ u8a1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t8a1(u8a1 u8a1Var, byte b) {
        super(0);
        this.a = b;
        this.b = u8a1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        u8a1 u8a1Var = this.b;
        switch (b) {
            case 0:
                return (c8a1) u8a1Var.d.get();
            default:
                return (z8a1) u8a1Var.c.get();
        }
    }
}
