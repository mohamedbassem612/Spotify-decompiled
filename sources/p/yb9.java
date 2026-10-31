package p;

import androidx.media3.common.ParserException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yb9 {
    public final ArrayList a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final float k;
    public final String l;

    public yb9(ArrayList arrayList, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, float f, String str) {
        this.a = arrayList;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = f;
        this.l = str;
    }

    public static yb9 a(izr0 izr0Var) {
        String str;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        try {
            izr0Var.S(4);
            int iE = (izr0Var.E() & 3) + 1;
            if (iE == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iE2 = izr0Var.E() & 31;
            for (int i9 = 0; i9 < iE2; i9++) {
                int iL = izr0Var.L();
                int i10 = izr0Var.b;
                izr0Var.S(iL);
                byte[] bArr = izr0Var.a;
                byte[] bArr2 = new byte[iL + 4];
                System.arraycopy(kwg.a, 0, bArr2, 0, 4);
                System.arraycopy(bArr, i10, bArr2, 4, iL);
                arrayList.add(bArr2);
            }
            int iE3 = izr0Var.E();
            for (int i11 = 0; i11 < iE3; i11++) {
                int iL2 = izr0Var.L();
                int i12 = izr0Var.b;
                izr0Var.S(iL2);
                byte[] bArr3 = izr0Var.a;
                byte[] bArr4 = new byte[iL2 + 4];
                System.arraycopy(kwg.a, 0, bArr4, 0, 4);
                System.arraycopy(bArr3, i12, bArr4, 4, iL2);
                arrayList.add(bArr4);
            }
            if (iE2 > 0) {
                zin0 zin0VarB = mqn1.B(4, (byte[]) arrayList.get(0), ((byte[]) arrayList.get(0)).length);
                int i13 = zin0VarB.e;
                int i14 = zin0VarB.f;
                int i15 = zin0VarB.h + 8;
                int i16 = zin0VarB.i + 8;
                int i17 = zin0VarB.f185p;
                int i18 = zin0VarB.q;
                int i19 = zin0VarB.r;
                int i20 = zin0VarB.s;
                float f2 = zin0VarB.g;
                int i21 = zin0VarB.a;
                int i22 = zin0VarB.b;
                int i23 = zin0VarB.c;
                byte[] bArr5 = kwg.a;
                str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i21), Integer.valueOf(i22), Integer.valueOf(i23));
                i4 = i18;
                i5 = i19;
                i6 = i20;
                f = f2;
                i2 = i14;
                i3 = i15;
                i7 = i16;
                i8 = i17;
                i = i13;
            } else {
                str = null;
                i = -1;
                i2 = -1;
                i3 = -1;
                i4 = -1;
                i5 = -1;
                i6 = 16;
                f = 1.0f;
                i7 = -1;
                i8 = -1;
            }
            return new yb9(arrayList, iE, i, i2, i3, i7, i8, i4, i5, i6, f, str);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw ParserException.a(e, "Error parsing AVC config");
        }
    }
}
