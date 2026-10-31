package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e6y0 extends hab0 implements iu30 {
    public static final e6y0 N0;
    public static final e6y0 O0;
    public static final e6y0 P0;
    public static final e6y0 Q0;
    public static final e6y0 R0;
    public static final e6y0 S0;
    public static final e6y0 T0;
    public static final e6y0 U0;
    public static final e6y0 V0;
    public static final e6y0 W0;
    public static final e6y0 X;
    public static final e6y0 X0;
    public static final e6y0 Y;
    public static final e6y0 Y0;
    public static final e6y0 Z;
    public static final e6y0 Z0;
    public static final e6y0 a1;
    public static final e6y0 b;
    public static final e6y0 b1;
    public static final e6y0 c;
    public static final e6y0 c1;
    public static final e6y0 d;
    public static final e6y0 d1;
    public static final e6y0 e;
    public static final e6y0 e1;
    public static final e6y0 f;
    public static final e6y0 g;
    public static final e6y0 h;
    public static final e6y0 i;
    public static final e6y0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new e6y0(i2, (byte) 0);
        c = new e6y0(i2, (byte) 1);
        d = new e6y0(i2, (byte) 2);
        e = new e6y0(i2, (byte) 3);
        f = new e6y0(i2, (byte) 4);
        g = new e6y0(i2, (byte) 5);
        h = new e6y0(i2, (byte) 6);
        i = new e6y0(i2, (byte) 7);
        t = new e6y0(i2, (byte) 8);
        X = new e6y0(i2, (byte) 9);
        Y = new e6y0(i2, (byte) 10);
        Z = new e6y0(i2, (byte) 11);
        N0 = new e6y0(i2, (byte) 12);
        O0 = new e6y0(i2, (byte) 13);
        P0 = new e6y0(i2, (byte) 14);
        Q0 = new e6y0(i2, (byte) 15);
        R0 = new e6y0(i2, (byte) 16);
        S0 = new e6y0(i2, (byte) 17);
        T0 = new e6y0(i2, (byte) 18);
        U0 = new e6y0(i2, (byte) 19);
        V0 = new e6y0(i2, (byte) 20);
        W0 = new e6y0(i2, (byte) 21);
        X0 = new e6y0(i2, (byte) 22);
        Y0 = new e6y0(i2, (byte) 23);
        Z0 = new e6y0(i2, (byte) 24);
        a1 = new e6y0(i2, (byte) 25);
        b1 = new e6y0(i2, (byte) 26);
        c1 = new e6y0(i2, (byte) 27);
        d1 = new e6y0(i2, (byte) 28);
        e1 = new e6y0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e6y0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:114:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:0x0156  */
    public final Object invoke(Object obj) {
        String str;
        int i2;
        Boolean boolD1;
        String str2;
        boolean z = true;
        char c2 = 0;
        cio cioVar = null;
        switch (this.a) {
            case 0:
                return Boolean.valueOf(obj instanceof qxc0);
            case 1:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 2:
                return new y6y0((cxc0) obj, null);
            case 3:
                return (qxc0) obj;
            case 4:
                return Boolean.valueOf(obj instanceof qxc0);
            case 5:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 6:
                return ((l6o) obj).a;
            case 7:
                return ((n6o) obj).a;
            case 8:
                return (qxc0) obj;
            case 9:
                return xg01.a;
            case 10:
                return Boolean.valueOf(obj instanceof qxc0);
            case 11:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case 12:
                d8y0 d8y0Var = (d8y0) obj;
                return new e8y0(true, d8y0Var.a, d8y0Var.b, d8y0Var.c, false, d8y0Var.e, false, false, 432);
            case 13:
                return (qxc0) obj;
            case 14:
                kby kbyVar = ((cxc0) obj).f;
                Map map = kbyVar.q;
                String str3 = (String) map.get("has_active_refinement_session");
                boolean zBooleanValue = (str3 == null || (boolD1 = ihc1.d1(str3)) == null) ? false : boolD1.booleanValue();
                String str4 = (String) map.get("refinement_generation_status");
                if (str4 != null) {
                    if (ihc1.y0(str4)) {
                        str4 = null;
                    }
                    if (str4 != null) {
                        int iHashCode = str4.hashCode();
                        if (iHashCode != -1605156856) {
                            if (iHashCode != -742597650) {
                                if (iHashCode == 1805847336 && str4.equals("MESSAGE_STATUS_PROCESSING")) {
                                    c2 = 2;
                                } else {
                                    c2 = 4;
                                }
                            } else if (str4.equals("MESSAGE_STATUS_SUCCESS")) {
                                c2 = 3;
                            } else {
                                c2 = 4;
                            }
                        } else if (str4.equals("MESSAGE_STATUS_QUEUED")) {
                            c2 = 1;
                        } else {
                            c2 = 4;
                        }
                    }
                }
                String str5 = (String) map.get("spotbot_session_id");
                String str6 = (str5 == null || ihc1.y0(str5)) ? null : str5;
                if (zBooleanValue) {
                    String str7 = (String) map.get("refinement_session_id");
                    if (str7 == null || ihc1.y0(str7)) {
                        str7 = null;
                    }
                    str = str7;
                } else {
                    str = null;
                }
                if (!zBooleanValue) {
                    i2 = 1;
                } else if (c2 == 1 || c2 == 2) {
                    i2 = 2;
                } else if (c2 == 3 || c2 == 4) {
                    i2 = 3;
                } else {
                    i2 = 1;
                }
                String str8 = (String) map.get("refresh_cadence");
                if (u890.j(str8, "DAILY")) {
                    cioVar = aio.a;
                } else if (u890.j(str8, "WEEKLY")) {
                    cioVar = bio.a;
                }
                return new d8y0(str6, str, i2, cioVar, kbyVar.q);
            case 15:
                return Boolean.valueOf(obj instanceof qxc0);
            case 16:
                if (obj != null) {
                    return (qxc0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.listplatform.endpoints.kodiak.ListMetadataTable.Entity");
                return null;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                vhc1 vhc1Var = (vhc1) obj;
                Set set = s4b1.f;
                return Boolean.valueOf(uic.x(vhc1Var.getUri()).c == blc0.ti && i0p1.v(vhc1Var));
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new t8y0((hwq) obj, false);
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                l7e0 l7e0Var = ((hwq) obj).g;
                cioVar = l7e0Var instanceof j7e0 ? (j7e0) l7e0Var : null;
                return (cioVar == null || (str2 = cioVar.b) == null) ? "" : str2;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new u8y0((qfd) obj);
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                if (!(obj instanceof qfd) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 22:
                if (obj instanceof rih1) {
                    return null;
                }
                return (qfd) obj;
            case 23:
                vhc1 vhc1Var2 = (vhc1) obj;
                Set set2 = s4b1.f;
                return Boolean.valueOf(uic.x(vhc1Var2.getUri()).c != blc0.ti && i0p1.v(vhc1Var2));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                pay0 pay0Var = (pay0) obj;
                return new qay0(pay0Var.a, (oay0) null, pay0Var.b, 10);
            case 25:
                u771 u771Var = ((g271) obj).a;
                c871 c871Var = u771Var.b.b;
                if (c871Var instanceof ray0) {
                    return new pay0(((ray0) c871Var).a, u771Var);
                }
                eg.m("Check failed.");
                return null;
            case 26:
                iby0 iby0Var = (iby0) obj;
                return new lby0(iby0Var.a, iby0Var.b, iby0Var.c, (wkt) null);
            case 27:
                return new fby0((wkt) obj);
            case 28:
                g271 g271Var = (g271) obj;
                int i3 = g271Var.c;
                t771 t771Var = g271Var.a.a;
                return new iby0(i3, t771Var.b, t771Var.a);
            default:
                return new scy0(((ncy0) obj).a);
        }
    }
}
