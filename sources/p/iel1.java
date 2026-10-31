package p;

import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class iel1 {
    public static final long a = tdl1.a;
    public static final long b = tdl1.b;
    public static final long c = tdl1.c;
    public static final /* synthetic */ int d = 0;

    public static final void a(int i, jel1 jel1Var, int i2, int i3, int i4, int i5, boolean z, xu30 xu30Var, qim0 qim0Var, zge1 zge1Var, uia uiaVar, b0k b0kVar, int i6) {
        b0k b0kVar2;
        qim0 qim0Var2;
        ArrayList arrayList;
        Float fValueOf;
        vge1 vge1Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1808337056);
        int i7 = i6 | (b0kVar3.e(i) ? 4 : 2) | (b0kVar3.i(jel1Var) ? 32 : 16) | (b0kVar3.e(i2) ? 256 : 128) | (b0kVar3.e(i3) ? 2048 : 1024) | (b0kVar3.e(i4) ? 16384 : 8192) | (b0kVar3.e(i5) ? 131072 : 65536) | (b0kVar3.h(z) ? 1048576 : 524288) | (b0kVar3.i(xu30Var) ? 8388608 : 4194304) | 100663296 | (b0kVar3.i(zge1Var) ? 536870912 : 268435456);
        if (b0kVar3.Y(i7 & 1, ((306783379 & i7) == 306783378 && ((b0kVar3.i(uiaVar) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            boolean zG = b0kVar3.g(jel1Var);
            Object objT = b0kVar3.T();
            ArrayList arrayList2 = z6x.a;
            if (zG || objT == m4cVar) {
                ArrayList arrayList3 = jel1Var != null ? jel1Var.a : null;
                if (arrayList3 == null) {
                    arrayList3 = arrayList2;
                }
                if (arrayList3.isEmpty()) {
                    i7 = i7;
                    objT = arrayList2;
                } else {
                    ArrayList arrayList4 = arrayList3;
                    Integer num = (Integer) o7h.G0(arrayList4);
                    int iIntValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) o7h.D0(arrayList4);
                    int iIntValue2 = (num2 != null ? num2.intValue() : 0) - iIntValue;
                    if (iIntValue2 == 0) {
                        arrayList = new ArrayList(q7h.U(arrayList4, 10));
                        Iterator it = arrayList4.iterator();
                        while (it.hasNext()) {
                            ((Number) it.next()).intValue();
                            arrayList.add(Float.valueOf(0.5f));
                        }
                    } else {
                        ArrayList arrayList5 = new ArrayList(q7h.U(arrayList4, 10));
                        for (Iterator it2 = arrayList4.iterator(); it2.hasNext(); it2 = it2) {
                            arrayList5.add(Float.valueOf((((Number) it2.next()).intValue() - iIntValue) / iIntValue2));
                        }
                        arrayList = arrayList5;
                    }
                    if (arrayList.size() <= 200) {
                        objT = arrayList;
                    } else {
                        int size = arrayList.size() / 200;
                        objT = o7h.t1(arrayList, size, size, true, lcl1.e);
                    }
                }
                b0kVar3.s0(objT);
            } else {
                i7 = i7;
            }
            List list = (List) objT;
            boolean zG2 = b0kVar3.g(zge1Var);
            Object objT2 = b0kVar3.T();
            if (zG2 || objT2 == m4cVar) {
                if (zge1Var != null) {
                    ArrayList arrayList6 = zge1Var.c;
                    ArrayList arrayList7 = zge1Var.d;
                    ArrayList arrayList8 = zge1Var.e;
                    if (arrayList6.isEmpty()) {
                        vge1Var = new vge1(arrayList2, arrayList2, arrayList2);
                    } else {
                        lr80 it3 = yoi1.Q(0, arrayList6.size()).iterator();
                        sr80 sr80Var = (sr80) it3;
                        if (sr80Var.c) {
                            lr80 lr80Var = it3;
                            int iNextInt = lr80Var.nextInt();
                            float fMax = (((p3h1) arrayList6.get(iNextInt)).a & 255) + (((p3h1) ((iNextInt < 0 || iNextInt >= arrayList7.size()) ? new p3h1((byte) 0) : arrayList7.get(iNextInt))).a & 255) + (((p3h1) ((iNextInt < 0 || iNextInt >= arrayList8.size()) ? new p3h1((byte) 0) : arrayList8.get(iNextInt))).a & 255);
                            while (sr80Var.c) {
                                int iNextInt2 = lr80Var.nextInt();
                                sr80 sr80Var2 = sr80Var;
                                fMax = Math.max(fMax, (((p3h1) arrayList6.get(iNextInt2)).a & 255) + (((p3h1) ((iNextInt2 < 0 || iNextInt2 >= arrayList7.size()) ? new p3h1((byte) 0) : arrayList7.get(iNextInt2))).a & 255) + (((p3h1) ((iNextInt2 < 0 || iNextInt2 >= arrayList8.size()) ? new p3h1((byte) 0) : arrayList8.get(iNextInt2))).a & 255));
                                sr80Var = sr80Var2;
                            }
                            fValueOf = Float.valueOf(fMax);
                        } else {
                            fValueOf = null;
                        }
                        float f = 1.0f;
                        if (fValueOf != null) {
                            float fFloatValue = fValueOf.floatValue();
                            if (fFloatValue >= 1.0f) {
                                f = fFloatValue;
                            }
                        }
                        vge1Var = new vge1(c(f, arrayList6), c(f, arrayList7), c(f, arrayList8));
                    }
                    objT2 = vge1Var;
                } else {
                    objT2 = null;
                }
                b0kVar3.s0(objT2);
            }
            vge1 vge1Var2 = (vge1) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = v8r.q(0);
                b0kVar3.s0(objT3);
            }
            ven0 ven0Var = (ven0) objT3;
            ven0 ven0VarS = v8r.s(Integer.valueOf(i), b0kVar3);
            ven0 ven0VarS2 = v8r.s(Integer.valueOf(i4), b0kVar3);
            ven0 ven0VarS3 = v8r.s(Integer.valueOf(i5), b0kVar3);
            ven0 ven0VarS4 = v8r.s(uiaVar, b0kVar3);
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            fq7.g(z, qim0Var3, xay.e(2, irn1.o0(300, 0, (dlv) null, 6)), xay.f(2, irn1.o0(300, 0, (dlv) null, 6)), (String) null, apo.r(-517734200, new gel1(ven0VarS, ven0VarS2, ven0VarS3, ven0VarS4, xu30Var, ven0Var, i, i4, i5, i3, i2, vge1Var2, list), b0kVar3), b0kVar2, ((i7 >> 18) & 14) | 200112, 16);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new hel1(i, jel1Var, i2, i3, i4, i5, z, xu30Var, qim0Var2, zge1Var, uiaVar, i6);
        }
    }

    public static final int b(ven0 ven0Var, ven0 ven0Var2, ven0 ven0Var3, ven0 ven0Var4, float f, float f2) {
        if (((Number) ven0Var.getValue()).intValue() <= 0 || f2 <= 0.0f) {
            return ((Number) ven0Var2.getValue()).intValue();
        }
        int iP = yoi1.p((int) ((f / f2) * ((Number) ven0Var.getValue()).intValue()), ((Number) ven0Var2.getValue()).intValue(), ((Number) ven0Var3.getValue()).intValue());
        uia uiaVar = (uia) ven0Var4.getValue();
        hia hiaVarW = null;
        if (uiaVar != null) {
            ArrayList arrayList = uiaVar.b;
            if (arrayList.isEmpty()) {
                arrayList = null;
            }
            if (arrayList != null) {
                hiaVarW = j2p1.w(iP, arrayList, true);
            }
        }
        return hiaVarW != null ? yoi1.p(h7p1.y(hiaVarW), ((Number) ven0Var2.getValue()).intValue(), ((Number) ven0Var3.getValue()).intValue()) : iP;
    }

    public static final ArrayList c(float f, ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(Float.valueOf((((p3h1) it.next()).a & 255) / f));
        }
        if (arrayList2.size() <= 200) {
            return arrayList2;
        }
        int size = arrayList2.size() / 200;
        return o7h.t1(arrayList2, size, size, true, lcl1.f);
    }

    public static final void d(DrawScope drawScope, float f, float f2, float f3) {
        if (f2 >= f3) {
            return;
        }
        float fX0 = drawScope.X0(2.0f);
        long jB = u7h.b(u7h.f, 0.9f, 0.0f, 0.0f, 0.0f, 14);
        DrawScope.p0(drawScope, jB, (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L), fX0, 0, (uw4) null, 496);
        DrawScope.p0(drawScope, jB, (((long) Float.floatToRawIntBits(f3)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & 4294967295L), (((long) Float.floatToRawIntBits(f)) & 4294967295L) | (Float.floatToRawIntBits(f3) << 32), fX0, 0, (uw4) null, 496);
    }

    public static final void e(DrawScope drawScope, u8s0 u8s0Var, long j, float f, float f2, float f3, float f4, float f5) {
        DrawScope.w0(drawScope, u8s0Var, u7h.b(j, 0.15f, 0.0f, 0.0f, 0.0f, 14), (DrawStyle) null, 60);
        if (f2 < f3) {
            cab cabVarA1 = drawScope.a1();
            long jU = cabVarA1.u();
            cabVarA1.p().q();
            try {
                ((dg8) cabVarA1.b).k(f2, 0.0f, f3, f, 1);
                DrawScope.w0(drawScope, u8s0Var, u7h.b(j, 0.3f, 0.0f, 0.0f, 0.0f, 14), (DrawStyle) null, 60);
                i3a.n(cabVarA1, jU);
            } catch (Throwable th) {
                i3a.n(cabVarA1, jU);
                throw th;
            }
        }
        if (f4 < f5) {
            cab cabVarA2 = drawScope.a1();
            long jU2 = cabVarA2.u();
            cabVarA2.p().q();
            try {
                ((dg8) cabVarA2.b).k(f4, 0.0f, f5, f, 1);
                DrawScope.w0(drawScope, u8s0Var, u7h.b(j, 0.55f, 0.0f, 0.0f, 0.0f, 14), (DrawStyle) null, 60);
            } finally {
                i3a.n(cabVarA2, jU2);
            }
        }
    }
}
