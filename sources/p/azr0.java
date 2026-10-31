package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class azr0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ azr0(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        iho ihoVar = iho.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                ((Boolean) obj).getClass();
                iu30Var.invoke(ryr0.a);
                return rih1Var;
            case 1:
                iu30Var.invoke(new x1s0((gax) obj));
                return rih1Var;
            case 2:
                iu30Var.invoke(new x1s0((gax) obj));
                return rih1Var;
            case 3:
                iu30Var.invoke(new wat0(((c10) obj).e, (tv80) null));
                return rih1Var;
            case 4:
                iu30Var.invoke(new eis0((String) obj));
                return rih1Var;
            case 5:
                if (((hxb) obj) instanceof gxb) {
                    iu30Var.invoke(ums0.c);
                }
                return rih1Var;
            case 6:
                iu30Var.invoke(new sws0((txs0) obj));
                return rih1Var;
            case 7:
                iu30Var.invoke(new p0t0((String) obj));
                return rih1Var;
            case 8:
                iu30Var.invoke(o7h.y0((List) obj, "", (String) null, (String) null, (iu30) null, 62));
                return rih1Var;
            case 9:
                iu30Var.invoke((String) obj);
                return rih1Var;
            case 10:
                ((Boolean) obj).getClass();
                iu30Var.invoke(h3t0.a);
                return rih1Var;
            case 11:
                iu30Var.invoke(new j7t0((String) obj));
                return rih1Var;
            case 12:
                iu30Var.invoke(c8t0.a);
                return rih1Var;
            case 13:
                iu30Var.invoke(new hjt0((yq31) obj));
                return rih1Var;
            case 14:
                iu30Var.invoke(new ajt0((List) obj));
                return rih1Var;
            case 15:
                iu30Var.invoke(rwf1.c);
                return rih1Var;
            case 16:
                int iOrdinal = ((wez0) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(rwf1.d);
                } else if (iOrdinal == 1) {
                    iu30Var.invoke(rwf1.e);
                } else if (iOrdinal == 2) {
                    iu30Var.invoke(rwf1.f);
                } else if (iOrdinal == 3) {
                    iu30Var.invoke(rwf1.g);
                } else {
                    if (iOrdinal != 4) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(rwf1.h);
                }
                return rih1Var;
            case 17:
                iu30Var.invoke(new xmt0(((Boolean) obj).booleanValue()));
                return rih1Var;
            case 18:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(tgu0.f);
                return rih1Var;
            case 19:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(tgu0.e);
                return rih1Var;
            case 20:
                iu30Var.invoke(tgu0.d);
                return rih1Var;
            case 21:
                iu30Var.invoke(new vnu0((String) obj));
                return rih1Var;
            case 22:
                ((qtr) obj).b(new k1(iu30Var, (lnm) null, (byte) 25));
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                l4g0 l4g0Var = (l4g0) obj;
                iu30Var.invoke(nru0.a);
                if (l4g0Var == l4g0.b) {
                    iu30Var.invoke(oru0.a);
                }
                return rih1Var;
            case 24:
                wuu0 wuu0Var = (xuu0) obj;
                if (wuu0Var instanceof vuu0) {
                    iu30Var.invoke(kuu0.a);
                } else {
                    if (!(wuu0Var instanceof wuu0)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new nuu0(wuu0Var.a));
                }
                return rih1Var;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                y001 y001Var = (z001) obj;
                if (y001Var.equals(x001.a)) {
                    iu30Var.invoke(juu0.a);
                } else {
                    if (!(y001Var instanceof y001)) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(new muu0(y001Var.a));
                }
                return rih1Var;
            case 26:
                ((qtr) obj).b(new jaz(iu30Var, (lnm) null, (byte) 27));
                return rih1Var;
            case 27:
                iu30Var.invoke(piv0.a);
                return rih1Var;
            case 28:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(ihoVar);
                return rih1Var;
            default:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(ihoVar);
                return rih1Var;
        }
    }
}
