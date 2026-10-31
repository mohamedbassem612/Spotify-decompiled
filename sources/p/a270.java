package p;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class a270 implements sl00 {
    public static final List g = z4n1.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = z4n1.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final kf01 a;
    public final uf01 b;
    public final z170 c;
    public volatile g270 d;
    public final bjy0 e;
    public volatile boolean f;

    public a270(azp0 azp0Var, kf01 kf01Var, uf01 uf01Var, z170 z170Var) {
        this.a = kf01Var;
        this.b = uf01Var;
        this.c = z170Var;
        List list = azp0Var.s;
        bjy0 bjy0Var = bjy0.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(bjy0Var) ? bjy0Var : bjy0.HTTP_2;
    }

    @Override // p.sl00
    public final void a() {
        g270 g270Var = this.d;
        g270Var.getClass();
        g270Var.i.close();
    }

    @Override // p.sl00
    public final void b(ln21 ln21Var) {
        int i;
        g270 g270Var;
        boolean z;
        if (this.d != null) {
            return;
        }
        boolean z2 = ln21Var.d != null;
        v360 v360Var = ln21Var.c;
        ArrayList arrayList = new ArrayList(v360Var.size() + 4);
        arrayList.add(new cv50(cv50.f, ln21Var.b));
        rhc rhcVar = cv50.g;
        l370 l370Var = ln21Var.a;
        String strB = l370Var.b();
        String strD = l370Var.d();
        if (strD != null) {
            strB = cy30.l(strB, '?', strD);
        }
        arrayList.add(new cv50(rhcVar, strB));
        String strC = v360Var.c("Host");
        if (strC != null) {
            arrayList.add(new cv50(cv50.i, strC));
        }
        arrayList.add(new cv50(cv50.h, l370Var.a));
        int size = v360Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String lowerCase = m5n1.h(v360Var, i2).toLowerCase(Locale.US);
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && m5n1.j(v360Var, i2).equals("trailers"))) {
                arrayList.add(new cv50(lowerCase, m5n1.j(v360Var, i2)));
            }
        }
        z170 z170Var = this.c;
        boolean z3 = !z2;
        synchronized (z170Var.X0) {
            synchronized (z170Var) {
                try {
                    if (z170Var.e > 1073741823) {
                        z170Var.e(8);
                    }
                    if (z170Var.f) {
                        throw new ConnectionShutdownException();
                    }
                    i = z170Var.e;
                    z170Var.e = i + 2;
                    g270Var = new g270(i, z170Var, z3, false, null);
                    z = !z2 || z170Var.U0 >= z170Var.V0 || g270Var.d >= g270Var.e;
                    if (g270Var.h()) {
                        z170Var.b.put(Integer.valueOf(i), g270Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            z170Var.X0.f(i, arrayList, z3);
        }
        if (z) {
            z170Var.X0.flush();
        }
        this.d = g270Var;
        boolean z4 = this.f;
        g270 g270Var2 = this.d;
        if (z4) {
            g270Var2.getClass();
            g270Var2.e(9);
            k220.i("Canceled");
            return;
        }
        g270Var2.getClass();
        f270 f270Var = g270Var2.t;
        long j = this.b.g;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f270Var.g(j, timeUnit);
        g270 g270Var3 = this.d;
        g270Var3.getClass();
        g270Var3.X.g(this.b.h, timeUnit);
    }

    @Override // p.sl00
    public final fka1 c(ry21 ry21Var) {
        g270 g270Var = this.d;
        g270Var.getClass();
        return g270Var.h;
    }

    @Override // p.sl00
    public final void cancel() {
        this.f = true;
        g270 g270Var = this.d;
        if (g270Var != null) {
            g270Var.e(9);
        }
    }

    @Override // p.sl00
    public final c291 d(ln21 ln21Var, long j) {
        g270 g270Var = this.d;
        g270Var.getClass();
        return g270Var.i;
    }

    @Override // p.sl00
    public final boolean e() {
        boolean z;
        g270 g270Var = this.d;
        if (g270Var != null) {
            synchronized (g270Var) {
                e270 e270Var = g270Var.h;
                z = e270Var.b && e270Var.d.z0();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // p.sl00
    public final zx21 f(boolean z) throws IOException {
        v360 v360Var;
        boolean z2;
        g270 g270Var = this.d;
        if (g270Var == null) {
            k220.i("stream wasn't created");
            return null;
        }
        synchronized (g270Var) {
            while (true) {
                if (!g270Var.f.isEmpty() || g270Var.f() != 0) {
                    break;
                }
                if (!z) {
                    g270Var.b.getClass();
                    d270 d270Var = g270Var.i;
                    z2 = d270Var.c || d270Var.a;
                }
                if (z2) {
                    g270Var.t.i();
                }
                try {
                    try {
                        g270Var.wait();
                        if (z2) {
                            g270Var.t.l();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        g270Var.t.l();
                    }
                    throw th;
                }
            }
            if (g270Var.f.isEmpty()) {
                IOException iOException = g270Var.Z;
                if (iOException != null) {
                    throw iOException;
                }
                int iF = g270Var.f();
                l1d.b(iF);
                throw new StreamResetException(iF);
            }
            v360Var = (v360) g270Var.f.removeFirst();
        }
        bjy0 bjy0Var = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = v360Var.size();
        que0 que0VarG = null;
        for (int i = 0; i < size; i++) {
            String strH = m5n1.h(v360Var, i);
            String strJ = m5n1.j(v360Var, i);
            if (strH.equals(":status")) {
                que0VarG = yoi1.G("HTTP/1.1 ".concat(strJ));
            } else if (!h.contains(strH)) {
                arrayList.add(strH);
                arrayList.add(ihc1.e1(strJ).toString());
            }
        }
        if (que0VarG == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        zx21 zx21Var = new zx21();
        zx21Var.b = bjy0Var;
        zx21Var.c = que0VarG.b;
        zx21Var.d = (String) que0VarG.c;
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        t360 t360Var = new t360();
        t360Var.a.addAll(f46.H(strArr));
        zx21Var.f = t360Var;
        if (z && zx21Var.c == 100) {
            return null;
        }
        return zx21Var;
    }

    @Override // p.sl00
    public final void g() {
        this.c.flush();
    }

    @Override // p.sl00
    public final a6a1 h() {
        g270 g270Var = this.d;
        g270Var.getClass();
        return g270Var;
    }

    @Override // p.sl00
    public final rl00 i() {
        return this.a;
    }

    @Override // p.sl00
    public final long j(ry21 ry21Var) {
        if (y270.a(ry21Var)) {
            return z4n1.e(ry21Var);
        }
        return 0L;
    }
}
