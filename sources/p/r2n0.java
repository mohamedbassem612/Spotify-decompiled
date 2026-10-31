package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r2n0 implements m381, l381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public r2n0() {
        this.a = (byte) 0;
        this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, czm0.Q0, new j4r(czm0.P0), czm0.R0), q2n0.a);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        String uri = vhc1Var.getUri();
        mtl mtlVar = ((p2n0) obj).a;
        if (eqn1.N(uri)) {
            return (mtlVar != null ? mtlVar.a : null) == ktl.b;
        }
        return false;
    }

    public boolean t(Object obj) {
        Boolean boolD1;
        String string;
        String str = "";
        switch (this.a) {
            case 1:
                qxc0 qxc0Var = (qxc0) obj;
                if (qxc0Var.t.b) {
                    Set set = h4d0.a;
                    String str2 = (String) qxc0Var.X.get("generation_status");
                    h4d0 h4d0VarU = qyo1.u(str2 != null ? str2 : "");
                    h4d0VarU.getClass();
                    if (!h4d0.a.contains(h4d0VarU)) {
                        return true;
                    }
                }
                return false;
            default:
                qxc0 qxc0Var2 = (qxc0) obj;
                Map map = qxc0Var2.X;
                if (qxc0Var2.t.b) {
                    Set set2 = h4d0.a;
                    String str3 = (String) map.get("generation_status");
                    if (str3 != null && (string = ihc1.e1(str3).toString()) != null) {
                        str = string;
                    }
                    if (qyo1.u(str).b()) {
                        Set set3 = m8y0.g;
                        String str4 = (String) map.get("spotbot_assistant_name");
                        if (str4 == null || ihc1.y0(str4)) {
                            str4 = null;
                        }
                        if (o7h.i0(set3, str4)) {
                            String str5 = (String) map.get("allow_refinement");
                            if ((str5 == null || (boolD1 = ihc1.d1(str5)) == null) ? false : boolD1.booleanValue()) {
                                return true;
                            }
                        }
                    }
                }
                return false;
        }
    }

    public r2n0(j2y0 j2y0Var) {
        this.a = (byte) 1;
        this.b = j2y0Var.e;
    }

    public r2n0(m8y0 m8y0Var) {
        this.a = (byte) 2;
        this.b = m8y0Var.e;
    }
}
