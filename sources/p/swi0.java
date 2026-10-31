package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class swi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swi0(Function0 function0, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = function0;
        this.c = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.b;
        ven0 ven0Var = this.c;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 4:
                hxb hxbVar = (hxb) ven0Var.getValue();
                gxb gxbVar = new gxb(3);
                if (hxbVar instanceof fxb) {
                    hxbVar = gxbVar;
                }
                ven0Var.setValue(hxbVar);
                function0.invoke();
                return rih1Var;
            case 5:
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 6:
                function0.invoke();
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 7:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 8:
                function0.invoke();
                nln.j(ven0Var, false);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                return rih1Var;
            case 10:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 11:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 12:
                function0.invoke();
                float f = yy51.c;
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 13:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 14:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 15:
                ven0Var.setValue(true);
                function0.invoke();
                return rih1Var;
            case 16:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                return rih1Var;
            case 17:
                ven0Var.setValue(Boolean.TRUE);
                function0.invoke();
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                zc30 zc30Var = (zc30) ven0Var.getValue();
                float f2 = 1.0f;
                if (zc30Var != null) {
                    float fFloatValue = ((Number) function0.invoke()).floatValue();
                    int iOrdinal = zc30Var.ordinal();
                    if (iOrdinal == 0) {
                        f2 = 0.0f;
                    } else if (iOrdinal == 1) {
                        f2 = 1.0f - fFloatValue;
                    } else if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                }
                return Float.valueOf(f2);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            case 20:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.FALSE);
                function0.invoke();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ swi0(ven0 ven0Var, Function0 function0, byte b) {
        super(0);
        this.a = b;
        this.c = ven0Var;
        this.b = function0;
    }
}
