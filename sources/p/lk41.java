package p;

import android.animation.Animator;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class lk41 implements Animator.AnimatorListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;

    public /* synthetic */ lk41(List list, byte b) {
        this.a = b;
        this.b = list;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
        byte b = this.a;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        byte b = this.a;
        List<h5k> list = this.b;
        switch (b) {
            case 0:
                for (h5k h5kVar : list) {
                    h5kVar.d = ((Number) h5kVar.a.invoke()).floatValue();
                    h5kVar.e = ((Number) h5kVar.b.invoke()).floatValue();
                }
                break;
            case 1:
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    i5k i5kVar = (i5k) it.next();
                    i5kVar.d = ((Number) i5kVar.a.invoke()).floatValue();
                    i5kVar.e = ((Number) i5kVar.b.invoke()).floatValue();
                }
                break;
            default:
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    j5k j5kVar = (j5k) it2.next();
                    j5kVar.d = ((Number) j5kVar.a.invoke()).floatValue();
                    j5kVar.e = ((Number) j5kVar.b.invoke()).floatValue();
                }
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
}
