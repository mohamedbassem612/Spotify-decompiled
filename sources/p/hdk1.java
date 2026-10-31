package p;

import android.view.View;
import java.lang.reflect.Array;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class hdk1 {
    public ip31 a;
    public String b;
    public int c = 0;
    public String d = null;
    public int e = 0;
    public final ArrayList f = new ArrayList();

    public static hdk1 b(String str) {
        if (str.startsWith("CUSTOM")) {
            edk1 edk1Var = new edk1();
            edk1Var.g = new float[1];
            return edk1Var;
        }
        switch (str) {
            case "rotationX":
                return new ddk1((byte) 3);
            case "rotationY":
                return new ddk1((byte) 4);
            case "translationX":
                return new ddk1((byte) 7);
            case "translationY":
                return new ddk1((byte) 8);
            case "translationZ":
                return new ddk1((byte) 9);
            case "progress":
                gdk1 gdk1Var = new gdk1();
                gdk1Var.g = false;
                return gdk1Var;
            case "scaleX":
                return new ddk1((byte) 5);
            case "scaleY":
                return new ddk1((byte) 6);
            case "waveVariesBy":
                return new ddk1((byte) 0);
            case "rotation":
                return new ddk1((byte) 2);
            case "elevation":
                return new ddk1((byte) 1);
            case "transitionPathRotate":
                return new fdk1();
            case "alpha":
                return new ddk1((byte) 0);
            case "waveOffset":
                return new ddk1((byte) 0);
            default:
                return null;
        }
    }

    public final float a(float f) {
        double d;
        double dSignum;
        ip31 ip31Var = this.a;
        dxo1 dxo1Var = (dxo1) ip31Var.h;
        double[] dArr = (double[]) ip31Var.i;
        if (dxo1Var != null) {
            dxo1Var.n(f, dArr);
        } else {
            dArr[0] = ((float[]) ip31Var.f)[0];
            dArr[1] = ((float[]) ip31Var.g)[0];
            dArr[2] = ((float[]) ip31Var.c)[0];
        }
        double[] dArr2 = (double[]) ip31Var.i;
        double d2 = dArr2[0];
        double d3 = dArr2[1];
        o0g1 o0g1Var = (o0g1) ip31Var.b;
        double d4 = f;
        o0g1Var.getClass();
        double d5 = 0.0d;
        if (d4 < 0.0d) {
            d4 = 0.0d;
        } else if (d4 > 1.0d) {
            d4 = 1.0d;
        }
        int iBinarySearch = Arrays.binarySearch((double[]) o0g1Var.d, d4);
        if (iBinarySearch > 0) {
            d5 = 1.0d;
            d = 1.0d;
        } else if (iBinarySearch != 0) {
            int i = -iBinarySearch;
            int i2 = i - 1;
            float[] fArr = (float[]) o0g1Var.c;
            float f2 = fArr[i2];
            int i3 = i - 2;
            float f3 = fArr[i3];
            double[] dArr3 = (double[]) o0g1Var.d;
            double d6 = dArr3[i2];
            double d7 = dArr3[i3];
            double d8 = ((double) (f2 - f3)) / (d6 - d7);
            d = 1.0d;
            d5 = ((((d4 * d4) - (d7 * d7)) * d8) / 2.0d) + ((d4 - d7) * (((double) f3) - (d8 * d7))) + ((double[]) o0g1Var.e)[i3];
        } else {
            d = 1.0d;
        }
        double d9 = d5 + d3;
        switch (o0g1Var.b) {
            case 1:
                dSignum = Math.signum(0.5d - (d9 % d));
                break;
            case 2:
                dSignum = d - Math.abs((((d9 * 4.0d) + d) % 4.0d) - 2.0d);
                break;
            case 3:
                dSignum = (((d9 * 2.0d) + d) % 2.0d) - d;
                break;
            case 4:
                dSignum = d - (((d9 * 2.0d) + d) % 2.0d);
                break;
            case 5:
                dSignum = Math.cos((d3 + d9) * 6.283185307179586d);
                break;
            case 6:
                double dAbs = d - Math.abs(((d9 * 4.0d) % 4.0d) - 2.0d);
                dSignum = d - (dAbs * dAbs);
                break;
            case 7:
                dSignum = ((qjm0) o0g1Var.f).m(d9 % d);
                break;
            default:
                dSignum = Math.sin(6.283185307179586d * d9);
                break;
        }
        return (float) ((dSignum * ((double[]) ip31Var.i)[2]) + d2);
    }

    public final void e() {
        int i;
        int i2;
        double d;
        int i3;
        ArrayList<yoa0> arrayList = this.f;
        int size = arrayList.size();
        if (size == 0) {
            return;
        }
        Collections.sort(arrayList, new cvt((byte) 21));
        double[] dArr = new double[size];
        Class cls = Double.TYPE;
        double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) cls, size, 3);
        int i4 = this.c;
        String str = this.d;
        ip31 ip31Var = new ip31();
        o0g1 o0g1Var = new o0g1((byte) 12);
        o0g1Var.c = new float[0];
        o0g1Var.d = new double[0];
        ip31Var.b = o0g1Var;
        o0g1Var.b = i4;
        if (str != null) {
            double[] dArr3 = new double[str.length() / 2];
            int iIndexOf = str.indexOf(40) + 1;
            i2 = 0;
            i = 1;
            int iIndexOf2 = str.indexOf(44, iIndexOf);
            int i5 = 0;
            d = 1.0d;
            while (iIndexOf2 != -1) {
                dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, iIndexOf2).trim());
                iIndexOf = iIndexOf2 + 1;
                iIndexOf2 = str.indexOf(44, iIndexOf);
                i5++;
            }
            dArr3[i5] = Double.parseDouble(str.substring(iIndexOf, str.indexOf(41, iIndexOf)).trim());
            double[] dArrCopyOf = Arrays.copyOf(dArr3, i5 + 1);
            int length = (dArrCopyOf.length * 3) - 2;
            int length2 = dArrCopyOf.length - 1;
            double d2 = 1.0d / ((double) length2);
            double[][] dArr4 = (double[][]) Array.newInstance((Class<?>) cls, length, 1);
            double[] dArr5 = new double[length];
            int i6 = 0;
            while (i6 < dArrCopyOf.length) {
                double d3 = dArrCopyOf[i6];
                int i7 = i6 + length2;
                dArr4[i7][0] = d3;
                double d4 = d2;
                double d5 = ((double) i6) * d4;
                dArr5[i7] = d5;
                if (i6 > 0) {
                    int i8 = (length2 * 2) + i6;
                    dArr4[i8][0] = d3 + 1.0d;
                    dArr5[i8] = d5 + 1.0d;
                    int i9 = i6 - 1;
                    dArr4[i9][0] = (d3 - 1.0d) - d4;
                    dArr5[i9] = (d5 - 1.0d) - d4;
                }
                i6++;
                d2 = d4;
            }
            o0g1Var.f = new qjm0(dArr5, dArr4);
        } else {
            i = 1;
            i2 = 0;
            d = 1.0d;
        }
        ip31Var.c = new float[size];
        ip31Var.d = new double[size];
        ip31Var.e = new float[size];
        ip31Var.f = new float[size];
        ip31Var.g = new float[size];
        float[] fArr = new float[size];
        this.a = ip31Var;
        int i10 = i2;
        for (yoa0 yoa0Var : arrayList) {
            float f = yoa0Var.d;
            dArr[i10] = ((double) f) * 0.01d;
            double[] dArr6 = dArr2[i10];
            float f2 = yoa0Var.b;
            dArr6[i2] = f2;
            float f3 = yoa0Var.c;
            dArr6[i] = f3;
            float f4 = yoa0Var.e;
            dArr6[r4] = f4;
            ip31 ip31Var2 = this.a;
            ((double[]) ip31Var2.d)[i10] = ((double) yoa0Var.a) / 100.0d;
            ((float[]) ip31Var2.e)[i10] = f;
            ((float[]) ip31Var2.f)[i10] = f3;
            ((float[]) ip31Var2.g)[i10] = f4;
            ((float[]) ip31Var2.c)[i10] = f2;
            i10++;
        }
        ip31 ip31Var3 = this.a;
        float[] fArr2 = (float[]) ip31Var3.e;
        o0g1 o0g1Var2 = (o0g1) ip31Var3.b;
        double[] dArr7 = (double[]) ip31Var3.d;
        int length3 = dArr7.length;
        int[] iArr = new int[2];
        iArr[i] = 3;
        iArr[i2] = length3;
        double[][] dArr8 = (double[][]) Array.newInstance((Class<?>) cls, iArr);
        float[] fArr3 = (float[]) ip31Var3.c;
        ip31Var3.i = new double[fArr3.length + 2];
        double[] dArr9 = new double[fArr3.length + 2];
        double d6 = 0.0d;
        if (dArr7[i2] > 0.0d) {
            o0g1Var2.f(0.0d, fArr2[i2]);
        }
        int length4 = dArr7.length - 1;
        if (dArr7[length4] < d) {
            o0g1Var2.f(d, fArr2[length4]);
        }
        for (int i11 = i2; i11 < dArr8.length; i11++) {
            double[] dArr10 = dArr8[i11];
            dArr10[i2] = ((float[]) ip31Var3.f)[i11];
            dArr10[i] = ((float[]) ip31Var3.g)[i11];
            dArr10[2] = fArr3[i11];
            o0g1Var2.f(dArr7[i11], fArr2[i11]);
        }
        double d7 = 0.0d;
        int i12 = i2;
        while (true) {
            float[] fArr4 = (float[]) o0g1Var2.c;
            if (i12 >= fArr4.length) {
                break;
            }
            d7 += (double) fArr4[i12];
            i12++;
        }
        double d8 = 0.0d;
        int i13 = i;
        while (true) {
            float[] fArr5 = (float[]) o0g1Var2.c;
            if (i13 >= fArr5.length) {
                break;
            }
            int i14 = i13 - 1;
            float f5 = (fArr5[i14] + fArr5[i13]) / 2.0f;
            double[] dArr11 = (double[]) o0g1Var2.d;
            d8 = ((dArr11[i13] - dArr11[i14]) * ((double) f5)) + d8;
            i13++;
        }
        int i15 = i2;
        while (true) {
            float[] fArr6 = (float[]) o0g1Var2.c;
            if (i15 >= fArr6.length) {
                break;
            }
            fArr6[i15] = fArr6[i15] * ((float) (d7 / d8));
            i15++;
            d6 = d6;
        }
        ((double[]) o0g1Var2.e)[i2] = d6;
        int i16 = i;
        while (true) {
            float[] fArr7 = (float[]) o0g1Var2.c;
            if (i16 >= fArr7.length) {
                break;
            }
            int i17 = i16 - 1;
            float f6 = (fArr7[i17] + fArr7[i16]) / 2.0f;
            double[] dArr12 = (double[]) o0g1Var2.d;
            double d9 = dArr12[i16] - dArr12[i17];
            double[] dArr13 = (double[]) o0g1Var2.e;
            dArr13[i16] = (d9 * ((double) f6)) + dArr13[i17];
            i16++;
        }
        if (dArr7.length > i) {
            i3 = i2;
            ip31Var3.h = dxo1.l(i3, dArr7, dArr8);
        } else {
            i3 = i2;
            ip31Var3.h = null;
        }
        dxo1.l(i3, dArr, dArr2);
    }

    public final String toString() {
        String str = this.b;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (yoa0 yoa0Var : this.f) {
            str = str + "[" + yoa0Var.a + " , " + decimalFormat.format(yoa0Var.b) + "] ";
        }
        return str;
    }

    public void c(mhl mhlVar) {
    }

    public void d(View view, float f) {
    }
}
