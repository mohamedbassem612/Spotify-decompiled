package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class brf extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(gij1 gij1Var, iu30 iu30Var, iu30 iu30Var2, cce cceVar, o0i o0iVar, l6m l6mVar, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.e = gij1Var;
        this.c = iu30Var;
        this.f = iu30Var2;
        this.g = cceVar;
        this.h = o0iVar;
        this.i = l6mVar;
        this.t = qim0Var;
        this.b = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.f;
        Object obj8 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                iu30 iu30Var = this.c;
                uwo1.g((String) obj8, (w4i1) obj7, (c380) obj6, z, (vu30) obj5, iu30Var, (Function0) obj4, (l2a) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                boolean z2 = this.b;
                iu30 iu30Var2 = this.c;
                acq0.n((lw90) obj8, (tob1) obj7, (y5a0) obj6, (ldo) obj5, (ng20) obj4, z2, iu30Var2, (d6o0) obj3, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                acq0.p((nw90) obj8, (tob1) obj7, (d6o0) obj6, (y5a0) obj5, (ldo) obj4, (ng20) obj3, this.b, this.c, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z3 = this.b;
                iu30 iu30Var3 = this.c;
                uyn1.d((String) obj8, (if5) obj7, z3, (gbx) obj6, iu30Var3, (qim0) obj5, (if5) obj4, (lax) obj3, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                int iP5 = czo1.p(i | 1);
                boolean z4 = this.b;
                iko1.l((j2i) obj7, (String) obj8, (qim0) obj6, z4, (String) obj5, (lax) obj4, (gbx) obj3, this.c, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                iu30 iu30Var4 = (iu30) obj5;
                Function0 function0 = (Function0) obj3;
                int iP6 = czo1.p(i | 1);
                boolean z5 = this.b;
                iu30 iu30Var5 = this.c;
                kbb.i((d631) obj8, z5, (wzv0) obj7, iu30Var5, (Function0) obj4, (Function0) obj6, iu30Var4, function0, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                boolean z6 = this.b;
                iu30 iu30Var6 = this.c;
                h7w.j((String) obj8, (rq31) obj7, (sq31) obj6, z6, iu30Var6, (yqg) obj5, (hlq) obj4, (ilq) obj3, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                boolean z7 = this.b;
                int iP8 = czo1.p(1);
                int i2 = this.d;
                iu30 iu30Var7 = this.c;
                c1e1.a((flb0) obj7, (c380) obj6, (c380) obj5, i2, iu30Var7, (qim0) obj4, (fde1) obj3, (String) obj8, z7, (b0k) obj, iP8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(i | 1);
                boolean z8 = this.b;
                iu30 iu30Var8 = this.c;
                i0p1.d(z8, (z2a) obj7, iu30Var8, (i8h1) obj6, (String) obj8, (qim0) obj5, (qn30) obj4, (List) obj3, (b0k) obj, iP9);
                break;
            default:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(i | 1);
                iu30 iu30Var9 = this.c;
                z1p1.h((gij1) obj8, iu30Var9, (iu30) obj7, (cce) obj6, (o0i) obj5, (l6m) obj4, (qim0) obj3, this.b, (b0k) obj, iP10);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(String str, rq31 rq31Var, sq31 sq31Var, boolean z, iu30 iu30Var, yqg yqgVar, hlq hlqVar, ilq ilqVar, int i) {
        super(2);
        this.e = str;
        this.f = rq31Var;
        this.g = sq31Var;
        this.b = z;
        this.c = iu30Var;
        this.h = yqgVar;
        this.i = hlqVar;
        this.t = ilqVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(String str, w4i1 w4i1Var, c380 c380Var, boolean z, vu30 vu30Var, iu30 iu30Var, Function0 function0, l2a l2aVar, int i) {
        super(2);
        this.e = str;
        this.f = w4i1Var;
        this.g = c380Var;
        this.b = z;
        this.h = vu30Var;
        this.c = iu30Var;
        this.i = function0;
        this.t = l2aVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(j2i j2iVar, String str, qim0 qim0Var, boolean z, String str2, lax laxVar, gbx gbxVar, iu30 iu30Var, int i) {
        super(2);
        this.f = j2iVar;
        this.e = str;
        this.g = qim0Var;
        this.b = z;
        this.h = str2;
        this.i = laxVar;
        this.t = gbxVar;
        this.c = iu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(lw90 lw90Var, tob1 tob1Var, y5a0 y5a0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, d6o0 d6o0Var, int i) {
        super(2);
        this.e = lw90Var;
        this.f = tob1Var;
        this.g = y5a0Var;
        this.h = ldoVar;
        this.i = ng20Var;
        this.b = z;
        this.c = iu30Var;
        this.t = d6o0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(nw90 nw90Var, tob1 tob1Var, d6o0 d6o0Var, y5a0 y5a0Var, ldo ldoVar, ng20 ng20Var, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.e = nw90Var;
        this.f = tob1Var;
        this.g = d6o0Var;
        this.h = y5a0Var;
        this.i = ldoVar;
        this.t = ng20Var;
        this.b = z;
        this.c = iu30Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(flb0 flb0Var, c380 c380Var, c380 c380Var2, int i, iu30 iu30Var, qim0 qim0Var, fde1 fde1Var, String str, boolean z, int i2) {
        super(2);
        this.f = flb0Var;
        this.g = c380Var;
        this.h = c380Var2;
        this.d = i;
        this.c = iu30Var;
        this.i = qim0Var;
        this.t = fde1Var;
        this.e = str;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(d631 d631Var, boolean z, wzv0 wzv0Var, iu30 iu30Var, Function0 function0, Function0 function1, iu30 iu30Var2, Function0 function2, int i) {
        super(2);
        this.e = d631Var;
        this.b = z;
        this.f = wzv0Var;
        this.c = iu30Var;
        this.i = function0;
        this.g = function1;
        this.h = iu30Var2;
        this.t = function2;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(String str, if5 if5Var, boolean z, gbx gbxVar, iu30 iu30Var, qim0 qim0Var, if5 if5Var2, lax laxVar, int i) {
        super(2);
        this.e = str;
        this.f = if5Var;
        this.b = z;
        this.g = gbxVar;
        this.c = iu30Var;
        this.h = qim0Var;
        this.i = if5Var2;
        this.t = laxVar;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public brf(boolean z, z2a z2aVar, iu30 iu30Var, i8h1 i8h1Var, String str, qim0 qim0Var, qn30 qn30Var, List list, int i) {
        super(2);
        this.b = z;
        this.f = z2aVar;
        this.c = iu30Var;
        this.g = i8h1Var;
        this.e = str;
        this.h = qim0Var;
        this.i = qn30Var;
        this.t = list;
        this.d = i;
    }
}
