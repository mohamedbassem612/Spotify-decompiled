package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.icu.text.DateFormat;
import android.net.Uri;
import android.os.Build;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontWeight;
import com.spotify.legacyglue.icons.SpotifyIconView;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableDistinctUntilChanged;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ioo1 {
    public static final Object a = new Object();
    public static s4l1 b;
    public static b180 c;

    public static final kig1 A(dok0 dok0Var) {
        return new kig1(dok0Var.g, dok0Var.h, dok0Var.f, dok0Var.i, dok0Var.j);
    }

    public static ken B() {
        return ken.h;
    }

    public static final int C(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MIN_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (i2 < i4) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static int D(int[] iArr) {
        int length = iArr.length;
        int i = -1;
        int i2 = Integer.MAX_VALUE;
        for (int i3 = 0; i3 < length; i3++) {
            int i4 = iArr[i3];
            if (-2147483647 <= i4 && i4 < i2) {
                i = i3;
                i2 = i4;
            }
        }
        return i;
    }

    public static final boolean E(crb crbVar) {
        if (crbVar instanceof zqb) {
            return false;
        }
        if (crbVar instanceof brb) {
            return ((brb) crbVar).c;
        }
        if (crbVar instanceof arb) {
            return ((arb) crbVar).b;
        }
        eg.o();
        return false;
    }

    public static final hob1 F(mey0 mey0Var, t810 t810Var, lai0 lai0Var, fza fzaVar, km3 km3Var, ytp0 ytp0Var) {
        String str;
        String str2 = mey0Var.d;
        zkm zkmVar = t810Var.b;
        nbw0 nbw0Var = lai0Var.a;
        yo60 yo60Var = lai0Var.b;
        jo70 jo70Var = lai0Var.c;
        zoy0 zoy0Var = lai0Var.d;
        xkk1 xkk1Var = lai0Var.e;
        prl prlVar = lai0Var.f;
        String str3 = nbw0Var.j;
        String str4 = nbw0Var.a;
        gab0 gab0Var = nbw0Var.m;
        int i = nbw0Var.l;
        String str5 = nbw0Var.f;
        er00 er00VarG = upo1.G(l8i0.a, nbw0Var, yo60Var, xkk1Var, "", fza.h(str3), t810Var.c, false, 128);
        wcm wcmVarP = bpo1.p(mey0Var.d, null, t810Var.g, t810Var.h, false, false, null, null, str4, t810Var.s, null, false, null, null, 62410);
        String str6 = mey0Var.a;
        boolean zS = p2o1.s(zkmVar, str2);
        boolean zV = p2o1.v(zkmVar, str2);
        String str7 = nbw0Var.e;
        boolean zV2 = upo1.v(t810Var, str5);
        x360 x360Var = mey0Var.e;
        mbw0 mbw0VarV = x360Var != null ? bpo1.v(x360Var) : null;
        lfi0 lfi0VarR = bpo1.r(nbw0Var, xkk1Var, null, ytp0Var, null, false, upo1.F(i), wcmVarP, null, null, true, false, t810Var.g, false, false, false, false, false, false, null, null, null, null, false, false, null, null, 134212372);
        yaw0 yaw0VarU = bpo1.u(512, mey0Var.a, mey0Var.d, gab0Var.a, f4i1.f(nbw0Var.p.a, " - ", str4), gab0Var.b, upo1.F(i), false, true, false, false);
        set0 set0VarS = bpo1.s(mey0Var.d, null, (494 & 4) != 0 ? false : false, null, false, (494 & 32) != 0 ? null : null, (494 & 64) != 0 ? null : null, (494 & 128) != 0 ? false : false, false);
        uho uhoVarQ = bpo1.q(str5, str2, str4);
        String str8 = jo70Var.a;
        if (zoy0Var != null) {
            str = ((DateFormat) ((idd1) km3Var.c).getValue()).format(Long.valueOf(zoy0Var.c * 1000));
        } else {
            str = null;
        }
        ch7 ch7Var = new ch7(str8, str);
        String str9 = mey0Var.b;
        String str10 = mey0Var.a;
        lsm0 lsm0VarR = bwp0.r(yo60Var, mey0Var.c, mey0Var.d, false, t810Var.c, false, prlVar != null ? prlVar.c : null);
        long j = t810Var.g ? 1000L : 0L;
        Long l = t810Var.u ? 3000L : null;
        boolean z = !t810Var.t;
        boolean z2 = t810Var.g;
        return new hob1(str6, str2, str2, str7, "", zV, zS, er00VarG, zV2, mbw0VarV, lfi0VarR, yaw0VarU, (xfn0) null, set0VarS, wcmVarP, uhoVarQ, (wiv0) null, (uiv0) null, (String) null, (Long) null, (iiv0) null, (v9n) null, (m9g1) null, ch7Var, new sbw0(str9, str10, lsm0VarR, j, z2 && (er00VarG instanceof cr00), false, z, l, 672), 0L, z2, false, (Integer) null, false, false, false, mey0Var.e, (m4m) null, (y2u0) null, false, (sq51) null, (String) null, (String) null, false, false, mey0Var.i, (c5v0) null, -92336128, 1534);
    }

    public static final int G(int[] iArr, long j) {
        int i = (int) (j & 4294967295L);
        int iMax = Integer.MIN_VALUE;
        for (int i2 = (int) (j >> 32); i2 < i; i2++) {
            iMax = Math.max(iMax, iArr[i2]);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:333:0x066c  */
    /* JADX WARN: Code duplicated, block: B:424:0x0859 A[LOOP:33: B:396:0x07df->B:424:0x0859, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:427:0x0870  */
    /* JADX WARN: Code duplicated, block: B:449:0x08c2  */
    /* JADX WARN: Code duplicated, block: B:451:0x08c8  */
    /* JADX WARN: Code duplicated, block: B:453:0x08ce A[LOOP:37: B:450:0x08c6->B:453:0x08ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:457:0x08dc  */
    /* JADX WARN: Code duplicated, block: B:495:0x09cf  */
    /* JADX WARN: Code duplicated, block: B:541:0x0b52  */
    /* JADX WARN: Code duplicated, block: B:630:0x0865 A[EDGE_INSN: B:630:0x0865->B:425:0x0865 BREAK  A[LOOP:33: B:396:0x07df->B:424:0x0859], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:638:0x08bc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:639:0x08d3 A[SYNTHETIC] */
    public static final yub0 H(vub0 vub0Var, int i, int[] iArr, int[] iArr2, boolean z) {
        long j;
        b7x b7xVar;
        boolean z2;
        n36[] n36VarArr;
        int iO0;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int[] iArr3;
        int i7;
        int[] iArr4;
        int i8;
        vub0 vub0Var2;
        int i9;
        int i10;
        boolean z3;
        long j2;
        int iG;
        int i11;
        int i12;
        int i13;
        int i14;
        ArrayList arrayList;
        int i15;
        int i16;
        boolean z4;
        int[] iArr5;
        int iZ;
        int[] iArr6;
        int length;
        int i17;
        int i18;
        List list;
        List list2;
        avb0 avb0Var;
        int i19;
        int iMin;
        List list3;
        Object obj;
        int i20;
        qub0 qub0Var;
        int iN;
        int[] iArr7;
        int i21;
        int i22;
        int[] iArrV;
        qub0 qub0Var2;
        int[] iArrV2;
        vub0Var = vub0Var;
        dvb0 dvb0Var = vub0Var.d;
        isb0 isb0Var = vub0Var.g;
        tlc1 tlc1Var = isb0Var.b;
        edn0 edn0Var = vub0Var.b;
        int i23 = vub0Var.k;
        int i24 = vub0Var.l;
        List list4 = vub0Var.o;
        boolean z5 = vub0Var.f;
        fvb0 fvb0Var = vub0Var.a;
        int i25 = vub0Var.s;
        int i26 = vub0Var.h;
        int i27 = vub0Var.j;
        uub0 uub0Var = vub0Var.q;
        isb0 isb0Var2 = isb0Var;
        long j3 = vub0Var.e;
        mgc mgcVar = vub0Var.r;
        List list5 = list4;
        qub0 qub0Var3 = vub0Var.c;
        dvb0 dvb0Var2 = dvb0Var;
        int iA = qub0Var3.a();
        pub0 pub0Var = qub0Var3.b;
        b7x b7xVar2 = b7x.a;
        ArrayList arrayList2 = z6x.a;
        if (iA <= 0 || i25 == 0) {
            int iK = hjl.k(j3);
            int iJ = hjl.j(j3);
            fvb0Var.t.d(0, iK, iJ, new ArrayList(), uub0Var.d.c, vub0Var.q, vub0Var.f, tlc1Var.W(), vub0Var.s, vub0Var.n, 0, 0, vub0Var.m, vub0Var.f36p);
            if (tlc1Var.W()) {
                j = j3;
            } else {
                long jB = fvb0Var.t.b();
                if (yr80.b(jB, 0L)) {
                    j = j3;
                } else {
                    j = j3;
                    iK = jjl.g((int) (jB >> 32), j);
                    iJ = jjl.f((int) (jB & 4294967295L), j);
                }
            }
            hfh0 hfh0VarS = isb0Var2.S(iK, iJ, b7xVar2, new pv40((byte) 21));
            boolean z6 = vub0Var.f;
            long j4 = (((long) hjl.j(j)) & 4294967295L) | (((long) hjl.k(j)) << 32);
            int i28 = vub0Var.j;
            int i29 = vub0Var.k;
            return new yub0(iArr, iArr2, 0.0f, hfh0VarS, 0.0f, false, z6, false, vub0Var.d, pub0Var.d, isb0Var2, iA, arrayList2, j4, -i28, i26 + i29, i28, i29, vub0Var.l, vub0Var.m);
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
        int[] iArrCopyOf2 = Arrays.copyOf(iArr2, iArr2.length);
        int length2 = iArrCopyOf.length - 1;
        if (length2 >= 0) {
            while (true) {
                int i30 = length2 - 1;
                while (true) {
                    int i31 = iArrCopyOf[length2];
                    if (i31 < iA && mgcVar.f(i31, length2)) {
                        break;
                    }
                    b7x b7xVar3 = b7xVar2;
                    fvb0 fvb0Var2 = fvb0Var;
                    iArrCopyOf[length2] = mgcVar.n(iArrCopyOf[length2], length2);
                    b7xVar2 = b7xVar3;
                    fvb0Var = fvb0Var2;
                }
                int i32 = iArrCopyOf[length2];
                b7xVar = b7xVar2;
                if (i32 >= 0 && !qub0Var3.b.d.f(i32)) {
                    if (mgcVar.z(i32) == -2) {
                        int length3 = iArrCopyOf.length;
                        int i33 = 0;
                        while (true) {
                            if (i33 >= length3) {
                                i33 = -1;
                                break;
                            }
                            int i34 = length3;
                            if (iArrCopyOf[i33] == i32) {
                                break;
                            }
                            i33++;
                            length3 = i34;
                        }
                        int i35 = i33 + 1;
                        int i36 = i33;
                        if (i35 <= length2) {
                            while (true) {
                                if (iArrCopyOf[i35] == i32) {
                                    iArrCopyOf[i35] = mgcVar.n(i32, i35);
                                }
                                if (i35 == length2) {
                                    break;
                                }
                                i35++;
                            }
                        }
                        length2 = i36;
                    }
                    mgcVar.R(i32, length2);
                }
                if (i30 < 0) {
                    break;
                }
                length2 = i30;
                b7xVar2 = b7xVar;
                fvb0Var = fvb0Var;
            }
        } else {
            b7xVar = b7xVar2;
            fvb0Var = fvb0Var;
        }
        J(-i, iArrCopyOf2);
        n36[] n36VarArr2 = new n36[i25];
        for (int i37 = 0; i37 < i25; i37++) {
            n36VarArr2[i37] = new n36(16);
        }
        int i38 = -i27;
        J(i38, iArrCopyOf2);
        boolean z7 = false;
        loop5: while (true) {
            int length4 = iArrCopyOf.length;
            int i39 = 0;
            while (true) {
                z2 = z7;
                if (i39 >= length4) {
                    n36VarArr = n36VarArr2;
                    iO0 = -1;
                    break loop5;
                }
                int i40 = iArrCopyOf[i39];
                int i41 = i39;
                n36VarArr = n36VarArr2;
                if (iArrCopyOf2[i39] >= Math.max(-i24, 0) || i40 <= 0) {
                    i39 = i41 + 1;
                    z7 = z2;
                    iA = iA;
                    n36VarArr2 = n36VarArr;
                    qub0Var3 = qub0Var3;
                    i24 = i24;
                }
            }
            iO0 = C(iArrCopyOf);
            int i42 = iArrCopyOf[iO0];
            int length5 = iArrCopyOf2.length;
            int i43 = 0;
            while (i43 < length5) {
                int i44 = length5;
                int i45 = i43;
                if (iArrCopyOf[i43] != iArrCopyOf[iO0]) {
                    int i46 = iArrCopyOf2[i45];
                    int i47 = iArrCopyOf2[iO0];
                    if (i46 < i47) {
                        iArrCopyOf2[i45] = i47;
                    }
                }
                i43 = i45 + 1;
                length5 = i44;
            }
            int iN2 = mgcVar.n(i42, iO0);
            if (iN2 < 0) {
                break;
            }
            int i48 = iA;
            long jA = vub0Var.a(qub0Var3, iN2, iO0);
            int i49 = i24;
            qub0 qub0Var4 = qub0Var3;
            int i50 = (int) (jA & 4294967295L);
            int i51 = (int) (jA >> 32);
            int i52 = i50 - i51;
            mgcVar.R(iN2, i52 != 1 ? -2 : i51);
            avb0 avb0VarV1 = uub0Var.v1(iN2, jA);
            int iG2 = G(iArrCopyOf2, jA);
            int[] iArrV3 = i52 != 1 ? mgcVar.v(iN2) : null;
            boolean z8 = z2;
            while (i51 < i50) {
                iArrCopyOf[i51] = iN2;
                int iN3 = avb0VarV1.n() + iG2 + (iArrV3 == null ? 0 : iArrV3[i51]);
                iArrCopyOf2[i51] = iN3;
                if (i26 + iN3 <= 0) {
                    z8 = true;
                }
                i51++;
            }
            z7 = z8;
            iA = i48;
            n36VarArr2 = n36VarArr;
            qub0Var3 = qub0Var4;
            i24 = i49;
        }
        int i53 = iA;
        int i54 = i24;
        qub0 qub0Var5 = qub0Var3;
        int i55 = iArrCopyOf2[0];
        if (i55 < i38) {
            int i56 = i38 - i55;
            J(i56, iArrCopyOf2);
            i2 = i - i56;
        } else {
            i2 = i;
        }
        J(i27, iArrCopyOf2);
        int i57 = -1;
        if (iO0 == -1) {
            iO0 = f46.o0(0, iArrCopyOf);
        }
        if (iO0 != -1 && I(iArrCopyOf, vub0Var, iArrCopyOf2, iO0) && z) {
            mgcVar.M();
            int length6 = iArrCopyOf.length;
            int[] iArr8 = new int[length6];
            int i58 = 0;
            while (i58 < length6) {
                iArr8[i58] = i57;
                i58++;
                i57 = -1;
            }
            int length7 = iArrCopyOf2.length;
            int[] iArr9 = new int[length7];
            for (int i59 = 0; i59 < length7; i59++) {
                iArr9[i59] = iArrCopyOf2[iO0];
            }
            return H(vub0Var, i2, iArr8, iArr9, false);
        }
        int[] iArrCopyOf3 = Arrays.copyOf(iArrCopyOf, iArrCopyOf.length);
        int length8 = iArrCopyOf2.length;
        int[] iArr10 = new int[length8];
        for (int i60 = 0; i60 < length8; i60++) {
            iArr10[i60] = -iArrCopyOf2[i60];
        }
        int i61 = i38 + i54;
        int i62 = i26 + i23;
        int i63 = i62 < 0 ? 0 : i62;
        int iD = D(iArrCopyOf3);
        boolean z9 = z2;
        int i64 = i38;
        int i65 = 0;
        while (true) {
            i2 = i2;
            if (iD == -1 || i65 >= i25) {
                break;
            }
            int i66 = iArrCopyOf3[iD];
            int i67 = i65;
            int length9 = iArrCopyOf3.length;
            iArrCopyOf = iArrCopyOf;
            i27 = i27;
            int i68 = Integer.MAX_VALUE;
            int i69 = 0;
            iD = -1;
            while (i69 < length9) {
                int i70 = i69;
                int i71 = i66 + 1;
                int i72 = length9;
                int i73 = iArrCopyOf3[i70];
                if (i71 <= i73 && i73 < i68) {
                    i68 = i73;
                    iD = i70;
                }
                i69 = i70 + 1;
                length9 = i72;
            }
            i65 = i67 + 1;
            if (i66 >= 0) {
                int[] iArr11 = iArrCopyOf2;
                qub0Var2 = qub0Var5;
                long jA2 = vub0Var.a(qub0Var2, i66, iD);
                avb0 avb0VarV2 = uub0Var.v1(i66, jA2);
                int i74 = i26;
                int i75 = (int) (jA2 & 4294967295L);
                int[] iArr12 = iArrCopyOf3;
                int i76 = (int) (jA2 >> 32);
                int i77 = i75 - i76;
                mgcVar.R(i66, i77 != 1 ? -2 : i76);
                int iG3 = G(iArr10, jA2);
                if (i77 != 1) {
                    iArrV2 = mgcVar.v(i66);
                    if (iArrV2 == null) {
                        iArrV2 = new int[i25];
                    }
                } else {
                    iArrV2 = null;
                }
                int i78 = i76;
                while (i78 < i75) {
                    if (iArrV2 != null) {
                        iArrV2[i78] = iG3 - iArr10[i78];
                    }
                    iArr10[i78] = avb0VarV2.n() + iG3;
                    iArr12[i78] = i66;
                    int i79 = i78;
                    n36VarArr[i79].addLast(avb0VarV2);
                    i78 = i79 + 1;
                }
                if (iG3 < i61 && iArr10[i76] <= i61) {
                    avb0VarV2.l = false;
                    z9 = true;
                }
                if (i77 != 1) {
                    mgcVar.Q(i66, iArrV2);
                    vub0Var = vub0Var;
                    i2 = i2;
                    qub0Var5 = qub0Var2;
                    i65 = i25;
                    iArrCopyOf3 = iArr12;
                    iD = iD;
                    i26 = i74;
                    i27 = i27;
                    iArrCopyOf2 = iArr11;
                } else {
                    iArrCopyOf3 = iArr12;
                    i65 = i65;
                    i26 = i74;
                    iArrCopyOf2 = iArr11;
                }
            } else {
                qub0Var2 = qub0Var5;
            }
            qub0Var5 = qub0Var2;
        }
        int[] iArr13 = iArrCopyOf;
        int[] iArr14 = iArrCopyOf2;
        int i80 = i26;
        int i81 = i27;
        qub0 qub0Var6 = qub0Var5;
        int[] iArr15 = iArrCopyOf3;
        loop15: while (true) {
            int i82 = 0;
            while (true) {
                if (i82 >= length8) {
                    for (int i83 = 0; i83 < i25; i83++) {
                        if (!n36VarArr[i83].isEmpty()) {
                            i3 = i53;
                            i4 = 1;
                            break loop15;
                        }
                    }
                    break;
                }
                int i84 = iArr10[i82];
                if (i84 < i63 || i84 <= 0) {
                    break;
                }
                i82++;
            }
            int iD2 = D(iArr10);
            i4 = 1;
            int iW0 = f46.w0(iArr15) + 1;
            i3 = i53;
            if (iW0 >= i3) {
                break;
            }
            int i85 = length8;
            int[] iArr16 = iArr10;
            int i86 = i63;
            qub0 qub0Var7 = qub0Var6;
            isb0 isb0Var3 = isb0Var2;
            b7x b7xVar4 = b7xVar;
            fvb0 fvb0Var3 = fvb0Var;
            int[] iArr17 = iArr14;
            int i87 = i25;
            int[] iArr18 = iArr15;
            pub0 pub0Var2 = pub0Var;
            int i88 = i2;
            int i89 = i64;
            long jA3 = vub0Var.a(qub0Var7, iW0, iD2);
            int i90 = (int) (jA3 & 4294967295L);
            int i91 = (int) (jA3 >> 32);
            int i92 = i90 - i91;
            mgcVar.R(iW0, i92 != 1 ? -2 : i91);
            avb0 avb0VarV3 = uub0Var.v1(iW0, jA3);
            int[] iArr19 = iArr16;
            int iG4 = G(iArr19, jA3);
            if (i92 != 1) {
                iArrV = mgcVar.v(iW0);
                if (iArrV == null) {
                    iArrV = new int[i87];
                }
            } else {
                iArrV = null;
            }
            int i93 = i91;
            while (i93 < i90) {
                if (iArrV != null) {
                    iArrV[i93] = iG4 - iArr19[i93];
                }
                iArr18[i93] = iW0;
                iArr19[i93] = avb0VarV3.n() + iG4;
                n36VarArr[i93].addLast(avb0VarV3);
                i93++;
                iArr19 = iArr19;
            }
            int[] iArr20 = iArr19;
            mgcVar.Q(iW0, iArrV);
            if (iG4 < i61 && iArr20[i91] <= i61) {
                avb0VarV3.l = false;
            }
            i64 = i89;
            qub0Var6 = qub0Var7;
            length8 = i85;
            i25 = i87;
            i2 = i88;
            iArr15 = iArr18;
            pub0Var = pub0Var2;
            iArr10 = iArr20;
            isb0Var2 = isb0Var3;
            i53 = i3;
            b7xVar = b7xVar4;
            iArr14 = iArr17;
            fvb0Var = fvb0Var3;
            i63 = i86;
        }
        int i94 = 0;
        while (i94 < i25) {
            n36 n36Var = n36VarArr[i94];
            while (n36Var.b() > i4 && !((avb0) n36Var.first()).l) {
                avb0 avb0Var2 = (avb0) n36Var.removeFirst();
                int[] iArrV4 = avb0Var2.f != i4 ? mgcVar.v(avb0Var2.a) : null;
                iArr14[i94] = iArr14[i94] - (avb0Var2.n() + (iArrV4 == null ? 0 : iArrV4[i94]));
                i4 = 1;
            }
            avb0 avb0Var3 = (avb0) n36Var.f();
            iArr13[i94] = avb0Var3 != null ? avb0Var3.a : -1;
            i94++;
            i4 = 1;
        }
        int length10 = iArr15.length;
        int i95 = 0;
        while (true) {
            if (i95 >= length10) {
                i5 = i54;
                break;
            }
            if (iArr15[i95] == i3 - 1) {
                i5 = i54;
                J(-i5, iArr10);
                break;
            }
            i95++;
        }
        int i96 = 0;
        while (true) {
            if (i96 >= length8) {
                i6 = i80;
                int i97 = i6 - iArr10[C(iArr10)];
                iArr3 = iArr14;
                J(-i97, iArr3);
                J(i97, iArr10);
                boolean z10 = false;
                loop43: while (true) {
                    int length11 = iArr3.length;
                    int i98 = 0;
                    while (true) {
                        if (i98 >= length11) {
                            i7 = i97;
                            iArr4 = iArr13;
                            i8 = i81;
                            vub0Var2 = vub0Var;
                            i9 = i2;
                            break loop43;
                        }
                        z3 = z10;
                        int i99 = iArr3[i98];
                        int i100 = i98;
                        i8 = i81;
                        if (i99 < i8) {
                            break;
                        }
                        i97 = i97;
                        iArr15 = iArr15;
                        iArr13 = iArr13;
                        i81 = i8;
                        length8 = length8;
                        i98 = i100 + 1;
                        z10 = z3;
                    }
                    int iD3 = D(iArr3);
                    int iC = C(iArr13);
                    if (iD3 != iC) {
                        if (iArr3[iD3] == iArr3[iC]) {
                            iD3 = iC;
                        } else {
                            iD3 = iD3;
                            z3 = true;
                        }
                    }
                    int i101 = iArr13[iD3];
                    i7 = i97;
                    if (i101 == -1) {
                        i101 = i3;
                    }
                    int iN4 = mgcVar.n(i101, iD3);
                    if (iN4 < 0) {
                        vub0Var2 = vub0Var;
                        int[] iArr21 = iArr13;
                        if ((!z3 && !I(iArr21, vub0Var2, iArr3, iD3)) || !z) {
                            i9 = i2;
                            iArr4 = iArr21;
                            z10 = z3;
                            break;
                        }
                        mgcVar.M();
                        int length12 = iArr21.length;
                        int[] iArr22 = new int[length12];
                        for (int i102 = 0; i102 < length12; i102++) {
                            iArr22[i102] = -1;
                        }
                        int length13 = iArr3.length;
                        int[] iArr23 = new int[length13];
                        for (int i103 = 0; i103 < length13; i103++) {
                            iArr23[i103] = iArr3[iD3];
                        }
                        return H(vub0Var2, i2, iArr22, iArr23, false);
                    }
                    int i104 = length8;
                    int i105 = i3;
                    int i106 = i25;
                    int[] iArr24 = iArr13;
                    int[] iArr25 = iArr15;
                    int i107 = i2;
                    long jA4 = vub0Var.a(qub0Var6, iN4, iD3);
                    int i108 = i63;
                    qub0 qub0Var8 = qub0Var6;
                    int i109 = (int) (jA4 & 4294967295L);
                    int i110 = (int) (jA4 >> 32);
                    int i111 = i109 - i110;
                    mgcVar.R(iN4, i111 != 1 ? -2 : i110);
                    avb0 avb0VarV4 = uub0Var.v1(iN4, jA4);
                    int iG5 = G(iArr3, jA4);
                    int[] iArrV5 = i111 != 1 ? mgcVar.v(iN4) : null;
                    int i112 = i110;
                    while (i112 < i109) {
                        int i113 = i109;
                        if (iArr3[i112] != iG5) {
                            z3 = true;
                        }
                        n36VarArr[i112].addFirst(avb0VarV4);
                        iArr24[i112] = iN4;
                        iArr3[i112] = avb0VarV4.n() + iG5 + (iArrV5 == null ? 0 : iArrV5[i112]);
                        i112++;
                        i109 = i113;
                    }
                    i2 = i107;
                    z10 = z3;
                    i97 = i7;
                    iArr15 = iArr25;
                    i25 = i106;
                    i3 = i105;
                    i63 = i108;
                    qub0Var6 = qub0Var8;
                    iArr13 = iArr24;
                    i81 = i8;
                    length8 = i104;
                }
                if (!z10 || !z) {
                    i10 = i9 + i7;
                    int i114 = iArr3[D(iArr3)];
                    if (i114 >= 0) {
                        break;
                    }
                    i10 += i114;
                    J(i114, iArr10);
                    J(-i114, iArr3);
                    break;
                }
                mgcVar.M();
                return H(vub0Var2, i9, iArr4, iArr3, false);
            }
            i6 = i80;
            if (iArr10[i96] >= i6) {
                vub0Var2 = vub0Var;
                i10 = i2;
                length8 = length8;
                i63 = i63;
                qub0Var6 = qub0Var6;
                iArr4 = iArr13;
                i8 = i81;
                iArr3 = iArr14;
                i3 = i3;
                i25 = i25;
                iArr15 = iArr15;
                i9 = i10;
                break;
            }
            i96++;
            i80 = i6;
        }
        fvb0 fvb0Var4 = fvb0Var;
        float f = (tlc1Var.W() || !fvb0Var4.a) ? fvb0Var4.o : fvb0Var4.w.f();
        float f2 = (Integer.signum(Math.round(f)) != Integer.signum(i10) || Math.abs(Math.round(f)) < Math.abs(i10)) ? f : i10;
        float f3 = f - f2;
        float f4 = 0.0f;
        if (tlc1Var.W() && i10 > i9 && f3 <= 0.0f) {
            f4 = (i10 - i9) + f3;
        }
        int[] iArrCopyOf4 = Arrays.copyOf(iArr3, iArr3.length);
        int length14 = iArrCopyOf4.length;
        for (int i115 = 0; i115 < length14; i115++) {
            iArrCopyOf4[i115] = -iArrCopyOf4[i115];
        }
        int i116 = i25;
        if (i8 > i5) {
            int i117 = 0;
            while (i117 < i116) {
                n36 n36Var2 = n36VarArr[i117];
                int iB = n36Var2.b();
                int i118 = i117;
                int i119 = 0;
                while (true) {
                    if (i119 >= iB) {
                        iArr7 = iArr4;
                        i21 = i8;
                        break;
                    }
                    iArr7 = iArr4;
                    avb0 avb0Var4 = (avb0) n36Var2.get(i119);
                    i21 = i8;
                    int[] iArrV6 = mgcVar.v(avb0Var4.a);
                    int iN5 = avb0Var4.n() + (iArrV6 == null ? 0 : iArrV6[i118]);
                    if (i119 == p7h.L(n36Var2) || (i22 = iArr3[i118]) == 0 || i22 < iN5) {
                        break;
                    }
                    iArr3[i118] = i22 - iN5;
                    i119++;
                    iArr7[i118] = ((avb0) n36Var2.get(i119)).a;
                    iArr4 = iArr7;
                    i8 = i21;
                }
                i117 = i118 + 1;
                iArr4 = iArr7;
                i8 = i21;
            }
        }
        int[] iArr26 = iArr4;
        int i120 = i8;
        int i121 = i120 + i23;
        if (z5) {
            iG = hjl.i(j3);
            j2 = j3;
        } else {
            j2 = j3;
            iG = jjl.g(f46.w0(iArr10) + i121, j2);
        }
        int i122 = iG;
        int iF = z5 ? jjl.f(f46.w0(iArr10) + i121, j2) : hjl.h(j2);
        int iMin2 = (Math.min(z5 ? iF : i122, i6) - i120) + i23;
        int i123 = iArrCopyOf4[0];
        float f5 = f4;
        int[] iArr27 = edn0Var.a;
        int i124 = edn0Var.b - 1;
        ArrayList arrayList3 = null;
        while (-1 < i124) {
            int i125 = iArr27[i124];
            int i126 = i124;
            int iZ2 = mgcVar.z(i125);
            int[] iArr28 = iArr10;
            if (iZ2 == -2 || iZ2 == -1) {
                int i127 = 0;
                while (true) {
                    if (i127 >= i116) {
                        qub0Var = qub0Var6;
                        long jA5 = vub0Var2.a(qub0Var, i125, 0);
                        if (arrayList3 == null) {
                            arrayList3 = new ArrayList();
                        }
                        ArrayList arrayList4 = arrayList3;
                        avb0 avb0VarV5 = uub0Var.v1(i125, jA5);
                        iN = i123 - avb0VarV5.n();
                        avb0VarV5.o(iN, 0, iMin2);
                        arrayList4.add(avb0VarV5);
                        arrayList3 = arrayList4;
                    } else {
                        avb0 avb0Var5 = (avb0) n36VarArr[i127].f();
                        if ((avb0Var5 != null ? avb0Var5.a : -1) > i125) {
                            i127++;
                        } else {
                            qub0Var = qub0Var6;
                            iN = i123;
                        }
                    }
                }
            } else {
                avb0 avb0Var6 = (avb0) n36VarArr[iZ2].f();
                if ((avb0Var6 != null ? avb0Var6.a : -1) > i125) {
                    qub0Var = qub0Var6;
                    long jA6 = vub0Var2.a(qub0Var, i125, 0);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList();
                    }
                    ArrayList arrayList5 = arrayList3;
                    avb0 avb0VarV6 = uub0Var.v1(i125, jA6);
                    iN = i123 - avb0VarV6.n();
                    avb0VarV6.o(iN, 0, iMin2);
                    arrayList5.add(avb0VarV6);
                    arrayList3 = arrayList5;
                } else {
                    qub0Var = qub0Var6;
                    iN = i123;
                }
            }
            i124 = i126 - 1;
            i123 = iN;
            qub0Var6 = qub0Var;
            iArr10 = iArr28;
            j2 = j2;
        }
        long j5 = j2;
        int[] iArr29 = iArr10;
        qub0 qub0Var9 = qub0Var6;
        if (arrayList3 == null) {
            arrayList3 = arrayList2;
        }
        int i128 = 0;
        for (int i129 = 0; i129 < i116; i129++) {
            i128 += n36VarArr[i129].c;
        }
        ArrayList arrayList6 = new ArrayList(i128);
        loop28: while (true) {
            int i130 = 0;
            while (true) {
                if (i130 >= i116) {
                    break loop28;
                }
                if (!n36VarArr[i130].isEmpty()) {
                    break;
                }
                i130++;
                iArr3 = iArr3;
                fvb0Var4 = fvb0Var4;
                dvb0Var2 = dvb0Var2;
            }
            int i131 = Integer.MAX_VALUE;
            int i132 = -1;
            int i133 = 0;
            while (i133 < i116) {
                int i134 = i133;
                avb0 avb0Var7 = (avb0) n36VarArr[i133].f();
                int i135 = avb0Var7 != null ? avb0Var7.a : Integer.MAX_VALUE;
                if (i131 > i135) {
                    i131 = i135;
                    i132 = i134;
                }
                i133 = i134 + 1;
            }
            avb0 avb0Var8 = (avb0) n36VarArr[i132].removeFirst();
            int i136 = avb0Var8.e;
            if (i136 == i132) {
                int i137 = i132;
                int[] iArr30 = iArr3;
                fvb0 fvb0Var5 = fvb0Var4;
                long j6 = (((long) i136) << 32) | (((long) (avb0Var8.f + i136)) & 4294967295L);
                int iG6 = G(iArrCopyOf4, j6);
                dvb0 dvb0Var3 = dvb0Var2;
                int[] iArr31 = iArrCopyOf4;
                int i138 = dvb0Var3.a[i137];
                int i139 = i64;
                if (avb0Var8.m + iG6 >= i139) {
                    i20 = i63;
                    if (iG6 <= i20) {
                        avb0Var8.o(iG6, i138, iMin2);
                        arrayList6.add(avb0Var8);
                    }
                } else {
                    i20 = i63;
                }
                int i140 = (int) (j6 & 4294967295L);
                for (int i141 = (int) (j6 >> 32); i141 < i140; i141++) {
                    iArr31[i141] = avb0Var8.n() + iG6;
                }
                i63 = i20;
                i64 = i139;
                iArrCopyOf4 = iArr31;
                iArr3 = iArr30;
                fvb0Var4 = fvb0Var5;
                dvb0Var2 = dvb0Var3;
            }
        }
        int[] iArr32 = iArr3;
        fvb0 fvb0Var6 = fvb0Var4;
        dvb0 dvb0Var4 = dvb0Var2;
        int i142 = i63;
        int i143 = i64;
        int i144 = iArrCopyOf4[0];
        avb0 avb0Var9 = (avb0) o7h.C0(arrayList6);
        int i145 = avb0Var9 != null ? avb0Var9.a : -1;
        if (!tlc1Var.W() || list5 == null) {
            i11 = i144;
            i12 = i6;
            i13 = i143;
            f2 = f2;
            i14 = i11;
            arrayList = null;
        } else {
            List list6 = list5;
            if (list6.isEmpty()) {
                i11 = i144;
            } else {
                int size = list5.size() - 1;
                i11 = i144;
                while (true) {
                    if (-1 >= size) {
                        list = list6;
                        list2 = list5;
                        avb0Var = null;
                        break;
                    }
                    list2 = list5;
                    list = list6;
                    if (((avb0) list2.get(size)).a > i145 && (size == 0 || ((avb0) list2.get(size - 1)).a <= i145)) {
                        avb0Var = (avb0) list2.get(size);
                        break;
                    }
                    size--;
                    list6 = list;
                    list5 = list2;
                }
                avb0 avb0Var10 = (avb0) o7h.A0(list2);
                if (avb0Var != null && (i19 = avb0Var.a) <= (iMin = Math.min(avb0Var10.a, i3 - 1))) {
                    int i146 = i19;
                    arrayList = null;
                    int iN6 = i11;
                    while (true) {
                        if (arrayList != null) {
                            i13 = i143;
                            int size2 = arrayList.size();
                            i12 = i6;
                            int i147 = 0;
                            while (true) {
                                if (i147 < size2) {
                                    int i148 = i147;
                                    if (((avb0) arrayList.get(i147)).a == i146) {
                                        list3 = list2;
                                    } else {
                                        i147 = i148 + 1;
                                    }
                                }
                                if (i146 != iMin) {
                                    break;
                                }
                                i146++;
                                i6 = i12;
                                i143 = i13;
                                list2 = list3;
                                f2 = f2;
                            }
                        } else {
                            i12 = i6;
                            i13 = i143;
                        }
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        int size3 = list.size();
                        int i149 = 0;
                        while (true) {
                            if (i149 >= size3) {
                                list3 = list2;
                                obj = null;
                                break;
                            }
                            obj = list2.get(i149);
                            list3 = list2;
                            if (((avb0) obj).a == i146) {
                                break;
                            }
                            i149++;
                            list2 = list3;
                        }
                        avb0 avb0Var11 = (avb0) obj;
                        int i150 = avb0Var11 != null ? avb0Var11.e : 0;
                        avb0 avb0VarV7 = uub0Var.v1(i146, vub0Var2.a(qub0Var9, i146, i150));
                        arrayList.add(avb0VarV7);
                        int[] iArr33 = dvb0Var4.a;
                        avb0VarV7.o(iN6, iArr33.length > i150 ? iArr33[i150] : 0, iMin2);
                        iN6 = avb0VarV7.n() + iN6;
                        if (i146 != iMin) {
                            break;
                            break;
                        }
                        i146++;
                        i6 = i12;
                        i143 = i13;
                        list2 = list3;
                        f2 = f2;
                    }
                    i14 = iN6;
                }
            }
            i12 = i6;
            i13 = i143;
            f2 = f2;
            i14 = i11;
            arrayList = null;
        }
        int[] iArr34 = edn0Var.a;
        int i151 = edn0Var.b;
        ArrayList arrayList7 = null;
        int i152 = 0;
        while (i152 < i151) {
            int i153 = iArr34[i152];
            i3 = i3;
            if (i153 >= i3) {
                iArr5 = iArr34;
            } else {
                if (arrayList != null) {
                    int size4 = arrayList.size();
                    int i154 = 0;
                    while (true) {
                        if (i154 < size4) {
                            iArr5 = iArr34;
                            if (((avb0) arrayList.get(i154)).a != i153) {
                                i154++;
                                iArr34 = iArr5;
                            }
                        } else {
                            iArr5 = iArr34;
                            iZ = mgcVar.z(i153);
                            if (iZ != -2 || iZ == -1) {
                                iArr6 = iArr15;
                                length = iArr6.length;
                                i17 = 0;
                                while (true) {
                                    if (i17 < length) {
                                        i18 = i151;
                                        if (iArr6[i17] < i153) {
                                            i17++;
                                            i151 = i18;
                                        }
                                    }
                                }
                            } else if (iArr15[iZ] < i153) {
                                iArr6 = iArr15;
                            }
                            i18 = i151;
                            long jA7 = vub0Var2.a(qub0Var9, i153, 0);
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            avb0 avb0VarV8 = uub0Var.v1(i153, jA7);
                            avb0VarV8.o(i14, 0, iMin2);
                            int iN7 = avb0VarV8.n() + i14;
                            arrayList7.add(avb0VarV8);
                            i14 = iN7;
                        }
                    }
                } else {
                    iArr5 = iArr34;
                    iZ = mgcVar.z(i153);
                    if (iZ != -2) {
                        iArr6 = iArr15;
                        length = iArr6.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                i18 = i151;
                                if (iArr6[i17] < i153) {
                                    i17++;
                                    i151 = i18;
                                }
                            } else {
                                i18 = i151;
                                long jA8 = vub0Var2.a(qub0Var9, i153, 0);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                avb0 avb0VarV9 = uub0Var.v1(i153, jA8);
                                avb0VarV9.o(i14, 0, iMin2);
                                int iN8 = avb0VarV9.n() + i14;
                                arrayList7.add(avb0VarV9);
                                i14 = iN8;
                            }
                        }
                    } else {
                        iArr6 = iArr15;
                        length = iArr6.length;
                        i17 = 0;
                        while (true) {
                            if (i17 < length) {
                                i18 = i151;
                                if (iArr6[i17] < i153) {
                                    i17++;
                                    i151 = i18;
                                }
                            } else {
                                i18 = i151;
                                long jA9 = vub0Var2.a(qub0Var9, i153, 0);
                                if (arrayList7 == null) {
                                    arrayList7 = new ArrayList();
                                }
                                avb0 avb0VarV10 = uub0Var.v1(i153, jA9);
                                avb0VarV10.o(i14, 0, iMin2);
                                int iN9 = avb0VarV10.n() + i14;
                                arrayList7.add(avb0VarV10);
                                i14 = iN9;
                            }
                        }
                    }
                }
                i152++;
                iArr15 = iArr6;
                i151 = i18;
                iArr34 = iArr5;
            }
            i18 = i151;
            iArr6 = iArr15;
            i152++;
            iArr15 = iArr6;
            i151 = i18;
            iArr34 = iArr5;
        }
        int[] iArr35 = iArr15;
        if (arrayList7 != null) {
            arrayList2 = arrayList7;
        }
        ArrayList arrayList8 = new ArrayList();
        arrayList8.addAll(arrayList3);
        arrayList8.addAll(arrayList6);
        if (arrayList != null) {
            arrayList8.addAll(arrayList);
        }
        arrayList8.addAll(arrayList2);
        bsb0 bsb0Var = fvb0Var6.t;
        float f6 = f2;
        int i155 = (int) f6;
        mgc mgcVar2 = uub0Var.d.c;
        uub0 uub0Var2 = vub0Var2.q;
        boolean z11 = vub0Var2.f;
        int i156 = vub0Var2.s;
        boolean zW = tlc1Var.W();
        boolean z12 = vub0Var2.n;
        if (iArr32.length == 0) {
            hhg1.k();
            return null;
        }
        int i157 = iArr32[0];
        int length15 = iArr32.length - 1;
        if (1 <= length15) {
            int i158 = 1;
            while (true) {
                int i159 = iArr32[i158];
                if (i157 > i159) {
                    i157 = i159;
                }
                if (i158 == length15) {
                    break;
                }
                i158++;
            }
        }
        bsb0Var.d(i155, i122, iF, arrayList8, mgcVar2, uub0Var2, z11, zW, i156, z12, i157, f46.w0(iArr29) + i121, vub0Var2.m, vub0Var2.f36p);
        if (tlc1Var.W()) {
            i15 = iF;
            i16 = i122;
        } else {
            long jB2 = fvb0Var6.t.b();
            if (yr80.b(jB2, 0L)) {
                i15 = iF;
                i16 = i122;
            } else {
                int i160 = z5 ? iF : i122;
                int iG7 = jjl.g(Math.max(i122, (int) (jB2 >> 32)), j5);
                int iF2 = jjl.f(Math.max(iF, (int) (jB2 & 4294967295L)), j5);
                int i161 = z5 ? iF2 : iG7;
                if (i161 != i160) {
                    int size5 = arrayList8.size();
                    for (int i162 = 0; i162 < size5; i162++) {
                        avb0 avb0Var12 = (avb0) arrayList8.get(i162);
                        avb0Var12.r = i161;
                        avb0Var12.t = avb0Var12.h + i161;
                    }
                }
                i16 = iG7;
                i15 = iF2;
            }
        }
        int i163 = length8;
        int i164 = 0;
        while (true) {
            if (i164 >= i163) {
                int length16 = iArr35.length;
                int i165 = 0;
                while (true) {
                    if (i165 < length16) {
                        if (iArr35[i165] >= i3 - 1) {
                            z4 = false;
                            break;
                        }
                        i165++;
                    }
                }
            } else {
                int i166 = i12;
                if (iArr29[i164] <= i166) {
                    i164++;
                    i12 = i166;
                }
            }
            z4 = true;
            break;
        }
        vub0 vub0Var3 = vub0Var2;
        isb0 isb0Var4 = isb0Var2;
        return new yub0(iArr26, iArr32, f6, isb0Var4.S(i16, i15, b7xVar, new nqb(vub0Var3, arrayList8, vub0Var2.i, isb0Var4, (byte) 1)), f5, z4, vub0Var3.f, z9, vub0Var3.d, pub0Var.d, isb0Var4, i3, arrayList6, (((long) i16) << 32) | (((long) i15) & 4294967295L), i13, i142, vub0Var3.j, vub0Var3.k, vub0Var3.l, vub0Var3.m);
    }

    public static final boolean I(int[] iArr, vub0 vub0Var, int[] iArr2, int i) {
        mgc mgcVar = vub0Var.r;
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (mgcVar.n(iArr[i2], i2) == -1 && iArr2[i2] != iArr2[i]) {
                return true;
            }
        }
        int length2 = iArr.length;
        for (int i3 = 0; i3 < length2; i3++) {
            if (mgcVar.n(iArr[i3], i3) != -1 && iArr2[i3] >= iArr2[i]) {
                return true;
            }
        }
        int iZ = mgcVar.z(0);
        return (iZ == 0 || iZ == -1 || iZ == -2) ? false : true;
    }

    public static final void J(int i, int[] iArr) {
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = iArr[i2] + i;
        }
    }

    public static FlowableDistinctUntilChanged K(Flowable flowable, o241 o241Var, uwh uwhVar, lkd lkdVar, pqq0 pqq0Var, yqg yqgVar, Scheduler scheduler) {
        Flowable flowableE = Flowable.e(flowable.j(mo9.N0), Flowable.h(flowable.j(mo9.Y).J(si10.S0), ((p241) o241Var).a.map(o810.S0).onErrorReturnItem(Boolean.TRUE).toFlowable(BackpressureStrategy.d), mi10.S0).X(new bnj0(pqq0Var, lkdVar, (byte) 21)), Flowable.h(flowable.j(mo9.Z).J(xi10.S0), flowable.j(new xeu0(1000L, scheduler, yqgVar)).x(dj10.R0).J(fj10.R0), yb10.S0).X(new hod0(uwhVar, (byte) 27)), new d4e0(pqq0Var, (byte) 23));
        flowableE.getClass();
        return flowableE.t(Functions.a);
    }

    public static final String L(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((mb61) obj).d) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((mb61) it.next()).a);
        }
        return o7h.y0(o7h.Z0(arrayList2), ",", (String) null, (String) null, (iu30) null, 62);
    }

    public static ComponentName M(Context context, Intent intent) {
        synchronized (a) {
            try {
                x(context);
                boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                ComponentName componentNameStartService = context.startService(intent);
                if (componentNameStartService == null) {
                    return null;
                }
                if (!booleanExtra) {
                    b.a();
                }
                return componentNameStartService;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final c47 N(rmr0 rmr0Var) {
        int i = rmr0Var.d;
        rmr0Var.a();
        int i2 = rmr0Var.g;
        rmr0Var.a();
        return new c47(i, i2, rmr0Var.h);
    }

    public static final Observable O(Single single) {
        return single.toObservable().compose(new dgp0(30, 1000L, 5)).onErrorReturn(qz70.c1);
    }

    public static final ArrayList P(List list, Map map) {
        mb61 mb61Var;
        String str = (String) map.get("correlation-id");
        if (str == null) {
            str = "";
        }
        String str2 = str;
        ArrayList arrayListE = foo1.E(map);
        ArrayList<ll81> arrayList = new ArrayList();
        for (Object obj : list) {
            if (ihc1.h0(((ll81) obj).a, "session_control_display", false)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (ll81 ll81Var : arrayList) {
            String str3 = (String) map.get("session_control_display.displayName.".concat(ihc1.X0(ll81Var.a, "$")));
            if (str3 != null) {
                String str4 = ll81Var.a;
                mb61Var = new mb61(ihc1.h0(str4, "session_control_display", false) && gc61.a.contains(ihc1.X0(str4, "$")), arrayListE.contains(ll81Var.a), str4, str3, str2);
            } else {
                mb61Var = null;
            }
            if (mb61Var != null) {
                arrayList2.add(mb61Var);
            }
        }
        return arrayList2;
    }

    public static String Q(String str, Object... objArr) {
        int length;
        int length2;
        int iIndexOf;
        String strP;
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i2 >= length) {
                break;
            }
            Object obj = objArr[i2];
            if (obj == null) {
                strP = "null";
            } else {
                try {
                    strP = obj.toString();
                } catch (Exception e) {
                    String strF = f4i1.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
                    Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e);
                    strP = cy30.p("<", strF, " threw ", e.getClass().getName(), ">");
                }
            }
            objArr[i2] = strP;
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

    public static final void a(ydx ydxVar, j2i j2iVar, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1364625170);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(ydxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(j2iVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(xu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xu30Var3) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(xu30Var4) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.i(xu30Var5) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.i(xu30Var6) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            mbh mbhVarA = jbh.a(new d36(ydxVar.c, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            int i3 = i2;
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            int i4 = i3 >> 3;
            e(apo.r(-1338741122, new qdx(j2iVar, ydxVar, xu30Var, xu30Var2), x340Var), ydxVar.b, qim0VarF, xu30Var3, xu30Var4, x340Var, (i4 & 7168) | 6 | (i4 & 57344));
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cwl1.d((i3 >> 18) & 14, 12, cbx.a(x340Var).b.a, (tl3) null, x340Var, xu30Var5, qim0VarF2, cbx.d(x340Var).g);
            cwl1.d((i3 >> 21) & 14, 12, cbx.a(x340Var).b.a, (tl3) null, x340Var, xu30Var6, u291.f(nim0Var, 1.0f), cbx.d(x340Var).g);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rdx(ydxVar, j2iVar, xu30Var, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, i);
        }
    }

    public static final void b(xtb0 xtb0Var, String str, int i, Function0 function0, b0k b0kVar, int i2) {
        String str2;
        Object dk6Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-43779598);
        int i3 = i2 | (x340Var.i(xtb0Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.e(i) ? 256 : 128) | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            int iX0 = (int) ((wat) x340Var.k(t4k.h)).X0(44.0f);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            Integer numValueOf = Integer.valueOf(iX0);
            boolean zI = x340Var.i(xtb0Var) | x340Var.i(ven0Var2) | ((i3 & 7168) == 2048) | x340Var.i(ven0Var) | x340Var.e(iX0);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                dk6Var = new dk6(xtb0Var, function0, ven0Var2, iX0, ven0Var, (lnm) null);
                x340Var.s0(dk6Var);
            } else {
                dk6Var = objT3;
            }
            qxd0.s(xtb0Var, numValueOf, (vu30) dk6Var, x340Var);
            boolean zI2 = ((i3 & 112) == 32) | x340Var.i(ven0Var) | x340Var.i(xtb0Var) | ((i3 & 896) == 256);
            Object objT4 = x340Var.T();
            if (zI2 || objT4 == m4cVar) {
                str2 = str;
                fe6 fe6Var = new fe6(str2, xtb0Var, i, ven0Var, (lnm) null, (byte) 4);
                x340Var.s0(fe6Var);
                objT4 = fe6Var;
            } else {
                str2 = str;
            }
            qxd0.t(str2, x340Var, (vu30) objT4);
        } else {
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new p1b(xtb0Var, str2, i, function0, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:151:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:152:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:154:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:156:0x01df  */
    /* JADX WARN: Code duplicated, block: B:164:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:167:0x0203  */
    /* JADX WARN: Code duplicated, block: B:185:0x024b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:186:0x024d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0250  */
    /* JADX WARN: Code duplicated, block: B:190:0x0255  */
    /* JADX WARN: Code duplicated, block: B:191:0x025a  */
    /* JADX WARN: Code duplicated, block: B:194:0x025f  */
    /* JADX WARN: Code duplicated, block: B:195:0x0291  */
    /* JADX WARN: Code duplicated, block: B:198:0x0299  */
    /* JADX WARN: Code duplicated, block: B:201:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:202:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:205:0x02c4  */
    /* JADX WARN: Code duplicated, block: B:207:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:209:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:210:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:212:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:213:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:215:0x02d6  */
    /* JADX WARN: Code duplicated, block: B:216:0x02d8  */
    /* JADX WARN: Code duplicated, block: B:218:0x02dc  */
    /* JADX WARN: Code duplicated, block: B:219:0x02de  */
    /* JADX WARN: Code duplicated, block: B:221:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:222:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:224:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:225:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:229:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:231:0x0399  */
    /* JADX WARN: Code duplicated, block: B:234:0x03bc  */
    /* JADX WARN: Code duplicated, block: B:236:? A[RETURN, SYNTHETIC] */
    public static final void c(qim0 qim0Var, pgx pgxVar, ydx ydxVar, hw61 hw61Var, max maxVar, idn0 idn0Var, ga80 ga80Var, gbx gbxVar, gbx gbxVar2, xu30 xu30Var, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, j2i j2iVar, b0k b0kVar, int i, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        pgx pgxVar2;
        ydx ydxVar2;
        hw61 hw61VarB;
        int i5;
        ga80 ga80Var2;
        gbx gbxVar3;
        gbx gbxVar4;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        boolean z;
        x340 x340Var;
        idn0 idn0Var2;
        xu30 xu30Var8;
        xu30 xu30Var9;
        xu30 xu30Var10;
        qim0 qim0Var3;
        pgx pgxVar3;
        gbx gbxVar5;
        ydx ydxVar3;
        gbx gbxVar6;
        hw61 hw61Var2;
        xu30 xu30Var11;
        xu30 xu30Var12;
        xu30 xu30Var13;
        xu30 xu30Var14;
        ga80 ga80Var3;
        max maxVar2;
        h311 h311VarV;
        qim0 qim0Var4;
        pgx pgxVar4;
        idn0 idn0VarY;
        int i11;
        int i12;
        ga80 ga80VarO;
        xu30 xu30Var15;
        xu30 xu30Var16;
        xu30 xu30Var17;
        xu30 xu30Var18;
        xu30 xu30Var19;
        max maxVar3;
        xu30 xu30Var20;
        int i13;
        xu30 xu30Var21;
        int i14;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1027222163);
        int i15 = i3 & 1;
        if (i15 != 0) {
            i4 = i | 6;
            qim0Var2 = qim0Var;
        } else if ((i & 6) == 0) {
            qim0Var2 = qim0Var;
            i4 = (x340Var2.i(qim0Var2) ? 4 : 2) | i;
        } else {
            qim0Var2 = qim0Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) == 0) {
                pgxVar2 = pgxVar;
                int i16 = x340Var2.i(pgxVar2) ? 32 : 16;
                i4 |= i16;
            } else {
                pgxVar2 = pgxVar;
            }
            i4 |= i16;
        } else {
            pgxVar2 = pgxVar;
        }
        if ((i & 384) == 0) {
            if ((i3 & 4) == 0) {
                ydxVar2 = ydxVar;
                int i17 = x340Var2.i(ydxVar2) ? 256 : 128;
                i4 |= i17;
            } else {
                ydxVar2 = ydxVar;
            }
            i4 |= i17;
        } else {
            ydxVar2 = ydxVar;
        }
        if ((i & 3072) == 0) {
            if ((i3 & 8) == 0) {
                hw61VarB = hw61Var;
                if (x340Var2.i(hw61VarB)) {
                    i14 = 2048;
                }
                i4 |= i14;
            } else {
                hw61VarB = hw61Var;
            }
            i14 = 1024;
            i4 |= i14;
        } else {
            hw61VarB = hw61Var;
        }
        if ((i & 24576) == 0) {
            i4 |= 8192;
        }
        if ((i & 196608) == 0) {
            i4 |= 65536;
        }
        if ((i & 1572864) == 0) {
            if ((i3 & 64) == 0) {
                i5 = 196608;
                ga80Var2 = ga80Var;
                int i18 = x340Var2.i(ga80Var2) ? 1048576 : 524288;
                i4 |= i18;
            } else {
                i5 = 196608;
                ga80Var2 = ga80Var;
            }
            i4 |= i18;
        } else {
            i5 = 196608;
            ga80Var2 = ga80Var;
        }
        int i19 = i3 & 128;
        if (i19 != 0) {
            i4 |= 12582912;
            gbxVar3 = gbxVar;
        } else {
            gbxVar3 = gbxVar;
            if ((i & 12582912) == 0) {
                i4 |= x340Var2.i(gbxVar3) ? 8388608 : 4194304;
            }
        }
        int i20 = i3 & 256;
        if (i20 != 0) {
            i4 |= 100663296;
            gbxVar4 = gbxVar2;
        } else {
            gbxVar4 = gbxVar2;
            if ((i & 100663296) == 0) {
                i4 |= x340Var2.i(gbxVar4) ? 67108864 : 33554432;
            }
        }
        int i21 = i3 & 512;
        if (i21 != 0) {
            i4 |= 805306368;
        } else if ((i & 805306368) == 0) {
            i4 |= x340Var2.i(xu30Var) ? 536870912 : 268435456;
        }
        int i22 = i3 & 1024;
        if (i22 != 0) {
            i6 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i6 = i2 | (x340Var2.i(xu30Var2) ? 4 : 2);
        } else {
            i6 = i2;
        }
        int i23 = i3 & 2048;
        if (i23 != 0) {
            i6 |= 48;
        } else if ((i2 & 48) == 0) {
            i6 |= x340Var2.i(xu30Var3) ? 32 : 16;
        }
        int i24 = i6;
        int i25 = i3 & 4096;
        if (i25 != 0) {
            i7 = i24 | 384;
        } else {
            int i26 = i24;
            if ((i2 & 384) == 0) {
                i26 |= x340Var2.i(xu30Var4) ? 256 : 128;
            }
            i7 = i26;
        }
        int i27 = i3 & 8192;
        if (i27 != 0) {
            i8 = i7 | 3072;
        } else {
            int i28 = i7;
            if ((i2 & 3072) == 0) {
                i8 = i28 | (x340Var2.i(xu30Var5) ? 2048 : 1024);
            } else {
                i8 = i28;
            }
        }
        int i29 = i3 & 16384;
        if (i29 == 0) {
            i9 = i8;
            if ((i2 & 24576) == 0) {
                i9 |= x340Var2.i(xu30Var6) ? 16384 : 8192;
            }
            i10 = i3 & 32768;
            if (i10 != 0) {
                i9 |= i5;
            } else if ((i2 & i5) == 0) {
                i9 |= x340Var2.i(xu30Var7) ? 131072 : 65536;
            }
            if ((i4 & 306783379) == 306783378 || (i9 & 599187) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var2.Y(i4 & 1, z)) {
                x340Var2.d0();
                if ((i & 1) != 0 || x340Var2.E()) {
                    if (i15 != 0) {
                        qim0Var4 = nim0.a;
                    } else {
                        qim0Var4 = qim0Var2;
                    }
                    if ((i3 & 2) != 0) {
                        pgxVar4 = ngx.e;
                        i4 &= -113;
                    } else {
                        pgxVar4 = pgxVar2;
                    }
                    if ((i3 & 4) != 0) {
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var2).b;
                        cvx cvxVar2 = cbx.b(x340Var2).b;
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        cvx cvxVar4 = cbx.b(x340Var2).b;
                        i4 &= -897;
                        ydxVar2 = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
                    }
                    if ((i3 & 8) != 0) {
                        uwr uwrVar2 = cbx.a;
                        cua cuaVar = cbx.b(x340Var2).f;
                        i4 &= -7169;
                        hw61VarB = er31.b(6.0f);
                    }
                    idn0VarY = zso1.Y(x340Var2);
                    i11 = i4 & (-516097);
                    if ((i3 & 64) != 0) {
                        ga80VarO = vno1.o(hw61VarB, x340Var2, (i11 >> 9) & 14);
                        i12 = i4 & (-4186113);
                    } else {
                        i12 = i11;
                        ga80VarO = ga80Var2;
                    }
                    if (i19 != 0) {
                        gbxVar3 = null;
                    }
                    if (i20 != 0) {
                        gbxVar4 = null;
                    }
                    if (i21 != 0) {
                        xu30Var15 = null;
                    } else {
                        xu30Var15 = xu30Var;
                    }
                    if (i22 != 0) {
                        xu30Var16 = null;
                    } else {
                        xu30Var16 = xu30Var2;
                    }
                    if (i23 != 0) {
                        xu30Var17 = null;
                    } else {
                        xu30Var17 = xu30Var3;
                    }
                    if (i25 != 0) {
                        xu30Var18 = null;
                    } else {
                        xu30Var18 = xu30Var4;
                    }
                    if (i27 != 0) {
                        xu30Var9 = null;
                    } else {
                        xu30Var9 = xu30Var5;
                    }
                    if (i29 != 0) {
                        xu30Var19 = null;
                    } else {
                        xu30Var19 = xu30Var6;
                    }
                    maxVar3 = jax.a;
                    xu30Var20 = i10 == 0 ? xu30Var7 : null;
                    i13 = i12;
                    xu30Var21 = xu30Var17;
                    pgxVar2 = pgxVar4;
                    qim0Var2 = qim0Var4;
                } else {
                    x340Var2.b0();
                    if ((i3 & 2) != 0) {
                        i4 &= -113;
                    }
                    if ((i3 & 4) != 0) {
                        i4 &= -897;
                    }
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                    int i30 = i4 & (-516097);
                    if ((i3 & 64) != 0) {
                        i30 = i4 & (-4186113);
                    }
                    maxVar3 = maxVar;
                    xu30Var15 = xu30Var;
                    xu30Var16 = xu30Var2;
                    xu30Var21 = xu30Var3;
                    xu30Var18 = xu30Var4;
                    xu30Var9 = xu30Var5;
                    xu30Var19 = xu30Var6;
                    i13 = i30;
                    ga80VarO = ga80Var2;
                    idn0VarY = idn0Var;
                    xu30Var20 = xu30Var7;
                }
                x340Var2.s();
                vq60 vq60Var = jw80.a;
                idn0 idn0Var3 = idn0VarY;
                ga80 ga80Var4 = ga80VarO;
                int i31 = i13 << 6;
                cwl1.b(qim0Var2.then(tsj0.a), (tl3) null, hw61VarB, pgxVar2, ydxVar2.d, maxVar3, false, idn0Var3, ga80Var4, gbxVar3, gbxVar4, apo.r(235371414, new e1c(xu30Var15, ydxVar2, j2iVar, xu30Var21, xu30Var18, xu30Var16, xu30Var9, xu30Var19, xu30Var20, (byte) 2), x340Var2), x340Var2, (i31 & 1879048192) | ((i13 >> 3) & 896) | (i31 & 7168) | (i31 & 234881024), ((i13 >> 24) & 14) | 48, 66);
                x340Var = x340Var2;
                xu30 xu30Var22 = xu30Var15;
                idn0Var2 = idn0Var3;
                qim0Var3 = qim0Var2;
                ga80Var3 = ga80Var4;
                ydxVar3 = ydxVar2;
                xu30Var12 = xu30Var21;
                pgxVar3 = pgxVar2;
                gbxVar6 = gbxVar4;
                xu30Var13 = xu30Var18;
                xu30Var8 = xu30Var16;
                gbxVar5 = gbxVar3;
                xu30Var11 = xu30Var22;
                hw61 hw61Var3 = hw61VarB;
                xu30Var14 = xu30Var19;
                hw61Var2 = hw61Var3;
                max maxVar4 = maxVar3;
                xu30Var10 = xu30Var20;
                maxVar2 = maxVar4;
            } else {
                x340Var = x340Var2;
                x340Var.b0();
                idn0Var2 = idn0Var;
                xu30Var8 = xu30Var2;
                xu30Var9 = xu30Var5;
                xu30Var10 = xu30Var7;
                qim0Var3 = qim0Var2;
                pgxVar3 = pgxVar2;
                gbxVar5 = gbxVar3;
                ydxVar3 = ydxVar2;
                gbxVar6 = gbxVar4;
                hw61Var2 = hw61VarB;
                xu30Var11 = xu30Var;
                xu30Var12 = xu30Var3;
                xu30Var13 = xu30Var4;
                xu30Var14 = xu30Var6;
                ga80Var3 = ga80Var2;
                maxVar2 = maxVar;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new sdx(qim0Var3, pgxVar3, ydxVar3, hw61Var2, maxVar2, idn0Var2, ga80Var3, gbxVar5, gbxVar6, xu30Var11, xu30Var8, xu30Var12, xu30Var13, xu30Var9, xu30Var14, xu30Var10, j2iVar, i, i2, i3);
            }
        }
        i9 = i8 | 24576;
        i10 = i3 & 32768;
        if (i10 != 0) {
            i9 |= i5;
        } else if ((i2 & i5) == 0) {
            i9 |= x340Var2.i(xu30Var7) ? 131072 : 65536;
        }
        if ((i4 & 306783379) == 306783378) {
            z = true;
        } else {
            z = true;
        }
        if (x340Var2.Y(i4 & 1, z)) {
            x340Var2.d0();
            if ((i & 1) != 0) {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    pgxVar4 = ngx.e;
                    i4 &= -113;
                } else {
                    pgxVar4 = pgxVar2;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar3 = cbx.a;
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    cvx cvxVar6 = cbx.b(x340Var2).b;
                    cvx cvxVar7 = cbx.b(x340Var2).b;
                    cvx cvxVar8 = cbx.b(x340Var2).b;
                    i4 &= -897;
                    ydxVar2 = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar4 = cbx.a;
                    cua cuaVar2 = cbx.b(x340Var2).f;
                    i4 &= -7169;
                    hw61VarB = er31.b(6.0f);
                }
                idn0VarY = zso1.Y(x340Var2);
                i11 = i4 & (-516097);
                if ((i3 & 64) != 0) {
                    ga80VarO = vno1.o(hw61VarB, x340Var2, (i11 >> 9) & 14);
                    i12 = i4 & (-4186113);
                } else {
                    i12 = i11;
                    ga80VarO = ga80Var2;
                }
                if (i19 != 0) {
                    gbxVar3 = null;
                }
                if (i20 != 0) {
                    gbxVar4 = null;
                }
                if (i21 != 0) {
                    xu30Var15 = null;
                } else {
                    xu30Var15 = xu30Var;
                }
                if (i22 != 0) {
                    xu30Var16 = null;
                } else {
                    xu30Var16 = xu30Var2;
                }
                if (i23 != 0) {
                    xu30Var17 = null;
                } else {
                    xu30Var17 = xu30Var3;
                }
                if (i25 != 0) {
                    xu30Var18 = null;
                } else {
                    xu30Var18 = xu30Var4;
                }
                if (i27 != 0) {
                    xu30Var9 = null;
                } else {
                    xu30Var9 = xu30Var5;
                }
                if (i29 != 0) {
                    xu30Var19 = null;
                } else {
                    xu30Var19 = xu30Var6;
                }
                maxVar3 = jax.a;
                if (i10 == 0) {
                }
                i13 = i12;
                xu30Var21 = xu30Var17;
                pgxVar2 = pgxVar4;
                qim0Var2 = qim0Var4;
            } else {
                if (i15 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if ((i3 & 2) != 0) {
                    pgxVar4 = ngx.e;
                    i4 &= -113;
                } else {
                    pgxVar4 = pgxVar2;
                }
                if ((i3 & 4) != 0) {
                    uwr uwrVar5 = cbx.a;
                    cvx cvxVar9 = cbx.b(x340Var2).b;
                    cvx cvxVar10 = cbx.b(x340Var2).b;
                    cvx cvxVar11 = cbx.b(x340Var2).b;
                    cvx cvxVar12 = cbx.b(x340Var2).b;
                    i4 &= -897;
                    ydxVar2 = new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f));
                }
                if ((i3 & 8) != 0) {
                    uwr uwrVar6 = cbx.a;
                    cua cuaVar3 = cbx.b(x340Var2).f;
                    i4 &= -7169;
                    hw61VarB = er31.b(6.0f);
                }
                idn0VarY = zso1.Y(x340Var2);
                i11 = i4 & (-516097);
                if ((i3 & 64) != 0) {
                    ga80VarO = vno1.o(hw61VarB, x340Var2, (i11 >> 9) & 14);
                    i12 = i4 & (-4186113);
                } else {
                    i12 = i11;
                    ga80VarO = ga80Var2;
                }
                if (i19 != 0) {
                    gbxVar3 = null;
                }
                if (i20 != 0) {
                    gbxVar4 = null;
                }
                if (i21 != 0) {
                    xu30Var15 = null;
                } else {
                    xu30Var15 = xu30Var;
                }
                if (i22 != 0) {
                    xu30Var16 = null;
                } else {
                    xu30Var16 = xu30Var2;
                }
                if (i23 != 0) {
                    xu30Var17 = null;
                } else {
                    xu30Var17 = xu30Var3;
                }
                if (i25 != 0) {
                    xu30Var18 = null;
                } else {
                    xu30Var18 = xu30Var4;
                }
                if (i27 != 0) {
                    xu30Var9 = null;
                } else {
                    xu30Var9 = xu30Var5;
                }
                if (i29 != 0) {
                    xu30Var19 = null;
                } else {
                    xu30Var19 = xu30Var6;
                }
                maxVar3 = jax.a;
                if (i10 == 0) {
                }
                i13 = i12;
                xu30Var21 = xu30Var17;
                pgxVar2 = pgxVar4;
                qim0Var2 = qim0Var4;
            }
            x340Var2.s();
            vq60 vq60Var2 = jw80.a;
            idn0 idn0Var4 = idn0VarY;
            ga80 ga80Var5 = ga80VarO;
            int i32 = i13 << 6;
            cwl1.b(qim0Var2.then(tsj0.a), (tl3) null, hw61VarB, pgxVar2, ydxVar2.d, maxVar3, false, idn0Var4, ga80Var5, gbxVar3, gbxVar4, apo.r(235371414, new e1c(xu30Var15, ydxVar2, j2iVar, xu30Var21, xu30Var18, xu30Var16, xu30Var9, xu30Var19, xu30Var20, (byte) 2), x340Var2), x340Var2, (i32 & 1879048192) | ((i13 >> 3) & 896) | (i32 & 7168) | (i32 & 234881024), ((i13 >> 24) & 14) | 48, 66);
            x340Var = x340Var2;
            xu30 xu30Var23 = xu30Var15;
            idn0Var2 = idn0Var4;
            qim0Var3 = qim0Var2;
            ga80Var3 = ga80Var5;
            ydxVar3 = ydxVar2;
            xu30Var12 = xu30Var21;
            pgxVar3 = pgxVar2;
            gbxVar6 = gbxVar4;
            xu30Var13 = xu30Var18;
            xu30Var8 = xu30Var16;
            gbxVar5 = gbxVar3;
            xu30Var11 = xu30Var23;
            hw61 hw61Var4 = hw61VarB;
            xu30Var14 = xu30Var19;
            hw61Var2 = hw61Var4;
            max maxVar5 = maxVar3;
            xu30Var10 = xu30Var20;
            maxVar2 = maxVar5;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            idn0Var2 = idn0Var;
            xu30Var8 = xu30Var2;
            xu30Var9 = xu30Var5;
            xu30Var10 = xu30Var7;
            qim0Var3 = qim0Var2;
            pgxVar3 = pgxVar2;
            gbxVar5 = gbxVar3;
            ydxVar3 = ydxVar2;
            gbxVar6 = gbxVar4;
            hw61Var2 = hw61VarB;
            xu30Var11 = xu30Var;
            xu30Var12 = xu30Var3;
            xu30Var13 = xu30Var4;
            xu30Var14 = xu30Var6;
            ga80Var3 = ga80Var2;
            maxVar2 = maxVar;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdx(qim0Var3, pgxVar3, ydxVar3, hw61Var2, maxVar2, idn0Var2, ga80Var3, gbxVar5, gbxVar6, xu30Var11, xu30Var8, xu30Var12, xu30Var13, xu30Var9, xu30Var14, xu30Var10, j2iVar, i, i2, i3);
        }
    }

    public static final void d(boolean z, boolean z2, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-78013561);
        int i2 = (x340Var.h(z) ? 4 : 2) | i | (x340Var.h(z2) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new luz0(new g8y0(ven0VarS, (byte) 2), new g8y0(ven0VarS, (byte) 3));
                x340Var.s0(objT);
            }
            otw.c((luz0) objT, new kuz0(z, z2), (qim0) null, (ipb1) null, x340Var, 8, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new st8(z, z2, iu30Var, i);
        }
    }

    public static final void e(j2i j2iVar, float f, qim0 qim0Var, xu30 xu30Var, xu30 xu30Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(653195162);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(j2iVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(xu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(xu30Var2) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            jw31 jw31VarA = ew31.a(new d36(f, true, new um5(false)), een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cwl1.d((i2 >> 9) & 14, 62, 0L, (tl3) null, x340Var, xu30Var, (qim0) null, (lee1) null);
            cwl1.e((i2 << 15) & 458752, 30, 0L, (tl3) null, x340Var, j2iVar, new wnb0(1.0f, true), (lee1) null);
            cwl1.d((i2 >> 12) & 14, 62, 0L, (tl3) null, x340Var, xu30Var2, (qim0) null, (lee1) null);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z51(j2iVar, f, qim0Var, xu30Var, xu30Var2, i);
        }
    }

    public static final void f(ta60 ta60Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        ta60 ta60Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1014540202);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ta60Var) : x340Var.i(ta60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        byte b2 = 1;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            ta60Var2 = ta60Var;
            ulo1.b(ta60Var2, "highlight-ranked-list2-card", af.d, apo.r(1172529383, new nc60(ta60Var, b2), x340Var), x340Var, (i3 & 14) | 27696 | ((i3 << 3) & 896), 0);
            qim0Var = nim0.a;
        } else {
            ta60Var2 = ta60Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new oc60(ta60Var2, qim0Var, i, (byte) 1);
        }
    }

    public static final void g(ydx ydxVar, xu30 xu30Var, j2i j2iVar, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1901040594);
        int i2 = i | (x340Var.i(ydxVar) ? 4 : 2) | (x340Var.i(xu30Var) ? 32 : 16) | (x340Var.i(j2iVar) ? 256 : 128) | (x340Var.i(xu30Var2) ? 2048 : 1024) | (x340Var.i(xu30Var3) ? 16384 : 8192) | (x340Var.i(xu30Var4) ? 131072 : 65536) | (x340Var.i(xu30Var5) ? 1048576 : 524288) | (x340Var.i(xu30Var6) ? 8388608 : 4194304) | (x340Var.i(xu30Var7) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (i2 & 38347923) != 38347922)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarH = sgc1.H(2, nim0Var);
            mbh mbhVarA = jbh.a(new d36(ydxVar.c, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            int i3 = i2 >> 3;
            cwl1.d(i3 & 14, 56, 0L, een.h, x340Var, xu30Var, qim0VarF, (lee1) null);
            a(ydxVar, j2iVar, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, x340Var, (i2 & 14) | (i3 & 112) | (i3 & 896) | (i3 & 7168) | (57344 & i3) | (458752 & i3) | (3670016 & i3) | (i3 & 29360128));
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tdx(ydxVar, xu30Var, j2iVar, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, i, (byte) 0);
        }
    }

    public static final void h(ydx ydxVar, xu30 xu30Var, j2i j2iVar, xu30 xu30Var2, xu30 xu30Var3, xu30 xu30Var4, xu30 xu30Var5, xu30 xu30Var6, xu30 xu30Var7, b0k b0kVar, int i) {
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-385548125);
        int i2 = i | (b0kVar3.i(ydxVar) ? 4 : 2) | (b0kVar3.i(xu30Var) ? 32 : 16) | (b0kVar3.i(j2iVar) ? 256 : 128) | (b0kVar3.i(xu30Var2) ? 2048 : 1024) | (b0kVar3.i(xu30Var3) ? 16384 : 8192) | (b0kVar3.i(xu30Var4) ? 131072 : 65536) | (b0kVar3.i(xu30Var5) ? 1048576 : 524288) | (b0kVar3.i(xu30Var6) ? 8388608 : 4194304) | (b0kVar3.i(xu30Var7) ? 67108864 : 33554432);
        if (b0kVar3.Y(i2 & 1, (38347923 & i2) != 38347922)) {
            b0kVar2 = b0kVar3;
            i(ydxVar.c, apo.r(1724831193, new hzw(xu30Var, (byte) 3), b0kVar3), null, apo.r(1573154071, new n(ydxVar, j2iVar, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, (byte) 7), b0kVar3), b0kVar2, 3120);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tdx(ydxVar, xu30Var, j2iVar, xu30Var2, xu30Var3, xu30Var4, xu30Var5, xu30Var6, xu30Var7, i, (byte) 1);
        }
    }

    public static final void i(float f, j2i j2iVar, qim0 qim0Var, j2i j2iVar2, b0k b0kVar, int i) {
        j2i j2iVar3;
        j2i j2iVar4;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1740895964);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.d(f) ? 4 : 2) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new j37((byte) 2, f);
                x340Var.s0(objT);
            }
            gfh0 gfh0Var = (gfh0) objT;
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0Var, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var3);
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
            j2iVar3 = j2iVar;
            j2iVar3.invoke(x340Var, 6);
            x340Var.r(true);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            j2iVar4 = j2iVar2;
            ktd.s(j2iVar4, x340Var, 6, true, true);
            qim0Var2 = qim0Var3;
        } else {
            j2iVar3 = j2iVar;
            j2iVar4 = j2iVar2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys(f, (Object) j2iVar3, (Object) qim0Var2, (Object) j2iVar4, i, (byte) 6);
        }
    }

    public static final void j(ha60 ha60Var, long j, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-625469500);
        int i2 = i | (x340Var.g(ha60Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarA = uyn1.A(u291.f(nim0Var, 1.0f), 16.0f, 2.0f, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            int i3 = i2 & 112;
            n(ha60Var.a, j, null, x340Var, i3, 4);
            m(ha60Var.b, j, null, x340Var, i3, 4);
            op71.g(x340Var, u291.h(nim0Var, 2.0f));
            p(ha60Var.c, j, null, x340Var, i3, 4);
            op71.g(x340Var, u291.h(nim0Var, 2.0f));
            p(ha60Var.d, j, null, x340Var, i3, 4);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kd60(ha60Var, j, i, (byte) 0);
        }
    }

    public static final void k(va60 va60Var, long j, zqz0 zqz0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1262773137);
        int i2 = (x340Var.g(va60Var) ? 4 : 2) | i | (x340Var.f(j) ? 32 : 16) | (x340Var.i(zqz0Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            w2g0.c(uyn1.w(u291.d(qim0Var, 1.0f), zqz0Var.d), (tl3) null, apo.r(-1167696699, new cy00(cbx.b(x340Var).b, zqz0Var, apo.r(1461549780, new o3((Object) va60Var, (Object) zqz0Var, x340Var.k(t4k.n) == flb0.b, (byte) 19), x340Var), apo.r(298358221, new gv6((Object) va60Var, j, (byte) 7), x340Var)), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) va60Var, j, (Object) zqz0Var, (Object) qim0Var, i, (byte) 8);
        }
    }

    public static final void l(ha60 ha60Var, long j, b0k b0kVar, int i) {
        x340 x340Var;
        ha60 ha60Var2 = ha60Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1047516425);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(ha60Var2) ? 4 : 2) | (x340Var2.f(j) ? 32 : 16);
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            zqz0 zqz0Var = new zqz0(1, -7.0f, -0.28f, uyn1.j(0.0f, 0.0f, 16.0f, 0.0f, 11), uyn1.j(0.0f, 0.0f, 0.0f, 8.0f, 7));
            zqz0 zqz0Var2 = new zqz0(2, 7.0f, 0.16f, uyn1.j(16.0f, 0.0f, 0.0f, 0.0f, 14), uyn1.j(0.0f, 8.0f, 0.0f, 0.0f, 13));
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            float f = cvxVar.a;
            qim0 qim0VarB = uyn1.B(qim0VarD, 0.0f, f, 0.0f, f, 5);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            va60 va60Var = ha60Var2.c;
            pbh pbhVar = pbh.a;
            int i3 = i2 & 112;
            k(va60Var, j, zqz0Var, pbhVar.a(2.0f, nim0Var, true), x340Var2, i3);
            qim0 qim0VarY = uyn1.y(pbhVar.a(1.0f, u291.f(nim0Var, 1.0f), true), 16.0f, 8.0f);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarY);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            ha60Var2 = ha60Var;
            n(ha60Var2.a, j, pbhVar.a(1.0f, nim0Var, true), x340Var2, i3, 0);
            m(ha60Var2.b, j, null, x340Var2, i3, 4);
            x340Var = x340Var2;
            x340Var.r(true);
            k(ha60Var2.d, j, zqz0Var2, pbhVar.a(2.0f, nim0Var, true), x340Var, i3);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kd60(ha60Var2, j, i, (byte) 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0056  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0061  */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:43:? A[RETURN, SYNTHETIC] */
    public static final void m(String str, long j, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        String str2;
        int i3;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar2;
        h311 h311VarV;
        qim0 qim0Var3;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1619540641);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.f(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                uwr uwrVar = cbx.a;
                b0kVar2 = b0kVar3;
                gxo1.c(str2, qim0Var3, cbx.d(b0kVar3).d, j, null, 2, false, new cjc0(1), null, 50.0f, (FontWeight) ((bjx) ajx.a.c).e, null, b0kVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 7168), 0, 2384);
                qim0Var2 = qim0Var3;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new ld60(str, j, qim0Var2, i, i2, (byte) 0);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var3 = nim0.a;
            } else {
                qim0Var3 = qim0Var2;
            }
            uwr uwrVar2 = cbx.a;
            b0kVar2 = b0kVar3;
            gxo1.c(str2, qim0Var3, cbx.d(b0kVar3).d, j, null, 2, false, new cjc0(1), null, 50.0f, (FontWeight) ((bjx) ajx.a.c).e, null, b0kVar2, (i3 & 14) | ((i3 >> 3) & 112) | ((i3 << 6) & 7168), 0, 2384);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ld60(str, j, qim0Var2, i, i2, (byte) 0);
        }
    }

    public static final void n(String str, long j, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        qim0 qim0Var2;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(430411935);
        int i4 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.f(j) ? 32 : 16);
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 = i4 | 384;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i3 = i4 | (x340Var.i(qim0Var2) ? 256 : 128);
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = i5 != 0 ? nim0.a : qim0Var2;
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).a;
            FontWeight fontWeight = (FontWeight) ((bjx) ajx.a.c).f;
            cjc0 cjc0Var = new cjc0(1);
            px8 px8Var = new px8(cbx.d(x340Var).d.a.b, fc11.G(70), 0L, (mx8) null, 12);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = z860.Y;
                x340Var.s0(objT);
            }
            gxo1.c(str, s161.b(qim0Var3, false, (iu30) objT), lee1Var, j, null, 1, false, cjc0Var, px8Var, 50.0f, fontWeight, null, x340Var, ((i3 << 6) & 7168) | (i3 & 14) | 134217728, 0, 2128);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new md60(str, j, qim0Var2, i, i2);
        }
    }

    public static final void o(ArrayList arrayList, long j, qim0 qim0Var, b0k b0kVar, int i) {
        ArrayList arrayList2;
        int i2;
        qim0 qim0Var2;
        lee1 lee1Var;
        vu30 vu30Var = y580.Y;
        vu30 vu30Var2 = y580.R0;
        vu30 vu30Var3 = y580.N0;
        llj lljVar = y580.O0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-635607938);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            arrayList2 = arrayList;
            i2 = i | (x340Var.g(arrayList2) ? 4 : 2);
        } else {
            arrayList2 = arrayList;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        int i3 = i2 | 384;
        boolean z = false;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM, x340Var, vu30Var3);
            nko1.H(Integer.valueOf(iHashCode), x340Var, vu30Var2);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, vu30Var);
            x340Var.i0(707542917);
            int i4 = 0;
            for (Object obj : arrayList2) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                ua60 ua60Var = (ua60) obj;
                if (i4 == 0) {
                    x340Var.i0(1539032061);
                    uwr uwrVar2 = cbx.a;
                    lee1Var = cbx.d(x340Var).h;
                } else {
                    x340Var.i0(1539033273);
                    uwr uwrVar3 = cbx.a;
                    lee1Var = cbx.d(x340Var).g;
                }
                x340Var.r(z);
                fra fraVar = een.N0;
                Object objT = x340Var.T();
                if (objT == fkj0.X) {
                    objT = z860.Z;
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0Var3, true, (iu30) objT);
                jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
                int i6 = i3;
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
                hzj.A.getClass();
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function0);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, vu30Var3);
                nko1.H(Integer.valueOf(iHashCode2), x340Var, vu30Var2);
                nko1.F(x340Var);
                nko1.H(qim0VarE2, x340Var, vu30Var);
                x340 x340Var2 = x340Var;
                int i7 = (i6 << 6) & 7168;
                qim0 qim0Var4 = qim0Var3;
                lee1 lee1Var2 = lee1Var;
                uwo1.e(ua60Var.a, null, lee1Var2, j, null, null, 2, false, new cjc0(1), 0, null, x340Var2, i7, 0, 1714);
                op71.g(x340Var2, u291.v(qim0Var4, 2.0f));
                uwo1.e(ua60Var.b, new wnb0(1.0f, true), lee1Var2, j, null, null, 2, false, new cjc0(1), 0, null, x340Var2, i7, 0, 1712);
                x340Var = x340Var2;
                x340Var.r(true);
                qim0Var3 = qim0Var4;
                i4 = i5;
                i3 = i6;
                vu30Var = vu30Var;
                vu30Var2 = vu30Var2;
                function0 = function0;
                vu30Var3 = vu30Var3;
                z = false;
            }
            x340Var.r(z);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new je3((Object) arrayList, j, (Object) qim0Var2, i, (byte) 5);
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0088  */
    /* JADX WARN: Code duplicated, block: B:44:0x008f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0095  */
    /* JADX WARN: Code duplicated, block: B:48:0x00de  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:55:? A[RETURN, SYNTHETIC] */
    public static final void p(va60 va60Var, long j, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        boolean z;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        mbh mbhVarA;
        int iHashCode;
        xos0 xos0VarM;
        qim0 qim0VarE;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1305416308);
        if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? x340Var.g(va60Var) : x340Var.i(va60Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= x340Var.f(j) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 256 : 128;
            }
            if ((i3 & 147) != 146) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i3 & 1, z)) {
                qim0Var4 = nim0.a;
                if (i4 != 0) {
                    qim0Var2 = qim0Var4;
                }
                mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
                iHashCode = Long.hashCode(x340Var.T);
                xos0VarM = x340Var.m();
                qim0VarE = zr7.E(x340Var, qim0Var2);
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
                nko1.H(mbhVarA, x340Var, y580.O0);
                nko1.H(xos0VarM, x340Var, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
                nko1.F(x340Var);
                nko1.H(qim0VarE, x340Var, y580.Y);
                int i5 = i3 & 112;
                m(va60Var.b, j, u291.f(qim0Var4, 1.0f), x340Var, i5, 0);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(qim0Var4, 2.0f));
                o(va60Var.c, j, null, x340Var, i5);
                x340Var.r(true);
            } else {
                x340Var.b0();
            }
            qim0Var3 = qim0Var2;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ld60(va60Var, j, qim0Var3, i, i2, (byte) 1);
            }
        }
        i3 |= 384;
        qim0Var2 = qim0Var;
        if ((i3 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i3 & 1, z)) {
            qim0Var4 = nim0.a;
            if (i4 != 0) {
                qim0Var2 = qim0Var4;
            }
            mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            iHashCode = Long.hashCode(x340Var.T);
            xos0VarM = x340Var.m();
            qim0VarE = zr7.E(x340Var, qim0Var2);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i6 = i3 & 112;
            m(va60Var.b, j, u291.f(qim0Var4, 1.0f), x340Var, i6, 0);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var4, 2.0f));
            o(va60Var.c, j, null, x340Var, i6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0Var3 = qim0Var2;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ld60(va60Var, j, qim0Var3, i, i2, (byte) 1);
        }
    }

    public static final void q(String str, boolean z, int i, boolean z2, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-606645543);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.e(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.h(z2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            ven0 ven0VarS = v8r.s(iu30Var, x340Var);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = new mtz0(new r9y0(ven0VarS, (byte) 1));
                x340Var.s0(objT);
            }
            r((mtz0) objT, new ltz0(str, i, z), apo.r(-1300947718, new llf(z, z2, iu30Var), x340Var), x340Var, 392);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ig6(str, z, i, z2, iu30Var, i2, (byte) 1);
        }
    }

    public static final void r(mtz0 mtz0Var, ltz0 ltz0Var, j2i j2iVar, b0k b0kVar, int i) {
        psi1 psi1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-432699509);
        int i2 = (x340Var.i(mtz0Var) ? 4 : 2) | i | (x340Var.g(ltz0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (Build.VERSION.SDK_INT >= 30) {
                x340Var.i0(-1353979520);
                WeakHashMap weakHashMap = osl1.x;
                psi1Var = lhc.g(x340Var).q;
                x340Var.r(false);
            } else {
                x340Var.i0(-1353913676);
                WeakHashMap weakHashMap2 = osl1.x;
                psi1 bgc0Var = new bgc0(lhc.g(x340Var).q, rqt0.h | 16);
                x340Var.r(false);
                psi1Var = bgc0Var;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = too1.y(u291.d(nim0Var, 1.0f), psi1Var);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            pbh pbhVar = pbh.a;
            w2g0.c(u291.f(pbhVar.a(1.0f, nim0Var, true), 1.0f), (tl3) null, apo.r(1213738303, new hov0(mtz0Var, ltz0Var, (byte) 8), x340Var), x340Var, 3072, 6);
            j2iVar.invoke(pbhVar, x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ffx0(mtz0Var, ltz0Var, j2iVar, i, (byte) 9);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void s(duz0 duz0Var, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        iu30 iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1393356190);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(duz0Var) : x340Var.i(duz0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new j9z0(iu30Var, (byte) 6);
                x340Var.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, x340Var, false);
            if (duz0Var instanceof cuz0) {
                x340Var.i0(-1384503742);
                x340Var.r(false);
                iu30Var2 = iu30Var;
            } else if (duz0Var instanceof ztz0) {
                x340Var.i0(-1384470045);
                ztz0 ztz0Var = (ztz0) duz0Var;
                iu30Var2 = iu30Var;
                q(ztz0Var.a, true, ztz0Var.b, ztz0Var.c, iu30Var2, x340Var, ((i2 << 9) & 57344) | 48);
                x340Var.r(false);
            } else if (duz0Var instanceof auz0) {
                x340Var.i0(-1384219906);
                iu30Var2 = iu30Var;
                q(((auz0) duz0Var).a, false, 0, false, iu30Var2, x340Var, ((i2 << 9) & 57344) | 3504);
                x340Var.r(false);
            } else {
                iu30Var2 = iu30Var;
                if (!(duz0Var instanceof buz0)) {
                    throw p3d1.k(x340Var, -1014493342, false);
                }
                x340Var.i0(-1014476420);
                boolean z2 = ((buz0) duz0Var).a;
                boolean z3 = i3 == 32;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new j9z0(iu30Var2, (byte) 7);
                    x340Var.s0(objT2);
                }
                loo1.i(0, (Function0) objT2, x340Var, z2);
                x340Var.r(false);
            }
        } else {
            iu30Var2 = iu30Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wjz0(duz0Var, iu30Var2, i, (byte) 3);
        }
    }

    public static final void t(ya60 ya60Var, qim0 qim0Var, b0k b0kVar, int i) {
        zvx zvxVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1142599161);
        int i2 = (x340Var.g(ya60Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            boolean z = ya60Var instanceof wa60;
            Uri uri = Uri.parse(ya60Var.getImageUrl());
            nkx nkxVar = z ? nkx.c : ltx.c;
            nux nuxVar = new nux(nkxVar, nkxVar);
            if (z) {
                x340Var.i0(1556217188);
                x340Var.r(false);
                zvxVar = null;
            } else {
                x340Var.i0(-1473819232);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(x340Var).f;
                cua cuaVar2 = cbx.b(x340Var).f;
                zvxVar = new zvx();
                x340Var.r(false);
            }
            zvx zvxVar2 = zvxVar;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            qim0 qim0VarQ = nim0.a;
            if (z) {
                qim0VarQ = i1p1.q(qim0VarQ, er31.a);
            }
            eso1.e(uri, isl.a, qim0Var.then(qim0VarQ), (p3v) null, zvxVar2, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073744944, 0, 3520);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jj50(ya60Var, qim0Var, i, (byte) 11);
        }
    }

    public static final void u(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1498794110);
        if (x340Var.Y(i & 1, i != 0)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            cir0 cir0Var = (cir0) x340Var.k(k2r0.a);
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 16.0f, 8.0f);
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            boolean zI = x340Var.i(cir0Var) | x340Var.i(context);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new mah1(cir0Var, context, (byte) 6);
                x340Var.s0(objT);
            }
            boo1.s((Function0) objT, x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rvd1(i, (byte) 22);
        }
    }

    public static final mb61 w(List list) {
        Object next;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            next = it.next();
            if (((mb61) next).d) {
                return (mb61) next;
            }
        }
        next = null;
        return (mb61) next;
    }

    public static void x(Context context) {
        if (b == null) {
            s4l1 s4l1Var = new s4l1(context);
            b = s4l1Var;
            synchronized (s4l1Var.a) {
                s4l1Var.g = true;
            }
        }
    }

    public static void y(Intent intent) {
        synchronized (a) {
            try {
                if (b != null && intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false)) {
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    b.c();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static SpotifyIconView z(Context context, j4b1 j4b1Var) {
        SpotifyIconView spotifyIconView = new SpotifyIconView(context);
        spotifyIconView.setIcon(j4b1Var);
        spotifyIconView.setColorStateList(foo1.u(context, 2130969946));
        spotifyIconView.getDrawable().d(a8o.y(24.0f, context.getResources()));
        return spotifyIconView;
    }
}
