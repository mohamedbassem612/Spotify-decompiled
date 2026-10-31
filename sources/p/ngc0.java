package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ngc0 implements lgc0 {
    public final /* synthetic */ byte a;

    @Override // p.lgc0
    public final float a(ViewGroup viewGroup, List list, View view) {
        switch (this.a) {
            case 0:
                return (viewGroup.getLayoutDirection() == 1 ? ogc0.k1 : ogc0.n1).a(viewGroup, list, view);
            case 1:
                float translationX = view.getTranslationX();
                Iterator it = list.iterator();
                if (!it.hasNext()) {
                    hhg1.k();
                    return 0.0f;
                }
                int right = ((View) it.next()).getRight();
                while (it.hasNext()) {
                    int right2 = ((View) it.next()).getRight();
                    if (right < right2) {
                        right = right2;
                    }
                }
                return translationX - right;
            case 2:
                float translationX2 = view.getTranslationX();
                int width = viewGroup.getWidth();
                Iterator it2 = list.iterator();
                if (!it2.hasNext()) {
                    hhg1.k();
                    return 0.0f;
                }
                int left = ((View) it2.next()).getLeft();
                while (it2.hasNext()) {
                    int left2 = ((View) it2.next()).getLeft();
                    if (left > left2) {
                        left = left2;
                    }
                }
                return translationX2 + (width - left);
            default:
                return (viewGroup.getLayoutDirection() == 1 ? ogc0.n1 : ogc0.k1).a(viewGroup, list, view);
        }
    }
}
