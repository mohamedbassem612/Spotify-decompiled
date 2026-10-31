package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tu9 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tu9(hdn0 hdn0Var, byte b) {
        super(1);
        this.a = b;
        this.b = hdn0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.b;
        switch (b) {
            case 0:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 1:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 2:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 3:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 4:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 5:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 6:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            case 7:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            case 8:
                err0Var.t((int) (((elb0) obj).b() >> 32));
                return rih1Var;
            case 9:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            case 10:
                err0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case 11:
                return Integer.valueOf(err0Var.s());
            case 12:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 13:
                return new qr80(((long) ((-err0Var.s()) / 2)) & 4294967295L);
            case 14:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 15:
                err0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case 16:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            case 17:
                err0Var.t((int) (((elb0) obj).b() >> 32));
                return rih1Var;
            case 18:
                err0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case 19:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                return rih1Var;
            case 20:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 21:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case 22:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                err0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case 24:
                err0Var.t((int) (((yr80) obj).a >> 32));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            case 26:
                return Integer.valueOf(err0Var.s());
            case 27:
                zrm0 zrm0Var = ((y9e1) obj).b;
                err0 err0Var2 = err0Var;
                err0Var2.t(jch0.U((zrm0Var.b(0) + zrm0Var.f(0)) / 2.0f));
                return rih1Var;
            case 28:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
            default:
                err0Var.t(((Number) obj).intValue());
                return rih1Var;
        }
    }
}
