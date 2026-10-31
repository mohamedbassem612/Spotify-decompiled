package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oz2 implements View.OnLayoutChangeListener {
    public final /* synthetic */ rm5 a;
    public final /* synthetic */ pgr b;
    public final /* synthetic */ float c;

    public oz2(rm5 rm5Var, pgr pgrVar, float f) {
        this.a = rm5Var;
        this.b = pgrVar;
        this.c = f;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a.b = null;
        tl7.f(this.b, 0, (Float) null, this.c, 6);
    }
}
