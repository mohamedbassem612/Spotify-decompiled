package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.ResultReceiver;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class zqo1 {
    public static final int[] a = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};
    public static final int[] b = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};
    public static final int[] c = {67108863, 33554431};
    public static final int[] d = {26, 25};
    public static b180 e;

    public static void A(long[] jArr, long[] jArr2) {
        long j = jArr2[0];
        long j2 = j * j;
        long j3 = jArr2[1];
        long j4 = (j + j) * j3;
        long j5 = jArr2[2];
        long j6 = (j * j5) + (j3 * j3);
        long j7 = jArr2[3];
        long j8 = (j * j7) + (j3 * j5);
        long j9 = jArr2[4];
        long j10 = (j5 * j5) + (j3 * 4 * j7) + ((j + j) * j9);
        long j11 = jArr2[5];
        long j12 = (j5 * j7) + (j3 * j9) + (j * j11);
        long j13 = jArr2[6];
        long j14 = (j7 * j7) + (j5 * j9) + (j * j13) + ((j3 + j3) * j11);
        long j15 = jArr2[7];
        long j16 = (j7 * j9) + (j5 * j11) + (j3 * j13) + (j * j15);
        long j17 = jArr2[8];
        long j18 = (j7 * j11) + (j3 * j15);
        long j19 = j18 + j18 + (j5 * j13) + (j * j17);
        long j20 = j19 + j19 + (j9 * j9);
        long j21 = jArr2[9];
        long j22 = (j9 * j11) + (j7 * j13) + (j5 * j15) + (j3 * j17) + (j * j21);
        long j23 = (j3 * j21) + (j7 * j15);
        long j24 = j23 + j23 + (j11 * j11) + (j9 * j13) + (j5 * j17);
        long j25 = (j11 * j13) + (j9 * j15) + (j7 * j17) + (j5 * j21);
        long j26 = (j7 * j21) + (j11 * j15);
        long j27 = j26 + j26 + (j9 * j17);
        long j28 = j27 + j27 + (j13 * j13);
        long j29 = (j13 * j15) + (j11 * j17) + (j9 * j21);
        long j30 = (j15 * j15) + (j13 * j17) + ((j11 + j11) * j21);
        long j31 = (j13 * j21) + (j15 * j17);
        x(new long[]{j2, j4, j6 + j6, j8 + j8, j10, j12 + j12, j14 + j14, j16 + j16, j20, j22 + j22, j24 + j24, j25 + j25, j28, j29 + j29, j30 + j30, j31 + j31, (j15 * 4 * j21) + (j17 * j17), (j17 + j17) * j21, (j21 + j21) * j21}, jArr);
    }

    public static long[] B(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i = 0; i < 10; i++) {
            int i2 = a[i];
            int i3 = bArr[i2] & 255;
            int i4 = bArr[i2 + 1] & 255;
            long j = ((long) i3) | (((long) i4) << 8);
            jArr[i] = (((j | (((long) (bArr[i2 + 2] & 255)) << 16)) | (((long) (bArr[i2 + 3] & 255)) << 24)) >> b[i]) & ((long) c[i & 1]);
        }
        return jArr;
    }

    public static byte[] C(long[] jArr) {
        long j;
        int[] iArr;
        int i;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i2 = 0;
        int i3 = 0;
        while (true) {
            j = 19;
            iArr = d;
            if (i3 >= 2) {
                break;
            }
            int i4 = 0;
            while (i4 < 9) {
                long j2 = jArrCopyOf[i4];
                int i5 = iArr[i4 & 1];
                int i6 = -((int) (((j2 >> 31) & j2) >> i5));
                jArrCopyOf[i4] = j2 + ((long) (i6 << i5));
                i4++;
                jArrCopyOf[i4] = jArrCopyOf[i4] - ((long) i6);
            }
            long j3 = jArrCopyOf[9];
            int i7 = -((int) (((j3 >> 31) & j3) >> 25));
            jArrCopyOf[9] = j3 + ((long) (i7 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i7) * 19);
            i3++;
        }
        long j4 = jArrCopyOf[0];
        int i8 = -((int) (((j4 >> 31) & j4) >> 26));
        jArrCopyOf[0] = j4 + ((long) (i8 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i8);
        int i9 = 0;
        while (true) {
            iArr2 = c;
            if (i9 >= 2) {
                break;
            }
            int i10 = i2;
            while (i10 < 9) {
                long j5 = jArrCopyOf[i10];
                int i11 = i10 & 1;
                int i12 = i2;
                long j6 = j5 >> iArr[i11];
                jArrCopyOf[i10] = ((long) iArr2[i11]) & j5;
                i10++;
                jArrCopyOf[i10] = jArrCopyOf[i10] + ((long) ((int) j6));
                i2 = i12;
                i9 = i9;
                j = j;
            }
            i9++;
        }
        int i13 = i2;
        long j7 = jArrCopyOf[9];
        jArrCopyOf[9] = j7 & 33554431;
        long j8 = (((long) ((int) (j7 >> 25))) * j) + jArrCopyOf[i13];
        jArrCopyOf[i13] = j8;
        int i14 = ~((((int) j8) - 67108845) >> 31);
        for (int i15 = 1; i15 < 10; i15++) {
            int i16 = ~(((int) jArrCopyOf[i15]) ^ iArr2[i15 & 1]);
            int i17 = i16 & (i16 << 16);
            int i18 = i17 & (i17 << 8);
            int i19 = i18 & (i18 << 4);
            int i20 = i19 & (i19 << 2);
            i14 &= (i20 & (i20 + i20)) >> 31;
        }
        jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) (67108845 & i14));
        long j9 = 33554431 & i14;
        jArrCopyOf[1] = jArrCopyOf[1] - j9;
        for (i = 2; i < 10; i += 2) {
            jArrCopyOf[i] = jArrCopyOf[i] - ((long) (67108863 & i14));
            int i21 = i + 1;
            jArrCopyOf[i21] = jArrCopyOf[i21] - j9;
        }
        for (int i22 = i13; i22 < 10; i22++) {
            jArrCopyOf[i22] = jArrCopyOf[i22] << b[i22];
        }
        byte[] bArr = new byte[32];
        for (int i23 = i13; i23 < 10; i23++) {
            int i24 = a[i23];
            long j10 = bArr[i24];
            long j11 = jArrCopyOf[i23];
            bArr[i24] = (byte) (j10 | (j11 & 255));
            int i25 = i24 + 1;
            bArr[i25] = (byte) (((long) bArr[i25]) | ((j11 >> 8) & 255));
            int i26 = i24 + 2;
            bArr[i26] = (byte) (((long) bArr[i26]) | ((j11 >> 16) & 255));
            int i27 = i24 + 3;
            bArr[i27] = (byte) (((long) bArr[i27]) | ((j11 >> 24) & 255));
        }
        return bArr;
    }

    public static final void a(String str, Uri uri, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1160098078);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(uri) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            String strO0 = cwl1.o0(x340Var, 2131958343);
            cr31 cr31VarC = er31.c(12.0f, 2.0f, 12.0f, 12.0f);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var4, 1.0f);
            jw31 jw31VarA = ew31.a(h36.b, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            int i3 = i2 & 896;
            boolean z2 = i3 == 256;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new f110(function0, (byte) 3);
                x340Var.s0(objT);
            }
            qim0 qim0VarB = f8d1.b(qim0Var4, function0, (PointerInputEventHandler) objT);
            boolean zG = x340Var.g(strO0) | (i3 == 256);
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = new f0n(strO0, function0, (byte) 4);
                x340Var.s0(objT2);
            }
            qim0 qim0VarB2 = s161.b(qim0VarB, true, (iu30) objT2);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF2 = dug.f(qim0VarB2, cbx.a(x340Var).a.b.a(), cr31VarC);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (uri != null) {
                x340Var.i0(139585232);
                l(uri, str, cr31VarC, x340Var, ((i2 >> 3) & 14) | ((i2 << 3) & 112));
                x340Var.r(false);
                qim0Var3 = qim0Var4;
            } else {
                x340Var.i0(139705698);
                lee1 lee1Var = cbx.d(x340Var).g;
                long j = cbx.a(x340Var).b.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                uwo1.e(str, uyn1.x(qim0Var4, 12.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2032);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bvd1(i, str, uri, function0, qim0Var2, (byte) 21);
        }
    }

    public static final void b(String str, String str2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1106068873);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = bb00.h(0, x340Var);
            }
            err0 err0Var = (hdn0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = bb00.h(0, x340Var);
            }
            err0 err0Var2 = (hdn0) objT2;
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean z = x340Var.k(t4k.n) == flb0.b;
            boolean zH = ((i2 & 14) == 4) | x340Var.h(z);
            Object objT3 = x340Var.T();
            if (zH || objT3 == obj) {
                ye5 ye5Var = new ye5();
                if (z) {
                    ye5Var.g("\u2067");
                }
                ye5Var.g(str);
                if (z) {
                    ye5Var.g("\u2069");
                }
                ye5Var.g(" ");
                z6p1.r(ye5Var, "aiPersonaBadge", "�");
                objT3 = ye5Var.p();
                x340Var.s0(objT3);
            }
            af5 af5Var = (af5) objT3;
            err0 err0Var3 = err0Var;
            int iS = err0Var3.s();
            err0 err0Var4 = err0Var2;
            boolean zE = ((i2 & 112) == 32) | x340Var.e(err0Var4.s()) | x340Var.e(iS) | x340Var.g(watVar);
            Object objT4 = x340Var.T();
            if (zE || objT4 == obj) {
                objT4 = (err0Var3.s() <= 0 || err0Var4.s() <= 0) ? dqs0.e : mqo1.t(new mmr0("aiPersonaBadge", new gh80(new d6t0(4, watVar.s(watVar.M0(err0Var3.s())), watVar.s(watVar.M0(err0Var4.s()))), new j2i(85502356, new kaf(str2, (byte) 20), true))));
                x340Var.s0(objT4);
            }
            cqs0 cqs0Var = (cqs0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = new g2(err0Var, err0Var2, (byte) 2);
                x340Var.s0(objT5);
            }
            gfh0 gfh0Var = (gfh0) objT5;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            suo1.f(str2, 2, null, 2, x340Var, ((i2 >> 3) & 14) | 24624, 12);
            uwr uwrVar = cbx.a;
            uwo1.f(af5Var, null, cbx.d(x340Var).e, null, null, null, 2, false, new cjc0(2), 0, null, cqs0Var, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 5, i, str, str2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(c380 c380Var, int i, boolean z, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        x340 x340Var;
        qim0 qim0Var2;
        long j;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2091754170);
        int i4 = 2;
        int i5 = i2 | (x340Var2.g(c380Var) ? 4 : 2) | (x340Var2.e(l1d.C(i)) ? 32 : 16) | (x340Var2.h(z) ? 256 : 128) | (x340Var2.i(iu30Var) ? 2048 : 1024) | 24576;
        boolean z2 = false;
        byte b2 = 1;
        if (x340Var2.Y(i5 & 1, (i5 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarW = u291.w(sgc1.H(2, qim0Var3), 166.0f, 280.0f);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var2).a.a.c();
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarF = dug.f(qim0VarW, jC, er31.b(16.0f));
            cvx cvxVar = cbx.b(x340Var2).b;
            float f = 0.0f;
            qim0 qim0VarZ = uyn1.z(0.0f, 6.0f, 1, qim0VarF);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            Iterator itN = kk0.n(x340Var2, qim0VarE, y580.Y, -627373164, c380Var);
            while (itN.hasNext()) {
                m5f m5fVar = (m5f) itN.next();
                boolean z3 = (m5fVar != m5f.b || i == i4) ? b2 : z2;
                if (z3 != 0) {
                    x340Var2.i0(-921119296);
                    uwr uwrVar2 = cbx.a;
                    j = cbx.a(x340Var2).b.a;
                } else {
                    x340Var2.i0(-921118141);
                    uwr uwrVar3 = cbx.a;
                    j = cbx.a(x340Var2).c.b;
                }
                x340Var2.r(z2);
                int iOrdinal = m5fVar.ordinal();
                if (iOrdinal == 0) {
                    i3 = 2131953555;
                } else if (iOrdinal == b2) {
                    i3 = z ? 2131953554 : 2131953553;
                } else if (iOrdinal == i4) {
                    i3 = 2131953552;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    i3 = 2131953551;
                }
                String strO0 = cwl1.o0(x340Var2, i3);
                uvx uvxVar = new uvx((pgx) null, 1, (tvx) null, (p3v) null, 27);
                qim0 qim0VarB = u291.b(f, 44.0f, b2, u291.f(qim0Var3, 1.0f));
                boolean zH = x340Var2.h(z3);
                Object objT = x340Var2.T();
                Object obj = objT;
                if (zH || objT == m4cVar) {
                    gy gyVar = new gy((byte) 7, z3);
                    x340Var2.s0(gyVar);
                    obj = gyVar;
                }
                qim0 qim0VarB2 = s161.b(qim0VarB, false, (iu30) obj);
                int i6 = (x340Var2.e(m5fVar.ordinal()) ? 1 : 0) | ((i5 & 7168) == 2048 ? b2 : (byte) 0);
                Object objT2 = x340Var2.T();
                Object obj2 = objT2;
                if (i6 != 0 || objT2 == m4cVar) {
                    z77 z77Var = new z77(iu30Var, m5fVar, (byte) 5);
                    x340Var2.s0(z77Var);
                    obj2 = z77Var;
                }
                Function0 function0 = (Function0) obj2;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340 x340Var3 = x340Var2;
                jto1.b(qim0VarB2, uvxVar, null, false, null, null, new gbx(new y50(strO0), function0), null, apo.r(-1064770042, new gv6(m5fVar, j, b2), x340Var2), null, null, null, null, null, null, apo.r(-1347047744, new la0(b2, j, strO0), x340Var2), x340Var3, 100663360, 196608, 32444);
                i5 = i5;
                z2 = false;
                x340Var2 = x340Var3;
                qim0Var3 = qim0Var3;
                f = 0.0f;
                i4 = 2;
                b2 = 1;
            }
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
            x340Var.r(z2);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mk7(c380Var, i, z, iu30Var, qim0Var2, i2);
        }
    }

    public static final void d(m5f m5fVar, long j, b0k b0kVar, int i) {
        lnx lnxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(97196354);
        int i2 = i | (x340Var.e(m5fVar.ordinal()) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, 24.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarR);
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
            qim0 qim0VarR2 = u291.r(nim0Var, 18.0f);
            m5f m5fVar2 = m5f.c;
            isl islVar = isl.a;
            if (m5fVar == m5fVar2) {
                x340Var.i0(-589432903);
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = c97.b(0.0f);
                    x340Var.s0(objT);
                }
                o95 o95Var = (o95) objT;
                boolean zI = x340Var.i(o95Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new b(o95Var, (lnm) null, (byte) 1);
                    x340Var.s0(objT2);
                }
                qxd0.t(rih1.a, x340Var, (vu30) objT2);
                float fFloatValue = ((Number) o95Var.e()).floatValue();
                boolean zD = x340Var.d(fFloatValue);
                Object objT3 = x340Var.T();
                if (zD || objT3 == m4cVar) {
                    objT3 = new jc5((byte) 4, fFloatValue);
                    x340Var.s0(objT3);
                }
                w0h1.a(btx.c, islVar, i541.C(qim0VarR2, (iu30) objT3), j, 0L, true, x340Var, 196656 | btx.d | ((i2 << 6) & 7168), 16);
                x340Var.r(false);
            } else {
                x340Var.i0(-589136326);
                int iOrdinal = m5fVar.ordinal();
                if (iOrdinal == 0) {
                    lnxVar = grx.c;
                } else if (iOrdinal == 1) {
                    lnxVar = box.c;
                } else if (iOrdinal == 2) {
                    lnxVar = btx.c;
                } else {
                    if (iOrdinal != 3) {
                        eg.o();
                        return;
                    }
                    lnxVar = lnx.c;
                }
                w0h1.a(lnxVar, islVar, qim0VarR2, j, 0L, false, x340Var, 440 | ((i2 << 6) & 7168), 48);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk7(m5fVar, j, i, (byte) 0);
        }
    }

    public static final void e(c380 c380Var, int i, boolean z, iu30 iu30Var, Function0 function0, b0k b0kVar, int i2) {
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2032340017);
        int i3 = i2 | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.e(l1d.C(i)) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(iu30Var) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            wat watVar = (wat) x340Var.k(t4k.h);
            boolean zG = x340Var.g(watVar);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new rk7(watVar);
                x340Var.s0(objT);
            }
            rk7 rk7Var = (rk7) objT;
            x340Var.i0(-1131350578);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            int iI0 = watVar.i0(16.0f);
            x340Var.r(false);
            Object objT2 = x340Var.T();
            Object obj2 = objT2;
            if (objT2 == obj) {
                zen0 zen0Var = new zen0(Boolean.FALSE);
                zen0Var.w1(Boolean.TRUE);
                x340Var.s0(zen0Var);
                obj2 = zen0Var;
            }
            sy4.a(rk7Var, function0, new nfv0(24, true, true, true), apo.r(-1962439981, new pk7((zen0) obj2, iI0, c380Var, i, z, iu30Var), x340Var), x340Var, ((i3 >> 9) & 112) | 3456, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qk7(c380Var, i, z, iu30Var, function0, i2);
        }
    }

    public static final void f(phx phxVar, hcx hcxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(271291566);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(phxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(hcxVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            bmq0.a(Uri.parse(phxVar.a), qim0Var, hcxVar, phxVar.b, phxVar.c, phxVar.d, 0L, false, x340Var, ((i2 >> 3) & 112) | ((i2 << 3) & 896), 192);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x8t(phxVar, hcxVar, qim0Var, i, (byte) 22);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(dis0 dis0Var, iu30 iu30Var, Function0 function0, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-797157394);
        int i2 = i | (x340Var.g(dis0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = dis0Var instanceof ais0;
            nim0 nim0Var = nim0.a;
            z50 z50Var = z50.c;
            if (z) {
                x340Var.i0(-1241484203);
                qim0 qim0VarN = anm1.N("people-bottom-sheet-entity-row", nim0Var);
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT = x340Var.T();
                if (z2 || objT == m4cVar) {
                    objT = new whs0(iu30Var, dis0Var, (byte) 0);
                    x340Var.s0(objT);
                }
                jto1.b(qim0VarN, null, null, false, null, null, new gbx(z50Var, (Function0) objT), null, null, apo.r(22552527, new xhs0(dis0Var, (byte) 0), x340Var), null, null, apo.r(1091231501, new oa5(function0, (byte) 16), x340Var), null, null, apo.r(1821842090, new xhs0(dis0Var, (byte) 1), x340Var), x340Var, 805306368, 196992, 28094);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                if (!(dis0Var instanceof cis0)) {
                    throw p3d1.k(x340Var, -1564069290, false);
                }
                x340Var.i0(-1240156690);
                qim0 qim0VarN2 = anm1.N("people-bottom-sheet-entity-row", nim0Var);
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new whs0(iu30Var, dis0Var, (byte) 1);
                    x340Var.s0(objT2);
                }
                jto1.b(qim0VarN2, null, null, false, null, null, new gbx(z50Var, (Function0) objT2), null, null, apo.r(1450649912, new xhs0(dis0Var, (byte) 2), x340Var), null, apo.r(-156731177, new xhs0(dis0Var, (byte) 3), x340Var), apo.r(1953960182, new oa5(function0, (byte) 17), x340Var), null, null, apo.r(-303900333, new xhs0(dis0Var, (byte) 4), x340Var), x340Var, 805306368, 197040, 26046);
                x340Var = x340Var;
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tbs0(dis0Var, iu30Var, function0, i, (byte) 2);
        }
    }

    public static final void h(lis0 lis0Var, boolean z, iu30 iu30Var, Function0 function0, vu30 vu30Var, Function0 function1, Function0 function2, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1816639307);
        int i2 = i | (b0kVar3.g(lis0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | (b0kVar3.i(function0) ? 2048 : 1024) | (b0kVar3.i(vu30Var) ? 16384 : 8192) | (b0kVar3.i(function1) ? 131072 : 65536) | (b0kVar3.i(function2) ? 1048576 : 524288) | 12582912;
        if (b0kVar3.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            boolean z2 = (458752 & i2) == 131072;
            Object objT = b0kVar3.T();
            if (z2 || objT == fkj0.X) {
                objT = new yhs0(function1);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            x74.f(function2, (scx) null, (mfx) objT, false, false, 0.0f, false, (Boolean) null, false, false, (vu30) null, apo.r(1659488138, new hh1(lis0Var, iu30Var, function0, z, vu30Var), b0kVar3), b0kVar2, (i2 >> 18) & 14, 48, 2042);
            qim0Var2 = nim0.a;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q3(lis0Var, z, iu30Var, function0, vu30Var, function1, function2, qim0Var2, i);
        }
    }

    public static final void i(kis0 kis0Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        Function0 function1;
        j2i j2iVarR;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1072996251);
        int i2 = i | (b0kVar3.g(kis0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128);
        byte b2 = 0;
        byte b3 = 1;
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(b0kVar3, 2131963620);
            String strO1 = cwl1.o0(b0kVar3, 2131961198);
            String str = kis0Var.d;
            boolean z2 = kis0Var.e;
            qim0 qim0VarN = anm1.N(String.format("people-bottom-sheet-person-row-%s", Arrays.copyOf(new Object[]{str}, 1)), nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0VarN);
            gbx gbxVar = null;
            if (z2) {
                function1 = function0;
                b0kVar3.i0(-1808422799);
                b0kVar3.r(false);
                j2iVarR = null;
            } else {
                b0kVar3.i0(-1809466352);
                pa5 pa5Var = new pa5(z, strO1, function0, strO0, (byte) 1);
                function1 = function0;
                j2iVarR = apo.r(-148401066, pa5Var, b0kVar3);
                b0kVar3.r(false);
            }
            if (z2) {
                b0kVar3.i0(-1808280943);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-1808357730);
                boolean z3 = (i2 & 896) == 256;
                Object objT = b0kVar3.T();
                if (z3 || objT == fkj0.X) {
                    objT = new isr0(function1, (byte) 14);
                    b0kVar3.s0(objT);
                }
                Function0 function2 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    gbxVar = new gbx(new y50(strO0), function2);
                    b0kVar3.r(false);
                }
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarZ, null, null, false, null, null, gbxVar, null, null, apo.r(-2129757756, new zhs0(kis0Var, b2), b0kVar3), null, null, j2iVarR, null, null, apo.r(1574682591, new zhs0(kis0Var, b3), b0kVar3), b0kVar2, 805306368, 196608, 28094);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new r7e0((Object) kis0Var, z, (Object) function0, i, (byte) 12);
        }
    }

    public static final void j(j701 j701Var, mbl1 mbl1Var, edl1 edl1Var, ezj ezjVar, fza fzaVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0VarThen;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(745338313);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(j701Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(mbl1Var) : x340Var.i(mbl1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(edl1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(ezjVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(fzaVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.h(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(qim0Var) ? 1048576 : 524288;
        }
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            Integer num = j701Var.d;
            if (num != null) {
                qim0VarThen = qim0Var.then(dug.f(nim0.a, z4p1.e(num.intValue()), d4o1.a));
            } else {
                qim0VarThen = qim0Var;
            }
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT;
            x340Var.j0(-492369756);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT2;
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT3);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT5;
            who1.h(s161.b(qim0VarThen, false, new tu(ufh0Var, (byte) 17)), apo.i(x340Var, -1488813576, new qw1(ven0Var2, xhlVar, new su(ven0Var, nilVar, (byte) 13), z, fzaVar, edl1Var, j701Var, ezjVar, mbl1Var)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 13), x340Var, 48);
            x340Var.r(false);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lv1((byte) 9, i, (Object) j701Var, (Object) mbl1Var, (Object) edl1Var, (Object) ezjVar, (Object) fzaVar, (Object) qim0Var, z);
        }
    }

    public static final void k(String str, String str2, ResultReceiver resultReceiver, List list, vxe1 vxe1Var, kly0 kly0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1801212133);
        String str3 = str;
        ResultReceiver resultReceiver2 = resultReceiver;
        kly0 kly0Var2 = kly0Var;
        int i2 = i | (x340Var.g(str3) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.i(resultReceiver2) ? 256 : 128) | (x340Var.i(list) ? 2048 : 1024) | (x340Var.i(vxe1Var) ? 16384 : 8192) | (x340Var.i(kly0Var2) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            rxe1 rxe1VarN = d4o1.n(str2, vxe1Var, x340Var, ((i2 >> 9) & 112) | ((i2 >> 3) & 14));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, nim0.a);
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
            x340Var.i0(-403270631);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                jtc1 jtc1Var = (jtc1) obj;
                x340Var.f0(900345730, jtc1Var.a);
                Integer numValueOf = Integer.valueOf(i3);
                boolean zE = x340Var.e(i3);
                Object objT = x340Var.T();
                if (zE || objT == fkj0.X) {
                    objT = new sl11(i3, (byte) 12);
                    x340Var.s0(objT);
                }
                dgo1.c(numValueOf, (iu30) objT, apo.r(-953534426, new wnx0(str3, rxe1VarN, jtc1Var, resultReceiver2, kly0Var2, (byte) 24), x340Var), x340Var, 384);
                x340Var.r(false);
                str3 = str;
                resultReceiver2 = resultReceiver;
                kly0Var2 = kly0Var;
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wyy0(str, str2, resultReceiver, list, vxe1Var, kly0Var, i, (byte) 14);
        }
    }

    public static final void l(Uri uri, String str, cr31 cr31Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1605640878);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(uri) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(cr31Var) : x340Var.i(cr31Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            boolean zI = ((i2 & 14) == 4) | x340Var.i(context);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new fj80(context, uri, (lnm) null, (byte) 1);
                x340Var.s0(objT);
            }
            ven0 ven0VarP = yto.p(null, uri, (vu30) objT, x340Var, ((i2 << 3) & 112) | 6);
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
            Bitmap bitmap = (Bitmap) ven0VarP.getValue();
            if (bitmap != null) {
                x340Var.i0(-605280971);
                cwl1.g(new yk4(bitmap), cwl1.o0(x340Var, 2131958344), i1p1.q(u291.x(0.0f, 200.0f, 1, nim0Var), cr31Var), mif1.S0, 0, x340Var, 0, 232);
                x340Var.r(false);
            } else {
                x340Var.i0(-605020354);
                x340Var.r(false);
            }
            if (ihc1.y0(str)) {
                x340Var.i0(-604778306);
                x340Var.r(false);
            } else {
                x340Var.i0(-604978380);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).g;
                long j = cbx.a(x340Var).b.a;
                cvx cvxVar = cbx.b(x340Var).b;
                uwo1.e(str, uyn1.x(nim0Var, 12.0f), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
                x340Var = x340Var;
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(uri, str, cr31Var, i, (byte) 28);
        }
    }

    public static final void m(String str, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-485037656);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2);
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar3).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            if (((x340) b0kVar3).S) {
                b0kVar3.l(hmb0.t1);
            } else {
                b0kVar3.v0();
            }
            nko1.H(jw31VarA, b0kVar3, y580.O0);
            nko1.H(xos0VarM, b0kVar3, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
            nko1.F(b0kVar3);
            nko1.H(qim0VarE, b0kVar3, y580.Y);
            uwr uwrVar = cbx.a;
            b0kVar2 = b0kVar3;
            uwo1.e(str, null, cbx.d(b0kVar3).e, 0L, null, null, 2, false, new cjc0(2), 0, null, b0kVar2, i2 & 14, 0, 1722);
            cvx cvxVar = cbx.b(b0kVar2).b;
            op71.g(b0kVar2, u291.v(nim0Var, 4.0f));
            zov0 zov0Var = cbx.b(b0kVar2).g;
            w0h1.a(wtx.c, isl.a, u291.r(nim0Var, 16.0f), ((wex) ((gmt) zex.a.c).c).b, 0L, true, b0kVar2, wtx.d | 196656, 16);
            b0kVar2.r(true);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pji(str, i, (byte) 23);
        }
    }

    public static o17 n(String str, String str2) {
        int i;
        if (str.equals("spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ") || str.equals("spotify:collection:tracks") || str.equals("spotify:internal:collection:tracks") || (nhc1.Y(str, "spotify:user:", false) && nhc1.R(str, ":collection", false))) {
            i = 17;
        } else {
            Set set = s4b1.f;
            if (uic.g(str, blc0.g1)) {
                i = 1;
            } else if (uic.g(str, blc0.u1)) {
                i = 4;
            } else if (uic.g(str, blc0.T3)) {
                i = 6;
            } else if (uic.j(str, nyu0.e)) {
                i = 7;
            } else if (uic.g(str, blc0.Kf)) {
                i = 10;
            } else if (uic.h(str, new blc0[]{blc0.af, blc0.j1})) {
                i = 2;
            } else if (uic.h(str, new blc0[]{blc0.bf, blc0.M1})) {
                i = 5;
            } else if (uic.h(str, new blc0[]{blc0.df, blc0.Yc})) {
                i = 8;
            } else if (uic.h(str, new blc0[]{blc0.cf, blc0.ff, blc0.g7, blc0.wi})) {
                i = 11;
            } else if (uic.g(str, blc0.R3)) {
                i = 3;
            } else if (uic.g(str, blc0.r4) || uic.j(str, wyu0.f)) {
                i = 9;
            } else if (uic.h(str, new blc0[]{blc0.U3, blc0.a4, blc0.c4, blc0.d4, blc0.e4, blc0.f4, blc0.g4, blc0.i4, blc0.j4, blc0.k4, blc0.l4, blc0.m4, blc0.p4, blc0.u4, blc0.v4, blc0.y4, blc0.z4, blc0.A4, blc0.B4, blc0.C4, blc0.D4, blc0.S3})) {
                i = 12;
            } else if (uic.g(str, blc0.fh)) {
                i = 13;
            } else if (uic.h(str, new blc0[]{blc0.ld, blc0.Pg, blc0.Ug})) {
                i = 14;
            } else if (uic.j(str, bzu0.f)) {
                i = 15;
            } else if (uic.h(str, new blc0[]{blc0.ti, blc0.ui})) {
                i = 16;
            } else if (uic.g(str, blc0.ee)) {
                i = 18;
            } else if (uic.g(str, blc0.L7)) {
                i = 19;
            } else {
                i = uic.g(str, blc0.J2) ? 20 : 21;
            }
        }
        int iC = l1d.C(i);
        if (iC == 18) {
            return new h17(new g07(str2));
        }
        if (iC == 19) {
            return new y07(new g07(str2), false);
        }
        switch (iC) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new k07(new g07(str2), false);
            case 1:
                return new b17(new g07(str2));
            case 2:
                return new r07(new g07(str2));
            case 3:
                return new l07(new g07(str2), false);
            case 4:
                return new b17(new g07(str2));
            case 5:
                return new n07(new g07(str2));
            case 6:
                return new y07(new g07(str2), false);
            case 7:
                return new b17(new g07(str2));
            case 8:
                return new r07(new g07(str2));
            case 9:
                return new c17(new g07(str2));
            case 10:
                return new b17(new g07(str2));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new r07(new g07(str2));
            case grn1.d /* 12 */:
                return new t07(new g07(str2), false);
            case 13:
                return new t07(new g07(str2), false);
            case 14:
                return z07.a;
            default:
                return null;
        }
    }

    public static boolean o(Object obj, Set set) {
        if (set == obj) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set2 = (Set) obj;
        try {
            return set.size() == set2.size() && set.containsAll(set2);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    public static am61 p(Set set, omv0 omv0Var) {
        if (set instanceof SortedSet) {
            Collection collection = (SortedSet) set;
            if (!(collection instanceof am61)) {
                return new bm61(collection, omv0Var);
            }
            am61 am61Var = (am61) collection;
            return new bm61((SortedSet) am61Var.a, u890.e(am61Var.b, omv0Var));
        }
        if (!(set instanceof am61)) {
            set.getClass();
            return new am61(set, omv0Var);
        }
        am61 am61Var2 = (am61) set;
        return new am61((Set) am61Var2.a, u890.e(am61Var2.b, omv0Var));
    }

    public static int q(Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i = ~(~(i + (next != null ? next.hashCode() : 0)));
        }
        return i;
    }

    public static zl61 r(Set set, t380 t380Var) {
        dm5.s(set, "set1");
        dm5.s(t380Var, "set2");
        return new zl61(set, t380Var, (byte) 0);
    }

    public static final igi0 s(hgi0 hgi0Var, egi0 egi0Var) {
        Set set = egi0Var.b;
        String str = hgi0Var.a;
        ArrayList arrayList = hgi0Var.d;
        ArrayList<ggi0> arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            ggi0 ggi0Var = (ggi0) obj;
            String str2 = ggi0Var.d;
            String str3 = ggi0Var.c;
            if (rwq.l(str2, str3)) {
                str2 = str3;
            }
            if (!set.contains(str2)) {
                arrayList2.add(obj);
            }
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
        for (ggi0 ggi0Var2 : arrayList2) {
            arrayList3.add(new mey0(ggi0Var2.a, hgi0Var.b, ggi0Var2.d, ggi0Var2.c, (x360) null, (String) null, (n1x) null, (String) null, hgi0Var.g, 224));
        }
        return new igi0(str, arrayList3, hgi0Var.c, hgi0Var.e, hgi0Var.f);
    }

    public static final gs71 t(hs71 hs71Var, String str) {
        return hs71Var.a(new t4o(str, (byte) 2));
    }

    public static boolean u(Set set, Collection collection) {
        collection.getClass();
        if (collection instanceof q380) {
            collection = ((jg11) ((q380) collection)).l();
        }
        boolean zRemove = false;
        if (!(collection instanceof Set) || collection.size() <= set.size()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                zRemove |= set.remove(it.next());
            }
            return zRemove;
        }
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            if (collection.contains(it2.next())) {
                it2.remove();
                zRemove = true;
            }
        }
        return zRemove;
    }

    public static void v(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] + jArr3[i];
        }
    }

    public static void w(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i = 0; i < 10; i++) {
            jArr[i] = jArr2[i] - jArr3[i];
        }
    }

    public static void x(long[] jArr, long[] jArr2) {
        int length = jArr.length;
        if (length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, length);
            jArr = jArr3;
        }
        long j = jArr[8];
        long j2 = jArr[18];
        long j3 = j + (j2 << 4);
        jArr[8] = j3;
        long j4 = j2 + j2 + j3;
        jArr[8] = j4;
        jArr[8] = j4 + j2;
        long j5 = jArr[7];
        long j6 = jArr[17];
        long j7 = j5 + (j6 << 4);
        jArr[7] = j7;
        long j8 = j6 + j6 + j7;
        jArr[7] = j8;
        jArr[7] = j8 + j6;
        long j9 = jArr[6];
        long j10 = jArr[16];
        long j11 = j9 + (j10 << 4);
        jArr[6] = j11;
        long j12 = j10 + j10 + j11;
        jArr[6] = j12;
        jArr[6] = j12 + j10;
        long j13 = jArr[5];
        long j14 = jArr[15];
        long j15 = j13 + (j14 << 4);
        jArr[5] = j15;
        long j16 = j14 + j14 + j15;
        jArr[5] = j16;
        jArr[5] = j16 + j14;
        long j17 = jArr[4];
        long j18 = jArr[14];
        long j19 = j17 + (j18 << 4);
        jArr[4] = j19;
        long j20 = j18 + j18 + j19;
        jArr[4] = j20;
        jArr[4] = j20 + j18;
        long j21 = jArr[3];
        long j22 = jArr[13];
        long j23 = j21 + (j22 << 4);
        jArr[3] = j23;
        long j24 = j22 + j22 + j23;
        jArr[3] = j24;
        jArr[3] = j24 + j22;
        long j25 = jArr[2];
        long j26 = jArr[12];
        long j27 = j25 + (j26 << 4);
        jArr[2] = j27;
        long j28 = j26 + j26 + j27;
        jArr[2] = j28;
        jArr[2] = j28 + j26;
        long j29 = jArr[1];
        long j30 = jArr[11];
        long j31 = j29 + (j30 << 4);
        jArr[1] = j31;
        long j32 = j30 + j30 + j31;
        jArr[1] = j32;
        jArr[1] = j32 + j30;
        long j33 = jArr[0];
        long j34 = jArr[10];
        long j35 = j33 + (j34 << 4);
        jArr[0] = j35;
        long j36 = j34 + j34 + j35;
        jArr[0] = j36;
        jArr[0] = j36 + j34;
        y(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    public static void y(long[] jArr) {
        jArr[10] = 0;
        int i = 0;
        while (i < 10) {
            long j = jArr[i];
            long j2 = j / 67108864;
            jArr[i] = j - (j2 << 26);
            int i2 = i + 1;
            long j3 = jArr[i2] + j2;
            jArr[i2] = j3;
            long j4 = j3 / 33554432;
            jArr[i2] = j3 - (j4 << 25);
            i += 2;
            jArr[i] = jArr[i] + j4;
        }
        long j5 = jArr[0];
        long j6 = jArr[10];
        long j7 = j5 + (j6 << 4);
        jArr[0] = j7;
        long j8 = j6 + j6 + j7;
        jArr[0] = j8;
        long j9 = j8 + j6;
        jArr[0] = j9;
        jArr[10] = 0;
        long j10 = j9 / 67108864;
        jArr[0] = j9 - (j10 << 26);
        jArr[1] = jArr[1] + j10;
    }

    public static void z(long[] jArr, long[] jArr2, long[] jArr3) {
        long j = jArr2[0];
        long j2 = jArr3[0];
        long j3 = j * j2;
        long j4 = jArr3[1];
        long j5 = jArr2[1];
        long j6 = (j5 * j2) + (j * j4);
        long j7 = jArr3[2];
        long j8 = jArr2[2];
        long j9 = ((j5 + j5) * j4) + (j * j7) + (j8 * j2);
        long j10 = jArr3[3];
        long j11 = jArr2[3];
        long j12 = (j5 * j7) + (j8 * j4) + (j * j10) + (j11 * j2);
        long j13 = jArr3[4];
        long j14 = jArr2[4];
        long j15 = (j5 * j10) + (j11 * j4);
        long j16 = j15 + j15 + (j8 * j7) + (j * j13) + (j14 * j2);
        long j17 = jArr3[5];
        long j18 = jArr2[5];
        long j19 = (j8 * j10) + (j11 * j7) + (j5 * j13) + (j14 * j4) + (j * j17) + (j18 * j2);
        long j20 = jArr3[6];
        long j21 = jArr2[6];
        long j22 = (j11 * j10) + (j5 * j17) + (j18 * j4);
        long j23 = j22 + j22 + (j8 * j13) + (j14 * j7) + (j * j20) + (j21 * j2);
        long j24 = jArr3[7];
        long j25 = jArr2[7];
        long j26 = (j11 * j13) + (j14 * j10) + (j8 * j17) + (j18 * j7) + (j5 * j20) + (j21 * j4) + (j * j24) + (j25 * j2);
        long j27 = jArr3[8];
        long j28 = jArr2[8];
        long j29 = (j11 * j17) + (j18 * j10) + (j5 * j24) + (j25 * j4);
        long j30 = j29 + j29 + (j14 * j13) + (j8 * j20) + (j21 * j7) + (j * j27) + (j28 * j2);
        long j31 = jArr3[9];
        long j32 = jArr2[9];
        long j33 = (j14 * j17) + (j18 * j13) + (j11 * j20) + (j21 * j10) + (j8 * j24) + (j25 * j7) + (j5 * j27) + (j28 * j4) + (j * j31) + (j2 * j32);
        long j34 = (j18 * j17) + (j11 * j24) + (j25 * j10) + (j5 * j31) + (j4 * j32);
        long j35 = (j18 * j24) + (j25 * j17) + (j11 * j31) + (j10 * j32);
        long j36 = (j25 * j24) + (j18 * j31) + (j17 * j32);
        long j37 = (j25 * j27) + (j28 * j24) + (j21 * j31) + (j20 * j32);
        long j38 = (j24 * j32) + (j25 * j31);
        x(new long[]{j3, j6, j9, j12, j16, j19, j23, j26, j30, j33, j34 + j34 + (j14 * j20) + (j21 * j13) + (j8 * j27) + (j28 * j7), (j18 * j20) + (j21 * j17) + (j14 * j24) + (j25 * j13) + (j11 * j27) + (j28 * j10) + (j8 * j31) + (j7 * j32), j35 + j35 + (j21 * j20) + (j14 * j27) + (j28 * j13), (j21 * j24) + (j25 * j20) + (j18 * j27) + (j28 * j17) + (j14 * j31) + (j13 * j32), j36 + j36 + (j21 * j27) + (j28 * j20), j37, j38 + j38 + (j28 * j27), (j27 * j32) + (j28 * j31), (j32 + j32) * j31}, jArr);
    }
}
