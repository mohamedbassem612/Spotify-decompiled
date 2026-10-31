package p;

import com.comscore.streaming.State;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class y961 implements pf40 {
    public static final y961 a;
    private static final h661 descriptor;

    static {
        y961 y961Var = new y961();
        a = y961Var;
        m0v0 m0v0Var = new m0v0("com.spotify.jam.internal.socialconnect.models.Session", y961Var, 25);
        m0v0Var.j("timestamp", true);
        m0v0Var.j("session_id", true);
        m0v0Var.j("join_session_token", true);
        m0v0Var.j("join_session_url", true);
        m0v0Var.j("session_owner_id", true);
        m0v0Var.j("session_members", true);
        m0v0Var.j("is_listening", true);
        m0v0Var.j("is_controlling", true);
        m0v0Var.j("initialSessionType", true);
        m0v0Var.j("hostActiveDeviceId", true);
        m0v0Var.j("maxMemberCount", true);
        m0v0Var.j("is_session_owner", true);
        m0v0Var.j("participantVolumeControl", true);
        m0v0Var.j("active", true);
        m0v0Var.j("queue_only_mode", true);
        m0v0Var.j("wifi_broadcast", true);
        m0v0Var.j("origin", true);
        m0v0Var.j("configuration", true);
        m0v0Var.j("host_device_info", true);
        m0v0Var.j("quick_blend", true);
        m0v0Var.j("is_paused", true);
        m0v0Var.j("user_capabilities", true);
        m0v0Var.j("is_jam_paused", true);
        m0v0Var.j("is_jam_capped", true);
        m0v0Var.j("session_config", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = ga61.B;
        nma0 nma0VarZ = m5n1.z(o5f0.a);
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        nma0 nma0VarZ3 = m5n1.z(chc1Var);
        nma0 nma0VarZ4 = m5n1.z(chc1Var);
        nma0 nma0VarZ5 = m5n1.z(chc1Var);
        nma0 nma0VarZ6 = m5n1.z((nma0) znb0VarArr[5].getValue());
        nma0 nma0Var = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0Var, nma0Var, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(wr80.a), m5n1.z(nma0Var), m5n1.z(chc1Var), nma0Var, nma0Var, nma0Var, m5n1.z(ug61.a), m5n1.z(db61.a), m5n1.z(rd61.a), nma0Var, nma0Var, m5n1.z(ui61.a), nma0Var, nma0Var, m5n1.z(ta61.a)};
    }

    public final Object deserialize(dar darVar) {
        int i;
        Long l;
        String str;
        int i2;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = ga61.B;
        x1kVarB.getClass();
        String str2 = null;
        Boolean bool = null;
        Integer num = null;
        String str3 = null;
        wg61 wg61Var = null;
        String str4 = null;
        int i3 = 0;
        td61 td61Var = null;
        wi61 wi61Var = null;
        ab61 ab61Var = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        fb61 fb61Var = null;
        boolean zM = false;
        boolean z = true;
        boolean zM2 = false;
        Long l2 = null;
        boolean zM3 = false;
        boolean zM4 = false;
        boolean zM5 = false;
        String str7 = null;
        String str8 = null;
        boolean zM6 = false;
        boolean zM7 = false;
        boolean zM8 = false;
        boolean zM9 = false;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    l = l2;
                    z = false;
                    bool = bool;
                    str6 = str6;
                    l2 = l;
                    str2 = str2;
                    break;
                case 0:
                    l = (Long) x1kVarB.B(h661Var, 0, o5f0.a, l2);
                    i3 |= 1;
                    bool = bool;
                    str5 = str5;
                    str6 = str6;
                    l2 = l;
                    str2 = str2;
                    break;
                case 1:
                    str = str5;
                    str7 = (String) x1kVarB.B(h661Var, 1, chc1.a, str7);
                    i3 |= 2;
                    str8 = str8;
                    str5 = str;
                    str6 = str6;
                    str2 = str2;
                    break;
                case 2:
                    str = str5;
                    str8 = (String) x1kVarB.B(h661Var, 2, chc1.a, str8);
                    i3 |= 4;
                    str5 = str;
                    str6 = str6;
                    str2 = str2;
                    break;
                case 3:
                    str2 = str2;
                    str6 = str6;
                    str5 = (String) x1kVarB.B(h661Var, 3, chc1.a, str5);
                    i3 |= 8;
                    str6 = str6;
                    str2 = str2;
                    break;
                case 4:
                    str2 = str2;
                    str6 = (String) x1kVarB.B(h661Var, 4, chc1.a, str6);
                    i3 |= 16;
                    str5 = str5;
                    str2 = str2;
                    break;
                case 5:
                    str5 = str5;
                    str6 = str6;
                    list = (List) x1kVarB.B(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
                    i3 |= 32;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 6:
                    str5 = str5;
                    zM2 = x1kVarB.M(h661Var, 6);
                    i3 |= 64;
                    str5 = str5;
                    break;
                case 7:
                    str5 = str5;
                    zM = x1kVarB.M(h661Var, 7);
                    i3 |= 128;
                    str5 = str5;
                    break;
                case 8:
                    str5 = str5;
                    str6 = str6;
                    str4 = (String) x1kVarB.B(h661Var, 8, chc1.a, str4);
                    i3 |= 256;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 9:
                    str5 = str5;
                    str6 = str6;
                    str3 = (String) x1kVarB.B(h661Var, 9, chc1.a, str3);
                    i3 |= 512;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 10:
                    str5 = str5;
                    str6 = str6;
                    num = (Integer) x1kVarB.B(h661Var, 10, wr80.a, num);
                    i3 |= 1024;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 11:
                    str5 = str5;
                    str6 = str6;
                    bool = (Boolean) x1kVarB.B(h661Var, 11, gpb.a, bool);
                    i3 |= 2048;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 12:
                    str5 = str5;
                    str6 = str6;
                    str2 = (String) x1kVarB.B(h661Var, 12, chc1.a, str2);
                    i3 |= 4096;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 13:
                    str5 = str5;
                    zM3 = x1kVarB.M(h661Var, 13);
                    i3 |= 8192;
                    str5 = str5;
                    break;
                case 14:
                    str5 = str5;
                    zM4 = x1kVarB.M(h661Var, 14);
                    i3 |= 16384;
                    str5 = str5;
                    break;
                case 15:
                    zM5 = x1kVarB.M(h661Var, 15);
                    i2 = 32768;
                    i3 |= i2;
                    str5 = str5;
                    break;
                case 16:
                    wg61Var = (wg61) x1kVarB.B(h661Var, 16, ug61.a, wg61Var);
                    i = 65536;
                    i3 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                    fb61Var = (fb61) x1kVarB.B(h661Var, 17, db61.a, fb61Var);
                    i = 131072;
                    i3 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                    td61Var = (td61) x1kVarB.B(h661Var, 18, rd61.a, td61Var);
                    i = 262144;
                    i3 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                    zM6 = x1kVarB.M(h661Var, 19);
                    i2 = 524288;
                    i3 |= i2;
                    str5 = str5;
                    break;
                case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                    zM7 = x1kVarB.M(h661Var, 20);
                    i2 = 1048576;
                    i3 |= i2;
                    str5 = str5;
                    break;
                case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                    wi61Var = (wi61) x1kVarB.B(h661Var, 21, ui61.a, wi61Var);
                    i = 2097152;
                    i3 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                case 22:
                    zM8 = x1kVarB.M(h661Var, 22);
                    i2 = 4194304;
                    i3 |= i2;
                    str5 = str5;
                    break;
                case 23:
                    zM9 = x1kVarB.M(h661Var, 23);
                    i2 = 8388608;
                    i3 |= i2;
                    str5 = str5;
                    break;
                case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                    ab61Var = (ab61) x1kVarB.B(h661Var, 24, ta61.a, ab61Var);
                    i = 16777216;
                    i3 |= i;
                    str5 = str5;
                    str6 = str6;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        String str9 = str2;
        String str10 = str6;
        Long l3 = l2;
        String str11 = str7;
        String str12 = str8;
        x1kVarB.a(h661Var);
        return new ga61(i3, l3, str11, str12, str5, str10, list, zM2, zM, str4, str3, num, bool, str9, zM3, zM4, zM5, wg61Var, fb61Var, td61Var, zM6, zM7, wi61Var, zM8, zM9, ab61Var);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ga61 ga61Var = (ga61) obj;
        ab61 ab61Var = ga61Var.y;
        boolean z = ga61Var.x;
        boolean z2 = ga61Var.w;
        wi61 wi61Var = ga61Var.v;
        boolean z3 = ga61Var.u;
        boolean z4 = ga61Var.t;
        td61 td61Var = ga61Var.s;
        fb61 fb61Var = ga61Var.r;
        wg61 wg61Var = ga61Var.q;
        boolean z5 = ga61Var.p;
        boolean z6 = ga61Var.o;
        boolean z7 = ga61Var.n;
        String str = ga61Var.m;
        Boolean bool = ga61Var.l;
        Integer num = ga61Var.k;
        String str2 = ga61Var.j;
        String str3 = ga61Var.i;
        boolean z8 = ga61Var.h;
        boolean z9 = ga61Var.g;
        List list = ga61Var.f;
        String str4 = ga61Var.e;
        String str5 = ga61Var.d;
        String str6 = ga61Var.c;
        String str7 = ga61Var.b;
        Long l = ga61Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = ga61.B;
        if (z1kVarB.d0() || l != null) {
            z1kVarB.s(h661Var, 0, o5f0.a, l);
        }
        if (z1kVarB.d0() || str7 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str7);
        }
        if (z1kVarB.d0() || str6 != null) {
            z1kVarB.s(h661Var, 2, chc1.a, str6);
        }
        if (z1kVarB.d0() || str5 != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str5);
        }
        if (z1kVarB.d0() || str4 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str4);
        }
        if (z1kVarB.d0() || list != null) {
            z1kVarB.s(h661Var, 5, (nma0) znb0VarArr[5].getValue(), list);
        }
        if (z1kVarB.d0() || z9) {
            z1kVarB.E(h661Var, 6, z9);
        }
        if (z1kVarB.d0() || z8) {
            z1kVarB.E(h661Var, 7, z8);
        }
        if (z1kVarB.d0() || str3 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str3);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 9, chc1.a, str2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 10, wr80.a, num);
        }
        if (z1kVarB.d0() || !u890.j(bool, Boolean.FALSE)) {
            z1kVarB.s(h661Var, 11, gpb.a, bool);
        }
        if (z1kVarB.d0() || str != 0) {
            z1kVarB.s(h661Var, 12, chc1.a, str);
        }
        if (z1kVarB.d0() || z7 != 0) {
            z1kVarB.E(h661Var, 13, z7);
        }
        if (z1kVarB.d0() || z6) {
            z1kVarB.E(h661Var, 14, z6);
        }
        if (z1kVarB.d0() || z5) {
            z1kVarB.E(h661Var, 15, z5);
        }
        if (z1kVarB.d0() || wg61Var != null) {
            z1kVarB.s(h661Var, 16, ug61.a, wg61Var);
        }
        if (z1kVarB.d0() || fb61Var != null) {
            z1kVarB.s(h661Var, 17, db61.a, fb61Var);
        }
        if (z1kVarB.d0() || td61Var != null) {
            z1kVarB.s(h661Var, 18, rd61.a, td61Var);
        }
        if (z1kVarB.d0() || z4) {
            z1kVarB.E(h661Var, 19, z4);
        }
        if (z1kVarB.d0() || z3) {
            z1kVarB.E(h661Var, 20, z3);
        }
        if (z1kVarB.d0() || wi61Var != null) {
            z1kVarB.s(h661Var, 21, ui61.a, wi61Var);
        }
        if (z1kVarB.d0() || z2) {
            z1kVarB.E(h661Var, 22, z2);
        }
        if (z1kVarB.d0() || z) {
            z1kVarB.E(h661Var, 23, z);
        }
        if (z1kVarB.d0() || ab61Var != null) {
            z1kVarB.s(h661Var, 24, ta61.a, ab61Var);
        }
        z1kVarB.a(h661Var);
    }
}
