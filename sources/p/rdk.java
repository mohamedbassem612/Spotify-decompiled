package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rdk extends hab0 implements iu30 {
    public static final rdk N0;
    public static final rdk O0;
    public static final rdk P0;
    public static final rdk Q0;
    public static final rdk R0;
    public static final rdk S0;
    public static final rdk T0;
    public static final rdk U0;
    public static final rdk V0;
    public static final rdk W0;
    public static final rdk X;
    public static final rdk X0;
    public static final rdk Y;
    public static final rdk Y0;
    public static final rdk Z;
    public static final rdk Z0;
    public static final rdk a1;
    public static final rdk b;
    public static final rdk b1;
    public static final rdk c;
    public static final rdk c1;
    public static final rdk d;
    public static final rdk d1;
    public static final rdk e;
    public static final rdk e1;
    public static final rdk f;
    public static final rdk g;
    public static final rdk h;
    public static final rdk i;
    public static final rdk t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rdk(i2, (byte) 0);
        c = new rdk(i2, (byte) 1);
        d = new rdk(i2, (byte) 2);
        e = new rdk(i2, (byte) 3);
        f = new rdk(i2, (byte) 4);
        g = new rdk(i2, (byte) 5);
        h = new rdk(i2, (byte) 6);
        i = new rdk(i2, (byte) 7);
        t = new rdk(i2, (byte) 8);
        X = new rdk(i2, (byte) 9);
        Y = new rdk(i2, (byte) 10);
        Z = new rdk(i2, (byte) 11);
        N0 = new rdk(i2, (byte) 12);
        O0 = new rdk(i2, (byte) 13);
        P0 = new rdk(i2, (byte) 14);
        Q0 = new rdk(i2, (byte) 15);
        R0 = new rdk(i2, (byte) 16);
        S0 = new rdk(i2, (byte) 17);
        T0 = new rdk(i2, (byte) 18);
        U0 = new rdk(i2, (byte) 19);
        V0 = new rdk(i2, (byte) 20);
        W0 = new rdk(i2, (byte) 21);
        X0 = new rdk(i2, (byte) 22);
        Y0 = new rdk(i2, (byte) 23);
        Z0 = new rdk(i2, (byte) 24);
        a1 = new rdk(i2, (byte) 25);
        b1 = new rdk(i2, (byte) 26);
        c1 = new rdk(i2, (byte) 27);
        d1 = new rdk(i2, (byte) 28);
        e1 = new rdk(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rdk(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof eek);
            case 1:
                if (obj != null) {
                    return (eek) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertcampaignstrings.ConcertCampaignStrings");
                return null;
            case 2:
                swo0 swo0Var = (swo0) obj;
                return new udk(swo0Var.a, swo0Var.b, 3, new enw(), 96);
            case 3:
                b261.x((e261) obj, 0);
                return rih1Var;
            case 4:
                return ((tek) obj).a;
            case 5:
                return ((tek) obj).a;
            case 6:
                return ((tek) obj).a;
            case 7:
                return ((tek) obj).a;
            case 8:
                return uek.k;
            case 9:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 10:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 11:
                return Boolean.valueOf(obj instanceof j6k);
            case 12:
                if (obj != null) {
                    return (j6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concert.Concert");
                return null;
            case 13:
                return Boolean.valueOf(obj instanceof lhe0);
            case 14:
                if (obj != null) {
                    return (lhe0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertlocation.Location");
                return null;
            case 15:
                return Boolean.valueOf(obj instanceof jo70);
            case 16:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((qtr) obj).b(new xia(5, null, (byte) 1));
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new ngk(((yek) obj).a);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (yek) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return a491.a;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (zek) obj;
            case 22:
                return new jif1(((afk) obj).a);
            case 23:
                return (afk) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                ((Number) obj).intValue();
                return null;
            case 25:
                ((Number) obj).intValue();
                return null;
            case 26:
                ((Number) obj).intValue();
                return null;
            case 27:
                efk efkVar = (efk) obj;
                return new ffk(efkVar.a, efkVar.b, efkVar.c, efkVar.d, efkVar.e, efkVar.f, false, efkVar.g, efkVar.h);
            case 28:
                return new ogk("", "", null, false, ((ngk) obj).a);
            default:
                ogk ogkVar = (ogk) obj;
                return new d900(ogkVar.a, ogkVar.b, ogkVar.c, new k07(new g07(""), false), ogkVar.d, ogkVar.e);
        }
    }
}
