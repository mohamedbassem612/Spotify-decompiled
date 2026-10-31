package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ra3 extends hab0 implements iu30 {
    public static final ra3 N0;
    public static final ra3 O0;
    public static final ra3 P0;
    public static final ra3 Q0;
    public static final ra3 R0;
    public static final ra3 S0;
    public static final ra3 T0;
    public static final ra3 U0;
    public static final ra3 V0;
    public static final ra3 W0;
    public static final ra3 X;
    public static final ra3 X0;
    public static final ra3 Y;
    public static final ra3 Y0;
    public static final ra3 Z;
    public static final ra3 Z0;
    public static final ra3 a1;
    public static final ra3 b;
    public static final ra3 b1;
    public static final ra3 c;
    public static final ra3 c1;
    public static final ra3 d;
    public static final ra3 d1;
    public static final ra3 e;
    public static final ra3 e1;
    public static final ra3 f;
    public static final ra3 g;
    public static final ra3 h;
    public static final ra3 i;
    public static final ra3 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ra3(i2, (byte) 0);
        c = new ra3(i2, (byte) 1);
        d = new ra3(i2, (byte) 2);
        e = new ra3(i2, (byte) 3);
        f = new ra3(i2, (byte) 4);
        g = new ra3(i2, (byte) 5);
        h = new ra3(i2, (byte) 6);
        i = new ra3(i2, (byte) 7);
        t = new ra3(i2, (byte) 8);
        X = new ra3(i2, (byte) 9);
        Y = new ra3(i2, (byte) 10);
        Z = new ra3(i2, (byte) 11);
        N0 = new ra3(i2, (byte) 12);
        O0 = new ra3(i2, (byte) 13);
        P0 = new ra3(i2, (byte) 14);
        Q0 = new ra3(i2, (byte) 15);
        R0 = new ra3(i2, (byte) 16);
        S0 = new ra3(i2, (byte) 17);
        T0 = new ra3(i2, (byte) 18);
        U0 = new ra3(i2, (byte) 19);
        V0 = new ra3(i2, (byte) 20);
        W0 = new ra3(i2, (byte) 21);
        X0 = new ra3(i2, (byte) 22);
        Y0 = new ra3(i2, (byte) 23);
        Z0 = new ra3(i2, (byte) 24);
        a1 = new ra3(i2, (byte) 25);
        b1 = new ra3(i2, (byte) 26);
        c1 = new ra3(i2, (byte) 27);
        d1 = new ra3(i2, (byte) 28);
        e1 = new ra3(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ra3(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        boolean z = true;
        switch (this.a) {
            case 0:
                return (String) obj;
            case 1:
                return (jo70) obj;
            case 2:
                return ((jo70) obj).a;
            case 3:
                return ((jo70) obj).a;
            case 4:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 6:
                return Boolean.valueOf(obj instanceof jo70);
            case 7:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 8:
                return (String) obj;
            case 9:
                i1r i1rVar = (k1r) obj;
                if (i1rVar instanceof j1r) {
                    return null;
                }
                return i1rVar instanceof i1r ? Boolean.valueOf(((vnb1) i1rVar.a).a) : Boolean.FALSE;
            case 10:
                return Boolean.valueOf(obj instanceof vnb1);
            case 11:
                return (k1r) obj;
            case 12:
                return (tb3) obj;
            case 13:
                return ((tb3) obj).c;
            case 14:
                ((Number) obj).intValue();
                return null;
            case 15:
                yti0 yti0Var = (yti0) obj;
                return new tb3(yti0Var.a, yti0Var.b, yti0Var.c);
            case 16:
                return ((yti0) obj).b;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Number) obj).intValue();
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                tb3 tb3Var = (tb3) obj;
                return new fui0(tb3Var.c, tb3Var.a, 124, null);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                if (vb3.a[((eui0) obj).ordinal()] == 1) {
                    return sb3.a;
                }
                eg.o();
                return null;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return ((dh3) obj).b;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new bx21(2131954487);
            case 22:
                PlayerState playerState = (PlayerState) obj;
                String strH = poo1.H(playerState, "album_title");
                if (strH.length() == 0) {
                    strH = poo1.A(playerState);
                }
                return new ugc1(strH);
            case 23:
                return rih1.a;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new rc3(false);
            case 25:
                uq11 uq11Var = (uq11) obj;
                return new uv11(uq11Var.a, uq11Var.b, (Integer) null, uq11Var.c, uq11Var.f, (tv11) null, 0, 228);
            case 26:
                eer0 eer0Var = (eer0) obj;
                return new uv11(eer0Var.a, eer0Var.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 27:
                eer0 eer0Var2 = (eer0) obj;
                return new uv11(eer0Var2.a, eer0Var2.b, (Integer) null, (String) null, (cqs0) null, (tv11) null, 0, 252);
            case 28:
                return Collections.singleton(((eer0) obj).a);
            default:
                return Collections.singleton(((eer0) obj).a);
        }
    }
}
