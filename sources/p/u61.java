package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public class u61 implements pp00 {
    public final short a;
    public final short b;
    public final short c;
    public final short d;
    public final short e;
    public final float f;
    public final float g;
    public final rdd1 h;
    public final m i;

    /* JADX WARN: Multi-variable type inference failed */
    public u61(int i) {
        this.a = i;
        this.b = (short) 25000;
        this.c = (short) 25000;
        this.d = (short) 1279;
        this.e = (short) 719;
        this.f = 0.7f;
        this.g = 0.75f;
        this.h = rdd1.a;
        this.i = yca.g;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x018a  */
    public final qp00[] a(op00[] op00VarArr, o4a o4aVar) {
        long j;
        int i;
        long j2;
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        for (op00 op00Var : op00VarArr) {
            if (op00Var == null || op00Var.b.length <= 1) {
                arrayList.add(null);
            } else {
                v280 v280VarM = b380.m();
                v280VarM.c(new t61(0L, 0L));
                arrayList.add(v280VarM);
            }
        }
        int length = op00VarArr.length;
        long[][] jArr = new long[length][];
        int i3 = 0;
        while (true) {
            j = -1;
            if (i3 >= op00VarArr.length) {
                break;
            }
            op00 op00Var2 = op00VarArr[i3];
            if (op00Var2 == null) {
                jArr[i3] = new long[0];
            } else {
                int[] iArr = op00Var2.b;
                jArr[i3] = new long[iArr.length];
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    long j3 = op00Var2.a.d[iArr[i4]].k;
                    long[] jArr2 = jArr[i3];
                    if (j3 == -1) {
                        j3 = 0;
                    }
                    jArr2[i4] = j3;
                }
                Arrays.sort(jArr[i3]);
            }
            i3++;
        }
        int[] iArr2 = new int[length];
        long[] jArr3 = new long[length];
        for (int i5 = 0; i5 < length; i5++) {
            long[] jArr4 = jArr[i5];
            jArr3[i5] = jArr4.length == 0 ? 0L : jArr4[0];
        }
        v61.w(arrayList, jArr3);
        n3p1.j(2, "expectedValuesPerKey");
        TreeMap treeMap = new TreeMap((Comparator) ann0.a);
        fwm0 fwm0Var = new fwm0();
        n3p1.j(2, "expectedValuesPerKey");
        gwm0 gwm0Var = new gwm0(treeMap);
        gwm0Var.g = fwm0Var;
        int i6 = 0;
        while (i6 < length) {
            long[] jArr5 = jArr[i6];
            if (jArr5.length <= 1) {
                i = i2;
                j2 = j;
            } else {
                int length2 = jArr5.length;
                double[] dArr = new double[length2];
                int i7 = i2;
                while (true) {
                    long[] jArr6 = jArr[i6];
                    i = i2;
                    double dLog = 0.0d;
                    if (i7 >= jArr6.length) {
                        break;
                    }
                    long j4 = j;
                    long j5 = jArr6[i7];
                    if (j5 != j4) {
                        dLog = Math.log(j5);
                    }
                    dArr[i7] = dLog;
                    i7++;
                    i2 = i;
                    j = j4;
                }
                j2 = j;
                int i8 = length2 - 1;
                double d = dArr[i8] - dArr[i];
                int i9 = i;
                while (i9 < i8) {
                    double d2 = dArr[i9];
                    i9++;
                    gwm0Var.o(Double.valueOf(d == 0.0d ? 1.0d : (((d2 + dArr[i9]) * 0.5d) - dArr[i]) / d), Integer.valueOf(i6));
                }
            }
            i6++;
            i2 = i;
            j = j2;
        }
        int i10 = i2;
        v8 v8Var = ((x8) gwm0Var).c;
        if (v8Var == null) {
            v8Var = new v8(gwm0Var, (byte) 1);
            ((x8) gwm0Var).c = v8Var;
        }
        b380 b380VarP = b380.p(v8Var);
        for (int i11 = i10; i11 < b380VarP.size(); i11++) {
            int iIntValue = ((Integer) b380VarP.get(i11)).intValue();
            int i12 = iArr2[iIntValue] + 1;
            iArr2[iIntValue] = i12;
            jArr3[iIntValue] = jArr[iIntValue][i12];
            v61.w(arrayList, jArr3);
        }
        for (int i13 = i10; i13 < op00VarArr.length; i13++) {
            if (arrayList.get(i13) != null) {
                jArr3[i13] = jArr3[i13] * 2;
            }
        }
        v61.w(arrayList, jArr3);
        v280 v280VarM2 = b380.m();
        for (int i14 = i10; i14 < arrayList.size(); i14++) {
            v280 v280Var = (v280) arrayList.get(i14);
            v280VarM2.c(v280Var == null ? bg11.e : v280Var.g());
        }
        bg11 bg11VarG = v280VarM2.g();
        qp00[] qp00VarArr = new qp00[op00VarArr.length];
        for (int i15 = i10; i15 < op00VarArr.length; i15++) {
            op00 op00Var3 = op00VarArr[i15];
            if (op00Var3 != null) {
                int[] iArr3 = op00Var3.b;
                if (iArr3.length != 0) {
                    int length3 = iArr3.length;
                    pnf1 pnf1Var = op00Var3.a;
                    qp00VarArr[i15] = length3 == 1 ? new nwu(pnf1Var, new int[]{iArr3[i10]}, yca.g, (byte) 1) : b(pnf1Var, iArr3, o4aVar, (b380) bg11VarG.get(i15));
                }
            }
        }
        return qp00VarArr;
    }

    public v61 b(pnf1 pnf1Var, int[] iArr, o4a o4aVar, b380 b380Var) {
        return new v61(pnf1Var, iArr, o4aVar, this.a, this.b, this.c, this.d, this.e, this.f, this.g, b380Var, this.h, this.i);
    }

    public u61() {
        this(10000);
    }
}
