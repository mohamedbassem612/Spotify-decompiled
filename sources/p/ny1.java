package p;

import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ny1 extends hab0 implements iu30 {
    public static final ny1 N0;
    public static final ny1 O0;
    public static final ny1 P0;
    public static final ny1 Q0;
    public static final ny1 R0;
    public static final ny1 S0;
    public static final ny1 T0;
    public static final ny1 U0;
    public static final ny1 V0;
    public static final ny1 W0;
    public static final ny1 X;
    public static final ny1 X0;
    public static final ny1 Y;
    public static final ny1 Y0;
    public static final ny1 Z;
    public static final ny1 Z0;
    public static final ny1 a1;
    public static final ny1 b;
    public static final ny1 b1;
    public static final ny1 c;
    public static final ny1 c1;
    public static final ny1 d;
    public static final ny1 d1;
    public static final ny1 e;
    public static final ny1 e1;
    public static final ny1 f;
    public static final ny1 g;
    public static final ny1 h;
    public static final ny1 i;
    public static final ny1 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new ny1(i2, (byte) 0);
        c = new ny1(i2, (byte) 1);
        d = new ny1(i2, (byte) 2);
        e = new ny1(i2, (byte) 3);
        f = new ny1(i2, (byte) 4);
        g = new ny1(i2, (byte) 5);
        h = new ny1(i2, (byte) 6);
        i = new ny1(i2, (byte) 7);
        t = new ny1(i2, (byte) 8);
        X = new ny1(i2, (byte) 9);
        Y = new ny1(i2, (byte) 10);
        Z = new ny1(i2, (byte) 11);
        N0 = new ny1(i2, (byte) 12);
        O0 = new ny1(i2, (byte) 13);
        P0 = new ny1(i2, (byte) 14);
        Q0 = new ny1(i2, (byte) 15);
        R0 = new ny1(i2, (byte) 16);
        S0 = new ny1(i2, (byte) 17);
        T0 = new ny1(i2, (byte) 18);
        U0 = new ny1(i2, (byte) 19);
        V0 = new ny1(i2, (byte) 20);
        W0 = new ny1(i2, (byte) 21);
        X0 = new ny1(i2, (byte) 22);
        Y0 = new ny1(i2, (byte) 23);
        Z0 = new ny1(i2, (byte) 24);
        a1 = new ny1(i2, (byte) 25);
        b1 = new ny1(i2, (byte) 26);
        c1 = new ny1(i2, (byte) 27);
        d1 = new ny1(i2, (byte) 28);
        e1 = new ny1(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ny1(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        b7x b7xVar = b7x.a;
        boolean z = true;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                return new uyk0((i3l0) obj);
            case 1:
                return new k2l0((i3l0) obj);
            case 2:
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), ((k2l0) obj).a, r6h1.c, System.currentTimeMillis());
            case 3:
                if (!(obj instanceof qxc0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 4:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qxc0) obj;
            case 5:
                uv11 uv11Var = (uv11) obj;
                if (uv11Var.f != null) {
                    return new rxc0(uv11Var.b);
                }
                return null;
            case 6:
                return rih1Var;
            case 7:
                return rih1Var;
            case 8:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                return rih1Var;
            case 9:
                dhl dhlVar2 = (dhl) obj;
                ube ubeVar2 = dhlVar2.g;
                ihl ihlVar2 = dhlVar2.c;
                yf.p(ubeVar2, ihlVar2.g, 0.0f, 6);
                xid.r(dhlVar2.d, ihlVar2.d, 0.0f, 6);
                xid.r(dhlVar2.f, ihlVar2.f, 0.0f, 6);
                return rih1Var;
            case 10:
                return rih1Var;
            case 11:
                return new huz(rih1Var, (byte) 10);
            case 12:
                fhl0 fhl0Var = (fhl0) obj;
                String str = nik1.g2.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), fhl0Var.a, fhl0Var.b.c.b, System.currentTimeMillis());
            case 13:
                ghl0 ghl0Var = (ghl0) obj;
                String str2 = nik1.g2.a;
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2 != null ? str2 : "")), ghl0Var.a, ghl0Var.b.c.b, System.currentTimeMillis());
            case 14:
                return new t72(null);
            case 15:
                return (qxc0) obj;
            case 16:
                return s72.a;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return Boolean.valueOf(obj instanceof qxc0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                b261.c((e261) obj);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return mno1.h(new mmr0[]{new mmr0("age_assurance_parental_consent_model", (ahm0) obj)});
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new ud2((uqo) obj, null, pb2.UNKNOWN, new gax(2131961690, (String) null));
            case 22:
                return ((ResolveInfo) obj).activityInfo.packageName;
            case 23:
                Bundle bundle = new Bundle();
                bundle.putParcelable("ageEntryElementState", (zg2) obj);
                return bundle;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return rih1Var;
            case 25:
                b261.c((e261) obj);
                return rih1Var;
            case 26:
                return mno1.h(new mmr0[]{new mmr0("age_verification_model_key", (wm2) obj)});
            case 27:
                Long l = ((vs2) ((aa80) obj).b).c;
                if (l != null) {
                    return l;
                }
                return Long.MAX_VALUE;
            case 28:
                return Integer.valueOf(((aa80) obj).a);
            default:
                return rih1Var;
        }
    }
}
