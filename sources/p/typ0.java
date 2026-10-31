package p;

import java.io.EOFException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class typ0 implements HostnameVerifier {
    public static final typ0 a = new typ0();

    public static List a(X509Certificate x509Certificate, int i) {
        Object obj;
        try {
            Collection<List<?>> subjectAlternativeNames = x509Certificate.getSubjectAlternativeNames();
            if (subjectAlternativeNames != null) {
                ArrayList arrayList = new ArrayList();
                for (List<?> list : subjectAlternativeNames) {
                    if (list != null && list.size() >= 2 && u890.j(list.get(0), Integer.valueOf(i)) && (obj = list.get(1)) != null) {
                        arrayList.add((String) obj);
                    }
                }
                return arrayList;
            }
        } catch (CertificateParsingException unused) {
        }
        return z6x.a;
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00f8  */
    public static boolean b(String str, X509Certificate x509Certificate) throws EOFException {
        boolean zEquals;
        int length;
        if (u4n1.a.e(str)) {
            String strB = u4n1.b(str);
            List listA = a(x509Certificate, 7);
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (u890.j(strB, u4n1.b((String) it.next()))) {
                        return true;
                    }
                }
            }
            return false;
        }
        if (str.length() == ((int) pto1.x(str))) {
            str = str.toLowerCase(Locale.US);
        }
        List<String> listA2 = a(x509Certificate, 2);
        if (!(listA2 instanceof Collection) || !listA2.isEmpty()) {
            for (String lowerCase : listA2) {
                if (str.length() == 0 || nhc1.Y(str, ".", false) || nhc1.R(str, "..", false) || lowerCase == null || lowerCase.length() == 0 || nhc1.Y(lowerCase, ".", false) || nhc1.R(lowerCase, "..", false)) {
                    zEquals = false;
                } else {
                    String strConcat = !nhc1.R(str, ".", false) ? str.concat(".") : str;
                    if (!nhc1.R(lowerCase, ".", false)) {
                        lowerCase = lowerCase.concat(".");
                    }
                    if (lowerCase.length() == ((int) pto1.x(lowerCase))) {
                        lowerCase = lowerCase.toLowerCase(Locale.US);
                    }
                    if (!ihc1.h0(lowerCase, "*", false)) {
                        zEquals = strConcat.equals(lowerCase);
                    } else if (!nhc1.Y(lowerCase, "*.", false) || ihc1.v0(lowerCase, '*', 1, 4) != -1 || strConcat.length() < lowerCase.length() || "*.".equals(lowerCase)) {
                        zEquals = false;
                    } else {
                        String strSubstring = lowerCase.substring(1);
                        if (nhc1.R(strConcat, strSubstring, false) && ((length = strConcat.length() - strSubstring.length()) <= 0 || ihc1.A0(strConcat, '.', length - 1, 4) == -1)) {
                            zEquals = true;
                        } else {
                            zEquals = false;
                        }
                    }
                }
                if (zEquals) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // javax.net.ssl.HostnameVerifier
    public final boolean verify(String str, SSLSession sSLSession) {
        if (str.length() == ((int) pto1.x(str))) {
            try {
                return b(str, (X509Certificate) sSLSession.getPeerCertificates()[0]);
            } catch (SSLException unused) {
            }
        }
        return false;
    }
}
