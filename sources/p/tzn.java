package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tzn implements View.OnLayoutChangeListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    public /* synthetic */ tzn(iu30 iu30Var, byte b) {
        this.a = b;
        this.b = iu30Var;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        byte b = this.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                view.removeOnLayoutChangeListener(this);
                iu30Var.invoke(czn.b);
                break;
            default:
                view.removeOnLayoutChangeListener(this);
                iu30Var.invoke(new dzn(view));
                break;
        }
    }
}
