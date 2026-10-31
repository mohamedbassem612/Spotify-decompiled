package p;

import com.spotify.libraryimportservice.tmm.UnmatchedItem;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ehf0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public ehf0(List list) {
        this.a = (byte) 7;
        bhg0 bhg0Var = bhg0.b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                list.get(((Number) obj).intValue());
                return null;
            case 1:
                int iIntValue = ((Number) obj).intValue();
                return Integer.valueOf(iIntValue);
            case 2:
                list.get(((Number) obj).intValue());
                return null;
            case 3:
                return (String) list.get(((Number) obj).intValue());
            case 4:
                list.get(((Number) obj).intValue());
                return null;
            case 5:
                return l1d.m("request-", ((ffs0) list.get(((Number) obj).intValue())).getRequestId());
            case 6:
                return "request";
            case 7:
                return bhg0.b.get(list.get(((Number) obj).intValue()));
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                return l1d.m("unavailable_", ((UnmatchedItem) list.get(((Number) obj).intValue())).getId());
            case 10:
                list.get(((Number) obj).intValue());
                return null;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                return Long.valueOf(((xoh0) list.get(((Number) obj).intValue())).a);
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                int iIntValue2 = ((Number) obj).intValue();
                return m2j0.b.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                int iIntValue3 = ((Number) obj).intValue();
                return m2j0.f.invoke(Integer.valueOf(iIntValue3), list.get(iIntValue3));
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case 18:
                return ((fy00) list.get(((Number) obj).intValue())).a;
            case 19:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                return ((di90) list.get(((Number) obj).intValue())).a;
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                return Integer.valueOf(list.get(((Number) obj).intValue()).hashCode());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                list.get(((Number) obj).intValue());
                return null;
            case 24:
                list.get(((Number) obj).intValue());
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                list.get(((Number) obj).intValue());
                return null;
            case 26:
                return l1d.m("approved-request-", ((gin0) list.get(((Number) obj).intValue())).a);
            case 27:
                return "approved_request";
            case 28:
                return l1d.m("pending-request-", ((gin0) list.get(((Number) obj).intValue())).a);
            default:
                return "pending_request";
        }
    }

    public /* synthetic */ ehf0(List list, byte b) {
        this.a = b;
        this.b = list;
    }
}
