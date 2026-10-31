package p;

import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kwd implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ kwd(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        List list = this.b;
        switch (b) {
            case 0:
                return ((gzd) list.get(((Number) obj).intValue())).a;
            case 1:
                list.get(((Number) obj).intValue());
                return null;
            case 2:
                return Integer.valueOf(((dwl) list.get(((Number) obj).intValue())).hashCode());
            case 3:
                list.get(((Number) obj).intValue());
                return null;
            case 4:
                return ((tkf) list.get(((Number) obj).intValue())).a;
            case 5:
                list.get(((Number) obj).intValue());
                return null;
            case 6:
                return ((tkf) list.get(((Number) obj).intValue())).a;
            case 7:
                list.get(((Number) obj).intValue());
                return null;
            case 8:
                return ((goe) list.get(((Number) obj).intValue())).a;
            case 9:
                list.get(((Number) obj).intValue());
                return null;
            case 10:
                return ((vpf) list.get(((Number) obj).intValue())).a;
            case 11:
                list.get(((Number) obj).intValue());
                return null;
            case 12:
                return cgh.e1.invoke(list.get(((Number) obj).intValue()));
            case 13:
                list.get(((Number) obj).intValue());
                return null;
            case 14:
                int iIntValue = ((Number) obj).intValue();
                return rng.c1.invoke(Integer.valueOf(iIntValue), list.get(iIntValue));
            case 15:
                list.get(((Number) obj).intValue());
                return null;
            case 16:
                return ((aw7) list.get(((Number) obj).intValue())).b;
            case 17:
                list.get(((Number) obj).intValue());
                return null;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return Integer.valueOf(((jj40) list.get(((Number) obj).intValue())).b);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                list.get(((Number) obj).intValue());
                return null;
            case 20:
                return Integer.valueOf(((jj40) list.get(((Number) obj).intValue())).b);
            case 21:
                list.get(((Number) obj).intValue());
                return null;
            case 22:
                return l1d.m("item_", ((hwq) list.get(((Number) obj).intValue())).g.a());
            case 23:
                return "section_below_".concat((String) list.get(((Number) obj).intValue()));
            case 24:
                return l1d.m("section_below_", (String) list.get(((Number) obj).intValue()));
            case 25:
                return l1d.m("item_", ((hwq) list.get(((Number) obj).intValue())).g.a());
            case 26:
                list.get(((Number) obj).intValue());
                return null;
            case 27:
                int iIntValue2 = ((Number) obj).intValue();
                return yzj.Q0.invoke(Integer.valueOf(iIntValue2), list.get(iIntValue2));
            case 28:
                list.get(((Number) obj).intValue());
                return null;
            default:
                return ((wol) list.get(((Number) obj).intValue())).a;
        }
    }
}
