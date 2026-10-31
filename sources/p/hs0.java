package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class hs0 implements pf40 {
    public static final hs0 a;
    private static final h661 descriptor;

    static {
        hs0 hs0Var = new hs0();
        a = hs0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.adonappopen.repository.network.AdOnAppOpenAd.Video", hs0Var, 6);
        m0v0Var.j("bitrate", true);
        m0v0Var.j("durationSec", true);
        m0v0Var.j("height", true);
        m0v0Var.j("width", true);
        m0v0Var.j("mediaFile", true);
        m0v0Var.j("mimetype", true);
        descriptor = m0v0Var;
    }

    public final nma0[] childSerializers() {
        wr80 wr80Var = wr80.a;
        nma0 nma0VarZ = m5n1.z(wr80Var);
        nma0 nma0VarZ2 = m5n1.z(wr80Var);
        nma0 nma0VarZ3 = m5n1.z(wr80Var);
        nma0 nma0VarZ4 = m5n1.z(wr80Var);
        chc1 chc1Var = chc1.a;
        return new nma0[]{nma0VarZ, nma0VarZ2, nma0VarZ3, nma0VarZ4, m5n1.z(chc1Var), m5n1.z(chc1Var)};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        x1kVarB.getClass();
        boolean z = true;
        int i = 0;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        Integer num4 = null;
        String str = null;
        String str2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case SplitInstallErrorCode.ACTIVE_SESSIONS_LIMIT_EXCEEDED /* -1 */:
                    z = false;
                    break;
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    num = (Integer) x1kVarB.B(h661Var, 0, wr80.a, num);
                    i |= 1;
                    break;
                case 1:
                    num2 = (Integer) x1kVarB.B(h661Var, 1, wr80.a, num2);
                    i |= 2;
                    break;
                case 2:
                    num3 = (Integer) x1kVarB.B(h661Var, 2, wr80.a, num3);
                    i |= 4;
                    break;
                case 3:
                    num4 = (Integer) x1kVarB.B(h661Var, 3, wr80.a, num4);
                    i |= 8;
                    break;
                case 4:
                    str = (String) x1kVarB.B(h661Var, 4, chc1.a, str);
                    i |= 16;
                    break;
                case 5:
                    str2 = (String) x1kVarB.B(h661Var, 5, chc1.a, str2);
                    i |= 32;
                    break;
                default:
                    n9v.a(iP);
                    return null;
            }
        }
        x1kVarB.a(h661Var);
        return new js0(i, num, num2, num3, num4, str, str2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        js0 js0Var = (js0) obj;
        String str = js0Var.f;
        String str2 = js0Var.e;
        Integer num = js0Var.d;
        Integer num2 = js0Var.c;
        Integer num3 = js0Var.b;
        Integer num4 = js0Var.a;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        if (z1kVarB.d0() || num4 != null) {
            z1kVarB.s(h661Var, 0, wr80.a, num4);
        }
        if (z1kVarB.d0() || num3 != null) {
            z1kVarB.s(h661Var, 1, wr80.a, num3);
        }
        if (z1kVarB.d0() || num2 != null) {
            z1kVarB.s(h661Var, 2, wr80.a, num2);
        }
        if (z1kVarB.d0() || num != null) {
            z1kVarB.s(h661Var, 3, wr80.a, num);
        }
        if (z1kVarB.d0() || str2 != null) {
            z1kVarB.s(h661Var, 4, chc1.a, str2);
        }
        if (z1kVarB.d0() || str != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str);
        }
        z1kVarB.a(h661Var);
    }
}
