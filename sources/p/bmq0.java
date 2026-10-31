package p;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.icu.text.BreakIterator;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.Base64;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.ComposeView;
import com.facebook.FacebookException;
import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.lang.reflect.Array;
import java.security.MessageDigest;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class bmq0 {
    public static final Object[] a = new Object[0];

    public static final int A(int i, int i2, int i3) {
        if (i3 > 0) {
            if (i < i2) {
                int i4 = i2 % i3;
                if (i4 < 0) {
                    i4 += i3;
                }
                int i5 = i % i3;
                if (i5 < 0) {
                    i5 += i3;
                }
                int i6 = (i4 - i5) % i3;
                if (i6 < 0) {
                    i6 += i3;
                }
                return i2 - i6;
            }
        } else {
            if (i3 >= 0) {
                hhg1.n("Step is zero.");
                return 0;
            }
            if (i > i2) {
                int i7 = -i3;
                int i8 = i % i7;
                if (i8 < 0) {
                    i8 += i7;
                }
                int i9 = i2 % i7;
                if (i9 < 0) {
                    i9 += i7;
                }
                int i10 = (i8 - i9) % i7;
                if (i10 < 0) {
                    i10 += i7;
                }
                return i10 + i2;
            }
        }
        return i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final long B(va51 va51Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(51569851);
        if (va51Var.g()) {
            x340Var.i0(-1280782364);
            uwr uwrVar = cbx.a;
            long j2 = cbx.a(x340Var).b.b;
            x340Var.r(false);
            x340Var.r(false);
            return j2;
        }
        x340Var.i0(-1280748729);
        x340Var.r(false);
        int iC = l1d.C(va51Var.e());
        if (iC == 0 || iC == 1) {
            x340Var.i0(-1980971865);
            uwr uwrVar2 = cbx.a;
            j = cbx.a(x340Var).b.c;
            x340Var.r(false);
        } else {
            if (iC != 2) {
                throw p3d1.k(x340Var, -1980976604, false);
            }
            x340Var.i0(-1980974401);
            uwr uwrVar3 = cbx.a;
            j = cbx.a(x340Var).b.a;
            x340Var.r(false);
        }
        x340Var.r(false);
        return j;
    }

    public static boolean F(String str) {
        return ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) ? false : true;
    }

    public static final boolean G(String str) {
        if (str.length() != 0 && str.length() >= 43 && str.length() <= 128) {
            return Pattern.compile("^[-._~A-Za-z0-9]+$").matcher(str).matches();
        }
        return false;
    }

    public static int H(int i, int i2, int i3) throws IOException {
        if ((i2 & 8) != 0) {
            i--;
        }
        if (i3 <= i) {
            return i - i3;
        }
        k220.i(cy30.i(i3, "PROTOCOL_ERROR padding ", i, " > remaining length "));
        return 0;
    }

    public static final guf0 I(guf0 guf0Var, int i) {
        guf0 guf0Var2;
        guf0 guf0Var3 = null;
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        int i2 = 0;
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var.b(1);
            int iB3 = guf0Var.b(2);
            int i3 = (iB2 - i) + 1;
            guf0 guf0Var4 = new guf0(new int[]{iB, i3, iB3});
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var4.a();
            int i4 = 0;
            while (i4 < iB) {
                int i5 = i2;
                while (i5 < iB3) {
                    int i6 = i2;
                    while (i6 < i3) {
                        int i7 = i6 * iB3;
                        int i8 = (i4 * i3 * iB3) + i7 + i5;
                        int i9 = (i4 * iB2 * iB3) + i7 + i5;
                        fArrA2[i8] = Float.MIN_VALUE;
                        int i10 = i2;
                        while (i10 < i) {
                            guf0Var2 = guf0Var3;
                            try {
                                fArrA2[i8] = Math.max(fArrA2[i8], fArrA[(i10 * iB3) + i9]);
                                i10++;
                                guf0Var3 = guf0Var2;
                            } catch (Throwable th) {
                                th = th;
                                dhn.a(bmq0.class, th);
                                return guf0Var2;
                            }
                        }
                        i6++;
                        i2 = 0;
                    }
                    i5++;
                    i2 = 0;
                }
                i4++;
                i2 = 0;
            }
            return guf0Var4;
        } catch (Throwable th2) {
            th = th2;
            guf0Var2 = guf0Var3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float J(p5t0 p5t0Var, boolean z, zy31[] zy31VarArr, float f) {
        float f2 = Float.NaN;
        for (zy31 zy31Var : zy31VarArr) {
            float fA = p5t0Var.a(zy31Var);
            if (Float.isNaN(f2)) {
                f2 = fA;
            } else if (z == (fA > f2)) {
                f2 = fA;
            }
        }
        return Float.isNaN(f2) ? f : f2;
    }

    public static final guf0 K(guf0 guf0Var, guf0 guf0Var2) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var2.b(0);
            int iB3 = guf0Var2.b(1);
            guf0 guf0Var3 = new guf0(new int[]{iB, iB3});
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var2.a();
            float[] fArrA3 = guf0Var3.a();
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iB3; i2++) {
                    int i3 = (i * iB3) + i2;
                    fArrA3[i3] = 0.0f;
                    for (int i4 = 0; i4 < iB2; i4++) {
                        fArrA3[i3] = (fArrA[(i * iB2) + i4] * fArrA2[(i4 * iB3) + i2]) + fArrA3[i3];
                    }
                }
            }
            return guf0Var3;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    public static final qim0 L(qim0 qim0Var, d6o0 d6o0Var, g6o0 g6o0Var) {
        return qim0Var.then(new h6o0(d6o0Var, g6o0Var));
    }

    public static PorterDuff.Mode M(int i) {
        if (i == 0) {
            return null;
        }
        switch (l1d.C(i)) {
            case 0:
                return PorterDuff.Mode.CLEAR;
            case 1:
                return PorterDuff.Mode.SRC;
            case 2:
                return PorterDuff.Mode.DST;
            case 3:
                return PorterDuff.Mode.SRC_OVER;
            case 4:
                return PorterDuff.Mode.DST_OVER;
            case 5:
                return PorterDuff.Mode.SRC_IN;
            case 6:
                return PorterDuff.Mode.DST_IN;
            case 7:
                return PorterDuff.Mode.SRC_OUT;
            case 8:
                return PorterDuff.Mode.DST_OUT;
            case 9:
                return PorterDuff.Mode.SRC_ATOP;
            case 10:
                return PorterDuff.Mode.DST_ATOP;
            case 11:
                return PorterDuff.Mode.XOR;
            case 12:
                return PorterDuff.Mode.ADD;
            case 13:
                return PorterDuff.Mode.MULTIPLY;
            case 14:
                return PorterDuff.Mode.SCREEN;
            case 15:
                return PorterDuff.Mode.OVERLAY;
            case 16:
                return PorterDuff.Mode.DARKEN;
            case 17:
                return PorterDuff.Mode.LIGHTEN;
            default:
                return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object W(ola1 ola1Var, onm onmVar) {
        vpi1 vpi1Var;
        ola1 ola1Var2;
        Throwable th;
        nac nacVar;
        if (onmVar instanceof vpi1) {
            vpi1Var = (vpi1) onmVar;
            int i = vpi1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                vpi1Var.d = i - Integer.MIN_VALUE;
            } else {
                vpi1Var = new vpi1(onmVar);
            }
        } else {
            vpi1Var = new vpi1(onmVar);
        }
        Object obj = vpi1Var.c;
        int i2 = vpi1Var.d;
        if (i2 != 0) {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            nacVar = vpi1Var.b;
            ola1Var2 = vpi1Var.a;
            try {
                hm5.M(obj);
                o0c.v(ola1Var2, (Throwable) null);
                return nacVar;
            } catch (Throwable th2) {
                th = th2;
                try {
                    throw th;
                } catch (Throwable th3) {
                    o0c.v(ola1Var2, th);
                    throw th3;
                }
            }
        }
        hm5.M(obj);
        try {
            nac nacVar2 = new nac();
            vpi1Var.a = ola1Var;
            vpi1Var.b = nacVar2;
            vpi1Var.d = 1;
            ola1Var.a(nacVar2);
            d9n d9nVar = rih1.a;
            d9n d9nVar2 = d9n.a;
            if (d9nVar == d9nVar2) {
                return d9nVar2;
            }
            ola1Var2 = ola1Var;
            nacVar = nacVar2;
            o0c.v(ola1Var2, (Throwable) null);
            return nacVar;
        } catch (Throwable th4) {
            ola1Var2 = ola1Var;
            th = th4;
            throw th;
        }
    }

    public static final void X(guf0 guf0Var) {
        if (dhn.a.contains(bmq0.class)) {
            return;
        }
        try {
            float[] fArrA = guf0Var.a();
            int length = fArrA.length;
            for (int i = 0; i < length; i++) {
                if (fArrA[i] < 0.0f) {
                    fArrA[i] = 0.0f;
                }
            }
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
        }
    }

    public static final void Y(int i, int i2, Object[] objArr) {
        while (i < i2) {
            objArr[i] = null;
            i++;
        }
    }

    public static int Z(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0133  */
    /* JADX WARN: Code duplicated, block: B:108:0x0138  */
    /* JADX WARN: Code duplicated, block: B:111:0x0149  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0157  */
    /* JADX WARN: Code duplicated, block: B:118:0x0160  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:122:0x016b A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:123:0x016d  */
    /* JADX WARN: Code duplicated, block: B:125:0x0174  */
    /* JADX WARN: Code duplicated, block: B:126:0x0176  */
    /* JADX WARN: Code duplicated, block: B:128:0x0179  */
    /* JADX WARN: Code duplicated, block: B:130:0x017f  */
    /* JADX WARN: Code duplicated, block: B:131:0x0181  */
    /* JADX WARN: Code duplicated, block: B:134:0x0185 A[PHI: r9
      0x0185: PHI (r9v12 java.lang.String) = (r9v11 java.lang.String), (r9v17 java.lang.String) binds: [B:127:0x0177, B:132:0x0182] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:138:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:140:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:146:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:148:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:154:0x01fc  */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:162:0x0218 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:163:0x021a  */
    /* JADX WARN: Code duplicated, block: B:165:0x021e  */
    /* JADX WARN: Code duplicated, block: B:166:0x0220  */
    /* JADX WARN: Code duplicated, block: B:168:0x0226  */
    /* JADX WARN: Code duplicated, block: B:169:0x0239  */
    /* JADX WARN: Code duplicated, block: B:171:0x023f  */
    /* JADX WARN: Code duplicated, block: B:175:0x0267  */
    /* JADX WARN: Code duplicated, block: B:176:0x026c  */
    /* JADX WARN: Code duplicated, block: B:178:0x027c  */
    /* JADX WARN: Code duplicated, block: B:180:0x0292  */
    /* JADX WARN: Code duplicated, block: B:182:0x0296  */
    /* JADX WARN: Code duplicated, block: B:183:0x0299  */
    /* JADX WARN: Code duplicated, block: B:185:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:186:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:188:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:189:0x02df  */
    /* JADX WARN: Code duplicated, block: B:193:0x0321  */
    /* JADX WARN: Code duplicated, block: B:196:0x0333  */
    /* JADX WARN: Code duplicated, block: B:198:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:26:0x004a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:87:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x011d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    /* JADX WARN: Code duplicated, block: B:99:0x0129  */
    public static final void a(Uri uri, qim0 qim0Var, hcx hcxVar, String str, String str2, long j, long j2, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        int i4;
        int iOrdinal;
        int i5;
        int i6;
        String str3;
        int i7;
        int i8;
        String str4;
        int i9;
        long jP;
        int i10;
        boolean z2;
        int i11;
        boolean z3;
        boolean z4;
        x340 x340Var;
        qim0 qim0Var2;
        hcx hcxVar2;
        String str5;
        long j3;
        String str6;
        h311 h311VarV;
        qim0 qim0Var3;
        hcx hcxVar3;
        String str7;
        long jP2;
        int i12;
        boolean z5;
        boolean z6;
        boolean z7;
        Object objT;
        String str8;
        int i13;
        long jA;
        boolean zF;
        Object objT2;
        u7h u7hVar;
        long j4;
        long j5;
        boolean z8;
        boolean zB;
        vex vexVar;
        int i14;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-583366815);
        if ((i & 6) == 0) {
            i3 = (x340Var2.g(uri) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i15 = i2 & 2;
        if (i15 == 0) {
            if ((i & 48) == 0) {
                i3 |= x340Var2.i(qim0Var) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                if (hcxVar == null) {
                    iOrdinal = -1;
                } else {
                    iOrdinal = hcxVar.ordinal();
                }
                if (x340Var2.e(iOrdinal)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            i6 = i2 & 8;
            if (i6 != 0) {
                if ((i & 3072) == 0) {
                    str3 = str;
                    if (x340Var2.g(str3)) {
                        i7 = 2048;
                    } else {
                        i7 = 1024;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 16;
                if (i8 != 0) {
                    if ((i & 24576) == 0) {
                        str4 = str2;
                        if (x340Var2.g(str4)) {
                            i9 = 16384;
                        } else {
                            i9 = 8192;
                        }
                        i3 |= i9;
                    }
                    if ((i & 196608) == 0) {
                        jP = j;
                        if ((i2 & 32) == 0 || !x340Var2.f(jP)) {
                            i14 = 65536;
                        } else {
                            i14 = 131072;
                        }
                        i3 |= i14;
                    } else {
                        jP = j;
                    }
                    if ((i & 1572864) == 0) {
                        i3 |= 524288;
                    }
                    i10 = i2 & 128;
                    if (i10 != 0) {
                        i3 |= 12582912;
                        z2 = z;
                    } else {
                        z2 = z;
                        if ((i & 12582912) == 0) {
                            if (x340Var2.h(z2)) {
                                i11 = 8388608;
                            } else {
                                i11 = 4194304;
                            }
                            i3 |= i11;
                        }
                    }
                    z3 = true;
                    if ((i3 & 4793491) != 4793490) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    if (x340Var2.Y(i3 & 1, z4)) {
                        x340Var2.d0();
                        if ((i & 1) != 0 || x340Var2.E()) {
                            if (i15 != 0) {
                                qim0Var3 = nim0.a;
                            } else {
                                qim0Var3 = qim0Var;
                            }
                            if (i4 != 0) {
                                hcxVar3 = hcx.d;
                            } else {
                                hcxVar3 = hcxVar;
                            }
                            if (i6 != 0) {
                                str3 = "";
                            }
                            str7 = i8 == 0 ? str4 : "";
                            if ((i2 & 32) != 0) {
                                int i16 = u7h.l;
                                jP = nfb.p();
                                i3 &= -458753;
                            }
                            int i17 = u7h.l;
                            jP2 = nfb.p();
                            i12 = i3 & (-3670017);
                            if (i10 != 0) {
                                z2 = true;
                            }
                        } else {
                            x340Var2.b0();
                            if ((i2 & 32) != 0) {
                                i3 &= -458753;
                            }
                            hcxVar3 = hcxVar;
                            jP2 = j2;
                            i12 = i3 & (-3670017);
                            str7 = str4;
                            qim0Var3 = qim0Var;
                        }
                        x340Var2.s();
                        if ((i12 & 7168) == 2048) {
                            z5 = true;
                        } else {
                            z5 = false;
                        }
                        if ((57344 & i12) == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = z5 | z6;
                        objT = x340Var2.T();
                        if (z7 || objT == m4cVar) {
                            objT = null;
                            if (ihc1.y0(str7)) {
                                str8 = null;
                            } else {
                                str8 = str7;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance = BreakIterator.getCharacterInstance();
                                characterInstance.setText(str8);
                                objT = str8.substring(0, characterInstance.next()).toUpperCase(Locale.ROOT);
                            } else {
                                if (ihc1.y0(str3)) {
                                    str8 = null;
                                } else {
                                    str8 = str3;
                                }
                                if (str8 != null) {
                                    BreakIterator characterInstance2 = BreakIterator.getCharacterInstance();
                                    characterInstance2.setText(str8);
                                    objT = str8.substring(0, characterInstance2.next()).toUpperCase(Locale.ROOT);
                                }
                            }
                            x340Var2.s0(objT);
                        }
                        String str9 = (String) objT;
                        int i18 = i12 >> 6;
                        i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i18 & 112);
                        uwr uwrVar = cbx.a;
                        int i19 = i12;
                        hcx hcxVar4 = hcxVar3;
                        jA = cbx.a(x340Var2).a.a.a();
                        qim0 qim0Var4 = qim0Var3;
                        boolean z9 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                        if ((((i13 & 896) ^ 384) > 256 || !x340Var2.f(jP)) && (i13 & 384) != 256) {
                        }
                        zF = z9 | z3 | x340Var2.f(jA);
                        objT2 = x340Var2.T();
                        if (zF || objT2 == m4cVar) {
                            if (jP != 16) {
                                jA = jP;
                            } else if (!ihc1.y0(str7)) {
                                u7h[] u7hVarArr = tah.a;
                                int iAbs = Math.abs(str7.hashCode());
                                u7h[] u7hVarArr2 = tah.a;
                                jA = u7hVarArr2[iAbs % u7hVarArr2.length].a;
                            } else if (!ihc1.y0(str3)) {
                                u7h[] u7hVarArr3 = tah.a;
                                int iAbs2 = Math.abs(str3.hashCode());
                                u7h[] u7hVarArr4 = tah.a;
                                jA = u7hVarArr4[iAbs2 % u7hVarArr4.length].a;
                            }
                            objT2 = new u7h(jA);
                            x340Var2.s0(objT2);
                        }
                        u7hVar = (u7h) objT2;
                        j4 = u7hVar.a;
                        x340Var2.i0(2025223330);
                        if (jP2 != 16) {
                            j5 = jP2;
                            z8 = false;
                        } else {
                            u7h[] u7hVarArr5 = tah.a;
                            x340Var2.i0(-1246266282);
                            if (f46.M(tah.a, u7hVar)) {
                                zsc zscVar = zex.a;
                                zB = z4h1.b(j4, ((gmt) zscVar.c).i().b);
                                vexVar = (vex) zscVar.b;
                                if (zB) {
                                    j5 = vexVar.b;
                                } else {
                                    j5 = vexVar.c;
                                }
                            } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                                j5 = ((vex) zex.a.b).b;
                            } else {
                                if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                                    j5 = ((vex) zex.a.b).c;
                                } else {
                                    j5 = ((vex) zex.a.b).b;
                                }
                            }
                            z8 = false;
                            x340Var2.r(false);
                        }
                        x340Var2.r(z8);
                        b(uri, hcxVar4, str9, new n6a1(j4), j5, z2, qim0Var4, x340Var2, (i19 & 14) | ((i19 >> 3) & 112) | (458752 & i18) | ((i19 << 15) & 3670016));
                        qim0Var2 = qim0Var4;
                        x340Var = x340Var2;
                        hcxVar2 = hcxVar4;
                        str5 = str7;
                        j3 = jP2;
                    } else {
                        x340Var = x340Var2;
                        x340Var.b0();
                        qim0Var2 = qim0Var;
                        hcxVar2 = hcxVar;
                        str5 = str4;
                        j3 = j2;
                    }
                    str6 = str3;
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
                    }
                }
                i3 |= 24576;
                str4 = str2;
                if ((i & 196608) == 0) {
                    jP = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jP = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (x340Var2.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var2.Y(i3 & 1, z4)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i110 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i111 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i112 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i113 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    }
                    x340Var2.s();
                    if ((i12 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objT = x340Var2.T();
                    if (z7) {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance3 = BreakIterator.getCharacterInstance();
                            characterInstance3.setText(str8);
                            objT = str8.substring(0, characterInstance3.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance4 = BreakIterator.getCharacterInstance();
                                characterInstance4.setText(str8);
                                objT = str8.substring(0, characterInstance4.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    } else {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance5 = BreakIterator.getCharacterInstance();
                            characterInstance5.setText(str8);
                            objT = str8.substring(0, characterInstance5.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance6 = BreakIterator.getCharacterInstance();
                                characterInstance6.setText(str8);
                                objT = str8.substring(0, characterInstance6.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    }
                    String str10 = (String) objT;
                    int i114 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i114 & 112);
                    uwr uwrVar2 = cbx.a;
                    int i115 = i12;
                    hcx hcxVar5 = hcxVar3;
                    jA = cbx.a(x340Var2).a.a.a();
                    qim0 qim0Var5 = qim0Var3;
                    boolean z10 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                    z3 = ((i13 & 896) ^ 384) > 256 ? false : false;
                    zF = z10 | z3 | x340Var2.f(jA);
                    objT2 = x340Var2.T();
                    if (zF) {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr6 = tah.a;
                            int iAbs3 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr7 = tah.a;
                            jA = u7hVarArr7[iAbs3 % u7hVarArr7.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr8 = tah.a;
                            int iAbs4 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr9 = tah.a;
                            jA = u7hVarArr9[iAbs4 % u7hVarArr9.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    } else {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr10 = tah.a;
                            int iAbs5 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr11 = tah.a;
                            jA = u7hVarArr11[iAbs5 % u7hVarArr11.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr12 = tah.a;
                            int iAbs6 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr13 = tah.a;
                            jA = u7hVarArr13[iAbs6 % u7hVarArr13.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    }
                    u7hVar = (u7h) objT2;
                    j4 = u7hVar.a;
                    x340Var2.i0(2025223330);
                    if (jP2 != 16) {
                        j5 = jP2;
                        z8 = false;
                    } else {
                        u7h[] u7hVarArr14 = tah.a;
                        x340Var2.i0(-1246266282);
                        if (f46.M(tah.a, u7hVar)) {
                            zsc zscVar2 = zex.a;
                            zB = z4h1.b(j4, ((gmt) zscVar2.c).i().b);
                            vexVar = (vex) zscVar2.b;
                            if (zB) {
                                j5 = vexVar.c;
                            } else {
                                j5 = vexVar.b;
                            }
                        } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                            j5 = ((vex) zex.a.b).b;
                        } else {
                            if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                                j5 = ((vex) zex.a.b).c;
                            } else {
                                j5 = ((vex) zex.a.b).b;
                            }
                        }
                        z8 = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z8);
                    b(uri, hcxVar5, str10, new n6a1(j4), j5, z2, qim0Var5, x340Var2, (i115 & 14) | ((i115 >> 3) & 112) | (458752 & i114) | ((i115 << 15) & 3670016));
                    qim0Var2 = qim0Var5;
                    x340Var = x340Var2;
                    hcxVar2 = hcxVar5;
                    str5 = str7;
                    j3 = jP2;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    hcxVar2 = hcxVar;
                    str5 = str4;
                    j3 = j2;
                }
                str6 = str3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
                }
            }
            i3 |= 3072;
            str3 = str;
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (x340Var2.g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 196608) == 0) {
                    jP = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jP = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (x340Var2.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var2.Y(i3 & 1, z4)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i116 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i117 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i118 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i119 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    }
                    x340Var2.s();
                    if ((i12 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objT = x340Var2.T();
                    if (z7) {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance7 = BreakIterator.getCharacterInstance();
                            characterInstance7.setText(str8);
                            objT = str8.substring(0, characterInstance7.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance8 = BreakIterator.getCharacterInstance();
                                characterInstance8.setText(str8);
                                objT = str8.substring(0, characterInstance8.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    } else {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance9 = BreakIterator.getCharacterInstance();
                            characterInstance9.setText(str8);
                            objT = str8.substring(0, characterInstance9.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance10 = BreakIterator.getCharacterInstance();
                                characterInstance10.setText(str8);
                                objT = str8.substring(0, characterInstance10.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    }
                    String str11 = (String) objT;
                    int i1110 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1110 & 112);
                    uwr uwrVar3 = cbx.a;
                    int i1111 = i12;
                    hcx hcxVar6 = hcxVar3;
                    jA = cbx.a(x340Var2).a.a.a();
                    qim0 qim0Var6 = qim0Var3;
                    boolean z11 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zF = z11 | z3 | x340Var2.f(jA);
                    objT2 = x340Var2.T();
                    if (zF) {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr15 = tah.a;
                            int iAbs7 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr16 = tah.a;
                            jA = u7hVarArr16[iAbs7 % u7hVarArr16.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr17 = tah.a;
                            int iAbs8 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr18 = tah.a;
                            jA = u7hVarArr18[iAbs8 % u7hVarArr18.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    } else {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr19 = tah.a;
                            int iAbs9 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr110 = tah.a;
                            jA = u7hVarArr110[iAbs9 % u7hVarArr110.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr111 = tah.a;
                            int iAbs10 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr112 = tah.a;
                            jA = u7hVarArr112[iAbs10 % u7hVarArr112.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    }
                    u7hVar = (u7h) objT2;
                    j4 = u7hVar.a;
                    x340Var2.i0(2025223330);
                    if (jP2 != 16) {
                        j5 = jP2;
                        z8 = false;
                    } else {
                        u7h[] u7hVarArr113 = tah.a;
                        x340Var2.i0(-1246266282);
                        if (f46.M(tah.a, u7hVar)) {
                            zsc zscVar3 = zex.a;
                            zB = z4h1.b(j4, ((gmt) zscVar3.c).i().b);
                            vexVar = (vex) zscVar3.b;
                            if (zB) {
                                j5 = vexVar.c;
                            } else {
                                j5 = vexVar.b;
                            }
                        } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                            j5 = ((vex) zex.a.b).b;
                        } else {
                            if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                                j5 = ((vex) zex.a.b).c;
                            } else {
                                j5 = ((vex) zex.a.b).b;
                            }
                        }
                        z8 = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z8);
                    b(uri, hcxVar6, str11, new n6a1(j4), j5, z2, qim0Var6, x340Var2, (i1111 & 14) | ((i1111 >> 3) & 112) | (458752 & i1110) | ((i1111 << 15) & 3670016));
                    qim0Var2 = qim0Var6;
                    x340Var = x340Var2;
                    hcxVar2 = hcxVar6;
                    str5 = str7;
                    j3 = jP2;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    hcxVar2 = hcxVar;
                    str5 = str4;
                    j3 = j2;
                }
                str6 = str3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            if ((i & 196608) == 0) {
                jP = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jP = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (x340Var2.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i3 & 1, z4)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i1112 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i1113 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i1114 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i1115 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                }
                x340Var2.s();
                if ((i12 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((57344 & i12) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objT = x340Var2.T();
                if (z7) {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance11 = BreakIterator.getCharacterInstance();
                        characterInstance11.setText(str8);
                        objT = str8.substring(0, characterInstance11.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance12 = BreakIterator.getCharacterInstance();
                            characterInstance12.setText(str8);
                            objT = str8.substring(0, characterInstance12.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                } else {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance13 = BreakIterator.getCharacterInstance();
                        characterInstance13.setText(str8);
                        objT = str8.substring(0, characterInstance13.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance14 = BreakIterator.getCharacterInstance();
                            characterInstance14.setText(str8);
                            objT = str8.substring(0, characterInstance14.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                }
                String str12 = (String) objT;
                int i1116 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1116 & 112);
                uwr uwrVar4 = cbx.a;
                int i1117 = i12;
                hcx hcxVar7 = hcxVar3;
                jA = cbx.a(x340Var2).a.a.a();
                qim0 qim0Var7 = qim0Var3;
                boolean z12 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zF = z12 | z3 | x340Var2.f(jA);
                objT2 = x340Var2.T();
                if (zF) {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr114 = tah.a;
                        int iAbs11 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr115 = tah.a;
                        jA = u7hVarArr115[iAbs11 % u7hVarArr115.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr116 = tah.a;
                        int iAbs12 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr117 = tah.a;
                        jA = u7hVarArr117[iAbs12 % u7hVarArr117.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                } else {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr118 = tah.a;
                        int iAbs13 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr119 = tah.a;
                        jA = u7hVarArr119[iAbs13 % u7hVarArr119.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr1110 = tah.a;
                        int iAbs14 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr1111 = tah.a;
                        jA = u7hVarArr1111[iAbs14 % u7hVarArr1111.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                }
                u7hVar = (u7h) objT2;
                j4 = u7hVar.a;
                x340Var2.i0(2025223330);
                if (jP2 != 16) {
                    j5 = jP2;
                    z8 = false;
                } else {
                    u7h[] u7hVarArr1112 = tah.a;
                    x340Var2.i0(-1246266282);
                    if (f46.M(tah.a, u7hVar)) {
                        zsc zscVar4 = zex.a;
                        zB = z4h1.b(j4, ((gmt) zscVar4.c).i().b);
                        vexVar = (vex) zscVar4.b;
                        if (zB) {
                            j5 = vexVar.c;
                        } else {
                            j5 = vexVar.b;
                        }
                    } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                        j5 = ((vex) zex.a.b).b;
                    } else {
                        if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                            j5 = ((vex) zex.a.b).c;
                        } else {
                            j5 = ((vex) zex.a.b).b;
                        }
                    }
                    z8 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z8);
                b(uri, hcxVar7, str12, new n6a1(j4), j5, z2, qim0Var7, x340Var2, (i1117 & 14) | ((i1117 >> 3) & 112) | (458752 & i1116) | ((i1117 << 15) & 3670016));
                qim0Var2 = qim0Var7;
                x340Var = x340Var2;
                hcxVar2 = hcxVar7;
                str5 = str7;
                j3 = jP2;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                hcxVar2 = hcxVar;
                str5 = str4;
                j3 = j2;
            }
            str6 = str3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
            }
        }
        i3 |= 48;
        i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (hcxVar == null) {
                iOrdinal = -1;
            } else {
                iOrdinal = hcxVar.ordinal();
            }
            if (x340Var2.e(iOrdinal)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        i6 = i2 & 8;
        if (i6 != 0) {
            if ((i & 3072) == 0) {
                str3 = str;
                if (x340Var2.g(str3)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            i8 = i2 & 16;
            if (i8 != 0) {
                if ((i & 24576) == 0) {
                    str4 = str2;
                    if (x340Var2.g(str4)) {
                        i9 = 16384;
                    } else {
                        i9 = 8192;
                    }
                    i3 |= i9;
                }
                if ((i & 196608) == 0) {
                    jP = j;
                    if ((i2 & 32) == 0) {
                        i14 = 65536;
                    } else {
                        i14 = 65536;
                    }
                    i3 |= i14;
                } else {
                    jP = j;
                }
                if ((i & 1572864) == 0) {
                    i3 |= 524288;
                }
                i10 = i2 & 128;
                if (i10 != 0) {
                    i3 |= 12582912;
                    z2 = z;
                } else {
                    z2 = z;
                    if ((i & 12582912) == 0) {
                        if (x340Var2.h(z2)) {
                            i11 = 8388608;
                        } else {
                            i11 = 4194304;
                        }
                        i3 |= i11;
                    }
                }
                z3 = true;
                if ((i3 & 4793491) != 4793490) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (x340Var2.Y(i3 & 1, z4)) {
                    x340Var2.d0();
                    if ((i & 1) != 0) {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i1118 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i1119 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    } else {
                        if (i15 != 0) {
                            qim0Var3 = nim0.a;
                        } else {
                            qim0Var3 = qim0Var;
                        }
                        if (i4 != 0) {
                            hcxVar3 = hcx.d;
                        } else {
                            hcxVar3 = hcxVar;
                        }
                        if (i6 != 0) {
                            str3 = "";
                        }
                        if (i8 == 0) {
                        }
                        if ((i2 & 32) != 0) {
                            int i11110 = u7h.l;
                            jP = nfb.p();
                            i3 &= -458753;
                        }
                        int i11111 = u7h.l;
                        jP2 = nfb.p();
                        i12 = i3 & (-3670017);
                        if (i10 != 0) {
                            z2 = true;
                        }
                    }
                    x340Var2.s();
                    if ((i12 & 7168) == 2048) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if ((57344 & i12) == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = z5 | z6;
                    objT = x340Var2.T();
                    if (z7) {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance15 = BreakIterator.getCharacterInstance();
                            characterInstance15.setText(str8);
                            objT = str8.substring(0, characterInstance15.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance16 = BreakIterator.getCharacterInstance();
                                characterInstance16.setText(str8);
                                objT = str8.substring(0, characterInstance16.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    } else {
                        objT = null;
                        if (ihc1.y0(str7)) {
                            str8 = str7;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance17 = BreakIterator.getCharacterInstance();
                            characterInstance17.setText(str8);
                            objT = str8.substring(0, characterInstance17.next()).toUpperCase(Locale.ROOT);
                        } else {
                            if (ihc1.y0(str3)) {
                                str8 = str3;
                            } else {
                                str8 = null;
                            }
                            if (str8 != null) {
                                BreakIterator characterInstance18 = BreakIterator.getCharacterInstance();
                                characterInstance18.setText(str8);
                                objT = str8.substring(0, characterInstance18.next()).toUpperCase(Locale.ROOT);
                            }
                        }
                        x340Var2.s0(objT);
                    }
                    String str13 = (String) objT;
                    int i11112 = i12 >> 6;
                    i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i11112 & 112);
                    uwr uwrVar5 = cbx.a;
                    int i11113 = i12;
                    hcx hcxVar8 = hcxVar3;
                    jA = cbx.a(x340Var2).a.a.a();
                    qim0 qim0Var8 = qim0Var3;
                    boolean z13 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                    if (((i13 & 896) ^ 384) > 256) {
                    }
                    zF = z13 | z3 | x340Var2.f(jA);
                    objT2 = x340Var2.T();
                    if (zF) {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr1113 = tah.a;
                            int iAbs15 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr1114 = tah.a;
                            jA = u7hVarArr1114[iAbs15 % u7hVarArr1114.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr1115 = tah.a;
                            int iAbs16 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr1116 = tah.a;
                            jA = u7hVarArr1116[iAbs16 % u7hVarArr1116.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    } else {
                        if (jP != 16) {
                            jA = jP;
                        } else if (!ihc1.y0(str7)) {
                            u7h[] u7hVarArr1117 = tah.a;
                            int iAbs17 = Math.abs(str7.hashCode());
                            u7h[] u7hVarArr1118 = tah.a;
                            jA = u7hVarArr1118[iAbs17 % u7hVarArr1118.length].a;
                        } else if (!ihc1.y0(str3)) {
                            u7h[] u7hVarArr1119 = tah.a;
                            int iAbs18 = Math.abs(str3.hashCode());
                            u7h[] u7hVarArr11110 = tah.a;
                            jA = u7hVarArr11110[iAbs18 % u7hVarArr11110.length].a;
                        }
                        objT2 = new u7h(jA);
                        x340Var2.s0(objT2);
                    }
                    u7hVar = (u7h) objT2;
                    j4 = u7hVar.a;
                    x340Var2.i0(2025223330);
                    if (jP2 != 16) {
                        j5 = jP2;
                        z8 = false;
                    } else {
                        u7h[] u7hVarArr11111 = tah.a;
                        x340Var2.i0(-1246266282);
                        if (f46.M(tah.a, u7hVar)) {
                            zsc zscVar5 = zex.a;
                            zB = z4h1.b(j4, ((gmt) zscVar5.c).i().b);
                            vexVar = (vex) zscVar5.b;
                            if (zB) {
                                j5 = vexVar.c;
                            } else {
                                j5 = vexVar.b;
                            }
                        } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                            j5 = ((vex) zex.a.b).b;
                        } else {
                            if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                                j5 = ((vex) zex.a.b).c;
                            } else {
                                j5 = ((vex) zex.a.b).b;
                            }
                        }
                        z8 = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z8);
                    b(uri, hcxVar8, str13, new n6a1(j4), j5, z2, qim0Var8, x340Var2, (i11113 & 14) | ((i11113 >> 3) & 112) | (458752 & i11112) | ((i11113 << 15) & 3670016));
                    qim0Var2 = qim0Var8;
                    x340Var = x340Var2;
                    hcxVar2 = hcxVar8;
                    str5 = str7;
                    j3 = jP2;
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                    qim0Var2 = qim0Var;
                    hcxVar2 = hcxVar;
                    str5 = str4;
                    j3 = j2;
                }
                str6 = str3;
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
                }
            }
            i3 |= 24576;
            str4 = str2;
            if ((i & 196608) == 0) {
                jP = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jP = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (x340Var2.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i3 & 1, z4)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i11114 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i11115 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i11116 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i11117 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                }
                x340Var2.s();
                if ((i12 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((57344 & i12) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objT = x340Var2.T();
                if (z7) {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance19 = BreakIterator.getCharacterInstance();
                        characterInstance19.setText(str8);
                        objT = str8.substring(0, characterInstance19.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance110 = BreakIterator.getCharacterInstance();
                            characterInstance110.setText(str8);
                            objT = str8.substring(0, characterInstance110.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                } else {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance111 = BreakIterator.getCharacterInstance();
                        characterInstance111.setText(str8);
                        objT = str8.substring(0, characterInstance111.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance112 = BreakIterator.getCharacterInstance();
                            characterInstance112.setText(str8);
                            objT = str8.substring(0, characterInstance112.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                }
                String str14 = (String) objT;
                int i11118 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i11118 & 112);
                uwr uwrVar6 = cbx.a;
                int i11119 = i12;
                hcx hcxVar9 = hcxVar3;
                jA = cbx.a(x340Var2).a.a.a();
                qim0 qim0Var9 = qim0Var3;
                boolean z14 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zF = z14 | z3 | x340Var2.f(jA);
                objT2 = x340Var2.T();
                if (zF) {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr11112 = tah.a;
                        int iAbs19 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr11113 = tah.a;
                        jA = u7hVarArr11113[iAbs19 % u7hVarArr11113.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr11114 = tah.a;
                        int iAbs110 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr11115 = tah.a;
                        jA = u7hVarArr11115[iAbs110 % u7hVarArr11115.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                } else {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr11116 = tah.a;
                        int iAbs111 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr11117 = tah.a;
                        jA = u7hVarArr11117[iAbs111 % u7hVarArr11117.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr11118 = tah.a;
                        int iAbs112 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr11119 = tah.a;
                        jA = u7hVarArr11119[iAbs112 % u7hVarArr11119.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                }
                u7hVar = (u7h) objT2;
                j4 = u7hVar.a;
                x340Var2.i0(2025223330);
                if (jP2 != 16) {
                    j5 = jP2;
                    z8 = false;
                } else {
                    u7h[] u7hVarArr111110 = tah.a;
                    x340Var2.i0(-1246266282);
                    if (f46.M(tah.a, u7hVar)) {
                        zsc zscVar6 = zex.a;
                        zB = z4h1.b(j4, ((gmt) zscVar6.c).i().b);
                        vexVar = (vex) zscVar6.b;
                        if (zB) {
                            j5 = vexVar.c;
                        } else {
                            j5 = vexVar.b;
                        }
                    } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                        j5 = ((vex) zex.a.b).b;
                    } else {
                        if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                            j5 = ((vex) zex.a.b).c;
                        } else {
                            j5 = ((vex) zex.a.b).b;
                        }
                    }
                    z8 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z8);
                b(uri, hcxVar9, str14, new n6a1(j4), j5, z2, qim0Var9, x340Var2, (i11119 & 14) | ((i11119 >> 3) & 112) | (458752 & i11118) | ((i11119 << 15) & 3670016));
                qim0Var2 = qim0Var9;
                x340Var = x340Var2;
                hcxVar2 = hcxVar9;
                str5 = str7;
                j3 = jP2;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                hcxVar2 = hcxVar;
                str5 = str4;
                j3 = j2;
            }
            str6 = str3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
            }
        }
        i3 |= 3072;
        str3 = str;
        i8 = i2 & 16;
        if (i8 != 0) {
            if ((i & 24576) == 0) {
                str4 = str2;
                if (x340Var2.g(str4)) {
                    i9 = 16384;
                } else {
                    i9 = 8192;
                }
                i3 |= i9;
            }
            if ((i & 196608) == 0) {
                jP = j;
                if ((i2 & 32) == 0) {
                    i14 = 65536;
                } else {
                    i14 = 65536;
                }
                i3 |= i14;
            } else {
                jP = j;
            }
            if ((i & 1572864) == 0) {
                i3 |= 524288;
            }
            i10 = i2 & 128;
            if (i10 != 0) {
                i3 |= 12582912;
                z2 = z;
            } else {
                z2 = z;
                if ((i & 12582912) == 0) {
                    if (x340Var2.h(z2)) {
                        i11 = 8388608;
                    } else {
                        i11 = 4194304;
                    }
                    i3 |= i11;
                }
            }
            z3 = true;
            if ((i3 & 4793491) != 4793490) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (x340Var2.Y(i3 & 1, z4)) {
                x340Var2.d0();
                if ((i & 1) != 0) {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i111110 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i111111 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                } else {
                    if (i15 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var;
                    }
                    if (i4 != 0) {
                        hcxVar3 = hcx.d;
                    } else {
                        hcxVar3 = hcxVar;
                    }
                    if (i6 != 0) {
                        str3 = "";
                    }
                    if (i8 == 0) {
                    }
                    if ((i2 & 32) != 0) {
                        int i111112 = u7h.l;
                        jP = nfb.p();
                        i3 &= -458753;
                    }
                    int i111113 = u7h.l;
                    jP2 = nfb.p();
                    i12 = i3 & (-3670017);
                    if (i10 != 0) {
                        z2 = true;
                    }
                }
                x340Var2.s();
                if ((i12 & 7168) == 2048) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if ((57344 & i12) == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = z5 | z6;
                objT = x340Var2.T();
                if (z7) {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance113 = BreakIterator.getCharacterInstance();
                        characterInstance113.setText(str8);
                        objT = str8.substring(0, characterInstance113.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance114 = BreakIterator.getCharacterInstance();
                            characterInstance114.setText(str8);
                            objT = str8.substring(0, characterInstance114.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                } else {
                    objT = null;
                    if (ihc1.y0(str7)) {
                        str8 = str7;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance115 = BreakIterator.getCharacterInstance();
                        characterInstance115.setText(str8);
                        objT = str8.substring(0, characterInstance115.next()).toUpperCase(Locale.ROOT);
                    } else {
                        if (ihc1.y0(str3)) {
                            str8 = str3;
                        } else {
                            str8 = null;
                        }
                        if (str8 != null) {
                            BreakIterator characterInstance116 = BreakIterator.getCharacterInstance();
                            characterInstance116.setText(str8);
                            objT = str8.substring(0, characterInstance116.next()).toUpperCase(Locale.ROOT);
                        }
                    }
                    x340Var2.s0(objT);
                }
                String str15 = (String) objT;
                int i111114 = i12 >> 6;
                i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i111114 & 112);
                uwr uwrVar7 = cbx.a;
                int i111115 = i12;
                hcx hcxVar10 = hcxVar3;
                jA = cbx.a(x340Var2).a.a.a();
                qim0 qim0Var10 = qim0Var3;
                boolean z15 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
                if (((i13 & 896) ^ 384) > 256) {
                }
                zF = z15 | z3 | x340Var2.f(jA);
                objT2 = x340Var2.T();
                if (zF) {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr111111 = tah.a;
                        int iAbs113 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr111112 = tah.a;
                        jA = u7hVarArr111112[iAbs113 % u7hVarArr111112.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr111113 = tah.a;
                        int iAbs114 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr111114 = tah.a;
                        jA = u7hVarArr111114[iAbs114 % u7hVarArr111114.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                } else {
                    if (jP != 16) {
                        jA = jP;
                    } else if (!ihc1.y0(str7)) {
                        u7h[] u7hVarArr111115 = tah.a;
                        int iAbs115 = Math.abs(str7.hashCode());
                        u7h[] u7hVarArr111116 = tah.a;
                        jA = u7hVarArr111116[iAbs115 % u7hVarArr111116.length].a;
                    } else if (!ihc1.y0(str3)) {
                        u7h[] u7hVarArr111117 = tah.a;
                        int iAbs116 = Math.abs(str3.hashCode());
                        u7h[] u7hVarArr111118 = tah.a;
                        jA = u7hVarArr111118[iAbs116 % u7hVarArr111118.length].a;
                    }
                    objT2 = new u7h(jA);
                    x340Var2.s0(objT2);
                }
                u7hVar = (u7h) objT2;
                j4 = u7hVar.a;
                x340Var2.i0(2025223330);
                if (jP2 != 16) {
                    j5 = jP2;
                    z8 = false;
                } else {
                    u7h[] u7hVarArr111119 = tah.a;
                    x340Var2.i0(-1246266282);
                    if (f46.M(tah.a, u7hVar)) {
                        zsc zscVar7 = zex.a;
                        zB = z4h1.b(j4, ((gmt) zscVar7.c).i().b);
                        vexVar = (vex) zscVar7.b;
                        if (zB) {
                            j5 = vexVar.c;
                        } else {
                            j5 = vexVar.b;
                        }
                    } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                        j5 = ((vex) zex.a.b).b;
                    } else {
                        if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                            j5 = ((vex) zex.a.b).c;
                        } else {
                            j5 = ((vex) zex.a.b).b;
                        }
                    }
                    z8 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z8);
                b(uri, hcxVar10, str15, new n6a1(j4), j5, z2, qim0Var10, x340Var2, (i111115 & 14) | ((i111115 >> 3) & 112) | (458752 & i111114) | ((i111115 << 15) & 3670016));
                qim0Var2 = qim0Var10;
                x340Var = x340Var2;
                hcxVar2 = hcxVar10;
                str5 = str7;
                j3 = jP2;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                qim0Var2 = qim0Var;
                hcxVar2 = hcxVar;
                str5 = str4;
                j3 = j2;
            }
            str6 = str3;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
            }
        }
        i3 |= 24576;
        str4 = str2;
        if ((i & 196608) == 0) {
            jP = j;
            if ((i2 & 32) == 0) {
                i14 = 65536;
            } else {
                i14 = 65536;
            }
            i3 |= i14;
        } else {
            jP = j;
        }
        if ((i & 1572864) == 0) {
            i3 |= 524288;
        }
        i10 = i2 & 128;
        if (i10 != 0) {
            i3 |= 12582912;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 12582912) == 0) {
                if (x340Var2.h(z2)) {
                    i11 = 8388608;
                } else {
                    i11 = 4194304;
                }
                i3 |= i11;
            }
        }
        z3 = true;
        if ((i3 & 4793491) != 4793490) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (x340Var2.Y(i3 & 1, z4)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i4 != 0) {
                    hcxVar3 = hcx.d;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i6 != 0) {
                    str3 = "";
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    int i111116 = u7h.l;
                    jP = nfb.p();
                    i3 &= -458753;
                }
                int i111117 = u7h.l;
                jP2 = nfb.p();
                i12 = i3 & (-3670017);
                if (i10 != 0) {
                    z2 = true;
                }
            } else {
                if (i15 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var;
                }
                if (i4 != 0) {
                    hcxVar3 = hcx.d;
                } else {
                    hcxVar3 = hcxVar;
                }
                if (i6 != 0) {
                    str3 = "";
                }
                if (i8 == 0) {
                }
                if ((i2 & 32) != 0) {
                    int i111118 = u7h.l;
                    jP = nfb.p();
                    i3 &= -458753;
                }
                int i111119 = u7h.l;
                jP2 = nfb.p();
                i12 = i3 & (-3670017);
                if (i10 != 0) {
                    z2 = true;
                }
            }
            x340Var2.s();
            if ((i12 & 7168) == 2048) {
                z5 = true;
            } else {
                z5 = false;
            }
            if ((57344 & i12) == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = z5 | z6;
            objT = x340Var2.T();
            if (z7) {
                objT = null;
                if (ihc1.y0(str7)) {
                    str8 = str7;
                } else {
                    str8 = null;
                }
                if (str8 != null) {
                    BreakIterator characterInstance117 = BreakIterator.getCharacterInstance();
                    characterInstance117.setText(str8);
                    objT = str8.substring(0, characterInstance117.next()).toUpperCase(Locale.ROOT);
                } else {
                    if (ihc1.y0(str3)) {
                        str8 = str3;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance118 = BreakIterator.getCharacterInstance();
                        characterInstance118.setText(str8);
                        objT = str8.substring(0, characterInstance118.next()).toUpperCase(Locale.ROOT);
                    }
                }
                x340Var2.s0(objT);
            } else {
                objT = null;
                if (ihc1.y0(str7)) {
                    str8 = str7;
                } else {
                    str8 = null;
                }
                if (str8 != null) {
                    BreakIterator characterInstance119 = BreakIterator.getCharacterInstance();
                    characterInstance119.setText(str8);
                    objT = str8.substring(0, characterInstance119.next()).toUpperCase(Locale.ROOT);
                } else {
                    if (ihc1.y0(str3)) {
                        str8 = str3;
                    } else {
                        str8 = null;
                    }
                    if (str8 != null) {
                        BreakIterator characterInstance1110 = BreakIterator.getCharacterInstance();
                        characterInstance1110.setText(str8);
                        objT = str8.substring(0, characterInstance1110.next()).toUpperCase(Locale.ROOT);
                    }
                }
                x340Var2.s0(objT);
            }
            String str16 = (String) objT;
            int i1111110 = i12 >> 6;
            i13 = ((i12 >> 9) & 896) | ((i12 >> 12) & 14) | (i1111110 & 112);
            uwr uwrVar8 = cbx.a;
            int i1111111 = i12;
            hcx hcxVar11 = hcxVar3;
            jA = cbx.a(x340Var2).a.a.a();
            qim0 qim0Var11 = qim0Var3;
            boolean z16 = ((((i13 & 14) ^ 6) <= 4 && x340Var2.g(str7)) || (i13 & 6) == 4) | ((((i13 & 112) ^ 48) <= 32 && x340Var2.g(str3)) || (i13 & 48) == 32);
            if (((i13 & 896) ^ 384) > 256) {
            }
            zF = z16 | z3 | x340Var2.f(jA);
            objT2 = x340Var2.T();
            if (zF) {
                if (jP != 16) {
                    jA = jP;
                } else if (!ihc1.y0(str7)) {
                    u7h[] u7hVarArr1111110 = tah.a;
                    int iAbs117 = Math.abs(str7.hashCode());
                    u7h[] u7hVarArr1111111 = tah.a;
                    jA = u7hVarArr1111111[iAbs117 % u7hVarArr1111111.length].a;
                } else if (!ihc1.y0(str3)) {
                    u7h[] u7hVarArr1111112 = tah.a;
                    int iAbs118 = Math.abs(str3.hashCode());
                    u7h[] u7hVarArr1111113 = tah.a;
                    jA = u7hVarArr1111113[iAbs118 % u7hVarArr1111113.length].a;
                }
                objT2 = new u7h(jA);
                x340Var2.s0(objT2);
            } else {
                if (jP != 16) {
                    jA = jP;
                } else if (!ihc1.y0(str7)) {
                    u7h[] u7hVarArr1111114 = tah.a;
                    int iAbs119 = Math.abs(str7.hashCode());
                    u7h[] u7hVarArr1111115 = tah.a;
                    jA = u7hVarArr1111115[iAbs119 % u7hVarArr1111115.length].a;
                } else if (!ihc1.y0(str3)) {
                    u7h[] u7hVarArr1111116 = tah.a;
                    int iAbs1110 = Math.abs(str3.hashCode());
                    u7h[] u7hVarArr1111117 = tah.a;
                    jA = u7hVarArr1111117[iAbs1110 % u7hVarArr1111117.length].a;
                }
                objT2 = new u7h(jA);
                x340Var2.s0(objT2);
            }
            u7hVar = (u7h) objT2;
            j4 = u7hVar.a;
            x340Var2.i0(2025223330);
            if (jP2 != 16) {
                j5 = jP2;
                z8 = false;
            } else {
                u7h[] u7hVarArr1111118 = tah.a;
                x340Var2.i0(-1246266282);
                if (f46.M(tah.a, u7hVar)) {
                    zsc zscVar8 = zex.a;
                    zB = z4h1.b(j4, ((gmt) zscVar8.c).i().b);
                    vexVar = (vex) zscVar8.b;
                    if (zB) {
                        j5 = vexVar.c;
                    } else {
                        j5 = vexVar.b;
                    }
                } else if (z4h1.b(j4, cbx.a(x340Var2).a.a.a())) {
                    j5 = ((vex) zex.a.b).b;
                } else {
                    if ((((((int) (u7h.g(j4) * 255.0f)) * 299) + (((int) (u7h.f(j4) * 255.0f)) * 587)) + (((int) (u7h.d(j4) * 255.0f)) * 114)) / 1000 >= 128) {
                        j5 = ((vex) zex.a.b).c;
                    } else {
                        j5 = ((vex) zex.a.b).b;
                    }
                }
                z8 = false;
                x340Var2.r(false);
            }
            x340Var2.r(z8);
            b(uri, hcxVar11, str16, new n6a1(j4), j5, z2, qim0Var11, x340Var2, (i1111111 & 14) | ((i1111111 >> 3) & 112) | (458752 & i1111110) | ((i1111111 << 15) & 3670016));
            qim0Var2 = qim0Var11;
            x340Var = x340Var2;
            hcxVar2 = hcxVar11;
            str5 = str7;
            j3 = jP2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            hcxVar2 = hcxVar;
            str5 = str4;
            j3 = j2;
        }
        str6 = str3;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fcx(uri, qim0Var2, hcxVar2, str6, str5, jP, j3, z2, i, i2);
        }
    }

    public static final String a0(Object[] objArr, int i, int i2, y8 y8Var) {
        StringBuilder sb = new StringBuilder((i2 * 3) + 2);
        sb.append("[");
        for (int i3 = 0; i3 < i2; i3++) {
            if (i3 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i3];
            if (obj == y8Var) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public static final void b(Uri uri, hcx hcxVar, String str, n6a1 n6a1Var, long j, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1591255345);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(hcxVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(n6a1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.f(j) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            w2g0.c(i1p1.q(xcg1.k(cbx.a, u291.r(qim0Var, hcxVar.a(x340Var))), er31.a), (tl3) null, apo.r(-371701851, new gcx(hcxVar, str, j, n6a1Var, z, uri), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fa5(uri, hcxVar, str, n6a1Var, j, z, qim0Var, i);
        }
    }

    public static int[] b0(Collection collection) {
        if (collection instanceof sb90) {
            return ((sb90) collection).b();
        }
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(va51 va51Var, qim0 qim0Var, xu30 xu30Var, b0k b0kVar, int i, int i2) throws NoWhenBranchMatchedException {
        xu30 xu30Var2;
        int i3;
        x340 x340Var;
        xu30 xu30Var3;
        qim0 qim0Var2;
        xu30 xu30Var4;
        nim0 nim0Var;
        llj lljVar;
        llj lljVar2;
        llj lljVar3;
        n4k n4kVar;
        int i4;
        float f;
        nim0 nim0Var2;
        xu30 xu30Var5;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(627105317);
        j06 j06Var = x340Var2.a;
        int i5 = i | (x340Var2.g(va51Var) ? 4 : 2);
        int i6 = i5 | 48;
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i5 | 432;
            xu30Var2 = xu30Var;
        } else {
            xu30Var2 = xu30Var;
            i3 = i6 | (x340Var2.i(xu30Var2) ? 256 : 128);
        }
        if (x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            if (i7 != 0) {
                xu30Var2 = ffj.a;
            }
            boolean zE = x340Var2.e(l1d.C(va51Var.e()));
            Object objT = x340Var2.T();
            if (zE || objT == fkj0.X) {
                objT = Boolean.valueOf(va51Var.e() != 3);
                x340Var2.s0(objT);
            }
            boolean zBooleanValue = ((Boolean) objT).booleanValue();
            nim0 nim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var3, 1.0f);
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5((byte) 16)), fraVar, x340Var2, 48);
            int iHashCode = Long.hashCode(tgp1.l(x340Var2));
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar2 = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar2);
            } else {
                x340Var2.v0();
            }
            llj lljVar4 = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar4);
            llj lljVar5 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar6 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar6);
            nko1.F(x340Var2);
            llj lljVar7 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar7);
            if (zBooleanValue) {
                x340Var2.i0(410423396);
                zkt0 zkt0VarA = mno1.A(va51Var.e());
                zov0 zov0Var = cbx.b(x340Var2).g;
                x340Var = x340Var2;
                xu30Var4 = xu30Var2;
                n4kVar = n4kVar2;
                lljVar3 = lljVar6;
                nim0Var = nim0Var3;
                lljVar = lljVar5;
                lljVar2 = lljVar7;
                i4 = 3;
                f = 1.0f;
                wkt0.a(zkt0VarA, u291.r(nim0Var3, 12.0f), (ksl) null, 0L, false, x340Var, 0, 28);
                x340Var.r(false);
            } else {
                xu30Var4 = xu30Var2;
                nim0Var = nim0Var3;
                lljVar = lljVar5;
                lljVar2 = lljVar7;
                lljVar3 = lljVar6;
                n4kVar = n4kVar2;
                x340Var = x340Var2;
                i4 = 3;
                f = 1.0f;
                x340Var.i0(410597337);
                x340Var.r(false);
            }
            d(va51Var, (va51Var.c().isEmpty() || va51Var.a() != 0) ? pw31.a.a(f, nim0Var, false) : nim0Var, x340Var, i3 & 14);
            if (va51Var.a() == i4 || va51Var.a() == 4) {
                nim0Var2 = nim0Var;
                x340Var.i0(410964625);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(tgp1.l(x340Var));
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, nim0Var2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar4);
                nko1.H(xos0VarM2, x340Var, lljVar);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar2);
                x340 x340Var3 = x340Var;
                k1u.a((qim0) null, 1, 0, (Function0) null, x340Var3, 48, 13);
                x340Var = x340Var3;
                xu30Var5 = xu30Var4;
                z = true;
                hrt.k(((i3 >> 3) & 112) | 6, xu30Var5, h2c.a, x340Var, true);
                x340Var.r(false);
            } else {
                if (va51Var.a() == 1) {
                    x340Var.i0(411135032);
                    jmr0 jmr0VarN = i3o1.n(2131233995, x340Var, 0);
                    String strO0 = cwl1.o0(x340Var, 2131961573);
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    x340 x340Var4 = x340Var;
                    nim0Var2 = nim0Var;
                    cwl1.f(jmr0VarN, strO0, u291.r(nim0Var, 12.0f), null, null, 0.0f, null, x340Var4, 8, 120);
                    x340Var = x340Var4;
                    x340Var.r(false);
                } else {
                    nim0Var2 = nim0Var;
                    if (va51Var.a() == 2) {
                        x340Var.i0(411561282);
                        zov0 zov0Var3 = cbx.b(x340Var).g;
                        x340 x340Var5 = x340Var;
                        w0h1.a(wtx.c, new jsl(cwl1.o0(x340Var, 2131961573)), u291.r(nim0Var2, 12.0f), ((gmt) zex.a.c).g().a(), 0L, true, x340Var5, wtx.d | 196608, 16);
                        x340Var = x340Var5;
                        x340Var.r(false);
                    } else {
                        x340Var.i0(411896857);
                        x340Var.r(false);
                    }
                }
                xu30Var5 = xu30Var4;
                z = true;
            }
            x340Var.r(z);
            xu30Var3 = xu30Var5;
            qim0Var2 = nim0Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            xu30Var3 = xu30Var2;
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ua51(va51Var, qim0Var2, xu30Var3, i, i2);
        }
    }

    public static final Object[] c0(Collection collection) {
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArrCopyOf = new Object[size];
        int i = 0;
        while (true) {
            int i2 = i + 1;
            objArrCopyOf[i] = it.next();
            if (i2 >= objArrCopyOf.length) {
                if (!it.hasNext()) {
                    return objArrCopyOf;
                }
                int i3 = ((i2 * 3) + 1) >>> 1;
                if (i3 <= i2) {
                    i3 = 2147483645;
                    if (i2 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArrCopyOf, i2);
            }
            i = i2;
        }
    }

    public static final void d(va51 va51Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2 = qim0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1281731106);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(va51Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var2) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (va51Var.c().isEmpty()) {
            x340Var.i0(1792243454);
            uwo1.e(va51Var.f(), qim0Var2, (lee1) null, B(va51Var, x340Var), (a0e1) null, (iu30) null, 2, false, new cjc0(va51Var.d()), 0, (qx8) null, x340Var, (i2 & 112) | 1572864, 0, 1716);
            x340Var.r(false);
            qim0Var2 = qim0Var;
        } else {
            int i3 = i2;
            x340Var.i0(1792455897);
            c380 c380VarC = va51Var.c();
            ai4 ai4VarB = va51Var.b();
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zG = x340Var.g(context);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new oq51(context);
                x340Var.s0(objT);
            }
            ((oq51) objT).getClass();
            uwo1.d(oq51.b(c380VarC, ai4VarB, x340Var), B(va51Var, x340Var), qim0Var, (lee1) null, (a0e1) null, (iu30) null, 2, false, new cjc0(va51Var.d()), 0, (qx8) null, (cqs0) null, x340Var, ((i3 << 3) & 896) | 1572864, 0, 3768);
            qim0Var2 = qim0Var;
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(va51Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final Object[] d0(Collection collection, Object[] objArr) {
        objArr.getClass();
        int size = collection.size();
        int i = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                Object[] objArrCopyOf = size <= objArr.length ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
                while (true) {
                    int i2 = i + 1;
                    objArrCopyOf[i] = it.next();
                    if (i2 >= objArrCopyOf.length) {
                        if (!it.hasNext()) {
                            return objArrCopyOf;
                        }
                        int i3 = ((i2 * 3) + 1) >>> 1;
                        if (i3 <= i2) {
                            i3 = 2147483645;
                            if (i2 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArrCopyOf = Arrays.copyOf(objArrCopyOf, i3);
                    } else if (!it.hasNext()) {
                        if (objArrCopyOf != objArr) {
                            return Arrays.copyOf(objArrCopyOf, i2);
                        }
                        objArr[i2] = null;
                        return objArr;
                    }
                    i = i2;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static final void e(guf0 guf0Var, guf0 guf0Var2) {
        if (dhn.a.contains(bmq0.class)) {
            return;
        }
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var.b(1);
            int iB3 = guf0Var.b(2);
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var2.a();
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iB2; i2++) {
                    for (int i3 = 0; i3 < iB3; i3++) {
                        int i4 = (i2 * iB3) + (i * iB2 * iB3) + i3;
                        fArrA[i4] = fArrA[i4] + fArrA2[i3];
                    }
                }
            }
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
        }
    }

    public static final c380 e0(String str) {
        List listX;
        Pattern patternCompile = Pattern.compile("\n+");
        int iEnd = 0;
        ihc1.N0(0);
        Matcher matcher = patternCompile.matcher(str);
        if (matcher.find()) {
            ArrayList arrayList = new ArrayList(10);
            do {
                arrayList.add(str.subSequence(iEnd, matcher.start()).toString());
                iEnd = matcher.end();
            } while (matcher.find());
            arrayList.add(str.subSequence(iEnd, str.length()).toString());
            listX = arrayList;
        } else {
            listX = k4p1.x(str.toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : listX) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        return mqo1.A(arrayList2);
    }

    public static List f(int... iArr) {
        return iArr.length == 0 ? Collections.EMPTY_LIST : new sb90(iArr);
    }

    public static final guf0 f0(guf0 guf0Var) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var.b(1);
            guf0 guf0Var2 = new guf0(new int[]{iB2, iB});
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var2.a();
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iB2; i2++) {
                    fArrA2[(i2 * iB) + i] = fArrA[(i * iB2) + i2];
                }
            }
            return guf0Var2;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    public static final int g(long[] jArr, long j) {
        int length = jArr.length - 1;
        int i = 0;
        while (i <= length) {
            int i2 = (i + length) >>> 1;
            long j2 = jArr[i2];
            if (j > j2) {
                i = i2 + 1;
            } else {
                if (j >= j2) {
                    return i2;
                }
                length = i2 - 1;
            }
        }
        return -(i + 1);
    }

    public static final guf0 g0(guf0 guf0Var) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var.b(1);
            int iB3 = guf0Var.b(2);
            guf0 guf0Var2 = new guf0(new int[]{iB3, iB2, iB});
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var2.a();
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iB2; i2++) {
                    for (int i3 = 0; i3 < iB3; i3++) {
                        fArrA2[(i2 * iB) + (i3 * iB * iB2) + i] = fArrA[(i2 * iB3) + (i * iB2 * iB3) + i3];
                    }
                }
            }
            return guf0Var2;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000a  */
    public static Integer h0(String str) {
        Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            int i = str.charAt(0) == '-' ? 1 : 0;
            if (i != str.length()) {
                int i2 = i + 1;
                int iA = s5f0.a(str.charAt(i));
                if (iA >= 0 && iA < 10) {
                    long j = -iA;
                    while (true) {
                        if (i2 >= str.length()) {
                            if (i == 0) {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = Long.valueOf(j);
                            break;
                        }
                        int i3 = i2 + 1;
                        int iA2 = s5f0.a(str.charAt(i2));
                        if (iA2 >= 0 && iA2 < 10 && j >= -922337203685477580L) {
                            long j2 = j * 10;
                            long j3 = iA2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i2 = i3;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return Integer.valueOf(lValueOf.intValue());
    }

    public static int i(int i) {
        float[] fArr = new float[3];
        Color.colorToHSV(i, fArr);
        float f = fArr[2];
        if (f >= 1.0f) {
            fArr[1] = fArr[1] - 0.1f;
        } else {
            fArr[2] = f + 0.1f;
        }
        return Color.HSVToColor(fArr);
    }

    public static final CharSequence i0(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (charSequence2 == null) {
            charSequence2 = "";
        }
        if (charSequence.length() == 0) {
            return charSequence2;
        }
        if (charSequence2.length() == 0) {
            return charSequence;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append(charSequence);
        spannableStringBuilder.append((CharSequence) " • ");
        spannableStringBuilder.append(charSequence2);
        return new SpannedString(spannableStringBuilder);
    }

    public static int j(long j) {
        int i = (int) j;
        dm5.j(j, "Out of range: %s", ((long) i) == j);
        return i;
    }

    public static final String j0(String str, String str2) {
        return i0(str, str2).toString();
    }

    public static final String k(int i) {
        return String.format("#%08X", Arrays.copyOf(new Object[]{Long.valueOf(4294967295L & ((long) i))}, 1));
    }

    public static final String k0(List list) {
        ArrayList arrayListO0 = o7h.o0(list);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListO0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
    }

    public static final guf0 l(guf0[] guf0VarArr) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int iB = guf0VarArr[0].b(0);
            int iB2 = 0;
            for (guf0 guf0Var : guf0VarArr) {
                iB2 += guf0Var.b(1);
            }
            guf0 guf0Var2 = new guf0(new int[]{iB, iB2});
            float[] fArrA = guf0Var2.a();
            for (int i = 0; i < iB; i++) {
                int i2 = i * iB2;
                int length = guf0VarArr.length;
                for (int i3 = 0; i3 < length; i3++) {
                    float[] fArrA2 = guf0VarArr[i3].a();
                    int iB3 = guf0VarArr[i3].b(1);
                    System.arraycopy(fArrA2, i * iB3, fArrA, i2, iB3);
                    i2 += iB3;
                }
            }
            return guf0Var2;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    public static final i6o1 l0(q7o1 q7o1Var, unn1 unn1Var) {
        rnn1 rnn1VarI = unn1Var.i();
        rnn1VarI.j(q7o1Var.zza());
        return new i6o1(q7o1Var.zza(), rnn1VarI.e());
    }

    public static int m(int i, int i2) {
        dm5.k("min (%s) must be less than or equal to max (%s)", i2, 1073741823, i2 <= 1073741823);
        return Math.min(Math.max(i, i2), 1073741823);
    }

    public static final c6o1 m0(q7o1 q7o1Var, qnn1 qnn1Var) {
        pnn1 pnn1VarI = qnn1Var.i();
        pnn1VarI.h(q7o1Var.zza());
        return new c6o1(q7o1Var.zza(), pnn1VarI.e());
    }

    public static final ComposeView n(zf30 zf30Var, j2i j2iVar) {
        ComposeView composeView = new ComposeView(zf30Var.P0(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(p5x0.W0);
        composeView.setContent(j2iVar);
        return composeView;
    }

    public static final guf0 o(guf0 guf0Var, guf0 guf0Var2) {
        guf0 guf0Var3;
        guf0 guf0Var4 = null;
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        int i = 0;
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var.b(1);
            int iB3 = guf0Var.b(2);
            int iB4 = guf0Var2.b(0);
            int i2 = (iB2 - iB4) + 1;
            int iB5 = guf0Var2.b(2);
            guf0 guf0Var5 = new guf0(new int[]{iB, i2, iB5});
            float[] fArrA = guf0Var.a();
            float[] fArrA2 = guf0Var5.a();
            float[] fArrA3 = guf0Var2.a();
            int i3 = 0;
            while (i3 < iB) {
                int i4 = i;
                while (i4 < iB5) {
                    int i5 = i;
                    while (i5 < i2) {
                        float f = 0.0f;
                        while (i < iB4) {
                            guf0Var3 = guf0Var4;
                            for (int i6 = 0; i6 < iB3; i6++) {
                                try {
                                    f = (fArrA[((i + i5) * iB3) + (iB2 * iB3 * i3) + i6] * fArrA3[(((i * iB3) + i6) * iB5) + i4]) + f;
                                } catch (Throwable th) {
                                    th = th;
                                    dhn.a(bmq0.class, th);
                                    return guf0Var3;
                                }
                            }
                            i++;
                            guf0Var4 = guf0Var3;
                        }
                        guf0 guf0Var6 = guf0Var4;
                        fArrA2[(i5 * iB5) + (i2 * iB5 * i3) + i4] = f;
                        i5++;
                        guf0Var4 = guf0Var6;
                        i = 0;
                    }
                    i4++;
                    i = 0;
                }
                i3++;
                i = 0;
            }
            return guf0Var5;
        } catch (Throwable th2) {
            th = th2;
            guf0Var3 = null;
        }
    }

    public static final guf0 q(guf0 guf0Var, guf0 guf0Var2, guf0 guf0Var3) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int iB = guf0Var.b(0);
            int iB2 = guf0Var3.b(0);
            guf0 guf0VarK = K(guf0Var, guf0Var2);
            float[] fArrA = guf0Var3.a();
            float[] fArrA2 = guf0VarK.a();
            for (int i = 0; i < iB; i++) {
                for (int i2 = 0; i2 < iB2; i2++) {
                    int i3 = (i * iB2) + i2;
                    fArrA2[i3] = fArrA2[i3] + fArrA[i2];
                }
            }
            return guf0VarK;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    public static final guf0 r(String[] strArr, guf0 guf0Var) {
        if (dhn.a.contains(bmq0.class)) {
            return null;
        }
        try {
            int length = strArr.length;
            int iB = guf0Var.b(1);
            guf0 guf0Var2 = new guf0(new int[]{length, 128, iB});
            float[] fArrA = guf0Var2.a();
            float[] fArrA2 = guf0Var.a();
            for (int i = 0; i < length; i++) {
                int[] iArrD = mpi1.b.d(strArr[i]);
                for (int i2 = 0; i2 < 128; i2++) {
                    System.arraycopy(fArrA2, iArrD[i2] * iB, fArrA, (iB * i2) + (iB * 128 * i), iB);
                }
            }
            return guf0Var2;
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
            return null;
        }
    }

    public static final void s(guf0 guf0Var) {
        if (dhn.a.contains(bmq0.class)) {
            return;
        }
        try {
            if (1 >= guf0Var.c()) {
                return;
            }
            int iC = guf0Var.c();
            int iB = 1;
            for (int i = 1; i < iC; i++) {
                iB *= guf0Var.b(i);
            }
            guf0Var.d(new int[]{guf0Var.b(0), iB});
        } catch (Throwable th) {
            dhn.a(bmq0.class, th);
        }
    }

    public static int t(byte[] bArr) {
        dm5.k("array too small: %s < %s", bArr.length, 4, bArr.length >= 4);
        return u(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int u(byte b, byte b2, byte b3, byte b4) {
        return (b << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static final String v(String str) {
        if (!G(str)) {
            throw new FacebookException("Invalid Code Verifier.");
        }
        try {
            byte[] bytes = str.getBytes(nne.d);
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            return Base64.encodeToString(messageDigest.digest(), 11);
        } catch (Exception e) {
            throw new FacebookException(e);
        }
    }

    public static r8i0 w(String str) {
        mbh0 mbh0VarC = r8i0.e.c(0, str);
        if (mbh0VarC == null) {
            hhg1.n(cy30.n("No subtype found for: \"", str, '\"'));
            return null;
        }
        String str2 = (String) mbh0VarC.a().get(1);
        Locale locale = Locale.ROOT;
        String lowerCase = str2.toLowerCase(locale);
        String lowerCase2 = ((String) mbh0VarC.a().get(2)).toLowerCase(locale);
        ArrayList arrayList = new ArrayList();
        int i = ((rr80) mbh0VarC.b()).b;
        while (true) {
            int i2 = i + 1;
            if (i2 >= str.length()) {
                return new r8i0(str, lowerCase, lowerCase2, (String[]) arrayList.toArray(new String[0]));
            }
            mbh0 mbh0VarC2 = r8i0.f.c(i2, str);
            if (mbh0VarC2 == null) {
                k220.l("Parameter is not formatted correctly: \"", str.substring(i2), "\" for: \"", str, 34);
                return null;
            }
            lbh0 lbh0Var = mbh0VarC2.c;
            p8h0 p8h0VarC = lbh0Var.c(1);
            String str3 = p8h0VarC != null ? p8h0VarC.a : null;
            if (str3 == null) {
                i = ((rr80) mbh0VarC2.b()).b;
            } else {
                p8h0 p8h0VarC2 = lbh0Var.c(2);
                String strH = p8h0VarC2 != null ? p8h0VarC2.a : null;
                if (strH == null) {
                    p8h0 p8h0VarC3 = lbh0Var.c(3);
                    p8h0VarC3.getClass();
                    strH = p8h0VarC3.a;
                } else if (ihc1.R0(strH, '\'') && ihc1.n0(strH, '\'') && strH.length() > 2) {
                    strH = cy30.h(1, 1, strH);
                }
                arrayList.add(str3);
                arrayList.add(strH);
                i = ((rr80) mbh0VarC2.b()).b;
            }
        }
    }

    public static void x() {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        stackTraceElement.getFileName();
        stackTraceElement.getLineNumber();
    }

    public static String y(Context context, int i) {
        if (i == -1) {
            return "UNKNOWN";
        }
        try {
            return context.getResources().getResourceEntryName(i);
        } catch (Exception unused) {
            return f4i1.c(i, "?");
        }
    }

    public static String z(View view) {
        try {
            return view.getContext().getResources().getResourceEntryName(view.getId());
        } catch (Exception unused) {
            return "UNKNOWN";
        }
    }

    public abstract wt50 C();

    public void D(y341 y341Var, Object obj) {
        if (obj == null) {
            return;
        }
        d441 d441VarG1 = y341Var.g1(p());
        try {
            h(d441VarG1, obj);
            d441VarG1.f1();
            o0c.v(d441VarG1, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public void E(y341 y341Var, AbstractList abstractList) {
        d441 d441VarG1 = y341Var.g1(p());
        try {
            for (Object obj : abstractList) {
                if (obj != null) {
                    h(d441VarG1, obj);
                    d441VarG1.f1();
                    d441VarG1.reset();
                }
            }
            o0c.v(d441VarG1, (Throwable) null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public abstract void N(int i, String str);

    public void O(ig01 ig01Var, int i, String str) {
        Logger.g("[WebSocket] Socket closing, code=%d reason=%s", Integer.valueOf(i), str);
        if (i == 1005) {
            ig01Var.b(1000, (String) null);
        } else {
            ig01Var.b(i, str);
        }
    }

    public abstract void P(Throwable th, ry21 ry21Var);

    public abstract void R(rhc rhcVar);

    public abstract void S(ig01 ig01Var, ry21 ry21Var);

    public bmq0 T(byte[] bArr) {
        return U(bArr, bArr.length);
    }

    public abstract bmq0 U(byte[] bArr, int i);

    public abstract bmq0 V(char c);

    public abstract void h(d441 d441Var, Object obj);

    public String p() {
        return "INSERT OR REPLACE INTO `lyrics_entities` (`track_id`,`lines`,`syncStatus`,`translations`,`language`,`isRTL`,`provider`,`colors`,`vocalRemovalStatus`) VALUES (?,?,?,?,?,?,?,?,?)";
    }

    public void Q(String str) {
    }
}
