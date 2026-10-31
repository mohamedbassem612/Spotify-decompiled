package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mt9 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt9(float f, iu30 iu30Var, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, boolean z, int i) {
        super(2);
        this.c = f;
        this.f = iu30Var;
        this.d = function0;
        this.g = function1;
        this.h = function2;
        this.e = qim0Var;
        this.b = z;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                boolean z = this.b;
                int iP = czo1.p(1);
                float f = this.c;
                Function0 function1 = this.d;
                n3p1.g(f, (iu30) obj5, function1, (Function0) obj4, function0, this.e, z, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.e;
                int iP2 = czo1.p(1);
                boolean z2 = this.b;
                float f2 = this.c;
                gyo1.l((String) obj5, (fyo1) obj4, z2, f2, (gbx) obj3, this.d, qim0Var, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt9(String str, fyo1 fyo1Var, boolean z, float f, gbx gbxVar, Function0 function0, qim0 qim0Var, int i) {
        super(2);
        this.f = str;
        this.g = fyo1Var;
        this.b = z;
        this.c = f;
        this.h = gbxVar;
        this.d = function0;
        this.e = qim0Var;
    }
}
