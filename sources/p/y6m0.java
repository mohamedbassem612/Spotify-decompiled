package p;

import android.os.Build;
import android.os.Handler;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y6m0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z6m0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y6m0(z6m0 z6m0Var, byte b) {
        super(0);
        this.a = b;
        this.b = z6m0Var;
    }

    public final Object invoke() {
        int iF;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        dv7 dv7Var = dv7.a;
        z6m0 z6m0Var = this.b;
        switch (b) {
            case 0:
                g23 g23Var = z6m0Var.d;
                su7 su7Var = (su7) g23Var.d;
                BehaviorSubject behaviorSubject = (BehaviorSubject) g23Var.c;
                if (behaviorSubject.h() != dv7Var) {
                    int i = Build.VERSION.SDK_INT;
                    uw7 uw7Var = (mw7) g23Var.b;
                    if (i < 26) {
                        iF = uw7Var.e(su7Var, 3, 1, 5);
                    } else {
                        uw7 uw7Var2 = uw7Var;
                        iF = uw7Var2.f(new av7(1, (Boolean) null, new ow3(2, 1, (byte) 20), su7Var, (Handler) null, (Boolean) null, 0), 5);
                    }
                    if (iF == 1) {
                        behaviorSubject.onNext(dv7Var);
                    }
                }
                break;
            default:
                g23 g23Var2 = z6m0Var.d;
                BehaviorSubject behaviorSubject2 = (BehaviorSubject) g23Var2.c;
                if (behaviorSubject2.h() == dv7Var) {
                    ((mw7) g23Var2.b).a(5, (su7) g23Var2.d);
                    behaviorSubject2.onNext(dv7.b);
                }
                break;
        }
        return rih1Var;
    }
}
