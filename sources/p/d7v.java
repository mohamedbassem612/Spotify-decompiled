package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d7v extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d7v(ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, (String) ven0Var.getValue());
                b261.t(e261Var, 0);
                return rih1Var;
            case 1:
                ((iu30) ven0Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return Boolean.TRUE;
            case 2:
                long j = ((Offset) obj).a;
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 3:
                ((Number) obj).floatValue();
                if (((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.FALSE);
                }
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 5:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ven0Var.setValue(bool);
                return rih1Var;
            case 6:
                ven0Var.setValue((ll10) obj);
                return rih1Var;
            case 7:
                ven0Var.setValue((ll10) obj);
                return rih1Var;
            case 8:
                ven0Var.setValue((ur80) obj);
                return rih1Var;
            case 9:
                ven0Var.setValue((ur80) obj);
                return rih1Var;
            case 10:
                yr80 yr80Var = (yr80) obj;
                long j2 = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 11:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                ven0Var.setValue(bool2);
                return rih1Var;
            case 12:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 13:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                ven0Var.setValue(bool3);
                return rih1Var;
            case 14:
                elb0 elb0Var = (elb0) obj;
                n511 n511VarM = nho1.v(elb0Var).M(elb0Var, true);
                if (!n511VarM.equals((n511) ven0Var.getValue())) {
                    ven0Var.setValue(n511VarM);
                }
                return rih1Var;
            case 15:
                elb0 elb0Var2 = (elb0) obj;
                n511 n511VarM2 = nho1.v(elb0Var2).M(elb0Var2, true);
                if (!n511VarM2.equals((n511) ven0Var.getValue())) {
                    ven0Var.setValue(n511VarM2);
                }
                return rih1Var;
            case 16:
                ven0Var.setValue((n511) obj);
                return rih1Var;
            case 17:
                Boolean bool4 = (Boolean) obj;
                bool4.getClass();
                ven0Var.setValue(bool4);
                return rih1Var;
            case 18:
                ven0Var.setValue(Boolean.valueOf(((float) ((Number) obj).intValue()) > 0.5f));
                return rih1Var;
            case 19:
                ven0Var.setValue((Integer) obj);
                return rih1Var;
            case 20:
                ven0Var.setValue((Integer) obj);
                return rih1Var;
            case 21:
                zjy.m((Number) ven0Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 22:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ven0Var.setValue((ni00) obj);
                return rih1Var;
            case 24:
                ((abc0) obj).a = new vk1(ven0Var, (lnm) null, (byte) 10);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ven0Var.setValue((elb0) obj);
                return rih1Var;
            case 26:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 27:
                yr80 yr80Var2 = (yr80) obj;
                long j3 = yr80Var2.a;
                ven0Var.setValue(yr80Var2);
                return rih1Var;
            case 28:
                kd31 kd31Var = (kd31) obj;
                kd31Var.C(Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a >> 32)));
                kd31Var.E(Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a & 4294967295L)));
                kd31Var.q(1.1f);
                kd31Var.r(1.1f);
                return rih1Var;
            default:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
        }
    }
}
