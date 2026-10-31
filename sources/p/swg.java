package p;

import android.view.View;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class swg implements View.OnClickListener {
    public p700 a;
    public WeakReference b;
    public WeakReference c;
    public View.OnClickListener d;
    public boolean e;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (dhn.a.contains(this)) {
            return;
        }
        try {
            View.OnClickListener onClickListener = this.d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            View view2 = (View) this.c.get();
            View view3 = (View) this.b.get();
            if (view2 == null || view3 == null) {
                return;
            }
            uwg.c(this.a, view2, view3);
        } catch (Throwable th) {
            dhn.a(this, th);
        }
    }
}
