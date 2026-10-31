package p;

import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class e20 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ActionBarOverlayLayout b;

    public /* synthetic */ e20(ActionBarOverlayLayout actionBarOverlayLayout, byte b) {
        this.a = b;
        this.b = actionBarOverlayLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ActionBarOverlayLayout actionBarOverlayLayout = this.b;
        switch (b) {
            case 0:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.c1 = actionBarOverlayLayout.d.animate().translationY(0.0f).setListener(actionBarOverlayLayout.d1);
                break;
            default:
                actionBarOverlayLayout.c();
                actionBarOverlayLayout.c1 = actionBarOverlayLayout.d.animate().translationY(-actionBarOverlayLayout.d.getHeight()).setListener(actionBarOverlayLayout.d1);
                break;
        }
    }
}
