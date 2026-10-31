package p;

import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.extras.SLF4JLogger;
import java.util.Date;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract /* synthetic */ class gvg {
    public static jly0 A(daq daqVar, teq teqVar, int i) {
        return xqu.b(new thq(daqVar, teqVar, i, (byte) 1));
    }

    public static jly0 B(daq daqVar, teq teqVar, int i) {
        return iy81.a(new thq(daqVar, teqVar, i, (byte) 1));
    }

    public static /* synthetic */ String C(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ String D(int i) {
        if (i == 1) {
            return "FULL";
        }
        if (i == 2) {
            return "REDUCED";
        }
        if (i == 3) {
            return "MINIMAL";
        }
        if (i == 4) {
            return "NONE";
        }
        throw null;
    }

    public static /* synthetic */ int E(String str) {
        if (str == null) {
            bhn0.i("Name is null");
            return 0;
        }
        if (str.equals("FULL")) {
            return 1;
        }
        if (str.equals("REDUCED")) {
            return 2;
        }
        if (str.equals("MINIMAL")) {
            return 3;
        }
        if (str.equals("NONE")) {
            return 4;
        }
        hhg1.n("No enum constant io.branch.referral.Defines.BranchAttributionLevel.".concat(str));
        return 0;
    }

    public static /* synthetic */ byte a(int i) {
        switch (i) {
            case 1:
                return (byte) 0;
            case 2:
                return (byte) 1;
            case 3:
                return (byte) 2;
            case 4:
                return (byte) 3;
            case 5:
                return (byte) 4;
            case 6:
                return (byte) 5;
            case 7:
                return (byte) 6;
            case 8:
                return (byte) 7;
            case 9:
                return (byte) 8;
            case 10:
                return (byte) 9;
            case 11:
                return (byte) 10;
            case 12:
                return (byte) 11;
            case 13:
                return (byte) 12;
            case 14:
                return (byte) 13;
            default:
                throw null;
        }
    }

    public static int b(int i, int i2, int i3) {
        return i3 - (Integer.numberOfLeadingZeros(i) * i2);
    }

    public static int c(int i, int i2, Set set) {
        return (set.hashCode() + i) * i2;
    }

    public static MobiusLoop.Builder d(String str, MobiusLoop.Builder builder) {
        return builder.f(new SLF4JLogger(str));
    }

    public static String e(int i, String str, String str2) {
        return str + i + str2;
    }

    public static String f(long j, String str, String str2) {
        return str + j + str2;
    }

    public static String g(Object obj, String str) {
        return str + obj;
    }

    public static String h(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String i(String str, zf30 zf30Var, String str2) {
        return str + zf30Var + str2;
    }

    public static String j(StringBuilder sb, int i, String str) {
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    public static String k(StringBuilder sb, String str, char c) {
        sb.append(str);
        sb.append(c);
        return sb.toString();
    }

    public static String l(StringBuilder sb, String str, int i) {
        sb.append(str);
        sb.append(i);
        return sb.toString();
    }

    public static StringBuilder m(String str, float f, String str2, float f2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(f);
        sb.append(str2);
        sb.append(f2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder n(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        sb.append(str5);
        return sb;
    }

    public static jly0 o(oxo oxoVar, int i) {
        return xqu.b(new nxo(oxoVar, i, (byte) 0));
    }

    public static jly0 p(b8p b8pVar, int i) {
        return xqu.b(new a8p(b8pVar, i));
    }

    public static jly0 q(daq daqVar, int i) {
        return xqu.b(new caq(daqVar, i));
    }

    public static jly0 r(daq daqVar, teq teqVar, int i) {
        return xqu.b(new r7q(daqVar, teqVar, i, (byte) 1));
    }

    public static void s() {
        new Date().getTime();
    }

    public static void t(StringBuilder sb, float f, String str, float f2, String str2) {
        sb.append(f);
        sb.append(str);
        sb.append(f2);
        sb.append(str2);
    }

    public static jly0 u(daq daqVar, int i) {
        return iy81.a(new caq(daqVar, i));
    }

    public static jly0 v(daq daqVar, teq teqVar, int i) {
        return iy81.a(new r7q(daqVar, teqVar, i, (byte) 1));
    }

    public static jly0 w(daq daqVar, int i) {
        return xqu.b(new gbp(daqVar, i, (byte) 3));
    }

    public static jly0 x(daq daqVar, teq teqVar, int i) {
        return xqu.b(new thq(daqVar, teqVar, i, (byte) 0));
    }

    public static jly0 y(daq daqVar, int i) {
        return iy81.a(new gbp(daqVar, i, (byte) 3));
    }

    public static jly0 z(daq daqVar, teq teqVar, int i) {
        return iy81.a(new thq(daqVar, teqVar, i, (byte) 0));
    }
}
