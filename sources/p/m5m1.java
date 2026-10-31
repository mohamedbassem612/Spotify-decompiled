package p;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m5m1 extends hab0 implements iu30 {
    public static final m5m1 N0;
    public static final m5m1 O0;
    public static final m5m1 P0;
    public static final m5m1 Q0;
    public static final m5m1 R0;
    public static final m5m1 S0;
    public static final m5m1 T0;
    public static final m5m1 U0;
    public static final m5m1 V0;
    public static final m5m1 W0;
    public static final m5m1 X;
    public static final m5m1 X0;
    public static final m5m1 Y;
    public static final m5m1 Y0;
    public static final m5m1 Z;
    public static final m5m1 Z0;
    public static final m5m1 a1;
    public static final m5m1 b;
    public static final m5m1 b1;
    public static final m5m1 c;
    public static final m5m1 c1;
    public static final m5m1 d;
    public static final m5m1 d1;
    public static final m5m1 e;
    public static final m5m1 e1;
    public static final m5m1 f;
    public static final m5m1 g;
    public static final m5m1 h;
    public static final m5m1 i;
    public static final m5m1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new m5m1(i2, (byte) 0);
        c = new m5m1(i2, (byte) 1);
        d = new m5m1(i2, (byte) 2);
        e = new m5m1(i2, (byte) 3);
        f = new m5m1(i2, (byte) 4);
        g = new m5m1(i2, (byte) 5);
        h = new m5m1(i2, (byte) 6);
        i = new m5m1(i2, (byte) 7);
        t = new m5m1(i2, (byte) 8);
        X = new m5m1(i2, (byte) 9);
        Y = new m5m1(i2, (byte) 10);
        Z = new m5m1(i2, (byte) 11);
        N0 = new m5m1(i2, (byte) 12);
        O0 = new m5m1(i2, (byte) 13);
        P0 = new m5m1(i2, (byte) 14);
        Q0 = new m5m1(i2, (byte) 15);
        R0 = new m5m1(i2, (byte) 16);
        S0 = new m5m1(i2, (byte) 17);
        T0 = new m5m1(i2, (byte) 18);
        U0 = new m5m1(i2, (byte) 19);
        V0 = new m5m1(i2, (byte) 20);
        W0 = new m5m1(i2, (byte) 21);
        X0 = new m5m1(i2, (byte) 22);
        Y0 = new m5m1(i2, (byte) 23);
        Z0 = new m5m1(i2, (byte) 24);
        a1 = new m5m1(i2, (byte) 25);
        b1 = new m5m1(i2, (byte) 26);
        c1 = new m5m1(i2, (byte) 27);
        d1 = new m5m1(i2, (byte) 28);
        e1 = new m5m1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m5m1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                vhc1 vhc1Var = (vhc1) obj;
                return Boolean.valueOf((vhc1Var instanceof thc1) && ((thc1) vhc1Var).j.get("workout.segment.id") != null);
            case 1:
                return new s5m1(false, false);
            case 2:
                return new u5m1((qxc0) obj);
            case 3:
                return r5m1.a;
            case 4:
                return Boolean.valueOf(obj instanceof qxc0);
            case 5:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 6:
                wsk wskVar = s6m1.a;
                int i2 = wskVar.a;
                int i3 = wskVar.b;
                int i4 = wskVar.d;
                int i5 = wskVar.c;
                aj31 aj31Var = aj31.a;
                return new c7m1("", "", aj31Var, aj31Var, aj31Var, (cj31) null, (cj31) null, (String) null, i2, i3, "", "", i4, i5, true);
            case 7:
                kd31 kd31Var = (kd31) obj;
                kd31Var.i(1);
                kd31Var.d(21);
                return rih1Var;
            case 8:
                return ((r6m1) obj).a;
            case 9:
                return Boolean.valueOf(obj instanceof m8a);
            case 10:
                if (obj != null) {
                    return (m8a) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.bannerwithanimationstrait.BannerWithAnimationsTrait");
                return null;
            case 11:
                return ((a7m1) obj).b;
            case 12:
                return new d7m1((m8a) obj);
            case 13:
                ((kd31) obj).i(1);
                return rih1Var;
            case 14:
                b261.d((e261) obj);
                return rih1Var;
            case 15:
                b261.d((e261) obj);
                return rih1Var;
            case 16:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((ez20) obj).c(false);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                b261.d((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case 22:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 23:
                return Boolean.valueOf(obj instanceof List);
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (obj != null) {
                    return (List) obj;
                }
                bhn0.i("null cannot be cast to non-null type kotlin.collections.List<com.spotify.listplatform.endpoints.kodiak.ListItemsTable.Item>");
                return null;
            case 25:
                return new ram1((View) d7e.x((xos0) obj, AndroidCompositionLocals_androidKt.f));
            case 26:
                b261.d((e261) obj);
                return rih1Var;
            case 27:
                return rih1Var;
            case 28:
                ((Boolean) obj).getClass();
                return rih1Var;
            default:
                return new bbm1(kzn.a);
        }
    }
}
