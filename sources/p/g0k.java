package p;

import androidx.compose.runtime.ComposeRuntimeError;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class g0k {
    public static final fjq0 a = new fjq0("provider");
    public static final fjq0 b = new fjq0("provider");
    public static final fjq0 c = new fjq0("compositionLocalMap");
    public static final fjq0 d = new fjq0("providers");
    public static final fjq0 e = new fjq0("reference");

    public static final void a(String str) {
        throw new ComposeRuntimeError(f4i1.f("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final Void b(String str) {
        throw new ComposeRuntimeError(f4i1.f("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    /* JADX WARN: Code duplicated, block: B:82:0x01c5  */
    public static final ynm0 c(h4k h4kVar, znm0 znm0Var, hf91 hf91Var, j06 j06Var) {
        ze91 ze91Var;
        ArrayList arrayList;
        s340 s340Var;
        long[] jArr;
        s340 s340Var2;
        ze91 ze91Var2;
        long[] jArr2;
        int i;
        long j;
        int i2;
        boolean zG;
        Object obj;
        int i3;
        ze91 ze91Var3;
        int i4;
        long j2;
        Object obj2;
        znm0 znm0Var2 = znm0Var;
        ze91 ze91Var4 = new ze91();
        if (hf91Var.e != null) {
            ze91Var4.c();
        }
        if (hf91Var.f != null) {
            ze91Var4.X = new fdn0();
        }
        int i5 = hf91Var.t;
        if (j06Var != null && hf91Var.E(i5) > 0) {
            int iF = hf91Var.v;
            while (iF > 0 && !hf91Var.x(iF)) {
                iF = hf91Var.F(iF, hf91Var.b);
            }
            if (iF >= 0 && hf91Var.x(iF)) {
                Object objD = hf91Var.D(iF);
                int i6 = iF + 1;
                int iT = hf91Var.t(iF) + iF;
                int iE = 0;
                while (i6 < iT) {
                    int iT2 = hf91Var.t(i6) + i6;
                    if (iT2 > i5) {
                        break;
                    }
                    iE += hf91Var.x(i6) ? 1 : hf91Var.E(i6);
                    i6 = iT2;
                }
                int iE2 = hf91Var.x(i5) ? 1 : hf91Var.E(i5);
                j06Var.h(objD);
                j06Var.c(iE, iE2);
                j06Var.l();
            }
        }
        s340 s340Var3 = znm0Var2.e;
        if (s340Var3.a()) {
            if (h4kVar.N0.e > 0) {
                arrayList = new ArrayList();
                nen0 nen0Var = h4kVar.N0;
                long[] jArr3 = nen0Var.a;
                int length = jArr3.length - 2;
                if (length >= 0) {
                    int i7 = 0;
                    while (true) {
                        long j3 = jArr3[i7];
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i8 = 8;
                            int i9 = 8 - ((~(i7 - length)) >>> 31);
                            int i10 = 0;
                            while (i10 < i9) {
                                if ((j3 & 255) < 128) {
                                    int i11 = (i7 << 3) + i10;
                                    int i12 = i8;
                                    Object obj3 = nen0Var.b[i11];
                                    s340Var2 = s340Var3;
                                    Object obj4 = nen0Var.c[i11];
                                    if (obj4 instanceof oen0) {
                                        oen0 oen0Var = (oen0) obj4;
                                        Object[] objArr = oen0Var.b;
                                        long[] jArr4 = oen0Var.a;
                                        jArr2 = jArr3;
                                        int length2 = jArr4.length - 2;
                                        if (length2 >= 0) {
                                            j = j3;
                                            int i13 = 0;
                                            while (true) {
                                                long j4 = jArr4[i13];
                                                if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                                                    int i15 = 0;
                                                    while (i15 < i14) {
                                                        if ((j4 & 255) < 128) {
                                                            i3 = i15;
                                                            int i16 = (i13 << 3) + i3;
                                                            j2 = j4;
                                                            Object obj5 = objArr[i16];
                                                            h311 h311Var = (h311) obj3;
                                                            obj2 = obj3;
                                                            s340 s340Var4 = h311Var.c;
                                                            if (s340Var4 != null) {
                                                                s340 s340VarK = aym.k(s340Var2);
                                                                ze91Var3 = ze91Var4;
                                                                s340 s340VarK2 = aym.k(s340Var4);
                                                                int iC = hf91Var.c(s340VarK);
                                                                i4 = length;
                                                                int i17 = hf91Var.b[(iC * 5) + 3] + iC;
                                                                int i18 = s340VarK2.a;
                                                                if (iC <= i18 && i18 < i17) {
                                                                    arrayList.add(oqn1.n(h311Var, obj5));
                                                                    oen0Var.m(i16);
                                                                }
                                                            } else {
                                                                ze91Var3 = ze91Var4;
                                                                i4 = length;
                                                            }
                                                        } else {
                                                            i3 = i15;
                                                            ze91Var3 = ze91Var4;
                                                            i4 = length;
                                                            j2 = j4;
                                                            obj2 = obj3;
                                                        }
                                                        j4 = j2 >> i12;
                                                        i15 = i3 + 1;
                                                        obj3 = obj2;
                                                        length = i4;
                                                        ze91Var4 = ze91Var3;
                                                    }
                                                    ze91Var2 = ze91Var4;
                                                    i = length;
                                                    obj = obj3;
                                                    if (i14 != i12) {
                                                        break;
                                                    }
                                                } else {
                                                    ze91Var2 = ze91Var4;
                                                    i = length;
                                                    obj = obj3;
                                                }
                                                if (i13 == length2) {
                                                    break;
                                                }
                                                i13++;
                                                obj3 = obj;
                                                length = i;
                                                ze91Var4 = ze91Var2;
                                                i12 = 8;
                                            }
                                        } else {
                                            ze91Var2 = ze91Var4;
                                            i = length;
                                            j = j3;
                                        }
                                        zG = oen0Var.g();
                                    } else {
                                        ze91Var2 = ze91Var4;
                                        jArr2 = jArr3;
                                        i = length;
                                        j = j3;
                                        h311 h311Var2 = (h311) obj3;
                                        s340 s340Var5 = h311Var2.c;
                                        if (s340Var5 != null) {
                                            s340 s340VarK3 = aym.k(s340Var2);
                                            s340 s340VarK4 = aym.k(s340Var5);
                                            int iC2 = hf91Var.c(s340VarK3);
                                            int i19 = hf91Var.b[(iC2 * 5) + 3] + iC2;
                                            int i20 = s340VarK4.a;
                                            if (iC2 > i20 || i20 >= i19) {
                                                zG = false;
                                            } else {
                                                arrayList.add(oqn1.n(h311Var2, obj4));
                                                zG = true;
                                            }
                                        } else {
                                            zG = false;
                                        }
                                    }
                                    if (zG) {
                                        nen0Var.l(i11);
                                    }
                                    i2 = 8;
                                } else {
                                    s340Var2 = s340Var3;
                                    ze91Var2 = ze91Var4;
                                    jArr2 = jArr3;
                                    i = length;
                                    j = j3;
                                    i2 = i8;
                                }
                                j3 = j >> i2;
                                i10++;
                                i8 = i2;
                                s340Var3 = s340Var2;
                                jArr3 = jArr2;
                                length = i;
                                ze91Var4 = ze91Var2;
                            }
                            s340Var = s340Var3;
                            ze91Var = ze91Var4;
                            jArr = jArr3;
                            int i21 = length;
                            if (i9 != i8) {
                                break;
                            }
                            length = i21;
                        } else {
                            s340Var = s340Var3;
                            ze91Var = ze91Var4;
                            jArr = jArr3;
                        }
                        if (i7 == length) {
                            break;
                        }
                        i7++;
                        s340Var3 = s340Var;
                        jArr3 = jArr;
                        ze91Var4 = ze91Var;
                    }
                } else {
                    ze91Var = ze91Var4;
                }
            } else {
                ze91Var = ze91Var4;
                arrayList = z6x.a;
            }
            znm0Var2 = znm0Var;
            znm0Var2.f = o7h.N0(arrayList, znm0Var2.f);
        } else {
            ze91Var = ze91Var4;
        }
        hf91 hf91VarI = ze91Var.i();
        try {
            hf91VarI.d();
            hf91VarI.R(126665345, znm0Var2.a, fkj0.X, false);
            hf91.y(hf91VarI);
            hf91VarI.T(znm0Var2.b);
            List listC = hf91Var.C(aym.k(znm0Var2.e), hf91VarI);
            hf91VarI.M();
            hf91VarI.i();
            hf91VarI.j();
            hf91VarI.e(true);
            ze91 ze91Var5 = ze91Var;
            ynm0 ynm0Var = new ynm0(ze91Var5);
            if (!azo1.s(ze91Var5, listC)) {
                return ynm0Var;
            }
            cfd cfdVar = new cfd(h4kVar, znm0Var2, (byte) 26);
            hf91 hf91VarI2 = ze91Var5.i();
            try {
                azo1.k(hf91VarI2, listC, cfdVar);
                boolean z = true;
                return ynm0Var;
            } finally {
                hf91VarI2.e(false);
            }
        } catch (Throwable th) {
            hf91VarI.e(false);
            throw th;
        }
    }
}
