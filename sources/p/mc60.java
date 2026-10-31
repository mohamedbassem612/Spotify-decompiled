package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ short d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mc60(String str, qim0 qim0Var, lee1 lee1Var, long j, int i, boolean z, int i2) {
        super(2);
        this.f = str;
        this.b = qim0Var;
        this.g = lee1Var;
        this.c = j;
        this.d = i;
        this.e = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        short s = this.d;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.b;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(s | 1);
                boolean z = this.e;
                long j = this.c;
                kno1.h((ga60) obj5, z, j, (fb60) obj4, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                boolean z2 = this.e;
                int iP2 = czo1.p(1);
                d5p1.c((String) obj5, (qim0) obj3, (lee1) obj4, this.c, this.d, z2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(s | 1);
                long j2 = this.c;
                boolean z3 = this.e;
                cgj1.h((String) obj5, (lee1) obj4, j2, z3, (Function0) obj3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mc60(String str, lee1 lee1Var, long j, boolean z, Function0 function0, int i) {
        super(2);
        this.f = str;
        this.g = lee1Var;
        this.c = j;
        this.e = z;
        this.b = function0;
        this.d = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public mc60(ga60 ga60Var, boolean z, long j, fb60 fb60Var, qim0 qim0Var, int i) {
        super(2);
        this.f = ga60Var;
        this.e = z;
        this.c = j;
        this.g = fb60Var;
        this.b = qim0Var;
        this.d = i;
    }
}
