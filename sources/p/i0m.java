package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class i0m implements h611 {
    public final /* synthetic */ byte a;

    public final void a(View view) {
        byte b = this.a;
    }

    public final void c(View view) {
        switch (this.a) {
            case 0:
                view.setFocusable(true);
                view.setFocusableInTouchMode(false);
                break;
            case 1:
                axo1.i(view);
                break;
            default:
                g611 layoutParams = view.getLayoutParams();
                if (((ViewGroup.MarginLayoutParams) layoutParams).width != -1 || ((ViewGroup.MarginLayoutParams) layoutParams).height != -1) {
                    eg.m("Pages must fill the whole ViewPager2 (use match_parent)");
                }
                break;
        }
    }

    private final void b(View view) {
    }

    private final void d(View view) {
    }

    private final void e(View view) {
    }
}
