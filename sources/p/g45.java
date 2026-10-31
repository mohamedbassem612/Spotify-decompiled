package p;

import androidx.compose.ui.geometry.Offset;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class g45 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ g45(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 1:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 2:
                f0e1 f0e1Var = (f0e1) obj;
                ven0Var.setValue(f0e1Var.c ? f0e1Var.b : f0e1Var.a);
                return rih1Var;
            case 3:
                List list = (List) obj;
                if (ven0Var != null) {
                    ven0Var.setValue(list);
                }
                return rih1Var;
            case 4:
                ((iu30) ven0Var.getValue()).invoke((Offset) obj);
                return rih1Var;
            case 5:
                Float f = (Float) obj;
                f.getClass();
                ((iu30) ven0Var.getValue()).invoke(f);
                return rih1Var;
            case 6:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 7:
                Float f2 = (Float) obj;
                f2.getClass();
                return Float.valueOf(((Number) ((iu30) ven0Var.getValue()).invoke(f2)).floatValue());
            case 8:
                ((iu30) ven0Var.getValue()).invoke((Offset) obj);
                return rih1Var;
            default:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
        }
    }
}
