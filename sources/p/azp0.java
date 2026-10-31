package p;

import java.net.ProtocolException;
import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class azp0 implements cxc {
    public static final List G = z4n1.k(new bjy0[]{bjy0.HTTP_2, bjy0.HTTP_1_1});
    public static final List H = z4n1.k(new nal[]{nal.g, nal.h});
    public final int A;
    public final char B;
    public final short C;
    public final yrg0 D;
    public final isd1 E;
    public final w9l F;
    public final zfu a;
    public final List b;
    public final List c;
    public final wa00 d;
    public final boolean e;
    public final boolean f;
    public final fkj0 g;
    public final boolean h;
    public final boolean i;
    public final mif1 j;
    public final qpc k;
    public final f331 l;
    public final ProxySelector m;
    public final fkj0 n;
    public final SocketFactory o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final SSLSocketFactory f9p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final lbe u;
    public final anm1 v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    /* JADX WARN: Type inference failed for: r1v10, types: [int, short] */
    public azp0(zyp0 zyp0Var) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory sSLSocketFactory;
        X509TrustManager x509TrustManager;
        anm1 anm1Var;
        this.a = zyp0Var.a;
        this.b = z4n1.j(zyp0Var.c);
        this.c = z4n1.j(zyp0Var.d);
        this.d = zyp0Var.e;
        this.e = zyp0Var.f;
        this.f = zyp0Var.g;
        this.g = zyp0Var.h;
        this.h = zyp0Var.i;
        this.i = zyp0Var.j;
        this.j = zyp0Var.k;
        this.k = zyp0Var.l;
        this.l = zyp0Var.m;
        dep0 dep0Var = zyp0Var.n;
        if (dep0Var == null && (dep0Var = ProxySelector.getDefault()) == null) {
            dep0Var = dep0.a;
        }
        this.m = dep0Var;
        this.n = zyp0Var.o;
        this.o = zyp0Var.f112p;
        List list = zyp0Var.s;
        this.r = list;
        this.s = zyp0Var.t;
        this.t = zyp0Var.u;
        this.w = zyp0Var.x;
        this.x = zyp0Var.y;
        this.y = zyp0Var.z;
        this.z = zyp0Var.A;
        this.A = zyp0Var.B;
        this.B = zyp0Var.C;
        this.C = zyp0Var.D;
        yrg0 yrg0Var = zyp0Var.E;
        this.D = yrg0Var == null ? new yrg0((byte) 12) : yrg0Var;
        isd1 isd1Var = zyp0Var.F;
        this.E = isd1Var == null ? isd1.l : isd1Var;
        w9l w9lVar = zyp0Var.b;
        if (w9lVar == null) {
            w9lVar = new w9l(5, 5L);
            zyp0Var.b = w9lVar;
        }
        this.F = w9lVar;
        List list2 = list;
        if (!(list2 instanceof Collection) || !list2.isEmpty()) {
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f9p = null;
                    this.v = null;
                    this.q = null;
                    this.u = lbe.c;
                    sSLSocketFactory = null;
                    anm1Var = null;
                    x509TrustManager = null;
                    break;
                }
                if (((nal) it.next()).a) {
                    sSLSocketFactory = zyp0Var.q;
                    if (sSLSocketFactory != null) {
                        this.f9p = sSLSocketFactory;
                        anm1Var = zyp0Var.w;
                        anm1Var.getClass();
                        this.v = anm1Var;
                        x509TrustManager = zyp0Var.r;
                        x509TrustManager.getClass();
                        this.q = x509TrustManager;
                        lbe lbeVar = zyp0Var.v;
                        this.u = u890.j(lbeVar.b, anm1Var) ? lbeVar : new lbe(lbeVar.a, anm1Var);
                        break;
                    }
                    nct0 nct0Var = nct0.a;
                    nct0.a.getClass();
                    TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                    trustManagerFactory.init((KeyStore) null);
                    TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                    trustManagers.getClass();
                    if (trustManagers.length == 1) {
                        TrustManager trustManager = trustManagers[0];
                        if (trustManager instanceof X509TrustManager) {
                            X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                            this.q = x509TrustManager2;
                            nct0 nct0Var2 = nct0.a;
                            nct0Var2.getClass();
                            try {
                                SSLContext sSLContextK = nct0Var2.k();
                                sSLContextK.init(null, new TrustManager[]{x509TrustManager2}, null);
                                SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
                                this.f9p = socketFactory;
                                anm1 anm1VarC = nct0.a.c(x509TrustManager2);
                                this.v = anm1VarC;
                                lbe lbeVar2 = zyp0Var.v;
                                this.u = u890.j(lbeVar2.b, anm1VarC) ? lbeVar2 : new lbe(lbeVar2.a, anm1VarC);
                                x509TrustManager = x509TrustManager2;
                                sSLSocketFactory = socketFactory;
                                anm1Var = anm1VarC;
                                break;
                            } catch (GeneralSecurityException e) {
                                throw new AssertionError("No System TLS: " + e, e);
                            }
                        }
                    }
                    bhn0.f("Unexpected default trust managers: ".concat(Arrays.toString(trustManagers)));
                    throw null;
                }
            }
        } else {
            this.f9p = null;
            this.v = null;
            this.q = null;
            this.u = lbe.c;
            sSLSocketFactory = null;
            anm1Var = null;
            x509TrustManager = null;
            break;
        }
        List list3 = this.c;
        List list4 = this.b;
        if (list4.contains(null)) {
            bhn0.g(list4, "Null interceptor: ");
            throw null;
        }
        if (list3.contains(null)) {
            bhn0.g(list3, "Null network interceptor: ");
            throw null;
        }
        List list5 = this.r;
        if (!(list5 instanceof Collection) || !list5.isEmpty()) {
            Iterator it2 = list5.iterator();
            while (it2.hasNext()) {
                if (((nal) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        eg.m("sslSocketFactory == null");
                        throw null;
                    }
                    if (anm1Var == null) {
                        eg.m("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    eg.m("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            eg.m("Check failed.");
            throw null;
        }
        if (anm1Var != null) {
            eg.m("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            eg.m("Check failed.");
            throw null;
        }
        if (u890.j(this.u, lbe.c)) {
            return;
        }
        eg.m("Check failed.");
        throw null;
    }

    @Override // p.cxc
    public final jf01 a(ln21 ln21Var) {
        return new jf01(this, ln21Var, false);
    }

    /* JADX WARN: Type inference failed for: r1v33, types: [int, short] */
    public final zyp0 b() {
        zyp0 zyp0Var = new zyp0();
        zyp0Var.a = this.a;
        zyp0Var.b = this.F;
        r7h.W(this.b, zyp0Var.c);
        r7h.W(this.c, zyp0Var.d);
        zyp0Var.e = this.d;
        zyp0Var.f = this.e;
        zyp0Var.g = this.f;
        zyp0Var.h = this.g;
        zyp0Var.i = this.h;
        zyp0Var.j = this.i;
        zyp0Var.k = this.j;
        zyp0Var.l = this.k;
        zyp0Var.m = this.l;
        zyp0Var.n = this.m;
        zyp0Var.o = this.n;
        zyp0Var.f112p = this.o;
        zyp0Var.q = this.f9p;
        zyp0Var.r = this.q;
        zyp0Var.s = this.r;
        zyp0Var.t = this.s;
        zyp0Var.u = this.t;
        zyp0Var.v = this.u;
        zyp0Var.w = this.v;
        zyp0Var.x = this.w;
        zyp0Var.y = this.x;
        zyp0Var.z = this.y;
        zyp0Var.A = this.z;
        zyp0Var.B = this.A;
        zyp0Var.C = this.B;
        zyp0Var.D = this.C;
        zyp0Var.E = this.D;
        zyp0Var.F = this.E;
        return zyp0Var;
    }

    public final ig01 c(ln21 ln21Var, bmq0 bmq0Var) {
        ig01 ig01Var = new ig01(this.E, ln21Var, bmq0Var, new Random(), this.A, this.C, this.B);
        if (ln21Var.c.c("Sec-WebSocket-Extensions") != null) {
            ig01.c(ig01Var, new ProtocolException("Request header not permitted: 'Sec-WebSocket-Extensions'"), null, 6);
            return ig01Var;
        }
        zyp0 zyp0VarB = b();
        TimeZone timeZone = z4n1.a;
        zyp0VarB.e = new x4n1();
        ArrayList arrayList = new ArrayList(ig01.x);
        bjy0 bjy0Var = bjy0.H2_PRIOR_KNOWLEDGE;
        if (!arrayList.contains(bjy0Var) && !arrayList.contains(bjy0.HTTP_1_1)) {
            bhn0.s(arrayList, "protocols must contain h2_prior_knowledge or http/1.1: ");
            return null;
        }
        if (arrayList.contains(bjy0Var) && arrayList.size() > 1) {
            bhn0.s(arrayList, "protocols containing h2_prior_knowledge cannot use other protocols: ");
            return null;
        }
        if (arrayList.contains(bjy0.HTTP_1_0)) {
            bhn0.s(arrayList, "protocols must not contain http/1.0: ");
            return null;
        }
        if (arrayList.contains(null)) {
            hhg1.n("protocols must not contain null");
            return null;
        }
        arrayList.remove(bjy0.SPDY_3);
        if (!arrayList.equals(zyp0VarB.t)) {
            zyp0VarB.E = null;
        }
        zyp0VarB.t = Collections.unmodifiableList(arrayList);
        azp0 azp0Var = new azp0(zyp0VarB);
        ne neVarB = ln21Var.b();
        ((t360) neVarB.c).g("Upgrade", "websocket");
        ((t360) neVarB.c).g("Connection", "Upgrade");
        ((t360) neVarB.c).g("Sec-WebSocket-Key", ig01Var.g);
        ((t360) neVarB.c).g("Sec-WebSocket-Version", "13");
        ((t360) neVarB.c).g("Sec-WebSocket-Extensions", "permessage-deflate");
        ln21 ln21Var2 = new ln21(neVarB);
        jf01 jf01Var = new jf01(azp0Var, ln21Var2, true);
        ig01Var.h = jf01Var;
        jf01Var.d(new t8r0(ig01Var, ln21Var2));
        return ig01Var;
    }

    public azp0() {
        this(new zyp0());
    }
}
