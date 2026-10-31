package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.internal.http2.ConnectionShutdownException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class o4c implements p090 {
    public final /* synthetic */ byte a;
    public final Object b;

    public o4c(avw0 avw0Var, d520 d520Var) {
        this.a = (byte) 3;
        this.b = d520Var;
    }

    public static int e(ry21 ry21Var, int i) {
        String strC = ry21Var.f.c("Retry-After");
        if (strC == null) {
            strC = null;
        }
        if (strC == null) {
            return i;
        }
        if (Pattern.compile("\\d+").matcher(strC).matches()) {
            return Integer.valueOf(strC).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x035b  */
    /* JADX WARN: Code duplicated, block: B:229:0x04de  */
    /* JADX WARN: Code duplicated, block: B:232:0x04e8  */
    /* JADX WARN: Code duplicated, block: B:235:0x04f5  */
    /* JADX WARN: Code duplicated, block: B:236:0x04fb  */
    /* JADX WARN: Code duplicated, block: B:244:0x0510  */
    /* JADX WARN: Code duplicated, block: B:246:0x0518  */
    /* JADX WARN: Code duplicated, block: B:248:0x0520  */
    /* JADX WARN: Code duplicated, block: B:256:0x054f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:257:0x0551  */
    /* JADX WARN: Code duplicated, block: B:258:0x0556 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:259:0x0558  */
    /* JADX WARN: Code duplicated, block: B:260:0x055c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:261:0x055e  */
    /* JADX WARN: Code duplicated, block: B:263:0x0585  */
    /* JADX WARN: Code duplicated, block: B:354:0x07bc  */
    /* JADX WARN: Code duplicated, block: B:372:0x0800  */
    /* JADX WARN: Code duplicated, block: B:373:0x0802  */
    /* JADX WARN: Code duplicated, block: B:375:0x081f  */
    /* JADX WARN: Code duplicated, block: B:376:0x0821  */
    /* JADX WARN: Code duplicated, block: B:379:0x083e  */
    /* JADX WARN: Code duplicated, block: B:526:? A[RETURN, SYNTHETIC] */
    @Override // p.p090
    public final ry21 a(uf01 uf01Var) throws Throwable {
        boolean z;
        boolean z2;
        uz21 uz21Var;
        ry21 ry21Var;
        long j;
        int i;
        Date dateA;
        long j2;
        long j3;
        Date dateA2;
        Date dateA3;
        String str;
        String str2;
        String str3;
        i25 i25Var;
        i25 i25Var2;
        rm5 rm5Var;
        long millis;
        long time;
        String string;
        int i2;
        int i3;
        long millis2;
        String str4;
        String str5;
        long j4;
        zx21 zx21VarC;
        int i4;
        i25 i25Var3;
        i25 i25VarC;
        i25 i25Var4;
        ry21 ry21VarA;
        i25 i25VarD;
        i25 i25VarD2;
        boolean z3;
        boolean z4;
        SSLSocketFactory sSLSocketFactory;
        HostnameVerifier hostnameVerifier;
        lbe lbeVar;
        switch (this.a) {
            case 0:
                mif1 mif1Var = (mif1) this.b;
                ln21 ln21Var = uf01Var.e;
                ne neVarB = ln21Var.b();
                v360 v360Var = ln21Var.c;
                tn21 tn21Var = ln21Var.d;
                if (tn21Var != null) {
                    r8i0 r8i0VarB = tn21Var.b();
                    if (r8i0VarB != null) {
                        neVarB.G("Content-Type", r8i0VarB.a);
                    }
                    long jA = tn21Var.a();
                    if (jA != -1) {
                        neVarB.G("Content-Length", String.valueOf(jA));
                        neVarB.O("Transfer-Encoding");
                    } else {
                        neVarB.G("Transfer-Encoding", "chunked");
                        neVarB.O("Content-Length");
                    }
                }
                if (v360Var.c("Host") == null) {
                    z = false;
                    neVarB.G("Host", z4n1.i(ln21Var.a, false));
                } else {
                    z = false;
                }
                if (v360Var.c("Connection") == null) {
                    neVarB.G("Connection", "Keep-Alive");
                }
                if (v360Var.c("Accept-Encoding") == null && v360Var.c("Range") == null) {
                    neVarB.G("Accept-Encoding", "gzip");
                    z2 = true;
                } else {
                    z2 = z;
                }
                if (v360Var.c("User-Agent") == null) {
                    neVarB.G("User-Agent", "okhttp/5.3.2");
                }
                ln21 ln21Var2 = new ln21(neVarB);
                ry21 ry21VarB = uf01Var.b(ln21Var2);
                v360 v360Var2 = ry21VarB.f;
                l370 l370Var = ln21Var2.a;
                int i5 = y270.a;
                if (mif1Var != mif1.W0) {
                    Pattern pattern = v2n.k;
                    ejo1.s(l370Var, v360Var2).isEmpty();
                }
                zx21 zx21VarC2 = ry21VarB.c();
                zx21VarC2.a = ln21Var2;
                if (z2) {
                    String strC = v360Var2.c("Content-Encoding");
                    if (strC == null) {
                        strC = null;
                    }
                    if ("gzip".equalsIgnoreCase(strC) && y270.a(ry21VarB) && (uz21Var = ry21VarB.g) != null) {
                        br50 br50Var = new br50(uz21Var.d1());
                        t360 t360VarI = m5n1.i(v360Var2);
                        t360VarI.f("Content-Encoding");
                        t360VarI.f("Content-Length");
                        zx21VarC2.f = m5n1.i(m5n1.g(t360VarI));
                        String strC2 = v360Var2.c("Content-Type");
                        zx21VarC2.g = new yf01(strC2 == null ? null : strC2, -1L, sj1.g(br50Var));
                    }
                }
                return zx21VarC2.a();
            case 1:
                ln21 ln21Var3 = uf01Var.e;
                try {
                    return uf01Var.b(ln21Var3);
                } catch (IllegalArgumentException unused) {
                    xf01 xf01Var = (xf01) this.b;
                    qpc qpcVar = xf01Var.c;
                    if (qpcVar != null) {
                        try {
                            qpcVar.a();
                        } catch (IOException unused2) {
                            Logger.d("Could not clear cache, %s", new Object[]{xf01Var.a.getAbsolutePath()});
                        }
                        break;
                    }
                    return uf01Var.b(ln21Var3);
                }
            case 2:
                jf01 jf01Var = uf01Var.a;
                qpc qpcVar2 = (qpc) this.b;
                if (qpcVar2 != null) {
                    ln21 ln21Var4 = uf01Var.e;
                    j9k1.l(ln21Var4);
                    l370 l370Var2 = ln21Var4.a;
                    try {
                        wdu wduVarE = qpcVar2.a.e(jch0.K(l370Var2));
                        if (wduVarE == null) {
                            ry21Var = null;
                        } else {
                            try {
                                npc npcVar = new npc((fka1) wduVarE.c.get(0));
                                String str6 = npcVar.c;
                                v360 v360Var3 = npcVar.b;
                                l370 l370Var3 = npcVar.a;
                                v360 v360Var4 = npcVar.g;
                                String strC3 = v360Var4.c("Content-Type");
                                String strC4 = v360Var4.c("Content-Length");
                                ne neVar = new ne((byte) 9);
                                neVar.a = l370Var3;
                                neVar.c = m5n1.i(v360Var3);
                                neVar.L(!str6.equals("\u0000") ? str6 : "GET", (tn21) null);
                                ln21 ln21Var5 = new ln21(neVar);
                                tz21 tz21Var = uz21.a;
                                zov0 zov0Var = a6g1.u0;
                                new ArrayList(20);
                                bjy0 bjy0Var = npcVar.d;
                                int i6 = npcVar.e;
                                String str7 = npcVar.f;
                                t360 t360VarI2 = m5n1.i(v360Var4);
                                mpc mpcVar = new mpc(wduVarE, strC3, strC4);
                                ms50 ms50Var = npcVar.h;
                                long j5 = npcVar.i;
                                long j6 = npcVar.j;
                                if (i6 < 0) {
                                    bhn0.f(f4i1.c(i6, "code < 0: "));
                                    return null;
                                }
                                v360 v360VarG = m5n1.g(t360VarI2);
                                ry21Var = new ry21(ln21Var5, bjy0Var, str7, i6, ms50Var, v360VarG, mpcVar, null, null, null, null, j5, j6, null, zov0Var);
                                if (l370Var3.equals(l370Var2) && str6.equals(ln21Var4.b)) {
                                    Set setJ0 = jch0.j0(v360VarG);
                                    if (!(setJ0 instanceof Collection) || !setJ0.isEmpty()) {
                                        Iterator it = setJ0.iterator();
                                        while (true) {
                                            if (it.hasNext()) {
                                                String str8 = (String) it.next();
                                                if (!v360Var3.e(str8).equals(ln21Var4.c.e(str8))) {
                                                }
                                            }
                                        }
                                    }
                                }
                                w4n1.b(ry21Var.g);
                                ry21Var = null;
                            } catch (IOException unused3) {
                                w4n1.b(wduVarE);
                            }
                        }
                    } catch (IOException unused4) {
                    }
                } else {
                    ry21Var = null;
                }
                long jCurrentTimeMillis = System.currentTimeMillis();
                ln21 ln21Var6 = uf01Var.e;
                if (ry21Var != null) {
                    j2 = ry21Var.Y;
                    j3 = ry21Var.Z;
                    v360 v360Var5 = ry21Var.f;
                    int size = v360Var5.size();
                    int i7 = 0;
                    dateA = null;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                    int iO = -1;
                    while (i7 < size) {
                        String strH = m5n1.h(v360Var5, i7);
                        long j7 = jCurrentTimeMillis;
                        String strJ = m5n1.j(v360Var5, i7);
                        if (strH.equalsIgnoreCase("Date")) {
                            str3 = strJ;
                            dateA3 = q5r.a(strJ);
                        } else if (strH.equalsIgnoreCase("Expires")) {
                            dateA = q5r.a(strJ);
                        } else if (strH.equalsIgnoreCase("Last-Modified")) {
                            str2 = strJ;
                            dateA2 = q5r.a(strJ);
                        } else if (strH.equalsIgnoreCase("ETag")) {
                            str = strJ;
                        } else if (strH.equalsIgnoreCase("Age")) {
                            iO = w4n1.o(-1, strJ);
                        }
                        i7++;
                        jCurrentTimeMillis = j7;
                    }
                    j = jCurrentTimeMillis;
                    i = iO;
                } else {
                    j = jCurrentTimeMillis;
                    i = -1;
                    dateA = null;
                    j2 = 0;
                    j3 = 0;
                    dateA2 = null;
                    dateA3 = null;
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                TimeUnit timeUnit = TimeUnit.SECONDS;
                if (ry21Var == null) {
                    i25Var2 = null;
                    rm5Var = new rm5(ln21Var6, (Object) null);
                } else {
                    l370 l370Var4 = ln21Var6.a;
                    v360 v360Var6 = ln21Var6.c;
                    if (l370Var4.f() && ry21Var.e == null) {
                        i25Var = null;
                        rm5Var = new rm5(ln21Var6, (Object) null);
                    } else {
                        i25Var = null;
                        if (fc11.O(ry21Var, ln21Var6)) {
                            upc upcVarA = ln21Var6.a();
                            Date date = dateA;
                            if (!upcVarA.a && v360Var6.c("If-Modified-Since") == null && v360Var6.c("If-None-Match") == null) {
                                upc upcVarA2 = ry21Var.a();
                                long jMax = dateA3 != null ? Math.max(0L, j3 - dateA3.getTime()) : 0L;
                                if (i != -1) {
                                    jMax = Math.max(jMax, timeUnit.toMillis(i));
                                }
                                long jMax2 = jMax + Math.max(0L, j3 - j2) + Math.max(0L, j - j3);
                                int i8 = ry21Var.a().c;
                                if (i8 != -1) {
                                    time = timeUnit.toMillis(i8);
                                } else {
                                    if (date != null) {
                                        time = date.getTime() - (dateA3 != null ? dateA3.getTime() : j3);
                                        if (time <= 0) {
                                            time = 0;
                                        }
                                    } else if (dateA2 == null) {
                                        millis = 0;
                                        time = millis;
                                    } else {
                                        List list = ry21Var.a.a.g;
                                        if (list == null) {
                                            string = null;
                                        } else {
                                            StringBuilder sb = new StringBuilder();
                                            fc11.l0(sb, list);
                                            string = sb.toString();
                                        }
                                        if (string == null) {
                                            long time2 = (dateA3 != null ? dateA3.getTime() : j2) - dateA2.getTime();
                                            millis = 0;
                                            if (time2 > 0) {
                                                time = time2 / 10;
                                            }
                                        } else {
                                            millis = 0;
                                        }
                                        time = millis;
                                    }
                                    i2 = upcVarA.c;
                                    if (i2 != -1) {
                                        time = Math.min(time, timeUnit.toMillis(i2));
                                    }
                                    i3 = upcVarA.i;
                                    if (i3 != -1) {
                                        millis2 = timeUnit.toMillis(i3);
                                    } else {
                                        millis2 = millis;
                                    }
                                    if (!upcVarA2.g && (i4 = upcVarA.h) != -1) {
                                        millis = timeUnit.toMillis(i4);
                                    }
                                    if (upcVarA2.a) {
                                        if (str != null) {
                                            str5 = str;
                                            str4 = "If-None-Match";
                                        } else if (dateA2 != null) {
                                            str4 = "If-Modified-Since";
                                            str5 = str2;
                                        } else if (dateA3 != null) {
                                            str4 = "If-Modified-Since";
                                            str5 = str3;
                                        } else {
                                            i25Var2 = null;
                                            rm5Var = new rm5(ln21Var6, (Object) null);
                                        }
                                        t360 t360VarI3 = m5n1.i(v360Var6);
                                        str5.getClass();
                                        m5n1.f(t360VarI3, str4, str5);
                                        ne neVarB2 = ln21Var6.b();
                                        neVarB2.c = m5n1.i(m5n1.g(t360VarI3));
                                        rm5Var = new rm5(new ln21(neVarB2), ry21Var);
                                        i25Var2 = null;
                                    } else {
                                        j4 = jMax2 + millis2;
                                        if (j4 < time + millis) {
                                            zx21VarC = ry21Var.c();
                                            if (j4 >= time) {
                                                zx21VarC.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                            }
                                            if (jMax2 > 86400000 && ry21Var.a().c == -1 && date == null) {
                                                zx21VarC.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                            }
                                            i25Var2 = null;
                                            rm5Var = new rm5((Object) null, zx21VarC.a());
                                        } else {
                                            if (str != null) {
                                                str5 = str;
                                                str4 = "If-None-Match";
                                            } else if (dateA2 != null) {
                                                str4 = "If-Modified-Since";
                                                str5 = str2;
                                            } else if (dateA3 != null) {
                                                str4 = "If-Modified-Since";
                                                str5 = str3;
                                            } else {
                                                i25Var2 = null;
                                                rm5Var = new rm5(ln21Var6, (Object) null);
                                            }
                                            t360 t360VarI4 = m5n1.i(v360Var6);
                                            str5.getClass();
                                            m5n1.f(t360VarI4, str4, str5);
                                            ne neVarB3 = ln21Var6.b();
                                            neVarB3.c = m5n1.i(m5n1.g(t360VarI4));
                                            rm5Var = new rm5(new ln21(neVarB3), ry21Var);
                                            i25Var2 = null;
                                        }
                                    }
                                }
                                millis = 0;
                                i2 = upcVarA.c;
                                if (i2 != -1) {
                                    time = Math.min(time, timeUnit.toMillis(i2));
                                }
                                i3 = upcVarA.i;
                                if (i3 != -1) {
                                    millis2 = timeUnit.toMillis(i3);
                                } else {
                                    millis2 = millis;
                                }
                                if (!upcVarA2.g) {
                                    millis = timeUnit.toMillis(i4);
                                }
                                if (upcVarA2.a) {
                                    j4 = jMax2 + millis2;
                                    if (j4 < time + millis) {
                                        zx21VarC = ry21Var.c();
                                        if (j4 >= time) {
                                            zx21VarC.f.b("Warning", "110 HttpURLConnection \"Response is stale\"");
                                        }
                                        if (jMax2 > 86400000) {
                                            zx21VarC.f.b("Warning", "113 HttpURLConnection \"Heuristic expiration\"");
                                        }
                                        i25Var2 = null;
                                        rm5Var = new rm5((Object) null, zx21VarC.a());
                                    } else {
                                        if (str != null) {
                                            str5 = str;
                                            str4 = "If-None-Match";
                                        } else if (dateA2 != null) {
                                            str4 = "If-Modified-Since";
                                            str5 = str2;
                                        } else if (dateA3 != null) {
                                            str4 = "If-Modified-Since";
                                            str5 = str3;
                                        } else {
                                            i25Var2 = null;
                                            rm5Var = new rm5(ln21Var6, (Object) null);
                                        }
                                        t360 t360VarI5 = m5n1.i(v360Var6);
                                        str5.getClass();
                                        m5n1.f(t360VarI5, str4, str5);
                                        ne neVarB4 = ln21Var6.b();
                                        neVarB4.c = m5n1.i(m5n1.g(t360VarI5));
                                        rm5Var = new rm5(new ln21(neVarB4), ry21Var);
                                        i25Var2 = null;
                                    }
                                } else {
                                    if (str != null) {
                                        str5 = str;
                                        str4 = "If-None-Match";
                                    } else if (dateA2 != null) {
                                        str4 = "If-Modified-Since";
                                        str5 = str2;
                                    } else if (dateA3 != null) {
                                        str4 = "If-Modified-Since";
                                        str5 = str3;
                                    } else {
                                        i25Var2 = null;
                                        rm5Var = new rm5(ln21Var6, (Object) null);
                                    }
                                    t360 t360VarI6 = m5n1.i(v360Var6);
                                    str5.getClass();
                                    m5n1.f(t360VarI6, str4, str5);
                                    ne neVarB5 = ln21Var6.b();
                                    neVarB5.c = m5n1.i(m5n1.g(t360VarI6));
                                    rm5Var = new rm5(new ln21(neVarB5), ry21Var);
                                    i25Var2 = null;
                                }
                            } else {
                                i25Var2 = null;
                                rm5Var = new rm5(ln21Var6, (Object) null);
                            }
                        } else {
                            rm5Var = new rm5(ln21Var6, (Object) null);
                        }
                    }
                    i25Var2 = i25Var;
                }
                if (((ln21) rm5Var.a) != null && ln21Var6.a().j) {
                    rm5Var = new rm5(i25Var2, i25Var2);
                }
                ln21 ln21Var7 = (ln21) rm5Var.a;
                ry21 ry21Var2 = (ry21) rm5Var.b;
                qpc qpcVar3 = (qpc) this.b;
                if (qpcVar3 != null) {
                    synchronized (qpcVar3) {
                    }
                }
                xa00 xa00Var = jf01Var.e;
                if (xa00Var == null) {
                    xa00Var = xa00.a;
                }
                if (ry21Var != null && ry21Var2 == null) {
                    w4n1.b(ry21Var.g);
                }
                if (ln21Var7 == null && ry21Var2 == null) {
                    ry21 ry21Var3 = new ry21(uf01Var.e, bjy0.HTTP_1_1, "Unsatisfiable Request (only-if-cached)", 504, null, new v360((String[]) new ArrayList(20).toArray(new String[0])), uz21.a, null, null, null, null, -1L, System.currentTimeMillis(), null, a6g1.u0);
                    xa00Var.E(jf01Var, ry21Var3);
                    return ry21Var3;
                }
                if (ln21Var7 == null) {
                    ry21Var2.getClass();
                    zx21 zx21VarC3 = ry21Var2.c();
                    ry21 ry21VarL = hm5.L(ry21Var2);
                    zx21.b("cacheResponse", ry21VarL);
                    zx21VarC3.j = ry21VarL;
                    ry21 ry21VarA2 = zx21VarC3.a();
                    xa00Var.b(jf01Var, ry21VarA2);
                    return ry21VarA2;
                }
                if (ry21Var2 != null) {
                    xa00Var.a(jf01Var, ry21Var2);
                } else if (((qpc) this.b) != null) {
                    xa00Var.c(jf01Var);
                }
                try {
                    ry21 ry21VarB2 = uf01Var.b(ln21Var7);
                    if (ry21Var2 != null) {
                        if (ry21VarB2.d == 304) {
                            zx21 zx21VarC4 = ry21Var2.c();
                            v360 v360Var7 = ry21Var2.f;
                            v360 v360Var8 = ry21VarB2.f;
                            ArrayList arrayList = new ArrayList(20);
                            int size2 = v360Var7.size();
                            for (int i9 = 0; i9 < size2; i9++) {
                                String strH2 = m5n1.h(v360Var7, i9);
                                String strJ2 = m5n1.j(v360Var7, i9);
                                if ((!"Warning".equalsIgnoreCase(strH2) || !nhc1.Y(strJ2, "1", false)) && ("Content-Length".equalsIgnoreCase(strH2) || "Content-Encoding".equalsIgnoreCase(strH2) || "Content-Type".equalsIgnoreCase(strH2) || !bmq0.F(strH2) || v360Var8.c(strH2) == null)) {
                                    arrayList.add(strH2);
                                    arrayList.add(ihc1.e1(strJ2).toString());
                                }
                            }
                            int size3 = v360Var8.size();
                            for (int i10 = 0; i10 < size3; i10++) {
                                String strH3 = m5n1.h(v360Var8, i10);
                                if (!"Content-Length".equalsIgnoreCase(strH3) && !"Content-Encoding".equalsIgnoreCase(strH3) && !"Content-Type".equalsIgnoreCase(strH3) && bmq0.F(strH3)) {
                                    String strJ3 = m5n1.j(v360Var8, i10);
                                    arrayList.add(strH3);
                                    arrayList.add(ihc1.e1(strJ3).toString());
                                }
                            }
                            String[] strArr = (String[]) arrayList.toArray(new String[0]);
                            t360 t360Var = new t360();
                            t360Var.a.addAll(f46.H(strArr));
                            zx21VarC4.f = t360Var;
                            zx21VarC4.l = ry21VarB2.Y;
                            zx21VarC4.m = ry21VarB2.Z;
                            ry21 ry21VarL2 = hm5.L(ry21Var2);
                            zx21.b("cacheResponse", ry21VarL2);
                            zx21VarC4.j = ry21VarL2;
                            ry21 ry21VarL3 = hm5.L(ry21VarB2);
                            zx21.b("networkResponse", ry21VarL3);
                            zx21VarC4.i = ry21VarL3;
                            ry21 ry21VarA3 = zx21VarC4.a();
                            ry21VarB2.g.close();
                            qpc qpcVar4 = (qpc) this.b;
                            qpcVar4.getClass();
                            synchronized (qpcVar4) {
                            }
                            ((qpc) this.b).getClass();
                            npc npcVar2 = new npc(ry21VarA3);
                            wdu wduVar = ((mpc) ry21Var2.g).b;
                            try {
                                i25VarD2 = wduVar.d.d(wduVar.b, wduVar.a);
                                if (i25VarD2 != null) {
                                    try {
                                        npcVar2.c(i25VarD2);
                                        i25VarD2.e();
                                        break;
                                    } catch (IOException unused5) {
                                        if (i25VarD2 != null) {
                                            try {
                                                i25VarD2.a();
                                                break;
                                            } catch (IOException unused6) {
                                            }
                                        }
                                    }
                                }
                            } catch (IOException unused7) {
                                i25VarD2 = i25Var2;
                            }
                            xa00Var.b(jf01Var, ry21VarA3);
                            return ry21VarA3;
                        }
                        w4n1.b(ry21Var2.g);
                    }
                    zx21 zx21VarC5 = ry21VarB2.c();
                    i25 i25VarL = ry21Var2 != null ? hm5.L(ry21Var2) : i25Var2;
                    zx21.b("cacheResponse", i25VarL);
                    zx21VarC5.j = i25VarL;
                    ry21 ry21VarL4 = hm5.L(ry21VarB2);
                    zx21.b("networkResponse", ry21VarL4);
                    zx21VarC5.i = ry21VarL4;
                    ry21 ry21VarA4 = zx21VarC5.a();
                    if (((qpc) this.b) != null) {
                        if (y270.a(ry21VarA4) && fc11.O(ry21VarA4, ln21Var7)) {
                            qpc qpcVar5 = (qpc) this.b;
                            zx21 zx21VarC6 = ry21VarA4.c();
                            zx21VarC6.a = ln21Var7;
                            ry21 ry21VarA5 = zx21VarC6.a();
                            qpcVar5.getClass();
                            ln21 ln21Var8 = ry21VarA5.a;
                            String str9 = ln21Var8.b;
                            try {
                                if (!eqr0.y(str9)) {
                                    if (str9.equals("GET") && !jch0.j0(ry21VarA5.f).contains("*")) {
                                        npc npcVar3 = new npc(ry21VarA5);
                                        try {
                                            beu beuVar = qpcVar5.a;
                                            String strK = jch0.K(ln21Var8.a);
                                            se11 se11Var = beu.T0;
                                            i25VarD = beuVar.d(-1L, strK);
                                            if (i25VarD == null) {
                                                i25Var3 = i25Var2;
                                            } else {
                                                try {
                                                    npcVar3.c(i25VarD);
                                                    i25Var3 = new i25(qpcVar5, i25VarD);
                                                } catch (IOException unused8) {
                                                    if (i25VarD != null) {
                                                        i25VarD.a();
                                                    }
                                                    i25Var3 = i25Var2;
                                                }
                                            }
                                        } catch (IOException unused9) {
                                            i25VarD = i25Var2;
                                        }
                                        break;
                                    } else {
                                        i25Var3 = i25Var2;
                                    }
                                    if (i25Var3 == null) {
                                        ry21VarA = ry21VarA4;
                                    } else {
                                        oqc oqcVar = new oqc(ry21VarA4.g.d1(), i25Var3, sj1.f((ppc) i25Var3.d));
                                        i25VarC = ry21VarA4.f.c("Content-Type");
                                        if (i25VarC == null) {
                                            i25Var4 = i25Var2;
                                        } else {
                                            i25Var4 = i25VarC;
                                        }
                                        long jD = ry21VarA4.g.d();
                                        zx21 zx21VarC7 = ry21VarA4.c();
                                        zx21VarC7.g = new yf01(i25Var4, jD, sj1.g(oqcVar));
                                        ry21VarA = zx21VarC7.a();
                                    }
                                    if (ry21Var2 != null) {
                                        return ry21VarA;
                                    }
                                    xa00Var.c(jf01Var);
                                    return ry21VarA;
                                }
                                qpcVar5.c(ln21Var8);
                                break;
                            } catch (IOException unused10) {
                            }
                            i25Var3 = i25Var2;
                            if (i25Var3 == null) {
                                ry21VarA = ry21VarA4;
                            } else {
                                oqc oqcVar2 = new oqc(ry21VarA4.g.d1(), i25Var3, sj1.f((ppc) i25Var3.d));
                                i25VarC = ry21VarA4.f.c("Content-Type");
                                if (i25VarC == null) {
                                    i25Var4 = i25Var2;
                                } else {
                                    i25Var4 = i25VarC;
                                }
                                long jD2 = ry21VarA4.g.d();
                                zx21 zx21VarC8 = ry21VarA4.c();
                                zx21VarC8.g = new yf01(i25Var4, jD2, sj1.g(oqcVar2));
                                ry21VarA = zx21VarC8.a();
                            }
                            if (ry21Var2 != null) {
                                return ry21VarA;
                            }
                            xa00Var.c(jf01Var);
                            return ry21VarA;
                        }
                        if (eqr0.y(ln21Var7.b)) {
                            try {
                                ((qpc) this.b).c(ln21Var7);
                                break;
                            } catch (IOException unused11) {
                            }
                        }
                    }
                    return ry21VarA4;
                } catch (Throwable th) {
                    if (ry21Var != null) {
                        w4n1.b(ry21Var.g);
                    }
                    throw th;
                }
            case 3:
                ln21 ln21Var9 = uf01Var.e;
                if (ln21Var9.c.c("No-Webgate-Authentication") != null) {
                    ne neVarB6 = ln21Var9.b();
                    ((t360) neVarB6.c).f("No-Webgate-Authentication");
                    return uf01Var.b(new ln21(neVarB6));
                }
                if (ln21Var9.a().j) {
                    return uf01Var.b(ln21Var9);
                }
                l370 l370Var5 = ln21Var9.a;
                boolean zF = l370Var5.f();
                String str10 = l370Var5.d;
                if (zF && ("spclient.wg.spotify.com".equals(str10) || "exp.wg.spotify.com".equals(str10) || "wgint.spotify.net".equals(str10) || "image-upload.spotify.com".equals(str10) || "api.spotify.com".equals(str10) || "api-partner.spotify.com".equals(str10) || "partnerapi.spotify.net".equals(str10) || (ln21Var9.c(wf90.class) != null && nhc1.R(str10, ".spotify.com", false)))) {
                    tka0 tka0VarB = rc11.a.b(Object.class);
                    ((wdg) tka0VarB).n().cast(ln21Var9.e.v(tka0VarB));
                    String strC5 = ln21Var9.c.c("Authorization");
                    if (strC5 == null || strC5.length() == 0) {
                        return c(uf01Var, ln21Var9, false);
                    }
                }
                return uf01Var.b(ln21Var9);
            default:
                ln21 ln21Var10 = uf01Var.e;
                jf01 jf01Var2 = uf01Var.a;
                List listO0 = z6x.a;
                ry21 ry21Var4 = null;
                int i11 = 0;
                ln21 ln21VarB = ln21Var10;
                while (true) {
                    boolean z5 = true;
                    while (true) {
                        if (jf01Var2.Y == null) {
                            synchronized (jf01Var2) {
                                if (jf01Var2.N0) {
                                    throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
                                }
                                if (jf01Var2.Z || jf01Var2.P0 || jf01Var2.O0) {
                                    throw new IllegalStateException("Check failed.");
                                }
                            }
                            if (z5) {
                                azp0 azp0Var = jf01Var2.a;
                                isd1 isd1Var = azp0Var.E;
                                k7v k7vVar = jf01Var2.d;
                                int i12 = azp0Var.y;
                                int i13 = azp0Var.z;
                                int i14 = uf01Var.f;
                                int i15 = uf01Var.g;
                                int i16 = azp0Var.A;
                                boolean z6 = azp0Var.e;
                                boolean z7 = azp0Var.f;
                                l370 l370Var6 = ln21VarB.a;
                                ln21 ln21Var11 = ln21VarB;
                                if (l370Var6.f()) {
                                    SSLSocketFactory sSLSocketFactory2 = azp0Var.f9p;
                                    if (sSLSocketFactory2 != null) {
                                        HostnameVerifier hostnameVerifier2 = azp0Var.t;
                                        lbeVar = azp0Var.u;
                                        sSLSocketFactory = sSLSocketFactory2;
                                        hostnameVerifier = hostnameVerifier2;
                                    } else {
                                        eg.m("CLEARTEXT-only client");
                                    }
                                } else {
                                    sSLSocketFactory = null;
                                    hostnameVerifier = null;
                                    lbeVar = null;
                                }
                                zf01 zf01Var = new zf01(isd1Var, k7vVar, i12, i13, i14, i15, i16, z6, z7, new v02(l370Var6.d, l370Var6.e, azp0Var.l, azp0Var.o, sSLSocketFactory, hostnameVerifier, lbeVar, azp0Var.n, azp0Var.s, azp0Var.r, azp0Var.m), jf01Var2.a.D, jf01Var2, ln21Var11);
                                ln21VarB = ln21Var11;
                                azp0 azp0Var2 = jf01Var2.a;
                                jf01Var2.i = azp0Var2.f ? new fl10(zf01Var, azp0Var2.E) : new utw0(zf01Var);
                            }
                            try {
                                if (!jf01Var2.R0) {
                                    try {
                                    } catch (IOException e) {
                                        boolean zD = d(e, jf01Var2, ln21VarB);
                                        jf01Var2.e.D(jf01Var2, e, zD);
                                        if (!zD) {
                                            byte[] bArr = w4n1.a;
                                            Iterator it2 = listO0.iterator();
                                            while (it2.hasNext()) {
                                                j2h1.h(e, (Exception) it2.next());
                                            }
                                            throw e;
                                        }
                                        listO0 = o7h.O0(e, listO0);
                                        jf01Var2.g(true);
                                        z5 = false;
                                    }
                                    break;
                                } else {
                                    z3 = true;
                                    try {
                                        throw new IOException("Canceled");
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                z3 = true;
                            }
                            jf01Var2.g(z3);
                            throw th;
                        }
                        eg.m("Check failed.");
                    }
                    zx21 zx21VarC9 = uf01Var.b(ln21VarB).c();
                    zx21VarC9.a = ln21VarB;
                    zx21VarC9.k = ry21Var4 != null ? hm5.L(ry21Var4) : null;
                    ry21 ry21VarA6 = zx21VarC9.a();
                    ln21VarB = b(ry21VarA6, jf01Var2.Y);
                    try {
                        if (ln21VarB == null) {
                            jf01Var2.e.q(jf01Var2, ry21VarA6, null);
                            z4 = false;
                        } else {
                            tn21 tn21Var2 = ln21VarB.d;
                            if (tn21Var2 == null || !tn21Var2.c()) {
                                w4n1.b(ry21VarA6.g);
                                int i17 = i11 + 1;
                                xa00 xa00Var2 = jf01Var2.e;
                                if (i17 > 20) {
                                    xa00Var2.q(jf01Var2, ry21VarA6, null);
                                    throw new ProtocolException("Too many follow-up requests: " + i17);
                                }
                                xa00Var2.q(jf01Var2, ry21VarA6, ln21VarB);
                                jf01Var2.g(true);
                                ry21Var4 = ry21VarA6;
                                i11 = i17;
                            } else {
                                jf01Var2.e.q(jf01Var2, ry21VarA6, null);
                                z4 = false;
                            }
                        }
                        jf01Var2.g(z4);
                        return ry21VarA6;
                    } catch (Throwable th4) {
                        th = th4;
                        z3 = false;
                    }
                }
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x013d  */
    /* JADX WARN: Code duplicated, block: B:109:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0150  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:79:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:88:0x010d  */
    /* JADX WARN: Code duplicated, block: B:89:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0131  */
    public ln21 b(ry21 ry21Var, i25 i25Var) throws ProtocolException {
        azp0 azp0Var;
        String strC;
        ln21 ln21Var;
        k370 k370Var;
        l370 l370VarB;
        ne neVarB;
        boolean z;
        tn21 tn21Var;
        ry21 ry21Var2;
        rr31 rr31Var = i25Var != null ? i25Var.c().c : null;
        int i = ry21Var.d;
        ln21 ln21Var2 = ry21Var.a;
        String str = ln21Var2.b;
        if (i == 307 || i == 308) {
            azp0Var = (azp0) this.b;
            if (azp0Var.h) {
                strC = ry21Var.f.c("Location");
                if (strC == null) {
                    strC = null;
                }
                ln21Var = ry21Var.a;
                if (strC != null) {
                    l370 l370Var = ln21Var.a;
                    l370Var.getClass();
                    try {
                        k370Var = new k370();
                        k370Var.f(l370Var, strC);
                    } catch (IllegalArgumentException unused) {
                        k370Var = null;
                    }
                    if (k370Var != null) {
                        l370VarB = k370Var.b();
                    } else {
                        l370VarB = null;
                    }
                    if (l370VarB != null && (u890.j(l370VarB.a, ln21Var.a.a) || azp0Var.i)) {
                        neVarB = ln21Var.b();
                        if (eqr0.J(str)) {
                            int i2 = ry21Var.d;
                            z = !str.equals("PROPFIND") || i2 == 308 || i2 == 307;
                            if (!str.equals("PROPFIND") || i2 == 308 || i2 == 307) {
                                neVarB.L(str, z ? ln21Var.d : null);
                            } else {
                                neVarB.L("GET", (tn21) null);
                            }
                            if (!z) {
                                neVarB.O("Transfer-Encoding");
                                neVarB.O("Content-Length");
                                neVarB.O("Content-Type");
                            }
                        }
                        if (!z4n1.a(ln21Var.a, l370VarB)) {
                            neVarB.O("Authorization");
                        }
                        neVarB.a = l370VarB;
                        return new ln21(neVarB);
                    }
                }
            }
        } else {
            if (i == 401) {
                ((azp0) this.b).g.getClass();
                return null;
            }
            if (i == 421) {
                tn21 tn21Var2 = ln21Var2.d;
                if ((tn21Var2 == null || !tn21Var2.c()) && i25Var != null && !u890.j(((tl00) i25Var.d).f().j.h.d, ((sl00) i25Var.e).i().d().a.h.d)) {
                    kf01 kf01VarC = i25Var.c();
                    synchronized (kf01VarC) {
                        kf01VarC.l = true;
                    }
                    return ry21Var.a;
                }
            } else if (i == 503) {
                ry21 ry21Var3 = ry21Var.X;
                if ((ry21Var3 == null || ry21Var3.d != 503) && e(ry21Var, Integer.MAX_VALUE) == 0) {
                    return ry21Var.a;
                }
            } else {
                if (i == 407) {
                    rr31Var.getClass();
                    if (rr31Var.b.type() != Proxy.Type.HTTP) {
                        throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
                    }
                    ((azp0) this.b).n.getClass();
                    return null;
                }
                if (i != 408) {
                    switch (i) {
                        case 300:
                        case 301:
                        case 302:
                        case 303:
                            azp0Var = (azp0) this.b;
                            if (azp0Var.h) {
                                strC = ry21Var.f.c("Location");
                                if (strC == null) {
                                    strC = null;
                                }
                                ln21Var = ry21Var.a;
                                if (strC != null) {
                                    l370 l370Var2 = ln21Var.a;
                                    l370Var2.getClass();
                                    k370Var = new k370();
                                    k370Var.f(l370Var2, strC);
                                    if (k370Var != null) {
                                        l370VarB = k370Var.b();
                                    } else {
                                        l370VarB = null;
                                    }
                                    if (l370VarB != null) {
                                        neVarB = ln21Var.b();
                                        if (eqr0.J(str)) {
                                            int i3 = ry21Var.d;
                                            if (str.equals("PROPFIND")) {
                                            }
                                            if (str.equals("PROPFIND")) {
                                                neVarB.L(str, z ? ln21Var.d : null);
                                            } else {
                                                neVarB.L(str, z ? ln21Var.d : null);
                                            }
                                            if (!z) {
                                                neVarB.O("Transfer-Encoding");
                                                neVarB.O("Content-Length");
                                                neVarB.O("Content-Type");
                                            }
                                        }
                                        if (!z4n1.a(ln21Var.a, l370VarB)) {
                                            neVarB.O("Authorization");
                                        }
                                        neVarB.a = l370VarB;
                                        return new ln21(neVarB);
                                    }
                                }
                            }
                        default:
                            return null;
                    }
                } else if (((azp0) this.b).e && (((tn21Var = ln21Var2.d) == null || !tn21Var.c()) && (((ry21Var2 = ry21Var.X) == null || ry21Var2.d != 408) && e(ry21Var, 0) <= 0))) {
                    return ry21Var.a;
                }
            }
        }
        return null;
    }

    public ry21 c(uf01 uf01Var, ln21 ln21Var, boolean z) {
        ii8 ii8Var = (ji8) ((d520) this.b).y().timeout(10000L, TimeUnit.MILLISECONDS, Single.just(new fi8(new ug8((Integer) null, "Timed out")))).blockingGet();
        if (ii8Var instanceof ii8) {
            wd wdVar = ii8Var.a.b;
            if (wdVar == null) {
                eg.m("Received null access token");
                return null;
            }
            String str = wdVar.b;
            ne neVarB = ln21Var.b();
            ((t360) neVarB.c).b("Authorization", l1d.m("Bearer ", str));
            ry21 ry21VarB = uf01Var.b(new ln21(neVarB));
            if (ry21VarB.d == 401 && !z) {
                String strC = ry21VarB.f.c("client-token-error");
                if ((strC != null ? strC : null) == null) {
                    ry21VarB.g.close();
                    return c(uf01Var, ln21Var, true);
                }
            }
            return ry21VarB;
        }
        boolean z2 = ii8Var instanceof fi8;
        bjy0 bjy0Var = bjy0.HTTP_1_1;
        zov0 zov0Var = a6g1.u0;
        if (!z2) {
            if (ii8Var instanceof ei8) {
                tz21 tz21Var = uz21.a;
                ArrayList arrayList = new ArrayList(20);
                se11 se11Var = r8i0.e;
                return new ry21(ln21Var, bjy0Var, "the credentials used are invalid", 401, null, new v360((String[]) arrayList.toArray(new String[0])), dm5.D("the credentials used are invalid", bmq0.w("plain/text")), null, null, null, null, 0L, 0L, null, zov0Var);
            }
            if (ii8Var instanceof gi8) {
                bhn0.A(ii8Var, "Unexpected error while requesting access token: ");
                return null;
            }
            eg.o();
            return null;
        }
        String str2 = "network error while attempting to make a request: " + ((fi8) ii8Var).a.b + " for url " + ln21Var.a;
        tz21 tz21Var2 = uz21.a;
        ArrayList arrayList2 = new ArrayList(20);
        se11 se11Var2 = r8i0.e;
        return new ry21(ln21Var, bjy0Var, str2, 503, null, new v360((String[]) arrayList2.toArray(new String[0])), dm5.D(str2, bmq0.w("plain/text")), null, null, null, null, 0L, 0L, null, zov0Var);
    }

    public boolean d(IOException iOException, jf01 jf01Var, ln21 ln21Var) {
        tn21 tn21Var;
        boolean z = iOException instanceof ConnectionShutdownException;
        if (!((azp0) this.b).e) {
            return false;
        }
        if ((!z && (((tn21Var = ln21Var.d) != null && tn21Var.c()) || (iOException instanceof FileNotFoundException))) || (iOException instanceof ProtocolException)) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || !z) {
                return false;
            }
        } else if (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) {
            return false;
        }
        i25 i25Var = jf01Var.S0;
        if (i25Var == null || !i25Var.a) {
            return false;
        }
        tl00 tl00Var = jf01Var.i;
        tl00Var.getClass();
        zf01 zf01VarF = tl00Var.f();
        i25 i25Var2 = jf01Var.S0;
        return zf01VarF.a(i25Var2 != null ? i25Var2.c() : null);
    }

    public /* synthetic */ o4c(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
