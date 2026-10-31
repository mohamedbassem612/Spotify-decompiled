package p;

import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.player.model.PlayerState;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gkz0 extends hab0 implements iu30 {
    public static final gkz0 N0;
    public static final gkz0 O0;
    public static final gkz0 P0;
    public static final gkz0 Q0;
    public static final gkz0 R0;
    public static final gkz0 S0;
    public static final gkz0 T0;
    public static final gkz0 U0;
    public static final gkz0 V0;
    public static final gkz0 W0;
    public static final gkz0 X;
    public static final gkz0 X0;
    public static final gkz0 Y;
    public static final gkz0 Y0;
    public static final gkz0 Z;
    public static final gkz0 Z0;
    public static final gkz0 a1;
    public static final gkz0 b;
    public static final gkz0 b1;
    public static final gkz0 c;
    public static final gkz0 c1;
    public static final gkz0 d;
    public static final gkz0 d1;
    public static final gkz0 e;
    public static final gkz0 e1;
    public static final gkz0 f;
    public static final gkz0 g;
    public static final gkz0 h;
    public static final gkz0 i;
    public static final gkz0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new gkz0(i2, (byte) 0);
        c = new gkz0(i2, (byte) 1);
        d = new gkz0(i2, (byte) 2);
        e = new gkz0(i2, (byte) 3);
        f = new gkz0(i2, (byte) 4);
        g = new gkz0(i2, (byte) 5);
        h = new gkz0(i2, (byte) 6);
        i = new gkz0(i2, (byte) 7);
        t = new gkz0(i2, (byte) 8);
        X = new gkz0(i2, (byte) 9);
        Y = new gkz0(i2, (byte) 10);
        Z = new gkz0(i2, (byte) 11);
        N0 = new gkz0(i2, (byte) 12);
        O0 = new gkz0(i2, (byte) 13);
        P0 = new gkz0(i2, (byte) 14);
        Q0 = new gkz0(i2, (byte) 15);
        R0 = new gkz0(i2, (byte) 16);
        S0 = new gkz0(i2, (byte) 17);
        T0 = new gkz0(i2, (byte) 18);
        U0 = new gkz0(i2, (byte) 19);
        V0 = new gkz0(i2, (byte) 20);
        W0 = new gkz0(i2, (byte) 21);
        X0 = new gkz0(i2, (byte) 22);
        Y0 = new gkz0(i2, (byte) 23);
        Z0 = new gkz0(i2, (byte) 24);
        a1 = new gkz0(i2, (byte) 25);
        b1 = new gkz0(i2, (byte) 26);
        c1 = new gkz0(i2, (byte) 27);
        d1 = new gkz0(i2, (byte) 28);
        e1 = new gkz0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkz0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        String strConcat = null;
        switch (b2) {
            case 0:
                if (obj != null) {
                    return (jo70) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.foundationaltraits.identitytrait.IdentityTrait");
                return null;
            case 1:
                return Boolean.FALSE;
            case 2:
                Bundle bundle = (Bundle) obj;
                if (bundle == null) {
                    return new hpz0();
                }
                rd70 rd70Var = (rd70) bundle.getParcelable("com.spotify.radio.radiohubpage.RadioHubPage.KEY_STATE");
                return rd70Var != null ? new hpz0(new y8e0(rd70Var)) : new hpz0();
            case 3:
                Bundle bundle2 = new Bundle();
                w8e0 w8e0Var = ((hpz0) obj).a;
                if (w8e0Var instanceof w8e0) {
                    rd70 rd70Var2 = rd70.c;
                    bundle2.putParcelable("com.spotify.radio.radiohubpage.RadioHubPage.KEY_STATE", pvc.j(w8e0Var.c));
                } else if (w8e0Var instanceof y8e0) {
                    rd70 rd70Var3 = rd70.c;
                    bundle2.putParcelable("com.spotify.radio.radiohubpage.RadioHubPage.KEY_STATE", pvc.j(((y8e0) w8e0Var).c));
                }
                return bundle2;
            case 4:
                return new ugc1(poo1.A((PlayerState) obj));
            case 5:
                String strA = aqz0.a(poo1.J((PlayerState) obj));
                if (strA != null && strA.startsWith("spotify:")) {
                    strConcat = (strA.startsWith("spotify:station:") || strA.startsWith("spotify:dailymix:")) ? strA : "spotify:station:".concat(strA.substring(8));
                }
                if (strConcat == null) {
                    strConcat = "";
                }
                if (nik1.s.a(strConcat)) {
                    return strConcat;
                }
                return strA == null ? "" : strA;
            case 6:
                return "spotify:internal:quiz:feedback:".concat(((frz0) obj).a);
            case 7:
                if (gtz0.a[((jsz0) obj).ordinal()] == 1) {
                    return usz0.a;
                }
                eg.o();
                return null;
            case 8:
                return cuz0.a;
            case 9:
                return "campfire";
            case 10:
                return rih1Var;
            case 11:
                if (!(obj instanceof Boolean) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 12:
                if (obj instanceof rih1) {
                    return null;
                }
                return (Boolean) obj;
            case 13:
                return Boolean.valueOf(obj instanceof String);
            case 14:
                if (obj != null) {
                    return (String) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.String");
                return null;
            case 15:
                return new nwc0((String) obj);
            case 16:
                return (owc0) obj;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new rxc0((String) obj);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return (qxc0) obj;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return Boolean.valueOf(obj instanceof owc0);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                if (obj != null) {
                    return (owc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMembersTable.Value");
                return null;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case 22:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 23:
                return new j001(null, null, true, null, z6x.a);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                b261.c((e261) obj);
                return rih1Var;
            case 25:
                return Boolean.valueOf(!((Map) obj).isEmpty());
            case 26:
                return Integer.valueOf(((Number) obj).intValue());
            case 27:
                return Integer.valueOf(-((Number) obj).intValue());
            case 28:
                return Integer.valueOf(-((Number) obj).intValue());
            default:
                return Integer.valueOf(((Number) obj).intValue());
        }
    }
}
