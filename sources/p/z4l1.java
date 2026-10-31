package p;

import android.os.Bundle;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z4l1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c5l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4l1(c5l1 c5l1Var, byte b) {
        super(0);
        this.a = b;
        this.b = c5l1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        c5l1 c5l1Var = this.b;
        switch (b) {
            case 0:
                Bundle bundle = ((zf30) c5l1Var).f;
                return Boolean.valueOf(bundle != null ? bundle.getBoolean("arg_pses_pre_fetched", false) : false);
            default:
                Bundle bundle2 = ((zf30) c5l1Var).f;
                return Boolean.valueOf(bundle2 != null ? bundle2.getBoolean("arg_show_spinner_immediately", false) : false);
        }
    }
}
