package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.betamax.player.VideoSurfaceView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eyg1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tob1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ eyg1(tob1 tob1Var, byte b) {
        super(1);
        this.a = b;
        this.b = tob1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tob1 tob1Var = this.b;
        switch (b) {
            case 0:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 1:
                kd31 kd31Var = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var, 2);
                float fH = kd31Var.T0.h() * 50.0f;
                float fFloatValue = ((Number) tob1Var.getValue()).floatValue();
                kd31Var.E(fH * (fFloatValue >= 0.0f ? fFloatValue : 0.0f));
                return rih1Var;
            case 2:
                kd31 kd31Var2 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var2, 2);
                float fH2 = kd31Var2.T0.h() * 50.0f;
                float fFloatValue2 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var2.E(fH2 * (fFloatValue2 >= 0.0f ? fFloatValue2 : 0.0f));
                return rih1Var;
            case 3:
                kd31 kd31Var3 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var3, 2);
                float fH3 = kd31Var3.T0.h() * 50.0f;
                float fFloatValue3 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var3.E(fH3 * (fFloatValue3 >= 0.0f ? fFloatValue3 : 0.0f));
                return rih1Var;
            case 4:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case 5:
                kd31 kd31Var4 = (kd31) obj;
                kd31Var4.b(1.0f - (tob1Var != null ? ((Number) tob1Var.getValue()).floatValue() : 1.0f));
                kd31Var4.i(2);
                return rih1Var;
            case 6:
                kd31 kd31Var5 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var5, 2);
                float fH4 = kd31Var5.T0.h() * 50.0f;
                float fFloatValue4 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var5.E(fH4 * (fFloatValue4 >= 0.0f ? fFloatValue4 : 0.0f));
                return rih1Var;
            case 7:
                t5k t5kVar = (t5k) obj;
                if (t5kVar instanceof t5k) {
                    ((iu30) tob1Var.getValue()).invoke(new pxi1(t5kVar.a, t5kVar.b));
                    return rih1Var;
                }
                eg.o();
                return null;
            case 8:
                kd31 kd31Var6 = (kd31) obj;
                kd31Var6.q(((Number) tob1Var.getValue()).floatValue());
                kd31Var6.r(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 9:
                kd31 kd31Var7 = (kd31) obj;
                float fH5 = kd31Var7.T0.h() * ((Number) tob1Var.getValue()).floatValue();
                cr31 cr31Var = er31.a;
                tyy0 tyy0VarF = nko1.f(fH5);
                kd31Var7.w(new cr31(tyy0VarF, tyy0VarF, tyy0VarF, tyy0VarF));
                kd31Var7.f(true);
                return rih1Var;
            case 10:
                VideoSurfaceView videoSurfaceView = (VideoSurfaceView) obj;
                r091 r091Var = (r091) tob1Var.getValue();
                if (r091Var != null) {
                    r091Var.i(videoSurfaceView);
                }
                return rih1Var;
            case 11:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 12:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 13:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 14:
                ((kd31) obj).b(((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 15:
                ((kd31) obj).C(-((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 16:
                kd31 kd31Var8 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var8, 2);
                float fH6 = kd31Var8.T0.h() * gdm1.b;
                float fFloatValue5 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var8.E(fH6 * (fFloatValue5 >= 0.0f ? fFloatValue5 : 0.0f));
                return rih1Var;
            case 17:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                zjy.m((Number) tob1Var.getValue(), (kd31) obj, 2);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                kd31 kd31Var9 = (kd31) obj;
                float fFloatValue6 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var9.q(fFloatValue6);
                kd31Var9.r(fFloatValue6);
                return rih1Var;
            case 20:
                ((kd31) obj).b(1.0f - ((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 21:
                ((kd31) obj).b(1.0f - ((Number) tob1Var.getValue()).floatValue());
                return rih1Var;
            case 22:
                kd31 kd31Var10 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var10, 2);
                float fH7 = kd31Var10.T0.h() * sdm1.g;
                float fFloatValue7 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var10.E(fH7 * (fFloatValue7 >= 0.0f ? fFloatValue7 : 0.0f));
                return rih1Var;
            case 23:
                kd31 kd31Var11 = (kd31) obj;
                zjy.l((Number) tob1Var.getValue(), 1.0f, kd31Var11, 2);
                float fH8 = kd31Var11.T0.h() * sdm1.g;
                float fFloatValue8 = ((Number) tob1Var.getValue()).floatValue();
                kd31Var11.E(fH8 * (fFloatValue8 >= 0.0f ? fFloatValue8 : 0.0f));
                return rih1Var;
            default:
                zjy.l((Number) tob1Var.getValue(), 1.0f, (kd31) obj, 2);
                return rih1Var;
        }
    }
}
