package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sx1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(List list, boolean z, String str, Function0 function0, xtb0 xtb0Var, int i) {
        super(2);
        this.a = (byte) 23;
        this.e = list;
        this.b = z;
        this.f = str;
        this.c = function0;
        this.g = xtb0Var;
        this.d = i;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.c;
        Object obj6 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                v9p1.i((jw1) obj6, z, (Function0) obj5, (Function0) obj4, (ow1) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z2 = this.b;
                v9p1.o(z2, (y7e1) obj6, (fu1) obj4, (String) obj3, (Function0) obj5, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(1);
                boolean z3 = this.b;
                int i2 = this.d;
                lmt0.b((c2b0) obj6, z3, (String) obj5, i2, (peu) obj4, (qn21) obj3, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                qim0 qim0Var = (qim0) obj3;
                int iP4 = czo1.p(i | 1);
                boolean z4 = this.b;
                foo1.a(z4, (Function0) obj5, (Function0) obj4, (Function0) obj6, qim0Var, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z5 = this.b;
                g3p1.a(z5, (f8n) obj6, (w2k1) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                ago1.a((gwd) obj6, (iu30) obj5, (qim0) obj4, (zau0) obj3, this.b, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                boolean z6 = this.b;
                loo1.j((hre) obj6, (g9m) obj4, (Function0) obj5, z6, (j2i) obj3, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                String str = (String) obj3;
                int iP8 = czo1.p(i | 1);
                boolean z7 = this.b;
                buo1.b(z7, (Function0) obj5, (Function0) obj4, (hux) obj6, str, (b0k) obj, iP8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                boolean z8 = this.b;
                ((oih) obj6).a((xhh) obj5, z8, (iu30) obj4, (qim0) obj3, (b0k) obj, iP9);
                break;
            case 9:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(i | 1);
                s9p1.a((g2c) obj6, (adj1) obj5, (iu30) obj4, (paj1) obj3, this.b, (b0k) obj, iP10);
                break;
            case 10:
                ((Number) obj2).intValue();
                int iP11 = czo1.p(i | 1);
                boolean z9 = this.b;
                ero1.b((t0o) obj6, z9, (iu30) obj5, (iu30) obj4, (qim0) obj3, (b0k) obj, iP11);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                ((Number) obj2).intValue();
                int iP12 = czo1.p(i | 1);
                ((ldo) obj6).h(iP12, (String) obj4, (String) obj3, (Function0) obj5, (b0k) obj, this.b);
                break;
            case grn1.d /* 12 */:
                ((Number) obj2).intValue();
                int iP13 = czo1.p(i | 1);
                boolean z10 = this.b;
                pxd0.i((String) obj6, z10, (iu30) obj5, (zeu) obj4, (qim0) obj3, (b0k) obj, iP13);
                break;
            case 13:
                ((Number) obj2).intValue();
                int iP14 = czo1.p(i | 1);
                boolean z11 = this.b;
                yon1.a((y7e1) obj6, z11, (qim0) obj4, (fnv) obj3, (Function0) obj5, (b0k) obj, iP14);
                break;
            case 14:
                ((Number) obj2).intValue();
                int iP15 = czo1.p(i | 1);
                xd20.a((ed20) obj6, (iu30) obj5, (qim0) obj4, (vzq0) obj3, this.b, (b0k) obj, iP15);
                break;
            case 15:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = (qim0) obj3;
                int iP16 = czo1.p(i | 1);
                ijo1.e(iP16, (String) obj6, (Function0) obj5, (Function0) obj4, (b0k) obj, qim0Var2, this.b);
                break;
            case 16:
                ((Number) obj2).intValue();
                int iP17 = czo1.p(i | 1);
                boolean z12 = this.b;
                so60.c((un60) obj6, (c380) obj5, (iu30) obj4, z12, (vn60) obj3, (b0k) obj, iP17);
                break;
            case 17:
                ((Number) obj2).intValue();
                int iP18 = czo1.p(i | 1);
                boolean z13 = this.b;
                xto1.i((String) obj6, (String) obj5, z13, (lee1) obj4, (qim0) obj3, (b0k) obj, iP18);
                break;
            case 18:
                ((Number) obj2).intValue();
                int iP19 = czo1.p(24577);
                int i3 = this.d;
                boolean z14 = this.b;
                suo1.k((v370) obj6, i3, z14, (wgh1) obj4, (Function0) obj5, (qim0) obj3, (b0k) obj, iP19);
                break;
            case 19:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj5;
                int iP20 = czo1.p(i | 1);
                boolean z15 = this.b;
                nz80.b((tra0) obj6, (w9u0) obj4, z15, (String) obj3, function0, (b0k) obj, iP20);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                ((Number) obj2).intValue();
                int iP21 = czo1.p(i | 1);
                boolean z16 = this.b;
                bin.f((o990) obj6, z16, (Function0) obj5, (zja1) obj4, (sip) obj3, (b0k) obj, iP21);
                break;
            case 21:
                ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj4;
                int iP22 = czo1.p(i | 1);
                boolean z17 = this.b;
                a8o.e((ma90) obj6, z17, (Function0) obj5, (iu30) obj3, function1, (b0k) obj, iP22);
                break;
            case 22:
                ((Number) obj2).intValue();
                int iP23 = czo1.p(i | 1);
                boolean z18 = this.b;
                ot11.h((String) obj6, z18, (Long) obj5, (String) obj4, (yqg) obj3, (b0k) obj, iP23);
                break;
            case 23:
                ((Number) obj2).intValue();
                int iP24 = czo1.p(i | 1);
                boolean z19 = this.b;
                ppo1.d((List) obj6, z19, (String) obj4, (Function0) obj5, (xtb0) obj3, (b0k) obj, iP24);
                break;
            case 24:
                ((Number) obj2).intValue();
                int iP25 = czo1.p(i | 1);
                boolean z20 = this.b;
                ((k8i0) obj6).e((u5i0) obj5, z20, (iu30) obj4, (qim0) obj3, (b0k) obj, iP25);
                break;
            case 25:
                ((Number) obj2).intValue();
                j2i j2iVar = (j2i) obj3;
                int iP26 = czo1.p(i | 1);
                boolean z21 = this.b;
                s1p1.i(z21, (iu30) obj6, (pgx) obj5, (qim0) obj4, j2iVar, (b0k) obj, iP26);
                break;
            case 26:
                ((Number) obj2).intValue();
                int iP27 = czo1.p(i | 1);
                boolean z22 = this.b;
                c680.j((String) obj6, z22, (Boolean) obj5, (p8q0) obj4, (iu30) obj3, (b0k) obj, iP27);
                break;
            case 27:
                ((Number) obj2).intValue();
                int iP28 = czo1.p(i | 1);
                boolean z23 = this.b;
                qxd0.y((String) obj6, (ebq0) obj5, z23, (iu30) obj4, (qim0) obj3, (b0k) obj, iP28);
                break;
            case 28:
                ((Number) obj2).intValue();
                int iP29 = czo1.p(i | 1);
                boolean z24 = this.b;
                r4o1.y((xfx) obj6, (ivm0) obj5, (qim0) obj4, z24, (iu30) obj3, (b0k) obj, iP29);
                break;
            default:
                ((Number) obj2).intValue();
                int iP30 = czo1.p(i | 1);
                boolean z25 = this.b;
                y4o1.h((xfx) obj6, (uvm0) obj5, (qim0) obj4, z25, (iu30) obj3, (b0k) obj, iP30);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(Object obj, Object obj2, Object obj3, Object obj4, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.b = z;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(Object obj, Object obj2, Object obj3, boolean z, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.b = z;
        this.g = obj4;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(Object obj, boolean z, Object obj2, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(Object obj, boolean z, Object obj2, Object obj3, Function0 function0, int i, byte b) {
        super(2);
        this.a = b;
        this.e = obj;
        this.b = z;
        this.f = obj2;
        this.g = obj3;
        this.c = function0;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(byte b, int i, Object obj, Object obj2, Object obj3, qim0 qim0Var, boolean z) {
        super(2);
        this.a = b;
        this.e = obj;
        this.c = obj2;
        this.b = z;
        this.f = obj3;
        this.g = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(hre hreVar, g9m g9mVar, Function0 function0, boolean z, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 6;
        this.e = hreVar;
        this.f = g9mVar;
        this.c = function0;
        this.b = z;
        this.g = j2iVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(v370 v370Var, int i, boolean z, wgh1 wgh1Var, Function0 function0, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 18;
        this.e = v370Var;
        this.d = i;
        this.b = z;
        this.f = wgh1Var;
        this.c = function0;
        this.g = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(ma90 ma90Var, boolean z, Function0 function0, iu30 iu30Var, Function0 function1, int i) {
        super(2);
        this.a = (byte) 21;
        this.e = ma90Var;
        this.b = z;
        this.c = function0;
        this.g = iu30Var;
        this.f = function1;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(tra0 tra0Var, w9u0 w9u0Var, boolean z, String str, Function0 function0, int i) {
        super(2);
        this.a = (byte) 19;
        this.e = tra0Var;
        this.f = w9u0Var;
        this.b = z;
        this.g = str;
        this.c = function0;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(c2b0 c2b0Var, boolean z, String str, int i, peu peuVar, qn21 qn21Var, int i2) {
        super(2);
        this.a = (byte) 2;
        this.e = c2b0Var;
        this.b = z;
        this.c = str;
        this.d = i;
        this.f = peuVar;
        this.g = qn21Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(boolean z, Object obj, Object obj2, Object obj3, Object obj4, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.e = obj;
        this.c = obj2;
        this.f = obj3;
        this.g = obj4;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sx1(boolean z, Function0 function0, Function0 function1, Object obj, Object obj2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = function0;
        this.f = function1;
        this.e = obj;
        this.g = obj2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx1(boolean z, y7e1 y7e1Var, fu1 fu1Var, String str, Function0 function0, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = z;
        this.e = y7e1Var;
        this.f = fu1Var;
        this.g = str;
        this.c = function0;
        this.d = i;
    }
}
