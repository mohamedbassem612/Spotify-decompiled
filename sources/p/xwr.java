package p;

import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xwr implements l381, m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public xwr() {
        this.a = (byte) 1;
        this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, auy.T0, new j4r(auy.S0), auy.U0), jvy.a);
    }

    public final o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        String uri = vhc1Var.getUri();
        mtl mtlVar = ((ivy) obj).a;
        Set set = s4b1.f;
        return (uic.g(uri, blc0.ed) || uic.g(uri, blc0.M3)) && !ob51.m(uri, mtlVar);
    }

    public boolean t(Object obj) {
        String string;
        switch (this.a) {
            case 0:
                f7l1 f7l1Var = ((wwr) obj).a;
                return (f7l1Var != null ? f7l1Var.a : null) instanceof y6l1;
            case 1:
            default:
                Map map = ((qxc0) obj).X;
                Set set = h4d0.a;
                String str = (String) map.get("generation_status");
                if (str == null || (string = ihc1.e1(str).toString()) == null) {
                    string = "";
                }
                if (!qyo1.u(string).b()) {
                    return false;
                }
                String str2 = (String) map.get("spotbot_message_id");
                return !ihc1.y0(str2 != null ? str2 : "");
            case 2:
                k9n0 k9n0Var = (k9n0) obj;
                qxc0 qxc0Var = k9n0Var.a;
                return qxc0Var.S0 > 0 && gyo1.G(qxc0Var.O0, new dlc0[]{dlc0.d}) && !k9n0Var.b && Boolean.parseBoolean((String) qxc0Var.X.get("is_video_first"));
        }
    }

    public xwr(w4y0 w4y0Var) {
        this.a = (byte) 3;
        this.b = w4y0Var.d;
    }

    public xwr(q9n0 q9n0Var) {
        this.a = (byte) 2;
        this.b = q9n0Var.e;
    }

    public xwr(zwr zwrVar) {
        this.a = (byte) 0;
        this.b = zwrVar.e;
    }
}
