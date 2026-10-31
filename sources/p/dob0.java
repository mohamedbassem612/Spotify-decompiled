package p;

import androidx.compose.ui.geometry.Size;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dob0 implements hsb0 {
    public final /* synthetic */ lbh a;
    public final /* synthetic */ pob0 b;

    public dob0(lbh lbhVar, pob0 pob0Var) {
        this.a = lbhVar;
        this.b = pob0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v7, types: [java.lang.Object, java.util.ArrayList] */
    public final hfh0 a(isb0 isb0Var, long j) {
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(hjl.h(j))) & 4294967295L) | (((long) Float.floatToRawIntBits(hjl.i(j))) << 32);
        lbh lbhVar = this.a;
        n511 n511Var = lbhVar.k;
        tlc1 tlc1Var = isb0Var.b;
        flb0 layoutDirection = tlc1Var.getLayoutDirection();
        pob0 pob0Var = this.b;
        pob0Var.i = layoutDirection;
        pob0Var.j.setValue(new Size(jFloatToRawIntBits));
        n511 n511VarI = pob0.i(n511Var, jFloatToRawIntBits, pob0Var.k.s());
        if (!pob0Var.d()) {
            tz20 tz20Var = (tz20) pob0Var.c.getValue();
            qz20 qz20Var = tz20Var instanceof qz20 ? (qz20) tz20Var : null;
            int i = qz20Var != null ? qz20Var.a : 0;
            long jA = pob0Var.a(i, lbhVar);
            float fIntBitsToFloat = Float.intBitsToFloat((int) (jA >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & jA));
            pob0Var.g = c97.b(fIntBitsToFloat);
            pob0Var.h = c97.b(fIntBitsToFloat2);
            pob0Var.e(new qz20(i));
            pob0Var.f.setValue(Boolean.TRUE);
        }
        pob0Var.g.i(Float.valueOf(n511VarI.a), Float.valueOf(n511VarI.c));
        pob0Var.h.i(Float.valueOf(n511VarI.b), Float.valueOf(n511VarI.d));
        fjk1 fjk1VarB = pob0Var.b();
        LinkedHashMap linkedHashMapA = lbhVar.a(fjk1VarB.a());
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            int iIntValue = ((Number) entry.getKey()).intValue();
            n511 n511Var2 = (n511) entry.getValue();
            float f = n511Var2.a;
            float f2 = f - fjk1VarB.a;
            float f3 = fjk1VarB.c;
            int iU = jch0.U(f2 * f3);
            float f4 = n511Var2.b;
            int iU2 = jch0.U((f4 - fjk1VarB.b) * f3);
            int iU3 = jch0.U((n511Var2.c - f) * f3);
            if (iU3 < 1) {
                iU3 = 1;
            }
            int iU4 = jch0.U((n511Var2.d - f4) * f3);
            if (iU4 < 1) {
                iU4 = 1;
            }
            if (!((iU3 >= 0) & (iU4 >= 0))) {
                sf80.a("width and height must be >= 0");
            }
            long jH = jjl.h(iU3, iU3, iU4, iU4);
            esb0 esb0Var = isb0Var.c;
            fdn0 fdn0Var = isb0Var.d;
            Object arrayList2 = (List) fdn0Var.b(iIntValue);
            if (arrayList2 == 0) {
                Object objD = esb0Var.d(iIntValue);
                List listP = tlc1Var.P(objD, isb0Var.a.a(iIntValue, objD, esb0Var.b(iIntValue)));
                int size = listP.size();
                arrayList2 = new ArrayList(size);
                for (int i2 = 0; i2 < size; i2++) {
                    arrayList2.add(((afh0) listP.get(i2)).H(jH));
                }
                fdn0Var.i(iIntValue, (Object) arrayList2);
            }
            arrayList.add(new yvg1(arrayList2, Integer.valueOf(iU), Integer.valueOf(iU2)));
            fjk1VarB = fjk1VarB;
        }
        return isb0Var.S(jch0.U(yoi1.o(n511Var.c - n511Var.a, hjl.k(j), hjl.i(j))), jch0.U(yoi1.o(n511Var.d - n511Var.b, hjl.j(j), hjl.h(j))), b7x.a, new ib5(arrayList, (byte) 21));
    }
}
