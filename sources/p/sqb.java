package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sqb extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ byte d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sqb(crb crbVar, qim0 qim0Var, boolean z, Function0 function0, Function0 function1, int i, int i2) {
        super(2);
        this.e = crbVar;
        this.c = qim0Var;
        this.b = z;
        this.f = function0;
        this.g = function1;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.g;
        Object obj4 = this.f;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                int iP = czo1.p(1);
                byte b2 = this.d;
                qim0 qim0Var = this.c;
                boolean z = this.b;
                vqb.a((crb) obj5, qim0Var, z, (Function0) obj4, function0, (b0k) obj, iP, b2);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(1);
                byte b3 = this.d;
                boolean z2 = this.b;
                qim0 qim0Var2 = this.c;
                acq0.q(z2, qim0Var2, (String) obj5, (String) obj4, (iu30) obj3, (b0k) obj, iP2, b3);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(this.d | 1);
                boolean z3 = this.b;
                iho1.c((f0u) obj5, z3, (String) obj4, (String) obj3, this.c, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sqb(f0u f0uVar, boolean z, String str, String str2, qim0 qim0Var, int i) {
        super(2);
        this.e = f0uVar;
        this.b = z;
        this.f = str;
        this.g = str2;
        this.c = qim0Var;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public sqb(boolean z, qim0 qim0Var, String str, String str2, iu30 iu30Var, int i, int i2) {
        super(2);
        this.b = z;
        this.c = qim0Var;
        this.e = str;
        this.f = str2;
        this.g = iu30Var;
        this.d = i2;
    }
}
