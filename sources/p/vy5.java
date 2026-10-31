package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vy5 implements dk80 {
    public static final vy5 b = new vy5(0);
    public static final vy5 c = new vy5(1);
    public static final vy5 d = new vy5(2);
    public static final /* synthetic */ vy5 e = new vy5(3);
    public static final vy5 f = new vy5(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ vy5(byte b2) {
        this.a = b2;
    }

    public final void i(h4e1 h4e1Var) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                yzr0 yzr0Var = h4e1Var.c;
                StringBuilder sb = new StringBuilder();
                int length = yzr0Var.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = yzr0Var.charAt(i);
                    if ('0' <= cCharAt && cCharAt < ':') {
                        sb.append(cCharAt);
                    }
                }
                String string = ihc1.b1(4, sb).toString();
                if (!u890.j(string, yzr0Var.toString())) {
                    h4e1Var.k(0, yzr0Var.length(), string);
                }
                break;
            case 1:
                yzr0 yzr0Var2 = h4e1Var.c;
                if (yzr0Var2.length() > 2000) {
                    h4e1Var.k(2000, yzr0Var2.length(), "");
                }
                break;
            case 2:
                yzr0 yzr0Var3 = h4e1Var.c;
                int length2 = yzr0Var3.length();
                while (true) {
                    length2--;
                    if (-1 >= length2) {
                        break;
                    } else {
                        char cCharAt2 = yzr0Var3.charAt(length2);
                        if (cCharAt2 == ' ') {
                            h4e1Var.k(length2, length2 + 1, "_");
                        } else {
                            char lowerCase = Character.toLowerCase(cCharAt2);
                            if (lowerCase != cCharAt2) {
                                h4e1Var.k(length2, length2 + 1, String.valueOf(lowerCase));
                            }
                        }
                    }
                }
                break;
            case 3:
                break;
            default:
                yzr0 yzr0Var4 = h4e1Var.c;
                if (yzr0Var4.length() > 2000) {
                    h4e1Var.k(2000, yzr0Var4.length(), "");
                }
                break;
        }
    }

    private final void a(h4e1 h4e1Var) {
    }
}
