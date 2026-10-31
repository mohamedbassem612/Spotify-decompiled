package p;

import android.content.Context;
import androidx.compose.ui.text.font.FontWeight;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cg6 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg6(List list, String str, long j, tk51 tk51Var, int i) {
        super(2);
        this.a = (byte) 12;
        this.d = list;
        this.c = str;
        this.b = j;
        this.e = tk51Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        boolean z = false;
        boolean z2 = true;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.c;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(1);
                fho1.g((String) obj3, (String) obj5, this.b, (bhv) obj4, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                eio1.b((dj6) obj3, this.b, (yux) obj5, (qim0) obj4, (b0k) obj, iP2);
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj4;
                int iP3 = czo1.p(385);
                rk6.e((String) obj3, this.b, (FontWeight) obj5, iu30Var, (b0k) obj, iP3);
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(3073);
                h4g.b((sju) obj3, (mt71) obj5, this.b, (qim0) obj4, (b0k) obj, iP4);
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(55);
                fap1.a((j2i) obj3, (j2i) obj5, this.b, (qim0) obj4, (b0k) obj, iP5);
                return rih1Var;
            case 5:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    qim0 qim0VarN = anm1.N("compose-selection-page-toolbar", dug.f(nim0.a, this.b, d4o1.a));
                    u060 u060Var = (u060) obj5;
                    Context context = (Context) obj4;
                    String str = (String) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (x340Var2.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(hmb0.t1);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, y580.O0);
                    nko1.H(xos0VarM, x340Var2, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                    nko1.F(x340Var2);
                    nko1.H(qim0VarE, x340Var2, y580.Y);
                    otw.c(u060Var, new l060(context.getString(2131961608), str, 1, 1), (qim0) null, (ipb1) null, x340Var2, 0, 12);
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(1);
                p6p1.p(this.c, (xtb0) obj5, this.b, (qim0) obj4, (b0k) obj, iP6);
                return rih1Var;
            case 7:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(1);
                ltn1.g((String) obj3, (String) obj5, this.b, (qim0) obj4, (b0k) obj, iP7);
                return rih1Var;
            case 8:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(1);
                ioo1.k((va60) obj3, this.b, (zqz0) obj5, (qim0) obj4, (b0k) obj, iP8);
                return rih1Var;
            case 9:
                ((Number) obj2).intValue();
                x4p1.d((c380) obj3, (qim0) obj5, (lee1) obj4, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 10:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    uwo1.d((af5) obj3, this.b, null, (lee1) obj5, null, null, 0, false, null, 0, null, (cqs0) obj4, x340Var4, 0, 0, 2036);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                tlc1 tlc1Var = (tlc1) obj;
                long j = ((hjl) obj2).a;
                LinkedHashMap linkedHashMap = (LinkedHashMap) ((o0g1) obj3).f;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(zno1.s(linkedHashMap.size()));
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    Object key = entry.getKey();
                    String str2 = (String) entry.getKey();
                    vu30 vu30Var = (vu30) entry.getValue();
                    q5t0 q5t0VarH = ((afh0) o7h.V0(tlc1Var.P(str2, new j2i(-558734117, new k7f((byte) 22, vu30Var, z), z2)))).H(hjl.b(j, 0, 0, 0, 0, 10));
                    linkedHashMap2.put(key, new gh80(new d6t0(7, tlc1Var.I(q5t0VarH.a), tlc1Var.I(q5t0VarH.b)), new j2i(1580939989, new a2(vu30Var, (byte) 7), true)));
                    z = false;
                    z2 = true;
                }
                q5t0 q5t0VarH2 = ((afh0) o7h.V0(tlc1Var.P("text", new j2i(-1789449300, new cg6((af5) obj5, this.b, (lee1) obj4, mqo1.B(linkedHashMap2)), true)))).H(j);
                return tlc1Var.S(q5t0VarH2.a, q5t0VarH2.b, b7x.a, new f2(q5t0VarH2, (byte) 23));
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(1);
                guo1.u((List) obj5, (String) obj3, this.b, (tk51) obj4, (b0k) obj, iP9);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                u1p1.f((String) obj3, (vu30) obj5, (qim0) obj4, this.b, (b0k) obj, czo1.p(1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg6(Object obj, long j, Object obj2, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.b = j;
        this.d = obj2;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg6(Object obj, Object obj2, long j, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = j;
        this.e = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cg6(Object obj, Object obj2, Object obj3, long j, int i, byte b) {
        super(2);
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg6(long j, u060 u060Var, Context context, String str) {
        super(2);
        this.a = (byte) 5;
        this.b = j;
        this.d = u060Var;
        this.e = context;
        this.c = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg6(af5 af5Var, long j, lee1 lee1Var, cqs0 cqs0Var) {
        super(2);
        this.a = (byte) 10;
        this.c = af5Var;
        this.b = j;
        this.d = lee1Var;
        this.e = cqs0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cg6(o0g1 o0g1Var, af5 af5Var, long j, lee1 lee1Var) {
        super(2);
        this.a = (byte) 11;
        this.c = o0g1Var;
        this.d = af5Var;
        this.b = j;
        this.e = lee1Var;
    }
}
