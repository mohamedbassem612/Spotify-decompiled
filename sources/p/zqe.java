package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zqe extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zqe(ven0 ven0Var, ven0 ven0Var2, byte b) {
        super(0);
        this.a = b;
        this.b = ven0Var;
        this.c = ven0Var2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        ven0 ven0Var2 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                iu30 iu30Var = (iu30) ven0Var2.getValue();
                jre jreVar = ((ppe) ven0Var.getValue()).a;
                hre hreVar = jreVar instanceof hre ? (hre) jreVar : null;
                iu30Var.invoke(new dpe(hreVar != null ? hreVar.b : null, false));
                return rih1Var;
            case 1:
                if (!((Boolean) ven0Var2.getValue()).booleanValue()) {
                    ven0Var2.setValue(Boolean.TRUE);
                    ((Function0) ven0Var.getValue()).invoke();
                }
                return rih1Var;
            case 2:
                ven0Var.setValue((String) ven0Var2.getValue());
                return rih1Var;
            case 3:
                return new mmr0(Integer.valueOf(((Number) ven0Var2.getValue()).intValue()), (List) ven0Var.getValue());
            case 4:
                return new mmr0(Integer.valueOf(((Number) ven0Var2.getValue()).intValue()), (List) ven0Var.getValue());
            case 5:
                ven0Var2.setValue(Boolean.TRUE);
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 6:
                ((iu30) ven0Var.getValue()).invoke(new rif0(((Number) ((Function0) ven0Var2.getValue()).invoke()).intValue()));
                return rih1Var;
            case 7:
                l5f0 l5f0Var = (l5f0) ven0Var2.getValue();
                ven0Var.setValue(l5f0Var != null ? l5f0Var.b : null);
                ven0Var2.setValue((Object) null);
                return rih1Var;
            case 8:
                if (((Boolean) ven0Var2.getValue()).booleanValue()) {
                    return (r091) ven0Var.getValue();
                }
                return null;
            case 9:
                ven0Var2.setValue((Object) null);
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 10:
                return Integer.valueOf(((List) ven0Var2.getValue()).isEmpty() ? 1 : (((Boolean) ven0Var.getValue()).booleanValue() ? 1 : 0) + ((List) ven0Var2.getValue()).size());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return Float.valueOf(((Number) ((Function0) ven0Var2.getValue()).invoke()).floatValue() / (((Number) ven0Var.getValue()).floatValue() / 1000.0f));
            case grn1.d /* 12 */:
                Boolean boolValueOf = Boolean.valueOf(((ru41) ven0Var2.getValue()).a.d > 0.0f);
                Long lValueOf = Long.valueOf(((ru41) ven0Var2.getValue()).a.b);
                Boolean bool = (Boolean) ven0Var.getValue();
                bool.booleanValue();
                return new yvg1(boolValueOf, lValueOf, bool);
            case 13:
                ven0Var2.setValue((Object) null);
                ven0Var.setValue(0);
                return rih1Var;
            case 14:
                ven0Var.setValue((Integer) ven0Var2.getValue());
                return rih1Var;
            case 15:
                ven0Var.setValue(Boolean.FALSE);
                ((Function0) ven0Var2.getValue()).invoke();
                return rih1Var;
            default:
                ven0Var2.setValue((Object) null);
                ven0Var.setValue(sbm1.a);
                return rih1Var;
        }
    }
}
