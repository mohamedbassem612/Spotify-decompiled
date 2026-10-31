package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dhs implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ver b;

    public /* synthetic */ dhs(ver verVar, byte b) {
        this.a = b;
        this.b = verVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ver verVar = this.b;
        switch (b) {
            case 0:
                f0a f0aVar = (f0a) verVar.b;
                ViewGroup.LayoutParams layoutParams = ((View) f0aVar.e).getLayoutParams();
                layoutParams.height = verVar.k(3);
                ((View) f0aVar.e).setLayoutParams(layoutParams);
                break;
            default:
                ((View) ((f0a) verVar.b).e).setVisibility(8);
                break;
        }
    }
}
