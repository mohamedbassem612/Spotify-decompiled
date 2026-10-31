package p;

import android.graphics.Bitmap;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hy extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(String str, boolean z, boolean z2, Function0 function0, iu30 iu30Var) {
        super(2);
        this.a = (byte) 25;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.f = function0;
        this.d = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:70:0x02b9  */
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = this.c;
        boolean z2 = this.b;
        boolean z3 = false;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.d;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                nyo1.c((String) obj5, (String) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                zod.a(this.b, this.c, (iu30) obj5, (eyh0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                j82.l((tg2) obj5, (iu30) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                ((ldo) obj5).e((hux) obj4, (qim0) obj3, this.b, this.c, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                men1.d((String) obj5, (Map) obj4, this.b, this.c, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj4;
                k6a1 k6a1Var = (k6a1) obj5;
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    j2i j2iVarR = apo.r(-1288597578, new ure(z2, z, (Function0) obj3), x340Var2);
                    boolean zI = x340Var2.i(k6a1Var) | x340Var2.g(function0);
                    Object objT = x340Var2.T();
                    if (zI || objT == fkj0.X) {
                        objT = new onv(k6a1Var, function0, (byte) 1);
                        x340Var2.s0(objT);
                    }
                    bzn1.e(null, null, false, j2iVarR, null, null, null, (Function0) objT, x340Var2, 3072, 119);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                irn1.o((y7e1) obj5, this.b, this.c, (Function0) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                irn1.y((y7e1) obj5, (List) obj4, this.b, this.c, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 8:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x74.a(z2, apo.r(-1333266874, new bk0(z, (q5t0) obj5, (tlc1) obj4, (j2i) obj3), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                guo1.h(this.b, this.c, (swx) obj5, (zwx) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                hav0 hav0Var = (hav0) obj;
                float fFloatValue = ((Number) obj2).floatValue();
                long jB = p8p1.B(hav0Var, true);
                l811 l811Var = (l811) obj5;
                int i = (int) (jB >> 32);
                if (Math.abs(Float.intBitsToFloat(i)) > Math.abs(Float.intBitsToFloat((int) (jB & 4294967295L))) * 3.0f) {
                    flb0 flb0Var = (flb0) obj4;
                    boolean z4 = Float.intBitsToFloat(i) > 0.0f;
                    int iOrdinal = flb0Var.ordinal();
                    if (iOrdinal != 0) {
                        if (iOrdinal != 1) {
                            eg.o();
                            return null;
                        }
                        if ((z4 && z) || (!z4 && z2)) {
                            z3 = true;
                        }
                    } else if ((z4 && z2) || (!z4 && z)) {
                        z3 = true;
                    }
                }
                l811Var.a = z3;
                if (!z3) {
                    return rih1Var;
                }
                hav0Var.a();
                ((m811) obj3).a = fFloatValue;
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                sgc1.d((mpy) obj5, this.b, this.c, (n4b) obj4, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                ((res) obj3).i((String) obj5, (String) obj4, this.b, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 13:
                ((Number) obj2).intValue();
                bqn1.c((hwq) obj5, this.b, (qim0) obj3, this.c, (byp) obj4, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                pwo1.d(this.b, this.c, (osv0) obj5, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 15:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                ven0 ven0Var = (ven0) obj5;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
                    boolean zI2 = x340Var6.i(ven0Var) | x340Var6.g(iu30Var);
                    Object objT2 = x340Var6.T();
                    if (zI2 || objT2 == fkj0.X) {
                        objT2 = new wq9(iu30Var, ven0Var, (byte) 21);
                        x340Var6.s0(objT2);
                    }
                    h7p1.n(this.b, zBooleanValue, this.c, (Function0) objT2, (Function0) obj3, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 16:
                ((Number) obj2).intValue();
                sgc1.i((hux) obj4, (String) obj5, this.b, this.c, (Function0) obj3, (b0k) obj, czo1.p(9));
                return rih1Var;
            case 17:
                ((Number) obj2).intValue();
                lcc.k(this.b, (iye0) obj5, (k2t0) obj4, this.c, (iu30) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 18:
                ((Number) obj2).intValue();
                r2p1.c((nak0) obj5, (iu30) obj4, (qim0) obj3, this.b, this.c, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 19:
                ((Number) obj2).intValue();
                c680.l(this.b, (String) obj5, this.c, (Function0) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                epo1.k(this.b, this.c, (Function0) obj5, (j2i) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 21:
                ((Number) obj2).intValue();
                vgo1.m((String) obj5, this.b, this.c, (qim0) obj3, (Bitmap) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 22:
                ((Number) obj2).intValue();
                rr51.a((String) obj5, this.b, this.c, (Function0) obj4, (Function0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 23:
                ((Number) obj2).intValue();
                o1p1.d(this.b, this.c, (Function0) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 24:
                ((Number) obj2).intValue();
                h7w.b((lfa1) obj5, (qim0) obj3, this.b, this.c, (tcf1) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            default:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    u7n0.n((String) obj5, this.b, this.c, (Function0) obj4, (iu30) obj3, x340Var8, 0);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(Object obj, Object obj2, qim0 qim0Var, boolean z, boolean z2, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.d = qim0Var;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(Object obj, Object obj2, boolean z, boolean z2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(Object obj, boolean z, boolean z2, Object obj2, cv30 cv30Var, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = z2;
        this.f = obj2;
        this.d = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(byte b, Object obj, Object obj2, Object obj3, boolean z, boolean z2) {
        super(2);
        this.a = b;
        this.e = obj;
        this.f = obj2;
        this.b = z;
        this.c = z2;
        this.d = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(String str, boolean z, boolean z2, qim0 qim0Var, Bitmap bitmap, int i) {
        super(2);
        this.a = (byte) 21;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.d = qim0Var;
        this.f = bitmap;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(hwq hwqVar, boolean z, qim0 qim0Var, boolean z2, byp bypVar, int i) {
        super(2);
        this.a = (byte) 13;
        this.e = hwqVar;
        this.b = z;
        this.d = qim0Var;
        this.c = z2;
        this.f = bypVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(res resVar, String str, String str2, boolean z, boolean z2, int i) {
        super(2);
        this.a = (byte) 12;
        this.d = resVar;
        this.e = str;
        this.f = str2;
        this.b = z;
        this.c = z2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(hux huxVar, String str, boolean z, boolean z2, Function0 function0, int i) {
        super(2);
        this.a = (byte) 16;
        this.f = huxVar;
        this.e = str;
        this.b = z;
        this.c = z2;
        this.d = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(lfa1 lfa1Var, qim0 qim0Var, boolean z, boolean z2, tcf1 tcf1Var, int i) {
        super(2);
        this.a = (byte) 24;
        this.e = lfa1Var;
        this.d = qim0Var;
        this.b = z;
        this.c = z2;
        this.f = tcf1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(boolean z, String str, boolean z2, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 19;
        this.b = z;
        this.e = str;
        this.c = z2;
        this.f = function0;
        this.d = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hy(boolean z, iye0 iye0Var, k2t0 k2t0Var, boolean z2, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 17;
        this.b = z;
        this.e = iye0Var;
        this.f = k2t0Var;
        this.c = z2;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(boolean z, boolean z2, Object obj, Object obj2, cv30 cv30Var, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.e = obj;
        this.f = obj2;
        this.d = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hy(boolean z, boolean z2, Object obj, Object obj2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.e = obj;
        this.f = obj2;
        this.d = qim0Var;
    }
}
