package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lhk1 extends phk1 {
    public final /* synthetic */ byte k;

    @Override // p.phk1
    public final boolean d(float f, long j, View view, p321 p321Var) {
        switch (this.k) {
            case 0:
                view.setAlpha(b(f, j, view, p321Var));
                break;
            case 1:
                view.setElevation(b(f, j, view, p321Var));
                break;
            case 2:
                view.setRotation(b(f, j, view, p321Var));
                break;
            case 3:
                view.setRotationX(b(f, j, view, p321Var));
                break;
            case 4:
                view.setRotationY(b(f, j, view, p321Var));
                break;
            case 5:
                view.setScaleX(b(f, j, view, p321Var));
                break;
            case 6:
                view.setScaleY(b(f, j, view, p321Var));
                break;
            case 7:
                view.setTranslationX(b(f, j, view, p321Var));
                break;
            case 8:
                view.setTranslationY(b(f, j, view, p321Var));
                break;
            default:
                view.setTranslationZ(b(f, j, view, p321Var));
                break;
        }
        return this.h;
    }
}
