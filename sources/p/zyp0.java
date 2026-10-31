package p;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zyp0 {
    public int A;
    public int B;
    public char C;
    public short D;
    public yrg0 E;
    public isd1 F;
    public w9l b;
    public wa00 e;
    public boolean f;
    public boolean g;
    public fkj0 h;
    public boolean i;
    public boolean j;
    public mif1 k;
    public qpc l;
    public f331 m;
    public ProxySelector n;
    public fkj0 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public SocketFactory f112p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public lbe v;
    public anm1 w;
    public int x;
    public int y;
    public int z;
    public zfu a = new zfu();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public zyp0() {
        TimeZone timeZone = z4n1.a;
        this.e = new x4n1();
        this.f = true;
        this.g = true;
        fkj0 fkj0Var = fkj0.g;
        this.h = fkj0Var;
        this.i = true;
        this.j = true;
        this.k = mif1.W0;
        this.m = f331.N0;
        this.o = fkj0Var;
        this.f112p = SocketFactory.getDefault();
        this.s = azp0.H;
        this.t = azp0.G;
        this.u = typ0.a;
        this.v = lbe.c;
        this.y = 10000;
        this.z = 10000;
        this.A = 10000;
        this.C = (char) 60000;
        this.D = (short) 1024;
    }

    public final void a(p090 p090Var) {
        this.c.add(p090Var);
    }

    public final void b(SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager) {
        if (!sSLSocketFactory.equals(this.q) || !x509TrustManager.equals(this.r)) {
            this.E = null;
        }
        this.q = sSLSocketFactory;
        nct0 nct0Var = nct0.a;
        this.w = nct0.a.c(x509TrustManager);
        this.r = x509TrustManager;
    }
}
