package p;

import com.comscore.streaming.State;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class os5 implements pf40 {
    public static final os5 a;
    private static final h661 descriptor;

    static {
        os5 os5Var = new os5();
        a = os5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.PlayerState", os5Var, 9);
        m0v0Var.j("context_uri", true);
        m0v0Var.j("context_title", true);
        m0v0Var.j("track", true);
        m0v0Var.j("is_paused", true);
        m0v0Var.j("is_paused_bool", true);
        m0v0Var.j("playback_speed", true);
        m0v0Var.j("playback_position", true);
        m0v0Var.j("playback_options", true);
        m0v0Var.j("playback_restrictions", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        chc1 chc1Var = chc1.a;
        nma0 nma0VarZ = m5n1.z(chc1Var);
        nma0 nma0VarZ2 = m5n1.z(chc1Var);
        nma0 nma0VarZ3 = m5n1.z(eu5.a);
        gpb gpbVar = gpb.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, m5n1.z(gpbVar), m5n1.z(gpbVar), m5n1.z(er20.a), m5n1.z(o5f0.a), m5n1.z(vbu0.a), m5n1.z(gcu0.a)};
    }

    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Boolean, java.lang.Float, java.lang.Long, java.lang.String, p.gu5, p.icu0, p.ybu0] */
    /* JADX WARN: Type inference failed for: r1v5 */
    public final Object deserialize(dar darVar) {
        ?? r1;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        String str = null;
        String str2 = null;
        gu5 gu5Var = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Float f = null;
        Long l = null;
        ybu0 ybu0Var = null;
        icu0 icu0Var = null;
        int i = 0;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    break;
                case 0:
                    str = (String) x1kVarB.B(h661Var, 0, chc1.a, str);
                    i |= 1;
                    break;
                case 1:
                    str2 = (String) x1kVarB.B(h661Var, 1, chc1.a, str2);
                    i |= 2;
                    break;
                case 2:
                    gu5Var = (gu5) x1kVarB.B(h661Var, 2, eu5.a, gu5Var);
                    i |= 4;
                    break;
                case 3:
                    bool = (Boolean) x1kVarB.B(h661Var, 3, gpb.a, bool);
                    i |= 8;
                    break;
                case 4:
                    bool2 = (Boolean) x1kVarB.B(h661Var, 4, gpb.a, bool2);
                    i |= 16;
                    break;
                case 5:
                    f = (Float) x1kVarB.B(h661Var, 5, er20.a, f);
                    i |= 32;
                    break;
                case 6:
                    l = (Long) x1kVarB.B(h661Var, 6, o5f0.a, l);
                    i |= 64;
                    break;
                case 7:
                    ybu0Var = (ybu0) x1kVarB.B(h661Var, 7, vbu0.a, ybu0Var);
                    i |= 128;
                    break;
                case 8:
                    icu0Var = (icu0) x1kVarB.B(h661Var, 8, gcu0.a, icu0Var);
                    i |= 256;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        qs5 qs5Var = new qs5();
        if ((i & 1) == 0) {
            r1 = 0;
            qs5Var.b = null;
        } else {
            r1 = 0;
            qs5Var.b = str;
        }
        if ((i & 2) == 0) {
            qs5Var.c = r1;
        } else {
            qs5Var.c = str2;
        }
        if ((i & 4) == 0) {
            qs5Var.d = r1;
        } else {
            qs5Var.d = gu5Var;
        }
        if ((i & 8) == 0) {
            qs5Var.e = r1;
        } else {
            qs5Var.e = bool;
        }
        if ((i & 16) == 0) {
            qs5Var.f = r1;
        } else {
            qs5Var.f = bool2;
        }
        if ((i & 32) == 0) {
            qs5Var.g = r1;
        } else {
            qs5Var.g = f;
        }
        if ((i & 64) == 0) {
            qs5Var.h = r1;
        } else {
            qs5Var.h = l;
        }
        if ((i & 128) == 0) {
            qs5Var.i = r1;
        } else {
            qs5Var.i = ybu0Var;
        }
        if ((i & 256) == 0) {
            qs5Var.j = r1;
            return qs5Var;
        }
        qs5Var.j = icu0Var;
        return qs5Var;
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        qs5 qs5Var = (qs5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        String str = qs5Var.b;
        if (str != null) {
            z1kVarB.s(h661Var, 0, chc1.a, str);
        }
        String str2 = qs5Var.c;
        if (str2 != null) {
            z1kVarB.s(h661Var, 1, chc1.a, str2);
        }
        gu5 gu5Var = qs5Var.d;
        if (gu5Var != null) {
            z1kVarB.s(h661Var, 2, eu5.a, gu5Var);
        }
        Boolean bool = qs5Var.e;
        if (bool != null) {
            z1kVarB.s(h661Var, 3, gpb.a, bool);
        }
        Boolean bool2 = qs5Var.f;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 4, gpb.a, bool2);
        }
        Float f = qs5Var.g;
        if (f != null) {
            z1kVarB.s(h661Var, 5, er20.a, f);
        }
        Long l = qs5Var.h;
        if (l != null) {
            z1kVarB.s(h661Var, 6, o5f0.a, l);
        }
        ybu0 ybu0Var = qs5Var.i;
        if (ybu0Var != null) {
            z1kVarB.s(h661Var, 7, vbu0.a, ybu0Var);
        }
        icu0 icu0Var = qs5Var.j;
        if (icu0Var != null) {
            z1kVarB.s(h661Var, 8, gcu0.a, icu0Var);
        }
        z1kVarB.a(h661Var);
    }
}
