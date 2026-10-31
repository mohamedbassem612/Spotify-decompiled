package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class nal {
    public static final List e;
    public static final List f;
    public static final nal g;
    public static final nal h;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        acg acgVar = acg.r;
        acg acgVar2 = acg.s;
        acg acgVar3 = acg.t;
        acg acgVar4 = acg.l;
        acg acgVar5 = acg.n;
        acg acgVar6 = acg.m;
        acg acgVar7 = acg.o;
        acg acgVar8 = acg.q;
        acg acgVar9 = acg.f5p;
        List listM = p7h.M(acgVar, acgVar2, acgVar3, acgVar4, acgVar5, acgVar6, acgVar7, acgVar8, acgVar9);
        e = listM;
        List listM2 = p7h.M(acgVar, acgVar2, acgVar3, acgVar4, acgVar5, acgVar6, acgVar7, acgVar8, acgVar9, acg.j, acg.k, acg.h, acg.i, acg.f, acg.g, acg.e);
        f = listM2;
        mal malVar = new mal();
        acg[] acgVarArr = (acg[]) listM.toArray(new acg[0]);
        malVar.b((acg[]) Arrays.copyOf(acgVarArr, acgVarArr.length));
        tye1 tye1Var = tye1.TLS_1_3;
        tye1 tye1Var2 = tye1.TLS_1_2;
        malVar.c(tye1Var, tye1Var2);
        malVar.b = true;
        malVar.a();
        mal malVar2 = new mal();
        List list = listM2;
        acg[] acgVarArr2 = (acg[]) list.toArray(new acg[0]);
        malVar2.b((acg[]) Arrays.copyOf(acgVarArr2, acgVarArr2.length));
        malVar2.c(tye1Var, tye1Var2);
        malVar2.b = true;
        g = malVar2.a();
        mal malVar3 = new mal();
        acg[] acgVarArr3 = (acg[]) list.toArray(new acg[0]);
        malVar3.b((acg[]) Arrays.copyOf(acgVarArr3, acgVarArr3.length));
        malVar3.c(tye1Var, tye1Var2, tye1.TLS_1_1, tye1.TLS_1_0);
        malVar3.b = true;
        malVar3.a();
        h = new nal(false, false, null, null);
    }

    public nal(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = w4n1.k(strArr, enabledCipherSuites, acg.c);
        }
        String[] strArr2 = this.d;
        String[] strArrK = strArr2 != null ? w4n1.k(sSLSocket.getEnabledProtocols(), strArr2, zmn0.a) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        zbg zbgVar = acg.c;
        byte[] bArr = w4n1.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (zbgVar.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            hhg1.n("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            hhg1.n("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(strArrK, strArrK.length);
        if (!z2) {
            hhg1.n("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            hhg1.n("At least one TLS version is required");
            return;
        }
        nal nalVar = new nal(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (nalVar.c() != null) {
            sSLSocket.setEnabledProtocols(nalVar.d);
        }
        if (nalVar.b() != null) {
            sSLSocket.setEnabledCipherSuites(nalVar.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(acg.b.b(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(yoi1.y(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nal)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        nal nalVar = (nal) obj;
        boolean z = nalVar.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, nalVar.c) && Arrays.equals(this.d, nalVar.d) && this.b == nalVar.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(Objects.toString(b(), "[all enabled]"));
        sb.append(", tlsVersions=");
        sb.append(Objects.toString(c(), "[all enabled]"));
        sb.append(", supportsTlsExtensions=");
        return f4i1.g(sb, this.b, ')');
    }
}
