package p;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aa3 implements l381, m381 {
    public final /* synthetic */ byte a;
    public final o3r b;

    public aa3(byte b) {
        this.a = b;
        switch (b) {
            case 5:
                jd11 jd11Var = rc11.a;
                this.b = w3p1.l(new l4r(new xv00(jd11Var.b(jo70.class)), 1, oe31.R0, new j4r(oe31.h), oe31.S0), new l4r(new xv00(jd11Var.b(xkk1.class)), 2, oe31.Y, new j4r(oe31.i), oe31.Z), new l4r(new xv00(jd11Var.b(myv0.class)), 2, oe31.N0, new j4r(oe31.t), oe31.O0), new l4r(hvm.b, 2, oe31.P0, new j4r(oe31.X), oe31.Q0), ve21.Y0);
                break;
            case 6:
                this.b = w3p1.o(new l4r(new wlu(rc11.a.b(jo70.class)), 2, aic1.e1, new j4r(aic1.d1), ljc1.b), kjc1.a);
                break;
            default:
                this.b = w3p1.o(new l4r(new wlu(rc11.a.b(mtl.class)), 2, czm0.Z0, new j4r(czm0.Y0), czm0.a1), a3n0.a);
                break;
        }
    }

    public o3r b() {
        byte b = this.a;
        return this.b;
    }

    public boolean r(vhc1 vhc1Var, Object obj) {
        switch (this.a) {
            case 2:
                String uri = vhc1Var.getUri();
                mtl mtlVar = ((z2n0) obj).a;
                if (eqn1.N(uri)) {
                    if ((mtlVar != null ? mtlVar.a : null) == ktl.b) {
                        return true;
                    }
                }
                return false;
            case 3:
                c9n0 c9n0Var = (c9n0) obj;
                Set set = s4b1.f;
                return uic.x(vhc1Var.getUri()).c == blc0.ti && Boolean.parseBoolean((String) c9n0Var.a.X.get("is_video_first"));
            default:
                return false;
        }
    }

    public boolean t(Object obj) {
        String str;
        String str2;
        switch (this.a) {
            case 0:
                z93 z93Var = (z93) obj;
                return (z93Var.b == null || (str = (String) z93Var.a.X.get("artistUris")) == null || (str2 = (String) o7h.s0(ihc1.Q0(str, new String[]{","}, 0, 6))) == null || str2.length() <= 0) ? false : true;
            case 1:
                qxc0 qxc0Var = (qxc0) obj;
                return qxc0Var.t.b && !gyo1.L(qxc0Var.O0);
            case 4:
                qxc0 qxc0Var2 = (qxc0) obj;
                return qxc0Var2.t.b && !gyo1.L(qxc0Var2.O0);
            case 7:
                return d82.a((List) obj);
            default:
                x7m1 x7m1Var = (x7m1) obj;
                return x7m1Var.a || !x7m1Var.b.isEmpty();
        }
    }

    public aa3(e9n0 e9n0Var) {
        this.a = (byte) 3;
        this.b = w3p1.o(new l4r(pwc0.b, 1, k4n0.Y0, new j4r(new xkm0(e9n0Var, (byte) 13)), k4n0.Z0), k4n0.X0);
    }

    public aa3(j2y0 j2y0Var) {
        this.a = (byte) 4;
        this.b = j2y0Var.e;
    }

    public aa3(ca3 ca3Var) {
        this.a = (byte) 0;
        this.b = (o3r) ca3Var.d;
    }

    public aa3(d82 d82Var) {
        this.a = (byte) 7;
        this.b = (o3r) d82Var.f;
    }

    public aa3(jov jovVar) {
        this.a = (byte) 1;
        this.b = jovVar.f;
    }

    public aa3(w7m1 w7m1Var) {
        this.a = (byte) 8;
        this.b = w7m1Var.f;
    }
}
