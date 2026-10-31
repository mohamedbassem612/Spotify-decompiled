package p;

import androidx.compose.ui.geometry.Offset;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class i030 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i030(ven0 ven0Var, byte b) {
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
                wz20 wz20Var = (wz20) obj;
                ven0Var.setValue(Boolean.valueOf(wz20Var.b() && wz20Var.a()));
                return rih1Var;
            case 1:
                ((iu30) ven0Var.getValue()).invoke(u1c0.b);
                return rih1Var;
            case 2:
                ((iu30) ven0Var.getValue()).invoke(v1c0.b);
                return rih1Var;
            case 3:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 4:
                ven0Var.setValue(Boolean.FALSE);
                return rih1Var;
            case 5:
                yr80 yr80Var = (yr80) obj;
                long j = yr80Var.a;
                ven0Var.setValue(yr80Var);
                return rih1Var;
            case 6:
                yr80 yr80Var2 = (yr80) obj;
                long j2 = yr80Var2.a;
                ven0Var.setValue(yr80Var2);
                return rih1Var;
            case 7:
                ((iu30) ven0Var.getValue()).invoke(pb40.a);
                return rih1Var;
            case 8:
                oq70 oq70Var = ((li7) obj).b.a;
                ven0Var.setValue((oq70Var.getWidth() == -1 || oq70Var.getHeight() == -1) ? new mmr0(1, 1) : new mmr0(Integer.valueOf(oq70Var.getWidth()), Integer.valueOf(oq70Var.getHeight())));
                return rih1Var;
            case 9:
                ven0Var.setValue(new yr80(((elb0) obj).b()));
                return rih1Var;
            case 10:
                long j3 = ((Offset) obj).a;
                ((Function0) ven0Var.getValue()).invoke();
                return rih1Var;
            case 11:
                ((iu30) ven0Var.getValue()).invoke((hxb) obj);
                return rih1Var;
            case 12:
                return new qr80(((long) ((int) (((Number) ven0Var.getValue()).floatValue() * ((wat) obj).X0(50.0f)))) & 4294967295L);
            case 13:
                ((Number) obj).intValue();
                ven0Var.setValue(Boolean.TRUE);
                return rih1Var;
            case 14:
                if (((Number) obj).floatValue() == 0.0f) {
                    ven0Var.setValue(Boolean.TRUE);
                }
                return rih1Var;
            case 15:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 16:
                ven0Var.setValue((Object) null);
                return rih1Var;
            case 17:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ven0Var.setValue((VideoSurfaceView) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                pzm.k(((y9e1) obj).b.f > 1 ? 4.0f : 0.0f, ven0Var);
                return rih1Var;
            case 20:
                ven0Var.setValue(Integer.valueOf(((Number) obj).intValue()));
                return rih1Var;
            case 21:
                ven0Var.setValue(Integer.valueOf((int) (((yr80) obj).a & 4294967295L)));
                return rih1Var;
            case 22:
                return new qr80((((long) ((int) Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a & 4294967295L)))) & 4294967295L) | (((long) ((int) Float.intBitsToFloat((int) (((Offset) ven0Var.getValue()).a >> 32)))) << 32));
            case 23:
                ((h660) ven0Var.getValue()).a = (cl70) obj;
                return rih1Var;
            case 24:
                lpk1 lpk1Var = (lpk1) obj;
                ((iu30) ven0Var.getValue()).invoke(new hy80(lpk1Var.a, lpk1Var.b));
                return rih1Var;
            case 25:
                ((iu30) ven0Var.getValue()).invoke(new wx80((krm0) obj));
                return rih1Var;
            case 26:
                kaa0.j(((elb0) obj).p(0L), ven0Var);
                return rih1Var;
            case 27:
                ((iu30) ven0Var.getValue()).invoke(new nra0((String) obj));
                return rih1Var;
            case 28:
                ((iu30) ven0Var.getValue()).invoke(new era0((String) obj));
                return rih1Var;
            default:
                ven0Var.setValue((krm0) obj);
                return rih1Var;
        }
    }
}
