package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class cb7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ qim0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb7(String str, boolean z, Function0 function0, Function0 function1, qim0 qim0Var, int i) {
        super(2);
        this.b = str;
        this.c = z;
        this.d = function0;
        this.e = function1;
        this.f = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.f;
                aqo1.a(czo1.p(1), this.b, this.d, this.e, (b0k) obj, qim0Var, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.f;
                aqo1.j(czo1.p(1), this.b, this.d, this.e, (b0k) obj, qim0Var2, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cb7(Function0 function0, Function0 function1, String str, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.d = function0;
        this.e = function1;
        this.b = str;
        this.c = z;
        this.f = qim0Var;
    }
}
