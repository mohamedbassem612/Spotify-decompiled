package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class jwa0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jwa0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        azz0 azz0Var = azz0.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new u100((String) obj));
                return rih1Var;
            case 1:
                iu30Var.invoke(new m200((String) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 3:
                ((Boolean) obj).getClass();
                iu30Var.invoke(zeb0.a);
                return rih1Var;
            case 4:
                iu30Var.invoke((zxb0) obj);
                return rih1Var;
            case 5:
                iu30Var.invoke((zxb0) obj);
                return rih1Var;
            case 6:
                iu30Var.invoke(new l200(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 7:
                iu30Var.invoke(new t100(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 8:
                iu30Var.invoke(new u100((String) obj));
                return rih1Var;
            case 9:
                iu30Var.invoke(new j200((String) obj));
                return rih1Var;
            case 10:
                iu30Var.invoke(new m200((String) obj));
                return rih1Var;
            case 11:
                iu30Var.invoke(new d7c0((b7c0) obj));
                return rih1Var;
            case 12:
                eec0 eec0Var = (fec0) obj;
                if (eec0Var instanceof bec0) {
                    iu30Var.invoke(gdc0.a);
                } else if (eec0Var instanceof eec0) {
                    hec0 hec0Var = eec0Var.a;
                    iu30Var.invoke(new fdc0(hec0Var.b, hec0Var.d));
                } else if (eec0Var instanceof dec0) {
                    hec0 hec0Var2 = ((dec0) eec0Var).a;
                    iu30Var.invoke(new edc0(hec0Var2.b, hec0Var2.d));
                } else {
                    if (!(eec0Var instanceof cec0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(hdc0.a);
                }
                return rih1Var;
            case 13:
                iu30Var.invoke(new opc0((qnc0) obj));
                return rih1Var;
            case 14:
                hxb hxbVar = (hxb) obj;
                if ((hxbVar instanceof gxb) || (hxbVar instanceof fxb)) {
                    iu30Var.invoke(w5d0.c);
                } else if (!(hxbVar instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 15:
                hxb hxbVar2 = (hxb) obj;
                if ((hxbVar2 instanceof gxb) || (hxbVar2 instanceof fxb)) {
                    iu30Var.invoke(z6d0.b);
                } else if (!(hxbVar2 instanceof exb)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 16:
                iu30Var.invoke(new s9d0((gax) obj));
                return rih1Var;
            case 17:
                return new hnd0((ymd0) iu30Var.invoke(obj));
            case 18:
                return new hnd0((ymd0) iu30Var.invoke(obj));
            case 19:
                iu30Var.invoke(azz0Var);
                iu30Var.invoke(new fzz0(((s201) obj).a));
                return rih1Var;
            case 20:
                tv80 tv80Var = (tv80) obj;
                iu30Var.invoke(azz0Var);
                iu30Var.invoke(new czz0(tv80Var != null ? tv80Var.a : null));
                return rih1Var;
            case 21:
                if (((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(lee0.b);
                } else {
                    iu30Var.invoke(lee0.a);
                }
                return rih1Var;
            case 22:
                return (Boolean) iu30Var.invoke(obj);
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return Boolean.valueOf(!((Boolean) iu30Var.invoke(obj)).booleanValue());
            case 24:
                iu30Var.invoke(new lme0((String) obj));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                if (((wef0) obj).equals(wef0.a)) {
                    iu30Var.invoke(lef0.a);
                    return rih1Var;
                }
                eg.o();
                return null;
            case 26:
                iu30Var.invoke(new hgf0((gpf0) obj));
                return rih1Var;
            case 27:
                hsf0 hsf0Var = (ksf0) obj;
                if (hsf0Var instanceof jsf0) {
                    jsf0 jsf0Var = (jsf0) hsf0Var;
                    iu30Var.invoke(new hjf0(jsf0Var.a, jsf0Var.b));
                } else {
                    if (!(hsf0Var instanceof hsf0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new oif0(hsf0Var.a));
                }
                return rih1Var;
            case 28:
                iu30Var.invoke((Function0) obj);
                return rih1Var;
            default:
                iu30Var.invoke((Function0) obj);
                return rih1Var;
        }
    }
}
