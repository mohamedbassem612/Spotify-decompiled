package p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ril {
    public HashMap a;
    public HashMap b;
    public HashMap c;

    public float a(aic aicVar) {
        HashMap map = this.a;
        HashMap map2 = this.b;
        if (!(aicVar instanceof gic)) {
            if (aicVar instanceof cic) {
                return ((cic) aicVar).e();
            }
            return 0.0f;
        }
        String strD = ((gic) aicVar).d();
        if (map2.containsKey(strD)) {
            return ((pil) map2.get(strD)).value();
        }
        if (map.containsKey(strD)) {
            return ((Integer) map.get(strD)).floatValue();
        }
        return 0.0f;
    }

    public void b(int i, String str) {
        this.a.put(str, Integer.valueOf(i));
    }

    public void c(String str, ArrayList arrayList) {
        this.c.put(str, arrayList);
    }

    public void d(int i, String str, String str2) {
        this.a.put(str, str2);
        this.b.put(str2, str);
        this.c.put(str, Integer.valueOf(i));
    }
}
