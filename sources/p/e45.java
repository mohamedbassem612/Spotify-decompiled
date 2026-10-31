package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class e45 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ e45(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                elb0 elb0Var = (elb0) ven0Var.getValue();
                if (elb0Var != null) {
                    return elb0Var;
                }
                tf80.d("Required value was null.");
                jah.d();
                return null;
            case 1:
                elb0 elb0Var2 = (elb0) ven0Var.getValue();
                if (elb0Var2 != null) {
                    return elb0Var2;
                }
                tf80.d("Required value was null.");
                jah.d();
                return null;
            case 2:
                if (ven0Var != null) {
                    return (List) ven0Var.getValue();
                }
                return null;
            case 3:
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                return bool;
            case 4:
                ven0Var.setValue(rih1Var);
                return rih1Var;
            case 5:
                ((gt00) ven0Var.getValue()).getClass();
                ven0Var.setValue(new gt00());
                return rih1Var;
            case 6:
                return new epb0((iu30) ven0Var.getValue());
            case 7:
                return (esb0) ((Function0) ven0Var.getValue()).invoke();
            case 8:
                return new jtb0((iu30) ven0Var.getValue());
            case 9:
                return new pub0((iu30) ven0Var.getValue());
            case 10:
                elb0 elb0Var3 = (elb0) ven0Var.getValue();
                if (elb0Var3 != null) {
                    return elb0Var3;
                }
                tf80.d("Required value was null.");
                jah.d();
                return null;
            default:
                return (elb0) ven0Var.getValue();
        }
    }
}
