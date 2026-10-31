package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6k extends hab0 implements iu30 {
    public static final c6k N0;
    public static final c6k O0;
    public static final c6k P0;
    public static final c6k Q0;
    public static final c6k R0;
    public static final c6k S0;
    public static final c6k T0;
    public static final c6k U0;
    public static final c6k V0;
    public static final c6k W0;
    public static final c6k X;
    public static final c6k X0;
    public static final c6k Y;
    public static final c6k Y0;
    public static final c6k Z;
    public static final c6k Z0;
    public static final c6k a1;
    public static final c6k b;
    public static final c6k b1;
    public static final c6k c;
    public static final c6k c1;
    public static final c6k d;
    public static final c6k d1;
    public static final c6k e;
    public static final c6k e1;
    public static final c6k f;
    public static final c6k g;
    public static final c6k h;
    public static final c6k i;
    public static final c6k t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new c6k(i2, (byte) 0);
        c = new c6k(i2, (byte) 1);
        d = new c6k(i2, (byte) 2);
        e = new c6k(i2, (byte) 3);
        f = new c6k(i2, (byte) 4);
        g = new c6k(i2, (byte) 5);
        h = new c6k(i2, (byte) 6);
        i = new c6k(i2, (byte) 7);
        t = new c6k(i2, (byte) 8);
        X = new c6k(i2, (byte) 9);
        Y = new c6k(i2, (byte) 10);
        Z = new c6k(i2, (byte) 11);
        N0 = new c6k(i2, (byte) 12);
        O0 = new c6k(i2, (byte) 13);
        P0 = new c6k(i2, (byte) 14);
        Q0 = new c6k(i2, (byte) 15);
        R0 = new c6k(i2, (byte) 16);
        S0 = new c6k(i2, (byte) 17);
        T0 = new c6k(i2, (byte) 18);
        U0 = new c6k(i2, (byte) 19);
        V0 = new c6k(i2, (byte) 20);
        W0 = new c6k(i2, (byte) 21);
        X0 = new c6k(i2, (byte) 22);
        Y0 = new c6k(i2, (byte) 23);
        Z0 = new c6k(i2, (byte) 24);
        a1 = new c6k(i2, (byte) 25);
        b1 = new c6k(i2, (byte) 26);
        c1 = new c6k(i2, (byte) 27);
        d1 = new c6k(i2, (byte) 28);
        e1 = new c6k(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c6k(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                b261.c((e261) obj);
                return rih1Var;
            case 1:
                ((Number) obj).intValue();
                return r6h1.c;
            case 2:
                return new o2l0((i3l0) obj);
            case 3:
                return new o2l0((i3l0) obj);
            case 4:
                nbk nbkVar = (nbk) obj;
                return new obk(nbkVar.a, nbkVar.b, nbkVar.c, nbkVar.d, false, nbkVar.e, nbkVar.f != null, nbkVar.j, nbkVar.k);
            case 5:
                return rih1Var;
            case 6:
                b261.c((e261) obj);
                return rih1Var;
            case 7:
                return hm5.P(xay.e(3, (ni20) null).a(xay.d((ni20) null, een.Z, 13)), xay.f(3, (ni20) null).a(xay.l(13, (ni20) null)));
            case 8:
                ((Number) obj).intValue();
                return rih1Var;
            case 9:
                ((Number) obj).intValue();
                return rih1Var;
            case 10:
                return new pzk0((i3l0) obj);
            case 11:
                return ((pzk0) obj).e();
            case 12:
                return new o2l0((i3l0) obj);
            case 13:
                udk udkVar = (udk) obj;
                return new idk(udkVar.a, udkVar.c);
            case 14:
                udk udkVar2 = (udk) obj;
                String str = udkVar2.b;
                return str == null ? udkVar2.a : str;
            case 15:
                return ((udk) obj).a;
            case 16:
                return ((udk) obj).a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((udk) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((udk) obj).a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                ((Number) obj).intValue();
                return r6h1.c;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 22:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (!(obj instanceof ydk) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (ydk) obj;
            case 26:
                if (!(obj instanceof jek) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 27:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jek) obj;
            case 28:
                return Boolean.valueOf(obj instanceof m6k);
            default:
                if (obj != null) {
                    return (m6k) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.concertcampaign.ConcertCampaign");
                return null;
        }
    }
}
