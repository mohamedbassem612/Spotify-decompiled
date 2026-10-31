package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fhd1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ ghd1 b;

    public fhd1(ghd1 ghd1Var, View view) {
        this.b = ghd1Var;
        this.a = view;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View view2 = this.a;
        if (view2.getVisibility() == 0) {
            ghd1.a(this.b, view2);
        }
    }
}
