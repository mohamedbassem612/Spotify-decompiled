package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yym {
    public o4w a;
    public long b = 0;
    public final l5j1 c;

    public yym() {
        l5j1 l5j1Var = new l5j1();
        l5j1Var.a = Float.NaN;
        this.c = l5j1Var;
    }

    public final o4w a(o4w o4wVar, int i, long j, float f, float f2, float f3) {
        char c;
        long j2;
        List listSingletonList;
        List list;
        long j3;
        float fIntBitsToFloat;
        long jG = Offset.g(this.b, j);
        this.b = jG;
        o4w o4wVar2 = this.a;
        if (o4wVar2 == null) {
            o4wVar2 = o4wVar;
        }
        List list2 = o4wVar2.a;
        xz3 xz3Var = (xz3) o7h.t0(i, list2);
        if (xz3Var != null) {
            long j4 = xz3Var.a;
            if (!xz3Var.b()) {
                float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jG >> 32)) / f;
                long j5 = 4294967295L;
                float f4 = (-Float.intBitsToFloat((int) (jG & 4294967295L))) / f2;
                int i2 = (int) (j4 >> 32);
                float fIntBitsToFloat3 = Float.intBitsToFloat(i2);
                float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j4 & 4294967295L)) + f4;
                if (xz3Var.b == c14.b) {
                    float fIntBitsToFloat5 = Float.intBitsToFloat(i2) + fIntBitsToFloat2;
                    if (i > 0) {
                        c = ' ';
                        fIntBitsToFloat = Float.intBitsToFloat((int) (((xz3) list2.get(i - 1)).a >> 32));
                    } else {
                        c = ' ';
                        fIntBitsToFloat = 0.0f;
                    }
                    fIntBitsToFloat3 = yoi1.o(fIntBitsToFloat5, fIntBitsToFloat, i < list2.size() - 1 ? Float.intBitsToFloat((int) (((xz3) list2.get(i + 1)).a >> c)) : 1.0f);
                } else {
                    c = ' ';
                }
                float fO = yoi1.o(fIntBitsToFloat4, 0.0f, 1.0f);
                if (f4p1.q(fO, f3)) {
                    fO = 0.5f;
                }
                List list3 = list2;
                ArrayList arrayList = new ArrayList(q7h.U(list3, 10));
                int i3 = 0;
                for (Object obj : list3) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        p7h.T();
                        throw null;
                    }
                    xz3 xz3VarA = (xz3) obj;
                    if (i3 == i) {
                        j3 = j5;
                        xz3VarA = xz3.a(xz3VarA, (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << c) | (((long) Float.floatToRawIntBits(fO)) & j3));
                    } else {
                        j3 = j5;
                    }
                    arrayList.add(xz3VarA);
                    j5 = j3;
                    i3 = i4;
                }
                long j6 = j5;
                List<c4w> list4 = o4wVar2.b;
                ArrayList arrayList2 = new ArrayList(q7h.U(list4, 10));
                for (c4w c4wVarA : list4) {
                    int i5 = c4wVarA.a;
                    int i6 = c4wVarA.b;
                    if (i5 == i || i6 == i) {
                        long j7 = ((xz3) arrayList.get(i5)).a;
                        long j8 = ((xz3) arrayList.get(i6)).a;
                        List list5 = c4wVarA.c;
                        if (list5.isEmpty()) {
                            c4wVarA = c4w.a(c4wVarA, 0, 0, null, Float.intBitsToFloat((int) (j7 >> c)), Float.intBitsToFloat((int) (j8 >> c)), 7);
                        } else {
                            int size = list5.size();
                            if (size != 1) {
                                if (size != 2) {
                                    j2 = j8;
                                    list = list5;
                                } else {
                                    j2 = j8;
                                    listSingletonList = p7h.M(new Offset[]{new Offset((((long) Float.floatToRawIntBits(0.33333334f)) << c) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & j6)))) & j6)), new Offset((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & j6)))) & j6) | (((long) Float.floatToRawIntBits(0.6666667f)) << c))});
                                }
                                c4wVarA = c4w.a(c4wVarA, 0, 0, list, Float.intBitsToFloat((int) (j7 >> c)), Float.intBitsToFloat((int) (j2 >> c)), 3);
                            } else {
                                j2 = j8;
                                listSingletonList = Collections.singletonList(new Offset((((long) Float.floatToRawIntBits((Float.intBitsToFloat((int) (j2 & j6)) + Float.intBitsToFloat((int) (j7 & j6))) / 2.0f)) & j6) | (((long) Float.floatToRawIntBits(0.5f)) << c)));
                            }
                            list = listSingletonList;
                            c4wVarA = c4w.a(c4wVarA, 0, 0, list, Float.intBitsToFloat((int) (j7 >> c)), Float.intBitsToFloat((int) (j2 >> c)), 3);
                        }
                    }
                    arrayList2.add(c4wVarA);
                }
                return o4w.a(o4wVar2, arrayList, arrayList2, null, 28);
            }
        }
        return o4wVar2;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0034  */
    public final boolean b(float f, float f2) {
        boolean z;
        boolean zQ = f4p1.q(f, f2);
        l5j1 l5j1Var = this.c;
        boolean z2 = zQ && !l5j1Var.b;
        if (Float.isNaN(l5j1Var.a)) {
            z = false;
        } else {
            float f3 = l5j1Var.a;
            if (f3 == f) {
                z = false;
            } else {
                float fMin = Math.min(f3, f);
                float fMax = Math.max(f3, f);
                if (0.5f <= fMin || 0.5f >= fMax) {
                    z = false;
                } else {
                    z = true;
                }
            }
        }
        l5j1Var.a = f;
        l5j1Var.b = zQ;
        return z2 || z;
    }

    public final void c(o4w o4wVar, int i, float f) {
        this.a = o4wVar;
        this.b = 0L;
        xz3 xz3Var = (xz3) o7h.t0(i, o4wVar.a);
        float fIntBitsToFloat = xz3Var != null ? Float.intBitsToFloat((int) (xz3Var.a & 4294967295L)) : Float.NaN;
        l5j1 l5j1Var = this.c;
        l5j1Var.a = fIntBitsToFloat;
        l5j1Var.b = f4p1.q(fIntBitsToFloat, f);
    }
}
