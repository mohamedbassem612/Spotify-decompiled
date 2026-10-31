package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ekd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ cv30 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekd0(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, iu30 iu30Var, int i2) {
        super(2);
        this.f = z6d1Var;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.g = e6d1Var;
        this.h = iu30Var;
        this.e = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        iu30 iu30Var = this.h;
        Object obj3 = this.g;
        Object obj4 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.c;
                boolean z2 = this.d;
                int i2 = this.b;
                i1p1.g(z, z2, (String) obj4, i2, (Function0) obj3, (Function0) iu30Var, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                int i3 = this.b;
                boolean z3 = this.c;
                boolean z4 = this.d;
                zho1.t((z6d1) obj4, i3, z3, z4, (e6d1) obj3, iu30Var, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekd0(boolean z, boolean z2, String str, int i, Function0 function0, Function0 function1, int i2) {
        super(2);
        this.c = z;
        this.d = z2;
        this.f = str;
        this.b = i;
        this.g = function0;
        this.h = function1;
        this.e = i2;
    }
}
