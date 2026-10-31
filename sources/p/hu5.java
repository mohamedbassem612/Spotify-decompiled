package p;

import com.comscore.streaming.State;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class hu5 implements pf40 {
    public static final hu5 a;
    private static final h661 descriptor;

    static {
        hu5 hu5Var = new hu5();
        a = hu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.TrackData", hu5Var, 19);
        m0v0Var.j("album", true);
        m0v0Var.j("artist", true);
        m0v0Var.j("duration_ms", true);
        m0v0Var.j("name", true);
        m0v0Var.j("track_number", true);
        m0v0Var.j("type", true);
        m0v0Var.j("uri", true);
        m0v0Var.j("saved", true);
        m0v0Var.j("rated", true);
        m0v0Var.j("can_save", true);
        m0v0Var.j("can_rate", true);
        m0v0Var.j("can_start_radio", true);
        m0v0Var.j("can_show_more_albums", true);
        m0v0Var.j("can_skip_next", true);
        m0v0Var.j("can_skip_prev", true);
        m0v0Var.j("can_pause", true);
        m0v0Var.j("can_resume", true);
        m0v0Var.j("can_seek", true);
        m0v0Var.j("image_id", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        nma0 nma0VarZ = m5n1.z(sp5.a);
        nma0 nma0VarZ2 = m5n1.z(yp5.a);
        wr80 wr80Var = wr80.a;
        nma0 nma0VarZ3 = m5n1.z(wr80Var);
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ4 = m5n1.z(chc1Var);
        nma0 nma0VarZ5 = m5n1.z(wr80Var);
        nma0 nma0VarZ6 = m5n1.z(chc1Var);
        nma0 nma0VarZ7 = m5n1.z(chc1Var);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, nma0VarZ6, nma0VarZ7, m5n1.z(gpbVar), m5n1.z(wr80Var), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(chc1Var)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Integer, java.lang.String, p.aq5] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final Object deserialize(dar darVar) {
        ?? r1;
        up5 up5Var;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        int i = 0;
        Boolean bool5 = null;
        Boolean bool6 = null;
        Boolean bool7 = null;
        Boolean bool8 = null;
        Boolean bool9 = null;
        String str = null;
        String str2 = null;
        Boolean bool10 = null;
        Integer num = null;
        boolean z = true;
        up5 up5Var2 = null;
        aq5 aq5Var = null;
        Integer num2 = null;
        String str3 = null;
        Integer num3 = null;
        String str4 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    up5Var = up5Var2;
                    z = false;
                    bool = bool;
                    bool5 = bool5;
                    bool9 = bool9;
                    up5Var2 = up5Var;
                    str3 = str3;
                    bool10 = bool10;
                    bool4 = bool4;
                    bool6 = bool6;
                    str = str;
                    num3 = num3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 0:
                    up5Var = (up5) x1kVarB.B(h661Var, 0, sp5.a, up5Var2);
                    i |= 1;
                    str2 = str2;
                    bool = bool;
                    bool5 = bool5;
                    bool9 = bool9;
                    up5Var2 = up5Var;
                    str3 = str3;
                    bool10 = bool10;
                    bool4 = bool4;
                    bool6 = bool6;
                    str = str;
                    num3 = num3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 1:
                    aq5Var = (aq5) x1kVarB.B(h661Var, 1, yp5.a, aq5Var);
                    i |= 2;
                    str2 = str2;
                    bool10 = bool10;
                    bool4 = bool4;
                    bool5 = bool5;
                    bool9 = bool9;
                    str = str;
                    str3 = str3;
                    bool6 = bool6;
                    num3 = num3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 2:
                    num2 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num2);
                    i |= 4;
                    str2 = str2;
                    bool10 = bool10;
                    bool5 = bool5;
                    bool9 = bool9;
                    str = str;
                    str3 = str3;
                    bool6 = bool6;
                    num3 = num3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 3:
                    bool8 = bool8;
                    str = str;
                    str4 = str4;
                    bool7 = bool7;
                    num3 = num3;
                    str3 = (String) x1kVarB.B(h661Var, 3, chc1.a, str3);
                    i |= 8;
                    str2 = str2;
                    bool10 = bool10;
                    bool6 = bool6;
                    bool9 = bool9;
                    str = str;
                    num3 = num3;
                    bool7 = bool7;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 4:
                    bool8 = bool8;
                    str4 = str4;
                    num3 = (Integer) x1kVarB.B(h661Var, 4, wr80.a, num3);
                    i |= 16;
                    str2 = str2;
                    bool10 = bool10;
                    bool7 = bool7;
                    bool9 = bool9;
                    str = str;
                    str4 = str4;
                    bool8 = bool8;
                    break;
                case 5:
                    str4 = (String) x1kVarB.B(h661Var, 5, chc1.a, str4);
                    i |= 32;
                    str2 = str2;
                    bool10 = bool10;
                    bool8 = bool8;
                    bool9 = bool9;
                    str = str;
                    break;
                case 6:
                    str2 = (String) x1kVarB.B(h661Var, 6, chc1.a, str2);
                    i |= 64;
                    bool10 = bool10;
                    bool9 = bool9;
                    str = str;
                    break;
                case 7:
                    str = str;
                    bool10 = (Boolean) x1kVarB.B(h661Var, 7, gpb.a, bool10);
                    i |= 128;
                    str2 = str2;
                    str = str;
                    break;
                case 8:
                    num = (Integer) x1kVarB.B(h661Var, 8, wr80.a, num);
                    i |= 256;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 9:
                    bool3 = (Boolean) x1kVarB.B(h661Var, 9, gpb.a, bool3);
                    i |= 512;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 10:
                    bool2 = (Boolean) x1kVarB.B(h661Var, 10, gpb.a, bool2);
                    i |= 1024;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 11:
                    bool = (Boolean) x1kVarB.B(h661Var, 11, gpb.a, bool);
                    i |= 2048;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 12:
                    bool4 = (Boolean) x1kVarB.B(h661Var, 12, gpb.a, bool4);
                    i |= 4096;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 13:
                    bool5 = (Boolean) x1kVarB.B(h661Var, 13, gpb.a, bool5);
                    i |= 8192;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 14:
                    bool6 = (Boolean) x1kVarB.B(h661Var, 14, gpb.a, bool6);
                    i |= 16384;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 15:
                    bool7 = (Boolean) x1kVarB.B(h661Var, 15, gpb.a, bool7);
                    i |= 32768;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case 16:
                    bool8 = (Boolean) x1kVarB.B(h661Var, 16, gpb.a, bool8);
                    i |= 65536;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                    bool9 = (Boolean) x1kVarB.B(h661Var, 17, gpb.a, bool9);
                    i |= 131072;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                    str = (String) x1kVarB.B(h661Var, 18, chc1.a, str);
                    i |= 262144;
                    str2 = str2;
                    bool10 = bool10;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        Boolean bool11 = bool4;
        Boolean bool12 = bool8;
        Boolean bool13 = bool9;
        String str5 = str;
        String str6 = str2;
        Boolean bool14 = bool10;
        up5 up5Var3 = up5Var2;
        aq5 aq5Var2 = aq5Var;
        String str7 = str4;
        Boolean bool15 = bool;
        Boolean bool16 = bool7;
        Integer num4 = num3;
        Boolean bool17 = bool6;
        String str8 = str3;
        Boolean bool18 = bool5;
        Integer num5 = num2;
        x1kVarB.a(h661Var);
        ju5 ju5Var = new ju5();
        if ((i & 1) == 0) {
            r1 = 0;
            ju5Var.b = null;
        } else {
            r1 = 0;
            ju5Var.b = up5Var3;
        }
        if ((i & 2) == 0) {
            ju5Var.c = r1;
        } else {
            ju5Var.c = aq5Var2;
        }
        if ((i & 4) == 0) {
            ju5Var.d = r1;
        } else {
            ju5Var.d = num5;
        }
        if ((i & 8) == 0) {
            ju5Var.e = r1;
        } else {
            ju5Var.e = str8;
        }
        if ((i & 16) == 0) {
            ju5Var.f = r1;
        } else {
            ju5Var.f = num4;
        }
        if ((i & 32) == 0) {
            ju5Var.g = r1;
        } else {
            ju5Var.g = str7;
        }
        if ((i & 64) == 0) {
            ju5Var.h = r1;
        } else {
            ju5Var.h = str6;
        }
        if ((i & 128) == 0) {
            ju5Var.i = r1;
        } else {
            ju5Var.i = bool14;
        }
        if ((i & 256) == 0) {
            ju5Var.j = r1;
        } else {
            ju5Var.j = num;
        }
        if ((i & 512) == 0) {
            ju5Var.k = r1;
        } else {
            ju5Var.k = bool3;
        }
        if ((i & 1024) == 0) {
            ju5Var.l = r1;
        } else {
            ju5Var.l = bool2;
        }
        if ((i & 2048) == 0) {
            ju5Var.m = r1;
        } else {
            ju5Var.m = bool15;
        }
        if ((i & 4096) == 0) {
            ju5Var.n = r1;
        } else {
            ju5Var.n = bool11;
        }
        if ((i & 8192) == 0) {
            ju5Var.o = r1;
        } else {
            ju5Var.o = bool18;
        }
        if ((i & 16384) == 0) {
            ju5Var.f20p = r1;
        } else {
            ju5Var.f20p = bool17;
        }
        if ((i & 32768) == 0) {
            ju5Var.q = r1;
        } else {
            ju5Var.q = bool16;
        }
        if ((i & 65536) == 0) {
            ju5Var.r = r1;
        } else {
            ju5Var.r = bool12;
        }
        if ((i & 131072) == 0) {
            ju5Var.s = r1;
        } else {
            ju5Var.s = bool13;
        }
        if ((i & 262144) == 0) {
            ju5Var.t = r1;
            return ju5Var;
        }
        ju5Var.t = str5;
        return ju5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        ju5 ju5Var = (ju5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        up5 up5Var = ju5Var.b;
        if (up5Var != null) {
            z1kVarB.s(h661Var, 0, sp5.a, up5Var);
        }
        aq5 aq5Var = ju5Var.c;
        if (aq5Var != null) {
            z1kVarB.s(h661Var, 1, yp5.a, aq5Var);
        }
        Integer num = ju5Var.d;
        if (num != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num);
        }
        String str = ju5Var.e;
        if (str != null) {
            z1kVarB.s(h661Var, 3, chc1.a, str);
        }
        Integer num2 = ju5Var.f;
        if (num2 != null) {
            z1kVarB.s(h661Var, 4, wr80.a, num2);
        }
        String str2 = ju5Var.g;
        if (str2 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str2);
        }
        String str3 = ju5Var.h;
        if (str3 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str3);
        }
        Boolean bool = ju5Var.i;
        if (bool != null) {
            z1kVarB.s(h661Var, 7, gpb.a, bool);
        }
        Integer num3 = ju5Var.j;
        if (num3 != null) {
            z1kVarB.s(h661Var, 8, wr80.a, num3);
        }
        Boolean bool2 = ju5Var.k;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 9, gpb.a, bool2);
        }
        Boolean bool3 = ju5Var.l;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 10, gpb.a, bool3);
        }
        Boolean bool4 = ju5Var.m;
        if (bool4 != null) {
            z1kVarB.s(h661Var, 11, gpb.a, bool4);
        }
        Boolean bool5 = ju5Var.n;
        if (bool5 != null) {
            z1kVarB.s(h661Var, 12, gpb.a, bool5);
        }
        Boolean bool6 = ju5Var.o;
        if (bool6 != null) {
            z1kVarB.s(h661Var, 13, gpb.a, bool6);
        }
        Boolean bool7 = ju5Var.f20p;
        if (bool7 != null) {
            z1kVarB.s(h661Var, 14, gpb.a, bool7);
        }
        Boolean bool8 = ju5Var.q;
        if (bool8 != null) {
            z1kVarB.s(h661Var, 15, gpb.a, bool8);
        }
        Boolean bool9 = ju5Var.r;
        if (bool9 != null) {
            z1kVarB.s(h661Var, 16, gpb.a, bool9);
        }
        Boolean bool10 = ju5Var.s;
        if (bool10 != null) {
            z1kVarB.s(h661Var, 17, gpb.a, bool10);
        }
        String str4 = ju5Var.t;
        if (str4 != null) {
            z1kVarB.s(h661Var, 18, chc1.a, str4);
        }
        z1kVarB.a(h661Var);
    }
}
