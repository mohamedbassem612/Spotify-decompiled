package p;

import com.google.android.gms.internal.play_billing.zzfa;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ufo1 implements sgo1 {
    public static final int[] j = new int[0];
    public static final Unsafe k = zjo1.h();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final o3o1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final fen1 i;

    public ufo1(int[] iArr, Object[] objArr, int i, int i2, o3o1 o3o1Var, int[] iArr2, int i3, int i4, fen1 fen1Var, p9n1 p9n1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = fen1Var;
        this.e = o3o1Var;
    }

    public static boolean m(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof iao1) {
            return ((iao1) obj).h();
        }
        return true;
    }

    public static int p(long j2, Object obj) {
        return ((Integer) zjo1.g(obj, j2)).intValue();
    }

    public static int r(int i) {
        return (i >>> 20) & 255;
    }

    public static long t(long j2, Object obj) {
        return ((Long) zjo1.g(obj, j2)).longValue();
    }

    public static Field y(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException e) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String string = Arrays.toString(declaredFields);
            StringBuilder sbN = gvg.n("Field ", str, " for ", name, " not found. Known fields are ");
            sbN.append(string);
            throw new RuntimeException(sbN.toString(), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:147:0x0366  */
    /* JADX WARN: Code duplicated, block: B:202:0x04af  */
    /* JADX WARN: Code duplicated, block: B:234:0x05a0  */
    /* JADX WARN: Code duplicated, block: B:237:0x05ae  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00be  */
    @Override // p.sgo1
    public final int a(o3o1 o3o1Var) {
        int i;
        int iO;
        int iP;
        int iO2;
        int iB;
        int iO3;
        int iC;
        int i2;
        int iO4;
        int i3;
        int i4;
        int iC2;
        int iO5;
        int size;
        int iO6;
        int iO7;
        int iO8;
        int iO9;
        int size2;
        int iO10;
        int iC3;
        int iO11;
        int iP2;
        int iO12;
        int iB2;
        int iP3;
        int iO13;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        int iN = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                return ((iao1) o3o1Var).zzc.a() + iN;
            }
            int iS = s(i7);
            int iR = r(iS);
            int i9 = iArr[i7];
            int i10 = iArr[i7 + 2];
            int i11 = i10 & i5;
            Unsafe unsafe = k;
            if (iR <= 17) {
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(o3o1Var, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            int i12 = iS & i5;
            if (iR >= f9o1.b.a) {
                byte b = f9o1.c.a;
            }
            long j2 = i12;
            switch (iR) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(o3o1Var, j2);
                        iO = x6o1.o(i9 << 3);
                        iP = x6o1.p(j3);
                        i3 = iP + iO;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        long j4 = unsafe.getLong(o3o1Var, j2);
                        iO = x6o1.o(i9 << 3);
                        iP = x6o1.p(j4);
                        i3 = iP + iO;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        long j5 = unsafe.getInt(o3o1Var, j2);
                        iO = x6o1.o(i9 << 3);
                        iP = x6o1.p(j5);
                        i3 = iP + iO;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 1, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        int i13 = i9 << 3;
                        Object object = unsafe.getObject(o3o1Var, j2);
                        if (object instanceof n5o1) {
                            iO2 = x6o1.o(i13);
                            iB = ((n5o1) object).e();
                        } else {
                            iO2 = x6o1.o(i13);
                            iB = pko1.b((String) object);
                        }
                        iN = lqn1.o(iB, iB, iO2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(o3o1Var, j2);
                        sgo1 sgo1VarV = v(i7);
                        fen1 fen1Var = ygo1.a;
                        iO3 = x6o1.o(i9 << 3);
                        iC = ((o3o1) object2).c(sgo1VarV);
                        iN = lqn1.o(iC, iC, iO3, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        n5o1 n5o1Var = (n5o1) unsafe.getObject(o3o1Var, j2);
                        iO2 = x6o1.o(i9 << 3);
                        iB = n5o1Var.e();
                        iN = lqn1.o(iB, iB, iO2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        i2 = unsafe.getInt(o3o1Var, j2);
                        iO4 = x6o1.o(i9 << 3);
                        iN = lqn1.n(i2, iO4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case grn1.d /* 12 */:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        long j6 = unsafe.getInt(o3o1Var, j2);
                        iO = x6o1.o(i9 << 3);
                        iP = x6o1.p(j6);
                        i3 = iP + iO;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        int i14 = unsafe.getInt(o3o1Var, j2);
                        iO4 = x6o1.o(i9 << 3);
                        i2 = (i14 >> 31) ^ (i14 + i14);
                        iN = lqn1.n(i2, iO4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        long j7 = unsafe.getLong(o3o1Var, j2);
                        iO = x6o1.o(i9 << 3);
                        iP = x6o1.p((j7 >> 63) ^ (j7 + j7));
                        i3 = iP + iO;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (l(o3o1Var, i7, i6, i8, i)) {
                        o3o1 o3o1Var2 = (o3o1) unsafe.getObject(o3o1Var, j2);
                        sgo1 sgo1VarV2 = v(i7);
                        fen1 fen1Var2 = ygo1.a;
                        int iO14 = x6o1.o(i9 << 3);
                        i4 = iO14 + iO14;
                        iC2 = o3o1Var2.c(sgo1VarV2);
                        i3 = iC2 + i4;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    i3 = ygo1.i(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    i3 = ygo1.h(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    List list = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var3 = ygo1.a;
                    if (list.size() == 0) {
                        iO5 = 0;
                    } else {
                        iO5 = (x6o1.o(i9 << 3) * list.size()) + ygo1.k(list);
                    }
                    iN += iO5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var4 = ygo1.a;
                    size = list2.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.o(list2);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var5 = ygo1.a;
                    size = list3.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.j(list3);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    i3 = ygo1.i(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    i3 = ygo1.h(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var6 = ygo1.a;
                    int size3 = list4.size();
                    if (size3 == 0) {
                        iO5 = 0;
                    } else {
                        iO5 = (x6o1.o(i9 << 3) + 1) * size3;
                    }
                    iN += iO5;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    List list5 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var7 = ygo1.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iO8 = 0;
                    } else {
                        iO8 = x6o1.o(i9 << 3) * size4;
                        if (list5 instanceof bdo1) {
                            bdo1 bdo1Var = (bdo1) list5;
                            for (int i15 = 0; i15 < size4; i15++) {
                                Object objZza = bdo1Var.zza();
                                int iE = objZza instanceof n5o1 ? ((n5o1) objZza).e() : pko1.b((String) objZza);
                                iO8 = lqn1.n(iE, iE, iO8);
                            }
                        } else {
                            for (int i16 = 0; i16 < size4; i16++) {
                                Object obj = list5.get(i16);
                                int iE2 = obj instanceof n5o1 ? ((n5o1) obj).e() : pko1.b((String) obj);
                                iO8 = lqn1.n(iE2, iE2, iO8);
                            }
                        }
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    List list6 = (List) unsafe.getObject(o3o1Var, j2);
                    sgo1 sgo1VarV3 = v(i7);
                    fen1 fen1Var8 = ygo1.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iO9 = 0;
                    } else {
                        iO9 = x6o1.o(i9 << 3) * size5;
                        for (int i17 = 0; i17 < size5; i17++) {
                            int iC4 = ((o3o1) list6.get(i17)).c(sgo1VarV3);
                            iO9 = lqn1.n(iC4, iC4, iO9);
                        }
                    }
                    iN += iO9;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    List list7 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var9 = ygo1.a;
                    int size6 = list7.size();
                    if (size6 == 0) {
                        iO8 = 0;
                    } else {
                        iO8 = x6o1.o(i9 << 3) * size6;
                        for (int i18 = 0; i18 < list7.size(); i18++) {
                            int iE3 = ((n5o1) list7.get(i18)).e();
                            iO8 = lqn1.n(iE3, iE3, iO8);
                        }
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    List list8 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var10 = ygo1.a;
                    size = list8.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.n(list8);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    List list9 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var11 = ygo1.a;
                    size = list9.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.g(list9);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    i3 = ygo1.h(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    i3 = ygo1.i(i9, (List) unsafe.getObject(o3o1Var, j2));
                    iN += i3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    List list10 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var12 = ygo1.a;
                    size = list10.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.l(list10);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    List list11 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var13 = ygo1.a;
                    size = list11.size();
                    if (size == 0) {
                        iO8 = 0;
                    } else {
                        iO6 = ygo1.m(list11);
                        iO7 = x6o1.o(i9 << 3);
                        iO8 = (iO7 * size) + iO6;
                    }
                    iN += iO8;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    List list12 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var14 = ygo1.a;
                    size2 = list12.size() * 8;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    List list13 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var15 = ygo1.a;
                    size2 = list13.size() * 4;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    size2 = ygo1.k((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    size2 = ygo1.o((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    size2 = ygo1.j((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    List list14 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var16 = ygo1.a;
                    size2 = list14.size() * 8;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    List list15 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var17 = ygo1.a;
                    size2 = list15.size() * 4;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    List list16 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var18 = ygo1.a;
                    size2 = list16.size();
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    size2 = ygo1.n((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    size2 = ygo1.g((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    List list17 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var19 = ygo1.a;
                    size2 = list17.size() * 4;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    List list18 = (List) unsafe.getObject(o3o1Var, j2);
                    fen1 fen1Var20 = ygo1.a;
                    size2 = list18.size() * 8;
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    size2 = ygo1.l((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    size2 = ygo1.m((List) unsafe.getObject(o3o1Var, j2));
                    if (size2 > 0) {
                        iO10 = x6o1.o(i9 << 3);
                        iN = lqn1.o(size2, iO10, size2, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    List list19 = (List) unsafe.getObject(o3o1Var, j2);
                    sgo1 sgo1VarV4 = v(i7);
                    fen1 fen1Var21 = ygo1.a;
                    int size7 = list19.size();
                    if (size7 == 0) {
                        iC3 = 0;
                    } else {
                        iC3 = 0;
                        for (int i19 = 0; i19 < size7; i19++) {
                            o3o1 o3o1Var3 = (o3o1) list19.get(i19);
                            int iO15 = x6o1.o(i9 << 3);
                            iC3 += o3o1Var3.c(sgo1VarV4) + iO15 + iO15;
                        }
                    }
                    iN += iC3;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    int i20 = i7 / 3;
                    leo1 leo1Var = (leo1) unsafe.getObject(o3o1Var, j2);
                    if (this.b[i20 + i20] != null) {
                        bhn0.d();
                        return 0;
                    }
                    if (leo1Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = leo1Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (n(i9, i7, o3o1Var)) {
                        long jT = t(j2, o3o1Var);
                        iO11 = x6o1.o(i9 << 3);
                        iP2 = x6o1.p(jT);
                        iN += iP2 + iO11;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (n(i9, i7, o3o1Var)) {
                        long jT2 = t(j2, o3o1Var);
                        iO11 = x6o1.o(i9 << 3);
                        iP2 = x6o1.p(jT2);
                        iN += iP2 + iO11;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (n(i9, i7, o3o1Var)) {
                        long jP = p(j2, o3o1Var);
                        iO11 = x6o1.o(i9 << 3);
                        iP2 = x6o1.p(jP);
                        iN += iP2 + iO11;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 1, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (n(i9, i7, o3o1Var)) {
                        int i21 = i9 << 3;
                        Object object3 = unsafe.getObject(o3o1Var, j2);
                        if (object3 instanceof n5o1) {
                            iO12 = x6o1.o(i21);
                            iB2 = ((n5o1) object3).e();
                        } else {
                            iO12 = x6o1.o(i21);
                            iB2 = pko1.b((String) object3);
                        }
                        iN = lqn1.o(iB2, iB2, iO12, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (n(i9, i7, o3o1Var)) {
                        Object object4 = unsafe.getObject(o3o1Var, j2);
                        sgo1 sgo1VarV5 = v(i7);
                        fen1 fen1Var22 = ygo1.a;
                        iO3 = x6o1.o(i9 << 3);
                        iC = ((o3o1) object4).c(sgo1VarV5);
                        iN = lqn1.o(iC, iC, iO3, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (n(i9, i7, o3o1Var)) {
                        n5o1 n5o1Var2 = (n5o1) unsafe.getObject(o3o1Var, j2);
                        iO12 = x6o1.o(i9 << 3);
                        iB2 = n5o1Var2.e();
                        iN = lqn1.o(iB2, iB2, iO12, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (n(i9, i7, o3o1Var)) {
                        iP3 = p(j2, o3o1Var);
                        iO13 = x6o1.o(i9 << 3);
                        iN = lqn1.n(iP3, iO13, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (n(i9, i7, o3o1Var)) {
                        long jP2 = p(j2, o3o1Var);
                        iO11 = x6o1.o(i9 << 3);
                        iP2 = x6o1.p(jP2);
                        iN += iP2 + iO11;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 4, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (n(i9, i7, o3o1Var)) {
                        iN = lqn1.n(i9 << 3, 8, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (n(i9, i7, o3o1Var)) {
                        int iP4 = p(j2, o3o1Var);
                        iO13 = x6o1.o(i9 << 3);
                        iP3 = (iP4 >> 31) ^ (iP4 + iP4);
                        iN = lqn1.n(iP3, iO13, iN);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (n(i9, i7, o3o1Var)) {
                        long jT3 = t(j2, o3o1Var);
                        iO11 = x6o1.o(i9 << 3);
                        iP2 = x6o1.p((jT3 >> 63) ^ (jT3 + jT3));
                        iN += iP2 + iO11;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (n(i9, i7, o3o1Var)) {
                        o3o1 o3o1Var4 = (o3o1) unsafe.getObject(o3o1Var, j2);
                        sgo1 sgo1VarV6 = v(i7);
                        fen1 fen1Var23 = ygo1.a;
                        int iO16 = x6o1.o(i9 << 3);
                        i4 = iO16 + iO16;
                        iC2 = o3o1Var4.c(sgo1VarV6);
                        i3 = iC2 + i4;
                        iN += i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    @Override // p.sgo1
    public final boolean b(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i4 < this.g) {
            int i6 = this.f[i4];
            int[] iArr = this.a;
            int i7 = iArr[i6];
            int iS = s(i6);
            int i8 = iArr[i6 + 2];
            int i9 = i8 & 1048575;
            int i10 = 1 << (i8 >>> 20);
            if (i9 != i5) {
                if (i9 != 1048575) {
                    i3 = k.getInt(obj, i9);
                }
                i2 = i3;
                i = i9;
            } else {
                int i11 = i3;
                i = i5;
                i2 = i11;
            }
            if ((268435456 & iS) == 0 || l(obj, i6, i, i2, i10)) {
                int iR = r(iS);
                if (iR != 9 && iR != 17) {
                    if (iR != 27) {
                        if (iR == 60 || iR == 68) {
                            if (!n(i7, i6, obj) || v(i6).b(zjo1.g(obj, iS & 1048575))) {
                            }
                        } else if (iR != 49) {
                            if (iR == 50 && !((leo1) zjo1.g(obj, iS & 1048575)).isEmpty()) {
                                int i12 = i6 / 3;
                                throw td6.k(this.b[i12 + i12]);
                            }
                        }
                        i4++;
                        i5 = i;
                        i3 = i2;
                    }
                    List list = (List) zjo1.g(obj, iS & 1048575);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        sgo1 sgo1VarV = v(i6);
                        for (int i13 = 0; i13 < list.size(); i13++) {
                            if (sgo1VarV.b(list.get(i13))) {
                            }
                        }
                    }
                    i4++;
                    i5 = i;
                    i3 = i2;
                } else if (!l(obj, i6, i, i2, i10) || v(i6).b(zjo1.g(obj, iS & 1048575))) {
                    i4++;
                    i5 = i;
                    i3 = i2;
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00db A[PHI: r1
      0x00db: PHI (r1v34 int) = (r1v10 int), (r1v35 int) binds: [B:85:0x01ea, B:43:0x00d9] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p.sgo1
    public final int c(iao1 iao1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int i4;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return iao1Var.zzc.hashCode() + (i6 * 53);
            }
            int iS = s(i5);
            int i7 = 1048575 & iS;
            int iR = r(iS);
            int i8 = iArr[i5];
            long j2 = i7;
            int i9 = 1237;
            int iHashCode = 37;
            switch (iR) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    i = i6 * 53;
                    jDoubleToLongBits = Double.doubleToLongBits(zjo1.c.j(iao1Var, j2));
                    Charset charset = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 1:
                    i2 = i6 * 53;
                    iFloatToIntBits = Float.floatToIntBits(zjo1.c.m(iao1Var, j2));
                    i6 = iFloatToIntBits + i2;
                    break;
                case 2:
                    i = i6 * 53;
                    jDoubleToLongBits = zjo1.f(iao1Var, j2);
                    Charset charset2 = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 3:
                    i = i6 * 53;
                    jDoubleToLongBits = zjo1.f(iao1Var, j2);
                    Charset charset3 = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 4:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 5:
                    i = i6 * 53;
                    jDoubleToLongBits = zjo1.f(iao1Var, j2);
                    Charset charset4 = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 6:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 7:
                    i3 = i6 * 53;
                    boolean zB = zjo1.c.B(iao1Var, j2);
                    Charset charset5 = wbo1.a;
                    if (zB) {
                        i9 = 1231;
                    }
                    i6 = i9 + i3;
                    break;
                case 8:
                    i2 = i6 * 53;
                    iFloatToIntBits = ((String) zjo1.g(iao1Var, j2)).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 9:
                    i4 = i6 * 53;
                    Object objG = zjo1.g(iao1Var, j2);
                    if (objG != null) {
                        iHashCode = objG.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 10:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case grn1.d /* 12 */:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 13:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 14:
                    i = i6 * 53;
                    jDoubleToLongBits = zjo1.f(iao1Var, j2);
                    Charset charset6 = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 15:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.e(iao1Var, j2);
                    i6 = iFloatToIntBits + i2;
                    break;
                case 16:
                    i = i6 * 53;
                    jDoubleToLongBits = zjo1.f(iao1Var, j2);
                    Charset charset7 = wbo1.a;
                    i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    break;
                case 17:
                    i4 = i6 * 53;
                    Object objG2 = zjo1.g(iao1Var, j2);
                    if (objG2 != null) {
                        iHashCode = objG2.hashCode();
                    }
                    i6 = i4 + iHashCode;
                    break;
                case 18:
                case 19:
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 50:
                    i2 = i6 * 53;
                    iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                    i6 = iFloatToIntBits + i2;
                    break;
                case 51:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(((Double) zjo1.g(iao1Var, j2)).doubleValue());
                        Charset charset8 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 52:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = Float.floatToIntBits(((Float) zjo1.g(iao1Var, j2)).floatValue());
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 53:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = t(j2, iao1Var);
                        Charset charset9 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 54:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = t(j2, iao1Var);
                        Charset charset10 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 55:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 56:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = t(j2, iao1Var);
                        Charset charset11 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 57:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 58:
                    if (n(i8, i5, iao1Var)) {
                        i3 = i6 * 53;
                        boolean zBooleanValue = ((Boolean) zjo1.g(iao1Var, j2)).booleanValue();
                        Charset charset12 = wbo1.a;
                        if (zBooleanValue) {
                            i9 = 1231;
                        }
                        i6 = i9 + i3;
                    }
                    break;
                case 59:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = ((String) zjo1.g(iao1Var, j2)).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 60:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 61:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 62:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 63:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 64:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 65:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = t(j2, iao1Var);
                        Charset charset13 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 66:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = p(j2, iao1Var);
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
                case 67:
                    if (n(i8, i5, iao1Var)) {
                        i = i6 * 53;
                        jDoubleToLongBits = t(j2, iao1Var);
                        Charset charset14 = wbo1.a;
                        i6 = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                    }
                    break;
                case 68:
                    if (n(i8, i5, iao1Var)) {
                        i2 = i6 * 53;
                        iFloatToIntBits = zjo1.g(iao1Var, j2).hashCode();
                        i6 = iFloatToIntBits + i2;
                    }
                    break;
            }
            i5 += 3;
        }
    }

    @Override // p.sgo1
    public final boolean d(iao1 iao1Var, iao1 iao1Var2) {
        boolean zF;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iS = s(i);
                long j2 = iS & 1048575;
                switch (r(iS)) {
                    case SplitInstallErrorCode.NO_ERROR /* 0 */:
                        if (j(iao1Var, iao1Var2, i)) {
                            zkh1 zkh1Var = zjo1.c;
                            if (Double.doubleToLongBits(zkh1Var.j(iao1Var, j2)) == Double.doubleToLongBits(zkh1Var.j(iao1Var2, j2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 1:
                        if (j(iao1Var, iao1Var2, i)) {
                            zkh1 zkh1Var2 = zjo1.c;
                            if (Float.floatToIntBits(zkh1Var2.m(iao1Var, j2)) == Float.floatToIntBits(zkh1Var2.m(iao1Var2, j2))) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 2:
                        if (j(iao1Var, iao1Var2, i) && zjo1.f(iao1Var, j2) == zjo1.f(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 3:
                        if (j(iao1Var, iao1Var2, i) && zjo1.f(iao1Var, j2) == zjo1.f(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 4:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 5:
                        if (j(iao1Var, iao1Var2, i) && zjo1.f(iao1Var, j2) == zjo1.f(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 6:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 7:
                        if (j(iao1Var, iao1Var2, i)) {
                            zkh1 zkh1Var3 = zjo1.c;
                            if (zkh1Var3.B(iao1Var, j2) == zkh1Var3.B(iao1Var2, j2)) {
                                continue;
                                i += 3;
                            }
                        }
                        break;
                    case 8:
                        if (j(iao1Var, iao1Var2, i) && ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 9:
                        if (j(iao1Var, iao1Var2, i) && ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 10:
                        if (j(iao1Var, iao1Var2, i) && ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case grn1.d /* 12 */:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 13:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 14:
                        if (j(iao1Var, iao1Var2, i) && zjo1.f(iao1Var, j2) == zjo1.f(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 15:
                        if (j(iao1Var, iao1Var2, i) && zjo1.e(iao1Var, j2) == zjo1.e(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 16:
                        if (j(iao1Var, iao1Var2, i) && zjo1.f(iao1Var, j2) == zjo1.f(iao1Var2, j2)) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 17:
                        if (j(iao1Var, iao1Var2, i) && ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    case 18:
                    case 19:
                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case 48:
                    case 49:
                        zF = ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2));
                        break;
                    case 50:
                        zF = ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2));
                        break;
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case 60:
                    case 61:
                    case 62:
                    case 63:
                    case 64:
                    case 65:
                    case 66:
                    case 67:
                    case 68:
                        long j3 = iArr[i + 2] & 1048575;
                        if (zjo1.e(iao1Var, j3) == zjo1.e(iao1Var2, j3) && ygo1.f(zjo1.g(iao1Var, j2), zjo1.g(iao1Var2, j2))) {
                            continue;
                            i += 3;
                        }
                        break;
                    default:
                        continue;
                        i += 3;
                        break;
                }
                if (zF) {
                    i += 3;
                }
            } else if (iao1Var.zzc.equals(iao1Var2.zzc)) {
                return true;
            }
        }
        return false;
    }

    @Override // p.sgo1
    public final void e(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        o(obj, bArr, i, i2, 0, qhn1Var);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // p.sgo1
    public final void f(Object obj, qeh1 qeh1Var) throws zzfa {
        int i;
        int i2;
        int i3;
        int i4;
        x6o1 x6o1Var = (x6o1) qeh1Var.b;
        int i5 = 1048575;
        int i6 = 1048575;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i7 >= iArr.length) {
                ((iao1) obj).zzc.d(qeh1Var);
                return;
            }
            int iS = s(i7);
            int iR = r(iS);
            int i9 = iArr[i7];
            Unsafe unsafe = k;
            if (iR <= 17) {
                int i10 = iArr[i7 + 2];
                int i11 = i10 & i5;
                if (i11 != i6) {
                    i8 = i11 == i5 ? 0 : unsafe.getInt(obj, i11);
                    i6 = i11;
                }
                i = 1 << (i10 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iS & i5;
            char c = 3;
            switch (iR) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.f(i9, Double.doubleToRawLongBits(zjo1.c.j(obj, j2)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 1:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.d(i9, Float.floatToRawIntBits(zjo1.c.m(obj, j2)));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 2:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.m(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 3:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.m(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 4:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.h(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 5:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.f(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 6:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.d(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 7:
                    if (l(obj, i7, i6, i8, i)) {
                        boolean zB = zjo1.c.B(obj, j2);
                        x6o1Var.l(i9 << 3);
                        x6o1Var.a(zB ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 8:
                    if (l(obj, i7, i6, i8, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            String str = (String) object;
                            x6o1Var.l((i9 << 3) | 2);
                            int i12 = x6o1Var.c;
                            byte[] bArr = x6o1Var.b;
                            int i13 = x6o1Var.d;
                            try {
                                int iO = x6o1.o(str.length() * 3);
                                int iO2 = x6o1.o(str.length());
                                if (iO2 == iO) {
                                    int i14 = i13 + iO2;
                                    x6o1Var.d = i14;
                                    int iA = pko1.a(str, bArr, i14, i12 - i14);
                                    x6o1Var.d = i13;
                                    x6o1Var.l((iA - i13) - iO2);
                                    x6o1Var.d = iA;
                                } else {
                                    x6o1Var.l(pko1.b(str));
                                    int i15 = x6o1Var.d;
                                    x6o1Var.d = pko1.a(str, bArr, i15, i12 - i15);
                                }
                            } catch (IndexOutOfBoundsException e) {
                                throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e);
                            }
                        } else {
                            x6o1Var.c(i9, (n5o1) object);
                        }
                    } else {
                        continue;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 9:
                    if (l(obj, i7, i6, i8, i)) {
                        qeh1Var.c(i9, unsafe.getObject(obj, j2), v(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 10:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.c(i9, (n5o1) unsafe.getObject(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.k(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case grn1.d /* 12 */:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.h(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 13:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.d(i9, unsafe.getInt(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 14:
                    if (l(obj, i7, i6, i8, i)) {
                        x6o1Var.f(i9, unsafe.getLong(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 15:
                    if (l(obj, i7, i6, i8, i)) {
                        int i16 = unsafe.getInt(obj, j2);
                        x6o1Var.k(i9, (i16 >> 31) ^ (i16 + i16));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 16:
                    if (l(obj, i7, i6, i8, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        x6o1Var.m(i9, (j3 >> 63) ^ (j3 + j3));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 17:
                    if (l(obj, i7, i6, i8, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        x6o1Var.j(i9, 3);
                        v(i7).f((o3o1) object2, qeh1Var);
                        x6o1Var.j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 18:
                    i2 = i7;
                    ygo1.r(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 19:
                    i2 = i7;
                    ygo1.v(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                    i2 = i7;
                    ygo1.x(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 21:
                    i2 = i7;
                    ygo1.e(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 22:
                    i2 = i7;
                    ygo1.w(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 23:
                    i2 = i7;
                    ygo1.u(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 24:
                    i2 = i7;
                    ygo1.t(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 25:
                    i2 = i7;
                    ygo1.q(iArr[i2], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 = i2;
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 26:
                    int i17 = iArr[i7];
                    List list = (List) unsafe.getObject(obj, j2);
                    fen1 fen1Var = ygo1.a;
                    if (list != null && !list.isEmpty()) {
                        byte[] bArr2 = x6o1Var.b;
                        int i18 = x6o1Var.c;
                        if (list instanceof bdo1) {
                            bdo1 bdo1Var = (bdo1) list;
                            int i19 = 0;
                            while (i19 < list.size()) {
                                Object objZza = bdo1Var.zza();
                                char c2 = c;
                                if (objZza instanceof String) {
                                    String str2 = (String) objZza;
                                    x6o1Var.l((i17 << 3) | 2);
                                    int i20 = x6o1Var.d;
                                    try {
                                        int iO3 = x6o1.o(str2.length() * 3);
                                        i4 = i7;
                                        int iO4 = x6o1.o(str2.length());
                                        if (iO4 == iO3) {
                                            int i21 = i20 + iO4;
                                            x6o1Var.d = i21;
                                            int iA2 = pko1.a(str2, bArr2, i21, i18 - i21);
                                            x6o1Var.d = i20;
                                            x6o1Var.l((iA2 - i20) - iO4);
                                            x6o1Var.d = iA2;
                                        } else {
                                            x6o1Var.l(pko1.b(str2));
                                            int i22 = x6o1Var.d;
                                            x6o1Var.d = pko1.a(str2, bArr2, i22, i18 - i22);
                                        }
                                    } catch (IndexOutOfBoundsException e2) {
                                        throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e2);
                                    }
                                } else {
                                    i4 = i7;
                                    x6o1Var.c(i17, (n5o1) objZza);
                                }
                                i19++;
                                c = c2;
                                i7 = i4;
                            }
                            i3 = i7;
                        } else {
                            i3 = i7;
                            for (int i23 = 0; i23 < list.size(); i23++) {
                                String str3 = (String) list.get(i23);
                                x6o1Var.l((i17 << 3) | 2);
                                int i24 = x6o1Var.d;
                                try {
                                    int iO5 = x6o1.o(str3.length() * 3);
                                    int iO6 = x6o1.o(str3.length());
                                    if (iO6 == iO5) {
                                        int i25 = i24 + iO6;
                                        x6o1Var.d = i25;
                                        int iA3 = pko1.a(str3, bArr2, i25, i18 - i25);
                                        x6o1Var.d = i24;
                                        x6o1Var.l((iA3 - i24) - iO6);
                                        x6o1Var.d = iA3;
                                    } else {
                                        x6o1Var.l(pko1.b(str3));
                                        int i26 = x6o1Var.d;
                                        x6o1Var.d = pko1.a(str3, bArr2, i26, i18 - i26);
                                    }
                                } catch (IndexOutOfBoundsException e3) {
                                    throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e3);
                                }
                            }
                        }
                        i7 = i3;
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 27:
                    int i27 = iArr[i7];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    sgo1 sgo1VarV = v(i7);
                    fen1 fen1Var2 = ygo1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i28 = 0; i28 < list2.size(); i28++) {
                            qeh1Var.c(i27, list2.get(i28), sgo1VarV);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 28:
                    int i29 = iArr[i7];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    fen1 fen1Var3 = ygo1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i30 = 0; i30 < list3.size(); i30++) {
                            x6o1Var.c(i29, (n5o1) list3.get(i30));
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 29:
                    ygo1.d(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 30:
                    ygo1.s(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 31:
                    ygo1.y(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 32:
                    ygo1.a(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 33:
                    ygo1.b(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 34:
                    ygo1.c(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, false);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 35:
                    ygo1.r(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 36:
                    ygo1.v(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 37:
                    ygo1.x(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 38:
                    ygo1.e(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 39:
                    ygo1.w(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 40:
                    ygo1.u(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 41:
                    ygo1.t(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 42:
                    ygo1.q(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 43:
                    ygo1.d(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 44:
                    ygo1.s(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 45:
                    ygo1.y(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 46:
                    ygo1.a(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 47:
                    ygo1.b(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 48:
                    ygo1.c(iArr[i7], (List) unsafe.getObject(obj, j2), qeh1Var, true);
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 49:
                    int i31 = iArr[i7];
                    List list4 = (List) unsafe.getObject(obj, j2);
                    sgo1 sgo1VarV2 = v(i7);
                    fen1 fen1Var4 = ygo1.a;
                    if (list4 != null && !list4.isEmpty()) {
                        for (int i32 = 0; i32 < list4.size(); i32++) {
                            o3o1 o3o1Var = (o3o1) list4.get(i32);
                            x6o1Var.j(i31, 3);
                            sgo1VarV2.f(o3o1Var, qeh1Var);
                            x6o1Var.j(i31, 4);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 50:
                    if (unsafe.getObject(obj, j2) != null) {
                        int i33 = i7 / 3;
                        throw td6.k(this.b[i33 + i33]);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 51:
                    if (n(i9, i7, obj)) {
                        x6o1Var.f(i9, Double.doubleToRawLongBits(((Double) zjo1.g(obj, j2)).doubleValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 52:
                    if (n(i9, i7, obj)) {
                        x6o1Var.d(i9, Float.floatToRawIntBits(((Float) zjo1.g(obj, j2)).floatValue()));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 53:
                    if (n(i9, i7, obj)) {
                        x6o1Var.m(i9, t(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 54:
                    if (n(i9, i7, obj)) {
                        x6o1Var.m(i9, t(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 55:
                    if (n(i9, i7, obj)) {
                        x6o1Var.h(i9, p(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 56:
                    if (n(i9, i7, obj)) {
                        x6o1Var.f(i9, t(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 57:
                    if (n(i9, i7, obj)) {
                        x6o1Var.d(i9, p(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 58:
                    if (n(i9, i7, obj)) {
                        boolean zBooleanValue = ((Boolean) zjo1.g(obj, j2)).booleanValue();
                        x6o1Var.l(i9 << 3);
                        x6o1Var.a(zBooleanValue ? (byte) 1 : (byte) 0);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 59:
                    if (n(i9, i7, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            String str4 = (String) object3;
                            x6o1Var.l((i9 << 3) | 2);
                            int i34 = x6o1Var.c;
                            byte[] bArr3 = x6o1Var.b;
                            int i35 = x6o1Var.d;
                            try {
                                int iO7 = x6o1.o(str4.length() * 3);
                                int iO8 = x6o1.o(str4.length());
                                if (iO8 == iO7) {
                                    int i36 = i35 + iO8;
                                    x6o1Var.d = i36;
                                    int iA4 = pko1.a(str4, bArr3, i36, i34 - i36);
                                    x6o1Var.d = i35;
                                    x6o1Var.l((iA4 - i35) - iO8);
                                    x6o1Var.d = iA4;
                                } else {
                                    x6o1Var.l(pko1.b(str4));
                                    int i37 = x6o1Var.d;
                                    x6o1Var.d = pko1.a(str4, bArr3, i37, i34 - i37);
                                }
                            } catch (IndexOutOfBoundsException e4) {
                                throw new zzfa("CodedOutputStream was writing to a flat byte array and ran out of space.", e4);
                            }
                        } else {
                            x6o1Var.c(i9, (n5o1) object3);
                        }
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 60:
                    if (n(i9, i7, obj)) {
                        qeh1Var.c(i9, unsafe.getObject(obj, j2), v(i7));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 61:
                    if (n(i9, i7, obj)) {
                        x6o1Var.c(i9, (n5o1) unsafe.getObject(obj, j2));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 62:
                    if (n(i9, i7, obj)) {
                        x6o1Var.k(i9, p(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 63:
                    if (n(i9, i7, obj)) {
                        x6o1Var.h(i9, p(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 64:
                    if (n(i9, i7, obj)) {
                        x6o1Var.d(i9, p(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 65:
                    if (n(i9, i7, obj)) {
                        x6o1Var.f(i9, t(j2, obj));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 66:
                    if (n(i9, i7, obj)) {
                        int iP = p(j2, obj);
                        x6o1Var.k(i9, (iP >> 31) ^ (iP + iP));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 67:
                    if (n(i9, i7, obj)) {
                        long jT = t(j2, obj);
                        x6o1Var.m(i9, (jT >> 63) ^ (jT + jT));
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                case 68:
                    if (n(i9, i7, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        x6o1Var.j(i9, 3);
                        v(i7).f((o3o1) object4, qeh1Var);
                        x6o1Var.j(i9, 4);
                    }
                    i7 += 3;
                    i5 = 1048575;
                    break;
                default:
                    i7 += 3;
                    i5 = 1048575;
                    break;
            }
        }
    }

    public final void g(int i, Object obj, Object obj2) {
        if (k(i, obj2)) {
            long jS = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                eg.m(ab80.n("Source subfield ", " is present but null: ", this.a[i], obj2.toString()));
                return;
            }
            sgo1 sgo1VarV = v(i);
            if (!k(i, obj)) {
                if (m(object)) {
                    iao1 iao1VarZze = sgo1VarV.zze();
                    sgo1VarV.zzg(iao1VarZze, object);
                    unsafe.putObject(obj, jS, iao1VarZze);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                i(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!m(object2)) {
                iao1 iao1VarZze2 = sgo1VarV.zze();
                sgo1VarV.zzg(iao1VarZze2, object2);
                unsafe.putObject(obj, jS, iao1VarZze2);
                object2 = iao1VarZze2;
            }
            sgo1VarV.zzg(object2, object);
        }
    }

    public final void h(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (n(i2, i, obj2)) {
            long jS = s(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jS);
            if (object == null) {
                eg.m(ab80.n("Source subfield ", " is present but null: ", iArr[i], obj2.toString()));
                return;
            }
            sgo1 sgo1VarV = v(i);
            if (!n(i2, i, obj)) {
                if (m(object)) {
                    iao1 iao1VarZze = sgo1VarV.zze();
                    sgo1VarV.zzg(iao1VarZze, object);
                    unsafe.putObject(obj, jS, iao1VarZze);
                } else {
                    unsafe.putObject(obj, jS, object);
                }
                zjo1.i(obj, iArr[i + 2] & 1048575, i2);
                return;
            }
            Object object2 = unsafe.getObject(obj, jS);
            if (!m(object2)) {
                iao1 iao1VarZze2 = sgo1VarV.zze();
                sgo1VarV.zzg(iao1VarZze2, object2);
                unsafe.putObject(obj, jS, iao1VarZze2);
                object2 = iao1VarZze2;
            }
            sgo1VarV.zzg(object2, object);
        }
    }

    public final void i(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        zjo1.i(obj, j2, (1 << (i2 >>> 20)) | zjo1.e(obj, j2));
    }

    public final boolean j(iao1 iao1Var, iao1 iao1Var2, int i) {
        return k(i, iao1Var) == k(i, iao1Var2);
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00f5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00f6 A[RETURN] */
    public final boolean k(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & zjo1.e(obj, j2)) != 0) {
                return true;
            }
            return false;
        }
        int iS = s(i);
        long j3 = iS & 1048575;
        switch (r(iS)) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                if (Double.doubleToRawLongBits(zjo1.c.j(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(zjo1.c.m(obj, j3)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (zjo1.f(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (zjo1.f(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (zjo1.f(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 7:
                return zjo1.c.B(obj, j3);
            case 8:
                Object objG = zjo1.g(obj, j3);
                if (objG instanceof String) {
                    if (((String) objG).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objG instanceof n5o1)) {
                    bhn0.q();
                    return false;
                }
                if (n5o1.b.equals(objG)) {
                    return false;
                }
                return true;
            case 9:
                if (zjo1.g(obj, j3) != null) {
                    return true;
                }
                return false;
            case 10:
                if (n5o1.b.equals(zjo1.g(obj, j3))) {
                    return false;
                }
                return true;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case grn1.d /* 12 */:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (zjo1.f(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (zjo1.e(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (zjo1.f(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (zjo1.g(obj, j3) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final boolean l(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return k(i, obj);
        }
        return (i3 & i4) != 0;
    }

    public final boolean n(int i, int i2, Object obj) {
        return zjo1.e(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02b4  */
    /* JADX WARN: Code duplicated, block: B:102:0x02b8 A[LOOP:14: B:99:0x02b2->B:102:0x02b8, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:107:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ff  */
    /* JADX WARN: Code duplicated, block: B:120:0x0303  */
    /* JADX WARN: Code duplicated, block: B:122:0x0313  */
    /* JADX WARN: Code duplicated, block: B:124:0x031d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:125:0x031f  */
    /* JADX WARN: Code duplicated, block: B:126:0x0320 A[PHI: r3
      0x0320: PHI (r3v58 byte) = (r3v35 byte), (r3v67 byte) binds: [B:123:0x031b, B:125:0x031f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:128:0x0324 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:129:0x0326  */
    /* JADX WARN: Code duplicated, block: B:130:0x0327 A[PHI: r3
      0x0327: PHI (r3v59 byte) = (r3v58 byte), (r3v66 byte) binds: [B:127:0x0322, B:129:0x0326] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:132:0x032d  */
    /* JADX WARN: Code duplicated, block: B:138:0x0352  */
    /* JADX WARN: Code duplicated, block: B:140:0x0358  */
    /* JADX WARN: Code duplicated, block: B:142:0x036a  */
    /* JADX WARN: Code duplicated, block: B:516:0x0ce4 A[PHI: r1 r4 r6 r9 r12 r21
      0x0ce4: PHI (r1v80 byte[]) = (r1v79 byte[]), (r1v81 byte[]) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]
      0x0ce4: PHI (r4v105 int) = (r4v104 int), (r4v106 int) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]
      0x0ce4: PHI (r6v82 p.qhn1) = (r6v81 p.qhn1), (r6v83 p.qhn1) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]
      0x0ce4: PHI (r9v64 int) = (r9v63 int), (r9v65 int) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]
      0x0ce4: PHI (r12v22 int) = (r12v21 int), (r12v23 int) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]
      0x0ce4: PHI (r21v35 int) = (r21v34 int), (r21v36 int) binds: [B:518:0x0cf2, B:503:0x0cab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:542:0x0dda A[PHI: r1 r4 r6 r9 r12 r17 r21
      0x0dda: PHI (r1v109 byte[]) = 
      (r1v73 byte[])
      (r1v74 byte[])
      (r1v75 byte[])
      (r1v76 byte[])
      (r1v77 byte[])
      (r1v78 byte[])
      (r1v80 byte[])
      (r1v83 byte[])
      (r1v91 byte[])
      (r1v99 byte[])
      (r1v110 byte[])
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r4v120 int) = 
      (r4v98 int)
      (r4v99 int)
      (r4v100 int)
      (r4v101 int)
      (r4v102 int)
      (r4v103 int)
      (r4v105 int)
      (r4v107 int)
      (r4v111 int)
      (r4v116 int)
      (r4v121 int)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r6v97 p.qhn1) = 
      (r6v75 p.qhn1)
      (r6v76 p.qhn1)
      (r6v77 p.qhn1)
      (r6v78 p.qhn1)
      (r6v79 p.qhn1)
      (r6v80 p.qhn1)
      (r6v82 p.qhn1)
      (r6v84 p.qhn1)
      (r6v88 p.qhn1)
      (r6v93 p.qhn1)
      (r6v98 p.qhn1)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r9v91 int) = 
      (r9v57 int)
      (r9v58 int)
      (r9v59 int)
      (r9v60 int)
      (r9v61 int)
      (r9v62 int)
      (r9v64 int)
      (r9v67 int)
      (r9v75 int)
      (r9v82 int)
      (r9v92 int)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r12v39 int) = 
      (r12v15 int)
      (r12v16 int)
      (r12v17 int)
      (r12v18 int)
      (r12v19 int)
      (r12v20 int)
      (r12v22 int)
      (r12v24 int)
      (r12v32 int)
      (r12v36 int)
      (r12v40 int)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r17v53 p.cjo1) = 
      (r17v29 p.cjo1)
      (r17v30 p.cjo1)
      (r17v31 p.cjo1)
      (r17v32 p.cjo1)
      (r17v33 p.cjo1)
      (r17v34 p.cjo1)
      (r17v36 p.cjo1)
      (r17v42 p.cjo1)
      (r17v46 p.cjo1)
      (r17v50 p.cjo1)
      (r17v54 p.cjo1)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]
      0x0dda: PHI (r21v49 int) = 
      (r21v28 int)
      (r21v29 int)
      (r21v30 int)
      (r21v31 int)
      (r21v32 int)
      (r21v33 int)
      (r21v35 int)
      (r21v37 int)
      (r21v40 int)
      (r21v45 int)
      (r21v50 int)
     binds: [B:540:0x0dc3, B:537:0x0d9f, B:534:0x0d7f, B:531:0x0d5f, B:528:0x0d3f, B:525:0x0d1e, B:516:0x0ce4, B:501:0x0c94, B:480:0x0be5, B:475:0x0bb4, B:466:0x0b34] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:544:0x0ddd  */
    /* JADX WARN: Code duplicated, block: B:546:0x0dee  */
    /* JADX WARN: Code duplicated, block: B:548:0x0df5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:553:0x0e0c  */
    /* JADX WARN: Code duplicated, block: B:628:0x0aae A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:646:0x02f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:649:0x034c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:650:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:651:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:652:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:653:0x0346 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:654:0x03b1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:655:0x03ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:682:0x0abf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:731:0x02c4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:733:0x02ab A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:734:0x02fb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:735:0x02ca A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:742:0x02c1 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x02a3  */
    /* JADX WARN: Multi-variable type inference failed */
    public final int o(Object obj, byte[] bArr, int i, int i2, int i3, qhn1 qhn1Var) {
        int i4;
        int[] iArr;
        Object[] objArr;
        Object obj2;
        Unsafe unsafe;
        int i5;
        int i6;
        int i7;
        int i8;
        int iB;
        byte[] bArr2;
        iao1 iao1Var;
        cjo1 cjo1VarB;
        int i9;
        byte[] bArr3;
        int i10;
        int i11;
        qhn1 qhn1Var2;
        Unsafe unsafe2;
        qhn1 qhn1Var3;
        Object obj3;
        Unsafe unsafe3;
        int iC;
        int i12;
        int i13;
        int i14;
        byte b;
        byte b2;
        int i15;
        int i16;
        byte b3;
        int i17;
        byte b4;
        int i18;
        byte b5;
        byte[] bArr4;
        qhn1 qhn1Var4;
        Object obj4;
        Unsafe unsafe4;
        Unsafe unsafe5;
        int i19;
        int i20;
        cjo1 cjo1Var;
        int i21;
        int i22;
        int i23;
        int i24;
        byte[] bArr5;
        int i25;
        int iX;
        int i26;
        cjo1 cjo1Var2;
        int iC2;
        leo1 leo1Var;
        Unsafe unsafe6;
        cjo1 cjo1Var3;
        int i27;
        int i28;
        int i29;
        int iA;
        String str;
        int i30;
        int i31;
        cjo1 cjo1Var4;
        int i32;
        int iC3;
        int i33;
        cjo1 cjo1Var5;
        int i34;
        int iE;
        ebo1 ebo1Var;
        int i35;
        c3o1 c3o1Var;
        cjo1 cjo1VarB2;
        Unsafe unsafe7;
        int i36;
        cjo1 cjo1Var6;
        int i37;
        ufo1 ufo1Var = this;
        Object obj5 = obj;
        byte[] bArr6 = bArr;
        i2 = i2;
        qhn1Var = qhn1Var;
        if (!m(obj5)) {
            hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj5)));
            return 0;
        }
        int iZ = i;
        int i38 = -1;
        int iQ = 0;
        int i39 = 1048575;
        int i40 = 0;
        int i41 = 0;
        while (true) {
            Object[] objArr2 = ufo1Var.b;
            int[] iArr2 = ufo1Var.a;
            Unsafe unsafe8 = k;
            if (iZ < i2) {
                int iD = iZ + 1;
                int i42 = bArr6[iZ];
                if (i42 < 0) {
                    iD = zgo1.D(i42, iD, qhn1Var, bArr6);
                    i42 = qhn1Var.a;
                }
                int i43 = iD;
                i41 = i42;
                int i44 = (i41 == true ? 1 : 0) >>> 3;
                int i45 = ufo1Var.d;
                int i46 = ufo1Var.c;
                iQ = i44 > i38 ? (i44 < i46 || i44 > i45) ? -1 : ufo1Var.q(i44, iQ / 3) : (i44 < i46 || i44 > i45) ? -1 : ufo1Var.q(i44, 0);
                cjo1 cjo1Var7 = cjo1.f;
                if (iQ == -1) {
                    cjo1Var7 = cjo1Var7;
                    i5 = i43;
                    i4 = i39;
                    i6 = i40;
                    iArr = iArr2;
                    objArr = objArr2;
                    iQ = 0;
                    i7 = i44;
                    obj2 = obj5;
                    unsafe = unsafe8;
                    i8 = i41 == true ? 1 : 0;
                } else {
                    boolean z = (i41 == true ? 1 : 0) & 7;
                    int i47 = iArr2[iQ + 1];
                    int iR = r(i47);
                    long j2 = i47 & 1048575;
                    Unsafe unsafe9 = k;
                    String str2 = "";
                    if (iR <= 17) {
                        int i48 = iArr2[iQ + 2];
                        int i49 = 1 << (i48 >>> 20);
                        int i50 = i48 & 1048575;
                        iArr = iArr2;
                        if (i50 != i39) {
                            int i51 = 1048575;
                            if (i39 != 1048575) {
                                unsafe8.putInt(obj5, i39, i40);
                                i51 = 1048575;
                            }
                            int i52 = i50 == i51 ? 0 : unsafe8.getInt(obj5, i50);
                            i9 = i50;
                            i40 = i52;
                        } else {
                            i9 = i39;
                        }
                        switch (iR) {
                            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                                bArr3 = bArr;
                                i10 = i43;
                                i40 = i40;
                                i11 = i9;
                                i7 = i44;
                                qhn1Var2 = qhn1Var;
                                cjo1Var7 = cjo1Var7;
                                unsafe2 = unsafe8;
                                if (z == 1) {
                                    zjo1.c.v(obj5, j2, Double.longBitsToDouble(zgo1.I(bArr3, i10)));
                                    iZ = i10 + 8;
                                    i38 = i7;
                                    qhn1Var = qhn1Var2;
                                    bArr6 = bArr3;
                                    i40 |= i49;
                                    i39 = i11;
                                } else {
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3 || i3 == 0) {
                                        iao1Var = (iao1) obj2;
                                        cjo1VarB = iao1Var.zzc;
                                        if (cjo1VarB == cjo1Var7) {
                                            cjo1VarB = cjo1.b();
                                            iao1Var.zzc = cjo1VarB;
                                        }
                                        cjo1 cjo1Var8 = cjo1VarB;
                                        byte[] bArr7 = bArr2;
                                        int i53 = i8;
                                        iB = zgo1.B(i53 == true ? 1 : 0, bArr7, i5, i2, cjo1Var8, qhn1Var);
                                        bArr6 = bArr;
                                        qhn1Var = qhn1Var;
                                        i41 = i53 == true ? 1 : 0;
                                        i2 = i2;
                                        obj5 = obj2;
                                        i38 = i7;
                                        i40 = i6;
                                        i39 = i4;
                                        iZ = iB;
                                        ufo1Var = this;
                                    } else {
                                        i2 = i2;
                                        iZ = i5;
                                        i41 = i8;
                                        i40 = i6;
                                    }
                                }
                                break;
                            case 1:
                                bArr3 = bArr;
                                i10 = i43;
                                i40 = i40;
                                i11 = i9;
                                i7 = i44;
                                qhn1Var2 = qhn1Var;
                                cjo1Var7 = cjo1Var7;
                                unsafe2 = unsafe8;
                                if (z == 5) {
                                    iZ = i10 + 4;
                                    zjo1.c.z(obj5, j2, Float.intBitsToFloat(zgo1.y(bArr3, i10)));
                                    i38 = i7;
                                    qhn1Var = qhn1Var2;
                                    i39 = i11;
                                    i40 |= i49;
                                    bArr6 = bArr3;
                                    i41 = i41;
                                } else {
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var9 = cjo1VarB;
                                    byte[] bArr8 = bArr2;
                                    int i54 = i8;
                                    iB = zgo1.B(i54 == true ? 1 : 0, bArr8, i5, i2, cjo1Var9, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i54 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 2:
                            case 3:
                                i40 = i40;
                                i7 = i44;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                qhn1Var2 = qhn1Var;
                                if (z == 0) {
                                    int iF = zgo1.F(bArr3, i10, qhn1Var2);
                                    unsafe5.putLong(obj5, j2, qhn1Var2.b);
                                    iZ = iF;
                                    i38 = i7;
                                    qhn1Var = qhn1Var2;
                                    bArr6 = bArr3;
                                    i39 = i11;
                                    i41 = i41;
                                    i40 |= i49;
                                    iQ = iQ;
                                } else {
                                    unsafe2 = unsafe5;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var10 = cjo1VarB;
                                    byte[] bArr9 = bArr2;
                                    int i55 = i8;
                                    iB = zgo1.B(i55 == true ? 1 : 0, bArr9, i5, i2, cjo1Var10, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i55 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 4:
                            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                                i40 = i40;
                                i7 = i44;
                                bArr3 = bArr;
                                unsafe5 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                qhn1Var2 = qhn1Var;
                                if (z == 0) {
                                    int iC4 = zgo1.C(bArr3, i10, qhn1Var2);
                                    unsafe5.putInt(obj5, j2, qhn1Var2.a);
                                    iZ = iC4;
                                    i38 = i7;
                                    iQ = iQ;
                                    qhn1Var = qhn1Var2;
                                    bArr6 = bArr3;
                                    i39 = i11;
                                    i41 = i41;
                                    i40 |= i49;
                                    i2 = i2;
                                } else {
                                    unsafe2 = unsafe5;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var11 = cjo1VarB;
                                    byte[] bArr10 = bArr2;
                                    int i56 = i8;
                                    iB = zgo1.B(i56 == true ? 1 : 0, bArr10, i5, i2, cjo1Var11, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i56 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 5:
                            case 14:
                                bArr3 = bArr;
                                qhn1Var3 = qhn1Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                i40 = i40;
                                i7 = i44;
                                if (z == 1) {
                                    obj5 = obj3;
                                    unsafe3.putLong(obj5, j2, zgo1.I(bArr3, i10));
                                    i2 = i2;
                                    iZ = i10 + 8;
                                    i38 = i7;
                                    iQ = iQ;
                                    qhn1Var = qhn1Var3;
                                    bArr6 = bArr3;
                                    i40 |= i49;
                                    i39 = i11;
                                    i41 = i41;
                                } else {
                                    qhn1Var2 = qhn1Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var12 = cjo1VarB;
                                    byte[] bArr11 = bArr2;
                                    int i57 = i8;
                                    iB = zgo1.B(i57 == true ? 1 : 0, bArr11, i5, i2, cjo1Var12, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i57 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 6:
                            case 13:
                                bArr3 = bArr;
                                qhn1Var3 = qhn1Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                i40 = i40;
                                i7 = i44;
                                if (z == 5) {
                                    int i58 = i10 + 4;
                                    unsafe3.putInt(obj3, j2, zgo1.y(bArr3, i10));
                                    i40 |= i49;
                                    i38 = i7;
                                    i2 = i2;
                                    qhn1Var = qhn1Var3;
                                    iZ = i58;
                                    obj5 = obj3;
                                    iQ = iQ;
                                    bArr6 = bArr3;
                                    i39 = i11;
                                    i41 = i41;
                                } else {
                                    qhn1Var2 = qhn1Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var13 = cjo1VarB;
                                    byte[] bArr12 = bArr2;
                                    int i59 = i8;
                                    iB = zgo1.B(i59 == true ? 1 : 0, bArr12, i5, i2, cjo1Var13, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i59 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 7:
                                bArr3 = bArr;
                                qhn1Var3 = qhn1Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                i40 = i40;
                                i7 = i44;
                                if (z == 0) {
                                    int i60 = i40 | i49;
                                    int iF2 = zgo1.F(bArr3, i10, qhn1Var3);
                                    zjo1.c.q(obj3, j2, qhn1Var3.b != 0);
                                    qhn1Var = qhn1Var3;
                                    iZ = iF2;
                                    i38 = i7;
                                    bArr6 = bArr3;
                                    i40 = i60;
                                    obj5 = obj3;
                                    i39 = i11;
                                } else {
                                    qhn1Var2 = qhn1Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var14 = cjo1VarB;
                                    byte[] bArr13 = bArr2;
                                    int i510 = i8;
                                    iB = zgo1.B(i510 == true ? 1 : 0, bArr13, i5, i2, cjo1Var14, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i510 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 8:
                                bArr3 = bArr;
                                qhn1Var3 = qhn1Var;
                                obj3 = obj5;
                                unsafe3 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                i40 = i40;
                                i7 = i44;
                                if (z == 2) {
                                    if ((i47 & 536870912) != 0) {
                                        int i61 = i40 | i49;
                                        int iC5 = zgo1.C(bArr3, i10, qhn1Var3);
                                        int i62 = qhn1Var3.a;
                                        if (i62 < 0) {
                                            x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        if (i62 == 0) {
                                            qhn1Var3.c = "";
                                            i13 = i61;
                                        } else {
                                            int i63 = pko1.a;
                                            int length = bArr3.length;
                                            if ((((length - iC5) - i62) | iC5 | i62) < 0) {
                                                t8e1.n("buffer length=%d, index=%d, size=%d", new Object[]{Integer.valueOf(length), Integer.valueOf(iC5), Integer.valueOf(i62)});
                                                return 0;
                                            }
                                            int i64 = iC5 + i62;
                                            char[] cArr = new char[i62];
                                            int i65 = 0;
                                            while (iC5 < i64) {
                                                byte b6 = bArr3[iC5];
                                                if (b6 >= 0) {
                                                    iC5++;
                                                    cArr[i65] = (char) b6;
                                                    i65++;
                                                } else {
                                                    while (iC5 < i64) {
                                                        i14 = iC5 + 1;
                                                        i61 = i61;
                                                        b = bArr3[iC5];
                                                        if (b >= 0) {
                                                            cArr[i65] = (char) b;
                                                            i65++;
                                                            iC5 = i14;
                                                            while (iC5 < i64) {
                                                                b2 = bArr3[iC5];
                                                                if (b2 >= 0) {
                                                                    iC5++;
                                                                    cArr[i65] = (char) b2;
                                                                    i65++;
                                                                } else {
                                                                    i61 = i61;
                                                                }
                                                            }
                                                            i61 = i61;
                                                        } else {
                                                            i15 = iC5;
                                                            if (b >= -32) {
                                                                if (b < -16) {
                                                                    i16 = i64;
                                                                    if (i14 < i16 - 2) {
                                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                                        return 0;
                                                                    }
                                                                    b3 = bArr3[i14];
                                                                    int i66 = i15 + 3;
                                                                    byte b7 = bArr3[i15 + 2];
                                                                    int i67 = i15 + 4;
                                                                    byte b8 = bArr3[i66];
                                                                    if (!iko1.C(b3)) {
                                                                        if ((((b3 + 112) + (b << 28)) >> 30) != 0 && !iko1.C(b7) && !iko1.C(b8)) {
                                                                            int i68 = ((b & 7) << 18) | ((b3 & 63) << 12) | ((b7 & 63) << 6) | (b8 & 63);
                                                                            cArr[i65] = (char) ((i68 >>> 10) + 55232);
                                                                            cArr[i65 + 1] = (char) ((i68 & 1023) + 56320);
                                                                            i65 += 2;
                                                                            iC5 = i67;
                                                                        }
                                                                    }
                                                                    x4n1.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                if (i14 < i64 - 1) {
                                                                    x4n1.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                i17 = i65 + 1;
                                                                int i69 = i15 + 2;
                                                                b4 = bArr3[i14];
                                                                i18 = i15 + 3;
                                                                b5 = bArr3[i69];
                                                                if (!iko1.C(b4)) {
                                                                    i16 = i64;
                                                                    if (b != -32) {
                                                                        if (b != -19) {
                                                                            if (!iko1.C(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iC5 = i18;
                                                                                i65 = i17;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!iko1.C(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iC5 = i18;
                                                                                i65 = i17;
                                                                            }
                                                                        }
                                                                    } else if (b4 >= -96) {
                                                                        b = -32;
                                                                        if (b != -19) {
                                                                            if (!iko1.C(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iC5 = i18;
                                                                                i65 = i17;
                                                                            }
                                                                        } else if (b4 < -96) {
                                                                            b = -19;
                                                                            if (!iko1.C(b5)) {
                                                                                cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                                iC5 = i18;
                                                                                i65 = i17;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                x4n1.i("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                                i64 = i16;
                                                            } else {
                                                                if (i14 < i64) {
                                                                    x4n1.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                int i70 = i65 + 1;
                                                                int i71 = i15 + 2;
                                                                byte b9 = bArr3[i14];
                                                                if (b >= -62 || iko1.C(b9)) {
                                                                    x4n1.i("Protocol message had invalid UTF-8.");
                                                                    return 0;
                                                                }
                                                                cArr[i65] = (char) (((b & 31) << 6) | (b9 & 63));
                                                                i61 = i61;
                                                                iC5 = i71;
                                                                i65 = i70;
                                                            }
                                                        }
                                                    }
                                                    i13 = i61;
                                                    int i72 = i64;
                                                    str2 = new String(cArr, 0, i65);
                                                    qhn1Var3.c = str2;
                                                    iC5 = i72;
                                                }
                                            }
                                            while (iC5 < i64) {
                                                i14 = iC5 + 1;
                                                i61 = i61;
                                                b = bArr3[iC5];
                                                if (b >= 0) {
                                                    cArr[i65] = (char) b;
                                                    i65++;
                                                    iC5 = i14;
                                                    while (iC5 < i64) {
                                                        b2 = bArr3[iC5];
                                                        if (b2 >= 0) {
                                                            iC5++;
                                                            cArr[i65] = (char) b2;
                                                            i65++;
                                                        } else {
                                                            i61 = i61;
                                                        }
                                                    }
                                                    i61 = i61;
                                                } else {
                                                    i15 = iC5;
                                                    if (b >= -32) {
                                                        if (i14 < i64) {
                                                            x4n1.i("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        int i73 = i65 + 1;
                                                        int i74 = i15 + 2;
                                                        byte b10 = bArr3[i14];
                                                        if (b >= -62) {
                                                        }
                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (b < -16) {
                                                        i16 = i64;
                                                        if (i14 < i16 - 2) {
                                                            x4n1.i("Protocol message had invalid UTF-8.");
                                                            return 0;
                                                        }
                                                        b3 = bArr3[i14];
                                                        int i610 = i15 + 3;
                                                        byte b11 = bArr3[i15 + 2];
                                                        int i611 = i15 + 4;
                                                        byte b12 = bArr3[i610];
                                                        if (!iko1.C(b3)) {
                                                            if ((((b3 + 112) + (b << 28)) >> 30) != 0) {
                                                            }
                                                        }
                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    if (i14 < i64 - 1) {
                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    i17 = i65 + 1;
                                                    int i612 = i15 + 2;
                                                    b4 = bArr3[i14];
                                                    i18 = i15 + 3;
                                                    b5 = bArr3[i612];
                                                    if (!iko1.C(b4)) {
                                                        i16 = i64;
                                                        if (b != -32) {
                                                            if (b != -19) {
                                                                if (!iko1.C(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iC5 = i18;
                                                                    i65 = i17;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!iko1.C(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iC5 = i18;
                                                                    i65 = i17;
                                                                }
                                                            }
                                                        } else if (b4 >= -96) {
                                                            b = -32;
                                                            if (b != -19) {
                                                                if (!iko1.C(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iC5 = i18;
                                                                    i65 = i17;
                                                                }
                                                            } else if (b4 < -96) {
                                                                b = -19;
                                                                if (!iko1.C(b5)) {
                                                                    cArr[i65] = (char) (((b & 15) << 12) | ((b4 & 63) << 6) | (b5 & 63));
                                                                    iC5 = i18;
                                                                    i65 = i17;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    x4n1.i("Protocol message had invalid UTF-8.");
                                                    return 0;
                                                    i64 = i16;
                                                }
                                            }
                                            i13 = i61;
                                            int i75 = i64;
                                            str2 = new String(cArr, 0, i65);
                                            qhn1Var3.c = str2;
                                            iC5 = i75;
                                        }
                                        i12 = i13;
                                        iC = iC5;
                                    } else {
                                        iC = zgo1.C(bArr3, i10, qhn1Var3);
                                        int i76 = qhn1Var3.a;
                                        if (i76 < 0) {
                                            x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                            return 0;
                                        }
                                        i12 = i40 | i49;
                                        if (i76 == 0) {
                                            qhn1Var3.c = "";
                                        } else {
                                            str2 = new String(bArr3, iC, i76, wbo1.a);
                                            qhn1Var3.c = str2;
                                            iC += i76;
                                        }
                                    }
                                    unsafe3.putObject(obj3, j2, str2);
                                    obj5 = obj3;
                                    i38 = i7;
                                    i39 = i11;
                                    i40 = i12;
                                    qhn1Var = qhn1Var3;
                                    iZ = iC;
                                    bArr6 = bArr3;
                                    i41 = i41;
                                } else {
                                    qhn1Var2 = qhn1Var3;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var15 = cjo1VarB;
                                    byte[] bArr14 = bArr2;
                                    int i511 = i8;
                                    iB = zgo1.B(i511 == true ? 1 : 0, bArr14, i5, i2, cjo1Var15, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i511 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 9:
                                Object obj6 = obj5;
                                unsafe3 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                if (z == 2) {
                                    i40 |= i49;
                                    Object objW = ufo1Var.w(iQ, obj6);
                                    qhn1Var = qhn1Var;
                                    int iH = zgo1.H(objW, ufo1Var.v(iQ), bArr, i10, i2, qhn1Var);
                                    unsafe9.putObject(obj, ufo1Var.s(iQ) & 1048575, objW);
                                    ufo1Var.i(iQ, obj);
                                    iZ = iH;
                                    obj5 = obj;
                                    bArr6 = bArr;
                                    i38 = i44;
                                    i39 = i11;
                                    i41 = i41;
                                } else {
                                    obj3 = obj6;
                                    bArr3 = bArr;
                                    qhn1Var2 = qhn1Var;
                                    i40 = i40;
                                    i7 = i44;
                                    cjo1Var7 = cjo1Var7;
                                    unsafe2 = unsafe3;
                                    obj5 = obj3;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var16 = cjo1VarB;
                                    byte[] bArr15 = bArr2;
                                    int i512 = i8;
                                    iB = zgo1.B(i512 == true ? 1 : 0, bArr15, i5, i2, cjo1Var16, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i512 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 10:
                                bArr4 = bArr;
                                qhn1Var4 = qhn1Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                if (z == 2) {
                                    i40 |= i49;
                                    int iX2 = zgo1.x(bArr4, i10, qhn1Var4);
                                    unsafe4.putObject(obj4, j2, qhn1Var4.c);
                                    obj5 = obj4;
                                    iZ = iX2;
                                    bArr6 = bArr4;
                                    qhn1Var = qhn1Var4;
                                    i38 = i44;
                                    i39 = i11;
                                    i41 = i41;
                                } else {
                                    qhn1Var2 = qhn1Var4;
                                    i7 = i44;
                                    cjo1Var7 = cjo1Var7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var17 = cjo1VarB;
                                    byte[] bArr16 = bArr2;
                                    int i513 = i8;
                                    iB = zgo1.B(i513 == true ? 1 : 0, bArr16, i5, i2, cjo1Var17, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i513 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case grn1.d /* 12 */:
                                bArr4 = bArr;
                                qhn1Var4 = qhn1Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i10 = i43;
                                i11 = i9;
                                if (z == 0) {
                                    int iC6 = zgo1.C(bArr4, i10, qhn1Var4);
                                    int i77 = qhn1Var4.a;
                                    c3o1 c3o1VarU = ufo1Var.u(iQ);
                                    if ((i47 & Integer.MIN_VALUE) == 0 || c3o1VarU == null || c3o1VarU.a(i77)) {
                                        i19 = i41;
                                        i40 |= i49;
                                        unsafe4.putInt(obj4, j2, i77);
                                    } else {
                                        iao1 iao1Var2 = (iao1) obj4;
                                        cjo1 cjo1VarB3 = iao1Var2.zzc;
                                        if (cjo1VarB3 == cjo1Var7) {
                                            cjo1VarB3 = cjo1.b();
                                            iao1Var2.zzc = cjo1VarB3;
                                        }
                                        i19 = i41;
                                        cjo1VarB3.c(i19 == true ? 1 : 0, Long.valueOf(i77));
                                    }
                                    obj5 = obj4;
                                    iZ = iC6;
                                    bArr6 = bArr4;
                                    qhn1Var = qhn1Var4;
                                    i38 = i44;
                                    i39 = i11;
                                    i41 = i19;
                                    iQ = iQ;
                                } else {
                                    qhn1Var2 = qhn1Var4;
                                    i7 = i44;
                                    cjo1Var7 = cjo1Var7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var18 = cjo1VarB;
                                    byte[] bArr17 = bArr2;
                                    int i514 = i8;
                                    iB = zgo1.B(i514 == true ? 1 : 0, bArr17, i5, i2, cjo1Var18, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i514 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 15:
                                bArr4 = bArr;
                                qhn1Var4 = qhn1Var;
                                obj4 = obj5;
                                unsafe4 = unsafe8;
                                i10 = i43;
                                if (z == 0) {
                                    i40 |= i49;
                                    int iC7 = zgo1.C(bArr4, i10, qhn1Var4);
                                    unsafe4.putInt(obj4, j2, fho1.z(qhn1Var4.a));
                                    obj5 = obj4;
                                    iZ = iC7;
                                    bArr6 = bArr4;
                                    iQ = iQ;
                                    i39 = i9;
                                    qhn1Var = qhn1Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    i11 = i9;
                                    qhn1Var2 = qhn1Var4;
                                    i7 = i44;
                                    cjo1Var7 = cjo1Var7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe4;
                                    obj5 = obj4;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var19 = cjo1VarB;
                                    byte[] bArr18 = bArr2;
                                    int i515 = i8;
                                    iB = zgo1.B(i515 == true ? 1 : 0, bArr18, i5, i2, cjo1Var19, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i515 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            case 16:
                                bArr4 = bArr;
                                qhn1Var4 = qhn1Var;
                                i10 = i43;
                                if (z == 0) {
                                    i40 |= i49;
                                    int iF3 = zgo1.F(bArr4, i10, qhn1Var4);
                                    long j3 = qhn1Var4.b;
                                    unsafe8.putLong(obj5, j2, (-(j3 & 1)) ^ (j3 >>> 1));
                                    iZ = iF3;
                                    bArr6 = bArr4;
                                    iQ = iQ;
                                    i39 = i9;
                                    qhn1Var = qhn1Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    i40 = i40;
                                    i11 = i9;
                                    qhn1Var2 = qhn1Var4;
                                    i7 = i44;
                                    cjo1Var7 = cjo1Var7;
                                    bArr3 = bArr4;
                                    unsafe2 = unsafe8;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var110 = cjo1VarB;
                                    byte[] bArr19 = bArr2;
                                    int i516 = i8;
                                    iB = zgo1.B(i516 == true ? 1 : 0, bArr19, i5, i2, cjo1Var110, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i516 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                            default:
                                if (z == 3) {
                                    Object objW2 = ufo1Var.w(iQ, obj5);
                                    int iG = zgo1.G(objW2, ufo1Var.v(iQ), bArr, i43, i2, (i44 << 3) | 4, qhn1Var);
                                    bArr4 = bArr;
                                    qhn1Var4 = qhn1Var;
                                    unsafe9.putObject(obj5, ufo1Var.s(iQ) & 1048575, objW2);
                                    ufo1Var.i(iQ, obj5);
                                    i40 |= i49;
                                    iZ = iG;
                                    bArr6 = bArr4;
                                    iQ = iQ;
                                    i39 = i9;
                                    qhn1Var = qhn1Var4;
                                    i38 = i44;
                                    i41 = i41;
                                } else {
                                    bArr3 = bArr;
                                    i40 = i40;
                                    i7 = i44;
                                    i10 = i43;
                                    cjo1Var7 = cjo1Var7;
                                    unsafe2 = unsafe8;
                                    i11 = i9;
                                    qhn1Var2 = qhn1Var;
                                    i3 = i3;
                                    obj2 = obj5;
                                    iQ = iQ;
                                    bArr2 = bArr3;
                                    objArr = objArr2;
                                    i4 = i11;
                                    i6 = i40;
                                    i8 = i41;
                                    unsafe = unsafe2;
                                    i5 = i10;
                                    qhn1Var = qhn1Var2;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var111 = cjo1VarB;
                                    byte[] bArr110 = bArr2;
                                    int i517 = i8;
                                    iB = zgo1.B(i517 == true ? 1 : 0, bArr110, i5, i2, cjo1Var111, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i517 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                    i39 = i4;
                                    iZ = iB;
                                    ufo1Var = this;
                                }
                                break;
                        }
                    } else {
                        iArr = iArr2;
                        i6 = i40;
                        i4 = i39;
                        if (iR != 27) {
                            obj2 = obj5;
                            i21 = i43;
                            if (iR <= 49) {
                                long j4 = i47;
                                ebo1 ebo1VarZzd = (ebo1) unsafe8.getObject(obj2, j2);
                                if (!((t3o1) ebo1VarZzd).a) {
                                    int size = ebo1VarZzd.size();
                                    ebo1VarZzd = ebo1VarZzd.zzd(size + size);
                                    unsafe8.putObject(obj2, j2, ebo1VarZzd);
                                }
                                ebo1 ebo1Var2 = ebo1VarZzd;
                                String str3 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                switch (iR) {
                                    case 18:
                                    case 35:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        cjo1Var3 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 1) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    case 19:
                                    case 36:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        cjo1Var3 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 5) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                                    case 21:
                                    case 37:
                                    case 38:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        cjo1Var3 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    case 22:
                                    case 29:
                                    case 39:
                                    case 43:
                                        unsafe6 = unsafe8;
                                        i28 = i21;
                                        objArr = objArr2;
                                        cjo1Var3 = cjo1Var7;
                                        i29 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            if (z == 0) {
                                                int iE2 = zgo1.E(i29 == true ? 1 : 0, bArr, i28, i2, ebo1Var2, qhn1Var);
                                                i27 = i29 == true ? 1 : 0;
                                                i21 = i28;
                                                iZ = iE2;
                                            }
                                            i27 = i29;
                                            i21 = i28;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            iA = zgo1.A(bArr, i28, ebo1Var2, qhn1Var);
                                            i27 = i29;
                                            iZ = iA;
                                            i21 = i28;
                                        }
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 23:
                                    case 32:
                                    case 40:
                                    case 46:
                                        unsafe6 = unsafe8;
                                        i28 = i21;
                                        objArr = objArr2;
                                        cjo1Var3 = cjo1Var7;
                                        i29 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 1) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        i27 = i29;
                                        i21 = i28;
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    case 24:
                                    case 31:
                                    case 41:
                                    case 45:
                                        unsafe6 = unsafe8;
                                        i28 = i21;
                                        objArr = objArr2;
                                        cjo1 cjo1Var20 = cjo1Var7;
                                        i29 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            cjo1Var3 = cjo1Var20;
                                            if (z == 5) {
                                                iA = i28 + 4;
                                                mao1 mao1Var = (mao1) ebo1Var2;
                                                mao1Var.b(zgo1.y(bArr, i28));
                                                while (iA < i2) {
                                                    int iC8 = zgo1.C(bArr, iA, qhn1Var);
                                                    if (i29 == qhn1Var.a) {
                                                        mao1Var.b(zgo1.y(bArr, iC8));
                                                        iA = iC8 + 4;
                                                    } else {
                                                        i27 = i29;
                                                        iZ = iA;
                                                    }
                                                }
                                                i27 = i29;
                                                iZ = iA;
                                            }
                                            i27 = i29;
                                            i21 = i28;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            mao1 mao1Var2 = (mao1) ebo1Var2;
                                            int iC9 = zgo1.C(bArr, i28, qhn1Var);
                                            int i78 = qhn1Var.a;
                                            int i79 = iC9 + i78;
                                            if (i79 > bArr.length) {
                                                x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            int i80 = (i78 / 4) + mao1Var2.c;
                                            int length2 = mao1Var2.b.length;
                                            if (i80 <= length2) {
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                i30 = iC9;
                                                cjo1Var3 = cjo1Var20;
                                            } else if (length2 != 0) {
                                                while (length2 < i80) {
                                                    length2 = f4i1.a(length2, 3, 2, 1, 10);
                                                    str3 = str3;
                                                    iC9 = iC9;
                                                    cjo1Var20 = cjo1Var20;
                                                }
                                                str = str3;
                                                i30 = iC9;
                                                cjo1Var3 = cjo1Var20;
                                                mao1Var2.b = Arrays.copyOf(mao1Var2.b, length2);
                                            } else {
                                                str = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.";
                                                i30 = iC9;
                                                cjo1Var3 = cjo1Var20;
                                                mao1Var2.b = new int[Math.max(i80, 10)];
                                            }
                                            int i81 = i30;
                                            while (i81 < i79) {
                                                mao1Var2.b(zgo1.y(bArr, i81));
                                                i81 += 4;
                                            }
                                            if (i81 != i79) {
                                                x4n1.i(str);
                                                return 0;
                                            }
                                            i27 = i29 == true ? 1 : 0;
                                            iZ = i81;
                                        }
                                        i21 = i28;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 25:
                                    case 42:
                                        unsafe6 = unsafe8;
                                        i31 = i21;
                                        objArr = objArr2;
                                        cjo1Var4 = cjo1Var7;
                                        i32 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        i27 = i32;
                                        cjo1Var3 = cjo1Var4;
                                        i21 = i31;
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    case 26:
                                        unsafe6 = unsafe8;
                                        i31 = i21;
                                        objArr = objArr2;
                                        cjo1Var4 = cjo1Var7;
                                        i32 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            if ((j4 & 536870912) == 0) {
                                                iC3 = zgo1.C(bArr, i31, qhn1Var);
                                                int i82 = qhn1Var.a;
                                                if (i82 < 0) {
                                                    x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i82 == 0) {
                                                    ebo1Var2.add("");
                                                } else {
                                                    ebo1Var2.add(new String(bArr, iC3, i82, wbo1.a));
                                                    iC3 += i82;
                                                }
                                                while (iC3 < i2) {
                                                    int iC10 = zgo1.C(bArr, iC3, qhn1Var);
                                                    if (i32 == qhn1Var.a) {
                                                        iC3 = zgo1.C(bArr, iC10, qhn1Var);
                                                        int i83 = qhn1Var.a;
                                                        if (i83 < 0) {
                                                            x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i83 == 0) {
                                                            ebo1Var2.add("");
                                                        } else {
                                                            ebo1Var2.add(new String(bArr, iC3, i83, wbo1.a));
                                                            iC3 += i83;
                                                        }
                                                    }
                                                }
                                            } else {
                                                iC3 = zgo1.C(bArr, i31, qhn1Var);
                                                int i84 = qhn1Var.a;
                                                if (i84 < 0) {
                                                    x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                    return 0;
                                                }
                                                if (i84 == 0) {
                                                    ebo1Var2.add("");
                                                } else {
                                                    int i85 = iC3 + i84;
                                                    if (!pko1.c(iC3, bArr, i85)) {
                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    ebo1Var2.add(new String(bArr, iC3, i84, wbo1.a));
                                                    iC3 = i85;
                                                }
                                                while (iC3 < i2) {
                                                    int iC11 = zgo1.C(bArr, iC3, qhn1Var);
                                                    if (i32 == qhn1Var.a) {
                                                        iC3 = zgo1.C(bArr, iC11, qhn1Var);
                                                        int i86 = qhn1Var.a;
                                                        if (i86 < 0) {
                                                            x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                            return 0;
                                                        }
                                                        if (i86 == 0) {
                                                            ebo1Var2.add("");
                                                        } else {
                                                            int i87 = iC3 + i86;
                                                            if (!pko1.c(iC3, bArr, i87)) {
                                                                x4n1.i("Protocol message had invalid UTF-8.");
                                                                return 0;
                                                            }
                                                            ebo1Var2.add(new String(bArr, iC3, i86, wbo1.a));
                                                            iC3 = i87;
                                                        }
                                                    }
                                                }
                                            }
                                            i27 = i32 == true ? 1 : 0;
                                            iZ = iC3;
                                            cjo1Var3 = cjo1Var4;
                                            i21 = i31;
                                        } else {
                                            i27 = i32;
                                            cjo1Var3 = cjo1Var4;
                                            i21 = i31;
                                            iZ = i21;
                                        }
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 27:
                                        unsafe6 = unsafe8;
                                        objArr = objArr2;
                                        if (z == 2) {
                                            int iZ2 = zgo1.z(ufo1Var.v(iQ), i41 == true ? 1 : 0, bArr, i21, i2, ebo1Var2, qhn1Var);
                                            i28 = i21;
                                            i27 = i41 == true ? 1 : 0;
                                            iZ = iZ2;
                                            cjo1Var3 = cjo1Var7;
                                            i21 = i28;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            i28 = i21;
                                            i27 = i41 == true ? 1 : 0;
                                            cjo1Var3 = cjo1Var7;
                                            i21 = i28;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        }
                                        break;
                                    case 28:
                                        unsafe6 = unsafe8;
                                        i33 = i21;
                                        objArr = objArr2;
                                        cjo1Var5 = cjo1Var7;
                                        if (z == 2) {
                                            int iC12 = zgo1.C(bArr, i33, qhn1Var);
                                            int i88 = qhn1Var.a;
                                            if (i88 < 0) {
                                                x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                return 0;
                                            }
                                            if (i88 > bArr.length - iC12) {
                                                x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                            if (i88 == 0) {
                                                ebo1Var2.add(n5o1.b);
                                            } else {
                                                ebo1Var2.add(n5o1.m(iC12, bArr, i88));
                                                iC12 += i88;
                                            }
                                            while (iC12 < i2) {
                                                int iC13 = zgo1.C(bArr, iC12, qhn1Var);
                                                if (i41 == qhn1Var.a) {
                                                    iC12 = zgo1.C(bArr, iC13, qhn1Var);
                                                    int i89 = qhn1Var.a;
                                                    if (i89 < 0) {
                                                        x4n1.i("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                                                        return 0;
                                                    }
                                                    if (i89 > bArr.length - iC12) {
                                                        x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                        return 0;
                                                    }
                                                    if (i89 == 0) {
                                                        ebo1Var2.add(n5o1.b);
                                                    } else {
                                                        ebo1Var2.add(n5o1.m(iC12, bArr, i89));
                                                        iC12 += i89;
                                                    }
                                                } else {
                                                    i27 = i41 == true ? 1 : 0;
                                                    i21 = i33;
                                                    iZ = iC12;
                                                    cjo1Var3 = cjo1Var5;
                                                }
                                            }
                                            i27 = i41 == true ? 1 : 0;
                                            i21 = i33;
                                            iZ = iC12;
                                            cjo1Var3 = cjo1Var5;
                                        } else {
                                            i27 = i41 == true ? 1 : 0;
                                            i21 = i33;
                                            cjo1Var3 = cjo1Var5;
                                            iZ = i21;
                                        }
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 30:
                                    case 44:
                                        Unsafe unsafe10 = unsafe8;
                                        i33 = i21;
                                        cjo1Var5 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            iE = zgo1.A(bArr, i33, ebo1Var2, qhn1Var);
                                            i34 = i27 == true ? 1 : 0;
                                            ebo1Var = ebo1Var2;
                                        } else if (z != 0) {
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            i21 = i33;
                                            cjo1Var3 = cjo1Var5;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            i34 = i27 == true ? 1 : 0;
                                            iE = zgo1.E(i34 == true ? 1 : 0, bArr, i33, i2, ebo1Var2, qhn1Var);
                                            ebo1Var = ebo1Var2;
                                            i33 = i33;
                                        }
                                        c3o1 c3o1VarU2 = ufo1Var.u(iQ);
                                        fen1 fen1Var = ygo1.a;
                                        if (c3o1VarU2 != null) {
                                            int size2 = ebo1Var.size();
                                            i35 = iE;
                                            cjo1 cjo1Var21 = null;
                                            int i90 = 0;
                                            int i91 = 0;
                                            while (i90 < size2) {
                                                Unsafe unsafe11 = unsafe10;
                                                Integer num = (Integer) ebo1Var.get(i90);
                                                Object[] objArr3 = objArr2;
                                                int iIntValue = num.intValue();
                                                if (c3o1VarU2.a(iIntValue)) {
                                                    if (i90 != i91) {
                                                        ebo1Var.set(i91, num);
                                                    }
                                                    i91++;
                                                    c3o1Var = c3o1VarU2;
                                                    cjo1VarB2 = cjo1Var21;
                                                } else {
                                                    if (cjo1Var21 == null) {
                                                        ufo1Var.i.getClass();
                                                        iao1 iao1Var3 = (iao1) obj2;
                                                        c3o1Var = c3o1VarU2;
                                                        cjo1VarB2 = iao1Var3.zzc;
                                                        if (cjo1VarB2 == cjo1Var5) {
                                                            cjo1VarB2 = cjo1.b();
                                                            iao1Var3.zzc = cjo1VarB2;
                                                        }
                                                    } else {
                                                        c3o1Var = c3o1VarU2;
                                                        cjo1VarB2 = cjo1Var21;
                                                    }
                                                    cjo1VarB2.c(i44 << 3, Long.valueOf(iIntValue));
                                                }
                                                i90++;
                                                cjo1Var21 = cjo1VarB2;
                                                c3o1VarU2 = c3o1Var;
                                                unsafe10 = unsafe11;
                                                objArr2 = objArr3;
                                            }
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                            if (i91 != size2) {
                                                ebo1Var.subList(i91, size2).clear();
                                            }
                                        } else {
                                            i35 = iE;
                                            unsafe6 = unsafe10;
                                            objArr = objArr2;
                                        }
                                        i27 = i34;
                                        i21 = i33;
                                        cjo1Var3 = cjo1Var5;
                                        iZ = i35;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 33:
                                    case 47:
                                        unsafe7 = unsafe8;
                                        i36 = i21;
                                        cjo1Var6 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z != 2) {
                                            if (z == 0) {
                                                mao1 mao1Var3 = (mao1) ebo1Var2;
                                                iZ = zgo1.C(bArr, i36, qhn1Var);
                                                mao1Var3.b(fho1.z(qhn1Var.a));
                                                while (iZ < i2) {
                                                    int iC14 = zgo1.C(bArr, iZ, qhn1Var);
                                                    if (i27 == qhn1Var.a) {
                                                        iZ = zgo1.C(bArr, iC14, qhn1Var);
                                                        mao1Var3.b(fho1.z(qhn1Var.a));
                                                    }
                                                }
                                            }
                                            i21 = i36;
                                            cjo1Var3 = cjo1Var6;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            mao1 mao1Var4 = (mao1) ebo1Var2;
                                            iZ = zgo1.C(bArr, i36, qhn1Var);
                                            int i92 = qhn1Var.a + iZ;
                                            while (iZ < i92) {
                                                iZ = zgo1.C(bArr, iZ, qhn1Var);
                                                mao1Var4.b(fho1.z(qhn1Var.a));
                                            }
                                            if (iZ != i92) {
                                                x4n1.i("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                                                return 0;
                                            }
                                        }
                                        i21 = i36;
                                        cjo1Var3 = cjo1Var6;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                    case 34:
                                    case 48:
                                        unsafe7 = unsafe8;
                                        i36 = i21;
                                        cjo1Var6 = cjo1Var7;
                                        i27 = i41 == true ? 1 : 0;
                                        if (z == 2) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        if (z == 0) {
                                            bhn0.d();
                                            return 0;
                                        }
                                        i21 = i36;
                                        cjo1Var3 = cjo1Var6;
                                        unsafe6 = unsafe7;
                                        objArr = objArr2;
                                        iZ = i21;
                                        if (iZ != i21) {
                                            bArr6 = bArr;
                                            i2 = i2;
                                            qhn1Var = qhn1Var;
                                            obj5 = obj2;
                                            i41 = i27;
                                            iQ = iQ;
                                            i40 = i6;
                                            i39 = i4;
                                            i38 = i44;
                                        } else {
                                            i5 = iZ;
                                            i8 = i27;
                                            iQ = iQ;
                                            cjo1Var7 = cjo1Var3;
                                            unsafe = unsafe6;
                                            i7 = i44;
                                        }
                                        break;
                                        break;
                                    default:
                                        if (z == 3) {
                                            int i93 = ((i41 == true ? 1 : 0) & (-8)) | 4;
                                            sgo1 sgo1VarV = ufo1Var.v(iQ);
                                            int i94 = i21;
                                            iao1 iao1VarZze = sgo1VarV.zze();
                                            unsafe7 = unsafe8;
                                            cjo1Var6 = cjo1Var7;
                                            i27 = i41 == true ? 1 : 0;
                                            int iG2 = zgo1.G(iao1VarZze, sgo1VarV, bArr, i94, i2, i93, qhn1Var);
                                            qhn1 qhn1Var5 = qhn1Var;
                                            sgo1VarV.zzf(iao1VarZze);
                                            qhn1Var5.c = iao1VarZze;
                                            ebo1Var2.add(iao1VarZze);
                                            while (true) {
                                                if (iG2 < i2) {
                                                    int i95 = i94;
                                                    int iC15 = zgo1.C(bArr, iG2, qhn1Var5);
                                                    if (i27 == qhn1Var5.a) {
                                                        i37 = i93;
                                                        int i96 = i37;
                                                        iao1 iao1VarZze2 = sgo1VarV.zze();
                                                        iG2 = zgo1.G(iao1VarZze2, sgo1VarV, bArr, iC15, i2, i96, qhn1Var);
                                                        i37 = i96;
                                                        qhn1Var5 = qhn1Var;
                                                        sgo1VarV.zzf(iao1VarZze2);
                                                        qhn1Var5.c = iao1VarZze2;
                                                        ebo1Var2.add(iao1VarZze2);
                                                        i94 = i95;
                                                    } else {
                                                        i37 = i93;
                                                        i94 = i95;
                                                    }
                                                } else {
                                                    i37 = i93;
                                                }
                                            }
                                            i21 = i94;
                                            iZ = iG2;
                                            cjo1Var3 = cjo1Var6;
                                            unsafe6 = unsafe7;
                                            objArr = objArr2;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        } else {
                                            i21 = i21;
                                            unsafe6 = unsafe8;
                                            objArr = objArr2;
                                            cjo1Var3 = cjo1Var7;
                                            i27 = i41 == true ? 1 : 0;
                                            iZ = i21;
                                            if (iZ != i21) {
                                                bArr6 = bArr;
                                                i2 = i2;
                                                qhn1Var = qhn1Var;
                                                obj5 = obj2;
                                                i41 = i27;
                                                iQ = iQ;
                                                i40 = i6;
                                                i39 = i4;
                                                i38 = i44;
                                            } else {
                                                i5 = iZ;
                                                i8 = i27;
                                                iQ = iQ;
                                                cjo1Var7 = cjo1Var3;
                                                unsafe = unsafe6;
                                                i7 = i44;
                                            }
                                        }
                                        break;
                                }
                            } else {
                                i20 = i44;
                                objArr = objArr2;
                                cjo1Var = cjo1Var7;
                                i22 = i41 == true ? 1 : 0;
                                unsafe = unsafe8;
                                if (iR != 50) {
                                    int i97 = iQ + 2;
                                    long j5 = iArr[i97] & 1048575;
                                    switch (iR) {
                                        case 51:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 1) {
                                                iB = i23 + 8;
                                                unsafe.putObject(obj2, j2, Double.valueOf(Double.longBitsToDouble(zgo1.I(bArr2, i23))));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var112 = cjo1VarB;
                                                byte[] bArr111 = bArr2;
                                                int i518 = i8;
                                                iB = zgo1.B(i518 == true ? 1 : 0, bArr111, i5, i2, cjo1Var112, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i518 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 52:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 5) {
                                                iB = i23 + 4;
                                                unsafe.putObject(obj2, j2, Float.valueOf(Float.intBitsToFloat(zgo1.y(bArr2, i23))));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var113 = cjo1VarB;
                                                byte[] bArr112 = bArr2;
                                                int i519 = i8;
                                                iB = zgo1.B(i519 == true ? 1 : 0, bArr112, i5, i2, cjo1Var113, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i519 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 53:
                                        case 54:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iB = zgo1.F(bArr2, i23, qhn1Var);
                                                unsafe.putObject(obj2, j2, Long.valueOf(qhn1Var.b));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var114 = cjo1VarB;
                                                byte[] bArr113 = bArr2;
                                                int i5110 = i8;
                                                iB = zgo1.B(i5110 == true ? 1 : 0, bArr113, i5, i2, cjo1Var114, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5110 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 55:
                                        case 62:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iB = zgo1.C(bArr2, i23, qhn1Var);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(qhn1Var.a));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var115 = cjo1VarB;
                                                byte[] bArr114 = bArr2;
                                                int i5111 = i8;
                                                iB = zgo1.B(i5111 == true ? 1 : 0, bArr114, i5, i2, cjo1Var115, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5111 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 56:
                                        case 65:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 1) {
                                                iB = i23 + 8;
                                                unsafe.putObject(obj2, j2, Long.valueOf(zgo1.I(bArr2, i23)));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var116 = cjo1VarB;
                                                byte[] bArr115 = bArr2;
                                                int i5112 = i8;
                                                iB = zgo1.B(i5112 == true ? 1 : 0, bArr115, i5, i2, cjo1Var116, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5112 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 57:
                                        case 64:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 5) {
                                                iB = i23 + 4;
                                                unsafe.putObject(obj2, j2, Integer.valueOf(zgo1.y(bArr2, i23)));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var117 = cjo1VarB;
                                                byte[] bArr116 = bArr2;
                                                int i5113 = i8;
                                                iB = zgo1.B(i5113 == true ? 1 : 0, bArr116, i5, i2, cjo1Var117, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5113 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 58:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iB = zgo1.F(bArr2, i23, qhn1Var);
                                                cjo1Var7 = cjo1Var;
                                                unsafe.putObject(obj2, j2, Boolean.valueOf(qhn1Var.b != 0));
                                                unsafe.putInt(obj2, j5, i7);
                                            } else {
                                                cjo1Var7 = cjo1Var;
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var118 = cjo1VarB;
                                                byte[] bArr117 = bArr2;
                                                int i5114 = i8;
                                                iB = zgo1.B(i5114 == true ? 1 : 0, bArr117, i5, i2, cjo1Var118, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5114 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 59:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 2) {
                                                int iC16 = zgo1.C(bArr2, i23, qhn1Var);
                                                int i98 = qhn1Var.a;
                                                if (i98 == 0) {
                                                    unsafe.putObject(obj2, j2, "");
                                                } else {
                                                    int i99 = iC16 + i98;
                                                    if ((i47 & 536870912) != 0 && !pko1.c(iC16, bArr2, i99)) {
                                                        x4n1.i("Protocol message had invalid UTF-8.");
                                                        return 0;
                                                    }
                                                    unsafe.putObject(obj2, j2, new String(bArr2, iC16, i98, wbo1.a));
                                                    iC16 = i99;
                                                }
                                                unsafe.putInt(obj2, j5, i7);
                                                iB = iC16;
                                                cjo1Var7 = cjo1Var;
                                            } else {
                                                cjo1Var7 = cjo1Var;
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var119 = cjo1VarB;
                                                byte[] bArr118 = bArr2;
                                                int i5115 = i8;
                                                iB = zgo1.B(i5115 == true ? 1 : 0, bArr118, i5, i2, cjo1Var119, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5115 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 60:
                                            i23 = i21;
                                            qhn1Var = qhn1Var;
                                            if (z == 2) {
                                                i7 = i20;
                                                Object objX = ufo1Var.x(i7, iQ, obj2);
                                                int iH2 = zgo1.H(objX, ufo1Var.v(iQ), bArr, i23, i2, qhn1Var);
                                                bArr2 = bArr;
                                                unsafe9.putObject(obj2, ufo1Var.s(iQ) & 1048575, objX);
                                                zjo1.i(obj2, iArr[i97] & 1048575, i7);
                                                iB = iH2;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                i8 = i22 == true ? 1 : 0;
                                            } else {
                                                i7 = i20;
                                                bArr2 = bArr;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                i8 = i22 == true ? 1 : 0;
                                                iB = i23;
                                            }
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var1110 = cjo1VarB;
                                                byte[] bArr119 = bArr2;
                                                int i5116 = i8;
                                                iB = zgo1.B(i5116 == true ? 1 : 0, bArr119, i5, i2, cjo1Var1110, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i5116 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 61:
                                            bArr5 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            i25 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 2) {
                                                iX = zgo1.x(bArr5, i23, qhn1Var);
                                                unsafe.putObject(obj2, j2, qhn1Var.c);
                                                unsafe.putInt(obj2, j5, i25);
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                iB = iX;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1111 = cjo1VarB;
                                                    byte[] bArr1110 = bArr2;
                                                    int i5117 = i8;
                                                    iB = zgo1.B(i5117 == true ? 1 : 0, bArr1110, i5, i2, cjo1Var1111, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i5117 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            } else {
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                iB = i23;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1112 = cjo1VarB;
                                                    byte[] bArr1111 = bArr2;
                                                    int i5118 = i8;
                                                    iB = zgo1.B(i5118 == true ? 1 : 0, bArr1111, i5, i2, cjo1Var1112, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i5118 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            }
                                            break;
                                        case 63:
                                            bArr5 = bArr;
                                            i23 = i21;
                                            i26 = i22 == true ? 1 : 0;
                                            cjo1Var2 = cjo1Var;
                                            i25 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iX = zgo1.C(bArr5, i23, qhn1Var);
                                                int i100 = qhn1Var.a;
                                                c3o1 c3o1VarU3 = ufo1Var.u(iQ);
                                                if (c3o1VarU3 == null || c3o1VarU3.a(i100)) {
                                                    cjo1Var = cjo1Var2;
                                                    i8 = i26 == true ? 1 : 0;
                                                    unsafe.putObject(obj2, j2, Integer.valueOf(i100));
                                                    unsafe.putInt(obj2, j5, i25);
                                                } else {
                                                    iao1 iao1Var4 = (iao1) obj2;
                                                    cjo1 cjo1VarB4 = iao1Var4.zzc;
                                                    cjo1Var = cjo1Var2;
                                                    if (cjo1VarB4 == cjo1Var) {
                                                        cjo1VarB4 = cjo1.b();
                                                        iao1Var4.zzc = cjo1VarB4;
                                                    }
                                                    Long lValueOf = Long.valueOf(i100);
                                                    i8 = i26 == true ? 1 : 0;
                                                    cjo1VarB4.c(i8 == true ? 1 : 0, lValueOf);
                                                }
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                iB = iX;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1113 = cjo1VarB;
                                                    byte[] bArr1112 = bArr2;
                                                    int i5119 = i8;
                                                    iB = zgo1.B(i5119 == true ? 1 : 0, bArr1112, i5, i2, cjo1Var1113, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i5119 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            }
                                            i7 = i25;
                                            bArr2 = bArr5;
                                            cjo1Var7 = cjo1Var2;
                                            i8 = i26;
                                            i24 = iQ;
                                            iB = i23;
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var1114 = cjo1VarB;
                                                byte[] bArr1113 = bArr2;
                                                int i51110 = i8;
                                                iB = zgo1.B(i51110 == true ? 1 : 0, bArr1113, i5, i2, cjo1Var1114, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i51110 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 66:
                                            bArr5 = bArr;
                                            i23 = i21;
                                            i26 = i22 == true ? 1 : 0;
                                            cjo1Var2 = cjo1Var;
                                            i25 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iC2 = zgo1.C(bArr5, i23, qhn1Var);
                                                unsafe.putObject(obj2, j2, Integer.valueOf(fho1.z(qhn1Var.a)));
                                                unsafe.putInt(obj2, j5, i25);
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                iB = iC2;
                                                cjo1Var7 = cjo1Var2;
                                                i8 = i26;
                                                i24 = iQ;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1115 = cjo1VarB;
                                                    byte[] bArr1114 = bArr2;
                                                    int i51111 = i8;
                                                    iB = zgo1.B(i51111 == true ? 1 : 0, bArr1114, i5, i2, cjo1Var1115, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i51111 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            }
                                            i7 = i25;
                                            bArr2 = bArr5;
                                            cjo1Var7 = cjo1Var2;
                                            i8 = i26;
                                            i24 = iQ;
                                            iB = i23;
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var1116 = cjo1VarB;
                                                byte[] bArr1115 = bArr2;
                                                int i51112 = i8;
                                                iB = zgo1.B(i51112 == true ? 1 : 0, bArr1115, i5, i2, cjo1Var1116, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i51112 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                        case 67:
                                            bArr5 = bArr;
                                            i23 = i21;
                                            i25 = i20;
                                            qhn1Var = qhn1Var;
                                            if (z == 0) {
                                                iC2 = zgo1.F(bArr5, i23, qhn1Var);
                                                i26 = i22 == true ? 1 : 0;
                                                cjo1Var2 = cjo1Var;
                                                long j6 = qhn1Var.b;
                                                unsafe.putObject(obj2, j2, Long.valueOf((j6 >>> 1) ^ (-(j6 & 1))));
                                                unsafe.putInt(obj2, j5, i25);
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                iB = iC2;
                                                cjo1Var7 = cjo1Var2;
                                                i8 = i26;
                                                i24 = iQ;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1117 = cjo1VarB;
                                                    byte[] bArr1116 = bArr2;
                                                    int i51113 = i8;
                                                    iB = zgo1.B(i51113 == true ? 1 : 0, bArr1116, i5, i2, cjo1Var1117, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i51113 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            } else {
                                                i8 = i22 == true ? 1 : 0;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                i7 = i25;
                                                bArr2 = bArr5;
                                                iB = i23;
                                                if (iB == i23) {
                                                    i2 = i2;
                                                    bArr6 = bArr2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i41 = i8 == true ? 1 : 0;
                                                    i40 = i6;
                                                    iQ = i24;
                                                } else {
                                                    i3 = i3;
                                                    i5 = iB;
                                                    iQ = i24;
                                                    if (i8 == i3) {
                                                    }
                                                    iao1Var = (iao1) obj2;
                                                    cjo1VarB = iao1Var.zzc;
                                                    if (cjo1VarB == cjo1Var7) {
                                                        cjo1VarB = cjo1.b();
                                                        iao1Var.zzc = cjo1VarB;
                                                    }
                                                    cjo1 cjo1Var1118 = cjo1VarB;
                                                    byte[] bArr1117 = bArr2;
                                                    int i51114 = i8;
                                                    iB = zgo1.B(i51114 == true ? 1 : 0, bArr1117, i5, i2, cjo1Var1118, qhn1Var);
                                                    bArr6 = bArr;
                                                    qhn1Var = qhn1Var;
                                                    i41 = i51114 == true ? 1 : 0;
                                                    i2 = i2;
                                                    obj5 = obj2;
                                                    i38 = i7;
                                                    i40 = i6;
                                                }
                                            }
                                            break;
                                        case 68:
                                            if (z == 3) {
                                                int i101 = ((i22 == true ? 1 : 0) & (-8)) | 4;
                                                i23 = i21;
                                                Object objX2 = ufo1Var.x(i20, iQ, obj2);
                                                int iG3 = zgo1.G(objX2, ufo1Var.v(iQ), bArr, i23, i2, i101, qhn1Var);
                                                qhn1Var = qhn1Var;
                                                unsafe9.putObject(obj2, ufo1Var.s(iQ) & 1048575, objX2);
                                                zjo1.i(obj2, iArr[i97] & 1048575, i20);
                                                bArr2 = bArr;
                                                iB = iG3;
                                                i8 = i22 == true ? 1 : 0;
                                                cjo1Var7 = cjo1Var;
                                                i24 = iQ;
                                                i7 = i20;
                                            }
                                            if (iB == i23) {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var1119 = cjo1VarB;
                                                byte[] bArr1118 = bArr2;
                                                int i51115 = i8;
                                                iB = zgo1.B(i51115 == true ? 1 : 0, bArr1118, i5, i2, cjo1Var1119, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i51115 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                                break;
                                            } else {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                                break;
                                            }
                                        default:
                                            bArr2 = bArr;
                                            i23 = i21;
                                            i8 = i22 == true ? 1 : 0;
                                            cjo1Var7 = cjo1Var;
                                            i24 = iQ;
                                            i7 = i20;
                                            qhn1Var = qhn1Var;
                                            iB = i23;
                                            if (iB == i23) {
                                                i2 = i2;
                                                bArr6 = bArr2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i41 = i8 == true ? 1 : 0;
                                                i40 = i6;
                                                iQ = i24;
                                            } else {
                                                i3 = i3;
                                                i5 = iB;
                                                iQ = i24;
                                                if (i8 == i3) {
                                                }
                                                iao1Var = (iao1) obj2;
                                                cjo1VarB = iao1Var.zzc;
                                                if (cjo1VarB == cjo1Var7) {
                                                    cjo1VarB = cjo1.b();
                                                    iao1Var.zzc = cjo1VarB;
                                                }
                                                cjo1 cjo1Var11110 = cjo1VarB;
                                                byte[] bArr1119 = bArr2;
                                                int i51116 = i8;
                                                iB = zgo1.B(i51116 == true ? 1 : 0, bArr1119, i5, i2, cjo1Var11110, qhn1Var);
                                                bArr6 = bArr;
                                                qhn1Var = qhn1Var;
                                                i41 = i51116 == true ? 1 : 0;
                                                i2 = i2;
                                                obj5 = obj2;
                                                i38 = i7;
                                                i40 = i6;
                                            }
                                            break;
                                    }
                                } else {
                                    if (z == 2) {
                                        int i102 = iQ / 3;
                                        Object obj7 = objArr[i102 + i102];
                                        Object object = unsafe.getObject(obj2, j2);
                                        if (!((leo1) object).a) {
                                            leo1 leo1Var2 = leo1.b;
                                            if (leo1Var2.isEmpty()) {
                                                leo1Var = new leo1();
                                            } else {
                                                leo1 leo1Var3 = new leo1(leo1Var2);
                                                leo1Var3.a = true;
                                                leo1Var = leo1Var3;
                                            }
                                            xbn1.a(leo1Var, object);
                                            unsafe.putObject(obj2, j2, leo1Var);
                                        }
                                        throw td6.k(obj7);
                                    }
                                    bArr2 = bArr;
                                    i5 = i21;
                                    i8 = i22;
                                    cjo1Var7 = cjo1Var;
                                    iQ = iQ;
                                    i7 = i20;
                                    i3 = i3;
                                    qhn1Var = qhn1Var;
                                    if (i8 == i3) {
                                    }
                                    iao1Var = (iao1) obj2;
                                    cjo1VarB = iao1Var.zzc;
                                    if (cjo1VarB == cjo1Var7) {
                                        cjo1VarB = cjo1.b();
                                        iao1Var.zzc = cjo1VarB;
                                    }
                                    cjo1 cjo1Var11111 = cjo1VarB;
                                    byte[] bArr11110 = bArr2;
                                    int i51117 = i8;
                                    iB = zgo1.B(i51117 == true ? 1 : 0, bArr11110, i5, i2, cjo1Var11111, qhn1Var);
                                    bArr6 = bArr;
                                    qhn1Var = qhn1Var;
                                    i41 = i51117 == true ? 1 : 0;
                                    i2 = i2;
                                    obj5 = obj2;
                                    i38 = i7;
                                    i40 = i6;
                                }
                                i39 = i4;
                                iZ = iB;
                                ufo1Var = this;
                            }
                        } else if (z == 2) {
                            ebo1 ebo1VarZzd2 = (ebo1) unsafe8.getObject(obj5, j2);
                            if (!((t3o1) ebo1VarZzd2).a) {
                                int size3 = ebo1VarZzd2.size();
                                ebo1VarZzd2 = ebo1VarZzd2.zzd(size3 == 0 ? 10 : size3 + size3);
                                unsafe8.putObject(obj5, j2, ebo1VarZzd2);
                            }
                            bArr6 = bArr;
                            i2 = i2;
                            iZ = zgo1.z(ufo1Var.v(iQ), i41 == true ? 1 : 0, bArr6, i43, i2, ebo1VarZzd2, qhn1Var);
                            qhn1Var = qhn1Var;
                            i41 = i41 == true ? 1 : 0;
                            i38 = i44;
                            iQ = iQ;
                            i40 = i6;
                            i39 = i4;
                            obj5 = obj;
                        } else {
                            obj2 = obj;
                            i20 = i44;
                            objArr = objArr2;
                            cjo1Var = cjo1Var7;
                            i21 = i43;
                            i22 = i41 == true ? 1 : 0;
                            unsafe = unsafe8;
                            bArr2 = bArr;
                            i5 = i21;
                            i8 = i22;
                            cjo1Var7 = cjo1Var;
                            iQ = iQ;
                            i7 = i20;
                            i3 = i3;
                            qhn1Var = qhn1Var;
                            if (i8 == i3) {
                            }
                            iao1Var = (iao1) obj2;
                            cjo1VarB = iao1Var.zzc;
                            if (cjo1VarB == cjo1Var7) {
                                cjo1VarB = cjo1.b();
                                iao1Var.zzc = cjo1VarB;
                            }
                            cjo1 cjo1Var11112 = cjo1VarB;
                            byte[] bArr11111 = bArr2;
                            int i51118 = i8;
                            iB = zgo1.B(i51118 == true ? 1 : 0, bArr11111, i5, i2, cjo1Var11112, qhn1Var);
                            bArr6 = bArr;
                            qhn1Var = qhn1Var;
                            i41 = i51118 == true ? 1 : 0;
                            i2 = i2;
                            obj5 = obj2;
                            i38 = i7;
                            i40 = i6;
                            i39 = i4;
                            iZ = iB;
                            ufo1Var = this;
                        }
                    }
                }
                bArr2 = bArr;
                if (i8 == i3) {
                }
                iao1Var = (iao1) obj2;
                cjo1VarB = iao1Var.zzc;
                if (cjo1VarB == cjo1Var7) {
                    cjo1VarB = cjo1.b();
                    iao1Var.zzc = cjo1VarB;
                }
                cjo1 cjo1Var11113 = cjo1VarB;
                byte[] bArr11112 = bArr2;
                int i51119 = i8;
                iB = zgo1.B(i51119 == true ? 1 : 0, bArr11112, i5, i2, cjo1Var11113, qhn1Var);
                bArr6 = bArr;
                qhn1Var = qhn1Var;
                i41 = i51119 == true ? 1 : 0;
                i2 = i2;
                obj5 = obj2;
                i38 = i7;
                i40 = i6;
                i39 = i4;
                iZ = iB;
                ufo1Var = this;
            } else {
                i3 = i3;
                i4 = i39;
                iArr = iArr2;
                objArr = objArr2;
                obj2 = obj5;
                unsafe = unsafe8;
            }
        }
        int i103 = i4;
        if (i103 != 1048575) {
            unsafe.putInt(obj2, i103, i40);
        }
        for (int i104 = this.g; i104 < this.h; i104++) {
            int i105 = this.f[i104];
            int i106 = iArr[i105];
            Object objG = zjo1.g(obj2, s(i105) & 1048575);
            if (objG != null && u(i105) != null) {
                int i107 = i105 / 3;
                throw td6.k(objArr[i107 + i107]);
            }
        }
        if (i3 == 0) {
            if (iZ != i2) {
                x4n1.i("Failed to parse the message.");
                return 0;
            }
        } else if (iZ > i2 || i41 != i3) {
            x4n1.i("Failed to parse the message.");
            return 0;
        }
        return iZ;
    }

    public final int q(int i, int i2) {
        int[] iArr = this.a;
        int length = (iArr.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = iArr[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }

    public final int s(int i) {
        return this.a[i + 1];
    }

    public final c3o1 u(int i) {
        int i2 = i / 3;
        return (c3o1) this.b[i2 + i2 + 1];
    }

    public final sgo1 v(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        sgo1 sgo1Var = (sgo1) objArr[i3];
        if (sgo1Var != null) {
            return sgo1Var;
        }
        sgo1 sgo1VarA = igo1.c.a((Class) objArr[i3 + 1]);
        objArr[i3] = sgo1VarA;
        return sgo1VarA;
    }

    public final Object w(int i, Object obj) {
        sgo1 sgo1VarV = v(i);
        int iS = s(i) & 1048575;
        if (!k(i, obj)) {
            return sgo1VarV.zze();
        }
        Object object = k.getObject(obj, iS);
        if (m(object)) {
            return object;
        }
        iao1 iao1VarZze = sgo1VarV.zze();
        if (object != null) {
            sgo1VarV.zzg(iao1VarZze, object);
        }
        return iao1VarZze;
    }

    public final Object x(int i, int i2, Object obj) {
        sgo1 sgo1VarV = v(i2);
        if (!n(i, i2, obj)) {
            return sgo1VarV.zze();
        }
        Object object = k.getObject(obj, s(i2) & 1048575);
        if (m(object)) {
            return object;
        }
        iao1 iao1VarZze = sgo1VarV.zze();
        if (object != null) {
            sgo1VarV.zzg(iao1VarZze, object);
        }
        return iao1VarZze;
    }

    @Override // p.sgo1
    public final iao1 zze() {
        return ((iao1) this.e).n();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x006f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0075  */
    /* JADX WARN: Code duplicated, block: B:44:0x0080 A[SYNTHETIC] */
    @Override // p.sgo1
    public final void zzf(Object obj) {
        if (!m(obj)) {
            return;
        }
        if (obj instanceof iao1) {
            iao1 iao1Var = (iao1) obj;
            iao1Var.g();
            iao1Var.zza = 0;
            iao1Var.e();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                cjo1 cjo1Var = ((iao1) obj).zzc;
                if (cjo1Var.e) {
                    cjo1Var.e = false;
                    return;
                }
                return;
            }
            int iS = s(i);
            int i2 = 1048575 & iS;
            int iR = r(iS);
            long j2 = i2;
            Unsafe unsafe = k;
            if (iR != 9) {
                if (iR != 60 && iR != 68) {
                    switch (iR) {
                        case 17:
                            if (k(i, obj)) {
                                v(i).zzf(unsafe.getObject(obj, j2));
                            }
                            break;
                        case 18:
                        case 19:
                        case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                        case 26:
                        case 27:
                        case 28:
                        case 29:
                        case 30:
                        case 31:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case 37:
                        case 38:
                        case 39:
                        case 40:
                        case 41:
                        case 42:
                        case 43:
                        case 44:
                        case 45:
                        case 46:
                        case 47:
                        case 48:
                        case 49:
                            t3o1 t3o1Var = (t3o1) ((ebo1) zjo1.g(obj, j2));
                            if (t3o1Var.a) {
                                t3o1Var.a = false;
                            }
                            break;
                        case 50:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((leo1) object).a = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (n(iArr[i], i, obj)) {
                    v(i).zzf(unsafe.getObject(obj, j2));
                }
            } else if (k(i, obj)) {
                v(i).zzf(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    @Override // p.sgo1
    public final void zzg(Object obj, Object obj2) {
        Object obj3;
        if (!m(obj)) {
            hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj)));
            return;
        }
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                ygo1.p(obj, obj2);
                return;
            }
            int iS = s(i);
            int i2 = iS & 1048575;
            int iR = r(iS);
            int i3 = iArr[i];
            long j2 = i2;
            switch (iR) {
                case SplitInstallErrorCode.NO_ERROR /* 0 */:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zkh1 zkh1Var = zjo1.c;
                        zkh1Var.v(obj3, j2, zkh1Var.j(obj2, j2));
                        i(i, obj3);
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 1:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zkh1 zkh1Var2 = zjo1.c;
                        zkh1Var2.z(obj3, j2, zkh1Var2.m(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 2:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.c.a.putLong(obj3, j2, zjo1.f(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 3:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.c.a.putLong(obj3, j2, zjo1.f(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 4:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 5:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.c.a.putLong(obj3, j2, zjo1.f(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 6:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 7:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zkh1 zkh1Var3 = zjo1.c;
                        zkh1Var3.q(obj3, j2, zkh1Var3.B(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 8:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.j(obj3, j2, zjo1.g(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 9:
                    obj3 = obj;
                    g(i, obj3, obj2);
                    continue;
                    i += 3;
                    obj = obj3;
                    break;
                case 10:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.j(obj3, j2, zjo1.g(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case grn1.d /* 12 */:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 13:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 14:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.c.a.putLong(obj3, j2, zjo1.f(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 15:
                    obj3 = obj;
                    if (k(i, obj2)) {
                        zjo1.i(obj3, j2, zjo1.e(obj2, j2));
                        i(i, obj3);
                    } else {
                        continue;
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 16:
                    if (k(i, obj2)) {
                        obj3 = obj;
                        zjo1.c.a.putLong(obj3, j2, zjo1.f(obj2, j2));
                        i(i, obj3);
                    }
                    i += 3;
                    obj = obj3;
                    break;
                case 17:
                    g(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case 29:
                case 30:
                case 31:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case 48:
                case 49:
                    ebo1 ebo1VarZzd = (ebo1) zjo1.g(obj, j2);
                    ebo1 ebo1Var = (ebo1) zjo1.g(obj2, j2);
                    int size = ebo1VarZzd.size();
                    int size2 = ebo1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((t3o1) ebo1VarZzd).a) {
                            ebo1VarZzd = ebo1VarZzd.zzd(size2 + size);
                        }
                        ebo1VarZzd.addAll(ebo1Var);
                    }
                    if (size > 0) {
                        ebo1Var = ebo1VarZzd;
                    }
                    zjo1.j(obj, j2, ebo1Var);
                    break;
                case 50:
                    fen1 fen1Var = ygo1.a;
                    zjo1.j(obj, j2, xbn1.a(zjo1.g(obj, j2), zjo1.g(obj2, j2)));
                    break;
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (n(i3, i, obj2)) {
                        zjo1.j(obj, j2, zjo1.g(obj2, j2));
                        zjo1.i(obj, iArr[i + 2] & 1048575, i3);
                    }
                    break;
                case 60:
                    h(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (n(i3, i, obj2)) {
                        zjo1.j(obj, j2, zjo1.g(obj2, j2));
                        zjo1.i(obj, iArr[i + 2] & 1048575, i3);
                    }
                    break;
                case 68:
                    h(i, obj, obj2);
                    break;
            }
            obj3 = obj;
            i += 3;
            obj = obj3;
        }
    }
}
