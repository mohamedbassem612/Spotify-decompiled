package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q2j0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q2j0(ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke() {
        los losVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 1:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 2:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 3:
                ven0Var.setValue(j8k0.a);
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 5:
                ((iu30) ven0Var.getValue()).invoke(erm0.a);
                return rih1Var;
            case 6:
                r091 r091Var = (r091) ven0Var.getValue();
                if (r091Var != null) {
                    r091Var.g();
                }
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 7:
                r091 r091Var2 = (r091) ven0Var.getValue();
                if (r091Var2 != null) {
                    r091Var2.g();
                }
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 8:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 9:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 10:
                AtomicLong atomicLong = bcn0.a;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 11:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 12:
                ((iu30) ven0Var.getValue()).invoke(imp0.a);
                return rih1Var;
            case 13:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 14:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 15:
                ven0Var.setValue(gzn0.a);
                return rih1Var;
            case 16:
                nxb nxbVar = (nxb) ven0Var.getValue();
                if (nxbVar == null || (losVar = nxbVar.f) == null) {
                    return null;
                }
                return losVar.a;
            case 17:
                ven0Var.setValue(Boolean.valueOf(!((Boolean) ven0Var.getValue()).booleanValue()));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return (n511) ven0Var.getValue();
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                Offset offset = (Offset) ven0Var.getValue();
                long j = offset.a;
                return offset;
            case 20:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 21:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 22:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 23:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 24:
                return v8r.q(Boolean.valueOf(((String) ven0Var.getValue()).length() == 4));
            case 25:
                return (v760) ven0Var.getValue();
            case 26:
                return (Boolean) ven0Var.getValue();
            case 27:
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.getClass();
                return bool;
            case 28:
                nln.j(ven0Var, true);
                return rih1Var;
            default:
                nln.j(ven0Var, false);
                return rih1Var;
        }
    }
}
