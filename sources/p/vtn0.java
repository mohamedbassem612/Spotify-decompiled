package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vtn0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wtn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtn0(wtn0 wtn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wtn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wtn0 wtn0Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(wtn0Var.b.getResources().getDimensionPixelSize(2131166393));
            default:
                return Float.valueOf(qx21.a(2131166394, wtn0Var.b.getResources()));
        }
    }
}
