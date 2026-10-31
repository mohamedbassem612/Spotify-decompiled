package p;

import android.widget.FrameLayout;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wlg0 extends hab0 implements iu30 {
    public static final wlg0 N0;
    public static final wlg0 O0;
    public static final wlg0 P0;
    public static final wlg0 Q0;
    public static final wlg0 R0;
    public static final wlg0 S0;
    public static final wlg0 T0;
    public static final wlg0 U0;
    public static final wlg0 V0;
    public static final wlg0 W0;
    public static final wlg0 X;
    public static final wlg0 X0;
    public static final wlg0 Y;
    public static final wlg0 Y0;
    public static final wlg0 Z;
    public static final wlg0 Z0;
    public static final wlg0 a1;
    public static final wlg0 b;
    public static final wlg0 b1;
    public static final wlg0 c;
    public static final wlg0 c1;
    public static final wlg0 d;
    public static final wlg0 d1;
    public static final wlg0 e;
    public static final wlg0 e1;
    public static final wlg0 f;
    public static final wlg0 g;
    public static final wlg0 h;
    public static final wlg0 i;
    public static final wlg0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wlg0(i2, (byte) 0);
        c = new wlg0(i2, (byte) 1);
        d = new wlg0(i2, (byte) 2);
        e = new wlg0(i2, (byte) 3);
        f = new wlg0(i2, (byte) 4);
        g = new wlg0(i2, (byte) 5);
        h = new wlg0(i2, (byte) 6);
        i = new wlg0(i2, (byte) 7);
        t = new wlg0(i2, (byte) 8);
        X = new wlg0(i2, (byte) 9);
        Y = new wlg0(i2, (byte) 10);
        Z = new wlg0(i2, (byte) 11);
        N0 = new wlg0(i2, (byte) 12);
        O0 = new wlg0(i2, (byte) 13);
        P0 = new wlg0(i2, (byte) 14);
        Q0 = new wlg0(i2, (byte) 15);
        R0 = new wlg0(i2, (byte) 16);
        S0 = new wlg0(i2, (byte) 17);
        T0 = new wlg0(i2, (byte) 18);
        U0 = new wlg0(i2, (byte) 19);
        V0 = new wlg0(i2, (byte) 20);
        W0 = new wlg0(i2, (byte) 21);
        X0 = new wlg0(i2, (byte) 22);
        Y0 = new wlg0(i2, (byte) 23);
        Z0 = new wlg0(i2, (byte) 24);
        a1 = new wlg0(i2, (byte) 25);
        b1 = new wlg0(i2, (byte) 26);
        c1 = new wlg0(i2, (byte) 27);
        d1 = new wlg0(i2, (byte) 28);
        e1 = new wlg0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wlg0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        String str;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return Boolean.valueOf(obj instanceof jo70);
            case 1:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 2:
                return Boolean.valueOf(obj instanceof xkk1);
            case 3:
                return (k1r) obj;
            case 4:
                return rih1Var;
            case 5:
                b261.d((e261) obj);
                return rih1Var;
            case 6:
                return hm5.P(xay.e(2, irn1.o0(500, 0, (dlv) null, 6)), xay.f(2, irn1.o0(500, 0, (dlv) null, 6)));
            case 7:
                fmg0 fmg0Var = (fmg0) obj;
                return new gmg0(fmg0Var.b, fmg0Var.a, (String) null, false, fmg0Var.c, fmg0Var.d, fmg0Var.e, (Integer) null, fmg0Var.f, fmg0Var.g, fmg0Var.h, fmg0Var.i, (Integer) null, (Integer) null, (xm6) null);
            case 8:
                return ((fmg0) obj).b;
            case 9:
                return ((fmg0) obj).b;
            case 10:
                fmg0 fmg0Var2 = (fmg0) obj;
                String str2 = fmg0Var2.b;
                if (str2 == null || (str = fmg0Var2.e) == null || !fmg0Var2.h || str2.equals(str)) {
                    return null;
                }
                return new qvc0(l1d.m("spotify:list:artist-connections:", blo1.l(str2)), null, null, null, 14);
            case 11:
                return ((fmg0) obj).b;
            case 12:
                return Boolean.valueOf((obj instanceof jo70) || (obj instanceof rih1));
            case 13:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 14:
                return Boolean.valueOf((obj instanceof List) || (obj instanceof rih1));
            case 15:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 16:
                return Boolean.valueOf((obj instanceof z6a1) || (obj instanceof rih1));
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                if (obj instanceof rih1) {
                    return null;
                }
                return (z6a1) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return Boolean.valueOf(obj instanceof xkk1);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return (k1r) obj;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                b261.d((e261) obj);
                return rih1Var;
            case 22:
                return hm5.P(xay.e(2, irn1.o0(500, 0, (dlv) null, 6)), xay.f(2, irn1.o0(500, 0, (dlv) null, 6)));
            case 23:
                ((FrameLayout) obj).setTag(2131428154, null);
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b7x b7xVar = b7x.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("no_action", 1, b7xVar), ((kgl0) obj).a, r6h1.c, System.currentTimeMillis());
            case 25:
                return new w2l0((i3l0) obj, (String) null);
            case 26:
                return new w2l0((i3l0) obj, (String) null);
            case 27:
                return new xqg0(((waz) obj).a);
            case 28:
                return (CharSequence) ((mbh0) obj).a().get(1);
            default:
                return rih1Var;
        }
    }
}
