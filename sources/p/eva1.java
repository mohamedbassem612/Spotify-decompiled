package p;

import android.graphics.Rect;
import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eva1 implements View.OnLayoutChangeListener {
    public final /* synthetic */ fva1 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;

    public eva1(fva1 fva1Var, float f, float f2) {
        this.a = fva1Var;
        this.b = f;
        this.c = f2;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        view.removeOnLayoutChangeListener(this);
        fva1 fva1Var = this.a;
        Rect rect = fva1Var.Z1;
        if (rect == null) {
            u890.C("anchorRect");
            throw null;
        }
        ffv0 ffv0VarG = lap1.g(view, rect, fva1Var.N0());
        float f = this.b;
        fva1.j1(view, ffv0VarG, f);
        fva1Var.i1(view, ffv0VarG, f, this.c);
    }
}
