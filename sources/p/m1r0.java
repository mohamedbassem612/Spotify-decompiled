package p;

import android.view.View;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m1r0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ o1r0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m1r0(o1r0 o1r0Var, byte b) {
        super(0);
        this.a = b;
        this.b = o1r0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        o1r0 o1r0Var = this.b;
        switch (b) {
            case 0:
                View viewFindViewById = o1r0Var.findViewById(2131428458);
                if (viewFindViewById != null) {
                    return viewFindViewById;
                }
                eg.m("Required value was null.");
                return null;
            case 1:
                View viewFindViewById2 = o1r0Var.findViewById(2131428198);
                if (viewFindViewById2 != null) {
                    return viewFindViewById2;
                }
                eg.m("Required value was null.");
                return null;
            default:
                View viewFindViewById3 = o1r0Var.findViewById(2131428248);
                if (viewFindViewById3 != null) {
                    return viewFindViewById3;
                }
                eg.m("Required value was null.");
                return null;
        }
    }
}
