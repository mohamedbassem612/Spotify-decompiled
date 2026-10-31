package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qci0 extends hab0 implements iu30 {
    public static final qci0 N0;
    public static final qci0 O0;
    public static final qci0 P0;
    public static final qci0 Q0;
    public static final qci0 R0;
    public static final qci0 S0;
    public static final qci0 T0;
    public static final qci0 U0;
    public static final qci0 V0;
    public static final qci0 W0;
    public static final qci0 X;
    public static final qci0 X0;
    public static final qci0 Y;
    public static final qci0 Y0;
    public static final qci0 Z;
    public static final qci0 Z0;
    public static final qci0 a1;
    public static final qci0 b;
    public static final qci0 b1;
    public static final qci0 c;
    public static final qci0 c1;
    public static final qci0 d;
    public static final qci0 d1;
    public static final qci0 e;
    public static final qci0 e1;
    public static final qci0 f;
    public static final qci0 g;
    public static final qci0 h;
    public static final qci0 i;
    public static final qci0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new qci0(i2, (byte) 0);
        c = new qci0(i2, (byte) 1);
        d = new qci0(i2, (byte) 2);
        e = new qci0(i2, (byte) 3);
        f = new qci0(i2, (byte) 4);
        g = new qci0(i2, (byte) 5);
        h = new qci0(i2, (byte) 6);
        i = new qci0(i2, (byte) 7);
        t = new qci0(i2, (byte) 8);
        X = new qci0(i2, (byte) 9);
        Y = new qci0(i2, (byte) 10);
        Z = new qci0(i2, (byte) 11);
        N0 = new qci0(i2, (byte) 12);
        O0 = new qci0(i2, (byte) 13);
        P0 = new qci0(i2, (byte) 14);
        Q0 = new qci0(i2, (byte) 15);
        R0 = new qci0(i2, (byte) 16);
        S0 = new qci0(i2, (byte) 17);
        T0 = new qci0(i2, (byte) 18);
        U0 = new qci0(i2, (byte) 19);
        V0 = new qci0(i2, (byte) 20);
        W0 = new qci0(i2, (byte) 21);
        X0 = new qci0(i2, (byte) 22);
        Y0 = new qci0(i2, (byte) 23);
        Z0 = new qci0(i2, (byte) 24);
        a1 = new qci0(i2, (byte) 25);
        b1 = new qci0(i2, (byte) 26);
        c1 = new qci0(i2, (byte) 27);
        d1 = new qci0(i2, (byte) 28);
        e1 = new qci0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qci0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                if (obj instanceof rih1) {
                    return null;
                }
                return (e2k1) obj;
            case 1:
                if (!(obj instanceof nbw0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (nbw0) obj;
            case 3:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (!(obj instanceof yo60) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (yo60) obj;
            case 6:
                if (!(obj instanceof mtl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (mtl) obj;
            case 8:
                return Boolean.valueOf(obj instanceof nbw0);
            case 9:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
            case 10:
                return Boolean.valueOf(obj instanceof jo70);
            case 11:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 12:
                return b7x.a;
            case 13:
                return rih1.a;
            case 14:
                return n9p1.l((mey0) obj);
            case 15:
                return ((mey0) obj).d;
            case 16:
                return ((mey0) obj).c;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((mey0) obj).c;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((mey0) obj).c;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((mey0) obj).d;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (!(obj instanceof prl) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
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
                return Boolean.valueOf(obj instanceof nbw0);
            case 25:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
            case 26:
                return Boolean.valueOf(obj instanceof yo60);
            case 27:
                if (obj != null) {
                    return (yo60) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.homepreviewplaybacktrait.HomePreviewPlaybackTrait");
                return null;
            case 28:
                return Boolean.valueOf(obj instanceof jo70);
            default:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
        }
    }
}
