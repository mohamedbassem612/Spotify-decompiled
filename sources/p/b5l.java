package p;

import java.io.IOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b5l implements es31, rl00 {
    public final isd1 a;
    public final k7v b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final boolean h;
    public final jf01 i;
    public final zf01 j;
    public final rr31 k;
    public final List l;
    public final ln21 m;
    public final int n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f10p;
    public Socket q;
    public Socket r;
    public ms50 s;
    public bjy0 t;
    public uo5 u;
    public kf01 v;

    public b5l(isd1 isd1Var, k7v k7vVar, int i, int i2, int i3, int i4, int i5, boolean z, jf01 jf01Var, zf01 zf01Var, rr31 rr31Var, List list, ln21 ln21Var, int i6, boolean z2) {
        this.a = isd1Var;
        this.b = k7vVar;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = z;
        this.i = jf01Var;
        this.j = zf01Var;
        this.k = rr31Var;
        this.l = list;
        this.m = ln21Var;
        this.n = i6;
        this.o = z2;
    }

    @Override // p.es31
    public final kf01 a() {
        yrg0 yrg0Var = this.i.a.D;
        rr31 rr31Var = this.k;
        synchronized (yrg0Var) {
            ((LinkedHashSet) yrg0Var.b).remove(rr31Var);
        }
        kf01 kf01Var = this.v;
        kf01Var.getClass();
        ld31 ld31VarD = this.j.d(this, this.l);
        if (ld31VarD != null) {
            return ld31VarD.a;
        }
        synchronized (kf01Var) {
            k7v k7vVar = this.b;
            TimeZone timeZone = z4n1.a;
            ((ConcurrentLinkedQueue) k7vVar.e).add(kf01Var);
            ((hsd1) k7vVar.c).d((ydu) k7vVar.d, 0L);
            this.i.a(kf01Var);
        }
        jf01 jf01Var = this.i;
        jf01Var.e.k(jf01Var, kf01Var);
        return kf01Var;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0126  */
    /* JADX WARN: Code duplicated, block: B:73:0x012a  */
    @Override // p.es31
    public final ds31 c() throws Throwable {
        b5l b5lVarJ;
        Socket socket;
        b5l b5lVar;
        jf01 jf01Var = this.i;
        xa00 xa00Var = jf01Var.e;
        CopyOnWriteArrayList copyOnWriteArrayList = jf01Var.T0;
        Socket socket2 = this.q;
        b5l b5lVar2 = null;
        if (socket2 == null) {
            hhg1.n("TCP not connected");
            return null;
        }
        if (isReady()) {
            eg.m("already connected");
            return null;
        }
        rr31 rr31Var = this.k;
        v02 v02Var = rr31Var.a;
        Proxy proxy = rr31Var.b;
        InetSocketAddress inetSocketAddress = rr31Var.c;
        v02 v02Var2 = rr31Var.a;
        List list = v02Var.j;
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                if (this.m != null) {
                    ds31 ds31VarI = i();
                    if (ds31VarI.c != null) {
                        copyOnWriteArrayList.remove(this);
                        Socket socket3 = this.r;
                        if (socket3 != null) {
                            z4n1.c(socket3);
                        }
                        z4n1.c(socket2);
                        return ds31VarI;
                    }
                }
                if (v02Var2.c != null) {
                    uo5 uo5Var = this.u;
                    if (uo5Var == null) {
                        u890.C("socket");
                        throw null;
                    }
                    if (((ff01) uo5Var.c).b.z0()) {
                        uo5 uo5Var2 = this.u;
                        if (uo5Var2 == null) {
                            u890.C("socket");
                            throw null;
                        }
                        if (((df01) uo5Var2.d).b.z0()) {
                            xa00Var.G(jf01Var);
                            SSLSocketFactory sSLSocketFactory = v02Var2.c;
                            l370 l370Var = v02Var2.h;
                            SSLSocket sSLSocket = (SSLSocket) sSLSocketFactory.createSocket(socket2, l370Var.d, l370Var.e, true);
                            b5l b5lVarK = k(list, sSLSocket);
                            nal nalVar = (nal) list.get(b5lVarK.n);
                            b5lVarJ = b5lVarK.j(list, sSLSocket);
                            try {
                                nalVar.a(sSLSocket, b5lVarK.o);
                                h(sSLSocket, nalVar);
                                xa00Var.F(jf01Var, this.s);
                                b5lVar = b5lVarJ;
                            } catch (IOException e) {
                                e = e;
                                jf01Var.e.i(jf01Var, inetSocketAddress, proxy, e);
                                if (this.h && upf.i(e)) {
                                    b5lVar2 = b5lVarJ;
                                }
                                ds31 ds31Var = new ds31(this, b5lVar2, e);
                                copyOnWriteArrayList.remove(this);
                                if (!z) {
                                    socket = this.r;
                                    if (socket != null) {
                                        z4n1.c(socket);
                                    }
                                    z4n1.c(socket2);
                                }
                                return ds31Var;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.r = socket2;
                List list2 = v02Var2.i;
                bjy0 bjy0Var = bjy0.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(bjy0Var)) {
                    bjy0Var = bjy0.HTTP_1_1;
                }
                this.t = bjy0Var;
                b5lVar = null;
                try {
                    isd1 isd1Var = this.a;
                    rr31 rr31Var2 = this.k;
                    Socket socket4 = this.r;
                    socket4.getClass();
                    ms50 ms50Var = this.s;
                    bjy0 bjy0Var2 = this.t;
                    bjy0Var2.getClass();
                    uo5 uo5Var3 = this.u;
                    if (uo5Var3 == null) {
                        u890.C("socket");
                        throw null;
                    }
                    kf01 kf01Var = new kf01(isd1Var, rr31Var2, socket2, socket4, ms50Var, bjy0Var2, uo5Var3, this.g);
                    this.v = kf01Var;
                    kf01Var.i();
                    xa00Var.h(jf01Var, inetSocketAddress, proxy, this.t);
                    try {
                        ds31 ds31Var2 = new ds31(this, (Throwable) null, 6);
                        copyOnWriteArrayList.remove(this);
                        return ds31Var2;
                    } catch (IOException e2) {
                        e = e2;
                        b5lVarJ = b5lVar;
                        z = true;
                        jf01Var.e.i(jf01Var, inetSocketAddress, proxy, e);
                        if (this.h) {
                            b5lVar2 = b5lVarJ;
                        }
                        ds31 ds31Var3 = new ds31(this, b5lVar2, e);
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            socket = this.r;
                            if (socket != null) {
                                z4n1.c(socket);
                            }
                            z4n1.c(socket2);
                        }
                        return ds31Var3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        copyOnWriteArrayList.remove(this);
                        if (!z) {
                            Socket socket5 = this.r;
                            if (socket5 != null) {
                                z4n1.c(socket5);
                            }
                            z4n1.c(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                    b5lVarJ = b5lVar;
                }
            } catch (IOException e4) {
                e = e4;
                b5lVarJ = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // p.es31, p.rl00
    public final void cancel() {
        this.f10p = true;
        Socket socket = this.q;
        if (socket != null) {
            z4n1.c(socket);
        }
    }

    @Override // p.rl00
    public final rr31 d() {
        return this.k;
    }

    @Override // p.es31
    public final ds31 f() {
        Socket socket;
        Socket socket2;
        rr31 rr31Var = this.k;
        jf01 jf01Var = this.i;
        CopyOnWriteArrayList copyOnWriteArrayList = jf01Var.T0;
        if (this.q != null) {
            eg.m("TCP already connected");
            return null;
        }
        copyOnWriteArrayList.add(this);
        boolean z = false;
        try {
            try {
                jf01Var.e.j(jf01Var, rr31Var.c, rr31Var.b);
                g();
                z = true;
                ds31 ds31Var = new ds31(this, (Throwable) null, 6);
                copyOnWriteArrayList.remove(this);
                return ds31Var;
            } catch (IOException e) {
                v02 v02Var = rr31Var.a;
                if (rr31Var.b.type() != Proxy.Type.DIRECT) {
                    v02 v02Var2 = rr31Var.a;
                    v02Var2.g.connectFailed(v02Var2.h.i(), rr31Var.b.address(), e);
                }
                jf01Var.e.i(jf01Var, rr31Var.c, rr31Var.b, e);
                ds31 ds31Var2 = new ds31(this, e, 2);
                copyOnWriteArrayList.remove(this);
                if (!z && (socket2 = this.q) != null) {
                    z4n1.c(socket2);
                }
                return ds31Var2;
            }
        } catch (Throwable th) {
            copyOnWriteArrayList.remove(this);
            if (!z && (socket = this.q) != null) {
                z4n1.c(socket);
            }
            throw th;
        }
    }

    public final void g() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.k.b.type();
        int i = type == null ? -1 : a5l.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.k.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.k.b);
        }
        this.q = socketCreateSocket;
        if (this.f10p) {
            k220.i("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            nct0 nct0Var = nct0.a;
            nct0.a.e(socketCreateSocket, this.k.c, this.e);
            try {
                this.u = poz0.k(socketCreateSocket);
            } catch (NullPointerException e) {
                if (u890.j(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.k.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void h(SSLSocket sSLSocket, nal nalVar) {
        final v02 v02Var = this.k.a;
        try {
            if (nalVar.b) {
                nct0 nct0Var = nct0.a;
                nct0.a.d(sSLSocket, v02Var.h.d, v02Var.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            final ms50 ms50VarU = eth.u(session);
            HostnameVerifier hostnameVerifier = v02Var.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(v02Var.h.d, session)) {
                final lbe lbeVar = v02Var.e;
                lbeVar.getClass();
                this.s = new ms50(ms50VarU.a, ms50VarU.b, ms50VarU.c, new Function0() { // from class: p.z4l
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        anm1 anm1Var = lbeVar.b;
                        anm1Var.getClass();
                        return anm1Var.o(v02Var.h.d, ms50VarU.a());
                    }
                });
                Iterator it = lbeVar.a.iterator();
                String strF = null;
                if (it.hasNext()) {
                    pze0.m(it.next());
                    throw null;
                }
                if (nalVar.b) {
                    nct0 nct0Var2 = nct0.a;
                    strF = nct0.a.f(sSLSocket);
                }
                this.r = sSLSocket;
                this.u = poz0.k(sSLSocket);
                this.t = strF != null ? fc11.z(strF) : bjy0.HTTP_1_1;
                nct0 nct0Var3 = nct0.a;
                nct0.a.getClass();
                return;
            }
            List listA = ms50VarU.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + v02Var.h.d + " not verified (no certificates)");
            }
            X509Certificate x509Certificate = (X509Certificate) listA.get(0);
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(v02Var.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            lbe lbeVar2 = lbe.c;
            sb.append(m5n1.Q(x509Certificate));
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(o7h.N0(typ0.a(x509Certificate, 2), typ0.a(x509Certificate, 7)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(jhc1.K(sb.toString()));
        } catch (Throwable th) {
            nct0 nct0Var4 = nct0.a;
            nct0.a.getClass();
            z4n1.c(sSLSocket);
            throw th;
        }
    }

    public final ds31 i() {
        ln21 ln21Var = this.m;
        ln21Var.getClass();
        String str = "CONNECT " + z4n1.i(this.k.a.h, true) + " HTTP/1.1";
        uo5 uo5Var = this.u;
        if (uo5Var == null) {
            u890.C("socket");
            throw null;
        }
        n170 n170Var = new n170(null, this, uo5Var);
        uo5 uo5Var2 = this.u;
        if (uo5Var2 == null) {
            u890.C("socket");
            throw null;
        }
        gve1 gve1VarL = ((ff01) uo5Var2.c).a.l();
        long j = this.c;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        gve1VarL.g(j, timeUnit);
        uo5 uo5Var3 = this.u;
        if (uo5Var3 == null) {
            u890.C("socket");
            throw null;
        }
        ((df01) uo5Var3.d).a.l().g(this.d, timeUnit);
        n170Var.l(ln21Var.c, str);
        n170Var.a();
        zx21 zx21VarF = n170Var.f(false);
        zx21VarF.getClass();
        zx21VarF.a = ln21Var;
        ry21 ry21VarA = zx21VarF.a();
        int i = ry21VarA.d;
        long jE = z4n1.e(ry21VarA);
        if (jE != -1) {
            l170 l170VarK = n170Var.k(ry21VarA.a.a, jE);
            z4n1.g(l170VarK, Integer.MAX_VALUE);
            l170VarK.close();
        }
        if (i == 200) {
            return new ds31(this, (Throwable) null, 6);
        }
        if (i == 407) {
            k220.i("Failed to authenticate with proxy");
            return null;
        }
        k220.i(f4i1.c(i, "Unexpected response code for CONNECT: "));
        return null;
    }

    @Override // p.es31
    public final boolean isReady() {
        return this.t != null;
    }

    public final b5l j(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.n;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            nal nalVar = (nal) list.get(i2);
            if (nalVar.a && (((strArr = nalVar.d) == null || w4n1.g(strArr, sSLSocket.getEnabledProtocols(), zmn0.a)) && ((strArr2 = nalVar.c) == null || w4n1.g(strArr2, sSLSocket.getEnabledCipherSuites(), acg.c)))) {
                return new b5l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, i2, i != -1);
            }
        }
        return null;
    }

    public final b5l k(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.n != -1) {
            return this;
        }
        b5l b5lVarJ = j(list, sSLSocket);
        if (b5lVarJ != null) {
            return b5lVarJ;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.o);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // p.es31
    public final es31 p() {
        return new b5l(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o);
    }

    @Override // p.rl00
    public final void b() {
    }

    @Override // p.rl00
    public final void e(jf01 jf01Var, IOException iOException) {
    }
}
