package p;

import android.view.ViewGroup;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class po60 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po60(int i, byte b) {
        super(1);
        this.a = b;
        this.b = i;
    }

    public final Object invoke(Object obj) throws Exception {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return Integer.valueOf(i);
            case 1:
                ((Number) obj).intValue();
                return Integer.valueOf(i);
            case 2:
                b261.l((e261) obj, new f4h(i, 0));
                return rih1Var;
            case 3:
                qhl qhlVar = (qhl) obj;
                qhlVar.setMargins(((ViewGroup.MarginLayoutParams) qhlVar).leftMargin, ((ViewGroup.MarginLayoutParams) qhlVar).topMargin, i, ((ViewGroup.MarginLayoutParams) qhlVar).bottomMargin);
                return rih1Var;
            case 4:
                ((qhl) obj).setMargins(i, i, i * 2, i);
                return rih1Var;
            case 5:
                qhl qhlVar2 = (qhl) obj;
                qhlVar2.setMargins(((ViewGroup.MarginLayoutParams) qhlVar2).leftMargin, ((ViewGroup.MarginLayoutParams) qhlVar2).topMargin, i, ((ViewGroup.MarginLayoutParams) qhlVar2).bottomMargin);
                return rih1Var;
            case 6:
                ((ViewGroup.MarginLayoutParams) ((qhl) obj)).topMargin = i;
                return rih1Var;
            case 7:
                qhl qhlVar3 = (qhl) obj;
                qhlVar3.setMargins(i, ((ViewGroup.MarginLayoutParams) qhlVar3).topMargin, i / 2, ((ViewGroup.MarginLayoutParams) qhlVar3).bottomMargin);
                return rih1Var;
            case 8:
                ((qhl) obj).setMargins(i, i, i * 2, i);
                return rih1Var;
            case 9:
                return new k3h1(i);
            case 10:
                b261.l((e261) obj, new f4h(i, 0));
                return rih1Var;
            case 11:
                return Boolean.valueOf(((Number) obj).intValue() == i);
            case 12:
                return new k3h1(i);
            case 13:
                return new k3h1(i);
            case 14:
                phg0 phg0Var = (phg0) obj;
                boolean z = phg0Var.c == i;
                Boolean boolValueOf = Boolean.valueOf(z);
                if (z) {
                    phg0Var.a.dispose();
                }
                return boolValueOf;
            case 15:
                b261.B((e261) obj, String.format("more-like-card-%s", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                return rih1Var;
            case 16:
                b261.B((e261) obj, String.format("more-like-list-ctx-menu-%s", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                b261.B((e261) obj, String.format("more-like-list-%s", Arrays.copyOf(new Object[]{Integer.valueOf(i)}, 1)));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(((w5o0) obj).startNestedScroll(i));
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new k3h1(i);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new k3h1(i);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return hm5.P(xay.e(2, irn1.o0(i, 0, (dlv) null, 6)), xay.f(2, irn1.o0(i, 0, (dlv) null, 6)));
            case 22:
                return new k3h1(i);
            case 23:
                return te01.a((te01) obj, i, 0, 0, 14);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return te01.a((te01) obj, 0, i, 0, 13);
            case 25:
                return te01.a((te01) obj, 0, 0, i, 11);
            case 26:
                return ((xa5) obj).b() instanceof fl01 ? hm5.P(xay.e(2, irn1.o0(i, 0, (dlv) null, 6)), xay.f(2, irn1.o0(i, 0, (dlv) null, 6))) : hm5.P(bby.b, ln00.b);
            case 27:
                d441 d441VarG1 = ((y341) obj).g1("DELETE FROM recent_locations WHERE geoNameId = ?");
                try {
                    d441VarG1.r(1, i);
                    d441VarG1.f1();
                    return rih1Var;
                } finally {
                    d441VarG1.close();
                }
            case 28:
                return new k3h1(i);
            default:
                return new k3h1(i);
        }
    }
}
