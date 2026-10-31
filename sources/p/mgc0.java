package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class mgc0 implements lgc0 {
    public final /* synthetic */ byte a;

    @Override // p.lgc0
    public final float b(ViewGroup viewGroup, ArrayList arrayList, View view) {
        switch (this.a) {
            case 0:
                float translationY = view.getTranslationY();
                int height = viewGroup.getHeight();
                Iterator it = arrayList.iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return 0.0f;
                }
                int top = ((View) it.next()).getTop();
                while (it.hasNext()) {
                    int top2 = ((View) it.next()).getTop();
                    if (top > top2) {
                        top = top2;
                    }
                }
                return translationY + (height - top);
            default:
                float translationY2 = view.getTranslationY();
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    hhg1.k();
                    return 0.0f;
                }
                int bottom = ((View) it2.next()).getBottom();
                while (it2.hasNext()) {
                    int bottom2 = ((View) it2.next()).getBottom();
                    if (bottom < bottom2) {
                        bottom = bottom2;
                    }
                }
                return translationY2 - bottom;
        }
    }
}
