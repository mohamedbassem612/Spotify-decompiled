package p;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.base.java.logging.Logger;
import com.spotify.concertcampaignview.v1.CtaType;
import io.reactivex.rxjava3.core.Single;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zho1 {
    public static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153, 1769172332, 1885955686};
    public static b180 b;

    public static final void A(boolean z, String str, c380 c380Var, bqm bqmVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1450596879);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.i(bqmVar) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(nim0.a, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            otw.c(bqmVar, new aqm(ypm.a, z, str, c380Var), (qim0) null, (ipb1) null, x340Var, (i2 >> 9) & 14, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zp51(z, str, c380Var, bqmVar, i, (byte) 10);
        }
    }

    public static final int C(x5f0 x5f0Var, ul3 ul3Var) {
        x5f0 x5f0VarT0 = x5f0Var.t0();
        if (x5f0VarT0 == null) {
            qf80.c("Child of " + x5f0Var + " cannot be null when calculating alignment line");
        }
        if (x5f0Var.A0().c().containsKey(ul3Var)) {
            Integer num = (Integer) x5f0Var.A0().c().get(ul3Var);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int iU = x5f0VarT0.U(ul3Var);
            if (iU != Integer.MIN_VALUE) {
                boolean z = x5f0Var.N0;
                boolean z2 = x5f0Var.O0;
                x5f0VarT0.N0 = true;
                x5f0Var.O0 = true;
                x5f0Var.K0();
                x5f0VarT0.N0 = z;
                x5f0Var.O0 = z2;
                return iU + ((int) (ul3Var instanceof vq60 ? x5f0VarT0.E0() & 4294967295L : x5f0VarT0.E0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final long D(float f, float f2, float f3, float f4, long j) {
        float f5 = f4 / 2.0f;
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (j >> 32)) * f) - f5;
        float fIntBitsToFloat2 = (((1.0f - Float.intBitsToFloat((int) (j & 4294967295L))) * f3) + f2) - f5;
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    public static final b180 E() {
        b180 b180Var = b;
        if (b180Var != null) {
            return b180Var;
        }
        a180 a180Var = new a180("Encore.Vector.MoreAndroid24", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = bui1.a;
        n6a1 n6a1Var = new n6a1(u7h.b);
        cwh0 cwh0VarG = lf51.g(10.5f, 4.5f);
        cwh0VarG.c(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        cwh0VarG.c(1.5f, 1.5f, false, false, -3.0f, 0.0f);
        cwh0VarG.m(0.0f, 15.0f);
        cwh0VarG.c(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        cwh0VarG.c(1.5f, 1.5f, false, false, -3.0f, 0.0f);
        cwh0VarG.m(0.0f, -7.5f);
        cwh0VarG.c(1.5f, 1.5f, true, false, 3.0f, 0.0f);
        cwh0VarG.c(1.5f, 1.5f, false, false, -3.0f, 0.0f);
        a180.a(a180Var, cwh0VarG.a, n6a1Var, 1.0f, 2, 1.0f);
        b180 b180VarB = a180Var.b();
        b = b180VarB;
        return b180VarB;
    }

    public static Set F() {
        try {
            Object objInvoke = Class.forName("android.text.EmojiConsistency").getMethod("getEmojiConsistencySet", null).invoke(null, null);
            if (objInvoke == null) {
                return Collections.EMPTY_SET;
            }
            Set set = (Set) objInvoke;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                if (!(it.next() instanceof int[])) {
                    return Collections.EMPTY_SET;
                }
            }
            return set;
        } catch (Throwable unused) {
            return Collections.EMPTY_SET;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object G(String str, onm onmVar, gw70 gw70Var) {
        i8c1 i8c1Var;
        if (onmVar instanceof i8c1) {
            i8c1Var = (i8c1) onmVar;
            int i = i8c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                i8c1Var.c = i - Integer.MIN_VALUE;
            } else {
                i8c1Var = new i8c1(onmVar);
            }
        } else {
            i8c1Var = new i8c1(onmVar);
        }
        Object objJ = i8c1Var.b;
        int i2 = i8c1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleI = gw70Var.f(str).i();
                i8c1Var.a = str;
                i8c1Var.c = 1;
                objJ = fc11.j(singleI, i8c1Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = i8c1Var.a;
                hm5.M(objJ);
            }
            Bitmap bitmap = (Bitmap) objJ;
            bitmap.getClass();
            return bitmap;
        } catch (Exception e) {
            Logger.e(e, l1d.m("Error loading image url: ", str), new Object[0]);
            throw e;
        }
    }

    public static final Single H(hc51 hc51Var, Function0 function0) {
        return Single.defer(new xf0(hc51Var, function0, (byte) 6));
    }

    public static final gpr0 I(int i, String str, String str2) {
        Integer numL = L(str2);
        return new gpr0(new ipr0(str, i, numL != null ? numL.intValue() : -1), z6x.a);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0170  */
    /* JADX WARN: Code duplicated, block: B:112:0x0173  */
    /* JADX WARN: Code duplicated, block: B:114:0x0177 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:115:0x0179  */
    /* JADX WARN: Code duplicated, block: B:117:0x017c  */
    /* JADX WARN: Code duplicated, block: B:119:0x017f A[RETURN] */
    /* JADX WARN: Multi-variable type inference failed */
    public static iw91 J(fc10 fc10Var, boolean z) {
        iw91 iw91Var;
        boolean z2;
        long jY;
        int i;
        int i2;
        long j;
        boolean z3;
        int[] iArr;
        long length = fc10Var.getLength();
        long j2 = -1;
        long j3 = 4096;
        if (length != -1 && length <= 4096) {
            j3 = length;
        }
        int i3 = (int) j3;
        izr0 izr0Var = new izr0(64);
        int i4 = 0;
        int i5 = 0;
        boolean z4 = false;
        while (true) {
            if (i5 < i3) {
                izr0Var.O(8);
                if (fc10Var.d(izr0Var.a, i4, 8, true)) {
                    long jG = izr0Var.G();
                    int iQ = izr0Var.q();
                    if (jG == 1) {
                        fc10Var.h(8, izr0Var.a, 8);
                        i = 16;
                        izr0Var.Q(16);
                        jY = izr0Var.y();
                    } else {
                        if (jG == 0) {
                            long length2 = fc10Var.getLength();
                            if (length2 != j2) {
                                jG = (length2 - fc10Var.j()) + 8;
                            }
                        }
                        jY = jG;
                        i = 8;
                    }
                    long j4 = i;
                    if (jY < j4) {
                        iw91Var = null;
                        if (iQ != 1718773093 || i != 8) {
                            return new sj7(iQ, jY, i);
                        }
                        jY = j4;
                    } else {
                        iw91Var = null;
                    }
                    int i6 = i5 + i;
                    if (iQ == 1836019574 || iQ == 1970628964) {
                        i3 += (int) jY;
                        i2 = iQ;
                        if (length != -1 && i3 > length) {
                            i3 = (int) length;
                        }
                        if (i2 == 1836019574) {
                            i5 = i6;
                        }
                        j2 = -1;
                        i4 = 0;
                    } else {
                        i2 = iQ;
                    }
                    if (i2 == 1953653099 || i2 == 1835297121 || i2 == 1835626086) {
                        j = length;
                        i5 = i6;
                    } else if (i2 == 1836019558 || i2 == 1836475768) {
                        z2 = true;
                    } else {
                        if (i2 == 1835295092) {
                            z4 = true;
                        }
                        if (i2 != 1937007212 || jY <= 1000000) {
                            j = length;
                            if ((((long) i6) + jY) - j4 < i3) {
                                int i7 = (int) (jY - j4);
                                i5 = i6 + i7;
                                if (i2 == 1718909296) {
                                    if (i7 < 8) {
                                        return new sj7(i2, i7, 8);
                                    }
                                    izr0Var.O(i7);
                                    int i8 = 0;
                                    fc10Var.h(0, izr0Var.a, i7);
                                    int iQ2 = izr0Var.q();
                                    int i9 = iQ2 >>> 8;
                                    int[] iArr2 = a;
                                    if (i9 == 3368816) {
                                        z4 = true;
                                        break;
                                    }
                                    for (int i10 = 0; i10 < 29; i10++) {
                                        if (iArr2[i10] == iQ2) {
                                            z4 = true;
                                            break;
                                        }
                                    }
                                    izr0Var.S(4);
                                    int iA = izr0Var.a() / 4;
                                    if (!z4 && iA > 0) {
                                        int[] iArr3 = new int[iA];
                                        int i11 = 0;
                                        while (true) {
                                            if (i11 >= iA) {
                                                iArr = iArr3;
                                                z3 = z4;
                                                break;
                                            }
                                            int iQ3 = izr0Var.q();
                                            iArr3[i11] = iQ3;
                                            if ((iQ3 >>> 8) != 3368816) {
                                                int i12 = i8;
                                                while (true) {
                                                    if (i12 >= 29) {
                                                        i11++;
                                                        i8 = 0;
                                                    } else if (iArr2[i12] != iQ3) {
                                                        i12++;
                                                    }
                                                }
                                            }
                                            iArr = iArr3;
                                            z3 = true;
                                            break;
                                        }
                                    }
                                    z3 = z4;
                                    iArr = iw91Var;
                                    if (!z3) {
                                        return new jw91(iQ2, iArr);
                                    }
                                    z4 = z3;
                                } else if (i7 != 0) {
                                    fc10Var.k(i7);
                                }
                            }
                        }
                        z2 = false;
                    }
                    length = j;
                    j2 = -1;
                    i4 = 0;
                }
                if (!z4) {
                    return yj20.O0;
                }
                if (z != z2) {
                    return z2 ? m980.c : m980.d;
                }
                return iw91Var;
            }
            iw91Var = null;
            z2 = false;
            if (!z4) {
                return yj20.O0;
            }
            if (z != z2) {
                if (z2) {
                }
            }
            return iw91Var;
        }
    }

    public static final g36 K(boolean z, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        tob1 tob1VarB = z95.b(z ? -1.0f : 0.0f, irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ((jhx) ((cwx) x340Var.k(mde0.a)).a.d).a, 2), "bias", (iu30) null, x340Var, 3072, 20);
        boolean zG = x340Var.g(tob1VarB);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new d36(16.0f, false, new g21(new n0v0(tob1VarB, (byte) 12), (byte) 28));
            x340Var.s0(objT);
        }
        return (g36) objT;
    }

    public static final Integer L(String str) {
        try {
            String str2 = str.length() > 0 ? str : null;
            if (str2 != null) {
                return Integer.valueOf(Color.parseColor(str2));
            }
            return null;
        } catch (Exception e) {
            Logger.e(e, "Error parsing color - ".concat(str), new Object[0]);
            return null;
        }
    }

    public static void M(bt00 bt00Var, b380 b380Var, String str, String str2) {
        bt00Var.a.e(b380Var);
        if (str != null) {
            bt00Var.g = str;
        }
        if (str2 != null) {
            bt00Var.n = str2;
        }
    }

    public static String N(String str, Object... objArr) {
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
                    String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
                    java.util.logging.Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
                    StringBuilder sbT = l1d.t("<", str2, " threw ");
                    sbT.append(e.getClass().getName());
                    sbT.append(">");
                    string = sbT.toString();
                }
            }
            objArr[i2] = string;
            i2++;
        }
        StringBuilder sb = new StringBuilder(str.length() + (length * 16));
        int i3 = 0;
        while (true) {
            length2 = objArr.length;
            if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i3, iIndexOf);
            sb.append(objArr[i]);
            i++;
            i3 = iIndexOf + 2;
        }
        sb.append((CharSequence) str, i3, str.length());
        if (i < length2) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i4 = i + 1; i4 < objArr.length; i4++) {
                sb.append(", ");
                sb.append(objArr[i4]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static final void a(String str, long j, long j2, pmg1 pmg1Var, float f, float f2, float f3, float f4, b0k b0kVar, int i) {
        int i2;
        long j3;
        float f5;
        float f6;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-139293680);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            j3 = j;
            i2 |= x340Var.f(j3) ? 32 : 16;
        } else {
            j3 = j;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.f(j2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(pmg1Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            f5 = f;
            i2 |= x340Var.d(f5) ? 16384 : 8192;
        } else {
            f5 = f;
        }
        if ((196608 & i) == 0) {
            f6 = f2;
            i2 |= x340Var.d(f6) ? 131072 : 65536;
        } else {
            f6 = f2;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.d(f3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.d(f4) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = p3d1.n(0L, x340Var);
            }
            ven0 ven0Var = (ven0) objT;
            boolean z = ((i2 & 896) == 256) | ((i2 & 7168) == 2048) | ((57344 & i2) == 16384) | ((458752 & i2) == 131072) | ((3670016 & i2) == 1048576) | ((29360128 & i2) == 8388608);
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                dzm dzmVar = new dzm(j2, pmg1Var, f5, f6, f3, f4, ven0Var);
                x340Var.s0(dzmVar);
                objT2 = dzmVar;
            }
            qim0 qim0VarK = eqr0.k(nim0.a, (iu30) objT2);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = new bzm(ven0Var, (byte) 1);
                x340Var.s0(objT3);
            }
            vxo1.b(str, j3, lrn1.x(anm1.N("mixing_curve_value_label", lrn1.u(qim0VarK, (iu30) objT3)), 1.0f), x340Var, i2 & 126);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ezm(str, j, j2, pmg1Var, f, f2, f3, f4, i);
        }
    }

    public static final void b(uh6 uh6Var, uh6 uh6Var2, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1777714367);
        int i2 = (x340Var.i(uh6Var) ? 4 : 2) | i | (x340Var.i(uh6Var2) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qgo1.f((vnr0) uh6Var.invoke(x340Var, Integer.valueOf(i2 & 14)), null, new a0e1(3), 0, false, null, x340Var, 8, 58);
            qgo1.f((vnr0) uh6Var2.invoke(x340Var, Integer.valueOf((i2 >> 3) & 14)), null, new a0e1(3), 0, false, null, x340Var, 8, 58);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(uh6Var, uh6Var2, qim0Var, i, (byte) 23);
        }
    }

    public static final void c(boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-56897145);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            String strK = z ? x0d.k(x340Var, 1489362916, 2131959567, x340Var, false) : x0d.k(x340Var, 1489454676, 2131959566, x340Var, false);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            u(cwl1.o0(x340Var, 2131959565), x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(pox.c, strK, x340Var, pox.d);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(unx.c, cwl1.o0(x340Var, 2131959562), x340Var, unx.d);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(ttx.c, cwl1.o0(x340Var, 2131959550), x340Var, ttx.d);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new k750((byte) 15, i, z);
        }
    }

    public static final void d(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, f6d1 f6d1Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1846088677);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(pbh.a) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(z6d1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(e6d1Var.ordinal()) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i3 |= x340Var.e(f6d1Var.ordinal()) ? 1048576 : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= x340Var.i(iu30Var) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (x340Var.Y(i4 & 1, (4793491 & i4) != 4793490)) {
            r(K(z2, x340Var), apo.r(-295840126, new jjd0(z6d1Var, z2, z, e6d1Var, iu30Var, i, f6d1Var), x340Var), x340Var, (i4 & 14) | 384);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new v251(z6d1Var, i, z, z2, e6d1Var, f6d1Var, iu30Var, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:202:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:249:0x041a  */
    /* JADX WARN: Code duplicated, block: B:251:0x042b  */
    /* JADX WARN: Code duplicated, block: B:252:0x042f  */
    /* JADX WARN: Code duplicated, block: B:254:0x0436  */
    /* JADX WARN: Code duplicated, block: B:255:0x043b  */
    /* JADX WARN: Code duplicated, block: B:323:0x063e  */
    /* JADX WARN: Code duplicated, block: B:332:0x0658  */
    /* JADX WARN: Code duplicated, block: B:335:0x066e  */
    /* JADX WARN: Code duplicated, block: B:336:0x0670  */
    /* JADX WARN: Code duplicated, block: B:342:0x067d  */
    /* JADX WARN: Code duplicated, block: B:351:0x06a6  */
    /* JADX WARN: Code duplicated, block: B:354:0x06ae  */
    /* JADX WARN: Code duplicated, block: B:355:0x06b0  */
    /* JADX WARN: Code duplicated, block: B:358:0x06b8  */
    /* JADX WARN: Code duplicated, block: B:359:0x06ba  */
    /* JADX WARN: Code duplicated, block: B:365:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:445:0x08d9  */
    /* JADX WARN: Code duplicated, block: B:448:0x08ef  */
    /* JADX WARN: Code duplicated, block: B:449:0x08f1  */
    /* JADX WARN: Code duplicated, block: B:455:0x0905  */
    /* JADX WARN: Code duplicated, block: B:465:0x0935  */
    /* JADX WARN: Code duplicated, block: B:467:0x0939  */
    /* JADX WARN: Code duplicated, block: B:468:0x093b  */
    /* JADX WARN: Code duplicated, block: B:471:0x0941  */
    /* JADX WARN: Code duplicated, block: B:472:0x0943  */
    /* JADX WARN: Code duplicated, block: B:475:0x0958  */
    /* JADX WARN: Code duplicated, block: B:476:0x095a  */
    /* JADX WARN: Code duplicated, block: B:482:0x096a  */
    public static final void e(o4w o4wVar, gb5 gb5Var, long j, float f, float f2, float f3, float f4, pmg1 pmg1Var, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, vu30 vu30Var, c380 c380Var, float f5, bpo bpoVar, Integer num, vu30 vu30Var2, iu30 iu30Var2, Function0 function0, Function0 function1, b0k b0kVar, int i, int i2, int i3) {
        float f6;
        x340 x340Var;
        float f7;
        qim0 qim0Var2;
        qim0 qim0Var3;
        int i4;
        o4w o4wVar2;
        x340 x340Var2;
        float f8;
        o95 o95Var;
        boolean z5;
        float fFloatValue;
        qim0 qim0VarB;
        boolean z6;
        float f9;
        qim0 qim0Var4;
        xz3 xz3Var;
        boolean z7;
        Object obj;
        float f10;
        ss50 ss50Var;
        drr0 drr0Var;
        float f11;
        int i5;
        gb5 gb5Var2;
        Object kzmVar;
        int i6;
        Object obj2;
        Object obj3;
        int i7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object objT;
        Set set;
        drr0 drr0Var2;
        float f12;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objT2;
        ss50 ss50Var2;
        x340 x340Var3;
        Object obj4;
        Object hzmVar;
        boolean z16;
        gb5 gb5Var3;
        Object obj5;
        yym yymVar;
        int i8;
        float f13;
        ss50 ss50Var3;
        Object objT3;
        boolean z17;
        boolean z18;
        boolean z19;
        Object objT4;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        Object objT5;
        boolean z24;
        Integer num2;
        xz3 xz3Var2;
        boolean z25;
        iu30 iu30Var3 = iu30Var;
        boolean z26 = z;
        boolean z27 = z4;
        x340 x340Var4 = (x340) b0kVar;
        Object obj6 = fkj0.X;
        x340Var4.k0(41312792);
        int i9 = (i & 6) == 0 ? i | (x340Var4.g(o4wVar) ? 4 : 2) : i;
        if ((i & 48) == 0) {
            i9 |= (i & 64) == 0 ? x340Var4.g(gb5Var) : x340Var4.i(gb5Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i9 |= x340Var4.f(j) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i9 |= x340Var4.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i9 |= x340Var4.d(f2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            f6 = f3;
            i9 |= x340Var4.d(f6) ? 131072 : 65536;
        } else {
            f6 = f3;
        }
        if ((i & 1572864) == 0) {
            i9 |= x340Var4.d(f4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i9 |= x340Var4.g(pmg1Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i9 |= x340Var4.i(iu30Var3) ? 67108864 : 33554432;
        }
        int i10 = i9 | 805306368;
        int i11 = (i2 & 6) == 0 ? i2 | (x340Var4.h(z26) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i11 |= x340Var4.h(z2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i11 |= x340Var4.h(z3) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i11 |= x340Var4.h(z27) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i11 |= x340Var4.i(vu30Var) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i11 |= x340Var4.g(c380Var) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i11 |= x340Var4.d(f5) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i11 |= x340Var4.e(bpoVar == null ? -1 : bpoVar.ordinal()) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i11 |= x340Var4.g(num) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i11 |= x340Var4.i(vu30Var2) ? 536870912 : 268435456;
        }
        int i12 = i11;
        int i13 = (i3 & 6) == 0 ? i3 | (x340Var4.i(iu30Var2) ? 4 : 2) : i3;
        if ((i3 & 48) == 0) {
            i13 |= x340Var4.i(function0) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i13 |= x340Var4.i(function1) ? 256 : 128;
        }
        int i14 = i13;
        if (x340Var4.Y(i10 & 1, ((i10 & 306783379) == 306783378 && (i12 & 306783379) == 306783378 && (i14 & 147) == 146) ? false : true)) {
            x340Var4.d0();
            int i15 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i15 == 0 || x340Var4.E()) {
                qim0Var3 = qim0Var5;
            } else {
                x340Var4.b0();
                qim0Var3 = qim0Var;
            }
            x340Var4.s();
            ss50 ss50Var4 = (ss50) x340Var4.k(t4k.l);
            wat watVar = (wat) x340Var4.k(t4k.h);
            float f14 = pmg1Var.c;
            float f15 = pmg1Var.d;
            float f16 = f14 * f15;
            float f17 = pmg1Var.b * f15;
            int i16 = i14;
            float f18 = bpoVar.a() ? f5 : 0.0f;
            boolean zA = bpoVar.a();
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var4.T);
            xos0 xos0VarM = x340Var4.m();
            qim0 qim0VarE = zr7.E(x340Var4, qim0Var3);
            hzj.A.getClass();
            qim0 qim0Var6 = qim0Var3;
            if (x340Var4.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var4.m0();
            if (x340Var4.S) {
                x340Var4.l(hmb0.t1);
            } else {
                x340Var4.v0();
            }
            nko1.H(gfh0VarC, x340Var4, y580.O0);
            nko1.H(xos0VarM, x340Var4, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var4, y580.R0);
            nko1.F(x340Var4);
            nko1.H(qim0VarE, x340Var4, y580.Y);
            if (z27 && z3) {
                x340Var4.i0(1402414737);
                o4wVar2 = o4wVar;
                Integer num3 = o4wVar2.c;
                if (num3 != null) {
                    xz3Var2 = (xz3) o7h.t0(num3.intValue(), o4wVar2.a);
                    if (xz3Var2 == null || xz3Var2.b()) {
                        xz3Var2 = null;
                    }
                } else {
                    xz3Var2 = null;
                }
                if (xz3Var2 == null) {
                    x340Var4.i0(525183888);
                    x340Var4.r(false);
                    z25 = false;
                    x340Var2 = x340Var4;
                    i4 = 32;
                } else {
                    x340Var4.i0(525183889);
                    int i17 = i10 >> 3;
                    i4 = 32;
                    f(xz3Var2.a, j, pmg1Var, f2, f6, eqr0.D(watVar.N0(-pmg1Var.i), 0.0f, 2, qim0Var5), false, null, x340Var4, (i17 & 112) | ((i10 >> 15) & 896) | (i17 & 7168) | (i17 & 57344), 192);
                    x340Var2 = x340Var4;
                    z25 = false;
                    x340Var2.r(false);
                }
                x340Var2.r(z25);
            } else {
                i4 = 32;
                o4wVar2 = o4wVar;
                watVar = watVar;
                x340Var2 = x340Var4;
                obj6 = obj6;
                x340Var2.i0(525650160);
                x340Var2.r(false);
            }
            x340Var2.i0(1402443296);
            int i18 = 0;
            for (Object obj7 : o4wVar2.a) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    p7h.T();
                    throw null;
                }
                xz3 xz3Var3 = (xz3) obj7;
                x340Var2.f0(-248474448, Integer.valueOf(i18));
                c14 c14Var = xz3Var3.b;
                boolean z28 = c14Var == c14.a || c14Var == c14.c;
                if (!z28 || z26) {
                    if (z28 || z2) {
                        if (xz3Var3.b()) {
                            f8 = 0.4f * f;
                        } else if (z28) {
                            f8 = f;
                        } else {
                            o95 o95Var2 = gb5Var.a;
                            float f19 = 1.0f;
                            if (gb5Var.d.getValue() == null && ((Number) o95Var2.e()).floatValue() < 1.0f && gb5Var.c()) {
                                o4w o4wVar3 = (o4w) gb5Var.b.getValue();
                                if (o4wVar3 == null) {
                                    o95Var = o95Var2;
                                } else {
                                    o95Var = o95Var2;
                                    o4w o4wVar4 = (o4w) gb5Var.c.getValue();
                                    if (o4wVar4 != null) {
                                        z5 = x760.z(o4wVar3, o4wVar4);
                                    }
                                    if (!z5) {
                                        fFloatValue = ((Number) o95Var.e()).floatValue();
                                        if (fFloatValue < 0.2f) {
                                            f19 = 1.0f - (fFloatValue / 0.2f);
                                        } else if (fFloatValue > 0.8f) {
                                            f19 = (fFloatValue - 0.8f) / 0.2f;
                                        } else {
                                            f19 = 0.0f;
                                        }
                                    }
                                }
                                z5 = false;
                                if (!z5) {
                                    fFloatValue = ((Number) o95Var.e()).floatValue();
                                    if (fFloatValue < 0.2f) {
                                        f19 = 1.0f - (fFloatValue / 0.2f);
                                    } else if (fFloatValue > 0.8f) {
                                        f19 = (fFloatValue - 0.8f) / 0.2f;
                                    } else {
                                        f19 = 0.0f;
                                    }
                                }
                            }
                            f8 = f19 * f;
                        }
                        boolean z29 = z27 && !xz3Var3.b();
                        boolean z30 = z29 && (num2 = o4wVar2.c) != null && num2.intValue() == i18;
                        String str = (z29 && num != null && num.intValue() == i18) ? (String) iu30Var3.invoke(Double.valueOf(Float.intBitsToFloat((int) (xz3Var3.a & 4294967295L)))) : null;
                        if (str != null) {
                            x340Var2.i0(888387811);
                            boolean zG = x340Var2.g(str);
                            Object objT6 = x340Var2.T();
                            if (zG || objT6 == obj6) {
                                objT6 = new kak(str, (byte) 19);
                                x340Var2.s0(objT6);
                            }
                            qim0VarB = s161.b(qim0Var5, false, (iu30) objT6);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(888470736);
                            x340Var2.r(false);
                            qim0VarB = qim0Var5;
                        }
                        if (xz3Var3.b()) {
                            x340Var2.i0(888572850);
                            boolean z31 = zA;
                            Object obj8 = obj6;
                            x340 x340Var5 = x340Var2;
                            float f20 = f16;
                            z6 = false;
                            long jD = D(f20, f2, f3, 16.0f, xz3Var3.a);
                            who1.b(j, f8, u291.r(eqr0.C(qim0Var5, r3v.a(jD), r3v.b(jD)), 16.0f), 0.0f, 0L, false, x340Var5, ((i10 >> 6) & 14) | 384, 112);
                            x340Var5.r(false);
                            qim0Var4 = qim0Var5;
                            f10 = f17;
                            f9 = f20;
                            x340Var3 = x340Var5;
                            z7 = z31;
                            i6 = 32;
                            ss50Var2 = ss50Var4;
                            xz3Var = xz3Var3;
                            f12 = f18;
                            obj3 = obj8;
                        } else {
                            boolean z32 = zA;
                            x340 x340Var6 = x340Var2;
                            Object obj9 = obj6;
                            float f21 = f16;
                            z6 = false;
                            if (z28) {
                                x340Var6.i0(889432542);
                                Object objT7 = x340Var6.T();
                                if (objT7 == obj9) {
                                    objT7 = new yym();
                                    x340Var6.s0(objT7);
                                }
                                yym yymVar2 = (yym) objT7;
                                int i20 = i16;
                                long jD2 = D(f21, f2, f3, 44.0f, xz3Var3.a);
                                f9 = f21;
                                qim0 qim0VarThen = anm1.N("mixing_curve_control_point_" + i18, u291.r(eqr0.C(qim0Var5, r3v.a(jD2), r3v.b(jD2)), 44.0f)).then(qim0VarB);
                                int i21 = i10 & 112;
                                boolean zI = x340Var6.i(yymVar2) | (i21 == 32 || ((i10 & 64) != 0 && x340Var6.i(gb5Var))) | ((i10 & 14) == 4) | x340Var6.e(i18) | x340Var6.d(f17);
                                float f22 = f18;
                                boolean zD = zI | ((i10 & 3670016) == 1048576) | x340Var6.d(f22) | ((i20 & 14) == 4) | x340Var6.h(z32) | x340Var6.i(ss50Var4);
                                Object objT8 = x340Var6.T();
                                if (zD) {
                                    obj4 = obj9;
                                } else {
                                    obj4 = obj9;
                                    if (objT8 != obj4) {
                                        z16 = z32;
                                        gb5Var3 = gb5Var;
                                        hzmVar = objT8;
                                        f13 = f17;
                                        yymVar = yymVar2;
                                        obj5 = obj4;
                                        ss50Var3 = ss50Var4;
                                        i8 = i18;
                                    }
                                    iu30 iu30Var4 = (iu30) hzmVar;
                                    objT3 = x340Var6.T();
                                    if (objT3 == obj5) {
                                        objT3 = lmm.g;
                                        x340Var6.s0(objT3);
                                    }
                                    Function0 function2 = (Function0) objT3;
                                    if (i21 != 32 || ((i10 & 64) != 0 && x340Var6.i(gb5Var3))) {
                                        z17 = true;
                                    } else {
                                        z17 = false;
                                    }
                                    boolean zE = z17 | x340Var6.e(i8) | x340Var6.i(yymVar) | x340Var6.d(f22);
                                    if ((i12 & 1879048192) == 536870912) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    z19 = zE | z18;
                                    objT4 = x340Var6.T();
                                    if (z19 || objT4 == obj5) {
                                        gb5 gb5Var4 = gb5Var3;
                                        izm izmVar = new izm(gb5Var4, i8, yymVar, f22, vu30Var2);
                                        gb5Var3 = gb5Var4;
                                        x340Var6.s0(izmVar);
                                        objT4 = izmVar;
                                    }
                                    Function0 function3 = (Function0) objT4;
                                    boolean zI2 = x340Var6.i(yymVar);
                                    if (i21 != 32 || ((i10 & 64) != 0 && x340Var6.i(gb5Var3))) {
                                        z20 = true;
                                    } else {
                                        z20 = false;
                                    }
                                    boolean z33 = zI2 | z20;
                                    if ((i12 & 57344) == 16384) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    boolean z34 = z33 | z21;
                                    if ((i20 & 112) == 32) {
                                        z22 = true;
                                    } else {
                                        z22 = false;
                                    }
                                    z23 = z34 | z22;
                                    objT5 = x340Var6.T();
                                    if (z23 || objT5 == obj5) {
                                        jzm jzmVar = new jzm(yymVar, gb5Var3, function0, vu30Var, (byte) 0);
                                        x340Var6.s0(jzmVar);
                                        objT5 = jzmVar;
                                    }
                                    who1.c(j, f8, iu30Var4, qim0VarThen, 0.0f, z30, function2, function3, (Function0) objT5, x340Var6, ((i10 >> 6) & 14) | 12583296);
                                    x340Var6.r(false);
                                    f10 = f13;
                                    ss50Var2 = ss50Var3;
                                    f12 = f22;
                                    z7 = z16;
                                    qim0Var4 = qim0Var5;
                                    x340Var3 = x340Var6;
                                    xz3Var = xz3Var3;
                                    i16 = i20;
                                    i6 = 32;
                                    obj3 = obj5;
                                }
                                z16 = z32;
                                ss50 ss50Var5 = ss50Var4;
                                gb5Var3 = gb5Var;
                                obj5 = obj4;
                                int i22 = i18;
                                float f23 = f17;
                                hzmVar = new hzm(yymVar2, gb5Var3, o4wVar, i22, f23, f4, f22, iu30Var2, z16, ss50Var5);
                                yymVar = yymVar2;
                                i8 = i22;
                                f13 = f23;
                                ss50Var3 = ss50Var5;
                                x340Var6.s0(hzmVar);
                                iu30 iu30Var5 = (iu30) hzmVar;
                                objT3 = x340Var6.T();
                                if (objT3 == obj5) {
                                    objT3 = lmm.g;
                                    x340Var6.s0(objT3);
                                }
                                Function0 function4 = (Function0) objT3;
                                if (i21 != 32) {
                                    z17 = true;
                                } else {
                                    z17 = true;
                                }
                                boolean zE2 = z17 | x340Var6.e(i8) | x340Var6.i(yymVar) | x340Var6.d(f22);
                                if ((i12 & 1879048192) == 536870912) {
                                    z18 = true;
                                } else {
                                    z18 = false;
                                }
                                z19 = zE2 | z18;
                                objT4 = x340Var6.T();
                                if (z19) {
                                    gb5 gb5Var5 = gb5Var3;
                                    izm izmVar2 = new izm(gb5Var5, i8, yymVar, f22, vu30Var2);
                                    gb5Var3 = gb5Var5;
                                    x340Var6.s0(izmVar2);
                                    objT4 = izmVar2;
                                } else {
                                    gb5 gb5Var6 = gb5Var3;
                                    izm izmVar3 = new izm(gb5Var6, i8, yymVar, f22, vu30Var2);
                                    gb5Var3 = gb5Var6;
                                    x340Var6.s0(izmVar3);
                                    objT4 = izmVar3;
                                }
                                Function0 function5 = (Function0) objT4;
                                boolean zI3 = x340Var6.i(yymVar);
                                if (i21 != 32) {
                                    z20 = true;
                                } else {
                                    z20 = true;
                                }
                                boolean z35 = zI3 | z20;
                                if ((i12 & 57344) == 16384) {
                                    z21 = true;
                                } else {
                                    z21 = false;
                                }
                                boolean z36 = z35 | z21;
                                if ((i20 & 112) == 32) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                z23 = z36 | z22;
                                objT5 = x340Var6.T();
                                if (z23) {
                                    jzm jzmVar2 = new jzm(yymVar, gb5Var3, function0, vu30Var, (byte) 0);
                                    x340Var6.s0(jzmVar2);
                                    objT5 = jzmVar2;
                                } else {
                                    jzm jzmVar3 = new jzm(yymVar, gb5Var3, function0, vu30Var, (byte) 0);
                                    x340Var6.s0(jzmVar3);
                                    objT5 = jzmVar3;
                                }
                                who1.c(j, f8, iu30Var5, qim0VarThen, 0.0f, z30, function4, function5, (Function0) objT5, x340Var6, ((i10 >> 6) & 14) | 12583296);
                                x340Var6.r(false);
                                f10 = f13;
                                ss50Var2 = ss50Var3;
                                f12 = f22;
                                z7 = z16;
                                qim0Var4 = qim0Var5;
                                x340Var3 = x340Var6;
                                xz3Var = xz3Var3;
                                i16 = i20;
                                i6 = 32;
                                obj3 = obj5;
                            } else {
                                f9 = f21;
                                qim0 qim0Var7 = qim0VarB;
                                int i23 = i18;
                                float f24 = f18;
                                float f25 = f17;
                                ss50 ss50Var6 = ss50Var4;
                                int i24 = i16;
                                qim0Var4 = qim0Var5;
                                wat watVar2 = watVar;
                                x340Var6.i0(892622070);
                                Object objT9 = x340Var6.T();
                                if (objT9 == obj9) {
                                    objT9 = new LinkedHashSet();
                                    x340Var6.s0(objT9);
                                }
                                Set set2 = (Set) objT9;
                                Object objT10 = x340Var6.T();
                                if (objT10 == obj9) {
                                    objT10 = us71.i(Float.NaN, x340Var6);
                                }
                                drr0 drr0Var3 = (drr0) objT10;
                                Object objT11 = x340Var6.T();
                                if (objT11 == obj9) {
                                    objT11 = new yym();
                                    x340Var6.s0(objT11);
                                }
                                long j2 = xz3Var3.a;
                                xz3Var = xz3Var3;
                                watVar = watVar2;
                                yym yymVar3 = (yym) objT11;
                                long jD3 = D(f9, f2, f3, 44.0f, j2);
                                qim0 qim0VarThen2 = anm1.N("mixing_curve_control_point_" + i23, u291.r(eqr0.C(qim0Var4, r3v.a(jD3), r3v.b(jD3)), 44.0f)).then(qim0Var7);
                                int i25 = i10 & 112;
                                int i26 = i10 & 14;
                                int i27 = i12 & 458752;
                                z7 = z32;
                                boolean zI4 = x340Var6.i(yymVar3) | (i25 == 32 || ((i10 & 64) != 0 && x340Var6.i(gb5Var))) | (i26 == 4) | x340Var6.e(i23) | x340Var6.d(f25) | ((i10 & 3670016) == 1048576) | x340Var6.d(f24) | ((i24 & 14) == 4) | (i27 == 131072) | x340Var6.i(ss50Var6) | x340Var6.h(z7);
                                Object objT12 = x340Var6.T();
                                if (zI4 || objT12 == obj9) {
                                    Object obj10 = obj9;
                                    obj = obj10;
                                    i5 = i23;
                                    f11 = f24;
                                    gb5Var2 = gb5Var;
                                    kzmVar = new kzm(yymVar3, gb5Var2, o4wVar, i5, f25, f4, f11, iu30Var2, c380Var, drr0Var3, ss50Var6, z7);
                                    yymVar3 = yymVar3;
                                    drr0Var = drr0Var3;
                                    ss50Var = ss50Var6;
                                    f10 = f25;
                                    x340Var6.s0(kzmVar);
                                } else {
                                    obj = obj9;
                                    kzmVar = objT12;
                                    i5 = i23;
                                    f10 = f25;
                                    gb5Var2 = gb5Var;
                                    ss50Var = ss50Var6;
                                    f11 = f24;
                                    drr0Var = drr0Var3;
                                }
                                iu30 iu30Var6 = (iu30) kzmVar;
                                i16 = i24;
                                i6 = 32;
                                int i28 = i12 & 57344;
                                boolean zE3 = ((i16 & 896) == 256) | (i26 == 4) | x340Var6.e(i5) | (i25 == 32 || ((i10 & 64) != 0 && x340Var6.i(gb5Var2))) | (i28 == 16384);
                                Object objT13 = x340Var6.T();
                                if (zE3) {
                                    obj2 = obj;
                                } else {
                                    obj2 = obj;
                                    if (objT13 != obj2) {
                                        obj3 = obj2;
                                        i7 = i28;
                                    }
                                    Function0 function6 = (Function0) objT13;
                                    if (i25 != i6 || ((i10 & 64) != 0 && x340Var6.i(gb5Var2))) {
                                        z8 = true;
                                    } else {
                                        z8 = false;
                                    }
                                    boolean zE4 = z8 | x340Var6.e(i5) | x340Var6.i(yymVar3) | x340Var6.d(f11);
                                    if ((i12 & 1879048192) == 536870912) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    z10 = zE4 | z9;
                                    objT = x340Var6.T();
                                    if (!z10 || objT == obj3) {
                                        gb5 gb5Var7 = gb5Var2;
                                        int i29 = i5;
                                        float f26 = f11;
                                        set = set2;
                                        drr0Var2 = drr0Var;
                                        fzm fzmVar = new fzm(gb5Var7, i29, yymVar3, f26, vu30Var2, set, drr0Var2);
                                        f12 = f26;
                                        i5 = i29;
                                        gb5Var2 = gb5Var7;
                                        x340Var6.s0(fzmVar);
                                        objT = fzmVar;
                                    } else {
                                        f12 = f11;
                                        set = set2;
                                        drr0Var2 = drr0Var;
                                    }
                                    Function0 function7 = (Function0) objT;
                                    if (i25 != i6 || ((i10 & 64) != 0 && x340Var6.i(gb5Var2))) {
                                        z11 = true;
                                    } else {
                                        z11 = false;
                                    }
                                    if (i27 == 131072) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    boolean z37 = z11 | z12;
                                    if (i7 == 16384) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    boolean zE5 = z37 | z13 | x340Var6.e(i5) | x340Var6.i(ss50Var) | x340Var6.i(yymVar3);
                                    if ((i16 & 112) == i6) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    z15 = zE5 | z14;
                                    objT2 = x340Var6.T();
                                    if (!z15 || objT2 == obj3) {
                                        ss50 ss50Var7 = ss50Var;
                                        gzm gzmVar = new gzm(drr0Var2, gb5Var2, yymVar3, function0, c380Var, i5, ss50Var7, vu30Var, set);
                                        ss50Var2 = ss50Var7;
                                        x340Var6.s0(gzmVar);
                                        objT2 = gzmVar;
                                    } else {
                                        ss50Var2 = ss50Var;
                                    }
                                    x340Var3 = x340Var6;
                                    who1.c(j, f8, iu30Var6, qim0VarThen2, 0.0f, z30, function6, function7, (Function0) objT2, x340Var3, ((i10 >> 6) & 14) | 384);
                                    x340Var3.r(false);
                                }
                                obj3 = obj2;
                                int i30 = i5;
                                gb5 gb5Var8 = gb5Var2;
                                i7 = i28;
                                lzm lzmVar = new lzm(i30, function1, o4wVar, gb5Var8, vu30Var, (byte) 0);
                                gb5Var2 = gb5Var8;
                                i5 = i30;
                                x340Var6.s0(lzmVar);
                                objT13 = lzmVar;
                                Function0 function8 = (Function0) objT13;
                                if (i25 != i6) {
                                    z8 = true;
                                } else {
                                    z8 = true;
                                }
                                boolean zE6 = z8 | x340Var6.e(i5) | x340Var6.i(yymVar3) | x340Var6.d(f11);
                                if ((i12 & 1879048192) == 536870912) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                z10 = zE6 | z9;
                                objT = x340Var6.T();
                                if (z10) {
                                    gb5 gb5Var9 = gb5Var2;
                                    int i210 = i5;
                                    float f27 = f11;
                                    set = set2;
                                    drr0Var2 = drr0Var;
                                    fzm fzmVar2 = new fzm(gb5Var9, i210, yymVar3, f27, vu30Var2, set, drr0Var2);
                                    f12 = f27;
                                    i5 = i210;
                                    gb5Var2 = gb5Var9;
                                    x340Var6.s0(fzmVar2);
                                    objT = fzmVar2;
                                } else {
                                    gb5 gb5Var10 = gb5Var2;
                                    int i211 = i5;
                                    float f28 = f11;
                                    set = set2;
                                    drr0Var2 = drr0Var;
                                    fzm fzmVar3 = new fzm(gb5Var10, i211, yymVar3, f28, vu30Var2, set, drr0Var2);
                                    f12 = f28;
                                    i5 = i211;
                                    gb5Var2 = gb5Var10;
                                    x340Var6.s0(fzmVar3);
                                    objT = fzmVar3;
                                }
                                Function0 function9 = (Function0) objT;
                                if (i25 != i6) {
                                    z11 = true;
                                } else {
                                    z11 = true;
                                }
                                if (i27 == 131072) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                boolean z38 = z11 | z12;
                                if (i7 == 16384) {
                                    z13 = true;
                                } else {
                                    z13 = false;
                                }
                                boolean zE7 = z38 | z13 | x340Var6.e(i5) | x340Var6.i(ss50Var) | x340Var6.i(yymVar3);
                                if ((i16 & 112) == i6) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                z15 = zE7 | z14;
                                objT2 = x340Var6.T();
                                if (z15) {
                                    ss50 ss50Var8 = ss50Var;
                                    gzm gzmVar2 = new gzm(drr0Var2, gb5Var2, yymVar3, function0, c380Var, i5, ss50Var8, vu30Var, set);
                                    ss50Var2 = ss50Var8;
                                    x340Var6.s0(gzmVar2);
                                    objT2 = gzmVar2;
                                } else {
                                    ss50 ss50Var9 = ss50Var;
                                    gzm gzmVar3 = new gzm(drr0Var2, gb5Var2, yymVar3, function0, c380Var, i5, ss50Var9, vu30Var, set);
                                    ss50Var2 = ss50Var9;
                                    x340Var6.s0(gzmVar3);
                                    objT2 = gzmVar3;
                                }
                                x340Var3 = x340Var6;
                                who1.c(j, f8, iu30Var6, qim0VarThen2, 0.0f, z30, function8, function9, (Function0) objT2, x340Var3, ((i10 >> 6) & 14) | 384);
                                x340Var3.r(false);
                            }
                        }
                        if (str != 0) {
                            x340Var3.i0(898829572);
                            wat watVar3 = watVar;
                            int i31 = i10 >> 3;
                            a(str, j, xz3Var.a, pmg1Var, watVar3.X0(f2), f4, watVar3.X0(22.0f), watVar3.X0(8.0f), x340Var3, (i31 & 112) | ((i10 >> 12) & 7168) | (i31 & 458752));
                            z24 = false;
                            x340Var3.r(false);
                        } else {
                            z24 = false;
                            x340Var3.i0(899335058);
                            x340Var3.r(false);
                        }
                        x340Var3.r(z24);
                    } else {
                        x340Var2.r(false);
                    }
                    o4wVar2 = o4wVar;
                    iu30Var3 = iu30Var;
                    i4 = i6;
                    obj6 = obj3;
                    f18 = f12;
                    qim0Var5 = qim0Var4;
                    f17 = f10;
                    zA = z7;
                    ss50Var4 = ss50Var2;
                    i18 = i19;
                    f16 = f9;
                    z26 = z;
                    x340Var2 = x340Var3;
                    z27 = z4;
                } else {
                    x340Var2.r(false);
                }
                qim0Var4 = qim0Var5;
                f10 = f17;
                i6 = i4;
                z7 = zA;
                ss50Var2 = ss50Var4;
                x340Var3 = x340Var2;
                f9 = f16;
                f12 = f18;
                z6 = false;
                obj3 = obj6;
                o4wVar2 = o4wVar;
                iu30Var3 = iu30Var;
                i4 = i6;
                obj6 = obj3;
                f18 = f12;
                qim0Var5 = qim0Var4;
                f17 = f10;
                zA = z7;
                ss50Var4 = ss50Var2;
                i18 = i19;
                f16 = f9;
                z26 = z;
                x340Var2 = x340Var3;
                z27 = z4;
            }
            f7 = f2;
            x340Var = x340Var2;
            x340Var.r(false);
            x340Var.r(true);
            qim0Var2 = qim0Var6;
        } else {
            x340Var = x340Var4;
            f7 = f2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzm(o4wVar, gb5Var, j, f, f7, f3, f4, pmg1Var, iu30Var, qim0Var2, z, z2, z3, z4, vu30Var, c380Var, f5, bpoVar, num, vu30Var2, iu30Var2, function0, function1, i, i2, i3);
        }
    }

    public static final void f(long j, long j2, pmg1 pmg1Var, float f, float f2, qim0 qim0Var, boolean z, String str, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        String str2;
        String str3;
        boolean z3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1539901109);
        if ((i & 6) == 0) {
            i3 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.g(pmg1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.d(f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= x340Var.g(qim0Var) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 != 0) {
            i3 |= 1572864;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 1572864) == 0) {
                i3 |= x340Var.h(z2) ? 1048576 : 524288;
            }
        }
        int i5 = i2 & 128;
        if (i5 != 0) {
            i3 |= 12582912;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 12582912) == 0) {
                i3 |= x340Var.g(str2) ? 8388608 : 4194304;
            }
        }
        if (x340Var.Y(i3 & 1, (i3 & 4793491) != 4793490)) {
            boolean z4 = i4 != 0 ? true : z2;
            String str4 = i5 != 0 ? "mixing_curve_drag_guides" : str2;
            wat watVar = (wat) x340Var.k(t4k.h);
            float fX0 = watVar.X0(1.0f);
            boolean zG = x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                float fX1 = watVar.X0(2.0f);
                objT = cgj1.t(0.0f, new float[]{fX1, fX1});
                x340Var.s0(objT);
            }
            uw4 uw4Var = (uw4) objT;
            qim0 qim0VarN = anm1.N(str4, u291.s(qim0Var, watVar.N0(pmg1Var.a), (f * 2.0f) + f2));
            boolean zD = ((i3 & 14) == 4) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((3670016 & i3) == 1048576) | ((i3 & 112) == 32) | x340Var.d(fX0) | x340Var.i(uw4Var);
            Object objT2 = x340Var.T();
            if (zD || objT2 == m4cVar) {
                nzm nzmVar = new nzm(j, pmg1Var, f, f2, z4, j2, fX0, uw4Var);
                x340Var.s0(nzmVar);
                objT2 = nzmVar;
            }
            j0o1.b(0, x340Var, (iu30) objT2, qim0VarN);
            z3 = z4;
            str3 = str4;
        } else {
            x340Var.b0();
            boolean z5 = z2;
            str3 = str2;
            z3 = z5;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ozm(j, j2, pmg1Var, f, f2, qim0Var, z3, str3, i, i2);
        }
    }

    public static final void g(hux huxVar, String str, b0k b0kVar, int i) {
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-918289734);
        int i2 = i | ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(12.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(huxVar, isl.a, u291.r(nim0Var, 24.0f), 0L, 0L, false, x340Var, 56 | (i2 & 14), 56);
            str2 = str;
            uwo1.e(str2, new wnb0(1.0f, true), cbx.d(x340Var).j, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
            x340Var.r(true);
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar, str2, i, (byte) 3);
        }
    }

    public static final void h(Function0 function0, yf yfVar, boolean z, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1536123665);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(yfVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            if (ihc1.y0(str)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(str), function0);
            nim0 nim0Var = nim0.a;
            foo1.c(gbxVar, yfVar, u291.f(nim0Var, 1.0f), z ? jax.a : new hax("submit button disabled"), null, null, null, null, null, null, apo.r(1995564540, new p9y0(str, (byte) 3), x340Var2), x340Var2, i2 & 112, 48, 2024);
            x340Var = x340Var2;
            x0d.s(nim0Var, 12.0f, x340Var, true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(function0, yfVar, z, str, qim0Var, i, (byte) 5);
        }
    }

    public static final void i(String str, Function0 function0, Function0 function1, Function0 function2, poj0 poj0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(552685379);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            function3 = function2;
            i2 |= x340Var.i(function3) ? 2048 : 1024;
        } else {
            function3 = function2;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? x340Var.g(poj0Var) : x340Var.i(poj0Var) ? 16384 : 8192;
        }
        boolean z = false;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            if ((57344 & i2) == 16384 || ((i2 & 32768) != 0 && x340Var.i(poj0Var))) {
                z = true;
            }
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new iyb0(poj0Var, (lnm) null, (byte) 28);
                x340Var.s0(objT);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT);
            mqo1.e(function3, null, null, apo.r(-1192463037, new tej0(str, (byte) 28), x340Var), apo.r(1406480900, new tej0(str, (byte) 29), x340Var), apo.r(-289542459, new tse0(function0, (byte) 20), x340Var), apo.r(-1985565818, new tse0(function1, (byte) 21), x340Var), x340Var, ((i2 >> 9) & 14) | 1797120, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(str, function0, function1, function2, poj0Var, i, (byte) 12);
        }
    }

    public static final void j(boolean z, Function0 function0, Function0 function1, String str, String str2, String str3, b0k b0kVar, int i) {
        int i2;
        Function0 function2;
        String str4;
        String str5;
        String str6;
        xe51 xe51Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1323453431);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(str2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(str3) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            if (z) {
                x340Var.i0(799048237);
                xe51Var = new xe51(cwl1.o0(x340Var, 2131959137), function1);
                x340Var.r(false);
            } else {
                x340Var.i0(799220659);
                x340Var.r(false);
                xe51Var = we51.e;
            }
            function2 = function0;
            l0o1.a(str, str2, str3, function2, xe51Var, null, x340Var, ((i2 >> 9) & 1022) | ((i2 << 6) & 7168));
            str6 = str;
            str5 = str2;
            str4 = str3;
        } else {
            function2 = function0;
            str4 = str3;
            str5 = str2;
            str6 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(z, function2, function1, str6, str5, str4, i);
        }
    }

    public static final void k(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        boolean z2 = z;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1676778014);
        int i2 = (x340Var.h(z2) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var).b.f;
            long j2 = cbx.a(x340Var).b.b;
            long j3 = u7h.k;
            hvf hvfVarC = zhm0.c((dah) x340Var.k(eah.a));
            long j4 = u7h.j;
            long j5 = j3 != 16 ? j3 : hvfVarC.a;
            long j6 = j4 != r14 ? j4 : hvfVarC.b;
            long j7 = j != r14 ? j : hvfVarC.c;
            long j8 = j4 != r14 ? j4 : hvfVarC.d;
            long j9 = j3 != 16 ? j3 : hvfVarC.e;
            if (j4 == r14) {
                j4 = hvfVarC.f;
            }
            long j10 = j4;
            long j11 = j3 != 16 ? j3 : hvfVarC.g;
            if (j == r14) {
                j = hvfVarC.h;
            }
            long j12 = j;
            long j13 = j2 != 16 ? j2 : hvfVarC.i;
            long j14 = j3 != 16 ? j3 : hvfVarC.j;
            long j15 = j3 != 16 ? j3 : hvfVarC.k;
            if (j3 == 16) {
                j3 = hvfVarC.l;
            }
            hvf hvfVar = new hvf(j5, j6, j7, j8, j9, j10, j11, j12, j13, j14, j15, j3);
            qim0Var2 = nim0.a;
            z2 = z;
            zxo1.f(z2, anm1.N("check_test_tag", u291.r(qim0Var2, 20.0f)), false, hvfVar, x340Var, (i2 & 14) | 48);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0(z2, qim0Var2, i, (byte) 0);
        }
    }

    public static final void l(Function0 function0, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(42664044);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            who1.i(i2 & 14, function0, x340Var, null);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tse0(function0, i, (byte) 14);
        }
    }

    public static final void m(Function0 function0, y6d1 y6d1Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1647893599);
        int i2 = i | (b0kVar3.i(function0) ? 4 : 2) | (b0kVar3.i(y6d1Var) ? 32 : 16) | (b0kVar3.h(z) ? 256 : 128) | 3072;
        if (!b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        } else {
            if (ihc1.y0("option")) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50("option"), function0);
            boolean z2 = y6d1Var.d;
            pm31 pm31Var = new pm31(3);
            boolean z3 = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z3 || objT == fkj0.X) {
                objT = new lpx0(function0, (byte) 9);
                b0kVar3.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            jto1.b(dug.f(u291.f(dgo1.q(qim0Var3, z2, true, pm31Var, (Function0) objT, 8), 1.0f), f5p1.k(b0kVar3, 2131102464), er31.b(6.0f)), null, null, false, null, null, gbxVar, null, apo.r(514170005, new zw2(z, (Object) y6d1Var, (byte) 19), b0kVar3), null, null, null, null, null, null, apo.r(1238577819, new f2z0(y6d1Var, (byte) 1), b0kVar3), b0kVar2, 100663296, 196608, 32446);
            qim0Var2 = qim0Var3;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new qy90(function0, y6d1Var, z, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:103:0x0226  */
    /* JADX WARN: Code duplicated, block: B:109:0x0238  */
    public static final void n(rsr0 rsr0Var, Function0 function0, Function0 function1, Function0 function2, poj0 poj0Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        Function0 function3;
        qim0 qim0Var2;
        Object obj;
        boolean z;
        int i3;
        int i4;
        m4c m4cVar;
        tho1 tho1Var;
        ven0 ven0Var;
        boolean z2;
        qim0 qim0Var3;
        Object obj2;
        Object obj3;
        boolean z3;
        boolean zI;
        Object obj4;
        mdg0 mdg0Var = rsr0Var.c;
        tho1 tho1Var2 = rsr0Var.d;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-181505637);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.i(rsr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (i & 32768) == 0 ? x340Var.g(poj0Var) : x340Var.i(poj0Var) ? 16384 : 8192;
        }
        int i5 = i2 | 196608;
        if (x340Var.Y(i5 & 1, (74899 & i5) != 74898)) {
            Object[] objArr = new Object[0];
            Object objT = x340Var.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                obj = objT;
                v0r0 v0r0Var = v0r0.Z;
                x340Var.s0(v0r0Var);
                obj = v0r0Var;
            }
            obj = objT;
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) obj, x340Var, 48);
            int iOrdinal = mdg0Var.ordinal();
            if (iOrdinal == 0) {
                z = false;
                i3 = 1666754622;
                i4 = 2131959564;
            } else {
                if (iOrdinal != 1) {
                    throw p3d1.k(x340Var, 1666752578, false);
                }
                i3 = 1666757842;
                i4 = 2131959563;
                z = false;
            }
            String strK = x0d.k(x340Var, i3, i4, x340Var, z);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            kiv kivVar = xce0.a;
            qim0 qim0VarH = l6o1.H(zr7.i(qim0VarF, gce0.c), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarY = too1.y(qim0VarH, lhc.g(x340Var).g);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            o(function0, x340Var, (i5 >> 3) & 14);
            qim0 qim0VarF2 = u291.f(qim0Var4, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarF2, 16.0f, 0.0f, 16.0f, cbx.b(x340Var).b.b, 2);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            p(rsr0Var.a, rsr0Var.b, strK, x340Var, 0);
            op71.g(x340Var, u291.r(qim0Var4, cbx.b(x340Var).b.c));
            int iOrdinal2 = mdg0Var.ordinal();
            if (iOrdinal2 == 0) {
                function3 = function1;
                m4cVar = m4cVar2;
                tho1Var = tho1Var2;
                ven0Var = ven0Var2;
                z2 = false;
                x340Var.i0(-1475088189);
                c(rsr0Var.e, x340Var, 0);
                x340Var.r(false);
            } else {
                if (iOrdinal2 != 1) {
                    throw p3d1.k(x340Var, -1475089735, false);
                }
                x340Var.i0(-1475084752);
                int i6 = i5 & 57344;
                boolean z5 = (i6 == 16384 || ((i5 & 32768) != 0 && x340Var.i(poj0Var))) | ((i5 & 896) == 256);
                Object objT2 = x340Var.T();
                if (z5) {
                    m4cVar = m4cVar2;
                } else {
                    m4cVar = m4cVar2;
                    if (objT2 != m4cVar) {
                        function3 = function1;
                        obj3 = objT2;
                    }
                    Function0 function4 = (Function0) obj3;
                    if (i6 != 16384 || ((i5 & 32768) != 0 && x340Var.i(poj0Var))) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    ven0Var = ven0Var2;
                    zI = z3 | x340Var.i(ven0Var);
                    Object objT3 = x340Var.T();
                    if (!zI || objT3 == m4cVar) {
                        z2 = false;
                        osr0 osr0Var = new osr0(poj0Var, ven0Var, (byte) 0);
                        x340Var.s0(osr0Var);
                        obj4 = osr0Var;
                    } else {
                        z2 = false;
                        obj4 = objT3;
                    }
                    tho1Var = tho1Var2;
                    z(tho1Var, function4, (Function0) obj4, x340Var, z2 ? 1 : 0);
                    x340Var.r(z2);
                }
                function3 = function1;
                shq0 shq0Var = new shq0(poj0Var, function3, (byte) 13);
                x340Var.s0(shq0Var);
                obj3 = shq0Var;
                Function0 function5 = (Function0) obj3;
                if (i6 != 16384) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                ven0Var = ven0Var2;
                zI = z3 | x340Var.i(ven0Var);
                Object objT4 = x340Var.T();
                if (zI) {
                    z2 = false;
                    osr0 osr0Var2 = new osr0(poj0Var, ven0Var, (byte) 0);
                    x340Var.s0(osr0Var2);
                    obj4 = osr0Var2;
                } else {
                    z2 = false;
                    osr0 osr0Var3 = new osr0(poj0Var, ven0Var, (byte) 0);
                    x340Var.s0(osr0Var3);
                    obj4 = osr0Var3;
                }
                tho1Var = tho1Var2;
                z(tho1Var, function5, (Function0) obj4, x340Var, z2 ? 1 : 0);
                x340Var.r(z2);
            }
            x340Var.r(true);
            x340Var.r(true);
            if (((Boolean) ven0Var.getValue()).booleanValue() && (tho1Var instanceof djh1)) {
                x340Var.i0(131288302);
                String str = ((djh1) tho1Var).c;
                int i7 = i5 & 57344;
                boolean z6 = ((i7 == 16384 || ((i5 & 32768) != 0 && x340Var.i(poj0Var))) ? true : z2) | (x340Var.i(ven0Var) ? 1 : 0) | ((i5 & 7168) == 2048 ? true : z2);
                Object objT5 = x340Var.T();
                if (z6 || objT5 == m4cVar) {
                    pcp0 pcp0Var = new pcp0(poj0Var, function2, ven0Var, (byte) 16);
                    x340Var.s0(pcp0Var);
                    obj2 = pcp0Var;
                } else {
                    obj2 = objT5;
                }
                Function0 function6 = (Function0) obj2;
                boolean z7 = ((i7 == 16384 || ((i5 & 32768) != 0 && x340Var.i(poj0Var))) ? true : z2) | (x340Var.i(ven0Var) ? 1 : 0);
                Object objT6 = x340Var.T();
                Object obj5 = objT6;
                if (z7 != 0 || objT6 == m4cVar) {
                    osr0 osr0Var4 = new osr0(poj0Var, ven0Var, (byte) 1);
                    x340Var.s0(osr0Var4);
                    obj5 = osr0Var4;
                }
                Function0 function7 = (Function0) obj5;
                boolean zI2 = x340Var.i(ven0Var);
                Object objT7 = x340Var.T();
                Object obj6 = objT7;
                if (zI2 || objT7 == m4cVar) {
                    q2j0 q2j0Var = new q2j0(ven0Var, (byte) 20);
                    x340Var.s0(q2j0Var);
                    obj6 = q2j0Var;
                }
                qim0Var3 = qim0Var4;
                i(str, function6, function7, (Function0) obj6, poj0Var, x340Var, i7);
                x340Var.r(z2);
            } else {
                qim0Var3 = qim0Var4;
                x340Var.i0(131712103);
                x340Var.r(z2);
            }
            qim0Var2 = qim0Var3;
        } else {
            function3 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kqf0((byte) 11, i, rsr0Var, function0, function3, function2, poj0Var, qim0Var2, false);
        }
    }

    public static final void o(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(400482979);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            String strO0 = cwl1.o0(x340Var2, 2131959553);
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var2.T();
            if (z || objT == m4cVar) {
                objT = new gbx(z50.c, function0);
                x340Var2.s0(objT);
            }
            gbx gbxVar = (gbx) objT;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarJ = u291.j(56.0f, 0.0f, 2, qim0VarF);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarJ);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarZ);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            String strO1 = cwl1.o0(x340Var2, 2131959571);
            lee1 lee1Var = cbx.d(x340Var2).e;
            gra graVar = een.h;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(nim0Var, graVar);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = q4r0.X0;
                x340Var2.s0(objT2);
            }
            uwo1.e(strO1, s161.b(qim0VarA, false, (iu30) objT2), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2040);
            wro1.h(gbxVar, ldx.c, h2cVar.a(nim0Var, een.i), null, null, null, false, null, null, apo.r(-793724186, new psr0(strO0, (byte) 0), x340Var2), x340Var2, 0, 6, 1016);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 22, i, function0, false);
        }
    }

    public static final void p(String str, Uri uri, String str2, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1295728052);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.g(uri) ? 32 : 16) | (b0kVar2.g(str2) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            uwr uwrVar = cbx.a;
            op71.g(b0kVar2, u291.r(nim0Var, cbx.b(b0kVar2).b.b));
            zov0 zov0Var = cbx.b(b0kVar2).g;
            bmq0.a(uri, u291.m(nim0Var, 88.0f), hcx.e, (String) null, str, 0L, 0L, false, b0kVar2, ((i2 >> 3) & 14) | 384 | ((i2 << 12) & 57344), 232);
            b0kVar2 = b0kVar2;
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(nim0Var, 8.0f));
            uwo1.e(str, null, cbx.d(b0kVar2).c, cbx.a(b0kVar2).b.a, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, i2 & 14, 0, 2018);
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.r(nim0Var, 16.0f));
            uwo1.e(str2, u291.f(nim0Var, 1.0f), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.a, null, null, 0, false, null, 0, null, b0kVar2, (i2 >> 6) & 14, 0, 2032);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(str, uri, str2, i, (byte) 22);
        }
    }

    public static final void q(z6d1 z6d1Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1171690294);
        int i4 = i | (x340Var.i(z6d1Var) ? 4 : 2);
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 = i4 | 48;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 32 : 16);
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0Var4 = nim0.a;
            qim0 qim0Var5 = i5 != 0 ? qim0Var4 : qim0Var2;
            String str = z6d1Var.a;
            String str2 = z6d1Var.b;
            String strN0 = cwl1.n0(2131961431, new Object[]{str, str2}, x340Var);
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var5);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0Var6 = qim0Var5;
            String str3 = z6d1Var.a;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).e;
            boolean zG = x340Var.g(strN0);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = new zqu0(strN0, (byte) 28);
                x340Var.s0(objT);
            }
            uwo1.e(str3, s161.b(qim0Var4, false, (iu30) objT), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
            uwo1.e(str2, null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g8(z6d1Var, qim0Var3, i, i2, (byte) 15);
        }
    }

    public static final void r(g36 g36Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(982026197);
        int i3 = i & 6;
        byte b2 = 4;
        pbh pbhVar = pbh.a;
        if (i3 == 0) {
            i2 = (x340Var.i(pbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(g36Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(j2iVar) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            es41 es41VarC = l6o1.C(0, 0, 1, x340Var);
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            qim0 qim0VarA = pbhVar.a(1.0f, l6o1.H(f8d1.c(zr7.i(nim0.a, new f2z0(es41VarC, (byte) 2)), es41VarC, view, new nrf(es41VarC, view, b2)), es41VarC, false, 14), true);
            int i4 = ((i2 << 3) & 7168) | (i2 & 112);
            mbh mbhVarA = jbh.a(g36Var, een.P0, x340Var, 14 & (i4 >> 3));
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar.invoke(pbhVar, x340Var, Integer.valueOf(((i4 >> 6) & 112) | 6));
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new yvs0((Object) g36Var, (Object) j2iVar, i, (byte) 27);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void s(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, f6d1 f6d1Var, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        z6d1 z6d1Var2;
        int i3;
        int i4;
        boolean z3;
        boolean z4;
        qim0 qim0Var2;
        zzq0 zzq0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(450840015);
        if ((i2 & 6) == 0) {
            z6d1Var2 = z6d1Var;
            i3 = (x340Var.i(z6d1Var2) ? 4 : 2) | i2;
        } else {
            z6d1Var2 = z6d1Var;
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 32 : 16;
        } else {
            i4 = i;
        }
        if ((i2 & 384) == 0) {
            z3 = z;
            i3 |= x340Var.h(z3) ? 256 : 128;
        } else {
            z3 = z;
        }
        if ((i2 & 3072) == 0) {
            z4 = z2;
            i3 |= x340Var.h(z4) ? 2048 : 1024;
        } else {
            z4 = z2;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.e(e6d1Var.ordinal()) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(f6d1Var.ordinal()) ? 131072 : 65536;
        }
        int i5 = i3 | 1572864;
        if ((12582912 & i2) == 0) {
            i5 |= x340Var.i(iu30Var) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i5 & 1, (4793491 & i5) != 4793490)) {
            p3v p3vVar = f6d1Var.c;
            if (p3vVar != null) {
                float f = p3vVar.a;
                zzq0Var = new zzq0(f, f, f, f);
            } else {
                zzq0Var = new zzq0(e6d1Var.d, 24.0f, 8.0f, 8.0f);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(uyn1.w(qim0Var3, zzq0Var), 1.0f);
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(e6d1Var.g);
            if (iC == 0) {
                x340Var.i0(410637441);
                int i6 = i5 << 3;
                t(z6d1Var, i, z, z2, e6d1Var, iu30Var, x340Var, (i6 & 458752) | (i6 & 112) | 6 | (i6 & 896) | (i6 & 7168) | (i6 & 57344) | ((i5 >> 3) & 3670016));
                x340Var.r(false);
            } else {
                if (iC != 1) {
                    throw p3d1.k(x340Var, 410628333, false);
                }
                x340Var.i0(410630199);
                int i7 = i5 << 3;
                d(z6d1Var2, i4, z3, z4, e6d1Var, f6d1Var, iu30Var, x340Var, (i5 & 29360128) | (i7 & 3670016) | (i7 & 112) | 6 | (i7 & 896) | (i7 & 7168) | (57344 & i7) | (458752 & i7));
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new dkd0(z6d1Var, i, z, z2, e6d1Var, f6d1Var, qim0Var2, iu30Var, i2);
        }
    }

    public static final void t(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        boolean z3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(561349506);
        int i4 = i2 & 6;
        pbh pbhVar = pbh.a;
        if (i4 == 0) {
            i3 = (x340Var.i(pbhVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.i(z6d1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            z3 = z;
            i3 |= x340Var.h(z3) ? 2048 : 1024;
        } else {
            z3 = z;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.h(z2) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= x340Var.e(e6d1Var.ordinal()) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i3 |= x340Var.i(iu30Var) ? 1048576 : 524288;
        }
        int i5 = i3;
        if (x340Var.Y(i5 & 1, (599187 & i5) != 599186)) {
            ceo ceoVar = ((jhx) ((cwx) x340Var.k(mde0.a)).a.d).a;
            int i6 = i5 & 14;
            r(K(z2, x340Var), apo.r(1616450427, new ok7(z6d1Var, z2, iu30Var, i), x340Var), x340Var, i6 | 384);
            pxg1 pxg1VarO0 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ucy0.X0;
                x340Var.s0(objT);
            }
            bby bbyVarO = xay.o(pxg1VarO0, (iu30) objT);
            pxg1 pxg1VarO1 = irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = ucy0.Y0;
                x340Var.s0(objT2);
            }
            fq7.b(pbhVar, z2, (qim0) null, bbyVarO, xay.s(pxg1VarO1, (iu30) objT2), (String) null, apo.r(71309226, new tf((Object) z6d1Var, z3, (Object) e6d1Var, (Object) iu30Var, (byte) 24), x340Var), x340Var, i6 | 1572864 | ((i5 >> 9) & 112), 18);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ekd0(z6d1Var, i, z, z2, e6d1Var, iu30Var, i2);
        }
    }

    public static final void u(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(681523546);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q4r0.Y0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0.a, false, (iu30) objT), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new psr0(str, i, (byte) 1);
        }
    }

    public static final void v(gx51 gx51Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1291714443);
        int i4 = 2;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gx51Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131964146);
            String strO1 = cwl1.o0(x340Var, 2131964147);
            x340Var.i0(92040738);
            smc0 smc0VarN = k4p1.n();
            fux fuxVar = fux.c;
            jsl jslVar = new jsl(strO1);
            int i5 = i2 & 112;
            boolean z = i5 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new wg31(iu30Var, (byte) 27);
                x340Var.s0(objT);
            }
            smc0VarN.add(new a90("close", (String) null, (Function0) objT, fuxVar, (max) null, jslVar, 50));
            x340Var.i0(92050464);
            List list = gx51Var.b;
            int size = list.size();
            int i6 = 0;
            while (i6 < size) {
                bx51 bx51Var = (bx51) list.get(i6);
                String strName = bx51Var.name();
                int iOrdinal = bx51Var.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131964143;
                } else if (iOrdinal == 1) {
                    i3 = 2131964145;
                } else {
                    if (iOrdinal != i4) {
                        eg.o();
                        return;
                    }
                    i3 = 2131964144;
                }
                String strO2 = cwl1.o0(x340Var, i3);
                jax haxVar = gx51Var.c ? jax.a : new hax(strO0);
                boolean zE = x340Var.e(bx51Var.ordinal()) | (i5 == 32);
                Object objT2 = x340Var.T();
                if (zE || objT2 == m4cVar) {
                    objT2 = new rl21(iu30Var, bx51Var, (byte) 29);
                    x340Var.s0(objT2);
                }
                smc0VarN.add(new a90(strName, strO2, (Function0) objT2, (hux) null, haxVar, (jsl) null, 88));
                i6++;
                i4 = 2;
            }
            x340Var.r(false);
            smc0 smc0VarK = k4p1.k(smc0VarN);
            x340Var.r(false);
            c380 c380VarA = mqo1.A(smc0VarK);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            long j = cbx.a(x340Var).a.c;
            boolean zF = x340Var.f(jA) | x340Var.f(j);
            Object objT3 = x340Var.T();
            if (zF || objT3 == m4cVar) {
                long jT = z4p1.t(jA, j);
                objT3 = new r3g(jT, jT);
                x340Var.s0(objT3);
            }
            t3g.a((r3g) objT3, apo.r(-756799635, new i90(c380VarA, (byte) 12), x340Var), x340Var, 48);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(gx51Var, iu30Var, i, (byte) 16);
        }
    }

    public static final void w(int i, b0k b0kVar, qim0 qim0Var, boolean z) {
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(898347721);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            soz0 soz0VarG = fno1.g(cbx.a(x340Var).b.f, cbx.a(x340Var).b.b, x340Var);
            qim0 qim0Var2 = nim0.a;
            z2 = z;
            kno1.n(z2, null, anm1.N("radio_test_tag", u291.r(qim0Var2, 20.0f)), false, soz0VarG, null, x340Var, (i2 & 14) | 48, 40);
            qim0Var = qim0Var2;
        } else {
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3z0(z2, qim0Var, i, (byte) 1);
        }
    }

    public static final void x(boolean z, boolean z2, e6d1 e6d1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1148641684);
        int i4 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.e(e6d1Var.ordinal()) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024);
        int i5 = i2 & 16;
        if (i5 != 0) {
            i3 = i4 | 24576;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 16384 : 8192);
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var4 = i5 != 0 ? nim0.a : qim0Var2;
            yf yfVar = e6d1Var.c;
            String strO0 = cwl1.o0(x340Var, z2 ? e6d1Var.h : 2131961430);
            boolean z3 = (i3 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new ccy0(iu30Var, (byte) 29);
                x340Var.s0(objT);
            }
            h((Function0) objT, yfVar, z, strO0, qim0Var4, x340Var, ((i3 << 6) & 896) | (i3 & 57344));
            qim0Var3 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a4z0(z, z2, e6d1Var, iu30Var, qim0Var3, i, i2);
        }
    }

    public static final void y(boolean z, j2i j2iVar, b0k b0kVar, int i) {
        boolean z2;
        j2i j2iVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-930041066);
        int i2 = (x340Var.h(z) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            ceo ceoVar = ((jhx) ((cwx) x340Var.k(mde0.a)).a.d).a;
            z2 = z;
            j2iVar2 = j2iVar;
            fq7.g(z2, (qim0) null, xay.d(irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2), (fra) null, 14).a(xay.e(2, irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2))), xay.l(14, irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2)).a(xay.f(2, irn1.o0(CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, 0, ceoVar, 2))), (String) null, j2iVar2, x340Var, (i2 & 14) | 196608, 18);
        } else {
            z2 = z;
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ok6((byte) 5, i, j2iVar2, z2);
        }
    }

    public static final void z(tho1 tho1Var, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        Function0 function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1634947284);
        int i2 = i | (x340Var.i(tho1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            u(cwl1.o0(x340Var, 2131959569), x340Var, 0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(uox.c, cwl1.o0(x340Var, 2131959570), x340Var, uox.d);
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(unx.c, cwl1.o0(x340Var, 2131959554), x340Var, unx.d);
            cvx cvxVar3 = cbx.b(x340Var).b;
            u(kk0.j(16.0f, 2131959552, x340Var, x340Var, nim0Var), x340Var, 0);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(znx.c, cwl1.o0(x340Var, 2131959561), x340Var, znx.d);
            cvx cvxVar5 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            g(pox.c, cwl1.o0(x340Var, 2131959551), x340Var, pox.d);
            if (u890.j(tho1Var, ejh1.c)) {
                function2 = function0;
            } else if (tho1Var instanceof djh1) {
                function2 = function1;
            } else {
                if (!u890.j(tho1Var, cjh1.c)) {
                    eg.o();
                    return;
                }
                function2 = null;
            }
            if (function2 != null) {
                x340Var.i0(-2045853163);
                uwo1.e(kk0.j(cbx.b(x340Var).b.c, 2131959568, x340Var, x340Var, nim0Var), bin.x(nim0Var, false, null, new pm31(0), null, function2, 11), lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119), cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2032);
                x340Var.r(false);
            } else {
                x340Var.i0(-2045473568);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vbn0(tho1Var, function0, function1, i, (byte) 23);
        }
    }
}
