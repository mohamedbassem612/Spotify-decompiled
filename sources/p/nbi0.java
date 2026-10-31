package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nbi0 extends hab0 implements iu30 {
    public static final nbi0 N0;
    public static final nbi0 O0;
    public static final nbi0 P0;
    public static final nbi0 Q0;
    public static final nbi0 R0;
    public static final nbi0 S0;
    public static final nbi0 T0;
    public static final nbi0 U0;
    public static final nbi0 V0;
    public static final nbi0 W0;
    public static final nbi0 X;
    public static final nbi0 X0;
    public static final nbi0 Y;
    public static final nbi0 Y0;
    public static final nbi0 Z;
    public static final nbi0 Z0;
    public static final nbi0 a1;
    public static final nbi0 b;
    public static final nbi0 b1;
    public static final nbi0 c;
    public static final nbi0 c1;
    public static final nbi0 d;
    public static final nbi0 d1;
    public static final nbi0 e;
    public static final nbi0 e1;
    public static final nbi0 f;
    public static final nbi0 g;
    public static final nbi0 h;
    public static final nbi0 i;
    public static final nbi0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new nbi0(i2, (byte) 0);
        c = new nbi0(i2, (byte) 1);
        d = new nbi0(i2, (byte) 2);
        e = new nbi0(i2, (byte) 3);
        f = new nbi0(i2, (byte) 4);
        g = new nbi0(i2, (byte) 5);
        h = new nbi0(i2, (byte) 6);
        i = new nbi0(i2, (byte) 7);
        t = new nbi0(i2, (byte) 8);
        X = new nbi0(i2, (byte) 9);
        Y = new nbi0(i2, (byte) 10);
        Z = new nbi0(i2, (byte) 11);
        N0 = new nbi0(i2, (byte) 12);
        O0 = new nbi0(i2, (byte) 13);
        P0 = new nbi0(i2, (byte) 14);
        Q0 = new nbi0(i2, (byte) 15);
        R0 = new nbi0(i2, (byte) 16);
        S0 = new nbi0(i2, (byte) 17);
        T0 = new nbi0(i2, (byte) 18);
        U0 = new nbi0(i2, (byte) 19);
        V0 = new nbi0(i2, (byte) 20);
        W0 = new nbi0(i2, (byte) 21);
        X0 = new nbi0(i2, (byte) 22);
        Y0 = new nbi0(i2, (byte) 23);
        Z0 = new nbi0(i2, (byte) 24);
        a1 = new nbi0(i2, (byte) 25);
        b1 = new nbi0(i2, (byte) 26);
        c1 = new nbi0(i2, (byte) 27);
        d1 = new nbi0(i2, (byte) 28);
        e1 = new nbi0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nbi0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                mey0 mey0Var = (mey0) obj;
                String str = mey0Var.h;
                return str == null ? mey0Var.c : str;
            case 1:
                return Boolean.valueOf((obj instanceof pjw0) || (obj instanceof rih1));
            case 2:
                if (obj instanceof rih1) {
                    return null;
                }
                return (pjw0) obj;
            case 3:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 5:
                return Boolean.valueOf((obj instanceof e2k1) || (obj instanceof rih1));
            case 6:
                if (obj instanceof rih1) {
                    return null;
                }
                return (e2k1) obj;
            case 7:
                return Boolean.valueOf(obj instanceof nbw0);
            case 8:
                if (obj != null) {
                    return (nbw0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.previewcardtrait.PreviewCardTrait");
                return null;
            case 9:
                mey0 mey0Var2 = ((dbi0) obj).c;
                mmr0 mmr0Var = new mmr0(1, Collections.singleton(mey0Var2.d));
                String str2 = mey0Var2.h;
                if (str2 == null) {
                    str2 = mey0Var2.c;
                }
                return sqg0.J(new mmr0[]{mmr0Var, new mmr0(2, Collections.singleton(str2))});
            case 10:
                return rih1.a;
            case 11:
                return n9p1.l((mey0) obj);
            case 12:
                return ((mey0) obj).c;
            case 13:
                return ((mey0) obj).c;
            case 14:
                return ((mey0) obj).c;
            case 15:
                return ((mey0) obj).c;
            case 16:
                return ((mey0) obj).c;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return ((mey0) obj).d;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return ((mey0) obj).d;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return ((mey0) obj).d;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf((obj instanceof w281) || (obj instanceof rih1));
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (w281) obj;
            case 23:
                return Boolean.valueOf((obj instanceof l1z) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l1z) obj;
            case 25:
                return Boolean.valueOf((obj instanceof prl) || (obj instanceof rih1));
            case 26:
                if (obj instanceof rih1) {
                    return null;
                }
                return (prl) obj;
            case 27:
                return Boolean.valueOf((obj instanceof xkk1) || (obj instanceof rih1));
            case 28:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            default:
                return Boolean.valueOf((obj instanceof e2k1) || (obj instanceof rih1));
        }
    }
}
