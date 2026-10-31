package p;

import android.animation.Animator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kic implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bpb1 b;

    public /* synthetic */ kic(bpb1 bpb1Var, byte b) {
        this.a = b;
        this.b = bpb1Var;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                break;
            case 1:
                bpb1Var.m((Object) null, Boolean.FALSE);
                break;
            case 2:
                break;
            case 3:
                bpb1Var.m((Object) null, Boolean.FALSE);
                break;
            default:
                bpb1Var.m((Object) null, Boolean.FALSE);
                break;
        }
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        bpb1 bpb1Var = this.b;
        switch (b) {
            case 0:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
            case 2:
                bpb1Var.m((Object) null, Boolean.TRUE);
                break;
        }
    }

    private final void a(Animator animator) {
    }

    private final void b(Animator animator) {
    }

    private final void c(Animator animator) {
    }

    private final void d(Animator animator) {
    }

    private final void e(Animator animator) {
    }

    private final void f(Animator animator) {
    }

    private final void g(Animator animator) {
    }

    private final void h(Animator animator) {
    }

    private final void i(Animator animator) {
    }

    private final void j(Animator animator) {
    }

    private final void k(Animator animator) {
    }

    private final void l(Animator animator) {
    }

    private final void m(Animator animator) {
    }

    private final void n(Animator animator) {
    }

    private final void o(Animator animator) {
    }
}
