package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.os.Build;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lwg0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ lwg0(Function0 function0, Object obj, byte b) {
        this.a = b;
        this.b = function0;
        this.c = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Object obj = this.c;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                function0.invoke();
                dg30 dg30VarF0 = ((mwg0) obj).f0();
                if (dg30VarF0 != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        dg30VarF0.overrideActivityTransition(1, 0, 0);
                    } else {
                        dg30VarF0.overridePendingTransition(0, 0);
                    }
                }
                break;
            default:
                function0.invoke();
                dg30 dg30Var = (dg30) obj;
                if (dg30Var != null) {
                    if (Build.VERSION.SDK_INT >= 34) {
                        dg30Var.overrideActivityTransition(1, 0, 0);
                    } else {
                        dg30Var.overridePendingTransition(0, 0);
                    }
                }
                break;
        }
    }
}
