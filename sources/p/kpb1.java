package p;

import android.graphics.Canvas;
import com.spotify.legacyglue.widgetstate.StateListAnimatorButton;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kpb1 implements lpb1 {
    public final /* synthetic */ StateListAnimatorButton a;

    public kpb1(StateListAnimatorButton stateListAnimatorButton) {
        this.a = stateListAnimatorButton;
    }

    @Override // p.lpb1
    public final void a(float f) {
        super/*android.view.View*/.setScaleX(f);
    }

    @Override // p.lpb1
    public final void b(Canvas canvas) {
        super/*android.view.View*/.onDraw(canvas);
    }

    @Override // p.lpb1
    public final float c() {
        return super/*android.view.View*/.getScaleX();
    }

    @Override // p.lpb1
    public final void d(float f) {
        super/*android.view.View*/.setScaleY(f);
    }

    @Override // p.lpb1
    public final float e() {
        return super/*android.view.View*/.getScaleY();
    }
}
