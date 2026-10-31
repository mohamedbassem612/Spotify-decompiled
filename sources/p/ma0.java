package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ma0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ma0(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 1:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                return rih1Var;
            case 3:
                ((iu30) ven0Var.getValue()).invoke(fa1.a);
                return rih1Var;
            case 4:
                ((iu30) ven0Var.getValue()).invoke(ea1.a);
                return rih1Var;
            case 5:
                ((iu30) ven0Var.getValue()).invoke(ra1.a);
                return rih1Var;
            case 6:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 7:
                ((iu30) ven0Var.getValue()).invoke(Boolean.TRUE);
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 10:
                return (aab1) ven0Var.getValue();
            case 11:
                return (lwq0) ven0Var.getValue();
            case 12:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 13:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 14:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 15:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 16:
                return v8r.q((String) ven0Var.getValue());
            case 17:
                ((Function0) ven0Var.getValue()).invoke();
                return Boolean.FALSE;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 20:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 21:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 22:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 23:
                ven0Var.setValue(pd31.c);
                return rih1Var;
            case 24:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 25:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 26:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 27:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 28:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }
}
