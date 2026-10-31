package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final /* synthetic */ class dn implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ com.spotify.mobius.functions.Consumer b;

    public /* synthetic */ dn(com.spotify.mobius.functions.Consumer consumer, byte b) {
        this.a = b;
        this.b = consumer;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        com.spotify.mobius.functions.Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept((nn) obj);
                break;
            case 1:
                consumer.accept(kv.a);
                break;
            case 2:
                consumer.accept((w11) obj);
                break;
            case 3:
                consumer.accept((sh2) obj);
                break;
            case 4:
                consumer.accept((sh2) obj);
                break;
            case 5:
                consumer.accept((List) obj);
                break;
            case 6:
                lxd lxdVar = (lxd) obj;
                consumer.accept(new o1e(lxdVar.a, lxdVar.b));
                break;
            case 7:
                consumer.accept(new m1e(((cxd) obj).a));
                break;
            case 8:
                consumer.accept(new p1e(((mxd) obj).a));
                break;
            case 9:
                consumer.accept(new n1e(((kxd) obj).a));
                break;
            case 10:
                consumer.accept((c6g) obj);
                break;
            case 11:
                consumer.accept((v1h) obj);
                break;
            case 12:
                consumer.accept((hlh) obj);
                break;
            case 13:
                consumer.accept((u600) obj);
                break;
            case 14:
                consumer.accept(obj);
                break;
            case 15:
                xyl xylVar = (xyl) obj;
                consumer.accept(new u3m(xylVar.a, xylVar.b));
                break;
            case 16:
                consumer.accept(new y3m(((jzl) obj).a));
                break;
            case 17:
                wyl wylVar = (wyl) obj;
                consumer.accept(new t3m(wylVar.a, wylVar.b));
                break;
            case 18:
                izl izlVar = (izl) obj;
                consumer.accept(new x3m(izlVar.a, izlVar.b));
                break;
            case 19:
                consumer.accept((wan) obj);
                break;
            case 20:
                consumer.accept((htc0) obj);
                break;
            case 21:
                consumer.accept((diw) obj);
                break;
            case 22:
                consumer.accept((m700) obj);
                break;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                consumer.accept((m700) obj);
                break;
            case 24:
                consumer.accept((ef50) obj);
                break;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                consumer.accept((azd0) obj);
                break;
            case 26:
                consumer.accept((azd0) obj);
                break;
            case 27:
                consumer.accept((wxd0) obj);
                break;
            case 28:
                consumer.accept((azd0) obj);
                break;
            default:
                consumer.accept(new bbl((kbl) obj));
                break;
        }
    }
}
