package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sk6 extends hab0 implements vu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk6(i2c i2cVar, ej6 ej6Var, Function0 function0, boolean z, boolean z2, xd6 xd6Var, b4g1 b4g1Var, float f, tob1 tob1Var, int i) {
        super(2);
        this.f = i2cVar;
        this.g = ej6Var;
        this.h = function0;
        this.d = z;
        this.e = z2;
        this.i = xd6Var;
        this.t = b4g1Var;
        this.b = f;
        this.X = tob1Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.X;
        Object obj4 = this.t;
        Object obj5 = this.i;
        Object obj6 = this.h;
        Object obj7 = this.g;
        Object obj8 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(this.c | 1);
                boolean z = this.d;
                boolean z2 = this.e;
                float f = this.b;
                ajo1.a((i2c) obj8, (ej6) obj7, (Function0) obj6, z, z2, (xd6) obj5, (b4g1) obj4, f, (tob1) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                float f2 = this.b;
                int i = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                qhf.a((jto1) obj8, f2, (guo1) obj7, (gm31) obj6, i, z3, (q8n) obj5, (q8n) obj4, z4, (qim0) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk6(jto1 jto1Var, float f, guo1 guo1Var, gm31 gm31Var, int i, boolean z, q8n q8nVar, q8n q8nVar2, boolean z2, qim0 qim0Var, int i2) {
        super(2);
        this.f = jto1Var;
        this.b = f;
        this.g = guo1Var;
        this.h = gm31Var;
        this.c = i;
        this.d = z;
        this.i = q8nVar;
        this.t = q8nVar2;
        this.e = z2;
        this.X = qim0Var;
    }
}
