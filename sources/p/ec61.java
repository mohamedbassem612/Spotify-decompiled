package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.io.Serializable;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ec61 extends hab0 implements iu30 {
    public static final ec61 N0;
    public static final ec61 O0;
    public static final ec61 P0;
    public static final ec61 Q0;
    public static final ec61 R0;
    public static final ec61 S0;
    public static final ec61 T0;
    public static final ec61 U0;
    public static final ec61 V0;
    public static final ec61 W0;
    public static final ec61 X;
    public static final ec61 X0;
    public static final ec61 Y;
    public static final ec61 Y0;
    public static final ec61 Z;
    public static final ec61 Z0;
    public static final ec61 a1;
    public static final ec61 b;
    public static final ec61 b1;
    public static final ec61 c;
    public static final ec61 c1;
    public static final ec61 d;
    public static final ec61 d1;
    public static final ec61 e;
    public static final ec61 e1;
    public static final ec61 f;
    public static final ec61 g;
    public static final ec61 h;
    public static final ec61 i;
    public static final ec61 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ec61(i2, (byte) 0);
        c = new ec61(i2, (byte) 1);
        d = new ec61(i2, (byte) 2);
        e = new ec61(i2, (byte) 3);
        f = new ec61(i2, (byte) 4);
        g = new ec61(i2, (byte) 5);
        h = new ec61(i2, (byte) 6);
        i = new ec61(i2, (byte) 7);
        t = new ec61(i2, (byte) 8);
        X = new ec61(i2, (byte) 9);
        Y = new ec61(i2, (byte) 10);
        Z = new ec61(i2, (byte) 11);
        N0 = new ec61(i2, (byte) 12);
        O0 = new ec61(i2, (byte) 13);
        P0 = new ec61(i2, (byte) 14);
        Q0 = new ec61(i2, (byte) 15);
        R0 = new ec61(i2, (byte) 16);
        S0 = new ec61(i2, (byte) 17);
        T0 = new ec61(i2, (byte) 18);
        U0 = new ec61(i2, (byte) 19);
        V0 = new ec61(i2, (byte) 20);
        W0 = new ec61(i2, (byte) 21);
        X0 = new ec61(i2, (byte) 22);
        Y0 = new ec61(i2, (byte) 23);
        Z0 = new ec61(i2, (byte) 24);
        a1 = new ec61(i2, (byte) 25);
        b1 = new ec61(i2, (byte) 26);
        c1 = new ec61(i2, (byte) 27);
        d1 = new ec61(i2, (byte) 28);
        e1 = new ec61(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ec61(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        Uri uri;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        switch (b2) {
            case 0:
                return (qxc0) obj;
            case 1:
                return rih1Var;
            case 2:
                return Boolean.valueOf(obj instanceof qxc0);
            case 3:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 4:
                return (qxc0) obj;
            case 5:
                return Boolean.valueOf(obj instanceof qxc0);
            case 6:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 7:
                return new bd61((String) null, 63, (String) null, (String) null, false, (String) null);
            case 8:
                return (qxc0) obj;
            case 9:
                return ad61.a;
            case 10:
                return Boolean.valueOf(obj instanceof qxc0);
            case 11:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 12:
                return rih1Var;
            case 13:
                return hxn0.a;
            case 14:
                return new g2l0((i3l0) obj);
            case 15:
                List list = (List) obj;
                if (!list.isEmpty()) {
                    xvl1 xvl1Var = (xvl1) o7h.q0(list);
                    wvl1 wvl1Var = xvl1Var.b;
                    ewq ewqVar = xvl1Var.d;
                    int iOrdinal = wvl1Var.ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            String strC = ewqVar.c("KEY_IMAGE_URI");
                            return new ml61(strC != null ? Uri.parse(strC) : null, ewqVar.c("KEY_UPLOADED_IMAGE_ID"));
                        }
                        if (iOrdinal == 3 || iOrdinal == 4) {
                            return jl61.a;
                        }
                        if (iOrdinal == 5) {
                            return il61.a;
                        }
                        eg.o();
                        return null;
                    }
                    String strC2 = xvl1Var.e.c("KEY_IMAGE_URI");
                    if (strC2 != null && (uri = Uri.parse(strC2)) != null) {
                        Uri uri2 = uri.equals(Uri.EMPTY) ? null : uri;
                        if (uri2 != null) {
                            return new kl61(uri2);
                        }
                    }
                }
                return ll61.a;
            case 16:
                return Boolean.valueOf(((Number) obj).intValue() <= 1);
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(((Number) obj).intValue() == 1);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (qxc0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return pm61.a;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 22:
                owl0 owl0Var = (owl0) obj;
                x6h1 x6h1VarC = owl0Var.a.c();
                x6h1VarC.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC.a(), owl0Var.b.b, System.currentTimeMillis());
            case 23:
                Bundle bundle = new Bundle();
                Boolean bool = ((hn61) obj).h;
                if (bool != null) {
                    bundle.putBoolean("doNotShowAgain", bool.booleanValue());
                }
                return bundle;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new huz(iax.a, (byte) 10);
            case 25:
                return new huz(b7xVar, (byte) 10);
            case 26:
                return new lp61((jp61) obj, (lax) null, (Serializable) null, (Map) null, 30);
            case 27:
                lp61 lp61Var = (lp61) obj;
                mmr0 mmr0Var = new mmr0("enabledState", lp61Var.b);
                Object obj2 = lp61Var.c;
                mmr0 mmr0Var2 = new mmr0("value", obj2 instanceof Serializable ? (Serializable) obj2 : null);
                Map map = lp61Var.e;
                return mno1.h(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("valueEnabledStates", map instanceof Serializable ? (Serializable) map : null)});
            case 28:
                return (qxc0) obj;
            default:
                return nq61.a;
        }
    }
}
