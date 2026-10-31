package p;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cuw {
    public final LinkedHashMap a;

    public cuw(byte b) {
        switch (b) {
            case 1:
                this.a = new LinkedHashMap();
                break;
            case 2:
                this.a = new LinkedHashMap();
                break;
            default:
                this.a = new LinkedHashMap();
                break;
        }
    }

    public static String a(int i, int i2, String str) {
        return i + '-' + i2 + '-' + str;
    }

    public void b(g8d g8dVar) {
        String str = g8dVar.a;
        String str2 = g8dVar.b;
        LinkedHashMap linkedHashMap = this.a;
        List list = (List) linkedHashMap.get(str);
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (!u890.j(((g8d) obj).b, str2)) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                linkedHashMap.remove(str);
            } else {
                linkedHashMap.put(str, arrayList);
            }
        }
    }
}
