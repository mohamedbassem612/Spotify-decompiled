package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gq6 implements rqw {
    public final /* synthetic */ byte a;

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        r6h1 r6h1Var;
        n8h1 csk0Var;
        iu30 iu30Var;
        r6h1 r6h1Var2;
        iu30 iu30Var2;
        switch (this.a) {
            case 0:
                zp6 zp6Var = (zp6) obj2;
                Integer numN = l0o1.n(op80Var);
                int iIntValue = numN != null ? numN.intValue() : 0;
                h3h1 h3h1VarC = j0o1.C(op80Var);
                if (h3h1VarC == null || (iu30Var = h3h1VarC.b) == null || (r6h1Var = (r6h1) iu30Var.invoke(Integer.valueOf(iIntValue))) == null) {
                    r6h1Var = r6h1.c;
                }
                if (zp6Var instanceof yp6) {
                    String str = ((yp6) zp6Var).c;
                    csk0Var = new csk0(str, str, r6h1Var);
                } else {
                    if (!zp6Var.equals(xp6.a)) {
                        eg.o();
                        return null;
                    }
                    csk0Var = dq6.b;
                }
                return j6p1.k(j6p1.k(new g3h1(csk0Var), new h3h1(new fq6(csk0Var, (byte) 0))), new eq6(r6h1Var));
            default:
                p541 p541Var = (p541) obj;
                Integer numN2 = l0o1.n(op80Var);
                int iIntValue2 = numN2 != null ? numN2.intValue() : 0;
                h3h1 h3h1VarC2 = j0o1.C(op80Var);
                if (h3h1VarC2 == null || (iu30Var2 = h3h1VarC2.b) == null || (r6h1Var2 = (r6h1) iu30Var2.invoke(Integer.valueOf(iIntValue2))) == null) {
                    r6h1Var2 = r6h1.c;
                }
                r541 r541Var = (t541) obj2;
                r541 r541Var2 = r541Var instanceof r541 ? r541Var : null;
                x541 x541Var = r541Var2 != null ? new x541(r541Var2.n, r541Var2.j) : null;
                n8h1 y0m0Var = x541Var != null ? new y0m0(Integer.valueOf(iIntValue2), p541Var.a, x541Var.a, r6h1Var2) : dq6.c;
                return j6p1.k(j6p1.k(new g3h1(y0m0Var), new h3h1(new fq6(y0m0Var, (byte) 1))), new y541(iIntValue2, r6h1Var2));
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        csk0 csk0Var;
        eq6 eq6VarA;
        y0m0 y0m0Var;
        byte b = this.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                zp6 zp6Var = (zp6) obj2;
                up6 up6Var = (up6) obj3;
                if (!(zp6Var instanceof yp6)) {
                    return null;
                }
                String str = ((yp6) zp6Var).c;
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                if (n8h1VarC instanceof csk0) {
                    csk0Var = (csk0) n8h1VarC;
                } else {
                    csk0Var = new csk0(str, str, (op80Var == null || (eq6VarA = op80Var.a(vap1.g)) == null) ? r6h1.c : eq6VarA.b);
                }
                if (up6Var.equals(up6.a)) {
                    return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), csk0Var.b, csk0Var.a, System.currentTimeMillis());
                }
                eg.o();
                return null;
            default:
                p541 p541Var = (p541) obj;
                r541 r541Var = (t541) obj2;
                r541 r541Var2 = r541Var instanceof r541 ? r541Var : null;
                x541 x541Var = r541Var2 != null ? new x541(r541Var2.n, r541Var2.j) : null;
                if (x541Var == null) {
                    return null;
                }
                n8h1 n8h1VarC2 = op80Var != null ? mno1.C(op80Var) : null;
                if (n8h1VarC2 instanceof y0m0) {
                    y0m0Var = (y0m0) n8h1VarC2;
                } else {
                    y541 y541Var = op80Var != null ? (y541) op80Var.a(e2x0.i) : null;
                    y0m0Var = new y0m0(Integer.valueOf(y541Var != null ? y541Var.c : 0), p541Var.a, x541Var.a, y541Var != null ? y541Var.b : r6h1.c);
                }
                return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", x541Var.b)), y0m0Var.b, y0m0Var.a, System.currentTimeMillis());
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                return ((zp6) obj2) instanceof yp6;
            default:
                r541 r541Var = (t541) obj2;
                r541 r541Var2 = r541Var instanceof r541 ? r541Var : null;
                return (r541Var2 != null ? new x541(r541Var2.n, r541Var2.j) : null) != null;
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        switch (this.a) {
            case 0:
                if (!(((zp6) obj2) instanceof yp6)) {
                    return null;
                }
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                csk0 csk0Var = n8h1VarC instanceof csk0 ? (csk0) n8h1VarC : null;
                if (csk0Var != null) {
                    return csk0Var.e();
                }
                return null;
            default:
                r541 r541Var = (t541) obj2;
                r541 r541Var2 = r541Var instanceof r541 ? r541Var : null;
                if ((r541Var2 != null ? new x541(r541Var2.n, r541Var2.j) : null) == null) {
                    return null;
                }
                n8h1 n8h1VarC2 = op80Var != null ? mno1.C(op80Var) : null;
                y0m0 y0m0Var = n8h1VarC2 instanceof y0m0 ? (y0m0) n8h1VarC2 : null;
                if (y0m0Var != null) {
                    return y0m0Var.e();
                }
                return null;
        }
    }
}
