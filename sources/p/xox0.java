package p;

import android.view.View;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xox0 extends hab0 implements iu30 {
    public static final xox0 N0;
    public static final xox0 O0;
    public static final xox0 P0;
    public static final xox0 Q0;
    public static final xox0 R0;
    public static final xox0 S0;
    public static final xox0 T0;
    public static final xox0 U0;
    public static final xox0 V0;
    public static final xox0 W0;
    public static final xox0 X;
    public static final xox0 X0;
    public static final xox0 Y;
    public static final xox0 Y0;
    public static final xox0 Z;
    public static final xox0 Z0;
    public static final xox0 a1;
    public static final xox0 b;
    public static final xox0 b1;
    public static final xox0 c;
    public static final xox0 c1;
    public static final xox0 d;
    public static final xox0 d1;
    public static final xox0 e;
    public static final xox0 e1;
    public static final xox0 f;
    public static final xox0 g;
    public static final xox0 h;
    public static final xox0 i;
    public static final xox0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new xox0(i2, (byte) 0);
        c = new xox0(i2, (byte) 1);
        d = new xox0(i2, (byte) 2);
        e = new xox0(i2, (byte) 3);
        f = new xox0(i2, (byte) 4);
        g = new xox0(i2, (byte) 5);
        h = new xox0(i2, (byte) 6);
        i = new xox0(i2, (byte) 7);
        t = new xox0(i2, (byte) 8);
        X = new xox0(i2, (byte) 9);
        Y = new xox0(i2, (byte) 10);
        Z = new xox0(i2, (byte) 11);
        N0 = new xox0(i2, (byte) 12);
        O0 = new xox0(i2, (byte) 13);
        P0 = new xox0(i2, (byte) 14);
        Q0 = new xox0(i2, (byte) 15);
        R0 = new xox0(i2, (byte) 16);
        S0 = new xox0(i2, (byte) 17);
        T0 = new xox0(i2, (byte) 18);
        U0 = new xox0(i2, (byte) 19);
        V0 = new xox0(i2, (byte) 20);
        W0 = new xox0(i2, (byte) 21);
        X0 = new xox0(i2, (byte) 22);
        Y0 = new xox0(i2, (byte) 23);
        Z0 = new xox0(i2, (byte) 24);
        a1 = new xox0(i2, (byte) 25);
        b1 = new xox0(i2, (byte) 26);
        c1 = new xox0(i2, (byte) 27);
        d1 = new xox0(i2, (byte) 28);
        e1 = new xox0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xox0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                ((Number) obj).intValue();
                return rih1Var;
            case 1:
                return ((tkw0) obj).b();
            case 2:
                return ((tkw0) obj).b();
            case 3:
                tkw0 tkw0Var = (tkw0) obj;
                ArrayList arrayList = tkw0Var.b().e;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((nii0) it.next()).c);
                }
                mmr0 mmr0Var = new mmr0(1, o7h.p1(arrayList2));
                ArrayList arrayList3 = tkw0Var.b().e;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((nii0) it2.next()).d);
                }
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0(2, o7h.p1(arrayList4))});
            case 4:
                return new ipx0(false);
            case 5:
                return nik1.S6.a;
            case 6:
                return Boolean.valueOf(((Number) ((mmr0) obj).a).intValue() < 0);
            case 7:
                return (View) ((mmr0) obj).b;
            case 8:
                return Boolean.valueOf(((View) obj).getId() == 2131427677);
            case 9:
                List list = (List) obj;
                return new fwx0((String) list.get(0), (String) list.get(1));
            case 10:
                List list2 = (List) obj;
                List list3 = (List) list2.get(0);
                xox0 xox0Var = X;
                return new hwx0(o7h.t1(list3, 2, 2, true, xox0Var), o7h.t1((List) list2.get(1), 2, 2, true, xox0Var), 4);
            case 11:
                return rih1Var;
            case 12:
                kd31 kd31Var = (kd31) obj;
                kd31Var.E(kd31Var.T0.h() * 3.0f);
                return rih1Var;
            case 13:
                Map.Entry entry = (Map.Entry) obj;
                return cy30.p("data-", (String) entry.getKey(), "=\"", lrn1.s((String) entry.getValue()), "\"");
            case 14:
                return (String) ((mmr0) obj).a;
            case 15:
                return (String) ((mmr0) obj).b;
            case 16:
                return (rxc0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return (qxc0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return hm5.P(xay.e(3, (ni20) null), xay.f(3, (ni20) null));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return mno1.h(new mmr0[]{new mmr0("STATE_KEY_PromptableSectionElement", (c0y0) obj)});
            case 22:
                ((xas) obj).a(W0, ibi0.O0);
                return rih1Var;
            case 23:
                return ((lzx0) obj).a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return alk1.c(((k0y0) obj).e);
            case 25:
                return "user_access_personalized_recs";
            case 26:
                if (!(obj instanceof String) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (String) obj;
            case 28:
                return Boolean.valueOf(obj instanceof qxc0);
            default:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
        }
    }
}
