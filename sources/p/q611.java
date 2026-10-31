package p;

import android.view.animation.BaseInterpolator;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class q611 {
    public int a;
    public int b;
    public int c;
    public int d;
    public BaseInterpolator e;
    public boolean f;

    public final void a(RecyclerView recyclerView) {
        int i = this.d;
        if (i >= 0) {
            this.d = -1;
            recyclerView.Z(i);
            this.f = false;
        } else if (this.f) {
            BaseInterpolator baseInterpolator = this.e;
            if (baseInterpolator != null && this.c < 1) {
                eg.m("If you provide an interpolator, you must set a positive duration");
                return;
            }
            int i2 = this.c;
            if (i2 < 1) {
                eg.m("Scroll duration must be a positive number");
            } else {
                recyclerView.E1.c(this.a, this.b, i2, baseInterpolator);
                this.f = false;
            }
        }
    }
}
