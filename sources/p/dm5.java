package p;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.widget.EdgeEffect;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.Charset;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class dm5 {
    public static final ia4 a = new ia4(2);
    public static final fol1 b = new fol1(0.31006f, 0.31616f);
    public static final fol1 c = new fol1(0.34567f, 0.3585f);
    public static final fol1 d = new fol1(0.32168f, 0.33767f);
    public static final fol1 e = new fol1(0.31271f, 0.32902f);
    public static final float[] f = {0.964212f, 1.0f, 0.825188f};
    public static final Object g = new Object();
    public static boolean h;
    public static int i;
    public static b180 j;

    public static void A(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        eg.m(m5n1.L(str, obj));
    }

    public static void B(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        eg.m(m5n1.L(str, obj, obj2));
    }

    public static nen0 C() {
        long[] jArr = hj41.a;
        return new nen0();
    }

    public static tz21 D(String str, r8i0 r8i0Var) {
        mmr0 mmr0VarU = jch0.u(r8i0Var);
        Charset charset = (Charset) mmr0VarU.a;
        r8i0 r8i0Var2 = (r8i0) mmr0VarU.b;
        nac nacVar = new nac();
        int length = str.length();
        if (length < 0) {
            hhg1.f(cy30.i(length, "endIndex < beginIndex: ", 0, " < "));
        } else if (length > str.length()) {
            t8e1.l(str.length(), cy30.r(length, "endIndex > string.length: ", " > "));
        } else if (charset.equals(nne.a)) {
            nacVar.X(0, length, str);
        } else {
            byte[] bytes = str.substring(0, length).getBytes(charset);
            nacVar.write(bytes, 0, bytes.length);
        }
        return new tz21(r8i0Var2, nacVar.b, nacVar);
    }

    public static final Function0 E(iu30 iu30Var, b0k b0kVar, int i2) {
        int iHashCode = Long.hashCode(tgp1.l(b0kVar));
        x340 x340Var = (x340) b0kVar;
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        v340 v340VarU = tgp1.u(x340Var);
        nd41 nd41Var = (nd41) x340Var.k(pd41.a);
        View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
        boolean zI = ((((i2 & 14) ^ 6) > 4 && x340Var.g(iu30Var)) || (i2 & 6) == 4) | x340Var.i(context) | x340Var.i(v340VarU) | x340Var.i(nd41Var) | x340Var.e(iHashCode) | x340Var.i(view);
        Object objT = x340Var.T();
        if (zI || objT == fkj0.X) {
            p75 p75Var = new p75(context, iu30Var, v340VarU, nd41Var, iHashCode, view);
            x340Var.s0(p75Var);
            objT = p75Var;
        }
        return (Function0) objT;
    }

    public static kkd1 F(zjd1 zjd1Var, q8n q8nVar, iu30 iu30Var, vu30 vu30Var, vu30 vu30Var2, int i2) {
        boolean z = (i2 & 8) == 0;
        if ((i2 & 16) != 0) {
            vu30Var2 = new s55((byte) 24);
        }
        return new kkd1(zjd1Var, q8nVar, iu30Var, vu30Var, z, vu30Var2);
    }

    public static kkd1 G(zjd1 zjd1Var, q8n q8nVar, vu30 vu30Var, vu30 vu30Var2) {
        return F(zjd1Var, q8nVar, new pm0(vu30Var, (byte) 7), vu30Var2, new s55((byte) 25), 8);
    }

    public static final float H(float f2) {
        float fIntBitsToFloat = Float.intBitsToFloat(((int) ((((long) Float.floatToRawIntBits(f2)) & 8589934591L) / 3)) + 709952852);
        float f3 = fIntBitsToFloat - ((fIntBitsToFloat - (f2 / (fIntBitsToFloat * fIntBitsToFloat))) * 0.33333334f);
        return f3 - ((f3 - (f2 / (f3 * f3))) * 0.33333334f);
    }

    public static final gt40 I(gt40 gt40Var) {
        return J(gt40Var).c(new f660(v4u.a));
    }

    public static final gt40 J(gt40 gt40Var) {
        return gt40Var.c(new iql1(v4u.a));
    }

    public static final d030 K(d030 d030Var) {
        d030 d030VarH = ((dz20) ((ha4) oap1.C(d030Var)).getFocusOwner()).h();
        if (d030VarH == null || !d030VarH.N0) {
            return null;
        }
        return d030VarH;
    }

    public static final n511 L(d030 d030Var) {
        ndo0 ndo0Var;
        if (d030Var.N0 && (ndo0Var = d030Var.h) != null) {
            elb0 elb0VarV = nho1.v(ndo0Var);
            if (!elb0VarV.a()) {
                elb0VarV = null;
            }
            if (elb0VarV != null) {
                return d030Var.K1(elb0VarV);
            }
        }
        return n511.e;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final d030 M(d030 d030Var) throws NoWhenBranchMatchedException {
        boolean z = d030Var.a.N0;
        if (z) {
            if (!z) {
                qf80.c("visitChildren called on an unattached node");
            }
            bfn0 bfn0Var = new bfn0(0, new pim0[16]);
            pim0 pim0Var = d030Var.a;
            pim0 pim0Var2 = pim0Var.f;
            if (pim0Var2 == null) {
                oap1.d(bfn0Var, pim0Var);
            } else {
                bfn0Var.b(pim0Var2);
            }
            while (true) {
                int i2 = bfn0Var.c;
                if (i2 == 0) {
                    break;
                }
                pim0 pim0VarE = (pim0) bfn0Var.l(i2 - 1);
                if ((pim0VarE.d & 1024) == 0) {
                    oap1.d(bfn0Var, pim0VarE);
                } else {
                    while (pim0VarE != null) {
                        if ((pim0VarE.c & 1024) != 0) {
                            bfn0 bfn0Var2 = null;
                            while (pim0VarE != null) {
                                if (pim0VarE instanceof d030) {
                                    d030 d030Var2 = (d030) pim0VarE;
                                    if (d030Var2.a.N0) {
                                        int iOrdinal = d030Var2.L1().ordinal();
                                        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
                                            return d030Var2;
                                        }
                                        if (iOrdinal != 3) {
                                            eg.o();
                                            return null;
                                        }
                                    }
                                } else if ((pim0VarE.c & 1024) != 0 && (pim0VarE instanceof l5t)) {
                                    int i3 = 0;
                                    for (pim0 pim0Var3 = ((l5t) pim0VarE).P0; pim0Var3 != null; pim0Var3 = pim0Var3.f) {
                                        if ((pim0Var3.c & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                pim0VarE = pim0Var3;
                                            } else {
                                                if (bfn0Var2 == null) {
                                                    bfn0Var2 = new bfn0(0, new pim0[16]);
                                                }
                                                if (pim0VarE != null) {
                                                    bfn0Var2.b(pim0VarE);
                                                    pim0VarE = null;
                                                }
                                                bfn0Var2.b(pim0Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                pim0VarE = oap1.e(bfn0Var2);
                            }
                            break;
                        }
                        pim0VarE = pim0VarE.f;
                    }
                }
            }
        }
        return null;
    }

    public static float N(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ulv.b(edgeEffect);
        }
        return 0.0f;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final xwp0 O(int i2, String str) {
        rwp0 rwp0Var = rwp0.a;
        if (str != null) {
            switch (str.hashCode()) {
                case -1309235419:
                    if (str.equals("expired")) {
                        return pwp0.a;
                    }
                    break;
                case -1211129254:
                    if (str.equals("downloading")) {
                        return ebp1.l(i2);
                    }
                    break;
                case -934422706:
                    if (str.equals("resync")) {
                        return twp0.a;
                    }
                    break;
                case 3521:
                    str.equals("no");
                    return rwp0Var;
                case 119527:
                    if (str.equals("yes")) {
                        return hwp0.a;
                    }
                    break;
                case 96784904:
                    if (str.equals("error")) {
                        return lwp0.a;
                    }
                    break;
                case 111293437:
                    if (str.equals("waitingSyncNotAllowed")) {
                        return g0(i2, 4);
                    }
                    break;
                case 119284121:
                    if (str.equals("waitingOfflineMode")) {
                        return g0(i2, 2);
                    }
                    break;
                case 1116313165:
                    if (str.equals("waiting")) {
                        return g0(i2, 1);
                    }
                    break;
                case 1881262700:
                    if (str.equals("waitingNoConnection")) {
                        return g0(i2, 3);
                    }
                    break;
                case 1987113811:
                    if (str.equals("exceeded")) {
                        return nwp0.a;
                    }
                    break;
            }
        }
        return rwp0Var;
    }

    public static final ViewParent P(View view) {
        ViewParent parent = view.getParent();
        if (parent != null) {
            return parent;
        }
        Object tag = view.getTag(2131431626);
        if (tag instanceof ViewParent) {
            return (ViewParent) tag;
        }
        return null;
    }

    public static final gt40 Q(gt40 gt40Var, float f2) {
        return gt40Var.c(new f660(new t4u(f2, 0)));
    }

    public static final boolean R(d030 d030Var) {
        hmb0 hmb0Var;
        ndo0 ndo0Var;
        hmb0 hmb0Var2;
        ndo0 ndo0Var2 = d030Var.h;
        return (ndo0Var2 == null || (hmb0Var = ndo0Var2.U0) == null || !hmb0Var.J() || (ndo0Var = d030Var.h) == null || (hmb0Var2 = ndo0Var.U0) == null || !hmb0Var2.I()) ? false : true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static znb0 S(int i2, Function0 function0) throws NoWhenBranchMatchedException {
        kuw0 kuw0Var = kuw0.i;
        int iC = l1d.C(i2);
        if (iC == 0) {
            return new idd1(function0);
        }
        if (iC == 1) {
            w441 w441Var = new w441();
            w441Var.a = function0;
            w441Var.b = kuw0Var;
            return w441Var;
        }
        if (iC != 2) {
            eg.o();
            return null;
        }
        okh1 okh1Var = new okh1();
        okh1Var.a = function0;
        okh1Var.b = kuw0Var;
        return okh1Var;
    }

    public static final float T(float f2, float f3, float f4) {
        return (f4 * f3) + ((1.0f - f4) * f2);
    }

    public static final int U(int i2, int i3, float f2) {
        return i2 + ((int) Math.round(((double) (i3 - i2)) * ((double) f2)));
    }

    public static v360 V(String... strArr) {
        String[] strArr2 = (String[]) Arrays.copyOf(strArr, strArr.length);
        if (strArr2.length % 2 != 0) {
            hhg1.n("Expected alternating header names and values");
            return null;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(strArr2, strArr2.length);
        int length = strArr3.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3++) {
            if (strArr3[i3] == null) {
                hhg1.n("Headers cannot be null");
                return null;
            }
            strArr3[i3] = ihc1.e1(strArr2[i3]).toString();
        }
        int iA = bmq0.A(0, strArr3.length - 1, 2);
        if (iA >= 0) {
            while (true) {
                String str = strArr3[i2];
                String str2 = strArr3[i2 + 1];
                m5n1.G(str);
                m5n1.H(str2, str);
                if (i2 == iA) {
                    break;
                }
                i2 += 2;
            }
        }
        return new v360(strArr3);
    }

    public static float W(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 31) {
            return ulv.c(edgeEffect, f2, f3);
        }
        edgeEffect.onPull(f2, f3);
        return f2;
    }

    public static final long X(long j2, long j3) {
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 >> 32)) + ((int) (j3 >> 32)))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) + ((int) (j3 & 4294967295L)))) & 4294967295L);
    }

    public static final synchronized fos0 Y() {
        File fileStreamPath;
        fos0 fos0Var;
        Context contextA = wf10.a();
        fos0 fos0Var2 = null;
        try {
            try {
                try {
                    cm5 cm5Var = new cm5(new BufferedInputStream(contextA.openFileInput("AppEventsLogger.persistedevents")));
                    try {
                        fos0Var = (fos0) cm5Var.readObject();
                        try {
                            cm5Var.close();
                            try {
                                contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                            } catch (Exception unused) {
                            }
                        } catch (FileNotFoundException unused2) {
                            fos0Var2 = fos0Var;
                            fileStreamPath = contextA.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            fos0Var = fos0Var2;
                        } catch (IOException unused3) {
                            fos0Var2 = fos0Var;
                            fileStreamPath = contextA.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            fos0Var = fos0Var2;
                        } catch (ClassNotFoundException unused4) {
                            fos0Var2 = fos0Var;
                            fileStreamPath = contextA.getFileStreamPath("AppEventsLogger.persistedevents");
                            fileStreamPath.delete();
                            fos0Var = fos0Var2;
                        }
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            u890.p(cm5Var, th);
                            throw th2;
                        }
                    }
                } catch (Exception unused5) {
                    fos0Var = fos0Var2;
                }
            } catch (Throwable th3) {
                try {
                    contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
                } catch (Exception unused6) {
                }
                throw th3;
            }
        } catch (FileNotFoundException unused7) {
        } catch (IOException unused8) {
        } catch (ClassNotFoundException unused9) {
        }
        if (fos0Var == null) {
            fos0Var = new fos0();
        }
        return fos0Var;
    }

    public static final boolean Z(nen0 nen0Var, Object obj, Object obj2) {
        Object objG = nen0Var.g(obj);
        if (objG == null) {
            return false;
        }
        if (!(objG instanceof oen0)) {
            if (!objG.equals(obj2)) {
                return false;
            }
            nen0Var.k(obj);
            return true;
        }
        oen0 oen0Var = (oen0) objG;
        boolean zL = oen0Var.l(obj2);
        if (zL && oen0Var.g()) {
            nen0Var.k(obj);
        }
        return zL;
    }

    public static final void a(iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        iu30 iu30Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1783766393);
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(iu30Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        int i6 = i3 & 4;
        if (i6 != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= x340Var.i(iu30Var2) ? 256 : 128;
        }
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            if (i5 != 0) {
                qim0Var = nim0.a;
            }
            qim0 qim0Var3 = qim0Var;
            ia4 ia4Var = a;
            iu30 iu30Var4 = i6 != 0 ? ia4Var : iu30Var2;
            b(iu30Var, qim0Var3, null, ia4Var, iu30Var4, x340Var, (i4 & 14) | 3072 | (i4 & 112) | (57344 & (i4 << 6)), 4);
            qim0Var2 = qim0Var3;
            iu30Var3 = iu30Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            iu30Var3 = iu30Var2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rd4(iu30Var, qim0Var2, iu30Var3, i2, i3, (byte) 1);
        }
    }

    public static final void a0(nen0 nen0Var, Object obj) {
        boolean zG;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i2 = 0;
        while (true) {
            long j2 = jArr[i2];
            if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i3 = 8 - ((~(i2 - length)) >>> 31);
                for (int i4 = 0; i4 < i3; i4++) {
                    if ((255 & j2) < 128) {
                        int i5 = (i2 << 3) + i4;
                        Object obj2 = nen0Var.b[i5];
                        Object obj3 = nen0Var.c[i5];
                        if (obj3 instanceof oen0) {
                            oen0 oen0Var = (oen0) obj3;
                            oen0Var.l(obj);
                            zG = oen0Var.g();
                        } else {
                            zG = obj3 == obj;
                        }
                        if (zG) {
                            nen0Var.l(i5);
                        }
                    }
                    j2 >>= 8;
                }
                if (i3 != 8) {
                    return;
                }
            }
            if (i2 == length) {
                return;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0063  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007a  */
    /* JADX WARN: Code duplicated, block: B:49:0x007e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x009d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:71:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:76:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:78:0x0102  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:84:0x013c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0157  */
    /* JADX WARN: Code duplicated, block: B:88:0x015e  */
    /* JADX WARN: Code duplicated, block: B:89:0x0162  */
    /* JADX WARN: Code duplicated, block: B:92:0x0189  */
    /* JADX WARN: Code duplicated, block: B:94:0x018d  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    /* JADX WARN: Code duplicated, block: B:99:? A[RETURN, SYNTHETIC] */
    public static final void b(iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, b0k b0kVar, int i2, int i3) {
        int i4;
        qim0 qim0Var2;
        int i5;
        iu30 iu30Var5;
        int i6;
        int i7;
        iu30 iu30Var6;
        int i8;
        int i9;
        iu30 iu30Var7;
        int i10;
        boolean z;
        qim0 qim0Var3;
        iu30 iu30Var8;
        iu30 iu30Var9;
        iu30 iu30Var10;
        h311 h311VarV;
        qim0 qim0Var4;
        iu30 iu30Var11;
        iu30 iu30Var12;
        int iHashCode;
        qim0 qim0VarE;
        wat watVar;
        flb0 flb0Var;
        xos0 xos0VarM;
        iac0 iac0Var;
        qe41 qe41Var;
        iu30 iu30Var13;
        iu30 iu30Var14;
        Function0 function0E;
        Function0 function0E2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-180024211);
        j06 j06Var = x340Var.a;
        if ((i2 & 6) == 0) {
            i4 = (x340Var.i(iu30Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 == 0) {
            if ((i2 & 48) == 0) {
                qim0Var2 = qim0Var;
                i4 |= x340Var.g(qim0Var2) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 != 0) {
                if ((i2 & 384) == 0) {
                    iu30Var5 = iu30Var2;
                    if (x340Var.i(iu30Var5)) {
                        i6 = 256;
                    } else {
                        i6 = 128;
                    }
                    i4 |= i6;
                }
                i7 = i3 & 8;
                if (i7 != 0) {
                    if ((i2 & 3072) == 0) {
                        iu30Var6 = iu30Var3;
                        if (x340Var.i(iu30Var6)) {
                            i8 = 2048;
                        } else {
                            i8 = 1024;
                        }
                        i4 |= i8;
                    }
                    i9 = i3 & 16;
                    if (i9 != 0) {
                        if ((i2 & 24576) == 0) {
                            iu30Var7 = iu30Var4;
                            if (x340Var.i(iu30Var7)) {
                                i10 = 16384;
                            } else {
                                i10 = 8192;
                            }
                            i4 |= i10;
                        }
                        if ((i4 & 9363) != 9362) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (x340Var.Y(i4 & 1, z)) {
                            if (i11 != 0) {
                                qim0Var4 = nim0.a;
                            } else {
                                qim0Var4 = qim0Var2;
                            }
                            if (i5 != 0) {
                                iu30Var11 = null;
                            } else {
                                iu30Var11 = iu30Var5;
                            }
                            iu30Var12 = a;
                            if (i7 != 0) {
                                iu30Var6 = iu30Var12;
                            }
                            if (i9 == 0) {
                                iu30Var12 = iu30Var7;
                            }
                            iHashCode = Long.hashCode(tgp1.l(x340Var));
                            qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                            watVar = (wat) x340Var.k(t4k.h);
                            flb0Var = (flb0) x340Var.k(t4k.n);
                            xos0VarM = x340Var.m();
                            iac0Var = (iac0) x340Var.k(jfe0.a);
                            qe41Var = (qe41) x340Var.k(lge0.a);
                            if (iu30Var11 != null) {
                                x340Var.i0(1313917368);
                                function0E2 = E(iu30Var, x340Var, i4 & 14);
                                if (j06Var instanceof wch1) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.m0();
                                if (x340Var.S) {
                                    x340Var.l(function0E2);
                                } else {
                                    x340Var.v0();
                                }
                                iu30Var13 = iu30Var12;
                                iu30Var14 = iu30Var6;
                                f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                                nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                                nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                                nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                                x340Var.r(true);
                                x340Var.r(false);
                            } else {
                                iu30Var13 = iu30Var12;
                                int i12 = i4;
                                iu30Var14 = iu30Var6;
                                x340Var.i0(1314774735);
                                function0E = E(iu30Var, x340Var, i12 & 14);
                                if (j06Var instanceof wch1) {
                                    tgp1.p();
                                    throw null;
                                }
                                x340Var.g0();
                                if (x340Var.S) {
                                    x340Var.l(function0E);
                                } else {
                                    x340Var.v0();
                                }
                                f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                                nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                                nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                                x340Var.r(true);
                                x340Var.r(false);
                            }
                            qim0 qim0Var5 = qim0Var4;
                            iu30Var9 = iu30Var14;
                            qim0Var3 = qim0Var5;
                            iu30Var10 = iu30Var13;
                            iu30Var8 = iu30Var11;
                        } else {
                            x340Var.b0();
                            qim0Var3 = qim0Var2;
                            iu30Var8 = iu30Var5;
                            iu30Var9 = iu30Var6;
                            iu30Var10 = iu30Var7;
                        }
                        h311VarV = x340Var.v();
                        if (h311VarV != null) {
                            h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                        }
                    }
                    i4 |= 24576;
                    iu30Var7 = iu30Var4;
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i4 & 1, z)) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            iu30Var11 = null;
                        } else {
                            iu30Var11 = iu30Var5;
                        }
                        iu30Var12 = a;
                        if (i7 != 0) {
                            iu30Var6 = iu30Var12;
                        }
                        if (i9 == 0) {
                            iu30Var12 = iu30Var7;
                        }
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                        watVar = (wat) x340Var.k(t4k.h);
                        flb0Var = (flb0) x340Var.k(t4k.n);
                        xos0VarM = x340Var.m();
                        iac0Var = (iac0) x340Var.k(jfe0.a);
                        qe41Var = (qe41) x340Var.k(lge0.a);
                        if (iu30Var11 != null) {
                            x340Var.i0(1313917368);
                            function0E2 = E(iu30Var, x340Var, i4 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0E2);
                            } else {
                                x340Var.v0();
                            }
                            iu30Var13 = iu30Var12;
                            iu30Var14 = iu30Var6;
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                            nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            iu30Var13 = iu30Var12;
                            int i13 = i4;
                            iu30Var14 = iu30Var6;
                            x340Var.i0(1314774735);
                            function0E = E(iu30Var, x340Var, i13 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0E);
                            } else {
                                x340Var.v0();
                            }
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        qim0 qim0Var6 = qim0Var4;
                        iu30Var9 = iu30Var14;
                        qim0Var3 = qim0Var6;
                        iu30Var10 = iu30Var13;
                        iu30Var8 = iu30Var11;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        iu30Var8 = iu30Var5;
                        iu30Var9 = iu30Var6;
                        iu30Var10 = iu30Var7;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                    }
                }
                i4 |= 3072;
                iu30Var6 = iu30Var3;
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        iu30Var7 = iu30Var4;
                        if (x340Var.i(iu30Var7)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i4 & 1, z)) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            iu30Var11 = null;
                        } else {
                            iu30Var11 = iu30Var5;
                        }
                        iu30Var12 = a;
                        if (i7 != 0) {
                            iu30Var6 = iu30Var12;
                        }
                        if (i9 == 0) {
                            iu30Var12 = iu30Var7;
                        }
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                        watVar = (wat) x340Var.k(t4k.h);
                        flb0Var = (flb0) x340Var.k(t4k.n);
                        xos0VarM = x340Var.m();
                        iac0Var = (iac0) x340Var.k(jfe0.a);
                        qe41Var = (qe41) x340Var.k(lge0.a);
                        if (iu30Var11 != null) {
                            x340Var.i0(1313917368);
                            function0E2 = E(iu30Var, x340Var, i4 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0E2);
                            } else {
                                x340Var.v0();
                            }
                            iu30Var13 = iu30Var12;
                            iu30Var14 = iu30Var6;
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                            nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            iu30Var13 = iu30Var12;
                            int i14 = i4;
                            iu30Var14 = iu30Var6;
                            x340Var.i0(1314774735);
                            function0E = E(iu30Var, x340Var, i14 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0E);
                            } else {
                                x340Var.v0();
                            }
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        qim0 qim0Var7 = qim0Var4;
                        iu30Var9 = iu30Var14;
                        qim0Var3 = qim0Var7;
                        iu30Var10 = iu30Var13;
                        iu30Var8 = iu30Var11;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        iu30Var8 = iu30Var5;
                        iu30Var9 = iu30Var6;
                        iu30Var10 = iu30Var7;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                    }
                }
                i4 |= 24576;
                iu30Var7 = iu30Var4;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i15 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i15 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var8 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var8;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 384;
            iu30Var5 = iu30Var2;
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    iu30Var6 = iu30Var3;
                    if (x340Var.i(iu30Var6)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        iu30Var7 = iu30Var4;
                        if (x340Var.i(iu30Var7)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i4 & 1, z)) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            iu30Var11 = null;
                        } else {
                            iu30Var11 = iu30Var5;
                        }
                        iu30Var12 = a;
                        if (i7 != 0) {
                            iu30Var6 = iu30Var12;
                        }
                        if (i9 == 0) {
                            iu30Var12 = iu30Var7;
                        }
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                        watVar = (wat) x340Var.k(t4k.h);
                        flb0Var = (flb0) x340Var.k(t4k.n);
                        xos0VarM = x340Var.m();
                        iac0Var = (iac0) x340Var.k(jfe0.a);
                        qe41Var = (qe41) x340Var.k(lge0.a);
                        if (iu30Var11 != null) {
                            x340Var.i0(1313917368);
                            function0E2 = E(iu30Var, x340Var, i4 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0E2);
                            } else {
                                x340Var.v0();
                            }
                            iu30Var13 = iu30Var12;
                            iu30Var14 = iu30Var6;
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                            nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            iu30Var13 = iu30Var12;
                            int i16 = i4;
                            iu30Var14 = iu30Var6;
                            x340Var.i0(1314774735);
                            function0E = E(iu30Var, x340Var, i16 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0E);
                            } else {
                                x340Var.v0();
                            }
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        qim0 qim0Var9 = qim0Var4;
                        iu30Var9 = iu30Var14;
                        qim0Var3 = qim0Var9;
                        iu30Var10 = iu30Var13;
                        iu30Var8 = iu30Var11;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        iu30Var8 = iu30Var5;
                        iu30Var9 = iu30Var6;
                        iu30Var10 = iu30Var7;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                    }
                }
                i4 |= 24576;
                iu30Var7 = iu30Var4;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i17 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i17 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var10 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var10;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 3072;
            iu30Var6 = iu30Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    iu30Var7 = iu30Var4;
                    if (x340Var.i(iu30Var7)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i18 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i18 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var11 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var11;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 24576;
            iu30Var7 = iu30Var4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    iu30Var11 = null;
                } else {
                    iu30Var11 = iu30Var5;
                }
                iu30Var12 = a;
                if (i7 != 0) {
                    iu30Var6 = iu30Var12;
                }
                if (i9 == 0) {
                    iu30Var12 = iu30Var7;
                }
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                watVar = (wat) x340Var.k(t4k.h);
                flb0Var = (flb0) x340Var.k(t4k.n);
                xos0VarM = x340Var.m();
                iac0Var = (iac0) x340Var.k(jfe0.a);
                qe41Var = (qe41) x340Var.k(lge0.a);
                if (iu30Var11 != null) {
                    x340Var.i0(1313917368);
                    function0E2 = E(iu30Var, x340Var, i4 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0E2);
                    } else {
                        x340Var.v0();
                    }
                    iu30Var13 = iu30Var12;
                    iu30Var14 = iu30Var6;
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                    nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    iu30Var13 = iu30Var12;
                    int i19 = i4;
                    iu30Var14 = iu30Var6;
                    x340Var.i0(1314774735);
                    function0E = E(iu30Var, x340Var, i19 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.g0();
                    if (x340Var.S) {
                        x340Var.l(function0E);
                    } else {
                        x340Var.v0();
                    }
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0 qim0Var12 = qim0Var4;
                iu30Var9 = iu30Var14;
                qim0Var3 = qim0Var12;
                iu30Var10 = iu30Var13;
                iu30Var8 = iu30Var11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                iu30Var8 = iu30Var5;
                iu30Var9 = iu30Var6;
                iu30Var10 = iu30Var7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
            }
        }
        i4 |= 48;
        qim0Var2 = qim0Var;
        i5 = i3 & 4;
        if (i5 != 0) {
            if ((i2 & 384) == 0) {
                iu30Var5 = iu30Var2;
                if (x340Var.i(iu30Var5)) {
                    i6 = 256;
                } else {
                    i6 = 128;
                }
                i4 |= i6;
            }
            i7 = i3 & 8;
            if (i7 != 0) {
                if ((i2 & 3072) == 0) {
                    iu30Var6 = iu30Var3;
                    if (x340Var.i(iu30Var6)) {
                        i8 = 2048;
                    } else {
                        i8 = 1024;
                    }
                    i4 |= i8;
                }
                i9 = i3 & 16;
                if (i9 != 0) {
                    if ((i2 & 24576) == 0) {
                        iu30Var7 = iu30Var4;
                        if (x340Var.i(iu30Var7)) {
                            i10 = 16384;
                        } else {
                            i10 = 8192;
                        }
                        i4 |= i10;
                    }
                    if ((i4 & 9363) != 9362) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (x340Var.Y(i4 & 1, z)) {
                        if (i11 != 0) {
                            qim0Var4 = nim0.a;
                        } else {
                            qim0Var4 = qim0Var2;
                        }
                        if (i5 != 0) {
                            iu30Var11 = null;
                        } else {
                            iu30Var11 = iu30Var5;
                        }
                        iu30Var12 = a;
                        if (i7 != 0) {
                            iu30Var6 = iu30Var12;
                        }
                        if (i9 == 0) {
                            iu30Var12 = iu30Var7;
                        }
                        iHashCode = Long.hashCode(tgp1.l(x340Var));
                        qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                        watVar = (wat) x340Var.k(t4k.h);
                        flb0Var = (flb0) x340Var.k(t4k.n);
                        xos0VarM = x340Var.m();
                        iac0Var = (iac0) x340Var.k(jfe0.a);
                        qe41Var = (qe41) x340Var.k(lge0.a);
                        if (iu30Var11 != null) {
                            x340Var.i0(1313917368);
                            function0E2 = E(iu30Var, x340Var, i4 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0E2);
                            } else {
                                x340Var.v0();
                            }
                            iu30Var13 = iu30Var12;
                            iu30Var14 = iu30Var6;
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                            nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                            x340Var.r(true);
                            x340Var.r(false);
                        } else {
                            iu30Var13 = iu30Var12;
                            int i110 = i4;
                            iu30Var14 = iu30Var6;
                            x340Var.i0(1314774735);
                            function0E = E(iu30Var, x340Var, i110 & 14);
                            if (j06Var instanceof wch1) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var.g0();
                            if (x340Var.S) {
                                x340Var.l(function0E);
                            } else {
                                x340Var.v0();
                            }
                            f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                            nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                            nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                            x340Var.r(true);
                            x340Var.r(false);
                        }
                        qim0 qim0Var13 = qim0Var4;
                        iu30Var9 = iu30Var14;
                        qim0Var3 = qim0Var13;
                        iu30Var10 = iu30Var13;
                        iu30Var8 = iu30Var11;
                    } else {
                        x340Var.b0();
                        qim0Var3 = qim0Var2;
                        iu30Var8 = iu30Var5;
                        iu30Var9 = iu30Var6;
                        iu30Var10 = iu30Var7;
                    }
                    h311VarV = x340Var.v();
                    if (h311VarV != null) {
                        h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                    }
                }
                i4 |= 24576;
                iu30Var7 = iu30Var4;
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i111 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i111 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var14 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var14;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 3072;
            iu30Var6 = iu30Var3;
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    iu30Var7 = iu30Var4;
                    if (x340Var.i(iu30Var7)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i112 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i112 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var15 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var15;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 24576;
            iu30Var7 = iu30Var4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    iu30Var11 = null;
                } else {
                    iu30Var11 = iu30Var5;
                }
                iu30Var12 = a;
                if (i7 != 0) {
                    iu30Var6 = iu30Var12;
                }
                if (i9 == 0) {
                    iu30Var12 = iu30Var7;
                }
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                watVar = (wat) x340Var.k(t4k.h);
                flb0Var = (flb0) x340Var.k(t4k.n);
                xos0VarM = x340Var.m();
                iac0Var = (iac0) x340Var.k(jfe0.a);
                qe41Var = (qe41) x340Var.k(lge0.a);
                if (iu30Var11 != null) {
                    x340Var.i0(1313917368);
                    function0E2 = E(iu30Var, x340Var, i4 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0E2);
                    } else {
                        x340Var.v0();
                    }
                    iu30Var13 = iu30Var12;
                    iu30Var14 = iu30Var6;
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                    nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    iu30Var13 = iu30Var12;
                    int i113 = i4;
                    iu30Var14 = iu30Var6;
                    x340Var.i0(1314774735);
                    function0E = E(iu30Var, x340Var, i113 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.g0();
                    if (x340Var.S) {
                        x340Var.l(function0E);
                    } else {
                        x340Var.v0();
                    }
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0 qim0Var16 = qim0Var4;
                iu30Var9 = iu30Var14;
                qim0Var3 = qim0Var16;
                iu30Var10 = iu30Var13;
                iu30Var8 = iu30Var11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                iu30Var8 = iu30Var5;
                iu30Var9 = iu30Var6;
                iu30Var10 = iu30Var7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
            }
        }
        i4 |= 384;
        iu30Var5 = iu30Var2;
        i7 = i3 & 8;
        if (i7 != 0) {
            if ((i2 & 3072) == 0) {
                iu30Var6 = iu30Var3;
                if (x340Var.i(iu30Var6)) {
                    i8 = 2048;
                } else {
                    i8 = 1024;
                }
                i4 |= i8;
            }
            i9 = i3 & 16;
            if (i9 != 0) {
                if ((i2 & 24576) == 0) {
                    iu30Var7 = iu30Var4;
                    if (x340Var.i(iu30Var7)) {
                        i10 = 16384;
                    } else {
                        i10 = 8192;
                    }
                    i4 |= i10;
                }
                if ((i4 & 9363) != 9362) {
                    z = true;
                } else {
                    z = false;
                }
                if (x340Var.Y(i4 & 1, z)) {
                    if (i11 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if (i5 != 0) {
                        iu30Var11 = null;
                    } else {
                        iu30Var11 = iu30Var5;
                    }
                    iu30Var12 = a;
                    if (i7 != 0) {
                        iu30Var6 = iu30Var12;
                    }
                    if (i9 == 0) {
                        iu30Var12 = iu30Var7;
                    }
                    iHashCode = Long.hashCode(tgp1.l(x340Var));
                    qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                    watVar = (wat) x340Var.k(t4k.h);
                    flb0Var = (flb0) x340Var.k(t4k.n);
                    xos0VarM = x340Var.m();
                    iac0Var = (iac0) x340Var.k(jfe0.a);
                    qe41Var = (qe41) x340Var.k(lge0.a);
                    if (iu30Var11 != null) {
                        x340Var.i0(1313917368);
                        function0E2 = E(iu30Var, x340Var, i4 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.m0();
                        if (x340Var.S) {
                            x340Var.l(function0E2);
                        } else {
                            x340Var.v0();
                        }
                        iu30Var13 = iu30Var12;
                        iu30Var14 = iu30Var6;
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                        nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                        x340Var.r(true);
                        x340Var.r(false);
                    } else {
                        iu30Var13 = iu30Var12;
                        int i114 = i4;
                        iu30Var14 = iu30Var6;
                        x340Var.i0(1314774735);
                        function0E = E(iu30Var, x340Var, i114 & 14);
                        if (j06Var instanceof wch1) {
                            tgp1.p();
                            throw null;
                        }
                        x340Var.g0();
                        if (x340Var.S) {
                            x340Var.l(function0E);
                        } else {
                            x340Var.v0();
                        }
                        f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                        nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                        nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                        x340Var.r(true);
                        x340Var.r(false);
                    }
                    qim0 qim0Var17 = qim0Var4;
                    iu30Var9 = iu30Var14;
                    qim0Var3 = qim0Var17;
                    iu30Var10 = iu30Var13;
                    iu30Var8 = iu30Var11;
                } else {
                    x340Var.b0();
                    qim0Var3 = qim0Var2;
                    iu30Var8 = iu30Var5;
                    iu30Var9 = iu30Var6;
                    iu30Var10 = iu30Var7;
                }
                h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
                }
            }
            i4 |= 24576;
            iu30Var7 = iu30Var4;
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    iu30Var11 = null;
                } else {
                    iu30Var11 = iu30Var5;
                }
                iu30Var12 = a;
                if (i7 != 0) {
                    iu30Var6 = iu30Var12;
                }
                if (i9 == 0) {
                    iu30Var12 = iu30Var7;
                }
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                watVar = (wat) x340Var.k(t4k.h);
                flb0Var = (flb0) x340Var.k(t4k.n);
                xos0VarM = x340Var.m();
                iac0Var = (iac0) x340Var.k(jfe0.a);
                qe41Var = (qe41) x340Var.k(lge0.a);
                if (iu30Var11 != null) {
                    x340Var.i0(1313917368);
                    function0E2 = E(iu30Var, x340Var, i4 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0E2);
                    } else {
                        x340Var.v0();
                    }
                    iu30Var13 = iu30Var12;
                    iu30Var14 = iu30Var6;
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                    nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    iu30Var13 = iu30Var12;
                    int i115 = i4;
                    iu30Var14 = iu30Var6;
                    x340Var.i0(1314774735);
                    function0E = E(iu30Var, x340Var, i115 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.g0();
                    if (x340Var.S) {
                        x340Var.l(function0E);
                    } else {
                        x340Var.v0();
                    }
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0 qim0Var18 = qim0Var4;
                iu30Var9 = iu30Var14;
                qim0Var3 = qim0Var18;
                iu30Var10 = iu30Var13;
                iu30Var8 = iu30Var11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                iu30Var8 = iu30Var5;
                iu30Var9 = iu30Var6;
                iu30Var10 = iu30Var7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
            }
        }
        i4 |= 3072;
        iu30Var6 = iu30Var3;
        i9 = i3 & 16;
        if (i9 != 0) {
            if ((i2 & 24576) == 0) {
                iu30Var7 = iu30Var4;
                if (x340Var.i(iu30Var7)) {
                    i10 = 16384;
                } else {
                    i10 = 8192;
                }
                i4 |= i10;
            }
            if ((i4 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i4 & 1, z)) {
                if (i11 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (i5 != 0) {
                    iu30Var11 = null;
                } else {
                    iu30Var11 = iu30Var5;
                }
                iu30Var12 = a;
                if (i7 != 0) {
                    iu30Var6 = iu30Var12;
                }
                if (i9 == 0) {
                    iu30Var12 = iu30Var7;
                }
                iHashCode = Long.hashCode(tgp1.l(x340Var));
                qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
                watVar = (wat) x340Var.k(t4k.h);
                flb0Var = (flb0) x340Var.k(t4k.n);
                xos0VarM = x340Var.m();
                iac0Var = (iac0) x340Var.k(jfe0.a);
                qe41Var = (qe41) x340Var.k(lge0.a);
                if (iu30Var11 != null) {
                    x340Var.i0(1313917368);
                    function0E2 = E(iu30Var, x340Var, i4 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.m0();
                    if (x340Var.S) {
                        x340Var.l(function0E2);
                    } else {
                        x340Var.v0();
                    }
                    iu30Var13 = iu30Var12;
                    iu30Var14 = iu30Var6;
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                    nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                    x340Var.r(true);
                    x340Var.r(false);
                } else {
                    iu30Var13 = iu30Var12;
                    int i116 = i4;
                    iu30Var14 = iu30Var6;
                    x340Var.i0(1314774735);
                    function0E = E(iu30Var, x340Var, i116 & 14);
                    if (j06Var instanceof wch1) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var.g0();
                    if (x340Var.S) {
                        x340Var.l(function0E);
                    } else {
                        x340Var.v0();
                    }
                    f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                    nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                    nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                    x340Var.r(true);
                    x340Var.r(false);
                }
                qim0 qim0Var19 = qim0Var4;
                iu30Var9 = iu30Var14;
                qim0Var3 = qim0Var19;
                iu30Var10 = iu30Var13;
                iu30Var8 = iu30Var11;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
                iu30Var8 = iu30Var5;
                iu30Var9 = iu30Var6;
                iu30Var10 = iu30Var7;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
            }
        }
        i4 |= 24576;
        iu30Var7 = iu30Var4;
        if ((i4 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i4 & 1, z)) {
            if (i11 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (i5 != 0) {
                iu30Var11 = null;
            } else {
                iu30Var11 = iu30Var5;
            }
            iu30Var12 = a;
            if (i7 != 0) {
                iu30Var6 = iu30Var12;
            }
            if (i9 == 0) {
                iu30Var12 = iu30Var7;
            }
            iHashCode = Long.hashCode(tgp1.l(x340Var));
            qim0VarE = zr7.E(x340Var, y7y0.s(qim0Var4));
            watVar = (wat) x340Var.k(t4k.h);
            flb0Var = (flb0) x340Var.k(t4k.n);
            xos0VarM = x340Var.m();
            iac0Var = (iac0) x340Var.k(jfe0.a);
            qe41Var = (qe41) x340Var.k(lge0.a);
            if (iu30Var11 != null) {
                x340Var.i0(1313917368);
                function0E2 = E(iu30Var, x340Var, i4 & 14);
                if (j06Var instanceof wch1) {
                    tgp1.p();
                    throw null;
                }
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0E2);
                } else {
                    x340Var.v0();
                }
                iu30Var13 = iu30Var12;
                iu30Var14 = iu30Var6;
                f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                nko1.H(iu30Var11, x340Var, new n75((byte) 4));
                nko1.H(iu30Var13, x340Var, new n75((byte) 5));
                nko1.H(iu30Var14, x340Var, new n75((byte) 6));
                x340Var.r(true);
                x340Var.r(false);
            } else {
                iu30Var13 = iu30Var12;
                int i117 = i4;
                iu30Var14 = iu30Var6;
                x340Var.i0(1314774735);
                function0E = E(iu30Var, x340Var, i117 & 14);
                if (j06Var instanceof wch1) {
                    tgp1.p();
                    throw null;
                }
                x340Var.g0();
                if (x340Var.S) {
                    x340Var.l(function0E);
                } else {
                    x340Var.v0();
                }
                f0(x340Var, qim0VarE, iHashCode, watVar, iac0Var, qe41Var, flb0Var, xos0VarM);
                nko1.H(iu30Var13, x340Var, new n75((byte) 7));
                nko1.H(iu30Var14, x340Var, new n75((byte) 8));
                x340Var.r(true);
                x340Var.r(false);
            }
            qim0 qim0Var110 = qim0Var4;
            iu30Var9 = iu30Var14;
            qim0Var3 = qim0Var110;
            iu30Var10 = iu30Var13;
            iu30Var8 = iu30Var11;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
            iu30Var8 = iu30Var5;
            iu30Var9 = iu30Var6;
            iu30Var10 = iu30Var7;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o75(iu30Var, qim0Var3, iu30Var8, iu30Var9, iu30Var10, i2, i3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public static final fbk1 b0(hmb0 hmb0Var) throws KotlinNothingValueException {
        k75 k75Var = hmb0Var.P0;
        if (k75Var != null) {
            return (fbk1) k75Var;
        }
        throw l1d.w("Required value was null.");
    }

    public static final void c(si7 si7Var, String str, qim0 qim0Var, iu30 iu30Var, iu30 iu30Var2, tl3 tl3Var, j6m j6mVar, float f2, ColorFilter colorFilter, int i2, boolean z, b0k b0kVar, int i3, int i4) {
        int i5;
        String str2;
        iu30 iu30Var3;
        iu30 iu30Var4;
        tl3 tl3Var2;
        int i6;
        boolean z2;
        int i7;
        qim0 qim0Var2;
        zy70 zy70Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1236588022);
        if ((i3 & 6) == 0) {
            i5 = (x340Var.g(si7Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            str2 = str;
            i5 |= x340Var.g(str2) ? 32 : 16;
        } else {
            str2 = str;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            iu30Var3 = iu30Var;
            i5 |= x340Var.i(iu30Var3) ? 2048 : 1024;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i3 & 24576) == 0) {
            iu30Var4 = iu30Var2;
            i5 |= x340Var.i(iu30Var4) ? 16384 : 8192;
        } else {
            iu30Var4 = iu30Var2;
        }
        if ((196608 & i3) == 0) {
            tl3Var2 = tl3Var;
            i5 |= x340Var.g(tl3Var2) ? 131072 : 65536;
        } else {
            tl3Var2 = tl3Var;
        }
        if ((1572864 & i3) == 0) {
            i5 |= x340Var.g(j6mVar) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i5 |= x340Var.d(f2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i5 |= x340Var.g(colorFilter) ? 67108864 : 33554432;
        }
        if ((805306368 & i3) == 0) {
            i6 = i2;
            i5 |= x340Var.e(i6) ? 536870912 : 268435456;
        } else {
            i6 = i2;
        }
        if ((i4 & 6) == 0) {
            z2 = z;
            i7 = i4 | (x340Var.h(z2) ? 4 : 2);
        } else {
            z2 = z;
            i7 = i4;
        }
        if (x340Var.Y(i5 & 1, ((i5 & 306783379) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            Object obj = si7Var.a;
            int i8 = xpi1.b;
            m4c m4cVar = fkj0.X;
            x340Var.i0(-329318062);
            if (obj instanceof zy70) {
                x340Var.i0(-1008895720);
                zy70Var = (zy70) obj;
                if (zy70Var.t.g != null) {
                    x340Var.i0(-1008855668);
                    x340Var.r(false);
                    x340Var.r(false);
                    x340Var.r(false);
                } else {
                    x340Var.i0(-1008807494);
                    z291 z291VarB = xpi1.b(j6mVar, x340Var);
                    boolean zG = x340Var.g(zy70Var) | x340Var.g(z291VarB);
                    Object objT = x340Var.T();
                    if (zG || objT == m4cVar) {
                        vy70 vy70VarA = zy70.a(zy70Var);
                        vy70VarA.n = z291VarB;
                        objT = vy70VarA.a();
                        x340Var.s0(objT);
                    }
                    zy70Var = (zy70) objT;
                    us71.m(x340Var, false, false, false);
                }
            } else {
                x340Var.i0(-1008549326);
                Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
                z291 z291VarB2 = xpi1.b(j6mVar, x340Var);
                boolean zG2 = x340Var.g(context) | x340Var.g(obj) | x340Var.g(z291VarB2);
                Object objT2 = x340Var.T();
                if (zG2 || objT2 == m4cVar) {
                    vy70 vy70Var = new vy70(context);
                    vy70Var.c = obj;
                    vy70Var.n = z291VarB2;
                    objT2 = vy70Var.a();
                    x340Var.s0(objT2);
                }
                zy70Var = (zy70) objT2;
                x340Var.r(false);
                x340Var.r(false);
            }
            zy70 zy70Var2 = zy70Var;
            xpi1.f(zy70Var2);
            qim0Var2 = qim0Var;
            qim0 qim0VarThen = qim0Var2.then(new ryl(zy70Var2, si7Var.c, si7Var.b, iu30Var3, iu30Var4, i6, tl3Var2, j6mVar, f2, colorFilter, z2, xpi1.a(x340Var), str2));
            td4 td4Var = td4.n;
            int iK = tgp1.k(x340Var);
            qim0 qim0VarE = zr7.E(x340Var, qim0VarThen);
            xos0 xos0VarM = x340Var.m();
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
            nko1.H(td4Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(qim0VarE, x340Var, y580.Y);
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            x340Var.r(true);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new fi7(si7Var, str, qim0Var2, iu30Var, iu30Var2, tl3Var, j6mVar, f2, colorFilter, i2, z, i3, i4);
        }
    }

    public static final long c0(long j2) {
        int iRound = Math.round(Float.intBitsToFloat((int) (j2 >> 32)));
        return (((long) Math.round(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (((long) iRound) << 32);
    }

    public static final void d(Object obj, String str, rf01 rf01Var, qim0 qim0Var, j6m j6mVar, b0k b0kVar, int i2, int i3, int i4) {
        gra graVar = een.h;
        int i5 = i2 >> 3;
        x340 x340Var = (x340) b0kVar;
        c(new si7(obj, (gi7) x340Var.k(pce0.a), rf01Var), str, qim0Var, ni7.W0, null, graVar, j6mVar, 1.0f, null, 1, true, x340Var, (i2 & 112) | (i5 & 896) | (i5 & 7168) | (57344 & i5) | (458752 & i5) | (3670016 & i5) | (29360128 & i5) | (i5 & 234881024) | ((i3 << 27) & 1879048192), (i3 >> 3) & 14);
    }

    public static final void d0(fos0 fos0Var) {
        Context contextA = wf10.a();
        try {
            try {
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(new BufferedOutputStream(contextA.openFileOutput("AppEventsLogger.persistedevents", 0)));
                try {
                    objectOutputStream.writeObject(fos0Var);
                    objectOutputStream.close();
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        u890.p(objectOutputStream, th);
                        throw th2;
                    }
                }
            } catch (Exception unused) {
            }
        } catch (IOException unused2) {
            contextA.getFileStreamPath("AppEventsLogger.persistedevents").delete();
        }
    }

    public static final void e(c380 c380Var, int i2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i3) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1581466688);
        int i4 = i3 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(i2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarG = dug.g(jA, nim0Var);
            cvx cvxVar = cbx.b(x340Var).b;
            jhc1.d(i2, uyn1.B(qim0VarG, 0.0f, 0.0f, 0.0f, 4.0f, 7), cbx.a(x340Var).a.a.a(), 2, (xu30) null, apo.r(1926859617, new kqf(i2, iu30Var, c380Var), x340Var), x340Var, ((i4 >> 3) & 14) | 199680, 16);
            qim0Var2 = nim0Var;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ate(c380Var, i2, iu30Var, qim0Var2, i3, (byte) 1);
        }
    }

    public static final gt40 e0(gt40 gt40Var, float f2) {
        return Q(h0(gt40Var, f2), f2);
    }

    public static final void f(qim0 qim0Var, yf yfVar, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        yf yfVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-317720820);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.i(qim0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            yfVar2 = yfVar;
            i3 |= x340Var.i(yfVar2) ? 32 : 16;
        } else {
            yfVar2 = yfVar;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i2 & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            String strO0 = cwl1.o0(x340Var, h430.b.a());
            boolean z = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new fgf1(iu30Var, (byte) 17);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            wro1.h(new gbx(new y50(strO0), function0), yfVar2, (qim0) null, (max) null, (gdx) null, (vzq0) null, false, (idn0) null, (ga80) null, apo.r(462099875, new wfe1(qim0Var), x340Var), x340Var, i3 & 112, 6, 1020);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(qim0Var, yfVar, iu30Var, i2, (byte) 24);
        }
    }

    public static final void f0(b0k b0kVar, qim0 qim0Var, int i2, wat watVar, iac0 iac0Var, qe41 qe41Var, flb0 flb0Var, xos0 xos0Var) {
        hzj.A.getClass();
        nko1.H(xos0Var, b0kVar, y580.N0);
        nko1.H(qim0Var, b0kVar, new n75((byte) 9));
        nko1.H(watVar, b0kVar, new n75((byte) 0));
        nko1.H(iac0Var, b0kVar, new n75((byte) 1));
        nko1.H(qe41Var, b0kVar, new n75((byte) 2));
        nko1.H(flb0Var, b0kVar, new n75((byte) 3));
        nko1.H(Integer.valueOf(i2), b0kVar, y580.R0);
    }

    public static final void g(nen0 nen0Var, Object obj, Object obj2) {
        int iF = nen0Var.f(obj);
        boolean z = iF < 0;
        Object obj3 = z ? null : nen0Var.c[iF];
        if (obj3 != null) {
            if (obj3 instanceof oen0) {
                ((oen0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                oen0 oen0Var = new oen0();
                oen0Var.a(obj3);
                oen0Var.a(obj2);
                obj2 = oen0Var;
            }
            obj2 = obj3;
        }
        if (!z) {
            nen0Var.c[iF] = obj2;
            return;
        }
        int i2 = ~iF;
        nen0Var.b[i2] = obj;
        nen0Var.c[i2] = obj2;
    }

    public static xwp0 g0(int i2, int i3) {
        return i2 == 100 ? hwp0.a : ebp1.u(i3, i2);
    }

    public static String h(int i2, int i3, String str) {
        if (i2 < 0) {
            return m5n1.L("%s (%s) must not be negative", str, Integer.valueOf(i2));
        }
        if (i3 >= 0) {
            return m5n1.L("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i2), Integer.valueOf(i3));
        }
        hhg1.n(f4i1.c(i3, "negative size: "));
        return null;
    }

    public static final gt40 h0(gt40 gt40Var, float f2) {
        return gt40Var.c(new iql1(new t4u(f2, 0)));
    }

    public static void i(long j2, long j3, String str, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void j(long j2, String str, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, Long.valueOf(j2)));
    }

    public static final String j0(nln1 nln1Var) {
        int iZza = nln1Var.zza();
        return gvg.l(new StringBuilder(String.valueOf(iZza).length() + 1), "c", iZza);
    }

    public static void k(String str, int i2, int i3, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, Integer.valueOf(i2), Integer.valueOf(i3)));
    }

    public static void l(String str, int i2, boolean z) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, Integer.valueOf(i2)));
    }

    public static void m(boolean z) {
        if (z) {
            return;
        }
        bhn0.q();
    }

    public static void n(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void o(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, obj));
    }

    public static void p(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        hhg1.n(m5n1.L(str, obj, obj2));
    }

    public static void q(int i2, int i3) {
        String strL;
        if (i2 < 0 || i2 >= i3) {
            if (i2 < 0) {
                strL = m5n1.L("%s (%s) must not be negative", "index", Integer.valueOf(i2));
            } else {
                if (i3 < 0) {
                    hhg1.n(f4i1.c(i3, "negative size: "));
                    return;
                }
                strL = m5n1.L("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i2), Integer.valueOf(i3));
            }
            throw new IndexOutOfBoundsException(strL);
        }
    }

    public static void r(Object obj) {
        obj.getClass();
    }

    public static void s(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException(String.valueOf(obj2));
        }
    }

    public static void t(String str, Object obj, Object obj2) {
        if (obj != null) {
            return;
        }
        bhn0.i(m5n1.L(str, obj2));
    }

    public static void u(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            eg.g(h(i2, i3, "index"));
        }
    }

    public static void v(int i2, int i3, int i4) {
        String strH;
        if (i2 < 0 || i3 < i2 || i3 > i4) {
            if (i2 < 0 || i2 > i4) {
                strH = h(i2, i4, "start index");
            } else {
                strH = (i3 < 0 || i3 > i4) ? h(i3, i4, "end index") : m5n1.L("end index (%s) must not be less than start index (%s)", Integer.valueOf(i3), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static void w(long j2, long j3, String str, boolean z) {
        if (z) {
            return;
        }
        eg.m(m5n1.L(str, Long.valueOf(j2), Long.valueOf(j3)));
    }

    public static void x(String str, int i2, boolean z) {
        if (z) {
            return;
        }
        eg.m(m5n1.L(str, Integer.valueOf(i2)));
    }

    public static void y(boolean z) {
        if (z) {
            return;
        }
        bhn0.w();
    }

    public static void z(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public abstract void i0(int i2, byte[] bArr, int i3);
}
