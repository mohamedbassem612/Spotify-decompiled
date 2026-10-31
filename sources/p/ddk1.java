package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ddk1 extends hdk1 {
    public final /* synthetic */ byte g;

    @Override // p.hdk1
    public final void d(View view, float f) {
        switch (this.g) {
            case 0:
                view.setAlpha(a(f));
                break;
            case 1:
                view.setElevation(a(f));
                break;
            case 2:
                view.setRotation(a(f));
                break;
            case 3:
                view.setRotationX(a(f));
                break;
            case 4:
                view.setRotationY(a(f));
                break;
            case 5:
                view.setScaleX(a(f));
                break;
            case 6:
                view.setScaleY(a(f));
                break;
            case 7:
                view.setTranslationX(a(f));
                break;
            case 8:
                view.setTranslationY(a(f));
                break;
            default:
                view.setTranslationZ(a(f));
                break;
        }
    }
}
