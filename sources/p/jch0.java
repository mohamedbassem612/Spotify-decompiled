package p;

import android.content.Context;
import android.graphics.Color;
import android.util.LruCache;
import android.view.View;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.playlist.policy.proto.PlaylistDecorationPolicy;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class jch0 {
    public static volatile ynb0 a;
    public static volatile q2e b = q2e.b;
    public static final xrj0 c = new xrj0((byte) 18);

    public static final af5 A(c8e1 c8e1Var) {
        af5 af5Var = c8e1Var.a;
        long j = c8e1Var.b;
        af5Var.getClass();
        return af5Var.f(nbe1.g(j), nbe1.f(j));
    }

    public static final af5 B(c8e1 c8e1Var, int i) {
        af5 af5Var = c8e1Var.a;
        af5 af5Var2 = c8e1Var.a;
        long j = c8e1Var.b;
        int iF = nbe1.f(j);
        int iF2 = nbe1.f(j);
        int length = iF2 + i;
        if (((i ^ length) & (iF2 ^ length)) < 0) {
            length = af5Var2.b.length();
        }
        return af5Var.f(iF, Math.min(length, af5Var2.b.length()));
    }

    public static final af5 D(c8e1 c8e1Var, int i) {
        af5 af5Var = c8e1Var.a;
        long j = c8e1Var.b;
        int iG = nbe1.g(j);
        int i2 = iG - i;
        if (((iG ^ i2) & (i ^ iG)) < 0) {
            i2 = 0;
        }
        return af5Var.f(Math.max(0, i2), nbe1.g(j));
    }

    public static final boolean E(ruq0 ruq0Var, Map map, Map map2) {
        if (ruq0Var.h() == 0.0d && ruq0Var.j() == 0.0d) {
            return true;
        }
        double dI = I(map);
        double dI2 = I(map2);
        double dH = ruq0Var.h();
        if (dH != 0.0d && Math.abs(dH - dI) > 0.001d) {
            return false;
        }
        double dJ = ruq0Var.j();
        return dJ == 0.0d || Math.abs(dJ - dI2) <= 0.001d;
    }

    public static final double I(Map map) {
        String str;
        Double dA0;
        if (map == null || (str = (String) map.get("item.speed")) == null || (dA0 = nhc1.a0(str)) == null) {
            return 1.0d;
        }
        return dA0.doubleValue();
    }

    public static String K(l370 l370Var) throws NoSuchAlgorithmException {
        byte[] bArrM = ryn1.m(l370Var.i);
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(bArrM, 0, bArrM.length);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        return new rhc(bArrDigest).e();
    }

    public static final ArrayList L(List list, Function0 function0) {
        if (!((Boolean) function0.invoke()).booleanValue()) {
            return null;
        }
        fjb fjbVar = new fjb((byte) 27);
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            afh0 afh0Var = (afh0) list.get(i);
            pyp0 pyp0VarA = ((obe1) afh0Var.g()).a().a(fjbVar);
            arrayList.add(new mmr0(afh0Var.H(m5n1.v(pyp0VarA.t(), pyp0VarA.t(), pyp0VarA.r(), pyp0VarA.r())), pyp0VarA.s()));
        }
        return arrayList;
    }

    public static final String P(String str, byte[] bArr) {
        int length = str.length();
        int iMax = Math.max(0, length - 2);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= iMax) {
                if (i == i2) {
                    return str;
                }
                if (i >= length) {
                    return nhc1.Q(0, bArr, i2, 5);
                }
            } else if (str.charAt(i) == '%') {
                int i3 = i + 3;
                try {
                    String strSubstring = str.substring(i + 1, i3);
                    eth.h(16);
                    bArr[i2] = (byte) Integer.parseInt(strSubstring, 16);
                    i2++;
                    i = i3;
                } catch (NumberFormatException unused) {
                    bArr[i2] = (byte) str.charAt(i);
                    i2++;
                    i++;
                }
            }
            bArr[i2] = (byte) str.charAt(i);
            i2++;
            i++;
        }
    }

    public static rsw0 Q(c9n c9nVar, int i, vu30 vu30Var, int i2) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        rsw0 rsw0Var = new rsw0(ulo1.o(c9nVar, o6x.a), mno1.a(i, 1, 4));
        rsw0Var.A0(1, rsw0Var, vu30Var);
        return rsw0Var;
    }

    public static int R(ff01 ff01Var) throws IOException {
        try {
            nac nacVar = ff01Var.b;
            ff01Var.q(1L);
            long j = 0;
            while (true) {
                long j2 = j + 1;
                if (!ff01Var.request(j2)) {
                    break;
                }
                byte bG = nacVar.g(j);
                if ((bG >= 48 && bG <= 57) || (j == 0 && bG == 45)) {
                    j = j2;
                }
                if (j != 0) {
                    break;
                }
                eth.h(16);
                throw new NumberFormatException("Expected a digit or '-' but was 0x".concat(Integer.toString(bG, 16)));
            }
            long jY = nacVar.y();
            String strP = ff01Var.p(Long.MAX_VALUE);
            if (jY >= 0 && jY <= 2147483647L && strP.length() <= 0) {
                return (int) jY;
            }
            throw new IOException("expected an int but was \"" + jY + strP + '\"');
        } catch (NumberFormatException e) {
            k220.i(e.getMessage());
            return 0;
        }
    }

    public static int S(double d) {
        if (Double.isNaN(d)) {
            hhg1.n("Cannot round NaN value.");
            return 0;
        }
        if (d > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d);
    }

    public static int U(float f) {
        if (!Float.isNaN(f)) {
            return Math.round(f);
        }
        hhg1.n("Cannot round NaN value.");
        return 0;
    }

    public static long a0(double d) {
        if (!Double.isNaN(d)) {
            return Math.round(d);
        }
        hhg1.n("Cannot round NaN value.");
        return 0L;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0130  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x014a  */
    /* JADX WARN: Code duplicated, block: B:115:0x0153 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:116:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x0157  */
    /* JADX WARN: Code duplicated, block: B:119:0x015b  */
    /* JADX WARN: Code duplicated, block: B:120:0x015e  */
    /* JADX WARN: Code duplicated, block: B:122:0x0162  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:125:0x016b  */
    /* JADX WARN: Code duplicated, block: B:126:0x016d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0171  */
    /* JADX WARN: Code duplicated, block: B:129:0x017a  */
    /* JADX WARN: Code duplicated, block: B:132:0x0182  */
    /* JADX WARN: Code duplicated, block: B:133:0x0185  */
    /* JADX WARN: Code duplicated, block: B:135:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x018c  */
    /* JADX WARN: Code duplicated, block: B:139:0x01af  */
    /* JADX WARN: Code duplicated, block: B:141:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:145:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e5  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:157:0x020d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:167:0x0291  */
    /* JADX WARN: Code duplicated, block: B:169:0x029f  */
    /* JADX WARN: Code duplicated, block: B:170:0x02a1  */
    /* JADX WARN: Code duplicated, block: B:173:0x02a8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:174:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:177:0x02c3 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:178:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:181:0x0324  */
    /* JADX WARN: Code duplicated, block: B:184:0x033a  */
    /* JADX WARN: Code duplicated, block: B:186:0x01e0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:187:0x01f1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:188:0x01e8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:92:0x0106  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x0114  */
    /* JADX WARN: Code duplicated, block: B:97:0x0117  */
    public static final void b(af5 af5Var, qim0 qim0Var, lee1 lee1Var, iu30 iu30Var, int i, boolean z, int i2, int i3, Map map, x9h x9hVar, m0e1 m0e1Var, b0k b0kVar, int i4, int i5) {
        int i6;
        iu30 iu30Var2;
        int i7;
        boolean z2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z3;
        int i22;
        int i23;
        int i24;
        Map map2;
        x9h x9hVar2;
        m0e1 m0e1Var2;
        boolean z4;
        h311 h311VarV;
        int i25;
        boolean z5;
        int i26;
        int i27;
        int i28;
        Map map3;
        x9h x9hVar3;
        m0e1 m0e1Var3;
        int length;
        List list;
        int i29;
        boolean z6;
        int i30;
        boolean z7;
        f930 f930Var;
        boolean z8;
        boolean z9;
        Object objT;
        ven0 ven0Var;
        boolean zG;
        Object objT2;
        int size;
        ze5 ze5Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1343466571);
        if ((i4 & 6) == 0) {
            i6 = (b0kVar2.g(af5Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= b0kVar2.g(qim0Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= b0kVar2.g(lee1Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            iu30Var2 = iu30Var;
            i6 |= b0kVar2.i(iu30Var2) ? 2048 : 1024;
        } else {
            iu30Var2 = iu30Var;
        }
        int i31 = i5 & 16;
        if (i31 == 0) {
            if ((i4 & 24576) == 0) {
                i6 |= b0kVar2.e(i) ? 16384 : 8192;
            }
            i7 = i5 & 32;
            if (i7 != 0) {
                if ((196608 & i4) == 0) {
                    z2 = z;
                    if (b0kVar2.h(z2)) {
                        i8 = 131072;
                    } else {
                        i8 = 65536;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 64;
                if (i9 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (b0kVar2.e(i2)) {
                        i10 = 1048576;
                    } else {
                        i10 = 524288;
                    }
                    i6 |= i10;
                }
                i11 = i5 & 128;
                if (i11 != 0) {
                    if ((i4 & 12582912) == 0) {
                        int i32 = i6;
                        if (b0kVar2.e(i3)) {
                            i12 = 8388608;
                        } else {
                            i12 = 4194304;
                        }
                        i13 = i32 | i12;
                    }
                    i14 = i5 & 256;
                    if (i14 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (b0kVar2.i(map)) {
                                i15 = 67108864;
                            } else {
                                i15 = 33554432;
                            }
                            i13 |= i15;
                        }
                        i16 = i5 & 512;
                        if (i16 != 0) {
                            if ((i4 & 805306368) == 0) {
                                if (b0kVar2.i(x9hVar)) {
                                    i17 = 536870912;
                                } else {
                                    i17 = 268435456;
                                }
                                i13 |= i17;
                            }
                            i18 = i5 & 1024;
                            if (i18 != 0) {
                                i20 = 6;
                                i19 = i18;
                            } else {
                                i19 = i18;
                                if (b0kVar2.g(m0e1Var)) {
                                    i20 = 4;
                                } else {
                                    i20 = 2;
                                }
                            }
                            i21 = 0;
                            if ((i13 & 306783379) == 306783378 || (i20 & 3) != 2) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (b0kVar2.Y(i13 & 1, z3)) {
                                if (i31 != 0) {
                                    i25 = 1;
                                } else {
                                    i25 = i;
                                }
                                if (i7 != 0) {
                                    z5 = true;
                                } else {
                                    z5 = z2;
                                }
                                if (i9 != 0) {
                                    i26 = Integer.MAX_VALUE;
                                } else {
                                    i26 = i2;
                                }
                                if (i11 != 0) {
                                    i27 = 1;
                                } else {
                                    i27 = i3;
                                }
                                if (i14 != 0) {
                                    int i33 = i20;
                                    map3 = b7x.a;
                                    i28 = i33;
                                } else {
                                    i28 = i20;
                                    map3 = map;
                                }
                                if (i16 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i19 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i27, i26);
                                pze0.m(b0kVar2.k(h061.a));
                                b0kVar2.i0(1588900273);
                                b0kVar2.r(false);
                                mmr0 mmr0Var = df5.a;
                                length = af5Var.b.length();
                                list = af5Var.a;
                                if (list != null) {
                                    size = list.size();
                                    while (true) {
                                        if (i21 < size) {
                                            ze5Var = (ze5) list.get(i21);
                                            i30 = i28;
                                            if (ze5Var.a instanceof qgc1) {
                                                i29 = i25;
                                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                        z7 = true;
                                                    }
                                                }
                                                i21++;
                                                i28 = i30;
                                                i25 = i29;
                                            } else {
                                                i29 = i25;
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                            z6 = false;
                                        }
                                        boolean zR = f2p1.r(af5Var);
                                        f930Var = (f930) b0kVar2.k(t4k.k);
                                        if (!z7 || zR) {
                                            z8 = z5;
                                            b0kVar2.i0(1590195670);
                                            if ((i13 & 14) == 4) {
                                                z9 = true;
                                            } else {
                                                z9 = false;
                                            }
                                            objT = b0kVar2.T();
                                            if (z9 || objT == m4cVar) {
                                                objT = xto.t(af5Var);
                                                b0kVar2.s0(objT);
                                            }
                                            ven0Var = (ven0) objT;
                                            af5 af5Var2 = (af5) ven0Var.getValue();
                                            zG = b0kVar2.g(ven0Var);
                                            objT2 = b0kVar2.T();
                                            if (zG || objT2 == m4cVar) {
                                                objT2 = new g45(ven0Var, (byte) 2);
                                                b0kVar2.s0(objT2);
                                            }
                                            int i34 = i13 << 6;
                                            d(qim0Var, af5Var2, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                            b0kVar2.r(false);
                                        } else {
                                            b0kVar2.i0(1589148149);
                                            boolean z10 = z5;
                                            ffa.a(af5Var, lee1Var, f930Var, (List) null, z10, b0kVar2);
                                            z8 = z10;
                                            qim0 qim0VarE0 = e0(qim0Var, af5Var, lee1Var, iu30Var2, i29, z8, i26, i27, f930Var, null, null, x9hVar3, null, m0e1Var3);
                                            d7x d7xVar = d7x.b;
                                            int iHashCode = Long.hashCode(tgp1.l(b0kVar2));
                                            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarE0);
                                            xos0 xos0VarM = b0kVar2.m();
                                            hzj.A.getClass();
                                            if (((x340) b0kVar2).a == null) {
                                                b0kVar2 = b0kVar2;
                                                tgp1.p();
                                                throw null;
                                            }
                                            b0kVar2.m0();
                                            if (((x340) b0kVar2).S) {
                                                b0kVar2 = b0kVar2;
                                                b0kVar2.l(hmb0.t1);
                                            } else {
                                                b0kVar2 = b0kVar2;
                                                b0kVar2.v0();
                                            }
                                            nko1.H(d7xVar, b0kVar2, y580.O0);
                                            nko1.H(xos0VarM, b0kVar2, y580.N0);
                                            nko1.F(b0kVar2);
                                            nko1.H(qim0VarE, b0kVar2, y580.Y);
                                            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
                                            b0kVar2.r(true);
                                            b0kVar2.r(false);
                                        }
                                        i24 = i27;
                                        x9hVar2 = x9hVar3;
                                        m0e1Var2 = m0e1Var3;
                                        map2 = map3;
                                        i23 = i26;
                                        z4 = z8;
                                        i22 = i29;
                                    }
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                i30 = i28;
                                z7 = z6;
                                boolean zR2 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var3 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i35 = i13 << 6;
                                    d(qim0Var, af5Var3, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i35) | (29360128 & i35) | (234881024 & i35) | (i35 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var4 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i36 = i13 << 6;
                                    d(qim0Var, af5Var4, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i36) | (29360128 & i36) | (234881024 & i36) | (i36 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            } else {
                                b0kVar2.b0();
                                i22 = i;
                                i23 = i2;
                                i24 = i3;
                                map2 = map;
                                x9hVar2 = x9hVar;
                                m0e1Var2 = m0e1Var;
                                z4 = z2;
                            }
                            h311VarV = b0kVar2.v();
                            if (h311VarV != null) {
                                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i13 |= 805306368;
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if (b0kVar2.g(m0e1Var)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                        }
                        i21 = 0;
                        if ((i13 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (b0kVar2.Y(i13 & 1, z3)) {
                            if (i31 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i;
                            }
                            if (i7 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i9 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i2;
                            }
                            if (i11 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i3;
                            }
                            if (i14 != 0) {
                                int i37 = i20;
                                map3 = b7x.a;
                                i28 = i37;
                            } else {
                                i28 = i20;
                                map3 = map;
                            }
                            if (i16 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i19 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i27, i26);
                            pze0.m(b0kVar2.k(h061.a));
                            b0kVar2.i0(1588900273);
                            b0kVar2.r(false);
                            mmr0 mmr0Var2 = df5.a;
                            length = af5Var.b.length();
                            list = af5Var.a;
                            if (list != null) {
                                size = list.size();
                                while (true) {
                                    if (i21 < size) {
                                        ze5Var = (ze5) list.get(i21);
                                        i30 = i28;
                                        if (ze5Var.a instanceof qgc1) {
                                            i29 = i25;
                                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                    z7 = true;
                                                }
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                        z6 = false;
                                    }
                                    boolean zR3 = f2p1.r(af5Var);
                                    f930Var = (f930) b0kVar2.k(t4k.k);
                                    if (z7) {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var5 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i38 = i13 << 6;
                                        d(qim0Var, af5Var5, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i38) | (29360128 & i38) | (234881024 & i38) | (i38 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    } else {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var6 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i39 = i13 << 6;
                                        d(qim0Var, af5Var6, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i39) | (29360128 & i39) | (234881024 & i39) | (i39 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    }
                                    i24 = i27;
                                    x9hVar2 = x9hVar3;
                                    m0e1Var2 = m0e1Var3;
                                    map2 = map3;
                                    i23 = i26;
                                    z4 = z8;
                                    i22 = i29;
                                }
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            i30 = i28;
                            z7 = z6;
                            boolean zR4 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var7 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i310 = i13 << 6;
                                d(qim0Var, af5Var7, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i310) | (29360128 & i310) | (234881024 & i310) | (i310 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var8 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311 = i13 << 6;
                                d(qim0Var, af5Var8, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311) | (29360128 & i311) | (234881024 & i311) | (i311 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        } else {
                            b0kVar2.b0();
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            map2 = map;
                            x9hVar2 = x9hVar;
                            m0e1Var2 = m0e1Var;
                            z4 = z2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i13 |= 100663296;
                    i16 = i5 & 512;
                    if (i16 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (b0kVar2.i(x9hVar)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i13 |= i17;
                        }
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if (b0kVar2.g(m0e1Var)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                        }
                        i21 = 0;
                        if ((i13 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (b0kVar2.Y(i13 & 1, z3)) {
                            if (i31 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i;
                            }
                            if (i7 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i9 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i2;
                            }
                            if (i11 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i3;
                            }
                            if (i14 != 0) {
                                int i312 = i20;
                                map3 = b7x.a;
                                i28 = i312;
                            } else {
                                i28 = i20;
                                map3 = map;
                            }
                            if (i16 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i19 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i27, i26);
                            pze0.m(b0kVar2.k(h061.a));
                            b0kVar2.i0(1588900273);
                            b0kVar2.r(false);
                            mmr0 mmr0Var3 = df5.a;
                            length = af5Var.b.length();
                            list = af5Var.a;
                            if (list != null) {
                                size = list.size();
                                while (true) {
                                    if (i21 < size) {
                                        ze5Var = (ze5) list.get(i21);
                                        i30 = i28;
                                        if (ze5Var.a instanceof qgc1) {
                                            i29 = i25;
                                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                    z7 = true;
                                                }
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                        z6 = false;
                                    }
                                    boolean zR5 = f2p1.r(af5Var);
                                    f930Var = (f930) b0kVar2.k(t4k.k);
                                    if (z7) {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var9 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i313 = i13 << 6;
                                        d(qim0Var, af5Var9, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i313) | (29360128 & i313) | (234881024 & i313) | (i313 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    } else {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var10 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i314 = i13 << 6;
                                        d(qim0Var, af5Var10, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i314) | (29360128 & i314) | (234881024 & i314) | (i314 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    }
                                    i24 = i27;
                                    x9hVar2 = x9hVar3;
                                    m0e1Var2 = m0e1Var3;
                                    map2 = map3;
                                    i23 = i26;
                                    z4 = z8;
                                    i22 = i29;
                                }
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            i30 = i28;
                            z7 = z6;
                            boolean zR6 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i315 = i13 << 6;
                                d(qim0Var, af5Var11, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i315) | (29360128 & i315) | (234881024 & i315) | (i315 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var12 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i316 = i13 << 6;
                                d(qim0Var, af5Var12, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i316) | (29360128 & i316) | (234881024 & i316) | (i316 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        } else {
                            b0kVar2.b0();
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            map2 = map;
                            x9hVar2 = x9hVar;
                            m0e1Var2 = m0e1Var;
                            z4 = z2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i13 |= 805306368;
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i317 = i20;
                            map3 = b7x.a;
                            i28 = i317;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var4 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR7 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var13 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i318 = i13 << 6;
                                    d(qim0Var, af5Var13, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i318) | (29360128 & i318) | (234881024 & i318) | (i318 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var14 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i319 = i13 << 6;
                                    d(qim0Var, af5Var14, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i319) | (29360128 & i319) | (234881024 & i319) | (i319 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR8 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var15 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3110 = i13 << 6;
                            d(qim0Var, af5Var15, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3110) | (29360128 & i3110) | (234881024 & i3110) | (i3110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var16 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111 = i13 << 6;
                            d(qim0Var, af5Var16, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111) | (29360128 & i3111) | (234881024 & i3111) | (i3111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i13 = i6;
                i14 = i5 & 256;
                if (i14 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (b0kVar2.i(map)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i13 |= i15;
                    }
                    i16 = i5 & 512;
                    if (i16 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (b0kVar2.i(x9hVar)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i13 |= i17;
                        }
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if (b0kVar2.g(m0e1Var)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                        }
                        i21 = 0;
                        if ((i13 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (b0kVar2.Y(i13 & 1, z3)) {
                            if (i31 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i;
                            }
                            if (i7 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i9 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i2;
                            }
                            if (i11 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i3;
                            }
                            if (i14 != 0) {
                                int i3112 = i20;
                                map3 = b7x.a;
                                i28 = i3112;
                            } else {
                                i28 = i20;
                                map3 = map;
                            }
                            if (i16 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i19 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i27, i26);
                            pze0.m(b0kVar2.k(h061.a));
                            b0kVar2.i0(1588900273);
                            b0kVar2.r(false);
                            mmr0 mmr0Var5 = df5.a;
                            length = af5Var.b.length();
                            list = af5Var.a;
                            if (list != null) {
                                size = list.size();
                                while (true) {
                                    if (i21 < size) {
                                        ze5Var = (ze5) list.get(i21);
                                        i30 = i28;
                                        if (ze5Var.a instanceof qgc1) {
                                            i29 = i25;
                                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                    z7 = true;
                                                }
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                        z6 = false;
                                    }
                                    boolean zR9 = f2p1.r(af5Var);
                                    f930Var = (f930) b0kVar2.k(t4k.k);
                                    if (z7) {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var17 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i3113 = i13 << 6;
                                        d(qim0Var, af5Var17, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3113) | (29360128 & i3113) | (234881024 & i3113) | (i3113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    } else {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var18 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i3114 = i13 << 6;
                                        d(qim0Var, af5Var18, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3114) | (29360128 & i3114) | (234881024 & i3114) | (i3114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    }
                                    i24 = i27;
                                    x9hVar2 = x9hVar3;
                                    m0e1Var2 = m0e1Var3;
                                    map2 = map3;
                                    i23 = i26;
                                    z4 = z8;
                                    i22 = i29;
                                }
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            i30 = i28;
                            z7 = z6;
                            boolean zR10 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var19 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3115 = i13 << 6;
                                d(qim0Var, af5Var19, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3115) | (29360128 & i3115) | (234881024 & i3115) | (i3115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var110 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3116 = i13 << 6;
                                d(qim0Var, af5Var110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3116) | (29360128 & i3116) | (234881024 & i3116) | (i3116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        } else {
                            b0kVar2.b0();
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            map2 = map;
                            x9hVar2 = x9hVar;
                            m0e1Var2 = m0e1Var;
                            z4 = z2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i13 |= 805306368;
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i3117 = i20;
                            map3 = b7x.a;
                            i28 = i3117;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var6 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR11 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var111 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3118 = i13 << 6;
                                    d(qim0Var, af5Var111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3118) | (29360128 & i3118) | (234881024 & i3118) | (i3118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var112 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3119 = i13 << 6;
                                    d(qim0Var, af5Var112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3119) | (29360128 & i3119) | (234881024 & i3119) | (i3119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR12 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var113 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31110 = i13 << 6;
                            d(qim0Var, af5Var113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31110) | (29360128 & i31110) | (234881024 & i31110) | (i31110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var114 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111 = i13 << 6;
                            d(qim0Var, af5Var114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111) | (29360128 & i31111) | (234881024 & i31111) | (i31111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 100663296;
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i31112 = i20;
                            map3 = b7x.a;
                            i28 = i31112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var7 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR13 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var115 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31113 = i13 << 6;
                                    d(qim0Var, af5Var115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31113) | (29360128 & i31113) | (234881024 & i31113) | (i31113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var116 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31114 = i13 << 6;
                                    d(qim0Var, af5Var116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31114) | (29360128 & i31114) | (234881024 & i31114) | (i31114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR14 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var117 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31115 = i13 << 6;
                            d(qim0Var, af5Var117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31115) | (29360128 & i31115) | (234881024 & i31115) | (i31115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var118 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31116 = i13 << 6;
                            d(qim0Var, af5Var118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31116) | (29360128 & i31116) | (234881024 & i31116) | (i31116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i31117 = i20;
                        map3 = b7x.a;
                        i28 = i31117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var8 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR15 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var119 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31118 = i13 << 6;
                                d(qim0Var, af5Var119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31118) | (29360128 & i31118) | (234881024 & i31118) | (i31118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1110 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31119 = i13 << 6;
                                d(qim0Var, af5Var1110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31119) | (29360128 & i31119) | (234881024 & i31119) | (i31119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR16 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311110 = i13 << 6;
                        d(qim0Var, af5Var1111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311110) | (29360128 & i311110) | (234881024 & i311110) | (i311110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1112 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111 = i13 << 6;
                        d(qim0Var, af5Var1112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111) | (29360128 & i311111) | (234881024 & i311111) | (i311111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 196608;
            z2 = z;
            i9 = i5 & 64;
            if (i9 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (b0kVar2.e(i2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i6 |= i10;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                if ((i4 & 12582912) == 0) {
                    int i320 = i6;
                    if (b0kVar2.e(i3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i13 = i320 | i12;
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (b0kVar2.i(map)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i13 |= i15;
                    }
                    i16 = i5 & 512;
                    if (i16 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (b0kVar2.i(x9hVar)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i13 |= i17;
                        }
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if (b0kVar2.g(m0e1Var)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                        }
                        i21 = 0;
                        if ((i13 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (b0kVar2.Y(i13 & 1, z3)) {
                            if (i31 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i;
                            }
                            if (i7 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i9 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i2;
                            }
                            if (i11 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i3;
                            }
                            if (i14 != 0) {
                                int i311112 = i20;
                                map3 = b7x.a;
                                i28 = i311112;
                            } else {
                                i28 = i20;
                                map3 = map;
                            }
                            if (i16 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i19 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i27, i26);
                            pze0.m(b0kVar2.k(h061.a));
                            b0kVar2.i0(1588900273);
                            b0kVar2.r(false);
                            mmr0 mmr0Var9 = df5.a;
                            length = af5Var.b.length();
                            list = af5Var.a;
                            if (list != null) {
                                size = list.size();
                                while (true) {
                                    if (i21 < size) {
                                        ze5Var = (ze5) list.get(i21);
                                        i30 = i28;
                                        if (ze5Var.a instanceof qgc1) {
                                            i29 = i25;
                                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                    z7 = true;
                                                }
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                        z6 = false;
                                    }
                                    boolean zR17 = f2p1.r(af5Var);
                                    f930Var = (f930) b0kVar2.k(t4k.k);
                                    if (z7) {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var1113 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i311113 = i13 << 6;
                                        d(qim0Var, af5Var1113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311113) | (29360128 & i311113) | (234881024 & i311113) | (i311113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    } else {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var1114 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i311114 = i13 << 6;
                                        d(qim0Var, af5Var1114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311114) | (29360128 & i311114) | (234881024 & i311114) | (i311114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    }
                                    i24 = i27;
                                    x9hVar2 = x9hVar3;
                                    m0e1Var2 = m0e1Var3;
                                    map2 = map3;
                                    i23 = i26;
                                    z4 = z8;
                                    i22 = i29;
                                }
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            i30 = i28;
                            z7 = z6;
                            boolean zR18 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1115 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311115 = i13 << 6;
                                d(qim0Var, af5Var1115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311115) | (29360128 & i311115) | (234881024 & i311115) | (i311115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1116 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311116 = i13 << 6;
                                d(qim0Var, af5Var1116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311116) | (29360128 & i311116) | (234881024 & i311116) | (i311116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        } else {
                            b0kVar2.b0();
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            map2 = map;
                            x9hVar2 = x9hVar;
                            m0e1Var2 = m0e1Var;
                            z4 = z2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i13 |= 805306368;
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i311117 = i20;
                            map3 = b7x.a;
                            i28 = i311117;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var10 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR19 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var1117 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i311118 = i13 << 6;
                                    d(qim0Var, af5Var1117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311118) | (29360128 & i311118) | (234881024 & i311118) | (i311118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var1118 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i311119 = i13 << 6;
                                    d(qim0Var, af5Var1118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311119) | (29360128 & i311119) | (234881024 & i311119) | (i311119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR110 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1119 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111110 = i13 << 6;
                            d(qim0Var, af5Var1119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111110) | (29360128 & i3111110) | (234881024 & i3111110) | (i3111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11110 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111111 = i13 << 6;
                            d(qim0Var, af5Var11110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111) | (29360128 & i3111111) | (234881024 & i3111111) | (i3111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 100663296;
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i3111112 = i20;
                            map3 = b7x.a;
                            i28 = i3111112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var11 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR111 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11111 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3111113 = i13 << 6;
                                    d(qim0Var, af5Var11111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111113) | (29360128 & i3111113) | (234881024 & i3111113) | (i3111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11112 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3111114 = i13 << 6;
                                    d(qim0Var, af5Var11112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111114) | (29360128 & i3111114) | (234881024 & i3111114) | (i3111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR112 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11113 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111115 = i13 << 6;
                            d(qim0Var, af5Var11113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111115) | (29360128 & i3111115) | (234881024 & i3111115) | (i3111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11114 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111116 = i13 << 6;
                            d(qim0Var, af5Var11114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111116) | (29360128 & i3111116) | (234881024 & i3111116) | (i3111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i3111117 = i20;
                        map3 = b7x.a;
                        i28 = i3111117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var12 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR113 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11115 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111118 = i13 << 6;
                                d(qim0Var, af5Var11115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111118) | (29360128 & i3111118) | (234881024 & i3111118) | (i3111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11116 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111119 = i13 << 6;
                                d(qim0Var, af5Var11116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111119) | (29360128 & i3111119) | (234881024 & i3111119) | (i3111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR114 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11117 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i31111110 = i13 << 6;
                        d(qim0Var, af5Var11117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111110) | (29360128 & i31111110) | (234881024 & i31111110) | (i31111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11118 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i31111111 = i13 << 6;
                        d(qim0Var, af5Var11118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111) | (29360128 & i31111111) | (234881024 & i31111111) | (i31111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i13 = i6;
            i14 = i5 & 256;
            if (i14 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (b0kVar2.i(map)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i13 |= i15;
                }
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i31111112 = i20;
                            map3 = b7x.a;
                            i28 = i31111112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var13 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR115 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11119 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111113 = i13 << 6;
                                    d(qim0Var, af5Var11119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111113) | (29360128 & i31111113) | (234881024 & i31111113) | (i31111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var111110 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111114 = i13 << 6;
                                    d(qim0Var, af5Var111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111114) | (29360128 & i31111114) | (234881024 & i31111114) | (i31111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR116 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111115 = i13 << 6;
                            d(qim0Var, af5Var111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111115) | (29360128 & i31111115) | (234881024 & i31111115) | (i31111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111112 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111116 = i13 << 6;
                            d(qim0Var, af5Var111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111116) | (29360128 & i31111116) | (234881024 & i31111116) | (i31111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i31111117 = i20;
                        map3 = b7x.a;
                        i28 = i31111117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var14 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR117 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111113 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111118 = i13 << 6;
                                d(qim0Var, af5Var111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111118) | (29360128 & i31111118) | (234881024 & i31111118) | (i31111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111114 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111119 = i13 << 6;
                                d(qim0Var, af5Var111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111119) | (29360128 & i31111119) | (234881024 & i31111119) | (i31111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR118 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111115 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111110 = i13 << 6;
                        d(qim0Var, af5Var111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111110) | (29360128 & i311111110) | (234881024 & i311111110) | (i311111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111116 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111 = i13 << 6;
                        d(qim0Var, af5Var111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111) | (29360128 & i311111111) | (234881024 & i311111111) | (i311111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 100663296;
            i16 = i5 & 512;
            if (i16 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (b0kVar2.i(x9hVar)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i13 |= i17;
                }
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i311111112 = i20;
                        map3 = b7x.a;
                        i28 = i311111112;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var15 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR119 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111117 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111113 = i13 << 6;
                                d(qim0Var, af5Var111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111113) | (29360128 & i311111113) | (234881024 & i311111113) | (i311111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111118 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111114 = i13 << 6;
                                d(qim0Var, af5Var111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111114) | (29360128 & i311111114) | (234881024 & i311111114) | (i311111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR1110 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111119 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111115 = i13 << 6;
                        d(qim0Var, af5Var111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111115) | (29360128 & i311111115) | (234881024 & i311111115) | (i311111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111110 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111116 = i13 << 6;
                        d(qim0Var, af5Var1111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111116) | (29360128 & i311111116) | (234881024 & i311111116) | (i311111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 805306368;
            i18 = i5 & 1024;
            if (i18 != 0) {
                i20 = 6;
                i19 = i18;
            } else {
                i19 = i18;
                if (b0kVar2.g(m0e1Var)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
            }
            i21 = 0;
            if ((i13 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar2.Y(i13 & 1, z3)) {
                if (i31 != 0) {
                    i25 = 1;
                } else {
                    i25 = i;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i2;
                }
                if (i11 != 0) {
                    i27 = 1;
                } else {
                    i27 = i3;
                }
                if (i14 != 0) {
                    int i311111117 = i20;
                    map3 = b7x.a;
                    i28 = i311111117;
                } else {
                    i28 = i20;
                    map3 = map;
                }
                if (i16 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i19 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i27, i26);
                pze0.m(b0kVar2.k(h061.a));
                b0kVar2.i0(1588900273);
                b0kVar2.r(false);
                mmr0 mmr0Var16 = df5.a;
                length = af5Var.b.length();
                list = af5Var.a;
                if (list != null) {
                    size = list.size();
                    while (true) {
                        if (i21 < size) {
                            ze5Var = (ze5) list.get(i21);
                            i30 = i28;
                            if (ze5Var.a instanceof qgc1) {
                                i29 = i25;
                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                        z7 = true;
                                    }
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        boolean zR1111 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111118 = i13 << 6;
                            d(qim0Var, af5Var1111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111118) | (29360128 & i311111118) | (234881024 & i311111118) | (i311111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111112 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111119 = i13 << 6;
                            d(qim0Var, af5Var1111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111119) | (29360128 & i311111119) | (234881024 & i311111119) | (i311111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    }
                } else {
                    i29 = i25;
                    z6 = false;
                }
                i30 = i28;
                z7 = z6;
                boolean zR1112 = f2p1.r(af5Var);
                f930Var = (f930) b0kVar2.k(t4k.k);
                if (z7) {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111113 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i3111111110 = i13 << 6;
                    d(qim0Var, af5Var1111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111110) | (29360128 & i3111111110) | (234881024 & i3111111110) | (i3111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                } else {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111114 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i3111111111 = i13 << 6;
                    d(qim0Var, af5Var1111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111) | (29360128 & i3111111111) | (234881024 & i3111111111) | (i3111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                }
                i24 = i27;
                x9hVar2 = x9hVar3;
                m0e1Var2 = m0e1Var3;
                map2 = map3;
                i23 = i26;
                z4 = z8;
                i22 = i29;
            } else {
                b0kVar2.b0();
                i22 = i;
                i23 = i2;
                i24 = i3;
                map2 = map;
                x9hVar2 = x9hVar;
                m0e1Var2 = m0e1Var;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 24576;
        i7 = i5 & 32;
        if (i7 != 0) {
            if ((196608 & i4) == 0) {
                z2 = z;
                if (b0kVar2.h(z2)) {
                    i8 = 131072;
                } else {
                    i8 = 65536;
                }
                i6 |= i8;
            }
            i9 = i5 & 64;
            if (i9 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (b0kVar2.e(i2)) {
                    i10 = 1048576;
                } else {
                    i10 = 524288;
                }
                i6 |= i10;
            }
            i11 = i5 & 128;
            if (i11 != 0) {
                if ((i4 & 12582912) == 0) {
                    int i321 = i6;
                    if (b0kVar2.e(i3)) {
                        i12 = 8388608;
                    } else {
                        i12 = 4194304;
                    }
                    i13 = i321 | i12;
                }
                i14 = i5 & 256;
                if (i14 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (b0kVar2.i(map)) {
                            i15 = 67108864;
                        } else {
                            i15 = 33554432;
                        }
                        i13 |= i15;
                    }
                    i16 = i5 & 512;
                    if (i16 != 0) {
                        if ((i4 & 805306368) == 0) {
                            if (b0kVar2.i(x9hVar)) {
                                i17 = 536870912;
                            } else {
                                i17 = 268435456;
                            }
                            i13 |= i17;
                        }
                        i18 = i5 & 1024;
                        if (i18 != 0) {
                            i20 = 6;
                            i19 = i18;
                        } else {
                            i19 = i18;
                            if (b0kVar2.g(m0e1Var)) {
                                i20 = 4;
                            } else {
                                i20 = 2;
                            }
                        }
                        i21 = 0;
                        if ((i13 & 306783379) == 306783378) {
                            z3 = true;
                        } else {
                            z3 = true;
                        }
                        if (b0kVar2.Y(i13 & 1, z3)) {
                            if (i31 != 0) {
                                i25 = 1;
                            } else {
                                i25 = i;
                            }
                            if (i7 != 0) {
                                z5 = true;
                            } else {
                                z5 = z2;
                            }
                            if (i9 != 0) {
                                i26 = Integer.MAX_VALUE;
                            } else {
                                i26 = i2;
                            }
                            if (i11 != 0) {
                                i27 = 1;
                            } else {
                                i27 = i3;
                            }
                            if (i14 != 0) {
                                int i3111111112 = i20;
                                map3 = b7x.a;
                                i28 = i3111111112;
                            } else {
                                i28 = i20;
                                map3 = map;
                            }
                            if (i16 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i19 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i27, i26);
                            pze0.m(b0kVar2.k(h061.a));
                            b0kVar2.i0(1588900273);
                            b0kVar2.r(false);
                            mmr0 mmr0Var17 = df5.a;
                            length = af5Var.b.length();
                            list = af5Var.a;
                            if (list != null) {
                                size = list.size();
                                while (true) {
                                    if (i21 < size) {
                                        ze5Var = (ze5) list.get(i21);
                                        i30 = i28;
                                        if (ze5Var.a instanceof qgc1) {
                                            i29 = i25;
                                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                    z7 = true;
                                                }
                                            }
                                            i21++;
                                            i28 = i30;
                                            i25 = i29;
                                        } else {
                                            i29 = i25;
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                        z6 = false;
                                    }
                                    boolean zR1113 = f2p1.r(af5Var);
                                    f930Var = (f930) b0kVar2.k(t4k.k);
                                    if (z7) {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var1111115 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i3111111113 = i13 << 6;
                                        d(qim0Var, af5Var1111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111113) | (29360128 & i3111111113) | (234881024 & i3111111113) | (i3111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    } else {
                                        z8 = z5;
                                        b0kVar2.i0(1590195670);
                                        if ((i13 & 14) == 4) {
                                            z9 = true;
                                        } else {
                                            z9 = false;
                                        }
                                        objT = b0kVar2.T();
                                        if (z9) {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        } else {
                                            objT = xto.t(af5Var);
                                            b0kVar2.s0(objT);
                                        }
                                        ven0Var = (ven0) objT;
                                        af5 af5Var1111116 = (af5) ven0Var.getValue();
                                        zG = b0kVar2.g(ven0Var);
                                        objT2 = b0kVar2.T();
                                        if (zG) {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        } else {
                                            objT2 = new g45(ven0Var, (byte) 2);
                                            b0kVar2.s0(objT2);
                                        }
                                        int i3111111114 = i13 << 6;
                                        d(qim0Var, af5Var1111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111114) | (29360128 & i3111111114) | (234881024 & i3111111114) | (i3111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                        b0kVar2.r(false);
                                    }
                                    i24 = i27;
                                    x9hVar2 = x9hVar3;
                                    m0e1Var2 = m0e1Var3;
                                    map2 = map3;
                                    i23 = i26;
                                    z4 = z8;
                                    i22 = i29;
                                }
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            i30 = i28;
                            z7 = z6;
                            boolean zR1114 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1111117 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111115 = i13 << 6;
                                d(qim0Var, af5Var1111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111115) | (29360128 & i3111111115) | (234881024 & i3111111115) | (i3111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1111118 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111116 = i13 << 6;
                                d(qim0Var, af5Var1111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111116) | (29360128 & i3111111116) | (234881024 & i3111111116) | (i3111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        } else {
                            b0kVar2.b0();
                            i22 = i;
                            i23 = i2;
                            i24 = i3;
                            map2 = map;
                            x9hVar2 = x9hVar;
                            m0e1Var2 = m0e1Var;
                            z4 = z2;
                        }
                        h311VarV = b0kVar2.v();
                        if (h311VarV != null) {
                            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i13 |= 805306368;
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i3111111117 = i20;
                            map3 = b7x.a;
                            i28 = i3111111117;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var18 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR1115 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var1111119 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3111111118 = i13 << 6;
                                    d(qim0Var, af5Var1111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111118) | (29360128 & i3111111118) | (234881024 & i3111111118) | (i3111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11111110 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i3111111119 = i13 << 6;
                                    d(qim0Var, af5Var11111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111119) | (29360128 & i3111111119) | (234881024 & i3111111119) | (i3111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR1116 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111111 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111110 = i13 << 6;
                            d(qim0Var, af5Var11111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111110) | (29360128 & i31111111110) | (234881024 & i31111111110) | (i31111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111112 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111111 = i13 << 6;
                            d(qim0Var, af5Var11111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111) | (29360128 & i31111111111) | (234881024 & i31111111111) | (i31111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 100663296;
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i31111111112 = i20;
                            map3 = b7x.a;
                            i28 = i31111111112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var19 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR1117 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11111113 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111111113 = i13 << 6;
                                    d(qim0Var, af5Var11111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111113) | (29360128 & i31111111113) | (234881024 & i31111111113) | (i31111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var11111114 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111111114 = i13 << 6;
                                    d(qim0Var, af5Var11111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111114) | (29360128 & i31111111114) | (234881024 & i31111111114) | (i31111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR1118 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111115 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111115 = i13 << 6;
                            d(qim0Var, af5Var11111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111115) | (29360128 & i31111111115) | (234881024 & i31111111115) | (i31111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111116 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111116 = i13 << 6;
                            d(qim0Var, af5Var11111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111116) | (29360128 & i31111111116) | (234881024 & i31111111116) | (i31111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i31111111117 = i20;
                        map3 = b7x.a;
                        i28 = i31111111117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var110 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR1119 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111117 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111111118 = i13 << 6;
                                d(qim0Var, af5Var11111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111118) | (29360128 & i31111111118) | (234881024 & i31111111118) | (i31111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111118 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111111119 = i13 << 6;
                                d(qim0Var, af5Var11111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111119) | (29360128 & i31111111119) | (234881024 & i31111111119) | (i31111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR11110 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11111119 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111110 = i13 << 6;
                        d(qim0Var, af5Var11111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111110) | (29360128 & i311111111110) | (234881024 & i311111111110) | (i311111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111111110 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111111 = i13 << 6;
                        d(qim0Var, af5Var111111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111) | (29360128 & i311111111111) | (234881024 & i311111111111) | (i311111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i13 = i6;
            i14 = i5 & 256;
            if (i14 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (b0kVar2.i(map)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i13 |= i15;
                }
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i311111111112 = i20;
                            map3 = b7x.a;
                            i28 = i311111111112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var111 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR11111 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var111111111 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i311111111113 = i13 << 6;
                                    d(qim0Var, af5Var111111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111113) | (29360128 & i311111111113) | (234881024 & i311111111113) | (i311111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var111111112 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i311111111114 = i13 << 6;
                                    d(qim0Var, af5Var111111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111114) | (29360128 & i311111111114) | (234881024 & i311111111114) | (i311111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR11112 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111113 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111111115 = i13 << 6;
                            d(qim0Var, af5Var111111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111115) | (29360128 & i311111111115) | (234881024 & i311111111115) | (i311111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111114 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111111116 = i13 << 6;
                            d(qim0Var, af5Var111111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111116) | (29360128 & i311111111116) | (234881024 & i311111111116) | (i311111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i311111111117 = i20;
                        map3 = b7x.a;
                        i28 = i311111111117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var112 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR11113 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111111115 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111111118 = i13 << 6;
                                d(qim0Var, af5Var111111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111118) | (29360128 & i311111111118) | (234881024 & i311111111118) | (i311111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111111116 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111111119 = i13 << 6;
                                d(qim0Var, af5Var111111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111119) | (29360128 & i311111111119) | (234881024 & i311111111119) | (i311111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR11114 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111111117 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111110 = i13 << 6;
                        d(qim0Var, af5Var111111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111110) | (29360128 & i3111111111110) | (234881024 & i3111111111110) | (i3111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111111118 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111111 = i13 << 6;
                        d(qim0Var, af5Var111111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111) | (29360128 & i3111111111111) | (234881024 & i3111111111111) | (i3111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 100663296;
            i16 = i5 & 512;
            if (i16 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (b0kVar2.i(x9hVar)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i13 |= i17;
                }
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i3111111111112 = i20;
                        map3 = b7x.a;
                        i28 = i3111111111112;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var113 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR11115 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111111119 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111111113 = i13 << 6;
                                d(qim0Var, af5Var111111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111113) | (29360128 & i3111111111113) | (234881024 & i3111111111113) | (i3111111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var1111111110 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111111114 = i13 << 6;
                                d(qim0Var, af5Var1111111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111114) | (29360128 & i3111111111114) | (234881024 & i3111111111114) | (i3111111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR11116 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111111111 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111115 = i13 << 6;
                        d(qim0Var, af5Var1111111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111115) | (29360128 & i3111111111115) | (234881024 & i3111111111115) | (i3111111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111111112 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111116 = i13 << 6;
                        d(qim0Var, af5Var1111111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111116) | (29360128 & i3111111111116) | (234881024 & i3111111111116) | (i3111111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 805306368;
            i18 = i5 & 1024;
            if (i18 != 0) {
                i20 = 6;
                i19 = i18;
            } else {
                i19 = i18;
                if (b0kVar2.g(m0e1Var)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
            }
            i21 = 0;
            if ((i13 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar2.Y(i13 & 1, z3)) {
                if (i31 != 0) {
                    i25 = 1;
                } else {
                    i25 = i;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i2;
                }
                if (i11 != 0) {
                    i27 = 1;
                } else {
                    i27 = i3;
                }
                if (i14 != 0) {
                    int i3111111111117 = i20;
                    map3 = b7x.a;
                    i28 = i3111111111117;
                } else {
                    i28 = i20;
                    map3 = map;
                }
                if (i16 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i19 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i27, i26);
                pze0.m(b0kVar2.k(h061.a));
                b0kVar2.i0(1588900273);
                b0kVar2.r(false);
                mmr0 mmr0Var114 = df5.a;
                length = af5Var.b.length();
                list = af5Var.a;
                if (list != null) {
                    size = list.size();
                    while (true) {
                        if (i21 < size) {
                            ze5Var = (ze5) list.get(i21);
                            i30 = i28;
                            if (ze5Var.a instanceof qgc1) {
                                i29 = i25;
                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                        z7 = true;
                                    }
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        boolean zR11117 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111113 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111111111118 = i13 << 6;
                            d(qim0Var, af5Var1111111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111118) | (29360128 & i3111111111118) | (234881024 & i3111111111118) | (i3111111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111114 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111111111119 = i13 << 6;
                            d(qim0Var, af5Var1111111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111119) | (29360128 & i3111111111119) | (234881024 & i3111111111119) | (i3111111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    }
                } else {
                    i29 = i25;
                    z6 = false;
                }
                i30 = i28;
                z7 = z6;
                boolean zR11118 = f2p1.r(af5Var);
                f930Var = (f930) b0kVar2.k(t4k.k);
                if (z7) {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111111115 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111110 = i13 << 6;
                    d(qim0Var, af5Var1111111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111110) | (29360128 & i31111111111110) | (234881024 & i31111111111110) | (i31111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                } else {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111111116 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111111 = i13 << 6;
                    d(qim0Var, af5Var1111111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111) | (29360128 & i31111111111111) | (234881024 & i31111111111111) | (i31111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                }
                i24 = i27;
                x9hVar2 = x9hVar3;
                m0e1Var2 = m0e1Var3;
                map2 = map3;
                i23 = i26;
                z4 = z8;
                i22 = i29;
            } else {
                b0kVar2.b0();
                i22 = i;
                i23 = i2;
                i24 = i3;
                map2 = map;
                x9hVar2 = x9hVar;
                m0e1Var2 = m0e1Var;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 196608;
        z2 = z;
        i9 = i5 & 64;
        if (i9 != 0) {
            i6 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            if (b0kVar2.e(i2)) {
                i10 = 1048576;
            } else {
                i10 = 524288;
            }
            i6 |= i10;
        }
        i11 = i5 & 128;
        if (i11 != 0) {
            if ((i4 & 12582912) == 0) {
                int i322 = i6;
                if (b0kVar2.e(i3)) {
                    i12 = 8388608;
                } else {
                    i12 = 4194304;
                }
                i13 = i322 | i12;
            }
            i14 = i5 & 256;
            if (i14 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (b0kVar2.i(map)) {
                        i15 = 67108864;
                    } else {
                        i15 = 33554432;
                    }
                    i13 |= i15;
                }
                i16 = i5 & 512;
                if (i16 != 0) {
                    if ((i4 & 805306368) == 0) {
                        if (b0kVar2.i(x9hVar)) {
                            i17 = 536870912;
                        } else {
                            i17 = 268435456;
                        }
                        i13 |= i17;
                    }
                    i18 = i5 & 1024;
                    if (i18 != 0) {
                        i20 = 6;
                        i19 = i18;
                    } else {
                        i19 = i18;
                        if (b0kVar2.g(m0e1Var)) {
                            i20 = 4;
                        } else {
                            i20 = 2;
                        }
                    }
                    i21 = 0;
                    if ((i13 & 306783379) == 306783378) {
                        z3 = true;
                    } else {
                        z3 = true;
                    }
                    if (b0kVar2.Y(i13 & 1, z3)) {
                        if (i31 != 0) {
                            i25 = 1;
                        } else {
                            i25 = i;
                        }
                        if (i7 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i9 != 0) {
                            i26 = Integer.MAX_VALUE;
                        } else {
                            i26 = i2;
                        }
                        if (i11 != 0) {
                            i27 = 1;
                        } else {
                            i27 = i3;
                        }
                        if (i14 != 0) {
                            int i31111111111112 = i20;
                            map3 = b7x.a;
                            i28 = i31111111111112;
                        } else {
                            i28 = i20;
                            map3 = map;
                        }
                        if (i16 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i19 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i27, i26);
                        pze0.m(b0kVar2.k(h061.a));
                        b0kVar2.i0(1588900273);
                        b0kVar2.r(false);
                        mmr0 mmr0Var115 = df5.a;
                        length = af5Var.b.length();
                        list = af5Var.a;
                        if (list != null) {
                            size = list.size();
                            while (true) {
                                if (i21 < size) {
                                    ze5Var = (ze5) list.get(i21);
                                    i30 = i28;
                                    if (ze5Var.a instanceof qgc1) {
                                        i29 = i25;
                                        if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                            if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                                z7 = true;
                                            }
                                        }
                                        i21++;
                                        i28 = i30;
                                        i25 = i29;
                                    } else {
                                        i29 = i25;
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                    z6 = false;
                                }
                                boolean zR11119 = f2p1.r(af5Var);
                                f930Var = (f930) b0kVar2.k(t4k.k);
                                if (z7) {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var1111111117 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111111111113 = i13 << 6;
                                    d(qim0Var, af5Var1111111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111113) | (29360128 & i31111111111113) | (234881024 & i31111111111113) | (i31111111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                } else {
                                    z8 = z5;
                                    b0kVar2.i0(1590195670);
                                    if ((i13 & 14) == 4) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    objT = b0kVar2.T();
                                    if (z9) {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    } else {
                                        objT = xto.t(af5Var);
                                        b0kVar2.s0(objT);
                                    }
                                    ven0Var = (ven0) objT;
                                    af5 af5Var1111111118 = (af5) ven0Var.getValue();
                                    zG = b0kVar2.g(ven0Var);
                                    objT2 = b0kVar2.T();
                                    if (zG) {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    } else {
                                        objT2 = new g45(ven0Var, (byte) 2);
                                        b0kVar2.s0(objT2);
                                    }
                                    int i31111111111114 = i13 << 6;
                                    d(qim0Var, af5Var1111111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111114) | (29360128 & i31111111111114) | (234881024 & i31111111111114) | (i31111111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                    b0kVar2.r(false);
                                }
                                i24 = i27;
                                x9hVar2 = x9hVar3;
                                m0e1Var2 = m0e1Var3;
                                map2 = map3;
                                i23 = i26;
                                z4 = z8;
                                i22 = i29;
                            }
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        i30 = i28;
                        z7 = z6;
                        boolean zR111110 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111119 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111111115 = i13 << 6;
                            d(qim0Var, af5Var1111111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111115) | (29360128 & i31111111111115) | (234881024 & i31111111111115) | (i31111111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111111110 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111111116 = i13 << 6;
                            d(qim0Var, af5Var11111111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111116) | (29360128 & i31111111111116) | (234881024 & i31111111111116) | (i31111111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    } else {
                        b0kVar2.b0();
                        i22 = i;
                        i23 = i2;
                        i24 = i3;
                        map2 = map;
                        x9hVar2 = x9hVar;
                        m0e1Var2 = m0e1Var;
                        z4 = z2;
                    }
                    h311VarV = b0kVar2.v();
                    if (h311VarV != null) {
                        h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i13 |= 805306368;
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i31111111111117 = i20;
                        map3 = b7x.a;
                        i28 = i31111111111117;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var116 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR111111 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111111111 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111111111118 = i13 << 6;
                                d(qim0Var, af5Var11111111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111118) | (29360128 & i31111111111118) | (234881024 & i31111111111118) | (i31111111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111111112 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i31111111111119 = i13 << 6;
                                d(qim0Var, af5Var11111111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111119) | (29360128 & i31111111111119) | (234881024 & i31111111111119) | (i31111111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR111112 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11111111113 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111111110 = i13 << 6;
                        d(qim0Var, af5Var11111111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111110) | (29360128 & i311111111111110) | (234881024 & i311111111111110) | (i311111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11111111114 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111111111 = i13 << 6;
                        d(qim0Var, af5Var11111111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111111) | (29360128 & i311111111111111) | (234881024 & i311111111111111) | (i311111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 100663296;
            i16 = i5 & 512;
            if (i16 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (b0kVar2.i(x9hVar)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i13 |= i17;
                }
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i311111111111112 = i20;
                        map3 = b7x.a;
                        i28 = i311111111111112;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var117 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR111113 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111111115 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111111111113 = i13 << 6;
                                d(qim0Var, af5Var11111111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111113) | (29360128 & i311111111111113) | (234881024 & i311111111111113) | (i311111111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var11111111116 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i311111111111114 = i13 << 6;
                                d(qim0Var, af5Var11111111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111114) | (29360128 & i311111111111114) | (234881024 & i311111111111114) | (i311111111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR111114 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11111111117 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111111115 = i13 << 6;
                        d(qim0Var, af5Var11111111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111115) | (29360128 & i311111111111115) | (234881024 & i311111111111115) | (i311111111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var11111111118 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i311111111111116 = i13 << 6;
                        d(qim0Var, af5Var11111111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111116) | (29360128 & i311111111111116) | (234881024 & i311111111111116) | (i311111111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 805306368;
            i18 = i5 & 1024;
            if (i18 != 0) {
                i20 = 6;
                i19 = i18;
            } else {
                i19 = i18;
                if (b0kVar2.g(m0e1Var)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
            }
            i21 = 0;
            if ((i13 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar2.Y(i13 & 1, z3)) {
                if (i31 != 0) {
                    i25 = 1;
                } else {
                    i25 = i;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i2;
                }
                if (i11 != 0) {
                    i27 = 1;
                } else {
                    i27 = i3;
                }
                if (i14 != 0) {
                    int i311111111111117 = i20;
                    map3 = b7x.a;
                    i28 = i311111111111117;
                } else {
                    i28 = i20;
                    map3 = map;
                }
                if (i16 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i19 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i27, i26);
                pze0.m(b0kVar2.k(h061.a));
                b0kVar2.i0(1588900273);
                b0kVar2.r(false);
                mmr0 mmr0Var118 = df5.a;
                length = af5Var.b.length();
                list = af5Var.a;
                if (list != null) {
                    size = list.size();
                    while (true) {
                        if (i21 < size) {
                            ze5Var = (ze5) list.get(i21);
                            i30 = i28;
                            if (ze5Var.a instanceof qgc1) {
                                i29 = i25;
                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                        z7 = true;
                                    }
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        boolean zR111115 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var11111111119 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111111111118 = i13 << 6;
                            d(qim0Var, af5Var11111111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111118) | (29360128 & i311111111111118) | (234881024 & i311111111111118) | (i311111111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111111110 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i311111111111119 = i13 << 6;
                            d(qim0Var, af5Var111111111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111119) | (29360128 & i311111111111119) | (234881024 & i311111111111119) | (i311111111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    }
                } else {
                    i29 = i25;
                    z6 = false;
                }
                i30 = i28;
                z7 = z6;
                boolean zR111116 = f2p1.r(af5Var);
                f930Var = (f930) b0kVar2.k(t4k.k);
                if (z7) {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var111111111111 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i3111111111111110 = i13 << 6;
                    d(qim0Var, af5Var111111111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111110) | (29360128 & i3111111111111110) | (234881024 & i3111111111111110) | (i3111111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                } else {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var111111111112 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i3111111111111111 = i13 << 6;
                    d(qim0Var, af5Var111111111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111111) | (29360128 & i3111111111111111) | (234881024 & i3111111111111111) | (i3111111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                }
                i24 = i27;
                x9hVar2 = x9hVar3;
                m0e1Var2 = m0e1Var3;
                map2 = map3;
                i23 = i26;
                z4 = z8;
                i22 = i29;
            } else {
                b0kVar2.b0();
                i22 = i;
                i23 = i2;
                i24 = i3;
                map2 = map;
                x9hVar2 = x9hVar;
                m0e1Var2 = m0e1Var;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 12582912;
        i13 = i6;
        i14 = i5 & 256;
        if (i14 != 0) {
            if ((i4 & 100663296) == 0) {
                if (b0kVar2.i(map)) {
                    i15 = 67108864;
                } else {
                    i15 = 33554432;
                }
                i13 |= i15;
            }
            i16 = i5 & 512;
            if (i16 != 0) {
                if ((i4 & 805306368) == 0) {
                    if (b0kVar2.i(x9hVar)) {
                        i17 = 536870912;
                    } else {
                        i17 = 268435456;
                    }
                    i13 |= i17;
                }
                i18 = i5 & 1024;
                if (i18 != 0) {
                    i20 = 6;
                    i19 = i18;
                } else {
                    i19 = i18;
                    if (b0kVar2.g(m0e1Var)) {
                        i20 = 4;
                    } else {
                        i20 = 2;
                    }
                }
                i21 = 0;
                if ((i13 & 306783379) == 306783378) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (b0kVar2.Y(i13 & 1, z3)) {
                    if (i31 != 0) {
                        i25 = 1;
                    } else {
                        i25 = i;
                    }
                    if (i7 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i9 != 0) {
                        i26 = Integer.MAX_VALUE;
                    } else {
                        i26 = i2;
                    }
                    if (i11 != 0) {
                        i27 = 1;
                    } else {
                        i27 = i3;
                    }
                    if (i14 != 0) {
                        int i3111111111111112 = i20;
                        map3 = b7x.a;
                        i28 = i3111111111111112;
                    } else {
                        i28 = i20;
                        map3 = map;
                    }
                    if (i16 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i19 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i27, i26);
                    pze0.m(b0kVar2.k(h061.a));
                    b0kVar2.i0(1588900273);
                    b0kVar2.r(false);
                    mmr0 mmr0Var119 = df5.a;
                    length = af5Var.b.length();
                    list = af5Var.a;
                    if (list != null) {
                        size = list.size();
                        while (true) {
                            if (i21 < size) {
                                ze5Var = (ze5) list.get(i21);
                                i30 = i28;
                                if (ze5Var.a instanceof qgc1) {
                                    i29 = i25;
                                    if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                        if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                            z7 = true;
                                        }
                                    }
                                    i21++;
                                    i28 = i30;
                                    i25 = i29;
                                } else {
                                    i29 = i25;
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                                z6 = false;
                            }
                            boolean zR111117 = f2p1.r(af5Var);
                            f930Var = (f930) b0kVar2.k(t4k.k);
                            if (z7) {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111111111113 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111111111113 = i13 << 6;
                                d(qim0Var, af5Var111111111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111113) | (29360128 & i3111111111111113) | (234881024 & i3111111111111113) | (i3111111111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            } else {
                                z8 = z5;
                                b0kVar2.i0(1590195670);
                                if ((i13 & 14) == 4) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                objT = b0kVar2.T();
                                if (z9) {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                } else {
                                    objT = xto.t(af5Var);
                                    b0kVar2.s0(objT);
                                }
                                ven0Var = (ven0) objT;
                                af5 af5Var111111111114 = (af5) ven0Var.getValue();
                                zG = b0kVar2.g(ven0Var);
                                objT2 = b0kVar2.T();
                                if (zG) {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                } else {
                                    objT2 = new g45(ven0Var, (byte) 2);
                                    b0kVar2.s0(objT2);
                                }
                                int i3111111111111114 = i13 << 6;
                                d(qim0Var, af5Var111111111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111114) | (29360128 & i3111111111111114) | (234881024 & i3111111111111114) | (i3111111111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                                b0kVar2.r(false);
                            }
                            i24 = i27;
                            x9hVar2 = x9hVar3;
                            m0e1Var2 = m0e1Var3;
                            map2 = map3;
                            i23 = i26;
                            z4 = z8;
                            i22 = i29;
                        }
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    i30 = i28;
                    z7 = z6;
                    boolean zR111118 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111111111115 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111111115 = i13 << 6;
                        d(qim0Var, af5Var111111111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111115) | (29360128 & i3111111111111115) | (234881024 & i3111111111111115) | (i3111111111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var111111111116 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i3111111111111116 = i13 << 6;
                        d(qim0Var, af5Var111111111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111116) | (29360128 & i3111111111111116) | (234881024 & i3111111111111116) | (i3111111111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                } else {
                    b0kVar2.b0();
                    i22 = i;
                    i23 = i2;
                    i24 = i3;
                    map2 = map;
                    x9hVar2 = x9hVar;
                    m0e1Var2 = m0e1Var;
                    z4 = z2;
                }
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i13 |= 805306368;
            i18 = i5 & 1024;
            if (i18 != 0) {
                i20 = 6;
                i19 = i18;
            } else {
                i19 = i18;
                if (b0kVar2.g(m0e1Var)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
            }
            i21 = 0;
            if ((i13 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar2.Y(i13 & 1, z3)) {
                if (i31 != 0) {
                    i25 = 1;
                } else {
                    i25 = i;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i2;
                }
                if (i11 != 0) {
                    i27 = 1;
                } else {
                    i27 = i3;
                }
                if (i14 != 0) {
                    int i3111111111111117 = i20;
                    map3 = b7x.a;
                    i28 = i3111111111111117;
                } else {
                    i28 = i20;
                    map3 = map;
                }
                if (i16 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i19 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i27, i26);
                pze0.m(b0kVar2.k(h061.a));
                b0kVar2.i0(1588900273);
                b0kVar2.r(false);
                mmr0 mmr0Var1110 = df5.a;
                length = af5Var.b.length();
                list = af5Var.a;
                if (list != null) {
                    size = list.size();
                    while (true) {
                        if (i21 < size) {
                            ze5Var = (ze5) list.get(i21);
                            i30 = i28;
                            if (ze5Var.a instanceof qgc1) {
                                i29 = i25;
                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                        z7 = true;
                                    }
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        boolean zR111119 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111111117 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111111111111118 = i13 << 6;
                            d(qim0Var, af5Var111111111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111118) | (29360128 & i3111111111111118) | (234881024 & i3111111111111118) | (i3111111111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var111111111118 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i3111111111111119 = i13 << 6;
                            d(qim0Var, af5Var111111111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i3111111111111119) | (29360128 & i3111111111111119) | (234881024 & i3111111111111119) | (i3111111111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    }
                } else {
                    i29 = i25;
                    z6 = false;
                }
                i30 = i28;
                z7 = z6;
                boolean zR1111110 = f2p1.r(af5Var);
                f930Var = (f930) b0kVar2.k(t4k.k);
                if (z7) {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var111111111119 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111111110 = i13 << 6;
                    d(qim0Var, af5Var111111111119, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111110) | (29360128 & i31111111111111110) | (234881024 & i31111111111111110) | (i31111111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                } else {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111111111110 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111111111 = i13 << 6;
                    d(qim0Var, af5Var1111111111110, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111111) | (29360128 & i31111111111111111) | (234881024 & i31111111111111111) | (i31111111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                }
                i24 = i27;
                x9hVar2 = x9hVar3;
                m0e1Var2 = m0e1Var3;
                map2 = map3;
                i23 = i26;
                z4 = z8;
                i22 = i29;
            } else {
                b0kVar2.b0();
                i22 = i;
                i23 = i2;
                i24 = i3;
                map2 = map;
                x9hVar2 = x9hVar;
                m0e1Var2 = m0e1Var;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i13 |= 100663296;
        i16 = i5 & 512;
        if (i16 != 0) {
            if ((i4 & 805306368) == 0) {
                if (b0kVar2.i(x9hVar)) {
                    i17 = 536870912;
                } else {
                    i17 = 268435456;
                }
                i13 |= i17;
            }
            i18 = i5 & 1024;
            if (i18 != 0) {
                i20 = 6;
                i19 = i18;
            } else {
                i19 = i18;
                if (b0kVar2.g(m0e1Var)) {
                    i20 = 4;
                } else {
                    i20 = 2;
                }
            }
            i21 = 0;
            if ((i13 & 306783379) == 306783378) {
                z3 = true;
            } else {
                z3 = true;
            }
            if (b0kVar2.Y(i13 & 1, z3)) {
                if (i31 != 0) {
                    i25 = 1;
                } else {
                    i25 = i;
                }
                if (i7 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i9 != 0) {
                    i26 = Integer.MAX_VALUE;
                } else {
                    i26 = i2;
                }
                if (i11 != 0) {
                    i27 = 1;
                } else {
                    i27 = i3;
                }
                if (i14 != 0) {
                    int i31111111111111112 = i20;
                    map3 = b7x.a;
                    i28 = i31111111111111112;
                } else {
                    i28 = i20;
                    map3 = map;
                }
                if (i16 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i19 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i27, i26);
                pze0.m(b0kVar2.k(h061.a));
                b0kVar2.i0(1588900273);
                b0kVar2.r(false);
                mmr0 mmr0Var1111 = df5.a;
                length = af5Var.b.length();
                list = af5Var.a;
                if (list != null) {
                    size = list.size();
                    while (true) {
                        if (i21 < size) {
                            ze5Var = (ze5) list.get(i21);
                            i30 = i28;
                            if (ze5Var.a instanceof qgc1) {
                                i29 = i25;
                                if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                    if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                        z7 = true;
                                    }
                                }
                                i21++;
                                i28 = i30;
                                i25 = i29;
                            } else {
                                i29 = i25;
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                            z6 = false;
                        }
                        boolean zR1111111 = f2p1.r(af5Var);
                        f930Var = (f930) b0kVar2.k(t4k.k);
                        if (z7) {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111111111 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111111111113 = i13 << 6;
                            d(qim0Var, af5Var1111111111111, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111113) | (29360128 & i31111111111111113) | (234881024 & i31111111111111113) | (i31111111111111113 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        } else {
                            z8 = z5;
                            b0kVar2.i0(1590195670);
                            if ((i13 & 14) == 4) {
                                z9 = true;
                            } else {
                                z9 = false;
                            }
                            objT = b0kVar2.T();
                            if (z9) {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            } else {
                                objT = xto.t(af5Var);
                                b0kVar2.s0(objT);
                            }
                            ven0Var = (ven0) objT;
                            af5 af5Var1111111111112 = (af5) ven0Var.getValue();
                            zG = b0kVar2.g(ven0Var);
                            objT2 = b0kVar2.T();
                            if (zG) {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            } else {
                                objT2 = new g45(ven0Var, (byte) 2);
                                b0kVar2.s0(objT2);
                            }
                            int i31111111111111114 = i13 << 6;
                            d(qim0Var, af5Var1111111111112, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111114) | (29360128 & i31111111111111114) | (234881024 & i31111111111111114) | (i31111111111111114 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                            b0kVar2.r(false);
                        }
                        i24 = i27;
                        x9hVar2 = x9hVar3;
                        m0e1Var2 = m0e1Var3;
                        map2 = map3;
                        i23 = i26;
                        z4 = z8;
                        i22 = i29;
                    }
                } else {
                    i29 = i25;
                    z6 = false;
                }
                i30 = i28;
                z7 = z6;
                boolean zR1111112 = f2p1.r(af5Var);
                f930Var = (f930) b0kVar2.k(t4k.k);
                if (z7) {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111111111113 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111111115 = i13 << 6;
                    d(qim0Var, af5Var1111111111113, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111115) | (29360128 & i31111111111111115) | (234881024 & i31111111111111115) | (i31111111111111115 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                } else {
                    z8 = z5;
                    b0kVar2.i0(1590195670);
                    if ((i13 & 14) == 4) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                    objT = b0kVar2.T();
                    if (z9) {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    } else {
                        objT = xto.t(af5Var);
                        b0kVar2.s0(objT);
                    }
                    ven0Var = (ven0) objT;
                    af5 af5Var1111111111114 = (af5) ven0Var.getValue();
                    zG = b0kVar2.g(ven0Var);
                    objT2 = b0kVar2.T();
                    if (zG) {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    } else {
                        objT2 = new g45(ven0Var, (byte) 2);
                        b0kVar2.s0(objT2);
                    }
                    int i31111111111111116 = i13 << 6;
                    d(qim0Var, af5Var1111111111114, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111116) | (29360128 & i31111111111111116) | (234881024 & i31111111111111116) | (i31111111111111116 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                    b0kVar2.r(false);
                }
                i24 = i27;
                x9hVar2 = x9hVar3;
                m0e1Var2 = m0e1Var3;
                map2 = map3;
                i23 = i26;
                z4 = z8;
                i22 = i29;
            } else {
                b0kVar2.b0();
                i22 = i;
                i23 = i2;
                i24 = i3;
                map2 = map;
                x9hVar2 = x9hVar;
                m0e1Var2 = m0e1Var;
                z4 = z2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i13 |= 805306368;
        i18 = i5 & 1024;
        if (i18 != 0) {
            i20 = 6;
            i19 = i18;
        } else {
            i19 = i18;
            if (b0kVar2.g(m0e1Var)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
        }
        i21 = 0;
        if ((i13 & 306783379) == 306783378) {
            z3 = true;
        } else {
            z3 = true;
        }
        if (b0kVar2.Y(i13 & 1, z3)) {
            if (i31 != 0) {
                i25 = 1;
            } else {
                i25 = i;
            }
            if (i7 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i9 != 0) {
                i26 = Integer.MAX_VALUE;
            } else {
                i26 = i2;
            }
            if (i11 != 0) {
                i27 = 1;
            } else {
                i27 = i3;
            }
            if (i14 != 0) {
                int i31111111111111117 = i20;
                map3 = b7x.a;
                i28 = i31111111111111117;
            } else {
                i28 = i20;
                map3 = map;
            }
            if (i16 != 0) {
                x9hVar3 = null;
            } else {
                x9hVar3 = x9hVar;
            }
            if (i19 != 0) {
                m0e1Var3 = null;
            } else {
                m0e1Var3 = m0e1Var;
            }
            gio1.D(i27, i26);
            pze0.m(b0kVar2.k(h061.a));
            b0kVar2.i0(1588900273);
            b0kVar2.r(false);
            mmr0 mmr0Var1112 = df5.a;
            length = af5Var.b.length();
            list = af5Var.a;
            if (list != null) {
                size = list.size();
                while (true) {
                    if (i21 < size) {
                        ze5Var = (ze5) list.get(i21);
                        i30 = i28;
                        if (ze5Var.a instanceof qgc1) {
                            i29 = i25;
                            if ("androidx.compose.foundation.text.inlineContent".equals(ze5Var.d)) {
                                if (bf5.b(0, length, ze5Var.b, ze5Var.c)) {
                                    z7 = true;
                                }
                            }
                            i21++;
                            i28 = i30;
                            i25 = i29;
                        } else {
                            i29 = i25;
                        }
                        i21++;
                        i28 = i30;
                        i25 = i29;
                    } else {
                        i29 = i25;
                        z6 = false;
                    }
                    boolean zR1111113 = f2p1.r(af5Var);
                    f930Var = (f930) b0kVar2.k(t4k.k);
                    if (z7) {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111111111115 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i31111111111111118 = i13 << 6;
                        d(qim0Var, af5Var1111111111115, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111118) | (29360128 & i31111111111111118) | (234881024 & i31111111111111118) | (i31111111111111118 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    } else {
                        z8 = z5;
                        b0kVar2.i0(1590195670);
                        if ((i13 & 14) == 4) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        objT = b0kVar2.T();
                        if (z9) {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        } else {
                            objT = xto.t(af5Var);
                            b0kVar2.s0(objT);
                        }
                        ven0Var = (ven0) objT;
                        af5 af5Var1111111111116 = (af5) ven0Var.getValue();
                        zG = b0kVar2.g(ven0Var);
                        objT2 = b0kVar2.T();
                        if (zG) {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        } else {
                            objT2 = new g45(ven0Var, (byte) 2);
                            b0kVar2.s0(objT2);
                        }
                        int i31111111111111119 = i13 << 6;
                        d(qim0Var, af5Var1111111111116, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i31111111111111119) | (29360128 & i31111111111111119) | (234881024 & i31111111111111119) | (i31111111111111119 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                        b0kVar2.r(false);
                    }
                    i24 = i27;
                    x9hVar2 = x9hVar3;
                    m0e1Var2 = m0e1Var3;
                    map2 = map3;
                    i23 = i26;
                    z4 = z8;
                    i22 = i29;
                }
            } else {
                i29 = i25;
                z6 = false;
            }
            i30 = i28;
            z7 = z6;
            boolean zR1111114 = f2p1.r(af5Var);
            f930Var = (f930) b0kVar2.k(t4k.k);
            if (z7) {
                z8 = z5;
                b0kVar2.i0(1590195670);
                if ((i13 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objT = b0kVar2.T();
                if (z9) {
                    objT = xto.t(af5Var);
                    b0kVar2.s0(objT);
                } else {
                    objT = xto.t(af5Var);
                    b0kVar2.s0(objT);
                }
                ven0Var = (ven0) objT;
                af5 af5Var1111111111117 = (af5) ven0Var.getValue();
                zG = b0kVar2.g(ven0Var);
                objT2 = b0kVar2.T();
                if (zG) {
                    objT2 = new g45(ven0Var, (byte) 2);
                    b0kVar2.s0(objT2);
                } else {
                    objT2 = new g45(ven0Var, (byte) 2);
                    b0kVar2.s0(objT2);
                }
                int i311111111111111110 = i13 << 6;
                d(qim0Var, af5Var1111111111117, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111111110) | (29360128 & i311111111111111110) | (234881024 & i311111111111111110) | (i311111111111111110 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                b0kVar2.r(false);
            } else {
                z8 = z5;
                b0kVar2.i0(1590195670);
                if ((i13 & 14) == 4) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                objT = b0kVar2.T();
                if (z9) {
                    objT = xto.t(af5Var);
                    b0kVar2.s0(objT);
                } else {
                    objT = xto.t(af5Var);
                    b0kVar2.s0(objT);
                }
                ven0Var = (ven0) objT;
                af5 af5Var1111111111118 = (af5) ven0Var.getValue();
                zG = b0kVar2.g(ven0Var);
                objT2 = b0kVar2.T();
                if (zG) {
                    objT2 = new g45(ven0Var, (byte) 2);
                    b0kVar2.s0(objT2);
                } else {
                    objT2 = new g45(ven0Var, (byte) 2);
                    b0kVar2.s0(objT2);
                }
                int i311111111111111111 = i13 << 6;
                d(qim0Var, af5Var1111111111118, iu30Var, z7, map3, lee1Var, i29, z8, i26, i27, f930Var, x9hVar3, (iu30) objT2, m0e1Var3, b0kVar2, ((i13 >> 3) & 910) | ((i13 >> 12) & 57344) | ((i13 << 9) & 458752) | (3670016 & i311111111111111111) | (29360128 & i311111111111111111) | (234881024 & i311111111111111111) | (i311111111111111111 & 1879048192), ((i13 >> 21) & 896) | ((i30 << 12) & 57344));
                b0kVar2.r(false);
            }
            i24 = i27;
            x9hVar2 = x9hVar3;
            m0e1Var2 = m0e1Var3;
            map2 = map3;
            i23 = i26;
            z4 = z8;
            i22 = i29;
        } else {
            b0kVar2.b0();
            i22 = i;
            i23 = i2;
            i24 = i3;
            map2 = map;
            x9hVar2 = x9hVar;
            m0e1Var2 = m0e1Var;
            z4 = z2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zea(af5Var, qim0Var, lee1Var, iu30Var, i22, z4, i23, i24, map2, x9hVar2, m0e1Var2, i4, i5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0097 A[FALL_THROUGH] */
    public static boolean b0(yr31 yr31Var) {
        char cK;
        if (yr31Var.e()) {
            if (!yr31Var.i('<')) {
                int i = 0;
                boolean z = true;
                while (yr31Var.e()) {
                    char cK2 = yr31Var.k();
                    if (cK2 == ' ') {
                        return !z;
                    }
                    if (cK2 == '\\') {
                        yr31Var.h();
                        char cK3 = yr31Var.k();
                        switch (cK3) {
                            default:
                                switch (cK3) {
                                    default:
                                        switch (cK3) {
                                            case '[':
                                            case '\\':
                                            case ']':
                                            case '^':
                                            case '_':
                                            case '`':
                                                break;
                                            default:
                                                switch (cK3) {
                                                    case '{':
                                                    case '|':
                                                    case '}':
                                                    case '~':
                                                        break;
                                                    default:
                                                        continue;
                                                }
                                                break;
                                        }
                                    case PlaylistDecorationPolicy.CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER /* 58 */:
                                    case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                    case '<':
                                    case '=':
                                    case '>':
                                    case '?':
                                    case '@':
                                        yr31Var.h();
                                        break;
                                }
                            case '!':
                            case '\"':
                            case '#':
                            case '$':
                            case '%':
                            case '&':
                            case '\'':
                            case '(':
                            case ')':
                            case '*':
                            case PlaylistDecorationPolicy.EXTENSION_FIELD_NUMBER /* 43 */:
                            case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
                            case PlaylistDecorationPolicy.LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER /* 45 */:
                            case PlaylistDecorationPolicy.NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER /* 46 */:
                            case PlaylistDecorationPolicy.AVAILABLE_SIGNALS_FIELD_NUMBER /* 47 */:
                                yr31Var.h();
                                break;
                        }
                    } else if (cK2 == '(') {
                        i++;
                        if (i <= 32) {
                            yr31Var.h();
                        }
                    } else if (cK2 != ')') {
                        if (Character.isISOControl(cK2)) {
                            return !z;
                        }
                        yr31Var.h();
                    } else {
                        if (i == 0) {
                            return true;
                        }
                        i--;
                        yr31Var.h();
                    }
                    z = false;
                }
                return true;
            }
            while (yr31Var.e() && (cK = yr31Var.k()) != '\n' && cK != '<') {
                if (cK == '>') {
                    yr31Var.h();
                    return true;
                }
                if (cK == '\\') {
                    yr31Var.h();
                    char cK4 = yr31Var.k();
                    switch (cK4) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case PlaylistDecorationPolicy.EXTENSION_FIELD_NUMBER /* 43 */:
                        case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
                        case PlaylistDecorationPolicy.LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER /* 45 */:
                        case PlaylistDecorationPolicy.NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER /* 46 */:
                        case PlaylistDecorationPolicy.AVAILABLE_SIGNALS_FIELD_NUMBER /* 47 */:
                            yr31Var.h();
                            break;
                        default:
                            switch (cK4) {
                                case PlaylistDecorationPolicy.CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER /* 58 */:
                                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    yr31Var.h();
                                    break;
                                default:
                                    switch (cK4) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            yr31Var.h();
                                            break;
                                        default:
                                            switch (cK4) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            yr31Var.h();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    yr31Var.h();
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0115  */
    /* JADX WARN: Code duplicated, block: B:101:0x011a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0120  */
    /* JADX WARN: Code duplicated, block: B:104:0x0123  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:108:0x0137  */
    /* JADX WARN: Code duplicated, block: B:111:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:113:0x0146  */
    /* JADX WARN: Code duplicated, block: B:116:0x014d  */
    /* JADX WARN: Code duplicated, block: B:117:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x0154  */
    /* JADX WARN: Code duplicated, block: B:120:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x0159  */
    /* JADX WARN: Code duplicated, block: B:123:0x015b  */
    /* JADX WARN: Code duplicated, block: B:125:0x015f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0164  */
    /* JADX WARN: Code duplicated, block: B:128:0x0168  */
    /* JADX WARN: Code duplicated, block: B:129:0x016a  */
    /* JADX WARN: Code duplicated, block: B:131:0x016e  */
    /* JADX WARN: Code duplicated, block: B:132:0x0171  */
    /* JADX WARN: Code duplicated, block: B:134:0x0175  */
    /* JADX WARN: Code duplicated, block: B:135:0x0178  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f6 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:152:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:157:0x0262  */
    /* JADX WARN: Code duplicated, block: B:159:0x0269  */
    /* JADX WARN: Code duplicated, block: B:160:0x026f  */
    /* JADX WARN: Code duplicated, block: B:162:0x029e  */
    /* JADX WARN: Code duplicated, block: B:164:0x02a2  */
    /* JADX WARN: Code duplicated, block: B:167:0x02bb  */
    /* JADX WARN: Code duplicated, block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0108 A[PHI: r18
      0x0108: PHI (r18v16 int) = (r18v4 int), (r18v10 int), (r18v11 int) binds: [B:94:0x0106, B:104:0x0123, B:103:0x0120] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:96:0x010b  */
    /* JADX WARN: Code duplicated, block: B:98:0x010f  */
    public static final void c(String str, qim0 qim0Var, lee1 lee1Var, iu30 iu30Var, int i, boolean z, int i2, int i3, x9h x9hVar, m0e1 m0e1Var, b0k b0kVar, int i4, int i5) {
        int i6;
        qim0 qim0Var2;
        int i7;
        iu30 iu30Var2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean zI;
        int i22;
        boolean z2;
        String str2;
        int i23;
        m0e1 m0e1Var2;
        qim0 qim0Var3;
        iu30 iu30Var3;
        int i24;
        boolean z3;
        int i25;
        x9h x9hVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        iu30 iu30Var4;
        int i26;
        boolean z4;
        int i27;
        int i28;
        x9h x9hVar3;
        m0e1 m0e1Var3;
        Executor executor;
        boolean z5;
        int i29;
        int i30;
        qim0 qim0VarE0;
        d7x d7xVar;
        int iHashCode;
        qim0 qim0VarE;
        xos0 xos0VarM;
        int i31;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1040751001);
        if ((i4 & 6) == 0) {
            i6 = (x340Var.g(str) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        int i32 = i5 & 2;
        if (i32 == 0) {
            if ((i4 & 48) == 0) {
                qim0Var2 = qim0Var;
                i6 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            if ((i4 & 384) == 0) {
                if (x340Var.g(lee1Var)) {
                    i31 = 256;
                } else {
                    i31 = 128;
                }
                i6 |= i31;
            }
            i7 = i5 & 8;
            if (i7 != 0) {
                if ((i4 & 3072) == 0) {
                    iu30Var2 = iu30Var;
                    if (x340Var.i(iu30Var2)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i6 |= i8;
                }
                i9 = i5 & 16;
                if (i9 != 0) {
                    if ((i4 & 24576) == 0) {
                        i10 = i;
                        if (x340Var.e(i10)) {
                            i11 = 16384;
                        } else {
                            i11 = 8192;
                        }
                        i6 |= i11;
                    }
                    i12 = i5 & 32;
                    if (i12 != 0) {
                        if ((196608 & i4) == 0) {
                            if (x340Var.h(z)) {
                                i13 = 131072;
                            } else {
                                i13 = 65536;
                            }
                            i6 |= i13;
                        }
                        i14 = i5 & 64;
                        if (i14 != 0) {
                            i6 |= 1572864;
                        } else if ((i4 & 1572864) == 0) {
                            if (x340Var.e(i2)) {
                                i15 = 1048576;
                            } else {
                                i15 = 524288;
                            }
                            i6 |= i15;
                        }
                        i16 = i5 & 128;
                        if (i16 != 0) {
                            if ((i4 & 12582912) == 0) {
                                if (x340Var.e(i3)) {
                                    i17 = 8388608;
                                } else {
                                    i17 = 4194304;
                                }
                                i6 |= i17;
                            }
                            i18 = i5 & 256;
                            if (i18 != 0) {
                                if ((i4 & 100663296) == 0) {
                                    if (x340Var.i(x9hVar)) {
                                        i19 = 67108864;
                                    } else {
                                        i19 = 33554432;
                                    }
                                    i6 |= i19;
                                }
                                i20 = i5 & 512;
                                i21 = 805306368;
                                if (i20 == 0) {
                                    i6 |= i21;
                                } else if ((i4 & 805306368) == 0) {
                                    if ((i4 & 1073741824) == 0) {
                                        zI = x340Var.g(m0e1Var);
                                    } else {
                                        zI = x340Var.i(m0e1Var);
                                    }
                                    if (zI) {
                                        i21 = 536870912;
                                    } else {
                                        i21 = 268435456;
                                    }
                                    i6 |= i21;
                                }
                                i22 = i6;
                                if ((i6 & 306783379) != 306783378) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (x340Var.Y(i22 & 1, z2)) {
                                    if (i32 != 0) {
                                        qim0Var4 = nim0.a;
                                    } else {
                                        qim0Var4 = qim0Var2;
                                    }
                                    if (i7 != 0) {
                                        iu30Var4 = null;
                                    } else {
                                        iu30Var4 = iu30Var2;
                                    }
                                    if (i9 != 0) {
                                        i26 = 1;
                                    } else {
                                        i26 = i10;
                                    }
                                    if (i12 != 0) {
                                        z4 = true;
                                    } else {
                                        z4 = z;
                                    }
                                    if (i14 != 0) {
                                        i27 = Integer.MAX_VALUE;
                                    } else {
                                        i27 = i2;
                                    }
                                    if (i16 != 0) {
                                        i28 = 1;
                                    } else {
                                        i28 = i3;
                                    }
                                    if (i18 != 0) {
                                        x9hVar3 = null;
                                    } else {
                                        x9hVar3 = x9hVar;
                                    }
                                    if (i20 != 0) {
                                        m0e1Var3 = null;
                                    } else {
                                        m0e1Var3 = m0e1Var;
                                    }
                                    gio1.D(i28, i27);
                                    pze0.m(x340Var.k(h061.a));
                                    x340Var.i0(357055103);
                                    x340Var.r(false);
                                    f930 f930Var = (f930) x340Var.k(t4k.k);
                                    executor = (Executor) x340Var.k(ffa.a);
                                    if (executor == null && ffa.b(str.length())) {
                                        x340Var.i0(-1250263182);
                                        try {
                                            boolean z6 = z4;
                                            try {
                                                executor.execute(new efa((byte) 0, lee1Var, (flb0) x340Var.k(t4k.n), str, (wat) x340Var.k(t4k.h), f930Var, z6));
                                            } catch (RejectedExecutionException unused) {
                                                f930Var = f930Var;
                                                z4 = z6;
                                            }
                                        } catch (RejectedExecutionException unused2) {
                                        }
                                        z5 = false;
                                        x340Var.r(false);
                                    } else {
                                        z5 = false;
                                        x340Var.i0(-1248455541);
                                        x340Var.r(false);
                                    }
                                    if (iu30Var4 == null || m0e1Var3 != null) {
                                        str2 = str;
                                        i29 = i27;
                                        i30 = i28;
                                        x340Var.i0(357432497);
                                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                        x340Var.r(false);
                                    } else {
                                        x340Var.i0(358076243);
                                        x340Var.r(z5);
                                        str2 = str;
                                        i29 = i27;
                                        i30 = i28;
                                        qim0VarE0 = qim0Var4.then(new gee1(str2, lee1Var, f930Var, i26, z4, i27, i28, x9hVar3));
                                    }
                                    d7xVar = d7x.b;
                                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                                    xos0VarM = x340Var.m();
                                    hzj.A.getClass();
                                    if (x340Var.a != null) {
                                        tgp1.p();
                                        throw null;
                                    }
                                    x340Var.m0();
                                    if (x340Var.S) {
                                        x340Var.l(hmb0.t1);
                                    } else {
                                        x340Var.v0();
                                    }
                                    nko1.H(d7xVar, x340Var, y580.O0);
                                    nko1.H(xos0VarM, x340Var, y580.N0);
                                    nko1.F(x340Var);
                                    nko1.H(qim0VarE, x340Var, y580.Y);
                                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                    x340Var.r(true);
                                    z3 = z4;
                                    qim0Var3 = qim0Var4;
                                    i23 = i29;
                                    m0e1Var2 = m0e1Var3;
                                    i24 = i26;
                                    x9hVar2 = x9hVar3;
                                    iu30Var3 = iu30Var4;
                                    i25 = i30;
                                } else {
                                    str2 = str;
                                    x340Var.b0();
                                    i23 = i2;
                                    m0e1Var2 = m0e1Var;
                                    qim0Var3 = qim0Var2;
                                    iu30Var3 = iu30Var2;
                                    i24 = i10;
                                    z3 = z;
                                    i25 = i3;
                                    x9hVar2 = x9hVar;
                                }
                                h311VarV = x340Var.v();
                                if (h311VarV != null) {
                                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                                }
                            }
                            i6 |= 100663296;
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var2 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 12582912;
                        i18 = i5 & 256;
                        if (i18 != 0) {
                            if ((i4 & 100663296) == 0) {
                                if (x340Var.i(x9hVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var3 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 100663296;
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var4 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 196608;
                    i14 = i5 & 64;
                    if (i14 != 0) {
                        i6 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (x340Var.e(i2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i6 |= i15;
                    }
                    i16 = i5 & 128;
                    if (i16 != 0) {
                        if ((i4 & 12582912) == 0) {
                            if (x340Var.e(i3)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i6 |= i17;
                        }
                        i18 = i5 & 256;
                        if (i18 != 0) {
                            if ((i4 & 100663296) == 0) {
                                if (x340Var.i(x9hVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var5 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 100663296;
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var6 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var7 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var8 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 24576;
                i10 = i;
                i12 = i5 & 32;
                if (i12 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i6 |= i13;
                    }
                    i14 = i5 & 64;
                    if (i14 != 0) {
                        i6 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (x340Var.e(i2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i6 |= i15;
                    }
                    i16 = i5 & 128;
                    if (i16 != 0) {
                        if ((i4 & 12582912) == 0) {
                            if (x340Var.e(i3)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i6 |= i17;
                        }
                        i18 = i5 & 256;
                        if (i18 != 0) {
                            if ((i4 & 100663296) == 0) {
                                if (x340Var.i(x9hVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var9 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 100663296;
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var10 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var11 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var12 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 196608;
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var13 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var14 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var15 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var16 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 3072;
            iu30Var2 = iu30Var;
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i4 & 24576) == 0) {
                    i10 = i;
                    if (x340Var.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i6 |= i11;
                }
                i12 = i5 & 32;
                if (i12 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i6 |= i13;
                    }
                    i14 = i5 & 64;
                    if (i14 != 0) {
                        i6 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (x340Var.e(i2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i6 |= i15;
                    }
                    i16 = i5 & 128;
                    if (i16 != 0) {
                        if ((i4 & 12582912) == 0) {
                            if (x340Var.e(i3)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i6 |= i17;
                        }
                        i18 = i5 & 256;
                        if (i18 != 0) {
                            if ((i4 & 100663296) == 0) {
                                if (x340Var.i(x9hVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var17 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 100663296;
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var18 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var19 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var110 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 196608;
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var111 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var112 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var113 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var114 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 24576;
            i10 = i;
            i12 = i5 & 32;
            if (i12 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var115 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var116 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var117 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var118 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 196608;
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (x340Var.e(i2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                if ((i4 & 12582912) == 0) {
                    if (x340Var.e(i3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var119 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var1110 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i18 = i5 & 256;
            if (i18 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (x340Var.i(x9hVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var1111 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 100663296;
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var1112 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 48;
        qim0Var2 = qim0Var;
        if ((i4 & 384) == 0) {
            if (x340Var.g(lee1Var)) {
                i31 = 256;
            } else {
                i31 = 128;
            }
            i6 |= i31;
        }
        i7 = i5 & 8;
        if (i7 != 0) {
            if ((i4 & 3072) == 0) {
                iu30Var2 = iu30Var;
                if (x340Var.i(iu30Var2)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i6 |= i8;
            }
            i9 = i5 & 16;
            if (i9 != 0) {
                if ((i4 & 24576) == 0) {
                    i10 = i;
                    if (x340Var.e(i10)) {
                        i11 = 16384;
                    } else {
                        i11 = 8192;
                    }
                    i6 |= i11;
                }
                i12 = i5 & 32;
                if (i12 != 0) {
                    if ((196608 & i4) == 0) {
                        if (x340Var.h(z)) {
                            i13 = 131072;
                        } else {
                            i13 = 65536;
                        }
                        i6 |= i13;
                    }
                    i14 = i5 & 64;
                    if (i14 != 0) {
                        i6 |= 1572864;
                    } else if ((i4 & 1572864) == 0) {
                        if (x340Var.e(i2)) {
                            i15 = 1048576;
                        } else {
                            i15 = 524288;
                        }
                        i6 |= i15;
                    }
                    i16 = i5 & 128;
                    if (i16 != 0) {
                        if ((i4 & 12582912) == 0) {
                            if (x340Var.e(i3)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i6 |= i17;
                        }
                        i18 = i5 & 256;
                        if (i18 != 0) {
                            if ((i4 & 100663296) == 0) {
                                if (x340Var.i(x9hVar)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = 33554432;
                                }
                                i6 |= i19;
                            }
                            i20 = i5 & 512;
                            i21 = 805306368;
                            if (i20 == 0) {
                                i6 |= i21;
                            } else if ((i4 & 805306368) == 0) {
                                if ((i4 & 1073741824) == 0) {
                                    zI = x340Var.g(m0e1Var);
                                } else {
                                    zI = x340Var.i(m0e1Var);
                                }
                                if (zI) {
                                    i21 = 536870912;
                                } else {
                                    i21 = 268435456;
                                }
                                i6 |= i21;
                            }
                            i22 = i6;
                            if ((i6 & 306783379) != 306783378) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (x340Var.Y(i22 & 1, z2)) {
                                if (i32 != 0) {
                                    qim0Var4 = nim0.a;
                                } else {
                                    qim0Var4 = qim0Var2;
                                }
                                if (i7 != 0) {
                                    iu30Var4 = null;
                                } else {
                                    iu30Var4 = iu30Var2;
                                }
                                if (i9 != 0) {
                                    i26 = 1;
                                } else {
                                    i26 = i10;
                                }
                                if (i12 != 0) {
                                    z4 = true;
                                } else {
                                    z4 = z;
                                }
                                if (i14 != 0) {
                                    i27 = Integer.MAX_VALUE;
                                } else {
                                    i27 = i2;
                                }
                                if (i16 != 0) {
                                    i28 = 1;
                                } else {
                                    i28 = i3;
                                }
                                if (i18 != 0) {
                                    x9hVar3 = null;
                                } else {
                                    x9hVar3 = x9hVar;
                                }
                                if (i20 != 0) {
                                    m0e1Var3 = null;
                                } else {
                                    m0e1Var3 = m0e1Var;
                                }
                                gio1.D(i28, i27);
                                pze0.m(x340Var.k(h061.a));
                                x340Var.i0(357055103);
                                x340Var.r(false);
                                f930 f930Var1113 = (f930) x340Var.k(t4k.k);
                                executor = (Executor) x340Var.k(ffa.a);
                                if (executor == null) {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                } else {
                                    z5 = false;
                                    x340Var.i0(-1248455541);
                                    x340Var.r(false);
                                }
                                if (iu30Var4 == null) {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                } else {
                                    str2 = str;
                                    i29 = i27;
                                    i30 = i28;
                                    x340Var.i0(357432497);
                                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                    x340Var.r(false);
                                }
                                d7xVar = d7x.b;
                                iHashCode = Long.hashCode(tgp1.l(x340Var));
                                qim0VarE = zr7.E(x340Var, qim0VarE0);
                                xos0VarM = x340Var.m();
                                hzj.A.getClass();
                                if (x340Var.a != null) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(hmb0.t1);
                                } else {
                                    x340Var.v0();
                                }
                                nko1.H(d7xVar, x340Var, y580.O0);
                                nko1.H(xos0VarM, x340Var, y580.N0);
                                nko1.F(x340Var);
                                nko1.H(qim0VarE, x340Var, y580.Y);
                                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                                x340Var.r(true);
                                z3 = z4;
                                qim0Var3 = qim0Var4;
                                i23 = i29;
                                m0e1Var2 = m0e1Var3;
                                i24 = i26;
                                x9hVar2 = x9hVar3;
                                iu30Var3 = iu30Var4;
                                i25 = i30;
                            } else {
                                str2 = str;
                                x340Var.b0();
                                i23 = i2;
                                m0e1Var2 = m0e1Var;
                                qim0Var3 = qim0Var2;
                                iu30Var3 = iu30Var2;
                                i24 = i10;
                                z3 = z;
                                i25 = i3;
                                x9hVar2 = x9hVar;
                            }
                            h311VarV = x340Var.v();
                            if (h311VarV != null) {
                                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                            }
                        }
                        i6 |= 100663296;
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var1114 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 12582912;
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var1115 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var1116 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 196608;
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var1117 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var1118 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var1119 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var11110 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 24576;
            i10 = i;
            i12 = i5 & 32;
            if (i12 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var11111 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var11112 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var11113 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var11114 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 196608;
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (x340Var.e(i2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                if ((i4 & 12582912) == 0) {
                    if (x340Var.e(i3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var11115 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var11116 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i18 = i5 & 256;
            if (i18 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (x340Var.i(x9hVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var11117 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 100663296;
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var11118 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 3072;
        iu30Var2 = iu30Var;
        i9 = i5 & 16;
        if (i9 != 0) {
            if ((i4 & 24576) == 0) {
                i10 = i;
                if (x340Var.e(i10)) {
                    i11 = 16384;
                } else {
                    i11 = 8192;
                }
                i6 |= i11;
            }
            i12 = i5 & 32;
            if (i12 != 0) {
                if ((196608 & i4) == 0) {
                    if (x340Var.h(z)) {
                        i13 = 131072;
                    } else {
                        i13 = 65536;
                    }
                    i6 |= i13;
                }
                i14 = i5 & 64;
                if (i14 != 0) {
                    i6 |= 1572864;
                } else if ((i4 & 1572864) == 0) {
                    if (x340Var.e(i2)) {
                        i15 = 1048576;
                    } else {
                        i15 = 524288;
                    }
                    i6 |= i15;
                }
                i16 = i5 & 128;
                if (i16 != 0) {
                    if ((i4 & 12582912) == 0) {
                        if (x340Var.e(i3)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i6 |= i17;
                    }
                    i18 = i5 & 256;
                    if (i18 != 0) {
                        if ((i4 & 100663296) == 0) {
                            if (x340Var.i(x9hVar)) {
                                i19 = 67108864;
                            } else {
                                i19 = 33554432;
                            }
                            i6 |= i19;
                        }
                        i20 = i5 & 512;
                        i21 = 805306368;
                        if (i20 == 0) {
                            i6 |= i21;
                        } else if ((i4 & 805306368) == 0) {
                            if ((i4 & 1073741824) == 0) {
                                zI = x340Var.g(m0e1Var);
                            } else {
                                zI = x340Var.i(m0e1Var);
                            }
                            if (zI) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i6 |= i21;
                        }
                        i22 = i6;
                        if ((i6 & 306783379) != 306783378) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (x340Var.Y(i22 & 1, z2)) {
                            if (i32 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i7 != 0) {
                                iu30Var4 = null;
                            } else {
                                iu30Var4 = iu30Var2;
                            }
                            if (i9 != 0) {
                                i26 = 1;
                            } else {
                                i26 = i10;
                            }
                            if (i12 != 0) {
                                z4 = true;
                            } else {
                                z4 = z;
                            }
                            if (i14 != 0) {
                                i27 = Integer.MAX_VALUE;
                            } else {
                                i27 = i2;
                            }
                            if (i16 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i3;
                            }
                            if (i18 != 0) {
                                x9hVar3 = null;
                            } else {
                                x9hVar3 = x9hVar;
                            }
                            if (i20 != 0) {
                                m0e1Var3 = null;
                            } else {
                                m0e1Var3 = m0e1Var;
                            }
                            gio1.D(i28, i27);
                            pze0.m(x340Var.k(h061.a));
                            x340Var.i0(357055103);
                            x340Var.r(false);
                            f930 f930Var11119 = (f930) x340Var.k(t4k.k);
                            executor = (Executor) x340Var.k(ffa.a);
                            if (executor == null) {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            } else {
                                z5 = false;
                                x340Var.i0(-1248455541);
                                x340Var.r(false);
                            }
                            if (iu30Var4 == null) {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            } else {
                                str2 = str;
                                i29 = i27;
                                i30 = i28;
                                x340Var.i0(357432497);
                                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                                x340Var.r(false);
                            }
                            d7xVar = d7x.b;
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, qim0VarE0);
                            xos0VarM = x340Var.m();
                            hzj.A.getClass();
                            if (x340Var.a != null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(hmb0.t1);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(d7xVar, x340Var, y580.O0);
                            nko1.H(xos0VarM, x340Var, y580.N0);
                            nko1.F(x340Var);
                            nko1.H(qim0VarE, x340Var, y580.Y);
                            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                            x340Var.r(true);
                            z3 = z4;
                            qim0Var3 = qim0Var4;
                            i23 = i29;
                            m0e1Var2 = m0e1Var3;
                            i24 = i26;
                            x9hVar2 = x9hVar3;
                            iu30Var3 = iu30Var4;
                            i25 = i30;
                        } else {
                            str2 = str;
                            x340Var.b0();
                            i23 = i2;
                            m0e1Var2 = m0e1Var;
                            qim0Var3 = qim0Var2;
                            iu30Var3 = iu30Var2;
                            i24 = i10;
                            z3 = z;
                            i25 = i3;
                            x9hVar2 = x9hVar;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                        }
                    }
                    i6 |= 100663296;
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var111110 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 12582912;
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var111111 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var111112 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 196608;
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (x340Var.e(i2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                if ((i4 & 12582912) == 0) {
                    if (x340Var.e(i3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var111113 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var111114 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i18 = i5 & 256;
            if (i18 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (x340Var.i(x9hVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var111115 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 100663296;
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var111116 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 24576;
        i10 = i;
        i12 = i5 & 32;
        if (i12 != 0) {
            if ((196608 & i4) == 0) {
                if (x340Var.h(z)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i6 |= i13;
            }
            i14 = i5 & 64;
            if (i14 != 0) {
                i6 |= 1572864;
            } else if ((i4 & 1572864) == 0) {
                if (x340Var.e(i2)) {
                    i15 = 1048576;
                } else {
                    i15 = 524288;
                }
                i6 |= i15;
            }
            i16 = i5 & 128;
            if (i16 != 0) {
                if ((i4 & 12582912) == 0) {
                    if (x340Var.e(i3)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i6 |= i17;
                }
                i18 = i5 & 256;
                if (i18 != 0) {
                    if ((i4 & 100663296) == 0) {
                        if (x340Var.i(x9hVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = 33554432;
                        }
                        i6 |= i19;
                    }
                    i20 = i5 & 512;
                    i21 = 805306368;
                    if (i20 == 0) {
                        i6 |= i21;
                    } else if ((i4 & 805306368) == 0) {
                        if ((i4 & 1073741824) == 0) {
                            zI = x340Var.g(m0e1Var);
                        } else {
                            zI = x340Var.i(m0e1Var);
                        }
                        if (zI) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i6 |= i21;
                    }
                    i22 = i6;
                    if ((i6 & 306783379) != 306783378) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (x340Var.Y(i22 & 1, z2)) {
                        if (i32 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i7 != 0) {
                            iu30Var4 = null;
                        } else {
                            iu30Var4 = iu30Var2;
                        }
                        if (i9 != 0) {
                            i26 = 1;
                        } else {
                            i26 = i10;
                        }
                        if (i12 != 0) {
                            z4 = true;
                        } else {
                            z4 = z;
                        }
                        if (i14 != 0) {
                            i27 = Integer.MAX_VALUE;
                        } else {
                            i27 = i2;
                        }
                        if (i16 != 0) {
                            i28 = 1;
                        } else {
                            i28 = i3;
                        }
                        if (i18 != 0) {
                            x9hVar3 = null;
                        } else {
                            x9hVar3 = x9hVar;
                        }
                        if (i20 != 0) {
                            m0e1Var3 = null;
                        } else {
                            m0e1Var3 = m0e1Var;
                        }
                        gio1.D(i28, i27);
                        pze0.m(x340Var.k(h061.a));
                        x340Var.i0(357055103);
                        x340Var.r(false);
                        f930 f930Var111117 = (f930) x340Var.k(t4k.k);
                        executor = (Executor) x340Var.k(ffa.a);
                        if (executor == null) {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        } else {
                            z5 = false;
                            x340Var.i0(-1248455541);
                            x340Var.r(false);
                        }
                        if (iu30Var4 == null) {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        } else {
                            str2 = str;
                            i29 = i27;
                            i30 = i28;
                            x340Var.i0(357432497);
                            qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                            x340Var.r(false);
                        }
                        d7xVar = d7x.b;
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, qim0VarE0);
                        xos0VarM = x340Var.m();
                        hzj.A.getClass();
                        if (x340Var.a != null) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(hmb0.t1);
                        } else {
                            x340Var.v0();
                        }
                        nko1.H(d7xVar, x340Var, y580.O0);
                        nko1.H(xos0VarM, x340Var, y580.N0);
                        nko1.F(x340Var);
                        nko1.H(qim0VarE, x340Var, y580.Y);
                        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                        x340Var.r(true);
                        z3 = z4;
                        qim0Var3 = qim0Var4;
                        i23 = i29;
                        m0e1Var2 = m0e1Var3;
                        i24 = i26;
                        x9hVar2 = x9hVar3;
                        iu30Var3 = iu30Var4;
                        i25 = i30;
                    } else {
                        str2 = str;
                        x340Var.b0();
                        i23 = i2;
                        m0e1Var2 = m0e1Var;
                        qim0Var3 = qim0Var2;
                        iu30Var3 = iu30Var2;
                        i24 = i10;
                        z3 = z;
                        i25 = i3;
                        x9hVar2 = x9hVar;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                    }
                }
                i6 |= 100663296;
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var111118 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 12582912;
            i18 = i5 & 256;
            if (i18 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (x340Var.i(x9hVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var111119 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 100663296;
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var1111110 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 196608;
        i14 = i5 & 64;
        if (i14 != 0) {
            i6 |= 1572864;
        } else if ((i4 & 1572864) == 0) {
            if (x340Var.e(i2)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i6 |= i15;
        }
        i16 = i5 & 128;
        if (i16 != 0) {
            if ((i4 & 12582912) == 0) {
                if (x340Var.e(i3)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i6 |= i17;
            }
            i18 = i5 & 256;
            if (i18 != 0) {
                if ((i4 & 100663296) == 0) {
                    if (x340Var.i(x9hVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = 33554432;
                    }
                    i6 |= i19;
                }
                i20 = i5 & 512;
                i21 = 805306368;
                if (i20 == 0) {
                    i6 |= i21;
                } else if ((i4 & 805306368) == 0) {
                    if ((i4 & 1073741824) == 0) {
                        zI = x340Var.g(m0e1Var);
                    } else {
                        zI = x340Var.i(m0e1Var);
                    }
                    if (zI) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i6 |= i21;
                }
                i22 = i6;
                if ((i6 & 306783379) != 306783378) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (x340Var.Y(i22 & 1, z2)) {
                    if (i32 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i7 != 0) {
                        iu30Var4 = null;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    if (i9 != 0) {
                        i26 = 1;
                    } else {
                        i26 = i10;
                    }
                    if (i12 != 0) {
                        z4 = true;
                    } else {
                        z4 = z;
                    }
                    if (i14 != 0) {
                        i27 = Integer.MAX_VALUE;
                    } else {
                        i27 = i2;
                    }
                    if (i16 != 0) {
                        i28 = 1;
                    } else {
                        i28 = i3;
                    }
                    if (i18 != 0) {
                        x9hVar3 = null;
                    } else {
                        x9hVar3 = x9hVar;
                    }
                    if (i20 != 0) {
                        m0e1Var3 = null;
                    } else {
                        m0e1Var3 = m0e1Var;
                    }
                    gio1.D(i28, i27);
                    pze0.m(x340Var.k(h061.a));
                    x340Var.i0(357055103);
                    x340Var.r(false);
                    f930 f930Var1111111 = (f930) x340Var.k(t4k.k);
                    executor = (Executor) x340Var.k(ffa.a);
                    if (executor == null) {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    } else {
                        z5 = false;
                        x340Var.i0(-1248455541);
                        x340Var.r(false);
                    }
                    if (iu30Var4 == null) {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    } else {
                        str2 = str;
                        i29 = i27;
                        i30 = i28;
                        x340Var.i0(357432497);
                        qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                        x340Var.r(false);
                    }
                    d7xVar = d7x.b;
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, qim0VarE0);
                    xos0VarM = x340Var.m();
                    hzj.A.getClass();
                    if (x340Var.a != null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(hmb0.t1);
                    } else {
                        x340Var.v0();
                    }
                    nko1.H(d7xVar, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                    x340Var.r(true);
                    z3 = z4;
                    qim0Var3 = qim0Var4;
                    i23 = i29;
                    m0e1Var2 = m0e1Var3;
                    i24 = i26;
                    x9hVar2 = x9hVar3;
                    iu30Var3 = iu30Var4;
                    i25 = i30;
                } else {
                    str2 = str;
                    x340Var.b0();
                    i23 = i2;
                    m0e1Var2 = m0e1Var;
                    qim0Var3 = qim0Var2;
                    iu30Var3 = iu30Var2;
                    i24 = i10;
                    z3 = z;
                    i25 = i3;
                    x9hVar2 = x9hVar;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
                }
            }
            i6 |= 100663296;
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var1111112 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 12582912;
        i18 = i5 & 256;
        if (i18 != 0) {
            if ((i4 & 100663296) == 0) {
                if (x340Var.i(x9hVar)) {
                    i19 = 67108864;
                } else {
                    i19 = 33554432;
                }
                i6 |= i19;
            }
            i20 = i5 & 512;
            i21 = 805306368;
            if (i20 == 0) {
                i6 |= i21;
            } else if ((i4 & 805306368) == 0) {
                if ((i4 & 1073741824) == 0) {
                    zI = x340Var.g(m0e1Var);
                } else {
                    zI = x340Var.i(m0e1Var);
                }
                if (zI) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i6 |= i21;
            }
            i22 = i6;
            if ((i6 & 306783379) != 306783378) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i22 & 1, z2)) {
                if (i32 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i7 != 0) {
                    iu30Var4 = null;
                } else {
                    iu30Var4 = iu30Var2;
                }
                if (i9 != 0) {
                    i26 = 1;
                } else {
                    i26 = i10;
                }
                if (i12 != 0) {
                    z4 = true;
                } else {
                    z4 = z;
                }
                if (i14 != 0) {
                    i27 = Integer.MAX_VALUE;
                } else {
                    i27 = i2;
                }
                if (i16 != 0) {
                    i28 = 1;
                } else {
                    i28 = i3;
                }
                if (i18 != 0) {
                    x9hVar3 = null;
                } else {
                    x9hVar3 = x9hVar;
                }
                if (i20 != 0) {
                    m0e1Var3 = null;
                } else {
                    m0e1Var3 = m0e1Var;
                }
                gio1.D(i28, i27);
                pze0.m(x340Var.k(h061.a));
                x340Var.i0(357055103);
                x340Var.r(false);
                f930 f930Var1111113 = (f930) x340Var.k(t4k.k);
                executor = (Executor) x340Var.k(ffa.a);
                if (executor == null) {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                } else {
                    z5 = false;
                    x340Var.i0(-1248455541);
                    x340Var.r(false);
                }
                if (iu30Var4 == null) {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                } else {
                    str2 = str;
                    i29 = i27;
                    i30 = i28;
                    x340Var.i0(357432497);
                    qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                    x340Var.r(false);
                }
                d7xVar = d7x.b;
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, qim0VarE0);
                xos0VarM = x340Var.m();
                hzj.A.getClass();
                if (x340Var.a != null) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(hmb0.t1);
                } else {
                    x340Var.v0();
                }
                nko1.H(d7xVar, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                x340Var.r(true);
                z3 = z4;
                qim0Var3 = qim0Var4;
                i23 = i29;
                m0e1Var2 = m0e1Var3;
                i24 = i26;
                x9hVar2 = x9hVar3;
                iu30Var3 = iu30Var4;
                i25 = i30;
            } else {
                str2 = str;
                x340Var.b0();
                i23 = i2;
                m0e1Var2 = m0e1Var;
                qim0Var3 = qim0Var2;
                iu30Var3 = iu30Var2;
                i24 = i10;
                z3 = z;
                i25 = i3;
                x9hVar2 = x9hVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
            }
        }
        i6 |= 100663296;
        i20 = i5 & 512;
        i21 = 805306368;
        if (i20 == 0) {
            i6 |= i21;
        } else if ((i4 & 805306368) == 0) {
            if ((i4 & 1073741824) == 0) {
                zI = x340Var.g(m0e1Var);
            } else {
                zI = x340Var.i(m0e1Var);
            }
            if (zI) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i6 |= i21;
        }
        i22 = i6;
        if ((i6 & 306783379) != 306783378) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i22 & 1, z2)) {
            if (i32 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i7 != 0) {
                iu30Var4 = null;
            } else {
                iu30Var4 = iu30Var2;
            }
            if (i9 != 0) {
                i26 = 1;
            } else {
                i26 = i10;
            }
            if (i12 != 0) {
                z4 = true;
            } else {
                z4 = z;
            }
            if (i14 != 0) {
                i27 = Integer.MAX_VALUE;
            } else {
                i27 = i2;
            }
            if (i16 != 0) {
                i28 = 1;
            } else {
                i28 = i3;
            }
            if (i18 != 0) {
                x9hVar3 = null;
            } else {
                x9hVar3 = x9hVar;
            }
            if (i20 != 0) {
                m0e1Var3 = null;
            } else {
                m0e1Var3 = m0e1Var;
            }
            gio1.D(i28, i27);
            pze0.m(x340Var.k(h061.a));
            x340Var.i0(357055103);
            x340Var.r(false);
            f930 f930Var1111114 = (f930) x340Var.k(t4k.k);
            executor = (Executor) x340Var.k(ffa.a);
            if (executor == null) {
                z5 = false;
                x340Var.i0(-1248455541);
                x340Var.r(false);
            } else {
                z5 = false;
                x340Var.i0(-1248455541);
                x340Var.r(false);
            }
            if (iu30Var4 == null) {
                str2 = str;
                i29 = i27;
                i30 = i28;
                x340Var.i0(357432497);
                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                x340Var.r(false);
            } else {
                str2 = str;
                i29 = i27;
                i30 = i28;
                x340Var.i0(357432497);
                qim0VarE0 = e0(qim0Var4, new af5(str2), lee1Var, iu30Var4, i26, z4, i29, i30, (f930) x340Var.k(t4k.k), null, null, x9hVar3, null, m0e1Var3);
                x340Var.r(false);
            }
            d7xVar = d7x.b;
            iHashCode = Long.hashCode(tgp1.l(x340Var));
            qim0VarE = zr7.E(x340Var, qim0VarE0);
            xos0VarM = x340Var.m();
            hzj.A.getClass();
            if (x340Var.a != null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(d7xVar, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            x340Var.r(true);
            z3 = z4;
            qim0Var3 = qim0Var4;
            i23 = i29;
            m0e1Var2 = m0e1Var3;
            i24 = i26;
            x9hVar2 = x9hVar3;
            iu30Var3 = iu30Var4;
            i25 = i30;
        } else {
            str2 = str;
            x340Var.b0();
            i23 = i2;
            m0e1Var2 = m0e1Var;
            qim0Var3 = qim0Var2;
            iu30Var3 = iu30Var2;
            i24 = i10;
            z3 = z;
            i25 = i3;
            x9hVar2 = x9hVar;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yea(str2, qim0Var3, lee1Var, iu30Var3, i24, z3, i23, i25, x9hVar2, m0e1Var2, i4, i5);
        }
    }

    public static boolean c0(yr31 yr31Var) {
        while (yr31Var.e()) {
            switch (yr31Var.k()) {
                case '[':
                    return false;
                case '\\':
                    yr31Var.h();
                    char cK = yr31Var.k();
                    switch (cK) {
                        case '!':
                        case '\"':
                        case '#':
                        case '$':
                        case '%':
                        case '&':
                        case '\'':
                        case '(':
                        case ')':
                        case '*':
                        case PlaylistDecorationPolicy.EXTENSION_FIELD_NUMBER /* 43 */:
                        case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
                        case PlaylistDecorationPolicy.LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER /* 45 */:
                        case PlaylistDecorationPolicy.NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER /* 46 */:
                        case PlaylistDecorationPolicy.AVAILABLE_SIGNALS_FIELD_NUMBER /* 47 */:
                            yr31Var.h();
                            break;
                        default:
                            switch (cK) {
                                case PlaylistDecorationPolicy.CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER /* 58 */:
                                case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                                case '<':
                                case '=':
                                case '>':
                                case '?':
                                case '@':
                                    yr31Var.h();
                                    break;
                                default:
                                    switch (cK) {
                                        case '[':
                                        case '\\':
                                        case ']':
                                        case '^':
                                        case '_':
                                        case '`':
                                            yr31Var.h();
                                            break;
                                        default:
                                            switch (cK) {
                                                case '{':
                                                case '|':
                                                case '}':
                                                case '~':
                                                    break;
                                                default:
                                                    continue;
                                            }
                                            yr31Var.h();
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
                case ']':
                    return true;
                default:
                    yr31Var.h();
                    break;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:158:0x0205  */
    public static final void d(qim0 qim0Var, af5 af5Var, iu30 iu30Var, boolean z, Map map, lee1 lee1Var, int i, boolean z2, int i2, int i3, f930 f930Var, x9h x9hVar, iu30 iu30Var2, m0e1 m0e1Var, b0k b0kVar, int i4, int i5) {
        int i6;
        int i7;
        oae1 oae1Var;
        Function0 function0;
        mmr0 mmr0Var;
        Object obj;
        ven0 ven0Var;
        iu30 iu30Var3;
        hu6 qy4Var;
        boolean z3;
        boolean z4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2118572703);
        if ((i4 & 6) == 0) {
            i6 = (x340Var.g(qim0Var) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= x340Var.g(af5Var) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i4 & 3072) == 0) {
            i6 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i4 & 24576) == 0) {
            i6 |= x340Var.i(map) ? 16384 : 8192;
        }
        if ((196608 & i4) == 0) {
            i6 |= x340Var.g(lee1Var) ? 131072 : 65536;
        }
        if ((i4 & 1572864) == 0) {
            i6 |= x340Var.e(i) ? 1048576 : 524288;
        }
        if ((i4 & 12582912) == 0) {
            i6 |= x340Var.h(z2) ? 8388608 : 4194304;
        }
        if ((i4 & 100663296) == 0) {
            i6 |= x340Var.e(i2) ? 67108864 : 33554432;
        }
        if ((i4 & 805306368) == 0) {
            i6 |= x340Var.e(i3) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (x340Var.i(f930Var) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if ((i5 & 48) == 0) {
            i7 |= x340Var.i((Object) null) ? 32 : 16;
        }
        if ((i5 & 384) == 0) {
            i7 |= x340Var.i(x9hVar) ? 256 : 128;
        }
        int i8 = i6;
        if ((i5 & 3072) == 0) {
            i7 |= x340Var.i(iu30Var2) ? 2048 : 1024;
        }
        if ((i5 & 24576) == 0) {
            i7 |= (32768 & i5) == 0 ? x340Var.g(m0e1Var) : x340Var.i(m0e1Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i8 & 1, ((i8 & 306783379) == 306783378 && (i7 & 9363) == 9362) ? false : true)) {
            if (f2p1.r(af5Var)) {
                x340Var.i0(145641571);
                boolean z5 = (i8 & 112) == 32;
                Object objT = x340Var.T();
                if (z5 || objT == m4cVar) {
                    objT = new oae1(af5Var);
                    x340Var.s0(objT);
                }
                oae1Var = (oae1) objT;
                x340Var.r(false);
            } else {
                x340Var.i0(145707228);
                x340Var.r(false);
                oae1Var = null;
            }
            if (f2p1.r(af5Var)) {
                x340Var.i0(145905443);
                boolean zG = ((i8 & 112) == 32) | x340Var.g(oae1Var);
                Object objT2 = x340Var.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new og(oae1Var, af5Var, (byte) 11);
                    x340Var.s0(objT2);
                }
                function0 = (Function0) objT2;
                x340Var.r(false);
            } else {
                x340Var.i0(146002721);
                boolean z6 = (i8 & 112) == 32;
                Object objT3 = x340Var.T();
                if (z6 || objT3 == m4cVar) {
                    objT3 = new hx4(af5Var, (byte) 6);
                    x340Var.s0(objT3);
                }
                function0 = (Function0) objT3;
                x340Var.r(false);
            }
            Function0 function1 = function0;
            if (z) {
                if (map != null) {
                    mmr0 mmr0Var2 = df5.a;
                    if (map.isEmpty()) {
                        mmr0Var = df5.a;
                    } else {
                        List listC = af5Var.c(0, af5Var.b.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = listC.size();
                        int i9 = 0;
                        while (i9 < size) {
                            int i10 = size;
                            ze5 ze5Var = (ze5) listC.get(i9);
                            int i11 = i9;
                            Object obj2 = ze5Var.a;
                            List list = listC;
                            int i12 = ze5Var.c;
                            int i13 = ze5Var.b;
                            gh80 gh80Var = (gh80) map.get(obj2);
                            if (gh80Var != null) {
                                arrayList.add(new ze5(i13, i12, gh80Var.b()));
                                arrayList2.add(new ze5(i13, i12, gh80Var.a()));
                            }
                            i9 = i11 + 1;
                            size = i10;
                            listC = list;
                        }
                        mmr0Var = new mmr0(arrayList, arrayList2);
                    }
                } else {
                    mmr0Var = df5.a;
                }
                obj = null;
            } else {
                oae1Var = oae1Var;
                obj = null;
                mmr0Var = new mmr0(null, null);
            }
            List list2 = (List) mmr0Var.a;
            List list3 = (List) mmr0Var.b;
            if (z) {
                x340Var.i0(146318828);
                Object objT4 = x340Var.T();
                if (objT4 == m4cVar) {
                    objT4 = xto.t(obj);
                    x340Var.s0(objT4);
                }
                x340Var.r(false);
                ven0Var = (ven0) objT4;
            } else {
                x340Var.i0(146406588);
                x340Var.r(false);
                ven0Var = null;
            }
            if (z) {
                x340Var.i0(146499837);
                boolean zG2 = x340Var.g(ven0Var);
                Object objT5 = x340Var.T();
                if (zG2 || objT5 == m4cVar) {
                    objT5 = new g45(ven0Var, (byte) 3);
                    x340Var.s0(objT5);
                }
                x340Var.r(false);
                iu30Var3 = (iu30) objT5;
            } else {
                x340Var.i0(146571260);
                x340Var.r(false);
                iu30Var3 = null;
            }
            int i14 = (i8 >> 3) & 14;
            ven0 ven0Var2 = ven0Var;
            oae1 oae1Var2 = oae1Var;
            ffa.a(af5Var, lee1Var, f930Var, list2, z2, x340Var);
            af5 af5Var2 = (af5) function1.invoke();
            boolean zI = x340Var.i(oae1Var2) | ((i8 & 896) == 256);
            Object objT6 = x340Var.T();
            if (zI || objT6 == m4cVar) {
                objT6 = new afa(oae1Var2, iu30Var, (byte) 0);
                x340Var.s0(objT6);
            }
            qim0 qim0VarE0 = e0(qim0Var, af5Var2, lee1Var, (iu30) objT6, i, z2, i2, i3, f930Var, list2, iu30Var3, x9hVar, iu30Var2, m0e1Var);
            if (z) {
                x340Var.i0(147956465);
                boolean zI2 = x340Var.i(oae1Var2);
                Object objT7 = x340Var.T();
                if (zI2 || objT7 == m4cVar) {
                    objT7 = new bfa(oae1Var2, (byte) 1);
                    x340Var.s0(objT7);
                }
                Function0 function2 = (Function0) objT7;
                boolean zG3 = x340Var.g(ven0Var2);
                Object objT8 = x340Var.T();
                if (zG3 || objT8 == m4cVar) {
                    objT8 = new e45(ven0Var2, (byte) 2);
                    x340Var.s0(objT8);
                }
                qy4Var = new qy4(function2, (Function0) objT8, (byte) 2);
                x340Var.r(false);
            } else {
                x340Var.i0(147779703);
                boolean zI3 = x340Var.i(oae1Var2);
                Object objT9 = x340Var.T();
                if (zI3 || objT9 == m4cVar) {
                    z4 = false;
                    objT9 = new bfa(oae1Var2, (byte) 0);
                    x340Var.s0(objT9);
                } else {
                    z4 = false;
                }
                qy4Var = new hu6((Function0) objT9, (byte) 2);
                x340Var.r(z4);
            }
            int iHashCode = Long.hashCode(tgp1.l(x340Var));
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarE0);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(qy4Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (oae1Var2 == null) {
                x340Var.i0(-433557001);
                z3 = false;
            } else {
                z3 = false;
                x340Var.i0(-291080374);
                oae1Var2.a(x340Var, 0);
            }
            x340Var.r(z3);
            if (list3 == null) {
                x340Var.i0(-433506223);
            } else {
                x340Var.i0(-433506222);
                df5.a(af5Var, list3, x340Var, i14);
            }
            x340Var.r(z3);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cfa(qim0Var, af5Var, iu30Var, z, map, lee1Var, i, z2, i2, i3, f930Var, x9hVar, iu30Var2, m0e1Var, i4, i5);
        }
    }

    public static boolean d0(yr31 yr31Var, char c2) {
        while (yr31Var.e()) {
            char cK = yr31Var.k();
            if (cK == '\\') {
                yr31Var.h();
                char cK2 = yr31Var.k();
                switch (cK2) {
                    case '!':
                    case '\"':
                    case '#':
                    case '$':
                    case '%':
                    case '&':
                    case '\'':
                    case '(':
                    case ')':
                    case '*':
                    case PlaylistDecorationPolicy.EXTENSION_FIELD_NUMBER /* 43 */:
                    case PlaylistDecorationPolicy.LENSES_FIELD_NUMBER /* 44 */:
                    case PlaylistDecorationPolicy.LENGTH_IGNORING_TEXT_FILTER_FIELD_NUMBER /* 45 */:
                    case PlaylistDecorationPolicy.NUMBER_OF_ITEMS_PER_LINK_TYPE_FIELD_NUMBER /* 46 */:
                    case PlaylistDecorationPolicy.AVAILABLE_SIGNALS_FIELD_NUMBER /* 47 */:
                        yr31Var.h();
                        break;
                    default:
                        switch (cK2) {
                            case PlaylistDecorationPolicy.CONTAINS_MUSIC_VIDEOS_FIELD_NUMBER /* 58 */:
                            case PlaylistDecorationPolicy.TAG_MANIFEST_FIELD_NUMBER /* 59 */:
                            case '<':
                            case '=':
                            case '>':
                            case '?':
                            case '@':
                                yr31Var.h();
                                break;
                            default:
                                switch (cK2) {
                                    case '[':
                                    case '\\':
                                    case ']':
                                    case '^':
                                    case '_':
                                    case '`':
                                        yr31Var.h();
                                        break;
                                    default:
                                        switch (cK2) {
                                            case '{':
                                            case '|':
                                            case '}':
                                            case '~':
                                                break;
                                            default:
                                                continue;
                                        }
                                        yr31Var.h();
                                        break;
                                }
                                break;
                        }
                        break;
                }
            } else {
                if (cK == c2) {
                    return true;
                }
                if (c2 == ')' && cK == '(') {
                    return false;
                }
                yr31Var.h();
            }
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void e(xoh0 xoh0Var, LruCache lruCache, q8n q8nVar, qim0 qim0Var, boolean z, Integer num, boolean z2, Function0 function0, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        int i2;
        int i3;
        int i4;
        int i5;
        String strK;
        p8i0 p8i0Var;
        jmr0 jmr0VarA;
        x340 x340Var2;
        int i6;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var3 = (x340) b0kVar;
        x340Var3.k0(560073768);
        int i7 = i | (x340Var3.g(xoh0Var) ? 4 : 2) | (x340Var3.i(lruCache) ? 32 : 16) | (x340Var3.i(q8nVar) ? 256 : 128) | 3072 | (x340Var3.h(z) ? 16384 : 8192) | (x340Var3.g(num) ? 131072 : 65536) | (x340Var3.h(z2) ? 1048576 : 524288) | (x340Var3.i(function0) ? 8388608 : 4194304);
        if (x340Var3.Y(i7 & 1, (4793491 & i7) != 4793490)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var3).b;
            p8i0 p8i0VarG = xoh0Var.g();
            p8i0 p8i0Var2 = p8i0.c;
            if (p8i0VarG == p8i0Var2) {
                i2 = -789924523;
                i3 = 2131958430;
            } else {
                i2 = -789850123;
                i3 = 2131958424;
            }
            String strK2 = x0d.k(x340Var3, i2, i3, x340Var3, false);
            if (z) {
                x340Var3.i0(1359998365);
                strK = cwl1.n0(2131958427, new Object[]{Integer.valueOf((num != null ? num.intValue() : 0) + 1)}, x340Var3);
                x340Var3.r(false);
            } else {
                if (z2) {
                    i4 = 1360001664;
                    i5 = 2131958425;
                } else {
                    i4 = 1360003942;
                    i5 = 2131958426;
                }
                strK = x0d.k(x340Var3, i4, i5, x340Var3, false);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = d7e.s(u291.f(qim0Var3, 1.0f), 1.0f);
            boolean zG = x340Var3.g(strK2) | x340Var3.g(strK);
            Object objT = x340Var3.T();
            if (zG || objT == m4cVar) {
                objT = new os(strK2, strK, (byte) 20);
                x340Var3.s0(objT);
            }
            qim0 qim0VarX = bin.x(s161.b(qim0VarS, true, (iu30) objT), !z2, (String) null, (pm31) null, (idn0) null, function0, 14);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(tgp1.l(x340Var3));
            xos0 xos0VarM = x340Var3.m();
            qim0 qim0VarE = zr7.E(x340Var3, qim0VarX);
            hzj.A.getClass();
            if (x340Var3.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var3.m0();
            if (x340Var3.S) {
                x340Var3.l(hmb0.t1);
            } else {
                x340Var3.v0();
            }
            nko1.H(gfh0VarC, x340Var3, y580.O0);
            nko1.H(xos0VarM, x340Var3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var3, y580.R0);
            nko1.F(x340Var3);
            nko1.H(qim0VarE, x340Var3, y580.Y);
            if (xoh0Var.g() == p8i0Var2) {
                x340Var3.i0(2113809567);
                jmr0VarA = i6p1.t(xoh0Var.a(), lruCache, q8nVar, x340Var3, i7 & 1008);
                x340Var3.r(false);
                x340Var2 = x340Var3;
                p8i0Var = p8i0Var2;
            } else {
                x340Var3.i0(2113972038);
                p8i0Var = p8i0Var2;
                jmr0VarA = oi7.a(xoh0Var.a(), null, null, null, null, null, false, false, null, null, null, null, 0L, x340Var3, 0, 0, 131070);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            x340 x340Var4 = x340Var2;
            qim0Var2 = qim0Var3;
            eso1.h(jmr0VarA, isl.a, u291.d(qim0Var3, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, x340Var4, 1576376, 432);
            x340Var = x340Var4;
            h2c h2cVar = h2c.a;
            if (z) {
                x340Var.i0(2114267065);
                qim0 qim0VarD = u291.d(qim0Var2, 1.0f);
                int i8 = u7h.l;
                t1c.a(dug.g(u7h.b(nfb.i(), 0.3f, 0.0f, 0.0f, 0.0f, 14), qim0VarD), x340Var, 6);
                i6 = 1;
                eio1.k((num != null ? num.intValue() : 0) + 1, 0, x340Var, uyn1.x(h2cVar.a(qim0Var2, een.Y), 6.0f));
                x340Var.r(false);
            } else {
                i6 = 1;
                if (z2) {
                    x340Var.i0(2114542903);
                    qim0 qim0VarD2 = u291.d(qim0Var2, 1.0f);
                    int i9 = u7h.l;
                    t1c.a(dug.g(u7h.b(nfb.i(), 0.6f, 0.0f, 0.0f, 0.0f, 14), qim0VarD2), x340Var, 6);
                    x340Var.r(false);
                } else {
                    x340Var.i0(2114643808);
                    x340Var.r(false);
                }
            }
            if (xoh0Var.g() != p8i0Var || xoh0Var.b() <= 0) {
                z3 = i6;
                x340Var.i0(2115221152);
                x340Var.r(false);
            } else {
                x340Var.i0(2114731817);
                long jB = xoh0Var.b() / 1000;
                String str = String.format((jB / 60) + ":%02d", Arrays.copyOf(new Object[]{Long.valueOf(jB % 60)}, i6));
                lee1 lee1Var = cbx.d(x340Var).j;
                int i10 = u7h.l;
                long jQ = nfb.q();
                qim0 qim0VarX2 = uyn1.x(h2cVar.a(qim0Var2, een.t), 6.0f);
                long jB2 = u7h.b(nfb.i(), 0.6f, 0.0f, 0.0f, 0.0f, 14);
                cua cuaVar = cbx.b(x340Var).f;
                z3 = 1;
                uwo1.e(str, uyn1.y(dug.f(qim0VarX2, jB2, er31.b(2.0f)), 6.0f, 2.0f), lee1Var, jQ, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 3072, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(z3);
        } else {
            x340Var = x340Var3;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m8m(xoh0Var, lruCache, q8nVar, qim0Var2, z, num, z2, function0, i);
        }
    }

    public static final qim0 e0(qim0 qim0Var, af5 af5Var, lee1 lee1Var, iu30 iu30Var, int i, boolean z, int i2, int i3, f930 f930Var, List list, iu30 iu30Var2, x9h x9hVar, iu30 iu30Var3, m0e1 m0e1Var) {
        return qim0Var.then(nim0.a).then(new d0e1(af5Var, lee1Var, f930Var, iu30Var, i, z, i2, i3, list, iu30Var2, x9hVar, m0e1Var, iu30Var3));
    }

    public static final void f(gt40 gt40Var, int i, j2i j2iVar, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1618370649);
        int i6 = i3 & 1;
        if (i6 != 0) {
            i4 = i2 | 6;
        } else {
            i4 = (x340Var.g(gt40Var) ? 4 : 2) | i2;
        }
        int i7 = i4 | 48;
        int i8 = i3 & 4;
        if (i8 != 0) {
            i5 = i4 | 432;
        } else {
            i5 = (x340Var.e(i) ? 256 : 128) | i7;
        }
        if ((i5 & 1171) == 1170 && x340Var.H()) {
            x340Var.b0();
        } else {
            if (i6 != 0) {
                gt40Var = et40.a;
            }
            if (i8 != 0) {
                i = 0;
            }
            cw31 cw31Var = cw31.a;
            x340Var.j0(578571862);
            x340Var.j0(-548224868);
            if (!(x340Var.a instanceof i06)) {
                tgp1.p();
                throw null;
            }
            x340Var.g0();
            if (x340Var.S) {
                x340Var.l(cw31Var);
            } else {
                x340Var.v0();
            }
            nko1.H(gt40Var, x340Var, jh31.g);
            nko1.H(ol3.a(i), x340Var, jh31.h);
            nko1.H(ml3.a(0), x340Var, jh31.i);
            j2iVar.invoke(ow31.a, x340Var, 54);
            x340Var.r(true);
            x340Var.r(false);
            x340Var.r(false);
        }
        gt40 gt40Var2 = gt40Var;
        int i9 = i;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dw31(gt40Var2, i9, j2iVar, i2, i3);
        }
    }

    public static String f0(int i) {
        Object[] objArr = {Integer.valueOf(Color.red(i)), Integer.valueOf(Color.green(i)), Integer.valueOf(Color.blue(i)), Double.valueOf(((double) Color.alpha(i)) / 255.0d)};
        String str = zoi1.a;
        return String.format(Locale.US, "rgba(%d,%d,%d,%.3f)", objArr);
    }

    public static j2i1 g(String str) {
        String str2 = s8s0.b;
        StringBuilder sb = new StringBuilder();
        sb.append("file:");
        if (str != null) {
            sb.append(str);
        }
        return new j2i1(sb.toString(), str2, "file", (String) null, str);
    }

    public static String g0(long j) {
        if (x(j, 12884901888L)) {
            return "Rgb";
        }
        if (x(j, 12884901889L)) {
            return "Xyz";
        }
        if (x(j, 12884901890L)) {
            return "Lab";
        }
        return x(j, 17179869187L) ? "Cmyk" : "Unknown";
    }

    public static final void h(mr20 mr20Var, qim0 qim0Var, int i, float f, boolean z, float f2, ldl1 ldl1Var, b0k b0kVar, int i2) {
        int i3;
        float f3;
        int i4;
        float f4;
        int i5;
        float[] fArr;
        int i6;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-192687937);
        int i7 = (i2 & 6) == 0 ? (x340Var.i(mr20Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i7 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        int i8 = i7 | 384;
        if ((i2 & 3072) == 0) {
            i8 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i8 |= x340Var.h(z) ? 16384 : 8192;
        }
        int i9 = i8 | 196608;
        if ((1572864 & i2) == 0) {
            i9 |= x340Var.g(ldl1Var) ? 1048576 : 524288;
        }
        int i10 = i9;
        if (x340Var.Y(i10 & 1, (599187 & i10) != 599186)) {
            x340Var.d0();
            if ((i2 & 1) == 0 || x340Var.E()) {
                i4 = 120;
                f4 = 0.3f;
            } else {
                x340Var.b0();
                i4 = i;
                f4 = f2;
            }
            x340Var.s();
            int i11 = i10 & 896;
            int i12 = i10 & 7168;
            boolean z2 = (i11 == 256) | (i12 == 2048);
            Object objT = x340Var.T();
            Object obj = objT;
            if (z2 || objT == m4cVar) {
                float[] fArr2 = new float[i4];
                for (int i13 = 0; i13 < i4; i13++) {
                    fArr2[i13] = f;
                }
                x340Var.s0(fArr2);
                obj = fArr2;
            }
            float[] fArr3 = (float[]) obj;
            boolean z3 = (i12 == 2048) | (i11 == 256);
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                float[] fArr4 = new float[i4];
                for (int i14 = 0; i14 < i4; i14++) {
                    fArr4[i14] = f;
                }
                objT2 = xto.t(fArr4);
                x340Var.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = x340Var.i(mr20Var) | x340Var.i(fArr3) | (i11 == 256) | ((57344 & i10) == 16384) | x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                i5 = i4;
                fArr = fArr3;
                i6 = 256;
                p230 p230Var = new p230(mr20Var, fArr, i5, z, ven0Var, (lnm) null);
                x340Var.s0(p230Var);
                objT3 = p230Var;
            } else {
                fArr = fArr3;
                i5 = i4;
                i6 = 256;
            }
            qxd0.t(mr20Var, x340Var, (vu30) objT3);
            if (z) {
                x340Var.i0(2005831954);
                boolean zI2 = x340Var.i(ven0Var) | (i11 == i6) | x340Var.i(fArr) | ((458752 & i10) == 131072);
                Object objT4 = x340Var.T();
                if (zI2 || objT4 == m4cVar) {
                    objT4 = new lw31(i5, fArr, f4, ven0Var, (lnm) null);
                    x340Var.s0(objT4);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT4);
                x340Var.r(false);
            } else {
                x340Var.i0(2006125059);
                x340Var.r(false);
            }
            i((float[]) ven0Var.getValue(), qim0Var, ldl1Var, x340Var, (i10 & 112) | ((i10 >> 12) & 896));
            i3 = i5;
            f3 = f4;
        } else {
            x340Var.b0();
            i3 = i;
            f3 = f2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eel1(mr20Var, qim0Var, i3, f, z, f3, ldl1Var, i2);
        }
    }

    public static j2i1 h0(String str) {
        String strSubstring;
        String strSubstring2;
        String str2 = s8s0.b;
        String strW = !u890.j(str2, "/") ? nhc1.W(str, str2, "/") : str;
        int i = 0;
        boolean z = true;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        while (i < strW.length()) {
            char cCharAt = strW.charAt(i);
            if (cCharAt != '#') {
                if (cCharAt != '/') {
                    if (cCharAt != ':') {
                        if (cCharAt == '?' && i4 == -1 && i2 == -1) {
                            i4 = i + 1;
                        }
                    } else if (z && i4 == -1 && i2 == -1) {
                        int i7 = i + 2;
                        if (i7 < str.length() && str.charAt(i + 1) == '/' && str.charAt(i7) == '/') {
                            i5 = i + 3;
                            z = false;
                            i6 = i;
                            i = i7;
                        } else if (strW.equals(str)) {
                            i3 = i + 1;
                            i6 = i;
                            i = i3;
                            i5 = i;
                        }
                    }
                } else if (i3 == -1 && i4 == -1 && i2 == -1) {
                    i3 = i5 == -1 ? 0 : i;
                    z = false;
                }
            } else if (i2 == -1) {
                i2 = i + 1;
            }
            i++;
        }
        int iMin = Math.min(i2 == -1 ? Integer.MAX_VALUE : i2 - 1, strW.length());
        int iMin2 = Math.min(i4 == -1 ? Integer.MAX_VALUE : i4 - 1, iMin);
        if (i5 != -1) {
            strSubstring2 = strW.substring(0, i6);
            strSubstring = strW.substring(i5, Math.min(i3 != -1 ? i3 : Integer.MAX_VALUE, iMin2));
        } else {
            strSubstring = null;
            strSubstring2 = null;
        }
        String strSubstring3 = i3 != -1 ? strW.substring(i3, iMin2) : null;
        String strSubstring4 = i4 != -1 ? strW.substring(i4, iMin) : null;
        String strSubstring5 = i2 != -1 ? strW.substring(i2, strW.length()) : null;
        byte[] bArr = new byte[Math.max(0, Math.max(strSubstring2 != null ? strSubstring2.length() : 0, Math.max(strSubstring != null ? strSubstring.length() : 0, Math.max(strSubstring3 != null ? strSubstring3.length() : 0, Math.max(strSubstring4 != null ? strSubstring4.length() : 0, strSubstring5 != null ? strSubstring5.length() : 0)))) - 2)];
        String strP = strSubstring2 != null ? P(strSubstring2, bArr) : null;
        String strP2 = strSubstring != null ? P(strSubstring, bArr) : null;
        String strP3 = strSubstring3 != null ? P(strSubstring3, bArr) : null;
        if (strSubstring4 != null) {
            P(strSubstring4, bArr);
        }
        if (strSubstring5 != null) {
            P(strSubstring5, bArr);
        }
        return new j2i1(strW, str2, strP, strP2, strP3);
    }

    public static final void i(float[] fArr, qim0 qim0Var, ldl1 ldl1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1681913873);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(fArr) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(ldl1Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean zI = x340Var.i(fArr) | ((((i2 & 896) ^ 384) > 256 && x340Var.g(ldl1Var)) || (i2 & 384) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new hij1(ldl1Var, fArr, (byte) 23);
                x340Var.s0(objT);
            }
            j0o1.b((i2 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ixi1(fArr, qim0Var, ldl1Var, i, (byte) 15);
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0088  */
    /* JADX WARN: Code duplicated, block: B:26:0x00ad A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:27:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00ae -> B:28:0x00b6). Please report as a decompilation issue!!! */
    /*  JADX ERROR: StackOverflowError in pass: RegionMakerVisitor
        java.lang.StackOverflowError
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:731)
        	at jadx.core.utils.BlockUtils.traverseSuccessorsUntil(BlockUtils.java:749)
        */
    public static final java.lang.Object i0(p.l8y r10, p.zy70 r11, p.dqq0 r12, p.va00 r13, p.onm r14) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.jch0.i0(p.l8y, p.zy70, p.dqq0, p.va00, p.onm):java.lang.Object");
    }

    public static final nsw j(zu30 zu30Var) {
        return new nsw(zu30Var, false);
    }

    public static Set j0(v360 v360Var) {
        int size = v360Var.size();
        TreeSet treeSet = null;
        for (int i = 0; i < size; i++) {
            if ("Vary".equalsIgnoreCase(m5n1.h(v360Var, i))) {
                String strJ = m5n1.j(v360Var, i);
                if (treeSet == null) {
                    treeSet = new TreeSet(String.CASE_INSENSITIVE_ORDER);
                }
                Iterator it = ihc1.P0(strJ, new char[]{','}, 6).iterator();
                while (it.hasNext()) {
                    treeSet.add(ihc1.e1((String) it.next()).toString());
                }
            }
        }
        return treeSet == null ? w7x.a : treeSet;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object k(bs41 bs41Var, float f, ie5 ie5Var, e9r e9rVar, iu30 iu30Var, onm onmVar) {
        tu91 tu91Var;
        float f2;
        m811 m811Var;
        if (onmVar instanceof tu91) {
            tu91Var = (tu91) onmVar;
            int i = tu91Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                tu91Var.e = i - Integer.MIN_VALUE;
            } else {
                tu91Var = new tu91(onmVar);
            }
        } else {
            tu91Var = new tu91(onmVar);
        }
        Object obj = tu91Var.d;
        int i2 = tu91Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            m811 m811Var2 = new m811();
            boolean z = ((Number) ie5Var.c()).floatValue() == 0.0f;
            su91 su91Var = new su91(f, m811Var2, bs41Var, iu30Var, (byte) 0);
            tu91Var.b = ie5Var;
            tu91Var.c = m811Var2;
            tu91Var.a = f;
            tu91Var.e = 1;
            Object objU = wwo1.u(ie5Var, e9rVar, !z, su91Var, tu91Var);
            d9n d9nVar = d9n.a;
            if (objU == d9nVar) {
                return d9nVar;
            }
            f2 = f;
            m811Var = m811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = tu91Var.a;
            m811Var = tu91Var.c;
            ie5Var = tu91Var.b;
            hm5.M(obj);
        }
        return new be5(yah0.o(f2 - m811Var.a), ie5Var);
    }

    public static String k0(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String string;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                string = "null";
            } else {
                try {
                    string = obj.toString();
                } catch (Exception e) {
                    String name = obj.getClass().getName();
                    String hexString = Integer.toHexString(System.identityHashCode(obj));
                    String strQ = l1d.q(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strQ), (Throwable) e);
                    String name2 = e.getClass().getName();
                    StringBuilder sb = new StringBuilder(name2.length() + strQ.length() + 8 + 1);
                    sb.append("<");
                    sb.append(strQ);
                    sb.append(" threw ");
                    sb.append(name2);
                    sb.append(">");
                    string = sb.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb2 = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb2.append((CharSequence) str, i3, iIndexOf);
            sb2.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb2.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb2.append(" [");
            sb2.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb2.append(", ");
                sb2.append(objArr[i4]);
            }
            sb2.append(']');
        }
        return sb2.toString();
    }

    public static final void q(de5 de5Var, bs41 bs41Var, iu30 iu30Var, float f) {
        float f2;
        try {
            f2 = bs41Var.f(f);
        } catch (CancellationException unused) {
            de5Var.a();
            f2 = 0.0f;
        }
        iu30Var.invoke(Float.valueOf(f2));
        if (Math.abs(f - f2) > 0.5f) {
            de5Var.a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object r(bs41 bs41Var, float f, float f2, ie5 ie5Var, fe5 fe5Var, iu30 iu30Var, onm onmVar) {
        uu91 uu91Var;
        float f3;
        ie5 ie5Var2;
        float f4;
        m811 m811Var;
        if (onmVar instanceof uu91) {
            uu91Var = (uu91) onmVar;
            int i = uu91Var.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                uu91Var.f = i - Integer.MIN_VALUE;
            } else {
                uu91Var = new uu91(onmVar);
            }
        } else {
            uu91Var = new uu91(onmVar);
        }
        uu91 uu91Var2 = uu91Var;
        Object obj = uu91Var2.e;
        int i2 = uu91Var2.f;
        if (i2 == 0) {
            hm5.M(obj);
            m811 m811Var2 = new m811();
            float fFloatValue = ((Number) ie5Var.c()).floatValue();
            Float fO = yah0.o(f);
            boolean z = !(((Number) ie5Var.c()).floatValue() == 0.0f);
            su91 su91Var = new su91(f2, m811Var2, bs41Var, iu30Var, (byte) 1);
            uu91Var2.c = ie5Var;
            uu91Var2.d = m811Var2;
            f3 = f;
            uu91Var2.a = f3;
            uu91Var2.b = fFloatValue;
            uu91Var2.f = 1;
            Object objV = wwo1.v(ie5Var, fO, fe5Var, z, su91Var, uu91Var2);
            d9n d9nVar = d9n.a;
            if (objV == d9nVar) {
                return d9nVar;
            }
            ie5Var2 = ie5Var;
            f4 = fFloatValue;
            m811Var = m811Var2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f4 = uu91Var2.b;
            f3 = uu91Var2.a;
            m811Var = uu91Var2.d;
            ie5Var2 = uu91Var2.c;
            hm5.M(obj);
        }
        return new be5(yah0.o(f3 - m811Var.a), prn1.l(ie5Var2, 0.0f, v(((Number) ie5Var2.c()).floatValue(), f4), 29));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object s(ssw0 ssw0Var, Function0 function0, lnm lnmVar) {
        msw0 msw0Var;
        if (lnmVar instanceof msw0) {
            msw0Var = (msw0) lnmVar;
            int i = msw0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                msw0Var.c = i - Integer.MIN_VALUE;
            } else {
                msw0Var = new msw0(lnmVar);
            }
        } else {
            msw0Var = new msw0(lnmVar);
        }
        Object obj = msw0Var.b;
        int i2 = msw0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                if (msw0Var.getContext().A(fkj0.W0) != ssw0Var) {
                    eg.m("awaitClose() can only be invoked from the producer context");
                    return null;
                }
                msw0Var.a = function0;
                msw0Var.c = 1;
                ohd ohdVar = new ohd(1, aym.t(msw0Var));
                ohdVar.t();
                ssw0Var.B(new gqb0(ohdVar, (byte) 10));
                Object objR = ohdVar.r();
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                function0 = msw0Var.a;
                hm5.M(obj);
            }
            function0.invoke();
            return rih1.a;
        } catch (Throwable th) {
            function0.invoke();
            throw th;
        }
    }

    public static final float t(ruq0 ruq0Var, Float f) {
        Integer numB = ruq0Var.b();
        if (numB != null && numB.intValue() > 0 && ruq0Var.g() > 0) {
            return ((numB.intValue() * 4) * 60000.0f) / ruq0Var.g();
        }
        if (f != null) {
            return f.floatValue();
        }
        return 120.0f;
    }

    public static final mmr0 u(r8i0 r8i0Var) {
        Charset charset = nne.a;
        if (r8i0Var != null) {
            se11 se11Var = r8i0.e;
            Charset charsetA = r8i0Var.a(null);
            if (charsetA == null) {
                try {
                    r8i0Var = bmq0.w(r8i0Var + "; charset=utf-8");
                } catch (IllegalArgumentException unused) {
                    r8i0Var = null;
                }
            } else {
                charset = charsetA;
            }
        }
        return oqn1.n(charset, r8i0Var);
    }

    public static final float v(float f, float f2) {
        if (f2 == 0.0f) {
            return 0.0f;
        }
        return (f2 <= 0.0f ? f >= f2 : f <= f2) ? f : f2;
    }

    public static final File w(Context context, String str) {
        return new File(context.getApplicationContext().getFilesDir(), u890.A(str, "datastore/"));
    }

    public static final boolean x(long j, long j2) {
        return j == j2;
    }

    public static final String y(j2i1 j2i1Var) {
        List listZ = z(j2i1Var);
        String str = j2i1Var.b;
        if (listZ.isEmpty()) {
            return null;
        }
        String str2 = j2i1Var.e;
        str2.getClass();
        if (!nhc1.Y(str2, str, false)) {
            str = "";
        }
        return o7h.y0(listZ, j2i1Var.b, str, null, null, 60);
    }

    public static final List z(j2i1 j2i1Var) {
        String str = j2i1Var.e;
        if (str == null) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        int i = -1;
        while (i < str.length()) {
            int i2 = i + 1;
            int iV0 = ihc1.v0(str, '/', i2, 4);
            if (iV0 == -1) {
                iV0 = str.length();
            }
            String strSubstring = str.substring(i2, iV0);
            if (strSubstring.length() > 0) {
                arrayList.add(strSubstring);
            }
            i = iV0;
        }
        return arrayList;
    }

    public wt50 F(CharSequence charSequence, Charset charset) {
        return M().T(charSequence.toString().getBytes(charset)).C();
    }

    public wt50 H(String str) {
        int length = str.length() * 2;
        dm5.l("expectedInputSize must be >= 0 but was %s", length, length >= 0);
        bmq0 bmq0VarM = M();
        int length2 = str.length();
        for (int i = 0; i < length2; i++) {
            bmq0VarM.V(str.charAt(i));
        }
        return bmq0VarM.C();
    }

    public bmq0 M() {
        return new wym0();
    }

    public abstract View N(int i);

    public abstract boolean O();
}
