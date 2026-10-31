package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class su0 extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Function0 b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ su0(Function0 function0, Function0 function1, byte b) {
        this.a = b;
        this.b = function0;
        this.c = function1;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        Function0 function0 = this.c;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        Function0 function0 = this.b;
        switch (b) {
            case 0:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                if (function0 != null) {
                    function0.invoke();
                }
                break;
        }
    }
}
