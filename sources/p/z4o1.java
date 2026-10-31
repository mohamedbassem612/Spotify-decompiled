package p;

import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class z4o1 implements r6o1 {
    public static final int[] j = new int[0];
    public static final Unsafe k = n9o1.p();
    public final int[] a;
    public final Object[] b;
    public final int c;
    public final int d;
    public final qrn1 e;
    public final int[] f;
    public final int g;
    public final int h;
    public final y1x0 i;

    public z4o1(int[] iArr, Object[] objArr, int i, int i2, qrn1 qrn1Var, int[] iArr2, int i3, int i4, y1x0 y1x0Var, own1 own1Var) {
        this.a = iArr;
        this.b = objArr;
        this.c = i;
        this.d = i2;
        this.f = iArr2;
        this.g = i3;
        this.h = i4;
        this.i = y1x0Var;
        this.e = qrn1Var;
    }

    public static int i(int i) {
        return (i >>> 20) & 255;
    }

    public static boolean j(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof vyn1) {
            return ((vyn1) obj).c();
        }
        return true;
    }

    public static void k(Object obj) {
        if (j(obj)) {
            return;
        }
        hhg1.n("Mutating immutable message: ".concat(String.valueOf(obj)));
    }

    public static int l(long j2, Object obj) {
        return ((Integer) n9o1.n(j2, obj)).intValue();
    }

    public static long m(long j2, Object obj) {
        return ((Long) n9o1.n(j2, obj)).longValue();
    }

    public static Field v(Class cls, String str) {
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
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + name.length() + 29 + String.valueOf(string).length());
            bb00.j(sb, "Field ", str, " for ", name);
            bhn0.o(l1d.n(" not found. Known fields are ", string, sb), e);
            return null;
        }
    }

    public final rgp1 A(int i) {
        int i2 = i / 3;
        return (rgp1) this.b[i2 + i2 + 1];
    }

    public final Object B(int i, Object obj) {
        r6o1 r6o1VarY = y(i);
        int iH = h(i) & 1048575;
        if (!p(i, obj)) {
            return r6o1VarY.zza();
        }
        Object object = k.getObject(obj, iH);
        if (j(object)) {
            return object;
        }
        vyn1 vyn1VarZza = r6o1VarY.zza();
        if (object != null) {
            r6o1VarY.a(vyn1VarZza, object);
        }
        return vyn1VarZza;
    }

    public final void C(int i, Object obj, Object obj2) {
        k.putObject(obj, h(i) & 1048575, obj2);
        q(i, obj);
    }

    public final Object D(int i, int i2, Object obj) {
        r6o1 r6o1VarY = y(i2);
        if (!r(i, i2, obj)) {
            return r6o1VarY.zza();
        }
        Object object = k.getObject(obj, h(i2) & 1048575);
        if (j(object)) {
            return object;
        }
        vyn1 vyn1VarZza = r6o1VarY.zza();
        if (object != null) {
            r6o1VarY.a(vyn1VarZza, object);
        }
        return vyn1VarZza;
    }

    public final void E(Object obj, int i, int i2, Object obj2) {
        k.putObject(obj, h(i2) & 1048575, obj2);
        s(i, i2, obj);
    }

    public final void a(Object obj, Object obj2) {
        k(obj);
        obj2.getClass();
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                y6o1.b(obj, obj2);
                return;
            }
            int iH = h(i);
            int i2 = 1048575 & iH;
            int i3 = i(iH);
            int i4 = iArr[i];
            long j2 = i2;
            switch (i3) {
                case 0:
                    if (p(i, obj2)) {
                        n9o1.m(obj, j2, n9o1.l(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 1:
                    if (p(i, obj2)) {
                        n9o1.k(obj, j2, n9o1.j(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 2:
                    if (p(i, obj2)) {
                        n9o1.g(obj, j2, n9o1.f(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 3:
                    if (p(i, obj2)) {
                        n9o1.g(obj, j2, n9o1.f(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 4:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 5:
                    if (p(i, obj2)) {
                        n9o1.g(obj, j2, n9o1.f(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 6:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 7:
                    if (p(i, obj2)) {
                        n9o1.i(obj, j2, n9o1.h(obj2, j2));
                        q(i, obj);
                    }
                    break;
                case 8:
                    if (p(i, obj2)) {
                        n9o1.o(obj, j2, n9o1.n(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 9:
                    w(i, obj, obj2);
                    break;
                case 10:
                    if (p(i, obj2)) {
                        n9o1.o(obj, j2, n9o1.n(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 11:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 12:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 13:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 14:
                    if (p(i, obj2)) {
                        n9o1.g(obj, j2, n9o1.f(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 15:
                    if (p(i, obj2)) {
                        n9o1.e(obj, n9o1.d(obj2, j2), j2);
                        q(i, obj);
                    }
                    break;
                case 16:
                    if (p(i, obj2)) {
                        n9o1.g(obj, j2, n9o1.f(j2, obj2));
                        q(i, obj);
                    }
                    break;
                case 17:
                    w(i, obj, obj2);
                    break;
                case 18:
                case 19:
                case 20:
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
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    c0o1 c0o1VarZzg = (c0o1) n9o1.n(j2, obj);
                    c0o1 c0o1Var = (c0o1) n9o1.n(j2, obj2);
                    int size = c0o1VarZzg.size();
                    int size2 = c0o1Var.size();
                    if (size > 0 && size2 > 0) {
                        if (!((wrn1) c0o1VarZzg).b()) {
                            c0o1VarZzg = c0o1VarZzg.zzg(size2 + size);
                        }
                        c0o1VarZzg.addAll(c0o1Var);
                    }
                    if (size > 0) {
                        c0o1Var = c0o1VarZzg;
                    }
                    n9o1.o(obj, j2, c0o1Var);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    y1x0 y1x0Var = y6o1.a;
                    n9o1.o(obj, j2, xpv0.l(n9o1.n(j2, obj), n9o1.n(j2, obj2)));
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (r(i4, i, obj2)) {
                        n9o1.o(obj, j2, n9o1.n(j2, obj2));
                        s(i4, i, obj);
                    }
                    break;
                case 60:
                    x(i, obj, obj2);
                    break;
                case 61:
                case 62:
                case 63:
                case 64:
                case 65:
                case 66:
                case 67:
                    if (r(i4, i, obj2)) {
                        n9o1.o(obj, j2, n9o1.n(j2, obj2));
                        s(i4, i, obj);
                    }
                    break;
                case 68:
                    x(i, obj, obj2);
                    break;
            }
            i += 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0071  */
    /* JADX WARN: Code duplicated, block: B:39:0x007c A[SYNTHETIC] */
    public final void b(Object obj) {
        if (!j(obj)) {
            return;
        }
        if (obj instanceof vyn1) {
            vyn1 vyn1Var = (vyn1) obj;
            vyn1Var.g();
            vyn1Var.zza = 0;
            vyn1Var.d();
        }
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i >= iArr.length) {
                this.i.getClass();
                y1x0.f(obj);
                return;
            }
            int iH = h(i);
            int i2 = 1048575 & iH;
            int i3 = i(iH);
            long j2 = i2;
            Unsafe unsafe = k;
            if (i3 != 9) {
                if (i3 != 60 && i3 != 68) {
                    switch (i3) {
                        case 17:
                            if (p(i, obj)) {
                                y(i).b(unsafe.getObject(obj, j2));
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
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
                        case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                            ((c0o1) n9o1.n(j2, obj)).zzb();
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                            Object object = unsafe.getObject(obj, j2);
                            if (object != null) {
                                ((j3o1) object).a = false;
                                unsafe.putObject(obj, j2, object);
                            }
                            break;
                    }
                } else if (r(iArr[i], i, obj)) {
                    y(i).b(unsafe.getObject(obj, j2));
                }
            } else if (p(i, obj)) {
                y(i).b(unsafe.getObject(obj, j2));
            }
            i += 3;
        }
    }

    public final void c(Object obj, y1t0 y1t0Var) {
        int i;
        vun1 vun1Var = (vun1) y1t0Var.b;
        int i2 = 1048575;
        int i3 = 1048575;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i4 >= iArr.length) {
                ((vyn1) obj).zzc.b(y1t0Var);
                return;
            }
            int iH = h(i4);
            int i6 = i(iH);
            int i7 = iArr[i4];
            Unsafe unsafe = k;
            if (i6 <= 17) {
                int i8 = iArr[i4 + 2];
                int i9 = i8 & i2;
                if (i9 != i3) {
                    i5 = i9 == i2 ? 0 : unsafe.getInt(obj, i9);
                    i3 = i9;
                }
                i = 1 << (i8 >>> 20);
            } else {
                i = 0;
            }
            long j2 = iH & i2;
            switch (i6) {
                case 0:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.f(i7, Double.doubleToRawLongBits(n9o1.l(j2, obj)));
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 1:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.d(i7, Float.floatToRawIntBits(n9o1.j(j2, obj)));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 2:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.e(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 3:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.e(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 4:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.b(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 5:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.f(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 6:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.d(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 7:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.g(i7, n9o1.h(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 8:
                    if (o(obj, i4, i3, i5, i)) {
                        Object object = unsafe.getObject(obj, j2);
                        if (object instanceof String) {
                            vun1Var.h(i7, (String) object);
                        } else {
                            vun1Var.i(i7, (gun1) object);
                        }
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 9:
                    if (o(obj, i4, i3, i5, i)) {
                        y1t0Var.q(i7, unsafe.getObject(obj, j2), y(i4));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 10:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.i(i7, (gun1) unsafe.getObject(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 11:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.c(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 12:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.b(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 13:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.d(i7, unsafe.getInt(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 14:
                    if (o(obj, i4, i3, i5, i)) {
                        vun1Var.f(i7, unsafe.getLong(obj, j2));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 15:
                    if (o(obj, i4, i3, i5, i)) {
                        int i10 = unsafe.getInt(obj, j2);
                        vun1Var.c(i7, (i10 >> 31) ^ (i10 + i10));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 16:
                    if (o(obj, i4, i3, i5, i)) {
                        long j3 = unsafe.getLong(obj, j2);
                        vun1Var.e(i7, (j3 >> 63) ^ (j3 + j3));
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 17:
                    if (o(obj, i4, i3, i5, i)) {
                        Object object2 = unsafe.getObject(obj, j2);
                        vun1Var.a(i7, 3);
                        y(i4).c((qrn1) object2, y1t0Var);
                        vun1Var.a(i7, 4);
                    } else {
                        continue;
                    }
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 18:
                    y6o1.e(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 19:
                    y6o1.f(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 20:
                    y6o1.g(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 21:
                    y6o1.h(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 22:
                    y6o1.l(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 23:
                    y6o1.j(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 24:
                    y6o1.o(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 25:
                    y6o1.r(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 26:
                    int i11 = iArr[i4];
                    j1o1 j1o1Var = (List) unsafe.getObject(obj, j2);
                    y1x0 y1x0Var = y6o1.a;
                    if (j1o1Var != null && !j1o1Var.isEmpty()) {
                        if (j1o1Var instanceof j1o1) {
                            j1o1 j1o1Var2 = j1o1Var;
                            for (int i12 = 0; i12 < j1o1Var.size(); i12++) {
                                Object objZzc = j1o1Var2.zzc();
                                if (objZzc instanceof String) {
                                    vun1Var.h(i11, (String) objZzc);
                                } else {
                                    vun1Var.i(i11, (gun1) objZzc);
                                }
                            }
                        } else {
                            for (int i13 = 0; i13 < j1o1Var.size(); i13++) {
                                vun1Var.h(i11, (String) j1o1Var.get(i13));
                            }
                        }
                    }
                    break;
                case 27:
                    int i14 = iArr[i4];
                    List list = (List) unsafe.getObject(obj, j2);
                    r6o1 r6o1VarY = y(i4);
                    y1x0 y1x0Var2 = y6o1.a;
                    if (list != null && !list.isEmpty()) {
                        for (int i15 = 0; i15 < list.size(); i15++) {
                            y1t0Var.q(i14, list.get(i15), r6o1VarY);
                        }
                    }
                    break;
                case 28:
                    int i16 = iArr[i4];
                    List list2 = (List) unsafe.getObject(obj, j2);
                    y1x0 y1x0Var3 = y6o1.a;
                    if (list2 != null && !list2.isEmpty()) {
                        for (int i17 = 0; i17 < list2.size(); i17++) {
                            vun1Var.i(i16, (gun1) list2.get(i17));
                        }
                    }
                    break;
                case 29:
                    y6o1.m(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 30:
                    y6o1.q(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 31:
                    y6o1.p(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 32:
                    y6o1.k(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 33:
                    y6o1.n(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 34:
                    y6o1.i(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, false);
                    continue;
                    i4 += 3;
                    i2 = 1048575;
                    break;
                case 35:
                    y6o1.e(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 36:
                    y6o1.f(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 37:
                    y6o1.g(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 38:
                    y6o1.h(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 39:
                    y6o1.l(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 40:
                    y6o1.j(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 41:
                    y6o1.o(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 42:
                    y6o1.r(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 43:
                    y6o1.m(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 44:
                    y6o1.q(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case 45:
                    y6o1.p(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    y6o1.k(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    y6o1.n(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    y6o1.i(iArr[i4], (List) unsafe.getObject(obj, j2), y1t0Var, true);
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    int i18 = iArr[i4];
                    List list3 = (List) unsafe.getObject(obj, j2);
                    r6o1 r6o1VarY2 = y(i4);
                    y1x0 y1x0Var4 = y6o1.a;
                    if (list3 != null && !list3.isEmpty()) {
                        for (int i19 = 0; i19 < list3.size(); i19++) {
                            qrn1 qrn1Var = (qrn1) list3.get(i19);
                            vun1Var.a(i18, 3);
                            r6o1VarY2.c(qrn1Var, y1t0Var);
                            vun1Var.a(i18, 4);
                        }
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    if (unsafe.getObject(obj, j2) != null) {
                        pze0.m(z(i4));
                        throw null;
                    }
                    break;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (r(i7, i4, obj)) {
                        vun1Var.f(i7, Double.doubleToRawLongBits(((Double) n9o1.n(j2, obj)).doubleValue()));
                    }
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (r(i7, i4, obj)) {
                        vun1Var.d(i7, Float.floatToRawIntBits(((Float) n9o1.n(j2, obj)).floatValue()));
                    }
                    break;
                case 53:
                    if (r(i7, i4, obj)) {
                        vun1Var.e(i7, m(j2, obj));
                    }
                    break;
                case 54:
                    if (r(i7, i4, obj)) {
                        vun1Var.e(i7, m(j2, obj));
                    }
                    break;
                case 55:
                    if (r(i7, i4, obj)) {
                        vun1Var.b(i7, l(j2, obj));
                    }
                    break;
                case 56:
                    if (r(i7, i4, obj)) {
                        vun1Var.f(i7, m(j2, obj));
                    }
                    break;
                case 57:
                    if (r(i7, i4, obj)) {
                        vun1Var.d(i7, l(j2, obj));
                    }
                    break;
                case 58:
                    if (r(i7, i4, obj)) {
                        vun1Var.g(i7, ((Boolean) n9o1.n(j2, obj)).booleanValue());
                    }
                    break;
                case 59:
                    if (r(i7, i4, obj)) {
                        Object object3 = unsafe.getObject(obj, j2);
                        if (object3 instanceof String) {
                            vun1Var.h(i7, (String) object3);
                        } else {
                            vun1Var.i(i7, (gun1) object3);
                        }
                    }
                    break;
                case 60:
                    if (r(i7, i4, obj)) {
                        y1t0Var.q(i7, unsafe.getObject(obj, j2), y(i4));
                    }
                    break;
                case 61:
                    if (r(i7, i4, obj)) {
                        vun1Var.i(i7, (gun1) unsafe.getObject(obj, j2));
                    }
                    break;
                case 62:
                    if (r(i7, i4, obj)) {
                        vun1Var.c(i7, l(j2, obj));
                    }
                    break;
                case 63:
                    if (r(i7, i4, obj)) {
                        vun1Var.b(i7, l(j2, obj));
                    }
                    break;
                case 64:
                    if (r(i7, i4, obj)) {
                        vun1Var.d(i7, l(j2, obj));
                    }
                    break;
                case 65:
                    if (r(i7, i4, obj)) {
                        vun1Var.f(i7, m(j2, obj));
                    }
                    break;
                case 66:
                    if (r(i7, i4, obj)) {
                        int iL = l(j2, obj);
                        vun1Var.c(i7, (iL >> 31) ^ (iL + iL));
                    }
                    break;
                case 67:
                    if (r(i7, i4, obj)) {
                        long jM = m(j2, obj);
                        vun1Var.e(i7, (jM >> 63) ^ (jM + jM));
                    }
                    break;
                case 68:
                    if (r(i7, i4, obj)) {
                        Object object4 = unsafe.getObject(obj, j2);
                        vun1Var.a(i7, 3);
                        y(i4).c((qrn1) object4, y1t0Var);
                        vun1Var.a(i7, 4);
                    }
                    break;
            }
            i4 += 3;
            i2 = 1048575;
        }
    }

    public final int d(vyn1 vyn1Var) {
        int i;
        long jDoubleToLongBits;
        int i2;
        int iFloatToIntBits;
        int i3;
        int iHashCode = 0;
        for (int i4 = 0; i4 < this.a.length; i4 += 3) {
            int iH = h(i4);
            int i5 = i(iH);
            if (i5 <= 50 || i5 >= 69) {
                long j2 = iH & 1048575;
                int iHashCode2 = 37;
                switch (i5) {
                    case 0:
                        i = iHashCode * 53;
                        jDoubleToLongBits = Double.doubleToLongBits(n9o1.l(j2, vyn1Var));
                        byte[] bArr = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 1:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = Float.floatToIntBits(n9o1.j(j2, vyn1Var));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 2:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n9o1.f(j2, vyn1Var);
                        byte[] bArr2 = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 3:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n9o1.f(j2, vyn1Var);
                        byte[] bArr3 = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 4:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 5:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n9o1.f(j2, vyn1Var);
                        byte[] bArr4 = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 6:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 7:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = h0o1.a(n9o1.h(vyn1Var, j2));
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 8:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = ((String) n9o1.n(j2, vyn1Var)).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 9:
                        i3 = iHashCode * 53;
                        Object objN = n9o1.n(j2, vyn1Var);
                        if (objN != null) {
                            iHashCode2 = objN.hashCode();
                        }
                        iHashCode = i3 + iHashCode2;
                        break;
                    case 10:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.n(j2, vyn1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 11:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 12:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 13:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 14:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n9o1.f(j2, vyn1Var);
                        byte[] bArr5 = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 15:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.d(vyn1Var, j2);
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case 16:
                        i = iHashCode * 53;
                        jDoubleToLongBits = n9o1.f(j2, vyn1Var);
                        byte[] bArr6 = h0o1.a;
                        iHashCode = i + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
                        break;
                    case 17:
                        i3 = iHashCode * 53;
                        Object objN2 = n9o1.n(j2, vyn1Var);
                        if (objN2 != null) {
                            iHashCode2 = objN2.hashCode();
                        }
                        iHashCode = i3 + iHashCode2;
                        break;
                    case 18:
                    case 19:
                    case 20:
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
                    case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.n(j2, vyn1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                    case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                        i2 = iHashCode * 53;
                        iFloatToIntBits = n9o1.n(j2, vyn1Var).hashCode();
                        iHashCode = i2 + iFloatToIntBits;
                        break;
                }
            }
        }
        int i6 = this.h;
        while (true) {
            int[] iArr = this.f;
            if (i6 >= iArr.length) {
                return vyn1Var.zzc.hashCode() + (iHashCode * 53);
            }
            int i7 = iArr[i6];
            if (!r(0, i7, vyn1Var)) {
                iHashCode = n9o1.n(h(i7) & 1048575, vyn1Var).hashCode() + (iHashCode * 53);
            }
            i6++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0211 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:171:0x01ca A[SYNTHETIC] */
    public final boolean e(vyn1 vyn1Var, vyn1 vyn1Var2) {
        boolean zA;
        int i = 0;
        while (true) {
            int[] iArr = this.a;
            if (i < iArr.length) {
                int iH = h(i);
                int i2 = i(iH);
                if (i2 <= 50 || i2 >= 69) {
                    long j2 = iH & 1048575;
                    switch (i2) {
                        case 0:
                            if (!n(vyn1Var, vyn1Var2, i) || Double.doubleToLongBits(n9o1.l(j2, vyn1Var)) != Double.doubleToLongBits(n9o1.l(j2, vyn1Var2))) {
                            }
                            break;
                        case 1:
                            if (!n(vyn1Var, vyn1Var2, i) || Float.floatToIntBits(n9o1.j(j2, vyn1Var)) != Float.floatToIntBits(n9o1.j(j2, vyn1Var2))) {
                            }
                            break;
                        case 2:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.f(j2, vyn1Var) != n9o1.f(j2, vyn1Var2)) {
                            }
                            break;
                        case 3:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.f(j2, vyn1Var) != n9o1.f(j2, vyn1Var2)) {
                            }
                            break;
                        case 4:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 5:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.f(j2, vyn1Var) != n9o1.f(j2, vyn1Var2)) {
                            }
                            break;
                        case 6:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 7:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.h(vyn1Var, j2) != n9o1.h(vyn1Var2, j2)) {
                            }
                            break;
                        case 8:
                            if (!n(vyn1Var, vyn1Var2, i) || !y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2))) {
                            }
                            break;
                        case 9:
                            if (!n(vyn1Var, vyn1Var2, i) || !y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2))) {
                            }
                            break;
                        case 10:
                            if (!n(vyn1Var, vyn1Var2, i) || !y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2))) {
                            }
                            break;
                        case 11:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 12:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 13:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 14:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.f(j2, vyn1Var) != n9o1.f(j2, vyn1Var2)) {
                            }
                            break;
                        case 15:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.d(vyn1Var, j2) != n9o1.d(vyn1Var2, j2)) {
                            }
                            break;
                        case 16:
                            if (!n(vyn1Var, vyn1Var2, i) || n9o1.f(j2, vyn1Var) != n9o1.f(j2, vyn1Var2)) {
                            }
                            break;
                        case 17:
                            if (!n(vyn1Var, vyn1Var2, i) || !y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2))) {
                            }
                            break;
                        case 18:
                        case 19:
                        case 20:
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
                        case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                            zA = y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2));
                            if (zA) {
                            }
                            break;
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                            zA = y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2));
                            if (zA) {
                            }
                            break;
                        case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                        case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
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
                            if (n9o1.d(vyn1Var, j3) == n9o1.d(vyn1Var2, j3) && y6o1.a(n9o1.n(j2, vyn1Var), n9o1.n(j2, vyn1Var2))) {
                            }
                            break;
                        default:
                            continue;
                    }
                }
                i += 3;
            } else {
                int i3 = this.h;
                while (true) {
                    int[] iArr2 = this.f;
                    if (i3 < iArr2.length) {
                        int i4 = iArr2[i3];
                        long j4 = iArr[i4 + 2] & 1048575;
                        if (n9o1.d(vyn1Var, j4) != n9o1.d(vyn1Var2, j4)) {
                            return false;
                        }
                        if (!r(0, i4, vyn1Var)) {
                            long jH = h(i4) & 1048575;
                            if (!y6o1.a(n9o1.n(jH, vyn1Var), n9o1.n(jH, vyn1Var2))) {
                            }
                        }
                        i3++;
                    } else if (vyn1Var.zzc.equals(vyn1Var2.zzc)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void f(Object obj, byte[] bArr, int i, int i2, qhn1 qhn1Var) {
        u(obj, bArr, i, i2, 0, qhn1Var);
    }

    /* JADX WARN: Code duplicated, block: B:140:0x0331  */
    /* JADX WARN: Code duplicated, block: B:195:0x0474  */
    /* JADX WARN: Code duplicated, block: B:227:0x055b  */
    /* JADX WARN: Code duplicated, block: B:230:0x0569  */
    /* JADX WARN: Code duplicated, block: B:34:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b2  */
    public final int g(qrn1 qrn1Var) {
        int i;
        int iQ;
        int iR;
        int iQ2;
        int iB;
        int iQ3;
        int iA;
        int i2;
        int iQ4;
        int iD;
        int iQ5;
        int size;
        int iT;
        int iQ6;
        int iQ7;
        int iQ8;
        int iB2;
        int iQ9;
        int iD2;
        int iQ10;
        int iR2;
        int iL;
        int iQ11;
        int i3 = 1048575;
        int i4 = 1048575;
        int i5 = 0;
        int i6 = 0;
        int iD3 = 0;
        while (true) {
            int[] iArr = this.a;
            if (i5 >= iArr.length) {
                return ((vyn1) qrn1Var).zzc.c() + iD3;
            }
            int iH = h(i5);
            int i7 = i(iH);
            int i8 = iArr[i5];
            int i9 = iArr[i5 + 2];
            int i10 = i9 & i3;
            Unsafe unsafe = k;
            if (i7 <= 17) {
                if (i10 != i4) {
                    i6 = i10 == i3 ? 0 : unsafe.getInt(qrn1Var, i10);
                    i4 = i10;
                }
                i = 1 << (i9 >>> 20);
            } else {
                i = 0;
            }
            int i11 = iH & i3;
            if (i7 >= fxn1.b.a) {
                byte b = fxn1.c.a;
            }
            long j2 = i11;
            switch (i7) {
                case 0:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 1:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 2:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        long j3 = unsafe.getLong(qrn1Var, j2);
                        iQ = vun1.q(i8 << 3);
                        iR = vun1.r(j3);
                        iD = iR + iQ;
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 3:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        long j4 = unsafe.getLong(qrn1Var, j2);
                        iQ = vun1.q(i8 << 3);
                        iR = vun1.r(j4);
                        iD = iR + iQ;
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 4:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        long j5 = unsafe.getInt(qrn1Var, j2);
                        iQ = vun1.q(i8 << 3);
                        iR = vun1.r(j5);
                        iD = iR + iQ;
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 5:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 6:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 7:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 1, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 8:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        int i12 = i8 << 3;
                        Object object = unsafe.getObject(qrn1Var, j2);
                        if (object instanceof gun1) {
                            iQ2 = vun1.q(i12);
                            iB = ((gun1) object).c();
                        } else {
                            iQ2 = vun1.q(i12);
                            iB = jao1.b((String) object);
                        }
                        iD3 = lqn1.e(iB, iB, iQ2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 9:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        Object object2 = unsafe.getObject(qrn1Var, j2);
                        r6o1 r6o1VarY = y(i5);
                        y1x0 y1x0Var = y6o1.a;
                        iQ3 = vun1.q(i8 << 3);
                        iA = ((qrn1) object2).a(r6o1VarY);
                        iD3 = lqn1.e(iA, iA, iQ3, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 10:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        gun1 gun1Var = (gun1) unsafe.getObject(qrn1Var, j2);
                        iQ2 = vun1.q(i8 << 3);
                        iB = gun1Var.c();
                        iD3 = lqn1.e(iB, iB, iQ2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 11:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        i2 = unsafe.getInt(qrn1Var, j2);
                        iQ4 = vun1.q(i8 << 3);
                        iD3 = lqn1.d(i2, iQ4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 12:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        long j6 = unsafe.getInt(qrn1Var, j2);
                        iQ = vun1.q(i8 << 3);
                        iR = vun1.r(j6);
                        iD = iR + iQ;
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 13:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 14:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 15:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        int i13 = unsafe.getInt(qrn1Var, j2);
                        iQ4 = vun1.q(i8 << 3);
                        i2 = (i13 >> 31) ^ (i13 + i13);
                        iD3 = lqn1.d(i2, iQ4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 16:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        long j7 = unsafe.getLong(qrn1Var, j2);
                        iQ = vun1.q(i8 << 3);
                        iR = vun1.r((j7 >> 63) ^ (j7 + j7));
                        iD = iR + iQ;
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 17:
                    if (o(qrn1Var, i5, i4, i6, i)) {
                        iD = y6o1.D(i8, (qrn1) unsafe.getObject(qrn1Var, j2), y(i5));
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 18:
                    iD = y6o1.C(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 19:
                    iD = y6o1.A(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 20:
                    List list = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var2 = y6o1.a;
                    if (list.size() == 0) {
                        iQ5 = 0;
                    } else {
                        iQ5 = (vun1.q(i8 << 3) * list.size()) + y6o1.s(list);
                    }
                    iD3 += iQ5;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 21:
                    List list2 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var3 = y6o1.a;
                    size = list2.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.t(list2);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 22:
                    List list3 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var4 = y6o1.a;
                    size = list3.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.w(list3);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 23:
                    iD = y6o1.C(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 24:
                    iD = y6o1.A(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 25:
                    List list4 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var5 = y6o1.a;
                    int size2 = list4.size();
                    if (size2 == 0) {
                        iQ5 = 0;
                    } else {
                        iQ5 = (vun1.q(i8 << 3) + 1) * size2;
                    }
                    iD3 += iQ5;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 26:
                    j1o1 j1o1Var = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var6 = y6o1.a;
                    int size3 = j1o1Var.size();
                    if (size3 == 0) {
                        iQ7 = 0;
                    } else {
                        iQ7 = vun1.q(i8 << 3) * size3;
                        if (j1o1Var instanceof j1o1) {
                            j1o1 j1o1Var2 = j1o1Var;
                            for (int i14 = 0; i14 < size3; i14++) {
                                Object objZzc = j1o1Var2.zzc();
                                int iC = objZzc instanceof gun1 ? ((gun1) objZzc).c() : jao1.b((String) objZzc);
                                iQ7 = lqn1.d(iC, iC, iQ7);
                            }
                        } else {
                            for (int i15 = 0; i15 < size3; i15++) {
                                Object obj = j1o1Var.get(i15);
                                int iC2 = obj instanceof gun1 ? ((gun1) obj).c() : jao1.b((String) obj);
                                iQ7 = lqn1.d(iC2, iC2, iQ7);
                            }
                        }
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 27:
                    List list5 = (List) unsafe.getObject(qrn1Var, j2);
                    r6o1 r6o1VarY2 = y(i5);
                    y1x0 y1x0Var7 = y6o1.a;
                    int size4 = list5.size();
                    if (size4 == 0) {
                        iQ8 = 0;
                    } else {
                        iQ8 = vun1.q(i8 << 3) * size4;
                        for (int i16 = 0; i16 < size4; i16++) {
                            int iA2 = ((qrn1) list5.get(i16)).a(r6o1VarY2);
                            iQ8 = lqn1.d(iA2, iA2, iQ8);
                        }
                    }
                    iD3 += iQ8;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 28:
                    List list6 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var8 = y6o1.a;
                    int size5 = list6.size();
                    if (size5 == 0) {
                        iQ7 = 0;
                    } else {
                        iQ7 = vun1.q(i8 << 3) * size5;
                        for (int i17 = 0; i17 < list6.size(); i17++) {
                            int iC3 = ((gun1) list6.get(i17)).c();
                            iQ7 = lqn1.d(iC3, iC3, iQ7);
                        }
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 29:
                    List list7 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var9 = y6o1.a;
                    size = list7.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.x(list7);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 30:
                    List list8 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var10 = y6o1.a;
                    size = list8.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.v(list8);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 31:
                    iD = y6o1.A(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 32:
                    iD = y6o1.C(i8, (List) unsafe.getObject(qrn1Var, j2));
                    iD3 += iD;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 33:
                    List list9 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var11 = y6o1.a;
                    size = list9.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.y(list9);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 34:
                    List list10 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var12 = y6o1.a;
                    size = list10.size();
                    if (size == 0) {
                        iQ7 = 0;
                    } else {
                        iT = y6o1.u(list10);
                        iQ6 = vun1.q(i8 << 3);
                        iQ7 = (iQ6 * size) + iT;
                    }
                    iD3 += iQ7;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 35:
                    iB2 = y6o1.B((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 36:
                    iB2 = y6o1.z((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 37:
                    iB2 = y6o1.s((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 38:
                    iB2 = y6o1.t((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 39:
                    iB2 = y6o1.w((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 40:
                    iB2 = y6o1.B((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 41:
                    iB2 = y6o1.z((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 42:
                    List list11 = (List) unsafe.getObject(qrn1Var, j2);
                    y1x0 y1x0Var13 = y6o1.a;
                    iB2 = list11.size();
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 43:
                    iB2 = y6o1.x((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 44:
                    iB2 = y6o1.v((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 45:
                    iB2 = y6o1.z((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                    iB2 = y6o1.B((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                    iB2 = y6o1.y((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                    iB2 = y6o1.u((List) unsafe.getObject(qrn1Var, j2));
                    if (iB2 > 0) {
                        iQ9 = vun1.q(i8 << 3);
                        iD3 = lqn1.e(iB2, iQ9, iB2, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                    List list12 = (List) unsafe.getObject(qrn1Var, j2);
                    r6o1 r6o1VarY3 = y(i5);
                    y1x0 y1x0Var14 = y6o1.a;
                    int size6 = list12.size();
                    if (size6 == 0) {
                        iD2 = 0;
                    } else {
                        iD2 = 0;
                        for (int i18 = 0; i18 < size6; i18++) {
                            iD2 += y6o1.D(i8, (qrn1) list12.get(i18), r6o1VarY3);
                        }
                    }
                    iD3 += iD2;
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                    j3o1 j3o1Var = (j3o1) unsafe.getObject(qrn1Var, j2);
                    pze0.m(z(i5));
                    if (j3o1Var.isEmpty()) {
                        continue;
                    } else {
                        Iterator it = j3o1Var.entrySet().iterator();
                        if (it.hasNext()) {
                            Map.Entry entry = (Map.Entry) it.next();
                            entry.getKey();
                            entry.getValue();
                            throw null;
                        }
                    }
                    i5 += 3;
                    i3 = 1048575;
                case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 53:
                    if (r(i8, i5, qrn1Var)) {
                        long jM = m(j2, qrn1Var);
                        iQ10 = vun1.q(i8 << 3);
                        iR2 = vun1.r(jM);
                        iD3 += iR2 + iQ10;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 54:
                    if (r(i8, i5, qrn1Var)) {
                        long jM2 = m(j2, qrn1Var);
                        iQ10 = vun1.q(i8 << 3);
                        iR2 = vun1.r(jM2);
                        iD3 += iR2 + iQ10;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 55:
                    if (r(i8, i5, qrn1Var)) {
                        long jL = l(j2, qrn1Var);
                        iQ10 = vun1.q(i8 << 3);
                        iR2 = vun1.r(jL);
                        iD3 += iR2 + iQ10;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 56:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 57:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 58:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 1, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 59:
                    if (r(i8, i5, qrn1Var)) {
                        int i19 = i8 << 3;
                        Object object3 = unsafe.getObject(qrn1Var, j2);
                        if (object3 instanceof gun1) {
                            iQ3 = vun1.q(i19);
                            iA = ((gun1) object3).c();
                        } else {
                            iQ3 = vun1.q(i19);
                            iA = jao1.b((String) object3);
                        }
                        iD3 = lqn1.e(iA, iA, iQ3, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 60:
                    if (r(i8, i5, qrn1Var)) {
                        Object object4 = unsafe.getObject(qrn1Var, j2);
                        r6o1 r6o1VarY4 = y(i5);
                        y1x0 y1x0Var15 = y6o1.a;
                        iQ3 = vun1.q(i8 << 3);
                        iA = ((qrn1) object4).a(r6o1VarY4);
                        iD3 = lqn1.e(iA, iA, iQ3, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 61:
                    if (r(i8, i5, qrn1Var)) {
                        gun1 gun1Var2 = (gun1) unsafe.getObject(qrn1Var, j2);
                        iQ3 = vun1.q(i8 << 3);
                        iA = gun1Var2.c();
                        iD3 = lqn1.e(iA, iA, iQ3, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 62:
                    if (r(i8, i5, qrn1Var)) {
                        iL = l(j2, qrn1Var);
                        iQ11 = vun1.q(i8 << 3);
                        iD3 = lqn1.d(iL, iQ11, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 63:
                    if (r(i8, i5, qrn1Var)) {
                        long jL2 = l(j2, qrn1Var);
                        iQ10 = vun1.q(i8 << 3);
                        iR2 = vun1.r(jL2);
                        iD3 += iR2 + iQ10;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 64:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 4, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 65:
                    if (r(i8, i5, qrn1Var)) {
                        iD3 = lqn1.d(i8 << 3, 8, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 66:
                    if (r(i8, i5, qrn1Var)) {
                        int iL2 = l(j2, qrn1Var);
                        iQ11 = vun1.q(i8 << 3);
                        iL = (iL2 >> 31) ^ (iL2 + iL2);
                        iD3 = lqn1.d(iL, iQ11, iD3);
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 67:
                    if (r(i8, i5, qrn1Var)) {
                        long jM3 = m(j2, qrn1Var);
                        iQ10 = vun1.q(i8 << 3);
                        iR2 = vun1.r((jM3 >> 63) ^ (jM3 + jM3));
                        iD3 += iR2 + iQ10;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                case 68:
                    if (r(i8, i5, qrn1Var)) {
                        iD = y6o1.D(i8, (qrn1) unsafe.getObject(qrn1Var, j2), y(i5));
                        iD3 += iD;
                    }
                    i5 += 3;
                    i3 = 1048575;
                    break;
                default:
                    i5 += 3;
                    i3 = 1048575;
                    break;
            }
        }
    }

    public final int h(int i) {
        return this.a[i + 1];
    }

    public final boolean n(vyn1 vyn1Var, vyn1 vyn1Var2, int i) {
        return p(i, vyn1Var) == p(i, vyn1Var2);
    }

    public final boolean o(Object obj, int i, int i2, int i3, int i4) {
        if (i2 == 1048575) {
            return p(i, obj);
        }
        return (i3 & i4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:72:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x00ef A[RETURN] */
    public final boolean p(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = i2 & 1048575;
        if (j2 != 1048575) {
            if (((1 << (i2 >>> 20)) & n9o1.d(obj, j2)) != 0) {
                return true;
            }
            return false;
        }
        int iH = h(i);
        long j3 = iH & 1048575;
        switch (i(iH)) {
            case 0:
                if (Double.doubleToRawLongBits(n9o1.l(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 1:
                if (Float.floatToRawIntBits(n9o1.j(j3, obj)) != 0) {
                    return true;
                }
                return false;
            case 2:
                if (n9o1.f(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 3:
                if (n9o1.f(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 4:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 5:
                if (n9o1.f(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 6:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 7:
                return n9o1.h(obj, j3);
            case 8:
                Object objN = n9o1.n(j3, obj);
                if (objN instanceof String) {
                    if (((String) objN).isEmpty()) {
                        return false;
                    }
                    return true;
                }
                if (!(objN instanceof gun1)) {
                    bhn0.q();
                    return false;
                }
                if (gun1.b.equals(objN)) {
                    return false;
                }
                return true;
            case 9:
                if (n9o1.n(j3, obj) != null) {
                    return true;
                }
                return false;
            case 10:
                if (gun1.b.equals(n9o1.n(j3, obj))) {
                    return false;
                }
                return true;
            case 11:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 12:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 13:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 14:
                if (n9o1.f(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 15:
                if (n9o1.d(obj, j3) != 0) {
                    return true;
                }
                return false;
            case 16:
                if (n9o1.f(j3, obj) != 0) {
                    return true;
                }
                return false;
            case 17:
                if (n9o1.n(j3, obj) != null) {
                    return true;
                }
                return false;
            default:
                bhn0.q();
                return false;
        }
    }

    public final void q(int i, Object obj) {
        int i2 = this.a[i + 2];
        long j2 = 1048575 & i2;
        if (j2 == 1048575) {
            return;
        }
        n9o1.e(obj, (1 << (i2 >>> 20)) | n9o1.d(obj, j2), j2);
    }

    public final boolean r(int i, int i2, Object obj) {
        return n9o1.d(obj, (long) (this.a[i2 + 2] & 1048575)) == i;
    }

    public final void s(int i, int i2, Object obj) {
        n9o1.e(obj, i, this.a[i2 + 2] & 1048575);
    }

    public final int t(int i, int i2) {
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

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31841. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public final int u(java.lang.Object r32, byte[] r33, int r34, int r35, int r36, p.qhn1 r37) {
        /*
            Method dump skipped, instruction units count: 3184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.z4o1.u(java.lang.Object, byte[], int, int, int, p.qhn1):int");
    }

    public final void w(int i, Object obj, Object obj2) {
        if (p(i, obj2)) {
            long jH = h(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                int i2 = this.a[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i2).length() + 38 + string.length(), i2, string);
                return;
            }
            r6o1 r6o1VarY = y(i);
            if (!p(i, obj)) {
                if (j(object)) {
                    vyn1 vyn1VarZza = r6o1VarY.zza();
                    r6o1VarY.a(vyn1VarZza, object);
                    unsafe.putObject(obj, jH, vyn1VarZza);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                q(i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!j(object2)) {
                vyn1 vyn1VarZza2 = r6o1VarY.zza();
                r6o1VarY.a(vyn1VarZza2, object2);
                unsafe.putObject(obj, jH, vyn1VarZza2);
                object2 = vyn1VarZza2;
            }
            r6o1VarY.a(object2, object);
        }
    }

    public final void x(int i, Object obj, Object obj2) {
        int[] iArr = this.a;
        int i2 = iArr[i];
        if (r(i2, i, obj2)) {
            long jH = h(i) & 1048575;
            Unsafe unsafe = k;
            Object object = unsafe.getObject(obj2, jH);
            if (object == null) {
                int i3 = iArr[i];
                String string = obj2.toString();
                x4n1.e(String.valueOf(i3).length() + 38 + string.length(), i3, string);
                return;
            }
            r6o1 r6o1VarY = y(i);
            if (!r(i2, i, obj)) {
                if (j(object)) {
                    vyn1 vyn1VarZza = r6o1VarY.zza();
                    r6o1VarY.a(vyn1VarZza, object);
                    unsafe.putObject(obj, jH, vyn1VarZza);
                } else {
                    unsafe.putObject(obj, jH, object);
                }
                s(i2, i, obj);
                return;
            }
            Object object2 = unsafe.getObject(obj, jH);
            if (!j(object2)) {
                vyn1 vyn1VarZza2 = r6o1VarY.zza();
                r6o1VarY.a(vyn1VarZza2, object2);
                unsafe.putObject(obj, jH, vyn1VarZza2);
                object2 = vyn1VarZza2;
            }
            r6o1VarY.a(object2, object);
        }
    }

    public final r6o1 y(int i) {
        int i2 = i / 3;
        int i3 = i2 + i2;
        Object[] objArr = this.b;
        r6o1 r6o1Var = (r6o1) objArr[i3];
        if (r6o1Var != null) {
            return r6o1Var;
        }
        r6o1 r6o1VarB = w5o1.a().b((Class) objArr[i3 + 1]);
        objArr[i3] = r6o1VarB;
        return r6o1VarB;
    }

    public final Object z(int i) {
        int i2 = i / 3;
        return this.b[i2 + i2];
    }

    public final vyn1 zza() {
        return this.e.e();
    }

    public final boolean zzl(Object obj) {
        int i;
        int i2;
        int i3 = 0;
        int i4 = 0;
        int i5 = 1048575;
        while (i3 < this.g) {
            int i6 = this.f[i3];
            int iH = this.h(i6);
            int[] iArr = this.a;
            int i7 = iArr[i6 + 2];
            int i8 = i7 & 1048575;
            int i9 = 1 << (i7 >>> 20);
            if (i8 != i5) {
                if (i8 != 1048575) {
                    i4 = k.getInt(obj, i8);
                }
                i2 = i4;
                i = i8;
            } else {
                i = i5;
                i2 = i4;
            }
            z4o1 z4o1Var = this;
            Object obj2 = obj;
            if ((268435456 & iH) == 0 || z4o1Var.o(obj2, i6, i, i2, i9)) {
                int i10 = i(iH);
                if (i10 != 9 && i10 != 17) {
                    if (i10 != 27) {
                        if (i10 == 60 || i10 == 68) {
                            if (!z4o1Var.r(iArr[i6], i6, obj2) || z4o1Var.y(i6).zzl(n9o1.n(iH & 1048575, obj2))) {
                            }
                        } else if (i10 != 49) {
                            if (i10 == 50 && !((j3o1) n9o1.n(iH & 1048575, obj2)).isEmpty()) {
                                pze0.m(z4o1Var.z(i6));
                                throw null;
                            }
                        }
                        i3++;
                        this = z4o1Var;
                        obj = obj2;
                        i5 = i;
                        i4 = i2;
                    }
                    List list = (List) n9o1.n(iH & 1048575, obj2);
                    if (list.isEmpty()) {
                        continue;
                    } else {
                        r6o1 r6o1VarY = z4o1Var.y(i6);
                        for (int i11 = 0; i11 < list.size(); i11++) {
                            if (r6o1VarY.zzl(list.get(i11))) {
                            }
                        }
                    }
                    i3++;
                    this = z4o1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                } else if (!z4o1Var.o(obj2, i6, i, i2, i9) || z4o1Var.y(i6).zzl(n9o1.n(iH & 1048575, obj2))) {
                    i3++;
                    this = z4o1Var;
                    obj = obj2;
                    i5 = i;
                    i4 = i2;
                }
            }
            return false;
        }
        return true;
    }
}
