package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g4e1 extends vhc {
    public final /* synthetic */ byte b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g4e1(byte b) {
        super((byte) 0);
        this.b = b;
    }

    @Override // p.vhc
    public void c(xax xaxVar) {
        switch (this.b) {
            case 1:
                StringBuilder sb = new StringBuilder();
                while (xaxVar.b()) {
                    char cA = xaxVar.a();
                    xaxVar.d++;
                    f(cA, sb);
                    if (sb.length() % 3 == 0) {
                        vhc.q(xaxVar, sb);
                        if (eko1.A(xaxVar.d, 3, xaxVar.a) != 3) {
                            xaxVar.e = 0;
                            l(xaxVar, sb);
                            break;
                        }
                    }
                }
                l(xaxVar, sb);
                break;
            default:
                super.c(xaxVar);
                break;
        }
    }

    @Override // p.vhc
    public final int f(char c, StringBuilder sb) {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (c == ' ') {
                    sb.append((char) 3);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'a' || c > 'z') {
                        if (c < ' ') {
                            sb.append((char) 0);
                            sb.append(c);
                            return 2;
                        }
                        if (c >= '!' && c <= '/') {
                            sb.append((char) 1);
                            sb.append((char) (c - '!'));
                            return 2;
                        }
                        if (c >= ':' && c <= '@') {
                            sb.append((char) 1);
                            sb.append((char) (c - '+'));
                            return 2;
                        }
                        if (c >= '[' && c <= '_') {
                            sb.append((char) 1);
                            sb.append((char) (c - 'E'));
                            return 2;
                        }
                        if (c == '`') {
                            sb.append((char) 2);
                            sb.append((char) (c - '`'));
                            return 2;
                        }
                        if (c >= 'A' && c <= 'Z') {
                            sb.append((char) 2);
                            sb.append((char) (c - '@'));
                            return 2;
                        }
                        if (c < '{' || c > 127) {
                            sb.append("\u0001\u001e");
                            return 2 + f((char) (c - 128), sb);
                        }
                        sb.append((char) 2);
                        sb.append((char) (c - '`'));
                        return 2;
                    }
                    sb.append((char) (c - 'S'));
                }
                return 1;
            default:
                if (c == '\r') {
                    sb.append((char) 0);
                } else if (c == ' ') {
                    sb.append((char) 3);
                } else if (c == '*') {
                    sb.append((char) 1);
                } else if (c == '>') {
                    sb.append((char) 2);
                } else if (c >= '0' && c <= '9') {
                    sb.append((char) (c - ','));
                } else {
                    if (c < 'A' || c > 'Z') {
                        eko1.w(c);
                        throw null;
                    }
                    sb.append((char) (c - '3'));
                }
                return 1;
        }
    }

    @Override // p.vhc
    public final int i() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return 2;
            default:
                return 3;
        }
    }

    @Override // p.vhc
    public void l(xax xaxVar, StringBuilder sb) {
        switch (this.b) {
            case 1:
                StringBuilder sb2 = xaxVar.c;
                xaxVar.c(sb2.length());
                int length = xaxVar.f.b - sb2.length();
                xaxVar.d -= sb.length();
                String str = xaxVar.a;
                if ((str.length() - xaxVar.g) - xaxVar.d > 1 || length > 1 || (str.length() - xaxVar.g) - xaxVar.d != length) {
                    xaxVar.d((char) 254);
                }
                if (xaxVar.e < 0) {
                    xaxVar.e = 0;
                }
                break;
            default:
                super.l(xaxVar, sb);
                break;
        }
    }
}
