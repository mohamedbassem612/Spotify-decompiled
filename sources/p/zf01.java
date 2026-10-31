package p;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zf01 {
    public final isd1 a;
    public final k7v b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final boolean i;
    public final v02 j;
    public final yrg0 k;
    public final jf01 l;
    public final boolean m;
    public up20 n;
    public os31 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public rr31 f109p;
    public final n36 q = new n36();

    public zf01(isd1 isd1Var, k7v k7vVar, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2, v02 v02Var, yrg0 yrg0Var, jf01 jf01Var, ln21 ln21Var) {
        this.a = isd1Var;
        this.b = k7vVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = z2;
        this.j = v02Var;
        this.k = yrg0Var;
        this.l = jf01Var;
        this.m = !u890.j(ln21Var.b, "GET");
    }

    public final boolean a(kf01 kf01Var) {
        os31 os31Var;
        rr31 rr31Var;
        if (this.q.isEmpty() && this.f109p == null) {
            if (kf01Var != null) {
                synchronized (kf01Var) {
                    rr31Var = null;
                    if (kf01Var.m == 0 && kf01Var.k && z4n1.a(kf01Var.c.a.h, this.j.h)) {
                        rr31Var = kf01Var.c;
                    }
                }
                if (rr31Var != null) {
                    this.f109p = rr31Var;
                    return true;
                }
            }
            up20 up20Var = this.n;
            if ((up20Var == null || up20Var.a >= ((ArrayList) up20Var.b).size()) && (os31Var = this.o) != null) {
                return os31Var.a();
            }
        }
        return true;
    }

    public final es31 b() throws SocketException, UnknownServiceException, UnknownHostException {
        Socket socketK;
        ld31 ld31Var;
        b5l b5lVarC;
        String hostName;
        int port;
        List listH;
        boolean zContains;
        kf01 kf01Var = this.l.t;
        if (kf01Var == null) {
            ld31Var = null;
        } else {
            boolean zH = kf01Var.h(this.m);
            synchronized (kf01Var) {
                boolean z = kf01Var.k;
                try {
                    if (!zH) {
                        kf01Var.k = true;
                        socketK = this.l.k();
                    } else if (!z) {
                        l370 l370Var = kf01Var.c.a.h;
                        l370 l370Var2 = this.j.h;
                        socketK = !(l370Var.e == l370Var2.e && u890.j(l370Var.d, l370Var2.d)) ? this.l.k() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.l.t == null) {
                if (socketK != null) {
                    z4n1.c(socketK);
                }
                jf01 jf01Var = this.l;
                jf01Var.e.l(jf01Var, kf01Var);
                ld31Var = null;
            } else {
                if (socketK != null) {
                    eg.m("Check failed.");
                    return null;
                }
                ld31Var = new ld31(kf01Var);
            }
        }
        if (ld31Var != null) {
            return ld31Var;
        }
        ld31 ld31VarD = d(null, null);
        if (ld31VarD != null) {
            return ld31VarD;
        }
        if (!this.q.isEmpty()) {
            return (es31) this.q.removeFirst();
        }
        rr31 rr31Var = this.f109p;
        if (rr31Var != null) {
            this.f109p = null;
            b5lVarC = c(rr31Var, null);
        } else {
            up20 up20Var = this.n;
            if (up20Var == null || up20Var.a >= ((ArrayList) up20Var.b).size()) {
                os31 os31Var = this.o;
                if (os31Var == null) {
                    os31Var = new os31(this.j, this.k, this.l, this.i);
                    this.o = os31Var;
                }
                if (!os31Var.a()) {
                    k220.i("exhausted all routes");
                    return null;
                }
                if (!os31Var.a()) {
                    hhg1.k();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (os31Var.f < os31Var.e.size()) {
                    v02 v02Var = os31Var.a;
                    if (os31Var.f >= os31Var.e.size()) {
                        throw new SocketException("No route to " + v02Var.h.d + "; exhausted proxy configurations: " + os31Var.e);
                    }
                    List list = os31Var.e;
                    int i = os31Var.f;
                    os31Var.f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    jf01 jf01Var2 = os31Var.c;
                    ArrayList arrayList2 = new ArrayList();
                    os31Var.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        l370 l370Var3 = v02Var.h;
                        hostName = l370Var3.d;
                        port = l370Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            bhn0.s(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        hostName = address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostName + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostName, port));
                    } else {
                        if (u4n1.a.e(hostName)) {
                            listH = k4p1.x(InetAddress.getByName(hostName));
                        } else {
                            jf01Var2.e.p(jf01Var2, hostName);
                            try {
                                List listQ0 = f46.Q0(InetAddress.getAllByName(hostName));
                                if (listQ0.isEmpty()) {
                                    throw new UnknownHostException(v02Var.a + " returned no addresses for " + hostName);
                                }
                                jf01Var2.e.o(jf01Var2, hostName, listQ0);
                                listH = listQ0;
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostName));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (os31Var.d) {
                            listH = h5p1.H(listH);
                        }
                        Iterator it = listH.iterator();
                        while (it.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it.next(), port));
                        }
                    }
                    Iterator it2 = os31Var.g.iterator();
                    while (it2.hasNext()) {
                        rr31 rr31Var2 = new rr31(os31Var.a, proxy, (InetSocketAddress) it2.next());
                        yrg0 yrg0Var = os31Var.b;
                        synchronized (yrg0Var) {
                            zContains = ((LinkedHashSet) yrg0Var.b).contains(rr31Var2);
                        }
                        if (zContains) {
                            os31Var.h.add(rr31Var2);
                        } else {
                            arrayList.add(rr31Var2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    r7h.W(os31Var.h, arrayList);
                    os31Var.h.clear();
                }
                up20 up20Var2 = new up20();
                up20Var2.b = arrayList;
                this.n = up20Var2;
                if (this.l.R0) {
                    k220.i("Canceled");
                    return null;
                }
                if (up20Var2.a >= arrayList.size()) {
                    hhg1.k();
                    return null;
                }
                int i2 = up20Var2.a;
                up20Var2.a = i2 + 1;
                b5lVarC = c((rr31) arrayList.get(i2), arrayList);
            } else {
                int i3 = up20Var.a;
                ArrayList arrayList3 = (ArrayList) up20Var.b;
                if (i3 >= arrayList3.size()) {
                    hhg1.k();
                    return null;
                }
                int i4 = up20Var.a;
                up20Var.a = i4 + 1;
                b5lVarC = c((rr31) arrayList3.get(i4), null);
            }
        }
        ld31 ld31VarD2 = d(b5lVarC, b5lVarC.l);
        return ld31VarD2 != null ? ld31VarD2 : b5lVarC;
    }

    public final b5l c(rr31 rr31Var, ArrayList arrayList) throws UnknownServiceException {
        bjy0 bjy0Var = bjy0.H2_PRIOR_KNOWLEDGE;
        v02 v02Var = rr31Var.a;
        if (v02Var.c == null) {
            if (!v02Var.j.contains(nal.h)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = rr31Var.a.h.d;
            nct0 nct0Var = nct0.a;
            if (!nct0.a.h(str)) {
                throw new UnknownServiceException(f4i1.f("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (v02Var.i.contains(bjy0Var)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        ln21 ln21Var = null;
        if (rr31Var.b.type() == Proxy.Type.HTTP) {
            v02 v02Var2 = rr31Var.a;
            if (v02Var2.c != null || v02Var2.i.contains(bjy0Var)) {
                ne neVar = new ne((byte) 9);
                neVar.a = rr31Var.a.h;
                neVar.L("CONNECT", (tn21) null);
                ((t360) neVar.c).g("Host", z4n1.i(rr31Var.a.h, true));
                ((t360) neVar.c).g("Proxy-Connection", "Keep-Alive");
                ((t360) neVar.c).g("User-Agent", "okhttp/5.3.2");
                ln21Var = new ln21(neVar);
                tz21 tz21Var = uz21.a;
                t360 t360Var = new t360();
                t360Var.g("Proxy-Authenticate", "OkHttp-Preemptive");
                m5n1.g(t360Var);
            }
        }
        return new b5l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.l, this, rr31Var, arrayList, ln21Var, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003d A[Catch: all -> 0x003b, TryCatch #1 {all -> 0x003b, blocks: (B:14:0x0030, B:22:0x003d, B:25:0x0044), top: B:53:0x0030 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:14:0x0030, B:22:0x003d, B:25:0x0044), top: B:53:0x0030 }] */
    public final ld31 d(b5l b5lVar, List list) {
        kf01 kf01Var;
        boolean z;
        Socket socketK;
        k7v k7vVar = this.b;
        boolean z2 = this.m;
        v02 v02Var = this.j;
        jf01 jf01Var = this.l;
        boolean z3 = b5lVar != null && b5lVar.isReady();
        Iterator it = ((ConcurrentLinkedQueue) k7vVar.e).iterator();
        while (true) {
            if (!it.hasNext()) {
                kf01Var = null;
                break;
            }
            kf01Var = (kf01) it.next();
            kf01Var.getClass();
            synchronized (kf01Var) {
                if (z3) {
                    try {
                        if (!(kf01Var.j != null)) {
                            z = false;
                        } else if (kf01Var.g(v02Var, list)) {
                            jf01Var.a(kf01Var);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (kf01Var.g(v02Var, list)) {
                    z = false;
                } else {
                    jf01Var.a(kf01Var);
                    z = true;
                }
            }
            if (z) {
                if (kf01Var.h(z2)) {
                    break;
                }
                synchronized (kf01Var) {
                    kf01Var.k = true;
                    socketK = jf01Var.k();
                }
                if (socketK != null) {
                    z4n1.c(socketK);
                }
            }
        }
        if (kf01Var == null) {
            return null;
        }
        if (b5lVar != null) {
            this.f109p = b5lVar.k;
            Socket socket = b5lVar.r;
            if (socket != null) {
                z4n1.c(socket);
            }
        }
        jf01 jf01Var2 = this.l;
        jf01Var2.e.k(jf01Var2, kf01Var);
        return new ld31(kf01Var);
    }
}
