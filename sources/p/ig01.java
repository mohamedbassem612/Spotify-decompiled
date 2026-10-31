package p;

import java.net.ProtocolException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Random;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ig01 {
    public static final List x = k4p1.x(bjy0.HTTP_1_1);
    public final bmq0 a;
    public final Random b;
    public final long c;
    public final short e;
    public final long f;
    public final String g;
    public jf01 h;
    public ydu i;
    public kil1 j;
    public pil1 k;
    public final hsd1 l;
    public String m;
    public uo5 n;
    public long q;
    public boolean r;
    public String t;
    public boolean u;
    public int v;
    public boolean w;
    public iil1 d = null;
    public final ArrayDeque o = new ArrayDeque();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final ArrayDeque f40p = new ArrayDeque();
    public int s = -1;

    /* JADX WARN: Type inference failed for: r5v1, types: [int, short] */
    public ig01(isd1 isd1Var, ln21 ln21Var, bmq0 bmq0Var, Random random, long j, long j2, long j3) {
        this.a = bmq0Var;
        this.b = random;
        this.c = j;
        this.e = (int) j2;
        this.f = j3;
        this.l = isd1Var.d();
        String str = ln21Var.b;
        if (!"GET".equals(str)) {
            hhg1.f(l1d.m("Request must be GET: ", str));
            throw null;
        }
        byte[] bArr = new byte[16];
        random.nextBytes(bArr);
        int iJ = zod.J(bArr, -1234567890);
        zod.u(16L, 0L, iJ);
        this.g = new rhc(f46.Z(0, bArr, iJ)).b();
    }

    public static void c(ig01 ig01Var, Exception exc, ry21 ry21Var, int i) {
        pil1 pil1Var;
        if ((i & 2) != 0) {
            ry21Var = null;
        }
        boolean z = (i & 4) == 0;
        p811 p811Var = new p811();
        synchronized (ig01Var) {
            try {
                if (ig01Var.u) {
                    return;
                }
                ig01Var.u = true;
                uo5 uo5Var = ig01Var.n;
                pil1 pil1Var2 = ig01Var.k;
                p811Var.a = pil1Var2;
                ig01Var.k = null;
                if (!z && pil1Var2 != null) {
                    hsd1.c(ig01Var.l, ig01Var.m + " writer close", 0L, new fg01(p811Var, (byte) 0), 2);
                }
                ig01Var.l.g();
                try {
                    ig01Var.a.P(exc, ry21Var);
                } finally {
                    if (uo5Var != null) {
                        uo5Var.cancel();
                    }
                    if (z && (pil1Var = (pil1) p811Var.a) != null) {
                        w4n1.b(pil1Var);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final a6a1 a(ry21 ry21Var) throws ProtocolException, NoSuchAlgorithmException {
        v360 v360Var = ry21Var.f;
        int i = ry21Var.d;
        if (i != 101) {
            StringBuilder sb = new StringBuilder("Expected HTTP 101 response but was '");
            sb.append(i);
            sb.append(' ');
            throw new ProtocolException(gvg.k(sb, ry21Var.c, '\''));
        }
        String strC = v360Var.c("Connection");
        if (strC == null) {
            strC = null;
        }
        if (!"Upgrade".equalsIgnoreCase(strC)) {
            throw new ProtocolException(cy30.n("Expected 'Connection' header value 'Upgrade' but was '", strC, '\''));
        }
        String strC2 = v360Var.c("Upgrade");
        if (strC2 == null) {
            strC2 = null;
        }
        if (!"websocket".equalsIgnoreCase(strC2)) {
            throw new ProtocolException(cy30.n("Expected 'Upgrade' header value 'websocket' but was '", strC2, '\''));
        }
        String strC3 = v360Var.c("Sec-WebSocket-Accept");
        String str = strC3 != null ? strC3 : null;
        byte[] bArrM = ryn1.m(this.g + "258EAFA5-E914-47DA-95CA-C5AB0DC85B11");
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.update(bArrM, 0, bArrM.length);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        String strB = new rhc(bArrDigest).b();
        if (u890.j(strB, str)) {
            a6a1 a6a1Var = ry21Var.h;
            if (a6a1Var != null) {
                return a6a1Var;
            }
            throw new ProtocolException("Web Socket socket missing: bad interceptor?");
        }
        throw new ProtocolException("Expected 'Sec-WebSocket-Accept' header value '" + strB + "' but was '" + str + '\'');
    }

    public final boolean b(int i, String str) {
        rhc rhcVar;
        long j = this.f;
        synchronized (this) {
            try {
                x760.H(i);
                if (str != null) {
                    rhcVar = new rhc(ryn1.m(str));
                    rhcVar.c = str;
                    if (rhcVar.a.length > 123) {
                        throw new IllegalArgumentException("reason.size() > 123: ".concat(str).toString());
                    }
                } else {
                    rhcVar = null;
                }
                if (!this.u && !this.r) {
                    this.r = true;
                    this.f40p.add(new gg01(i, j, rhcVar));
                    e();
                    return true;
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        int i;
        String str;
        kil1 kil1Var;
        boolean z;
        synchronized (this) {
            try {
                i = this.s;
                str = this.t;
                kil1Var = this.j;
                this.j = null;
                if (this.r && this.f40p.isEmpty()) {
                    pil1 pil1Var = this.k;
                    if (pil1Var != null) {
                        this.k = null;
                        hsd1.c(this.l, this.m + " writer close", 0L, new g030(pil1Var, (byte) 27), 2);
                    }
                    this.l.g();
                }
                z = (this.u || this.k != null || this.s == -1) ? false : true;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            bmq0 bmq0Var = this.a;
            str.getClass();
            bmq0Var.N(i, str);
        }
        if (kil1Var != null) {
            w4n1.b(kil1Var);
        }
    }

    public final void e() {
        TimeZone timeZone = z4n1.a;
        ydu yduVar = this.i;
        if (yduVar != null) {
            this.l.d(yduVar, 0L);
        }
    }

    public final synchronized boolean f(int i, rhc rhcVar) {
        if (!this.u && !this.r) {
            long j = this.q;
            byte[] bArr = rhcVar.a;
            if (((long) bArr.length) + j > 16777216) {
                b(1001, null);
                return false;
            }
            this.q = j + ((long) bArr.length);
            this.f40p.add(new hg01(i, rhcVar));
            e();
            return true;
        }
        return false;
    }

    public final boolean g() {
        String str;
        int i;
        pil1 pil1Var;
        synchronized (this) {
            try {
                boolean z = false;
                if (this.u) {
                    return false;
                }
                pil1 pil1Var2 = this.k;
                Object objPoll = this.o.poll();
                Object obj = null;
                if (objPoll == null) {
                    Object objPoll2 = this.f40p.poll();
                    if (objPoll2 instanceof gg01) {
                        i = this.s;
                        str = this.t;
                        if (i != -1) {
                            pil1Var = this.k;
                            this.k = null;
                            if (pil1Var != null && this.j == null) {
                                z = true;
                            }
                            this.l.g();
                        } else {
                            long jA = ((gg01) objPoll2).a();
                            hsd1.c(this.l, this.m + " cancel", TimeUnit.MILLISECONDS.toNanos(jA), new g030(this, (byte) 28), 4);
                            pil1Var = null;
                        }
                    } else {
                        if (objPoll2 == null) {
                            return false;
                        }
                        str = null;
                        i = -1;
                        pil1Var = null;
                    }
                    obj = objPoll2;
                } else {
                    str = null;
                    i = -1;
                    pil1Var = null;
                }
                try {
                    if (objPoll != null) {
                        pil1Var2.getClass();
                        pil1Var2.a(10, (rhc) objPoll);
                    } else if (obj instanceof hg01) {
                        pil1Var2.getClass();
                        pil1Var2.c(((hg01) obj).b(), ((hg01) obj).a());
                        synchronized (this) {
                            this.q -= (long) ((hg01) obj).a().a.length;
                        }
                    } else {
                        if (!(obj instanceof gg01)) {
                            throw new AssertionError();
                        }
                        pil1Var2.getClass();
                        int iB = ((gg01) obj).b();
                        rhc rhcVarC = ((gg01) obj).c();
                        rhc rhcVarW = rhc.d;
                        if (iB != 0 || rhcVarC != null) {
                            if (iB != 0) {
                                x760.H(iB);
                            }
                            nac nacVar = new nac();
                            nacVar.V(iB);
                            if (rhcVarC != null) {
                                nacVar.N(rhcVarC);
                            }
                            rhcVarW = nacVar.w(nacVar.b);
                        }
                        try {
                            pil1Var2.a(8, rhcVarW);
                            pil1Var2.h = true;
                            if (z) {
                                bmq0 bmq0Var = this.a;
                                str.getClass();
                                bmq0Var.N(i, str);
                            }
                        } catch (Throwable th) {
                            pil1Var2.h = true;
                            throw th;
                        }
                    }
                    if (pil1Var != null) {
                        w4n1.b(pil1Var);
                    }
                    return true;
                } catch (Throwable th2) {
                    if (pil1Var != null) {
                        w4n1.b(pil1Var);
                    }
                    throw th2;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
