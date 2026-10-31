package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sc5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ String c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc5(long j, String str, String str2, Function0 function0, String str3, boolean z, int i) {
        super(2);
        this.b = j;
        this.c = str;
        this.f = str2;
        this.g = function0;
        this.h = str3;
        this.d = z;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.f;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                String str = this.c;
                long j = this.b;
                boolean z = this.d;
                crn1.h((fns) obj5, str, j, (tob1) obj4, z, (qim0) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                long j2 = this.b;
                String str2 = this.c;
                foo1.l(j2, str2, (String) obj5, (Function0) obj4, (String) obj3, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sc5(fns fnsVar, String str, long j, tob1 tob1Var, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.f = fnsVar;
        this.c = str;
        this.b = j;
        this.g = tob1Var;
        this.d = z;
        this.h = qim0Var;
        this.e = i;
    }
}
