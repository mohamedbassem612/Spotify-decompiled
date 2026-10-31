package p;

import com.comscore.streaming.ContentType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class eus implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ eus(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.b;
        switch (b) {
            case 0:
                long j = ((u7h) obj).a;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.f(j) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    fus.b(((m3e1) obj4).c, (iIntValue << 3) & ContentType.LONG_FORM_ON_DEMAND, j, x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj3).intValue();
                ((j2i) obj4).invoke((b0k) obj2, 0);
                return rih1Var;
            case 2:
                r5f1 r5f1Var = (r5f1) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(r5f1Var) : x340Var3.i(r5f1Var) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    v4f1.a(r5f1Var, null, null, 0.0f, null, 0L, 0L, apo.r(-999924215, new x94((String) obj4, (byte) 11), x340Var4), x340Var4, (iIntValue2 & 14) | 805306368, 255);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                qim0 qim0Var = (qim0) obj;
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(-1498516085);
                n8b1 n8b1VarW = t890.w(x340Var5, 2);
                n8b1 n8b1VarW2 = t890.w(x340Var5, 5);
                mhg1 mhg1Var = (mhg1) obj4;
                k9 k9Var = mhg1Var.a;
                hrr0 hrr0Var = mhg1Var.d;
                boolean zBooleanValue = ((Boolean) k9Var.P0()).booleanValue();
                x340Var5.i0(-1553362193);
                float f = zBooleanValue ? 1.0f : 0.8f;
                x340Var5.r(false);
                Float fValueOf = Float.valueOf(f);
                boolean zBooleanValue2 = ((Boolean) hrr0Var.getValue()).booleanValue();
                x340Var5.i0(-1553362193);
                float f2 = zBooleanValue2 ? 1.0f : 0.8f;
                x340Var5.r(false);
                Float fValueOf2 = Float.valueOf(f2);
                mhg1Var.f();
                x340Var5.i0(386845748);
                x340Var5.r(false);
                tzg1 tzg1Var = rno1.a;
                fhg1 fhg1VarO = bno1.o(mhg1Var, fValueOf, fValueOf2, n8b1VarW, tzg1Var, x340Var5, 196608);
                boolean zBooleanValue3 = ((Boolean) mhg1Var.a.P0()).booleanValue();
                x340Var5.i0(2073045083);
                float f3 = zBooleanValue3 ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf3 = Float.valueOf(f3);
                boolean zBooleanValue4 = ((Boolean) hrr0Var.getValue()).booleanValue();
                x340Var5.i0(2073045083);
                float f4 = zBooleanValue4 ? 1.0f : 0.0f;
                x340Var5.r(false);
                Float fValueOf4 = Float.valueOf(f4);
                mhg1Var.f();
                x340Var5.i0(-281714272);
                x340Var5.r(false);
                qim0 qim0VarE = i541.E(qim0Var, ((Number) fhg1VarO.t.getValue()).floatValue(), ((Number) fhg1VarO.t.getValue()).floatValue(), ((Number) bno1.o(mhg1Var, fValueOf3, fValueOf4, n8b1VarW2, tzg1Var, x340Var5, 196608).t.getValue()).floatValue(), 0.0f, (hw61) null, 131064);
                x340Var5.r(false);
                return qim0VarE;
        }
    }
}
