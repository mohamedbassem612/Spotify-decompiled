package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class of10 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pf10 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ of10(pf10 pf10Var, byte b) {
        super(0);
        this.a = b;
        this.b = pf10Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pf10 pf10Var = this.b;
        switch (b) {
            case 0:
                pf10Var.N1.setValue((Object) null);
                return rih1Var;
            case 1:
                pf10Var.Y0();
                t7y t7yVar = pf10Var.I1;
                if (t7yVar != null) {
                    t7yVar.s(pf10Var);
                    return rih1Var;
                }
                u890.C("facebookSdkWrapper");
                throw null;
            case 2:
                kp00 kp00Var = pf10Var.H1;
                if (kp00Var != null) {
                    ((ohv0) kp00Var.c).a(new lhv0(((gp41) kp00Var.b).a, "no_network_error"));
                    return rih1Var;
                }
                u890.C("facebookTracker");
                throw null;
            case 3:
                kg0 kg0Var = pf10Var.J1;
                if (kg0Var != null) {
                    kg0Var.a(true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            case 4:
                kg0 kg0Var2 = pf10Var.J1;
                if (kg0Var2 != null) {
                    kg0Var2.a(true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
            case 5:
                kp00 kp00Var2 = pf10Var.H1;
                if (kp00Var2 != null) {
                    ((ohv0) kp00Var2.c).a(new lhv0(((gp41) kp00Var2.b).a, "facebook_login_error"));
                    return rih1Var;
                }
                u890.C("facebookTracker");
                throw null;
            default:
                kg0 kg0Var3 = pf10Var.J1;
                if (kg0Var3 != null) {
                    kg0Var3.a(true);
                    return rih1Var;
                }
                u890.C("zeroNavigator");
                throw null;
        }
    }
}
