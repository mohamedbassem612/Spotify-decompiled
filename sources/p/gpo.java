package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gpo extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gpo(c380 c380Var, qim0 qim0Var, boolean z, lee1 lee1Var, long j, djc0 djc0Var, int i, String str, int i2) {
        super(2);
        this.g = c380Var;
        this.b = qim0Var;
        this.c = z;
        this.h = lee1Var;
        this.d = j;
        this.i = djc0Var;
        this.e = i;
        this.t = str;
        this.f = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        Object obj3 = this.t;
        Object obj4 = this.i;
        Object obj5 = this.h;
        Object obj6 = this.g;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                byte b2 = this.e;
                long j = this.d;
                boolean z = this.c;
                qim0 qim0Var = this.b;
                wxo1.e((rb71) obj6, j, (Function0) obj5, z, qim0Var, (gm31) obj4, (j2i) obj3, (b0k) obj, iP, b2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                qim0 qim0Var2 = this.b;
                boolean z2 = this.c;
                long j2 = this.d;
                byte b3 = this.e;
                up31.a((c380) obj6, qim0Var2, z2, (lee1) obj5, j2, (djc0) obj4, b3, (String) obj3, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gpo(rb71 rb71Var, long j, Function0 function0, boolean z, qim0 qim0Var, gm31 gm31Var, j2i j2iVar, int i, int i2) {
        super(2);
        this.g = rb71Var;
        this.d = j;
        this.h = function0;
        this.c = z;
        this.b = qim0Var;
        this.i = gm31Var;
        this.t = j2iVar;
        this.f = i;
        this.e = i2;
    }
}
