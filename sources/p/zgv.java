package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zgv extends l3p1 {
    public final /* synthetic */ byte c;

    public final float s(jot jotVar) {
        switch (this.c) {
            case 0:
                return ((View) jotVar).getAlpha();
            case 1:
                return ((View) jotVar).getScaleX();
            case 2:
                return ((View) jotVar).getScaleY();
            case 3:
                return ((View) jotVar).getRotation();
            case 4:
                return ((View) jotVar).getRotationX();
            default:
                return ((View) jotVar).getRotationY();
        }
    }

    public final void z(jot jotVar, float f) {
        switch (this.c) {
            case 0:
                ((View) jotVar).setAlpha(f);
                break;
            case 1:
                ((View) jotVar).setScaleX(f);
                break;
            case 2:
                ((View) jotVar).setScaleY(f);
                break;
            case 3:
                ((View) jotVar).setRotation(f);
                break;
            case 4:
                ((View) jotVar).setRotationX(f);
                break;
            default:
                ((View) jotVar).setRotationY(f);
                break;
        }
    }
}
