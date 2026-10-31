package p;

import android.widget.FrameLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rq60 implements i6l1 {
    public final c460 a;

    public rq60(c460 c460Var) {
        this.a = c460Var;
    }

    public final void a(Object obj, FrameLayout frameLayout) {
        x360 x360Var = (x360) obj;
        if (x360Var != null) {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), frameLayout.getContext().getResources().getDimensionPixelSize(2131167033));
        } else {
            frameLayout.setPadding(frameLayout.getPaddingLeft(), frameLayout.getPaddingTop(), frameLayout.getPaddingRight(), 0);
        }
        this.a.a(x360Var, frameLayout);
    }
}
