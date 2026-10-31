package p;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public interface lgc0 {
    default float a(ViewGroup viewGroup, List list, View view) {
        return view.getTranslationX();
    }

    default float b(ViewGroup viewGroup, ArrayList arrayList, View view) {
        return view.getTranslationY();
    }
}
