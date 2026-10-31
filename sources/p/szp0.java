package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class szp0 extends xa00 {
    public final yqg b;
    public final v4g1 c;
    public final i4g1 d;
    public final boolean e;

    public szp0(yqg yqgVar, v4g1 v4g1Var, i4g1 i4g1Var, boolean z) {
        this.b = yqgVar;
        this.c = v4g1Var;
        this.d = i4g1Var;
        this.e = z;
    }

    public final void B(jf01 jf01Var, ry21 ry21Var) {
        long jB = this.b.b();
        qzp0 qzp0Var = new qzp0(ry21Var, (byte) 0);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.b(i4g1Var, qzp0Var);
        v4g1Var.a(i4g1Var, new rzp0(jB, ry21Var, (byte) 0));
        v4g1Var.c(i4g1Var, new rzp0(jB, ry21Var, (byte) 1));
    }

    public final void C(jf01 jf01Var) {
        this.c.c(this.d, new pzp0(this, (byte) 2));
    }

    public final void b(jf01 jf01Var, ry21 ry21Var) {
        if (ry21Var.i == null) {
            this.c.c(this.d, cwp0.e);
        }
    }

    public final void d(jf01 jf01Var) {
        long jB = this.b.b();
        oy20 oy20Var = new oy20((byte) 1, jB);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.c(i4g1Var, oy20Var);
        v4g1Var.a(i4g1Var, new nzp0(jB, jf01Var, this, (byte) 0));
    }

    public final void e(jf01 jf01Var, IOException iOException) {
        String message;
        long jB = this.b.b();
        voe1 voe1VarK = gtv0.k();
        int i = 3;
        if (!(iOException instanceof SocketTimeoutException) && (!(iOException instanceof InterruptedIOException) || (message = iOException.getMessage()) == null || !ihc1.h0(message, "timeout", true))) {
            i = jf01Var.R0 ? 4 : 2;
        }
        this.c.a(this.d, new ws50(iOException, jB, jf01Var, i, voe1VarK));
    }

    public final void f(jf01 jf01Var) {
        st60 st60Var;
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        q4g1 q4g1Var = new q4g1(UUID.randomUUID(), jf01Var.b.a.i, this.b.b());
        boolean z = this.e;
        p811 p811Var = new p811();
        v4g1Var.d.computeIfAbsent(i4g1Var, new s4g1(q4g1Var, z, v4g1Var, p811Var));
        gxc gxcVar = (gxc) p811Var.a;
        if (gxcVar != null) {
            mxc mxcVar = gxcVar.b;
            n270 n270Var = (n270) i4g1Var.a.b.c(n270.class);
            List listA = n270Var != null ? n270Var.a() : null;
            if (listA == null) {
                listA = z6x.a;
            }
            List<m270> list = listA;
            for (m270 m270Var : list) {
                try {
                    m270Var.b(i4g1Var.a);
                } catch (Exception e) {
                    n57.t("HttpCallListener " + m270Var.getClass().getName() + " threw", e);
                }
            }
            synchronized (mxcVar) {
                mxcVar.j = false;
                st60Var = mxcVar.k;
                mxcVar.k = null;
            }
            if (st60Var != null) {
                for (m270 m270Var2 : list) {
                    try {
                        m270Var2.a(i4g1Var.a, st60Var);
                    } catch (Exception e2) {
                        n57.t("HttpCallListener " + m270Var2.getClass().getName() + " threw", e2);
                    }
                }
            }
        }
    }

    public final void g(jf01 jf01Var) {
        this.c.a(this.d, new lff(this.b.b(), jf01Var, gtv0.k()));
    }

    public final void h(jf01 jf01Var, InetSocketAddress inetSocketAddress, Proxy proxy, bjy0 bjy0Var) {
        this.c.c(this.d, new ozp0(this, bjy0Var, (byte) 0));
    }

    public final void i(jf01 jf01Var, InetSocketAddress inetSocketAddress, Proxy proxy, IOException iOException) {
        this.c.c(this.d, new pzp0(this, (byte) 0));
    }

    public final void j(jf01 jf01Var, InetSocketAddress inetSocketAddress, Proxy proxy) {
        iu30 ozp0Var = new ozp0(this, jf01Var, (byte) 2);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.b(i4g1Var, ozp0Var);
        v4g1Var.c(i4g1Var, new ozp0(this, proxy, (byte) 1));
    }

    public final void k(jf01 jf01Var, kf01 kf01Var) {
        iu30 ozp0Var = new ozp0(this, jf01Var, (byte) 2);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.b(i4g1Var, ozp0Var);
        long jB = this.b.b();
        v4g1Var.c(i4g1Var, new cnp0(kf01Var, (byte) 14));
        v4g1Var.a(i4g1Var, new nzp0(jB, jf01Var, this, (byte) 1));
    }

    public final void t(jf01 jf01Var, long j) {
        long j2;
        long jB = this.b.b();
        i4g1 i4g1Var = this.d;
        v4g1 v4g1Var = this.c;
        if (j > 0) {
            j2 = j;
            v4g1Var.a(i4g1Var, new qna((byte) 7, jB, j2));
        } else {
            j2 = j;
        }
        v4g1Var.c(i4g1Var, new qna((byte) 8, jB, j2));
    }

    public final void w(jf01 jf01Var, ln21 ln21Var) {
        long jB = this.b.b();
        long jB2 = ln21Var.c.b();
        iu30 cnp0Var = new cnp0(ln21Var, (byte) 15);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.b(i4g1Var, cnp0Var);
        v4g1Var.a(i4g1Var, new qna((byte) 9, jB, jB2));
        v4g1Var.c(i4g1Var, new da5(ln21Var, jB, jB2, (byte) 4));
    }

    public final void x(jf01 jf01Var) {
        iu30 ozp0Var = new ozp0(this, jf01Var, (byte) 2);
        v4g1 v4g1Var = this.c;
        i4g1 i4g1Var = this.d;
        v4g1Var.b(i4g1Var, ozp0Var);
        v4g1Var.c(i4g1Var, new pzp0(this, (byte) 1));
    }

    public final void y(jf01 jf01Var, long j) {
        this.c.c(this.d, new n82(this, j, (byte) 11));
    }
}
