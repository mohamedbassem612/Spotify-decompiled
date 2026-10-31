package p;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import androidx.compose.ui.geometry.Offset;
import com.spotify.betamax.player.VideoSurfaceView;
import com.spotify.encoreconsumermobile.elements.backbutton.BackButtonView;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class i2g1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i2g1(ven0 ven0Var, byte b) {
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
                ven0Var.setValue(Integer.valueOf(((Number) obj).intValue()));
                return rih1Var;
            case 1:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 2:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 3:
                ((kd31) obj).b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f);
                return rih1Var;
            case 4:
                ven0Var.setValue((zc30) obj);
                return rih1Var;
            case 5:
                ((iu30) ven0Var.getValue()).invoke((khi1) obj);
                return rih1Var;
            case 6:
                oq70 oq70Var = ((li7) obj).b.a;
                if (oq70Var.getHeight() != -1 && p3v.b(((p3v) ven0Var.getValue()).a, oq70Var.getHeight()) > 0) {
                    pzm.k(oq70Var.getHeight(), ven0Var);
                }
                return rih1Var;
            case 7:
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 8:
                pxg1 pxg1Var = qej1.a;
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case 9:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case 10:
                oq70 oq70Var2 = ((li7) obj).b.a;
                ven0Var.setValue(new l6m(oq70Var2.getWidth(), oq70Var2.getHeight()));
                return rih1Var;
            case 11:
                ven0Var.setValue((y9e1) obj);
                return rih1Var;
            case 12:
                zjy.m((Number) ven0Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case 13:
                ven0Var.setValue(Boolean.valueOf(((wz20) obj).b()));
                return rih1Var;
            case 14:
                ven0Var.setValue((String) obj);
                return rih1Var;
            case 15:
                ven0Var.setValue(nho1.n((elb0) obj, true));
                return rih1Var;
            case 16:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                return rih1Var;
            case 17:
                long j = ((Offset) obj).a;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 18:
                ven0Var.setValue(Boolean.valueOf(((Number) obj).intValue() > 0));
                return rih1Var;
            case 19:
                tlv backButtonView = new BackButtonView((Context) obj, null, 0, 6, null);
                backButtonView.setOnClickListener(new s96(ven0Var, (byte) 1));
                return backButtonView;
            case 20:
                tlv tlvVar = (BackButtonView) obj;
                Integer num = (Integer) ven0Var.getValue();
                tlvVar.setColorFilter(num != null ? new PorterDuffColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN) : null);
                return rih1Var;
            case 21:
                return new ij6(ven0Var, (byte) 5);
            case 22:
                ((iu30) ven0Var.getValue()).invoke(Float.valueOf(yoi1.o(((Number) obj).floatValue(), 0.0f, 100.0f) / 100.0f));
                return Boolean.TRUE;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                ((iu30) ven0Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return rih1Var;
            case 24:
                ((iu30) ven0Var.getValue()).invoke(Float.valueOf(((Number) obj).floatValue()));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                ven0Var.setValue(nho1.l((elb0) obj));
                return rih1Var;
            case 26:
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 27:
                ven0Var.setValue(cfl1.a((cfl1) ven0Var.getValue(), ((Boolean) obj).booleanValue(), 0, 2));
                return rih1Var;
            case 28:
                ven0Var.setValue(cfl1.a((cfl1) ven0Var.getValue(), ((Boolean) obj).booleanValue(), 0, 2));
                return rih1Var;
            default:
                long j2 = ((Offset) obj).a;
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
        }
    }
}
