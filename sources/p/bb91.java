package p;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class bb91 extends wm5 {
    public final /* synthetic */ byte e;

    @Override // p.cb91
    public final float b(View view, ViewGroup viewGroup) {
        switch (this.e) {
            case 0:
                return view.getTranslationY() - viewGroup.getHeight();
            default:
                return view.getTranslationY() + viewGroup.getHeight();
        }
    }
}
