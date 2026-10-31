package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class oah0 extends tv30 implements iu30 {
    public static final oah0 a = new oah0(1, yah0.class, "savedState", "savedState(Lcom/spotify/libraryimport/matchreview/domain/MatchReviewModel;)Landroid/os/Bundle;", 1);

    public final Object invoke(Object obj) {
        mah0 mah0Var = (mah0) obj;
        Bundle bundle = new Bundle();
        Map map = mah0Var.e;
        for (Map.Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            om90 om90Var = (om90) entry.getValue();
            if (om90Var instanceof nm90) {
                bundle.putStringArrayList(str, new ArrayList<>(((nm90) om90Var).a));
            }
        }
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("complete", mah0Var.f == 3);
        bbh0 bbh0Var = mah0Var.d;
        bundle2.putString("activeSection", bbh0Var != null ? bbh0Var.name() : null);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry2 : map.entrySet()) {
            if (u890.j((om90) entry2.getValue(), mm90.a)) {
                linkedHashMap.put(entry2.getKey(), entry2.getValue());
            }
        }
        bundle2.putStringArrayList("ignored", new ArrayList<>(linkedHashMap.keySet()));
        bundle2.putBundle("selected", bundle);
        return bundle2;
    }
}
