package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class myg0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ myg0(hdn0 hdn0Var, byte b) {
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
                err0Var.t(((Number) obj).intValue());
                break;
            case 1:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 2:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 3:
                err0Var.t((int) (((elb0) obj).b() >> 32));
                break;
            case 4:
                err0Var.t((int) (((yr80) obj).a >> 32));
                break;
            case 5:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 6:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 7:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 8:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 9:
                int i = (int) (((yr80) obj).a & 4294967295L);
                err0 err0Var2 = err0Var;
                if (i > err0Var2.s()) {
                    err0Var2.t(i);
                }
                break;
            case 10:
                int iIntBitsToFloat = (int) Float.intBitsToFloat((int) (((elb0) obj).p(0L) & 4294967295L));
                err0Var.t(iIntBitsToFloat >= 0 ? iIntBitsToFloat : 0);
                break;
            case 11:
                long j = ((yr80) obj).a;
                err0 err0Var3 = err0Var;
                if (err0Var3.s() == 0) {
                    err0Var3.t((int) (j & 4294967295L));
                }
                break;
            case 12:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 13:
                int iIntBitsToFloat2 = (int) Float.intBitsToFloat((int) (((elb0) obj).p(0L) & 4294967295L));
                err0Var.t(iIntBitsToFloat2 >= 0 ? iIntBitsToFloat2 : 0);
                break;
            case 14:
                err0 err0Var4 = err0Var;
                err0Var4.t(Math.max(err0Var4.s(), (int) (((yr80) obj).a & 4294967295L)));
                break;
            case 15:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 16:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 17:
                int iIntValue = ((Number) obj).intValue() - 1;
                id01 id01Var = zc01.a;
                err0Var.t(iIntValue);
                break;
            case 18:
                err0Var.t(((Number) obj).intValue());
                break;
            case 19:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
            case 20:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 21:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 22:
                int iIntValue2 = ((Number) obj).intValue();
                if (iIntValue2 > 3) {
                    iIntValue2 = 3;
                }
                err0 err0Var5 = err0Var;
                if (iIntValue2 != err0Var5.s()) {
                    err0Var5.t(iIntValue2);
                }
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case 24:
                err0Var.t((int) (((elb0) obj).b() & 4294967295L));
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                int i2 = (int) (((yr80) obj).a >> 32);
                err0 err0Var6 = err0Var;
                if (i2 != err0Var6.s()) {
                    err0Var6.t(i2);
                }
                break;
            case 26:
                err0Var.t(((Number) obj).intValue());
                break;
            case 27:
                err0Var.t(((Number) obj).intValue());
                break;
            case 28:
                err0Var.t(((Number) obj).intValue());
                break;
            default:
                err0Var.t((int) (((yr80) obj).a & 4294967295L));
                break;
        }
        return rih1Var;
    }
}
