package p;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class npc {
    public static final String k;
    public static final String l;
    public final l370 a;
    public final v360 b;
    public final String c;
    public final bjy0 d;
    public final int e;
    public final String f;
    public final v360 g;
    public final ms50 h;
    public final long i;
    public final long j;

    static {
        nct0 nct0Var = nct0.a;
        nct0.a.getClass();
        k = "OkHttp-Sent-Millis";
        nct0.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public npc(fka1 fka1Var) throws IOException {
        l370 l370VarB;
        try {
            ff01 ff01VarG = sj1.g(fka1Var);
            String strP = ff01VarG.p(Long.MAX_VALUE);
            try {
                k370 k370Var = new k370();
                k370Var.f(null, strP);
                l370VarB = k370Var.b();
            } catch (IllegalArgumentException unused) {
                l370VarB = null;
            }
            if (l370VarB == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strP));
                nct0 nct0Var = nct0.a;
                nct0.a.i(5);
                throw iOException;
            }
            this.a = l370VarB;
            this.c = ff01VarG.p(Long.MAX_VALUE);
            t360 t360Var = new t360();
            int iR = jch0.R(ff01VarG);
            for (int i = 0; i < iR; i++) {
                t360Var.c(ff01VarG.p(Long.MAX_VALUE));
            }
            this.b = m5n1.g(t360Var);
            que0 que0VarG = yoi1.G(ff01VarG.p(Long.MAX_VALUE));
            this.d = (bjy0) que0VarG.d;
            this.e = que0VarG.b;
            this.f = (String) que0VarG.c;
            t360 t360Var2 = new t360();
            int iR2 = jch0.R(ff01VarG);
            for (int i2 = 0; i2 < iR2; i2++) {
                t360Var2.c(ff01VarG.p(Long.MAX_VALUE));
            }
            String str = k;
            String strE = t360Var2.e(str);
            String str2 = l;
            String strE2 = t360Var2.e(str2);
            t360Var2.f(str);
            t360Var2.f(str2);
            this.i = strE != null ? Long.parseLong(strE) : 0L;
            this.j = strE2 != null ? Long.parseLong(strE2) : 0L;
            this.g = m5n1.g(t360Var2);
            if (this.a.f()) {
                String strP2 = ff01VarG.p(Long.MAX_VALUE);
                if (strP2.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strP2 + '\"');
                }
                this.h = new ms50(!ff01VarG.z0() ? yoi1.y(ff01VarG.p(Long.MAX_VALUE)) : tye1.SSL_3_0, acg.b.b(ff01VarG.p(Long.MAX_VALUE)), z4n1.j(a(ff01VarG)), new g24(z4n1.j(a(ff01VarG)), (byte) 3));
            } else {
                this.h = null;
            }
            fka1Var.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(fka1Var, th);
                throw th2;
            }
        }
    }

    public static List a(ff01 ff01Var) throws IOException {
        int iR = jch0.R(ff01Var);
        if (iR == -1) {
            return z6x.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iR);
            for (int i = 0; i < iR; i++) {
                String strP = ff01Var.p(Long.MAX_VALUE);
                nac nacVar = new nac();
                rhc rhcVarU = u890.u(strP);
                if (rhcVarU == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                nacVar.N(rhcVarU);
                arrayList.add(certificateFactory.generateCertificate(new mac(nacVar)));
            }
            return arrayList;
        } catch (CertificateException e) {
            k220.i(e.getMessage());
            return null;
        }
    }

    public static void b(df01 df01Var, List list) {
        try {
            df01Var.m0(list.size());
            df01Var.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                encoded.getClass();
                int iJ = zod.J(encoded, -1234567890);
                zod.u(encoded.length, 0L, iJ);
                df01Var.Q(new rhc(f46.Z(0, encoded, iJ)).b());
                df01Var.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            k220.i(e.getMessage());
        }
    }

    public final void c(y861 y861Var) {
        l370 l370Var = this.a;
        ms50 ms50Var = this.h;
        v360 v360Var = this.g;
        v360 v360Var2 = this.b;
        df01 df01VarF = sj1.f(y861Var.l(0));
        try {
            df01VarF.Q(l370Var.i);
            df01VarF.writeByte(10);
            df01VarF.Q(this.c);
            df01VarF.writeByte(10);
            df01VarF.m0(v360Var2.size());
            df01VarF.writeByte(10);
            int size = v360Var2.size();
            for (int i = 0; i < size; i++) {
                df01VarF.Q(m5n1.h(v360Var2, i));
                df01VarF.Q(": ");
                df01VarF.Q(m5n1.j(v360Var2, i));
                df01VarF.writeByte(10);
            }
            bjy0 bjy0Var = this.d;
            int i2 = this.e;
            String str = this.f;
            StringBuilder sb = new StringBuilder();
            if (bjy0Var == bjy0.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            df01VarF.Q(sb.toString());
            df01VarF.writeByte(10);
            df01VarF.m0(v360Var.size() + 2);
            df01VarF.writeByte(10);
            int size2 = v360Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                df01VarF.Q(m5n1.h(v360Var, i3));
                df01VarF.Q(": ");
                df01VarF.Q(m5n1.j(v360Var, i3));
                df01VarF.writeByte(10);
            }
            df01VarF.Q(k);
            df01VarF.Q(": ");
            df01VarF.m0(this.i);
            df01VarF.writeByte(10);
            df01VarF.Q(l);
            df01VarF.Q(": ");
            df01VarF.m0(this.j);
            df01VarF.writeByte(10);
            if (l370Var.f()) {
                df01VarF.writeByte(10);
                ms50Var.getClass();
                df01VarF.Q(ms50Var.b.a);
                df01VarF.writeByte(10);
                b(df01VarF, ms50Var.a());
                b(df01VarF, ms50Var.c);
                df01VarF.Q(ms50Var.a.a);
                df01VarF.writeByte(10);
            }
            df01VarF.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(df01VarF, th);
                throw th2;
            }
        }
    }

    public npc(ry21 ry21Var) {
        v360 v360VarG;
        ln21 ln21Var = ry21Var.a;
        this.a = ln21Var.a;
        ry21 ry21Var2 = ry21Var.i;
        ry21Var2.getClass();
        v360 v360Var = ry21Var2.a.c;
        v360 v360Var2 = ry21Var.f;
        Set setJ0 = jch0.j0(v360Var2);
        if (setJ0.isEmpty()) {
            v360VarG = v360.b;
        } else {
            t360 t360Var = new t360();
            int size = v360Var.size();
            for (int i = 0; i < size; i++) {
                String strH = m5n1.h(v360Var, i);
                if (setJ0.contains(strH)) {
                    t360Var.b(strH, m5n1.j(v360Var, i));
                }
            }
            v360VarG = m5n1.g(t360Var);
        }
        this.b = v360VarG;
        this.c = ln21Var.b;
        this.d = ry21Var.b;
        this.e = ry21Var.d;
        this.f = ry21Var.c;
        this.g = v360Var2;
        this.h = ry21Var.e;
        this.i = ry21Var.Y;
        this.j = ry21Var.Z;
    }
}
