package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ab91 extends lm5 {
    public final /* synthetic */ byte d;

    public final float a(View view, ViewGroup viewGroup) {
        switch (this.d) {
            case 0:
                return view.getTranslationX() - viewGroup.getWidth();
            case 1:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() + viewGroup.getWidth() : view.getTranslationX() - viewGroup.getWidth();
            case 2:
                return view.getTranslationX() + viewGroup.getWidth();
            default:
                return viewGroup.getLayoutDirection() == 1 ? view.getTranslationX() - viewGroup.getWidth() : view.getTranslationX() + viewGroup.getWidth();
        }
    }
}
