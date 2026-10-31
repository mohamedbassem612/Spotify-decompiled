package p;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class b8v extends AnimatorListenerAdapter {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c8v b;

    public /* synthetic */ b8v(c8v c8vVar, byte b) {
        this.a = b;
        this.b = c8vVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        switch (this.a) {
            case 1:
                super.onAnimationEnd(animator);
                c8v c8vVar = this.b;
                super/*android.graphics.drawable.Drawable*/.setVisible(false, false);
                ArrayList arrayList = c8vVar.f;
                if (arrayList != null && !c8vVar.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n95) it.next()).a();
                    }
                    break;
                }
                break;
            default:
                super.onAnimationEnd(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                super.onAnimationStart(animator);
                c8v c8vVar = this.b;
                ArrayList arrayList = c8vVar.f;
                if (arrayList != null && !c8vVar.g) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((n95) it.next()).b();
                    }
                    break;
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
