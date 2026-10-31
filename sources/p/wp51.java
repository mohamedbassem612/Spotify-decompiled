package p;

import com.spotify.player.model.PlayerState;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class wp51 extends hab0 implements iu30 {
    public static final wp51 N0;
    public static final wp51 O0;
    public static final wp51 P0;
    public static final wp51 Q0;
    public static final wp51 R0;
    public static final wp51 S0;
    public static final wp51 T0;
    public static final wp51 U0;
    public static final wp51 V0;
    public static final wp51 W0;
    public static final wp51 X;
    public static final wp51 X0;
    public static final wp51 Y;
    public static final wp51 Y0;
    public static final wp51 Z;
    public static final wp51 Z0;
    public static final wp51 a1;
    public static final wp51 b;
    public static final wp51 b1;
    public static final wp51 c;
    public static final wp51 c1;
    public static final wp51 d;
    public static final wp51 d1;
    public static final wp51 e;
    public static final wp51 e1;
    public static final wp51 f;
    public static final wp51 g;
    public static final wp51 h;
    public static final wp51 i;
    public static final wp51 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new wp51(i2, (byte) 0);
        c = new wp51(i2, (byte) 1);
        d = new wp51(i2, (byte) 2);
        e = new wp51(i2, (byte) 3);
        f = new wp51(i2, (byte) 4);
        g = new wp51(i2, (byte) 5);
        h = new wp51(i2, (byte) 6);
        i = new wp51(i2, (byte) 7);
        t = new wp51(i2, (byte) 8);
        X = new wp51(i2, (byte) 9);
        Y = new wp51(i2, (byte) 10);
        Z = new wp51(i2, (byte) 11);
        N0 = new wp51(i2, (byte) 12);
        O0 = new wp51(i2, (byte) 13);
        P0 = new wp51(i2, (byte) 14);
        Q0 = new wp51(i2, (byte) 15);
        R0 = new wp51(i2, (byte) 16);
        S0 = new wp51(i2, (byte) 17);
        T0 = new wp51(i2, (byte) 18);
        U0 = new wp51(i2, (byte) 19);
        V0 = new wp51(i2, (byte) 20);
        W0 = new wp51(i2, (byte) 21);
        X0 = new wp51(i2, (byte) 22);
        Y0 = new wp51(i2, (byte) 23);
        Z0 = new wp51(i2, (byte) 24);
        a1 = new wp51(i2, (byte) 25);
        b1 = new wp51(i2, (byte) 26);
        c1 = new wp51(i2, (byte) 27);
        d1 = new wp51(i2, (byte) 28);
        e1 = new wp51(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp51(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0116  */
    public final Object invoke(Object obj) {
        tq51 tq51Var;
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 2:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 3:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 4:
                if (!(obj instanceof hll) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 5:
                if (obj instanceof rih1) {
                    return null;
                }
                return (hll) obj;
            case 6:
                if (!(obj instanceof a7q0) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 7:
                if (obj instanceof rih1) {
                    return null;
                }
                return (a7q0) obj;
            case 8:
                b261.B((e261) obj, "segmentDetailSectionItemMonthlyListeners");
                return rih1Var;
            case 9:
                b261.B((e261) obj, "segmentDetailSectionItemRow");
                return rih1Var;
            case 10:
                b261.B((e261) obj, "segmentDetailSectionItemVerified");
                return rih1Var;
            case 11:
                String str = (String) obj;
                Set set = s4b1.f;
                String strZ = uic.v("podcast-chapters", str).z();
                return new qvc0(strZ == null ? str : strZ, (c3d0) null, (Set) null, (mqz0) null, 14);
            case 12:
                List<pvc0> list = (List) obj;
                if (list == null) {
                    return z6x.a;
                }
                ArrayList arrayList = new ArrayList();
                for (pvc0 pvc0Var : list) {
                    Map map = pvc0Var.f;
                    String str2 = (String) map.get("chapter.start_position_in_milliseconds");
                    if (str2 != null) {
                        long j = Long.parseLong(str2);
                        String str3 = (String) map.get("chapter.end_position_in_milliseconds");
                        if (str3 != null) {
                            long j2 = Long.parseLong(str3);
                            String str4 = (String) map.get("has_creator_timestamps");
                            tq51Var = new tq51(pvc0Var.c, new n5f0(j, j2 - 1), str4 != null && Boolean.parseBoolean(str4));
                        } else {
                            tq51Var = null;
                        }
                    } else {
                        tq51Var = null;
                    }
                    if (tq51Var != null) {
                        arrayList.add(tq51Var);
                    }
                }
                return arrayList;
            case 13:
                if (!(obj instanceof List) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 14:
                if (obj instanceof rih1) {
                    return null;
                }
                return (List) obj;
            case 15:
                return Boolean.valueOf(o4p1.C((PlayerState) obj));
            case 16:
                return (fsy) obj;
            case 17:
                return ((fsy) obj).b;
            case 18:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 19:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case 20:
                return Boolean.valueOf(obj instanceof hi40);
            case 21:
                if (obj != null) {
                    return (hi40) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.entitysegments.dynamictimestampprovider.GenericTimestampRange");
                return null;
            case 22:
                dhl dhlVar = (dhl) obj;
                ube ubeVar = dhlVar.e;
                ihl ihlVar = dhlVar.c;
                yf.p(ubeVar, ihlVar.e, 0.0f, 6);
                yf.p(dhlVar.g, ihlVar.g, 0.0f, 6);
                xid.r(dhlVar.d, ihlVar.d, 0.0f, 6);
                xid.r(dhlVar.f, ihlVar.f, 0.0f, 6);
                return rih1Var;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new lt51(false, false, false);
            case 24:
                return new wt51(false);
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return (qxc0) obj;
            case 26:
                return vt51.a;
            case 27:
                return Boolean.valueOf(obj instanceof qxc0);
            case 28:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            default:
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
        }
    }
}
