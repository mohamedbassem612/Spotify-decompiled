package p;

import com.comscore.streaming.State;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class aaa0 implements pf40 {
    public static final aaa0 a;
    private static final h661 descriptor;

    static {
        aaa0 aaa0Var = new aaa0();
        a = aaa0Var;
        m0v0 m0v0Var = new m0v0("com.spotify.inappuserfeedback.issuereporterimpl.JiraPostRequest", aaa0Var, 7);
        m0v0Var.j("summary", false);
        m0v0Var.j("description", false);
        m0v0Var.j("project_key", false);
        m0v0Var.j("files", false);
        m0v0Var.j("report_owner_username", false);
        m0v0Var.j("feature", true);
        m0v0Var.j("labels", true);
        descriptor = m0v0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final nma0[] childSerializers() {
        znb0[] znb0VarArr = caa0.h;
        chc1 chc1Var = chc1.a;
        return new nma0[]{chc1Var, chc1Var, chc1Var, znb0VarArr[3].getValue(), chc1Var, m5n1.z(chc1Var), m5n1.z((nma0) znb0VarArr[6].getValue())};
    }

    public final Object deserialize(dar darVar) {
        h661 h661Var = descriptor;
        x1k x1kVarB = darVar.b(h661Var);
        znb0[] znb0VarArr = caa0.h;
        x1kVarB.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String strF = null;
        String strF2 = null;
        String strF3 = null;
        List list = null;
        String strF4 = null;
        String str = null;
        List list2 = null;
        while (z) {
            int iP = x1kVarB.p(h661Var);
            switch (iP) {
                case State.UNDEFINED /* -1 */:
                    z = false;
                    continue;
                case 0:
                    strF = x1kVarB.f(h661Var, 0);
                    i |= 1;
                    break;
                case 1:
                    strF2 = x1kVarB.f(h661Var, 1);
                    i |= 2;
                    break;
                case 2:
                    strF3 = x1kVarB.f(h661Var, 2);
                    i |= 4;
                    break;
                case 3:
                    list = (List) x1kVarB.A(h661Var, 3, (nma0) znb0VarArr[3].getValue(), list);
                    i |= 8;
                    break;
                case 4:
                    strF4 = x1kVarB.f(h661Var, 4);
                    i |= 16;
                    break;
                case 5:
                    str = (String) x1kVarB.B(h661Var, 5, chc1.a, str);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) x1kVarB.B(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    n9v.a(iP);
                    return obj;
            }
            obj = null;
        }
        x1kVarB.a(h661Var);
        return new caa0(i, strF, strF2, strF3, list, strF4, str, list2);
    }

    public final h661 getDescriptor() {
        return descriptor;
    }

    public final void serialize(uax uaxVar, Object obj) {
        caa0 caa0Var = (caa0) obj;
        h661 h661Var = descriptor;
        z1k z1kVarB = uaxVar.b(h661Var);
        znb0[] znb0VarArr = caa0.h;
        String str = caa0Var.a;
        List list = caa0Var.g;
        z1kVarB.G(h661Var, 0, str);
        z1kVarB.G(h661Var, 1, caa0Var.b);
        z1kVarB.G(h661Var, 2, caa0Var.c);
        z1kVarB.k(h661Var, 3, (nma0) znb0VarArr[3].getValue(), caa0Var.d);
        z1kVarB.G(h661Var, 4, caa0Var.e);
        String str2 = caa0Var.f;
        if (str2 != null) {
            z1kVarB.s(h661Var, 5, chc1.a, str2);
        }
        if (list != null) {
            z1kVarB.s(h661Var, 6, (nma0) znb0VarArr[6].getValue(), list);
        }
        z1kVarB.a(h661Var);
    }
}
