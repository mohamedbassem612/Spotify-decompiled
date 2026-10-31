package p;

import androidx.compose.ui.geometry.Offset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class my81 extends hab0 implements iu30 {
    public final /* synthetic */ gb5 a;
    public final /* synthetic */ pmg1 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ c380 f;
    public final /* synthetic */ vu30 g;
    public final /* synthetic */ ss50 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my81(gb5 gb5Var, pmg1 pmg1Var, float f, float f2, Function0 function0, c380 c380Var, vu30 vu30Var, ss50 ss50Var) {
        super(1);
        this.a = gb5Var;
        this.b = pmg1Var;
        this.c = f;
        this.d = f2;
        this.e = function0;
        this.f = c380Var;
        this.g = vu30Var;
        this.h = ss50Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.compose.ui.geometry.Offset */
    /* JADX WARN: Code duplicated, block: B:100:0x0495  */
    /* JADX WARN: Code duplicated, block: B:109:0x0515  */
    /* JADX WARN: Code duplicated, block: B:112:0x035a A[EDGE_INSN: B:112:0x035a->B:56:0x035a BREAK  A[LOOP:0: B:28:0x00d8->B:55:0x034c], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x0433 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:0x04ad A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:128:0x0381 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:32:0x0125  */
    /* JADX WARN: Code duplicated, block: B:36:0x015d A[LOOP:2: B:34:0x0157->B:36:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:41:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:46:0x0266  */
    /* JADX WARN: Code duplicated, block: B:47:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:50:0x032d  */
    /* JADX WARN: Code duplicated, block: B:51:0x0335  */
    /* JADX WARN: Code duplicated, block: B:53:0x033b A[LOOP:1: B:33:0x0126->B:53:0x033b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:54:0x0348  */
    /* JADX WARN: Code duplicated, block: B:59:0x0361  */
    /* JADX WARN: Code duplicated, block: B:61:0x0365  */
    /* JADX WARN: Code duplicated, block: B:63:0x0376  */
    /* JADX WARN: Code duplicated, block: B:64:0x0378  */
    /* JADX WARN: Code duplicated, block: B:67:0x0387  */
    /* JADX WARN: Code duplicated, block: B:73:0x03ab A[LOOP:6: B:71:0x03a5->B:73:0x03ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:78:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x043b  */
    /* JADX WARN: Code duplicated, block: B:90:0x0469  */
    /* JADX WARN: Code duplicated, block: B:92:0x0471  */
    /* JADX WARN: Code duplicated, block: B:94:0x0475  */
    /* JADX WARN: Code duplicated, block: B:95:0x0478  */
    /* JADX WARN: Code duplicated, block: B:97:0x047e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0491  */
    public final Object invoke(Object obj) throws Offset {
        long j;
        float f;
        Offset offset;
        List list;
        Iterator it;
        float f2;
        Offset offset2;
        Offset offset3;
        List list2;
        long j2;
        c380 c380Var;
        boolean zIsEmpty;
        c14 c14Var;
        ArrayList arrayList;
        ArrayList arrayList2;
        Iterator it2;
        long jFloatToRawIntBits;
        Iterator it3;
        int i;
        long j3;
        int i2;
        ArrayList arrayList3;
        int i3;
        int i4;
        c4w c4wVar;
        int i5;
        int i6;
        c4w c4wVar2;
        c4w c4wVarA;
        float fIntBitsToFloat;
        int i7;
        c4w c4wVar3;
        xz3 xz3Var;
        long j4;
        xz3 xz3Var2;
        float f3;
        int iP;
        float f4;
        Iterator it4;
        int i8;
        float f5;
        long j5;
        long j6;
        xz3 xz3Var3;
        float f6;
        ArrayList arrayList4;
        float f7;
        Iterator it5;
        int size;
        long jFloatToRawIntBits2;
        float fHypot;
        long j7 = ((Offset) obj).a;
        gb5 gb5Var = this.a;
        o4w o4wVarA = gb5Var.a();
        if (o4wVarA != null) {
            List list3 = o4wVarA.b;
            List list4 = o4wVarA.a;
            pmg1 pmg1Var = this.b;
            pmg1Var.getClass();
            float f8 = pmg1Var.g;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 >> 32)) - pmg1Var.i;
            long j8 = 4294967295L;
            Offset offset4 = (0.0f > fIntBitsToFloat2 || fIntBitsToFloat2 > f8) ? null : new Offset((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32));
            if (offset4 != null) {
                long j9 = offset4.a;
                List<xz3> list5 = list4;
                boolean z = list5 instanceof Collection;
                float f9 = this.d;
                float f10 = this.c;
                if (z && list5.isEmpty()) {
                    j = j8;
                    f = f9;
                    offset = null;
                    list = list3;
                    it = list.iterator();
                    f2 = Float.MAX_VALUE;
                    offset2 = null;
                    while (true) {
                        offset3 = offset;
                        if (it.hasNext()) {
                            break;
                            break;
                        }
                        c4wVar3 = (c4w) it.next();
                        xz3Var = (xz3) list4.get(c4wVar3.a);
                        j4 = j9;
                        xz3Var2 = (xz3) list4.get(c4wVar3.b);
                        List list6 = list5;
                        f3 = f8;
                        iP = yoi1.p((int) ((Math.abs(Float.intBitsToFloat((int) (xz3Var2.a >> 32)) - Float.intBitsToFloat((int) (xz3Var.a >> 32))) * f3) / f), 20, 200);
                        if (iP >= 0) {
                            i8 = 0;
                            while (true) {
                                f5 = i8 / iP;
                                f4 = f10;
                                j5 = xz3Var.a;
                                j6 = xz3Var2.a;
                                xz3Var3 = xz3Var2;
                                List list7 = c4wVar3.c;
                                f6 = c4wVar3.d;
                                List list8 = list7;
                                it4 = it;
                                f7 = f2;
                                arrayList4 = new ArrayList(q7h.U(list8, 10));
                                it5 = list8.iterator();
                                while (it5.hasNext()) {
                                    long j10 = ((Offset) it5.next()).a;
                                    arrayList4.add(new Offset((((long) Float.floatToRawIntBits(l1d.e(c4wVar3.e, f6, Float.intBitsToFloat((int) (j10 >> 32)), f6))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j10 & j)))) & j)));
                                    f6 = f6;
                                }
                                size = arrayList4.size();
                                if (size != 0) {
                                    offset2 = offset2;
                                    c4wVar3 = c4wVar3;
                                    int i9 = (int) (j5 >> 32);
                                    float fIntBitsToFloat3 = ((Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat(i9)) * f5) + Float.intBitsToFloat(i9);
                                    int i10 = (int) (j5 & j);
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (j6 & j)) - Float.intBitsToFloat(i10)) * f5) + Float.intBitsToFloat(i10))) & j);
                                } else if (size != 1) {
                                    offset2 = offset2;
                                    c4wVar3 = c4wVar3;
                                    float f11 = 1.0f - f5;
                                    long j11 = ((Offset) arrayList4.get(0)).a;
                                    float f12 = f11 * f11;
                                    float f13 = 2.0f * f11 * f5;
                                    float f14 = f5 * f5;
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(us71.e((int) (j6 & j), f14, us71.e((int) (j11 & j), f13, Float.intBitsToFloat((int) (j5 & j)) * f12)))) & j) | (Float.floatToRawIntBits(us71.e((int) (j6 >> 32), f14, us71.e((int) (j11 >> 32), f13, Float.intBitsToFloat((int) (j5 >> 32)) * f12))) << 32);
                                } else if (size != 2) {
                                    int i11 = (int) (j5 >> 32);
                                    float fIntBitsToFloat4 = ((Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat(i11)) * f5) + Float.intBitsToFloat(i11);
                                    int i12 = (int) (j5 & j);
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (j6 & j)) - Float.intBitsToFloat(i12)) * f5) + Float.intBitsToFloat(i12))) & j);
                                } else {
                                    float f15 = 1.0f - f5;
                                    long j12 = ((Offset) arrayList4.get(0)).a;
                                    long j13 = ((Offset) arrayList4.get(1)).a;
                                    float f16 = f15 * f15 * f15;
                                    float f17 = 3.0f * f15;
                                    float f18 = f15 * f17 * f5;
                                    float f19 = f17 * f5 * f5;
                                    float fE = us71.e((int) (j13 >> 32), f19, us71.e((int) (j12 >> 32), f18, Float.intBitsToFloat((int) (j5 >> 32)) * f16));
                                    float f20 = f5 * f5 * f5;
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(us71.e((int) (j6 >> 32), f20, fE))) << 32) | (((long) Float.floatToRawIntBits(us71.e((int) (j6 & j), f20, us71.e((int) (j13 & j), f19, us71.e((int) (j12 & j), f18, Float.intBitsToFloat((int) (j5 & j)) * f16))))) & j);
                                }
                                fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (j4 >> 32)) - (Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) * f3), Float.intBitsToFloat((int) (j4 & j)) - ((1.0f - Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j))) * f4));
                                if (fHypot < f7) {
                                    offset2 = new Offset(jFloatToRawIntBits2);
                                    f2 = fHypot;
                                } else {
                                    f2 = f7;
                                    offset2 = offset2;
                                }
                                if (i8 != iP) {
                                    i8++;
                                    xz3Var = xz3Var;
                                    f10 = f4;
                                    xz3Var2 = xz3Var3;
                                    it = it4;
                                    c4wVar3 = c4wVar3;
                                }
                            }
                        } else {
                            f4 = f10;
                            it4 = it;
                        }
                        offset = offset3;
                        j9 = j4;
                        list5 = list6;
                        f8 = f3;
                        f10 = f4;
                        it = it4;
                    }
                    list2 = list5;
                    if (f2 > f) {
                        offset2 = offset3;
                    }
                    if (offset2 != null) {
                        j2 = offset2.a;
                        this.e.invoke();
                        c380Var = this.f;
                        zIsEmpty = c380Var.isEmpty();
                        c14Var = c14.b;
                        if (zIsEmpty) {
                            jFloatToRawIntBits = j2;
                        } else {
                            arrayList = new ArrayList();
                            for (Object obj2 : list2) {
                                if (((xz3) obj2).b == c14Var) {
                                    arrayList.add(obj2);
                                }
                            }
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((xz3) it2.next()).a >> 32))));
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & j)))) & j) | (Float.floatToRawIntBits(f4p1.t(Float.intBitsToFloat((int) (j2 >> 32)), c380Var, arrayList2)) << 32);
                        }
                        it3 = list3.iterator();
                        i = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                j3 = j2;
                                i = -1;
                                break;
                            }
                            c4w c4wVar4 = (c4w) it3.next();
                            fIntBitsToFloat = Float.intBitsToFloat((int) (((xz3) list4.get(c4wVar4.a)).a >> 32));
                            j3 = j2;
                            float fIntBitsToFloat5 = Float.intBitsToFloat((int) (((xz3) list4.get(c4wVar4.b)).a >> 32));
                            i7 = (int) (jFloatToRawIntBits >> 32);
                            if (Float.intBitsToFloat(i7) <= fIntBitsToFloat) {
                            }
                            i++;
                            j2 = j3;
                        }
                        if (i != -1) {
                            c4w c4wVar5 = (c4w) list3.get(i);
                            i2 = c4wVar5.b;
                            xz3 xz3Var4 = new xz3(jFloatToRawIntBits, c14Var, true);
                            ArrayList arrayList5 = new ArrayList(list4);
                            arrayList5.add(i2, xz3Var4);
                            arrayList3 = new ArrayList(q7h.U(list, 10));
                            i3 = 0;
                            for (Object obj3 : list) {
                                i4 = i3 + 1;
                                if (i3 >= 0) {
                                    p7h.T();
                                    throw offset3;
                                }
                                c4wVar = (c4w) obj3;
                                if (i3 == i) {
                                    c4wVar2 = c4wVar;
                                } else {
                                    i5 = c4wVar.a;
                                    i6 = c4wVar.b;
                                    if (i5 >= i2) {
                                        c4wVarA = c4w.a(c4wVar, i5 + 1, i6 + 1, null, 0.0f, 0.0f, 28);
                                    } else {
                                        c4wVar2 = c4wVar;
                                        if (i6 >= i2) {
                                            c4wVarA = c4w.a(c4wVar2, 0, i6 + 1, null, 0.0f, 0.0f, 29);
                                        }
                                    }
                                    arrayList3.add(c4wVarA);
                                    i3 = i4;
                                }
                                c4wVarA = c4wVar2;
                                arrayList3.add(c4wVarA);
                                i3 = i4;
                            }
                            int i13 = c4wVar5.a;
                            float f21 = c4wVar5.d;
                            int i14 = (int) (jFloatToRawIntBits >> 32);
                            float fIntBitsToFloat6 = Float.intBitsToFloat(i14);
                            z6x z6xVar = z6x.a;
                            c4w c4wVar6 = new c4w(i13, i2, z6xVar, f21, fIntBitsToFloat6);
                            c4w c4wVar7 = new c4w(i2, c4wVar5.b + 1, z6xVar, Float.intBitsToFloat(i14), c4wVar5.e);
                            ArrayList arrayList6 = new ArrayList(arrayList3);
                            arrayList6.remove(i);
                            arrayList6.add(i, c4wVar7);
                            arrayList6.add(i, c4wVar6);
                            o4wVarA = o4w.a(o4wVarA, arrayList5, arrayList6, offset3, 28);
                        }
                        gb5Var.d(o4wVarA);
                        this.g.invoke(o4wVarA, yoo.a);
                        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) != Float.intBitsToFloat((int) (j3 >> 32))) {
                            this.h.a(9);
                        }
                    }
                } else {
                    for (xz3 xz3Var5 : list5) {
                        long j14 = j8;
                        boolean zB = xz3Var5.b();
                        float f22 = f9;
                        long j15 = xz3Var5.a;
                        if (!zB) {
                            if (((float) Math.hypot(Float.intBitsToFloat((int) (j9 >> 32)) - (Float.intBitsToFloat((int) (j15 >> 32)) * f8), Float.intBitsToFloat((int) (j9 & j14)) - ((1.0f - Float.intBitsToFloat((int) (j15 & j14))) * f10))) <= f22) {
                            }
                        }
                        j8 = j14;
                        f9 = f22;
                    }
                    j = j8;
                    f = f9;
                    offset = null;
                    list = list3;
                    it = list.iterator();
                    f2 = Float.MAX_VALUE;
                    offset2 = null;
                    while (true) {
                        offset3 = offset;
                        if (it.hasNext()) {
                            break;
                        }
                        c4wVar3 = (c4w) it.next();
                        xz3Var = (xz3) list4.get(c4wVar3.a);
                        j4 = j9;
                        xz3Var2 = (xz3) list4.get(c4wVar3.b);
                        List list9 = list5;
                        f3 = f8;
                        iP = yoi1.p((int) ((Math.abs(Float.intBitsToFloat((int) (xz3Var2.a >> 32)) - Float.intBitsToFloat((int) (xz3Var.a >> 32))) * f3) / f), 20, 200);
                        if (iP >= 0) {
                            i8 = 0;
                            while (true) {
                                f5 = i8 / iP;
                                f4 = f10;
                                j5 = xz3Var.a;
                                j6 = xz3Var2.a;
                                xz3Var3 = xz3Var2;
                                List list10 = c4wVar3.c;
                                f6 = c4wVar3.d;
                                List list11 = list10;
                                it4 = it;
                                f7 = f2;
                                arrayList4 = new ArrayList(q7h.U(list11, 10));
                                it5 = list11.iterator();
                                while (it5.hasNext()) {
                                    long j16 = ((Offset) it5.next()).a;
                                    arrayList4.add(new Offset((((long) Float.floatToRawIntBits(l1d.e(c4wVar3.e, f6, Float.intBitsToFloat((int) (j16 >> 32)), f6))) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j16 & j)))) & j)));
                                    f6 = f6;
                                }
                                size = arrayList4.size();
                                if (size != 0) {
                                    offset2 = offset2;
                                    c4wVar3 = c4wVar3;
                                    int i15 = (int) (j5 >> 32);
                                    float fIntBitsToFloat7 = ((Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat(i15)) * f5) + Float.intBitsToFloat(i15);
                                    int i16 = (int) (j5 & j);
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat7)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (j6 & j)) - Float.intBitsToFloat(i16)) * f5) + Float.intBitsToFloat(i16))) & j);
                                } else if (size != 1) {
                                    offset2 = offset2;
                                    c4wVar3 = c4wVar3;
                                    float f110 = 1.0f - f5;
                                    long j17 = ((Offset) arrayList4.get(0)).a;
                                    float f111 = f110 * f110;
                                    float f112 = 2.0f * f110 * f5;
                                    float f113 = f5 * f5;
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(us71.e((int) (j6 & j), f113, us71.e((int) (j17 & j), f112, Float.intBitsToFloat((int) (j5 & j)) * f111)))) & j) | (Float.floatToRawIntBits(us71.e((int) (j6 >> 32), f113, us71.e((int) (j17 >> 32), f112, Float.intBitsToFloat((int) (j5 >> 32)) * f111))) << 32);
                                } else if (size != 2) {
                                    int i17 = (int) (j5 >> 32);
                                    float fIntBitsToFloat8 = ((Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat(i17)) * f5) + Float.intBitsToFloat(i17);
                                    int i18 = (int) (j5 & j);
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(fIntBitsToFloat8)) << 32) | (((long) Float.floatToRawIntBits(((Float.intBitsToFloat((int) (j6 & j)) - Float.intBitsToFloat(i18)) * f5) + Float.intBitsToFloat(i18))) & j);
                                } else {
                                    float f114 = 1.0f - f5;
                                    long j18 = ((Offset) arrayList4.get(0)).a;
                                    long j19 = ((Offset) arrayList4.get(1)).a;
                                    float f115 = f114 * f114 * f114;
                                    float f116 = 3.0f * f114;
                                    float f117 = f114 * f116 * f5;
                                    float f118 = f116 * f5 * f5;
                                    float fE2 = us71.e((int) (j19 >> 32), f118, us71.e((int) (j18 >> 32), f117, Float.intBitsToFloat((int) (j5 >> 32)) * f115));
                                    float f23 = f5 * f5 * f5;
                                    jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(us71.e((int) (j6 >> 32), f23, fE2))) << 32) | (((long) Float.floatToRawIntBits(us71.e((int) (j6 & j), f23, us71.e((int) (j19 & j), f118, us71.e((int) (j18 & j), f117, Float.intBitsToFloat((int) (j5 & j)) * f115))))) & j);
                                }
                                fHypot = (float) Math.hypot(Float.intBitsToFloat((int) (j4 >> 32)) - (Float.intBitsToFloat((int) (jFloatToRawIntBits2 >> 32)) * f3), Float.intBitsToFloat((int) (j4 & j)) - ((1.0f - Float.intBitsToFloat((int) (jFloatToRawIntBits2 & j))) * f4));
                                if (fHypot < f7) {
                                    offset2 = new Offset(jFloatToRawIntBits2);
                                    f2 = fHypot;
                                } else {
                                    f2 = f7;
                                    offset2 = offset2;
                                }
                                if (i8 != iP) {
                                    i8++;
                                    xz3Var = xz3Var;
                                    f10 = f4;
                                    xz3Var2 = xz3Var3;
                                    it = it4;
                                    c4wVar3 = c4wVar3;
                                }
                            }
                        } else {
                            f4 = f10;
                            it4 = it;
                        }
                        offset = offset3;
                        j9 = j4;
                        list5 = list9;
                        f8 = f3;
                        f10 = f4;
                        it = it4;
                    }
                    list2 = list5;
                    if (f2 > f) {
                        offset2 = offset3;
                    }
                    if (offset2 != null) {
                        j2 = offset2.a;
                        this.e.invoke();
                        c380Var = this.f;
                        zIsEmpty = c380Var.isEmpty();
                        c14Var = c14.b;
                        if (zIsEmpty) {
                            jFloatToRawIntBits = j2;
                        } else {
                            arrayList = new ArrayList();
                            while (r11.hasNext()) {
                                if (((xz3) obj2).b == c14Var) {
                                    arrayList.add(obj2);
                                }
                            }
                            arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                            it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (((xz3) it2.next()).a >> 32))));
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & j)))) & j) | (Float.floatToRawIntBits(f4p1.t(Float.intBitsToFloat((int) (j2 >> 32)), c380Var, arrayList2)) << 32);
                        }
                        it3 = list3.iterator();
                        i = 0;
                        while (true) {
                            if (it3.hasNext()) {
                                j3 = j2;
                                i = -1;
                                break;
                            }
                            c4w c4wVar8 = (c4w) it3.next();
                            fIntBitsToFloat = Float.intBitsToFloat((int) (((xz3) list4.get(c4wVar8.a)).a >> 32));
                            j3 = j2;
                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (((xz3) list4.get(c4wVar8.b)).a >> 32));
                            i7 = (int) (jFloatToRawIntBits >> 32);
                            if (Float.intBitsToFloat(i7) <= fIntBitsToFloat && Float.intBitsToFloat(i7) < fIntBitsToFloat9) {
                                break;
                            }
                            i++;
                            j2 = j3;
                        }
                        if (i != -1) {
                            c4w c4wVar9 = (c4w) list3.get(i);
                            i2 = c4wVar9.b;
                            xz3 xz3Var6 = new xz3(jFloatToRawIntBits, c14Var, true);
                            ArrayList arrayList7 = new ArrayList(list4);
                            arrayList7.add(i2, xz3Var6);
                            arrayList3 = new ArrayList(q7h.U(list, 10));
                            i3 = 0;
                            while (r6.hasNext()) {
                                i4 = i3 + 1;
                                if (i3 >= 0) {
                                    p7h.T();
                                    throw offset3;
                                }
                                c4wVar = (c4w) obj3;
                                if (i3 == i) {
                                    c4wVar2 = c4wVar;
                                } else {
                                    i5 = c4wVar.a;
                                    i6 = c4wVar.b;
                                    if (i5 >= i2) {
                                        c4wVarA = c4w.a(c4wVar, i5 + 1, i6 + 1, null, 0.0f, 0.0f, 28);
                                    } else {
                                        c4wVar2 = c4wVar;
                                        if (i6 >= i2) {
                                            c4wVarA = c4w.a(c4wVar2, 0, i6 + 1, null, 0.0f, 0.0f, 29);
                                        }
                                    }
                                    arrayList3.add(c4wVarA);
                                    i3 = i4;
                                }
                                c4wVarA = c4wVar2;
                                arrayList3.add(c4wVarA);
                                i3 = i4;
                            }
                            int i19 = c4wVar9.a;
                            float f24 = c4wVar9.d;
                            int i110 = (int) (jFloatToRawIntBits >> 32);
                            float fIntBitsToFloat10 = Float.intBitsToFloat(i110);
                            z6x z6xVar2 = z6x.a;
                            c4w c4wVar10 = new c4w(i19, i2, z6xVar2, f24, fIntBitsToFloat10);
                            c4w c4wVar11 = new c4w(i2, c4wVar9.b + 1, z6xVar2, Float.intBitsToFloat(i110), c4wVar9.e);
                            ArrayList arrayList8 = new ArrayList(arrayList3);
                            arrayList8.remove(i);
                            arrayList8.add(i, c4wVar11);
                            arrayList8.add(i, c4wVar10);
                            o4wVarA = o4w.a(o4wVarA, arrayList7, arrayList8, offset3, 28);
                        }
                        gb5Var.d(o4wVarA);
                        this.g.invoke(o4wVarA, yoo.a);
                        if (Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) != Float.intBitsToFloat((int) (j3 >> 32))) {
                            this.h.a(9);
                        }
                    }
                }
            }
        }
        return rih1.a;
    }
}
