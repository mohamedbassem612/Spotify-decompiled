package p;

import java.net.URI;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kg5 implements fse0 {
    public static final Pattern[] a = {Pattern.compile("spotify:user:([a-zA-Z0-9%_~+.\\-]+)"), Pattern.compile("spotify%3Auser%3A([^%\\s]+)"), Pattern.compile("spotify(?::user:([a-zA-Z0-9%_~+.\\-]+))?:playlist:([a-zA-Z0-9]+)"), Pattern.compile("spotify(?:%3Auser%3A([^%]+))?%3Aplaylist%3A([a-zA-Z0-9]+)"), Pattern.compile("spotify:user:([a-zA-Z0-9%_~+.\\-]+):cluster:([a-zA-Z0-9]+)"), Pattern.compile("spotify%3Auser%3A([a-zA-Z0-9%_~+.\\-]+)%3Acluster%3A([a-zA-Z0-9]+)"), Pattern.compile("searchview/.*username=([^&]+)")};

    @Override // p.fse0
    public final String a(String str) {
        if (str != null) {
            if (ihc1.w0(str, "spotify:user:", 0, false, 6) < 0 && ihc1.w0(str, "spotify%3Auser%3A", 0, false, 6) < 0 && ihc1.w0(str, "spotify:playlist:", 0, false, 6) < 0 && ihc1.w0(str, "spotify%3Aplaylist%3A", 0, false, 6) < 0 && ihc1.w0(str, "searchview/", 0, false, 6) < 0) {
                return str;
            }
            StringBuilder sb = null;
            for (Pattern pattern : a) {
                Matcher matcher = pattern.matcher(str);
                if (matcher.find()) {
                    if (sb == null) {
                        sb = new StringBuilder(str.length());
                    } else {
                        sb.setLength(0);
                    }
                    StringBuilder sb2 = sb;
                    int iEnd = 0;
                    do {
                        int iGroupCount = matcher.groupCount();
                        int i = 1;
                        if (1 <= iGroupCount) {
                            while (true) {
                                int iStart = matcher.start(i);
                                if (iStart != -1) {
                                    sb2.append((CharSequence) str, iEnd, iStart);
                                    sb2.append("AnonymizedMarvin");
                                    iEnd = matcher.end(i);
                                }
                                if (i == iGroupCount) {
                                    break;
                                }
                                i++;
                            }
                        }
                    } while (matcher.find());
                    sb2.append((CharSequence) str, iEnd, str.length());
                    str = sb2.toString();
                    sb = sb2;
                }
            }
        }
        return str;
    }

    @Override // p.fse0
    public final String b(String str, Object... objArr) {
        String string;
        String strA;
        int length = objArr.length;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            if (obj == null || (string = obj.toString()) == null) {
                string = "null";
            }
            if (obj instanceof URI) {
                URI uri = (URI) obj;
                String scheme = uri.getScheme();
                strA = (u890.j(scheme, "http") || u890.j(scheme, "https")) ? scheme + "://" + uri.getHost() + "/AnonymizedMarvin" : scheme != null ? scheme.concat(":AnonymizedMarvin") : gvg.e(uri.toString().length(), "<no colon, ", " characters>");
            } else {
                strA = a(string);
            }
            if (strA != string && !u890.j(strA, string)) {
                objArr[i] = strA;
            }
        }
        gse0 gse0VarA = hse0.a();
        Locale locale = Locale.US;
        String strA2 = a(str);
        strA2.getClass();
        return (String) gse0VarA.invoke(locale, strA2, objArr);
    }
}
