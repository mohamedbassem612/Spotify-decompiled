package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mmn1 implements Map, Serializable {
    public static final mmn1 h;
    public static final mmn1 i;
    public static final mmn1 t;
    public final /* synthetic */ byte a;
    public final transient Object b;
    public final transient Object[] c;
    public final transient int d;
    public transient AbstractCollection e;
    public transient AbstractCollection f;
    public transient AbstractCollection g;

    static {
        int i2 = 0;
        Object obj = null;
        h = new mmn1(obj, new Object[0], i2, (byte) 0);
        i = new mmn1(obj, new Object[0], i2, (byte) 1);
        t = new mmn1(obj, new Object[0], i2, (byte) 2);
    }

    public /* synthetic */ mmn1(Object obj, Object[] objArr, int i2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = objArr;
        this.d = i2;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [short[], byte[]], vars: [r4v4 ??, r4v10 ??, r4v5 ??, r4v8 ??, r4v6 ??, r4v7 ??, r4v9 ??, r4v12 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryToFixIncompatiblePrimitives(FixTypesVisitor.java:818)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        */
    public static void a(java.util.Set r18) {
        /*
            Method dump skipped, instruction units count: 613
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.mmn1.a(java.util.Set):void");
    }

    public static void b() {
        d(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", jno1.PURCHASES_UPDATED_ACTION, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", jno1.LOCAL_PURCHASES_UPDATED_ACTION, "com.android.vending.billing.ALTERNATIVE_BILLING", jno1.ALTERNATIVE_BILLING_ACTION}, null);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[PHI: r5 r16 r17
      0x00d6: PHI (r5v6 ??) = (r5v2 ??), (r5v4 short[]), (r5v8 ??) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r16v1 int) = (r16v0 int), (r16v0 int), (r16v2 int) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r17v1 char) = (r17v0 char), (r17v0 char), (r17v2 char) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static mmn1 c(int i2, Object[] objArr, dna1 dna1Var) {
        int iHighestOneBit;
        int i3;
        char c;
        short[] sArr;
        ?? r6;
        int i4;
        char c2;
        int i5 = i2;
        Object[] objArrCopyOf = objArr;
        if (i5 == 0) {
            return h;
        }
        sfn1 sfn1Var = null;
        ?? r3 = 0;
        sfn1 sfn1Var2 = null;
        sfn1 sfn1Var3 = null;
        byte b = 0;
        int i6 = 1;
        if (i5 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new mmn1(sfn1Var, objArrCopyOf, i6, b);
        }
        rno1.s(i5, objArrCopyOf.length >> 1);
        char c3 = 2;
        int iMax = Math.max(i5, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                hhg1.n("collection too large");
                return null;
            }
        }
        if (i5 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            i5 = 1;
            i3 = 1;
            c = 2;
        } else {
            int i7 = iHighestOneBit - 1;
            byte b2 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i8 = 0;
                int i9 = 0;
                while (i8 < i5) {
                    int i10 = i9 + i9;
                    int i11 = i8 + i8;
                    Object obj = objArrCopyOf[i11];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i11 ^ i6];
                    Objects.requireNonNull(obj2);
                    int iA = rpo1.A(obj.hashCode());
                    while (true) {
                        int i12 = iA & i7;
                        i4 = i6;
                        c2 = c3;
                        int i13 = bArr[i12] & 255;
                        if (i13 == 255) {
                            bArr[i12] = (byte) i10;
                            if (i9 < i8) {
                                objArrCopyOf[i10] = obj;
                                objArrCopyOf[i10 ^ 1] = obj2;
                            }
                            i9++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i13 == true ? 1 : 0])) {
                            int i14 = ~i13;
                            Object obj3 = objArrCopyOf[i14 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            sfn1 sfn1Var4 = new sfn1(obj, obj2, obj3);
                            objArrCopyOf[i14 == true ? 1 : 0] = obj2;
                            sfn1Var2 = sfn1Var4;
                            break;
                        }
                        iA = i12 + 1;
                        i6 = i4;
                        c3 = c2;
                    }
                    i8++;
                    i6 = i4;
                    c3 = c2;
                }
                i3 = i6;
                c = c3;
                if (i9 == i5) {
                    r3 = bArr;
                } else {
                    sArr = new Object[3];
                    sArr[0] = bArr;
                    sArr[i3] = Integer.valueOf(i9);
                    sArr[c] = sfn1Var2;
                    r3 = sArr;
                }
            } else {
                i3 = 1;
                c = 2;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i15 = 0;
                    for (int i16 = 0; i16 < i5; i16++) {
                        int i17 = i15 + i15;
                        int i18 = i16 + i16;
                        Object obj4 = objArrCopyOf[i18];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i18 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iA2 = rpo1.A(obj4.hashCode());
                        while (true) {
                            int i19 = iA2 & i7;
                            char c4 = (char) sArr[i19];
                            if (c4 == 65535) {
                                sArr[i19] = (short) i17;
                                if (i15 < i16) {
                                    objArrCopyOf[i17] = obj4;
                                    objArrCopyOf[i17 ^ 1] = obj5;
                                }
                                i15++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i20 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i20 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                sfn1 sfn1Var5 = new sfn1(obj4, obj5, obj6);
                                objArrCopyOf[i20 == true ? 1 : 0] = obj5;
                                sfn1Var3 = sfn1Var5;
                                break;
                            }
                            iA2 = i19 + 1;
                        }
                    }
                    if (i15 == i5) {
                        r3 = sArr;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i15), sfn1Var3};
                        r3 = r6;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i21 = 0;
                    int i22 = 0;
                    while (i21 < i5) {
                        int i23 = i22 + i22;
                        int i24 = i21 + i21;
                        Object obj7 = objArrCopyOf[i24];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i24 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iA3 = rpo1.A(obj7.hashCode());
                        while (true) {
                            int i25 = iA3 & i7;
                            ?? r15 = sArr[i25];
                            if (r15 == b2) {
                                sArr[i25] = i23;
                                if (i22 < i21) {
                                    objArrCopyOf[i23] = obj7;
                                    objArrCopyOf[i23 ^ 1] = obj8;
                                }
                                i22++;
                                break;
                            }
                            if (obj7.equals(objArrCopyOf[r15])) {
                                int i26 = r15 ^ 1;
                                Object obj9 = objArrCopyOf[i26 == true ? 1 : 0];
                                Objects.requireNonNull(obj9);
                                sfn1 sfn1Var6 = new sfn1(obj7, obj8, obj9);
                                objArrCopyOf[i26 == true ? 1 : 0] = obj8;
                                sfn1Var = sfn1Var6;
                                break;
                            }
                            iA3 = i25 + 1;
                            b2 = -1;
                        }
                        i21++;
                        b2 = -1;
                    }
                    if (i22 == i5) {
                        r3 = sArr;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i22), sfn1Var};
                        r3 = r6;
                    }
                }
            }
        }
        boolean z = r3 instanceof Object[];
        ?? r4 = r3;
        if (z) {
            Object[] objArr2 = (Object[]) r3;
            sfn1 sfn1Var7 = (sfn1) objArr2[c];
            if (dna1Var == null) {
                throw sfn1Var7.a();
            }
            dna1Var.c = sfn1Var7;
            Object obj10 = objArr2[0];
            int iIntValue = ((Integer) objArr2[i3]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r4 = obj10;
            i5 = iIntValue;
        }
        return new mmn1(r4, objArrCopyOf, i5, b);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00d6 A[PHI: r4 r16 r17
      0x00d6: PHI (r4v6 ??) = (r4v2 ??), (r4v4 short[]), (r4v8 ??) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r16v1 boolean) = (r16v0 boolean), (r16v0 boolean), (r16v2 boolean) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00d6: PHI (r17v1 char) = (r17v0 char), (r17v0 char), (r17v2 char) binds: [B:75:0x019a, B:57:0x0137, B:39:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r16v4 */
    /* JADX WARN: Type inference failed for: r16v5 */
    /* JADX WARN: Type inference failed for: r16v7 */
    /* JADX WARN: Type inference failed for: r16v8 */
    /* JADX WARN: Type inference failed for: r16v9 */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r4v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v21 */
    /* JADX WARN: Type inference failed for: r6v22 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static mmn1 d(int i2, Object[] objArr, dna1 dna1Var) {
        int iHighestOneBit;
        boolean z;
        char c;
        short[] sArr;
        ?? r6;
        boolean z2;
        char c2;
        ?? r16;
        int i3 = i2;
        Object[] objArrCopyOf = objArr;
        if (i3 == 0) {
            return i;
        }
        hsn1 hsn1Var = null;
        ?? r3 = 0;
        hsn1 hsn1Var2 = null;
        hsn1 hsn1Var3 = null;
        boolean z3 = false;
        byte b = 1;
        if (i3 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            return new mmn1(hsn1Var, objArrCopyOf, b, b);
        }
        r4o1.Z(i3, objArrCopyOf.length >> 1);
        char c3 = 2;
        int iMax = Math.max(i3, 2);
        if (iMax < 751619276) {
            iHighestOneBit = Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                hhg1.n("collection too large");
                return null;
            }
        }
        if (i3 == 1) {
            Objects.requireNonNull(objArrCopyOf[0]);
            Objects.requireNonNull(objArrCopyOf[1]);
            r16 = 0;
            i3 = 1;
            c = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            byte b2 = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i3) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    Object obj = objArrCopyOf[i8];
                    Objects.requireNonNull(obj);
                    Object obj2 = objArrCopyOf[i8 ^ 1];
                    Objects.requireNonNull(obj2);
                    int iE = f6o1.E(obj.hashCode());
                    while (true) {
                        int i9 = iE & i4;
                        z2 = z3;
                        c2 = c3;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = obj;
                                objArrCopyOf[i7 ^ 1] = obj2;
                            }
                            i6++;
                            break;
                        }
                        if (obj.equals(objArrCopyOf[i10 == true ? 1 : 0])) {
                            int i11 = ~i10;
                            Object obj3 = objArrCopyOf[i11 == true ? 1 : 0];
                            Objects.requireNonNull(obj3);
                            hsn1 hsn1Var4 = new hsn1(obj, obj2, obj3);
                            objArrCopyOf[i11 == true ? 1 : 0] = obj2;
                            hsn1Var2 = hsn1Var4;
                            break;
                        }
                        iE = i9 + 1;
                        z3 = z2;
                        c3 = c2;
                    }
                    i5++;
                    z3 = z2;
                    c3 = c2;
                }
                z = z3;
                c = c3;
                if (i6 == i3) {
                    r3 = bArr;
                    r16 = z;
                } else {
                    sArr = new Object[3];
                    sArr[z ? 1 : 0] = bArr;
                    sArr[1] = Integer.valueOf(i6);
                    sArr[c] = hsn1Var2;
                    r3 = sArr;
                    r16 = z;
                }
            } else {
                z = false;
                c = 2;
                if (iHighestOneBit <= 32768) {
                    sArr = new short[iHighestOneBit];
                    Arrays.fill(sArr, (short) -1);
                    int i12 = 0;
                    for (int i13 = 0; i13 < i3; i13++) {
                        int i14 = i12 + i12;
                        int i15 = i13 + i13;
                        Object obj4 = objArrCopyOf[i15];
                        Objects.requireNonNull(obj4);
                        Object obj5 = objArrCopyOf[i15 ^ 1];
                        Objects.requireNonNull(obj5);
                        int iE2 = f6o1.E(obj4.hashCode());
                        while (true) {
                            int i16 = iE2 & i4;
                            char c4 = (char) sArr[i16];
                            if (c4 == 65535) {
                                sArr[i16] = (short) i14;
                                if (i12 < i13) {
                                    objArrCopyOf[i14] = obj4;
                                    objArrCopyOf[i14 ^ 1] = obj5;
                                }
                                i12++;
                                break;
                            }
                            if (obj4.equals(objArrCopyOf[c4])) {
                                int i17 = c4 ^ 1;
                                Object obj6 = objArrCopyOf[i17 == true ? 1 : 0];
                                Objects.requireNonNull(obj6);
                                hsn1 hsn1Var5 = new hsn1(obj4, obj5, obj6);
                                objArrCopyOf[i17 == true ? 1 : 0] = obj5;
                                hsn1Var3 = hsn1Var5;
                                break;
                            }
                            iE2 = i16 + 1;
                        }
                    }
                    if (i12 == i3) {
                        r3 = sArr;
                        r16 = z;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i12), hsn1Var3};
                        r3 = r6;
                        r16 = z;
                    }
                } else {
                    sArr = new int[iHighestOneBit];
                    Arrays.fill((int[]) sArr, -1);
                    int i18 = 0;
                    int i19 = 0;
                    while (i18 < i3) {
                        int i20 = i19 + i19;
                        int i21 = i18 + i18;
                        Object obj7 = objArrCopyOf[i21];
                        Objects.requireNonNull(obj7);
                        Object obj8 = objArrCopyOf[i21 ^ 1];
                        Objects.requireNonNull(obj8);
                        int iE3 = f6o1.E(obj7.hashCode());
                        while (true) {
                            int i22 = iE3 & i4;
                            ?? r15 = sArr[i22];
                            if (r15 == b2) {
                                sArr[i22] = i20;
                                if (i19 < i18) {
                                    objArrCopyOf[i20] = obj7;
                                    objArrCopyOf[i20 ^ 1] = obj8;
                                }
                                i19++;
                                break;
                            }
                            if (obj7.equals(objArrCopyOf[r15])) {
                                int i23 = r15 ^ 1;
                                Object obj9 = objArrCopyOf[i23 == true ? 1 : 0];
                                Objects.requireNonNull(obj9);
                                hsn1 hsn1Var6 = new hsn1(obj7, obj8, obj9);
                                objArrCopyOf[i23 == true ? 1 : 0] = obj8;
                                hsn1Var = hsn1Var6;
                                break;
                            }
                            iE3 = i22 + 1;
                            b2 = -1;
                        }
                        i18++;
                        b2 = -1;
                    }
                    if (i19 == i3) {
                        r3 = sArr;
                        r16 = z;
                    } else {
                        r6 = new Object[]{sArr, Integer.valueOf(i19), hsn1Var};
                        r3 = r6;
                        r16 = z;
                    }
                }
            }
        }
        boolean z4 = r3 instanceof Object[];
        ?? r4 = r3;
        if (z4) {
            Object[] objArr2 = (Object[]) r3;
            hsn1 hsn1Var7 = (hsn1) objArr2[c];
            if (dna1Var == null) {
                throw hsn1Var7.a();
            }
            dna1Var.c = hsn1Var7;
            Object obj10 = objArr2[r16];
            int iIntValue = ((Integer) objArr2[1]).intValue();
            objArrCopyOf = Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r4 = obj10;
            i3 = iIntValue;
        }
        return new mmn1(r4, objArrCopyOf, i3, b);
    }

    @Override // java.util.Map
    public final void clear() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return get(obj) != null;
            case 1:
                return get(obj) != null;
            default:
                return get(obj) != null;
        }
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                efn1 jln1Var = (jln1) this.g;
                if (jln1Var == null) {
                    jln1Var = new jln1(1, this.d, this.c);
                    this.g = jln1Var;
                }
                return jln1Var.contains(obj);
            case 1:
                jun1 jun1Var = (jun1) this.g;
                if (jun1Var == null) {
                    jun1Var = new jun1(1, this.d, this.c);
                    this.g = jun1Var;
                }
                return jun1Var.contains(obj);
            default:
                yho1 tjo1Var = (tjo1) this.g;
                if (tjo1Var == null) {
                    tjo1Var = new tjo1(1, this.d, this.c);
                    this.g = tjo1Var;
                }
                return tjo1Var.contains(obj);
        }
    }

    @Override // java.util.Map
    public final Set entrySet() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tjn1 tjn1Var = (tjn1) this.e;
                if (tjn1Var != null) {
                    return tjn1Var;
                }
                e5n1 tjn1Var2 = new tjn1(this, this.c, this.d);
                this.e = tjn1Var2;
                return tjn1Var2;
            case 1:
                bun1 bun1Var = (bun1) this.e;
                if (bun1Var != null) {
                    return bun1Var;
                }
                bun1 bun1Var2 = new bun1(this, this.c, this.d);
                this.e = bun1Var2;
                return bun1Var2;
            default:
                kjo1 kjo1Var = (kjo1) this.e;
                if (kjo1Var != null) {
                    return kjo1Var;
                }
                e5n1 kjo1Var2 = new kjo1(this, this.c, this.d);
                this.e = kjo1Var2;
                return kjo1Var2;
        }
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            case 1:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof Map) {
                    return entrySet().equals(((Map) obj).entrySet());
                }
                return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:5:0x0016  */
    /* JADX WARN: Code duplicated, block: B:85:0x013e  */
    @Override // java.util.Map
    public final Object get(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        byte b = this.a;
        Object obj5 = this.b;
        Object[] objArr = this.c;
        int i2 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (obj == null) {
                    obj2 = null;
                } else if (i2 == 1) {
                    Object obj6 = objArr[0];
                    Objects.requireNonNull(obj6);
                    if (obj6.equals(obj)) {
                        obj2 = objArr[1];
                        Objects.requireNonNull(obj2);
                    } else {
                        obj2 = null;
                    }
                } else if (obj5 == null) {
                    obj2 = null;
                } else if (obj5 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj5;
                    int length = bArr.length - 1;
                    int iA = rpo1.A(obj.hashCode());
                    while (true) {
                        int i3 = iA & length;
                        int i4 = bArr[i3] & 255;
                        if (i4 != 255) {
                            if (obj.equals(objArr[i4])) {
                                obj2 = objArr[i4 ^ 1];
                            } else {
                                iA = i3 + 1;
                            }
                        }
                    }
                    obj2 = null;
                } else if (obj5 instanceof short[]) {
                    short[] sArr = (short[]) obj5;
                    int length2 = sArr.length - 1;
                    int iA2 = rpo1.A(obj.hashCode());
                    while (true) {
                        int i5 = iA2 & length2;
                        char c = (char) sArr[i5];
                        if (c != 65535) {
                            if (obj.equals(objArr[c])) {
                                obj2 = objArr[c ^ 1];
                            } else {
                                iA2 = i5 + 1;
                            }
                        }
                    }
                    obj2 = null;
                } else {
                    int[] iArr = (int[]) obj5;
                    int length3 = iArr.length - 1;
                    int iA3 = rpo1.A(obj.hashCode());
                    while (true) {
                        int i6 = iA3 & length3;
                        int i7 = iArr[i6];
                        if (i7 != -1) {
                            if (obj.equals(objArr[i7])) {
                                obj2 = objArr[i7 ^ 1];
                            } else {
                                iA3 = i6 + 1;
                            }
                        }
                    }
                    obj2 = null;
                }
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            case 1:
                if (obj == null) {
                    obj3 = null;
                } else if (i2 == 1) {
                    Object obj7 = objArr[0];
                    Objects.requireNonNull(obj7);
                    if (obj7.equals(obj)) {
                        obj3 = objArr[1];
                        Objects.requireNonNull(obj3);
                    } else {
                        obj3 = null;
                    }
                } else if (obj5 == null) {
                    obj3 = null;
                } else if (obj5 instanceof byte[]) {
                    byte[] bArr2 = (byte[]) obj5;
                    int length4 = bArr2.length - 1;
                    int iE = f6o1.E(obj.hashCode());
                    while (true) {
                        int i8 = iE & length4;
                        int i9 = bArr2[i8] & 255;
                        if (i9 != 255) {
                            if (obj.equals(objArr[i9])) {
                                obj3 = objArr[i9 ^ 1];
                            } else {
                                iE = i8 + 1;
                            }
                        }
                    }
                    obj3 = null;
                } else if (obj5 instanceof short[]) {
                    short[] sArr2 = (short[]) obj5;
                    int length5 = sArr2.length - 1;
                    int iE2 = f6o1.E(obj.hashCode());
                    while (true) {
                        int i10 = iE2 & length5;
                        char c2 = (char) sArr2[i10];
                        if (c2 != 65535) {
                            if (obj.equals(objArr[c2])) {
                                obj3 = objArr[c2 ^ 1];
                            } else {
                                iE2 = i10 + 1;
                            }
                        }
                    }
                    obj3 = null;
                } else {
                    int[] iArr2 = (int[]) obj5;
                    int length6 = iArr2.length - 1;
                    int iE3 = f6o1.E(obj.hashCode());
                    while (true) {
                        int i11 = iE3 & length6;
                        int i12 = iArr2[i11];
                        if (i12 != -1) {
                            if (obj.equals(objArr[i12])) {
                                obj3 = objArr[i12 ^ 1];
                            } else {
                                iE3 = i11 + 1;
                            }
                        }
                    }
                    obj3 = null;
                }
                if (obj3 == null) {
                    return null;
                }
                return obj3;
            default:
                if (obj == null) {
                    obj4 = null;
                } else if (i2 == 1) {
                    Object obj8 = objArr[0];
                    Objects.requireNonNull(obj8);
                    if (obj8.equals(obj)) {
                        obj4 = objArr[1];
                        Objects.requireNonNull(obj4);
                    } else {
                        obj4 = null;
                    }
                } else if (obj5 == null) {
                    obj4 = null;
                } else if (obj5 instanceof byte[]) {
                    byte[] bArr3 = (byte[]) obj5;
                    int length7 = bArr3.length - 1;
                    int iF = ajo1.F(obj.hashCode());
                    while (true) {
                        int i13 = iF & length7;
                        int i14 = bArr3[i13] & 255;
                        if (i14 != 255) {
                            if (obj.equals(objArr[i14])) {
                                obj4 = objArr[i14 ^ 1];
                            } else {
                                iF = i13 + 1;
                            }
                        }
                    }
                    obj4 = null;
                } else if (obj5 instanceof short[]) {
                    short[] sArr3 = (short[]) obj5;
                    int length8 = sArr3.length - 1;
                    int iF2 = ajo1.F(obj.hashCode());
                    while (true) {
                        int i15 = iF2 & length8;
                        char c3 = (char) sArr3[i15];
                        if (c3 != 65535) {
                            if (obj.equals(objArr[c3])) {
                                obj4 = objArr[c3 ^ 1];
                            } else {
                                iF2 = i15 + 1;
                            }
                        }
                    }
                    obj4 = null;
                } else {
                    int[] iArr3 = (int[]) obj5;
                    int length9 = iArr3.length - 1;
                    int iF3 = ajo1.F(obj.hashCode());
                    while (true) {
                        int i16 = iF3 & length9;
                        int i17 = iArr3[i16];
                        if (i17 != -1) {
                            if (obj.equals(objArr[i17])) {
                                obj4 = objArr[i17 ^ 1];
                            } else {
                                iF3 = i16 + 1;
                            }
                        }
                    }
                    obj4 = null;
                }
                if (obj4 == null) {
                    return null;
                }
                return obj4;
        }
    }

    @Override // java.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Object obj3 = get(obj);
                return obj3 != null ? obj3 : obj2;
            case 1:
                Object obj4 = get(obj);
                return obj4 != null ? obj4 : obj2;
            default:
                Object obj5 = get(obj);
                return obj5 != null ? obj5 : obj2;
        }
    }

    @Override // java.util.Map
    public final int hashCode() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                e5n1 tjn1Var = (tjn1) this.e;
                if (tjn1Var == null) {
                    tjn1Var = new tjn1(this, this.c, this.d);
                    this.e = tjn1Var;
                }
                Iterator it = tjn1Var.iterator();
                int iHashCode = 0;
                while (it.hasNext()) {
                    Object next = it.next();
                    iHashCode += next != null ? next.hashCode() : 0;
                }
                return iHashCode;
            case 1:
                bun1 bun1Var = (bun1) this.e;
                if (bun1Var == null) {
                    bun1Var = new bun1(this, this.c, this.d);
                    this.e = bun1Var;
                }
                Iterator it2 = bun1Var.iterator();
                int iHashCode2 = 0;
                while (it2.hasNext()) {
                    Object next2 = it2.next();
                    iHashCode2 += next2 != null ? next2.hashCode() : 0;
                }
                return iHashCode2;
            default:
                e5n1 kjo1Var = (kjo1) this.e;
                if (kjo1Var == null) {
                    kjo1Var = new kjo1(this, this.c, this.d);
                    this.e = kjo1Var;
                }
                Iterator it3 = kjo1Var.iterator();
                int iHashCode3 = 0;
                while (it3.hasNext()) {
                    Object next3 = it3.next();
                    iHashCode3 += next3 != null ? next3.hashCode() : 0;
                }
                return iHashCode3;
        }
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return size() == 0;
            case 1:
                return size() == 0;
            default:
                return size() == 0;
        }
    }

    @Override // java.util.Map
    public final Set keySet() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                lkn1 lkn1Var = (lkn1) this.f;
                if (lkn1Var != null) {
                    return lkn1Var;
                }
                e5n1 lkn1Var2 = new lkn1(this, new jln1(0, this.d, this.c));
                this.f = lkn1Var2;
                return lkn1Var2;
            case 1:
                fun1 fun1Var = (fun1) this.f;
                if (fun1Var != null) {
                    return fun1Var;
                }
                fun1 fun1Var2 = new fun1(this, new jun1(0, this.d, this.c));
                this.f = fun1Var2;
                return fun1Var2;
            default:
                qjo1 qjo1Var = (qjo1) this.f;
                if (qjo1Var != null) {
                    return qjo1Var;
                }
                e5n1 qjo1Var2 = new qjo1(this, new tjo1(0, this.d, this.c));
                this.f = qjo1Var2;
                return qjo1Var2;
        }
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Map
    public final int size() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
            case 1:
                break;
        }
        return this.d;
    }

    public final String toString() {
        boolean z = true;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                int i2 = this.d;
                if (i2 < 0) {
                    hhg1.n(f4i1.c(i2, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb = new StringBuilder((int) Math.min(((long) i2) * 8, 1073741824L));
                sb.append('{');
                for (Map.Entry entry : (tjn1) entrySet()) {
                    if (!z) {
                        sb.append(", ");
                    }
                    sb.append(entry.getKey());
                    sb.append('=');
                    sb.append(entry.getValue());
                    z = false;
                }
                sb.append('}');
                return sb.toString();
            case 1:
                int i3 = this.d;
                if (i3 < 0) {
                    hhg1.n(f4i1.c(i3, "size cannot be negative but was: "));
                    return null;
                }
                StringBuilder sb2 = new StringBuilder((int) Math.min(((long) i3) * 8, 1073741824L));
                sb2.append('{');
                for (Map.Entry entry2 : (bun1) entrySet()) {
                    if (!z) {
                        sb2.append(", ");
                    }
                    sb2.append(entry2.getKey());
                    sb2.append('=');
                    sb2.append(entry2.getValue());
                    z = false;
                }
                sb2.append('}');
                return sb2.toString();
            default:
                int i4 = this.d;
                if (i4 < 0) {
                    hhg1.n(gvg.l(new StringBuilder(String.valueOf(i4).length() + 33), "size cannot be negative but was: ", i4));
                    return null;
                }
                StringBuilder sb3 = new StringBuilder((int) Math.min(((long) i4) * 8, 1073741824L));
                sb3.append('{');
                for (Map.Entry entry3 : (kjo1) entrySet()) {
                    if (!z) {
                        sb3.append(", ");
                    }
                    sb3.append(entry3.getKey());
                    sb3.append('=');
                    sb3.append(entry3.getValue());
                    z = false;
                }
                sb3.append('}');
                return sb3.toString();
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                efn1 efn1Var = (jln1) this.g;
                if (efn1Var != null) {
                    return efn1Var;
                }
                efn1 jln1Var = new jln1(1, this.d, this.c);
                this.g = jln1Var;
                return jln1Var;
            case 1:
                jun1 jun1Var = (jun1) this.g;
                if (jun1Var != null) {
                    return jun1Var;
                }
                jun1 jun1Var2 = new jun1(1, this.d, this.c);
                this.g = jun1Var2;
                return jun1Var2;
            default:
                yho1 yho1Var = (tjo1) this.g;
                if (yho1Var != null) {
                    return yho1Var;
                }
                yho1 tjo1Var = new tjo1(1, this.d, this.c);
                this.g = tjo1Var;
                return tjo1Var;
        }
    }
}
