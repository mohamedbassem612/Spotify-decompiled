package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ja0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oa0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ja0(oa0 oa0Var, byte b) {
        super(0);
        this.a = b;
        this.b = oa0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        oa0 oa0Var = this.b;
        switch (b) {
            case 0:
                String str = oa0Var.h.b;
                Set set = pcf.a;
                return new qvk0(new uvk0("spotify:chat-message:".concat(str)), oa0Var.t);
            default:
                String str2 = oa0Var.t;
                Set set2 = pcf.a;
                return hap1.o("spotify:chat-message:".concat(str2), (xkg0) null);
        }
    }
}
