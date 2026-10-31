package p;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kxr implements View.OnLayoutChangeListener {
    public final /* synthetic */ lxr a;
    public final /* synthetic */ boolean b;

    public kxr(lxr lxrVar, boolean z) {
        this.a = lxrVar;
        this.b = z;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        lxr lxrVar = this.a;
        ((ConstraintLayout) lxrVar.g.d).post(new c57(lxrVar, this.b, (byte) 3));
    }
}
