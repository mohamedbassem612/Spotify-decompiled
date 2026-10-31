package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vpv0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ wpv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vpv0(wpv0 wpv0Var, byte b) {
        super(0);
        this.a = b;
        this.b = wpv0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        wpv0 wpv0Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(wpv0Var.b.w());
            default:
                return Boolean.valueOf(wpv0Var.b.j());
        }
    }
}
