package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ome extends tme {
    public static final ome c = new ome("CharMatcher.any()", 0);
    public static final ome d = new ome("CharMatcher.ascii()", 1);
    public static final ome e = new ome("CharMatcher.javaIsoControl()", 2);
    public static final ome f = new ome("CharMatcher.none()", 3);
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ome(String str, byte b) {
        super(str);
        this.b = b;
    }

    public int b(CharSequence charSequence, int i) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int length = charSequence.length();
                dm5.u(i, length);
                if (i == length) {
                    return -1;
                }
                return i;
            case 3:
                dm5.u(i, charSequence.length());
                return -1;
            default:
                return super.b(charSequence, i);
        }
    }

    public int c(String str) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return str.length() == 0 ? -1 : 0;
            case 3:
                str.getClass();
                return -1;
            default:
                return super.c(str);
        }
    }

    public final boolean d(char c2) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return true;
            case 1:
                return c2 <= 127;
            case 2:
                return c2 <= 31 || (c2 >= 127 && c2 <= 159);
            default:
                return false;
        }
    }

    @Override // p.qme
    public xme e() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return f;
            case 3:
                return c;
            default:
                return super.e();
        }
    }

    public String f(String str) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return "";
            case 3:
                return str.toString();
            default:
                return super.f(str);
        }
    }
}
