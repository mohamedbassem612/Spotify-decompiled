package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class meg1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ neg1 b;

    public /* synthetic */ meg1(neg1 neg1Var, byte b) {
        this.a = b;
        this.b = neg1Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        neg1 neg1Var = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                neg1.J(neg1Var, ((w611) neg1Var).a.getHeight() - view.getTop());
                break;
            default:
                neg1.J(neg1Var, ((w611) neg1Var).a.getHeight() - i2);
                break;
        }
    }
}
