package p;

import android.content.Context;
import android.content.ContextWrapper;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jqa0 extends hab0 implements iu30 {
    public static final jqa0 N0;
    public static final jqa0 O0;
    public static final jqa0 P0;
    public static final jqa0 Q0;
    public static final jqa0 R0;
    public static final jqa0 S0;
    public static final jqa0 T0;
    public static final jqa0 U0;
    public static final jqa0 V0;
    public static final jqa0 W0;
    public static final jqa0 X;
    public static final jqa0 X0;
    public static final jqa0 Y;
    public static final jqa0 Y0;
    public static final jqa0 Z;
    public static final jqa0 Z0;
    public static final jqa0 a1;
    public static final jqa0 b;
    public static final jqa0 b1;
    public static final jqa0 c;
    public static final jqa0 c1;
    public static final jqa0 d;
    public static final jqa0 d1;
    public static final jqa0 e;
    public static final jqa0 e1;
    public static final jqa0 f;
    public static final jqa0 g;
    public static final jqa0 h;
    public static final jqa0 i;
    public static final jqa0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new jqa0(i2, (byte) 0);
        c = new jqa0(i2, (byte) 1);
        d = new jqa0(i2, (byte) 2);
        e = new jqa0(i2, (byte) 3);
        f = new jqa0(i2, (byte) 4);
        g = new jqa0(i2, (byte) 5);
        h = new jqa0(i2, (byte) 6);
        i = new jqa0(i2, (byte) 7);
        t = new jqa0(i2, (byte) 8);
        X = new jqa0(i2, (byte) 9);
        Y = new jqa0(i2, (byte) 10);
        Z = new jqa0(i2, (byte) 11);
        N0 = new jqa0(i2, (byte) 12);
        O0 = new jqa0(i2, (byte) 13);
        P0 = new jqa0(i2, (byte) 14);
        Q0 = new jqa0(i2, (byte) 15);
        R0 = new jqa0(i2, (byte) 16);
        S0 = new jqa0(i2, (byte) 17);
        T0 = new jqa0(i2, (byte) 18);
        U0 = new jqa0(i2, (byte) 19);
        V0 = new jqa0(i2, (byte) 20);
        W0 = new jqa0(i2, (byte) 21);
        X0 = new jqa0(i2, (byte) 22);
        Y0 = new jqa0(i2, (byte) 23);
        Z0 = new jqa0(i2, (byte) 24);
        a1 = new jqa0(i2, (byte) 25);
        b1 = new jqa0(i2, (byte) 26);
        c1 = new jqa0(i2, (byte) 27);
        d1 = new jqa0(i2, (byte) 28);
        e1 = new jqa0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jqa0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                Context context = (Context) obj;
                ContextWrapper contextWrapper = context instanceof ContextWrapper ? (ContextWrapper) context : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            case 1:
                return Integer.valueOf(((Number) obj).intValue());
            case 2:
                return Integer.valueOf(((Number) obj).intValue());
            case 3:
                return new qva0("", 1, xgk1.a);
            case 4:
                return mno1.h(new mmr0[]{new mmr0("coppa_page_model", (d4n) obj)});
            case 5:
                return rih1Var;
            case 6:
                b261.c((e261) obj);
                return rih1Var;
            case 7:
                return mno1.h(new mmr0[]{new mmr0("legal_page_model", (n2c0) obj)});
            case 8:
                return mno1.h(new mmr0[]{new mmr0("parental_controls_model_key", (hxa0) obj)});
            case 9:
                return mno1.h(new mmr0[]{new mmr0("model", (svr0) obj)});
            case 10:
                return mno1.h(new mmr0[]{new mmr0("kid_account_transition_consent_model", (mya0) obj)});
            case 11:
                return "kids-family-exclude-enabled";
            case 12:
                return ((nwl0) obj).a("spotify:internal:main-site:account:parental-consent:create-managed-account");
            case 13:
                return new u0b0(x0b0.e);
            case 14:
                return ((g7e) obj).a;
            case 15:
                return ((g7e) obj).a;
            case 16:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof jo70);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (dmh1) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (String) obj;
            case 22:
                return (fhd0) obj;
            case 23:
                return qed0.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return Boolean.valueOf(obj instanceof fhd0);
            case 25:
                if (obj != null) {
                    return (fhd0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listeningactivity.data.api.ListeningActivityTableValue");
                return null;
            case 26:
                return (dr11) obj;
            case 27:
                return (String) obj;
            case 28:
                l1z l1zVar = (l1z) obj;
                if (l1zVar != null) {
                    return l1zVar.c;
                }
                return null;
            default:
                i1r i1rVar = (k1r) obj;
                i1r i1rVar2 = i1rVar instanceof i1r ? i1rVar : null;
                if (i1rVar2 != null) {
                    return (String) i1rVar2.a;
                }
                return null;
        }
    }
}
