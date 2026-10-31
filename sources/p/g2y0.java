package p;

import android.util.Base64;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import j$.net.URLEncoder;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class g2y0 extends hab0 implements iu30 {
    public static final g2y0 N0;
    public static final g2y0 O0;
    public static final g2y0 P0;
    public static final g2y0 Q0;
    public static final g2y0 R0;
    public static final g2y0 S0;
    public static final g2y0 T0;
    public static final g2y0 U0;
    public static final g2y0 V0;
    public static final g2y0 W0;
    public static final g2y0 X;
    public static final g2y0 X0;
    public static final g2y0 Y;
    public static final g2y0 Y0;
    public static final g2y0 Z;
    public static final g2y0 Z0;
    public static final g2y0 a1;
    public static final g2y0 b;
    public static final g2y0 b1;
    public static final g2y0 c;
    public static final g2y0 c1;
    public static final g2y0 d;
    public static final g2y0 d1;
    public static final g2y0 e;
    public static final g2y0 e1;
    public static final g2y0 f;
    public static final g2y0 g;
    public static final g2y0 h;
    public static final g2y0 i;
    public static final g2y0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new g2y0(i2, (byte) 0);
        c = new g2y0(i2, (byte) 1);
        d = new g2y0(i2, (byte) 2);
        e = new g2y0(i2, (byte) 3);
        f = new g2y0(i2, (byte) 4);
        g = new g2y0(i2, (byte) 5);
        h = new g2y0(i2, (byte) 6);
        i = new g2y0(i2, (byte) 7);
        t = new g2y0(i2, (byte) 8);
        X = new g2y0(i2, (byte) 9);
        Y = new g2y0(i2, (byte) 10);
        Z = new g2y0(i2, (byte) 11);
        N0 = new g2y0(i2, (byte) 12);
        O0 = new g2y0(i2, (byte) 13);
        P0 = new g2y0(i2, (byte) 14);
        Q0 = new g2y0(i2, (byte) 15);
        R0 = new g2y0(i2, (byte) 16);
        S0 = new g2y0(i2, (byte) 17);
        T0 = new g2y0(i2, (byte) 18);
        U0 = new g2y0(i2, (byte) 19);
        V0 = new g2y0(i2, (byte) 20);
        W0 = new g2y0(i2, (byte) 21);
        X0 = new g2y0(i2, (byte) 22);
        Y0 = new g2y0(i2, (byte) 23);
        Z0 = new g2y0(i2, (byte) 24);
        a1 = new g2y0(i2, (byte) 25);
        b1 = new g2y0(i2, (byte) 26);
        c1 = new g2y0(i2, (byte) 27);
        d1 = new g2y0(i2, (byte) 28);
        e1 = new g2y0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g2y0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String string;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        String str = "";
        switch (b2) {
            case 0:
                return (qxc0) obj;
            case 1:
                return d2y0.a;
            case 2:
                return Boolean.valueOf(obj instanceof qxc0);
            case 3:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 4:
                return Integer.valueOf(-((Number) obj).intValue());
            case 5:
                return Integer.valueOf(-((Number) obj).intValue());
            case 6:
                return Integer.valueOf(((Number) obj).intValue());
            case 7:
                return Integer.valueOf(((Number) obj).intValue());
            case 8:
                ((Number) obj).intValue();
                return rih1Var;
            case 9:
                return (qxc0) obj;
            case 10:
                kby kbyVar = ((cxc0) obj).f;
                String str2 = kbyVar.a;
                Map map = kbyVar.q;
                Set set = h4d0.a;
                String str3 = (String) map.get("generation_status");
                if (str3 != null && (string = ihc1.e1(str3).toString()) != null) {
                    str = string;
                }
                return new yd40(str2, qyo1.u(str));
            case 11:
                return Boolean.valueOf(obj instanceof qxc0);
            case 12:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 13:
                return ((n3l0) obj).a(o3y0.e);
            case 14:
                return new g4d0((String) obj);
            case 15:
                return (g3d0) obj;
            case 16:
                return Boolean.valueOf(obj instanceof g3d0);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj != null) {
                    return (g3d0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.ListSortOrder");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (qxc0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return a4y0.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                kby kbyVar2 = ((cxc0) obj).f;
                String str4 = (String) kbyVar2.q.get("prompt");
                if (str4 == null) {
                    str4 = "";
                }
                String str5 = (String) kbyVar2.q.get("prompt_summary");
                return new deh1(str5 != null ? str5 : "", str4);
            case 23:
                mmr0 mmr0Var = (mmr0) obj;
                return xcg1.i((String) mmr0Var.a, "=", URLEncoder.encode((String) mmr0Var.b, "UTF-8"));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return (qxc0) obj;
            case 25:
                kby kbyVar3 = ((cxc0) obj).f;
                String str6 = kbyVar3.a;
                String str7 = (String) kbyVar3.q.get("spotbot_message_id");
                if (str7 == null) {
                    str7 = "";
                }
                return new q4y0(Base64.encodeToString(o7h.y0(p7h.M(new mmr0[]{new mmr0("requestId", str6), new mmr0("messageId", str7), new mmr0("userPrompt", ""), new mmr0("title", ""), new mmr0("contentDescription", ""), new mmr0("itemsInResponse", o7h.y0(z6x.a, ",", (String) null, (String) null, (iu30) null, 62))}), "&", (String) null, (String) null, Y0, 30).getBytes(nne.a), 2));
            case 26:
                return Boolean.valueOf(obj instanceof qxc0);
            case 27:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 28:
                return rih1Var;
            default:
                return (qxc0) obj;
        }
    }
}
