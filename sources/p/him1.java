package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class him1 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ yae1 b;
    public final /* synthetic */ lee1 c;
    public final /* synthetic */ h7e d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public him1(boolean z, yae1 yae1Var, lee1 lee1Var, h7e h7eVar, boolean z2, long j) {
        super(1);
        this.a = z;
        this.b = yae1Var;
        this.c = lee1Var;
        this.d = h7eVar;
        this.e = z2;
        this.f = j;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x025b A[LOOP:1: B:23:0x0168->B:51:0x025b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:62:0x0170 A[EDGE_INSN: B:62:0x0170->B:26:0x0170 BREAK  A[LOOP:1: B:23:0x0168->B:51:0x025b], SYNTHETIC] */
    public final Object invoke(Object obj) {
        float f;
        ArrayList arrayList;
        z6x z6xVar;
        oi oiVar;
        eqc eqcVar = (eqc) obj;
        float fH = eqcVar.h() * 8.0f;
        if (this.a) {
            long j = eqcVar.a.j();
            float fH2 = eqcVar.h() * 85.0f;
            float fH3 = eqcVar.h() * 8.0f;
            float fH4 = eqcVar.h() * 25.0f;
            float fH5 = eqcVar.h() * 10.0f;
            int i = (int) (yae1.b(this.b, new af5("Xg"), this.c, 0, false, 1, 0L, (flb0) null, (wat) null, (f930) null, 2028).c & 4294967295L);
            f = fH;
            float fCos = (float) Math.cos(Math.toRadians(25.0d));
            float fSin = (float) Math.sin(Math.toRadians(25.0d));
            tr80 tr80VarQ = yoi1.Q(0, 3);
            arrayList = new ArrayList(q7h.U(tr80VarQ, 10));
            Iterator it = tr80VarQ.iterator();
            while (((sr80) it).c) {
                float fNextInt = (i / 2.0f) + f + (((lr80) it).nextInt() * i);
                long j2 = j;
                int i2 = (int) (j2 >> 32);
                float fIntBitsToFloat = Float.intBitsToFloat(i2);
                float f2 = fH3;
                int i3 = i;
                float f3 = fH2 / 2.0f;
                float f4 = ((fH4 * fCos) + (fIntBitsToFloat - f3)) - (fH5 * fSin);
                float fIntBitsToFloat2 = (fH5 * fCos) + (fH4 * fSin) + ((Float.intBitsToFloat((int) (j2 & 4294967295L)) - f2) - f3);
                float f5 = (((-fCos) + fSin) * f3) + f4;
                Iterator it2 = it;
                float fE = l1d.e(-fSin, fCos, f3, fIntBitsToFloat2);
                float f6 = f4 - ((fCos + fSin) * f3);
                float fE2 = l1d.e(fCos, fSin, f3, fIntBitsToFloat2);
                float f7 = fE2 - fE;
                float fMax = 0.0f;
                if (fNextInt >= fE && fNextInt <= fE2 && f7 != 0.0f) {
                    fMax = Math.max(0.0f, fIntBitsToFloat - (((f6 - f5) * ((fNextInt - fE) / f7)) + f5));
                }
                arrayList.add(Integer.valueOf(Math.max(0, jch0.U((Float.intBitsToFloat(i2) - fMax) - (f * 2.0f)))));
                fH3 = f2;
                i = i3;
                j = j2;
                it = it2;
            }
        } else {
            f = fH;
            arrayList = new ArrayList(3);
            for (int i4 = 0; i4 < 3; i4++) {
                arrayList.add(Integer.valueOf(jch0.U(Float.intBitsToFloat((int) (eqcVar.a.j() >> 32)) - (f * 2.0f))));
            }
        }
        String str = this.d.a;
        if (str.length() == 0) {
            z6xVar = z6x.a;
        } else {
            z6x arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size && str.length() != 0 && ((Number) arrayList.get(i5)).intValue() > 0) {
                int iIntValue = ((Number) arrayList.get(i5)).intValue();
                boolean z = i5 == p7h.L(arrayList);
                yae1 yae1Var = this.b;
                lee1 lee1Var = this.c;
                CharSequence charSequenceSubSequence = "";
                if (z) {
                    oiVar = new oi(yae1.b(yae1Var, new af5(str), lee1Var, 2, false, 1, jjl.b(0, iIntValue, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1960), "", true, (byte) 27);
                } else {
                    y9e1 y9e1VarB = yae1.b(yae1Var, new af5(str), lee1Var, 0, false, 2, jjl.b(0, iIntValue, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1964);
                    zrm0 zrm0Var = y9e1VarB.b;
                    if (zrm0Var.f <= 1) {
                        oiVar = new oi(y9e1VarB, "", true, (byte) 27);
                    } else {
                        int iC = zrm0Var.c(0, false);
                        y9e1 y9e1VarB2 = yae1.b(yae1Var, new af5(str.substring(0, iC)), lee1Var, 0, false, 1, jjl.b(0, iIntValue, 0, 0, 13), (flb0) null, (wat) null, (f930) null, 1964);
                        String strSubstring = str.substring(iC);
                        int length = strSubstring.length();
                        for (int i6 = 0; i6 < length; i6++) {
                            if (!eth.H(strSubstring.charAt(i6))) {
                                charSequenceSubSequence = strSubstring.subSequence(i6, strSubstring.length());
                                break;
                            }
                        }
                        oiVar = new oi(y9e1VarB2, charSequenceSubSequence.toString(), false, (byte) 27);
                    }
                    arrayList2.add((y9e1) oiVar.c);
                    str = (String) oiVar.d;
                    if (oiVar.b) {
                        break;
                    }
                    i5++;
                }
                arrayList2.add((y9e1) oiVar.c);
                str = (String) oiVar.d;
                if (oiVar.b) {
                    break;
                    break;
                }
                i5++;
            }
            z6xVar = arrayList2;
        }
        return eqcVar.a(new gim1(f, z6xVar, this.e, this.f));
    }
}
