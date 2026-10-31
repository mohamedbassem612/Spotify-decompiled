package p;

import android.animation.ValueAnimator;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.spotify.nowplayingqueue.bottomsheet.view.layoutmanager.StickyHeaderLinearLayoutManager;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ngf implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ngf(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                Rect rect = new Rect();
                View view = (View) obj2;
                view.getRootView().getWindowVisibleDisplayFrame(rect);
                int height = view.getRootView().getHeight();
                int i = height - rect.bottom;
                err0 err0Var = (hdn0) obj;
                if (i <= ((double) height) * 0.15d) {
                    i = 0;
                }
                err0Var.t(i);
                break;
            case 1:
                ((LinearLayout) ((p1f0) ((tps) obj2).e).b).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                ((ValueAnimator) ((p811) obj).a).start();
                break;
            case 2:
                PublishSubject publishSubject = ((xz40) obj).O0;
                View view2 = (View) obj2;
                if (!view2.getViewTreeObserver().isAlive()) {
                    publishSubject.onNext(Boolean.FALSE);
                    view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                } else if (view2.getVisibility() == 0) {
                    publishSubject.onNext(Boolean.TRUE);
                    view2.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }
                break;
            case 3:
                uyb1 uyb1Var = (uyb1) obj;
                ((iu30) obj2).invoke(Integer.valueOf(uyb1Var.getContentContainer().getHeight() - uyb1Var.getContentContainer().getPaddingBottom()));
                break;
            default:
                ((View) obj2).getViewTreeObserver().removeOnGlobalLayoutListener(this);
                StickyHeaderLinearLayoutManager stickyHeaderLinearLayoutManager = (StickyHeaderLinearLayoutManager) obj;
                int i2 = stickyHeaderLinearLayoutManager.l1;
                if (i2 != -1) {
                    stickyHeaderLinearLayoutManager.w1(i2, stickyHeaderLinearLayoutManager.m1);
                    stickyHeaderLinearLayoutManager.l1 = -1;
                    stickyHeaderLinearLayoutManager.m1 = Integer.MIN_VALUE;
                }
                break;
        }
    }
}
