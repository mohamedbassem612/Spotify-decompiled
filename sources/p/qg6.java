package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class qg6 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ drr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg6(drr0 drr0Var, byte b) {
        super(1);
        this.a = b;
        this.b = drr0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drr0 drr0Var = this.b;
        switch (b) {
            case 0:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 1:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 2:
                float fFloatValue = ((Number) ((o95) obj).e()).floatValue();
                lee1 lee1Var = g3c.a;
                drr0Var.t(fFloatValue);
                return rih1Var;
            case 3:
                float fFloatValue2 = ((Number) ((o95) obj).e()).floatValue();
                lee1 lee1Var2 = g3c.a;
                drr0Var.t(fFloatValue2);
                return rih1Var;
            case 4:
                float fFloatValue3 = ((Number) ((o95) obj).e()).floatValue();
                lee1 lee1Var3 = g3c.a;
                drr0Var.t(fFloatValue3);
                return rih1Var;
            case 5:
                float fFloatValue4 = ((Number) obj).floatValue();
                lee1 lee1Var4 = g3c.a;
                drr0Var.t(fFloatValue4);
                return rih1Var;
            case 6:
                float fFloatValue5 = ((Number) obj).floatValue();
                lee1 lee1Var5 = g3c.a;
                drr0Var.t(fFloatValue5);
                return rih1Var;
            case 7:
                return new qr80(((long) jch0.U(drr0Var.s())) & 4294967295L);
            case 8:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 9:
                drr0Var.t(Float.intBitsToFloat((int) (((elb0) obj).O(0L) & 4294967295L)));
                return rih1Var;
            case 10:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 11:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 12:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 13:
                drr0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 14:
                drr0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 15:
                elb0 elb0Var = (elb0) obj;
                drr0Var.t(Float.intBitsToFloat((int) (elb0Var.O(0L) & 4294967295L)) + ((int) (elb0Var.b() & 4294967295L)));
                return rih1Var;
            case 16:
                drr0Var.t(((((Number) obj).longValue() / 1000000) % 8000) * 0.045f);
                return rih1Var;
            case 17:
                drr0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 18:
                drr0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 19:
                drr0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 20:
                float f = (int) (((yr80) obj).a & 4294967295L);
                float f2 = zfz0.c;
                drr0Var.t(f);
                return rih1Var;
            case 21:
                drr0Var.t(((Number) obj).floatValue());
                return rih1Var;
            case 22:
                drr0Var.t(((Number) obj).intValue() / 100.0f);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                kd31 kd31Var = (kd31) obj;
                kd31Var.p(drr0Var.s());
                kd31Var.b(0.5f);
                return rih1Var;
            case 24:
                elb0 elb0Var2 = (elb0) obj;
                drr0Var.t(((int) (nho1.v(elb0Var2).b() & 4294967295L)) - Float.intBitsToFloat((int) (elb0Var2.O(0L) & 4294967295L)));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                drr0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 26:
                drr0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 27:
                drr0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case 28:
                drr0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            default:
                drr0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
        }
    }
}
