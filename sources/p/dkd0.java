package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class dkd0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ int g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ cv30 i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkd0(String str, String str2, vu30 vu30Var, vu30 vu30Var2, gbx gbxVar, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.b = str;
        this.c = str2;
        this.h = vu30Var;
        this.i = vu30Var2;
        this.t = gbxVar;
        this.d = z;
        this.e = z2;
        this.f = i;
        this.g = i2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.g;
        iu30 iu30Var = this.i;
        Object obj3 = this.t;
        Object obj4 = this.h;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) iu30Var;
                qim0 qim0Var = (qim0) obj3;
                int iP = czo1.p(i | 1);
                boolean z = this.d;
                boolean z2 = this.e;
                int i2 = this.f;
                i1p1.f(z, z2, (String) obj6, (String) obj5, i2, (Function0) obj4, function0, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                rrn1.b((String) obj6, (String) obj5, (vu30) obj4, (vu30) iu30Var, (gbx) obj3, this.d, this.e, this.f, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                int i3 = this.f;
                boolean z3 = this.d;
                boolean z4 = this.e;
                zho1.s((z6d1) obj6, i3, z3, z4, (e6d1) obj5, (f6d1) obj4, (qim0) obj3, iu30Var, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkd0(z6d1 z6d1Var, int i, boolean z, boolean z2, e6d1 e6d1Var, f6d1 f6d1Var, qim0 qim0Var, iu30 iu30Var, int i2) {
        super(2);
        this.b = z6d1Var;
        this.f = i;
        this.d = z;
        this.e = z2;
        this.c = e6d1Var;
        this.h = f6d1Var;
        this.t = qim0Var;
        this.i = iu30Var;
        this.g = i2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dkd0(boolean z, boolean z2, String str, String str2, int i, Function0 function0, Function0 function1, qim0 qim0Var, int i2) {
        super(2);
        this.d = z;
        this.e = z2;
        this.b = str;
        this.c = str2;
        this.f = i;
        this.h = function0;
        this.i = function1;
        this.t = qim0Var;
        this.g = i2;
    }
}
