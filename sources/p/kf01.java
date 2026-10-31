package p;

import com.spotify.playbacknative.AudioDriver;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.internal.http2.StreamResetException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kf01 extends x170 implements rl00 {
    public final isd1 b;
    public final rr31 c;
    public final Socket d;
    public final Socket e;
    public final ms50 f;
    public final bjy0 g;
    public final uo5 h;
    public final int i;
    public z170 j;
    public boolean k;
    public boolean l;
    public int m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f50p = 1;
    public final ArrayList q = new ArrayList();
    public long r = Long.MAX_VALUE;

    public kf01(isd1 isd1Var, rr31 rr31Var, Socket socket, Socket socket2, ms50 ms50Var, bjy0 bjy0Var, uo5 uo5Var, int i) {
        this.b = isd1Var;
        this.c = rr31Var;
        this.d = socket;
        this.e = socket2;
        this.f = ms50Var;
        this.g = bjy0Var;
        this.h = uo5Var;
        this.i = i;
    }

    public static void f(azp0 azp0Var, rr31 rr31Var, IOException iOException) {
        if (rr31Var.b.type() != Proxy.Type.DIRECT) {
            v02 v02Var = rr31Var.a;
            v02Var.g.connectFailed(v02Var.h.i(), rr31Var.b.address(), iOException);
        }
        yrg0 yrg0Var = azp0Var.D;
        synchronized (yrg0Var) {
            ((LinkedHashSet) yrg0Var.b).add(rr31Var);
        }
    }

    @Override // p.x170
    public final void a(im61 im61Var) {
        synchronized (this) {
            this.f50p = (im61Var.a & 8) != 0 ? im61Var.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // p.rl00
    public final void b() {
        synchronized (this) {
            this.k = true;
        }
    }

    @Override // p.rl00
    public final void cancel() {
        z4n1.c(this.d);
    }

    @Override // p.rl00
    public final rr31 d() {
        return this.c;
    }

    @Override // p.rl00
    public final void e(jf01 jf01Var, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof StreamResetException)) {
                    if (!(this.j != null) || (iOException instanceof ConnectionShutdownException)) {
                        this.k = true;
                        if (this.n == 0) {
                            if (iOException != null) {
                                f(jf01Var.a, this.c, iOException);
                            }
                            this.m++;
                        }
                    }
                } else if (((StreamResetException) iOException).a == 8) {
                    int i = this.o + 1;
                    this.o = i;
                    if (i > 1) {
                        this.k = true;
                        this.m++;
                    }
                } else if (((StreamResetException) iOException).a != 9 || !jf01Var.R0) {
                    this.k = true;
                    this.m++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(v02 v02Var, List list) {
        l370 l370Var = v02Var.h;
        String str = l370Var.d;
        TimeZone timeZone = z4n1.a;
        if (this.q.size() < this.f50p && !this.k) {
            rr31 rr31Var = this.c;
            v02 v02Var2 = rr31Var.a;
            v02 v02Var3 = rr31Var.a;
            if (v02Var2.a(v02Var)) {
                if (u890.j(str, v02Var3.h.d)) {
                    return true;
                }
                if (this.j != null && list != null) {
                    List<rr31> list2 = list;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        for (rr31 rr31Var2 : list2) {
                            Proxy.Type type = rr31Var2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && rr31Var.b.type() == type2 && u890.j(rr31Var.c, rr31Var2.c)) {
                                if (v02Var.d != typ0.a) {
                                    break;
                                }
                                TimeZone timeZone2 = z4n1.a;
                                l370 l370Var2 = v02Var3.h;
                                if (l370Var.e != l370Var2.e) {
                                    break;
                                }
                                boolean zJ = u890.j(str, l370Var2.d);
                                ms50 ms50Var = this.f;
                                if (!zJ) {
                                    if (!this.l && ms50Var != null) {
                                        List listA = ms50Var.a();
                                        if (listA.isEmpty() || !typ0.b(str, (X509Certificate) listA.get(0))) {
                                            break;
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    lbe lbeVar = v02Var.e;
                                    lbeVar.getClass();
                                    ms50Var.getClass();
                                    ms50Var.a();
                                    Iterator it = lbeVar.a.iterator();
                                    if (!it.hasNext()) {
                                        return true;
                                    }
                                    pze0.m(it.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final boolean h(boolean z) {
        long j;
        TimeZone timeZone = z4n1.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        z170 z170Var = this.j;
        if (z170Var != null) {
            synchronized (z170Var) {
                if (z170Var.f) {
                    return false;
                }
                return z170Var.O0 >= z170Var.N0 || jNanoTime < z170Var.P0;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.r;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        ff01 ff01Var = (ff01) this.h.c;
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !ff01Var.z0();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    public final void i() throws SocketException {
        this.r = System.nanoTime();
        bjy0 bjy0Var = this.g;
        if (bjy0Var == bjy0.HTTP_2 || bjy0Var == bjy0.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            y580 y580Var = y580.T0;
            xr20 xr20Var = xr20.a;
            isd1 isd1Var = this.b;
            v170 v170Var = new v170();
            v170Var.b = isd1Var;
            v170Var.e = x170.a;
            v170Var.f = xr20.a;
            uo5 uo5Var = this.h;
            String str = this.c.a.h.d;
            v170Var.c = uo5Var;
            v170Var.d = z4n1.b + ' ' + str;
            v170Var.e = this;
            v170Var.a = this.i;
            v170Var.f = xr20Var;
            z170 z170Var = new z170(v170Var);
            this.j = z170Var;
            im61 im61Var = z170.a1;
            this.f50p = (im61Var.a & 8) != 0 ? im61Var.b[3] : Integer.MAX_VALUE;
            h270 h270Var = z170Var.X0;
            synchronized (h270Var) {
                try {
                    if (h270Var.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = h270.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(z4n1.d(">> CONNECTION " + o170.a.e(), new Object[0]));
                    }
                    h270Var.a.T0(o170.a);
                    h270Var.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            h270 h270Var2 = z170Var.X0;
            im61 im61Var2 = z170Var.R0;
            synchronized (h270Var2) {
                try {
                    if (h270Var2.d) {
                        throw new IOException("closed");
                    }
                    h270Var2.d(0, Integer.bitCount(im61Var2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & im61Var2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            df01 df01Var = h270Var2.a;
                            if (df01Var.c) {
                                throw new IllegalStateException("closed");
                            }
                            df01Var.b.V(i);
                            df01Var.a();
                            h270Var2.a.c(im61Var2.b[i]);
                        }
                    }
                    h270Var2.a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = z170Var.R0.a();
            if (iA != 65535) {
                z170Var.X0.i(0, iA - AudioDriver.SPOTIFY_MAX_VOLUME);
            }
            hsd1.c(z170Var.g.d(), z170Var.c, 0L, z170Var.Y0, 6);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        rr31 rr31Var = this.c;
        sb.append(rr31Var.a.h.d);
        sb.append(':');
        sb.append(rr31Var.a.h.e);
        sb.append(", proxy=");
        sb.append(rr31Var.b);
        sb.append(" hostAddress=");
        sb.append(rr31Var.c);
        sb.append(" cipherSuite=");
        ms50 ms50Var = this.f;
        sb.append(ms50Var != null ? ms50Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
