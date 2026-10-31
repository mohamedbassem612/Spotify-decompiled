package p;

import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class n170 implements sl00 {
    public static final v360 f = dm5.V(new String[]{"OkHttp-Response-Body", "Truncated"});
    public final azp0 a;
    public final rl00 b;
    public final uo5 c;
    public byte d;
    public final w360 e;

    public n170(azp0 azp0Var, rl00 rl00Var, uo5 uo5Var) {
        this.a = azp0Var;
        this.b = rl00Var;
        this.c = uo5Var;
        this.e = new w360((ff01) uo5Var.c);
    }

    @Override // p.sl00
    public final void a() {
        ((df01) this.c.d).flush();
    }

    @Override // p.sl00
    public final void b(ln21 ln21Var) {
        Proxy.Type type = this.b.d().b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(ln21Var.b);
        sb.append(' ');
        l370 l370Var = ln21Var.a;
        if (l370Var.f() || type != Proxy.Type.HTTP) {
            String strB = l370Var.b();
            String strD = l370Var.d();
            if (strD != null) {
                strB = cy30.l(strB, '?', strD);
            }
            sb.append(strB);
        } else {
            sb.append(l370Var);
        }
        sb.append(" HTTP/1.1");
        l(ln21Var.c, sb.toString());
    }

    @Override // p.sl00
    public final fka1 c(ry21 ry21Var) {
        ln21 ln21Var = ry21Var.a;
        if (!y270.a(ry21Var)) {
            return k(ln21Var.a, 0L);
        }
        String strC = ry21Var.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        if ("chunked".equalsIgnoreCase(strC)) {
            l370 l370Var = ln21Var.a;
            if (this.d == 4) {
                this.d = (byte) 5;
                return new k170(this, l370Var);
            }
            bhn0.z(this.d, "state: ");
            return null;
        }
        long jE = z4n1.e(ry21Var);
        if (jE != -1) {
            return k(ln21Var.a, jE);
        }
        l370 l370Var2 = ln21Var.a;
        if (this.d != 4) {
            bhn0.z(this.d, "state: ");
            return null;
        }
        this.d = (byte) 5;
        this.b.b();
        return new m170(this, l370Var2);
    }

    @Override // p.sl00
    public final void cancel() {
        this.b.cancel();
    }

    @Override // p.sl00
    public final c291 d(ln21 ln21Var, long j) {
        if ("chunked".equalsIgnoreCase(ln21Var.c.c("Transfer-Encoding"))) {
            if (this.d == 1) {
                this.d = (byte) 2;
                return new j170(this);
            }
            bhn0.z(this.d, "state: ");
            return null;
        }
        if (j == -1) {
            eg.m("Cannot stream a request body without chunked encoding or a known content length!");
            return null;
        }
        if (this.d == 1) {
            this.d = (byte) 2;
            return new nl10(this);
        }
        bhn0.z(this.d, "state: ");
        return null;
    }

    @Override // p.sl00
    public final boolean e() {
        return this.d == 6;
    }

    @Override // p.sl00
    public final zx21 f(boolean z) {
        w360 w360Var = this.e;
        ff01 ff01Var = (ff01) w360Var.b;
        byte b = this.d;
        if (b != 0 && b != 1 && b != 2 && b != 3) {
            bhn0.z(this.d, "state: ");
            return null;
        }
        try {
            String strP = ff01Var.p(w360Var.a);
            w360Var.a -= (long) strP.length();
            que0 que0VarG = yoi1.G(strP);
            int i = que0VarG.b;
            zx21 zx21Var = new zx21();
            zx21Var.b = (bjy0) que0VarG.d;
            zx21Var.c = i;
            zx21Var.d = (String) que0VarG.c;
            t360 t360Var = new t360();
            while (true) {
                String strP2 = ff01Var.p(w360Var.a);
                w360Var.a -= (long) strP2.length();
                if (strP2.length() == 0) {
                    break;
                }
                t360Var.c(strP2);
            }
            zx21Var.f = m5n1.i(m5n1.g(t360Var));
            if (z && i == 100) {
                return null;
            }
            if (i == 100) {
                this.d = (byte) 3;
                return zx21Var;
            }
            if (102 > i || i >= 200) {
                this.d = (byte) 4;
                return zx21Var;
            }
            this.d = (byte) 3;
            return zx21Var;
        } catch (EOFException e) {
            throw new IOException("unexpected end of stream on ".concat(this.b.d().a.h.h()), e);
        }
    }

    @Override // p.sl00
    public final void g() {
        ((df01) this.c.d).flush();
    }

    @Override // p.sl00
    public final a6a1 h() {
        return this.c;
    }

    @Override // p.sl00
    public final rl00 i() {
        return this.b;
    }

    @Override // p.sl00
    public final long j(ry21 ry21Var) {
        if (!y270.a(ry21Var)) {
            return 0L;
        }
        String strC = ry21Var.f.c("Transfer-Encoding");
        if (strC == null) {
            strC = null;
        }
        if ("chunked".equalsIgnoreCase(strC)) {
            return -1L;
        }
        return z4n1.e(ry21Var);
    }

    public final l170 k(l370 l370Var, long j) {
        if (this.d == 4) {
            this.d = (byte) 5;
            return new l170(this, l370Var, j);
        }
        bhn0.z(this.d, "state: ");
        return null;
    }

    public final void l(v360 v360Var, String str) {
        if (this.d != 0) {
            bhn0.z(this.d, "state: ");
            return;
        }
        uo5 uo5Var = this.c;
        df01 df01Var = (df01) uo5Var.d;
        df01Var.Q(str);
        df01Var.Q("\r\n");
        int size = v360Var.size();
        int i = 0;
        while (true) {
            df01 df01Var2 = (df01) uo5Var.d;
            if (i >= size) {
                df01Var2.Q("\r\n");
                this.d = (byte) 1;
                return;
            } else {
                df01Var2.Q(m5n1.h(v360Var, i));
                df01Var2.Q(": ");
                df01Var2.Q(m5n1.j(v360Var, i));
                df01Var2.Q("\r\n");
                i++;
            }
        }
    }
}
