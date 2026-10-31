package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.PlatformSpanStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class y2o1 {
    public static final byte[] a = {112, 114, 111, 0};
    public static final byte[] b = {112, 114, 109, 0};
    public static b180 c;

    public static String A(sy21 sy21Var) {
        String strF;
        ry21 ry21Var = sy21Var.a;
        String strC = ry21Var.f.c("grpc-message");
        if (strC == null) {
            uz21 uz21Var = sy21Var.c;
            strC = null;
            if (uz21Var != null && (strF = uz21Var.f()) != null && !strF.equals("")) {
                strC = strF;
            }
            if (strC == null) {
                return ry21Var.c;
            }
        }
        return strC;
    }

    public static final l0l B(String str, List list, String str2, String str3) {
        Object next;
        Object next2;
        Object obj = null;
        if (str3 != null && str3.length() != 0) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!u890.j(((l0l) next2).d(), str3));
            l0l l0lVar = (l0l) next2;
            if (l0lVar != null) {
                return l0lVar;
            }
        }
        List list2 = list;
        Iterator it2 = list2.iterator();
        do {
            if (!it2.hasNext()) {
                next = null;
                break;
            }
            next = it2.next();
        } while (!u890.j(((l0l) next).d(), "apple-tv-companion:".concat(str)));
        l0l l0lVar2 = (l0l) next;
        if (l0lVar2 != null) {
            return l0lVar2;
        }
        if (str2.length() == 0) {
            return null;
        }
        for (Object obj2 : list2) {
            l0l l0lVar3 = (l0l) obj2;
            if (cw30.a(l0lVar3) && l0lVar3.n() && u890.j(l0lVar3.r(), str2)) {
                obj = obj2;
                break;
            }
        }
        return (l0l) obj;
    }

    public static int[] C(ByteArrayInputStream byteArrayInputStream, int i) {
        int[] iArr = new int[i];
        int iU = 0;
        for (int i2 = 0; i2 < i; i2++) {
            iU += (int) omo1.u(byteArrayInputStream, 2);
            iArr[i2] = iU;
        }
        return iArr;
    }

    public static byte[] D(FileInputStream fileInputStream, byte[] bArr) {
        if (Arrays.equals(bArr, omo1.s(fileInputStream, bArr.length))) {
            return omo1.s(fileInputStream, 4);
        }
        eg.m("Invalid magic");
        return null;
    }

    public static r0u[] E(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, r0u[] r0uVarArr) throws IOException {
        byte[] bArr3 = b3o1.f;
        if (!Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(bArr, b3o1.g)) {
                eg.m("Unsupported meta version");
                return null;
            }
            int iU = (int) omo1.u(fileInputStream, 2);
            byte[] bArrT = omo1.t(fileInputStream, (int) omo1.u(fileInputStream, 4), (int) omo1.u(fileInputStream, 4));
            if (fileInputStream.read() > 0) {
                eg.m("Content found after the end of file");
                return null;
            }
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
            try {
                r0u[] r0uVarArrG = G(byteArrayInputStream, bArr2, iU, r0uVarArr);
                byteArrayInputStream.close();
                return r0uVarArrG;
            } catch (Throwable th) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (Arrays.equals(b3o1.a, bArr2)) {
            eg.m("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        }
        if (!Arrays.equals(bArr, bArr3)) {
            eg.m("Unsupported meta version");
            return null;
        }
        int iU2 = (int) omo1.u(fileInputStream, 1);
        byte[] bArrT2 = omo1.t(fileInputStream, (int) omo1.u(fileInputStream, 4), (int) omo1.u(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            eg.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(bArrT2);
        try {
            r0u[] r0uVarArrF = F(byteArrayInputStream2, iU2, r0uVarArr);
            byteArrayInputStream2.close();
            return r0uVarArrF;
        } catch (Throwable th3) {
            try {
                byteArrayInputStream2.close();
            } catch (Throwable th4) {
                th3.addSuppressed(th4);
            }
            throw th3;
        }
    }

    public static r0u[] F(ByteArrayInputStream byteArrayInputStream, int i, r0u[] r0uVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new r0u[0];
        }
        if (i != r0uVarArr.length) {
            eg.m("Mismatched number of dex files found in metadata");
            return null;
        }
        String[] strArr = new String[i];
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            int iU = (int) omo1.u(byteArrayInputStream, 2);
            iArr[i2] = (int) omo1.u(byteArrayInputStream, 2);
            strArr[i2] = new String(omo1.s(byteArrayInputStream, iU), StandardCharsets.UTF_8);
        }
        for (int i3 = 0; i3 < i; i3++) {
            r0u r0uVar = r0uVarArr[i3];
            if (!r0uVar.b.equals(strArr[i3])) {
                eg.m("Order of dexfiles in metadata did not match baseline");
                return null;
            }
            int i4 = iArr[i3];
            r0uVar.e = i4;
            r0uVar.h = C(byteArrayInputStream, i4);
        }
        return r0uVarArr;
    }

    public static r0u[] G(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i, r0u[] r0uVarArr) throws IOException {
        r0u r0uVar;
        if (byteArrayInputStream.available() == 0) {
            return new r0u[0];
        }
        if (i != r0uVarArr.length) {
            eg.m("Mismatched number of dex files found in metadata");
            return null;
        }
        for (int i2 = 0; i2 < i; i2++) {
            omo1.u(byteArrayInputStream, 2);
            String str = new String(omo1.s(byteArrayInputStream, (int) omo1.u(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            long jU = omo1.u(byteArrayInputStream, 4);
            int iU = (int) omo1.u(byteArrayInputStream, 2);
            if (r0uVarArr.length <= 0) {
                r0uVar = null;
                break;
            }
            int iIndexOf = str.indexOf("!");
            if (iIndexOf < 0) {
                iIndexOf = str.indexOf(":");
            }
            String strSubstring = iIndexOf > 0 ? str.substring(iIndexOf + 1) : str;
            int i3 = 0;
            while (true) {
                if (i3 >= r0uVarArr.length) {
                    r0uVar = null;
                    break;
                }
                if (r0uVarArr[i3].b.equals(strSubstring)) {
                    r0uVar = r0uVarArr[i3];
                    break;
                }
                i3++;
            }
            if (r0uVar == null) {
                eg.m("Missing profile key: ".concat(str));
                return null;
            }
            r0uVar.d = jU;
            int[] iArrC = C(byteArrayInputStream, iU);
            if (Arrays.equals(bArr, b3o1.e)) {
                r0uVar.e = iU;
                r0uVar.h = iArrC;
            }
        }
        return r0uVarArr;
    }

    public static r0u[] H(FileInputStream fileInputStream, byte[] bArr, String str) throws IOException {
        if (!Arrays.equals(bArr, b3o1.b)) {
            eg.m("Unsupported version");
            return null;
        }
        int iU = (int) omo1.u(fileInputStream, 1);
        byte[] bArrT = omo1.t(fileInputStream, (int) omo1.u(fileInputStream, 4), (int) omo1.u(fileInputStream, 4));
        if (fileInputStream.read() > 0) {
            eg.m("Content found after the end of file");
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArrT);
        try {
            r0u[] r0uVarArrI = I(byteArrayInputStream, str, iU);
            byteArrayInputStream.close();
            return r0uVarArrI;
        } catch (Throwable th) {
            try {
                byteArrayInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static r0u[] I(ByteArrayInputStream byteArrayInputStream, String str, int i) throws IOException {
        int i2 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new r0u[0];
        }
        r0u[] r0uVarArr = new r0u[i];
        for (int i3 = 0; i3 < i; i3++) {
            int iU = (int) omo1.u(byteArrayInputStream, 2);
            int iU2 = (int) omo1.u(byteArrayInputStream, 2);
            r0uVarArr[i3] = new r0u(str, new String(omo1.s(byteArrayInputStream, iU), StandardCharsets.UTF_8), omo1.u(byteArrayInputStream, 4), iU2, (int) omo1.u(byteArrayInputStream, 4), (int) omo1.u(byteArrayInputStream, 4), new int[iU2], new TreeMap());
        }
        int i4 = 0;
        while (i4 < i) {
            r0u r0uVar = r0uVarArr[i4];
            int iAvailable = byteArrayInputStream.available();
            int i5 = r0uVar.f;
            int i6 = r0uVar.g;
            TreeMap treeMap = r0uVar.i;
            int i7 = iAvailable - i5;
            int iU3 = i2;
            while (byteArrayInputStream.available() > i7) {
                iU3 += (int) omo1.u(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(iU3), 1);
                int iU4 = (int) omo1.u(byteArrayInputStream, 2);
                while (iU4 > 0) {
                    omo1.u(byteArrayInputStream, 2);
                    int iU5 = (int) omo1.u(byteArrayInputStream, 1);
                    if (iU5 != 6 && iU5 != 7) {
                        while (iU5 > 0) {
                            omo1.u(byteArrayInputStream, 1);
                            int i8 = i2;
                            int i9 = i4;
                            for (int iU6 = (int) omo1.u(byteArrayInputStream, 1); iU6 > 0; iU6--) {
                                omo1.u(byteArrayInputStream, 2);
                            }
                            iU5--;
                            i2 = i8;
                            i4 = i9;
                        }
                    }
                    iU4--;
                    i2 = i2;
                    i4 = i4;
                }
            }
            int i10 = i2;
            int i11 = i4;
            if (byteArrayInputStream.available() != i7) {
                eg.m("Read too much data during profile line parse");
                return null;
            }
            r0uVar.h = C(byteArrayInputStream, r0uVar.e);
            BitSet bitSetValueOf = BitSet.valueOf(omo1.s(byteArrayInputStream, (((i6 * 2) + 7) & (-8)) / 8));
            for (int i12 = i10; i12 < i6; i12++) {
                int i13 = bitSetValueOf.get(i12) ? 2 : i10;
                if (bitSetValueOf.get(i12 + i6)) {
                    i13 |= 4;
                }
                if (i13 != 0) {
                    Integer numValueOf = (Integer) treeMap.get(Integer.valueOf(i12));
                    if (numValueOf == null) {
                        numValueOf = Integer.valueOf(i10);
                    }
                    treeMap.put(Integer.valueOf(i12), Integer.valueOf(i13 | numValueOf.intValue()));
                }
            }
            i4 = i11 + 1;
            i2 = i10;
        }
        return r0uVarArr;
    }

    public static boolean J(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, r0u[] r0uVarArr) throws IOException {
        int i;
        ArrayList arrayList;
        int length;
        byte[] bArr2 = b3o1.a;
        int i2 = 0;
        if (!Arrays.equals(bArr, bArr2)) {
            byte[] bArr3 = b3o1.b;
            if (Arrays.equals(bArr, bArr3)) {
                byte[] bArrT = t(r0uVarArr, bArr3);
                omo1.w(byteArrayOutputStream, r0uVarArr.length, 1);
                omo1.w(byteArrayOutputStream, bArrT.length, 4);
                byte[] bArrM = omo1.m(bArrT);
                omo1.w(byteArrayOutputStream, bArrM.length, 4);
                byteArrayOutputStream.write(bArrM);
                return true;
            }
            byte[] bArr4 = b3o1.d;
            if (Arrays.equals(bArr, bArr4)) {
                omo1.w(byteArrayOutputStream, r0uVarArr.length, 1);
                for (r0u r0uVar : r0uVarArr) {
                    int size = r0uVar.i.size() * 4;
                    String strV = v(r0uVar.a, r0uVar.b, bArr4);
                    Charset charset = StandardCharsets.UTF_8;
                    omo1.x(byteArrayOutputStream, strV.getBytes(charset).length);
                    omo1.x(byteArrayOutputStream, r0uVar.h.length);
                    omo1.w(byteArrayOutputStream, size, 4);
                    omo1.w(byteArrayOutputStream, r0uVar.c, 4);
                    byteArrayOutputStream.write(strV.getBytes(charset));
                    Iterator it = r0uVar.i.keySet().iterator();
                    while (it.hasNext()) {
                        omo1.x(byteArrayOutputStream, ((Integer) it.next()).intValue());
                        omo1.x(byteArrayOutputStream, 0);
                    }
                    for (int i3 : r0uVar.h) {
                        omo1.x(byteArrayOutputStream, i3);
                    }
                }
                return true;
            }
            byte[] bArr5 = b3o1.c;
            if (Arrays.equals(bArr, bArr5)) {
                byte[] bArrT2 = t(r0uVarArr, bArr5);
                omo1.w(byteArrayOutputStream, r0uVarArr.length, 1);
                omo1.w(byteArrayOutputStream, bArrT2.length, 4);
                byte[] bArrM2 = omo1.m(bArrT2);
                omo1.w(byteArrayOutputStream, bArrM2.length, 4);
                byteArrayOutputStream.write(bArrM2);
                return true;
            }
            byte[] bArr6 = b3o1.e;
            if (!Arrays.equals(bArr, bArr6)) {
                return false;
            }
            omo1.x(byteArrayOutputStream, r0uVarArr.length);
            for (r0u r0uVar2 : r0uVarArr) {
                String str = r0uVar2.a;
                TreeMap treeMap = r0uVar2.i;
                String strV2 = v(str, r0uVar2.b, bArr6);
                Charset charset2 = StandardCharsets.UTF_8;
                omo1.x(byteArrayOutputStream, strV2.getBytes(charset2).length);
                omo1.x(byteArrayOutputStream, treeMap.size());
                omo1.x(byteArrayOutputStream, r0uVar2.h.length);
                omo1.w(byteArrayOutputStream, r0uVar2.c, 4);
                byteArrayOutputStream.write(strV2.getBytes(charset2));
                Iterator it2 = treeMap.keySet().iterator();
                while (it2.hasNext()) {
                    omo1.x(byteArrayOutputStream, ((Integer) it2.next()).intValue());
                }
                for (int i4 : r0uVar2.h) {
                    omo1.x(byteArrayOutputStream, i4);
                }
            }
            return true;
        }
        ArrayList arrayList2 = new ArrayList(3);
        ArrayList arrayList3 = new ArrayList(3);
        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
        try {
            omo1.x(byteArrayOutputStream2, r0uVarArr.length);
            int i5 = 2;
            int i6 = 2;
            for (r0u r0uVar3 : r0uVarArr) {
                omo1.w(byteArrayOutputStream2, r0uVar3.c, 4);
                omo1.w(byteArrayOutputStream2, r0uVar3.d, 4);
                omo1.w(byteArrayOutputStream2, r0uVar3.g, 4);
                String strV3 = v(r0uVar3.a, r0uVar3.b, bArr2);
                Charset charset3 = StandardCharsets.UTF_8;
                int length2 = strV3.getBytes(charset3).length;
                omo1.x(byteArrayOutputStream2, length2);
                i6 = i6 + 14 + length2;
                byteArrayOutputStream2.write(strV3.getBytes(charset3));
            }
            byte[] byteArray = byteArrayOutputStream2.toByteArray();
            if (i6 != byteArray.length) {
                throw new IllegalStateException("Expected size " + i6 + ", does not match actual size " + byteArray.length);
            }
            ojm1 ojm1Var = new ojm1(1, false, byteArray);
            byteArrayOutputStream2.close();
            arrayList2.add(ojm1Var);
            ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
            int i7 = 0;
            int i8 = 0;
            while (i7 < r0uVarArr.length) {
                try {
                    r0u r0uVar4 = r0uVarArr[i7];
                    omo1.x(byteArrayOutputStream3, i7);
                    omo1.x(byteArrayOutputStream3, r0uVar4.e);
                    i8 = i8 + 4 + (r0uVar4.e * i5);
                    int[] iArr = r0uVar4.h;
                    int length3 = iArr.length;
                    int i9 = i2;
                    while (i2 < length3) {
                        int i10 = iArr[i2];
                        omo1.x(byteArrayOutputStream3, i10 - i9);
                        i2++;
                        i5 = i5;
                        i9 = i10;
                    }
                    i7++;
                    i2 = 0;
                } catch (Throwable th) {
                    try {
                        byteArrayOutputStream3.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            int i11 = i5;
            byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
            if (i8 != byteArray2.length) {
                throw new IllegalStateException("Expected size " + i8 + ", does not match actual size " + byteArray2.length);
            }
            ojm1 ojm1Var2 = new ojm1(3, true, byteArray2);
            byteArrayOutputStream3.close();
            arrayList2.add(ojm1Var2);
            ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
            int i12 = 0;
            int i13 = 0;
            while (i12 < r0uVarArr.length) {
                try {
                    r0u r0uVar5 = r0uVarArr[i12];
                    Iterator it3 = r0uVar5.i.entrySet().iterator();
                    int iIntValue = 0;
                    while (it3.hasNext()) {
                        iIntValue |= ((Integer) ((Map.Entry) it3.next()).getValue()).intValue();
                    }
                    ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                    try {
                        N(byteArrayOutputStream5, iIntValue, r0uVar5);
                        byte[] byteArray3 = byteArrayOutputStream5.toByteArray();
                        byteArrayOutputStream5.close();
                        ByteArrayOutputStream byteArrayOutputStream6 = new ByteArrayOutputStream();
                        try {
                            O(byteArrayOutputStream6, r0uVar5);
                            byte[] byteArray4 = byteArrayOutputStream6.toByteArray();
                            byteArrayOutputStream6.close();
                            omo1.x(byteArrayOutputStream4, i12);
                            int length4 = byteArray3.length + 2 + byteArray4.length;
                            int i14 = i13 + 6;
                            ArrayList arrayList4 = arrayList3;
                            omo1.w(byteArrayOutputStream4, length4, 4);
                            omo1.x(byteArrayOutputStream4, iIntValue);
                            byteArrayOutputStream4.write(byteArray3);
                            byteArrayOutputStream4.write(byteArray4);
                            i13 = i14 + length4;
                            i12++;
                            arrayList3 = arrayList4;
                        } catch (Throwable th3) {
                            try {
                                byteArrayOutputStream6.close();
                                throw th3;
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                                throw th3;
                            }
                        }
                    } catch (Throwable th5) {
                        try {
                            byteArrayOutputStream5.close();
                            throw th5;
                        } catch (Throwable th6) {
                            th5.addSuppressed(th6);
                            throw th5;
                        }
                    }
                } catch (Throwable th7) {
                    try {
                        byteArrayOutputStream4.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
            }
            ArrayList arrayList5 = arrayList3;
            byte[] byteArray5 = byteArrayOutputStream4.toByteArray();
            if (i13 != byteArray5.length) {
                throw new IllegalStateException("Expected size " + i13 + ", does not match actual size " + byteArray5.length);
            }
            ojm1 ojm1Var3 = new ojm1(4, true, byteArray5);
            byteArrayOutputStream4.close();
            arrayList2.add(ojm1Var3);
            long size2 = 12 + ((long) (arrayList2.size() * 16));
            omo1.w(byteArrayOutputStream, arrayList2.size(), 4);
            int i15 = 0;
            while (i15 < arrayList2.size()) {
                ojm1 ojm1Var4 = (ojm1) arrayList2.get(i15);
                int i16 = ojm1Var4.a;
                byte[] bArr7 = ojm1Var4.b;
                int i17 = i11;
                if (i16 == 1) {
                    i = 0;
                } else if (i16 == i17) {
                    i = 1;
                } else if (i16 == 3) {
                    i = i17;
                } else if (i16 == 4) {
                    i = 3;
                } else {
                    if (i16 != 5) {
                        throw null;
                    }
                    i = 4;
                }
                omo1.w(byteArrayOutputStream, i, 4);
                omo1.w(byteArrayOutputStream, size2, 4);
                if (ojm1Var4.c) {
                    long length5 = bArr7.length;
                    byte[] bArrM3 = omo1.m(bArr7);
                    arrayList = arrayList5;
                    arrayList.add(bArrM3);
                    omo1.w(byteArrayOutputStream, bArrM3.length, 4);
                    omo1.w(byteArrayOutputStream, length5, 4);
                    length = bArrM3.length;
                } else {
                    arrayList = arrayList5;
                    arrayList.add(bArr7);
                    omo1.w(byteArrayOutputStream, bArr7.length, 4);
                    omo1.w(byteArrayOutputStream, 0L, 4);
                    length = bArr7.length;
                }
                size2 += (long) length;
                i15++;
                arrayList5 = arrayList;
                i11 = i17;
            }
            ArrayList arrayList6 = arrayList5;
            for (int i18 = 0; i18 < arrayList6.size(); i18++) {
                byteArrayOutputStream.write((byte[]) arrayList6.get(i18));
            }
            return true;
        } catch (Throwable th9) {
            try {
                byteArrayOutputStream2.close();
                throw th9;
            } catch (Throwable th10) {
                th9.addSuppressed(th10);
                throw th9;
            }
        }
    }

    public static j1h1 K(j1h1 j1h1Var) {
        if (!(j1h1Var instanceof z980)) {
            return new uod(j1h1Var, (byte) 0);
        }
        z980 z980Var = (z980) j1h1Var;
        y0h1[] y0h1VarArr = z980Var.b;
        ArrayList<mmr0> arrayListW0 = f46.W0(z980Var.c, y0h1VarArr);
        ArrayList arrayList = new ArrayList(q7h.U(arrayListW0, 10));
        for (mmr0 mmr0Var : arrayListW0) {
            arrayList.add(s((e1h1) mmr0Var.a, (y0h1) mmr0Var.b));
        }
        return new z980(y0h1VarArr, (e1h1[]) arrayList.toArray(new e1h1[0]), true);
    }

    public static void L(ByteArrayOutputStream byteArrayOutputStream, r0u r0uVar) throws IOException {
        O(byteArrayOutputStream, r0uVar);
        int i = r0uVar.g;
        int[] iArr = r0uVar.h;
        int length = iArr.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            int i4 = iArr[i2];
            omo1.x(byteArrayOutputStream, i4 - i3);
            i2++;
            i3 = i4;
        }
        byte[] bArr = new byte[(((i * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : r0uVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            if ((iIntValue2 & 2) != 0) {
                int i5 = iIntValue / 8;
                bArr[i5] = (byte) (bArr[i5] | (1 << (iIntValue % 8)));
            }
            if ((iIntValue2 & 4) != 0) {
                int i6 = iIntValue + i;
                int i7 = i6 / 8;
                bArr[i7] = (byte) ((1 << (i6 % 8)) | bArr[i7]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void M(ByteArrayOutputStream byteArrayOutputStream, r0u r0uVar, String str) throws IOException {
        Charset charset = StandardCharsets.UTF_8;
        omo1.x(byteArrayOutputStream, str.getBytes(charset).length);
        omo1.x(byteArrayOutputStream, r0uVar.e);
        omo1.w(byteArrayOutputStream, r0uVar.f, 4);
        omo1.w(byteArrayOutputStream, r0uVar.c, 4);
        omo1.w(byteArrayOutputStream, r0uVar.g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void N(ByteArrayOutputStream byteArrayOutputStream, int i, r0u r0uVar) throws IOException {
        int i2 = r0uVar.g;
        byte[] bArr = new byte[(((Integer.bitCount(i & (-2)) * i2) + 7) & (-8)) / 8];
        for (Map.Entry entry : r0uVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            int iIntValue2 = ((Integer) entry.getValue()).intValue();
            int i3 = 0;
            for (int i4 = 1; i4 <= 4; i4 <<= 1) {
                if (i4 != 1 && (i4 & i) != 0) {
                    if ((i4 & iIntValue2) == i4) {
                        int i5 = (i3 * i2) + iIntValue;
                        int i6 = i5 / 8;
                        bArr[i6] = (byte) ((1 << (i5 % 8)) | bArr[i6]);
                    }
                    i3++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void O(ByteArrayOutputStream byteArrayOutputStream, r0u r0uVar) throws IOException {
        int i = 0;
        for (Map.Entry entry : r0uVar.i.entrySet()) {
            int iIntValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                omo1.x(byteArrayOutputStream, iIntValue - i);
                omo1.x(byteArrayOutputStream, 0);
                i = iIntValue;
            }
        }
    }

    public static final win1 P(long j, Object obj) {
        win1 win1Var = (win1) dkn1.e(j, obj);
        if (((ohn1) win1Var).a) {
            return win1Var;
        }
        int size = win1Var.size();
        win1 win1VarZzg = win1Var.zzg(size == 0 ? 10 : size + size);
        dkn1.f(obj, j, win1VarZzg);
        return win1VarZzg;
    }

    public static final void a(xxr0 xxr0Var, iyr0 iyr0Var, boolean z, vb1 vb1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(504986863);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(xxr0Var) : x340Var.i(xxr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.e(iyr0Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(vb1Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            otw.c(vb1Var, new ub1(xxr0Var.a, iyr0Var, z, xxr0Var.i), (qim0) null, (ipb1) null, x340Var, (i2 >> 9) & 14, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h8i0(xxr0Var, iyr0Var, z, vb1Var, i, (byte) 6);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(dmr0 dmr0Var, gw70 gw70Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        int i3;
        Function0 function1;
        wux wuxVar;
        boolean z;
        String str = dmr0Var.d;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1277673595);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dmr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(gw70Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            wux wuxVarB = cbx.b(x340Var);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            cvx cvxVar = wuxVarB.b;
            qim0 qim0VarN = anm1.N("paidPodcastBanner", uyn1.x(dug.f(uyn1.B(qim0VarF, 0.0f, 8.0f, 0.0f, 0.0f, 13), cbx.a(x340Var).a.a.a(), er31.b(8.0f)), 16.0f));
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            int i4 = i2;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var.l(function2);
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
            String str2 = dmr0Var.b;
            String str3 = dmr0Var.f;
            String str4 = dmr0Var.a;
            byte b2 = 1;
            uwo1.e(str2, null, cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var, 0, 0, 1722);
            x340 x340Var2 = x340Var;
            if (dmr0Var.c.length() > 0) {
                x340Var2.i0(752324322);
                uwo1.e(dmr0Var.c, null, cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, null, null, 2, false, new cjc0(1), 0, null, x340Var2, 0, 0, 1714);
                x340Var2 = x340Var2;
                i3 = 0;
                x340Var2.r(false);
            } else {
                i3 = 0;
                x340Var2.i0(752550343);
                x340Var2.r(false);
            }
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, i3);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                function1 = function2;
                x340Var2.l(function1);
            } else {
                function1 = function2;
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            if (str4.length() > 0) {
                x340Var2.i0(598092201);
                boolean zG = x340Var2.g(str4);
                Object objT = x340Var2.T();
                if (zG || objT == obj) {
                    objT = Uri.parse(str4);
                    x340Var2.s0(objT);
                }
                wuxVar = wuxVarB;
                mod.b(oi7.a.a(gw70Var), apo.r(924999546, new n640((Uri) objT, wuxVar, b2), x340Var2), x340Var2, 56);
                ab80.p(nim0Var, 8.0f, x340Var2, false);
            } else {
                wuxVar = wuxVarB;
                x340Var2.i0(598639971);
                x340Var2.r(i3);
            }
            x340 x340Var3 = x340Var2;
            wux wuxVar2 = wuxVar;
            Function0 function3 = function1;
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var2).g, 0L, null, null, 2, false, new cjc0(2), 0, null, x340Var3, 0, 0, 1720);
            x340Var = x340Var3;
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            if (str3 != null) {
                x340Var.i0(598974120);
                c(str3, wuxVar2, function0, x340Var, i4 & 896);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(599081721);
                qim0 qim0VarR = u291.r(nim0Var, 48.0f);
                boolean z3 = (i4 & 896) == 256;
                Object objT2 = x340Var.T();
                if (z3 || objT2 == obj) {
                    objT2 = new kek0(function0, (byte) 27);
                    x340Var.s0(objT2);
                }
                qim0 qim0VarX = bin.x(qim0VarR, false, null, null, null, (Function0) objT2, 15);
                gfh0 gfh0VarC = t1c.c(een.h, false);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function3);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                plx plxVar = plx.c;
                jsl jslVar = new jsl(str);
                long j = ((yex) zex.a.d).g;
                zov0 zov0Var = cbx.b(x340Var).g;
                w0h1.a(plxVar, jslVar, u291.r(nim0Var, 16.0f), j, 0L, true, x340Var, plx.d | 196608, 16);
                z = true;
                x340Var.r(true);
                x340Var.r(false);
            }
            x340Var.r(z);
            x340Var.r(z);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(dmr0Var, gw70Var, function0, i, (byte) 11);
        }
    }

    public static final void c(String str, wux wuxVar, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1715546167);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? x340Var.g(wuxVar) : x340Var.i(wuxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            boolean z = (i2 & 896) == 256;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new kek0(function0, (byte) 28);
                x340Var.s0(objT);
            }
            qim0 qim0VarX = bin.x(nim0.a, false, null, null, null, (Function0) objT, 15);
            uwr uwrVar = cbx.a;
            qim0 qim0VarY = uyn1.y(d1u.E(1.0f, cbx.a(x340Var).c.b, qim0VarX, er31.a(50)), 12.0f, 6.0f);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, null, cbx.d(x340Var).k, 0L, null, null, 0, false, new cjc0(1), 0, null, x340Var, i2 & 14, 0, 1786);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(str, wuxVar, function0, i);
        }
    }

    public static final void d(String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(751625004);
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.g(str2) ? 32 : 16) | (x340Var2.g(str3) ? 256 : 128) | (x340Var2.g(str4) ? 2048 : 1024) | (x340Var2.i(function0) ? 16384 : 8192) | 196608;
        if (x340Var2.Y(i2 & 1, (74899 & i2) != 74898)) {
            uwr uwrVar = cbx.a;
            long j = cbx.a(x340Var2).b.a;
            ye5 ye5Var = new ye5();
            int iB0 = ihc1.B0(str2, str, 0, 6);
            if (iB0 >= 0) {
                ye5Var.g(str2.substring(0, iB0));
                int iO = ye5Var.o(new zma1(j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, 65534));
                try {
                    ye5Var.g(str);
                    ye5Var.k(iO);
                    ye5Var.g(str2.substring(str.length() + iB0));
                } catch (Throwable th) {
                    ye5Var.k(iO);
                    throw th;
                }
            } else {
                ye5Var.g(str2);
            }
            af5 af5VarP = ye5Var.p();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(u291.f(qim0Var3, 1.0f), false, str3, new pm31(0), null, function0, 9);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarZ = uyn1.z(4.0f, 0.0f, 2, qim0VarX);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            zov0 zov0Var = cbx.b(x340Var2).g;
            qim0 qim0VarJ = u291.j(24.0f, 0.0f, 2, qim0VarB);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            jw31 jw31VarA = ew31.a(new d36(8.0f, true, new um5(false)), een.N0, x340Var2, 48);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarJ);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            Uri uri = Uri.parse(str4 == null ? "" : str4);
            zov0 zov0Var2 = cbx.b(x340Var2).g;
            eso1.e(uri, isl.a, (qim0) null, new p3v(24.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4084);
            uwo1.d(af5VarP, cbx.a(x340Var2).b.b, new wnb0(1.0f, true), cbx.d(x340Var2).j, null, null, 2, false, new cjc0(2), 0, null, null, x340Var2, 1572864, 0, 3760);
            x340Var = x340Var2;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mlm(str, str2, str3, str4, function0, qim0Var2, i, (byte) 0);
        }
    }

    public static final void e(vnr0 vnr0Var, boolean z, boolean z2, qim0 qim0Var, int i, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(878532877);
        int i6 = (x340Var.i(vnr0Var) ? 4 : 2) | i2 | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128);
        if ((i2 & 3072) == 0) {
            i6 |= x340Var.g(qim0Var) ? 2048 : 1024;
        }
        int i7 = i3 & 16;
        if (i7 != 0) {
            i5 = i6 | 24576;
            i4 = i;
        } else {
            i4 = i;
            i5 = i6 | (x340Var.e(i4) ? 16384 : 8192);
        }
        if (x340Var.Y(i5 & 1, (i5 & 9363) != 9362)) {
            if (i7 != 0) {
                i4 = 0;
            }
            String strC = f4i1.c(i4, "header-y-translation-");
            ilv.a.getClass();
            ven0 ven0VarR = zod.R(new hsi1(strC, Float.valueOf(1.0f), Float.valueOf(0.0f), irn1.o0(666, 0, flv.b, 2), rno1.a), z, (Function0) null, x340Var, 8 | (i5 & 112), 4);
            float f = ((Number) ven0VarR.getValue()).floatValue() < 1.0f ? 1.0f : 0.0f;
            uwr uwrVar = cbx.a;
            w2g0.c((qim0) null, (tl3) null, apo.r(1791695459, new uw50(omo1.q(vnr0Var, cbx.d(x340Var).d, cbx.d(x340Var).c, x340Var), qim0Var, z2, ven0VarR, f), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        int i8 = i4;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vw50(vnr0Var, z, z2, qim0Var, i8, i2, i3);
        }
    }

    public static final void f(xxr0 xxr0Var, int i, dc80 dc80Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1823556585);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? x340Var.g(xxr0Var) : x340Var.i(xxr0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(l1d.C(i)) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var.i(dc80Var) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            otw.c(dc80Var, new cc80(xxr0Var.a, i), (qim0) null, (ipb1) null, x340Var, (i3 >> 6) & 14, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hk2(xxr0Var, i, dc80Var, i2, (byte) 16);
        }
    }

    public static final void g(xtb0 xtb0Var, mlr0 mlr0Var, boolean z, Function0 function0, int i, b0k b0kVar, int i2) {
        int i3;
        boolean z2;
        int i4;
        xtb0 xtb0Var2 = xtb0Var;
        mlr0 mlr0Var2 = mlr0Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(872684644);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(xtb0Var2) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.g(mlr0Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= x340Var.h(z2) ? 256 : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(function0) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 = i;
            i3 |= x340Var.e(i4) ? 16384 : 8192;
        } else {
            i4 = i;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z3 = ((i3 & 14) == 4) | ((i3 & 7168) == 2048) | ((57344 & i3) == 16384) | ((i3 & 896) == 256) | ((i3 & 112) == 32);
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                ja51 ja51Var = new ja51(function0, xtb0Var2, i4, z2, mlr0Var2, null, (byte) 1);
                xtb0Var2 = xtb0Var2;
                mlr0Var2 = mlr0Var2;
                x340Var.s0(ja51Var);
                objT = ja51Var;
            }
            qxd0.r(xtb0Var2, boolValueOf, mlr0Var2, (vu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pk7(xtb0Var2, mlr0Var2, z, function0, i, i2);
        }
    }

    public static final void h(final long j, final lee1 lee1Var, final vu30 vu30Var, b0k b0kVar, final int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-684938728);
        if ((i & 6) == 0) {
            i2 = (x340Var.f(j) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(lee1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(vu30Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            kiv kivVar = q9e1.a;
            mod.c(new ely0[]{p3d1.o(j, wrl.a), kivVar.a(((lee1) x340Var.k(kivVar)).e(lee1Var))}, vu30Var, x340Var, ((i2 >> 3) & 112) | 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30() { // from class: p.zky0
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    y2o1.h(j, lee1Var, vu30Var, (b0k) obj, czo1.p(i | 1));
                    return rih1.a;
                }
            };
        }
    }

    public static final void i(dwz0 dwz0Var, boolean z, iyr0 iyr0Var, d0r d0rVar, sjq0 sjq0Var, vb1 vb1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2038629254);
        int i2 = (x340Var.i(dwz0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.e(iyr0Var.ordinal()) ? 256 : 128) | (x340Var.i(d0rVar) ? 2048 : 1024) | (x340Var.i(sjq0Var) ? 16384 : 8192) | (x340Var.i(vb1Var) ? 131072 : 65536);
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            ven0 ven0VarS = v8r.s(dwz0Var.c, x340Var);
            boolean zG = x340Var.g(d0rVar) | x340Var.g(sjq0Var) | x340Var.g(vb1Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = sjq0Var.r0(d0rVar, new j2i(-1194076734, new nu31(iyr0Var, ven0VarS, vb1Var, (byte) 2), true));
                x340Var.s0(objT);
            }
            otw.c((eyr0) objT, new txr0(dwz0Var.b, z), (qim0) null, (ipb1) null, x340Var, 0, 12);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(dwz0Var, z, iyr0Var, d0rVar, sjq0Var, vb1Var, i);
        }
    }

    public static final void j(fwz0 fwz0Var, boolean z, iyr0 iyr0Var, d0r d0rVar, sjq0 sjq0Var, vb1 vb1Var, dc80 dc80Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-251596994);
        int i2 = i | (x340Var.i(fwz0Var) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.e(iyr0Var.ordinal()) ? 256 : 128) | (x340Var.i(d0rVar) ? 2048 : 1024) | (x340Var.i(sjq0Var) ? 16384 : 8192) | (x340Var.i(vb1Var) ? 131072 : 65536) | (x340Var.i(dc80Var) ? 1048576 : 524288);
        if (!x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.b0();
        } else if (fwz0Var instanceof ewz0) {
            x340Var.i0(-1266528809);
            k((ewz0) fwz0Var, z, iyr0Var, d0rVar, sjq0Var, vb1Var, dc80Var, x340Var, i2 & 4194302);
            x340Var = x340Var;
            x340Var.r(false);
        } else {
            if (!(fwz0Var instanceof dwz0)) {
                throw p3d1.k(x340Var, -1266530300, false);
            }
            x340Var.i0(-1266516385);
            i((dwz0) fwz0Var, z, iyr0Var, d0rVar, sjq0Var, vb1Var, x340Var, i2 & 524286);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(fwz0Var, z, iyr0Var, d0rVar, sjq0Var, vb1Var, dc80Var, i, (byte) 14);
        }
    }

    public static final void k(ewz0 ewz0Var, boolean z, iyr0 iyr0Var, d0r d0rVar, sjq0 sjq0Var, vb1 vb1Var, dc80 dc80Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        ha51 ha51Var;
        boolean z2;
        String strK;
        int i2;
        int i3;
        g4a g4aVar = ewz0Var.c;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1065632168);
        int i4 = i | (b0kVar3.i(ewz0Var) ? 4 : 2) | (b0kVar3.h(z) ? 32 : 16) | (b0kVar3.e(iyr0Var.ordinal()) ? 256 : 128) | (b0kVar3.i(d0rVar) ? 2048 : 1024) | (b0kVar3.i(sjq0Var) ? 16384 : 8192) | (b0kVar3.i(vb1Var) ? 131072 : 65536) | (b0kVar3.i(dc80Var) ? 1048576 : 524288);
        if (b0kVar3.Y(i4 & 1, (599187 & i4) != 599186)) {
            dwz0 dwz0Var = ewz0Var.d;
            g4a g4aVar2 = dwz0Var != null ? dwz0Var.c : null;
            ha51 ha51Var2 = ha51.a;
            g4a g4aVar3 = g4a.c;
            if (g4aVar2 == g4aVar3) {
                ha51Var = ha51.c;
            } else {
                ha51Var = (iyr0Var == iyr0.a && g4aVar2 == g4a.d && g4aVar != g4aVar3) ? ha51.b : ha51Var2;
            }
            String str = ewz0Var.b;
            boolean z3 = !(ha51Var != ha51Var2);
            int iOrdinal = ha51Var.ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1) {
                    z2 = false;
                    i2 = 857199615;
                    i3 = 2131951879;
                } else {
                    if (iOrdinal != 2) {
                        throw p3d1.k(b0kVar3, 857195619, false);
                    }
                    i2 = 857204512;
                    i3 = 2131951880;
                    z2 = false;
                }
                strK = x0d.k(b0kVar3, i2, i3, b0kVar3, z2);
            } else {
                z2 = false;
                b0kVar3.i0(803310386);
                b0kVar3.r(false);
                strK = null;
            }
            vxr0 vxr0Var = new vxr0(8, str, strK, z, z3);
            ven0 ven0VarS = v8r.s(g4aVar, b0kVar3);
            ven0 ven0VarS2 = v8r.s(ha51Var, b0kVar3);
            boolean zG = b0kVar3.g(d0rVar) | b0kVar3.g(sjq0Var) | b0kVar3.g(vb1Var) | b0kVar3.g(dc80Var) | ((i4 & 896) == 256 ? true : z2);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                objT = sjq0Var.r0(d0rVar, new j2i(1357714784, new n2y0(ven0VarS2, iyr0Var, ven0VarS, vb1Var, dc80Var, (byte) 7), true));
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            otw.c((eyr0) objT, vxr0Var, (qim0) null, (ipb1) null, b0kVar2, 0, 12);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uu((fwz0) ewz0Var, z, iyr0Var, d0rVar, sjq0Var, vb1Var, dc80Var, i, (byte) 15);
        }
    }

    public static final void l(c380 c380Var, iyr0 iyr0Var, d0r d0rVar, em0 em0Var, g5l0 g5l0Var, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, mlr0 mlr0Var, boolean z, Function0 function0, int i, vzq0 vzq0Var, u380 u380Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        x340 x340Var;
        int i6;
        vwo vwoVar = (vwo) em0Var.f;
        uwo uwoVar = (uwo) em0Var.e;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-83984507);
        if ((i2 & 6) == 0) {
            i4 = (x340Var2.i(c380Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= x340Var2.e(iyr0Var.ordinal()) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= x340Var2.i(d0rVar) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= x340Var2.i(em0Var) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= x340Var2.i(g5l0Var) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i4 |= x340Var2.i(iu30Var) ? 131072 : 65536;
        }
        if ((1572864 & i2) == 0) {
            i4 |= x340Var2.i(iu30Var2) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i4 |= x340Var2.g(qim0Var) ? 8388608 : 4194304;
        }
        if ((100663296 & i2) == 0) {
            i4 |= x340Var2.g(mlr0Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i4 |= x340Var2.h(z) ? 536870912 : 268435456;
        }
        int i7 = i4;
        if ((i3 & 6) == 0) {
            i5 = i3 | (x340Var2.i(function0) ? 4 : 2);
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= x340Var2.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= x340Var2.g(vzq0Var) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i5 |= x340Var2.g(u380Var) ? 2048 : 1024;
        }
        int i8 = i5;
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i8 & 1171) == 1170) ? false : true)) {
            x340Var2.d0();
            if ((i2 & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            ven0 ven0VarS = v8r.s(iu30Var, x340Var2);
            ven0 ven0VarS2 = v8r.s(iu30Var2, x340Var2);
            boolean zG = x340Var2.g(uwoVar);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                r9y0 r9y0Var = new r9y0(ven0VarS, (byte) 16);
                uwoVar.getClass();
                vb1 vb1Var = new vb1(r9y0Var);
                x340Var2.s0(vb1Var);
                objT = vb1Var;
            }
            vb1 vb1Var2 = (vb1) objT;
            boolean zG2 = x340Var2.g(vwoVar);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                r9y0 r9y0Var2 = new r9y0(ven0VarS2, (byte) 17);
                vwoVar.getClass();
                objT2 = new dc80(r9y0Var2);
                x340Var2.s0(objT2);
            }
            dc80 dc80Var = (dc80) objT2;
            int i9 = i8 << 9;
            g(xtb0VarA, mlr0Var, z, function0, i, x340Var2, ((i7 >> 21) & 1008) | (i9 & 7168) | (i9 & 57344));
            qim0 qim0VarN = anm1.N("search_results_list_test_tag", qim0Var);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            d36 d36Var = new d36(4.0f, true, new um5(false));
            boolean zI = x340Var2.i(g5l0Var);
            Object objT3 = x340Var2.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new kb1(g5l0Var, (byte) 2);
                x340Var2.s0(objT3);
            }
            h3h1 h3h1Var = new h3h1((iu30) objT3);
            boolean zI2 = ((i8 & 7168) == 2048) | x340Var2.i(c380Var) | ((i7 & 112) == 32) | x340Var2.i(d0rVar) | x340Var2.i(em0Var) | x340Var2.i(vb1Var2) | x340Var2.i(dc80Var);
            Object objT4 = x340Var2.T();
            if (zI2 || objT4 == m4cVar) {
                i6 = i8;
                z1 z1Var = new z1(c380Var, u380Var, iyr0Var, d0rVar, em0Var, vb1Var2, dc80Var, (byte) 20);
                x340Var2.s0(z1Var);
                objT4 = z1Var;
            } else {
                i6 = i8;
            }
            s3o1.d(qim0VarN, xtb0VarA, vzq0Var, d36Var, null, null, true, h3h1Var, (iu30) objT4, x340Var2, (i6 & 896) | 12582912, 104);
            x340Var = x340Var2;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new la51(c380Var, iyr0Var, d0rVar, em0Var, g5l0Var, iu30Var, iu30Var2, qim0Var, mlr0Var, z, function0, i, vzq0Var, u380Var, i2, i3);
        }
    }

    public static final void m(zsb1 zsb1Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1624382570);
        int i2 = (x340Var.i(zsb1Var) ? 32 : 16) | i | (x340Var.h(z) ? 256 : 128);
        byte b2 = 1;
        byte b3 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            tq60 tq60Var = nim0.a;
            if (z) {
                x340Var.i0(584718567);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                x0d.s(tq60Var, 2.0f, x340Var, false);
            } else {
                x340Var.i0(584796408);
                x340Var.r(false);
            }
            xxh xxhVar = zsb1Var.e;
            xsb1 xsb1Var = zsb1Var.a;
            oap1.b(xxhVar, z ? new tq60(een.P0) : tq60Var, x340Var, 0, 0);
            if (z) {
                x340Var.i0(584948463);
                if (!(((double) 1.0f) > 0.0d)) {
                    of80.a("invalid weight; must be greater than zero");
                }
                op71.g(x340Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x0d.s(tq60Var, 6.0f, x340Var, false);
            } else {
                x340Var.i0(585080120);
                x340Var.r(false);
            }
            String str = zsb1Var.d;
            Uri uri = str != null ? Uri.parse(str) : Uri.EMPTY;
            uri.getClass();
            eso1.e(uri, isl.a, z ? zr7.i(tq60Var, new qtb1(xsb1Var, b3)) : zr7.i(tq60Var, new qtb1(xsb1Var, b2)), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, y3o1.a0(xsb1Var), false, false, x340Var, 1073766448, 0, 3560);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kf2((Object) zsb1Var, z, i, (byte) 24);
        }
    }

    public static final void n(zsb1 zsb1Var, int i, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i2) {
        b0k b0kVar2;
        qim0 qim0Var2;
        xsb1 xsb1Var = zsb1Var.a;
        int i3 = zsb1Var.g;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1958092002);
        int i4 = i2 | (b0kVar3.g(zsb1Var) ? 4 : 2) | (b0kVar3.e(l1d.C(i)) ? 32 : 16) | (b0kVar3.i(iu30Var) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i4 & 1, (i4 & 1171) != 1170)) {
            boolean z = i == 1;
            boolean z2 = i3 == 1;
            boolean z3 = (xsb1Var == xsb1.d || xsb1Var == xsb1.t || xsb1Var == xsb1.X || xsb1Var == xsb1.Y || xsb1Var == xsb1.c) ? false : true;
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = nva1.R0;
                b0kVar3.s0(objT);
            }
            mgx kgxVar = new kgx(0, (vu30) null, (vu30) objT, (vu30) null, 11);
            String strO0 = cwl1.o0(b0kVar3, 2131962928);
            boolean z4 = (i4 & 896) == 256;
            int i5 = i4 & 14;
            boolean z5 = z4 | (i5 == 4);
            Object objT2 = b0kVar3.T();
            if (z5 || objT2 == m4cVar) {
                objT2 = new k7a1(iu30Var, zsb1Var, (byte) 13);
                b0kVar3.s0(objT2);
            }
            Function0 function0 = (Function0) objT2;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = z ? qim0Var3 : u291.f(qim0Var3, 1.0f);
            if (z2) {
                qim0VarF = hqn1.s(String.format("stats_tile_tag_%s", Arrays.copyOf(new Object[]{xsb1Var}, 1)), strO0, function0, qim0VarF);
            }
            boolean zH = (i5 == 4) | b0kVar3.h(z2);
            Object objT3 = b0kVar3.T();
            if (zH || objT3 == m4cVar) {
                objT3 = new cb8(zsb1Var, z2, (byte) 20);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT3);
            if (z) {
                qim0VarA = u291.c(qim0VarA, 1.0f);
            }
            if (i3 != 2) {
                kgxVar = mgx.e;
            }
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(8.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            mgx mgxVar = kgxVar;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarA, (tl3) null, cr31VarB, mgxVar, new zzq0(8.0f, 8.0f, 8.0f, 8.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(-257097191, new hsb1(z, zsb1Var, z2, z3), b0kVar3), b0kVar2, 0, 48, 2018);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(zsb1Var, i, iu30Var, qim0Var2, i2);
        }
    }

    public static final void o(int i, String str, b0k b0kVar, boolean z, boolean z2) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1233196838);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(new d36(4.0f, true, new um5(false)), een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwo1.e(str, new wnb0(1.0f, true), cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, z2 ? 2 : 1, false, new cjc0(2), 0, null, x340Var, i2 & 14, 0, 1712);
            if (z) {
                x340Var.i0(836497860);
                plx plxVar = plx.c;
                if (z2) {
                    x340Var.i0(836665012);
                    zov0 zov0Var = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 12.0f;
                } else {
                    x340Var.i0(836750293);
                    zov0 zov0Var2 = cbx.b(x340Var).g;
                    x340Var.r(false);
                    f = 16.0f;
                }
                w0h1.a(plxVar, isl.a, u291.m(nim0Var, f), cbx.a(x340Var).b.b, 0L, false, x340Var, plx.d | 48, 48);
                x340Var.r(false);
            } else {
                x340Var.i0(836897636);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i950(str, z, z2, i);
        }
    }

    public static void p(z2s z2sVar, Class cls, Function0 function0, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, s2c0 s2c0Var, int i) {
        if ((i & 128) != 0) {
            s2c0Var = fdv.Y0;
        }
        z2sVar.d.Q(cls, new ssm(function0, new y0o(cls, iu30Var, (byte) 19), cls, (byte) 9), iu30Var, iu30Var2, iu30Var3, false, s2c0Var);
    }

    public static void q(z2s z2sVar, Class cls, laa laaVar, m1d0 m1d0Var, s2c0 s2c0Var) {
        l1d0 l1d0Var = l1d0.b;
        l1d0 l1d0Var2 = l1d0.c;
        if (laaVar instanceof wpw) {
            z2sVar.R(cls, (wpw) laaVar, l1d0Var, m1d0Var, l1d0Var2, false, s2c0Var);
        } else if (laaVar instanceof syq) {
            z2sVar.Q(cls, (syq) laaVar, l1d0Var, m1d0Var, l1d0Var2, s2c0Var);
        }
    }

    public static final String r(s6h0 s6h0Var) {
        if (s6h0Var instanceof n6h0) {
            return ((n6h0) s6h0Var).a;
        }
        if (s6h0Var instanceof j6h0) {
            return ((j6h0) s6h0Var).a;
        }
        if (s6h0Var instanceof p6h0) {
            return ((p6h0) s6h0Var).a;
        }
        if (s6h0Var instanceof r6h0) {
            return ((r6h0) s6h0Var).a;
        }
        return null;
    }

    public static final e1h1 s(e1h1 e1h1Var, y0h1 y0h1Var) {
        if (y0h1Var == null || e1h1Var.a() == 1) {
            return e1h1Var;
        }
        if (y0h1Var.x() == e1h1Var.a()) {
            return e1h1Var.c() ? new f1h1(1, new wvb0(voe0.e, new ka(e1h1Var, (byte) 8))) : new f1h1(e1h1Var.b());
        }
        tod todVar = new tod(e1h1Var);
        e0h1.b.getClass();
        return new f1h1(1, new qod(e1h1Var, todVar, false, e0h1.c));
    }

    public static byte[] t(r0u[] r0uVarArr, byte[] bArr) throws IOException {
        int i = 0;
        int length = 0;
        for (r0u r0uVar : r0uVarArr) {
            length += ((((r0uVar.g * 2) + 7) & (-8)) / 8) + (r0uVar.e * 2) + v(r0uVar.a, r0uVar.b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + r0uVar.f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(length);
        if (Arrays.equals(bArr, b3o1.c)) {
            int length2 = r0uVarArr.length;
            while (i < length2) {
                r0u r0uVar2 = r0uVarArr[i];
                M(byteArrayOutputStream, r0uVar2, v(r0uVar2.a, r0uVar2.b, bArr));
                L(byteArrayOutputStream, r0uVar2);
                i++;
            }
        } else {
            for (r0u r0uVar3 : r0uVarArr) {
                M(byteArrayOutputStream, r0uVar3, v(r0uVar3.a, r0uVar3.b, bArr));
            }
            int length3 = r0uVarArr.length;
            while (i < length3) {
                L(byteArrayOutputStream, r0uVarArr[i]);
                i++;
            }
        }
        if (byteArrayOutputStream.size() == length) {
            return byteArrayOutputStream.toByteArray();
        }
        qpp0.l(byteArrayOutputStream.size(), length, " expected=", "The bytes saved do not match expectation. actual=");
        return null;
    }

    public static String u() {
        try {
            return h8b0.e.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }

    public static String v(String str, String str2, byte[] bArr) {
        byte[] bArr2 = b3o1.e;
        boolean zEquals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = b3o1.d;
        Object obj = (zEquals || Arrays.equals(bArr, bArr3)) ? ":" : "!";
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else {
            if (str2.equals("classes.dex")) {
                return str;
            }
            if (str2.contains("!") || str2.contains(":")) {
                if ("!".equals(obj)) {
                    return str2.replace(":", "!");
                }
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            } else if (!str2.endsWith(".apk")) {
                return l1d.n((Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : "!", str2, new StringBuilder(str));
            }
        }
        return str2;
    }

    public static j6h1 w(String str) {
        return new j6h1(UUID.randomUUID().toString(), str);
    }

    public static j6h1 x() {
        return w("");
    }

    public static final String y(pkh pkhVar) {
        if (pkhVar instanceof ekh) {
            return ((ekh) pkhVar).b.r();
        }
        if (pkhVar instanceof hkh) {
            return ((hkh) pkhVar).b.o();
        }
        if (pkhVar instanceof ikh) {
            return ((ikh) pkhVar).b;
        }
        if (!(pkhVar instanceof okh) && !(pkhVar instanceof kkh) && !(pkhVar instanceof nkh) && !(pkhVar instanceof gkh) && !pkhVar.equals(jkh.b) && !pkhVar.equals(lkh.b) && !(pkhVar instanceof mkh)) {
            eg.o();
        }
        return null;
    }

    public static final int z(pkh pkhVar) {
        if (pkhVar instanceof ekh) {
            return ((ekh) pkhVar).c;
        }
        if (pkhVar instanceof hkh) {
            return ((hkh) pkhVar).c;
        }
        if (!(pkhVar instanceof ikh) && !(pkhVar instanceof kkh) && !(pkhVar instanceof nkh) && !(pkhVar instanceof okh) && !(pkhVar instanceof gkh) && !pkhVar.equals(jkh.b) && !pkhVar.equals(lkh.b) && !(pkhVar instanceof mkh)) {
            eg.o();
        }
        return 0;
    }
}
