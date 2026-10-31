package p;

import android.view.View;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class p321 {
    public final HashMap a;

    public p321(Set set) {
        this.a = new HashMap();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            o321 o321Var = (o321) it.next();
            HashMap map = this.a;
            o321Var.getClass();
            map.put(pqo.class, o321Var.a);
        }
    }

    public float a(View view, String str) {
        HashMap map;
        float[] fArr;
        HashMap map2 = this.a;
        if (map2.containsKey(view) && (map = (HashMap) map2.get(view)) != null && map.containsKey(str) && (fArr = (float[]) map.get(str)) != null && fArr.length > 0) {
            return fArr[0];
        }
        return Float.NaN;
    }

    public p321(byte b) {
        switch (b) {
            case 2:
                this.a = new HashMap();
                break;
            default:
                this.a = new HashMap();
                break;
        }
    }
}
