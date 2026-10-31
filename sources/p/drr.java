package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class drr implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ double b;

    public drr(View view, double d) {
        this.a = view;
        this.b = d;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        int width = view.getWidth();
        View view2 = this.a;
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.width = width;
        layoutParams.height = (int) (((double) width) * this.b);
        view2.setLayoutParams(layoutParams);
    }
}
