package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lxw extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mxw b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ lxw(mxw mxwVar, byte b) {
        super(0);
        this.a = b;
        this.b = mxwVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mxw mxwVar = this.b;
        switch (b) {
            case 0:
                ohv0 ohv0Var = mxwVar.X1;
                if (ohv0Var == null) {
                    u890.C("preAuthUbiTracker");
                    throw null;
                }
                ohv0Var.a(new mhv0("email_method_picker", "without_password", ew80.c, (String) null));
                kg0 kg0Var = mxwVar.W1;
                if (kg0Var != null) {
                    kg0Var.d(new sit((String) null, 15, false), true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            default:
                ohv0 ohv0Var2 = mxwVar.X1;
                if (ohv0Var2 == null) {
                    u890.C("preAuthUbiTracker");
                    throw null;
                }
                ohv0Var2.a(new mhv0("email_method_picker", "with_password", ew80.c, (String) null));
                kg0 kg0Var2 = mxwVar.W1;
                if (kg0Var2 != null) {
                    kg0Var2.d(new tjt((String) null), true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
        }
    }
}
