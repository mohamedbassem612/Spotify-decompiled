package p;

import java.nio.ByteOrder;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class wmc0 implements ac9 {
    public final b380 a;
    public final int b;

    public wmc0(int i, bg11 bg11Var) {
        this.b = i;
        this.a = bg11Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static wmc0 b(int i, izr0 izr0Var) {
        String str;
        ac9 udc1Var;
        String str2;
        int i2 = 4;
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i3 = izr0Var.c;
        int iA = -2;
        int i4 = 0;
        while (izr0Var.a() > 8) {
            int iS = izr0Var.s();
            int iS2 = izr0Var.b + izr0Var.s();
            izr0Var.Q(iS2);
            if (iS != 1414744396) {
                fc9 fc9Var = null;
                switch (iS) {
                    case 1718776947:
                        if (iA != 2) {
                            if (iA == 1) {
                                int iX = izr0Var.x();
                                if (iX == 1) {
                                    str = "audio/raw";
                                } else if (iX == 85) {
                                    str = "audio/mpeg";
                                } else if (iX == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iX != 8192) {
                                    str = iX != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iX2 = izr0Var.x();
                                    int iS3 = izr0Var.s();
                                    izr0Var.S(6);
                                    int iX3 = izr0Var.x();
                                    String str3 = zoi1.a;
                                    int I = zoi1.I(iX3, ByteOrder.LITTLE_ENDIAN);
                                    int iX4 = izr0Var.a() > 0 ? izr0Var.x() : 0;
                                    ge30 ge30Var = new ge30();
                                    ge30Var.o = asj0.p(str);
                                    ge30Var.I = iX2;
                                    ge30Var.K = iS3;
                                    if (str.equals("audio/raw") && I != 0) {
                                        ge30Var.L = I;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iX4 > 0) {
                                        byte[] bArr = new byte[iX4];
                                        izr0Var.o(0, bArr, iX4);
                                        ge30Var.r = b380.t(bArr);
                                    }
                                    udc1Var = new udc1(new ie30(ge30Var));
                                } else {
                                    td6.p(iX, "Ignoring track with unsupported format tag ");
                                }
                            } else {
                                oon1.H("Ignoring strf box for unsupported track type: ".concat(zoi1.L(iA)));
                            }
                            udc1Var = fc9Var;
                            break;
                        } else {
                            izr0Var.S(i2);
                            int iS4 = izr0Var.s();
                            int iS5 = izr0Var.s();
                            izr0Var.S(i2);
                            int iS6 = izr0Var.s();
                            switch (iS6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                ge30 ge30Var2 = new ge30();
                                ge30Var2.v = iS4;
                                ge30Var2.w = iS5;
                                ge30Var2.e(str2);
                                udc1Var = new udc1(new ie30(ge30Var2));
                            } else {
                                td6.p(iS6, "Ignoring track with unsupported compression ");
                                udc1Var = fc9Var;
                            }
                        }
                        break;
                    case 1751742049:
                        int iS7 = izr0Var.s();
                        izr0Var.S(8);
                        int iS8 = izr0Var.s();
                        int iS9 = izr0Var.s();
                        izr0Var.S(i2);
                        izr0Var.s();
                        izr0Var.S(12);
                        udc1Var = new ec9(iS7, iS8, iS9);
                        break;
                    case 1752331379:
                        int iS10 = izr0Var.s();
                        izr0Var.S(12);
                        izr0Var.s();
                        int iS11 = izr0Var.s();
                        int iS12 = izr0Var.s();
                        izr0Var.S(i2);
                        int iS13 = izr0Var.s();
                        int iS14 = izr0Var.s();
                        izr0Var.S(i2);
                        fc9Var = new fc9(iS10, iS11, iS12, iS13, iS14, izr0Var.s());
                        udc1Var = fc9Var;
                        break;
                    case 1852994675:
                        udc1Var = new wdc1(izr0Var.C(izr0Var.a(), StandardCharsets.UTF_8));
                        break;
                    default:
                        udc1Var = fc9Var;
                        break;
                }
            } else {
                udc1Var = b(izr0Var.s(), izr0Var);
            }
            if (udc1Var != null) {
                if (udc1Var.getType() == 1752331379) {
                    iA = ((fc9) udc1Var).a();
                }
                int i5 = i4 + 1;
                int iB = o280.b(objArrCopyOf.length, i5);
                if (iB > objArrCopyOf.length) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
                }
                objArrCopyOf[i4] = udc1Var;
                i4 = i5;
            }
            izr0Var.R(iS2);
            izr0Var.Q(i3);
            i2 = 4;
        }
        return new wmc0(i, b380.l(i4, objArrCopyOf));
    }

    public final ac9 a(Class cls) {
        w280 w280VarR = this.a.r(0);
        while (w280VarR.hasNext()) {
            ac9 ac9Var = (ac9) w280VarR.next();
            if (ac9Var.getClass() == cls) {
                return ac9Var;
            }
        }
        return null;
    }

    @Override // p.ac9
    public final int getType() {
        return this.b;
    }
}
