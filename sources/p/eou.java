package p;

import android.view.View;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class eou implements nku {
    public final /* synthetic */ byte a;
    public final /* synthetic */ View b;

    public /* synthetic */ eou(View view, byte b) {
        this.a = b;
        this.b = view;
    }

    public final void dispose() {
        switch (this.a) {
            case 0:
                this.b.setKeepScreenOn(false);
                break;
            default:
                this.b.setKeepScreenOn(false);
                break;
        }
    }
}
