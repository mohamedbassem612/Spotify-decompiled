package p;

import android.net.Uri;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class h9a implements y2i1 {
    public static final h9a c = new h9a(0);
    public static final h9a d = new h9a(1);
    public static final h9a e = new h9a(2);
    public static final h9a f = new h9a(3);
    public static final h9a g = new h9a(4);
    public static final h9a h = new h9a(5);
    public final /* synthetic */ byte b;

    public /* synthetic */ h9a(byte b) {
        this.b = b;
    }

    public final boolean a(String str) {
        switch (this.b) {
            case 0:
                return str.length() == 22;
            case 1:
                return str.length() == 16;
            case 2:
                return str.length() > 0;
            case 3:
                return true;
            case 4:
                return str.length() > 0;
            case 5:
                return str.length() > 0;
            default:
                return true;
        }
    }

    public final boolean b(String str) {
        switch (this.b) {
            case 0:
                for (int i = 0; i < str.length(); i++) {
                    if (!Character.isLetterOrDigit(str.charAt(i))) {
                        return false;
                    }
                }
                return true;
            case 1:
                for (int i2 = 0; i2 < str.length(); i2++) {
                    char cCharAt = str.charAt(i2);
                    if (('0' > cCharAt || cCharAt >= ':') && (('a' > cCharAt || cCharAt >= 'g') && ('A' > cCharAt || cCharAt >= 'G'))) {
                        return false;
                    }
                }
                return true;
            case 2:
                return true;
            case 3:
                for (int i3 = 0; i3 < str.length(); i3++) {
                    if (str.charAt(i3) == '#') {
                        return false;
                    }
                }
                return true;
            case 4:
                String strDecode = Uri.decode(str);
                strDecode.getClass();
                List listQ0 = ihc1.Q0(strDecode, new String[]{"://"}, 0, 6);
                if (listQ0.size() != 2) {
                    return false;
                }
                String str2 = (String) listQ0.get(0);
                if (!u890.j(str2, "https") && !u890.j(str2, "http")) {
                    return false;
                }
                String str3 = (String) listQ0.get(1);
                if (str3.length() <= 0) {
                    return false;
                }
                for (int i4 = 0; i4 < str3.length(); i4++) {
                    if (eth.H(str3.charAt(i4))) {
                        return false;
                    }
                }
                return true;
            case 5:
                String strDecode2 = Uri.decode(str);
                strDecode2.getClass();
                for (int i5 = 0; i5 < strDecode2.length(); i5++) {
                    char cCharAt2 = strDecode2.charAt(i5);
                    if ('A' <= cCharAt2 && cCharAt2 < '[') {
                        return false;
                    }
                }
                return true;
            default:
                return true;
        }
    }
}
