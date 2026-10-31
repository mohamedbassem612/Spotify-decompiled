package p;

import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xg50 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ xg50(List list, byte b) {
        this.a = b;
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
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return z860.c1.invoke(list.get(((Number) obj).intValue()));
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return ((qi60) list.get(((Number) obj).intValue())).getKey();
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                list.get(((Number) obj).intValue());
                return null;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                return acq0.N((fw90) list.get(((Number) obj).intValue()), "participant");
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                return acq0.N((fw90) list.get(((Number) obj).intValue()), "listenAlong");
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                list.get(((Number) obj).intValue());
                return null;
            case 15:
                return ((rib0) list.get(((Number) obj).intValue())).a();
            case 16:
                list.get(((Number) obj).intValue());
                return null;
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case 18:
                return ((h8k1) list.get(((Number) obj).intValue())).b;
            case 19:
                return ((h8k1) list.get(((Number) obj).intValue())).a.getClass();
            case 20:
                list.get(((Number) obj).intValue());
                return null;
            case 21:
                int iIntValue2 = ((Number) obj).intValue();
                return x5d0.f.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 22:
                list.get(((Number) obj).intValue());
                return null;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                int iIntValue3 = ((Number) obj).intValue();
                return ab80.m(((aoe0) list.get(iIntValue3)).c, iIntValue3, ":");
            case 24:
                list.get(((Number) obj).intValue());
                return null;
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return Integer.valueOf(((aoe0) list.get(((Number) obj).intValue())).c);
            case 26:
                list.get(((Number) obj).intValue());
                return null;
            case 27:
                nhe0 nhe0Var = (nhe0) list.get(((Number) obj).intValue());
                Integer num = nhe0Var.c;
                return num == null ? nhe0Var.a : num;
            case 28:
                list.get(((Number) obj).intValue());
                return null;
            default:
                list.get(((Number) obj).intValue());
                return null;
        }
    }
}
