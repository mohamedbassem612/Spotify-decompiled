package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class eu5 implements pf40 {
    public static final eu5 a;
    private static final h661 descriptor;

    static {
        eu5 eu5Var = new eu5();
        a = eu5Var;
        m0v0 m0v0Var = new m0v0("com.spotify.interapp.model.AppProtocol.Track", eu5Var, 11);
        m0v0Var.j("artist", true);
        m0v0Var.j("artists", true);
        m0v0Var.j("album", true);
        m0v0Var.j("saved", true);
        m0v0Var.j("duration_ms", true);
        m0v0Var.j("name", true);
        m0v0Var.j("uri", true);
        m0v0Var.j("uid", true);
        m0v0Var.j("image_id", true);
        m0v0Var.j("is_episode", true);
        m0v0Var.j("is_podcast", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = gu5.m;
        nma0 nma0VarZ = m5n1.z(yp5.a);
        nma0 nma0VarZ2 = m5n1.z((nma0) znb0VarArr[1].getValue());
        nma0 nma0VarZ3 = m5n1.z(sp5.a);
        gpb gpbVar = gpb.a;
        nma0 nma0VarZ4 = m5n1.z(gpbVar);
        nma0 nma0VarZ5 = m5n1.z(o5f0.a);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, nma0VarZ5, m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(chc1Var), m5n1.z(gpbVar), m5n1.z(gpbVar)};
    }

    public final Object deserialize(dar darVar) {
        znb0[] znb0VarArr;
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr2 = gu5.m;
        x1kVarB.getClass();
        Boolean bool = null;
        Boolean bool2 = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        aq5 aq5Var = null;
        List list = null;
        up5 up5Var = null;
        Boolean bool3 = null;
        Long l = null;
        String str3 = null;
        String str4 = null;
        while (true) {
            while (true) {
                if (!z) {
                    x1kVarB.a(h661Var);
                    return new gu5(i, aq5Var, list, up5Var, bool3, l, str3, str4, str2, str, bool2, bool);
                }
                int iP = x1kVarB.p(h661Var);
                switch (iP) {
                    case State.UNDEFINED /* -1 */:
                        z = false;
                        continue;
                        break;
                    case 0:
                        aq5Var = (aq5) x1kVarB.B(h661Var, 0, yp5.a, aq5Var);
                        i |= 1;
                        znb0VarArr2 = znb0VarArr2;
                        z = z;
                        continue;
                        break;
                    case 1:
                        znb0VarArr = znb0VarArr2;
                        list = (List) x1kVarB.B(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
                        i |= 2;
                        break;
                    case 2:
                        znb0VarArr = znb0VarArr2;
                        up5Var = (up5) x1kVarB.B(h661Var, 2, sp5.a, up5Var);
                        i |= 4;
                        break;
                    case 3:
                        znb0VarArr = znb0VarArr2;
                        bool3 = (Boolean) x1kVarB.B(h661Var, 3, gpb.a, bool3);
                        i |= 8;
                        break;
                    case 4:
                        znb0VarArr = znb0VarArr2;
                        l = (Long) x1kVarB.B(h661Var, 4, o5f0.a, l);
                        i |= 16;
                        break;
                    case 5:
                        znb0VarArr = znb0VarArr2;
                        str3 = (String) x1kVarB.B(h661Var, 5, chc1.a, str3);
                        i |= 32;
                        break;
                    case 6:
                        znb0VarArr = znb0VarArr2;
                        str4 = (String) x1kVarB.B(h661Var, 6, chc1.a, str4);
                        i |= 64;
                        break;
                    case 7:
                        znb0VarArr = znb0VarArr2;
                        str2 = (String) x1kVarB.B(h661Var, 7, chc1.a, str2);
                        i |= 128;
                        break;
                    case 8:
                        znb0VarArr = znb0VarArr2;
                        str = (String) x1kVarB.B(h661Var, 8, chc1.a, str);
                        i |= 256;
                        break;
                    case 9:
                        znb0VarArr = znb0VarArr2;
                        bool2 = (Boolean) x1kVarB.B(h661Var, 9, gpb.a, bool2);
                        i |= 512;
                        break;
                    case 10:
                        znb0VarArr = znb0VarArr2;
                        bool = (Boolean) x1kVarB.B(h661Var, 10, gpb.a, bool);
                        i |= 1024;
                        break;
                    default:
                        n9v.a(iP);
                        return null;
                }
                znb0VarArr2 = znb0VarArr;
                z = z;
            }
        }
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        gu5 gu5Var = (gu5) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = gu5.m;
        aq5 aq5Var = gu5Var.b;
        List list = gu5Var.c;
        if (aq5Var != null) {
            z1kVarB.s(h661Var, 0, yp5.a, aq5Var);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 1, (nma0) znb0VarArr[1].getValue(), list);
        }
        up5 up5Var = gu5Var.d;
        if (up5Var != null) {
            z1kVarB.s(h661Var, 2, sp5.a, up5Var);
        }
        Boolean bool = gu5Var.e;
        if (bool != null) {
            z1kVarB.s(h661Var, 3, gpb.a, bool);
        }
        Long l = gu5Var.f;
        if (l != null) {
            z1kVarB.s(h661Var, 4, o5f0.a, l);
        }
        String str = gu5Var.g;
        if (str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        String str2 = gu5Var.h;
        if (str2 != null) {
            z1kVarB.s(h661Var, 6, chc1.a, str2);
        }
        String str3 = gu5Var.i;
        if (str3 != null) {
            z1kVarB.s(h661Var, 7, chc1.a, str3);
        }
        String str4 = gu5Var.j;
        if (str4 != null) {
            z1kVarB.s(h661Var, 8, chc1.a, str4);
        }
        Boolean bool2 = gu5Var.k;
        if (bool2 != null) {
            z1kVarB.s(h661Var, 9, gpb.a, bool2);
        }
        Boolean bool3 = gu5Var.l;
        if (bool3 != null) {
            z1kVarB.s(h661Var, 10, gpb.a, bool3);
        }
        z1kVarB.a(h661Var);
    }
}
