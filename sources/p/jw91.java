package p;

import android.util.SparseArray;
import app.p000rive.semantics.SemanticState;
import com.google.android.recaptcha.internal.zzag;
import com.google.android.recaptcha.internal.zzah;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jw91 implements iw91 {
    public final /* synthetic */ byte a;
    public int b;
    public final Object c;

    public jw91(byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.c = new SparseArray();
                this.b = 0;
                break;
            case 3:
                this.c = new ArrayList();
                this.b = 0;
                break;
            default:
                this.c = new izr0(8);
                break;
        }
    }

    public cik1 a(t5o0 t5o0Var) {
        return new cik1(this, t5o0Var);
    }

    public t5o0 b(int i) {
        t5o0 t5o0Var = (t5o0) ((SparseArray) this.c).get(i);
        if (t5o0Var != null) {
            return t5o0Var;
        }
        hhg1.n(f4i1.c(i, "Cannot find the wrapper for global view type "));
        return null;
    }

    public long c(uyr uyrVar) {
        izr0 izr0Var = (izr0) this.c;
        int i = 0;
        uyrVar.d(izr0Var.a, 0, 1, false);
        int i2 = izr0Var.a[0] & 255;
        if (i2 == 0) {
            return Long.MIN_VALUE;
        }
        int i3 = SemanticState.Focused;
        int i4 = 0;
        while ((i2 & i3) == 0) {
            i3 >>= 1;
            i4++;
        }
        int i5 = i2 & (~i3);
        uyrVar.d(izr0Var.a, 1, i4, false);
        while (i < i4) {
            i++;
            i5 = (izr0Var.a[i] & 255) + (i5 << 8);
        }
        this.b = i4 + 1 + this.b;
        return i5;
    }

    public int d(long j) throws zzag {
        long j2;
        int[] iArr = {783368690, 2033355106, 1011212548, -1019590554, -1840431076, 450100676, 21082158, 1189641421, 1025202362};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i10 = i8 % 1025202362;
        long[] jArr = {572660336, 1946443174, 827031559, -838041696, -1952800191, 225735627, 63423617, 2084420925, 1937477084};
        long j3 = jArr[0];
        long j4 = jArr[1];
        long j5 = jArr[2];
        long j6 = jArr[3];
        long j7 = jArr[4];
        long j8 = jArr[5];
        long j9 = jArr[6];
        long j10 = jArr[7];
        long j11 = (((((~j3) & j4) | j5) + ((j3 & j6) | j7)) - j8) + j9;
        long j12 = j10 % 1937477084;
        if (j >= 0) {
            j2 = ((long) (this.b + (i9 ^ i10))) - j;
        } else {
            j2 = (j11 ^ j12) + (-j);
        }
        if (j2 < 0 || j2 >= this.b) {
            throw new zzag();
        }
        return (int) j2;
    }

    public void e(nnn1 nnn1Var) throws zzah {
        int[] iArr = {619290071, 707839669, 1439652248, 1857062437, 1153777986, -1073983953, 110861465, 1431419379, 620145550};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i10 = this.b;
        if (i10 >= ((i8 % 620145550) ^ i9)) {
            throw new zzah();
        }
        ArrayList arrayList = (ArrayList) this.c;
        if (i10 == arrayList.size()) {
            arrayList.add(nnn1Var);
        } else {
            arrayList.set(this.b, nnn1Var);
        }
        this.b++;
    }

    public nnn1 f() throws zzag {
        int[] iArr = {1246322141, 1353851113, 767563284, -47045399, -1353918698, 1098913221, 38700441, 1600766768, 649830540};
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        int i5 = iArr[4];
        int i6 = iArr[5];
        int i7 = iArr[6];
        int i8 = iArr[7];
        int i9 = xvj1.i((i2 & (~i)) | i3, (i & i4) | i5, i6, i7);
        int i10 = i8 % 649830540;
        int i11 = this.b;
        if (i11 <= 0) {
            throw new zzag();
        }
        int i12 = i10 ^ i9;
        ArrayList arrayList = (ArrayList) this.c;
        nnn1 nnn1Var = (nnn1) arrayList.get(i11 + i12);
        arrayList.set(this.b + i12, null);
        this.b += i12;
        return nnn1Var;
    }

    public nnn1 g(long j) {
        return (nnn1) ((ArrayList) this.c).get(d(j));
    }

    public String toString() {
        switch (this.a) {
            case 1:
                u280 u280Var = (u280) this.c;
                int i = u280Var.b;
                ArrayList arrayList = new ArrayList(i);
                for (int i2 = 0; i2 < i; i2++) {
                    int iB = u280Var.b(i2);
                    String str = zoi1.a;
                    arrayList.add(new String(new byte[]{(byte) (iB >> 24), (byte) (iB >> 16), (byte) (iB >> 8), (byte) iB}, StandardCharsets.US_ASCII));
                }
                StringBuilder sb = new StringBuilder("UnsupportedBrands{major=");
                int i3 = this.b;
                String str2 = zoi1.a;
                sb.append(new String(new byte[]{(byte) (i3 >> 24), (byte) (i3 >> 16), (byte) (i3 >> 8), (byte) i3}, StandardCharsets.US_ASCII));
                sb.append(", compatible=");
                sb.append(arrayList);
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public jw91(int i, int[] iArr) {
        this.a = (byte) 1;
        this.b = i;
        u280 u280Var = u280.c;
        if (iArr != null && iArr.length != 0) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, iArr.length);
            u280Var = new u280(iArrCopyOf.length, iArrCopyOf);
        }
        this.c = u280Var;
    }
}
