package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class hc11 implements pka0 {
    public hc11() {
        dm5.S(2, new jqb0((Object) this, (byte) 14));
    }

    public abstract dc11 e();

    public final boolean equals(Object obj) {
        if (!(obj instanceof hc11)) {
            return false;
        }
        hc11 hc11Var = (hc11) obj;
        return u890.j(e(), hc11Var.e()) && n() == hc11Var.n();
    }

    public String getName() {
        return null;
    }

    public final int hashCode() {
        return Integer.hashCode(n()) + (e().hashCode() * 31);
    }

    public boolean l() {
        return false;
    }

    public int n() {
        return 0;
    }

    public int s() {
        return 1;
    }

    public abstract oma0 t();

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder();
        int iC = l1d.C(s());
        if (iC == 0) {
            sb.append("instance parameter");
        } else if (iC == 1) {
            sb.append("context parameter " + getName());
        } else if (iC == 2) {
            sb.append("extension receiver parameter");
        } else {
            if (iC != 3) {
                eg.o();
                return null;
            }
            sb.append("parameter #" + n() + ' ' + getName());
        }
        sb.append(" of ");
        mma0 mma0VarE = e();
        if (mma0VarE instanceof mma0) {
            string = f4x0.p(mma0VarE);
        } else {
            if (!(mma0VarE instanceof nla0)) {
                hhg1.o(mma0VarE, "Illegal callable: ");
                return null;
            }
            nla0 nla0Var = (nla0) mma0VarE;
            StringBuilder sb2 = new StringBuilder();
            f4x0.e(sb2, nla0Var);
            sb2.append("fun ");
            f4x0.h(sb2, nla0Var);
            f4x0.g(sb2, nla0Var.getName());
            o7h.x0(upn1.u(nla0Var), sb2, ", ", "(", ")", zqb0.Y0, 48);
            sb2.append(": ");
            sb2.append(f4x0.r(nla0Var.getReturnType(), false));
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    public boolean w() {
        return false;
    }

    public boolean x() {
        return false;
    }
}
